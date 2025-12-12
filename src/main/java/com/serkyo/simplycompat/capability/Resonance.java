package com.serkyo.simplycompat.capability;

import net.minecraft.nbt.CompoundTag;

public class Resonance {
    private String element;

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void copyFrom(Resonance source) {
        element = source.getElement();
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putString("element", element);
    }

    public void loadNBTData(CompoundTag nbt) {
        element = nbt.getString("element");
    }
}
