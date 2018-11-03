package com.cqr.registry;

import com.cqr.item.BasicItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marcel on Nov,2018
 */
public class ModObjects {

    public static void init() {

    }

    //Register Items here: event.getRegistry().register()
    @SubscribeEvent
    public void registerItem(RegistryEvent.Register<Item> event) {

    }

    //Register Blocks here: event.getRegistry().register()
    @SubscribeEvent
    public void registerBlock(RegistryEvent.Register<Block> event) {

    }
}
