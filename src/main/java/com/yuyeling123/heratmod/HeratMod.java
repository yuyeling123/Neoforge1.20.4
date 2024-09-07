package com.yuyeling123.heratmod;

import com.mojang.logging.LogUtils;
import com.yuyeling123.heratmod.block.ModBlocks;
import com.yuyeling123.heratmod.item.ModCreativeTab;
import com.yuyeling123.heratmod.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(HeratMod.MODID)
public class HeratMod {
    public static final String MODID = "heratmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public HeratMod(IEventBus modEventBus) {

        modEventBus.addListener(this::commonSetup);
        ModItems.register(modEventBus);
        ModBlocks.register((modEventBus));
        ModCreativeTab.Register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}

