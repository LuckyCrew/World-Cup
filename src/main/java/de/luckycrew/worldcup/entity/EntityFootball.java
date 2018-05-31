package de.luckycrew.worldcup.entity;

import info.u_team.u_team_core.util.MathUtil;
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
		return 2.0F;
	}
	
	@Override
	public float getInaccuracy() {
		return 0.1F;
	}
	
	@Override
	public void onImpact(MovingObjectPosition result) {
		if (!this.worldObj.isRemote) {
			if (result.entityHit != null && result.entityHit instanceof EntityLivingBase) {
				EntityLivingBase entity = (EntityLivingBase) result.entityHit;
				result.entityHit.attackEntityFrom(DamageSource.generic, entity.getHealth() / 2);
			} else {
				BlockPos pos = result.getBlockPos();
				if (pos == null) {
					return;
				}
				this.worldObj.setBlockToAir(pos);
				
				if (MathUtil.getRandomNumberInRange(0, 1) == 0) {
					// this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, pos.getX(), pos.getY(), pos.getZ(), ItemStackUtil.from(LbemMod.instance.items.ball)));
				}
			}
			this.setDead();
		}
	}
}