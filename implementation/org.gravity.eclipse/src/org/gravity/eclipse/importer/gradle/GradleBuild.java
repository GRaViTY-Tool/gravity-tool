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
	 * The location of the primary gradle installation as specified in GRADLE_HOME
	 */
	private final File gradleBin;

	/**
	 * 
	 */
	public GradleBuild() {
		String env = System.getenv("GRADLE_HOME");
		if (env != null) {
			File gradleHome = new File(env);
			if (gradleHome.exists()) {
				final File bin = new File(gradleHome, "bin/gradle");
				if (bin.exists() && bin.isFile()) {
					this.gradleBin = bin;
				} else {
					this.gradleBin = null;
					LOGGER.warn("The gradle installation at \"" + env + "\" doesn't has the expected structure.");
				}
			} else {
				this.gradleBin = null;
				LOGGER.warn("GRADLE_HOME points to a not existing path: " + env);
			}
		} else {
			this.gradleBin = null;
			LOGGER.warn("GRADLE_HOME is not set, only gradle projects providing warappers can be built.");
		}
	}

	/**
	 * Builds the gradle project
	 * 
	 * @param gradleRootFolder    The root of the project
	 * @param buildDotGradleFiles All build.gradle files of the gradle project
	 * @param androidApp          If the project is an android application
	 * @return True iff the project has been build successfully
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws UnsupportedOperationSystemException
	 */
	boolean buildGradleProject(File gradleRootFolder, Iterable<Path> buildDotGradleFiles, boolean androidApp)
			throws IOException, InterruptedException, UnsupportedOperationSystemException {
		File gradlew = new File(gradleRootFolder, "gradlew");
		if (!gradlew.exists()) {
			if (gradleBin == null) {
				return false;
			}
			gradlew = gradleBin;
		}

		FileUtils.changeToOSEncoding(gradlew);
		if (!gradlew.setExecutable(true)) {
			return false;
		}

		File localProperties = new File(gradleRootFolder, "local.properties");
		if (localProperties.exists() && !localProperties.delete()) {
			return false;

		}

		Process process = createBuildProcess(gradleRootFolder, "assemble");
		StringBuilder message = collectMessages(process);
		process.waitFor();
		process.destroy();

		boolean success = process.exitValue() == 0;

		if (!success && androidApp && message.toString().contains("File google-services.json is missing")) {
			boolean fix = false;
			for (Path buildFile : buildDotGradleFiles) {
				fix |= replaceGoogleServices(buildFile);
			}
			if (fix) {
				process = createBuildProcess(gradleRootFolder, "assemble");
				collectMessages(process);
				process.waitFor();

				success = process.exitValue() == 0;
			}
		}

		return success;
	}

	/**
	 * Executed the gradle wrapper located in the given gradle Root folder
	 * 
	 * @param path        The root folder
	 * @param buildTarget
	 * @return The running build process
	 * @throws IOException
	 * @throws UnsupportedOperationSystemException
	 */
	private static Process createBuildProcess(File path, String buildTarget)
			throws IOException, UnsupportedOperationSystemException {
		Process process = null;
		switch (OperationSystem.os) {
		case WINDOWS:
			process = Runtime.getRuntime().exec("cmd /c \"" + "gradlew " + buildTarget, null, path);
			break;
		case LINUX:
			process = Runtime.getRuntime().exec("./gradlew " + buildTarget, null, path);
			break;
		default:
			LOGGER.log(Level.WARN, "Unsupported OS");
			throw new UnsupportedOperationSystemException("Cannot execute gradlew");
		}
		return process;
	}

	/**
	 * @param location The location of the gradle project
	 * @param target   The build target
	 * @throws IOException
	 * @throws UnsupportedOperationSystemException
	 * @throws InterruptedException
	 * @return true, iff the project has been build successfully
	 */
	public static boolean build(File location, String target) {
		try {
			Process process = createBuildProcess(location, target);
			GradleBuild.collectMessages(process);
			process.waitFor();
			return process.exitValue() == 0;
		} catch (IOException | UnsupportedOperationSystemException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		    Thread.currentThread().interrupt();
		} catch (InterruptedException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			Thread.currentThread().interrupt();
		}
		return false;
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
	static StringBuilder collectMessages(Process process) throws IOException {
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
