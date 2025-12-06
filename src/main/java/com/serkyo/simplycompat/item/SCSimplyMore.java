package com.serkyo.simplycompat.item;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.utils.WeaponRegistrationUtils;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.fml.common.Mod;
import net.rosemarythyme.simplymore.item.normal.SimplyMoreSwordItem;

import java.util.UUID;

@Mod.EventBusSubscriber(modid = SimplyCompat.MOD_ID)
public class SCSimplyMore extends SimplyMoreSwordItem {
    private final WeaponType weaponType;

    public SCSimplyMore(Tier toolMaterial, WeaponType weaponType, String... repairIngredient) {
        super(toolMaterial, 0, WeaponRegistrationUtils.getSimplyWeaponSpeed(weaponType), new Item.Properties(), repairIngredient);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public UUID getBaseAttackDamageUUID() {
        return BASE_ATTACK_DAMAGE_UUID;
    }
}
