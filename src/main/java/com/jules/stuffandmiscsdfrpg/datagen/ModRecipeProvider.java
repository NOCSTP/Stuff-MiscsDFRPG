package com.jules.stuffandmiscsdfrpg.datagen;

import com.jules.stuffandmiscsdfrpg.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Sapphire
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.DIAMOND)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(pWriter);

        // Bronze
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 1)
                .pattern("AB")
                .pattern("BA")
                .define('A', Items.COPPER_INGOT)
                .define('B', Items.IRON_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .save(pWriter);

        // Steel
        // placeholder recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 1)
                .pattern("A A")
                .pattern(" B ")
                .pattern("A A")
                .define('A', Items.IRON_INGOT)
                .define('B', Items.COAL)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(pWriter);

        // Mithril
        // placeholder recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 1)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.IRON_INGOT)
                .define('B', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        // Adamantine
        // placeholder recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ADAMANTINE_INGOT.get(), 1)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.NETHERITE_INGOT)
                .define('B', ModItems.MITHRIL_INGOT.get())
                .unlockedBy("has_mithril_ingot", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        // Orichalcum
        // placeholder recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_INGOT.get(), 1)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.GOLD_INGOT)
                .define('B', ModItems.ADAMANTINE_INGOT.get())
                .unlockedBy("has_adamantine_ingot", has(ModItems.ADAMANTINE_INGOT.get()))
                .save(pWriter);
    }
}
