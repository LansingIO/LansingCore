package io.lansing.core.command;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;

/**
 * Class: CommandListener
 * This listener listens for commands to be executed, and when they are executed, it fires the CommandExecutedEvent
 * 
 * @author Lansing Nye-Madden
 *
 */

public class CommandListener implements Listener {
	
	@EventHandler
	public void onPlayerExecuteCommand(PlayerCommandPreprocessEvent e) {
		this.onCommandExecuted(CommandOrigin.PLAYER, e);
	}
	
	@EventHandler
	public void onConsoleExecuteCommand(ServerCommandEvent e) {
		this.onCommandExecuted(CommandOrigin.CONSOLE, e);
	}
	
	/* Example Command Listener Event Handler.
	@EventHandler
	public void onCommand(CommandExecutedEvent e) {
		if (e.getCommand().equalsIgnoreCase("omg")) e.setHandled(true);
		if (e.isHandled()) Bukkit.broadcastMessage("Origin: " + e.getOrigin().toString());
		if (e.isHandled() && e.getOrigin().equals(CommandOrigin.PLAYER)) Bukkit.broadcastMessage("Origin: " + e.getSender());
		if (e.isHandled()) Bukkit.broadcastMessage("Command: " + e.getCommand());
		if (e.isHandled()) for (String arg : e.getArguments()) Bukkit.broadcastMessage("Argument: " + arg);
	}
	*/
	
	private void onCommandExecuted(CommandOrigin origin, Event e) {
		CommandExecutedEvent event;
		switch (origin) {
		case CONSOLE:
			ServerCommandEvent consoleEvent = (ServerCommandEvent) e;
			String notcommand = consoleEvent.getCommand().replaceFirst("[^\\s]*","").trim();
			String command = consoleEvent.getCommand().replaceAll(notcommand, "").trim();
			String[] consoleArgs = notcommand.split(" ");
			event = new CommandExecutedEvent(origin, null, command, consoleArgs);
			Bukkit.getServer().getPluginManager().callEvent(event);
			break;
		case PLAYER:
			PlayerCommandPreprocessEvent playerEvent = (PlayerCommandPreprocessEvent) e;
			String notmessage = playerEvent.getMessage().replaceFirst("\\/[^\\s]*", "").trim();
			String message = playerEvent.getMessage().replaceAll(notmessage, "").trim();
			String[] playerArgs = notmessage.split(" ");
			event = new CommandExecutedEvent(origin, playerEvent.getPlayer(), message.replaceFirst("/", ""), playerArgs);
			Bukkit.getServer().getPluginManager().callEvent(event);
			playerEvent.setCancelled(event.isHandled());
			break;
		default:
			break;
		}
	}
}
