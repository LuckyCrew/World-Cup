package de.luckycrew.worldcup.entity;

import info.u_team.u_team_core.sub.USub;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class WorldCupEntities {
	
	public WorldCupEntities() {
		throwable();
	}
	
	private void throwable() {
		EntityRegistry.registerGlobalEntityID(EntityFootball.class, "football", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityFootball.class, "football", 0, USub.getID(), 128, 2, true);
	}
	
}
