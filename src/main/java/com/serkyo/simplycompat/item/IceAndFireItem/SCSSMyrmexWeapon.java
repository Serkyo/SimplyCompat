package com.serkyo.simplycompat.item.IceAndFireItem;

import com.serkyo.simplycompat.item.SCSimplySword;
import com.serkyo.simplycompat.item.behavior.MyrmexWeaponBehavior;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SCSSMyrmexWeapon extends SCSimplySword implements MyrmexWeaponBehavior {
    public SCSSMyrmexWeapon(Tier toolMaterial, WeaponType weaponType, String... repairIngredient) {
        super(toolMaterial, weaponType, repairIngredient);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        applyMyrmexDamage(target, attacker, getTier());
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        applyMyrmexTooltip(pTooltipComponents, getTier());
    }
}
