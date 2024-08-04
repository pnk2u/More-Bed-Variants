package de.pnku.mbdv;

import de.pnku.mbdv.init.MbdvBlockInit;
import de.pnku.mbdv.init.MbdvItemInit;
import de.pnku.mbdv.renderer.MoreBedVariantDynamicItemRenderer;
import de.pnku.mbdv.renderer.MoreBedVariantRenderer;
import de.pnku.mbdv.ui.MbdvCreativeTab;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBedVariantsClient implements ClientModInitializer {
    public static final String MODID = "quad-lolmsmv";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitializeClient() {
        BlockEntityRenderers.register(MbdvBlockInit.MORE_BED_VARIANT_BLOCK_ENTITY, MoreBedVariantRenderer::new);

        for (BlockItem mbdvBedItem : MbdvItemInit.more_bed_items) {
            BuiltinItemRendererRegistry.INSTANCE.register(mbdvBedItem,
                    new MoreBedVariantDynamicItemRenderer());
        }
        MbdvCreativeTab.registerMbdvCreativeTab();
    }
}