//package de.pnku.mbdv.datagen;
//
//import de.pnku.mbdv.block.MoreBedVariantBlock;
//import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
//import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
//import net.minecraft.data.models.BlockModelGenerators;
//import net.minecraft.data.models.ItemModelGenerators;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//
//import static de.pnku.mbdv.init.MbdvBlockInit.more_beds;
//
//public class MoreBedVariantBlockStateGenerator extends FabricModelProvider {
//    public MoreBedVariantBlockStateGenerator(FabricDataOutput generator) {
//        super(generator);
//    }
//
//    @Override
//    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
//    for (Block bedBlock : more_beds) {
//            blockStateModelGenerator.createBedItem(bedBlock,((MoreBedVariantBlock) bedBlock).getWoolBlock(((MoreBedVariantBlock) bedBlock).bedColor));
//            blockStateModelGenerator.createNonTemplateModelBlock(bedBlock, Blocks.WHITE_BED);
//    }
//    }
//
//    @Override
//    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
//    }
//}
