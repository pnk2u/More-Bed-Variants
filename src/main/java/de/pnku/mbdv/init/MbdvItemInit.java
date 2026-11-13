package de.pnku.mbdv.init;

import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColorCollection;
import org.apache.commons.lang3.function.TriFunction;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import static de.pnku.mbdv.init.MbdvBlockInit.*;

public class MbdvItemInit {
    public static final ColorCollection<Item> BIRCH_BED_ITEMS = registerColoredBedItems(BIRCH_BED_BLOCKS);
    public static final ColorCollection<Item> DARK_OAK_BED_ITEMS = registerColoredBedItems(DARK_OAK_BED_BLOCKS);
    public static final ColorCollection<Item> PALE_OAK_BED_ITEMS = registerColoredBedItems(PALE_OAK_BED_BLOCKS);
    public static final ColorCollection<Item> POPLAR_BED_ITEMS = registerColoredBedItems(POPLAR_BED_BLOCKS);
    public static final ColorCollection<Item> SPRUCE_BED_ITEMS = registerColoredBedItems(SPRUCE_BED_BLOCKS);
    public static final ColorCollection<Item> JUNGLE_BED_ITEMS = registerColoredBedItems(JUNGLE_BED_BLOCKS);
    public static final ColorCollection<Item> ACACIA_BED_ITEMS = registerColoredBedItems(ACACIA_BED_BLOCKS);
    public static final ColorCollection<Item> MANGROVE_BED_ITEMS = registerColoredBedItems(MANGROVE_BED_BLOCKS);
    public static final ColorCollection<Item> CHERRY_BED_ITEMS = registerColoredBedItems(CHERRY_BED_BLOCKS);
    public static final ColorCollection<Item> BAMBOO_BED_ITEMS = registerColoredBedItems(BAMBOO_BED_BLOCKS);
    public static final ColorCollection<Item> BOUND_BAMBOO_BED_ITEMS = registerColoredBoundBambooBedItems(BOUND_BAMBOO_BED_BLOCKS);
    public static final ColorCollection<Item> STRIPPED_BOUND_BAMBOO_BED_ITEMS = registerColoredBoundBambooBedItems(STRIPPED_BOUND_BAMBOO_BLOCKS);
    public static final ColorCollection<Item> CRIMSON_BED_ITEMS = registerColoredNetherWoodBedItems(CRIMSON_BED_BLOCKS);
    public static final ColorCollection<Item> WARPED_BED_ITEMS = registerColoredNetherWoodBedItems(WARPED_BED_BLOCKS);

    public static ColorCollection<Item> registerColoredBedItems(BedIdBlockColorCollection bedIdBlockColorCollection) {
        return registerColoredBedItems(bedIdBlockColorCollection, MbdvItemInit::itemFromBlock);
    }

    public static ColorCollection<Item> registerColoredBoundBambooBedItems(BedIdBlockColorCollection bedIdBlockColorCollection) {
        return registerColoredBedItems(bedIdBlockColorCollection, MbdvItemInit::itemFromBoundBambooBedBlock);
    }

    public static ColorCollection<Item> registerColoredNetherWoodBedItems(BedIdBlockColorCollection bedIdBlockColorCollection) {
        return registerColoredBedItems(bedIdBlockColorCollection, MbdvItemInit::itemFromNetherWoodBedBlock);
    }

    public static ColorCollection<Item> registerColoredBedItems(BedIdBlockColorCollection bedIdBlockColorCollection, BiFunction<Block, ResourceKey<Item>, Item> blockItemFactory) {
        return ColorCollection.registerBlockItems(
                bedIdBlockColorCollection.ids().ids(),
                bedIdBlockColorCollection.blocks(),
                (blockItemId, block, dyeColor) -> {
                    ResourceKey<Item> itemKey = blockItemId.item();
                    Identifier itemId = itemKey.identifier();
                    Item bedItem = blockItemFactory.apply(block, itemKey);
                    return dyeColor == DyeColor.WHITE ?
                            registerWhiteBedItem(bedItem, itemId, Items.BED.white())
                            : registerOtherBedItem(bedItem, itemId);
                });
    }

    public static BlockItem itemFromBlock(Block bedBlock, ResourceKey<Item> itemKey) {
        return itemFromBlock(bedBlock, itemKey, 1, false);
    }

    public static BlockItem itemFromBoundBambooBedBlock(Block bedBlock, ResourceKey<Item> itemKey) {
        return itemFromBlock(bedBlock, itemKey, 16, false);
    }

    public static BlockItem itemFromNetherWoodBedBlock(Block bedBlock, ResourceKey<Item> itemKey) {
        return itemFromBlock(bedBlock, itemKey, 1, true);
    }

    public static BlockItem itemFromBlock(Block bedBlock, ResourceKey<Item> itemKey, int maxStackSize, boolean isNetherWood) {
        return new BlockItem(bedBlock, setProperties(itemKey, maxStackSize, isNetherWood));
    }

    public static Item.Properties setProperties(ResourceKey<Item> itemKey, int maxStackSize, boolean isNetherWood) {
        Item.Properties bedProperties = new Item.Properties().stacksTo(maxStackSize).setId(itemKey).useBlockDescriptionPrefix();
        return isNetherWood ? bedProperties.fireResistant() : bedProperties;
    }

    public static List<Item> more_bed_items;

    public static void registerBedItems() {
        more_bed_items.add(Items.BED.white());
    }

    private static Item registerWhiteBedItem(Item whiteBed, Identifier id, Item bedAfter) {
        if (more_bed_items == null) {more_bed_items = new ArrayList<>();}
        Registry.register(BuiltInRegistries.ITEM, id, whiteBed);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> entries.insertAfter(bedAfter, whiteBed));
        more_bed_items.add(whiteBed);
        return whiteBed;
    }
    private static Item registerOtherBedItem (Item otherBed, Identifier id) {
        if (more_bed_items == null) {more_bed_items = new ArrayList<>();}
        Registry.register(BuiltInRegistries.ITEM, id, otherBed);
        more_bed_items.add(otherBed);
        return otherBed;
    }
}