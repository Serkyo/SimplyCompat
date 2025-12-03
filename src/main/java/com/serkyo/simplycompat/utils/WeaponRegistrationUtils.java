package com.serkyo.simplycompat.utils;

public class WeaponRegistrationUtils {
    public static int getSimplyWeaponDamage(float materialDamageModifier, WeaponType weaponType) {
        return (int) (materialDamageModifier + weaponType.getPositiveModifier() - weaponType.getNegativeModifier());
    }

    public static int getSimplyWeaponSpeed(WeaponType weaponType) {
        return (int) weaponType.getAttackSpeed();
    }
}
