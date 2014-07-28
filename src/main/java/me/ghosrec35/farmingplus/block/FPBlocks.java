package me.ghosrec35.farmingplus.block;

import cpw.mods.fml.common.registry.GameRegistry;
import me.ghosrec35.farmingplus.ref.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FPBlocks
{
    public static void initialize()
    {
        Block test = new Block(Material.rock)
        {
            @Override
            public int getRenderType()
            {
                return Reference.RYE_MODEL_ID;
            }
        }.setBlockName("test").setCreativeTab(CreativeTabs.tabBlock);
        
        GameRegistry.registerBlock(test, "testBlock");
    }
}
