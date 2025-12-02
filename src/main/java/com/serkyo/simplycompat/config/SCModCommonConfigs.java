package com.serkyo.simplycompat.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class SCModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    private static final ForgeConfigSpec.ConfigValue<Float> COPPER_DAMAGE_MODIFIER;
    private static final ForgeConfigSpec.ConfigValue<Float> SILVER_DAMAGE_MODIFIER;
    private static final ForgeConfigSpec.ConfigValue<Float> SILVER_BONUS_DAMAGE;
    private static final ForgeConfigSpec.ConfigValue<Float> MYRMEX_DAMAGE_MODIFIER;
    private static final ForgeConfigSpec.ConfigValue<Float> MYRMEX_BONUS_DAMAGE;
    private static final ForgeConfigSpec.ConfigValue<Float> DRAGONBONE_DAMAGE_MODIFIER;
    private static final ForgeConfigSpec.ConfigValue<Float> INFUSED_DRAGONBONE_DAMAGE_MODIFIER;
    private static final ForgeConfigSpec.ConfigValue<Float> INFUSED_DRAGONBONE_BONUS_DAMAGE;
    private static final ForgeConfigSpec.ConfigValue<Float> DRAGONSTEEL_DAMAGE_MODIFIER;

    static {
        BUILDER.push("Weapon Attributes");

        COPPER_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the copper weapons")
                .define("copperDamageModifier", 3.0F);
        SILVER_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the silver weapons")
                .define("silverDamageModifier", 3.0F);
        SILVER_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the silver weapons against undead")
                .define("silverBonusDamage", 2.0F);
        MYRMEX_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the myrmex weapons")
                .define("myrmexDamageModifier", 3.0F);
        MYRMEX_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the myrmex weapons against non-arthopods and deathworms")
                .define("myrmexAdditionalDamage", 4.0F);
        DRAGONBONE_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the dragon bone weapons")
                .define("dragonBoneDamageModifier", 3.0F);
        INFUSED_DRAGONBONE_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the infused dragon bone weapons")
                .define("infusedDragonBoneDamageModifier", 3.0F);
        INFUSED_DRAGONBONE_BONUS_DAMAGE = BUILDER.comment("Additional damage caused by the infused dragon bone weapons against dragons of the opposing type. Halved for lightning dragons, as they affect both fire and ice")
                .define("infusedDragonboneBonusDamage", 8.0F);
        DRAGONSTEEL_DAMAGE_MODIFIER = BUILDER.comment("Damage modifier of the dragonsteel weapons")
                .define("dragonsteelDamageModifier", 3.0F);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
