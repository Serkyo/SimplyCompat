package com.serkyo.simplycompat.utils;

public class TextUtils {
    public static String formatEffectLevel(int amplifier) {
        int level = amplifier + 1;

        String[] romans = {
                "I","II","III","IV","V","VI","VII","VIII","IX","X"
        };

        if (level >= 1 && level <= 10) {
            return romans[level - 1];
        }

        return Integer.toString(level);
    }
}
