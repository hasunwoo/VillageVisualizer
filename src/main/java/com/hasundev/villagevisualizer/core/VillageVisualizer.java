package com.hasundev.villagevisualizer.core;


import com.hasundev.villagevisualizer.core.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, version = Constants.VERSION)
public class VillageVisualizer {

    @Mod.Instance(Constants.MODID)
    public static VillageVisualizer instance;

    @SidedProxy(clientSide = Constants.CLIENTPROXY, serverSide = Constants.SERVERPROXY, modId = Constants.MODID)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }
}
