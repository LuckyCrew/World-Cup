package de.luckycrew.worldcup.proxy;

import de.luckycrew.worldcup.render.*;
import net.minecraftforge.fml.common.event.*;

public class ClientProxy extends CommonProxy {
	
	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
		new WorldCupModelRegistry();
	}
	
	public void init(FMLInitializationEvent event) {
		super.init(event);
		new WorldCupRenderRegistry();
	}
	
	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
	}
	
}
