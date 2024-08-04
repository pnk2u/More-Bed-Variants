package de.pnku.mbdv.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class MoreBedVariantDynamicItemRenderer implements BuiltinItemRendererRegistry.DynamicItemRenderer {

    @Override
    public void render(ItemStack stack, ItemDisplayContext displayContext, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        MoreBedVariantItemRenderer.render(stack, matrices, vertexConsumers, light, overlay);
    }
}