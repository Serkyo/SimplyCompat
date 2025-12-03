package com.serkyo.simplycompat.compat;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.SimplyConfigValues;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rosemarythyme.simplymore.item.normal.SimplyMoreSwordItem;
import net.sweenus.simplyswords.item.SimplySwordsSwordItem;

public class IceAndFireCompat {
    public static final DeferredRegister<Item> IAF_COMPAT_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimplyCompat.MOD_ID);

    public static final RegistryObject<Item> COPPER_LONGSWORD = IAF_COMPAT_ITEMS.register("copper_longsword",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.LONGSWORD_POSITIVE_MODIFIER - SimplyConfigValues.LONGSWORD_NEGATIVE_MODIFIER),
                    SimplyConfigValues.LONGSWORD_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_TWINBLADE = IAF_COMPAT_ITEMS.register("copper_twinblade",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.TWINBLADE_POSITIVE_MODIFIER - SimplyConfigValues.TWINBLADE_NEGATIVE_MODIFIER),
                    SimplyConfigValues.TWINBLADE_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_RAPIER = IAF_COMPAT_ITEMS.register("copper_rapier",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.RAPIER_POSITIVE_MODIFIER - SimplyConfigValues.RAPIER_NEGATIVE_MODIFIER),
                    SimplyConfigValues.RAPIER_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_KATANA = IAF_COMPAT_ITEMS.register("copper_katana",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.KATANA_POSITIVE_MODIFIER - SimplyConfigValues.KATANA_NEGATIVE_MODIFIER),
                    SimplyConfigValues.KATANA_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_SAI = IAF_COMPAT_ITEMS.register("copper_sai",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.SAI_POSITIVE_MODIFIER - SimplyConfigValues.SAI_NEGATIVE_MODIFIER),
                    SimplyConfigValues.SAI_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_SPEAR = IAF_COMPAT_ITEMS.register("copper_spear",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.SPEAR_POSITIVE_MODIFIER - SimplyConfigValues.SPEAR_NEGATIVE_MODIFIER),
                    SimplyConfigValues.SPEAR_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GLAIVE = IAF_COMPAT_ITEMS.register("copper_glaive",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.GLAIVE_POSITIVE_MODIFIER - SimplyConfigValues.GLAIVE_NEGATIVE_MODIFIER),
                    SimplyConfigValues.GLAIVE_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_WARGLAIVE = IAF_COMPAT_ITEMS.register("copper_warglaive",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.WARGLAIVE_POSITIVE_MODIFIER - SimplyConfigValues.WARGLAIVE_NEGATIVE_MODIFIER),
                    SimplyConfigValues.WARGLAIVE_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_CUTLASS = IAF_COMPAT_ITEMS.register("copper_cutlass",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.CUTLASS_POSITIVE_MODIFIER - SimplyConfigValues.CUTLASS_NEGATIVE_MODIFIER),
                    SimplyConfigValues.CUTLASS_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_CLAYMORE = IAF_COMPAT_ITEMS.register("copper_claymore",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.CLAYMORE_POSITIVE_MODIFIER - SimplyConfigValues.CLAYMORE_NEGATIVE_MODIFIER),
                    SimplyConfigValues.CLAYMORE_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GREATHAMMER = IAF_COMPAT_ITEMS.register("copper_greathammer",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.GREATHAMMER_POSITIVE_MODIFIER - SimplyConfigValues.GREATHAMMER_NEGATIVE_MODIFIER),
                    SimplyConfigValues.GREATHAMMER_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GREATAXE = IAF_COMPAT_ITEMS.register("copper_greataxe",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.GREATAXE_POSITIVE_MODIFIER - SimplyConfigValues.GREATAXE_NEGATIVE_MODIFIER),
                    SimplyConfigValues.GREATAXE_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_CHAKRAM = IAF_COMPAT_ITEMS.register("copper_chakram",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.CHAKRAM_POSITIVE_MODIFIER - SimplyConfigValues.CHAKRAM_NEGATIVE_MODIFIER),
                    SimplyConfigValues.CHAKRAM_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_SCYTHE = IAF_COMPAT_ITEMS.register("copper_scythe",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.SCYTHE_POSITIVE_MODIFIER - SimplyConfigValues.SCYTHE_NEGATIVE_MODIFIER),
                    SimplyConfigValues.SCYTHE_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_HALBERD = IAF_COMPAT_ITEMS.register("copper_halberd",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + SimplyConfigValues.HALBERD_POSITIVE_MODIFIER - SimplyConfigValues.HALBERD_NEGATIVE_MODIFIER),
                    SimplyConfigValues.HALBERD_ATTACKSPEED, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GREAT_KATANA = IAF_COMPAT_ITEMS.register("copper_great_katana",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getGreatKatanaDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getGreatKatanaSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GRANDSWORD = IAF_COMPAT_ITEMS.register("copper_grandsword",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getGrandswordDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getGrandswordSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("copper_backhand_blade",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getBackhandBladeDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getBackhandBladeSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_LANCE = IAF_COMPAT_ITEMS.register("copper_lance",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getLanceDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getLanceSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_KHOPESH = IAF_COMPAT_ITEMS.register("copper_khopesh",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getKhopeshDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getKhopeshSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_DAGGER = IAF_COMPAT_ITEMS.register("copper_dagger",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getDaggerDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getDaggerSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_PERNACH = IAF_COMPAT_ITEMS.register("copper_pernach",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getPernachDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getPernachSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("copper_quarterstaff",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getQuarterstaffDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getQuarterstaffSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("copper_great_spear",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getGreatSpearDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getGreatSpearSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_DEER_HORNS = IAF_COMPAT_ITEMS.register("copper_deer_horns",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    (int) (SCBakedConfigs.COPPER_DAMAGE_MODIFIER + 3 + SimplyConfigValues.attributesSimplyMore.getDeerHornsDamageModifier()),
                    (float) SimplyConfigValues.attributesSimplyMore.getDeerHornsSwingSpeed(), new Item.Properties(), "minecraft:copper_ingot"));

    public static boolean isPresent() {
        return ModList.get().isLoaded("iceandfire");
    }
}
