package com.serkyo.simplycompat.utils;

public enum WeaponType {
    LONGSWORD("longsword/"),
    TWINBLADE("twinblade/"),
    RAPIER("rapier/"),
    KATANA("katana/"),
    SAI("sai/"),
    SPEAR("spear/"),
    GLAIVE("glaive/"),
    WARGLAIVE("warglaive/"),
    CUTLASS("cutlass/"),
    CLAYMORE("claymore/"),
    GREATHAMMER("greathammer/"),
    GREATAXE("greataxe/"),
    CHAKRAM("chakram/"),
    SCYTHE("scythe/"),
    HALBERD("halberd/"),
    GREAT_KATANA("great_katana/"),
    GRANDSWORD("grandsword/"),
    BACKHAND_BLADE("backhand_blade/"),
    LANCE("lance/"),
    KHOPESH("khopesh/"),
    DAGGER("dagger/"),
    PERNACH("pernach/"),
    QUARTERSTAFF("quarterstaff/"),
    GREAT_SPEAR("great_spear/"),
    DEER_HORN("deer_horn/");

    private final String ressourcePath;

    WeaponType(String ressourcePath) {
        this.ressourcePath = ressourcePath;
    }

    public String getRessourcePath() {
        return ressourcePath;
    }
}
