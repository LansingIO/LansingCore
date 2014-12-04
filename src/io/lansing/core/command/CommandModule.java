package io.lansing.core.command;

import org.bukkit.plugin.Plugin;

public class CommandModule {
	
	@SuppressWarnings("unused")
	private Plugin plugin;

	public CommandModule(Plugin plugin) {
		this.plugin = plugin;
	}
	
}
