package org.gravity.headless.config;

import java.io.File;

/**
 *
 * A data class for configuring the logging of a headless gravity application
 *
 * @author speldszus
 *
 */
public class LoggingConfiguration {

	/**
	 * A configuration in which logging is diabled
	 */
	public static final LoggingConfiguration NO_LOGGING = new NoLogging();

	private final File destination;
	private final boolean saveFailedProjects;


	/**
	 * Enables logging to the given location
	 *
	 * @param destination The folder into which logs should be written
	 */
	public LoggingConfiguration(final File destination) {
		this(destination, false);
	}

	/**
	 * Enables logging to the given location
	 *
	 * @param destination The folder into which logs should be written
	 * @param saveFailedProjects Whether Eclipse projects of failed projects should be stored with the logs
	 */
	public LoggingConfiguration(final File destination, final boolean saveFailedProjects) {
		this.destination = destination;
		this.saveFailedProjects = saveFailedProjects;
	}

	/**
	 * Is logging enabled
	 *
	 * @return <true> if logging is enabled
	 */
	public boolean loggingEnabled() {
		return this.destination != null;
	}

	/**
	 * The location to which logs should be written
	 *
	 * @return the location or <code>null</code> if logging is disabled
	 */
	public File getLogDestination() {
		return this.destination;
	}

	/**
	 * Whether failed projects should be saved with the logs
	 *
	 * @return <code>true</code> if logs should be saved
	 */
	public boolean saveFailedProjects() {
		return this.saveFailedProjects;
	}

	/**
	 * A static logging configuration in which logging is disabled
	 *
	 * @author speldszus
	 *
	 */
	private static class NoLogging extends LoggingConfiguration {

		public NoLogging() {
			super(null, false);
		}

		@Override
		public boolean loggingEnabled() {
			return false;
		}
	}
}
