package io.lansing.core;

import io.lansing.core.command.CommandListener;

/**
 * Class: LansingCore
 * This class allows for LansingCore to communicate with the Bukkit server.
 * 
 * @version v1.0.0
 * @author Lansing Nye-Madden
 *
 */
public class LansingCore extends LansingPlugin {
	
	@Override
	public void onEnable() {
		CONSOLE.logInfo("Initializing Plugin...");
		UTILITY.RegisterEvent(new CommandListener(), this);
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
