package com.serkyo.simplycompat.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class SCCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.ConfigValue<Integer> COPPER_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> SILVER_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> SILVER_BONUS_DAMAGE;
    public static ForgeConfigSpec.ConfigValue<Integer> MYRMEX_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> MYRMEX_BONUS_DAMAGE;
    public static ForgeConfigSpec.ConfigValue<Integer> DRAGONBONE_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> INFUSED_DRAGONBONE_DAMAGE_MODIFIER;
    public static ForgeConfigSpec.ConfigValue<Integer> INFUSED_DRAGONBONE_BONUS_DAMAGE;
    public static ForgeConfigSpec.ConfigValue<Integer> DRAGONSTEEL_DAMAGE_MODIFIER;

    static {
        BUILDER.push("Weapon Attributes");

        COPPER_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the copper weapons")
                .define("copperDamageModifier", 3);
        SILVER_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the silver weapons")
                .define("silverDamageModifier", 4);
        SILVER_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the silver weapons against undead")
                .define("silverBonusDamage", 2);
        MYRMEX_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the myrmex weapons")
                .define("myrmexDamageModifier", 3);
        MYRMEX_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the myrmex weapons against non-arthopods and deathworms")
                .define("myrmexAdditionalDamage", 4);
        DRAGONBONE_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the dragon bone weapons")
                .define("dragonBoneDamageModifier", 3);
        INFUSED_DRAGONBONE_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the infused dragon bone weapons")
                .define("infusedDragonBoneDamageModifier", 3);
        INFUSED_DRAGONBONE_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the infused dragon bone weapons against dragons of the opposing type. Halved for lightning dragons, as they affect both fire and ice")
                .define("infusedDragonboneBonusDamage", 8);
        DRAGONSTEEL_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the dragonsteel weapons")
                .define("dragonsteelDamageModifier", 3);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
