package io.lansing.core;

import io.lansing.core.command.CommandListener;
import io.lansing.core.command.CommandModule;
import io.lansing.core.console.ConsoleModule;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class LansingCore extends JavaPlugin {
	
	public CommandModule COMMAND = new CommandModule(this);
	public ConsoleModule CONSOLE = new ConsoleModule(this);
	
	@Override
	public void onEnable() {
		CONSOLE.logInfo("Initializing Plugin...");
		Bukkit.getPluginManager().registerEvents(new CommandListener(), this);
		CONSOLE.logInfo("Initializing Complete...");
	}
	
	@Override
	public void onDisable() {
		CONSOLE.logInfo("Destructing Plugin...");
		CONSOLE.logInfo("Destructing Complete...");
	}
	
	@Override
	public void onLoad() {
		CONSOLE.logInfo("Loading Initalized...");
		CONSOLE.logInfo("Loading Complete...");
	}
	
	public void LoadModules() {
		
	}
	
}
