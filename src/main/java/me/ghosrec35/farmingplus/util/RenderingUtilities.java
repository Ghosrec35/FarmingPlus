package me.ghosrec35.farmingplus.util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;

public class RenderingUtilities
{
    public static void renderSimpleCube(int x, int y, int z)
    {
        Tessellator tess = Tessellator.instance;
        tess.setBrightness(983055);

        // Side: 0
        tess.addVertex(x, y, z);
        tess.addVertex(x + 1, y, z);
        tess.addVertex(x + 1, y, z + 1);
        tess.addVertex(x, y, z + 1);

        // Side: 1
        tess.addVertex(x, y + 1, z);
        tess.addVertex(x, y + 1, z + 1);
        tess.addVertex(x + 1, y + 1, z + 1);
        tess.addVertex(x + 1, y + 1, z);

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
    }

    public static void renderSimpleTexturedCube(Block block, int x, int y, int z)
    {
        renderSimpleMultitexturedCube(block, 0, 0, x, y, z);
    }

    public static void renderSimpleMultitexturedCube(Block block, int side, int metadata, int x, int y, int z)
    {
        Tessellator tess = Tessellator.instance;
        IIcon icon = null;

        tess.setBrightness(983055);

        // Side: 0
        switch (side)
        {
            case 0:
                icon = block.getIcon(0, metadata);
                tess.addVertexWithUV(x, y, z, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x + 1, y, z, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x + 1, y, z + 1, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x, y, z + 1, icon.getMinU(), icon.getMinV());
                break;
            // Side: 1
            case 1:
                icon = block.getIcon(1, metadata);
                tess.addVertexWithUV(x, y + 1, z, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x, y + 1, z + 1, icon.getMinU(), icon.getMaxV());
                tess.addVertexWithUV(x + 1, y + 1, z + 1, icon.getMaxU(), icon.getMaxV());
                tess.addVertexWithUV(x + 1, y + 1, z, icon.getMaxU(), icon.getMinV());
                break;
            case 2:
                icon = block.getIcon(2, metadata);
                tess.addVertexWithUV(x, y, z, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x, y + 1, z, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x + 1, y + 1, z, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x + 1, y, z, icon.getMinU(), icon.getMinV());
                break;
            case 3:
                icon = block.getIcon(3, metadata);
                tess.addVertexWithUV(x, y, z, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x, y, z + 1, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x, y + 1, z + 1, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x, y + 1, z, icon.getMinU(), icon.getMinV());
                break;
            case 4:
                icon = block.getIcon(4, metadata);
                tess.addVertexWithUV(x + 1, y, z, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x + 1, y + 1, z, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x + 1, y + 1, z + 1, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x + 1, y, z + 1, icon.getMinU(), icon.getMinV());
                break;
            case 5:
                icon = block.getIcon(5, metadata);
                tess.addVertexWithUV(x, y, z + 1, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x + 1, y, z + 1, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x + 1, y + 1, z + 1, icon.getMinU(), icon.getMinV());
                tess.addVertexWithUV(x, y + 1, z + 1, icon.getMinU(), icon.getMinV());
                break;
        }
    }
}
