package de.pnku.mbdv;

import de.pnku.mbdv.init.MbdvBlockInit;
import de.pnku.mbdv.init.MbdvItemInit;
import de.pnku.mbdv.ui.MbdvCreativeTab;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.item.BlockItem;

import static de.pnku.mbdv.MoreBedVariants.*;

public class MoreBedVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
            ResourceManagerHelper.registerBuiltinResourcePack(
                    withModId("more-bed-variants-blockrendering"),
                    FabricLoader.getInstance().getModContainer(MODID).orElseThrow(),
                    ResourcePackActivationType.ALWAYS_ENABLED);
            if (FabricLoader.getInstance().isModLoaded("betterbeds")) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        withModId("better-more-bed-variants"),
                        FabricLoader.getInstance().getModContainer(MODID).orElseThrow(),
                        ResourcePackActivationType.DEFAULT_ENABLED);
                ResourceManagerHelper.registerBuiltinResourcePack(
                        withModId("better-more-bed-variants-fancy"),
                        FabricLoader.getInstance().getModContainer(MODID).orElseThrow(),
                        ResourcePackActivationType.NORMAL);
            }
            if (FabricLoader.getInstance().isModLoaded("enhancedblockentities")) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        withModId("enhanced-more-bed-variants"),
                        FabricLoader.getInstance().getModContainer(MODID).orElseThrow(),
                        ResourcePackActivationType.DEFAULT_ENABLED);
                ResourceManagerHelper.registerBuiltinResourcePack(
                        withModId("enhanced-more-bed-variants-fancy"),
                        FabricLoader.getInstance().getModContainer(MODID).orElseThrow(),
                        ResourcePackActivationType.NORMAL);
            }
        MbdvCreativeTab.registerMbdvCreativeTab();
    }
}