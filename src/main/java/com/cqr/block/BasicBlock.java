package com.cqr.block;

import com.cqr.main.ChocolateQuestRepoured;
import com.cqr.model.ModelHandler;
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
        ModelHandler.registeredBlocks.add(this);
    }

    public void registerModel() {
        ModelHandler.registerDefaultItemModel(Item.getItemFromBlock(this));
    }
}
