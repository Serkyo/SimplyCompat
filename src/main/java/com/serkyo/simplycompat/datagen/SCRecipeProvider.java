package com.serkyo.simplycompat.datagen;

import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.serkyo.simplycompat.compat.IceAndFireCompat;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class SCRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public SCRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        nineBlockStorageRecipesWithCustomPacking(consumer, RecipeCategory.MISC, IafItemRegistry.COPPER_NUGGET.get(), RecipeCategory.MISC, Items.COPPER_INGOT, "copper_ingot_from_nugget", "copper_ingot");

        longswordRecipe(consumer, IceAndFireCompat.COPPER_LONGSWORD.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        twinbladeRecipe(consumer, IceAndFireCompat.COPPER_TWINBLADE.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        rapierRecipe(consumer, IceAndFireCompat.COPPER_RAPIER.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        katanaRecipe(consumer, IceAndFireCompat.COPPER_KATANA.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        saiRecipe(consumer, IceAndFireCompat.COPPER_SAI.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        spearRecipe(consumer, IceAndFireCompat.COPPER_SPEAR.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        glaiveRecipe(consumer, IceAndFireCompat.COPPER_GLAIVE.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        warglaiveRecipe(consumer, IceAndFireCompat.COPPER_WARGLAIVE.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        cutlassRecipe(consumer, IceAndFireCompat.COPPER_CUTLASS.get(), Items.COPPER_INGOT, Items.STICK,  IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        claymoreRecipe(consumer, IceAndFireCompat.COPPER_CLAYMORE.get(), Items.COPPER_INGOT, Items.STICK,  IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        greathammerRecipe(consumer, IceAndFireCompat.COPPER_GREATHAMMER.get(), Items.COPPER_INGOT, Items.STICK,  IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        greataxeRecipe(consumer, IceAndFireCompat.COPPER_GREATAXE.get(), Items.COPPER_INGOT, Items.STICK,  IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        chakramRecipe(consumer, IceAndFireCompat.COPPER_CHAKRAM.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        scytheRecipe(consumer, IceAndFireCompat.COPPER_SCYTHE.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        halberdRecipe(consumer, IceAndFireCompat.COPPER_HALBERD.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        greatKatanaRecipe(consumer, IceAndFireCompat.COPPER_GREAT_KATANA.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        grandswordRecipe(consumer, IceAndFireCompat.COPPER_GRANDSWORD.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), IafItemRegistry.COPPER_SWORD.get(), "has_copper_ingot");
        backhandBladeRecipe(consumer, IceAndFireCompat.COPPER_BACKHAND_BLADE.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        lanceRecipe(consumer, IceAndFireCompat.COPPER_LANCE.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        khopeshRecipe(consumer, IceAndFireCompat.COPPER_KHOPESH.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        daggerRecipe(consumer, IceAndFireCompat.COPPER_DAGGER.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        pernachRecipe(consumer, IceAndFireCompat.COPPER_PERNACH.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");
        quarterstaffRecipe(consumer, IceAndFireCompat.COPPER_QUARTERSTAFF.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        greatSpearRecipe(consumer, IceAndFireCompat.COPPER_GREAT_SPEAR.get(), Items.COPPER_INGOT, Items.STICK, "has_copper_ingot");
        deerHornsRecipe(consumer, IceAndFireCompat.COPPER_DEER_HORNS.get(), Items.COPPER_INGOT, Items.STICK, IafItemRegistry.COPPER_NUGGET.get(), "has_copper_ingot");

        longswordRecipe(consumer, IceAndFireCompat.SILVER_LONGSWORD.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        twinbladeRecipe(consumer, IceAndFireCompat.SILVER_TWINBLADE.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        rapierRecipe(consumer, IceAndFireCompat.SILVER_RAPIER.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        katanaRecipe(consumer, IceAndFireCompat.SILVER_KATANA.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        saiRecipe(consumer, IceAndFireCompat.SILVER_SAI.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        spearRecipe(consumer, IceAndFireCompat.SILVER_SPEAR.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        glaiveRecipe(consumer, IceAndFireCompat.SILVER_GLAIVE.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        warglaiveRecipe(consumer, IceAndFireCompat.SILVER_WARGLAIVE.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        cutlassRecipe(consumer, IceAndFireCompat.SILVER_CUTLASS.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        claymoreRecipe(consumer, IceAndFireCompat.SILVER_CLAYMORE.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        greathammerRecipe(consumer, IceAndFireCompat.SILVER_GREATHAMMER.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        greataxeRecipe(consumer, IceAndFireCompat.SILVER_GREATAXE.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        chakramRecipe(consumer, IceAndFireCompat.SILVER_CHAKRAM.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        scytheRecipe(consumer, IceAndFireCompat.SILVER_SCYTHE.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        halberdRecipe(consumer, IceAndFireCompat.SILVER_HALBERD.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        greatKatanaRecipe(consumer, IceAndFireCompat.SILVER_GREAT_KATANA.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        grandswordRecipe(consumer, IceAndFireCompat.SILVER_GRANDSWORD.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), IafItemRegistry.SILVER_SWORD.get(), "has_silver_ingot");
        backhandBladeRecipe(consumer, IceAndFireCompat.SILVER_BACKHAND_BLADE.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        lanceRecipe(consumer, IceAndFireCompat.SILVER_LANCE.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        khopeshRecipe(consumer, IceAndFireCompat.SILVER_KHOPESH.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        daggerRecipe(consumer, IceAndFireCompat.SILVER_DAGGER.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        pernachRecipe(consumer, IceAndFireCompat.SILVER_PERNACH.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        quarterstaffRecipe(consumer, IceAndFireCompat.SILVER_QUARTERSTAFF.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        greatSpearRecipe(consumer, IceAndFireCompat.SILVER_GREAT_SPEAR.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, "has_silver_ingot");
        deerHornsRecipe(consumer, IceAndFireCompat.SILVER_DEER_HORNS.get(), IafItemRegistry.SILVER_INGOT.get(), Items.STICK, IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");

        longswordRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_LONGSWORD.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        twinbladeRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_TWINBLADE.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        rapierRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_RAPIER.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        katanaRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_KATANA.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        saiRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_SAI.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        spearRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_SPEAR.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        glaiveRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GLAIVE.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        warglaiveRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_WARGLAIVE.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        cutlassRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_CUTLASS.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        claymoreRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_CLAYMORE.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        greathammerRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GREATHAMMER.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        greataxeRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GREATAXE.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        chakramRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_CHAKRAM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        scytheRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_SCYTHE.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        halberdRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_HALBERD.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        greatKatanaRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GREAT_KATANA.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        grandswordRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GRANDSWORD.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), IafItemRegistry.MYRMEX_DESERT_SWORD.get(), "has_desert_chitin");
        backhandBladeRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_BACKHAND_BLADE.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        lanceRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_LANCE.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        khopeshRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_KHOPESH.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        daggerRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_DAGGER.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        pernachRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_PERNACH.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        quarterstaffRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_QUARTERSTAFF.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        greatSpearRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GREAT_SPEAR.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        deerHornsRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_DEER_HORNS.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");

        longswordRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_LONGSWORD_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        twinbladeRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_TWINBLADE_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        rapierRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_RAPIER_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        katanaRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_KATANA_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        saiRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_SAI_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        spearRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_SPEAR_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        glaiveRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GLAIVE_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        warglaiveRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_WARGLAIVE_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        cutlassRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_CUTLASS_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        claymoreRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_CLAYMORE_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        greathammerRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GREATHAMMER_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        greataxeRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GREATAXE_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        chakramRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_CHAKRAM_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        scytheRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_SCYTHE_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        halberdRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_HALBERD_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        greatKatanaRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GREAT_KATANA_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        grandswordRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GRANDSWORD_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), IafItemRegistry.MYRMEX_DESERT_SWORD_VENOM.get(), "has_desert_chitin");
        backhandBladeRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_BACKHAND_BLADE_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        lanceRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_LANCE_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        khopeshRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_KHOPESH_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        daggerRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_DAGGER_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        pernachRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_PERNACH_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");
        quarterstaffRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_QUARTERSTAFF_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        greatSpearRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_GREAT_SPEAR_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_desert_chitin");
        deerHornsRecipe(consumer, IceAndFireCompat.MYRMEX_DESERT_DEER_HORNS_VENOM.get(), IafItemRegistry.MYRMEX_DESERT_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_DESERT_RESIN.get(), "has_desert_chitin");

        longswordRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_LONGSWORD.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        twinbladeRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_TWINBLADE.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        rapierRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_RAPIER.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        katanaRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_KATANA.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        saiRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_SAI.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        spearRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_SPEAR.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        glaiveRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GLAIVE.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        warglaiveRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_WARGLAIVE.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        cutlassRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_CUTLASS.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        claymoreRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_CLAYMORE.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        greathammerRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GREATHAMMER.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        greataxeRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GREATAXE.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        chakramRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_CHAKRAM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        scytheRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_SCYTHE.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        halberdRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_HALBERD.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        greatKatanaRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GREAT_KATANA.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        grandswordRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GRANDSWORD.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), IafItemRegistry.MYRMEX_JUNGLE_SWORD.get(), "has_jungle_chitin");
        backhandBladeRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_BACKHAND_BLADE.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        lanceRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_LANCE.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        khopeshRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_KHOPESH.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        daggerRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_DAGGER.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        pernachRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_PERNACH.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        quarterstaffRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_QUARTERSTAFF.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        greatSpearRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GREAT_SPEAR.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        deerHornsRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_DEER_HORNS.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");

        longswordRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_LONGSWORD_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        twinbladeRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_TWINBLADE_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        rapierRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_RAPIER_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        katanaRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_KATANA_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        saiRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_SAI_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        spearRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_SPEAR_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        glaiveRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GLAIVE_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        warglaiveRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_WARGLAIVE_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        cutlassRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_CUTLASS_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        claymoreRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_CLAYMORE_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        greathammerRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GREATHAMMER_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        greataxeRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GREATAXE_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        chakramRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_CHAKRAM_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        scytheRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_SCYTHE_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        halberdRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_HALBERD_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        greatKatanaRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GREAT_KATANA_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        grandswordRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GRANDSWORD_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), IafItemRegistry.MYRMEX_JUNGLE_SWORD_VENOM.get(), "has_jungle_chitin");
        backhandBladeRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_BACKHAND_BLADE_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        lanceRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_LANCE_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        khopeshRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_KHOPESH_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        daggerRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_DAGGER_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        pernachRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_PERNACH_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
        quarterstaffRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_QUARTERSTAFF_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        greatSpearRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_GREAT_SPEAR_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), "has_jungle_chitin");
        deerHornsRecipe(consumer, IceAndFireCompat.MYRMEX_JUNGLE_DEER_HORNS_VENOM.get(), IafItemRegistry.MYRMEX_JUNGLE_CHITIN.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.MYRMEX_JUNGLE_RESIN.get(), "has_jungle_chitin");
    }

    private void longswordRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern("X  ")
                .pattern(" # ")
                .pattern("  #")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void twinbladeRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern("  #")
                .pattern(" X ")
                .pattern("#  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void rapierRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern("  #")
                .pattern(" # ")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void katanaRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern("X##")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void saiRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern(" #")
                .pattern("X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void spearRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern("  #")
                .pattern(" X ")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void glaiveRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern("  #")
                .pattern(" X#")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void warglaiveRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern(" O ")
                .pattern("#X#")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void cutlassRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern(" O")
                .pattern("##")
                .pattern("X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void claymoreRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern(" O#")
                .pattern("O#O")
                .pattern("XO ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void greathammerRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern("###")
                .pattern("OOO")
                .pattern(" X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void greataxeRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern("###")
                .pattern("OXO")
                .pattern(" X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void chakramRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern("O#O")
                .pattern("# #")
                .pattern("OXO")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void scytheRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern("##X")
                .pattern("#X ")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void halberdRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern(" #O")
                .pattern("#X#")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void greatKatanaRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern(" O#")
                .pattern("X##")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void grandswordRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, ItemLike sword, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('O', nugget)
                .define('S', sword)
                .pattern("O#O")
                .pattern("###")
                .pattern("#S#")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void backhandBladeRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern("  X")
                .pattern(" #X")
                .pattern("O  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void lanceRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern(" #O")
                .pattern("#O#")
                .pattern("X# ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void khopeshRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern("  #")
                .pattern(" #O")
                .pattern("OX ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void daggerRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern("O#X")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void pernachRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern("O#O")
                .pattern("OXO")
                .pattern(" X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void quarterstaffRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void greatSpearRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .pattern(" ##")
                .pattern(" X#")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void deerHornsRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike stick, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', stick)
                .define('O', nugget)
                .pattern("#O ")
                .pattern("OXO")
                .pattern(" O#")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }
}
