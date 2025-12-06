package com.serkyo.simplycompat.item;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.utils.WeaponRegistrationUtils;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.world.item.Tier;
import net.minecraftforge.fml.common.Mod;
import net.sweenus.simplyswords.item.SimplySwordsSwordItem;

import java.util.UUID;

@Mod.EventBusSubscriber(modid = SimplyCompat.MOD_ID)
public class SCSimplySword extends SimplySwordsSwordItem {
    private final WeaponType weaponType;

    public SCSimplySword(Tier toolMaterial, WeaponType weaponType, String... repairIngredient) {
        super(toolMaterial, 0, WeaponRegistrationUtils.getSimplyWeaponSpeed(weaponType), repairIngredient);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public UUID getBaseAttackDamageUUID() {
        return BASE_ATTACK_DAMAGE_UUID;
    }
}
