package de.luckycrew.worldcup;

import org.apache.logging.log4j.*;

public class WorldCupConstants {
	
	public static final String MODID = "luckyblock_worldcup";
	public static final String NAME = "World Cup LuckyBlocks";
	public static final String VERSION = "@VERSION@";
	public static final String MCVERSION = "1.8";
	public static final String DEPENDENCIES = "required-after:uteamcore@1.1.2-49";
	
	public static final String UPDATEURL = "https://api.u-team.info/update/luckyblocks/worldcup.json";
	
	public static final String COMMONPROXY = "de.luckycrew.worldcup.proxy.CommonProxy";
	public static final String CLIENTPROXY = "de.luckycrew.worldcup.proxy.ClientProxy";
	
	public static final Logger LOGGER = LogManager.getLogger(NAME);
	
	private WorldCupConstants() {
	}
	
}
