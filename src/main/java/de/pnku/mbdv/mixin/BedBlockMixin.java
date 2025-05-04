package de.pnku.mbdv.mixin;


import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

/**
 * <b>Adapted from:</b> <i>BetterBeds</i> <br>
 * <b>Original Author:</b> <i>Motschen/TeamMidnightDust</i> <br>
 * <b>Source:</b> <a href="https://github.com/TeamMidnightDust/BetterBeds/blob/main/common/src/main/java/eu/midnightdust/betterbeds/mixin/MixinBedBlock.java">MixinBedBlock</a> <br>
 * <b>Description:</b> This Mixin has been adapted from <i>Motschen</i>'s <i>BetterBeds</i>. <br>
 **/

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
    protected boolean skipRendering(BlockState state, BlockState neighborState, Direction offset) {
        return neighborState.getBlock() instanceof MoreBedVariantBlock || neighborState.getBlock() instanceof BedBlock;
    }
}