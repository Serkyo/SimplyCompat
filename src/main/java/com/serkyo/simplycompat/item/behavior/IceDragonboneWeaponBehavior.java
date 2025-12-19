package com.serkyo.simplycompat.item.behavior;

import com.github.alexthe666.iceandfire.entity.props.EntityDataProvider;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public interface IceDragonboneWeaponBehavior {
    default void applyIceDragonboneDamage(LivingEntity target, LivingEntity attacker) {
        boolean shouldApply = true;
        if (attacker instanceof Player playerAttacker && playerAttacker.getAttackStrengthScale(0.5F) <= 0.9F) {
            shouldApply = false;
        }
        if (shouldApply) {
            EntityDataProvider.getCapability(target).ifPresent((data) -> data.frozenData.setFrozen(target, SCBakedConfigs.ICE_INFUSED_DRAGONBONE_FREEZE_TIME * 20));
            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, SCBakedConfigs.ICE_INFUSED_DRAGONBONE_FREEZE_TIME * 20, 2));
            target.knockback(SCBakedConfigs.INFUSED_DRAGONBONE_KNOCKBACK, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        }
    }

    default void applyIceDragonboneTooltip(List<Component> pTooltipComponents) {
        pTooltipComponents.add(Component.translatable("simplycompat.ice_dragonbone_weapons.bonus_damage", SCBakedConfigs.INFUSED_DRAGONBONE_BONUS_DAMAGE).withStyle(ChatFormatting.GREEN));
        pTooltipComponents.add(Component.translatable("simplycompat.ice_dragonbone_weapons.passive").withStyle(ChatFormatting.AQUA));
    }
}
