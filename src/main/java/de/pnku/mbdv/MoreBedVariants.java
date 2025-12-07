package de.pnku.mbdv;
import com.mojang.brigadier.CommandDispatcher;
import de.pnku.mbdv.init.MbdvBlockInit;
import de.pnku.mbdv.init.MbdvItemInit;
import de.pnku.mbdv.util.BedShapeState;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.permissions.Permissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBedVariants implements ModInitializer {
    public static final String MOD_ID = "quad-lolmbdv";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        MbdvBlockInit.registerBedBlocks();
        MbdvItemInit.registerBedItems();
        ServerLifecycleEvents.START_DATA_PACK_RELOAD.register((server, resourceManager) -> {
            BedShapeState.needsToBeChecked = true;
            BedShapeState.silent = false;
        });
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            registerCommands(dispatcher);
        });
        ServerLifecycleEvents.SERVER_STARTING.register(server -> {
            if (server.isDedicatedServer()) {
                BedShapeState.ServerConfig.checkServerConfig();
            }
        });
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            BedShapeState.needsToBeChecked = true;
            BedShapeState.silent = false;
        });

    }

    public static Identifier withModId(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    private static void registerCommands(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher  .register(Commands.literal("setbedshape")
                    .requires(source -> source.permissions().hasPermission(Permissions.COMMANDS_GAMEMASTER) && source.getServer().isDedicatedServer())
                        .executes(context -> {
                            context.getSource().sendFailure(Component.translatable("commands.setbedshape.warn"));
                            return -1;
                        })
                        .then(Commands.literal("vanilla")
                            .executes(context -> {
                                BedShapeState.isPillowedPackActive = false;
                                BedShapeState.isPillowedConnectedPackActive = false;
                                BedShapeState.ServerConfig.writeServerConfig();
                                BedShapeState.needsToBeChecked = false;
                                context.getSource().sendSuccess(() -> Component.translatable("commands.setbedshape.vanilla"), true);
                                return 0;
                            })
                        )
                        .then(Commands.literal("pillowed")
                                .executes(context -> {
                                    context.getSource().sendFailure(Component.translatable("commands.setbedshape.pillowed.warn"));
                                    return -1;
                                })
                            .then(Commands.literal("connected")
                                    .executes(context -> {
                                        BedShapeState.isPillowedConnectedPackActive = true;
                                        BedShapeState.isPillowedPackActive = false;
                                        BedShapeState.ServerConfig.writeServerConfig();
                                        BedShapeState.needsToBeChecked = false;
                                        context.getSource().sendSuccess(() -> Component.translatable("commands.setbedshape.pillowed.connected"), true);
                                        return 2;
                                    })
                            )
                            .then(Commands.literal("unconnected")
                                    .executes(context -> {
                                        BedShapeState.isPillowedConnectedPackActive = false;
                                        BedShapeState.isPillowedPackActive = true;
                                        BedShapeState.ServerConfig.writeServerConfig();
                                        BedShapeState.needsToBeChecked = false;
                                        context.getSource().sendSuccess(() -> Component.translatable("commands.setbedshape.pillowed.unconnected"), true);
                                        return 1;
                                    })
                            )
                        )
        );
    }
}