package de.pnku.mbdv.ui;

import de.pnku.mbdv.init.MbdvBlockInit;
import de.pnku.mbdv.init.MbdvItemInit;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

public class MbdvCreativeTab extends CreativeModeTabs {

    public static final ResourceKey<CreativeModeTab> COLORED_BEDS = createKey("colored_beds");

    public static void registerMbdvCreativeTab(Registry<CreativeModeTab> registry) {
        Registry.register(registry, COLORED_BEDS, CreativeModeTab.builder(CreativeModeTab.Row.BOTTOM, 7).title(Component.translatable("itemGroup.coloredBeds")).icon(() -> {
            return new ItemStack(MbdvBlockInit.WARPED_ORANGE_BED);
        }).displayItems((itemDisplayParameters, output) -> {
            for (BlockItem bedVariantItem :MbdvItemInit.more_bed_items)
            {
                output.accept(bedVariantItem);
            }
        }).build());
    }
}
