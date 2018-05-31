package de.luckycrew.worldcup.item;

import info.u_team.u_team_core.item.UItem;

import static de.luckycrew.worldcup.tab.WorldCupTabs.tab;

public class WorldCupItems {
	
	public static UItem football;
	
	public WorldCupItems() {
		item();
	}
	
	private void item() {
		football = new ItemFootball("football", tab);
	}
	
}
