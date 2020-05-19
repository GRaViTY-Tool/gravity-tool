/**
 *
 */
package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.jdt.launching.environments.IExecutionEnvironmentsManager;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.eclipse.os.Execute;
import org.gravity.eclipse.os.UnsupportedOperationSystemException;

/**
 * A class providing functionality to build gradle projects using the gradle
 * wrapper
 *
 * @author speldszus
 *
 */
public class GradleBuild {

	public static final Logger LOGGER = Logger.getLogger(GradleBuild.class);

	private static final Pattern GOOGLE_SERVICES_PATTERN = Pattern
			.compile("apply\\s+plugin:\\s+'com.google.gms.google-services'");

	/**
	 * The location of the primary gradle installation as specified in GRADLE_HOME
	 */
	private final File gradleBin;

	/**
	 *
	 */
	public GradleBuild() {
		final String env = System.getenv("GRADLE_HOME");
		if (env != null) {
			final File gradleHome = new File(env);
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
	boolean buildGradleProject(final File gradleRootFolder, final Iterable<Path> buildDotGradleFiles,
			final boolean androidApp) throws IOException, InterruptedException, UnsupportedOperationSystemException {
		File gradlew = new File(gradleRootFolder, "gradlew");
		if (!gradlew.exists()) {
			if (this.gradleBin == null) {
				return false;
			}
			gradlew = this.gradleBin;
		}

		try {
			FileUtils.changeToOSEncoding(gradlew);
		} catch (IOException e) {
			LOGGER.warn("could not change gradlew to os specific line delimiters");
		}
		if (!gradlew.setExecutable(true)) {
			return false;
		}

		final File localProperties = new File(gradleRootFolder, "local.properties");
		if (localProperties.exists() && !localProperties.delete()) {
			return false;

		}

		Process process = createBuildProcess(gradleRootFolder, "assemble");
		final StringBuilder message = Execute.collectMessages(process);
		process.waitFor();
		process.destroy();

		boolean success = process.exitValue() == 0;

		if (!success && androidApp && message.toString().contains("File google-services.json is missing")) {
			boolean fix = false;
			for (final Path buildFile : buildDotGradleFiles) {
				fix |= replaceGoogleServices(buildFile);
			}
			if (fix) {
				process = createBuildProcess(gradleRootFolder, "assemble");
				Execute.collectMessages(process);
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
	public static Process createBuildProcess(final File path, final String buildTarget)
			throws IOException, UnsupportedOperationSystemException {
		String gradleVersion = Files.readAllLines(new File(path, "gradle/wrapper/gradle-wrapper.properties").toPath())
				.parallelStream().filter(line -> line.startsWith("distributionUrl=")).map(line -> {
					String version = line.substring(0, line.lastIndexOf('-'));
					return version.substring(version.lastIndexOf('-') + 1);
				}).findAny().orElse("5.0");

		String java = null;
		List<String> env = null;
		if (gradleVersion.compareTo("5.0") < 0) {
			IExecutionEnvironmentsManager manager = JavaRuntime.getExecutionEnvironmentsManager();
			Optional<IExecutionEnvironment> optional = Stream.of(manager.getExecutionEnvironments())
					.filter(e -> e.getId().indexOf(JavaCore.VERSION_1_8) != -1).findAny();
			if (optional.isPresent()) {
				IExecutionEnvironment ienv = optional.get();
				IVMInstall vm = ienv.getDefaultVM();
				if (vm == null) {
					IVMInstall[] comp = ienv.getCompatibleVMs();
					if (comp.length > 0) {
						vm = comp[0];
					}
				}
				if (vm != null) {
					File location = vm.getInstallLocation();
					java = "-Dorg.gradle.java.home="+location.toString();
					HashMap<String, String> envMap = new HashMap<>(System.getenv());
					envMap.put("JAVA_HOME", location.toString());
					env = envMap.entrySet().parallelStream().map(e -> e.getKey()+'='+e.getValue()).collect(Collectors.toList());
				}
			}
		}

		String binary = "./gradlew";

		
		List<String> args = new LinkedList<>();
		if(java != null) {
			args.add(java);
		}
		args.add(buildTarget);
		
		return Execute.run(path, binary, args, env);
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
	private static boolean replaceGoogleServices(final Path buildFile) throws IOException {
		boolean change = false;
		final List<String> content = Files.readAllLines(buildFile);
		for (int i = 0; i < content.size(); i++) {
			final String l = content.get(i);
			final Matcher matcher = GOOGLE_SERVICES_PATTERN.matcher(l);
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
	 * @param location The location of the gradle project
	 * @param target   The build target
	 * @throws IOException
	 * @throws UnsupportedOperationSystemException
	 * @throws InterruptedException
	 * @return true, iff the project has been build successfully
	 */
	static boolean build(final File location, final String target) {
		Process process;
		try {
			process = createBuildProcess(location, target);
		} catch (IOException | UnsupportedOperationSystemException e) {
			LOGGER.error(e.getLocalizedMessage(), e);
			return false;
		}
		return Execute.execute(process);
	}
}
