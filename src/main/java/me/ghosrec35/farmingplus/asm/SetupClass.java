package me.ghosrec35.farmingplus.asm;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLCallHook;

public class SetupClass implements IFMLCallHook
{
    // This is the method that FML calls in the main thread before Minecraft
    // begins loading.
    @Override
    public Void call() throws Exception
    {
        // This method is called directly after FML injects the data in the method below.
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data)
    {
        /*
         * injectData in IFMLCallHook: 
         * "mcLocation" = Minecraft Directory
         * "classLoader" = The ClassLoader used to inject files into the classpath.
         * "coremodLocation" = The location of your coremod.
         * "deobfuscationFileName" = The filename of the deobfuscation file.
         */
    }
}
