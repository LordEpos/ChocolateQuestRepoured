package com.cqr.registry;

import com.cqr.block.BasicBlock;
import com.cqr.item.BasicItem;
import com.cqr.model.ModelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
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

    @SubscribeEvent
    public void registerModel(ModelRegistryEvent event) {
        for(BasicItem item: ModelHandler.registeredItems) {
            item.registerModel();
        }
        for(BasicBlock block:ModelHandler.registeredBlocks) {
            block.registerModel();
        }
    }
}
