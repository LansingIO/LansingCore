package io.lansing.core.menu;

import io.lansing.core.LansingPlugin;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Class: GuiModule
 * This is the GuiModule. It contains the functions
 * needed to use the GuiMenus, and GuiOptions.
 * 
 * @author Lansing Nye-Madden
 *
 */

public class MenuModule {
	
	public MenuModule(LansingPlugin lp) {
		
	}
	
	public Menu createMenu(String title, int size) {
		return new Menu(title, size);
	}
	
	public MenuOption createOption(ItemStack item) {
		return new MenuOption(Material.ANVIL);
	}
	
}
