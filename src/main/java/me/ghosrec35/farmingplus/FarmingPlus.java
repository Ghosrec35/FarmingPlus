package me.ghosrec35.farmingplus;

import me.ghosrec35.farmingplus.proxy.IProxy;
import me.ghosrec35.farmingplus.ref.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class FarmingPlus
{
    @SidedProxy(clientSide = "me.ghosrec35.farmingplus.client.proxy.ClientProxy", serverSide = "me.ghosrec35.farmingplus.proxy.CommonProxy")
    public static IProxy proxy;
    
    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        
    }
    
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        
    }
}
