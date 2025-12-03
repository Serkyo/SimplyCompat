package com.serkyo.simplycompat.config;

import com.serkyo.simplycompat.SimplyCompat;

import java.util.Arrays;

public class SCBakedConfigs {
    public static int COPPER_DAMAGE_MODIFIER;
    public static int SILVER_DAMAGE_MODIFIER;
    public static int SILVER_BONUS_DAMAGE;
    public static int MYRMEX_DAMAGE_MODIFIER;
    public static int MYRMEX_BONUS_DAMAGE;
    public static int DRAGONBONE_DAMAGE_MODIFIER;
    public static int INFUSED_DRAGONBONE_DAMAGE_MODIFIER;
    public static int INFUSED_DRAGONBONE_BONUS_DAMAGE;
    public static int DRAGONSTEEL_DAMAGE_MODIFIER;

    public static void bakeCommon() {
        SimplyCompat.LOGGER.debug("Loading common configuration from file ...");
        try {
            COPPER_DAMAGE_MODIFIER = SCCommonConfigs.COPPER_DAMAGE_MODIFIER.get();
            SILVER_DAMAGE_MODIFIER = SCCommonConfigs.SILVER_DAMAGE_MODIFIER.get();
            SILVER_BONUS_DAMAGE = SCCommonConfigs.SILVER_BONUS_DAMAGE.get();
            MYRMEX_DAMAGE_MODIFIER = SCCommonConfigs.MYRMEX_DAMAGE_MODIFIER.get();
            MYRMEX_BONUS_DAMAGE = SCCommonConfigs.MYRMEX_BONUS_DAMAGE.get();
            DRAGONBONE_DAMAGE_MODIFIER = SCCommonConfigs.DRAGONBONE_DAMAGE_MODIFIER.get();
            INFUSED_DRAGONBONE_DAMAGE_MODIFIER = SCCommonConfigs.INFUSED_DRAGONBONE_DAMAGE_MODIFIER.get();
            INFUSED_DRAGONBONE_BONUS_DAMAGE = SCCommonConfigs.INFUSED_DRAGONBONE_BONUS_DAMAGE.get();
            DRAGONSTEEL_DAMAGE_MODIFIER = SCCommonConfigs.DRAGONSTEEL_DAMAGE_MODIFIER.get();
        }
        catch (Exception e) {
            SimplyCompat.LOGGER.error("An exception has occured while trying to load the common config for Simply Compat");
            SimplyCompat.LOGGER.error(Arrays.toString(e.getStackTrace()));
        }
    }
}
