package com.serkyo.simplycompat.datagen;

import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.serkyo.simplycompat.compat.IceAndFireCompat;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class SCRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public SCRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
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

        longswordRecipe(consumer, IceAndFireCompat.DRAGONBONE_LONGSWORD.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        twinbladeRecipe(consumer, IceAndFireCompat.DRAGONBONE_TWINBLADE.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        rapierRecipe(consumer, IceAndFireCompat.DRAGONBONE_RAPIER.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        katanaRecipe(consumer, IceAndFireCompat.DRAGONBONE_KATANA.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        saiRecipe(consumer, IceAndFireCompat.DRAGONBONE_SAI.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        spearRecipe(consumer, IceAndFireCompat.DRAGONBONE_SPEAR.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        glaiveRecipe(consumer, IceAndFireCompat.DRAGONBONE_GLAIVE.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        warglaiveRecipe(consumer, IceAndFireCompat.DRAGONBONE_WARGLAIVE.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        cutlassRecipe(consumer, IceAndFireCompat.DRAGONBONE_CUTLASS.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        claymoreRecipe(consumer, IceAndFireCompat.DRAGONBONE_CLAYMORE.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        greathammerRecipe(consumer, IceAndFireCompat.DRAGONBONE_GREATHAMMER.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        greataxeRecipe(consumer, IceAndFireCompat.DRAGONBONE_GREATAXE.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        chakramRecipe(consumer, IceAndFireCompat.DRAGONBONE_CHAKRAM.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        scytheRecipe(consumer, IceAndFireCompat.DRAGONBONE_SCYTHE.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        halberdRecipe(consumer, IceAndFireCompat.DRAGONBONE_HALBERD.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        greatKatanaRecipe(consumer, IceAndFireCompat.DRAGONBONE_GREAT_KATANA.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        grandswordRecipe(consumer, IceAndFireCompat.DRAGONBONE_GRANDSWORD.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), IafItemRegistry.DRAGONBONE_SWORD.get(), "has_dragonbone");
        backhandBladeRecipe(consumer, IceAndFireCompat.DRAGONBONE_BACKHAND_BLADE.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        lanceRecipe(consumer, IceAndFireCompat.DRAGONBONE_LANCE.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        khopeshRecipe(consumer, IceAndFireCompat.DRAGONBONE_KHOPESH.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        daggerRecipe(consumer, IceAndFireCompat.DRAGONBONE_DAGGER.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        pernachRecipe(consumer, IceAndFireCompat.DRAGONBONE_PERNACH.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");
        quarterstaffRecipe(consumer, IceAndFireCompat.DRAGONBONE_QUARTERSTAFF.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        greatSpearRecipe(consumer, IceAndFireCompat.DRAGONBONE_GREAT_SPEAR.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), "has_dragonbone");
        deerHornsRecipe(consumer, IceAndFireCompat.DRAGONBONE_DEER_HORNS.get(), IafItemRegistry.DRAGON_BONE.get(), IafItemRegistry.WITHERBONE.get(), IafItemRegistry.WITHER_SHARD.get(), "has_dragonbone");

        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_LONGSWORD.get(), IceAndFireCompat.DRAGONBONE_LONGSWORD.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_TWINBLADE.get(), IceAndFireCompat.DRAGONBONE_TWINBLADE.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_RAPIER.get(), IceAndFireCompat.DRAGONBONE_RAPIER.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_KATANA.get(), IceAndFireCompat.DRAGONBONE_KATANA.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_SAI.get(), IceAndFireCompat.DRAGONBONE_SAI.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_SPEAR.get(), IceAndFireCompat.DRAGONBONE_SPEAR.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_GLAIVE.get(), IceAndFireCompat.DRAGONBONE_GLAIVE.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_WARGLAIVE.get(), IceAndFireCompat.DRAGONBONE_WARGLAIVE.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_CUTLASS.get(), IceAndFireCompat.DRAGONBONE_CUTLASS.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_CLAYMORE.get(), IceAndFireCompat.DRAGONBONE_CLAYMORE.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_GREATHAMMER.get(), IceAndFireCompat.DRAGONBONE_GREATHAMMER.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_GREATAXE.get(), IceAndFireCompat.DRAGONBONE_GREATAXE.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_CHAKRAM.get(), IceAndFireCompat.DRAGONBONE_CHAKRAM.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_SCYTHE.get(), IceAndFireCompat.DRAGONBONE_SCYTHE.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_HALBERD.get(), IceAndFireCompat.DRAGONBONE_HALBERD.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_GREAT_KATANA.get(), IceAndFireCompat.DRAGONBONE_GREAT_KATANA.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_GRANDSWORD.get(), IceAndFireCompat.DRAGONBONE_GRANDSWORD.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_BACKHAND_BLADE.get(), IceAndFireCompat.DRAGONBONE_BACKHAND_BLADE.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_LANCE.get(), IceAndFireCompat.DRAGONBONE_LANCE.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_KHOPESH.get(), IceAndFireCompat.DRAGONBONE_KHOPESH.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_DAGGER.get(), IceAndFireCompat.DRAGONBONE_DAGGER.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_PERNACH.get(), IceAndFireCompat.DRAGONBONE_PERNACH.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_QUARTERSTAFF.get(), IceAndFireCompat.DRAGONBONE_QUARTERSTAFF.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_GREAT_SPEAR.get(), IceAndFireCompat.DRAGONBONE_GREAT_SPEAR.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.FIRE_DRAGONBONE_DEER_HORNS.get(), IceAndFireCompat.DRAGONBONE_DEER_HORNS.get(), IafItemRegistry.FIRE_DRAGON_BLOOD.get(), "has_fire_dragon_blood");

        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_LONGSWORD.get(), IceAndFireCompat.DRAGONBONE_LONGSWORD.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_TWINBLADE.get(), IceAndFireCompat.DRAGONBONE_TWINBLADE.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_RAPIER.get(), IceAndFireCompat.DRAGONBONE_RAPIER.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_KATANA.get(), IceAndFireCompat.DRAGONBONE_KATANA.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_SAI.get(), IceAndFireCompat.DRAGONBONE_SAI.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_SPEAR.get(), IceAndFireCompat.DRAGONBONE_SPEAR.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_GLAIVE.get(), IceAndFireCompat.DRAGONBONE_GLAIVE.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_WARGLAIVE.get(), IceAndFireCompat.DRAGONBONE_WARGLAIVE.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_CUTLASS.get(), IceAndFireCompat.DRAGONBONE_CUTLASS.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_CLAYMORE.get(), IceAndFireCompat.DRAGONBONE_CLAYMORE.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_GREATHAMMER.get(), IceAndFireCompat.DRAGONBONE_GREATHAMMER.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_GREATAXE.get(), IceAndFireCompat.DRAGONBONE_GREATAXE.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_CHAKRAM.get(), IceAndFireCompat.DRAGONBONE_CHAKRAM.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_SCYTHE.get(), IceAndFireCompat.DRAGONBONE_SCYTHE.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_HALBERD.get(), IceAndFireCompat.DRAGONBONE_HALBERD.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_GREAT_KATANA.get(), IceAndFireCompat.DRAGONBONE_GREAT_KATANA.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_GRANDSWORD.get(), IceAndFireCompat.DRAGONBONE_GRANDSWORD.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_BACKHAND_BLADE.get(), IceAndFireCompat.DRAGONBONE_BACKHAND_BLADE.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_LANCE.get(), IceAndFireCompat.DRAGONBONE_LANCE.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_KHOPESH.get(), IceAndFireCompat.DRAGONBONE_KHOPESH.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_DAGGER.get(), IceAndFireCompat.DRAGONBONE_DAGGER.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_PERNACH.get(), IceAndFireCompat.DRAGONBONE_PERNACH.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_QUARTERSTAFF.get(), IceAndFireCompat.DRAGONBONE_QUARTERSTAFF.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_GREAT_SPEAR.get(), IceAndFireCompat.DRAGONBONE_GREAT_SPEAR.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.ICE_DRAGONBONE_DEER_HORNS.get(), IceAndFireCompat.DRAGONBONE_DEER_HORNS.get(), IafItemRegistry.ICE_DRAGON_BLOOD.get(), "has_ice_dragon_blood");

        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_LONGSWORD.get(), IceAndFireCompat.DRAGONBONE_LONGSWORD.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_TWINBLADE.get(), IceAndFireCompat.DRAGONBONE_TWINBLADE.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_RAPIER.get(), IceAndFireCompat.DRAGONBONE_RAPIER.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_KATANA.get(), IceAndFireCompat.DRAGONBONE_KATANA.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_SAI.get(), IceAndFireCompat.DRAGONBONE_SAI.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_SPEAR.get(), IceAndFireCompat.DRAGONBONE_SPEAR.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_GLAIVE.get(), IceAndFireCompat.DRAGONBONE_GLAIVE.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_WARGLAIVE.get(), IceAndFireCompat.DRAGONBONE_WARGLAIVE.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_CUTLASS.get(), IceAndFireCompat.DRAGONBONE_CUTLASS.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_CLAYMORE.get(), IceAndFireCompat.DRAGONBONE_CLAYMORE.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_GREATHAMMER.get(), IceAndFireCompat.DRAGONBONE_GREATHAMMER.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_GREATAXE.get(), IceAndFireCompat.DRAGONBONE_GREATAXE.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_CHAKRAM.get(), IceAndFireCompat.DRAGONBONE_CHAKRAM.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_SCYTHE.get(), IceAndFireCompat.DRAGONBONE_SCYTHE.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_HALBERD.get(), IceAndFireCompat.DRAGONBONE_HALBERD.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_GREAT_KATANA.get(), IceAndFireCompat.DRAGONBONE_GREAT_KATANA.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_GRANDSWORD.get(), IceAndFireCompat.DRAGONBONE_GRANDSWORD.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_BACKHAND_BLADE.get(), IceAndFireCompat.DRAGONBONE_BACKHAND_BLADE.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_LANCE.get(), IceAndFireCompat.DRAGONBONE_LANCE.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_KHOPESH.get(), IceAndFireCompat.DRAGONBONE_KHOPESH.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_DAGGER.get(), IceAndFireCompat.DRAGONBONE_DAGGER.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_PERNACH.get(), IceAndFireCompat.DRAGONBONE_PERNACH.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_QUARTERSTAFF.get(), IceAndFireCompat.DRAGONBONE_QUARTERSTAFF.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_GREAT_SPEAR.get(), IceAndFireCompat.DRAGONBONE_GREAT_SPEAR.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
        infusedDragonboneRecipe(consumer, IceAndFireCompat.LIGHTNING_DRAGONBONE_DEER_HORNS.get(), IceAndFireCompat.DRAGONBONE_DEER_HORNS.get(), IafItemRegistry.LIGHTNING_DRAGON_BLOOD.get(), "has_lightning_dragon_blood");
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

    private void infusedDragonboneRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike initialSword, ItemLike dragonBlood, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', initialSword)
                .define('X', dragonBlood)
                .pattern("X#")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(dragonBlood).build()))
                .save(consumer);
    }
}
