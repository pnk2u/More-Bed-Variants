package de.pnku.mbdv;

import de.pnku.mbdv.ui.MbdvCreativeTab;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;

import static de.pnku.mbdv.MoreBedVariants.*;

public class MoreBedVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        if (FabricLoader.getInstance().isModLoaded("enhancedblockentities")) {
            ResourceManagerHelper.registerBuiltinResourcePack(
                    withModId("enhanced-beds-lighting-fix"),
                    FabricLoader.getInstance().getModContainer(MODID).orElseThrow(),
                    Component.translatable("resourcepack.quad-lolmbdv.enhanced-beds-lighting-fix.title"),
                    ResourcePackActivationType.NORMAL);
        }
            ResourceManagerHelper.registerBuiltinResourcePack(
                    withModId("more-fancy-bed-variants"),
                    FabricLoader.getInstance().getModContainer(MODID).orElseThrow(),
                    Component.translatable("resourcepack.quad-lolmbdv.more-fancy-bed-variants.title"),
                    ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(
                    withModId("more-fancy-connected-bed-variants"),
                    FabricLoader.getInstance().getModContainer(MODID).orElseThrow(),
                    Component.translatable("resourcepack.quad-lolmbdv.more-fancy-connected-bed-variants.title"),
                    ResourcePackActivationType.NORMAL);
        MbdvCreativeTab.registerMbdvCreativeTab();
    }
}