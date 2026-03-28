package de.pnku.mbdv;

import de.pnku.mbdv.ui.MbdvCreativeTab;
import de.pnku.mbdv.util.BedShapeState;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.*;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import static de.pnku.mbdv.MoreBedVariants.*;

public class MoreBedVariantsClient implements ClientModInitializer {
    public static final String MOD_ID = "quad-lolmbdv";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID + " (Client)");
    private static final Identifier mBedVListener = withModId("resource_reload_listener");

    @Override
    public void onInitializeClient() {
        if (FabricLoader.getInstance().isModLoaded("enhancedblockentities")) {
            ResourceLoader.registerBuiltinPack(
                    withModId("enhanced-beds-lighting-fix"),
                    FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
                    Component.translatable("resourcePack.quad-lolmbdv.enhanced-beds-lighting-fix.name"),
                    PackActivationType.ALWAYS_ENABLED);
        }
            ResourceLoader.registerBuiltinPack(
                    withModId("more-pillowed-bed-variants"),
                    FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
                    Component.translatable("resourcePack.quad-lolmbdv.more-pillowed-bed-variants.name"),
                    PackActivationType.NORMAL);
            ResourceLoader.registerBuiltinPack(
                    withModId("more-pillowed-connected-bed-variants"),
                    FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
                    Component.translatable("resourcePack.quad-lolmbdv.more-pillowed-connected-bed-variants.name"),
                    PackActivationType.NORMAL);

        MbdvCreativeTab.registerMbdvCreativeTab();

        ResourceLoader.get(PackType.CLIENT_RESOURCES).registerReloadListener(
                mBedVListener,
            new PreparableReloadListener() {
                @Override
                public @NotNull CompletableFuture<Void> reload(@NotNull SharedState sharedState, @NotNull Executor backgroundExecutor, @NotNull PreparationBarrier preparationBarrier, @NotNull Executor gameExecutor) {
                    return CompletableFuture.runAsync(() -> {}, backgroundExecutor).thenCompose(preparationBarrier::wait).thenRunAsync(() ->
                    BedShapeState.needsToBeChecked = true, gameExecutor);
                }
            }
        );


    }

    public static Identifier withModId(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}