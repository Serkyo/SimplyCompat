package com.serkyo.simplycompat;

import com.mojang.logging.LogUtils;
import com.serkyo.simplycompat.config.SCBakedConfigs;
import com.serkyo.simplycompat.config.SCCommonConfigs;
import com.serkyo.simplycompat.core.SCCreativeTab;
import com.serkyo.simplycompat.core.SCItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SimplyCompat.MOD_ID)
public class SimplyCompat
{
    public static final String MOD_ID = "simplycompat";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SimplyCompat(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        SCItems.register(modEventBus);
        SCCreativeTab.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::onModConfigLoad);

        context.registerConfig(ModConfig.Type.COMMON, SCCommonConfigs.SPEC, "simplycompat-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void onModConfigLoad(ModConfigEvent.Loading event) {
        ModConfig config = event.getConfig();
        if (config.getSpec() == SCCommonConfigs.SPEC) {
            SCBakedConfigs.bakeCommon();
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
