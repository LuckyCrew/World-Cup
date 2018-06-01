package de.luckycrew.worldcup.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class EntityFootball extends EntityThrowable {
	
	public EntityFootball(World world) {
		super(world);
	}
	
	public EntityFootball(World world, EntityLivingBase entity) {
		super(world, entity);
	}
	
	public EntityFootball(World world, double x, double y, double z) {
		super(world, x, y, z);
	}
	
	@Override
	public void entityInit() {
		setSize(0.6F, 0.6F);
	}
	
	@Override
	public float getGravityVelocity() {
		return 0.08F;
	}
	
	@Override
	public float getVelocity() {
		return 1.5F;
	}
	
	@Override
	public float getInaccuracy() {
		return 0.1F;
	}
	
	@Override
	public void onImpact(MovingObjectPosition mov) {
		if (!this.worldObj.isRemote) {
			if (mov.entityHit != null && mov.entityHit instanceof EntityLivingBase) {
				EntityLivingBase entity = (EntityLivingBase) mov.entityHit;
				mov.entityHit.attackEntityFrom(DamageSource.generic, entity.getHealth() / 2);
				setDead();
			} else {
				motionY *= -0.5;
				motionX *= 0.8;
				motionZ *= 0.8;
				
				if (Math.abs(motionX) < 0.1 && Math.abs(motionY) < 0.1 && Math.abs(motionZ) < 0.1) {
					setDead();
				}
			}
		}
	}
}