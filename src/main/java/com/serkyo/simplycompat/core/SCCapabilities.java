package com.serkyo.simplycompat.core;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.capability.ResonanceProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SimplyCompat.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SCCapabilities {
    public static final ResourceLocation RESONANCE = ResourceLocation.fromNamespaceAndPath(SimplyCompat.MOD_ID, "resonance");

    @SubscribeEvent
    public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof Player) {
            if (!event.getObject().getCapability(ResonanceProvider.RESONANCE).isPresent()) {
                event.addCapability(RESONANCE, new ResonanceProvider());
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerCloned(PlayerEvent.Clone event) {
        if (event.isWasDeath()) {
            event.getEntity().reviveCaps();

            event.getOriginal().getCapability(ResonanceProvider.RESONANCE).ifPresent(oldStore -> {
                event.getEntity().getCapability(ResonanceProvider.RESONANCE).ifPresent(newStore -> {
                    newStore.copyFrom(oldStore);
                });
            });

            event.getOriginal().invalidateCaps();
        }
    }

    @SubscribeEvent
    public static void onRegisterCapability(RegisterCapabilitiesEvent event) {
        event.register(ResonanceProvider.class);
    }
}
