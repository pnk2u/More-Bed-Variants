package de.pnku.mbdv.mixin.compat.bedspreads.client;

import com.illusivesoulworks.bedspreads.client.DecoratedBedBlockEntityRenderer;
import com.illusivesoulworks.bedspreads.common.BedspreadsRegistry;
import com.illusivesoulworks.bedspreads.common.DecoratedBedBlockEntity;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import de.pnku.mbdv.MoreBedVariantsClient;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(DecoratedBedBlockEntityRenderer.class)
public abstract class DecoratedBedBlockEntityRendererMixin {

    @WrapOperation(method = "renderPiece", at = @At(value = "INVOKE", target = "Lnet/minecraft/resources/ResourceLocation;fromNamespaceAndPath(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;"))
    ResourceLocation wrappedFromNamespaceAndPathInRenderPiece(String namespace, String path, Operation<ResourceLocation> original, PoseStack ps, MultiBufferSource mbs, ModelPart mp, Direction d, int l, int o, boolean h, BannerPatternLayers bpl, DecoratedBedBlockEntity bedEntity) {
        ItemStack bedSpreadsDataBedStack = (bedEntity.getItem().get(BedspreadsRegistry.BEDSPREADS_DATA.get())).bed();
        if (!bedSpreadsDataBedStack.isEmpty()) {
            Block bedBlock = ((BlockItem) bedSpreadsDataBedStack.getItem()).getBlock();
            if (bedBlock instanceof MoreBedVariantBlock moreBedVariantBlock) {
                String bedVariant = moreBedVariantBlock.bedWoodType.replace("stripped_", "").replace("bound_", ""); // (Stripped) Bound Bamboo Beds use regular bamboo variant
                String newPath = "entity/bed/" + bedVariant;
                return original.call(MoreBedVariantsClient.MOD_ID, newPath);
            }
        }
        return original.call(namespace, path);
    }
}
