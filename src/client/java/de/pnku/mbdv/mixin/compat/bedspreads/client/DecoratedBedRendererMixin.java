package de.pnku.mbdv.mixin.compat.bedspreads.client;

import com.illusivesoulworks.bedspreads.client.DecoratedBedRenderer;
import com.illusivesoulworks.bedspreads.common.BedspreadsData;
import com.illusivesoulworks.bedspreads.common.BedspreadsRegistry;
import com.illusivesoulworks.bedspreads.common.DecoratedBedBlockEntity;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import de.pnku.mbdv.MoreBedVariantsClient;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(DecoratedBedRenderer.class)
public abstract class DecoratedBedRendererMixin {

    @Unique
    ResourceLocation getResourceLocationFromBedspreadsData(BedspreadsData data) {
        if (!data.bed().isEmpty() && data.bed().getItem() instanceof BlockItem bedItem ) {
            if (bedItem.getBlock() instanceof MoreBedVariantBlock moreBedVariantBlock) {
                String bedVariant = moreBedVariantBlock.bedWoodType.replace("stripped_", "").replace("bound_", ""); // (Stripped) Bound Bamboo Beds use regular bamboo variant
                String newPath = "entity/bed/" + bedVariant;
                return ResourceLocation.fromNamespaceAndPath(MoreBedVariantsClient.MOD_ID, newPath);
            }
        }
        return null;
    }

    @WrapOperation(method = "Lcom/illusivesoulworks/bedspreads/client/DecoratedBedRenderer;render(Lcom/illusivesoulworks/bedspreads/common/DecoratedBedBlockEntity;FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;IILnet/minecraft/world/phys/Vec3;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/resources/ResourceLocation;fromNamespaceAndPath(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;"))
    ResourceLocation wrappedFromNamespaceAndPathInRender(String namespace, String path, Operation<ResourceLocation> original, DecoratedBedBlockEntity bedEntity) {
        BedspreadsData data = bedEntity.getItem().getOrDefault(BedspreadsRegistry.BEDSPREADS_DATA.get(), BedspreadsData.EMPTY);
        ResourceLocation newLocation = getResourceLocationFromBedspreadsData(data);
        if (newLocation != null) {
            return newLocation;
        } else {
            return original.call(namespace, path);
        }
    }

    @WrapOperation(method = "Lcom/illusivesoulworks/bedspreads/client/DecoratedBedRenderer;renderInHand(Lcom/illusivesoulworks/bedspreads/common/BedspreadsData;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;II)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/resources/ResourceLocation;fromNamespaceAndPath(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;"))
    ResourceLocation wrappedFromNamespaceAndPathInRenderInHand(String namespace, String path, Operation<ResourceLocation> original, BedspreadsData data) {
        ResourceLocation newLocation = getResourceLocationFromBedspreadsData(data);
        if (newLocation != null) {
            return newLocation;
        } else {
            return original.call(namespace, path);
        }
    }

}
