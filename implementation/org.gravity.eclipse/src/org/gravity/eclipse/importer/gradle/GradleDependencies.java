package org.gravity.eclipse.importer.gradle;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.log4j.Level;

/**
 * This class is used to parse dependencies
 *
 * @author speldszus
 *
 */
public class GradleDependencies {

	private final Set<String> compileDependencies;
	private final Set<String> useDependencies;
	private SdkVersion sdkVersion;

	/**
	 * Creates a new instance and searches all use and compile dependencies in the
	 * parsed build.gradle files
	 *
	 * @param parsedBuildFiles The contents of the build.gradle files
	 * @param androidApp       If the configuration being parsed is the
	 *                         configuration of an Android APP
	 */
	public GradleDependencies(final List<String> parsedBuildFiles, final boolean androidApp) {
		this.compileDependencies = new HashSet<>();
		this.useDependencies = new HashSet<>();
		parsedBuildFiles.parallelStream().forEach(content -> {
			getSingleDependencies(content, parsedBuildFiles);
			getMultipleDependencies(content, parsedBuildFiles);
		});

		if (androidApp) {
			this.sdkVersion = new SdkVersion(parsedBuildFiles.toArray(new String[0]));
		}
		else {
			this.sdkVersion = null;
		}
	}

	/**
	 * Searched all dependencies declared in a group in the parsed build.gradle file
	 *
	 * @param content          The content of the build.gradle file in which should
	 *                         be searched
	 * @param parsedBuildFiles The contents of the build.gradle files
	 */
	public void getMultipleDependencies(final String content, final List<String> parsedBuildFiles) {
		var cur = content;
		int i;
		final var str = "dependencies";
		while ((i = cur.indexOf(str)) > 0) {
			cur = cur.substring(i + str.length()).trim().substring(1);
			final var dependencies = cur.substring(0, cur.indexOf('}'));
			final var entryMatecher = GradleRegexPatterns.MULTIPLE_DEPENDENCIES_ENTRY.matcher(dependencies);
			while (entryMatecher.find()) {
				var dependency = entryMatecher.group(1);
				try {
					dependency = resolveDependencyString(dependency, content, parsedBuildFiles);
					getCompileDependencies().add(dependency);
				} catch (final GradleImportException e) {
					GradleImport.LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
				}
			}
		}
	}

	/**
	 * Searches all single use and compile dependencies in the parsed build.gradle
	 * files
	 *
	 * @param content          The content of the build.gradle file in which should
	 *                         be searched
	 * @param parsedBuildFiles The contents of the build.gradle files
	 */
	public void getSingleDependencies(final String content, final List<String> parsedBuildFiles) {
		final var m = GradleRegexPatterns.SINGLE_DEPENDENCY.matcher(content);
		while (m.find()) {
			var dependency = m.group(3);
			try {
				dependency = resolveDependencyString(dependency, content, parsedBuildFiles);
				if (m.group(0).startsWith("compile") || m.group(0).startsWith("implementation")) {
					getCompileDependencies().add(dependency);
				} else if (dependency.contains(":")) {
					getCompileDependencies().add(dependency);
				} else {
					getUseDependencies().add(dependency);
				}
			} catch (final GradleImportException e) {
				GradleImport.LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}
	}

	/**
	 * Resolves a dependency string
	 *
	 * @param dependency       The dependency string
	 * @param content          The content of the build file containing the
	 *                         dependency
	 * @param parsedBuildFiles All known build files
	 * @return The normalized dependency string
	 * @throws GradleImportException If the normalization failed
	 */
	private static String resolveDependencyString(final String dependency, final String content, final List<String> parsedBuildFiles)
			throws GradleImportException {
		final var index = dependency.indexOf('$');
		if (index < 0) {
			return dependency;
		}
		final var regex = dependency.substring(index + 1).replaceAll("[\\{\\}]", "") + "\\s+=\\s+('|\")(.+)('|\")";
		final var pattern = Pattern.compile(regex);
		final var matcher = pattern.matcher(content);
		if (matcher.find()) {
			return dependency.substring(0, index) + matcher.group(2);
		}
		final var result = parsedBuildFiles.parallelStream().map(buildFile -> {
			final var m = pattern.matcher(buildFile);
			if (m.find()) {
				return m.group(2);
			} else {
				return null;
			}
		}).filter(Objects::nonNull).findAny();
		if (result.isPresent()) {
			return dependency.substring(0, index) + result.get();
		}
		throw new GradleImportException("The dependency cannot be resolved: " + dependency);
	}

	/**
	 * A getter for all found compile dependencies
	 *
	 * @return The dependencies
	 */
	public Set<String> getCompileDependencies() {
		return this.compileDependencies;
	}

	/**
	 * A getter for all found use dependencies
	 *
	 * @return The dependencies
	 */
	public Set<String> getUseDependencies() {
		return this.useDependencies;
	}

	/**
	 * A getter for the sdkVersion if the parsed configuration was an Android App
	 * configuration
	 *
	 * @return the sdkVersion
	 */
	public SdkVersion getSdkVersion() {
		return this.sdkVersion;
	}
}