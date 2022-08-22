package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Level;
import org.gravity.eclipse.importer.NoRootFolderException;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.eclipse.io.FileUtils;

public final class GradleIncludes {
	private final Set<Path> includes;
	private final Set<Path> buildDotGradleFiles;

	public GradleIncludes(final File rootDir) throws NoRootFolderException, IOException {
		this.includes = new HashSet<>();
		if (new File(rootDir, "src").exists()) {
			getIncludes().add(rootDir.toPath());
		}
		this.buildDotGradleFiles = scanDirectoryForSubRoots(rootDir);

	}

	public Set<Path> getIncludes() {
		return this.includes;
	}

	/**
	 * Searches if the included sub project and all its sub projects in the root
	 *
	 * @param contentString             The the include specification
	 * @param rootDir             The root of the project
	 * @param buildDotGradleFiles All included build.gradle files
	 * @throws IOException If a settings file cannot be read
	 */
	public void searchSingleInclude(final String contentString, final File rootDir, final Set<Path> buildDotGradleFiles)
			throws IOException {
		final var includeMatcher = GradleRegexPatterns.INCLUDE.matcher(contentString);
		while (includeMatcher.find()) {
			final var match = includeMatcher.group(1);
			for (final String includeMatch : match.split(",")) {
				addInclude(includeMatch.trim(), rootDir, buildDotGradleFiles);
			}
		}
	}

	/**
	 * @param include The name of the include
	 * @param rootDir The root of the project
	 * @param buildDotGradleFiles All included build.gradle files
	 * @throws IOException If a settings file cannot be read
	 */
	private void addInclude(final String include, final File rootDir, final Set<Path> buildDotGradleFiles)
			throws IOException {
		final var subProject = include.replace("'", "").replace("\"", "").replace(':',
				File.separatorChar);
		final var nextRoot = FileUtils.findRecursive(rootDir, subProject);
		if (nextRoot != null) {
			if (this.includes.add(nextRoot.toPath())) {
				try {
					buildDotGradleFiles.addAll(scanDirectoryForSubRoots(nextRoot));
				} catch (final NoRootFolderException e) {
					GradleImport.LOGGER.log(Level.WARN,
							"The subroot \"" + nextRoot + "\" has no build.gradle file!");
				}
			}
		} else {
			GradleImport.LOGGER.log(Level.ERROR, "Include not found: " + include);
		}
	}

	/**
	 * Searches all java source files of the gradle project
	 *
	 * @param buildDotGradle The path to the build.gradle file
	 * @return All java source files of the build
	 * @throws IOException
	 */
	public Set<Path> getJavaSourceFiles(final Path buildDotGradle) throws IOException {
		Set<Path> javaSourceFiles = null;
		try {
			javaSourceFiles = new GradleJavaFiles(buildDotGradle).getJavaFiles();
		} catch (final IOException e) {
			GradleImport.LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		} catch (final GradleImportException e) {
			GradleImport.LOGGER.log(Level.INFO, e.getMessage(), e);
		}
		if ((javaSourceFiles == null) || javaSourceFiles.isEmpty()) {
			GradleImport.LOGGER.warn("Falling back to manual analysis of build.gradle files!");
			javaSourceFiles = new HashSet<>();
			for (final Path root : this.includes) {
				scanRootForSourceFiles(root.toFile(), javaSourceFiles);
			}
		}
		return javaSourceFiles;
	}

	public Set<Path> scanDirectoryForSubRoots(final File rootDir) throws IOException, NoRootFolderException {
		final Set<Path> subRoots = new HashSet<>();
		final var buildFile = new File(rootDir, "build.gradle");
		if (buildFile.exists()) {
			subRoots.add(buildFile.toPath());
		} else {
			throw new NoRootFolderException();
		}
		var settingsFile = new File(rootDir, "settings.gradle");
		var exists = settingsFile.exists();
		if (!exists) {
			settingsFile = new File(rootDir, "settings.gradle.kts");
			exists = settingsFile.exists();
		}
		if (exists) {
			final var settingsContentString = FileUtils.getContentsAsString(settingsFile);
			final var defs = new HashMap<String, String>();
			final var defMatcher = GradleRegexPatterns.DEFINITION.matcher(settingsContentString);
			while (defMatcher.find()) {
				defs.put(defMatcher.group(1), defMatcher.group(2));
			}
			subRoots.addAll(searchIncludes(settingsContentString, rootDir, defs));
		}
		return subRoots;
	}

	/**
	 * Searches for includes in the settings file and adds those build.gradle files
	 * to the set of build.gradle files
	 *
	 * @param contentString The content of the settings file
	 * @param rootDir       The gradle root dir
	 * @param defs          A table of defined vars
	 * @throws IOException
	 */
	public Set<Path> searchIncludes(final String contentString, final File rootDir, final Map<String, String> defs)
			throws IOException {
		final Set<Path> includedFiles = new HashSet<>();
		searchSingleInclude(contentString, rootDir, includedFiles);
		final var matcher = GradleRegexPatterns.INCLUDE_VAR.matcher(contentString);
		while(matcher.find()) {
			addInclude(matcher.group(2), rootDir, includedFiles);
		}
		return includedFiles;
	}

	public void scanRootForSourceFiles(final File rootDir, final Set<Path> javaSourceFiles) throws IOException {
		final var srcFolder = new File(rootDir, "src");
		if (srcFolder.exists()) {
			for (final String name : new String[] { "main", "java" }) {
				final var main = new File(srcFolder, name);
				if (main.exists()) {
					final var extensionFileVisitor = new ExtensionFileVisitor("java");
					Files.walkFileTree(main.toPath(), extensionFileVisitor);
					javaSourceFiles.addAll(extensionFileVisitor.getFiles());
				}
			}
		}
	}

	/**
	 * @return the buildDotGradleFiles
	 */
	public Set<Path> getBuildDotGradleFiles() {
		return this.buildDotGradleFiles;
	}
}