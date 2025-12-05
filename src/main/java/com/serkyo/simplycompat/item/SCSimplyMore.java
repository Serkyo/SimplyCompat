package com.serkyo.simplycompat.item;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponRegistrationUtils;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.rosemarythyme.simplymore.item.normal.SimplyMoreSwordItem;

public class SCSimplyMore extends SimplyMoreSwordItem {
    private final WeaponType weaponType;

    public SCSimplyMore(Tier toolMaterial, Properties settings, WeaponType weaponType, String... repairIngredient) {
        super(toolMaterial, 0, WeaponRegistrationUtils.getSimplyWeaponSpeed(weaponType), settings, repairIngredient);
        this.weaponType = weaponType;
    }

    @SubscribeEvent
    public static void simplyCompatAttackAttributeEvent(ItemAttributeModifierEvent event) {
        Item item = event.getItemStack().getItem();
        ResourceLocation id = ForgeRegistries.ITEMS.getKey(item);

        if (id != null) {
            if (id.getNamespace().equals(SimplyCompat.MOD_ID) && event.getSlotType() == EquipmentSlot.MAINHAND) {
                if (item instanceof SCSimplyMore weapon) {
                    event.getOriginalModifiers()
                            .get(Attributes.ATTACK_DAMAGE)
                            .stream()
                            .filter(attributeModifier -> attributeModifier.getId() == BASE_ATTACK_DAMAGE_UUID)
                            .findAny()
                            .ifPresent(attributeModifier -> event.removeModifier(Attributes.ATTACK_DAMAGE, attributeModifier));
                    int newDamage = 0;
                    if (weapon.getTier() instanceof CustomTiers customTier) {
                        newDamage = WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, weapon.getWeaponType());
                    }
                    else if (weapon.getTier() == CustomTiers.SILVER) {
                        newDamage = WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.SILVER_DAMAGE_MODIFIER, weapon.getWeaponType());
                    }
                    event.addModifier(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID,  SimplyCompat.MOD_ID + ":override", newDamage, AttributeModifier.Operation.ADDITION));
                }
            }
        }
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
