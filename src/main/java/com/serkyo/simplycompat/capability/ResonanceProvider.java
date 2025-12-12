package com.serkyo.simplycompat.capability;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ResonanceProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    public static Capability<Resonance> RESONANCE = CapabilityManager.get(new CapabilityToken<Resonance>() { });

    private Resonance resonance = null;
    private final LazyOptional<Resonance> optional = LazyOptional.of(this::createResonance);

    private Resonance createResonance() {
        if (resonance == null) {
            resonance = new Resonance();
        }
        return resonance;
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == RESONANCE) {
            return optional.cast();
        }
        return LazyOptional.empty();
    }



    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        createResonance().saveNBTData(nbt);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        createResonance().loadNBTData(nbt);
    }
}
