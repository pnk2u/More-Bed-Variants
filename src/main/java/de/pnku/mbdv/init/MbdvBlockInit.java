package de.pnku.mbdv.init;

import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.block.BoundBambooBedBlockEntity;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import de.pnku.mbdv.block.MoreBedVariantBlockEntity;
import de.pnku.mbdv.poi.MbdvPointOfInterestTypes;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColorCollection;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class MbdvBlockInit {
    public static final BedIdColorCollection BIRCH_BED_IDS = createColoredBedIds("birch");
    public static final BedIdColorCollection DARK_OAK_BED_IDS = createColoredBedIds("dark_oak");
    public static final BedIdColorCollection PALE_OAK_BED_IDS = createColoredBedIds("pale_oak");
    public static final BedIdColorCollection POPLAR_BED_IDS = createColoredBedIds("poplar");
    public static final BedIdColorCollection SPRUCE_BED_IDS = createColoredBedIds("spruce");
    public static final BedIdColorCollection JUNGLE_BED_IDS = createColoredBedIds("jungle");
    public static final BedIdColorCollection ACACIA_BED_IDS = createColoredBedIds("acacia");
    public static final BedIdColorCollection MANGROVE_BED_IDS = createColoredBedIds("mangrove");
    public static final BedIdColorCollection CHERRY_BED_IDS = createColoredBedIds("cherry");
    public static final BedIdColorCollection BAMBOO_BED_IDS = createColoredBedIds("bamboo");
    public static final BedIdColorCollection BOUND_BAMBOO_BED_IDS = createColoredBedIds("bound_bamboo");
    public static final BedIdColorCollection STRIPPED_BOUND_BAMBOO_BED_IDS = createColoredBedIds("stripped_bound_bamboo");
    public static final BedIdColorCollection CRIMSON_BED_IDS = createColoredBedIds("crimson");
    public static final BedIdColorCollection WARPED_BED_IDS = createColoredBedIds("warped");

    public static final BedIdBlockColorCollection BIRCH_BED_BLOCKS = registerColoredBedBlocks(BIRCH_BED_IDS);
    public static final BedIdBlockColorCollection DARK_OAK_BED_BLOCKS = registerColoredBedBlocks(DARK_OAK_BED_IDS);
    public static final BedIdBlockColorCollection PALE_OAK_BED_BLOCKS = registerColoredBedBlocks(PALE_OAK_BED_IDS);
    public static final BedIdBlockColorCollection POPLAR_BED_BLOCKS = registerColoredBedBlocks(POPLAR_BED_IDS);
    public static final BedIdBlockColorCollection SPRUCE_BED_BLOCKS = registerColoredBedBlocks(SPRUCE_BED_IDS);
    public static final BedIdBlockColorCollection JUNGLE_BED_BLOCKS = registerColoredBedBlocks(JUNGLE_BED_IDS);
    public static final BedIdBlockColorCollection ACACIA_BED_BLOCKS = registerColoredBedBlocks(ACACIA_BED_IDS);
    public static final BedIdBlockColorCollection MANGROVE_BED_BLOCKS = registerColoredBedBlocks(MANGROVE_BED_IDS);
    public static final BedIdBlockColorCollection CHERRY_BED_BLOCKS = registerColoredBedBlocks(CHERRY_BED_IDS, SoundType.CHERRY_WOOD);
    public static final BedIdBlockColorCollection BAMBOO_BED_BLOCKS = registerColoredBedBlocks(BAMBOO_BED_IDS, SoundType.BAMBOO_WOOD);
    public static final BedIdBlockColorCollection BOUND_BAMBOO_BED_BLOCKS = registerColoredBoundBambooBedBlocks(BOUND_BAMBOO_BED_IDS);
    public static final BedIdBlockColorCollection STRIPPED_BOUND_BAMBOO_BLOCKS = registerColoredBoundBambooBedBlocks(STRIPPED_BOUND_BAMBOO_BED_IDS);
    public static final BedIdBlockColorCollection CRIMSON_BED_BLOCKS = registerColoredBedBlocks(CRIMSON_BED_IDS, SoundType.NETHER_WOOD);
    public static final BedIdBlockColorCollection WARPED_BED_BLOCKS = registerColoredBedBlocks(WARPED_BED_IDS, SoundType.NETHER_WOOD);

    private static BedIdColorCollection createColoredBedIds(String woodType) {
        return new BedIdColorCollection(woodType, prefixWithColorAndWoodType(ColorCollection.create("bed"), woodType).map(MbdvBlockInit::createBlockItemId));
    }

    public static ColorCollection<String> prefixWithColorAndWoodType(final ColorCollection<String> ids, String woodType) {
        return ColorCollection.zipMap(ColorCollection.NAMES, ids, (color, id) -> woodType + "_" + color + "_" + id);
    }

    public static BlockItemId createBlockItemId(String bedName) {
        Identifier id = MoreBedVariants.withModId(bedName);
        return BlockItemId.create(id, id);
    }

    public static BedIdBlockColorCollection registerColoredBedBlocks(BedIdColorCollection bedIds) {
        return registerColoredBedBlocks(bedIds, SoundType.WOOD, MbdvBlockInit::registerBedBlock);
    }


    public static BedIdBlockColorCollection registerColoredBedBlocks(BedIdColorCollection bedIds, SoundType sound) {
        return registerColoredBedBlocks(bedIds, sound, MbdvBlockInit::registerBedBlock);
    }

    public static BedIdBlockColorCollection registerColoredBedBlocks(BedIdColorCollection bedIds, SoundType sound,
                                                                     BiFunction<BlockItemId, MoreBedVariantBlock, Block> registerFunction) {
        return new BedIdBlockColorCollection(
                bedIds,
                ColorCollection.zipMap(
                ColorCollection.VALUES,
                bedIds.ids,
                (color, id) -> registerFunction.apply(
                        id,
                        new MoreBedVariantBlock(color, sound, bedIds.bedWoodType))
        ));
    }

    public static BedIdBlockColorCollection registerColoredBoundBambooBedBlocks(BedIdColorCollection bedIds) {
        return registerColoredBedBlocks(bedIds, SoundType.BAMBOO_WOOD, MbdvBlockInit::registerBoundBambooBedBlock);
    }

    public record BedIdColorCollection(String bedWoodType, ColorCollection<BlockItemId> ids) {}
    public record BedIdBlockColorCollection(BedIdColorCollection ids, ColorCollection<Block> blocks) {}


    public static BlockEntityType<MoreBedVariantBlockEntity> MORE_BED_VARIANT_BLOCK_ENTITY;
    public static BlockEntityType<BoundBambooBedBlockEntity> BOUND_BAMBOO_BED_BLOCK_ENTITY;

    public static List<Block> more_beds;
    public static List<Block> more_bound_bamboo_beds;

    public static void registerBedBlockEntityTypes() {
        List<Block> planks_beds = more_beds; planks_beds.removeAll(more_bound_bamboo_beds);
        MORE_BED_VARIANT_BLOCK_ENTITY =
                Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                        MoreBedVariants.withModId("more_bed_variants"),
                        FabricBlockEntityTypeBuilder.create(MoreBedVariantBlockEntity::new, planks_beds.toArray(Block[]::new))
                                .build());
        BOUND_BAMBOO_BED_BLOCK_ENTITY =
                Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                        MoreBedVariants.withModId("more_bound_bamboo_beds"),
                        FabricBlockEntityTypeBuilder.create(BoundBambooBedBlockEntity::new, more_bound_bamboo_beds.toArray(Block[]::new))
                                .build());

    }

    private static Block registerBedBlock(BlockItemId id, Block bed) {
        if (more_beds == null) {more_beds = new ArrayList<>();}
        Registry.register(BuiltInRegistries.BLOCK, id.block(), bed);
        more_beds.add(bed);
        MbdvPointOfInterestTypes.registerBedHeadAsPoiBlock(bed);
        return bed;
    }

    private static Block registerBoundBambooBedBlock(BlockItemId id, MoreBedVariantBlock bed) {
        if (more_bound_bamboo_beds == null) {more_bound_bamboo_beds = new ArrayList<>();}
        more_bound_bamboo_beds.add(bed);
        registerBedBlock(id, bed);
        return bed;
    }
}
