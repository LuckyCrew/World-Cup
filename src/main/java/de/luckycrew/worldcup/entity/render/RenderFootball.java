package de.luckycrew.worldcup.entity.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.*;

import de.luckycrew.worldcup.WorldCupConstants;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFootball extends Render {
	
	private static final ResourceLocation texure = new ResourceLocation(WorldCupConstants.MODID, "textures/entity/football.png");
	
	private Sphere sphere;
	
	public RenderFootball(RenderManager rendermanager) {
		super(rendermanager);
		sphere = new Sphere();
		sphere.setNormals(GLU.GLU_SMOOTH);
		sphere.setTextureFlag(true);
	}
	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) x, (float) y, (float) z);
		bindEntityTexture(entity);
		GL11.glRotated(entity.ticksExisted * 5, entity.motionX + 1, entity.motionY + 1, entity.motionZ + 1);
		sphere.draw(0.6F, 32, 32);
		GlStateManager.popMatrix();
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
	
	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		return texure;
	}
	
}
