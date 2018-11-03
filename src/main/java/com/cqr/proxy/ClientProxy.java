package com.cqr.proxy;

import com.cqr.block.BasicBlock;
import com.cqr.item.BasicItem;
import com.cqr.main.ChocolateQuestRepoured;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Marcel on Nov,2018
 */
public class ClientProxy extends CommonProxy{

    //Registers an default model for an Item
    @Override
    public void registerDefaultItemModel(Item item) {
        registerComplexItemModel(item,0,"inventory");
    }


    @Override
    public void registerComplexItemModel(Item item, int meta, String variant) {
        ModelLoader.setCustomModelResourceLocation(item,meta,new ModelResourceLocation(item.getRegistryName(),variant));
    }

    @Override
    public void init() {
        super.init();
        for(BasicItem item:registeredItems) {
            item.registerModel();
        }
        for(BasicBlock block:registeredBlocks) {
            block.registerModel();
        }
    }
}
