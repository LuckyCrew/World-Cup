package de.luckycrew.worldcup.handler;

import static info.u_team.u_team_core.util.registry.CommonRegistry.registerEventHandler;

import de.luckycrew.worldcup.block.WorldCupBlocks;
import de.luckycrew.worldcup.core.*;

public class WorldCupCommonHandler {
	
	public static LuckyHandler handler;
	
	public WorldCupCommonHandler() {
		event();
		luckyhandler();
		luckyevent();
	}
	
	private void event() {
	}
	
	private void luckyhandler() {
		handler = new LuckyHandler();
		registerEventHandler(new BreakBlockListener(WorldCupBlocks.luckyblock, handler));
	}
	
	private void luckyevent() {
		// handler.add(new LuckyEventBlocks());
	}
	
}
