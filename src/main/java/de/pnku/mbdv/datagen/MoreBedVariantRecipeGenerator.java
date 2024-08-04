package de.pnku.mbdv.datagen;

import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

import static de.pnku.mbdv.init.MbdvBlockInit.more_beds;

public class MoreBedVariantRecipeGenerator extends FabricRecipeProvider {
    public MoreBedVariantRecipeGenerator(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        for (Block bedVariantBlock : more_beds) {
            String planksWood = ((MoreBedVariantBlock) bedVariantBlock).bedWoodType;
            Item bedPlanks = ((MoreBedVariantBlock) bedVariantBlock).getPlanksItem(planksWood);
            String woolColor = ((MoreBedVariantBlock) bedVariantBlock).bedColor;
            Item bedWool = ((MoreBedVariantBlock) bedVariantBlock).getWoolItem(woolColor);
            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, bedVariantBlock.asItem())
                    .unlockedBy("has_planks", has(bedPlanks))
                    .unlockedBy("has_wool", has(bedWool))
                    .pattern("WWW")
                    .pattern("___")
                    .define('W', bedWool)
                    .define('_', bedPlanks)
                    .save(exporter, MoreBedVariants.asId(planksWood + "_" + woolColor + "_bed"));
        }
    }
}