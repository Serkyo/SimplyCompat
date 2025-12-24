package com.serkyo.simplycompat.effect;

import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.core.SCEffects;
import com.serkyo.simplycompat.utils.EntityUtils;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
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

    public static void applyToEntity(LivingEntity target, LivingEntity attacker) {
        MobEffectInstance scorchingHeatInstance = target.getEffect(SCEffects.SCORCHING_HEAT.get());
        int amplifier = 0;

        if (scorchingHeatInstance != null) {
            amplifier = scorchingHeatInstance.getAmplifier() + 1;
        }
        CompoundTag targetNBTData = target.getPersistentData();
        targetNBTData.putUUID("ScorchingHeatOwner", attacker.getUUID());
        targetNBTData.putFloat("ScorchingHeatOwnerAttack", (float) attacker.getAttributeValue(Attributes.ATTACK_DAMAGE));
        target.addEffect(new MobEffectInstance(SCEffects.SCORCHING_HEAT.get(), SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_DURATION * 20, amplifier, false, true));
    }

    private static void triggerHeatWave(LivingEntity sourceEntity) {
        CompoundTag nbtData = sourceEntity.getPersistentData();
        UUID ownerUUID = nbtData.getUUID("ScorchingHeatOwner");
        double ownerAttackDamage = nbtData.getDouble("ScorchingHeatOwnerAttack");
        Entity owner = EntityUtils.getEntityFromUUID(ownerUUID, (ServerLevel) sourceEntity.level());
        AABB abilityRange = sourceEntity.getBoundingBox().inflate(SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_RANGE, 0, SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_RANGE);
        List<LivingEntity> targets = sourceEntity.level().getEntitiesOfClass(LivingEntity.class, abilityRange);

        for (LivingEntity target : targets) {
            if (owner != null) {
                if (target == owner || target.isAlliedTo(owner)) {
                    continue;
                }
            }
            CompoundTag targetNBTData = target.getPersistentData();
            targetNBTData.putDouble("ScorchingHeatOwnerAttack", ownerAttackDamage / 2);
            targetNBTData.putUUID("ScorchingHeatOwner", ownerUUID);
            target.addEffect(new MobEffectInstance(SCEffects.SCORCHING_HEAT.get(), SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_DURATION * 20, SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_LEVEL_APPLIED - 1, false, true));
            target.hurt(target.damageSources().magic(), (float) (ownerAttackDamage * SCBakedConfigs.FIRE_DRAGONSTEEL_ABILITY_DAMAGE_MULTIPLIER));
        }
        sourceEntity.removeEffect(SCEffects.SCORCHING_HEAT.get());
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
