package de.pnku.mbdv.init;

import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.core.Registry;

import java.util.ArrayList;
import java.util.List;

import static de.pnku.mbdv.init.MbdvBlockInit.*;

public class MbdvItemInit {
    // WHITE
    public static final BlockItem BIRCH_WHITE_BED_I = itemFromBlock(BIRCH_WHITE_BED);
    public static final BlockItem DARK_OAK_WHITE_BED_I = itemFromBlock(DARK_OAK_WHITE_BED);
    public static final BlockItem PALE_OAK_WHITE_BED_I = itemFromBlock(PALE_OAK_WHITE_BED);
    public static final BlockItem SPRUCE_WHITE_BED_I = itemFromBlock(SPRUCE_WHITE_BED);
    public static final BlockItem JUNGLE_WHITE_BED_I = itemFromBlock(JUNGLE_WHITE_BED);
    public static final BlockItem ACACIA_WHITE_BED_I = itemFromBlock(ACACIA_WHITE_BED);
    public static final BlockItem MANGROVE_WHITE_BED_I = itemFromBlock(MANGROVE_WHITE_BED);
    public static final BlockItem CHERRY_WHITE_BED_I = itemFromBlock(CHERRY_WHITE_BED);
    public static final BlockItem BAMBOO_WHITE_BED_I = itemFromBlock(BAMBOO_WHITE_BED);
    public static final BlockItem CRIMSON_WHITE_BED_I = itemFromBlock(CRIMSON_WHITE_BED);
    public static final BlockItem WARPED_WHITE_BED_I = itemFromBlock(WARPED_WHITE_BED);
    // ORANGE
    public static final BlockItem ACACIA_ORANGE_BED_I = itemFromBlock(ACACIA_ORANGE_BED);
    public static final BlockItem BIRCH_ORANGE_BED_I = itemFromBlock(BIRCH_ORANGE_BED);
    public static final BlockItem BAMBOO_ORANGE_BED_I = itemFromBlock(BAMBOO_ORANGE_BED);
    public static final BlockItem CHERRY_ORANGE_BED_I = itemFromBlock(CHERRY_ORANGE_BED);
    public static final BlockItem CRIMSON_ORANGE_BED_I = itemFromBlock(CRIMSON_ORANGE_BED);
    public static final BlockItem DARK_OAK_ORANGE_BED_I = itemFromBlock(DARK_OAK_ORANGE_BED);
    public static final BlockItem PALE_OAK_ORANGE_BED_I = itemFromBlock(PALE_OAK_ORANGE_BED);
    public static final BlockItem JUNGLE_ORANGE_BED_I = itemFromBlock(JUNGLE_ORANGE_BED);
    public static final BlockItem MANGROVE_ORANGE_BED_I = itemFromBlock(MANGROVE_ORANGE_BED);
    public static final BlockItem SPRUCE_ORANGE_BED_I = itemFromBlock(SPRUCE_ORANGE_BED);
    public static final BlockItem WARPED_ORANGE_BED_I = itemFromBlock(WARPED_ORANGE_BED);
    // MAGENTA
    public static final BlockItem ACACIA_MAGENTA_BED_I = itemFromBlock(ACACIA_MAGENTA_BED);
    public static final BlockItem BIRCH_MAGENTA_BED_I = itemFromBlock(BIRCH_MAGENTA_BED);
    public static final BlockItem BAMBOO_MAGENTA_BED_I = itemFromBlock(BAMBOO_MAGENTA_BED);
    public static final BlockItem CHERRY_MAGENTA_BED_I = itemFromBlock(CHERRY_MAGENTA_BED);
    public static final BlockItem CRIMSON_MAGENTA_BED_I = itemFromBlock(CRIMSON_MAGENTA_BED);
    public static final BlockItem DARK_OAK_MAGENTA_BED_I = itemFromBlock(DARK_OAK_MAGENTA_BED);
    public static final BlockItem PALE_OAK_MAGENTA_BED_I = itemFromBlock(PALE_OAK_MAGENTA_BED);
    public static final BlockItem JUNGLE_MAGENTA_BED_I = itemFromBlock(JUNGLE_MAGENTA_BED);
    public static final BlockItem MANGROVE_MAGENTA_BED_I = itemFromBlock(MANGROVE_MAGENTA_BED);
    public static final BlockItem SPRUCE_MAGENTA_BED_I = itemFromBlock(SPRUCE_MAGENTA_BED);
    public static final BlockItem WARPED_MAGENTA_BED_I = itemFromBlock(WARPED_MAGENTA_BED);
    // LIGHT_BLUE
    public static final BlockItem ACACIA_LIGHT_BLUE_BED_I = itemFromBlock(ACACIA_LIGHT_BLUE_BED);
    public static final BlockItem BIRCH_LIGHT_BLUE_BED_I = itemFromBlock(BIRCH_LIGHT_BLUE_BED);
    public static final BlockItem BAMBOO_LIGHT_BLUE_BED_I = itemFromBlock(BAMBOO_LIGHT_BLUE_BED);
    public static final BlockItem CHERRY_LIGHT_BLUE_BED_I = itemFromBlock(CHERRY_LIGHT_BLUE_BED);
    public static final BlockItem CRIMSON_LIGHT_BLUE_BED_I = itemFromBlock(CRIMSON_LIGHT_BLUE_BED);
    public static final BlockItem DARK_OAK_LIGHT_BLUE_BED_I = itemFromBlock(DARK_OAK_LIGHT_BLUE_BED);
    public static final BlockItem PALE_OAK_LIGHT_BLUE_BED_I = itemFromBlock(PALE_OAK_LIGHT_BLUE_BED);
    public static final BlockItem JUNGLE_LIGHT_BLUE_BED_I = itemFromBlock(JUNGLE_LIGHT_BLUE_BED);
    public static final BlockItem MANGROVE_LIGHT_BLUE_BED_I = itemFromBlock(MANGROVE_LIGHT_BLUE_BED);
    public static final BlockItem SPRUCE_LIGHT_BLUE_BED_I = itemFromBlock(SPRUCE_LIGHT_BLUE_BED);
    public static final BlockItem WARPED_LIGHT_BLUE_BED_I = itemFromBlock(WARPED_LIGHT_BLUE_BED);
    // YELLOW
    public static final BlockItem ACACIA_YELLOW_BED_I = itemFromBlock(ACACIA_YELLOW_BED);
    public static final BlockItem BIRCH_YELLOW_BED_I = itemFromBlock(BIRCH_YELLOW_BED);
    public static final BlockItem BAMBOO_YELLOW_BED_I = itemFromBlock(BAMBOO_YELLOW_BED);
    public static final BlockItem CHERRY_YELLOW_BED_I = itemFromBlock(CHERRY_YELLOW_BED);
    public static final BlockItem CRIMSON_YELLOW_BED_I = itemFromBlock(CRIMSON_YELLOW_BED);
    public static final BlockItem DARK_OAK_YELLOW_BED_I = itemFromBlock(DARK_OAK_YELLOW_BED);
    public static final BlockItem PALE_OAK_YELLOW_BED_I = itemFromBlock(PALE_OAK_YELLOW_BED);
    public static final BlockItem JUNGLE_YELLOW_BED_I = itemFromBlock(JUNGLE_YELLOW_BED);
    public static final BlockItem MANGROVE_YELLOW_BED_I = itemFromBlock(MANGROVE_YELLOW_BED);
    public static final BlockItem SPRUCE_YELLOW_BED_I = itemFromBlock(SPRUCE_YELLOW_BED);
    public static final BlockItem WARPED_YELLOW_BED_I = itemFromBlock(WARPED_YELLOW_BED);
    // LIME
    public static final BlockItem ACACIA_LIME_BED_I = itemFromBlock(ACACIA_LIME_BED);
    public static final BlockItem BIRCH_LIME_BED_I = itemFromBlock(BIRCH_LIME_BED);
    public static final BlockItem BAMBOO_LIME_BED_I = itemFromBlock(BAMBOO_LIME_BED);
    public static final BlockItem CHERRY_LIME_BED_I = itemFromBlock(CHERRY_LIME_BED);
    public static final BlockItem CRIMSON_LIME_BED_I = itemFromBlock(CRIMSON_LIME_BED);
    public static final BlockItem DARK_OAK_LIME_BED_I = itemFromBlock(DARK_OAK_LIME_BED);
    public static final BlockItem PALE_OAK_LIME_BED_I = itemFromBlock(PALE_OAK_LIME_BED);
    public static final BlockItem JUNGLE_LIME_BED_I = itemFromBlock(JUNGLE_LIME_BED);
    public static final BlockItem MANGROVE_LIME_BED_I = itemFromBlock(MANGROVE_LIME_BED);
    public static final BlockItem SPRUCE_LIME_BED_I = itemFromBlock(SPRUCE_LIME_BED);
    public static final BlockItem WARPED_LIME_BED_I = itemFromBlock(WARPED_LIME_BED);
    // PINK
    public static final BlockItem ACACIA_PINK_BED_I = itemFromBlock(ACACIA_PINK_BED);
    public static final BlockItem BIRCH_PINK_BED_I = itemFromBlock(BIRCH_PINK_BED);
    public static final BlockItem BAMBOO_PINK_BED_I = itemFromBlock(BAMBOO_PINK_BED);
    public static final BlockItem CHERRY_PINK_BED_I = itemFromBlock(CHERRY_PINK_BED);
    public static final BlockItem CRIMSON_PINK_BED_I = itemFromBlock(CRIMSON_PINK_BED);
    public static final BlockItem DARK_OAK_PINK_BED_I = itemFromBlock(DARK_OAK_PINK_BED);
    public static final BlockItem PALE_OAK_PINK_BED_I = itemFromBlock(PALE_OAK_PINK_BED);
    public static final BlockItem JUNGLE_PINK_BED_I = itemFromBlock(JUNGLE_PINK_BED);
    public static final BlockItem MANGROVE_PINK_BED_I = itemFromBlock(MANGROVE_PINK_BED);
    public static final BlockItem SPRUCE_PINK_BED_I = itemFromBlock(SPRUCE_PINK_BED);
    public static final BlockItem WARPED_PINK_BED_I = itemFromBlock(WARPED_PINK_BED);
    // GRAY
    public static final BlockItem ACACIA_GRAY_BED_I = itemFromBlock(ACACIA_GRAY_BED);
    public static final BlockItem BIRCH_GRAY_BED_I = itemFromBlock(BIRCH_GRAY_BED);
    public static final BlockItem BAMBOO_GRAY_BED_I = itemFromBlock(BAMBOO_GRAY_BED);
    public static final BlockItem CHERRY_GRAY_BED_I = itemFromBlock(CHERRY_GRAY_BED);
    public static final BlockItem CRIMSON_GRAY_BED_I = itemFromBlock(CRIMSON_GRAY_BED);
    public static final BlockItem DARK_OAK_GRAY_BED_I = itemFromBlock(DARK_OAK_GRAY_BED);
    public static final BlockItem PALE_OAK_GRAY_BED_I = itemFromBlock(PALE_OAK_GRAY_BED);
    public static final BlockItem JUNGLE_GRAY_BED_I = itemFromBlock(JUNGLE_GRAY_BED);
    public static final BlockItem MANGROVE_GRAY_BED_I = itemFromBlock(MANGROVE_GRAY_BED);
    public static final BlockItem SPRUCE_GRAY_BED_I = itemFromBlock(SPRUCE_GRAY_BED);
    public static final BlockItem WARPED_GRAY_BED_I = itemFromBlock(WARPED_GRAY_BED);
    // LIGHT_GRAY
    public static final BlockItem ACACIA_LIGHT_GRAY_BED_I = itemFromBlock(ACACIA_LIGHT_GRAY_BED);
    public static final BlockItem BIRCH_LIGHT_GRAY_BED_I = itemFromBlock(BIRCH_LIGHT_GRAY_BED);
    public static final BlockItem BAMBOO_LIGHT_GRAY_BED_I = itemFromBlock(BAMBOO_LIGHT_GRAY_BED);
    public static final BlockItem CHERRY_LIGHT_GRAY_BED_I = itemFromBlock(CHERRY_LIGHT_GRAY_BED);
    public static final BlockItem CRIMSON_LIGHT_GRAY_BED_I = itemFromBlock(CRIMSON_LIGHT_GRAY_BED);
    public static final BlockItem DARK_OAK_LIGHT_GRAY_BED_I = itemFromBlock(DARK_OAK_LIGHT_GRAY_BED);
    public static final BlockItem PALE_OAK_LIGHT_GRAY_BED_I = itemFromBlock(PALE_OAK_LIGHT_GRAY_BED);
    public static final BlockItem JUNGLE_LIGHT_GRAY_BED_I = itemFromBlock(JUNGLE_LIGHT_GRAY_BED);
    public static final BlockItem MANGROVE_LIGHT_GRAY_BED_I = itemFromBlock(MANGROVE_LIGHT_GRAY_BED);
    public static final BlockItem SPRUCE_LIGHT_GRAY_BED_I = itemFromBlock(SPRUCE_LIGHT_GRAY_BED);
    public static final BlockItem WARPED_LIGHT_GRAY_BED_I = itemFromBlock(WARPED_LIGHT_GRAY_BED);
    // CYAN
    public static final BlockItem ACACIA_CYAN_BED_I = itemFromBlock(ACACIA_CYAN_BED);
    public static final BlockItem BIRCH_CYAN_BED_I = itemFromBlock(BIRCH_CYAN_BED);
    public static final BlockItem BAMBOO_CYAN_BED_I = itemFromBlock(BAMBOO_CYAN_BED);
    public static final BlockItem CHERRY_CYAN_BED_I = itemFromBlock(CHERRY_CYAN_BED);
    public static final BlockItem CRIMSON_CYAN_BED_I = itemFromBlock(CRIMSON_CYAN_BED);
    public static final BlockItem DARK_OAK_CYAN_BED_I = itemFromBlock(DARK_OAK_CYAN_BED);
    public static final BlockItem PALE_OAK_CYAN_BED_I = itemFromBlock(PALE_OAK_CYAN_BED);
    public static final BlockItem JUNGLE_CYAN_BED_I = itemFromBlock(JUNGLE_CYAN_BED);
    public static final BlockItem MANGROVE_CYAN_BED_I = itemFromBlock(MANGROVE_CYAN_BED);
    public static final BlockItem SPRUCE_CYAN_BED_I = itemFromBlock(SPRUCE_CYAN_BED);
    public static final BlockItem WARPED_CYAN_BED_I = itemFromBlock(WARPED_CYAN_BED);
    // PURPLE
    public static final BlockItem ACACIA_PURPLE_BED_I = itemFromBlock(ACACIA_PURPLE_BED);
    public static final BlockItem BIRCH_PURPLE_BED_I = itemFromBlock(BIRCH_PURPLE_BED);
    public static final BlockItem BAMBOO_PURPLE_BED_I = itemFromBlock(BAMBOO_PURPLE_BED);
    public static final BlockItem CHERRY_PURPLE_BED_I = itemFromBlock(CHERRY_PURPLE_BED);
    public static final BlockItem CRIMSON_PURPLE_BED_I = itemFromBlock(CRIMSON_PURPLE_BED);
    public static final BlockItem DARK_OAK_PURPLE_BED_I = itemFromBlock(DARK_OAK_PURPLE_BED);
    public static final BlockItem PALE_OAK_PURPLE_BED_I = itemFromBlock(PALE_OAK_PURPLE_BED);
    public static final BlockItem JUNGLE_PURPLE_BED_I = itemFromBlock(JUNGLE_PURPLE_BED);
    public static final BlockItem MANGROVE_PURPLE_BED_I = itemFromBlock(MANGROVE_PURPLE_BED);
    public static final BlockItem SPRUCE_PURPLE_BED_I = itemFromBlock(SPRUCE_PURPLE_BED);
    public static final BlockItem WARPED_PURPLE_BED_I = itemFromBlock(WARPED_PURPLE_BED);
    // BLUE
    public static final BlockItem ACACIA_BLUE_BED_I = itemFromBlock(ACACIA_BLUE_BED);
    public static final BlockItem BIRCH_BLUE_BED_I = itemFromBlock(BIRCH_BLUE_BED);
    public static final BlockItem BAMBOO_BLUE_BED_I = itemFromBlock(BAMBOO_BLUE_BED);
    public static final BlockItem CHERRY_BLUE_BED_I = itemFromBlock(CHERRY_BLUE_BED);
    public static final BlockItem CRIMSON_BLUE_BED_I = itemFromBlock(CRIMSON_BLUE_BED);
    public static final BlockItem DARK_OAK_BLUE_BED_I = itemFromBlock(DARK_OAK_BLUE_BED);
    public static final BlockItem PALE_OAK_BLUE_BED_I = itemFromBlock(PALE_OAK_BLUE_BED);
    public static final BlockItem JUNGLE_BLUE_BED_I = itemFromBlock(JUNGLE_BLUE_BED);
    public static final BlockItem MANGROVE_BLUE_BED_I = itemFromBlock(MANGROVE_BLUE_BED);
    public static final BlockItem SPRUCE_BLUE_BED_I = itemFromBlock(SPRUCE_BLUE_BED);
    public static final BlockItem WARPED_BLUE_BED_I = itemFromBlock(WARPED_BLUE_BED);
    // BROWN
    public static final BlockItem ACACIA_BROWN_BED_I = itemFromBlock(ACACIA_BROWN_BED);
    public static final BlockItem BIRCH_BROWN_BED_I = itemFromBlock(BIRCH_BROWN_BED);
    public static final BlockItem BAMBOO_BROWN_BED_I = itemFromBlock(BAMBOO_BROWN_BED);
    public static final BlockItem CHERRY_BROWN_BED_I = itemFromBlock(CHERRY_BROWN_BED);
    public static final BlockItem CRIMSON_BROWN_BED_I = itemFromBlock(CRIMSON_BROWN_BED);
    public static final BlockItem DARK_OAK_BROWN_BED_I = itemFromBlock(DARK_OAK_BROWN_BED);
    public static final BlockItem PALE_OAK_BROWN_BED_I = itemFromBlock(PALE_OAK_BROWN_BED);
    public static final BlockItem JUNGLE_BROWN_BED_I = itemFromBlock(JUNGLE_BROWN_BED);
    public static final BlockItem MANGROVE_BROWN_BED_I = itemFromBlock(MANGROVE_BROWN_BED);
    public static final BlockItem SPRUCE_BROWN_BED_I = itemFromBlock(SPRUCE_BROWN_BED);
    public static final BlockItem WARPED_BROWN_BED_I = itemFromBlock(WARPED_BROWN_BED);
    // GREEN
    public static final BlockItem ACACIA_GREEN_BED_I = itemFromBlock(ACACIA_GREEN_BED);
    public static final BlockItem BIRCH_GREEN_BED_I = itemFromBlock(BIRCH_GREEN_BED);
    public static final BlockItem BAMBOO_GREEN_BED_I = itemFromBlock(BAMBOO_GREEN_BED);
    public static final BlockItem CHERRY_GREEN_BED_I = itemFromBlock(CHERRY_GREEN_BED);
    public static final BlockItem CRIMSON_GREEN_BED_I = itemFromBlock(CRIMSON_GREEN_BED);
    public static final BlockItem DARK_OAK_GREEN_BED_I = itemFromBlock(DARK_OAK_GREEN_BED);
    public static final BlockItem PALE_OAK_GREEN_BED_I = itemFromBlock(PALE_OAK_GREEN_BED);
    public static final BlockItem JUNGLE_GREEN_BED_I = itemFromBlock(JUNGLE_GREEN_BED);
    public static final BlockItem MANGROVE_GREEN_BED_I = itemFromBlock(MANGROVE_GREEN_BED);
    public static final BlockItem SPRUCE_GREEN_BED_I = itemFromBlock(SPRUCE_GREEN_BED);
    public static final BlockItem WARPED_GREEN_BED_I = itemFromBlock(WARPED_GREEN_BED);
    // RED
    public static final BlockItem ACACIA_RED_BED_I = itemFromBlock(ACACIA_RED_BED);
    public static final BlockItem BIRCH_RED_BED_I = itemFromBlock(BIRCH_RED_BED);
    public static final BlockItem BAMBOO_RED_BED_I = itemFromBlock(BAMBOO_RED_BED);
    public static final BlockItem CHERRY_RED_BED_I = itemFromBlock(CHERRY_RED_BED);
    public static final BlockItem CRIMSON_RED_BED_I = itemFromBlock(CRIMSON_RED_BED);
    public static final BlockItem DARK_OAK_RED_BED_I = itemFromBlock(DARK_OAK_RED_BED);
    public static final BlockItem PALE_OAK_RED_BED_I = itemFromBlock(PALE_OAK_RED_BED);
    public static final BlockItem JUNGLE_RED_BED_I = itemFromBlock(JUNGLE_RED_BED);
    public static final BlockItem MANGROVE_RED_BED_I = itemFromBlock(MANGROVE_RED_BED);
    public static final BlockItem SPRUCE_RED_BED_I = itemFromBlock(SPRUCE_RED_BED);
    public static final BlockItem WARPED_RED_BED_I = itemFromBlock(WARPED_RED_BED);
    // BLACK
    public static final BlockItem ACACIA_BLACK_BED_I = itemFromBlock(ACACIA_BLACK_BED);
    public static final BlockItem BIRCH_BLACK_BED_I = itemFromBlock(BIRCH_BLACK_BED);
    public static final BlockItem BAMBOO_BLACK_BED_I = itemFromBlock(BAMBOO_BLACK_BED);
    public static final BlockItem CHERRY_BLACK_BED_I = itemFromBlock(CHERRY_BLACK_BED);
    public static final BlockItem CRIMSON_BLACK_BED_I = itemFromBlock(CRIMSON_BLACK_BED);
    public static final BlockItem DARK_OAK_BLACK_BED_I = itemFromBlock(DARK_OAK_BLACK_BED);
    public static final BlockItem PALE_OAK_BLACK_BED_I = itemFromBlock(PALE_OAK_BLACK_BED);
    public static final BlockItem JUNGLE_BLACK_BED_I = itemFromBlock(JUNGLE_BLACK_BED);
    public static final BlockItem MANGROVE_BLACK_BED_I = itemFromBlock(MANGROVE_BLACK_BED);
    public static final BlockItem SPRUCE_BLACK_BED_I = itemFromBlock(SPRUCE_BLACK_BED);
    public static final BlockItem WARPED_BLACK_BED_I = itemFromBlock(WARPED_BLACK_BED);

    public static BlockItem itemFromBlock(MoreBedVariantBlock moreBedVariantBlock) {
        return new BlockItem(moreBedVariantBlock, setProperties(moreBedVariantBlock));
    }

    public static Item.Properties setProperties(MoreBedVariantBlock moreBedVariantBlock) {
        return new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM,BuiltInRegistries.BLOCK.getKey(moreBedVariantBlock))).useBlockDescriptionPrefix();
    }

    public static final List<BlockItem> more_bed_items = new ArrayList<>();

    public static void registerBedItems() {
        registerWhiteBedItem(BIRCH_WHITE_BED_I, Items.WHITE_BED);
        registerWhiteBedItem(DARK_OAK_WHITE_BED_I, BIRCH_WHITE_BED_I);
        registerWhiteBedItem(PALE_OAK_WHITE_BED_I, DARK_OAK_WHITE_BED_I);
        registerWhiteBedItem(SPRUCE_WHITE_BED_I, PALE_OAK_WHITE_BED_I);
        registerWhiteBedItem(JUNGLE_WHITE_BED_I, SPRUCE_WHITE_BED_I);
        registerWhiteBedItem(ACACIA_WHITE_BED_I, JUNGLE_WHITE_BED_I);
        registerWhiteBedItem(MANGROVE_WHITE_BED_I, ACACIA_WHITE_BED_I);
        registerWhiteBedItem(CHERRY_WHITE_BED_I, MANGROVE_WHITE_BED_I);
        registerWhiteBedItem(BAMBOO_WHITE_BED_I, CHERRY_WHITE_BED_I);
        registerWhiteBedItem(CRIMSON_WHITE_BED_I, BAMBOO_WHITE_BED_I);
        registerWhiteBedItem(WARPED_WHITE_BED_I, CRIMSON_WHITE_BED_I);
        // LIGHT_GRAY
        registerOtherBedItem(ACACIA_LIGHT_GRAY_BED_I); registerOtherBedItem(BAMBOO_LIGHT_GRAY_BED_I); registerOtherBedItem(BIRCH_LIGHT_GRAY_BED_I); registerOtherBedItem(CHERRY_LIGHT_GRAY_BED_I); registerOtherBedItem(CRIMSON_LIGHT_GRAY_BED_I); registerOtherBedItem(DARK_OAK_LIGHT_GRAY_BED_I); registerOtherBedItem(PALE_OAK_LIGHT_GRAY_BED_I); registerOtherBedItem(JUNGLE_LIGHT_GRAY_BED_I); registerOtherBedItem(MANGROVE_LIGHT_GRAY_BED_I); registerOtherBedItem(SPRUCE_LIGHT_GRAY_BED_I); registerOtherBedItem(WARPED_LIGHT_GRAY_BED_I);
        // GRAY
        registerOtherBedItem(ACACIA_GRAY_BED_I); registerOtherBedItem(BAMBOO_GRAY_BED_I); registerOtherBedItem(BIRCH_GRAY_BED_I); registerOtherBedItem(CHERRY_GRAY_BED_I); registerOtherBedItem(CRIMSON_GRAY_BED_I); registerOtherBedItem(DARK_OAK_GRAY_BED_I); registerOtherBedItem(PALE_OAK_GRAY_BED_I); registerOtherBedItem(JUNGLE_GRAY_BED_I); registerOtherBedItem(MANGROVE_GRAY_BED_I); registerOtherBedItem(SPRUCE_GRAY_BED_I); registerOtherBedItem(WARPED_GRAY_BED_I);
        // BLACK
        registerOtherBedItem(ACACIA_BLACK_BED_I); registerOtherBedItem(BAMBOO_BLACK_BED_I); registerOtherBedItem(BIRCH_BLACK_BED_I); registerOtherBedItem(CHERRY_BLACK_BED_I); registerOtherBedItem(CRIMSON_BLACK_BED_I); registerOtherBedItem(DARK_OAK_BLACK_BED_I); registerOtherBedItem(PALE_OAK_BLACK_BED_I); registerOtherBedItem(JUNGLE_BLACK_BED_I); registerOtherBedItem(MANGROVE_BLACK_BED_I); registerOtherBedItem(SPRUCE_BLACK_BED_I); registerOtherBedItem(WARPED_BLACK_BED_I);
        // BROWN
        registerOtherBedItem(ACACIA_BROWN_BED_I); registerOtherBedItem(BAMBOO_BROWN_BED_I); registerOtherBedItem(BIRCH_BROWN_BED_I); registerOtherBedItem(CHERRY_BROWN_BED_I); registerOtherBedItem(CRIMSON_BROWN_BED_I); registerOtherBedItem(DARK_OAK_BROWN_BED_I); registerOtherBedItem(PALE_OAK_BROWN_BED_I); registerOtherBedItem(JUNGLE_BROWN_BED_I); registerOtherBedItem(MANGROVE_BROWN_BED_I); registerOtherBedItem(SPRUCE_BROWN_BED_I); registerOtherBedItem(WARPED_BROWN_BED_I);
        // RED
        registerOtherBedItem(ACACIA_RED_BED_I); registerOtherBedItem(BAMBOO_RED_BED_I); registerOtherBedItem(BIRCH_RED_BED_I); registerOtherBedItem(CHERRY_RED_BED_I); registerOtherBedItem(CRIMSON_RED_BED_I); registerOtherBedItem(DARK_OAK_RED_BED_I); registerOtherBedItem(PALE_OAK_RED_BED_I); registerOtherBedItem(JUNGLE_RED_BED_I); registerOtherBedItem(MANGROVE_RED_BED_I); registerOtherBedItem(SPRUCE_RED_BED_I); registerOtherBedItem(WARPED_RED_BED_I);
        // ORANGE
        registerOtherBedItem(ACACIA_ORANGE_BED_I); registerOtherBedItem(BAMBOO_ORANGE_BED_I); registerOtherBedItem(BIRCH_ORANGE_BED_I); registerOtherBedItem(CHERRY_ORANGE_BED_I); registerOtherBedItem(CRIMSON_ORANGE_BED_I); registerOtherBedItem(DARK_OAK_ORANGE_BED_I); registerOtherBedItem(PALE_OAK_ORANGE_BED_I); registerOtherBedItem(JUNGLE_ORANGE_BED_I); registerOtherBedItem(MANGROVE_ORANGE_BED_I); registerOtherBedItem(SPRUCE_ORANGE_BED_I); registerOtherBedItem(WARPED_ORANGE_BED_I);
        // YELLOW
        registerOtherBedItem(ACACIA_YELLOW_BED_I); registerOtherBedItem(BAMBOO_YELLOW_BED_I); registerOtherBedItem(BIRCH_YELLOW_BED_I); registerOtherBedItem(CHERRY_YELLOW_BED_I); registerOtherBedItem(CRIMSON_YELLOW_BED_I); registerOtherBedItem(DARK_OAK_YELLOW_BED_I); registerOtherBedItem(PALE_OAK_YELLOW_BED_I); registerOtherBedItem(JUNGLE_YELLOW_BED_I); registerOtherBedItem(MANGROVE_YELLOW_BED_I); registerOtherBedItem(SPRUCE_YELLOW_BED_I); registerOtherBedItem(WARPED_YELLOW_BED_I);
        // LIME
        registerOtherBedItem(ACACIA_LIME_BED_I); registerOtherBedItem(BAMBOO_LIME_BED_I); registerOtherBedItem(BIRCH_LIME_BED_I); registerOtherBedItem(CHERRY_LIME_BED_I); registerOtherBedItem(CRIMSON_LIME_BED_I); registerOtherBedItem(DARK_OAK_LIME_BED_I); registerOtherBedItem(PALE_OAK_LIME_BED_I); registerOtherBedItem(JUNGLE_LIME_BED_I); registerOtherBedItem(MANGROVE_LIME_BED_I); registerOtherBedItem(SPRUCE_LIME_BED_I); registerOtherBedItem(WARPED_LIME_BED_I);
        // GREEN
        registerOtherBedItem(ACACIA_GREEN_BED_I); registerOtherBedItem(BAMBOO_GREEN_BED_I); registerOtherBedItem(BIRCH_GREEN_BED_I); registerOtherBedItem(CHERRY_GREEN_BED_I); registerOtherBedItem(CRIMSON_GREEN_BED_I); registerOtherBedItem(DARK_OAK_GREEN_BED_I); registerOtherBedItem(PALE_OAK_GREEN_BED_I); registerOtherBedItem(JUNGLE_GREEN_BED_I); registerOtherBedItem(MANGROVE_GREEN_BED_I); registerOtherBedItem(SPRUCE_GREEN_BED_I); registerOtherBedItem(WARPED_GREEN_BED_I);
        // CYAN
        registerOtherBedItem(ACACIA_CYAN_BED_I); registerOtherBedItem(BAMBOO_CYAN_BED_I); registerOtherBedItem(BIRCH_CYAN_BED_I); registerOtherBedItem(CHERRY_CYAN_BED_I); registerOtherBedItem(CRIMSON_CYAN_BED_I); registerOtherBedItem(DARK_OAK_CYAN_BED_I); registerOtherBedItem(PALE_OAK_CYAN_BED_I); registerOtherBedItem(JUNGLE_CYAN_BED_I); registerOtherBedItem(MANGROVE_CYAN_BED_I); registerOtherBedItem(SPRUCE_CYAN_BED_I); registerOtherBedItem(WARPED_CYAN_BED_I);
        // LIGHT_BLUE
        registerOtherBedItem(ACACIA_LIGHT_BLUE_BED_I); registerOtherBedItem(BAMBOO_LIGHT_BLUE_BED_I); registerOtherBedItem(BIRCH_LIGHT_BLUE_BED_I); registerOtherBedItem(CHERRY_LIGHT_BLUE_BED_I); registerOtherBedItem(CRIMSON_LIGHT_BLUE_BED_I); registerOtherBedItem(DARK_OAK_LIGHT_BLUE_BED_I); registerOtherBedItem(PALE_OAK_LIGHT_BLUE_BED_I); registerOtherBedItem(JUNGLE_LIGHT_BLUE_BED_I); registerOtherBedItem(MANGROVE_LIGHT_BLUE_BED_I); registerOtherBedItem(SPRUCE_LIGHT_BLUE_BED_I); registerOtherBedItem(WARPED_LIGHT_BLUE_BED_I);
        // BLUE
        registerOtherBedItem(ACACIA_BLUE_BED_I); registerOtherBedItem(BAMBOO_BLUE_BED_I); registerOtherBedItem(BIRCH_BLUE_BED_I); registerOtherBedItem(CHERRY_BLUE_BED_I); registerOtherBedItem(CRIMSON_BLUE_BED_I); registerOtherBedItem(DARK_OAK_BLUE_BED_I); registerOtherBedItem(PALE_OAK_BLUE_BED_I); registerOtherBedItem(JUNGLE_BLUE_BED_I); registerOtherBedItem(MANGROVE_BLUE_BED_I); registerOtherBedItem(SPRUCE_BLUE_BED_I); registerOtherBedItem(WARPED_BLUE_BED_I);
        // PURPLE
        registerOtherBedItem(ACACIA_PURPLE_BED_I); registerOtherBedItem(BAMBOO_PURPLE_BED_I); registerOtherBedItem(BIRCH_PURPLE_BED_I); registerOtherBedItem(CHERRY_PURPLE_BED_I); registerOtherBedItem(CRIMSON_PURPLE_BED_I); registerOtherBedItem(DARK_OAK_PURPLE_BED_I); registerOtherBedItem(PALE_OAK_PURPLE_BED_I); registerOtherBedItem(JUNGLE_PURPLE_BED_I); registerOtherBedItem(MANGROVE_PURPLE_BED_I); registerOtherBedItem(SPRUCE_PURPLE_BED_I); registerOtherBedItem(WARPED_PURPLE_BED_I);
        // MAGENTA
        registerOtherBedItem(ACACIA_MAGENTA_BED_I); registerOtherBedItem(BAMBOO_MAGENTA_BED_I); registerOtherBedItem(BIRCH_MAGENTA_BED_I); registerOtherBedItem(CHERRY_MAGENTA_BED_I); registerOtherBedItem(CRIMSON_MAGENTA_BED_I); registerOtherBedItem(DARK_OAK_MAGENTA_BED_I); registerOtherBedItem(PALE_OAK_MAGENTA_BED_I); registerOtherBedItem(JUNGLE_MAGENTA_BED_I); registerOtherBedItem(MANGROVE_MAGENTA_BED_I); registerOtherBedItem(SPRUCE_MAGENTA_BED_I); registerOtherBedItem(WARPED_MAGENTA_BED_I);
        // PINK
        registerOtherBedItem(ACACIA_PINK_BED_I); registerOtherBedItem(BAMBOO_PINK_BED_I); registerOtherBedItem(BIRCH_PINK_BED_I); registerOtherBedItem(CHERRY_PINK_BED_I); registerOtherBedItem(CRIMSON_PINK_BED_I); registerOtherBedItem(DARK_OAK_PINK_BED_I); registerOtherBedItem(PALE_OAK_PINK_BED_I); registerOtherBedItem(JUNGLE_PINK_BED_I); registerOtherBedItem(MANGROVE_PINK_BED_I); registerOtherBedItem(SPRUCE_PINK_BED_I); registerOtherBedItem(WARPED_PINK_BED_I);

    }

    private static void registerWhiteBedItem(BlockItem whiteBed, Item bedAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreBedVariants.asId(((MoreBedVariantBlock) whiteBed.getBlock()).bedWoodType + "_" + ((MoreBedVariantBlock) whiteBed.getBlock()).bedColor + "_bed"), whiteBed);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> entries.addAfter(bedAfter, whiteBed));
        more_bed_items.add(whiteBed);
    }
    private static void registerOtherBedItem (BlockItem otherBed) {
        Registry.register(BuiltInRegistries.ITEM, MoreBedVariants.asId(((MoreBedVariantBlock) otherBed.getBlock()).bedWoodType + "_" + ((MoreBedVariantBlock) otherBed.getBlock()).bedColor + "_bed"), otherBed);

        more_bed_items.add(otherBed);
    }
}