package com.serkyo.simplycompat.item.behavior;

import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.effect.DraconicResonance;
import com.serkyo.simplycompat.effect.ScorchingHeat;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public interface FireDragonsteelWeaponBehavior {
    default void applyFireDragonsteelDamage(LivingEntity target, LivingEntity attacker) {
        boolean shouldApply = true;
        if (attacker instanceof Player playerAttacker && playerAttacker.getAttackStrengthScale(0.5F) <= 0.9F) {
            shouldApply = false;
        }
        if (shouldApply) {
            if (SCBakedConfigs.DRAGONSTEEL_REWORK) {
                DraconicResonance.applyToEntity(attacker, "fire");
                ScorchingHeat.applyToEntity(target, attacker.getUUID(), attacker.getAttributeValue(Attributes.ATTACK_DAMAGE));
            }
            else {
                target.setSecondsOnFire(SCBakedConfigs.FIRE_DRAGONSTEEL_BURN_TIME);
                target.knockback(SCBakedConfigs.DRAGONSTEEL_KNOCKBACK, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
            }
        }
    }

    default void applyFireDragonsteelTooltip(List<Component> pTooltipComponents) {
        if (SCBakedConfigs.DRAGONSTEEL_REWORK) {

        }
        else {
            pTooltipComponents.add(Component.translatable("simplycompat.fire_dragonsteel_weapons.passive").withStyle(ChatFormatting.DARK_RED));
        }
    }
}
