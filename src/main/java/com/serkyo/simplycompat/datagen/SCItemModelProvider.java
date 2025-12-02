package com.serkyo.simplycompat.datagen;

import com.serkyo.simplycompat.SimplyCompat;
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

    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SimplyCompat.MOD_ID, "item/" + item.getId().getPath()));
    }
}
