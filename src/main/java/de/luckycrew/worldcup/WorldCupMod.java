package de.luckycrew.worldcup;

import de.luckycrew.worldcup.proxy.CommonProxy;
import info.u_team.u_team_core.sub.USubMod;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = WorldCupConstants.MODID, name = WorldCupConstants.NAME, version = WorldCupConstants.VERSION, acceptedMinecraftVersions = WorldCupConstants.MCVERSION, dependencies = WorldCupConstants.DEPENDENCIES)
public class WorldCupMod extends USubMod {
	
	public WorldCupMod() {
		super(WorldCupConstants.MODID, WorldCupConstants.NAME, WorldCupConstants.VERSION, WorldCupConstants.UPDATEURL);
	}
	
	@Instance
	public static WorldCupMod instance;
	
	@SidedProxy(serverSide = WorldCupConstants.COMMONPROXY, clientSide = WorldCupConstants.CLIENTPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
		proxy.preinit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		super.init(event);
		proxy.init(event);
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
		proxy.postinit(event);
	}
}
