package io.lansing.core.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * Class: GuiMenu
 * This is a GuiMenu object, and as I do not want to extend
 * the inventory class, this contains an inventory object
 * that is modified by the publicly exposed methods.
 * 
 * @author Lansing Nye-Madden
 * @changed 12/04/2014 11:02 AM EST
 *
 */

public class GuiMenu {
	
	public Inventory menu;
	
	public GuiMenu(String title, int size) {
		this.menu = Bukkit.createInventory(null, size, title);
	}
	
	public void open(Player p) {
		p.openInventory(this.menu);
	}
	
	public String getTitle() {
		return this.menu.getTitle();
	}
	
	public void setOption(int slot, ItemStack item) {
		this.menu.setItem(slot, item);
	}
	
}