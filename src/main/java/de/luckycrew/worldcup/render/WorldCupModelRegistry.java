package de.luckycrew.worldcup.render;

import static info.u_team.u_team_core.util.registry.ClientRegistry.registerModel;

import de.luckycrew.worldcup.block.WorldCupBlocks;

public class WorldCupModelRegistry {
	
	public WorldCupModelRegistry() {
		item();
		block();
	}
	
	private void block() {
		registerModel(WorldCupBlocks.luckyblock);
	}
	
	private void item() {
		
	}
}
