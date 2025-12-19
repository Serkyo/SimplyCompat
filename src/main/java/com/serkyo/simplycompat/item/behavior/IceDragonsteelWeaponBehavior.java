package com.serkyo.simplycompat.item.behavior;

import com.github.alexthe666.iceandfire.entity.props.EntityDataProvider;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.effect.DraconicResonance;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public interface IceDragonsteelWeaponBehavior {
    default void applyIceDragonsteelDamage(LivingEntity target, LivingEntity attacker) {
        boolean shouldApply = true;
        if (attacker instanceof Player playerAttacker && playerAttacker.getAttackStrengthScale(0.5F) <= 0.9F) {
            shouldApply = false;
        }
        if (shouldApply) {
            if (SCBakedConfigs.DRAGONSTEEL_REWORK) {
                DraconicResonance.applyToEntity(attacker, "ice");
            }
            else {
                EntityDataProvider.getCapability(target).ifPresent((data) -> data.frozenData.setFrozen(target, SCBakedConfigs.ICE_DRAGONSTEEL_FREEZE_TIME * 20));
                target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, SCBakedConfigs.ICE_DRAGONSTEEL_FREEZE_TIME * 20, 2));
                target.knockback(SCBakedConfigs.DRAGONSTEEL_KNOCKBACK, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
            }
        }
    }

    default void applyIceDragonsteelTooltip(List<Component> pTooltipComponents) {
        if (SCBakedConfigs.DRAGONSTEEL_REWORK) {

        }
        else {
            pTooltipComponents.add(Component.translatable("simplycompat.ice_dragonsteel_weapons.passive").withStyle(ChatFormatting.AQUA));
        }
    }
}
