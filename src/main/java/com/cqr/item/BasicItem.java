package com.cqr.item;

import com.cqr.main.ChocolateQuestRepoured;
import com.cqr.model.ModelHandler;
import com.cqr.proxy.CommonProxy;
import net.minecraft.item.Item;

/**
 * Created by Marcel on Nov,2018
 */
public class BasicItem extends Item {
    public BasicItem(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        ModelHandler.registeredItems.add(this);
    }

    public void registerModel() {
        ModelHandler.registerDefaultItemModel(this);
    }
}
