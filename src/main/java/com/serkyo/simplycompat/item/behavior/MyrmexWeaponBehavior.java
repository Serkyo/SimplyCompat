package com.serkyo.simplycompat.item.behavior;

import com.github.alexthe666.iceandfire.entity.EntityDeathWorm;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.TextUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.Tier;

import java.util.List;

public interface MyrmexWeaponBehavior {
    default void applyMyrmexDamage(LivingEntity target, LivingEntity attacker, Tier tier) {
        if (target.getMobType() != MobType.ARTHROPOD || target instanceof EntityDeathWorm) {
            target.hurt(attacker.damageSources().generic(), SCBakedConfigs.MYRMEX_BONUS_DAMAGE);
        }
        boolean isMyrmexVenomWeapon = tier == CustomTiers.MYRMEX_DESERT_VENOM || tier == CustomTiers.MYRMEX_JUNGLE_VENOM;
        if (isMyrmexVenomWeapon  && target.level().random.nextFloat() < SCBakedConfigs.MYRMEX_STINGER_POISON_CHANCE / 100F) {
            target.addEffect(new MobEffectInstance(MobEffects.POISON, SCBakedConfigs.MYRMEX_STINGER_POISON_DURATION * 40, SCBakedConfigs.MYRMEX_STINGER_POISON_LEVEL -1, false, true));
        }
    }

    default void applyMyrmexTooltip(List<Component> pTooltipComponents, Tier tier) {
        pTooltipComponents.add(Component.translatable("simplycompat.myrmex_weapons.bonus_damage", SCBakedConfigs.MYRMEX_BONUS_DAMAGE).withStyle(ChatFormatting.GREEN));
        if (tier == CustomTiers.MYRMEX_DESERT_VENOM || tier == CustomTiers.MYRMEX_JUNGLE_VENOM) {
            pTooltipComponents.add(Component.translatable("simplycompat.myrmex_venomous_weapons.poison_chance", SCBakedConfigs.MYRMEX_STINGER_POISON_CHANCE, TextUtils.formatEffectLevel(SCBakedConfigs.MYRMEX_STINGER_POISON_LEVEL - 1), SCBakedConfigs.MYRMEX_STINGER_POISON_DURATION).withStyle(ChatFormatting.GREEN));
        }
    }
}
