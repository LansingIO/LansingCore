package io.lansing.core;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

/**
 * Class: UtilityModule
 * The purpose of this module is to provide methods for use of simplifying bukkit.
 * 
 * @author Lansing Nye-Madden
 *
 */

public class UtilityModule {
	
	public UtilityModule(Plugin p) {
		// TODO Auto-generated constructor stub
	}

	public void RegisterEvent(Listener ev, Plugin p) {
		p.getServer().getPluginManager().registerEvents(ev,p);
	}
	
}
