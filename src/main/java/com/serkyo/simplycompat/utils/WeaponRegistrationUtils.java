package com.serkyo.simplycompat.utils;

public class WeaponRegistrationUtils {
    public static int getSimplyWeaponDamage(int materialDamageModifier, WeaponType weaponType) {
        return (int) (materialDamageModifier + weaponType.getPositiveModifier() - weaponType.getNegativeModifier());
    }

    public static float getSimplyWeaponSpeed(WeaponType weaponType) {
        return (float) weaponType.getAttackSpeed();
    }
}
