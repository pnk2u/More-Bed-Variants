package de.pnku.mbdv.mixin;

import de.pnku.mbdv.block.MoreBedVariantBlock;
import de.pnku.mbdv.util.IBedShape;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.AbstractBedBlock;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.world.level.block.BedBlock.PART;

@Mixin(value = AbstractBedBlock.class)
public abstract class AbstractBedBlockMixin extends HorizontalDirectionalBlock implements IBedShape {

    protected AbstractBedBlockMixin(Properties properties) {
        super(properties);
    }

    @Inject(method = "updateShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/ScheduledTickAccess;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/block/state/BlockState;",
            at = @At("RETURN"), cancellable = true)
    public void injectedUpdateShapeAtReturn(BlockState state, LevelReader level, ScheduledTickAccess scheduledTickAccess, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random, CallbackInfoReturnable<BlockState> cir) {
        BlockState bed = cir.getReturnValue();
        BlockState north = level.getBlockState(pos.north(1));
        BlockState east = level.getBlockState(pos.east(1));
        BlockState south = level.getBlockState(pos.south(1));
        BlockState west = level.getBlockState(pos.west(1));

        if (bed.getBlock() instanceof BedBlock) {
            String bedWood;
            if ((bed.getBlock() instanceof MoreBedVariantBlock)) {
                bedWood = ((MoreBedVariantBlock) bed.getBlock()).bedWoodType;
            } else {
                bedWood = "oak";
            }
            if (north.getBlock() instanceof BedBlock && north.getValue(PART) == bed.getValue(PART) && north.getValue(FACING) == bed.getValue(FACING)) {
                String nWood;
                if (north.getBlock() instanceof MoreBedVariantBlock) {
                    nWood = ((MoreBedVariantBlock) north.getBlock()).bedWoodType;
                } else {
                    nWood = "oak";
                }
                bed = bed.setValue(mBedV$NORTH, (bedWood.equals(nWood)));
            } else {
                bed = bed.setValue(mBedV$NORTH, false);
            }
            if (east.getBlock() instanceof BedBlock && east.getValue(PART) == bed.getValue(PART) && east.getValue(FACING) == bed.getValue(FACING)) {
                String eWood;
                if (east.getBlock() instanceof MoreBedVariantBlock) {
                    eWood = ((MoreBedVariantBlock) east.getBlock()).bedWoodType;
                } else {
                    eWood = "oak";
                }
                bed = bed.setValue(mBedV$EAST, (bedWood.equals(eWood)));
            } else {
                bed = bed.setValue(mBedV$EAST, false);
            }
            if (south.getBlock() instanceof BedBlock && south.getValue(PART) == bed.getValue(PART) && south.getValue(FACING) == bed.getValue(FACING)) {
                String sWood;
                if (south.getBlock() instanceof MoreBedVariantBlock) {
                    sWood = ((MoreBedVariantBlock) south.getBlock()).bedWoodType;
                } else {
                    sWood = "oak";
                }
                bed = bed.setValue(mBedV$SOUTH, (bedWood.equals(sWood)));
            } else {
                bed = bed.setValue(mBedV$SOUTH, false);
            }
            if (west.getBlock() instanceof BedBlock && west.getValue(PART) == bed.getValue(PART) && west.getValue(FACING) == bed.getValue(FACING)) {
                String wWood;
                if (west.getBlock() instanceof MoreBedVariantBlock) {
                    wWood = ((MoreBedVariantBlock) west.getBlock()).bedWoodType;
                } else {
                    wWood = "oak";
                }
                bed = bed.setValue(mBedV$WEST, (bedWood.equals(wWood)));
            } else {
                bed = bed.setValue(mBedV$WEST, false);
            }
            cir.setReturnValue(bed);
        }
    }
}