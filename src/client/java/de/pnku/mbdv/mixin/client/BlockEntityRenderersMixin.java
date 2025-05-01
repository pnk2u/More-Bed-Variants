package de.pnku.mbdv.mixin.client;

import de.pnku.mbdv.MoreBedVariants;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

/**
* <b>Adapted from:</b> <i>BetterBeds</i> <br>
* <b>Original Author:</b> <i>Motschen/TeamMidnightDust</i> <br>
* <b>Source:</b> <a href="https://github.com/TeamMidnightDust/BetterBeds/blob/main/common/src/main/java/eu/midnightdust/betterbeds/mixin/MixinBlockEntityRendererDispatcher.java">MixinBlockEntityRendererDispatcher</a> <br>
* <b>Description:</b> This Mixin has been adapted from <i>TeamMidnightDust</i>'s <i>BetterBeds</i>. <br>
**/

@Mixin(BlockEntityRenderers.class)
public class BlockEntityRenderersMixin {

    @Shadow @Final private static Map<BlockEntityType<?>, BlockEntityRendererProvider<?>> PROVIDERS;

    @Inject(method = "register", at = @At("TAIL"))
    private static <T extends BlockEntity>  void injectedRegisterAtTail(BlockEntityType<? extends T> type, BlockEntityRendererProvider<T> factory, CallbackInfo ci) {
        if (!MoreBedVariants.isBedRenderCompatLoaded) {
            PROVIDERS.remove(BlockEntityType.BED);
        }
    }
}
