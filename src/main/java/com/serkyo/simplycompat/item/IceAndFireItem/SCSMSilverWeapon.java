package com.serkyo.simplycompat.item.IceAndFireItem;

import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.item.SCSimplyMore;
import com.serkyo.simplycompat.item.behavior.SilverWeaponBehavior;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SCSMSilverWeapon extends SCSimplyMore implements SilverWeaponBehavior {
    public SCSMSilverWeapon(WeaponType weaponType) {
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
