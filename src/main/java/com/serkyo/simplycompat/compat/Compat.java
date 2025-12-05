package com.serkyo.simplycompat.compat;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;

public abstract class Compat {
    protected final String modId;
    protected final DeferredRegister<Item> COMPAT_ITEMS;

    protected Compat(String modId, DeferredRegister<Item> items) {
        this.modId = modId;
        this.COMPAT_ITEMS = items;
    }

    public boolean isPresent() {
        return ModList.get().isLoaded(modId);
    }

    public void register(IEventBus eventBus) {
        COMPAT_ITEMS.register(eventBus);
    }

    public void addToCreativeMenu(CreativeModeTab.Output output) {
        Collection<RegistryObject<Item>> iafWeapons = COMPAT_ITEMS.getEntries();

        for (RegistryObject<Item> weapon : iafWeapons) {
            output.accept(weapon.get());
        }
    }
}
