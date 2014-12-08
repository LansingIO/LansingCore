package io.lansing.core.menu;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
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
	
	@EventHandler
	public void onInventoryClickedEvent(InventoryClickEvent e) {
		if (!(e.getWhoClicked() instanceof Player)) return;
		Player p = (Player) e.getWhoClicked();
		Event event = new MenuClickEvent(p, e.getClickedInventory(), e.getClick(), e.getSlot(), e.getCurrentItem());
		Bukkit.getServer().getPluginManager().callEvent(event);
	}
	
}
