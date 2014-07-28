package me.ghosrec35.farmingplus.client.proxy;

import me.ghosrec35.farmingplus.client.render.ModelForge;
import me.ghosrec35.farmingplus.client.render.SimpleBlockRendererImpl;
import me.ghosrec35.farmingplus.proxy.IProxy;
import me.ghosrec35.farmingplus.ref.Reference;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy implements IProxy
{
    @Override
    public void registerSidedEvents()
    {
        RenderingRegistry.registerBlockHandler(Reference.RYE_MODEL_ID, new SimpleBlockRendererImpl(new ModelForge()));
    }
}
