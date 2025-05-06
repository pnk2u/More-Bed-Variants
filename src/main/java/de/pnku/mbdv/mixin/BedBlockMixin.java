package de.pnku.mbdv.mixin;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BedBlock.class)
public abstract class BedBlockMixin extends HorizontalDirectionalBlock {

    protected BedBlockMixin(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull RenderShape getRenderShape(BlockState state){
        return RenderShape.MODEL;
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState neighborState, Direction face) {
        return face.getAxis() != Direction.Axis.Y && neighborState.getBlock() instanceof BedBlock;
    }
}