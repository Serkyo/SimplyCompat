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
                if (IceAndFireCompat.INSTANCE.isPresent()) {
                    IceAndFireCompat.INSTANCE.addToCreativeMenu(pOutput);
                }
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
