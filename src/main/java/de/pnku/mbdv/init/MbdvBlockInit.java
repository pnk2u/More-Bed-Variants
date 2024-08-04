package de.pnku.mbdv.init;

import de.pnku.mbdv.MoreBedVariants;
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
    public static final MoreBedVariantBlock ACACIA_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.COLOR_ORANGE, "acacia", "white");
    public static final MoreBedVariantBlock BIRCH_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.SAND, "birch", "white");
    public static final MoreBedVariantBlock BAMBOO_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "white");
    public static final MoreBedVariantBlock CHERRY_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry", "white");
    public static final MoreBedVariantBlock CRIMSON_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "white");
    public static final MoreBedVariantBlock DARK_OAK_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.COLOR_BROWN, "dark_oak", "white");
    public static final MoreBedVariantBlock JUNGLE_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.DIRT, "jungle", "white");
    public static final MoreBedVariantBlock MANGROVE_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.COLOR_RED, "mangrove", "white");
    public static final MoreBedVariantBlock SPRUCE_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.PODZOL, "spruce", "white");
    public static final MoreBedVariantBlock WARPED_WHITE_BED = new MoreBedVariantBlock(DyeColor.WHITE, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "white");
    // ORANGE
    public static final MoreBedVariantBlock ACACIA_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.COLOR_ORANGE, "acacia", "orange");
    public static final MoreBedVariantBlock BIRCH_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.SAND, "birch", "orange");
    public static final MoreBedVariantBlock BAMBOO_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "orange");
    public static final MoreBedVariantBlock CHERRY_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.TERRACOTTA_ORANGE, SoundType.CHERRY_WOOD, "cherry", "orange");
    public static final MoreBedVariantBlock CRIMSON_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "orange");
    public static final MoreBedVariantBlock DARK_OAK_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.COLOR_BROWN, "dark_oak", "orange");
    public static final MoreBedVariantBlock JUNGLE_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.DIRT, "jungle", "orange");
    public static final MoreBedVariantBlock MANGROVE_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.COLOR_RED, "mangrove", "orange");
    public static final MoreBedVariantBlock SPRUCE_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.PODZOL, "spruce", "orange");
    public static final MoreBedVariantBlock WARPED_ORANGE_BED = new MoreBedVariantBlock(DyeColor.ORANGE, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "orange");
    // MAGENTA
    public static final MoreBedVariantBlock ACACIA_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.COLOR_ORANGE, "acacia", "magenta");
    public static final MoreBedVariantBlock BIRCH_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.SAND, "birch", "magenta");
    public static final MoreBedVariantBlock BAMBOO_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "magenta");
    public static final MoreBedVariantBlock CHERRY_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.TERRACOTTA_MAGENTA, SoundType.CHERRY_WOOD, "cherry", "magenta");
    public static final MoreBedVariantBlock CRIMSON_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "magenta");
    public static final MoreBedVariantBlock DARK_OAK_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.COLOR_BROWN, "dark_oak", "magenta");
    public static final MoreBedVariantBlock JUNGLE_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.DIRT, "jungle", "magenta");
    public static final MoreBedVariantBlock MANGROVE_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.COLOR_RED, "mangrove", "magenta");
    public static final MoreBedVariantBlock SPRUCE_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.PODZOL, "spruce", "magenta");
    public static final MoreBedVariantBlock WARPED_MAGENTA_BED = new MoreBedVariantBlock(DyeColor.MAGENTA, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "magenta");
    // LIGHT_BLUE
    public static final MoreBedVariantBlock ACACIA_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.COLOR_ORANGE, "acacia", "light_blue");
    public static final MoreBedVariantBlock BIRCH_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.SAND, "birch", "light_blue");
    public static final MoreBedVariantBlock BAMBOO_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "light_blue");
    public static final MoreBedVariantBlock CHERRY_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.TERRACOTTA_LIGHT_BLUE, SoundType.CHERRY_WOOD, "cherry", "light_blue");
    public static final MoreBedVariantBlock CRIMSON_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "light_blue");
    public static final MoreBedVariantBlock DARK_OAK_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.COLOR_BROWN, "dark_oak", "light_blue");
    public static final MoreBedVariantBlock JUNGLE_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.DIRT, "jungle", "light_blue");
    public static final MoreBedVariantBlock MANGROVE_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.COLOR_RED, "mangrove", "light_blue");
    public static final MoreBedVariantBlock SPRUCE_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.PODZOL, "spruce", "light_blue");
    public static final MoreBedVariantBlock WARPED_LIGHT_BLUE_BED = new MoreBedVariantBlock(DyeColor.LIGHT_BLUE, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "light_blue");
    // YELLOW
    public static final MoreBedVariantBlock ACACIA_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.COLOR_ORANGE, "acacia", "yellow");
    public static final MoreBedVariantBlock BIRCH_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.SAND, "birch", "yellow");
    public static final MoreBedVariantBlock BAMBOO_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "yellow");
    public static final MoreBedVariantBlock CHERRY_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.TERRACOTTA_YELLOW, SoundType.CHERRY_WOOD, "cherry", "yellow");
    public static final MoreBedVariantBlock CRIMSON_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "yellow");
    public static final MoreBedVariantBlock DARK_OAK_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.COLOR_BROWN, "dark_oak", "yellow");
    public static final MoreBedVariantBlock JUNGLE_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.DIRT, "jungle", "yellow");
    public static final MoreBedVariantBlock MANGROVE_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.COLOR_RED, "mangrove", "yellow");
    public static final MoreBedVariantBlock SPRUCE_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.PODZOL, "spruce", "yellow");
    public static final MoreBedVariantBlock WARPED_YELLOW_BED = new MoreBedVariantBlock(DyeColor.YELLOW, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "yellow");
    // LIME
    public static final MoreBedVariantBlock ACACIA_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.COLOR_ORANGE, "acacia", "lime");
    public static final MoreBedVariantBlock BIRCH_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.SAND, "birch", "lime");
    public static final MoreBedVariantBlock BAMBOO_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "lime");
    public static final MoreBedVariantBlock CHERRY_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.TERRACOTTA_GREEN, SoundType.CHERRY_WOOD, "cherry", "lime");
    public static final MoreBedVariantBlock CRIMSON_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "lime");
    public static final MoreBedVariantBlock DARK_OAK_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.COLOR_BROWN, "dark_oak", "lime");
    public static final MoreBedVariantBlock JUNGLE_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.DIRT, "jungle", "lime");
    public static final MoreBedVariantBlock MANGROVE_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.COLOR_RED, "mangrove", "lime");
    public static final MoreBedVariantBlock SPRUCE_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.PODZOL, "spruce", "lime");
    public static final MoreBedVariantBlock WARPED_LIME_BED = new MoreBedVariantBlock(DyeColor.LIME, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "lime");
    // PINK
    public static final MoreBedVariantBlock ACACIA_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.COLOR_ORANGE, "acacia", "pink");
    public static final MoreBedVariantBlock BIRCH_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.SAND, "birch", "pink");
    public static final MoreBedVariantBlock BAMBOO_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "pink");
    public static final MoreBedVariantBlock CHERRY_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.TERRACOTTA_PINK, SoundType.CHERRY_WOOD, "cherry", "pink");
    public static final MoreBedVariantBlock CRIMSON_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "pink");
    public static final MoreBedVariantBlock DARK_OAK_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.COLOR_BROWN, "dark_oak", "pink");
    public static final MoreBedVariantBlock JUNGLE_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.DIRT, "jungle", "pink");
    public static final MoreBedVariantBlock MANGROVE_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.COLOR_RED, "mangrove", "pink");
    public static final MoreBedVariantBlock SPRUCE_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.PODZOL, "spruce", "pink");
    public static final MoreBedVariantBlock WARPED_PINK_BED = new MoreBedVariantBlock(DyeColor.PINK, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "pink");
    // GRAY
    public static final MoreBedVariantBlock ACACIA_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.COLOR_ORANGE, "acacia", "gray");
    public static final MoreBedVariantBlock BIRCH_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.SAND, "birch", "gray");
    public static final MoreBedVariantBlock BAMBOO_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "gray");
    public static final MoreBedVariantBlock CHERRY_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.TERRACOTTA_GRAY, SoundType.CHERRY_WOOD, "cherry", "gray");
    public static final MoreBedVariantBlock CRIMSON_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "gray");
    public static final MoreBedVariantBlock DARK_OAK_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.COLOR_BROWN, "dark_oak", "gray");
    public static final MoreBedVariantBlock JUNGLE_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.DIRT, "jungle", "gray");
    public static final MoreBedVariantBlock MANGROVE_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.COLOR_RED, "mangrove", "gray");
    public static final MoreBedVariantBlock SPRUCE_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.PODZOL, "spruce", "gray");
    public static final MoreBedVariantBlock WARPED_GRAY_BED = new MoreBedVariantBlock(DyeColor.GRAY, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "gray");
    // LIGHT_GRAY
    public static final MoreBedVariantBlock ACACIA_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.COLOR_ORANGE, "acacia", "light_gray");
    public static final MoreBedVariantBlock BIRCH_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.SAND, "birch", "light_gray");
    public static final MoreBedVariantBlock BAMBOO_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "light_gray");
    public static final MoreBedVariantBlock CHERRY_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.TERRACOTTA_LIGHT_GRAY, SoundType.CHERRY_WOOD, "cherry", "light_gray");
    public static final MoreBedVariantBlock CRIMSON_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "light_gray");
    public static final MoreBedVariantBlock DARK_OAK_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.COLOR_BROWN, "dark_oak", "light_gray");
    public static final MoreBedVariantBlock JUNGLE_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.DIRT, "jungle", "light_gray");
    public static final MoreBedVariantBlock MANGROVE_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.COLOR_RED, "mangrove", "light_gray");
    public static final MoreBedVariantBlock SPRUCE_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.PODZOL, "spruce", "light_gray");
    public static final MoreBedVariantBlock WARPED_LIGHT_GRAY_BED = new MoreBedVariantBlock(DyeColor.LIGHT_GRAY, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "light_gray");
    // CYAN
    public static final MoreBedVariantBlock ACACIA_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.COLOR_ORANGE, "acacia", "cyan");
    public static final MoreBedVariantBlock BIRCH_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.SAND, "birch", "cyan");
    public static final MoreBedVariantBlock BAMBOO_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "cyan");
    public static final MoreBedVariantBlock CHERRY_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.TERRACOTTA_CYAN, SoundType.CHERRY_WOOD, "cherry", "cyan");
    public static final MoreBedVariantBlock CRIMSON_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "cyan");
    public static final MoreBedVariantBlock DARK_OAK_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.COLOR_BROWN, "dark_oak", "cyan");
    public static final MoreBedVariantBlock JUNGLE_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.DIRT, "jungle", "cyan");
    public static final MoreBedVariantBlock MANGROVE_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.COLOR_RED, "mangrove", "cyan");
    public static final MoreBedVariantBlock SPRUCE_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.PODZOL, "spruce", "cyan");
    public static final MoreBedVariantBlock WARPED_CYAN_BED = new MoreBedVariantBlock(DyeColor.CYAN, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "cyan");
    // PURPLE
    public static final MoreBedVariantBlock ACACIA_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.COLOR_ORANGE, "acacia", "purple");
    public static final MoreBedVariantBlock BIRCH_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.SAND, "birch", "purple");
    public static final MoreBedVariantBlock BAMBOO_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "purple");
    public static final MoreBedVariantBlock CHERRY_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.TERRACOTTA_PURPLE, SoundType.CHERRY_WOOD, "cherry", "purple");
    public static final MoreBedVariantBlock CRIMSON_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "purple");
    public static final MoreBedVariantBlock DARK_OAK_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.COLOR_BROWN, "dark_oak", "purple");
    public static final MoreBedVariantBlock JUNGLE_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.DIRT, "jungle", "purple");
    public static final MoreBedVariantBlock MANGROVE_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.COLOR_RED, "mangrove", "purple");
    public static final MoreBedVariantBlock SPRUCE_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.PODZOL, "spruce", "purple");
    public static final MoreBedVariantBlock WARPED_PURPLE_BED = new MoreBedVariantBlock(DyeColor.PURPLE, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "purple");
    // BLUE
    public static final MoreBedVariantBlock ACACIA_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.COLOR_ORANGE, "acacia", "blue");
    public static final MoreBedVariantBlock BIRCH_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.SAND, "birch", "blue");
    public static final MoreBedVariantBlock BAMBOO_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "blue");
    public static final MoreBedVariantBlock CHERRY_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.TERRACOTTA_BLUE, SoundType.CHERRY_WOOD, "cherry", "blue");
    public static final MoreBedVariantBlock CRIMSON_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "blue");
    public static final MoreBedVariantBlock DARK_OAK_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.COLOR_BROWN, "dark_oak", "blue");
    public static final MoreBedVariantBlock JUNGLE_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.DIRT, "jungle", "blue");
    public static final MoreBedVariantBlock MANGROVE_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.COLOR_RED, "mangrove", "blue");
    public static final MoreBedVariantBlock SPRUCE_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.PODZOL, "spruce", "blue");
    public static final MoreBedVariantBlock WARPED_BLUE_BED = new MoreBedVariantBlock(DyeColor.BLUE, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "blue");
    // BROWN
    public static final MoreBedVariantBlock ACACIA_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.COLOR_ORANGE, "acacia", "brown");
    public static final MoreBedVariantBlock BIRCH_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.SAND, "birch", "brown");
    public static final MoreBedVariantBlock BAMBOO_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "brown");
    public static final MoreBedVariantBlock CHERRY_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.TERRACOTTA_BROWN, SoundType.CHERRY_WOOD, "cherry", "brown");
    public static final MoreBedVariantBlock CRIMSON_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "brown");
    public static final MoreBedVariantBlock DARK_OAK_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.COLOR_BROWN, "dark_oak", "brown");
    public static final MoreBedVariantBlock JUNGLE_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.DIRT, "jungle", "brown");
    public static final MoreBedVariantBlock MANGROVE_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.COLOR_RED, "mangrove", "brown");
    public static final MoreBedVariantBlock SPRUCE_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.PODZOL, "spruce", "brown");
    public static final MoreBedVariantBlock WARPED_BROWN_BED = new MoreBedVariantBlock(DyeColor.BROWN, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "brown");
    // GREEN
    public static final MoreBedVariantBlock ACACIA_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.COLOR_ORANGE, "acacia", "green");
    public static final MoreBedVariantBlock BIRCH_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.SAND, "birch", "green");
    public static final MoreBedVariantBlock BAMBOO_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "green");
    public static final MoreBedVariantBlock CHERRY_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.TERRACOTTA_GREEN, SoundType.CHERRY_WOOD, "cherry", "green");
    public static final MoreBedVariantBlock CRIMSON_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "green");
    public static final MoreBedVariantBlock DARK_OAK_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.COLOR_BROWN, "dark_oak", "green");
    public static final MoreBedVariantBlock JUNGLE_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.DIRT, "jungle", "green");
    public static final MoreBedVariantBlock MANGROVE_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.COLOR_RED, "mangrove", "green");
    public static final MoreBedVariantBlock SPRUCE_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.PODZOL, "spruce", "green");
    public static final MoreBedVariantBlock WARPED_GREEN_BED = new MoreBedVariantBlock(DyeColor.GREEN, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "green");
    // RED
    public static final MoreBedVariantBlock ACACIA_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.COLOR_ORANGE, "acacia", "red");
    public static final MoreBedVariantBlock BIRCH_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.SAND, "birch", "red");
    public static final MoreBedVariantBlock BAMBOO_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "red");
    public static final MoreBedVariantBlock CHERRY_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.TERRACOTTA_RED, SoundType.CHERRY_WOOD, "cherry", "red");
    public static final MoreBedVariantBlock CRIMSON_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "red");
    public static final MoreBedVariantBlock DARK_OAK_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.COLOR_BROWN, "dark_oak", "red");
    public static final MoreBedVariantBlock JUNGLE_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.DIRT, "jungle", "red");
    public static final MoreBedVariantBlock MANGROVE_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.COLOR_RED, "mangrove", "red");
    public static final MoreBedVariantBlock SPRUCE_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.PODZOL, "spruce", "red");
    public static final MoreBedVariantBlock WARPED_RED_BED = new MoreBedVariantBlock(DyeColor.RED, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "red");
    // BLACK
    public static final MoreBedVariantBlock ACACIA_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.COLOR_ORANGE, "acacia", "black");
    public static final MoreBedVariantBlock BIRCH_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.SAND, "birch", "black");
    public static final MoreBedVariantBlock BAMBOO_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "black");
    public static final MoreBedVariantBlock CHERRY_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.TERRACOTTA_BLACK, SoundType.CHERRY_WOOD, "cherry", "black");
    public static final MoreBedVariantBlock CRIMSON_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "black");
    public static final MoreBedVariantBlock DARK_OAK_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.COLOR_BROWN, "dark_oak", "black");
    public static final MoreBedVariantBlock JUNGLE_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.DIRT, "jungle", "black");
    public static final MoreBedVariantBlock MANGROVE_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.COLOR_RED, "mangrove", "black");
    public static final MoreBedVariantBlock SPRUCE_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.PODZOL, "spruce", "black");
    public static final MoreBedVariantBlock WARPED_BLACK_BED = new MoreBedVariantBlock(DyeColor.BLACK, MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "black");


    public static BlockEntityType<MoreBedVariantBlockEntity> MORE_BED_VARIANT_BLOCK_ENTITY;

    public static final List<Block> more_beds = new ArrayList<>();

    public static void registerBedBlocks() {
        // WHITE
        registerBedBlock(ACACIA_WHITE_BED);
        registerBedBlock(BAMBOO_WHITE_BED);
        registerBedBlock(BIRCH_WHITE_BED);
        registerBedBlock(CHERRY_WHITE_BED);
        registerBedBlock(CRIMSON_WHITE_BED);
        registerBedBlock(DARK_OAK_WHITE_BED);
        registerBedBlock(JUNGLE_WHITE_BED);
        registerBedBlock(MANGROVE_WHITE_BED);
        registerBedBlock(SPRUCE_WHITE_BED);
        registerBedBlock(WARPED_WHITE_BED);
        // ORANGE
        registerBedBlock(ACACIA_ORANGE_BED);registerBedBlock(BAMBOO_ORANGE_BED);registerBedBlock(BIRCH_ORANGE_BED);registerBedBlock(CHERRY_ORANGE_BED);registerBedBlock(CRIMSON_ORANGE_BED);registerBedBlock(DARK_OAK_ORANGE_BED);registerBedBlock(JUNGLE_ORANGE_BED);registerBedBlock(MANGROVE_ORANGE_BED);registerBedBlock(SPRUCE_ORANGE_BED);registerBedBlock(WARPED_ORANGE_BED);
        // MAGENTA
        registerBedBlock(ACACIA_MAGENTA_BED);registerBedBlock(BAMBOO_MAGENTA_BED);registerBedBlock(BIRCH_MAGENTA_BED);registerBedBlock(CHERRY_MAGENTA_BED);registerBedBlock(CRIMSON_MAGENTA_BED);registerBedBlock(DARK_OAK_MAGENTA_BED);registerBedBlock(JUNGLE_MAGENTA_BED);registerBedBlock(MANGROVE_MAGENTA_BED);registerBedBlock(SPRUCE_MAGENTA_BED);registerBedBlock(WARPED_MAGENTA_BED);
        // LIGHT_BLUE
        registerBedBlock(ACACIA_LIGHT_BLUE_BED);registerBedBlock(BAMBOO_LIGHT_BLUE_BED);registerBedBlock(BIRCH_LIGHT_BLUE_BED);registerBedBlock(CHERRY_LIGHT_BLUE_BED);registerBedBlock(CRIMSON_LIGHT_BLUE_BED);registerBedBlock(DARK_OAK_LIGHT_BLUE_BED);registerBedBlock(JUNGLE_LIGHT_BLUE_BED);registerBedBlock(MANGROVE_LIGHT_BLUE_BED);registerBedBlock(SPRUCE_LIGHT_BLUE_BED);registerBedBlock(WARPED_LIGHT_BLUE_BED);
        // YELLOW
        registerBedBlock(ACACIA_YELLOW_BED);registerBedBlock(BAMBOO_YELLOW_BED);registerBedBlock(BIRCH_YELLOW_BED);registerBedBlock(CHERRY_YELLOW_BED);registerBedBlock(CRIMSON_YELLOW_BED);registerBedBlock(DARK_OAK_YELLOW_BED);registerBedBlock(JUNGLE_YELLOW_BED);registerBedBlock(MANGROVE_YELLOW_BED);registerBedBlock(SPRUCE_YELLOW_BED);registerBedBlock(WARPED_YELLOW_BED);
        // LIME
        registerBedBlock(ACACIA_LIME_BED);registerBedBlock(BAMBOO_LIME_BED);registerBedBlock(BIRCH_LIME_BED);registerBedBlock(CHERRY_LIME_BED);registerBedBlock(CRIMSON_LIME_BED);registerBedBlock(DARK_OAK_LIME_BED);registerBedBlock(JUNGLE_LIME_BED);registerBedBlock(MANGROVE_LIME_BED);registerBedBlock(SPRUCE_LIME_BED);registerBedBlock(WARPED_LIME_BED);
        // PINK
        registerBedBlock(ACACIA_PINK_BED);registerBedBlock(BAMBOO_PINK_BED);registerBedBlock(BIRCH_PINK_BED);registerBedBlock(CHERRY_PINK_BED);registerBedBlock(CRIMSON_PINK_BED);registerBedBlock(DARK_OAK_PINK_BED);registerBedBlock(JUNGLE_PINK_BED);registerBedBlock(MANGROVE_PINK_BED);registerBedBlock(SPRUCE_PINK_BED);registerBedBlock(WARPED_PINK_BED);
        // GRAY
        registerBedBlock(ACACIA_GRAY_BED);registerBedBlock(BAMBOO_GRAY_BED);registerBedBlock(BIRCH_GRAY_BED);registerBedBlock(CHERRY_GRAY_BED);registerBedBlock(CRIMSON_GRAY_BED);registerBedBlock(DARK_OAK_GRAY_BED);registerBedBlock(JUNGLE_GRAY_BED);registerBedBlock(MANGROVE_GRAY_BED);registerBedBlock(SPRUCE_GRAY_BED);registerBedBlock(WARPED_GRAY_BED);
        // LIGHT_GRAY
        registerBedBlock(ACACIA_LIGHT_GRAY_BED);registerBedBlock(BAMBOO_LIGHT_GRAY_BED);registerBedBlock(BIRCH_LIGHT_GRAY_BED);registerBedBlock(CHERRY_LIGHT_GRAY_BED);registerBedBlock(CRIMSON_LIGHT_GRAY_BED);registerBedBlock(DARK_OAK_LIGHT_GRAY_BED);registerBedBlock(JUNGLE_LIGHT_GRAY_BED);registerBedBlock(MANGROVE_LIGHT_GRAY_BED);registerBedBlock(SPRUCE_LIGHT_GRAY_BED);registerBedBlock(WARPED_LIGHT_GRAY_BED);
        // CYAN
        registerBedBlock(ACACIA_CYAN_BED);registerBedBlock(BAMBOO_CYAN_BED);registerBedBlock(BIRCH_CYAN_BED);registerBedBlock(CHERRY_CYAN_BED);registerBedBlock(CRIMSON_CYAN_BED);registerBedBlock(DARK_OAK_CYAN_BED);registerBedBlock(JUNGLE_CYAN_BED);registerBedBlock(MANGROVE_CYAN_BED);registerBedBlock(SPRUCE_CYAN_BED);registerBedBlock(WARPED_CYAN_BED);
        // PURPLE
        registerBedBlock(ACACIA_PURPLE_BED);registerBedBlock(BAMBOO_PURPLE_BED);registerBedBlock(BIRCH_PURPLE_BED);registerBedBlock(CHERRY_PURPLE_BED);registerBedBlock(CRIMSON_PURPLE_BED);registerBedBlock(DARK_OAK_PURPLE_BED);registerBedBlock(JUNGLE_PURPLE_BED);registerBedBlock(MANGROVE_PURPLE_BED);registerBedBlock(SPRUCE_PURPLE_BED);registerBedBlock(WARPED_PURPLE_BED);
        // BLUE
        registerBedBlock(ACACIA_BLUE_BED);registerBedBlock(BAMBOO_BLUE_BED);registerBedBlock(BIRCH_BLUE_BED);registerBedBlock(CHERRY_BLUE_BED);registerBedBlock(CRIMSON_BLUE_BED);registerBedBlock(DARK_OAK_BLUE_BED);registerBedBlock(JUNGLE_BLUE_BED);registerBedBlock(MANGROVE_BLUE_BED);registerBedBlock(SPRUCE_BLUE_BED);registerBedBlock(WARPED_BLUE_BED);
        // BROWN
        registerBedBlock(ACACIA_BROWN_BED);registerBedBlock(BAMBOO_BROWN_BED);registerBedBlock(BIRCH_BROWN_BED);registerBedBlock(CHERRY_BROWN_BED);registerBedBlock(CRIMSON_BROWN_BED);registerBedBlock(DARK_OAK_BROWN_BED);registerBedBlock(JUNGLE_BROWN_BED);registerBedBlock(MANGROVE_BROWN_BED);registerBedBlock(SPRUCE_BROWN_BED);registerBedBlock(WARPED_BROWN_BED);
        // GREEN
        registerBedBlock(ACACIA_GREEN_BED);registerBedBlock(BAMBOO_GREEN_BED);registerBedBlock(BIRCH_GREEN_BED);registerBedBlock(CHERRY_GREEN_BED);registerBedBlock(CRIMSON_GREEN_BED);registerBedBlock(DARK_OAK_GREEN_BED);registerBedBlock(JUNGLE_GREEN_BED);registerBedBlock(MANGROVE_GREEN_BED);registerBedBlock(SPRUCE_GREEN_BED);registerBedBlock(WARPED_GREEN_BED);
        // RED
        registerBedBlock(ACACIA_RED_BED);registerBedBlock(BAMBOO_RED_BED);registerBedBlock(BIRCH_RED_BED);registerBedBlock(CHERRY_RED_BED);registerBedBlock(CRIMSON_RED_BED);registerBedBlock(DARK_OAK_RED_BED);registerBedBlock(JUNGLE_RED_BED);registerBedBlock(MANGROVE_RED_BED);registerBedBlock(SPRUCE_RED_BED);registerBedBlock(WARPED_RED_BED);
        // BLACK
        registerBedBlock(ACACIA_BLACK_BED);registerBedBlock(BAMBOO_BLACK_BED);registerBedBlock(BIRCH_BLACK_BED);registerBedBlock(CHERRY_BLACK_BED);registerBedBlock(CRIMSON_BLACK_BED);registerBedBlock(DARK_OAK_BLACK_BED);registerBedBlock(JUNGLE_BLACK_BED);registerBedBlock(MANGROVE_BLACK_BED);registerBedBlock(SPRUCE_BLACK_BED);registerBedBlock(WARPED_BLACK_BED);


        MORE_BED_VARIANT_BLOCK_ENTITY = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, MoreBedVariants.asId("more_bed_variants"), BlockEntityType.Builder.of(MoreBedVariantBlockEntity::new, MbdvBlockInit.more_beds.toArray(Block[]::new)).build(null));

    }

    private static void registerBedBlock(MoreBedVariantBlock bed) {
        Registry.register(BuiltInRegistries.BLOCK, MoreBedVariants.asId(bed.bedWoodType + "_" + bed.bedColor + "_bed"), bed);
        more_beds.add(bed);
        MbdvPointOfInterestTypes.registerBedHeadAsPoiBlock(bed);
    }
}
