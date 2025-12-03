package com.serkyo.simplycompat.datagen;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.compat.IceAndFireCompat;
import com.serkyo.simplycompat.utils.WeaponType;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class SCItemModelProvider extends ItemModelProvider {
    public SCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SimplyCompat.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldSimplyWeapon(IceAndFireCompat.COPPER_LONGSWORD, WeaponType.LONGSWORD);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_TWINBLADE, WeaponType.TWINBLADE);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_RAPIER, WeaponType.RAPIER);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_KATANA, WeaponType.KATANA);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_SAI, WeaponType.SAI);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_SPEAR, WeaponType.SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_GLAIVE, WeaponType.GLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_WARGLAIVE, WeaponType.WARGLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_CUTLASS, WeaponType.CUTLASS);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_CLAYMORE, WeaponType.CLAYMORE);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_GREATHAMMER, WeaponType.GREATHAMMER);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_GREATAXE, WeaponType.GREATAXE);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_CHAKRAM, WeaponType.CHAKRAM);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_SCYTHE, WeaponType.SCYTHE);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_HALBERD, WeaponType.HALBERD);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_GREAT_KATANA, WeaponType.GREAT_KATANA);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_GRANDSWORD, WeaponType.GRANDSWORD);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_BACKHAND_BLADE, WeaponType.BACKHAND_BLADE);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_LANCE, WeaponType.LANCE);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_KHOPESH, WeaponType.KHOPESH);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_DAGGER, WeaponType.DAGGER);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_PERNACH, WeaponType.PERNACH);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_QUARTERSTAFF, WeaponType.QUARTERSTAFF);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_GREAT_SPEAR, WeaponType.GREAT_SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.COPPER_DEER_HORNS, WeaponType.DEER_HORN);
    }

    private ItemModelBuilder handheldSimplyWeapon(RegistryObject<Item> item, WeaponType weaponType) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SimplyCompat.MOD_ID, "item/" + weaponType.getRessourcePath() + item.getId().getPath()));
    }
}
