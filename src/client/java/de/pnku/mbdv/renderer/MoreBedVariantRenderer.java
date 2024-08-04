package de.pnku.mbdv.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import de.pnku.mbdv.block.MoreBedVariantBlockEntity;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BrightnessCombiner;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;

import static de.pnku.mbdv.init.MbdvBlockInit.MORE_BED_VARIANT_BLOCK_ENTITY;

public class MoreBedVariantRenderer implements BlockEntityRenderer<MoreBedVariantBlockEntity> {
        private final ModelPart headRoot;
        private final ModelPart footRoot;

        public MoreBedVariantRenderer(BlockEntityRendererProvider.Context context) {
            this.headRoot = context.bakeLayer(ModelLayers.BED_HEAD);
            this.footRoot = context.bakeLayer(ModelLayers.BED_FOOT);
        }

        @Override
        public void render(MoreBedVariantBlockEntity bed, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int combinedLight, int combinedOverlay) {
            Material material = new Material(Sheets.BED_SHEET, MoreBedVariants.asId("entity/bed/" + ((MoreBedVariantBlockEntity) bed).woodType + "_" + bed.getColor() + "_bed"));
            Level level = bed.getLevel();
            if (level != null) {
                BlockState blockstate = bed.getBlockState();
                DoubleBlockCombiner.NeighborCombineResult<? extends MoreBedVariantBlockEntity> combineResult = DoubleBlockCombiner.combineWithNeigbour(MORE_BED_VARIANT_BLOCK_ENTITY, MoreBedVariantBlock::getBlockType, MoreBedVariantBlock::getConnectedDirection, MoreBedVariantBlockEntity.FACING, blockstate, level, bed.getBlockPos(), (levelAccessor, pos) -> false);
                int i = combineResult.apply(new BrightnessCombiner<>()).get(combinedLight);
                this.renderPiece(poseStack, buffer, blockstate.getValue(MoreBedVariantBlock.PART) == BedPart.HEAD ? this.headRoot : this.footRoot, blockstate.getValue(MoreBedVariantBlockEntity.FACING), material, i, combinedOverlay, false);
            } else {
                this.renderPiece(poseStack, buffer, this.headRoot, Direction.SOUTH, material, combinedLight, combinedOverlay, false);
                this.renderPiece(poseStack, buffer, this.footRoot, Direction.SOUTH, material, combinedLight, combinedOverlay, true);
            }
        }

        private void renderPiece(PoseStack poseStack, MultiBufferSource multiBufferSource, ModelPart model, Direction direction, Material material, int packedLight, int packedOverlay, boolean foot) {
            poseStack.pushPose();
            poseStack.translate(0.0, 0.5625, foot ? -1.0 : 0.0);
            poseStack.mulPose(Axis.XP.rotationDegrees(90.0F));
            poseStack.translate(0.5, 0.5, 0.5);
            poseStack.mulPose(Axis.ZP.rotationDegrees(180.0F + direction.toYRot()));
            poseStack.translate(-0.5, -0.5, -0.5);
            VertexConsumer vertexconsumer = material.buffer(multiBufferSource, RenderType::entitySolid);
            model.render(poseStack, vertexconsumer, packedLight, packedOverlay);
            poseStack.popPose();
        }
}
