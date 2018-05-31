package de.luckycrew.worldcup.render;

import de.luckycrew.worldcup.entity.EntityFootball;
import de.luckycrew.worldcup.entity.render.RenderFootball;
import info.u_team.u_team_core.util.registry.ClientRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.*;

public class WorldCupRenderRegistry {
	
	public WorldCupRenderRegistry() {
		entity();
	}
	
	private void entity() {
		Minecraft minecraft = Minecraft.getMinecraft();
		RenderManager manager = minecraft.getRenderManager();
		
		ClientRegistry.registerEntityRenderingHandler(EntityFootball.class, new RenderFootball(manager));
	}
	
}
