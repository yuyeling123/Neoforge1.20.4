package com.yuyeling123.heratmod.item;

import com.yuyeling123.heratmod.HeratMod;
import com.yuyeling123.heratmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HeratMod.MODID);
    public static final String HERAT_MOD_TAB_STRING = "creative.heratmod_tab";
    public static final Supplier<CreativeModeTab> HERATMOD_TAB = CREATIVE_MODE_TABS.register("heratmod_tab",()-> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable(HERAT_MOD_TAB_STRING))
            .icon(()->ModItems.RU.get().getDefaultInstance())
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.RU.get());
                pOutput.accept(ModItems.RUBY.get());
                pOutput.accept(ModItems.MAGIC_INGOT.get());
                pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                pOutput.accept(ModBlocks.LAMP_BLOCK.get());
                    })
            .build());

    public static void Register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
