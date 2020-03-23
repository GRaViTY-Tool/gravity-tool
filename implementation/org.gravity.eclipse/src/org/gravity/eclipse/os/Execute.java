/**
 * 
 */
package org.gravity.eclipse.os;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Functionalities to execute commands
 * 
 * @author speldszus
 *
 */
public class Execute {

	private static final Logger LOGGER = Logger.getLogger(Execute.class);

	private Execute() {
		// This class shouldn't be instantiated
	}
	

	/**
	 * Executes the process and logs the messages created by the process
	 * 
	 * @param process	The process to execute
	 * @return if the process has been executed successfully
	 */
	public static boolean execute(Process process) {
		try {
			collectMessages(process);
			process.waitFor();
			return process.exitValue() == 0;
		} catch (InterruptedException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
			Thread.currentThread().interrupt();
		} catch (IOException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
		}
		return false;
	}
	
	/**
	 * Collects content of error and output stream in a single string builder
	 *
	 * @param process the process to monitor
	 * @return the string builder
	 * @throws IOException
	 */
	public static StringBuilder collectMessages(final Process process) throws IOException {
		final StringBuilder message = new StringBuilder();
		try (BufferedReader stream = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
			String line;
			while ((line = stream.readLine()) != null) {
				message.append(line);
				message.append('\n');
				LOGGER.log(Level.INFO, "Info: " + line);
			}
		}
		try (BufferedReader stream = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
			String line;
			while ((line = stream.readLine()) != null) {
				message.append(line);
				message.append('\n');
				LOGGER.warn("Error: " + line);
			}
		}
		return message;
	}
	

}
