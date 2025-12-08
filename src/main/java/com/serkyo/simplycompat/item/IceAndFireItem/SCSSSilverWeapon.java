package com.serkyo.simplycompat.item.IceAndFireItem;

import com.serkyo.simplycompat.item.SCSimplySword;
import com.serkyo.simplycompat.item.behavior.SilverWeaponBehavior;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SCSSSilverWeapon extends SCSimplySword implements SilverWeaponBehavior {
    public SCSSSilverWeapon(WeaponType weaponType) {
        super(CustomTiers.SILVER, weaponType, "iceandfire:silver_ingot");
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        applySilverDamage(target, attacker);
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        applySilverTooltip(pTooltipComponents);
    }
}
