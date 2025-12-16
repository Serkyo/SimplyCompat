package com.serkyo.simplycompat.utils;

import com.github.alexthe666.iceandfire.IafConfig;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum CustomTiers implements Tier {
    COPPER(2, 300, 0.7F, 0.0F, 10, () -> Ingredient.of(Items.COPPER_INGOT)),
    SILVER(2, 460, 11.0F, 1.0F, 18, () -> Ingredient.of(IafItemRegistry.SILVER_INGOT.get())),
    MYRMEX_DESERT(3, 600, 6.0F, 1.0F, 8, () -> Ingredient.of(IafItemRegistry.MYRMEX_DESERT_CHITIN.get())),
    MYRMEX_DESERT_VENOM(3, 600, 6.0F, 1.0F, 8, () -> Ingredient.of(IafItemRegistry.MYRMEX_DESERT_CHITIN.get())),
    MYRMEX_JUNGLE(3, 600, 6.0F, 1.0F, 8, () -> Ingredient.of(IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get())),
    MYRMEX_JUNGLE_VENOM(3, 600, 6.0F, 1.0F, 8, () -> Ingredient.of(IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get())),
    DRAGONBONE(3, 1660, 10.0F, 4.0F, 22, () -> Ingredient.of(IafItemRegistry.DRAGON_BONE.get())),
    INFUSED_DRAGONBONE(3, 2000, 10.0F, 5.5F, 22, () -> Ingredient.of(IafItemRegistry.DRAGON_BONE.get())),
    FIRE_DRAGONSTEEL(4, 8000, 10.0F, 21.0F, 10, () -> Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_INGOT.get())),
    ICE_DRAGONSTEEL(4, 8000, 10.0F, 21.0F, 10, () -> Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_INGOT.get())),
    LIGHTNING_DRAGONSTEEL(4, 8000, 10.0F, 21.0F, 10, () -> Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_INGOT.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    CustomTiers(int pLevel, int pUses, float pSpeed, float pDamage, int pEnchantmentValue, Supplier<Ingredient> pRepairIngredient) {
        this.level = pLevel;
        this.uses = pUses;
        this.speed = pSpeed;
        this.damage = pDamage;
        this.enchantmentValue = pEnchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
