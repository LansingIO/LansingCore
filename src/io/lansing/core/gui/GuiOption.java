package io.lansing.core.gui;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GuiOption {
	
	private ItemStack item;
	private int size;
	private ItemMeta meta;
	private String title;
	private ArrayList<String> subtext;
	
	public GuiOption(Material material) {
		this.item = new ItemStack(material);
		this.meta = this.item.getItemMeta();
		this.title = this.meta.getDisplayName();
		this.subtext = new ArrayList<String>();
	}
	
	public ItemStack toItemStack() {
		this.meta.setDisplayName(this.title);
		this.meta.setLore(this.subtext);
		this.item.setItemMeta(this.meta);
		return this.item;
	}
	
	/**
	 * Sets the text to be displayed as the item name in GuiMenu
	 * @param title The text to be displayed.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle(String title) {
		return title;
	}
	
	public void addSubtext(String str) {
		this.subtext.add(str);
	}
	
	public ArrayList<String> getSubtext() {
		return this.subtext;
	}
	
	public void removeSubtext(String str) {
		this.subtext.remove(str);
	}
	
}
