package com.yuyeling123.heratmod.data;

import com.yuyeling123.heratmod.HeratMod;
import com.yuyeling123.heratmod.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output , String modid , ExistingFileHelper existingFileHelper) {
        super(output, modid , existingFileHelper);
    }
    @Override
    protected  void registerModels() {
        this.basicItem(ModItems.RU.get());
    }
    public ResourceLocation getResource(Item item) {
        return Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item));
    }
    public void magicIngotModel(ResourceLocation item) {
        this.getBuilder(item.toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", "item/iron_ingot")
                .override().predicate(new ResourceLocation(HeratMod.MODID,"size"),16)
                .model(new ModelFile.UncheckedModelFile("item/gold_ingot"))
                .end();
    }
}
