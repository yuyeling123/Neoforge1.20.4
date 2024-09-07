package com.yuyeling123.heratmod.item;


import com.yuyeling123.heratmod.HeratMod;
import com.yuyeling123.heratmod.block.ModBlocks;
import com.yuyeling123.heratmod.item.custom.MagicIngot;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM,HeratMod.MODID);
    public static final Supplier<Item> RUBY = ITEMS.register("ruby",()->new Item(new Item.Properties()));
    public static final Supplier<Item> RUBY_BLOCK = ITEMS.register("ruby_block", ()-> new BlockItem(ModBlocks.RUBY_BLOCK.get() , new Item.Properties()));
    public static final Supplier<Item> RU = ITEMS.register("rub",()->new Item(new Item.Properties().food(Foods.APPLE)));
    public static final Supplier<Item> MAGIC_INGOT = ITEMS.register("magic_ingot" , (ResourceLocation properties) -> new MagicIngot());
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
