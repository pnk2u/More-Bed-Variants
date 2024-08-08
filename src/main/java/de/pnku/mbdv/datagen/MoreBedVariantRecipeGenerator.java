package de.pnku.mbdv.datagen;

import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

import static de.pnku.mbdv.datagen.MoreBedVariantTagGenerator.ACACIA_BEDS;
import static de.pnku.mbdv.datagen.MoreBedVariantTagGenerator.getBedKey;
import static de.pnku.mbdv.init.MbdvBlockInit.more_beds;

public class MoreBedVariantRecipeGenerator extends FabricRecipeProvider {
    public MoreBedVariantRecipeGenerator(FabricDataOutput generator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(generator, registryLookup);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        for (Block bedVariantBlock : more_beds) {
            String planksWood = ((MoreBedVariantBlock) bedVariantBlock).bedWoodType;
            Item bedPlanks = ((MoreBedVariantBlock) bedVariantBlock).getPlanksItem(planksWood);
            String bedColor = ((MoreBedVariantBlock) bedVariantBlock).bedColor;
            Item bedWool = ((MoreBedVariantBlock) bedVariantBlock).getWoolItem(bedColor);
            Item bedDye = ((MoreBedVariantBlock) bedVariantBlock).getDyeItem(bedColor);
            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, bedVariantBlock.asItem())
                    .unlockedBy("has_planks", has(bedPlanks))
                    .unlockedBy("has_wool", has(bedWool))
                    .pattern("WWW")
                    .pattern("___")
                    .define('W', bedWool)
                    .define('_', bedPlanks)
                    .save(recipeOutput, MoreBedVariants.asId(planksWood + "_" + bedColor + "_bed"));

            ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, bedVariantBlock.asItem())
                    .unlockedBy("has_bed_type", has(getBedKey(planksWood)))
                    .unlockedBy("has_dye", has(bedDye))
                    .requires(getBedKey(planksWood))
                    .requires(bedDye)
                    .save(recipeOutput, MoreBedVariants.asId(planksWood + "_" + bedColor + "_bed_from_dye"));

        }
    }
}