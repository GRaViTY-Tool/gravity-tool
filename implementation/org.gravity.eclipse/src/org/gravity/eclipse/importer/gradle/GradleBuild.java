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
import org.gravity.eclipse.os.OperationSystem;
import org.gravity.eclipse.os.UnsupportedOperationSystemException;

/**
 * 
 * 
 * @author speldszus
 *
 */
class GradleBuild {
	
	private static final Logger LOGGER = Logger.getLogger(GradleBuild.class);

	static boolean buildGradleProject(File gradleRootFolder, Iterable<Path> buildDotGradleFiles, boolean androidApp)
			throws IOException, InterruptedException, UnsupportedOperationSystemException {
		File gradlew = new File(gradleRootFolder, "gradlew");
		if (!gradlew.exists()) {
			return false;
		}
		gradlew.setExecutable(true);

		List<String> lines = Files.readAllLines(gradlew.toPath());
		switch (OperationSystem.os) {
		case WINDOWS:
			for (String s : lines) {
				s.replaceAll("(?<!\\r)\\n", "\\r\\n");
			}
			break;
		case LINUX:
			for (String s : lines) {
				s.replaceAll("\\r\\n?", "\\n");
			}
			break;
		default:
			LOGGER.log(Level.WARN, "WARNING: Lineendings of \"" + gradlew.toString()
					+ "\" haven't been changed due to a unsupported operation sytem.");
			break;
		}

		Files.write(gradlew.toPath(), lines);

		File localProperties = new File(gradleRootFolder, "local.properties");
		if (localProperties.exists()) {
			localProperties.delete();
		}

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

		StringBuilder message = collectMessages(process);
		process.waitFor();
		boolean success = process.exitValue() == 0;
		
		if(!success && androidApp) {
			if(message.toString().contains("File google-services.json is missing")) {
				boolean fix = false;
				Pattern pattern = Pattern.compile("apply\\s+plugin:\\s+'com.google.gms.google-services'");
				for(Path buildFile : buildDotGradleFiles) {
					boolean change = false;
					List<String> content = Files.readAllLines(buildFile);
					for(int i = 0; i < content.size(); i++) {
						String l = content.get(i);
						Matcher matcher = pattern.matcher(l);
						while(matcher.find()) {
							change = true;
							content.set(i, l.substring(0, matcher.regionStart())+l.substring(matcher.regionEnd()));
						}
					}
					if(change) {
						fix = true;
						Files.write(buildFile, content);
					}
				}
				if(fix) {
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

					try (BufferedReader stream = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
						String line;
						while ((line = stream.readLine()) != null) {
							LOGGER.log( Level.INFO, "GRADLE: "+line);
						}
					}

					process.waitFor();
					success = process.exitValue() == 0;	
				}
			}
		}

		return success;
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
				LOGGER.log( Level.INFO, "GRADLE: "+line);
			}
		}
		try (BufferedReader stream = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
			String line;
			while ((line = stream.readLine()) != null) {
				message.append(line);
				message.append('\n');
				LOGGER.log(Level.WARN, "GRADLE: "+line);
			}
		}
		return message;
	}

	
}
