package com.yuyeling123.heratmod.event.clent;

import com.yuyeling123.heratmod.HeratMod;
import com.yuyeling123.heratmod.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = HeratMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class PropertyRegistry {
    @SubscribeEvent
    public static void PropertyOverrideRegistry(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemProperties.register(ModItems.MAGIC_INGOT.get(), new ResourceLocation(HeratMod.MODID,"size"), (ItemStack, Level, LivingEntity, num)-> {
                return ItemStack.getCount();
            });
        });
    }
}