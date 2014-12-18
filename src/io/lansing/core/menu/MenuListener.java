package io.lansing.core.menu;

import io.lansing.core.LansingPlugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Class: CommandListener
 * This listener listens for commands to be executed, and when they are executed, it fires the CommandExecutedEvent
 * 
 * @author Lansing Nye-Madden
 *
 */

public class MenuListener implements Listener {
	
	public LansingPlugin lp;
	
	public MenuListener(LansingPlugin lp) {
		this.lp = lp;
	}
	
	@EventHandler
	public void onInventoryClickedEvent(InventoryClickEvent e) {
		if (lp.isMenu((Menu) e.getInventory())) {
			
		}
	}
	
	public void onMenuClicked() {
		
	}
	
}
