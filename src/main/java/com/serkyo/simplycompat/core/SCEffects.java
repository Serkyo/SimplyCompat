package com.serkyo.simplycompat.core;

import com.serkyo.simplycompat.SimplyCompat;
import com.serkyo.simplycompat.effect.DraconicResonance;
import com.serkyo.simplycompat.effect.GlacialBrittle;
import com.serkyo.simplycompat.effect.ScorchingHeat;
import com.serkyo.simplycompat.effect.StaticDischarge;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SCEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SimplyCompat.MOD_ID);

    public static final RegistryObject<MobEffect> DRACONIC_RESONANCE = MOB_EFFECTS.register("draconic_resonance",
            () -> new DraconicResonance(MobEffectCategory.BENEFICIAL, 0));
    public static final RegistryObject<MobEffect> SCORCHING_HEAT = MOB_EFFECTS.register("scorching_heat",
            () -> new ScorchingHeat(MobEffectCategory.HARMFUL, 0));
//    public static final RegistryObject<MobEffect> GLACIAL_BRITTLE = MOB_EFFECTS.register("glacial_brittle",
//            () -> new GlacialBrittle(MobEffectCategory.HARMFUL, 0));
//    public static final RegistryObject<MobEffect> STATIC_DISCHARGE = MOB_EFFECTS.register("static_discharge",
//            () -> new StaticDischarge(MobEffectCategory.HARMFUL, 0));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
