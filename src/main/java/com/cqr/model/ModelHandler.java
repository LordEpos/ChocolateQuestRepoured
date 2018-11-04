package com.cqr.model;

import com.cqr.block.BasicBlock;
import com.cqr.item.BasicItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.ArrayList;

/**
 * Created by Marcel on Nov,2018
 */
public class ModelHandler {
    public static final ArrayList<BasicItem> registeredItems = new ArrayList<>();
    public static final ArrayList<BasicBlock> registeredBlocks = new ArrayList<>();

    public static void registerDefaultItemModel(Item item) {
        registerComplexItemModel(item,0,"inventory");
    }

    public static void registerComplexItemModel(Item item, int meta, String variant) {
        ModelLoader.setCustomModelResourceLocation(item,meta,new ModelResourceLocation(item.getRegistryName(),variant));
    }
}
