package io.lansing.core.command;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Class: CommandExecutedEvent
 * This event is fired by the CommandModule when a command is run by a player or console.
 * 
 * @author Lansing Nye-Madden
 *
 */

public final class CommandExecutedEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    
    private CommandOrigin origin;
    private Player player;
    private String command;
    private String[] args;
    private boolean handled;
 
    public CommandExecutedEvent(CommandOrigin origin, Player player, String command, String[] args) {
        this.origin = origin;
        this.player = player;
        this.command = command;
        this.args = args;
    }
 
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
    
    public void setHandled(boolean handled) {
        this.handled = handled;
    }

	public boolean isHandled() {
		return handled;
	}

	public String[] getArguments() {
		return args;
	}
	
	public CommandOrigin getOrigin() {
		return origin;
	}

	public String getCommand() {
		return command;
	}
	
	public Player getPlayer() {
		return player;
	}
	
}