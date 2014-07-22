package me.ghosrec35.farmingplus.client.gui;

import me.ghosrec35.farmingplus.config.FPConfiguration;
import me.ghosrec35.farmingplus.ref.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import cpw.mods.fml.client.config.GuiConfig;

public class FarmingPlusConfigGui extends GuiConfig
{
    public FarmingPlusConfigGui(GuiScreen parentScreen)
    {
        super(parentScreen, new ConfigElement(FPConfiguration.CONFIG.getCategory(FPConfiguration.CONFIG.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_ID, false, false, Reference.MOD_NAME);
    }
}
