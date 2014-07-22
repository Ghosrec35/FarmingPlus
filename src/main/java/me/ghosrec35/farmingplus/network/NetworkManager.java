package me.ghosrec35.farmingplus.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class NetworkManager 
{
    public static final SimpleNetworkWrapper CHANNELS = NetworkRegistry.INSTANCE.newSimpleChannel("BC|Network_Manager");
    
    public static void initialize()
    {
        
    }
}
