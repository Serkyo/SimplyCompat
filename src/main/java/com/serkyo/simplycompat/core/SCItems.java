package com.serkyo.simplycompat.core;

import com.serkyo.simplycompat.compat.IceAndFireCompat;
import net.minecraftforge.eventbus.api.IEventBus;

public class SCItems {
    public static void register(IEventBus eventBus) {
        if (IceAndFireCompat.isPresent()) {
            IceAndFireCompat.register(eventBus);
        }
    }
}
