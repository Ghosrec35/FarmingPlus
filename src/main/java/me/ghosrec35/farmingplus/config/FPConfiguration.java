package me.ghosrec35.farmingplus.config;

import me.ghosrec35.farmingplus.ref.Reference;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class FPConfiguration
{
    public static Configuration CONFIG;
    
    public static void initialize(FMLPreInitializationEvent event)
    {
        CONFIG = new Configuration(event.getModConfigurationDirectory(), "FarmingPlus-Config.cfgs");
        CONFIG.load();
        
        CONFIG.save();
    }
    
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equals(Reference.MOD_ID))
        {
            
        }
    }
}
