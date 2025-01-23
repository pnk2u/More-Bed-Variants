package de.pnku.mbdv.block;

import de.pnku.mbdv.MoreBedVariants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BedBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class MoreBedVariantBlock extends BedBlock {
    public final String bedWoodType;
    public final String bedColor;

    public MoreBedVariantBlock(DyeColor dyeColour, MapColor mapColour, String bedWoodType, String bedColor) {
        super(dyeColour, Properties.ofFullCopy(Blocks.WHITE_BED).mapColor(mapColour).setId(ResourceKey.create(Registries.BLOCK, MoreBedVariants.asId(bedWoodType + "_" + bedColor + "_bed"))));
        this.bedWoodType = bedWoodType;
        this.bedColor = bedColor;
        this.registerDefaultState(this.getStateDefinition().any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, false));
    }

    public MoreBedVariantBlock(DyeColor dyeColour, MapColor colour, SoundType sound, String bedWoodType, String bedColor) {
        super(dyeColour, Properties.ofFullCopy(Blocks.WHITE_BED).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreBedVariants.asId(bedWoodType + "_" + bedColor + "_bed"))).sound(sound));
        this.bedWoodType = bedWoodType;
        this.bedColor = bedColor;
        this.registerDefaultState(this.getStateDefinition().any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, false));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        if (this.bedWoodType.contains("bound_bamboo")){
            return new BoundBambooBedBlockEntity(pos, state);
        } else {
            return new MoreBedVariantBlockEntity(pos, state);
        }
    }

    /*
     * Adapted from: BetterBeds
     * Original Author: Motschen/TeamMidnightDust
     * Source: https://github.com/TeamMidnightDust/BetterBeds/blob/main/common/src/main/java/eu/midnightdust/betterbeds/mixin/MixinBedBlock.java
     * Description: The following two methods have been adapted from TeamMidnightDust's BetterBeds.
     */
//            @Override
//            protected @NotNull RenderShape getRenderShape(BlockState state){
//                if (this.bedWoodType.contains("bound_bamboo")){
//                    return RenderShape.MODEL;
//                } else {
//                    return RenderShape.;
//                }
//            }

            @Override
            public boolean skipRendering(BlockState state, BlockState neighborState, Direction offset) {
                if (this.bedWoodType.contains("bound_bamboo")){
                    return neighborState.getBlock() instanceof MoreBedVariantBlock || neighborState.getBlock() instanceof BedBlock;
                } else {
                    return false;
                }
            }
    /**/

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

    public Item getPlanksItem(String planksWood) {
        switch (planksWood) {
            case "acacia" -> {
                return Items.ACACIA_PLANKS;
            }
            case "bamboo" -> {
                return Items.BAMBOO_PLANKS;
            }
            case "birch" -> {
                return Items.BIRCH_PLANKS;
            }
            case "cherry" -> {
                return Items.CHERRY_PLANKS;
            }
            case "crimson" -> {
                return Items.CRIMSON_PLANKS;
            }
            case "dark_oak" -> {
                return Items.DARK_OAK_PLANKS;
            }
            case "pale_oak" -> {
                return Items.PALE_OAK_PLANKS;
            }
            case "jungle" -> {
                return Items.JUNGLE_PLANKS;
            }
            case "mangrove" -> {
                return Items.MANGROVE_PLANKS;
            }
            case "spruce" -> {
                return Items.SPRUCE_PLANKS;
            }
            case "warped" -> {
                return Items.WARPED_PLANKS;
            }

        }
        return null;
    }
    public Block getPlanksBlock(String planksWood) {
        switch (planksWood) {
            case "acacia" -> {
                return Blocks.ACACIA_PLANKS;
            }
            case "bamboo" -> {
                return Blocks.BAMBOO_PLANKS;
            }
            case "birch" -> {
                return Blocks.BIRCH_PLANKS;
            }
            case "cherry" -> {
                return Blocks.CHERRY_PLANKS;
            }
            case "crimson" -> {
                return Blocks.CRIMSON_PLANKS;
            }
            case "dark_oak" -> {
                return Blocks.DARK_OAK_PLANKS;
            }
            case "pale_oak" -> {
                return Blocks.PALE_OAK_PLANKS;
            }
            case "jungle" -> {
                return Blocks.JUNGLE_PLANKS;
            }
            case "mangrove" -> {
                return Blocks.MANGROVE_PLANKS;
            }
            case "spruce" -> {
                return Blocks.SPRUCE_PLANKS;
            }
            case "warped" -> {
                return Blocks.WARPED_PLANKS;
            }

        }
        return null;
    }
    public Item getWoolItem(String woolColor) {
        switch (woolColor) {
            case "white" -> { return Items.WHITE_WOOL; }
            case "orange" -> { return Items.ORANGE_WOOL; }
            case "magenta" -> { return Items.MAGENTA_WOOL; }
            case "light_blue" -> { return Items.LIGHT_BLUE_WOOL; }
            case "yellow" -> { return Items.YELLOW_WOOL; }
            case "lime" -> { return Items.LIME_WOOL; }
            case "pink" -> { return Items.PINK_WOOL; }
            case "gray" -> { return Items.GRAY_WOOL; }
            case "light_gray" -> { return Items.LIGHT_GRAY_WOOL; }
            case "cyan" -> { return Items.CYAN_WOOL; }
            case "purple" -> { return Items.PURPLE_WOOL; }
            case "blue" -> { return Items.BLUE_WOOL; }
            case "brown" -> { return Items.BROWN_WOOL; }
            case "green" -> { return Items.GREEN_WOOL; }
            case "red" -> { return Items.RED_WOOL; }
            case "black" -> { return Items.BLACK_WOOL; }
        }
        return null;
    }
    public Item getDyeItem(String dyeColor) {
        switch (dyeColor) {
            case "white" -> { return Items.WHITE_DYE; }
            case "orange" -> { return Items.ORANGE_DYE; }
            case "magenta" -> { return Items.MAGENTA_DYE; }
            case "light_blue" -> { return Items.LIGHT_BLUE_DYE; }
            case "yellow" -> { return Items.YELLOW_DYE; }
            case "lime" -> { return Items.LIME_DYE; }
            case "pink" -> { return Items.PINK_DYE; }
            case "gray" -> { return Items.GRAY_DYE; }
            case "light_gray" -> { return Items.LIGHT_GRAY_DYE; }
            case "cyan" -> { return Items.CYAN_DYE; }
            case "purple" -> { return Items.PURPLE_DYE; }
            case "blue" -> { return Items.BLUE_DYE; }
            case "brown" -> { return Items.BROWN_DYE; }
            case "green" -> { return Items.GREEN_DYE; }
            case "red" -> { return Items.RED_DYE; }
            case "black" -> { return Items.BLACK_DYE; }
        }
        return null;
    }
    public Block getWoolBlock(String woolColor) {
        switch (woolColor) {
            case "white" -> { return Blocks.WHITE_WOOL; }
            case "orange" -> { return Blocks.ORANGE_WOOL; }
            case "magenta" -> { return Blocks.MAGENTA_WOOL; }
            case "light_blue" -> { return Blocks.LIGHT_BLUE_WOOL; }
            case "yellow" -> { return Blocks.YELLOW_WOOL; }
            case "lime" -> { return Blocks.LIME_WOOL; }
            case "pink" -> { return Blocks.PINK_WOOL; }
            case "gray" -> { return Blocks.GRAY_WOOL; }
            case "light_gray" -> { return Blocks.LIGHT_GRAY_WOOL; }
            case "cyan" -> { return Blocks.CYAN_WOOL; }
            case "purple" -> { return Blocks.PURPLE_WOOL; }
            case "blue" -> { return Blocks.BLUE_WOOL; }
            case "brown" -> { return Blocks.BROWN_WOOL; }
            case "green" -> { return Blocks.GREEN_WOOL; }
            case "red" -> { return Blocks.RED_WOOL; }
            case "black" -> { return Blocks.BLACK_WOOL; }
        }
        return null;
    }
}