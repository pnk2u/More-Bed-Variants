package de.pnku.mbdv;

import de.pnku.mbdv.init.MbdvBlockInit;
import de.pnku.mbdv.init.MbdvItemInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBedVariants implements ModInitializer {
    public static final String MODID = "quad-lolmbdv";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        MbdvBlockInit.registerBedBlocks();
        MbdvItemInit.registerBedItems();
    }

    public static ResourceLocation asId(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}