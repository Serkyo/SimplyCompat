package com.serkyo.simplycompat.compat;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.item.SCSMSilverWeapon;
import com.serkyo.simplycompat.item.SCSSSilverWeapon;
import com.serkyo.simplycompat.item.SCSimplyMore;
import com.serkyo.simplycompat.item.SCSimplySword;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IceAndFireCompat {
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
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.GREAT_KATANA, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_GRANDSWORD = IAF_COMPAT_ITEMS.register("copper_grandsword",
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.GRANDSWORD, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("copper_backhand_blade",
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.BACKHAND_BLADE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_LANCE = IAF_COMPAT_ITEMS.register("copper_lance",
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.LANCE, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_KHOPESH = IAF_COMPAT_ITEMS.register("copper_khopesh",
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.KHOPESH, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_DAGGER = IAF_COMPAT_ITEMS.register("copper_dagger",
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.DAGGER, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_PERNACH = IAF_COMPAT_ITEMS.register("copper_pernach",
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.PERNACH, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("copper_quarterstaff",
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.QUARTERSTAFF, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("copper_great_spear",
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.GREAT_SPEAR, "minecraft:copper_ingot"));
    public static final RegistryObject<Item> COPPER_DEER_HORNS = IAF_COMPAT_ITEMS.register("copper_deer_horns",
            () -> new SCSimplyMore(CustomTiers.COPPER, new Item.Properties(), WeaponType.DEER_HORNS, "minecraft:copper_ingot"));

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
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.GREAT_KATANA));
    public static final RegistryObject<Item> SILVER_GRANDSWORD = IAF_COMPAT_ITEMS.register("silver_grandsword",
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.GRANDSWORD));
    public static final RegistryObject<Item> SILVER_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("silver_backhand_blade",
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.BACKHAND_BLADE));
    public static final RegistryObject<Item> SILVER_LANCE = IAF_COMPAT_ITEMS.register("silver_lance",
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.LANCE));
    public static final RegistryObject<Item> SILVER_KHOPESH = IAF_COMPAT_ITEMS.register("silver_khopesh",
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.KHOPESH));
    public static final RegistryObject<Item> SILVER_DAGGER = IAF_COMPAT_ITEMS.register("silver_dagger",
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.DAGGER));
    public static final RegistryObject<Item> SILVER_PERNACH = IAF_COMPAT_ITEMS.register("silver_pernach",
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.PERNACH));
    public static final RegistryObject<Item> SILVER_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("silver_quarterstaff",
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.QUARTERSTAFF));
    public static final RegistryObject<Item> SILVER_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("silver_great_spear",
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.GREAT_SPEAR));
    public static final RegistryObject<Item> SILVER_DEER_HORNS = IAF_COMPAT_ITEMS.register("silver_deer_horns",
            () -> new SCSMSilverWeapon(new Item.Properties(), WeaponType.DEER_HORNS));

    public static boolean isPresent() {
        return ModList.get().isLoaded("iceandfire");
    }

    public static void register(IEventBus eventBus) {
        IAF_COMPAT_ITEMS.register(eventBus);
    }

    public static void addToCreativeMenu(CreativeModeTab.Output output) {
        output.accept(IceAndFireCompat.COPPER_LONGSWORD.get());
        output.accept(IceAndFireCompat.COPPER_TWINBLADE.get());
        output.accept(IceAndFireCompat.COPPER_RAPIER.get());
        output.accept(IceAndFireCompat.COPPER_KATANA.get());
        output.accept(IceAndFireCompat.COPPER_SAI.get());
        output.accept(IceAndFireCompat.COPPER_SPEAR.get());
        output.accept(IceAndFireCompat.COPPER_GLAIVE.get());
        output.accept(IceAndFireCompat.COPPER_WARGLAIVE.get());
        output.accept(IceAndFireCompat.COPPER_CUTLASS.get());
        output.accept(IceAndFireCompat.COPPER_CLAYMORE.get());
        output.accept(IceAndFireCompat.COPPER_GREATHAMMER.get());
        output.accept(IceAndFireCompat.COPPER_GREATAXE.get());
        output.accept(IceAndFireCompat.COPPER_CHAKRAM.get());
        output.accept(IceAndFireCompat.COPPER_SCYTHE.get());
        output.accept(IceAndFireCompat.COPPER_HALBERD.get());
        output.accept(IceAndFireCompat.COPPER_GREAT_KATANA.get());
        output.accept(IceAndFireCompat.COPPER_GRANDSWORD.get());
        output.accept(IceAndFireCompat.COPPER_BACKHAND_BLADE.get());
        output.accept(IceAndFireCompat.COPPER_LANCE.get());
        output.accept(IceAndFireCompat.COPPER_KHOPESH.get());
        output.accept(IceAndFireCompat.COPPER_DAGGER.get());
        output.accept(IceAndFireCompat.COPPER_PERNACH.get());
        output.accept(IceAndFireCompat.COPPER_QUARTERSTAFF.get());
        output.accept(IceAndFireCompat.COPPER_GREAT_SPEAR.get());
        output.accept(IceAndFireCompat.COPPER_DEER_HORNS.get());

        output.accept(IceAndFireCompat.SILVER_LONGSWORD.get());
        output.accept(IceAndFireCompat.SILVER_TWINBLADE.get());
        output.accept(IceAndFireCompat.SILVER_RAPIER.get());
        output.accept(IceAndFireCompat.SILVER_KATANA.get());
        output.accept(IceAndFireCompat.SILVER_SAI.get());
        output.accept(IceAndFireCompat.SILVER_SPEAR.get());
        output.accept(IceAndFireCompat.SILVER_GLAIVE.get());
        output.accept(IceAndFireCompat.SILVER_WARGLAIVE.get());
        output.accept(IceAndFireCompat.SILVER_CUTLASS.get());
        output.accept(IceAndFireCompat.SILVER_CLAYMORE.get());
        output.accept(IceAndFireCompat.SILVER_GREATHAMMER.get());
        output.accept(IceAndFireCompat.SILVER_GREATAXE.get());
        output.accept(IceAndFireCompat.SILVER_CHAKRAM.get());
        output.accept(IceAndFireCompat.SILVER_SCYTHE.get());
        output.accept(IceAndFireCompat.SILVER_HALBERD.get());
        output.accept(IceAndFireCompat.SILVER_GREAT_KATANA.get());
        output.accept(IceAndFireCompat.SILVER_GRANDSWORD.get());
        output.accept(IceAndFireCompat.SILVER_BACKHAND_BLADE.get());
        output.accept(IceAndFireCompat.SILVER_LANCE.get());
        output.accept(IceAndFireCompat.SILVER_KHOPESH.get());
        output.accept(IceAndFireCompat.SILVER_DAGGER.get());
        output.accept(IceAndFireCompat.SILVER_PERNACH.get());
        output.accept(IceAndFireCompat.SILVER_QUARTERSTAFF.get());
        output.accept(IceAndFireCompat.SILVER_GREAT_SPEAR.get());
        output.accept(IceAndFireCompat.SILVER_DEER_HORNS.get());
    }
}
