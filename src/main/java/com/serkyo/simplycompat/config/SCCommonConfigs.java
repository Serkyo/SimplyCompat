package com.serkyo.simplycompat.config;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.common.ForgeConfigSpec;

public class SCCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.IntValue COPPER_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.IntValue SILVER_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.IntValue SILVER_BONUS_DAMAGE;
    public static ForgeConfigSpec.IntValue MYRMEX_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.IntValue MYRMEX_BONUS_DAMAGE;
    public static ForgeConfigSpec.IntValue MYRMEX_STINGER_POISON_CHANCE;
    public static ForgeConfigSpec.IntValue MYRMEX_STINGER_POISON_DURATION;
    public static ForgeConfigSpec.IntValue MYRMEX_STINGER_POISON_LEVEL;
    public static ForgeConfigSpec.IntValue DRAGONBONE_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.IntValue INFUSED_DRAGONBONE_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.IntValue INFUSED_DRAGONBONE_BONUS_DAMAGE;
    public static ForgeConfigSpec.IntValue INFUSED_DRAGONBONE_KNOCKBACK;
    public static ForgeConfigSpec.IntValue FIRE_INFUSED_DRAGONBONE_BURN_TIME;
    public static ForgeConfigSpec.IntValue ICE_INFUSED_DRAGONBONE_FREEZE_TIME;
    public static ForgeConfigSpec.IntValue DRAGONSTEEL_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.BooleanValue DRAGONSTEEL_REWORK;
    public static ForgeConfigSpec.IntValue DRACONIC_RESONANCE_DURATION;
    public static ForgeConfigSpec.IntValue DRACONIC_RESONANCE_MAX_LEVEL;
    public static ForgeConfigSpec.DoubleValue DRACONIC_RESONANCE_ATTACK_BONUS;
    public static ForgeConfigSpec.EnumValue<AttributeModifier.Operation> DRACONIC_RESONANCE_ATTACK_OPERATION;
    public static ForgeConfigSpec.DoubleValue DRACONIC_RESONANCE_ARMOR_BONUS;
    public static ForgeConfigSpec.EnumValue<AttributeModifier.Operation> DRACONIC_RESONANCE_ARMOR_OPERATION;
    public static ForgeConfigSpec.DoubleValue DRACONIC_RESONANCE_ARMOR_TOUGHNESS_BONUS;
    public static ForgeConfigSpec.EnumValue<AttributeModifier.Operation> DRACONIC_RESONANCE_ARMOR_TOUGHNESS_OPERATION;
    public static ForgeConfigSpec.DoubleValue DRACONIC_RESONANCE_SPEED_BONUS;
    public static ForgeConfigSpec.EnumValue<AttributeModifier.Operation> DRACONIC_RESONANCE_SPEED_OPERATION;
    public static ForgeConfigSpec.DoubleValue DRACONIC_RESONANCE_ATTACK_SPEED_BONUS;
    public static ForgeConfigSpec.EnumValue<AttributeModifier.Operation> DRACONIC_RESONANCE_ATTACK_SPEED_OPERATION;
    public static ForgeConfigSpec.IntValue FIRE_DRAGONSTEEL_ABILITY_RANGE;
    public static ForgeConfigSpec.IntValue FIRE_DRAGONSTEEL_ABILITY_DURATION;
    public static ForgeConfigSpec.DoubleValue FIRE_DRAGONSTEEL_ABILITY_DAMAGE_MULTIPLIER;
    public static ForgeConfigSpec.IntValue FIRE_DRAGONSTEEL_ABILITY_LEVEL_INCREMENTATION;
    public static ForgeConfigSpec.IntValue ICE_DRAGONSTEEL_ABILITY_RANGE;
    public static ForgeConfigSpec.IntValue ICE_DRAGONSTEEL_ABILITY_DURATION;
    public static ForgeConfigSpec.DoubleValue ICE_DRAGONSTEEL_ABILITY_DAMAGE_MULTIPLIER;
    public static ForgeConfigSpec.DoubleValue ICE_DRAGONSTEEL_ABILITY_THRESHOLD_MULTIPLIER;
    public static ForgeConfigSpec.DoubleValue ICE_DRAGONSTEEL_ABILITY_DAMAGE_INCREASE;
    public static ForgeConfigSpec.DoubleValue ICE_DRAGONSTEEL_ABILITY_SHARDS_MULTIPLIER;
    public static ForgeConfigSpec.IntValue DRAGONSTEEL_KNOCKBACK;
    public static ForgeConfigSpec.IntValue FIRE_DRAGONSTEEL_BURN_TIME;
    public static ForgeConfigSpec.IntValue ICE_DRAGONSTEEL_FREEZE_TIME;

    static {
        BUILDER.push("Ice-and-Fire-compatibility");
        COPPER_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the copper weapons")
                .defineInRange("copperDamageModifier", 3, Integer.MIN_VALUE, Integer.MAX_VALUE);
        SILVER_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the silver weapons")
                .defineInRange("silverDamageModifier", 4, Integer.MIN_VALUE, Integer.MAX_VALUE);
        SILVER_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the silver weapons against undead")
                .defineInRange("silverBonusDamage", 2, Integer.MIN_VALUE, Integer.MAX_VALUE);
        MYRMEX_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the myrmex weapons")
                .defineInRange("myrmexDamageModifier", 4, Integer.MIN_VALUE, Integer.MAX_VALUE);
        MYRMEX_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the myrmex weapons against non-arthopods and deathworms")
                .defineInRange("myrmexAdditionalDamage", 4, 0, Integer.MAX_VALUE);
        MYRMEX_STINGER_POISON_CHANCE = BUILDER.comment("Chance of myrmex stinger weapons to poison the enemy on hit")
                .defineInRange("myrmexStingerPoisonChance", 30, 0, 100);
        MYRMEX_STINGER_POISON_DURATION = BUILDER.comment("Duration of the poison effect applied by the myrmex stinger weapons (in seconds)")
                .defineInRange("myrmexPoisonDuration", 3, 1, Integer.MAX_VALUE);
        MYRMEX_STINGER_POISON_LEVEL = BUILDER.comment("Level of the poison effect inflicted by the myrmex stinger weapons")
                .defineInRange("myrmexPoisonLevel", 1, 1, 256);
        DRAGONBONE_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the dragon bone weapons")
                .defineInRange("dragonBoneDamageModifier", 7, Integer.MIN_VALUE, Integer.MAX_VALUE);
        INFUSED_DRAGONBONE_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the infused dragon bone weapons")
                .defineInRange("infusedDragonBoneDamageModifier", 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        INFUSED_DRAGONBONE_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the infused dragon bone weapons against dragons of the opposing type. Halved for lightning dragons, as they affect both fire and ice")
                .defineInRange("infusedDragonboneBonusDamage", 8, 0, Integer.MAX_VALUE);
        INFUSED_DRAGONBONE_KNOCKBACK = BUILDER.comment("Knockback caused by the infused dragon bone weapons (in blocks)")
                .defineInRange("infusedDragonboneKnockback", 1, 0, Integer.MAX_VALUE);
        FIRE_INFUSED_DRAGONBONE_BURN_TIME = BUILDER.comment("Duration of the burning inflicted by the fire dragonbone weapons (in seconds)")
                .defineInRange("fireInfusedDragonboneBurnTime", 15, 1, Integer.MAX_VALUE);
        ICE_INFUSED_DRAGONBONE_FREEZE_TIME = BUILDER.comment("Duration of the freeze effect inflicted by the ice dragonbone weapons (in seconds)")
                .defineInRange("iceInfusedDragonboneFreezeTime", 7, 1, Integer.MAX_VALUE);
        DRAGONSTEEL_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the dragonsteel weapons")
                .defineInRange("dragonsteelDamageModifier", 24, Integer.MIN_VALUE, Integer.MAX_VALUE);
        DRAGONSTEEL_REWORK = BUILDER.comment("Should the dragonsteel be reworked ? The non rework version will fall back to the same effects as base Ice and Fire")
                .define("doDragonsteelRework", true);
        BUILDER.push("Dragonsteel-Rework");
        DRACONIC_RESONANCE_DURATION = BUILDER.comment("Duration of the draconic resonance effect applied by dragonsteel weapons (in seconds)")
                .defineInRange("draconicResonanceDuration", 5, 1, Integer.MAX_VALUE);
        DRACONIC_RESONANCE_MAX_LEVEL = BUILDER.comment("Max level of the draconic resonance effect applied by dragonsteel weapons")
                .defineInRange("draconicResonanceMaxLevel", 10, 1, 256);
        DRACONIC_RESONANCE_ATTACK_BONUS = BUILDER.comment("Amount of attack damage given to the player per level of draconic resonance effect with a fire dragonsteel weapon")
                .defineInRange("draconicResonanceAttackBonus", 0.1, 0.0, Double.MAX_VALUE);
        DRACONIC_RESONANCE_ATTACK_OPERATION = BUILDER.comment("Operation used to apply the attack damage to the player")
                .defineEnum("draconicResonanceAttackOperation", AttributeModifier.Operation.MULTIPLY_TOTAL);
        DRACONIC_RESONANCE_ARMOR_BONUS = BUILDER.comment("Amount of armor given to the player per level of draconic resonance effect with an ice dragonsteel weapon")
                .defineInRange("draconicResonanceArmorBonus", 0.1, 0.0, Double.MAX_VALUE);
        DRACONIC_RESONANCE_ARMOR_OPERATION = BUILDER.comment("Operation used to apply the armor to the player")
                .defineEnum("draconicResonanceArmorOperation", AttributeModifier.Operation.MULTIPLY_TOTAL);
        DRACONIC_RESONANCE_ARMOR_TOUGHNESS_BONUS = BUILDER.comment("Amount of armor toughness given to the player per level of draconic resonance effect with an ice dragonsteel weapon")
                .defineInRange("draconicResonanceArmorToughnessBonus", 0.05, 0.0, Double.MAX_VALUE);
        DRACONIC_RESONANCE_ARMOR_TOUGHNESS_OPERATION = BUILDER.comment("Operation used to apply the armor toughness to the player")
                .defineEnum("draconicResonanceArmorToughnessOperation", AttributeModifier.Operation.MULTIPLY_TOTAL);
        DRACONIC_RESONANCE_SPEED_BONUS = BUILDER.comment("Amount of speed given to the player per level of draconic resonance effect with a lightning dragonsteel weapon")
                .defineInRange("draconicResonanceSpeedBonus", 0.1, 0.0, Double.MAX_VALUE);
        DRACONIC_RESONANCE_SPEED_OPERATION = BUILDER.comment("Operation used to apply the speed to the player")
                .defineEnum("draconicResonanceSpeedOperation", AttributeModifier.Operation.MULTIPLY_TOTAL);
        DRACONIC_RESONANCE_ATTACK_SPEED_BONUS = BUILDER.comment("Amount of attack speed given to the player per level of draconic resonance effect with a lightning dragonsteel weapon")
                .defineInRange("draconicResonanceAttackSpeedBonus", 0.1, 0.0, Double.MAX_VALUE);
        DRACONIC_RESONANCE_ATTACK_SPEED_OPERATION = BUILDER.comment("Operation used to apply the attack speed to the player")
                .defineEnum("draconicResonanceAttackSpeedOperation", AttributeModifier.Operation.MULTIPLY_TOTAL);
        FIRE_DRAGONSTEEL_ABILITY_RANGE = BUILDER.comment("Range of the fire dragonsteel weapon ability")
                .defineInRange("fireDragonsteelAbilityRange", 5, 1, Integer.MAX_VALUE);
        FIRE_DRAGONSTEEL_ABILITY_DURATION = BUILDER.comment("Duration of the fire dragonsteel weapon ability (in seconds)")
                .defineInRange("fireDragonsteelAbilityDuration", 10, 1, Integer.MAX_VALUE);
        FIRE_DRAGONSTEEL_ABILITY_DAMAGE_MULTIPLIER = BUILDER.comment("Damage multiplier of the fire dragonsteel weapon ability, scaling from the weapon's damage")
                .defineInRange("fireDragonsteelAbilityDamageMultiplier", 0.5, 0, Double.MAX_VALUE);
        FIRE_DRAGONSTEEL_ABILITY_LEVEL_INCREMENTATION = BUILDER.comment("Amount of the effect increased on the targets hit by the fire dragonsteel weapon ability")
                .defineInRange("fireDragonsteelAbilityLevelIncrementation", 2, 1, 256);
        ICE_DRAGONSTEEL_ABILITY_RANGE = BUILDER.comment("Range of the ice dragonsteel weapon ability")
                .defineInRange("iceDragonsteelAbilityRange", 5, 1, Integer.MAX_VALUE);
        ICE_DRAGONSTEEL_ABILITY_DURATION = BUILDER.comment("Duration of the ice dragonsteel weapon ability (in seconds)")
                .defineInRange("iceDragonsteelAbilityDuration", 10, 1, Integer.MAX_VALUE);
        ICE_DRAGONSTEEL_ABILITY_DAMAGE_MULTIPLIER = BUILDER.comment("Damage multiplier of the ice dragonsteel weapon ability, scaling from the weapon's damage")
                .defineInRange("iceDragonsteelAbilityDamageMultiplier", 0.5, 0, Double.MAX_VALUE);
        ICE_DRAGONSTEEL_ABILITY_THRESHOLD_MULTIPLIER = BUILDER.comment("Multiplier for the damage threshold at which the shards will trigger on a target with max stacks, scaling from the weapon's damage")
                .defineInRange("iceDragonsteelAbilityThresholdMultiplier", 5, 0, Double.MAX_VALUE);
        ICE_DRAGONSTEEL_ABILITY_DAMAGE_INCREASE = BUILDER.comment("Damage increase caused by the ice dragonsteel weapon ability when it has reached max stacks on a target")
                .defineInRange("iceDragonsteelAbilityDamageIncrease", 1.25, 0, Double.MAX_VALUE);
        ICE_DRAGONSTEEL_ABILITY_SHARDS_MULTIPLIER = BUILDER.comment("Multiplier for the number of shards spawned from a target when it is damaged enough while having max stacks, scaling from the weapon's damage")
                .defineInRange("iceDragonsteelAbilityShardMultiplier", 1, 0, Double.MAX_VALUE);
        BUILDER.pop();
        BUILDER.push("Dragonsteel-Base-Effect");
        DRAGONSTEEL_KNOCKBACK = BUILDER.comment("Knockback caused by the dragonsteel weapons (in blocks)")
                .defineInRange("dragonsteelKnockback", 1, 0, Integer.MAX_VALUE);
        FIRE_DRAGONSTEEL_BURN_TIME = BUILDER.comment("Duration of the burning inflicted by the fire dragonsteel weapons (in seconds)")
                .defineInRange("dragonsteelDragonboneBurnTime", 15, 1, Integer.MAX_VALUE);
        ICE_DRAGONSTEEL_FREEZE_TIME = BUILDER.comment("Duration of the freeze effect inflicted by the ice dragonsteel weapons (in seconds)")
                .defineInRange("dragonsteelDragonboneFreezeTime", 7, 1, Integer.MAX_VALUE);
        BUILDER.pop();
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
