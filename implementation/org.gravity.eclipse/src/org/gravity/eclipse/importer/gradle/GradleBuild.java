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
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
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
		final var env = System.getenv("GRADLE_HOME");
		if (env != null) {
			final var gradleHome = new File(env);
			if (gradleHome.exists()) {
				final var bin = new File(gradleHome, "bin/gradle");
				if (bin.exists() && bin.isFile()) {
					this.gradleBin = bin;
					LOGGER.info("Found gradle binaries at \""+this.gradleBin
							+ "\"");
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
		var gradlew = new File(gradleRootFolder, "gradlew");
		if (!gradlew.exists()) {
			if (this.gradleBin == null) {
				return false;
			}
			gradlew = this.gradleBin;
		}

		try {
			FileUtils.changeToOSEncoding(gradlew);
		} catch (final IOException e) {
			LOGGER.warn("could not change gradlew to os specific line delimiters");
		}
		if (!gradlew.setExecutable(true)) {
			return false;
		}

		final var localProperties = new File(gradleRootFolder, "local.properties");
		if (localProperties.exists() && !localProperties.delete()) {
			return false;

		}

		var process = createBuildProcess(gradleRootFolder, "assemble");
		final var message = Execute.collectMessages(process);
		process.waitFor();
		process.destroy();

		var success = process.exitValue() == 0;

		if (!success && androidApp && message.toString().contains("File google-services.json is missing")) {
			var fix = false;
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
		List<String> env = null;
		final List<String> args = new LinkedList<>();

		final var java = getCompatibleJvmPath(path);
		if (java != null) {
			args.add("-Dorg.gradle.java.home=" + java);
			final var envMap = new HashMap<>(System.getenv());
			envMap.put("JAVA_HOME", java);
			env = envMap.entrySet().parallelStream().map(e -> e.getKey() + '=' + e.getValue())
					.collect(Collectors.toList());
		}
		args.add(buildTarget);

		return Execute.run(path, "gradlew", args, env);
	}

	/**
	 * @param root
	 * @return
	 * @throws IOException
	 */
	private static String getCompatibleJvmPath(final File root) throws IOException {
		String java = null;
		final var propertiesPath = new File(root, "gradle/wrapper/gradle-wrapper.properties");
		if (propertiesPath.exists()) {
			final var gradleVersion = Files.readAllLines(propertiesPath.toPath()).parallelStream()
					.filter(line -> line.startsWith("distributionUrl=")).map(line -> {
						final var version = line.substring(0, line.lastIndexOf('-'));
						return version.substring(version.lastIndexOf('-') + 1);
					}).findAny().orElse("5.0");
			if (gradleVersion.compareTo("5.0") < 0) {
				final var manager = JavaRuntime.getExecutionEnvironmentsManager();
				final var optional = Stream.of(manager.getExecutionEnvironments())
						.filter(e -> e.getId().indexOf(JavaCore.VERSION_1_8) != -1).findAny();
				if (optional.isPresent()) {
					final var ienv = optional.get();
					var vm = ienv.getDefaultVM();
					if (vm == null) {
						final var comp = ienv.getCompatibleVMs();
						if (comp.length > 0) {
							vm = comp[0];
						}
					}
					if (vm != null) {
						final var location = vm.getInstallLocation();
						java = location.toString();
					}
				}
			}
		}
		return java;
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
		var change = false;
		final var content = Files.readAllLines(buildFile);
		for (var i = 0; i < content.size(); i++) {
			final var l = content.get(i);
			final var matcher = GOOGLE_SERVICES_PATTERN.matcher(l);
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
