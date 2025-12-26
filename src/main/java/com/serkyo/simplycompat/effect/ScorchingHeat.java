package com.serkyo.simplycompat.effect;

import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.core.SCEffects;
import com.serkyo.simplycompat.utils.EntityUtils;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;

import java.util.List;
import java.util.UUID;

public class ScorchingHeat extends MobEffect {
    public ScorchingHeat(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        pLivingEntity.setSecondsOnFire(2);

        if (pAmplifier >= 4) {
            triggerHeatWave(pLivingEntity);
        }
    }

    public static void applyToEntity(LivingEntity target, UUID attackerUUID, double attackerAttackValue) {
        applyToEntity(target, attackerUUID, attackerAttackValue, 1);
    }

    public static void applyToEntity(LivingEntity target, UUID attackerUUID, double attackerAttackValue, int amplifierIncrementation) {
        MobEffectInstance scorchingHeatInstance = target.getEffect(SCEffects.SCORCHING_HEAT.get());
        int newAmplifier = amplifierIncrementation - 1;

        if (scorchingHeatInstance != null) {
            newAmplifier = Math.min(scorchingHeatInstance.getAmplifier() + amplifierIncrementation, 4);
        }
        CompoundTag targetNBTData = target.getPersistentData();
        targetNBTData.putUUID("ScorchingHeatOwner", attackerUUID);
        targetNBTData.putDouble("ScorchingHeatOwnerAttack", attackerAttackValue);
        target.addEffect(new MobEffectInstance(SCEffects.SCORCHING_HEAT.get(), SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_DURATION * 20, newAmplifier, false, true));
    }

    private static void triggerHeatWave(LivingEntity sourceEntity) {
        CompoundTag nbtData = sourceEntity.getPersistentData();
        UUID ownerUUID = nbtData.getUUID("ScorchingHeatOwner");
        double ownerAttackDamage = nbtData.getDouble("ScorchingHeatOwnerAttack");
        Entity owner = EntityUtils.getEntityFromUUID(ownerUUID, (ServerLevel) sourceEntity.level());

        if (sourceEntity.level() instanceof ServerLevel serverLevel) {
            spawnHeatWaveParticles(serverLevel, sourceEntity, SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_RANGE);
            serverLevel.playSound(null, sourceEntity.getX(), sourceEntity.getY(), sourceEntity.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.NEUTRAL, 2.0F, 0.5F);
        }

        AABB abilityRange = sourceEntity.getBoundingBox().inflate(SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_RANGE, 0, SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_RANGE);
        List<LivingEntity> targets = sourceEntity.level().getEntitiesOfClass(LivingEntity.class, abilityRange);

        for (LivingEntity target : targets) {
            if (owner != null) {
                if (target == owner || target.isAlliedTo(owner)) {
                    continue;
                }
            }
            if (ownerAttackDamage / 2 >= 2) {
                applyToEntity(target, ownerUUID, ownerAttackDamage / 2, SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_LEVEL_INCREMENTATION);
            }
            target.hurt(target.damageSources().magic(), (float) (ownerAttackDamage * SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_DAMAGE_MULTIPLIER));
        }
        sourceEntity.removeEffect(SCEffects.SCORCHING_HEAT.get());
    }

    private static void spawnHeatWaveParticles(ServerLevel level, LivingEntity source, double maxRange) {
        int ringAmount = 5;

        for (int ring = 1; ring <= ringAmount; ring++) {
            double currentRadius = (maxRange / ringAmount) * ring;
            int particlesPerCircle = (int) (currentRadius * 15);

            for (int i = 0; i < particlesPerCircle; i++) {
                double angle = 2 * Math.PI * i / particlesPerCircle;
                double xOffset = Math.cos(angle) * currentRadius;
                double zOffset = Math.sin(angle) * currentRadius;
                double x = source.getX() + xOffset;
                double y = source.getY() + 0.5;
                double z = source.getZ() + zOffset;

                level.sendParticles(
                        ParticleTypes.FLAME,
                        x, y, z,
                        1,
                        0.02, 0.02, 0.02,
                        0.02
                );

                if (ring >= ringAmount - 1) {
                    level.sendParticles(
                            ParticleTypes.LARGE_SMOKE,
                            x, y, z,
                            1, 0, 0, 0, 0.02
                    );
                }
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
