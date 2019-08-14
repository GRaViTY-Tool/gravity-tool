package org.gravity.eclipse.io;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * Helpful operations for logging with log4j
 * 
 * @author speldszus
 *
 */
public class Logging {
	
	private Logging() {
		// This class shouldn't be instantiated
	}

	/**
	 * Inits the log4j logger to log to the console
	 */
	public static void initConsoleLogger() {
		ConsoleAppender consoleAppender = createConsoleAppender(Level.ALL);
		Logger.getRootLogger().addAppender(consoleAppender);
	}

	/**
	 * Creates a new ConsoleAppender with the given log level
	 * 
	 * @param level The log level
	 * @return the appender
	 */
	public static ConsoleAppender createConsoleAppender(Level level) {
		ConsoleAppender consoleAppender = new ConsoleAppender();
		String pattern = "%d [%p|%c|%C{1}] %m%n";
		consoleAppender.setLayout(new PatternLayout(pattern));
		consoleAppender.setThreshold(level);
		consoleAppender.activateOptions();
		return consoleAppender;
	}

}
