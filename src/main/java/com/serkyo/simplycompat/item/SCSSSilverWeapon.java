package com.serkyo.simplycompat.item;

import com.serkyo.simplycompat.config.SCBakedConfigs;
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

public class SCSSSilverWeapon extends SCSimplySword {
    public SCSSSilverWeapon(WeaponType weaponType) {
        super(CustomTiers.SILVER, weaponType, "iceandfire:silver_ingot");
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.getMobType() == MobType.UNDEAD) {
            target.hurt(attacker.damageSources().magic(), SCBakedConfigs.SILVER_BONUS_DAMAGE);
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("simplycompat.silverweapons.hurt", SCBakedConfigs.SILVER_BONUS_DAMAGE).withStyle(ChatFormatting.GREEN));
    }
}
