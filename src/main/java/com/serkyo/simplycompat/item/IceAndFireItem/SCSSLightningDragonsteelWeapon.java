package com.serkyo.simplycompat.item.IceAndFireItem;

import com.serkyo.simplycompat.item.SCSimplySword;
import com.serkyo.simplycompat.item.behavior.LightningDragonsteelWeaponBehavior;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class SCSSLightningDragonsteelWeapon extends SCSimplySword implements LightningDragonsteelWeaponBehavior {
    public SCSSLightningDragonsteelWeapon(WeaponType weaponType) {
        super(CustomTiers.LIGHTNING_DRAGONSTEEL, weaponType, "iceandfire:dragonsteel_lightning_ingot");
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        applyLightningDragonsteelDamage(target, attacker);
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Level world, List<Component> tooltip, TooltipFlag tooltipContext) {
        applyLightningDragonsteelTooltip(tooltip);
    }
}
