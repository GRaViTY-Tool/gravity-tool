/**
 *
 */
package org.gravity.eclipse.os;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;

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
	 * @param process The process to execute
	 * @return if the process has been executed successfully
	 */
	public static boolean execute(final Process process) {
		try {
			collectMessages(process);
			process.waitFor();
			return process.exitValue() == 0;
		} catch (final InterruptedException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
			Thread.currentThread().interrupt();
		} catch (final IOException e) {
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
		final var message = new StringBuilder();
		try (var stream = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
			String line;
			while ((line = stream.readLine()) != null) {
				message.append(line);
				message.append('\n');
				LOGGER.log(Level.INFO, "Info: " + line);
			}
		}
		try (var stream = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
			String line;
			while ((line = stream.readLine()) != null) {
				message.append(line);
				message.append('\n');
				LOGGER.warn("Error: " + line);
			}
		}
		return message;
	}

	/**
	 * Executes an executable binary
	 *
	 * @param location The location in which the binary is located
	 * @param binary   The executable binary
	 * @param args     The arguments that should be passed to the call
	 * @param env      The environment that should be used
	 * @return The process
	 * @throws UnsupportedOperationSystemException
	 * @throws IOException
	 */
	public static Process run(final File location, final String binary, final List<String> args, final List<String> env)
			throws UnsupportedOperationSystemException, IOException {
		final List<String> cmdList = new LinkedList<>();
		switch (Platform.getOS()) {
			case Platform.OS_WIN32:
				cmdList.add("cmd");
				cmdList.add("/c");
				cmdList.add(binary);
				break;
			case Platform.OS_LINUX:
			case Platform.OS_MACOSX:
				if (new File(location, binary).exists()) {
					cmdList.add("./" + binary);
				} else {
					cmdList.add(binary);
				}
				break;
			default:
				LOGGER.warn("Unsupported OS");
				throw new UnsupportedOperationSystemException("Cannot execute " + binary);
		}
		cmdList.addAll(args);
		return Runtime.getRuntime().exec(cmdList.toArray(new String[0]),
				env == null ? null : env.toArray(new String[0]), location);
	}

}
