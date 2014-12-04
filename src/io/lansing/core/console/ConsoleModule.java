package io.lansing.core.console;

import io.lansing.core.lang.Message;

import java.util.logging.Level;

import org.bukkit.plugin.Plugin;

/**
 * Class: ConsoleModule
 * This class is used in order to log messages to the console. It
 * also handles sending of default messages stored in io.lansing.core.lang.Message
 * 
 * @author Lansing Nye-Madden
 *
 */

public class ConsoleModule {
	
	private Plugin pl;
	
	public ConsoleModule(Plugin pl) {
		this.pl = pl;
	}
	
	private void log(Level logLevel, String message) {
		pl.getLogger().log(logLevel, message);
	}
	
	public void logMessage(Message phrase) {
		this.log(phrase.getLevel(), phrase.getMessage());
	}
	
	public void logInfo(String message) {
		this.log(Level.INFO, message);
	}
	
	public void logWarning(String message) {
		this.log(Level.WARNING, message);
	}
	
	public void logSevere(String message) {
		this.log(Level.SEVERE, message);
	}	
	
}
