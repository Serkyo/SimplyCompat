package com.serkyo.simplycompat.datagen;

import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.serkyo.simplycompat.compat.IceAndFireCompat;
import com.serkyo.simplycompat.core.SCItems;
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
        nineBlockStorageRecipesWithCustomPacking(consumer, RecipeCategory.MISC, SCItems.COPPER_NUGGET.get(), RecipeCategory.MISC, Items.COPPER_INGOT, "copper_ingot_from_nugget", "copper_ingot");

        longswordRecipe(consumer, IceAndFireCompat.COPPER_LONGSWORD.get(), Items.COPPER_INGOT, "has_copper_ingot");
        twinbladeRecipe(consumer, IceAndFireCompat.COPPER_TWINBLADE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        rapierRecipe(consumer, IceAndFireCompat.COPPER_RAPIER.get(), Items.COPPER_INGOT, "has_copper_ingot");
        katanaRecipe(consumer, IceAndFireCompat.COPPER_KATANA.get(), Items.COPPER_INGOT, "has_copper_ingot");
        saiRecipe(consumer, IceAndFireCompat.COPPER_SAI.get(), Items.COPPER_INGOT, "has_copper_ingot");
        spearRecipe(consumer, IceAndFireCompat.COPPER_SPEAR.get(), Items.COPPER_INGOT, "has_copper_ingot");
        glaiveRecipe(consumer, IceAndFireCompat.COPPER_GLAIVE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        warglaiveRecipe(consumer, IceAndFireCompat.COPPER_WARGLAIVE.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        cutlassRecipe(consumer, IceAndFireCompat.COPPER_CUTLASS.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        claymoreRecipe(consumer, IceAndFireCompat.COPPER_CLAYMORE.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        greathammerRecipe(consumer, IceAndFireCompat.COPPER_GREATHAMMER.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        greataxeRecipe(consumer, IceAndFireCompat.COPPER_GREATAXE.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        chakramRecipe(consumer, IceAndFireCompat.COPPER_CHAKRAM.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        scytheRecipe(consumer, IceAndFireCompat.COPPER_SCYTHE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        halberdRecipe(consumer, IceAndFireCompat.COPPER_HALBERD.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        greatKatanaRecipe(consumer, IceAndFireCompat.COPPER_GREAT_KATANA.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        grandswordRecipe(consumer, IceAndFireCompat.COPPER_GRANDSWORD.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), IafItemRegistry.COPPER_SWORD.get(), "has_copper_ingot");
        backhandBladeRecipe(consumer, IceAndFireCompat.COPPER_BACKHAND_BLADE.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        lanceRecipe(consumer, IceAndFireCompat.COPPER_LANCE.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        khopeshRecipe(consumer, IceAndFireCompat.COPPER_KHOPESH.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        daggerRecipe(consumer, IceAndFireCompat.COPPER_DAGGER.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        pernachRecipe(consumer, IceAndFireCompat.COPPER_PERNACH.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");
        quarterstaffRecipe(consumer, IceAndFireCompat.COPPER_QUARTERSTAFF.get(), Items.COPPER_INGOT, "has_copper_ingot");
        greatSpearRecipe(consumer, IceAndFireCompat.COPPER_GREAT_SPEAR.get(), Items.COPPER_INGOT, "has_copper_ingot");
        deerHornsRecipe(consumer, IceAndFireCompat.COPPER_DEER_HORNS.get(), Items.COPPER_INGOT, SCItems.COPPER_NUGGET.get(), "has_copper_ingot");

        longswordRecipe(consumer, IceAndFireCompat.SILVER_LONGSWORD.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        twinbladeRecipe(consumer, IceAndFireCompat.SILVER_TWINBLADE.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        rapierRecipe(consumer, IceAndFireCompat.SILVER_RAPIER.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        katanaRecipe(consumer, IceAndFireCompat.SILVER_KATANA.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        saiRecipe(consumer, IceAndFireCompat.SILVER_SAI.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        spearRecipe(consumer, IceAndFireCompat.SILVER_SPEAR.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        glaiveRecipe(consumer, IceAndFireCompat.SILVER_GLAIVE.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        warglaiveRecipe(consumer, IceAndFireCompat.SILVER_WARGLAIVE.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        cutlassRecipe(consumer, IceAndFireCompat.SILVER_CUTLASS.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        claymoreRecipe(consumer, IceAndFireCompat.SILVER_CLAYMORE.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        greathammerRecipe(consumer, IceAndFireCompat.SILVER_GREATHAMMER.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        greataxeRecipe(consumer, IceAndFireCompat.SILVER_GREATAXE.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        chakramRecipe(consumer, IceAndFireCompat.SILVER_CHAKRAM.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        scytheRecipe(consumer, IceAndFireCompat.SILVER_SCYTHE.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        halberdRecipe(consumer, IceAndFireCompat.SILVER_HALBERD.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        greatKatanaRecipe(consumer, IceAndFireCompat.SILVER_GREAT_KATANA.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        grandswordRecipe(consumer, IceAndFireCompat.SILVER_GRANDSWORD.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), IafItemRegistry.SILVER_SWORD.get(), "has_silver_ingot");
        backhandBladeRecipe(consumer, IceAndFireCompat.SILVER_BACKHAND_BLADE.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        lanceRecipe(consumer, IceAndFireCompat.SILVER_LANCE.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        khopeshRecipe(consumer, IceAndFireCompat.SILVER_KHOPESH.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        daggerRecipe(consumer, IceAndFireCompat.SILVER_DAGGER.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        pernachRecipe(consumer, IceAndFireCompat.SILVER_PERNACH.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
        quarterstaffRecipe(consumer, IceAndFireCompat.SILVER_QUARTERSTAFF.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        greatSpearRecipe(consumer, IceAndFireCompat.SILVER_GREAT_SPEAR.get(), IafItemRegistry.SILVER_INGOT.get(), "has_silver_ingot");
        deerHornsRecipe(consumer, IceAndFireCompat.SILVER_DEER_HORNS.get(), IafItemRegistry.SILVER_INGOT.get(), IafItemRegistry.SILVER_NUGGET.get(), "has_silver_ingot");
    }

    private void longswordRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern("X  ")
                .pattern(" # ")
                .pattern("  #")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void twinbladeRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern("  #")
                .pattern(" X ")
                .pattern("#  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void rapierRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern("  #")
                .pattern(" # ")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void katanaRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern("X##")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void saiRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern(" #")
                .pattern("X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void spearRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern("  #")
                .pattern(" X ")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void glaiveRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern("  #")
                .pattern(" X#")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void warglaiveRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern(" O ")
                .pattern("#X#")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void cutlassRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern(" O")
                .pattern("##")
                .pattern("X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void claymoreRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern(" O#")
                .pattern("O#O")
                .pattern("XO ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void greathammerRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern("###")
                .pattern("OOO")
                .pattern(" X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void greataxeRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern("###")
                .pattern("OXO")
                .pattern(" X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void chakramRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern("O#O")
                .pattern("# #")
                .pattern("OXO")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void scytheRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern("##X")
                .pattern("#X ")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void halberdRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern(" #O")
                .pattern("#X#")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void greatKatanaRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern(" O#")
                .pattern("X##")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void grandswordRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, ItemLike sword, String unlockCriterionName) {
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

    private void backhandBladeRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern("  X")
                .pattern(" #X")
                .pattern("O  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void lanceRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern(" #O")
                .pattern("#O#")
                .pattern("X# ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void khopeshRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern("  #")
                .pattern(" #O")
                .pattern("OX ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void daggerRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern("O#X")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void pernachRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern("O#O")
                .pattern("OXO")
                .pattern(" X ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void quarterstaffRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void greatSpearRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .pattern(" ##")
                .pattern(" X#")
                .pattern("X  ")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }

    private void deerHornsRecipe(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingot, ItemLike nugget, String unlockCriterionName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .define('#', ingot)
                .define('X', Items.STICK)
                .define('O', nugget)
                .pattern("#O ")
                .pattern("OXO")
                .pattern(" O#")
                .unlockedBy(unlockCriterionName, inventoryTrigger(ItemPredicate.Builder.item().of(ingot).build()))
                .save(consumer);
    }
}
