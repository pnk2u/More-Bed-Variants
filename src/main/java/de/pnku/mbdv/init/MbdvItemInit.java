package de.pnku.mbdv.init;

import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.minecraft.core.Registry;

import java.util.ArrayList;
import java.util.List;

public class MbdvItemInit {

    public static final Item.Properties bedProperties = new Item.Properties().stacksTo(1);
    public static final Item.Properties boundBambooBedProperties = new Item.Properties().stacksTo(16);

    // WHITE
    public static final Item BIRCH_WHITE_BED_I = new BedItem(MbdvBlockInit.BIRCH_WHITE_BED, bedProperties);
    public static final Item DARK_OAK_WHITE_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_WHITE_BED, bedProperties);
    public static final Item SPRUCE_WHITE_BED_I = new BedItem(MbdvBlockInit.SPRUCE_WHITE_BED, bedProperties);
    public static final Item JUNGLE_WHITE_BED_I = new BedItem(MbdvBlockInit.JUNGLE_WHITE_BED, bedProperties);
    public static final Item ACACIA_WHITE_BED_I = new BedItem(MbdvBlockInit.ACACIA_WHITE_BED, bedProperties);
    public static final Item MANGROVE_WHITE_BED_I = new BedItem(MbdvBlockInit.MANGROVE_WHITE_BED, bedProperties);
    public static final Item CHERRY_WHITE_BED_I = new BedItem(MbdvBlockInit.CHERRY_WHITE_BED, bedProperties);
    public static final Item BAMBOO_WHITE_BED_I = new BedItem(MbdvBlockInit.BAMBOO_WHITE_BED, bedProperties);
    public static final Item BOUND_BAMBOO_WHITE_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_WHITE_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_WHITE_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_WHITE_BED, boundBambooBedProperties);
    public static final Item CRIMSON_WHITE_BED_I = new BedItem(MbdvBlockInit.CRIMSON_WHITE_BED, bedProperties);
    public static final Item WARPED_WHITE_BED_I = new BedItem(MbdvBlockInit.WARPED_WHITE_BED, bedProperties);
    // ORANGE
    public static final Item ACACIA_ORANGE_BED_I = new BedItem(MbdvBlockInit.ACACIA_ORANGE_BED, bedProperties);
    public static final Item BIRCH_ORANGE_BED_I = new BedItem(MbdvBlockInit.BIRCH_ORANGE_BED, bedProperties);
    public static final Item BAMBOO_ORANGE_BED_I = new BedItem(MbdvBlockInit.BAMBOO_ORANGE_BED, bedProperties);
    public static final Item BOUND_BAMBOO_ORANGE_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_ORANGE_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_ORANGE_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_ORANGE_BED, boundBambooBedProperties);
    public static final Item CHERRY_ORANGE_BED_I = new BedItem(MbdvBlockInit.CHERRY_ORANGE_BED, bedProperties);
    public static final Item CRIMSON_ORANGE_BED_I = new BedItem(MbdvBlockInit.CRIMSON_ORANGE_BED, bedProperties);
    public static final Item DARK_OAK_ORANGE_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_ORANGE_BED, bedProperties);
    public static final Item JUNGLE_ORANGE_BED_I = new BedItem(MbdvBlockInit.JUNGLE_ORANGE_BED, bedProperties);
    public static final Item MANGROVE_ORANGE_BED_I = new BedItem(MbdvBlockInit.MANGROVE_ORANGE_BED, bedProperties);
    public static final Item SPRUCE_ORANGE_BED_I = new BedItem(MbdvBlockInit.SPRUCE_ORANGE_BED, bedProperties);
    public static final Item WARPED_ORANGE_BED_I = new BedItem(MbdvBlockInit.WARPED_ORANGE_BED, bedProperties);
    // MAGENTA
    public static final Item ACACIA_MAGENTA_BED_I = new BedItem(MbdvBlockInit.ACACIA_MAGENTA_BED, bedProperties);
    public static final Item BIRCH_MAGENTA_BED_I = new BedItem(MbdvBlockInit.BIRCH_MAGENTA_BED, bedProperties);
    public static final Item BAMBOO_MAGENTA_BED_I = new BedItem(MbdvBlockInit.BAMBOO_MAGENTA_BED, bedProperties);
    public static final Item BOUND_BAMBOO_MAGENTA_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_MAGENTA_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_MAGENTA_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_MAGENTA_BED, boundBambooBedProperties);
    public static final Item CHERRY_MAGENTA_BED_I = new BedItem(MbdvBlockInit.CHERRY_MAGENTA_BED, bedProperties);
    public static final Item CRIMSON_MAGENTA_BED_I = new BedItem(MbdvBlockInit.CRIMSON_MAGENTA_BED, bedProperties);
    public static final Item DARK_OAK_MAGENTA_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_MAGENTA_BED, bedProperties);
    public static final Item JUNGLE_MAGENTA_BED_I = new BedItem(MbdvBlockInit.JUNGLE_MAGENTA_BED, bedProperties);
    public static final Item MANGROVE_MAGENTA_BED_I = new BedItem(MbdvBlockInit.MANGROVE_MAGENTA_BED, bedProperties);
    public static final Item SPRUCE_MAGENTA_BED_I = new BedItem(MbdvBlockInit.SPRUCE_MAGENTA_BED, bedProperties);
    public static final Item WARPED_MAGENTA_BED_I = new BedItem(MbdvBlockInit.WARPED_MAGENTA_BED, bedProperties);
    // LIGHT_BLUE
    public static final Item ACACIA_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.ACACIA_LIGHT_BLUE_BED, bedProperties);
    public static final Item BIRCH_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.BIRCH_LIGHT_BLUE_BED, bedProperties);
    public static final Item BAMBOO_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.BAMBOO_LIGHT_BLUE_BED, bedProperties);
    public static final Item BOUND_BAMBOO_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_LIGHT_BLUE_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_LIGHT_BLUE_BED, boundBambooBedProperties);
    public static final Item CHERRY_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.CHERRY_LIGHT_BLUE_BED, bedProperties);
    public static final Item CRIMSON_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.CRIMSON_LIGHT_BLUE_BED, bedProperties);
    public static final Item DARK_OAK_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_LIGHT_BLUE_BED, bedProperties);
    public static final Item JUNGLE_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.JUNGLE_LIGHT_BLUE_BED, bedProperties);
    public static final Item MANGROVE_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.MANGROVE_LIGHT_BLUE_BED, bedProperties);
    public static final Item SPRUCE_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.SPRUCE_LIGHT_BLUE_BED, bedProperties);
    public static final Item WARPED_LIGHT_BLUE_BED_I = new BedItem(MbdvBlockInit.WARPED_LIGHT_BLUE_BED, bedProperties);
    // YELLOW
    public static final Item ACACIA_YELLOW_BED_I = new BedItem(MbdvBlockInit.ACACIA_YELLOW_BED, bedProperties);
    public static final Item BIRCH_YELLOW_BED_I = new BedItem(MbdvBlockInit.BIRCH_YELLOW_BED, bedProperties);
    public static final Item BAMBOO_YELLOW_BED_I = new BedItem(MbdvBlockInit.BAMBOO_YELLOW_BED, bedProperties);
    public static final Item BOUND_BAMBOO_YELLOW_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_YELLOW_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_YELLOW_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_YELLOW_BED, boundBambooBedProperties);
    public static final Item CHERRY_YELLOW_BED_I = new BedItem(MbdvBlockInit.CHERRY_YELLOW_BED, bedProperties);
    public static final Item CRIMSON_YELLOW_BED_I = new BedItem(MbdvBlockInit.CRIMSON_YELLOW_BED, bedProperties);
    public static final Item DARK_OAK_YELLOW_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_YELLOW_BED, bedProperties);
    public static final Item JUNGLE_YELLOW_BED_I = new BedItem(MbdvBlockInit.JUNGLE_YELLOW_BED, bedProperties);
    public static final Item MANGROVE_YELLOW_BED_I = new BedItem(MbdvBlockInit.MANGROVE_YELLOW_BED, bedProperties);
    public static final Item SPRUCE_YELLOW_BED_I = new BedItem(MbdvBlockInit.SPRUCE_YELLOW_BED, bedProperties);
    public static final Item WARPED_YELLOW_BED_I = new BedItem(MbdvBlockInit.WARPED_YELLOW_BED, bedProperties);
    // LIME
    public static final Item ACACIA_LIME_BED_I = new BedItem(MbdvBlockInit.ACACIA_LIME_BED, bedProperties);
    public static final Item BIRCH_LIME_BED_I = new BedItem(MbdvBlockInit.BIRCH_LIME_BED, bedProperties);
    public static final Item BAMBOO_LIME_BED_I = new BedItem(MbdvBlockInit.BAMBOO_LIME_BED, bedProperties);
    public static final Item BOUND_BAMBOO_LIME_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_LIME_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_LIME_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_LIME_BED, boundBambooBedProperties);
    public static final Item CHERRY_LIME_BED_I = new BedItem(MbdvBlockInit.CHERRY_LIME_BED, bedProperties);
    public static final Item CRIMSON_LIME_BED_I = new BedItem(MbdvBlockInit.CRIMSON_LIME_BED, bedProperties);
    public static final Item DARK_OAK_LIME_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_LIME_BED, bedProperties);
    public static final Item JUNGLE_LIME_BED_I = new BedItem(MbdvBlockInit.JUNGLE_LIME_BED, bedProperties);
    public static final Item MANGROVE_LIME_BED_I = new BedItem(MbdvBlockInit.MANGROVE_LIME_BED, bedProperties);
    public static final Item SPRUCE_LIME_BED_I = new BedItem(MbdvBlockInit.SPRUCE_LIME_BED, bedProperties);
    public static final Item WARPED_LIME_BED_I = new BedItem(MbdvBlockInit.WARPED_LIME_BED, bedProperties);
    // PINK
    public static final Item ACACIA_PINK_BED_I = new BedItem(MbdvBlockInit.ACACIA_PINK_BED, bedProperties);
    public static final Item BIRCH_PINK_BED_I = new BedItem(MbdvBlockInit.BIRCH_PINK_BED, bedProperties);
    public static final Item BAMBOO_PINK_BED_I = new BedItem(MbdvBlockInit.BAMBOO_PINK_BED, bedProperties);
    public static final Item BOUND_BAMBOO_PINK_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_PINK_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_PINK_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_PINK_BED, boundBambooBedProperties);
    public static final Item CHERRY_PINK_BED_I = new BedItem(MbdvBlockInit.CHERRY_PINK_BED, bedProperties);
    public static final Item CRIMSON_PINK_BED_I = new BedItem(MbdvBlockInit.CRIMSON_PINK_BED, bedProperties);
    public static final Item DARK_OAK_PINK_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_PINK_BED, bedProperties);
    public static final Item JUNGLE_PINK_BED_I = new BedItem(MbdvBlockInit.JUNGLE_PINK_BED, bedProperties);
    public static final Item MANGROVE_PINK_BED_I = new BedItem(MbdvBlockInit.MANGROVE_PINK_BED, bedProperties);
    public static final Item SPRUCE_PINK_BED_I = new BedItem(MbdvBlockInit.SPRUCE_PINK_BED, bedProperties);
    public static final Item WARPED_PINK_BED_I = new BedItem(MbdvBlockInit.WARPED_PINK_BED, bedProperties);
    // GRAY
    public static final Item ACACIA_GRAY_BED_I = new BedItem(MbdvBlockInit.ACACIA_GRAY_BED, bedProperties);
    public static final Item BIRCH_GRAY_BED_I = new BedItem(MbdvBlockInit.BIRCH_GRAY_BED, bedProperties);
    public static final Item BAMBOO_GRAY_BED_I = new BedItem(MbdvBlockInit.BAMBOO_GRAY_BED, bedProperties);
    public static final Item BOUND_BAMBOO_GRAY_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_GRAY_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_GRAY_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_GRAY_BED, boundBambooBedProperties);
    public static final Item CHERRY_GRAY_BED_I = new BedItem(MbdvBlockInit.CHERRY_GRAY_BED, bedProperties);
    public static final Item CRIMSON_GRAY_BED_I = new BedItem(MbdvBlockInit.CRIMSON_GRAY_BED, bedProperties);
    public static final Item DARK_OAK_GRAY_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_GRAY_BED, bedProperties);
    public static final Item JUNGLE_GRAY_BED_I = new BedItem(MbdvBlockInit.JUNGLE_GRAY_BED, bedProperties);
    public static final Item MANGROVE_GRAY_BED_I = new BedItem(MbdvBlockInit.MANGROVE_GRAY_BED, bedProperties);
    public static final Item SPRUCE_GRAY_BED_I = new BedItem(MbdvBlockInit.SPRUCE_GRAY_BED, bedProperties);
    public static final Item WARPED_GRAY_BED_I = new BedItem(MbdvBlockInit.WARPED_GRAY_BED, bedProperties);
    // LIGHT_GRAY
    public static final Item ACACIA_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.ACACIA_LIGHT_GRAY_BED, bedProperties);
    public static final Item BIRCH_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.BIRCH_LIGHT_GRAY_BED, bedProperties);
    public static final Item BAMBOO_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.BAMBOO_LIGHT_GRAY_BED, bedProperties);
    public static final Item BOUND_BAMBOO_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_LIGHT_GRAY_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_LIGHT_GRAY_BED, boundBambooBedProperties);
    public static final Item CHERRY_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.CHERRY_LIGHT_GRAY_BED, bedProperties);
    public static final Item CRIMSON_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.CRIMSON_LIGHT_GRAY_BED, bedProperties);
    public static final Item DARK_OAK_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_LIGHT_GRAY_BED, bedProperties);
    public static final Item JUNGLE_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.JUNGLE_LIGHT_GRAY_BED, bedProperties);
    public static final Item MANGROVE_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.MANGROVE_LIGHT_GRAY_BED, bedProperties);
    public static final Item SPRUCE_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.SPRUCE_LIGHT_GRAY_BED, bedProperties);
    public static final Item WARPED_LIGHT_GRAY_BED_I = new BedItem(MbdvBlockInit.WARPED_LIGHT_GRAY_BED, bedProperties);
    // CYAN
    public static final Item ACACIA_CYAN_BED_I = new BedItem(MbdvBlockInit.ACACIA_CYAN_BED, bedProperties);
    public static final Item BIRCH_CYAN_BED_I = new BedItem(MbdvBlockInit.BIRCH_CYAN_BED, bedProperties);
    public static final Item BAMBOO_CYAN_BED_I = new BedItem(MbdvBlockInit.BAMBOO_CYAN_BED, bedProperties);
    public static final Item BOUND_BAMBOO_CYAN_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_CYAN_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_CYAN_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_CYAN_BED, boundBambooBedProperties);
    public static final Item CHERRY_CYAN_BED_I = new BedItem(MbdvBlockInit.CHERRY_CYAN_BED, bedProperties);
    public static final Item CRIMSON_CYAN_BED_I = new BedItem(MbdvBlockInit.CRIMSON_CYAN_BED, bedProperties);
    public static final Item DARK_OAK_CYAN_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_CYAN_BED, bedProperties);
    public static final Item JUNGLE_CYAN_BED_I = new BedItem(MbdvBlockInit.JUNGLE_CYAN_BED, bedProperties);
    public static final Item MANGROVE_CYAN_BED_I = new BedItem(MbdvBlockInit.MANGROVE_CYAN_BED, bedProperties);
    public static final Item SPRUCE_CYAN_BED_I = new BedItem(MbdvBlockInit.SPRUCE_CYAN_BED, bedProperties);
    public static final Item WARPED_CYAN_BED_I = new BedItem(MbdvBlockInit.WARPED_CYAN_BED, bedProperties);
    // PURPLE
    public static final Item ACACIA_PURPLE_BED_I = new BedItem(MbdvBlockInit.ACACIA_PURPLE_BED, bedProperties);
    public static final Item BIRCH_PURPLE_BED_I = new BedItem(MbdvBlockInit.BIRCH_PURPLE_BED, bedProperties);
    public static final Item BAMBOO_PURPLE_BED_I = new BedItem(MbdvBlockInit.BAMBOO_PURPLE_BED, bedProperties);
    public static final Item BOUND_BAMBOO_PURPLE_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_PURPLE_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_PURPLE_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_PURPLE_BED, boundBambooBedProperties);
    public static final Item CHERRY_PURPLE_BED_I = new BedItem(MbdvBlockInit.CHERRY_PURPLE_BED, bedProperties);
    public static final Item CRIMSON_PURPLE_BED_I = new BedItem(MbdvBlockInit.CRIMSON_PURPLE_BED, bedProperties);
    public static final Item DARK_OAK_PURPLE_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_PURPLE_BED, bedProperties);
    public static final Item JUNGLE_PURPLE_BED_I = new BedItem(MbdvBlockInit.JUNGLE_PURPLE_BED, bedProperties);
    public static final Item MANGROVE_PURPLE_BED_I = new BedItem(MbdvBlockInit.MANGROVE_PURPLE_BED, bedProperties);
    public static final Item SPRUCE_PURPLE_BED_I = new BedItem(MbdvBlockInit.SPRUCE_PURPLE_BED, bedProperties);
    public static final Item WARPED_PURPLE_BED_I = new BedItem(MbdvBlockInit.WARPED_PURPLE_BED, bedProperties);
    // BLUE
    public static final Item ACACIA_BLUE_BED_I = new BedItem(MbdvBlockInit.ACACIA_BLUE_BED, bedProperties);
    public static final Item BIRCH_BLUE_BED_I = new BedItem(MbdvBlockInit.BIRCH_BLUE_BED, bedProperties);
    public static final Item BAMBOO_BLUE_BED_I = new BedItem(MbdvBlockInit.BAMBOO_BLUE_BED, bedProperties);
    public static final Item BOUND_BAMBOO_BLUE_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_BLUE_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_BLUE_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_BLUE_BED, boundBambooBedProperties);
    public static final Item CHERRY_BLUE_BED_I = new BedItem(MbdvBlockInit.CHERRY_BLUE_BED, bedProperties);
    public static final Item CRIMSON_BLUE_BED_I = new BedItem(MbdvBlockInit.CRIMSON_BLUE_BED, bedProperties);
    public static final Item DARK_OAK_BLUE_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_BLUE_BED, bedProperties);
    public static final Item JUNGLE_BLUE_BED_I = new BedItem(MbdvBlockInit.JUNGLE_BLUE_BED, bedProperties);
    public static final Item MANGROVE_BLUE_BED_I = new BedItem(MbdvBlockInit.MANGROVE_BLUE_BED, bedProperties);
    public static final Item SPRUCE_BLUE_BED_I = new BedItem(MbdvBlockInit.SPRUCE_BLUE_BED, bedProperties);
    public static final Item WARPED_BLUE_BED_I = new BedItem(MbdvBlockInit.WARPED_BLUE_BED, bedProperties);
    // BROWN
    public static final Item ACACIA_BROWN_BED_I = new BedItem(MbdvBlockInit.ACACIA_BROWN_BED, bedProperties);
    public static final Item BIRCH_BROWN_BED_I = new BedItem(MbdvBlockInit.BIRCH_BROWN_BED, bedProperties);
    public static final Item BAMBOO_BROWN_BED_I = new BedItem(MbdvBlockInit.BAMBOO_BROWN_BED, bedProperties);
    public static final Item BOUND_BAMBOO_BROWN_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_BROWN_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_BROWN_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_BROWN_BED, boundBambooBedProperties);
    public static final Item CHERRY_BROWN_BED_I = new BedItem(MbdvBlockInit.CHERRY_BROWN_BED, bedProperties);
    public static final Item CRIMSON_BROWN_BED_I = new BedItem(MbdvBlockInit.CRIMSON_BROWN_BED, bedProperties);
    public static final Item DARK_OAK_BROWN_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_BROWN_BED, bedProperties);
    public static final Item JUNGLE_BROWN_BED_I = new BedItem(MbdvBlockInit.JUNGLE_BROWN_BED, bedProperties);
    public static final Item MANGROVE_BROWN_BED_I = new BedItem(MbdvBlockInit.MANGROVE_BROWN_BED, bedProperties);
    public static final Item SPRUCE_BROWN_BED_I = new BedItem(MbdvBlockInit.SPRUCE_BROWN_BED, bedProperties);
    public static final Item WARPED_BROWN_BED_I = new BedItem(MbdvBlockInit.WARPED_BROWN_BED, bedProperties);
    // GREEN
    public static final Item ACACIA_GREEN_BED_I = new BedItem(MbdvBlockInit.ACACIA_GREEN_BED, bedProperties);
    public static final Item BIRCH_GREEN_BED_I = new BedItem(MbdvBlockInit.BIRCH_GREEN_BED, bedProperties);
    public static final Item BAMBOO_GREEN_BED_I = new BedItem(MbdvBlockInit.BAMBOO_GREEN_BED, bedProperties);
    public static final Item BOUND_BAMBOO_GREEN_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_GREEN_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_GREEN_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_GREEN_BED, boundBambooBedProperties);
    public static final Item CHERRY_GREEN_BED_I = new BedItem(MbdvBlockInit.CHERRY_GREEN_BED, bedProperties);
    public static final Item CRIMSON_GREEN_BED_I = new BedItem(MbdvBlockInit.CRIMSON_GREEN_BED, bedProperties);
    public static final Item DARK_OAK_GREEN_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_GREEN_BED, bedProperties);
    public static final Item JUNGLE_GREEN_BED_I = new BedItem(MbdvBlockInit.JUNGLE_GREEN_BED, bedProperties);
    public static final Item MANGROVE_GREEN_BED_I = new BedItem(MbdvBlockInit.MANGROVE_GREEN_BED, bedProperties);
    public static final Item SPRUCE_GREEN_BED_I = new BedItem(MbdvBlockInit.SPRUCE_GREEN_BED, bedProperties);
    public static final Item WARPED_GREEN_BED_I = new BedItem(MbdvBlockInit.WARPED_GREEN_BED, bedProperties);
    // RED
    public static final Item ACACIA_RED_BED_I = new BedItem(MbdvBlockInit.ACACIA_RED_BED, bedProperties);
    public static final Item BIRCH_RED_BED_I = new BedItem(MbdvBlockInit.BIRCH_RED_BED, bedProperties);
    public static final Item BAMBOO_RED_BED_I = new BedItem(MbdvBlockInit.BAMBOO_RED_BED, bedProperties);
    public static final Item BOUND_BAMBOO_RED_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_RED_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_RED_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_RED_BED, boundBambooBedProperties);
    public static final Item CHERRY_RED_BED_I = new BedItem(MbdvBlockInit.CHERRY_RED_BED, bedProperties);
    public static final Item CRIMSON_RED_BED_I = new BedItem(MbdvBlockInit.CRIMSON_RED_BED, bedProperties);
    public static final Item DARK_OAK_RED_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_RED_BED, bedProperties);
    public static final Item JUNGLE_RED_BED_I = new BedItem(MbdvBlockInit.JUNGLE_RED_BED, bedProperties);
    public static final Item MANGROVE_RED_BED_I = new BedItem(MbdvBlockInit.MANGROVE_RED_BED, bedProperties);
    public static final Item SPRUCE_RED_BED_I = new BedItem(MbdvBlockInit.SPRUCE_RED_BED, bedProperties);
    public static final Item WARPED_RED_BED_I = new BedItem(MbdvBlockInit.WARPED_RED_BED, bedProperties);
    // BLACK
    public static final Item ACACIA_BLACK_BED_I = new BedItem(MbdvBlockInit.ACACIA_BLACK_BED, bedProperties);
    public static final Item BIRCH_BLACK_BED_I = new BedItem(MbdvBlockInit.BIRCH_BLACK_BED, bedProperties);
    public static final Item BAMBOO_BLACK_BED_I = new BedItem(MbdvBlockInit.BAMBOO_BLACK_BED, bedProperties);
    public static final Item BOUND_BAMBOO_BLACK_BED_I = new BedItem(MbdvBlockInit.BOUND_BAMBOO_BLACK_BED, boundBambooBedProperties);
    public static final Item STRIPPED_BOUND_BAMBOO_BLACK_BED_I = new BedItem(MbdvBlockInit.STRIPPED_BOUND_BAMBOO_BLACK_BED, boundBambooBedProperties);
    public static final Item CHERRY_BLACK_BED_I = new BedItem(MbdvBlockInit.CHERRY_BLACK_BED, bedProperties);
    public static final Item CRIMSON_BLACK_BED_I = new BedItem(MbdvBlockInit.CRIMSON_BLACK_BED, bedProperties);
    public static final Item DARK_OAK_BLACK_BED_I = new BedItem(MbdvBlockInit.DARK_OAK_BLACK_BED, bedProperties);
    public static final Item JUNGLE_BLACK_BED_I = new BedItem(MbdvBlockInit.JUNGLE_BLACK_BED, bedProperties);
    public static final Item MANGROVE_BLACK_BED_I = new BedItem(MbdvBlockInit.MANGROVE_BLACK_BED, bedProperties);
    public static final Item SPRUCE_BLACK_BED_I = new BedItem(MbdvBlockInit.SPRUCE_BLACK_BED, bedProperties);
    public static final Item WARPED_BLACK_BED_I = new BedItem(MbdvBlockInit.WARPED_BLACK_BED, bedProperties);


    public static final List<Item> more_bed_items = new ArrayList<>();

    public static void registerBedItems() {
        registerWhiteBedItem(BIRCH_WHITE_BED_I, Items.WHITE_BED); more_bed_items.add(Items.WHITE_BED);
        registerWhiteBedItem(DARK_OAK_WHITE_BED_I, BIRCH_WHITE_BED_I);
        registerWhiteBedItem(SPRUCE_WHITE_BED_I, DARK_OAK_WHITE_BED_I);
        registerWhiteBedItem(JUNGLE_WHITE_BED_I, SPRUCE_WHITE_BED_I);
        registerWhiteBedItem(ACACIA_WHITE_BED_I, JUNGLE_WHITE_BED_I);
        registerWhiteBedItem(MANGROVE_WHITE_BED_I, ACACIA_WHITE_BED_I);
        registerWhiteBedItem(CHERRY_WHITE_BED_I, MANGROVE_WHITE_BED_I);
        registerWhiteBedItem(BAMBOO_WHITE_BED_I, CHERRY_WHITE_BED_I);
        registerWhiteBedItem(BOUND_BAMBOO_WHITE_BED_I, BAMBOO_WHITE_BED_I);
        registerWhiteBedItem(STRIPPED_BOUND_BAMBOO_WHITE_BED_I, BOUND_BAMBOO_WHITE_BED_I);
        registerWhiteBedItem(CRIMSON_WHITE_BED_I, STRIPPED_BOUND_BAMBOO_WHITE_BED_I);
        registerWhiteBedItem(WARPED_WHITE_BED_I, CRIMSON_WHITE_BED_I);
        // LIGHT_GRAY
        registerOtherBedItem(ACACIA_LIGHT_GRAY_BED_I); registerOtherBedItem(BAMBOO_LIGHT_GRAY_BED_I); registerOtherBedItem(BOUND_BAMBOO_LIGHT_GRAY_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_LIGHT_GRAY_BED_I); registerOtherBedItem(BIRCH_LIGHT_GRAY_BED_I); registerOtherBedItem(CHERRY_LIGHT_GRAY_BED_I); registerOtherBedItem(CRIMSON_LIGHT_GRAY_BED_I); registerOtherBedItem(DARK_OAK_LIGHT_GRAY_BED_I); registerOtherBedItem(JUNGLE_LIGHT_GRAY_BED_I); registerOtherBedItem(MANGROVE_LIGHT_GRAY_BED_I); more_bed_items.add(Items.LIGHT_GRAY_BED); registerOtherBedItem(SPRUCE_LIGHT_GRAY_BED_I); registerOtherBedItem(WARPED_LIGHT_GRAY_BED_I);
        // GRAY
        registerOtherBedItem(ACACIA_GRAY_BED_I); registerOtherBedItem(BAMBOO_GRAY_BED_I); registerOtherBedItem(BOUND_BAMBOO_GRAY_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_GRAY_BED_I); registerOtherBedItem(BIRCH_GRAY_BED_I); registerOtherBedItem(CHERRY_GRAY_BED_I); registerOtherBedItem(CRIMSON_GRAY_BED_I); registerOtherBedItem(DARK_OAK_GRAY_BED_I); registerOtherBedItem(JUNGLE_GRAY_BED_I); registerOtherBedItem(MANGROVE_GRAY_BED_I); more_bed_items.add(Items.GRAY_BED); registerOtherBedItem(SPRUCE_GRAY_BED_I); registerOtherBedItem(WARPED_GRAY_BED_I);
        // BLACK
        registerOtherBedItem(ACACIA_BLACK_BED_I); registerOtherBedItem(BAMBOO_BLACK_BED_I); registerOtherBedItem(BOUND_BAMBOO_BLACK_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_BLACK_BED_I); registerOtherBedItem(BIRCH_BLACK_BED_I); registerOtherBedItem(CHERRY_BLACK_BED_I); registerOtherBedItem(CRIMSON_BLACK_BED_I); registerOtherBedItem(DARK_OAK_BLACK_BED_I); registerOtherBedItem(JUNGLE_BLACK_BED_I); registerOtherBedItem(MANGROVE_BLACK_BED_I); more_bed_items.add(Items.BLACK_BED); registerOtherBedItem(SPRUCE_BLACK_BED_I); registerOtherBedItem(WARPED_BLACK_BED_I);
        // BROWN
        registerOtherBedItem(ACACIA_BROWN_BED_I); registerOtherBedItem(BAMBOO_BROWN_BED_I); registerOtherBedItem(BOUND_BAMBOO_BROWN_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_BROWN_BED_I); registerOtherBedItem(BIRCH_BROWN_BED_I); registerOtherBedItem(CHERRY_BROWN_BED_I); registerOtherBedItem(CRIMSON_BROWN_BED_I); registerOtherBedItem(DARK_OAK_BROWN_BED_I); registerOtherBedItem(JUNGLE_BROWN_BED_I); registerOtherBedItem(MANGROVE_BROWN_BED_I); more_bed_items.add(Items.BROWN_BED); registerOtherBedItem(SPRUCE_BROWN_BED_I); registerOtherBedItem(WARPED_BROWN_BED_I);
        // RED
        registerOtherBedItem(ACACIA_RED_BED_I); registerOtherBedItem(BAMBOO_RED_BED_I); registerOtherBedItem(BOUND_BAMBOO_RED_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_RED_BED_I); registerOtherBedItem(BIRCH_RED_BED_I); registerOtherBedItem(CHERRY_RED_BED_I); registerOtherBedItem(CRIMSON_RED_BED_I); registerOtherBedItem(DARK_OAK_RED_BED_I); registerOtherBedItem(JUNGLE_RED_BED_I); registerOtherBedItem(MANGROVE_RED_BED_I); more_bed_items.add(Items.RED_BED); registerOtherBedItem(SPRUCE_RED_BED_I); registerOtherBedItem(WARPED_RED_BED_I);
        // ORANGE
        registerOtherBedItem(ACACIA_ORANGE_BED_I); registerOtherBedItem(BAMBOO_ORANGE_BED_I); registerOtherBedItem(BOUND_BAMBOO_ORANGE_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_ORANGE_BED_I); registerOtherBedItem(BIRCH_ORANGE_BED_I); registerOtherBedItem(CHERRY_ORANGE_BED_I); registerOtherBedItem(CRIMSON_ORANGE_BED_I); registerOtherBedItem(DARK_OAK_ORANGE_BED_I); registerOtherBedItem(JUNGLE_ORANGE_BED_I); registerOtherBedItem(MANGROVE_ORANGE_BED_I); more_bed_items.add(Items.ORANGE_BED); registerOtherBedItem(SPRUCE_ORANGE_BED_I); registerOtherBedItem(WARPED_ORANGE_BED_I);
        // YELLOW
        registerOtherBedItem(ACACIA_YELLOW_BED_I); registerOtherBedItem(BAMBOO_YELLOW_BED_I); registerOtherBedItem(BOUND_BAMBOO_YELLOW_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_YELLOW_BED_I); registerOtherBedItem(BIRCH_YELLOW_BED_I); registerOtherBedItem(CHERRY_YELLOW_BED_I); registerOtherBedItem(CRIMSON_YELLOW_BED_I); registerOtherBedItem(DARK_OAK_YELLOW_BED_I); registerOtherBedItem(JUNGLE_YELLOW_BED_I); registerOtherBedItem(MANGROVE_YELLOW_BED_I); more_bed_items.add(Items.YELLOW_BED); registerOtherBedItem(SPRUCE_YELLOW_BED_I); registerOtherBedItem(WARPED_YELLOW_BED_I);
        // LIME
        registerOtherBedItem(ACACIA_LIME_BED_I); registerOtherBedItem(BAMBOO_LIME_BED_I); registerOtherBedItem(BOUND_BAMBOO_LIME_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_LIME_BED_I); registerOtherBedItem(BIRCH_LIME_BED_I); registerOtherBedItem(CHERRY_LIME_BED_I); registerOtherBedItem(CRIMSON_LIME_BED_I); registerOtherBedItem(DARK_OAK_LIME_BED_I); registerOtherBedItem(JUNGLE_LIME_BED_I); registerOtherBedItem(MANGROVE_LIME_BED_I); more_bed_items.add(Items.LIME_BED); registerOtherBedItem(SPRUCE_LIME_BED_I); registerOtherBedItem(WARPED_LIME_BED_I);
        // GREEN
        registerOtherBedItem(ACACIA_GREEN_BED_I); registerOtherBedItem(BAMBOO_GREEN_BED_I); registerOtherBedItem(BOUND_BAMBOO_GREEN_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_GREEN_BED_I); registerOtherBedItem(BIRCH_GREEN_BED_I); registerOtherBedItem(CHERRY_GREEN_BED_I); registerOtherBedItem(CRIMSON_GREEN_BED_I); registerOtherBedItem(DARK_OAK_GREEN_BED_I); registerOtherBedItem(JUNGLE_GREEN_BED_I); registerOtherBedItem(MANGROVE_GREEN_BED_I); more_bed_items.add(Items.GREEN_BED); registerOtherBedItem(SPRUCE_GREEN_BED_I); registerOtherBedItem(WARPED_GREEN_BED_I);
        // CYAN
        registerOtherBedItem(ACACIA_CYAN_BED_I); registerOtherBedItem(BAMBOO_CYAN_BED_I); registerOtherBedItem(BOUND_BAMBOO_CYAN_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_CYAN_BED_I); registerOtherBedItem(BIRCH_CYAN_BED_I); registerOtherBedItem(CHERRY_CYAN_BED_I); registerOtherBedItem(CRIMSON_CYAN_BED_I); registerOtherBedItem(DARK_OAK_CYAN_BED_I); registerOtherBedItem(JUNGLE_CYAN_BED_I); registerOtherBedItem(MANGROVE_CYAN_BED_I); more_bed_items.add(Items.CYAN_BED); registerOtherBedItem(SPRUCE_CYAN_BED_I); registerOtherBedItem(WARPED_CYAN_BED_I);
        // LIGHT_BLUE
        registerOtherBedItem(ACACIA_LIGHT_BLUE_BED_I); registerOtherBedItem(BAMBOO_LIGHT_BLUE_BED_I); registerOtherBedItem(BOUND_BAMBOO_LIGHT_BLUE_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_LIGHT_BLUE_BED_I); registerOtherBedItem(BIRCH_LIGHT_BLUE_BED_I); registerOtherBedItem(CHERRY_LIGHT_BLUE_BED_I); registerOtherBedItem(CRIMSON_LIGHT_BLUE_BED_I); registerOtherBedItem(DARK_OAK_LIGHT_BLUE_BED_I); registerOtherBedItem(JUNGLE_LIGHT_BLUE_BED_I); registerOtherBedItem(MANGROVE_LIGHT_BLUE_BED_I); more_bed_items.add(Items.LIGHT_BLUE_BED); registerOtherBedItem(SPRUCE_LIGHT_BLUE_BED_I); registerOtherBedItem(WARPED_LIGHT_BLUE_BED_I);
        // BLUE
        registerOtherBedItem(ACACIA_BLUE_BED_I); registerOtherBedItem(BAMBOO_BLUE_BED_I); registerOtherBedItem(BOUND_BAMBOO_BLUE_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_BLUE_BED_I); registerOtherBedItem(BIRCH_BLUE_BED_I); registerOtherBedItem(CHERRY_BLUE_BED_I); registerOtherBedItem(CRIMSON_BLUE_BED_I); registerOtherBedItem(DARK_OAK_BLUE_BED_I); registerOtherBedItem(JUNGLE_BLUE_BED_I); registerOtherBedItem(MANGROVE_BLUE_BED_I); more_bed_items.add(Items.BLUE_BED); registerOtherBedItem(SPRUCE_BLUE_BED_I); registerOtherBedItem(WARPED_BLUE_BED_I);
        // PURPLE
        registerOtherBedItem(ACACIA_PURPLE_BED_I); registerOtherBedItem(BAMBOO_PURPLE_BED_I); registerOtherBedItem(BOUND_BAMBOO_PURPLE_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_PURPLE_BED_I); registerOtherBedItem(BIRCH_PURPLE_BED_I); registerOtherBedItem(CHERRY_PURPLE_BED_I); registerOtherBedItem(CRIMSON_PURPLE_BED_I); registerOtherBedItem(DARK_OAK_PURPLE_BED_I); registerOtherBedItem(JUNGLE_PURPLE_BED_I); registerOtherBedItem(MANGROVE_PURPLE_BED_I); more_bed_items.add(Items.PURPLE_BED); registerOtherBedItem(SPRUCE_PURPLE_BED_I); registerOtherBedItem(WARPED_PURPLE_BED_I);
        // MAGENTA
        registerOtherBedItem(ACACIA_MAGENTA_BED_I); registerOtherBedItem(BAMBOO_MAGENTA_BED_I); registerOtherBedItem(BOUND_BAMBOO_MAGENTA_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_MAGENTA_BED_I); registerOtherBedItem(BIRCH_MAGENTA_BED_I); registerOtherBedItem(CHERRY_MAGENTA_BED_I); registerOtherBedItem(CRIMSON_MAGENTA_BED_I); registerOtherBedItem(DARK_OAK_MAGENTA_BED_I); registerOtherBedItem(JUNGLE_MAGENTA_BED_I); registerOtherBedItem(MANGROVE_MAGENTA_BED_I); more_bed_items.add(Items.MAGENTA_BED); registerOtherBedItem(SPRUCE_MAGENTA_BED_I); registerOtherBedItem(WARPED_MAGENTA_BED_I);
        // PINK
        registerOtherBedItem(ACACIA_PINK_BED_I); registerOtherBedItem(BAMBOO_PINK_BED_I); registerOtherBedItem(BOUND_BAMBOO_PINK_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_PINK_BED_I); registerOtherBedItem(BIRCH_PINK_BED_I); registerOtherBedItem(CHERRY_PINK_BED_I); registerOtherBedItem(CRIMSON_PINK_BED_I); registerOtherBedItem(DARK_OAK_PINK_BED_I); registerOtherBedItem(JUNGLE_PINK_BED_I); registerOtherBedItem(MANGROVE_PINK_BED_I); more_bed_items.add(Items.PINK_BED); registerOtherBedItem(SPRUCE_PINK_BED_I); registerOtherBedItem(WARPED_PINK_BED_I);

    }

    private static void registerWhiteBedItem(Item whiteBed, Item bedAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreBedVariants.withModId(((MoreBedVariantBlock)((BedItem) whiteBed).getBlock()).bedWoodType + "_" + ((MoreBedVariantBlock) ((BedItem) whiteBed).getBlock()).bedColor + "_bed"), whiteBed);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> entries.addAfter(bedAfter, whiteBed));
        more_bed_items.add(whiteBed);
    }
    private static void registerOtherBedItem (Item otherBed) {
        Registry.register(BuiltInRegistries.ITEM, MoreBedVariants.withModId(((MoreBedVariantBlock) ((BedItem) otherBed).getBlock()).bedWoodType + "_" + ((MoreBedVariantBlock) ((BedItem) otherBed).getBlock()).bedColor + "_bed"), otherBed);

        more_bed_items.add(otherBed);
    }
}