package me.ghosrec35.farmingplus;

import me.ghosrec35.farmingplus.block.FPBlocks;
import me.ghosrec35.farmingplus.config.FPConfiguration;
import me.ghosrec35.farmingplus.proxy.IProxy;
import me.ghosrec35.farmingplus.ref.Reference;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class FarmingPlus
{
    @SidedProxy(clientSide = "me.ghosrec35.farmingplus.client.proxy.ClientProxy", serverSide = "me.ghosrec35.farmingplus.proxy.CommonProxy")
    public static IProxy proxy;
    
    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        configure(event);
        FPBlocks.initialize();
    }
    
    public void configure(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new FPConfiguration());
        FPConfiguration.initialize(event);
        proxy.registerSidedEvents();
    }
    
    @EventHandler
    public void onInit(FMLInitializationEvent event)
    {
        
    }
}
