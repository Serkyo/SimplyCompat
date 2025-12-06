package com.serkyo.simplycompat.item.behavior;

import com.serkyo.simplycompat.config.SCBakedConfigs;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;

import java.util.List;

public interface SilverWeaponBehavior {
    default void applySilverDamage(LivingEntity target, LivingEntity attacker) {
        if (target.getMobType() == MobType.UNDEAD) {
            target.hurt(attacker.damageSources().magic(), SCBakedConfigs.SILVER_BONUS_DAMAGE);
        }
    }

    default void applySilverTooltip(List<Component> pTooltipComponents) {
        pTooltipComponents.add(Component.translatable("simplycompat.silver_weapons.bonus_damage", SCBakedConfigs.SILVER_BONUS_DAMAGE).withStyle(ChatFormatting.GREEN));
    }
}
