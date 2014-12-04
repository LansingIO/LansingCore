package io.lansing.core.gui;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GuiModule {
	
	public GuiModule() {
		
	}
	
	public GuiMenu createMenu(String title, int size) {
		return new GuiMenu(title, size);
	}
	
	public GuiOption createOption(ItemStack item) {
		return new GuiOption(Material.ANVIL);
	}
	
}
