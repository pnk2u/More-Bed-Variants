package de.pnku.mbdv.util.client;

import net.minecraft.client.Minecraft;

import java.util.Collection;

import static de.pnku.mbdv.MoreBedVariants.LOGGER;
import static de.pnku.mbdv.util.BedShapeState.*;

public class ClientUtils {
    public static void checkActiveResourcePacks() {
        Collection<String> activePackList = Minecraft.getInstance().getResourcePackRepository().getSelectedIds();
        isPillowedPackActive = activePackList.contains("quad-lolmbdv:more-pillowed-bed-variants");
        isPillowedConnectedPackActive = activePackList.contains("quad-lolmbdv:more-pillowed-connected-bed-variants");
        needsToBeChecked = false;
        if (isPillowedPackActive && isPillowedConnectedPackActive) {
            LOGGER.info("Found both regular and connected 'Pillowed' resource packs active. Attempting to disable redundant non-connected pack.");
            boolean success = Minecraft.getInstance().getResourcePackRepository().removePack("quad-lolmbdv:more-pillowed-bed-variants");
            if (success)
            {
                LOGGER.info("Removed \"More 'Pillowed' Bed Variants\" from active resource packs.");
                activePackList.remove("more-pillowed-bed-variants");
            } else {LOGGER.warn("Failed to remove \"More 'Pillowed' Bed Variants\" from active resource packs.");}
        }
    }
}
