package de.pnku.mbdv.init;

import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
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
    public static final Item BIRCH_WHITE_BED_I = itemFromBlock(BIRCH_WHITE_BED);
    public static final Item DARK_OAK_WHITE_BED_I = itemFromBlock(DARK_OAK_WHITE_BED);
    public static final Item PALE_OAK_WHITE_BED_I = itemFromBlock(PALE_OAK_WHITE_BED);
    public static final Item SPRUCE_WHITE_BED_I = itemFromBlock(SPRUCE_WHITE_BED);
    public static final Item JUNGLE_WHITE_BED_I = itemFromBlock(JUNGLE_WHITE_BED);
    public static final Item ACACIA_WHITE_BED_I = itemFromBlock(ACACIA_WHITE_BED);
    public static final Item MANGROVE_WHITE_BED_I = itemFromBlock(MANGROVE_WHITE_BED);
    public static final Item CHERRY_WHITE_BED_I = itemFromBlock(CHERRY_WHITE_BED);
    public static final Item BAMBOO_WHITE_BED_I = itemFromBlock(BAMBOO_WHITE_BED);
    public static final Item BOUND_BAMBOO_WHITE_BED_I = itemFromBlock(BOUND_BAMBOO_WHITE_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_WHITE_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_WHITE_BED);
    public static final Item CRIMSON_WHITE_BED_I = itemFromBlock(CRIMSON_WHITE_BED);
    public static final Item WARPED_WHITE_BED_I = itemFromBlock(WARPED_WHITE_BED);
    // ORANGE
    public static final Item ACACIA_ORANGE_BED_I = itemFromBlock(ACACIA_ORANGE_BED);
    public static final Item BIRCH_ORANGE_BED_I = itemFromBlock(BIRCH_ORANGE_BED);
    public static final Item BAMBOO_ORANGE_BED_I = itemFromBlock(BAMBOO_ORANGE_BED);
    public static final Item BOUND_BAMBOO_ORANGE_BED_I = itemFromBlock(BOUND_BAMBOO_ORANGE_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_ORANGE_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_ORANGE_BED);
    public static final Item CHERRY_ORANGE_BED_I = itemFromBlock(CHERRY_ORANGE_BED);
    public static final Item CRIMSON_ORANGE_BED_I = itemFromBlock(CRIMSON_ORANGE_BED);
    public static final Item DARK_OAK_ORANGE_BED_I = itemFromBlock(DARK_OAK_ORANGE_BED);
    public static final Item PALE_OAK_ORANGE_BED_I = itemFromBlock(PALE_OAK_ORANGE_BED);
    public static final Item JUNGLE_ORANGE_BED_I = itemFromBlock(JUNGLE_ORANGE_BED);
    public static final Item MANGROVE_ORANGE_BED_I = itemFromBlock(MANGROVE_ORANGE_BED);
    public static final Item SPRUCE_ORANGE_BED_I = itemFromBlock(SPRUCE_ORANGE_BED);
    public static final Item WARPED_ORANGE_BED_I = itemFromBlock(WARPED_ORANGE_BED);
    // MAGENTA
    public static final Item ACACIA_MAGENTA_BED_I = itemFromBlock(ACACIA_MAGENTA_BED);
    public static final Item BIRCH_MAGENTA_BED_I = itemFromBlock(BIRCH_MAGENTA_BED);
    public static final Item BAMBOO_MAGENTA_BED_I = itemFromBlock(BAMBOO_MAGENTA_BED);
    public static final Item BOUND_BAMBOO_MAGENTA_BED_I = itemFromBlock(BOUND_BAMBOO_MAGENTA_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_MAGENTA_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_MAGENTA_BED);
    public static final Item CHERRY_MAGENTA_BED_I = itemFromBlock(CHERRY_MAGENTA_BED);
    public static final Item CRIMSON_MAGENTA_BED_I = itemFromBlock(CRIMSON_MAGENTA_BED);
    public static final Item DARK_OAK_MAGENTA_BED_I = itemFromBlock(DARK_OAK_MAGENTA_BED);
    public static final Item PALE_OAK_MAGENTA_BED_I = itemFromBlock(PALE_OAK_MAGENTA_BED);
    public static final Item JUNGLE_MAGENTA_BED_I = itemFromBlock(JUNGLE_MAGENTA_BED);
    public static final Item MANGROVE_MAGENTA_BED_I = itemFromBlock(MANGROVE_MAGENTA_BED);
    public static final Item SPRUCE_MAGENTA_BED_I = itemFromBlock(SPRUCE_MAGENTA_BED);
    public static final Item WARPED_MAGENTA_BED_I = itemFromBlock(WARPED_MAGENTA_BED);
    // LIGHT_BLUE
    public static final Item ACACIA_LIGHT_BLUE_BED_I = itemFromBlock(ACACIA_LIGHT_BLUE_BED);
    public static final Item BIRCH_LIGHT_BLUE_BED_I = itemFromBlock(BIRCH_LIGHT_BLUE_BED);
    public static final Item BAMBOO_LIGHT_BLUE_BED_I = itemFromBlock(BAMBOO_LIGHT_BLUE_BED);
    public static final Item BOUND_BAMBOO_LIGHT_BLUE_BED_I = itemFromBlock(BOUND_BAMBOO_LIGHT_BLUE_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_LIGHT_BLUE_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_LIGHT_BLUE_BED);
    public static final Item CHERRY_LIGHT_BLUE_BED_I = itemFromBlock(CHERRY_LIGHT_BLUE_BED);
    public static final Item CRIMSON_LIGHT_BLUE_BED_I = itemFromBlock(CRIMSON_LIGHT_BLUE_BED);
    public static final Item DARK_OAK_LIGHT_BLUE_BED_I = itemFromBlock(DARK_OAK_LIGHT_BLUE_BED);
    public static final Item PALE_OAK_LIGHT_BLUE_BED_I = itemFromBlock(PALE_OAK_LIGHT_BLUE_BED);
    public static final Item JUNGLE_LIGHT_BLUE_BED_I = itemFromBlock(JUNGLE_LIGHT_BLUE_BED);
    public static final Item MANGROVE_LIGHT_BLUE_BED_I = itemFromBlock(MANGROVE_LIGHT_BLUE_BED);
    public static final Item SPRUCE_LIGHT_BLUE_BED_I = itemFromBlock(SPRUCE_LIGHT_BLUE_BED);
    public static final Item WARPED_LIGHT_BLUE_BED_I = itemFromBlock(WARPED_LIGHT_BLUE_BED);
    // YELLOW
    public static final Item ACACIA_YELLOW_BED_I = itemFromBlock(ACACIA_YELLOW_BED);
    public static final Item BIRCH_YELLOW_BED_I = itemFromBlock(BIRCH_YELLOW_BED);
    public static final Item BAMBOO_YELLOW_BED_I = itemFromBlock(BAMBOO_YELLOW_BED);
    public static final Item BOUND_BAMBOO_YELLOW_BED_I = itemFromBlock(BOUND_BAMBOO_YELLOW_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_YELLOW_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_YELLOW_BED);
    public static final Item CHERRY_YELLOW_BED_I = itemFromBlock(CHERRY_YELLOW_BED);
    public static final Item CRIMSON_YELLOW_BED_I = itemFromBlock(CRIMSON_YELLOW_BED);
    public static final Item DARK_OAK_YELLOW_BED_I = itemFromBlock(DARK_OAK_YELLOW_BED);
    public static final Item PALE_OAK_YELLOW_BED_I = itemFromBlock(PALE_OAK_YELLOW_BED);
    public static final Item JUNGLE_YELLOW_BED_I = itemFromBlock(JUNGLE_YELLOW_BED);
    public static final Item MANGROVE_YELLOW_BED_I = itemFromBlock(MANGROVE_YELLOW_BED);
    public static final Item SPRUCE_YELLOW_BED_I = itemFromBlock(SPRUCE_YELLOW_BED);
    public static final Item WARPED_YELLOW_BED_I = itemFromBlock(WARPED_YELLOW_BED);
    // LIME
    public static final Item ACACIA_LIME_BED_I = itemFromBlock(ACACIA_LIME_BED);
    public static final Item BIRCH_LIME_BED_I = itemFromBlock(BIRCH_LIME_BED);
    public static final Item BAMBOO_LIME_BED_I = itemFromBlock(BAMBOO_LIME_BED);
    public static final Item BOUND_BAMBOO_LIME_BED_I = itemFromBlock(BOUND_BAMBOO_LIME_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_LIME_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_LIME_BED);
    public static final Item CHERRY_LIME_BED_I = itemFromBlock(CHERRY_LIME_BED);
    public static final Item CRIMSON_LIME_BED_I = itemFromBlock(CRIMSON_LIME_BED);
    public static final Item DARK_OAK_LIME_BED_I = itemFromBlock(DARK_OAK_LIME_BED);
    public static final Item PALE_OAK_LIME_BED_I = itemFromBlock(PALE_OAK_LIME_BED);
    public static final Item JUNGLE_LIME_BED_I = itemFromBlock(JUNGLE_LIME_BED);
    public static final Item MANGROVE_LIME_BED_I = itemFromBlock(MANGROVE_LIME_BED);
    public static final Item SPRUCE_LIME_BED_I = itemFromBlock(SPRUCE_LIME_BED);
    public static final Item WARPED_LIME_BED_I = itemFromBlock(WARPED_LIME_BED);
    // PINK
    public static final Item ACACIA_PINK_BED_I = itemFromBlock(ACACIA_PINK_BED);
    public static final Item BIRCH_PINK_BED_I = itemFromBlock(BIRCH_PINK_BED);
    public static final Item BAMBOO_PINK_BED_I = itemFromBlock(BAMBOO_PINK_BED);
    public static final Item BOUND_BAMBOO_PINK_BED_I = itemFromBlock(BOUND_BAMBOO_PINK_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_PINK_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_PINK_BED);
    public static final Item CHERRY_PINK_BED_I = itemFromBlock(CHERRY_PINK_BED);
    public static final Item CRIMSON_PINK_BED_I = itemFromBlock(CRIMSON_PINK_BED);
    public static final Item DARK_OAK_PINK_BED_I = itemFromBlock(DARK_OAK_PINK_BED);
    public static final Item PALE_OAK_PINK_BED_I = itemFromBlock(PALE_OAK_PINK_BED);
    public static final Item JUNGLE_PINK_BED_I = itemFromBlock(JUNGLE_PINK_BED);
    public static final Item MANGROVE_PINK_BED_I = itemFromBlock(MANGROVE_PINK_BED);
    public static final Item SPRUCE_PINK_BED_I = itemFromBlock(SPRUCE_PINK_BED);
    public static final Item WARPED_PINK_BED_I = itemFromBlock(WARPED_PINK_BED);
    // GRAY
    public static final Item ACACIA_GRAY_BED_I = itemFromBlock(ACACIA_GRAY_BED);
    public static final Item BIRCH_GRAY_BED_I = itemFromBlock(BIRCH_GRAY_BED);
    public static final Item BAMBOO_GRAY_BED_I = itemFromBlock(BAMBOO_GRAY_BED);
    public static final Item BOUND_BAMBOO_GRAY_BED_I = itemFromBlock(BOUND_BAMBOO_GRAY_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_GRAY_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_GRAY_BED);
    public static final Item CHERRY_GRAY_BED_I = itemFromBlock(CHERRY_GRAY_BED);
    public static final Item CRIMSON_GRAY_BED_I = itemFromBlock(CRIMSON_GRAY_BED);
    public static final Item DARK_OAK_GRAY_BED_I = itemFromBlock(DARK_OAK_GRAY_BED);
    public static final Item PALE_OAK_GRAY_BED_I = itemFromBlock(PALE_OAK_GRAY_BED);
    public static final Item JUNGLE_GRAY_BED_I = itemFromBlock(JUNGLE_GRAY_BED);
    public static final Item MANGROVE_GRAY_BED_I = itemFromBlock(MANGROVE_GRAY_BED);
    public static final Item SPRUCE_GRAY_BED_I = itemFromBlock(SPRUCE_GRAY_BED);
    public static final Item WARPED_GRAY_BED_I = itemFromBlock(WARPED_GRAY_BED);
    // LIGHT_GRAY
    public static final Item ACACIA_LIGHT_GRAY_BED_I = itemFromBlock(ACACIA_LIGHT_GRAY_BED);
    public static final Item BIRCH_LIGHT_GRAY_BED_I = itemFromBlock(BIRCH_LIGHT_GRAY_BED);
    public static final Item BAMBOO_LIGHT_GRAY_BED_I = itemFromBlock(BAMBOO_LIGHT_GRAY_BED);
    public static final Item BOUND_BAMBOO_LIGHT_GRAY_BED_I = itemFromBlock(BOUND_BAMBOO_LIGHT_GRAY_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_LIGHT_GRAY_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_LIGHT_GRAY_BED);
    public static final Item CHERRY_LIGHT_GRAY_BED_I = itemFromBlock(CHERRY_LIGHT_GRAY_BED);
    public static final Item CRIMSON_LIGHT_GRAY_BED_I = itemFromBlock(CRIMSON_LIGHT_GRAY_BED);
    public static final Item DARK_OAK_LIGHT_GRAY_BED_I = itemFromBlock(DARK_OAK_LIGHT_GRAY_BED);
    public static final Item PALE_OAK_LIGHT_GRAY_BED_I = itemFromBlock(PALE_OAK_LIGHT_GRAY_BED);
    public static final Item JUNGLE_LIGHT_GRAY_BED_I = itemFromBlock(JUNGLE_LIGHT_GRAY_BED);
    public static final Item MANGROVE_LIGHT_GRAY_BED_I = itemFromBlock(MANGROVE_LIGHT_GRAY_BED);
    public static final Item SPRUCE_LIGHT_GRAY_BED_I = itemFromBlock(SPRUCE_LIGHT_GRAY_BED);
    public static final Item WARPED_LIGHT_GRAY_BED_I = itemFromBlock(WARPED_LIGHT_GRAY_BED);
    // CYAN
    public static final Item ACACIA_CYAN_BED_I = itemFromBlock(ACACIA_CYAN_BED);
    public static final Item BIRCH_CYAN_BED_I = itemFromBlock(BIRCH_CYAN_BED);
    public static final Item BAMBOO_CYAN_BED_I = itemFromBlock(BAMBOO_CYAN_BED);
    public static final Item BOUND_BAMBOO_CYAN_BED_I = itemFromBlock(BOUND_BAMBOO_CYAN_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_CYAN_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_CYAN_BED);
    public static final Item CHERRY_CYAN_BED_I = itemFromBlock(CHERRY_CYAN_BED);
    public static final Item CRIMSON_CYAN_BED_I = itemFromBlock(CRIMSON_CYAN_BED);
    public static final Item DARK_OAK_CYAN_BED_I = itemFromBlock(DARK_OAK_CYAN_BED);
    public static final Item PALE_OAK_CYAN_BED_I = itemFromBlock(PALE_OAK_CYAN_BED);
    public static final Item JUNGLE_CYAN_BED_I = itemFromBlock(JUNGLE_CYAN_BED);
    public static final Item MANGROVE_CYAN_BED_I = itemFromBlock(MANGROVE_CYAN_BED);
    public static final Item SPRUCE_CYAN_BED_I = itemFromBlock(SPRUCE_CYAN_BED);
    public static final Item WARPED_CYAN_BED_I = itemFromBlock(WARPED_CYAN_BED);
    // PURPLE
    public static final Item ACACIA_PURPLE_BED_I = itemFromBlock(ACACIA_PURPLE_BED);
    public static final Item BIRCH_PURPLE_BED_I = itemFromBlock(BIRCH_PURPLE_BED);
    public static final Item BAMBOO_PURPLE_BED_I = itemFromBlock(BAMBOO_PURPLE_BED);
    public static final Item BOUND_BAMBOO_PURPLE_BED_I = itemFromBlock(BOUND_BAMBOO_PURPLE_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_PURPLE_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_PURPLE_BED);
    public static final Item CHERRY_PURPLE_BED_I = itemFromBlock(CHERRY_PURPLE_BED);
    public static final Item CRIMSON_PURPLE_BED_I = itemFromBlock(CRIMSON_PURPLE_BED);
    public static final Item DARK_OAK_PURPLE_BED_I = itemFromBlock(DARK_OAK_PURPLE_BED);
    public static final Item PALE_OAK_PURPLE_BED_I = itemFromBlock(PALE_OAK_PURPLE_BED);
    public static final Item JUNGLE_PURPLE_BED_I = itemFromBlock(JUNGLE_PURPLE_BED);
    public static final Item MANGROVE_PURPLE_BED_I = itemFromBlock(MANGROVE_PURPLE_BED);
    public static final Item SPRUCE_PURPLE_BED_I = itemFromBlock(SPRUCE_PURPLE_BED);
    public static final Item WARPED_PURPLE_BED_I = itemFromBlock(WARPED_PURPLE_BED);
    // BLUE
    public static final Item ACACIA_BLUE_BED_I = itemFromBlock(ACACIA_BLUE_BED);
    public static final Item BIRCH_BLUE_BED_I = itemFromBlock(BIRCH_BLUE_BED);
    public static final Item BAMBOO_BLUE_BED_I = itemFromBlock(BAMBOO_BLUE_BED);
    public static final Item BOUND_BAMBOO_BLUE_BED_I = itemFromBlock(BOUND_BAMBOO_BLUE_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_BLUE_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_BLUE_BED);
    public static final Item CHERRY_BLUE_BED_I = itemFromBlock(CHERRY_BLUE_BED);
    public static final Item CRIMSON_BLUE_BED_I = itemFromBlock(CRIMSON_BLUE_BED);
    public static final Item DARK_OAK_BLUE_BED_I = itemFromBlock(DARK_OAK_BLUE_BED);
    public static final Item PALE_OAK_BLUE_BED_I = itemFromBlock(PALE_OAK_BLUE_BED);
    public static final Item JUNGLE_BLUE_BED_I = itemFromBlock(JUNGLE_BLUE_BED);
    public static final Item MANGROVE_BLUE_BED_I = itemFromBlock(MANGROVE_BLUE_BED);
    public static final Item SPRUCE_BLUE_BED_I = itemFromBlock(SPRUCE_BLUE_BED);
    public static final Item WARPED_BLUE_BED_I = itemFromBlock(WARPED_BLUE_BED);
    // BROWN
    public static final Item ACACIA_BROWN_BED_I = itemFromBlock(ACACIA_BROWN_BED);
    public static final Item BIRCH_BROWN_BED_I = itemFromBlock(BIRCH_BROWN_BED);
    public static final Item BAMBOO_BROWN_BED_I = itemFromBlock(BAMBOO_BROWN_BED);
    public static final Item BOUND_BAMBOO_BROWN_BED_I = itemFromBlock(BOUND_BAMBOO_BROWN_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_BROWN_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_BROWN_BED);
    public static final Item CHERRY_BROWN_BED_I = itemFromBlock(CHERRY_BROWN_BED);
    public static final Item CRIMSON_BROWN_BED_I = itemFromBlock(CRIMSON_BROWN_BED);
    public static final Item DARK_OAK_BROWN_BED_I = itemFromBlock(DARK_OAK_BROWN_BED);
    public static final Item PALE_OAK_BROWN_BED_I = itemFromBlock(PALE_OAK_BROWN_BED);
    public static final Item JUNGLE_BROWN_BED_I = itemFromBlock(JUNGLE_BROWN_BED);
    public static final Item MANGROVE_BROWN_BED_I = itemFromBlock(MANGROVE_BROWN_BED);
    public static final Item SPRUCE_BROWN_BED_I = itemFromBlock(SPRUCE_BROWN_BED);
    public static final Item WARPED_BROWN_BED_I = itemFromBlock(WARPED_BROWN_BED);
    // GREEN
    public static final Item ACACIA_GREEN_BED_I = itemFromBlock(ACACIA_GREEN_BED);
    public static final Item BIRCH_GREEN_BED_I = itemFromBlock(BIRCH_GREEN_BED);
    public static final Item BAMBOO_GREEN_BED_I = itemFromBlock(BAMBOO_GREEN_BED);
    public static final Item BOUND_BAMBOO_GREEN_BED_I = itemFromBlock(BOUND_BAMBOO_GREEN_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_GREEN_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_GREEN_BED);
    public static final Item CHERRY_GREEN_BED_I = itemFromBlock(CHERRY_GREEN_BED);
    public static final Item CRIMSON_GREEN_BED_I = itemFromBlock(CRIMSON_GREEN_BED);
    public static final Item DARK_OAK_GREEN_BED_I = itemFromBlock(DARK_OAK_GREEN_BED);
    public static final Item PALE_OAK_GREEN_BED_I = itemFromBlock(PALE_OAK_GREEN_BED);
    public static final Item JUNGLE_GREEN_BED_I = itemFromBlock(JUNGLE_GREEN_BED);
    public static final Item MANGROVE_GREEN_BED_I = itemFromBlock(MANGROVE_GREEN_BED);
    public static final Item SPRUCE_GREEN_BED_I = itemFromBlock(SPRUCE_GREEN_BED);
    public static final Item WARPED_GREEN_BED_I = itemFromBlock(WARPED_GREEN_BED);
    // RED
    public static final Item ACACIA_RED_BED_I = itemFromBlock(ACACIA_RED_BED);
    public static final Item BIRCH_RED_BED_I = itemFromBlock(BIRCH_RED_BED);
    public static final Item BAMBOO_RED_BED_I = itemFromBlock(BAMBOO_RED_BED);
    public static final Item BOUND_BAMBOO_RED_BED_I = itemFromBlock(BOUND_BAMBOO_RED_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_RED_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_RED_BED);
    public static final Item CHERRY_RED_BED_I = itemFromBlock(CHERRY_RED_BED);
    public static final Item CRIMSON_RED_BED_I = itemFromBlock(CRIMSON_RED_BED);
    public static final Item DARK_OAK_RED_BED_I = itemFromBlock(DARK_OAK_RED_BED);
    public static final Item PALE_OAK_RED_BED_I = itemFromBlock(PALE_OAK_RED_BED);
    public static final Item JUNGLE_RED_BED_I = itemFromBlock(JUNGLE_RED_BED);
    public static final Item MANGROVE_RED_BED_I = itemFromBlock(MANGROVE_RED_BED);
    public static final Item SPRUCE_RED_BED_I = itemFromBlock(SPRUCE_RED_BED);
    public static final Item WARPED_RED_BED_I = itemFromBlock(WARPED_RED_BED);
    // BLACK
    public static final Item ACACIA_BLACK_BED_I = itemFromBlock(ACACIA_BLACK_BED);
    public static final Item BIRCH_BLACK_BED_I = itemFromBlock(BIRCH_BLACK_BED);
    public static final Item BAMBOO_BLACK_BED_I = itemFromBlock(BAMBOO_BLACK_BED);
    public static final Item BOUND_BAMBOO_BLACK_BED_I = itemFromBlock(BOUND_BAMBOO_BLACK_BED);
    public static final Item STRIPPED_BOUND_BAMBOO_BLACK_BED_I = itemFromBlock(STRIPPED_BOUND_BAMBOO_BLACK_BED);
    public static final Item CHERRY_BLACK_BED_I = itemFromBlock(CHERRY_BLACK_BED);
    public static final Item CRIMSON_BLACK_BED_I = itemFromBlock(CRIMSON_BLACK_BED);
    public static final Item DARK_OAK_BLACK_BED_I = itemFromBlock(DARK_OAK_BLACK_BED);
    public static final Item PALE_OAK_BLACK_BED_I = itemFromBlock(PALE_OAK_BLACK_BED);
    public static final Item JUNGLE_BLACK_BED_I = itemFromBlock(JUNGLE_BLACK_BED);
    public static final Item MANGROVE_BLACK_BED_I = itemFromBlock(MANGROVE_BLACK_BED);
    public static final Item SPRUCE_BLACK_BED_I = itemFromBlock(SPRUCE_BLACK_BED);
    public static final Item WARPED_BLACK_BED_I = itemFromBlock(WARPED_BLACK_BED);

    public static BedItem itemFromBlock(MoreBedVariantBlock moreBedVariantBlock) {
        return new BedItem(moreBedVariantBlock, setProperties(moreBedVariantBlock));
    }

    public static Item.Properties setProperties(MoreBedVariantBlock moreBedVariantBlock) {
        Item.Properties bedProperties = new Item.Properties().stacksTo((moreBedVariantBlock.bedWoodType.contains("bound")) ? 16 : 1)
                .setId(ResourceKey.create(Registries.ITEM,BuiltInRegistries.BLOCK.getKey(moreBedVariantBlock))).useBlockDescriptionPrefix();
        return (moreBedVariantBlock.bedWoodType.equals("warped") || moreBedVariantBlock.bedWoodType.equals("crimson")) ? bedProperties.fireResistant() : bedProperties;
    }

    public static final List<Item> more_bed_items = new ArrayList<>();

    public static void registerBedItems() {
        registerWhiteBedItem(BIRCH_WHITE_BED_I, Items.BED.white()); more_bed_items.add(Items.BED.white());
        registerWhiteBedItem(DARK_OAK_WHITE_BED_I, BIRCH_WHITE_BED_I);
        registerWhiteBedItem(PALE_OAK_WHITE_BED_I, DARK_OAK_WHITE_BED_I);
        registerWhiteBedItem(SPRUCE_WHITE_BED_I, PALE_OAK_WHITE_BED_I);
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
        registerOtherBedItem(ACACIA_LIGHT_GRAY_BED_I); registerOtherBedItem(BAMBOO_LIGHT_GRAY_BED_I); registerOtherBedItem(BOUND_BAMBOO_LIGHT_GRAY_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_LIGHT_GRAY_BED_I); registerOtherBedItem(BIRCH_LIGHT_GRAY_BED_I); registerOtherBedItem(CHERRY_LIGHT_GRAY_BED_I); registerOtherBedItem(CRIMSON_LIGHT_GRAY_BED_I); registerOtherBedItem(DARK_OAK_LIGHT_GRAY_BED_I); registerOtherBedItem(PALE_OAK_LIGHT_GRAY_BED_I); registerOtherBedItem(JUNGLE_LIGHT_GRAY_BED_I); registerOtherBedItem(MANGROVE_LIGHT_GRAY_BED_I); more_bed_items.add(Items.BED.lightGray()); registerOtherBedItem(SPRUCE_LIGHT_GRAY_BED_I); registerOtherBedItem(WARPED_LIGHT_GRAY_BED_I);
        // GRAY
        registerOtherBedItem(ACACIA_GRAY_BED_I); registerOtherBedItem(BAMBOO_GRAY_BED_I); registerOtherBedItem(BOUND_BAMBOO_GRAY_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_GRAY_BED_I); registerOtherBedItem(BIRCH_GRAY_BED_I); registerOtherBedItem(CHERRY_GRAY_BED_I); registerOtherBedItem(CRIMSON_GRAY_BED_I); registerOtherBedItem(DARK_OAK_GRAY_BED_I); registerOtherBedItem(PALE_OAK_GRAY_BED_I); registerOtherBedItem(JUNGLE_GRAY_BED_I); registerOtherBedItem(MANGROVE_GRAY_BED_I); more_bed_items.add(Items.BED.gray()); registerOtherBedItem(SPRUCE_GRAY_BED_I); registerOtherBedItem(WARPED_GRAY_BED_I);
        // BLACK
        registerOtherBedItem(ACACIA_BLACK_BED_I); registerOtherBedItem(BAMBOO_BLACK_BED_I); registerOtherBedItem(BOUND_BAMBOO_BLACK_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_BLACK_BED_I); registerOtherBedItem(BIRCH_BLACK_BED_I); registerOtherBedItem(CHERRY_BLACK_BED_I); registerOtherBedItem(CRIMSON_BLACK_BED_I); registerOtherBedItem(DARK_OAK_BLACK_BED_I); registerOtherBedItem(PALE_OAK_BLACK_BED_I); registerOtherBedItem(JUNGLE_BLACK_BED_I); registerOtherBedItem(MANGROVE_BLACK_BED_I); more_bed_items.add(Items.BED.black()); registerOtherBedItem(SPRUCE_BLACK_BED_I); registerOtherBedItem(WARPED_BLACK_BED_I);
        // BROWN
        registerOtherBedItem(ACACIA_BROWN_BED_I); registerOtherBedItem(BAMBOO_BROWN_BED_I); registerOtherBedItem(BOUND_BAMBOO_BROWN_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_BROWN_BED_I); registerOtherBedItem(BIRCH_BROWN_BED_I); registerOtherBedItem(CHERRY_BROWN_BED_I); registerOtherBedItem(CRIMSON_BROWN_BED_I); registerOtherBedItem(DARK_OAK_BROWN_BED_I); registerOtherBedItem(PALE_OAK_BROWN_BED_I); registerOtherBedItem(JUNGLE_BROWN_BED_I); registerOtherBedItem(MANGROVE_BROWN_BED_I); more_bed_items.add(Items.BED.brown()); registerOtherBedItem(SPRUCE_BROWN_BED_I); registerOtherBedItem(WARPED_BROWN_BED_I);
        // RED
        registerOtherBedItem(ACACIA_RED_BED_I); registerOtherBedItem(BAMBOO_RED_BED_I); registerOtherBedItem(BOUND_BAMBOO_RED_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_RED_BED_I); registerOtherBedItem(BIRCH_RED_BED_I); registerOtherBedItem(CHERRY_RED_BED_I); registerOtherBedItem(CRIMSON_RED_BED_I); registerOtherBedItem(DARK_OAK_RED_BED_I); registerOtherBedItem(PALE_OAK_RED_BED_I); registerOtherBedItem(JUNGLE_RED_BED_I); registerOtherBedItem(MANGROVE_RED_BED_I); more_bed_items.add(Items.BED.red()); registerOtherBedItem(SPRUCE_RED_BED_I); registerOtherBedItem(WARPED_RED_BED_I);
        // ORANGE
        registerOtherBedItem(ACACIA_ORANGE_BED_I); registerOtherBedItem(BAMBOO_ORANGE_BED_I); registerOtherBedItem(BOUND_BAMBOO_ORANGE_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_ORANGE_BED_I); registerOtherBedItem(BIRCH_ORANGE_BED_I); registerOtherBedItem(CHERRY_ORANGE_BED_I); registerOtherBedItem(CRIMSON_ORANGE_BED_I); registerOtherBedItem(DARK_OAK_ORANGE_BED_I); registerOtherBedItem(PALE_OAK_ORANGE_BED_I); registerOtherBedItem(JUNGLE_ORANGE_BED_I); registerOtherBedItem(MANGROVE_ORANGE_BED_I); more_bed_items.add(Items.BED.orange()); registerOtherBedItem(SPRUCE_ORANGE_BED_I); registerOtherBedItem(WARPED_ORANGE_BED_I);
        // YELLOW
        registerOtherBedItem(ACACIA_YELLOW_BED_I); registerOtherBedItem(BAMBOO_YELLOW_BED_I); registerOtherBedItem(BOUND_BAMBOO_YELLOW_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_YELLOW_BED_I); registerOtherBedItem(BIRCH_YELLOW_BED_I); registerOtherBedItem(CHERRY_YELLOW_BED_I); registerOtherBedItem(CRIMSON_YELLOW_BED_I); registerOtherBedItem(DARK_OAK_YELLOW_BED_I); registerOtherBedItem(PALE_OAK_YELLOW_BED_I); registerOtherBedItem(JUNGLE_YELLOW_BED_I); registerOtherBedItem(MANGROVE_YELLOW_BED_I); more_bed_items.add(Items.BED.yellow()); registerOtherBedItem(SPRUCE_YELLOW_BED_I); registerOtherBedItem(WARPED_YELLOW_BED_I);
        // LIME
        registerOtherBedItem(ACACIA_LIME_BED_I); registerOtherBedItem(BAMBOO_LIME_BED_I); registerOtherBedItem(BOUND_BAMBOO_LIME_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_LIME_BED_I); registerOtherBedItem(BIRCH_LIME_BED_I); registerOtherBedItem(CHERRY_LIME_BED_I); registerOtherBedItem(CRIMSON_LIME_BED_I); registerOtherBedItem(DARK_OAK_LIME_BED_I); registerOtherBedItem(PALE_OAK_LIME_BED_I); registerOtherBedItem(JUNGLE_LIME_BED_I); registerOtherBedItem(MANGROVE_LIME_BED_I); more_bed_items.add(Items.BED.lime()); registerOtherBedItem(SPRUCE_LIME_BED_I); registerOtherBedItem(WARPED_LIME_BED_I);
        // GREEN
        registerOtherBedItem(ACACIA_GREEN_BED_I); registerOtherBedItem(BAMBOO_GREEN_BED_I); registerOtherBedItem(BOUND_BAMBOO_GREEN_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_GREEN_BED_I); registerOtherBedItem(BIRCH_GREEN_BED_I); registerOtherBedItem(CHERRY_GREEN_BED_I); registerOtherBedItem(CRIMSON_GREEN_BED_I); registerOtherBedItem(DARK_OAK_GREEN_BED_I); registerOtherBedItem(PALE_OAK_GREEN_BED_I); registerOtherBedItem(JUNGLE_GREEN_BED_I); registerOtherBedItem(MANGROVE_GREEN_BED_I); more_bed_items.add(Items.BED.green()); registerOtherBedItem(SPRUCE_GREEN_BED_I); registerOtherBedItem(WARPED_GREEN_BED_I);
        // CYAN
        registerOtherBedItem(ACACIA_CYAN_BED_I); registerOtherBedItem(BAMBOO_CYAN_BED_I); registerOtherBedItem(BOUND_BAMBOO_CYAN_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_CYAN_BED_I); registerOtherBedItem(BIRCH_CYAN_BED_I); registerOtherBedItem(CHERRY_CYAN_BED_I); registerOtherBedItem(CRIMSON_CYAN_BED_I); registerOtherBedItem(DARK_OAK_CYAN_BED_I); registerOtherBedItem(PALE_OAK_CYAN_BED_I); registerOtherBedItem(JUNGLE_CYAN_BED_I); registerOtherBedItem(MANGROVE_CYAN_BED_I); more_bed_items.add(Items.BED.cyan()); registerOtherBedItem(SPRUCE_CYAN_BED_I); registerOtherBedItem(WARPED_CYAN_BED_I);
        // LIGHT_BLUE
        registerOtherBedItem(ACACIA_LIGHT_BLUE_BED_I); registerOtherBedItem(BAMBOO_LIGHT_BLUE_BED_I); registerOtherBedItem(BOUND_BAMBOO_LIGHT_BLUE_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_LIGHT_BLUE_BED_I); registerOtherBedItem(BIRCH_LIGHT_BLUE_BED_I); registerOtherBedItem(CHERRY_LIGHT_BLUE_BED_I); registerOtherBedItem(CRIMSON_LIGHT_BLUE_BED_I); registerOtherBedItem(DARK_OAK_LIGHT_BLUE_BED_I); registerOtherBedItem(PALE_OAK_LIGHT_BLUE_BED_I); registerOtherBedItem(JUNGLE_LIGHT_BLUE_BED_I); registerOtherBedItem(MANGROVE_LIGHT_BLUE_BED_I); more_bed_items.add(Items.BED.lightBlue()); registerOtherBedItem(SPRUCE_LIGHT_BLUE_BED_I); registerOtherBedItem(WARPED_LIGHT_BLUE_BED_I);
        // BLUE
        registerOtherBedItem(ACACIA_BLUE_BED_I); registerOtherBedItem(BAMBOO_BLUE_BED_I); registerOtherBedItem(BOUND_BAMBOO_BLUE_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_BLUE_BED_I); registerOtherBedItem(BIRCH_BLUE_BED_I); registerOtherBedItem(CHERRY_BLUE_BED_I); registerOtherBedItem(CRIMSON_BLUE_BED_I); registerOtherBedItem(DARK_OAK_BLUE_BED_I); registerOtherBedItem(PALE_OAK_BLUE_BED_I); registerOtherBedItem(JUNGLE_BLUE_BED_I); registerOtherBedItem(MANGROVE_BLUE_BED_I); more_bed_items.add(Items.BED.blue()); registerOtherBedItem(SPRUCE_BLUE_BED_I); registerOtherBedItem(WARPED_BLUE_BED_I);
        // PURPLE
        registerOtherBedItem(ACACIA_PURPLE_BED_I); registerOtherBedItem(BAMBOO_PURPLE_BED_I); registerOtherBedItem(BOUND_BAMBOO_PURPLE_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_PURPLE_BED_I); registerOtherBedItem(BIRCH_PURPLE_BED_I); registerOtherBedItem(CHERRY_PURPLE_BED_I); registerOtherBedItem(CRIMSON_PURPLE_BED_I); registerOtherBedItem(DARK_OAK_PURPLE_BED_I); registerOtherBedItem(PALE_OAK_PURPLE_BED_I); registerOtherBedItem(JUNGLE_PURPLE_BED_I); registerOtherBedItem(MANGROVE_PURPLE_BED_I); more_bed_items.add(Items.BED.purple()); registerOtherBedItem(SPRUCE_PURPLE_BED_I); registerOtherBedItem(WARPED_PURPLE_BED_I);
        // MAGENTA
        registerOtherBedItem(ACACIA_MAGENTA_BED_I); registerOtherBedItem(BAMBOO_MAGENTA_BED_I); registerOtherBedItem(BOUND_BAMBOO_MAGENTA_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_MAGENTA_BED_I); registerOtherBedItem(BIRCH_MAGENTA_BED_I); registerOtherBedItem(CHERRY_MAGENTA_BED_I); registerOtherBedItem(CRIMSON_MAGENTA_BED_I); registerOtherBedItem(DARK_OAK_MAGENTA_BED_I); registerOtherBedItem(PALE_OAK_MAGENTA_BED_I); registerOtherBedItem(JUNGLE_MAGENTA_BED_I); registerOtherBedItem(MANGROVE_MAGENTA_BED_I); more_bed_items.add(Items.BED.magenta()); registerOtherBedItem(SPRUCE_MAGENTA_BED_I); registerOtherBedItem(WARPED_MAGENTA_BED_I);
        // PINK
        registerOtherBedItem(ACACIA_PINK_BED_I); registerOtherBedItem(BAMBOO_PINK_BED_I); registerOtherBedItem(BOUND_BAMBOO_PINK_BED_I); registerOtherBedItem(STRIPPED_BOUND_BAMBOO_PINK_BED_I); registerOtherBedItem(BIRCH_PINK_BED_I); registerOtherBedItem(CHERRY_PINK_BED_I); registerOtherBedItem(CRIMSON_PINK_BED_I); registerOtherBedItem(DARK_OAK_PINK_BED_I); registerOtherBedItem(PALE_OAK_PINK_BED_I); registerOtherBedItem(JUNGLE_PINK_BED_I); registerOtherBedItem(MANGROVE_PINK_BED_I); more_bed_items.add(Items.BED.pink()); registerOtherBedItem(SPRUCE_PINK_BED_I); registerOtherBedItem(WARPED_PINK_BED_I);

    }

    private static void registerWhiteBedItem(Item whiteBed, Item bedAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreBedVariants.withModId(((MoreBedVariantBlock)((BedItem) whiteBed).getBlock()).bedWoodType + "_" + ((MoreBedVariantBlock) ((BedItem) whiteBed).getBlock()).bedColor + "_bed"), whiteBed);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> entries.insertAfter(bedAfter, whiteBed));
        more_bed_items.add(whiteBed);
    }
    private static void registerOtherBedItem (Item otherBed) {
        Registry.register(BuiltInRegistries.ITEM, MoreBedVariants.withModId(((MoreBedVariantBlock) ((BedItem) otherBed).getBlock()).bedWoodType + "_" + ((MoreBedVariantBlock) ((BedItem) otherBed).getBlock()).bedColor + "_bed"), otherBed);

        more_bed_items.add(otherBed);
    }
}