package com.serkyo.simplycompat.core;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.compat.IceAndFireCompat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SCCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimplyCompat.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SIMPLY_COMPAT_TAB = CREATIVE_MODE_TABS.register("simplycompat_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ForgeRegistries.ITEMS.getValue(ResourceLocation.fromNamespaceAndPath("simplyswords", "empowered_remnant"))))
            .title(Component.translatable("creativetab.simplycompat_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(IceAndFireCompat.COPPER_LONGSWORD.get());
                pOutput.accept(IceAndFireCompat.COPPER_TWINBLADE.get());
                pOutput.accept(IceAndFireCompat.COPPER_RAPIER.get());
                pOutput.accept(IceAndFireCompat.COPPER_KATANA.get());
                pOutput.accept(IceAndFireCompat.COPPER_SAI.get());
                pOutput.accept(IceAndFireCompat.COPPER_SPEAR.get());
                pOutput.accept(IceAndFireCompat.COPPER_GLAIVE.get());
                pOutput.accept(IceAndFireCompat.COPPER_WARGLAIVE.get());
                pOutput.accept(IceAndFireCompat.COPPER_CUTLASS.get());
                pOutput.accept(IceAndFireCompat.COPPER_CLAYMORE.get());
                pOutput.accept(IceAndFireCompat.COPPER_GREATHAMMER.get());
                pOutput.accept(IceAndFireCompat.COPPER_GREATAXE.get());
                pOutput.accept(IceAndFireCompat.COPPER_CHAKRAM.get());
                pOutput.accept(IceAndFireCompat.COPPER_SCYTHE.get());
                pOutput.accept(IceAndFireCompat.COPPER_HALBERD.get());
                pOutput.accept(IceAndFireCompat.COPPER_GREAT_KATANA.get());
                pOutput.accept(IceAndFireCompat.COPPER_GRANDSWORD.get());
                pOutput.accept(IceAndFireCompat.COPPER_BACKHAND_BLADE.get());
                pOutput.accept(IceAndFireCompat.COPPER_LANCE.get());
                pOutput.accept(IceAndFireCompat.COPPER_KHOPESH.get());
                pOutput.accept(IceAndFireCompat.COPPER_DAGGER.get());
                pOutput.accept(IceAndFireCompat.COPPER_PERNACH.get());
                pOutput.accept(IceAndFireCompat.COPPER_QUARTERSTAFF.get());
                pOutput.accept(IceAndFireCompat.COPPER_GREAT_SPEAR.get());
                pOutput.accept(IceAndFireCompat.COPPER_DEER_HORNS.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
