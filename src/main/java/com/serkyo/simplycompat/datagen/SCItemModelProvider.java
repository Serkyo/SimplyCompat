package com.serkyo.simplycompat.datagen;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.compat.IceAndFireCompat;
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
        handheldItem(IceAndFireCompat.COPPER_LONGSWORD);
        handheldItem(IceAndFireCompat.COPPER_TWINBLADE);
        handheldItem(IceAndFireCompat.COPPER_RAPIER);
        handheldItem(IceAndFireCompat.COPPER_KATANA);
        handheldItem(IceAndFireCompat.COPPER_SAI);
        handheldItem(IceAndFireCompat.COPPER_SPEAR);
        handheldItem(IceAndFireCompat.COPPER_GLAIVE);
        handheldItem(IceAndFireCompat.COPPER_WARGLAIVE);
        handheldItem(IceAndFireCompat.COPPER_CUTLASS);
        handheldItem(IceAndFireCompat.COPPER_CLAYMORE);
        handheldItem(IceAndFireCompat.COPPER_GREATHAMMER);
        handheldItem(IceAndFireCompat.COPPER_GREATAXE);
        handheldItem(IceAndFireCompat.COPPER_CHAKRAM);
        handheldItem(IceAndFireCompat.COPPER_SCYTHE);
        handheldItem(IceAndFireCompat.COPPER_HALBERD);
        handheldItem(IceAndFireCompat.COPPER_GREAT_KATANA);
        handheldItem(IceAndFireCompat.COPPER_GRANDSWORD);
        handheldItem(IceAndFireCompat.COPPER_BACKHAND_BLADE);
        handheldItem(IceAndFireCompat.COPPER_LANCE);
        handheldItem(IceAndFireCompat.COPPER_KHOPESH);
        handheldItem(IceAndFireCompat.COPPER_DAGGER);
        handheldItem(IceAndFireCompat.COPPER_PERNACH);
        handheldItem(IceAndFireCompat.COPPER_QUARTERSTAFF);
        handheldItem(IceAndFireCompat.COPPER_GREAT_SPEAR);
        handheldItem(IceAndFireCompat.COPPER_DEER_HORNS);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SimplyCompat.MOD_ID, "item/" + item.getId().getPath()));
    }
}
