package de.luckycrew.worldcup.block;

import static de.luckycrew.worldcup.tab.WorldCupTabs.tab;

import de.luckycrew.core.DefaultLuckyBlock;

public class WorldCupBlocks {
	
	public static DefaultLuckyBlock luckyblock;
	
	public WorldCupBlocks() {
		block();
	}
	
	private void block() {
		luckyblock();
	}
	
	private void luckyblock() {
		luckyblock = new DefaultLuckyBlock("luckyblock_worldcup", tab);
		tab.setIcon(luckyblock);
	}
	
}
