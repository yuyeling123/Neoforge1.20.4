package com.yuyeling123.heratmod.block;

import com.yuyeling123.heratmod.HeratMod;
import com.yuyeling123.heratmod.block.custom.LampBlock;
import com.yuyeling123.heratmod.block.custom.RubyBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.yuyeling123.heratmod.item.ModItems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, HeratMod.MODID);

    public static @NotNull Supplier<Block> registerBlock(String name , Supplier<Block> Block) {
        Supplier<Block> toReturn = BLOCKS.register(name , Block);
        registerBlockItem(name , toReturn);
        return toReturn;
    }
    public static void registerBlockItem(String name , Supplier<Block> Block) {
        registerBlockItem(name , Block , new Item.Properties());
    }
    public static void registerBlockItem(String name , Supplier<Block> Block , Item.Properties properties) {
        ITEMS.register(name , ()->new BlockItem(Block.get() , properties));
    }

    public static Supplier<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",RubyBlock::new);
    public static Supplier<Block> LAMP_BLOCK = registerBlock("lamp_block" , ()-> new LampBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.STONE)
            .strength(5f)
            .requiresCorrectToolForDrops()
            .lightLevel(state->state.getValue(LampBlock.LIT)?15:0)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
