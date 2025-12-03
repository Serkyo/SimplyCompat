package com.serkyo.simplycompat.compat;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.utils.CustomTiers;
import com.serkyo.simplycompat.utils.WeaponRegistrationUtils;
import com.serkyo.simplycompat.utils.WeaponType;
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
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.LONGSWORD),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.LONGSWORD), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_TWINBLADE = IAF_COMPAT_ITEMS.register("copper_twinblade",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.TWINBLADE),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.TWINBLADE), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_RAPIER = IAF_COMPAT_ITEMS.register("copper_rapier",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.RAPIER),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.RAPIER), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_KATANA = IAF_COMPAT_ITEMS.register("copper_katana",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.KATANA),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.KATANA), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_SAI = IAF_COMPAT_ITEMS.register("copper_sai",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.SAI),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.SAI), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_SPEAR = IAF_COMPAT_ITEMS.register("copper_spear",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.SPEAR),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.SPEAR), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GLAIVE = IAF_COMPAT_ITEMS.register("copper_glaive",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.GLAIVE),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.GLAIVE), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_WARGLAIVE = IAF_COMPAT_ITEMS.register("copper_warglaive",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.WARGLAIVE),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.WARGLAIVE), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_CUTLASS = IAF_COMPAT_ITEMS.register("copper_cutlass",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.CUTLASS),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.CUTLASS), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_CLAYMORE = IAF_COMPAT_ITEMS.register("copper_claymore",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.CLAYMORE),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.CLAYMORE), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GREATHAMMER = IAF_COMPAT_ITEMS.register("copper_greathammer",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.GREATHAMMER),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.GREATHAMMER), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GREATAXE = IAF_COMPAT_ITEMS.register("copper_greataxe",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.GREATAXE),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.GREATAXE), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_CHAKRAM = IAF_COMPAT_ITEMS.register("copper_chakram",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.CHAKRAM),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.CHAKRAM), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_SCYTHE = IAF_COMPAT_ITEMS.register("copper_scythe",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.SCYTHE),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.SCYTHE), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_HALBERD = IAF_COMPAT_ITEMS.register("copper_halberd",
            () -> new SimplySwordsSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.HALBERD),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.HALBERD), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GREAT_KATANA = IAF_COMPAT_ITEMS.register("copper_great_katana",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.GREAT_KATANA),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.GREAT_KATANA),
                    new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GRANDSWORD = IAF_COMPAT_ITEMS.register("copper_grandsword",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.GRANDSWORD),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.GRANDSWORD),
                    new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_BACKHAND_BLADE = IAF_COMPAT_ITEMS.register("copper_backhand_blade",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.BACKHAND_BLADE),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.BACKHAND_BLADE),
                    new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_LANCE = IAF_COMPAT_ITEMS.register("copper_lance",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.LANCE),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.LANCE),
                    new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_KHOPESH = IAF_COMPAT_ITEMS.register("copper_khopesh",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.KHOPESH),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.KHOPESH),
                    new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_DAGGER = IAF_COMPAT_ITEMS.register("copper_dagger",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.DAGGER),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.DAGGER),
                    new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_PERNACH = IAF_COMPAT_ITEMS.register("copper_pernach",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.PERNACH),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.PERNACH),
                    new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_QUARTERSTAFF = IAF_COMPAT_ITEMS.register("copper_quarterstaff",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.QUARTERSTAFF),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.QUARTERSTAFF),
                    new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_GREAT_SPEAR = IAF_COMPAT_ITEMS.register("copper_great_spear",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.GREAT_SPEAR),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.GREAT_SPEAR),
                    new Item.Properties(), "minecraft:copper_ingot"));

    public static final RegistryObject<Item> COPPER_DEER_HORNS = IAF_COMPAT_ITEMS.register("copper_deer_horns",
            () -> new SimplyMoreSwordItem(CustomTiers.COPPER,
                    WeaponRegistrationUtils.getSimplyWeaponDamage(SCBakedConfigs.COPPER_DAMAGE_MODIFIER, WeaponType.DEER_HORNS),
                    WeaponRegistrationUtils.getSimplyWeaponSpeed(WeaponType.DEER_HORNS),
                    new Item.Properties(), "minecraft:copper_ingot"));


    public static boolean isPresent() {
        return ModList.get().isLoaded("iceandfire");
    }
}
