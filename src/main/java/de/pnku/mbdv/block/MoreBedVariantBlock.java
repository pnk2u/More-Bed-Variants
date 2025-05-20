package de.pnku.mbdv.block;

import de.pnku.mbdv.util.IBedShape;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import static de.pnku.mbdv.util.BedShapeState.*;
import static net.minecraft.world.level.block.state.properties.BedPart.HEAD;

public class MoreBedVariantBlock extends BedBlock implements IBedShape {
    public final String bedWoodType;
    public final String bedColor;

    public MoreBedVariantBlock(DyeColor dyeColour, MapColor mapColour, String bedWoodType, String bedColor) {
        super(dyeColour, Properties.ofFullCopy(Blocks.WHITE_BED).mapColor(mapColour).setId(ResourceKey.create(Registries.BLOCK, MoreBedVariants.withModId(bedWoodType + "_" + bedColor + "_bed"))));
        this.bedWoodType = bedWoodType;
        this.bedColor = bedColor;
        this.registerDefaultState(this.stateDefinition.any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, false).setValue(mBedV$NORTH, false).setValue(mBedV$EAST, false).setValue(mBedV$SOUTH, false).setValue(mBedV$WEST, false));
    }

    public MoreBedVariantBlock(DyeColor dyeColour, MapColor colour, SoundType sound, String bedWoodType, String bedColor) {
        super(dyeColour, Properties.ofFullCopy(Blocks.WHITE_BED).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreBedVariants.withModId(bedWoodType + "_" + bedColor + "_bed"))).sound(sound));
        this.bedWoodType = bedWoodType;
        this.bedColor = bedColor;
        this.registerDefaultState(this.stateDefinition.any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, false).setValue(mBedV$NORTH, false).setValue(mBedV$EAST, false).setValue(mBedV$SOUTH, false).setValue(mBedV$WEST, false));
    }

    @Override
    public @NotNull BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        if (this.bedWoodType.contains("bound_bamboo")) {
            return new BoundBambooBedBlockEntity(pos, state);
        } else {
            return new MoreBedVariantBlockEntity(pos, state);
        }
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState neighborState, Direction face) {
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
        } else {isHeightMatch = false;}
        return face.getAxis() != Direction.Axis.Y && isHeightMatch;
    }

    @Override
    protected @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        if (this.bedWoodType.contains("bound_bamboo")) {
            if (needsToBeChecked) {
                if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
                    checkClientResourcepacks();
                }
            }
            Direction direction = getConnectedDirection(state).getOpposite();
            if (!isPillowedConnectedPackActive) {
                switch (direction) {
                    case NORTH -> {
                        return (isPillowedPackActive && state.getValue(PART) == HEAD) ? BB_NORTH_PILLOWED : BB_BASE;
                    }
                    case EAST -> {
                        return (isPillowedPackActive && state.getValue(PART) == HEAD) ? BB_EAST_PILLOWED : BB_BASE;
                    }
                    case SOUTH -> {
                        return (isPillowedPackActive && state.getValue(PART) == HEAD) ? BB_SOUTH_PILLOWED : BB_BASE;
                    }
                    default -> {
                        return (isPillowedPackActive && state.getValue(PART) == HEAD) ? BB_WEST_PILLOWED : BB_BASE;
                    }
                }
            } else {
                boolean n = state.getValue(mBedV$NORTH);
                boolean e = state.getValue(mBedV$EAST);
                boolean s = state.getValue(mBedV$SOUTH);
                boolean w = state.getValue(mBedV$WEST);
                if (state.getValue(PART) == HEAD) {
                    switch (direction) {
                        case NORTH -> {
                            return e && w ? BB_NORTH_PILLOWED_EW : e ? BB_NORTH_PILLOWED_E : w ? BB_NORTH_PILLOWED_W : BB_NORTH_PILLOWED;
                        }
                        case EAST -> {
                            return n && s ? BB_EAST_PILLOWED_NS : n ? BB_EAST_PILLOWED_N : s ? BB_EAST_PILLOWED_S : BB_EAST_PILLOWED;
                        }
                        case SOUTH -> {
                            return e && w ? BB_SOUTH_PILLOWED_EW : e ? BB_SOUTH_PILLOWED_E : w ? BB_SOUTH_PILLOWED_W : BB_SOUTH_PILLOWED;
                        }
                        default -> {
                            return n && s ? BB_WEST_PILLOWED_NS : n ? BB_WEST_PILLOWED_N : s ? BB_WEST_PILLOWED_S : BB_WEST_PILLOWED;
                        }
                    }
                }
                else return BB_BASE;
            }
        } else {
            return super.getShape(state, level, pos, context);
        }
    }
}
