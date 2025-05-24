package de.pnku.mbdv.init;

import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.block.BoundBambooBedBlockEntity;
import de.pnku.mbdv.block.MoreBedVariantBlock;
import de.pnku.mbdv.block.MoreBedVariantBlockEntity;
import de.pnku.mbdv.poi.MbdvPointOfInterestTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class MbdvBlockInit {
    // WHITE
    public static final MoreBedVariantBlock ACACIA_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, "acacia", "white");
    public static final MoreBedVariantBlock BIRCH_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, "birch", "white");
    public static final MoreBedVariantBlock BAMBOO_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, SoundType.BAMBOO_WOOD, "bamboo", "white");
    public static final MoreBedVariantBlock BOUND_BAMBOO_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, SoundType.BAMBOO_WOOD, "bound_bamboo", "white");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "white");
    public static final MoreBedVariantBlock CHERRY_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, SoundType.CHERRY_WOOD, "cherry", "white");
    public static final MoreBedVariantBlock CRIMSON_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, SoundType.NETHER_WOOD, "crimson", "white");
    public static final MoreBedVariantBlock DARK_OAK_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, "dark_oak", "white");
    public static final MoreBedVariantBlock JUNGLE_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, "jungle", "white");
    public static final MoreBedVariantBlock MANGROVE_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, "mangrove", "white");
    public static final MoreBedVariantBlock SPRUCE_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, "spruce", "white");
    public static final MoreBedVariantBlock WARPED_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, SoundType.NETHER_WOOD, "warped", "white");
    // ORANGE
    public static final MoreBedVariantBlock ACACIA_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, "acacia", "orange");
    public static final MoreBedVariantBlock BIRCH_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, "birch", "orange");
    public static final MoreBedVariantBlock BAMBOO_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, SoundType.BAMBOO_WOOD, "bamboo", "orange");
    public static final MoreBedVariantBlock BOUND_BAMBOO_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, SoundType.BAMBOO_WOOD, "bound_bamboo", "orange");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "orange");
    public static final MoreBedVariantBlock CHERRY_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, SoundType.CHERRY_WOOD, "cherry", "orange");
    public static final MoreBedVariantBlock CRIMSON_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, SoundType.NETHER_WOOD, "crimson", "orange");
    public static final MoreBedVariantBlock DARK_OAK_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, "dark_oak", "orange");
    public static final MoreBedVariantBlock JUNGLE_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, "jungle", "orange");
    public static final MoreBedVariantBlock MANGROVE_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, "mangrove", "orange");
    public static final MoreBedVariantBlock SPRUCE_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, "spruce", "orange");
    public static final MoreBedVariantBlock WARPED_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, SoundType.NETHER_WOOD, "warped", "orange");
    // MAGENTA
    public static final MoreBedVariantBlock ACACIA_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, "acacia", "magenta");
    public static final MoreBedVariantBlock BIRCH_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, "birch", "magenta");
    public static final MoreBedVariantBlock BAMBOO_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, SoundType.BAMBOO_WOOD, "bamboo", "magenta");
    public static final MoreBedVariantBlock BOUND_BAMBOO_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, SoundType.BAMBOO_WOOD, "bound_bamboo", "magenta");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "magenta");
    public static final MoreBedVariantBlock CHERRY_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, SoundType.CHERRY_WOOD, "cherry", "magenta");
    public static final MoreBedVariantBlock CRIMSON_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, SoundType.NETHER_WOOD, "crimson", "magenta");
    public static final MoreBedVariantBlock DARK_OAK_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, "dark_oak", "magenta");
    public static final MoreBedVariantBlock JUNGLE_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, "jungle", "magenta");
    public static final MoreBedVariantBlock MANGROVE_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, "mangrove", "magenta");
    public static final MoreBedVariantBlock SPRUCE_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, "spruce", "magenta");
    public static final MoreBedVariantBlock WARPED_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, SoundType.NETHER_WOOD, "warped", "magenta");
    // LIGHT_BLUE
    public static final MoreBedVariantBlock ACACIA_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, "acacia", "light_blue");
    public static final MoreBedVariantBlock BIRCH_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, "birch", "light_blue");
    public static final MoreBedVariantBlock BAMBOO_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, SoundType.BAMBOO_WOOD, "bamboo", "light_blue");
    public static final MoreBedVariantBlock BOUND_BAMBOO_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, SoundType.BAMBOO_WOOD, "bound_bamboo", "light_blue");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "light_blue");
    public static final MoreBedVariantBlock CHERRY_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, SoundType.CHERRY_WOOD, "cherry", "light_blue");
    public static final MoreBedVariantBlock CRIMSON_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, SoundType.NETHER_WOOD, "crimson", "light_blue");
    public static final MoreBedVariantBlock DARK_OAK_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, "dark_oak", "light_blue");
    public static final MoreBedVariantBlock JUNGLE_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, "jungle", "light_blue");
    public static final MoreBedVariantBlock MANGROVE_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, "mangrove", "light_blue");
    public static final MoreBedVariantBlock SPRUCE_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, "spruce", "light_blue");
    public static final MoreBedVariantBlock WARPED_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, SoundType.NETHER_WOOD, "warped", "light_blue");
    // YELLOW
    public static final MoreBedVariantBlock ACACIA_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, "acacia", "yellow");
    public static final MoreBedVariantBlock BIRCH_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, "birch", "yellow");
    public static final MoreBedVariantBlock BAMBOO_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "yellow");
    public static final MoreBedVariantBlock BOUND_BAMBOO_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, SoundType.BAMBOO_WOOD, "bound_bamboo", "yellow");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "yellow");
    public static final MoreBedVariantBlock CHERRY_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, SoundType.CHERRY_WOOD, "cherry", "yellow");
    public static final MoreBedVariantBlock CRIMSON_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, SoundType.NETHER_WOOD, "crimson", "yellow");
    public static final MoreBedVariantBlock DARK_OAK_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, "dark_oak", "yellow");
    public static final MoreBedVariantBlock JUNGLE_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, "jungle", "yellow");
    public static final MoreBedVariantBlock MANGROVE_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, "mangrove", "yellow");
    public static final MoreBedVariantBlock SPRUCE_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, "spruce", "yellow");
    public static final MoreBedVariantBlock WARPED_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, SoundType.NETHER_WOOD, "warped", "yellow");
    // LIME
    public static final MoreBedVariantBlock ACACIA_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, "acacia", "lime");
    public static final MoreBedVariantBlock BIRCH_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, "birch", "lime");
    public static final MoreBedVariantBlock BAMBOO_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, SoundType.BAMBOO_WOOD, "bamboo", "lime");
    public static final MoreBedVariantBlock BOUND_BAMBOO_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, SoundType.BAMBOO_WOOD, "bound_bamboo", "lime");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "lime");
    public static final MoreBedVariantBlock CHERRY_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, SoundType.CHERRY_WOOD, "cherry", "lime");
    public static final MoreBedVariantBlock CRIMSON_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, SoundType.NETHER_WOOD, "crimson", "lime");
    public static final MoreBedVariantBlock DARK_OAK_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, "dark_oak", "lime");
    public static final MoreBedVariantBlock JUNGLE_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, "jungle", "lime");
    public static final MoreBedVariantBlock MANGROVE_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, "mangrove", "lime");
    public static final MoreBedVariantBlock SPRUCE_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, "spruce", "lime");
    public static final MoreBedVariantBlock WARPED_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, SoundType.NETHER_WOOD, "warped", "lime");
    // PINK
    public static final MoreBedVariantBlock ACACIA_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, "acacia", "pink");
    public static final MoreBedVariantBlock BIRCH_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, "birch", "pink");
    public static final MoreBedVariantBlock BAMBOO_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, SoundType.BAMBOO_WOOD, "bamboo", "pink");
    public static final MoreBedVariantBlock BOUND_BAMBOO_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, SoundType.BAMBOO_WOOD, "bound_bamboo", "pink");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "pink");
    public static final MoreBedVariantBlock CHERRY_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, SoundType.CHERRY_WOOD, "cherry", "pink");
    public static final MoreBedVariantBlock CRIMSON_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, SoundType.NETHER_WOOD, "crimson", "pink");
    public static final MoreBedVariantBlock DARK_OAK_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, "dark_oak", "pink");
    public static final MoreBedVariantBlock JUNGLE_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, "jungle", "pink");
    public static final MoreBedVariantBlock MANGROVE_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, "mangrove", "pink");
    public static final MoreBedVariantBlock SPRUCE_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, "spruce", "pink");
    public static final MoreBedVariantBlock WARPED_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, SoundType.NETHER_WOOD, "warped", "pink");
    // GRAY
    public static final MoreBedVariantBlock ACACIA_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, "acacia", "gray");
    public static final MoreBedVariantBlock BIRCH_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, "birch", "gray");
    public static final MoreBedVariantBlock BAMBOO_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, SoundType.BAMBOO_WOOD, "bamboo", "gray");
    public static final MoreBedVariantBlock BOUND_BAMBOO_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, SoundType.BAMBOO_WOOD, "bound_bamboo", "gray");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "gray");
    public static final MoreBedVariantBlock CHERRY_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, SoundType.CHERRY_WOOD, "cherry", "gray");
    public static final MoreBedVariantBlock CRIMSON_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, SoundType.NETHER_WOOD, "crimson", "gray");
    public static final MoreBedVariantBlock DARK_OAK_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, "dark_oak", "gray");
    public static final MoreBedVariantBlock JUNGLE_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, "jungle", "gray");
    public static final MoreBedVariantBlock MANGROVE_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, "mangrove", "gray");
    public static final MoreBedVariantBlock SPRUCE_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, "spruce", "gray");
    public static final MoreBedVariantBlock WARPED_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, SoundType.NETHER_WOOD, "warped", "gray");
    // LIGHT_GRAY
    public static final MoreBedVariantBlock ACACIA_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, "acacia", "light_gray");
    public static final MoreBedVariantBlock BIRCH_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, "birch", "light_gray");
    public static final MoreBedVariantBlock BAMBOO_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, SoundType.BAMBOO_WOOD, "bamboo", "light_gray");
    public static final MoreBedVariantBlock BOUND_BAMBOO_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, SoundType.BAMBOO_WOOD, "bound_bamboo", "light_gray");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "light_gray");
    public static final MoreBedVariantBlock CHERRY_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, SoundType.CHERRY_WOOD, "cherry", "light_gray");
    public static final MoreBedVariantBlock CRIMSON_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, SoundType.NETHER_WOOD, "crimson", "light_gray");
    public static final MoreBedVariantBlock DARK_OAK_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, "dark_oak", "light_gray");
    public static final MoreBedVariantBlock JUNGLE_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, "jungle", "light_gray");
    public static final MoreBedVariantBlock MANGROVE_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, "mangrove", "light_gray");
    public static final MoreBedVariantBlock SPRUCE_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, "spruce", "light_gray");
    public static final MoreBedVariantBlock WARPED_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, SoundType.NETHER_WOOD, "warped", "light_gray");
    // CYAN
    public static final MoreBedVariantBlock ACACIA_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, "acacia", "cyan");
    public static final MoreBedVariantBlock BIRCH_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, "birch", "cyan");
    public static final MoreBedVariantBlock BAMBOO_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, SoundType.BAMBOO_WOOD, "bamboo", "cyan");
    public static final MoreBedVariantBlock BOUND_BAMBOO_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, SoundType.BAMBOO_WOOD, "bound_bamboo", "cyan");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "cyan");
    public static final MoreBedVariantBlock CHERRY_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, SoundType.CHERRY_WOOD, "cherry", "cyan");
    public static final MoreBedVariantBlock CRIMSON_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, SoundType.NETHER_WOOD, "crimson", "cyan");
    public static final MoreBedVariantBlock DARK_OAK_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, "dark_oak", "cyan");
    public static final MoreBedVariantBlock JUNGLE_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, "jungle", "cyan");
    public static final MoreBedVariantBlock MANGROVE_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, "mangrove", "cyan");
    public static final MoreBedVariantBlock SPRUCE_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, "spruce", "cyan");
    public static final MoreBedVariantBlock WARPED_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, SoundType.NETHER_WOOD, "warped", "cyan");
    // PURPLE
    public static final MoreBedVariantBlock ACACIA_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, "acacia", "purple");
    public static final MoreBedVariantBlock BIRCH_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, "birch", "purple");
    public static final MoreBedVariantBlock BAMBOO_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, SoundType.BAMBOO_WOOD, "bamboo", "purple");
    public static final MoreBedVariantBlock BOUND_BAMBOO_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, SoundType.BAMBOO_WOOD, "bound_bamboo", "purple");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "purple");
    public static final MoreBedVariantBlock CHERRY_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, SoundType.CHERRY_WOOD, "cherry", "purple");
    public static final MoreBedVariantBlock CRIMSON_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, SoundType.NETHER_WOOD, "crimson", "purple");
    public static final MoreBedVariantBlock DARK_OAK_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, "dark_oak", "purple");
    public static final MoreBedVariantBlock JUNGLE_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, "jungle", "purple");
    public static final MoreBedVariantBlock MANGROVE_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, "mangrove", "purple");
    public static final MoreBedVariantBlock SPRUCE_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, "spruce", "purple");
    public static final MoreBedVariantBlock WARPED_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, SoundType.NETHER_WOOD, "warped", "purple");
    // BLUE
    public static final MoreBedVariantBlock ACACIA_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, "acacia", "blue");
    public static final MoreBedVariantBlock BIRCH_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, "birch", "blue");
    public static final MoreBedVariantBlock BAMBOO_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, SoundType.BAMBOO_WOOD, "bamboo", "blue");
    public static final MoreBedVariantBlock BOUND_BAMBOO_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, SoundType.BAMBOO_WOOD, "bound_bamboo", "blue");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "blue");
    public static final MoreBedVariantBlock CHERRY_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, SoundType.CHERRY_WOOD, "cherry", "blue");
    public static final MoreBedVariantBlock CRIMSON_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, SoundType.NETHER_WOOD, "crimson", "blue");
    public static final MoreBedVariantBlock DARK_OAK_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, "dark_oak", "blue");
    public static final MoreBedVariantBlock JUNGLE_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, "jungle", "blue");
    public static final MoreBedVariantBlock MANGROVE_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, "mangrove", "blue");
    public static final MoreBedVariantBlock SPRUCE_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, "spruce", "blue");
    public static final MoreBedVariantBlock WARPED_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, SoundType.NETHER_WOOD, "warped", "blue");
    // BROWN
    public static final MoreBedVariantBlock ACACIA_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, "acacia", "brown");
    public static final MoreBedVariantBlock BIRCH_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, "birch", "brown");
    public static final MoreBedVariantBlock BAMBOO_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, SoundType.BAMBOO_WOOD, "bamboo", "brown");
    public static final MoreBedVariantBlock BOUND_BAMBOO_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, SoundType.BAMBOO_WOOD, "bound_bamboo", "brown");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "brown");
    public static final MoreBedVariantBlock CHERRY_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, SoundType.CHERRY_WOOD, "cherry", "brown");
    public static final MoreBedVariantBlock CRIMSON_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, SoundType.NETHER_WOOD, "crimson", "brown");
    public static final MoreBedVariantBlock DARK_OAK_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, "dark_oak", "brown");
    public static final MoreBedVariantBlock JUNGLE_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, "jungle", "brown");
    public static final MoreBedVariantBlock MANGROVE_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, "mangrove", "brown");
    public static final MoreBedVariantBlock SPRUCE_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, "spruce", "brown");
    public static final MoreBedVariantBlock WARPED_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, SoundType.NETHER_WOOD, "warped", "brown");
    // GREEN
    public static final MoreBedVariantBlock ACACIA_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, "acacia", "green");
    public static final MoreBedVariantBlock BIRCH_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, "birch", "green");
    public static final MoreBedVariantBlock BAMBOO_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, SoundType.BAMBOO_WOOD, "bamboo", "green");
    public static final MoreBedVariantBlock BOUND_BAMBOO_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, SoundType.BAMBOO_WOOD, "bound_bamboo", "green");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "green");
    public static final MoreBedVariantBlock CHERRY_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, SoundType.CHERRY_WOOD, "cherry", "green");
    public static final MoreBedVariantBlock CRIMSON_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, SoundType.NETHER_WOOD, "crimson", "green");
    public static final MoreBedVariantBlock DARK_OAK_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, "dark_oak", "green");
    public static final MoreBedVariantBlock JUNGLE_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, "jungle", "green");
    public static final MoreBedVariantBlock MANGROVE_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, "mangrove", "green");
    public static final MoreBedVariantBlock SPRUCE_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, "spruce", "green");
    public static final MoreBedVariantBlock WARPED_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, SoundType.NETHER_WOOD, "warped", "green");
    // RED
    public static final MoreBedVariantBlock ACACIA_RED_BED = new MoreBedVariantBlock(DyeColor.RED, "acacia", "red");
    public static final MoreBedVariantBlock BIRCH_RED_BED = new MoreBedVariantBlock(DyeColor.RED, "birch", "red");
    public static final MoreBedVariantBlock BAMBOO_RED_BED = new MoreBedVariantBlock(DyeColor.RED, SoundType.BAMBOO_WOOD, "bamboo", "red");
    public static final MoreBedVariantBlock BOUND_BAMBOO_RED_BED = new MoreBedVariantBlock(DyeColor.RED, SoundType.BAMBOO_WOOD, "bound_bamboo", "red");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_RED_BED = new MoreBedVariantBlock(DyeColor.RED, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "red");
    public static final MoreBedVariantBlock CHERRY_RED_BED = new MoreBedVariantBlock(DyeColor.RED, SoundType.CHERRY_WOOD, "cherry", "red");
    public static final MoreBedVariantBlock CRIMSON_RED_BED = new MoreBedVariantBlock(DyeColor.RED, SoundType.NETHER_WOOD, "crimson", "red");
    public static final MoreBedVariantBlock DARK_OAK_RED_BED = new MoreBedVariantBlock(DyeColor.RED, "dark_oak", "red");
    public static final MoreBedVariantBlock JUNGLE_RED_BED = new MoreBedVariantBlock(DyeColor.RED, "jungle", "red");
    public static final MoreBedVariantBlock MANGROVE_RED_BED = new MoreBedVariantBlock(DyeColor.RED, "mangrove", "red");
    public static final MoreBedVariantBlock SPRUCE_RED_BED = new MoreBedVariantBlock(DyeColor.RED, "spruce", "red");
    public static final MoreBedVariantBlock WARPED_RED_BED = new MoreBedVariantBlock(DyeColor.RED, SoundType.NETHER_WOOD, "warped", "red");
    // BLACK
    public static final MoreBedVariantBlock ACACIA_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, "acacia", "black");
    public static final MoreBedVariantBlock BIRCH_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, "birch", "black");
    public static final MoreBedVariantBlock BAMBOO_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, SoundType.BAMBOO_WOOD, "bamboo", "black");
    public static final MoreBedVariantBlock BOUND_BAMBOO_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, SoundType.BAMBOO_WOOD, "bound_bamboo", "black");
    public static final MoreBedVariantBlock STRIPPED_BOUND_BAMBOO_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, SoundType.BAMBOO_WOOD, "stripped_bound_bamboo", "black");
    public static final MoreBedVariantBlock CHERRY_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, SoundType.CHERRY_WOOD, "cherry", "black");
    public static final MoreBedVariantBlock CRIMSON_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, SoundType.NETHER_WOOD, "crimson", "black");
    public static final MoreBedVariantBlock DARK_OAK_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, "dark_oak", "black");
    public static final MoreBedVariantBlock JUNGLE_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, "jungle", "black");
    public static final MoreBedVariantBlock MANGROVE_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, "mangrove", "black");
    public static final MoreBedVariantBlock SPRUCE_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, "spruce", "black");
    public static final MoreBedVariantBlock WARPED_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, SoundType.NETHER_WOOD, "warped", "black");


    public static BlockEntityType<MoreBedVariantBlockEntity> MORE_BED_VARIANT_BLOCK_ENTITY;
    public static BlockEntityType<BoundBambooBedBlockEntity> BOUND_BAMBOO_BED_BLOCK_ENTITY;

    public static final List<Block> more_beds = new ArrayList<>();
    public static final List<Block> more_bound_bamboo_beds = new ArrayList<>();

    public static void registerBedBlocks() {
        // WHITE
        registerBedBlock(ACACIA_WHITE_BED);
        registerBedBlock(BAMBOO_WHITE_BED);
        registerBoundBambooBedBlock(BOUND_BAMBOO_WHITE_BED);
        registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_WHITE_BED);
        registerBedBlock(BIRCH_WHITE_BED);
        registerBedBlock(CHERRY_WHITE_BED);
        registerBedBlock(CRIMSON_WHITE_BED);
        registerBedBlock(DARK_OAK_WHITE_BED);
        registerBedBlock(JUNGLE_WHITE_BED);
        registerBedBlock(MANGROVE_WHITE_BED);
        registerBedBlock(SPRUCE_WHITE_BED);
        registerBedBlock(WARPED_WHITE_BED);
        // ORANGE
        registerBedBlock(ACACIA_ORANGE_BED);registerBedBlock(BAMBOO_ORANGE_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_ORANGE_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_ORANGE_BED);registerBedBlock(BIRCH_ORANGE_BED);registerBedBlock(CHERRY_ORANGE_BED);registerBedBlock(CRIMSON_ORANGE_BED);registerBedBlock(DARK_OAK_ORANGE_BED);registerBedBlock(JUNGLE_ORANGE_BED);registerBedBlock(MANGROVE_ORANGE_BED);registerBedBlock(SPRUCE_ORANGE_BED);registerBedBlock(WARPED_ORANGE_BED);
        // MAGENTA
        registerBedBlock(ACACIA_MAGENTA_BED);registerBedBlock(BAMBOO_MAGENTA_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_MAGENTA_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_MAGENTA_BED);registerBedBlock(BIRCH_MAGENTA_BED);registerBedBlock(CHERRY_MAGENTA_BED);registerBedBlock(CRIMSON_MAGENTA_BED);registerBedBlock(DARK_OAK_MAGENTA_BED);registerBedBlock(JUNGLE_MAGENTA_BED);registerBedBlock(MANGROVE_MAGENTA_BED);registerBedBlock(SPRUCE_MAGENTA_BED);registerBedBlock(WARPED_MAGENTA_BED);
        // LIGHT_BLUE
        registerBedBlock(ACACIA_LIGHT_BLUE_BED);registerBedBlock(BAMBOO_LIGHT_BLUE_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_LIGHT_BLUE_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_LIGHT_BLUE_BED);registerBedBlock(BIRCH_LIGHT_BLUE_BED);registerBedBlock(CHERRY_LIGHT_BLUE_BED);registerBedBlock(CRIMSON_LIGHT_BLUE_BED);registerBedBlock(DARK_OAK_LIGHT_BLUE_BED);registerBedBlock(JUNGLE_LIGHT_BLUE_BED);registerBedBlock(MANGROVE_LIGHT_BLUE_BED);registerBedBlock(SPRUCE_LIGHT_BLUE_BED);registerBedBlock(WARPED_LIGHT_BLUE_BED);
        // YELLOW
        registerBedBlock(ACACIA_YELLOW_BED);registerBedBlock(BAMBOO_YELLOW_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_YELLOW_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_YELLOW_BED);registerBedBlock(BIRCH_YELLOW_BED);registerBedBlock(CHERRY_YELLOW_BED);registerBedBlock(CRIMSON_YELLOW_BED);registerBedBlock(DARK_OAK_YELLOW_BED);registerBedBlock(JUNGLE_YELLOW_BED);registerBedBlock(MANGROVE_YELLOW_BED);registerBedBlock(SPRUCE_YELLOW_BED);registerBedBlock(WARPED_YELLOW_BED);
        // LIME
        registerBedBlock(ACACIA_LIME_BED);registerBedBlock(BAMBOO_LIME_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_LIME_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_LIME_BED);registerBedBlock(BIRCH_LIME_BED);registerBedBlock(CHERRY_LIME_BED);registerBedBlock(CRIMSON_LIME_BED);registerBedBlock(DARK_OAK_LIME_BED);registerBedBlock(JUNGLE_LIME_BED);registerBedBlock(MANGROVE_LIME_BED);registerBedBlock(SPRUCE_LIME_BED);registerBedBlock(WARPED_LIME_BED);
        // PINK
        registerBedBlock(ACACIA_PINK_BED);registerBedBlock(BAMBOO_PINK_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_PINK_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_PINK_BED);registerBedBlock(BIRCH_PINK_BED);registerBedBlock(CHERRY_PINK_BED);registerBedBlock(CRIMSON_PINK_BED);registerBedBlock(DARK_OAK_PINK_BED);registerBedBlock(JUNGLE_PINK_BED);registerBedBlock(MANGROVE_PINK_BED);registerBedBlock(SPRUCE_PINK_BED);registerBedBlock(WARPED_PINK_BED);
        // GRAY
        registerBedBlock(ACACIA_GRAY_BED);registerBedBlock(BAMBOO_GRAY_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_GRAY_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_GRAY_BED);registerBedBlock(BIRCH_GRAY_BED);registerBedBlock(CHERRY_GRAY_BED);registerBedBlock(CRIMSON_GRAY_BED);registerBedBlock(DARK_OAK_GRAY_BED);registerBedBlock(JUNGLE_GRAY_BED);registerBedBlock(MANGROVE_GRAY_BED);registerBedBlock(SPRUCE_GRAY_BED);registerBedBlock(WARPED_GRAY_BED);
        // LIGHT_GRAY
        registerBedBlock(ACACIA_LIGHT_GRAY_BED);registerBedBlock(BAMBOO_LIGHT_GRAY_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_LIGHT_GRAY_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_LIGHT_GRAY_BED);registerBedBlock(BIRCH_LIGHT_GRAY_BED);registerBedBlock(CHERRY_LIGHT_GRAY_BED);registerBedBlock(CRIMSON_LIGHT_GRAY_BED);registerBedBlock(DARK_OAK_LIGHT_GRAY_BED);registerBedBlock(JUNGLE_LIGHT_GRAY_BED);registerBedBlock(MANGROVE_LIGHT_GRAY_BED);registerBedBlock(SPRUCE_LIGHT_GRAY_BED);registerBedBlock(WARPED_LIGHT_GRAY_BED);
        // CYAN
        registerBedBlock(ACACIA_CYAN_BED);registerBedBlock(BAMBOO_CYAN_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_CYAN_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_CYAN_BED);registerBedBlock(BIRCH_CYAN_BED);registerBedBlock(CHERRY_CYAN_BED);registerBedBlock(CRIMSON_CYAN_BED);registerBedBlock(DARK_OAK_CYAN_BED);registerBedBlock(JUNGLE_CYAN_BED);registerBedBlock(MANGROVE_CYAN_BED);registerBedBlock(SPRUCE_CYAN_BED);registerBedBlock(WARPED_CYAN_BED);
        // PURPLE
        registerBedBlock(ACACIA_PURPLE_BED);registerBedBlock(BAMBOO_PURPLE_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_PURPLE_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_PURPLE_BED);registerBedBlock(BIRCH_PURPLE_BED);registerBedBlock(CHERRY_PURPLE_BED);registerBedBlock(CRIMSON_PURPLE_BED);registerBedBlock(DARK_OAK_PURPLE_BED);registerBedBlock(JUNGLE_PURPLE_BED);registerBedBlock(MANGROVE_PURPLE_BED);registerBedBlock(SPRUCE_PURPLE_BED);registerBedBlock(WARPED_PURPLE_BED);
        // BLUE
        registerBedBlock(ACACIA_BLUE_BED);registerBedBlock(BAMBOO_BLUE_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_BLUE_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_BLUE_BED);registerBedBlock(BIRCH_BLUE_BED);registerBedBlock(CHERRY_BLUE_BED);registerBedBlock(CRIMSON_BLUE_BED);registerBedBlock(DARK_OAK_BLUE_BED);registerBedBlock(JUNGLE_BLUE_BED);registerBedBlock(MANGROVE_BLUE_BED);registerBedBlock(SPRUCE_BLUE_BED);registerBedBlock(WARPED_BLUE_BED);
        // BROWN
        registerBedBlock(ACACIA_BROWN_BED);registerBedBlock(BAMBOO_BROWN_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_BROWN_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_BROWN_BED);registerBedBlock(BIRCH_BROWN_BED);registerBedBlock(CHERRY_BROWN_BED);registerBedBlock(CRIMSON_BROWN_BED);registerBedBlock(DARK_OAK_BROWN_BED);registerBedBlock(JUNGLE_BROWN_BED);registerBedBlock(MANGROVE_BROWN_BED);registerBedBlock(SPRUCE_BROWN_BED);registerBedBlock(WARPED_BROWN_BED);
        // GREEN
        registerBedBlock(ACACIA_GREEN_BED);registerBedBlock(BAMBOO_GREEN_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_GREEN_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_GREEN_BED);registerBedBlock(BIRCH_GREEN_BED);registerBedBlock(CHERRY_GREEN_BED);registerBedBlock(CRIMSON_GREEN_BED);registerBedBlock(DARK_OAK_GREEN_BED);registerBedBlock(JUNGLE_GREEN_BED);registerBedBlock(MANGROVE_GREEN_BED);registerBedBlock(SPRUCE_GREEN_BED);registerBedBlock(WARPED_GREEN_BED);
        // RED
        registerBedBlock(ACACIA_RED_BED);registerBedBlock(BAMBOO_RED_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_RED_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_RED_BED);registerBedBlock(BIRCH_RED_BED);registerBedBlock(CHERRY_RED_BED);registerBedBlock(CRIMSON_RED_BED);registerBedBlock(DARK_OAK_RED_BED);registerBedBlock(JUNGLE_RED_BED);registerBedBlock(MANGROVE_RED_BED);registerBedBlock(SPRUCE_RED_BED);registerBedBlock(WARPED_RED_BED);
        // BLACK
        registerBedBlock(ACACIA_BLACK_BED);registerBedBlock(BAMBOO_BLACK_BED);registerBoundBambooBedBlock(BOUND_BAMBOO_BLACK_BED);registerBoundBambooBedBlock(STRIPPED_BOUND_BAMBOO_BLACK_BED);registerBedBlock(BIRCH_BLACK_BED);registerBedBlock(CHERRY_BLACK_BED);registerBedBlock(CRIMSON_BLACK_BED);registerBedBlock(DARK_OAK_BLACK_BED);registerBedBlock(JUNGLE_BLACK_BED);registerBedBlock(MANGROVE_BLACK_BED);registerBedBlock(SPRUCE_BLACK_BED);registerBedBlock(WARPED_BLACK_BED);

        List<Block> planks_beds = more_beds; planks_beds.removeAll(more_bound_bamboo_beds);
        MORE_BED_VARIANT_BLOCK_ENTITY = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, MoreBedVariants.withModId("more_bed_variants"), BlockEntityType.Builder.of(MoreBedVariantBlockEntity::new, planks_beds.toArray(Block[]::new)).build(null));
        BOUND_BAMBOO_BED_BLOCK_ENTITY = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, MoreBedVariants.withModId("more_bound_bamboo_beds"), BlockEntityType.Builder.of(BoundBambooBedBlockEntity::new, more_bound_bamboo_beds.toArray(Block[]::new)).build(null));

    }

    private static void registerBedBlock(MoreBedVariantBlock bed) {
        Registry.register(BuiltInRegistries.BLOCK, MoreBedVariants.withModId(bed.bedWoodType + "_" + bed.bedColor + "_bed"), bed);
        more_beds.add(bed);
        MbdvPointOfInterestTypes.registerBedHeadAsPoiBlock(bed);
    }

    private static void registerBoundBambooBedBlock(MoreBedVariantBlock bed) {
        more_bound_bamboo_beds.add(bed);
        registerBedBlock(bed);
    }
}
