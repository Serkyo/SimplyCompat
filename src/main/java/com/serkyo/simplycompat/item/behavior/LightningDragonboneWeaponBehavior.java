package com.serkyo.simplycompat.item.behavior;

import com.github.alexthe666.iceandfire.event.ServerEvents;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public interface LightningDragonboneWeaponBehavior {
    default void applyLightningDragonboneDamage(LivingEntity target, LivingEntity attacker) {
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
        target.knockback(SCBakedConfigs.INFUSED_DRAGONBONE_KNOCKBACK, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
    }

    default void applyLightningDragonboneTooltip(List<Component> pTooltipComponents) {
        pTooltipComponents.add(Component.translatable("simplycompat.lightning_dragonbone_weapons.bonus_damage", SCBakedConfigs.INFUSED_DRAGONBONE_BONUS_DAMAGE / 2).withStyle(ChatFormatting.GREEN));
        pTooltipComponents.add(Component.translatable("simplycompat.lightning_dragonbone_weapons.passive").withStyle(ChatFormatting.DARK_PURPLE));
    }
}
