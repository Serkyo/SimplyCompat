package com.serkyo.simplycompat.utils;

public enum WeaponType {
    LONGSWORD("longsword/", SimplyConfigValues.LONGSWORD_POSITIVE_MODIFIER, SimplyConfigValues.LONGSWORD_NEGATIVE_MODIFIER, SimplyConfigValues.LONGSWORD_ATTACKSPEED),
    TWINBLADE("twinblade/", SimplyConfigValues.TWINBLADE_POSITIVE_MODIFIER, SimplyConfigValues.TWINBLADE_NEGATIVE_MODIFIER, SimplyConfigValues.TWINBLADE_ATTACKSPEED),
    RAPIER("rapier/", SimplyConfigValues.RAPIER_POSITIVE_MODIFIER, SimplyConfigValues.RAPIER_NEGATIVE_MODIFIER, SimplyConfigValues.RAPIER_ATTACKSPEED),
    KATANA("katana/", SimplyConfigValues.KATANA_POSITIVE_MODIFIER, SimplyConfigValues.KATANA_NEGATIVE_MODIFIER, SimplyConfigValues.KATANA_ATTACKSPEED),
    SAI("sai/", SimplyConfigValues.SAI_POSITIVE_MODIFIER, SimplyConfigValues.SAI_NEGATIVE_MODIFIER, SimplyConfigValues.SAI_ATTACKSPEED),
    SPEAR("spear/", SimplyConfigValues.SPEAR_POSITIVE_MODIFIER, SimplyConfigValues.SPEAR_NEGATIVE_MODIFIER, SimplyConfigValues.SPEAR_ATTACKSPEED),
    GLAIVE("glaive/", SimplyConfigValues.GLAIVE_POSITIVE_MODIFIER, SimplyConfigValues.GLAIVE_NEGATIVE_MODIFIER, SimplyConfigValues.GLAIVE_ATTACKSPEED),
    WARGLAIVE("warglaive/", SimplyConfigValues.WARGLAIVE_POSITIVE_MODIFIER, SimplyConfigValues.WARGLAIVE_NEGATIVE_MODIFIER, SimplyConfigValues.WARGLAIVE_ATTACKSPEED),
    CUTLASS("cutlass/", SimplyConfigValues.CUTLASS_POSITIVE_MODIFIER, SimplyConfigValues.CUTLASS_NEGATIVE_MODIFIER, SimplyConfigValues.CUTLASS_ATTACKSPEED),
    CLAYMORE("claymore/", SimplyConfigValues.CLAYMORE_POSITIVE_MODIFIER, SimplyConfigValues.CLAYMORE_NEGATIVE_MODIFIER, SimplyConfigValues.CLAYMORE_ATTACKSPEED),
    GREATHAMMER("greathammer/", SimplyConfigValues.GREATHAMMER_POSITIVE_MODIFIER, SimplyConfigValues.GREATHAMMER_NEGATIVE_MODIFIER, SimplyConfigValues.GREATHAMMER_ATTACKSPEED),
    GREATAXE("greataxe/", SimplyConfigValues.GREATAXE_POSITIVE_MODIFIER, SimplyConfigValues.GREATAXE_NEGATIVE_MODIFIER, SimplyConfigValues.GREATAXE_ATTACKSPEED),
    CHAKRAM("chakram/", SimplyConfigValues.CHAKRAM_POSITIVE_MODIFIER, SimplyConfigValues.CHAKRAM_NEGATIVE_MODIFIER, SimplyConfigValues.CHAKRAM_ATTACKSPEED),
    SCYTHE("scythe/", SimplyConfigValues.SCYTHE_POSITIVE_MODIFIER, SimplyConfigValues.SCYTHE_NEGATIVE_MODIFIER, SimplyConfigValues.SCYTHE_ATTACKSPEED),
    HALBERD("halberd/", SimplyConfigValues.HALBERD_POSITIVE_MODIFIER, SimplyConfigValues.HALBERD_NEGATIVE_MODIFIER, SimplyConfigValues.HALBERD_ATTACKSPEED),
    GREAT_KATANA("great_katana/", 3, -SimplyConfigValues.attributesSimplyMore.getGreatKatanaDamageModifier(), SimplyConfigValues.attributesSimplyMore.getGreatKatanaSwingSpeed()),
    GRANDSWORD("grandsword/", 3, -SimplyConfigValues.attributesSimplyMore.getGrandswordDamageModifier(), SimplyConfigValues.attributesSimplyMore.getGrandswordSwingSpeed()),
    BACKHAND_BLADE("backhand_blade/", 3, -SimplyConfigValues.attributesSimplyMore.getBackhandBladeDamageModifier(), SimplyConfigValues.attributesSimplyMore.getBackhandBladeSwingSpeed()),
    LANCE("lance/", 3, -SimplyConfigValues.attributesSimplyMore.getLanceDamageModifier(), SimplyConfigValues.attributesSimplyMore.getLanceSwingSpeed()),
    KHOPESH("khopesh/", 3, -SimplyConfigValues.attributesSimplyMore.getKhopeshDamageModifier(), SimplyConfigValues.attributesSimplyMore.getKhopeshSwingSpeed()),
    DAGGER("dagger/", 3, -SimplyConfigValues.attributesSimplyMore.getDaggerDamageModifier(), SimplyConfigValues.attributesSimplyMore.getDaggerSwingSpeed()),
    PERNACH("pernach/", 3, -SimplyConfigValues.attributesSimplyMore.getPernachDamageModifier(), SimplyConfigValues.attributesSimplyMore.getPernachSwingSpeed()),
    QUARTERSTAFF("quarterstaff/", 3, -SimplyConfigValues.attributesSimplyMore.getQuarterstaffDamageModifier(), SimplyConfigValues.attributesSimplyMore.getQuarterstaffSwingSpeed()),
    GREAT_SPEAR("great_spear/", 3, -SimplyConfigValues.attributesSimplyMore.getGreatSpearDamageModifier(), SimplyConfigValues.attributesSimplyMore.getGreatSpearSwingSpeed()),
    DEER_HORNS("deer_horn/", 3, -SimplyConfigValues.attributesSimplyMore.getDeerHornsDamageModifier(), SimplyConfigValues.attributesSimplyMore.getDeerHornsSwingSpeed());

    private final String ressourcePath;
    private final double positiveModifier;
    private final double negativeModifier;
    private final double attackSpeed;

    WeaponType(String ressourcePath, double positiveModifier, double negativeModifier, double attackSpeed) {
        this.ressourcePath = ressourcePath;
        this.positiveModifier = positiveModifier;
        this.negativeModifier = negativeModifier;
        this.attackSpeed = attackSpeed;
    }

    public String getRessourcePath() {
        return ressourcePath;
    }

    public double getPositiveModifier() {
        return positiveModifier;
    }

    public double getNegativeModifier() {
        return negativeModifier;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
