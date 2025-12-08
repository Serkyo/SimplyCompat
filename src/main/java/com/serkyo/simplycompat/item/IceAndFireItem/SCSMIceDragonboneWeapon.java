package com.serkyo.simplycompat.item.IceAndFireItem;

import com.serkyo.simplycompat.item.SCSimplyMore;
import com.serkyo.simplycompat.item.behavior.IceDragonboneWeaponBehavior;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SCSMIceDragonboneWeapon extends SCSimplyMore implements IceDragonboneWeaponBehavior {
    public SCSMIceDragonboneWeapon(WeaponType weaponType) {
        super(CustomTiers.INFUSED_DRAGONBONE, weaponType, "iceandfire:dragonbone");
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        applyIceDragonboneDamage(target, attacker);
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        applyIceDragonboneTooltip(pTooltipComponents);
    }
}
