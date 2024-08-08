package de.pnku.mbdv;

import de.pnku.mbdv.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreBedVariantDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(MoreBedVariantRecipeGenerator::new);
        pack.addProvider(MoreBedVariantBlockStateGenerator::new);
        pack.addProvider(MoreBedVariantLootTableGenerator::new);
        pack.addProvider(MoreBedVariantLangGenerator::new);
        pack.addProvider(MoreBedVariantTagGenerator::new);
    }
}
