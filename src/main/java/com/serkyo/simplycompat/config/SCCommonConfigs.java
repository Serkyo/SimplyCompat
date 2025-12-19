package com.serkyo.simplycompat.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class SCCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> COPPER_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> SILVER_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> SILVER_BONUS_DAMAGE;
    public static ForgeConfigSpec.ConfigValue<Integer> MYRMEX_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> MYRMEX_BONUS_DAMAGE;
    public static ForgeConfigSpec.ConfigValue<Integer> MYRMEX_STINGER_POISON_CHANCE;
    public static ForgeConfigSpec.ConfigValue<Integer> MYRMEX_STINGER_POISON_DURATION;
    public static ForgeConfigSpec.ConfigValue<Integer> MYRMEX_STINGER_POISON_LEVEL;
    public static ForgeConfigSpec.ConfigValue<Integer> DRAGONBONE_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> INFUSED_DRAGONBONE_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> INFUSED_DRAGONBONE_BONUS_DAMAGE;
    public static ForgeConfigSpec.ConfigValue<Integer> INFUSED_DRAGONBONE_KNOCKBACK;
    public static ForgeConfigSpec.ConfigValue<Integer> FIRE_INFUSED_DRAGONBONE_BURN_TIME;
    public static ForgeConfigSpec.ConfigValue<Integer> ICE_INFUSED_DRAGONBONE_FREEZE_TIME;
    public static ForgeConfigSpec.ConfigValue<Integer> DRAGONSTEEL_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Boolean> DRAGONSTEEL_REWORK;
    public static ForgeConfigSpec.ConfigValue<Integer> DRACONIC_RESONANCE_DURATION;
    public static ForgeConfigSpec.ConfigValue<Integer> DRACONIC_RESONANCE_MAX_LEVEL;
    public static ForgeConfigSpec.ConfigValue<Float> DRACONIC_RESONANCE_ATTACK_BONUS;
    public static ForgeConfigSpec.ConfigValue<String> DRACONIC_RESONANCE_ATTACK_OPERATION;
    public static ForgeConfigSpec.ConfigValue<Float> DRACONIC_RESONANCE_ARMOR_BONUS;
    public static ForgeConfigSpec.ConfigValue<String> DRACONIC_RESONANCE_ARMOR_OPERATION;
    public static ForgeConfigSpec.ConfigValue<Float> DRACONIC_RESONANCE_ARMOR_TOUGHNESS_BONUS;
    public static ForgeConfigSpec.ConfigValue<String> DRACONIC_RESONANCE_ARMOR_TOUGHNESS_OPERATION;
    public static ForgeConfigSpec.ConfigValue<Float> DRACONIC_RESONANCE_SPEED_BONUS;
    public static ForgeConfigSpec.ConfigValue<String> DRACONIC_RESONANCE_SPEED_OPERATION;
    public static ForgeConfigSpec.ConfigValue<Float> DRACONIC_RESONANCE_ATTACK_SPEED_BONUS;
    public static ForgeConfigSpec.ConfigValue<String> DRACONIC_RESONANCE_ATTACK_SPEED_OPERATION;
    public static ForgeConfigSpec.ConfigValue<Integer> DRAGONSTEEL_KNOCKBACK;
    public static ForgeConfigSpec.ConfigValue<Integer> FIRE_DRAGONSTEEL_BURN_TIME;
    public static ForgeConfigSpec.ConfigValue<Integer> ICE_DRAGONSTEEL_FREEZE_TIME;

    static {
        BUILDER.push("Ice-and-Fire-compatibility");
        COPPER_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the copper weapons")
                .define("copperDamageModifier", 3);
        SILVER_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the silver weapons")
                .define("silverDamageModifier", 4);
        SILVER_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the silver weapons against undead")
                .define("silverBonusDamage", 2);
        MYRMEX_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the myrmex weapons")
                .define("myrmexDamageModifier", 4);
        MYRMEX_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the myrmex weapons against non-arthopods and deathworms")
                .define("myrmexAdditionalDamage", 4);
        MYRMEX_STINGER_POISON_CHANCE = BUILDER.comment("Chance of myrmex stinger weapons to poison the enemy on hit")
                .defineInRange("myrmexStingerPoisonChance", 30, 0, 100);
        MYRMEX_STINGER_POISON_DURATION = BUILDER.comment("Duration of the poison effect applied by the myrmex stinger weapons (in seconds)")
                .defineInRange("myrmexPoisonDuration", 3, 1, Integer.MAX_VALUE);
        MYRMEX_STINGER_POISON_LEVEL = BUILDER.comment("Level of the poison effect inflicted by the myrmex stinger weapons")
                .defineInRange("myrmexPoisonLevel", 1, 1, 256);
        DRAGONBONE_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the dragon bone weapons")
                .define("dragonBoneDamageModifier", 7);
        INFUSED_DRAGONBONE_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the infused dragon bone weapons")
                .define("infusedDragonBoneDamageModifier", 8);
        INFUSED_DRAGONBONE_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the infused dragon bone weapons against dragons of the opposing type. Halved for lightning dragons, as they affect both fire and ice")
                .define("infusedDragonboneBonusDamage", 8);
        INFUSED_DRAGONBONE_KNOCKBACK = BUILDER.comment("Knockback caused by the infused dragon bone weapons (in blocks)")
                .define("infusedDragonboneKnockback", 1);
        FIRE_INFUSED_DRAGONBONE_BURN_TIME = BUILDER.comment("Duration of the burning inflicted by the fire dragonbone weapons (in seconds)")
                .defineInRange("fireInfusedDragonboneBurnTime", 15, 1, Integer.MAX_VALUE);
        ICE_INFUSED_DRAGONBONE_FREEZE_TIME = BUILDER.comment("Duration of the freeze effect inflicted by the ice dragonbone weapons (in seconds)")
                .defineInRange("iceInfusedDragonboneFreezeTime", 7, 1, Integer.MAX_VALUE);
        DRAGONSTEEL_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the dragonsteel weapons")
                .define("dragonsteelDamageModifier", 24);
        DRAGONSTEEL_REWORK = BUILDER.comment("Should the dragonsteel be reworked ? The non rework version will fall back to the same effects as base Ice and Fire")
                .define("doDragonsteelRework", true);
        BUILDER.push("Dragonsteel-Rework");
        DRACONIC_RESONANCE_DURATION = BUILDER.comment("Duration of the draconic resonance effect applied by dragonsteel weapons (in seconds)")
                .defineInRange("draconicResonanceDuration", 5, 1, Integer.MAX_VALUE);
        DRACONIC_RESONANCE_MAX_LEVEL = BUILDER.comment("Max level of the draconic resonance effect applied by dragonsteel weapons")
                .defineInRange("draconicResonanceMaxLevel", 10, 1, 256);
        DRACONIC_RESONANCE_ATTACK_BONUS = BUILDER.comment("Amount of attack damage given to the player per level of draconic resonance effect with a fire dragonsteel weapon")
                .define("draconicResonanceAttackBonus", 1.0F);
        DRACONIC_RESONANCE_ATTACK_OPERATION = BUILDER.comment("Operation used to apply the attack damage to the player")
                .defineInList("draconicResonanceAttackOperation", "ADDITION" ,List.of("ADDITION", "MULTIPLY_BASE", "MULTIPLY_TOTAL"));
        DRACONIC_RESONANCE_ARMOR_BONUS = BUILDER.comment("Amount of armor given to the player per level of draconic resonance effect with an ice dragonsteel weapon")
                .define("draconicResonanceArmorBonus", 1.0F);
        DRACONIC_RESONANCE_ARMOR_OPERATION = BUILDER.comment("Operation used to apply the armor to the player")
                .defineInList("draconicResonanceArmorOperation", "ADDITION" ,List.of("ADDITION", "MULTIPLY_BASE", "MULTIPLY_TOTAL"));
        DRACONIC_RESONANCE_ARMOR_TOUGHNESS_BONUS = BUILDER.comment("Amount of armor toughness given to the player per level of draconic resonance effect with an ice dragonsteel weapon")
                .define("draconicResonanceArmorToughnessBonus", 0.25F);
        DRACONIC_RESONANCE_ARMOR_TOUGHNESS_OPERATION = BUILDER.comment("Operation used to apply the armor toughness to the player")
                .defineInList("draconicResonanceArmorToughnessOperation", "ADDITION" ,List.of("ADDITION", "MULTIPLY_BASE", "MULTIPLY_TOTAL"));
        DRACONIC_RESONANCE_SPEED_BONUS = BUILDER.comment("Amount of speed given to the player per level of draconic resonance effect with a lightning dragonsteel weapon")
                .define("draconicResonanceSpeedBonus", 1.0F);
        DRACONIC_RESONANCE_SPEED_OPERATION = BUILDER.comment("Operation used to apply the speed to the player")
                .defineInList("draconicResonanceSpeedOperation", "ADDITION" ,List.of("ADDITION", "MULTIPLY_BASE", "MULTIPLY_TOTAL"));
        DRACONIC_RESONANCE_ATTACK_SPEED_BONUS = BUILDER.comment("Amount of attack speed given to the player per level of draconic resonance effect with a lightning dragonsteel weapon")
                .define("draconicResonanceAttackSpeedBonus", 1.0F);
        DRACONIC_RESONANCE_ATTACK_SPEED_OPERATION = BUILDER.comment("Operation used to apply the attack speed to the player")
                .defineInList("draconicResonanceAttackSpeedOperation", "ADDITION" ,List.of("ADDITION", "MULTIPLY_BASE", "MULTIPLY_TOTAL"));
        BUILDER.pop();
        BUILDER.push("Dragonsteel-Base-Effect");
        DRAGONSTEEL_KNOCKBACK = BUILDER.comment("Knockback caused by the dragonsteel weapons (in blocks)")
                .define("dragonsteelKnockback", 1);
        FIRE_DRAGONSTEEL_BURN_TIME = BUILDER.comment("Duration of the burning inflicted by the fire dragonsteel weapons (in seconds)")
                .defineInRange("dragonsteelDragonboneBurnTime", 15, 1, Integer.MAX_VALUE);
        ICE_DRAGONSTEEL_FREEZE_TIME = BUILDER.comment("Duration of the freeze effect inflicted by the ice dragonsteel weapons (in seconds)")
                .defineInRange("dragonsteelDragonboneFreezeTime", 7, 1, Integer.MAX_VALUE);
        BUILDER.pop();
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
