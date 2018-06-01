package de.luckycrew.worldcup.core;

import info.u_team.u_team_core.block.UBlock;
import info.u_team.u_team_core.creativetab.UCreativeTab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DefaultLuckyBlock extends UBlock {
	
	public DefaultLuckyBlock(String name, UCreativeTab tab) {
		super(name, Material.sponge, tab);
		this.setHardness(0.55F);
		this.setResistance(100.0F);
		this.setLightLevel(0.3F);
	}
	
	@Override
	public void dropBlockAsItemWithChance(World world, BlockPos pos, IBlockState state, float chance, int fortune) {
	}
}
