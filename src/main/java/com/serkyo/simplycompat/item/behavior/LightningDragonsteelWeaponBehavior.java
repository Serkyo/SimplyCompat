package com.serkyo.simplycompat.item.behavior;

import com.github.alexthe666.iceandfire.event.ServerEvents;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.effect.DraconicResonance;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public interface LightningDragonsteelWeaponBehavior {
    default void applyLightningDragonsteelDamage(LivingEntity target, LivingEntity attacker) {
        boolean shouldApply = true;
        if (attacker instanceof Player playerAttacker && playerAttacker.getAttackStrengthScale(0.5F) <= 0.9F) {
            shouldApply = false;
        }
        if (shouldApply) {
            if (SCBakedConfigs.DRAGONSTEEL_REWORK) {
                DraconicResonance.applyToEntity(attacker, "lightning");
            }
            else {
                boolean flag = !(attacker instanceof Player) || !((double) attacker.attackAnim > 0.2);

                if (!attacker.level().isClientSide && flag) {
                    LightningBolt lightningboltentity = EntityType.LIGHTNING_BOLT.create(target.level());
                    lightningboltentity.getTags().add(ServerEvents.BOLT_DONT_DESTROY_LOOT);
                    lightningboltentity.getTags().add(attacker.getStringUUID());
                    lightningboltentity.moveTo(target.position());

                    if (!target.level().isClientSide) {
                        target.level().addFreshEntity(lightningboltentity);
                    }
                }
                target.knockback(SCBakedConfigs.DRAGONSTEEL_KNOCKBACK, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
            }
        }
    }

    default void applyLightningDragonsteelTooltip(List<Component> pTooltipComponents) {
        if (SCBakedConfigs.DRAGONSTEEL_REWORK) {

        }
        else {
            pTooltipComponents.add(Component.translatable("simplycompat.lightning_dragonsteel_weapons.passive").withStyle(ChatFormatting.DARK_PURPLE));
        }
    }
}
