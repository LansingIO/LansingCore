package io.lansing.core.gui;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Class: GuiOption
 * This is a GuiOption object. As I do not want to extend
 * the ItemStack class, this contains an ItemStack object
 * that is constructed by the toItemStack() method.
 * 
 * @author Lansing Nye-Madden
 *
 */

public class GuiOption {
	
	private ItemStack item;
	private int amount;
	private ItemMeta meta;
	private String title;
	private ArrayList<String> subtext;
	
	/**
	 * Constructor that returns a new instance of the GuiOption object.
	 * <p>
	 * You may specify the Material type. Different material types
	 * have different functionality in terms of what methods are available
	 * for use like changing dye color of wool and soforth.
	 *
	 * @param   material        a {@link Material} type, (Defined as Material.Type)
	 * @return                  a GuiOption object of the specified material type.
	 * @see                     GuiOption
	 */
	public GuiOption(Material material) {
		this.item = new ItemStack(material);
		this.meta = this.item.getItemMeta();
		this.title = this.meta.getDisplayName();
		this.subtext = new ArrayList<String>();
	}
	
	/**
	 * This method returns this object as an ItemStack.
	 * <p>
	 * This will end up creating a new ItemStack each time
	 * that the command runs. I am planning on in the future
	 * making separate commands that do each step of the
	 * building process.
	 * 
	 * TODO: Separate returning ItemStack, and ItemStack
	 * generation into two separate methods.
	 *
	 * @return             the GuiOption as an {@link ItemStack}
	 * @see                GuiOption
	 */
	public ItemStack toItemStack() {
		this.item.setAmount(amount);
		this.meta.setDisplayName(this.title);
		this.meta.setLore(this.subtext);
		this.item.setItemMeta(this.meta);
		return this.item;
	}
	
	/**
	 * This sets the title of the {@link GuiOption} object.
	 *
	 *   TODO: Make it so that the GuiOption is returned, so it can be built on. 
	 *
	 * @param  title       the new title you want for the GuiOption
	 * @see                GuiOption
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * This gets the title of the {@link GuiOption} object.
	 * 
	 * @return           the title of the {@link GuiOption} object.
	 * @see              GuiOption
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * This gets a list of the subtext for the {@link GuiOption} object.
	 *
	 *   TODO: Make it so that the GuiOption is returned, so it can be built on. 
	 *
	 * @param  str       the string that you want the {@link GuiOption} to have. 
	 * @see              GuiOption
	 */
	public void addSubtext(String str) {
		this.subtext.add(str);
	}

	/**
	 * This gets a list of the subtext for the {@link GuiOption} object.
	 *
	 * @return 	         An ArrayList of the substrings on the {@link GuiOption}
	 * @see              GuiOption
	 */
	public ArrayList<String> getSubtext() {
		return this.subtext;
	}
	
	/**
	 * This removes a subtext element from the {@link GuiOption} object.
	 *
	 * @param  str      the string that you want the {@link GuiOption} to have. 
	 * @see             GuiOption
	 */
	public void removeSubtext(String str) {
		this.subtext.remove(str);
	}
	
	/**
	 * This sets the amount of the item that should be in the {@link GuiOption} object.
	 *
	 *   TODO: Make it so that the GuiOption is returned, so it can be built on. 
	 *
	 * @param  amount   the amount of the {@link GuiOption} to be in the {@link ItemStack}. 
	 * @see             GuiOption
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/**
	 * This gets the amount of the item that should be in the {@link GuiOption} object.
	 *
	 * @param  amount   the amount of the {@link GuiOption} to be in the {@link ItemStack}. 
	 * @see             GuiOption
	 */
	public int getAmount() {
		return amount;
	}
	
}
