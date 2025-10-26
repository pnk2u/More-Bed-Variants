package de.pnku.mbdv.mixin.compat.bedspreads.client;

import com.illusivesoulworks.bedspreads.client.DecoratedBedBlockEntityRenderer;
import com.illusivesoulworks.bedspreads.common.DecoratedBedBlockEntity;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import de.pnku.mbdv.MoreBedVariantsClient;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BedItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DecoratedBedBlockEntityRenderer.class)
public abstract class DecoratedBedBlockEntityRendererMixin {

    @Unique
    String mbedv$bedVariant = "";

    @Inject(method = "render(Lcom/illusivesoulworks/bedspreads/common/DecoratedBedBlockEntity;FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;II)V",
            at = @At(value = "INVOKE", target = "Lcom/illusivesoulworks/bedspreads/client/DecoratedBedBlockEntityRenderer;renderPiece(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/core/Direction;IIZLjava/util/List;)V"))
    void injectedRenderAtRenderPieceBefore(DecoratedBedBlockEntity blockEntity, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int light, int overlay, CallbackInfo ci) {
        setBedVariantFromDecoratedBlockEntity(blockEntity);
    }

    @Unique
    void setBedVariantFromDecoratedBlockEntity(DecoratedBedBlockEntity bedBlockEntity) {
        ItemStack bedStack = bedBlockEntity.getItem().getTagElement("BlockEntityTag").contains("BedStack")
                ? ItemStack.of(bedBlockEntity.getItem().getTagElement("BlockEntityTag").getCompound("BedStack"))
                : ItemStack.EMPTY;
        Block bedBlock = ((BedItem) bedStack.getItem()).getBlock();
        if (bedBlock instanceof MoreBedVariantBlock moreBedVariantBlock) {
            this.mbedv$bedVariant = moreBedVariantBlock.bedWoodType.replace("stripped_", "").replace("bound_", ""); // (Stripped) Bound Bamboo Beds use regular bamboo variant
        } else {
            this.mbedv$bedVariant = "";
        }
    }

    @WrapOperation(method = "renderPiece", at = @At(value = "NEW", target = "Lnet/minecraft/resources/ResourceLocation;"))
    ResourceLocation wrappedFromNamespaceAndPathInRenderPiece(String namespace, String path, Operation<ResourceLocation> original) {
        if (!this.mbedv$bedVariant.isEmpty()) {
            String newPath = "entity/bed/" + this.mbedv$bedVariant;
            return original.call(MoreBedVariantsClient.MOD_ID, newPath);
        } else {
            return original.call(namespace, path);
        }
    }
}
