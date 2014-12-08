package io.lansing.core.menu;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * Class: CommandExecutedEvent
 * This event is fired by the CommandModule when a command is run by a player or console.
 * 
 * @author Lansing Nye-Madden
 *
 */

public final class MenuClickEvent extends Event {
	
    private static final HandlerList handlers = new HandlerList();
    
    private boolean handled;
    private Player player;
    private Inventory inventory;
    private ClickType type;
    private int slot;
    private ItemStack item;
 
    public MenuClickEvent(Player player, Inventory inventory, ClickType type, int slot, ItemStack item) {
    	this.handled = false;
    	this.player = player;
    	this.inventory = inventory;
    	this.type = type;
    	this.slot = slot;
    	this.item = item;
    }
 
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
    
    public void handle() {
        this.handled = true;
    }

	public boolean isHandled() {
		return handled;
	}
	
	public Player getPlayer() {
		return player;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public ClickType getType() {
		return type;
	}

	public int getSlot() {
		return slot;
	}
	
	public ItemStack getItem() {
		return item;
	}
	
}