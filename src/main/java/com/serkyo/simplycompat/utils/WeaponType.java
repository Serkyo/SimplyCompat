package com.serkyo.simplycompat.utils;

import net.minecraft.resources.ResourceLocation;

public enum WeaponType {
    LONGSWORD("longsword/", SimplyConfigValues.LONGSWORD_POSITIVE_MODIFIER, SimplyConfigValues.LONGSWORD_NEGATIVE_MODIFIER, SimplyConfigValues.LONGSWORD_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_longsword")),
    TWINBLADE("twinblade/", SimplyConfigValues.TWINBLADE_POSITIVE_MODIFIER, SimplyConfigValues.TWINBLADE_NEGATIVE_MODIFIER, SimplyConfigValues.TWINBLADE_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_twinblade")),
    RAPIER("rapier/", SimplyConfigValues.RAPIER_POSITIVE_MODIFIER, SimplyConfigValues.RAPIER_NEGATIVE_MODIFIER, SimplyConfigValues.RAPIER_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_longsword")),
    KATANA("katana/", SimplyConfigValues.KATANA_POSITIVE_MODIFIER, SimplyConfigValues.KATANA_NEGATIVE_MODIFIER, SimplyConfigValues.KATANA_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_katana")),
    SAI("sai/", SimplyConfigValues.SAI_POSITIVE_MODIFIER, SimplyConfigValues.SAI_NEGATIVE_MODIFIER, SimplyConfigValues.SAI_ATTACKSPEED, ResourceLocation.parse("item/handheld")),
    SPEAR("spear/", SimplyConfigValues.SPEAR_POSITIVE_MODIFIER, SimplyConfigValues.SPEAR_NEGATIVE_MODIFIER, SimplyConfigValues.SPEAR_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/big_handheld")),
    GLAIVE("glaive/", SimplyConfigValues.GLAIVE_POSITIVE_MODIFIER, SimplyConfigValues.GLAIVE_NEGATIVE_MODIFIER, SimplyConfigValues.GLAIVE_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/big_handheld")),
    WARGLAIVE("warglaive/", SimplyConfigValues.WARGLAIVE_POSITIVE_MODIFIER, SimplyConfigValues.WARGLAIVE_NEGATIVE_MODIFIER, SimplyConfigValues.WARGLAIVE_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_warglaive")),
    CUTLASS("cutlass/", SimplyConfigValues.CUTLASS_POSITIVE_MODIFIER, SimplyConfigValues.CUTLASS_NEGATIVE_MODIFIER, SimplyConfigValues.CUTLASS_ATTACKSPEED, ResourceLocation.parse("item/handheld")),
    CLAYMORE("claymore/", SimplyConfigValues.CLAYMORE_POSITIVE_MODIFIER, SimplyConfigValues.CLAYMORE_NEGATIVE_MODIFIER, SimplyConfigValues.CLAYMORE_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_claymore")),
    GREATHAMMER("greathammer/", SimplyConfigValues.GREATHAMMER_POSITIVE_MODIFIER, SimplyConfigValues.GREATHAMMER_NEGATIVE_MODIFIER, SimplyConfigValues.GREATHAMMER_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_reworked_greathammer")),
    GREATAXE("greataxe/", SimplyConfigValues.GREATAXE_POSITIVE_MODIFIER, SimplyConfigValues.GREATAXE_NEGATIVE_MODIFIER, SimplyConfigValues.GREATAXE_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/big_handheld")),
    CHAKRAM("chakram/", SimplyConfigValues.CHAKRAM_POSITIVE_MODIFIER, SimplyConfigValues.CHAKRAM_NEGATIVE_MODIFIER, SimplyConfigValues.CHAKRAM_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_chakram")),
    SCYTHE("scythe/", SimplyConfigValues.SCYTHE_POSITIVE_MODIFIER, SimplyConfigValues.SCYTHE_NEGATIVE_MODIFIER, SimplyConfigValues.SCYTHE_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/big_handheld")),
    HALBERD("halberd/", SimplyConfigValues.HALBERD_POSITIVE_MODIFIER, SimplyConfigValues.HALBERD_NEGATIVE_MODIFIER, SimplyConfigValues.HALBERD_ATTACKSPEED, ResourceLocation.fromNamespaceAndPath("simplyswords", "item/long_handheld")),
    GREAT_KATANA("great_katana/", 3, -SimplyConfigValues.attributesSimplyMore.getGreatKatanaDamageModifier(), SimplyConfigValues.attributesSimplyMore.getGreatKatanaSwingSpeed(), ResourceLocation.fromNamespaceAndPath("simplymore", "item/template/great_katana")),
    GRANDSWORD("grandsword/", 3, -SimplyConfigValues.attributesSimplyMore.getGrandswordDamageModifier(), SimplyConfigValues.attributesSimplyMore.getGrandswordSwingSpeed(), ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_claymore")),
    BACKHAND_BLADE("backhand_blade/", 3, -SimplyConfigValues.attributesSimplyMore.getBackhandBladeDamageModifier(), SimplyConfigValues.attributesSimplyMore.getBackhandBladeSwingSpeed(), ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_longdagger")),
    LANCE("lance/", 3, -SimplyConfigValues.attributesSimplyMore.getLanceDamageModifier(), SimplyConfigValues.attributesSimplyMore.getLanceSwingSpeed(), ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_claymore")),
    KHOPESH("khopesh/", 3, -SimplyConfigValues.attributesSimplyMore.getKhopeshDamageModifier(), SimplyConfigValues.attributesSimplyMore.getKhopeshSwingSpeed(), ResourceLocation.fromNamespaceAndPath("simplymore", "item/template/khopesh")),
    DAGGER("dagger/", 3, -SimplyConfigValues.attributesSimplyMore.getDaggerDamageModifier(), SimplyConfigValues.attributesSimplyMore.getDaggerSwingSpeed(), ResourceLocation.parse("item/handheld")),
    PERNACH("pernach/", 3, -SimplyConfigValues.attributesSimplyMore.getPernachDamageModifier(), SimplyConfigValues.attributesSimplyMore.getPernachSwingSpeed(), ResourceLocation.parse("item/handheld")),
    QUARTERSTAFF("quarterstaff/", 3, -SimplyConfigValues.attributesSimplyMore.getQuarterstaffDamageModifier(), SimplyConfigValues.attributesSimplyMore.getQuarterstaffSwingSpeed(), ResourceLocation.fromNamespaceAndPath("simplyswords", "item/template_twinblade")),
    GREAT_SPEAR("great_spear/", 3, -SimplyConfigValues.attributesSimplyMore.getGreatSpearDamageModifier(), SimplyConfigValues.attributesSimplyMore.getGreatSpearSwingSpeed(), ResourceLocation.fromNamespaceAndPath("simplyswords", "item/long_handheld")),
    DEER_HORNS("deer_horns/", 3, -SimplyConfigValues.attributesSimplyMore.getDeerHornsDamageModifier(), SimplyConfigValues.attributesSimplyMore.getDeerHornsSwingSpeed(), ResourceLocation.parse("item/handheld"));

    private final String ressourcePath;
    private final double positiveModifier;
    private final double negativeModifier;
    private final double attackSpeed;
    private final ResourceLocation parentModel;

    WeaponType(String ressourcePath, double positiveModifier, double negativeModifier, double attackSpeed, ResourceLocation parentModel) {
        this.ressourcePath = ressourcePath;
        this.positiveModifier = positiveModifier;
        this.negativeModifier = negativeModifier;
        this.attackSpeed = attackSpeed;
        this.parentModel = parentModel;
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

    public ResourceLocation getParentModel() {
        return parentModel;
    }
}
