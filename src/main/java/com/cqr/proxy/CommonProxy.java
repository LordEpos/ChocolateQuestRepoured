package com.cqr.proxy;

import com.cqr.block.BasicBlock;
import com.cqr.item.BasicItem;
import com.cqr.main.ChocolateQuestRepoured;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.ArrayList;

/**
 * Created by Marcel on Nov,2018
 */
public class CommonProxy {

    public static final ArrayList<BasicItem> registeredItems = new ArrayList<>();
    public static final ArrayList<BasicBlock> registeredBlocks = new ArrayList<>();

    public void registerDefaultItemModel(Item item) {
    }

    public void registerComplexItemModel(Item item,int meta,String variant) {
    }

    public void init() {
    }
}
