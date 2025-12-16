package com.serkyo.simplycompat.item.IceAndFireItem;

import com.serkyo.simplycompat.item.SCSimplySword;
import com.serkyo.simplycompat.item.behavior.IceDragonsteelWeaponBehavior;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class SCSSIceDragonsteelWeapon extends SCSimplySword implements IceDragonsteelWeaponBehavior {
    public SCSSIceDragonsteelWeapon(WeaponType weaponType) {
        super(CustomTiers.ICE_DRAGONSTEEL, weaponType, "iceandfire:dragonsteel_ice_ingot");
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        applyIceDragonsteelDamage(target, attacker);
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Level world, List<Component> tooltip, TooltipFlag tooltipContext) {
        applyIceDragonsteelTooltip(tooltip);
    }
}
