package de.pnku.mbdv.ui;

import de.pnku.mbdv.MoreBedVariants;
import de.pnku.mbdv.init.MbdvItemInit;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

public class MbdvCreativeTab extends CreativeModeTabs {

    public static CreativeModeTab COLORED_BEDS;

    public static final CreativeModeTab.Builder MBDV_CMT_BUILDER = FabricItemGroup.builder().title(Component.translatable("itemGroup.coloredBeds")).icon(() -> new ItemStack(MbdvItemInit.ACACIA_ORANGE_BED_I)).displayItems(((displayContext, entries) -> {
        for (BlockItem bedVariantItem :MbdvItemInit.more_bed_items)
        {
            entries.accept(bedVariantItem);
        }
    }));

    public static void registerMbdvCreativeTab() {
        COLORED_BEDS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MoreBedVariants.asId("colored_beds"), MBDV_CMT_BUILDER.build());
    }
}
