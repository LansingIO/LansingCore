package io.lansing.core;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class UtilityModule {
	
	public UtilityModule(Plugin p) {
		// TODO Auto-generated constructor stub
	}

	public void RegisterEvent(Listener ev, Plugin p) {
		p.getServer().getPluginManager().registerEvents(ev,p);
	}
	
}
