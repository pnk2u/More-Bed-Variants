package de.pnku.mbdv.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.level.block.Block;

import static de.pnku.mbdv.init.MbdvBlockInit.more_beds;

public class MoreBedVariantLootTableGenerator extends FabricBlockLootTableProvider {
    public MoreBedVariantLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
    for (Block bedBlock : more_beds) {
            dropSelf(bedBlock);
        }
    }
}
