package me.ghosrec35.farmingplus.asm;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

public class ExampleCoreMod implements IFMLLoadingPlugin
{
    // Ignore this. You won't need to dynamically modify the Minecraft class
    // bytes in memory.
    @Override
    public String[] getASMTransformerClass()
    {
        return null;
    }

    // You might want to use this, but this is for if you want your
    // CoreMod to show up in the mods list in-game. (The CoreMod will be
    // separate from the rest of your mod in the list.)
    @Override
    public String getModContainerClass()
    {
        return null;
    }

    // This is likely what you will want to use. The String this returns should
    // be the qualified class name for a class you create that implements
    // IFMLCallHook
    @Override
    public String getSetupClass()
    {
        return "class.package.SetupClass";
    }

    @Override
    public void injectData(Map<String, Object> data)
    {
        /*
         * injectData in IFMLLoadingPlugin:
         * "mcLocation" = Minecraft Directory
         * "coreModList" = The List of loaded coremods.
         * "runtimeDeobfuscationEnabled" = Whether or not FML is deobuscating MC at runtime.
         * "coremodLocation" = The location of your coremod.
         */
        data.get("mcLocation");
        // etc.
    }

    // Ignore this. You shouldn't need to change the access modifiers of
    // anything in the MC Source.
    @Override
    public String getAccessTransformerClass()
    {
        return null;
    }
}
