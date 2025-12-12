package com.serkyo.simplycompat.effect;

import com.serkyo.simplycompat.capability.ResonanceProvider;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.core.SCEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import java.util.UUID;

public class DraconicResonance extends MobEffect {
    private static final UUID FIRE_ATTACK_DAMAGE_UUID = UUID.fromString("f97375f6-a0b8-4cac-922c-231e1d3eb1d6");
    private static final UUID ICE_ARMOR_UUID = UUID.fromString("18ff4071-9ecd-4f79-aade-4fe94e9dbb8e");
    private static final UUID ICE_ARMOR_TOUGHNESS_UUID = UUID.fromString("8d16aba6-f633-4641-a473-4efddd4b38ba");
    private static final UUID LIGHTNING_MOVEMENT_SPEED_UUID = UUID.fromString("76f70e2a-0b97-4de7-a21e-21a8781d15e7");
    private static final UUID LIGHTNING_ATTACK_SPEED_UUID = UUID.fromString("2c343015-e9c2-4284-b865-9526584929fd");

    public DraconicResonance(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
        this.addAttributeModifier(
                Attributes.ATTACK_DAMAGE,
                FIRE_ATTACK_DAMAGE_UUID.toString(),
                0,
                AttributeModifier.Operation.ADDITION
        );
        this.addAttributeModifier(
                Attributes.ARMOR,
                ICE_ARMOR_UUID.toString(),
                0,
                AttributeModifier.Operation.ADDITION
        );
        this.addAttributeModifier(
                Attributes.ARMOR_TOUGHNESS,
                ICE_ARMOR_TOUGHNESS_UUID.toString(),
                0,
                AttributeModifier.Operation.ADDITION
        );
        this.addAttributeModifier(
                Attributes.MOVEMENT_SPEED,
                LIGHTNING_MOVEMENT_SPEED_UUID.toString(),
                0,
                AttributeModifier.Operation.ADDITION
        );
        this.addAttributeModifier(
                Attributes.ATTACK_SPEED,
                LIGHTNING_ATTACK_SPEED_UUID.toString(),
                0,
                AttributeModifier.Operation.ADDITION
        );
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        pLivingEntity.getCapability(ResonanceProvider.RESONANCE).ifPresent(resonance -> {
            String element = resonance.getElement();

            switch (element) {
                case "fire" -> applyFireBonuses(pLivingEntity, pAmplifier);
                case "ice" -> applyIceBonuses(pLivingEntity, pAmplifier);
                case "lightning" -> applyLightningBonuses(pLivingEntity, pAmplifier);
            }
        });
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

    public static void applyToEntity(LivingEntity target, String element) {
        target.getCapability(ResonanceProvider.RESONANCE).ifPresent(resonance -> {
            String currentElement = resonance.getElement();

            if (!currentElement.equals(element)) {
                resonance.setElement(element);
            }
        });
        MobEffectInstance draconicResonance = target.getEffect(SCEffects.DRACONIC_RESONANCE.get());
        int amplifier = 0;
        if (draconicResonance != null) {
            amplifier = Math.min(draconicResonance.getAmplifier() + 1, SCBakedConfigs.DRACONIC_RESONANCE_MAX_LEVEL - 1);
        }
        target.addEffect(new MobEffectInstance(SCEffects.DRACONIC_RESONANCE.get(), SCBakedConfigs.DRACONIC_RESONANCE_DURATION * 20, amplifier, false, true));
    }

    private void applyFireBonuses(LivingEntity livingEntity, int amplifier) {
        this.addAttributeModifier(
                Attributes.ATTACK_DAMAGE,
                FIRE_ATTACK_DAMAGE_UUID.toString(),
                SCBakedConfigs.DRACONIC_RESONANCE_ATTACK_BONUS * (amplifier + 1),
                getOperationFromString(SCBakedConfigs.DRACONIC_RESONANCE_ATTACK_OPERATION)
        );
    }

    private void applyIceBonuses(LivingEntity livingEntity, int amplifier) {
        this.addAttributeModifier(
                Attributes.ARMOR,
                ICE_ARMOR_UUID.toString(),
                SCBakedConfigs.DRACONIC_RESONANCE_ARMOR_BONUS * (amplifier + 1),
                getOperationFromString(SCBakedConfigs.DRACONIC_RESONANCE_ARMOR_OPERATION)
        );
        this.addAttributeModifier(
                Attributes.ARMOR_TOUGHNESS,
                ICE_ARMOR_TOUGHNESS_UUID.toString(),
                SCBakedConfigs.DRACONIC_RESONANCE_ARMOR_TOUGHNESS_BONUS * (amplifier + 1),
                getOperationFromString(SCBakedConfigs.DRACONIC_RESONANCE_ARMOR_TOUGHNESS_OPERATION)
        );
    }

    private void applyLightningBonuses(LivingEntity livingEntity, int amplifier) {
        this.addAttributeModifier(
                Attributes.MOVEMENT_SPEED,
                LIGHTNING_MOVEMENT_SPEED_UUID.toString(),
                SCBakedConfigs.DRACONIC_RESONANCE_SPEED_BONUS * (amplifier + 1),
                getOperationFromString(SCBakedConfigs.DRACONIC_RESONANCE_SPEED_OPERATION)
        );
        this.addAttributeModifier(
                Attributes.ATTACK_SPEED,
                LIGHTNING_ATTACK_SPEED_UUID.toString(),
                SCBakedConfigs.DRACONIC_RESONANCE_ATTACK_SPEED_BONUS * (amplifier + 1),
                getOperationFromString(SCBakedConfigs.DRACONIC_RESONANCE_ATTACK_SPEED_OPERATION)
        );
    }

    private AttributeModifier.Operation getOperationFromString(String string) {
        if (string.equals("ADDITION")) {
            return AttributeModifier.Operation.ADDITION;
        }
        else if (string.equals("MULTIPLY_BASE")) {
            return AttributeModifier.Operation.MULTIPLY_BASE;
        }
        else {
            return AttributeModifier.Operation.MULTIPLY_TOTAL;
        }
    }
}
