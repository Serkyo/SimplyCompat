package com.serkyo.simplycompat.event;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.effect.ScorchingHeat;
import com.serkyo.simplycompat.item.SCSimplyMore;
import com.serkyo.simplycompat.item.SCSimplySword;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponRegistrationUtils;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.event.entity.living.MobEffectEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.UUID;

@Mod.EventBusSubscriber(modid = SimplyCompat.MOD_ID)
public class SCServerEvent {
    @SubscribeEvent
    public static void simplyCompatAttackAttributeEvent(ItemAttributeModifierEvent event) {
        Item item = event.getItemStack().getItem();
        ResourceLocation id = ForgeRegistries.ITEMS.getKey(item);

        if (id != null) {
            if (id.getNamespace().equals(SimplyCompat.MOD_ID) && event.getSlotType() == EquipmentSlot.MAINHAND) {
                Tier weapontier = null;
                WeaponType weaponType = null;
                UUID baseAttackDamageUUID;
                if (item instanceof SCSimplySword simplySword) {
                    weapontier = simplySword.getTier();
                    weaponType = simplySword.getWeaponType();
                    baseAttackDamageUUID = simplySword.getBaseAttackDamageUUID();
                }
                else if (item instanceof SCSimplyMore simplyMore){
                    weapontier = simplyMore.getTier();
                    weaponType = simplyMore.getWeaponType();
                    baseAttackDamageUUID = simplyMore.getBaseAttackDamageUUID();
                } else {
                    baseAttackDamageUUID = null;
                }

                if (weapontier != null && weaponType != null && baseAttackDamageUUID != null) {
                    event.getOriginalModifiers()
                            .get(Attributes.ATTACK_DAMAGE)
                            .stream()
                            .filter(attributeModifier -> attributeModifier.getId() == baseAttackDamageUUID)
                            .findAny()
                            .ifPresent(attributeModifier -> event.removeModifier(Attributes.ATTACK_DAMAGE, attributeModifier));
                    int newDamage = 0;
                    if (weapontier == CustomTiers.COPPER) {
                        newDamage = WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, weaponType);
                    }
                    else if (weapontier == CustomTiers.SILVER) {
                        newDamage = WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.SILVER_DAMAGE_MODIFIER, weaponType);
                    }
                    else if (weapontier == CustomTiers.MYRMEX_DESERT || weapontier == CustomTiers.MYRMEX_DESERT_VENOM || weapontier == CustomTiers.MYRMEX_JUNGLE || weapontier == CustomTiers.MYRMEX_JUNGLE_VENOM) {
                        newDamage = WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.MYRMEX_DAMAGE_MODIFIER, weaponType);
                    }
                    else if (weapontier == CustomTiers.DRAGONBONE) {
                        newDamage = WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.DRAGONBONE_DAMAGE_MODIFIER, weaponType);
                    }
                    else if (weapontier == CustomTiers.INFUSED_DRAGONBONE) {
                        newDamage = WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.INFUSED_DRAGONBONE_DAMAGE_MODIFIER, weaponType);
                    }
                    else if (weapontier == CustomTiers.FIRE_DRAGONSTEEL || weapontier == CustomTiers.ICE_DRAGONSTEEL || weapontier == CustomTiers.LIGHTNING_DRAGONSTEEL) {
                        newDamage = WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.DRAGONSTEEL_DAMAGE_MODIFIER, weaponType);
                    }
                    event.addModifier(Attributes.ATTACK_DAMAGE, new AttributeModifier(baseAttackDamageUUID,  SimplyCompat.MOD_ID + ":override", newDamage, AttributeModifier.Operation.ADDITION));
                }
            }
        }
    }

    @SubscribeEvent
    public static void clearPersistentData(MobEffectEvent.Remove event) {
        MobEffect effect = event.getEffect();
        LivingEntity entity = event.getEntity();
        if (effect instanceof ScorchingHeat) {
            entity.getPersistentData().remove("ScorchingHeatOwner");
            entity.getPersistentData().remove("ScorchingHeatOwnerAttack");
        }
    }
}
