package de.pnku.mbdv.datagen;

import de.pnku.mbdv.MoreBedVariants;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

import static de.pnku.mbdv.init.MbdvItemInit.more_bed_items;

public class MoreBedVariantTagGenerator extends FabricTagProvider.ItemTagProvider {

    public MoreBedVariantTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }
    public static final TagKey<Item> ACACIA_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("acacia_beds"));
    public static final TagKey<Item> BAMBOO_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("bamboo_beds"));
    public static final TagKey<Item> BIRCH_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("birch_beds"));
    public static final TagKey<Item> CHERRY_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("cherry_beds"));
    public static final TagKey<Item> CRIMSON_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("crimson_beds"));
    public static final TagKey<Item> DARK_OAK_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("dark_oak_beds"));
    public static final TagKey<Item> JUNGLE_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("jungle_beds"));
    public static final TagKey<Item> MANGROVE_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("mangrove_beds"));
    public static final TagKey<Item> SPRUCE_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("spruce_beds"));
    public static final TagKey<Item> WARPED_BEDS = TagKey.create(Registries.ITEM, MoreBedVariants.asId("warped_beds"));


    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        for (Item bedVariantItem : more_bed_items) {
            if (bedVariantItem.toString().contains("acacia")) {
                getOrCreateTagBuilder(ACACIA_BEDS).add(bedVariantItem);
            }
            if (bedVariantItem.toString().contains("bamboo")) {
                getOrCreateTagBuilder(BAMBOO_BEDS).add(bedVariantItem);
            }
            if (bedVariantItem.toString().contains("birch")) {
                getOrCreateTagBuilder(BIRCH_BEDS).add(bedVariantItem);
            }
            if (bedVariantItem.toString().contains("cherry")) {
                getOrCreateTagBuilder(CHERRY_BEDS).add(bedVariantItem);
            }
            if (bedVariantItem.toString().contains("crimson")) {
                getOrCreateTagBuilder(CRIMSON_BEDS).add(bedVariantItem);
            }
            if (bedVariantItem.toString().contains("dark_oak")) {
                getOrCreateTagBuilder(DARK_OAK_BEDS).add(bedVariantItem);
            }
            if (bedVariantItem.toString().contains("jungle")) {
                getOrCreateTagBuilder(JUNGLE_BEDS).add(bedVariantItem);
            }
            if (bedVariantItem.toString().contains("mangrove")) {
                getOrCreateTagBuilder(MANGROVE_BEDS).add(bedVariantItem);
            }
            if (bedVariantItem.toString().contains("spruce")) {
                getOrCreateTagBuilder(SPRUCE_BEDS).add(bedVariantItem);
            }
            if (bedVariantItem.toString().contains("warped")) {
                getOrCreateTagBuilder(WARPED_BEDS).add(bedVariantItem);
            }
        }
    }
    public static TagKey<Item> getBedKey(String bedWoodType) {
        return switch (bedWoodType) {
            case "acacia" -> ACACIA_BEDS;
            case "bamboo" -> BAMBOO_BEDS;
            case "birch" -> BIRCH_BEDS;
            case "cherry" -> CHERRY_BEDS;
            case "crimson" -> CRIMSON_BEDS;
            case "dark_oak" -> DARK_OAK_BEDS;
            case "jungle" -> JUNGLE_BEDS;
            case "mangrove" -> MANGROVE_BEDS;
            case "spruce" -> SPRUCE_BEDS;
            case "warped" -> WARPED_BEDS;
            default -> null;
        };
    }

}
