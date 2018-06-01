package de.luckycrew.worldcup.item;

import de.luckycrew.worldcup.entity.EntityFootball;
import info.u_team.u_team_core.creativetab.UCreativeTab;
import info.u_team.u_team_core.item.UItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class ItemFootball extends UItem {
	
	public ItemFootball(String name, UCreativeTab tab) {
		super(name, tab);
		setMaxStackSize(16);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.RARE;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
		}
		
		world.playSoundAtEntity(player, "note.harp", 0.2F, 0.4F / (itemRand.nextFloat() * 3F + 5F));
		
		if (!world.isRemote) {
			world.spawnEntityInWorld(new EntityFootball(world, player));
		}
		return itemstack;
	}
}
