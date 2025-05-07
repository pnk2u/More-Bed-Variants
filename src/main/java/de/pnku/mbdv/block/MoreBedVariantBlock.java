package de.pnku.mbdv.block;

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
import org.jetbrains.annotations.Nullable;

public class MoreBedVariantBlock extends BedBlock {
    public final String bedWoodType;
    public final String bedColor;

    public MoreBedVariantBlock(DyeColor dyeColour, MapColor mapColour, String bedWoodType, String bedColor) {
        super(dyeColour, Properties.ofFullCopy(Blocks.WHITE_BED).mapColor(mapColour).setId(ResourceKey.create(Registries.BLOCK, MoreBedVariants.withModId(bedWoodType + "_" + bedColor + "_bed"))));
        this.bedWoodType = bedWoodType;
        this.bedColor = bedColor;
        this.registerDefaultState(this.getStateDefinition().any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, false));
    }

    public MoreBedVariantBlock(DyeColor dyeColour, MapColor colour, SoundType sound, String bedWoodType, String bedColor) {
        super(dyeColour, Properties.ofFullCopy(Blocks.WHITE_BED).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreBedVariants.withModId(bedWoodType + "_" + bedColor + "_bed"))).sound(sound));
        this.bedWoodType = bedWoodType;
        this.bedColor = bedColor;
        this.registerDefaultState(this.getStateDefinition().any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, false));
    }

    @Override
    public @NotNull BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        if (this.bedWoodType.contains("bound_bamboo")){
            return new BoundBambooBedBlockEntity(pos, state);
        } else {
            return new MoreBedVariantBlockEntity(pos, state);
        }
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState neighborState, Direction face) {
        return face.getAxis() != Direction.Axis.Y && neighborState.getBlock() instanceof BedBlock;
    }

    @Override
    protected @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        if (this.bedWoodType.contains("bound_bamboo")){
            // From SlabBlock -> Bottom Shape
            return Block.box((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)8.0F, (double)16.0F);
        } else {
            Direction direction = getConnectedDirection(state).getOpposite();
            switch (direction) {
                case NORTH -> {
                    return NORTH_SHAPE;
                }
                case SOUTH -> {
                    return SOUTH_SHAPE;
                }
                case WEST -> {
                    return WEST_SHAPE;
                }
                default -> {
                    return EAST_SHAPE;
                }
            }
        }
    }
}