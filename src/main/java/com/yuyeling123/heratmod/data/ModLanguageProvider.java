package com.yuyeling123.heratmod.data;

import com.yuyeling123.heratmod.block.ModBlocks;
import com.yuyeling123.heratmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output , String modid , String locale) {
        super(output , modid , locale);
    }

    @Override
    protected void addTranslations() {
        this.add(ModItems.RU.get(),"ru");
        this.add(ModItems.RUBY.get(),"ruby");
        this.add(ModItems.MAGIC_INGOT.get(),"magic_ingot");
        this.add(ModBlocks.LAMP_BLOCK.get(), "lamp_block");
        this.add("object.heratmod.heratmod_object","heratmod");
    }
}
