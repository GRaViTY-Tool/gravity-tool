/**
 * 
 */
package org.gravity.eclipse.importer.gradle;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.eclipse.os.OperationSystem;
import org.gravity.eclipse.os.UnsupportedOperationSystemException;

/**
 * A class providing functionality to build gradle projects using the gradle
 * wrapper
 * 
 * @author speldszus
 *
 */
class GradleBuild {

	private static final Logger LOGGER = Logger.getLogger(GradleBuild.class);

	private static final Pattern GOOGLE_SERVIES_PATTERN = Pattern
			.compile("apply\\s+plugin:\\s+'com.google.gms.google-services'");

	/**
	 * Builds the gradle project
	 * 
	 * @param gradleRootFolder The root of the project
	 * @param buildDotGradleFiles All build.gradle files of the gradle project
	 * @param androidApp If the project is an android application
	 * @return True iff the project has been build successfully
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws UnsupportedOperationSystemException
	 */
	static boolean buildGradleProject(File gradleRootFolder, Iterable<Path> buildDotGradleFiles, boolean androidApp)
			throws IOException, InterruptedException, UnsupportedOperationSystemException {
		File gradlew = new File(gradleRootFolder, "gradlew");
		if (!gradlew.exists()) {
			return false;
		}

		FileUtils.changeToOSEncoding(gradlew);
		gradlew.setExecutable(true);

		File localProperties = new File(gradleRootFolder, "local.properties");
		if (localProperties.exists()) {
			localProperties.delete();
		}

		Process process = build(gradleRootFolder);
		StringBuilder message = collectMessages(process);
		process.waitFor();

		boolean success = process.exitValue() == 0;

		if (!success && androidApp) {
			if (message.toString().contains("File google-services.json is missing")) {
				boolean fix = false;
				for (Path buildFile : buildDotGradleFiles) {
					fix |= replaceGoogleServices(buildFile);
				}
				if (fix) {
					process = build(gradleRootFolder);
					collectMessages(process);
					process.waitFor();

					success = process.exitValue() == 0;
				}
			}
		}

		return success;
	}

	/**
	 * Executed the gradle wrapper located in the given gradle Root folder
	 * 
	 * @param gradleRootFolder The root folder
	 * @return The running build process
	 * @throws IOException
	 * @throws UnsupportedOperationSystemException
	 */
	private static Process build(File gradleRootFolder) throws IOException, UnsupportedOperationSystemException {
		Process process = null;
		switch (OperationSystem.os) {
		case WINDOWS:
			process = Runtime.getRuntime().exec("cmd /c \"" + "gradlew assemble", null, gradleRootFolder);
			break;
		case LINUX:
			process = Runtime.getRuntime().exec("./gradlew assemble", null, gradleRootFolder);
			break;
		default:
			LOGGER.log(Level.WARN, "Unsupported OS");
			throw new UnsupportedOperationSystemException("Cannot execute gradlew");
		}
		return process;
	}

	/**
	 * Removes the google services from the list of applied plugins in the given
	 * gradle build file
	 * 
	 * @param buildFile The build file
	 * @return true, if the build file has been changed
	 * @throws IOException- if an I/O error occurs writing to or creating the build
	 *                      file, or the text cannot be encoded as UTF-8
	 */
	private static boolean replaceGoogleServices(Path buildFile) throws IOException {
		boolean change = false;
		List<String> content = Files.readAllLines(buildFile);
		for (int i = 0; i < content.size(); i++) {
			String l = content.get(i);
			Matcher matcher = GOOGLE_SERVIES_PATTERN.matcher(l);
			while (matcher.find()) {
				change = true;
				content.set(i, l.substring(0, matcher.regionStart()) + l.substring(matcher.regionEnd()));
			}
		}
		if (change) {
			Files.write(buildFile, content);
			return true;
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
	private static StringBuilder collectMessages(Process process) throws IOException {
		StringBuilder message = new StringBuilder();
		try (BufferedReader stream = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
			String line;
			while ((line = stream.readLine()) != null) {
				message.append(line);
				message.append('\n');
				LOGGER.log(Level.INFO, "GRADLE: " + line);
			}
		}
		try (BufferedReader stream = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
			String line;
			while ((line = stream.readLine()) != null) {
				message.append(line);
				message.append('\n');
				LOGGER.log(Level.WARN, "GRADLE: " + line);
			}
		}
		return message;
	}

}
