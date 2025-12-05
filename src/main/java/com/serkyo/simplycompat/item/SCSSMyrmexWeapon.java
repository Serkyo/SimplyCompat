package com.serkyo.simplycompat.item;

import com.github.alexthe666.iceandfire.entity.EntityDeathWorm;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.TextUtils;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SCSSMyrmexWeapon extends SCSimplySword {
    public SCSSMyrmexWeapon(Tier toolMaterial, WeaponType weaponType, String... repairIngredient) {
        super(toolMaterial, weaponType, repairIngredient);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.getMobType() == MobType.ARTHROPOD || target instanceof EntityDeathWorm) {
            target.hurt(attacker.damageSources().generic(), SCBakedConfigs.MYRMEX_BONUS_DAMAGE);
        }
        boolean isMyrmexVenomWeapon = getTier() == CustomTiers.MYRMEX_DESERT_VENOM || getTier() == CustomTiers.MYRMEX_JUNGLE_VENOM;
        if (isMyrmexVenomWeapon  && target.level().random.nextFloat() < SCBakedConfigs.MYRMEX_STINGER_POISON_CHANCE / 100F) {
            target.addEffect(new MobEffectInstance(MobEffects.POISON, SCBakedConfigs.MYRMEX_STINGER_POISON_DURATION, SCBakedConfigs.MYRMEX_STINGER_POISON_LEVEL -1, false, true));
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("simplycompat.myrmex_weapons.bonus_damage", SCBakedConfigs.SILVER_BONUS_DAMAGE).withStyle(ChatFormatting.GREEN));
        if (getTier() == CustomTiers.MYRMEX_DESERT_VENOM || getTier() == CustomTiers.MYRMEX_JUNGLE_VENOM) {
            pTooltipComponents.add(Component.translatable("simplycompat.myrmex_venomous_weapons.poison_chance", SCBakedConfigs.MYRMEX_STINGER_POISON_CHANCE, TextUtils.formatEffectLevel(SCBakedConfigs.MYRMEX_STINGER_POISON_LEVEL - 1), SCBakedConfigs.MYRMEX_STINGER_POISON_DURATION).withStyle(ChatFormatting.GREEN));
        }
    }
}
