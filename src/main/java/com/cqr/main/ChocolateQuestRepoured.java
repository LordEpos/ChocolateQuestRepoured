package com.cqr.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ChocolateQuestRepoured.MODID, name = ChocolateQuestRepoured.NAME, version = ChocolateQuestRepoured.VERSION)
public class ChocolateQuestRepoured
{
    public static final String MODID = "chocolatequestrepoured";
    public static final String NAME = "ChocolateQuestRepoured";
    public static final String VERSION = "0.1a";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
