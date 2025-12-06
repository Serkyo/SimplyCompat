package com.serkyo.simplycompat.datagen;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.compat.IceAndFireCompat;
import com.serkyo.simplycompat.core.SCItems;
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
        handheldSimplyWeapon(IceAndFireCompat.COPPER_DEER_HORNS, WeaponType.DEER_HORNS);

        handheldSimplyWeapon(IceAndFireCompat.SILVER_LONGSWORD, WeaponType.LONGSWORD);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_TWINBLADE, WeaponType.TWINBLADE);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_RAPIER, WeaponType.RAPIER);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_KATANA, WeaponType.KATANA);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_SAI, WeaponType.SAI);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_SPEAR, WeaponType.SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_GLAIVE, WeaponType.GLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_WARGLAIVE, WeaponType.WARGLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_CUTLASS, WeaponType.CUTLASS);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_CLAYMORE, WeaponType.CLAYMORE);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_GREATHAMMER, WeaponType.GREATHAMMER);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_GREATAXE, WeaponType.GREATAXE);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_CHAKRAM, WeaponType.CHAKRAM);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_SCYTHE, WeaponType.SCYTHE);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_HALBERD, WeaponType.HALBERD);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_GREAT_KATANA, WeaponType.GREAT_KATANA);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_GRANDSWORD, WeaponType.GRANDSWORD);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_BACKHAND_BLADE, WeaponType.BACKHAND_BLADE);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_LANCE, WeaponType.LANCE);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_KHOPESH, WeaponType.KHOPESH);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_DAGGER, WeaponType.DAGGER);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_PERNACH, WeaponType.PERNACH);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_QUARTERSTAFF, WeaponType.QUARTERSTAFF);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_GREAT_SPEAR, WeaponType.GREAT_SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.SILVER_DEER_HORNS, WeaponType.DEER_HORNS);

        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_LONGSWORD, WeaponType.LONGSWORD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_TWINBLADE, WeaponType.TWINBLADE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_RAPIER, WeaponType.RAPIER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_KATANA, WeaponType.KATANA);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_SAI, WeaponType.SAI);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_SPEAR, WeaponType.SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GLAIVE, WeaponType.GLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_WARGLAIVE, WeaponType.WARGLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_CUTLASS, WeaponType.CUTLASS);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_CLAYMORE, WeaponType.CLAYMORE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GREATHAMMER, WeaponType.GREATHAMMER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GREATAXE, WeaponType.GREATAXE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_CHAKRAM, WeaponType.CHAKRAM);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_SCYTHE, WeaponType.SCYTHE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_HALBERD, WeaponType.HALBERD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GREAT_KATANA, WeaponType.GREAT_KATANA);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GRANDSWORD, WeaponType.GRANDSWORD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_BACKHAND_BLADE, WeaponType.BACKHAND_BLADE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_LANCE, WeaponType.LANCE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_KHOPESH, WeaponType.KHOPESH);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_DAGGER, WeaponType.DAGGER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_PERNACH, WeaponType.PERNACH);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_QUARTERSTAFF, WeaponType.QUARTERSTAFF);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GREAT_SPEAR, WeaponType.GREAT_SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_DEER_HORNS, WeaponType.DEER_HORNS);

        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_LONGSWORD_VENOM, WeaponType.LONGSWORD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_TWINBLADE_VENOM, WeaponType.TWINBLADE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_RAPIER_VENOM, WeaponType.RAPIER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_KATANA_VENOM, WeaponType.KATANA);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_SAI_VENOM, WeaponType.SAI);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_SPEAR_VENOM, WeaponType.SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GLAIVE_VENOM, WeaponType.GLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_WARGLAIVE_VENOM, WeaponType.WARGLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_CUTLASS_VENOM, WeaponType.CUTLASS);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_CLAYMORE_VENOM, WeaponType.CLAYMORE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GREATHAMMER_VENOM, WeaponType.GREATHAMMER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GREATAXE_VENOM, WeaponType.GREATAXE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_CHAKRAM_VENOM, WeaponType.CHAKRAM);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_SCYTHE_VENOM, WeaponType.SCYTHE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_HALBERD_VENOM, WeaponType.HALBERD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GREAT_KATANA_VENOM, WeaponType.GREAT_KATANA);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GRANDSWORD_VENOM, WeaponType.GRANDSWORD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_BACKHAND_BLADE_VENOM, WeaponType.BACKHAND_BLADE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_LANCE_VENOM, WeaponType.LANCE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_KHOPESH_VENOM, WeaponType.KHOPESH);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_DAGGER_VENOM, WeaponType.DAGGER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_PERNACH_VENOM, WeaponType.PERNACH);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_QUARTERSTAFF_VENOM, WeaponType.QUARTERSTAFF);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_GREAT_SPEAR_VENOM, WeaponType.GREAT_SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_DESERT_DEER_HORNS_VENOM, WeaponType.DEER_HORNS);

        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_LONGSWORD, WeaponType.LONGSWORD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_TWINBLADE, WeaponType.TWINBLADE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_RAPIER, WeaponType.RAPIER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_KATANA, WeaponType.KATANA);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_SAI, WeaponType.SAI);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_SPEAR, WeaponType.SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GLAIVE, WeaponType.GLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_WARGLAIVE, WeaponType.WARGLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_CUTLASS, WeaponType.CUTLASS);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_CLAYMORE, WeaponType.CLAYMORE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GREATHAMMER, WeaponType.GREATHAMMER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GREATAXE, WeaponType.GREATAXE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_CHAKRAM, WeaponType.CHAKRAM);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_SCYTHE, WeaponType.SCYTHE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_HALBERD, WeaponType.HALBERD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GREAT_KATANA, WeaponType.GREAT_KATANA);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GRANDSWORD, WeaponType.GRANDSWORD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_BACKHAND_BLADE, WeaponType.BACKHAND_BLADE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_LANCE, WeaponType.LANCE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_KHOPESH, WeaponType.KHOPESH);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_DAGGER, WeaponType.DAGGER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_PERNACH, WeaponType.PERNACH);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_QUARTERSTAFF, WeaponType.QUARTERSTAFF);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GREAT_SPEAR, WeaponType.GREAT_SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_DEER_HORNS, WeaponType.DEER_HORNS);

        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_LONGSWORD_VENOM, WeaponType.LONGSWORD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_TWINBLADE_VENOM, WeaponType.TWINBLADE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_RAPIER_VENOM, WeaponType.RAPIER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_KATANA_VENOM, WeaponType.KATANA);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_SAI_VENOM, WeaponType.SAI);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_SPEAR_VENOM, WeaponType.SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GLAIVE_VENOM, WeaponType.GLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_WARGLAIVE_VENOM, WeaponType.WARGLAIVE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_CUTLASS_VENOM, WeaponType.CUTLASS);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_CLAYMORE_VENOM, WeaponType.CLAYMORE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GREATHAMMER_VENOM, WeaponType.GREATHAMMER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GREATAXE_VENOM, WeaponType.GREATAXE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_CHAKRAM_VENOM, WeaponType.CHAKRAM);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_SCYTHE_VENOM, WeaponType.SCYTHE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_HALBERD_VENOM, WeaponType.HALBERD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GREAT_KATANA_VENOM, WeaponType.GREAT_KATANA);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GRANDSWORD_VENOM, WeaponType.GRANDSWORD);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_BACKHAND_BLADE_VENOM, WeaponType.BACKHAND_BLADE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_LANCE_VENOM, WeaponType.LANCE);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_KHOPESH_VENOM, WeaponType.KHOPESH);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_DAGGER_VENOM, WeaponType.DAGGER);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_PERNACH_VENOM, WeaponType.PERNACH);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_QUARTERSTAFF_VENOM, WeaponType.QUARTERSTAFF);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_GREAT_SPEAR_VENOM, WeaponType.GREAT_SPEAR);
        handheldSimplyWeapon(IceAndFireCompat.MYRMEX_JUNGLE_DEER_HORNS_VENOM, WeaponType.DEER_HORNS);
    }

    private ItemModelBuilder handheldSimplyWeapon(RegistryObject<Item> item, WeaponType weaponType) {
        return withExistingParent(item.getId().getPath(),
                weaponType.getParentModel()).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SimplyCompat.MOD_ID, "item/" + weaponType.getRessourcePath() + item.getId().getPath()));
    }
}
