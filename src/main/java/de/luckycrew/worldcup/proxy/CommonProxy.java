package de.luckycrew.worldcup.proxy;

import de.luckycrew.worldcup.block.WorldCupBlocks;
import de.luckycrew.worldcup.tab.WorldCupTabs;
import net.minecraftforge.fml.common.event.*;

public class CommonProxy {
	
	public void preinit(FMLPreInitializationEvent event) {
		new WorldCupTabs();
		new WorldCupBlocks();
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	public void postinit(FMLPostInitializationEvent event) {
		
	}
	
}
