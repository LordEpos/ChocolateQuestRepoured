package com.cqr.main;

import me.marnic.modapi.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ChocolateQuestRepoured.MODID, name = ChocolateQuestRepoured.NAME, version = ChocolateQuestRepoured.VERSION)
public class ChocolateQuestRepoured
{
    public static final String MODID = "cqr";
    public static final String NAME = "ChocolateQuestRepoured";
    public static final String VERSION = "0.1a";
    private static final CQRModHandler MOD_HANDLER = new CQRModHandler();

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        MOD_HANDLER.init();
        proxy.preInit();
        MinecraftForge.EVENT_BUS.register(MOD_HANDLER);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }

    @SidedProxy(clientSide = "me.marnic.modapi.proxy.ClientProxy",serverSide = "me.marnic.modapi.proxy.CommonProxy")
    public static CommonProxy proxy;
}
