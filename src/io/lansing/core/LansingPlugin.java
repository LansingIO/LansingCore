package io.lansing.core;

import io.lansing.core.command.CommandModule;
import io.lansing.core.console.ConsoleModule;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Class: LansingPlugin
 * This class serves as a template for LansingPlugins to be created using.
 * 
 * @author Lansing Nye-Madden
 *
 */

public class LansingPlugin extends JavaPlugin {
	
	public CommandModule COMMAND = new CommandModule(this);
	public ConsoleModule CONSOLE = new ConsoleModule(this);
	public UtilityModule UTILITY = new UtilityModule(this); 
	
	@Override
	public void onEnable() {
		CONSOLE.logInfo("Initializing Plugin...");
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
	
}
