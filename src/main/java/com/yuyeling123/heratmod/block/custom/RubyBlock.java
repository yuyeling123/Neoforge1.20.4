package com.yuyeling123.heratmod.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class RubyBlock extends Block {
    public   RubyBlock() {
        super(Properties.ofFullCopy(Blocks.STONE).strength(5f));
    }
}
