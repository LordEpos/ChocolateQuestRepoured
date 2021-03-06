package me.marnic.modapi.objs.item;


import me.marnic.modapi.handler.ModHandler;
import me.marnic.modapi.interfaces.ModelHelper;
import me.marnic.modapi.interfaces.IModelRegistry;
import net.minecraft.item.Item;

/**
 * Copyright (c) 03.12.2018
 * Developed by MrMarnic
 * GitHub: https://github.com/MrMarnic
 */
public class BasicItem extends Item implements IModelRegistry {
    public BasicItem(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        ModHandler.modelsToRegister.add(this);
    }

    //Override this if you want an specific model registration
    @Override
    public void registerModel() {
        ModelHelper.registerDefaultItemModel(this);
    }
}
