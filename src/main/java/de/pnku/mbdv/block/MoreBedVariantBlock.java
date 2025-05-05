package de.pnku.mbdv.block;

import com.mojang.math.OctahedralGroup;
import com.mojang.math.Quadrant;
import de.pnku.mbdv.MoreBedVariants;
import net.minecraft.Util;
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
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;


public class MoreBedVariantBlock extends BedBlock {
    public final String bedWoodType;
    public final String bedColor;

    private static final Map SHAPES;

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

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        if (this.bedWoodType.contains("bound_bamboo")){
            return new BoundBambooBedBlockEntity(pos, state);
        } else {
            return new MoreBedVariantBlockEntity(pos, state);
        }
    }
    /**
     * <b>Adapted from:</b> <i>BetterBeds</i> <br>
     * <b>Original Author:</b> <i>Motschen/TeamMidnightDust</i> <br>
     * <b>Source:</b> <a href="https://github.com/TeamMidnightDust/BetterBeds/blob/main/common/src/main/java/eu/midnightdust/betterbeds/mixin/MixinBedBlock.java">MixinBedBlock</a> <br>
     * <b>Description:</b> The following two methods (<code>getRenderShape</code> and <code>skipRendering</code>) have been adapted from <i>Motschen</i>'s <i>BetterBeds</i>. <br>
     **/
//            @Override
//            protected @NotNull RenderShape getRenderShape(BlockState state){
//                    return RenderShape.MODEL;
//            }

            @Override
            public boolean skipRendering(BlockState state, BlockState neighborState, Direction offset) {
                    return neighborState.getBlock() instanceof MoreBedVariantBlock || neighborState.getBlock() instanceof BedBlock;
            }
    /**/

    @Override
    protected @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        if (this.bedWoodType.contains("bound_bamboo")){
            // From SlabBlock -> Bottom Shape
            return Block.box((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)8.0F, (double)16.0F);
        } else {
            return (VoxelShape)SHAPES.get(getConnectedDirection(state).getOpposite());
        }
    }

    static {
        SHAPES = Util.make(() -> {
            VoxelShape voxelShape = Block.box((double)0.0F, (double)0.0F, (double)0.0F, (double)3.0F, (double)3.0F, (double)3.0F);
            VoxelShape voxelShape2 = Shapes.rotate(voxelShape, OctahedralGroup.fromXYAngles(Quadrant.R0, Quadrant.R90));
            return Shapes.rotateHorizontal(Shapes.or(Block.column((double)16.0F, (double)3.0F, (double)9.0F), new VoxelShape[]{voxelShape, voxelShape2}));
        });
    }
}