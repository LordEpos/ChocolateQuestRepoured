package com.cqr.block;

import com.cqr.main.ChocolateQuestRepoured;
import com.cqr.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * Created by Marcel on Nov,2018
 */
public class BasicBlock extends Block {
    public BasicBlock(Material materialIn,String name) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        CommonProxy.registeredBlocks.add(this);
    }

    public void registerModel() {
        ChocolateQuestRepoured.proxy.registerDefaultItemModel(Item.getItemFromBlock(this));
    }
}
