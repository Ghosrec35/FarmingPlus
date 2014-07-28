package me.ghosrec35.farmingplus.client.render;

import org.lwjgl.opengl.GL11;

import me.ghosrec35.farmingplus.ref.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class SimpleBlockRendererImpl implements ISimpleBlockRenderingHandler
{
    private ModelBase blockModel;
    
    public SimpleBlockRendererImpl(ModelBase blockModel)
    {
        this.blockModel = blockModel;
    }
    
    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
    {
        Tessellator tess = Tessellator.instance;
        IIcon icon = block.getIcon(0, 0);
        
        tess.setBrightness(983055);
        
        //Side: 0
        tess.addVertex(0, 0, 0);
        tess.addVertex(0 + 1, 0, 0);
        tess.addVertex(0 + 1, 0, 0 + 1);
        tess.addVertex(0, 0, 0 + 1);
        
        //Side: 1
        tess.addVertexWithUV(0, 0 + 1, 0, icon.getMinU(), icon.getMinV());
        tess.addVertexWithUV(0, 0 + 1, 0 + 1, icon.getMinU(), icon.getMaxV());
        tess.addVertexWithUV(0 + 1, 0 + 1, 0 + 1, icon.getMaxU(), icon.getMaxV());
        tess.addVertexWithUV(0 + 1, 0 + 1, 0, icon.getMaxU(), icon.getMinV());

        tess.addVertex(0, 0, 0);
        tess.addVertex(0, 0 + 1, 0);
        tess.addVertex(0 + 1, 0 + 1, 0);
        tess.addVertex(0 + 1, 0, 0);
        
        tess.addVertex(0, 0, 0);
        tess.addVertex(0, 0, 0 + 1);
        tess.addVertex(0, 0 + 1, 0 + 1);
        tess.addVertex(0, 0 + 1, 0 );

        tess.addVertex(0 + 1, 0, 0);
        tess.addVertex(0 + 1, 0 + 1, 0);
        tess.addVertex(0 + 1, 0 + 1, 0 + 1);
        tess.addVertex(0 + 1, 0, 0 + 1);
        
        tess.addVertex(0, 0, 0 + 1);
        tess.addVertex(0 + 1, 0, 0 + 1);
        tess.addVertex(0 + 1, 0 + 1, 0 + 1);
        tess.addVertex(0, 0 + 1, 0 + 1);
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
    {
        Tessellator tess = Tessellator.instance;
        IIcon icon = block.getIcon(0, 0);
        
        tess.setBrightness(983055);

        //Side: 0
        tess.addVertex(x, y, z);
        tess.addVertex(x + 1, y, z);
        tess.addVertex(x + 1, y, z + 1);
        tess.addVertex(x, y, z + 1);
        
        //Side: 1
        tess.addVertexWithUV(x, y + 1, z, icon.getMinU(), icon.getMinV());
        tess.addVertexWithUV(x, y + 1, z + 1, icon.getMinU(), icon.getMaxV());
        tess.addVertexWithUV(x + 1, y + 1, z + 1, icon.getMaxU(), icon.getMaxV());
        tess.addVertexWithUV(x + 1, y + 1, z, icon.getMaxU(), icon.getMinV());

        tess.addVertex(x, y, z);
        tess.addVertex(x, y + 1, z);
        tess.addVertex(x + 1, y + 1, z);
        tess.addVertex(x + 1, y, z);
        
        tess.addVertex(x, y, z);
        tess.addVertex(x, y, z + 1);
        tess.addVertex(x, y + 1, z + 1);
        tess.addVertex(x, y + 1, z);

        tess.addVertex(x + 1, y, z);
        tess.addVertex(x + 1, y + 1, z);
        tess.addVertex(x + 1, y + 1, z + 1);
        tess.addVertex(x + 1, y, z + 1);
        
        tess.addVertex(x, y, z + 1);
        tess.addVertex(x + 1, y, z + 1);
        tess.addVertex(x + 1, y + 1, z + 1);
        tess.addVertex(x, y + 1, z + 1);
        
        return true;
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId)
    {
        return true;
    }

    @Override
    public int getRenderId()
    {
        return Reference.RYE_MODEL_ID;
    }
}
