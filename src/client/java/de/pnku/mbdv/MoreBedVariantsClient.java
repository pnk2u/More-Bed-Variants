package de.pnku.mbdv;

import de.pnku.mbdv.ui.MbdvCreativeTab;
import de.pnku.mbdv.util.BedShapeState;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.*;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.profiling.ProfilerFiller;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import static de.pnku.mbdv.MoreBedVariants.*;

public class MoreBedVariantsClient implements ClientModInitializer {
    public static final String MOD_ID = "quad-lolmbdv";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID + " (Client)");

    @Override
    public void onInitializeClient() {
        if (FabricLoader.getInstance().isModLoaded("enhancedblockentities")) {
            ResourceManagerHelper.registerBuiltinResourcePack(
                    withModId("enhanced-beds-lighting-fix"),
                    FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
                    Component.translatable("resourcePack.quad-lolmbdv.enhanced-beds-lighting-fix.name"),
                    ResourcePackActivationType.ALWAYS_ENABLED);
        }
            ResourceManagerHelper.registerBuiltinResourcePack(
                    withModId("more-pillowed-bed-variants"),
                    FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
                    Component.translatable("resourcePack.quad-lolmbdv.more-pillowed-bed-variants.name"),
                    ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(
                    withModId("more-pillowed-connected-bed-variants"),
                    FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
                    Component.translatable("resourcePack.quad-lolmbdv.more-pillowed-connected-bed-variants.name"),
                    ResourcePackActivationType.NORMAL);

        MbdvCreativeTab.registerMbdvCreativeTab();

        ResourceManagerHelper.get(PackType.CLIENT_RESOURCES).registerReloadListener(
            new IdentifiableResourceReloadListener() {
                final ResourceLocation mBedVListener = withModId("resource_reload_listener");
                @Override
                public ResourceLocation getFabricId() {
                    return mBedVListener;
                }

                @Override
                public @NotNull CompletableFuture<Void> reload(PreparationBarrier preparationBarrier, ResourceManager resourceManager, Executor backgroundExecutor, Executor gameExecutor) {
                    return CompletableFuture.runAsync(() -> {}, backgroundExecutor).thenCompose(preparationBarrier::wait).thenRunAsync(() ->
                    {
                        BedShapeState.needsToBeChecked = true;
                    }, gameExecutor);
                }

                @Override
                public @NotNull String getName() {
                    return mBedVListener.toString();
                }
        });
    }

    public static ResourceLocation withModId(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}