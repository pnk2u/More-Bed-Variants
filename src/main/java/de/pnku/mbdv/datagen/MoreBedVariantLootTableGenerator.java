package de.pnku.mbdv.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

import static de.pnku.mbdv.init.MbdvBlockInit.more_beds;

public class MoreBedVariantLootTableGenerator extends FabricBlockLootTableProvider {
    public MoreBedVariantLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
    for (Block bedBlock : more_beds) {
            dropSelf(bedBlock);
        }
    }
}
