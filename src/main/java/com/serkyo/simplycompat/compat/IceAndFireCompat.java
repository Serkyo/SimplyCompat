package com.serkyo.simplycompat.compat;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.item.*;
import com.serkyo.simplycompat.item.IceAndFireItem.*;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IceAndFireCompat extends Compat {
    public static final DeferredRegister<Item> IAF_COMPAT_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimplyCompat.MOD_ID);

    public static final RegistryObject<Item> COPPER_LONGSWORD = IAF_COMPAT_ITEMS.register("copper_longsword",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.LONGSWORD, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_TWINBLADE = IAF_COMPAT_ITEMS.register("copper_twinblade",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.TWINBLADE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_RAPIER = IAF_COMPAT_ITEMS.register("copper_rapier",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.RAPIER, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_KATANA = IAF_COMPAT_ITEMS.register("copper_katana",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.KATANA, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_SAI = IAF_COMPAT_ITEMS.register("copper_sai",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.SAI, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_SPEAR = IAF_COMPAT_ITEMS.register("copper_spear",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.SPEAR, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_GLAIVE = IAF_COMPAT_ITEMS.register("copper_glaive",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.GLAIVE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_WARGLAIVE = IAF_COMPAT_ITEMS.register("copper_warglaive",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.WARGLAIVE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_CUTLASS = IAF_COMPAT_ITEMS.register("copper_cutlass",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.CUTLASS, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_CLAYMORE = IAF_COMPAT_ITEMS.register("copper_claymore",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.CLAYMORE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_GREATHAMMER = IAF_COMPAT_ITEMS.register("copper_greathammer",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.GREATHAMMER, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_GREATAXE = IAF_COMPAT_ITEMS.register("copper_greataxe",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.GREATAXE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_CHAKRAM = IAF_COMPAT_ITEMS.register("copper_chakram",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.CHAKRAM, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_SCYTHE = IAF_COMPAT_ITEMS.register("copper_scythe",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.SCYTHE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_HALBERD = IAF_COMPAT_ITEMS.register("copper_halberd",
            () -> new SCSimplySword(CustomTiers.COPPER, WeaponType.HALBERD, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_GREAT_KATANA = IAF_COMPAT_ITEMS.register("copper_great_katana",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.GREAT_KATANA, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_GRANDSWORD = IAF_COMPAT_ITEMS.register("copper_grandsword",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.GRANDSWORD, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("copper_backhand_blade",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.BACKHAND_BLADE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_LANCE = IAF_COMPAT_ITEMS.register("copper_lance",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.LANCE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_KHOPESH = IAF_COMPAT_ITEMS.register("copper_khopesh",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.KHOPESH, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_DAGGER = IAF_COMPAT_ITEMS.register("copper_dagger",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.DAGGER, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_PERNACH = IAF_COMPAT_ITEMS.register("copper_pernach",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.PERNACH, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("copper_quarterstaff",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.QUARTERSTAFF, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("copper_great_spear",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.GREAT_SPEAR, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_DEER_HORNS = IAF_COMPAT_ITEMS.register("copper_deer_horns",
            () -> new SCSimplyMore(CustomTiers.COPPER, WeaponType.DEER_HORNS, "minecraft:copper_ingot"));

    public static final RegistryObject<Item> SILVER_LONGSWORD = IAF_COMPAT_ITEMS.register("silver_longsword",
            () -> new SCSSSilverWeapon(WeaponType.LONGSWORD));
    public static final RegistryObject<Item> SILVER_TWINBLADE = IAF_COMPAT_ITEMS.register("silver_twinblade",
            () -> new SCSSSilverWeapon(WeaponType.TWINBLADE));
    public static final RegistryObject<Item> SILVER_RAPIER = IAF_COMPAT_ITEMS.register("silver_rapier",
            () -> new SCSSSilverWeapon(WeaponType.RAPIER));
    public static final RegistryObject<Item> SILVER_KATANA = IAF_COMPAT_ITEMS.register("silver_katana",
            () -> new SCSSSilverWeapon(WeaponType.KATANA));
    public static final RegistryObject<Item> SILVER_SAI = IAF_COMPAT_ITEMS.register("silver_sai",
            () -> new SCSSSilverWeapon(WeaponType.SAI));
    public static final RegistryObject<Item> SILVER_SPEAR = IAF_COMPAT_ITEMS.register("silver_spear",
            () -> new SCSSSilverWeapon(WeaponType.SPEAR));
    public static final RegistryObject<Item> SILVER_GLAIVE = IAF_COMPAT_ITEMS.register("silver_glaive",
            () -> new SCSSSilverWeapon(WeaponType.GLAIVE));
    public static final RegistryObject<Item> SILVER_WARGLAIVE = IAF_COMPAT_ITEMS.register("silver_warglaive",
            () -> new SCSSSilverWeapon(WeaponType.WARGLAIVE));
    public static final RegistryObject<Item> SILVER_CUTLASS = IAF_COMPAT_ITEMS.register("silver_cutlass",
            () -> new SCSSSilverWeapon(WeaponType.CUTLASS));
    public static final RegistryObject<Item> SILVER_CLAYMORE = IAF_COMPAT_ITEMS.register("silver_claymore",
            () -> new SCSSSilverWeapon(WeaponType.CLAYMORE));
    public static final RegistryObject<Item> SILVER_GREATHAMMER = IAF_COMPAT_ITEMS.register("silver_greathammer",
            () -> new SCSSSilverWeapon(WeaponType.GREATHAMMER));
    public static final RegistryObject<Item> SILVER_GREATAXE = IAF_COMPAT_ITEMS.register("silver_greataxe",
            () -> new SCSSSilverWeapon(WeaponType.GREATAXE));
    public static final RegistryObject<Item> SILVER_CHAKRAM = IAF_COMPAT_ITEMS.register("silver_chakram",
            () -> new SCSSSilverWeapon(WeaponType.CHAKRAM));
    public static final RegistryObject<Item> SILVER_SCYTHE = IAF_COMPAT_ITEMS.register("silver_scythe",
            () -> new SCSSSilverWeapon(WeaponType.SCYTHE));
    public static final RegistryObject<Item> SILVER_HALBERD = IAF_COMPAT_ITEMS.register("silver_halberd",
            () -> new SCSSSilverWeapon(WeaponType.HALBERD));
    public static final RegistryObject<Item> SILVER_GREAT_KATANA = IAF_COMPAT_ITEMS.register("silver_great_katana",
            () -> new SCSMSilverWeapon(WeaponType.GREAT_KATANA));
    public static final RegistryObject<Item> SILVER_GRANDSWORD = IAF_COMPAT_ITEMS.register("silver_grandsword",
            () -> new SCSMSilverWeapon(WeaponType.GRANDSWORD));
    public static final RegistryObject<Item> SILVER_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("silver_backhand_blade",
            () -> new SCSMSilverWeapon(WeaponType.BACKHAND_BLADE));
    public static final RegistryObject<Item> SILVER_LANCE = IAF_COMPAT_ITEMS.register("silver_lance",
            () -> new SCSMSilverWeapon(WeaponType.LANCE));
    public static final RegistryObject<Item> SILVER_KHOPESH = IAF_COMPAT_ITEMS.register("silver_khopesh",
            () -> new SCSMSilverWeapon(WeaponType.KHOPESH));
    public static final RegistryObject<Item> SILVER_DAGGER = IAF_COMPAT_ITEMS.register("silver_dagger",
            () -> new SCSMSilverWeapon(WeaponType.DAGGER));
    public static final RegistryObject<Item> SILVER_PERNACH = IAF_COMPAT_ITEMS.register("silver_pernach",
            () -> new SCSMSilverWeapon(WeaponType.PERNACH));
    public static final RegistryObject<Item> SILVER_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("silver_quarterstaff",
            () -> new SCSMSilverWeapon(WeaponType.QUARTERSTAFF));
    public static final RegistryObject<Item> SILVER_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("silver_great_spear",
            () -> new SCSMSilverWeapon(WeaponType.GREAT_SPEAR));
    public static final RegistryObject<Item> SILVER_DEER_HORNS = IAF_COMPAT_ITEMS.register("silver_deer_horns",
            () -> new SCSMSilverWeapon(WeaponType.DEER_HORNS));

    public static final RegistryObject<Item> MYRMEX_DESERT_LONGSWORD = IAF_COMPAT_ITEMS.register("myrmex_desert_longsword",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.LONGSWORD, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_TWINBLADE = IAF_COMPAT_ITEMS.register("myrmex_desert_twinblade",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.TWINBLADE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_RAPIER = IAF_COMPAT_ITEMS.register("myrmex_desert_rapier",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.RAPIER, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_KATANA = IAF_COMPAT_ITEMS.register("myrmex_desert_katana",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.KATANA, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_SAI = IAF_COMPAT_ITEMS.register("myrmex_desert_sai",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.SAI, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_SPEAR = IAF_COMPAT_ITEMS.register("myrmex_desert_spear",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.SPEAR, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GLAIVE = IAF_COMPAT_ITEMS.register("myrmex_desert_glaive",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.GLAIVE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_WARGLAIVE = IAF_COMPAT_ITEMS.register("myrmex_desert_warglaive",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.WARGLAIVE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_CUTLASS = IAF_COMPAT_ITEMS.register("myrmex_desert_cutlass",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.CUTLASS, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_CLAYMORE = IAF_COMPAT_ITEMS.register("myrmex_desert_claymore",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.CLAYMORE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GREATHAMMER = IAF_COMPAT_ITEMS.register("myrmex_desert_greathammer",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.GREATHAMMER, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GREATAXE = IAF_COMPAT_ITEMS.register("myrmex_desert_greataxe",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.GREATAXE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_CHAKRAM = IAF_COMPAT_ITEMS.register("myrmex_desert_chakram",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.CHAKRAM, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_SCYTHE = IAF_COMPAT_ITEMS.register("myrmex_desert_scythe",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.SCYTHE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_HALBERD = IAF_COMPAT_ITEMS.register("myrmex_desert_halberd",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.HALBERD, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GREAT_KATANA = IAF_COMPAT_ITEMS.register("myrmex_desert_great_katana",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.GREAT_KATANA, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GRANDSWORD = IAF_COMPAT_ITEMS.register("myrmex_desert_grandsword",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.GRANDSWORD, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("myrmex_desert_backhand_blade",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.BACKHAND_BLADE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_LANCE = IAF_COMPAT_ITEMS.register("myrmex_desert_lance",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.LANCE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_KHOPESH = IAF_COMPAT_ITEMS.register("myrmex_desert_khopesh",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.KHOPESH, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_DAGGER = IAF_COMPAT_ITEMS.register("myrmex_desert_dagger",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.DAGGER, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_PERNACH = IAF_COMPAT_ITEMS.register("myrmex_desert_pernach",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.PERNACH, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("myrmex_desert_quarterstaff",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.QUARTERSTAFF, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("myrmex_desert_great_spear",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.GREAT_SPEAR, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_DEER_HORNS = IAF_COMPAT_ITEMS.register("myrmex_desert_deer_horns",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT, WeaponType.DEER_HORNS, "iceandfire:myrmex_desert_chitin"));

    public static final RegistryObject<Item> MYRMEX_DESERT_LONGSWORD_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_longsword_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.LONGSWORD, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_TWINBLADE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_twinblade_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.TWINBLADE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_RAPIER_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_rapier_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.RAPIER, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_KATANA_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_katana_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.KATANA, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_SAI_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_sai_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.SAI, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_SPEAR_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_spear_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.SPEAR, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GLAIVE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_glaive_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.GLAIVE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_WARGLAIVE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_warglaive_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.WARGLAIVE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_CUTLASS_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_cutlass_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.CUTLASS, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_CLAYMORE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_claymore_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.CLAYMORE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GREATHAMMER_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_greathammer_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.GREATHAMMER, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GREATAXE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_greataxe_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.GREATAXE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_CHAKRAM_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_chakram_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.CHAKRAM, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_SCYTHE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_scythe_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.SCYTHE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_HALBERD_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_halberd_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.HALBERD, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GREAT_KATANA_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_great_katana_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.GREAT_KATANA, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GRANDSWORD_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_grandsword_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.GRANDSWORD, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_BACKHAND_BLADE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_backhand_blade_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.BACKHAND_BLADE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_LANCE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_lance_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.LANCE, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_KHOPESH_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_khopesh_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.KHOPESH, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_DAGGER_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_dagger_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.DAGGER, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_PERNACH_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_pernach_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.PERNACH, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_QUARTERSTAFF_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_quarterstaff_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.QUARTERSTAFF, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_GREAT_SPEAR_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_great_spear_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.GREAT_SPEAR, "iceandfire:myrmex_desert_chitin"));
    public static final RegistryObject<Item> MYRMEX_DESERT_DEER_HORNS_VENOM = IAF_COMPAT_ITEMS.register("myrmex_desert_deer_horns_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_DESERT_VENOM, WeaponType.DEER_HORNS, "iceandfire:myrmex_desert_chitin"));

    public static final RegistryObject<Item> MYRMEX_JUNGLE_LONGSWORD = IAF_COMPAT_ITEMS.register("myrmex_jungle_longsword",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.LONGSWORD, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_TWINBLADE = IAF_COMPAT_ITEMS.register("myrmex_jungle_twinblade",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.TWINBLADE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_RAPIER = IAF_COMPAT_ITEMS.register("myrmex_jungle_rapier",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.RAPIER, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_KATANA = IAF_COMPAT_ITEMS.register("myrmex_jungle_katana",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.KATANA, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_SAI = IAF_COMPAT_ITEMS.register("myrmex_jungle_sai",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.SAI, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_SPEAR = IAF_COMPAT_ITEMS.register("myrmex_jungle_spear",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.SPEAR, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GLAIVE = IAF_COMPAT_ITEMS.register("myrmex_jungle_glaive",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.GLAIVE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_WARGLAIVE = IAF_COMPAT_ITEMS.register("myrmex_jungle_warglaive",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.WARGLAIVE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_CUTLASS = IAF_COMPAT_ITEMS.register("myrmex_jungle_cutlass",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.CUTLASS, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_CLAYMORE = IAF_COMPAT_ITEMS.register("myrmex_jungle_claymore",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.CLAYMORE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GREATHAMMER = IAF_COMPAT_ITEMS.register("myrmex_jungle_greathammer",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.GREATHAMMER, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GREATAXE = IAF_COMPAT_ITEMS.register("myrmex_jungle_greataxe",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.GREATAXE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_CHAKRAM = IAF_COMPAT_ITEMS.register("myrmex_jungle_chakram",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.CHAKRAM, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_SCYTHE = IAF_COMPAT_ITEMS.register("myrmex_jungle_scythe",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.SCYTHE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_HALBERD = IAF_COMPAT_ITEMS.register("myrmex_jungle_halberd",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.HALBERD, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GREAT_KATANA = IAF_COMPAT_ITEMS.register("myrmex_jungle_great_katana",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.GREAT_KATANA, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GRANDSWORD = IAF_COMPAT_ITEMS.register("myrmex_jungle_grandsword",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.GRANDSWORD, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("myrmex_jungle_backhand_blade",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.BACKHAND_BLADE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_LANCE = IAF_COMPAT_ITEMS.register("myrmex_jungle_lance",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.LANCE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_KHOPESH = IAF_COMPAT_ITEMS.register("myrmex_jungle_khopesh",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.KHOPESH, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_DAGGER = IAF_COMPAT_ITEMS.register("myrmex_jungle_dagger",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.DAGGER, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_PERNACH = IAF_COMPAT_ITEMS.register("myrmex_jungle_pernach",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.PERNACH, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("myrmex_jungle_quarterstaff",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.QUARTERSTAFF, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("myrmex_jungle_great_spear",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.GREAT_SPEAR, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_DEER_HORNS = IAF_COMPAT_ITEMS.register("myrmex_jungle_deer_horns",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE, WeaponType.DEER_HORNS, "iceandfire:myrmex_jungle_chitin"));

    public static final RegistryObject<Item> MYRMEX_JUNGLE_LONGSWORD_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_longsword_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.LONGSWORD, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_TWINBLADE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_twinblade_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.TWINBLADE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_RAPIER_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_rapier_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.RAPIER, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_KATANA_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_katana_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.KATANA, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_SAI_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_sai_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.SAI, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_SPEAR_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_spear_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.SPEAR, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GLAIVE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_glaive_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.GLAIVE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_WARGLAIVE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_warglaive_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.WARGLAIVE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_CUTLASS_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_cutlass_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.CUTLASS, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_CLAYMORE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_claymore_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.CLAYMORE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GREATHAMMER_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_greathammer_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.GREATHAMMER, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GREATAXE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_greataxe_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.GREATAXE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_CHAKRAM_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_chakram_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.CHAKRAM, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_SCYTHE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_scythe_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.SCYTHE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_HALBERD_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_halberd_venom",
            () -> new SCSSMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.HALBERD, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GREAT_KATANA_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_great_katana_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.GREAT_KATANA, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GRANDSWORD_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_grandsword_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.GRANDSWORD, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_BACKHAND_BLADE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_backhand_blade_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.BACKHAND_BLADE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_LANCE_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_lance_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.LANCE, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_KHOPESH_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_khopesh_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.KHOPESH, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_DAGGER_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_dagger_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.DAGGER, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_PERNACH_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_pernach_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.PERNACH, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_QUARTERSTAFF_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_quarterstaff_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.QUARTERSTAFF, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_GREAT_SPEAR_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_great_spear_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.GREAT_SPEAR, "iceandfire:myrmex_jungle_chitin"));
    public static final RegistryObject<Item> MYRMEX_JUNGLE_DEER_HORNS_VENOM = IAF_COMPAT_ITEMS.register("myrmex_jungle_deer_horns_venom",
            () -> new SCSMMyrmexWeapon(CustomTiers.MYRMEX_JUNGLE_VENOM, WeaponType.DEER_HORNS, "iceandfire:myrmex_jungle_chitin"));

    public static final RegistryObject<Item> DRAGONBONE_LONGSWORD = IAF_COMPAT_ITEMS.register("dragonbone_longsword",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.LONGSWORD, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_TWINBLADE = IAF_COMPAT_ITEMS.register("dragonbone_twinblade",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.TWINBLADE, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_RAPIER = IAF_COMPAT_ITEMS.register("dragonbone_rapier",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.RAPIER, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_KATANA = IAF_COMPAT_ITEMS.register("dragonbone_katana",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.KATANA, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_SAI = IAF_COMPAT_ITEMS.register("dragonbone_sai",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.SAI, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_SPEAR = IAF_COMPAT_ITEMS.register("dragonbone_spear",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.SPEAR, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_GLAIVE = IAF_COMPAT_ITEMS.register("dragonbone_glaive",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.GLAIVE, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_WARGLAIVE = IAF_COMPAT_ITEMS.register("dragonbone_warglaive",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.WARGLAIVE, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_CUTLASS = IAF_COMPAT_ITEMS.register("dragonbone_cutlass",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.CUTLASS, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_CLAYMORE = IAF_COMPAT_ITEMS.register("dragonbone_claymore",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.CLAYMORE, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_GREATHAMMER = IAF_COMPAT_ITEMS.register("dragonbone_greathammer",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.GREATHAMMER, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_GREATAXE = IAF_COMPAT_ITEMS.register("dragonbone_greataxe",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.GREATAXE, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_CHAKRAM = IAF_COMPAT_ITEMS.register("dragonbone_chakram",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.CHAKRAM, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_SCYTHE = IAF_COMPAT_ITEMS.register("dragonbone_scythe",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.SCYTHE, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_HALBERD = IAF_COMPAT_ITEMS.register("dragonbone_halberd",
            () -> new SCSimplySword(CustomTiers.DRAGONBONE, WeaponType.HALBERD, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_GREAT_KATANA = IAF_COMPAT_ITEMS.register("dragonbone_great_katana",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.GREAT_KATANA, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_GRANDSWORD = IAF_COMPAT_ITEMS.register("dragonbone_grandsword",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.GRANDSWORD, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("dragonbone_backhand_blade",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.BACKHAND_BLADE, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_LANCE = IAF_COMPAT_ITEMS.register("dragonbone_lance",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.LANCE, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_KHOPESH = IAF_COMPAT_ITEMS.register("dragonbone_khopesh",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.KHOPESH, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_DAGGER = IAF_COMPAT_ITEMS.register("dragonbone_dagger",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.DAGGER, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_PERNACH = IAF_COMPAT_ITEMS.register("dragonbone_pernach",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.PERNACH, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("dragonbone_quarterstaff",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.QUARTERSTAFF, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("dragonbone_great_spear",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.GREAT_SPEAR, "iceandfire:dragonbone"));
    public static final RegistryObject<Item> DRAGONBONE_DEER_HORNS = IAF_COMPAT_ITEMS.register("dragonbone_deer_horns",
            () -> new SCSimplyMore(CustomTiers.DRAGONBONE, WeaponType.DEER_HORNS, "iceandfire:dragonbone"));

    public static final RegistryObject<Item> FIRE_DRAGONBONE_LONGSWORD = IAF_COMPAT_ITEMS.register("dragonbone_longsword_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.LONGSWORD));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_TWINBLADE = IAF_COMPAT_ITEMS.register("dragonbone_twinblade_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.TWINBLADE));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_RAPIER = IAF_COMPAT_ITEMS.register("dragonbone_rapier_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.RAPIER));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_KATANA = IAF_COMPAT_ITEMS.register("dragonbone_katana_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.KATANA));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_SAI = IAF_COMPAT_ITEMS.register("dragonbone_sai_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.SAI));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_SPEAR = IAF_COMPAT_ITEMS.register("dragonbone_spear_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.SPEAR));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_GLAIVE = IAF_COMPAT_ITEMS.register("dragonbone_glaive_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.GLAIVE));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_WARGLAIVE = IAF_COMPAT_ITEMS.register("dragonbone_warglaive_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.WARGLAIVE));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_CUTLASS = IAF_COMPAT_ITEMS.register("dragonbone_cutlass_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.CUTLASS));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_CLAYMORE = IAF_COMPAT_ITEMS.register("dragonbone_claymore_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.CLAYMORE));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_GREATHAMMER = IAF_COMPAT_ITEMS.register("dragonbone_greathammer_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.GREATHAMMER));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_GREATAXE = IAF_COMPAT_ITEMS.register("dragonbone_greataxe_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.GREATAXE));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_CHAKRAM = IAF_COMPAT_ITEMS.register("dragonbone_chakram_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.CHAKRAM));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_SCYTHE = IAF_COMPAT_ITEMS.register("dragonbone_scythe_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.SCYTHE));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_HALBERD = IAF_COMPAT_ITEMS.register("dragonbone_halberd_fire",
            () -> new SCSSFireDragonboneWeapon(WeaponType.HALBERD));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_GREAT_KATANA = IAF_COMPAT_ITEMS.register("dragonbone_great_katana_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.GREAT_KATANA));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_GRANDSWORD = IAF_COMPAT_ITEMS.register("dragonbone_grandsword_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.GRANDSWORD));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("dragonbone_backhand_blade_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.BACKHAND_BLADE));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_LANCE = IAF_COMPAT_ITEMS.register("dragonbone_lance_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.LANCE));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_KHOPESH = IAF_COMPAT_ITEMS.register("dragonbone_khopesh_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.KHOPESH));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_DAGGER = IAF_COMPAT_ITEMS.register("dragonbone_dagger_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.DAGGER));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_PERNACH = IAF_COMPAT_ITEMS.register("dragonbone_pernach_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.PERNACH));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("dragonbone_quarterstaff_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.QUARTERSTAFF));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("dragonbone_great_spear_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.GREAT_SPEAR));
    public static final RegistryObject<Item> FIRE_DRAGONBONE_DEER_HORNS = IAF_COMPAT_ITEMS.register("dragonbone_deer_horns_fire",
            () -> new SCSMFireDragonboneWeapon(WeaponType.DEER_HORNS));

    public static final RegistryObject<Item> ICE_DRAGONBONE_LONGSWORD = IAF_COMPAT_ITEMS.register("dragonbone_longsword_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.LONGSWORD));
    public static final RegistryObject<Item> ICE_DRAGONBONE_TWINBLADE = IAF_COMPAT_ITEMS.register("dragonbone_twinblade_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.TWINBLADE));
    public static final RegistryObject<Item> ICE_DRAGONBONE_RAPIER = IAF_COMPAT_ITEMS.register("dragonbone_rapier_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.RAPIER));
    public static final RegistryObject<Item> ICE_DRAGONBONE_KATANA = IAF_COMPAT_ITEMS.register("dragonbone_katana_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.KATANA));
    public static final RegistryObject<Item> ICE_DRAGONBONE_SAI = IAF_COMPAT_ITEMS.register("dragonbone_sai_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.SAI));
    public static final RegistryObject<Item> ICE_DRAGONBONE_SPEAR = IAF_COMPAT_ITEMS.register("dragonbone_spear_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.SPEAR));
    public static final RegistryObject<Item> ICE_DRAGONBONE_GLAIVE = IAF_COMPAT_ITEMS.register("dragonbone_glaive_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.GLAIVE));
    public static final RegistryObject<Item> ICE_DRAGONBONE_WARGLAIVE = IAF_COMPAT_ITEMS.register("dragonbone_warglaive_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.WARGLAIVE));
    public static final RegistryObject<Item> ICE_DRAGONBONE_CUTLASS = IAF_COMPAT_ITEMS.register("dragonbone_cutlass_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.CUTLASS));
    public static final RegistryObject<Item> ICE_DRAGONBONE_CLAYMORE = IAF_COMPAT_ITEMS.register("dragonbone_claymore_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.CLAYMORE));
    public static final RegistryObject<Item> ICE_DRAGONBONE_GREATHAMMER = IAF_COMPAT_ITEMS.register("dragonbone_greathammer_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.GREATHAMMER));
    public static final RegistryObject<Item> ICE_DRAGONBONE_GREATAXE = IAF_COMPAT_ITEMS.register("dragonbone_greataxe_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.GREATAXE));
    public static final RegistryObject<Item> ICE_DRAGONBONE_CHAKRAM = IAF_COMPAT_ITEMS.register("dragonbone_chakram_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.CHAKRAM));
    public static final RegistryObject<Item> ICE_DRAGONBONE_SCYTHE = IAF_COMPAT_ITEMS.register("dragonbone_scythe_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.SCYTHE));
    public static final RegistryObject<Item> ICE_DRAGONBONE_HALBERD = IAF_COMPAT_ITEMS.register("dragonbone_halberd_ice",
            () -> new SCSSIceDragonboneWeapon(WeaponType.HALBERD));
    public static final RegistryObject<Item> ICE_DRAGONBONE_GREAT_KATANA = IAF_COMPAT_ITEMS.register("dragonbone_great_katana_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.GREAT_KATANA));
    public static final RegistryObject<Item> ICE_DRAGONBONE_GRANDSWORD = IAF_COMPAT_ITEMS.register("dragonbone_grandsword_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.GRANDSWORD));
    public static final RegistryObject<Item> ICE_DRAGONBONE_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("dragonbone_backhand_blade_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.BACKHAND_BLADE));
    public static final RegistryObject<Item> ICE_DRAGONBONE_LANCE = IAF_COMPAT_ITEMS.register("dragonbone_lance_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.LANCE));
    public static final RegistryObject<Item> ICE_DRAGONBONE_KHOPESH = IAF_COMPAT_ITEMS.register("dragonbone_khopesh_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.KHOPESH));
    public static final RegistryObject<Item> ICE_DRAGONBONE_DAGGER = IAF_COMPAT_ITEMS.register("dragonbone_dagger_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.DAGGER));
    public static final RegistryObject<Item> ICE_DRAGONBONE_PERNACH = IAF_COMPAT_ITEMS.register("dragonbone_pernach_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.PERNACH));
    public static final RegistryObject<Item> ICE_DRAGONBONE_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("dragonbone_quarterstaff_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.QUARTERSTAFF));
    public static final RegistryObject<Item> ICE_DRAGONBONE_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("dragonbone_great_spear_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.GREAT_SPEAR));
    public static final RegistryObject<Item> ICE_DRAGONBONE_DEER_HORNS = IAF_COMPAT_ITEMS.register("dragonbone_deer_horns_ice",
            () -> new SCSMIceDragonboneWeapon(WeaponType.DEER_HORNS));

    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_LONGSWORD = IAF_COMPAT_ITEMS.register("dragonbone_longsword_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.LONGSWORD));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_TWINBLADE = IAF_COMPAT_ITEMS.register("dragonbone_twinblade_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.TWINBLADE));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_RAPIER = IAF_COMPAT_ITEMS.register("dragonbone_rapier_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.RAPIER));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_KATANA = IAF_COMPAT_ITEMS.register("dragonbone_katana_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.KATANA));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_SAI = IAF_COMPAT_ITEMS.register("dragonbone_sai_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.SAI));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_SPEAR = IAF_COMPAT_ITEMS.register("dragonbone_spear_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.SPEAR));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_GLAIVE = IAF_COMPAT_ITEMS.register("dragonbone_glaive_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.GLAIVE));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_WARGLAIVE = IAF_COMPAT_ITEMS.register("dragonbone_warglaive_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.WARGLAIVE));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_CUTLASS = IAF_COMPAT_ITEMS.register("dragonbone_cutlass_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.CUTLASS));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_CLAYMORE = IAF_COMPAT_ITEMS.register("dragonbone_claymore_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.CLAYMORE));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_GREATHAMMER = IAF_COMPAT_ITEMS.register("dragonbone_greathammer_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.GREATHAMMER));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_GREATAXE = IAF_COMPAT_ITEMS.register("dragonbone_greataxe_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.GREATAXE));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_CHAKRAM = IAF_COMPAT_ITEMS.register("dragonbone_chakram_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.CHAKRAM));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_SCYTHE = IAF_COMPAT_ITEMS.register("dragonbone_scythe_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.SCYTHE));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_HALBERD = IAF_COMPAT_ITEMS.register("dragonbone_halberd_lightning",
            () -> new SCSSLightningDragonboneWeapon(WeaponType.HALBERD));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_GREAT_KATANA = IAF_COMPAT_ITEMS.register("dragonbone_great_katana_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.GREAT_KATANA));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_GRANDSWORD = IAF_COMPAT_ITEMS.register("dragonbone_grandsword_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.GRANDSWORD));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("dragonbone_backhand_blade_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.BACKHAND_BLADE));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_LANCE = IAF_COMPAT_ITEMS.register("dragonbone_lance_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.LANCE));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_KHOPESH = IAF_COMPAT_ITEMS.register("dragonbone_khopesh_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.KHOPESH));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_DAGGER = IAF_COMPAT_ITEMS.register("dragonbone_dagger_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.DAGGER));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_PERNACH = IAF_COMPAT_ITEMS.register("dragonbone_pernach_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.PERNACH));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("dragonbone_quarterstaff_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.QUARTERSTAFF));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("dragonbone_great_spear_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.GREAT_SPEAR));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBONE_DEER_HORNS = IAF_COMPAT_ITEMS.register("dragonbone_deer_horns_lightning",
            () -> new SCSMLightningDragonboneWeapon(WeaponType.DEER_HORNS));

    public static final IceAndFireCompat INSTANCE = new IceAndFireCompat();

    protected IceAndFireCompat() {
        super("iceandfire", IAF_COMPAT_ITEMS);
    }
}
