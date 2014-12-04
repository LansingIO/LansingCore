package io.lansing.core.lang;

import java.util.logging.Level;

/**
 * Enum: Message
 * This enum contains a list of common message that
 * are frequently displayed by the plugin. This is
 * just so that my LansingCore plugins are uniform
 * and are "Overly Simplistic" to use.
 * 
 * @author Lansing Nye-Madden
 *
 */

public enum Message {
	    PRE_ENABLE(Level.INFO, "Starting Initalization Process..."),
	    POST_ENABLE(Level.INFO, "Initalization Process Completed!"),
	    PRE_DISABLE(Level.INFO,"Starting Shutdown Process..."),
	    POST_DISABLE(Level.INFO, "Shutdown Process Completed!"),
	    PRE_LOAD(Level.INFO, "Starting Loading Process..."),
	    POST_LOAD(Level.INFO, "Loading Process Completed!");

	    private final String phrase;
	    private final Level level;

	    Message(Level level, String phrase) {
	        this.phrase = phrase;
	        this.level = level;
	    }

	    public String getMessage() {
	        return phrase;
	    }
	    public Level getLevel() {
	        return level;
	    }
}
