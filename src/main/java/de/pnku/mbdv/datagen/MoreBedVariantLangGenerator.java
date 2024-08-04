package de.pnku.mbdv.datagen;

import de.pnku.mbdv.block.MoreBedVariantBlock;
import de.pnku.mbdv.init.MbdvBlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import org.apache.commons.lang3.text.WordUtils;

import java.util.concurrent.CompletableFuture;

public class MoreBedVariantLangGenerator extends FabricLanguageProvider {
    public MoreBedVariantLangGenerator(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        for (Block bed : MbdvBlockInit.more_beds) {
            String bedName = WordUtils.capitalizeFully(((MoreBedVariantBlock) bed).bedColor + " " + ((MoreBedVariantBlock) bed).bedWoodType) + " Bed";
            translationBuilder.add(bed, bedName);
        }
    }
}
