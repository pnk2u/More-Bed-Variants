package de.pnku.mbdv.mixin;

import de.pnku.mbdv.block.MoreBedVariantBlock;
import de.pnku.mbdv.util.IBedShape;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static de.pnku.mbdv.util.BedShapeState.*;
import static net.minecraft.world.level.block.BedBlock.*;
import static net.minecraft.world.level.block.state.properties.BedPart.HEAD;

@Mixin(value = BedBlock.class)
public abstract class BedBlockMixin extends HorizontalDirectionalBlock implements IBedShape {

    protected BedBlockMixin(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void injectedConstructorAtTail(DyeColor color, Properties properties, CallbackInfo ci) {
        if (shouldApply(this.getClass())) {
            this.registerDefaultState(this.stateDefinition.any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, false).setValue(mBedV$NORTH, false).setValue(mBedV$EAST, false).setValue(mBedV$SOUTH, false).setValue(mBedV$WEST, false));
        }
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState neighborState, Direction face) {
        if (shouldApply(this.getClass())) {
            if (face.getAxis() == Direction.Axis.Y) return false;
            if (!state.getBlock().getDescriptionId().contains("sleeping_bag") && neighborState.getBlock().getDescriptionId().contains("sleeping_bag")) return false;
            boolean isHeightMatch;
            boolean isBoundBamboo = state.getBlock() instanceof MoreBedVariantBlock block && block.bedWoodType.contains("bound_bamboo");
            boolean isNeighbourBoundBamboo = neighborState.getBlock() instanceof MoreBedVariantBlock neighbor && neighbor.bedWoodType.contains("bound_bamboo");
            if (neighborState.getBlock() instanceof BedBlock) {
                if ((isPillowedPackActive || isPillowedConnectedPackActive) && (isBoundBamboo == isNeighbourBoundBamboo)) {
                    if (state.getValue(PART) == BedPart.FOOT) {
                        isHeightMatch = true;
                    } else {
                        isHeightMatch = neighborState.getValue(PART) == HEAD && (state.getValue(FACING) == neighborState.getValue(FACING));
                    }
                } else {
                    isHeightMatch = (isBoundBamboo == isNeighbourBoundBamboo);
                }
            } else {
                isHeightMatch = false;
            }
            return isHeightMatch;
        } else { return super.skipRendering(state, neighborState, face); }
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        if (shouldApply(this.getClass())) {
            builder.add(FACING, PART, OCCUPIED, mBedV$NORTH, mBedV$EAST, mBedV$SOUTH, mBedV$WEST);
        }
        else {
            builder.add(FACING, PART, OCCUPIED);
        }
    }

    @Inject(method = "getShape", at = @At("HEAD"), cancellable = true)
    void getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context, CallbackInfoReturnable<VoxelShape> cir) {
        if (shouldApply(this.getClass())) {
            if (needsToBeChecked) {
                if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
                    checkClientResourcepacks();
                }
            }
            Direction direction = getConnectedDirection(state).getOpposite();
            if (!isPillowedConnectedPackActive) {
                switch (direction) {
                    case NORTH -> {
                        cir.setReturnValue((isPillowedPackActive && state.getValue(PART) == HEAD) ? NORTH_SHAPE_PILLOWED : NORTH_SHAPE);
                    }
                    case EAST -> {
                        cir.setReturnValue((isPillowedPackActive && state.getValue(PART) == HEAD) ? EAST_SHAPE_PILLOWED : EAST_SHAPE);
                    }
                    case SOUTH -> {
                        cir.setReturnValue((isPillowedPackActive && state.getValue(PART) == HEAD) ? SOUTH_SHAPE_PILLOWED : SOUTH_SHAPE);
                    }
                    default -> {
                        cir.setReturnValue((isPillowedPackActive && state.getValue(PART) == HEAD) ? WEST_SHAPE_PILLOWED : WEST_SHAPE);
                    }
                }
            } else {
                boolean n = state.getValue(mBedV$NORTH);
                boolean e = state.getValue(mBedV$EAST);
                boolean s = state.getValue(mBedV$SOUTH);
                boolean w = state.getValue(mBedV$WEST);
                if (state.getValue(PART) == HEAD) {
                    switch (direction) {
                        case NORTH ->
                                cir.setReturnValue(e && w ? NORTH_SHAPE_PILLOWED_EW : e ? NORTH_SHAPE_PILLOWED_E : w ? NORTH_SHAPE_PILLOWED_W : NORTH_SHAPE_PILLOWED);

                        case EAST ->
                                cir.setReturnValue(n && s ? EAST_SHAPE_PILLOWED_NS : n ? EAST_SHAPE_PILLOWED_N : s ? EAST_SHAPE_PILLOWED_S : EAST_SHAPE_PILLOWED);

                        case SOUTH ->
                                cir.setReturnValue(e && w ? SOUTH_SHAPE_PILLOWED_EW : e ? SOUTH_SHAPE_PILLOWED_E : w ? SOUTH_SHAPE_PILLOWED_W : SOUTH_SHAPE_PILLOWED);

                        default ->
                                cir.setReturnValue(n && s ? WEST_SHAPE_PILLOWED_NS : n ? WEST_SHAPE_PILLOWED_N : s ? WEST_SHAPE_PILLOWED_S : WEST_SHAPE_PILLOWED);

                    }
                } else {
                    switch (direction) {
                        case NORTH ->
                                cir.setReturnValue(e && w ? BASE : e ? FLAT_SHAPE_LEG_NW : w ? FLAT_SHAPE_LEG_NE : NORTH_SHAPE);

                        case EAST ->
                                cir.setReturnValue(n && s ? BASE : n ? FLAT_SHAPE_LEG_SE : s ? FLAT_SHAPE_LEG_NE : EAST_SHAPE);

                        case SOUTH ->
                                cir.setReturnValue(e && w ? BASE : e ? FLAT_SHAPE_LEG_SW : w ? FLAT_SHAPE_LEG_SE : SOUTH_SHAPE);

                        default ->
                                cir.setReturnValue(n && s ? BASE : n ? FLAT_SHAPE_LEG_SW : s ? FLAT_SHAPE_LEG_NW : WEST_SHAPE);

                    }
                }
            }
        }
    }

    @Override
    public @NotNull SoundType getSoundType(BlockState state) {
        if (shouldApply(this.getClass())) {
            return state.getValue(PART) == BedPart.HEAD ? SoundType.WOOL : this.soundType;
        } else { return super.getSoundType(state); }
    }

    @Unique
    private static boolean shouldApply(Object thisClass) {
        return thisClass.equals(BedBlock.class) || thisClass.equals(MoreBedVariantBlock.class);
    }
}