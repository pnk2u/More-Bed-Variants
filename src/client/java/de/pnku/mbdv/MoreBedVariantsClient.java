package de.pnku.mbdv;

import de.pnku.mbdv.init.MbdvBlockInit;
import de.pnku.mbdv.renderer.MoreBedVariantRenderer;
import de.pnku.mbdv.ui.MbdvCreativeTab;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
public class MoreBedVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockEntityRenderers.register(MbdvBlockInit.MORE_BED_VARIANT_BLOCK_ENTITY, MoreBedVariantRenderer::new);
        MbdvCreativeTab.registerMbdvCreativeTab();
    }
}