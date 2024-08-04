package de.pnku.mbdv.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import de.pnku.mbdv.block.MoreBedVariantBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;

public class MoreBedVariantItemRenderer {

    public static void render(ItemStack stack, PoseStack poseStack, MultiBufferSource bufferIn,
                              int combinedLightIn, int combinedOverlayIn) {
        MoreBedVariantBlockEntity bed = new MoreBedVariantBlockEntity(BlockPos.ZERO,
                ((BlockItem) stack.getItem()).getBlock().defaultBlockState());
        Minecraft.getInstance().getBlockEntityRenderDispatcher()
                .renderItem(bed, poseStack, bufferIn, combinedLightIn, combinedOverlayIn);
    }
}