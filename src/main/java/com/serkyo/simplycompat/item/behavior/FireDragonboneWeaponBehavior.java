package com.serkyo.simplycompat.item.behavior;

import com.serkyo.simplycompat.config.SCBakedConfigs;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public interface FireDragonboneWeaponBehavior {
    default void applyFireDragonboneDamage(LivingEntity target, LivingEntity attacker) {
        boolean shouldApply = true;
        if (attacker instanceof Player playerAttacker && playerAttacker.getAttackStrengthScale(0.5F) <= 0.9F) {
            shouldApply = false;
        }
        if (shouldApply) {
            target.setSecondsOnFire(SCBakedConfigs.FIRE_INFUSED_DRAGONBONE_BURN_TIME);
            target.knockback(SCBakedConfigs.INFUSED_DRAGONBONE_KNOCKBACK, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        }
    }

    default void applyFireDragonboneTooltip(List<Component> pTooltipComponents) {
        pTooltipComponents.add(Component.translatable("simplycompat.fire_dragonbone_weapons.bonus_damage", SCBakedConfigs.INFUSED_DRAGONBONE_BONUS_DAMAGE).withStyle(ChatFormatting.GREEN));
        pTooltipComponents.add(Component.translatable("simplycompat.fire_dragonbone_weapons.passive").withStyle(ChatFormatting.DARK_RED));
    }
}
