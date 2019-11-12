package org.gravity.eclipse.importer.gradle;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

import org.apache.log4j.Level;
import org.gravity.eclipse.importer.NoRootFolderException;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.eclipse.io.FileUtils;

public class GradleIncludes {
	private final Set<Path> includes;
	private final Set<Path> buildDotGradleFiles;

	public GradleIncludes(File rootDir) throws NoRootFolderException, IOException {
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
	 * @param include              The the include specification
	 * @param rootDir              The root of the project
	 * @param buildDotGradleFiles  All included build.gradle files
	 * @throws IOException  If a settings file cannot be read
	 */
	public void searchSingleInclude(String include, File rootDir, Set<Path> buildDotGradleFiles) throws IOException {
		final Matcher mEntry = GradleRegexPatterns.INCLUDE_ENTRY.matcher(include);
		while (mEntry.find()) {
			final String includeMatch = mEntry.group(4);
			final String subProject = includeMatch.replace(':', File.separatorChar);
			final File nextRoot = FileUtils.findRecursive(rootDir, subProject);
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
				GradleImport.LOGGER.log(Level.ERROR, "Include not found: " + includeMatch);
			}
		}
	}

	/**
	 * Searches all java source files of the gradle project
	 * @param buildDotGradle  The path to the build.gradle file
	 * @return  All java source files of the build
	 * @throws IOException
	 */
	public Set<Path> getJavaSourceFiles(Path buildDotGradle) throws IOException {
		Set<Path> javaSourceFiles = null;
		try {
			javaSourceFiles = new GradleJavaFiles(buildDotGradle).getJavaFiles();
		} catch (final IOException e) {
			GradleImport.LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		} catch (final GradleImportException e) {
			GradleImport.LOGGER.log(Level.INFO, e.getMessage(), e);
		}
		if (javaSourceFiles == null || javaSourceFiles.isEmpty()) {
			GradleImport.LOGGER.log(Level.WARN, "Falling back to manual analysis of build.gradle files!");
			javaSourceFiles = new HashSet<>();
			for (final Path root : this.includes) {
				scanRootForSourceFiles(root.toFile(), javaSourceFiles);
			}
		}
		return javaSourceFiles;
	}

	public Set<Path> scanDirectoryForSubRoots(File rootDir) throws IOException, NoRootFolderException {
		final Set<Path> subRoots = new HashSet<>();
		final File buildFile = new File(rootDir, "build.gradle");
		if (buildFile.exists()) {
			subRoots.add(buildFile.toPath());
		} else {
			throw new NoRootFolderException();
		}
		File settingsFile = new File(rootDir, "settings.gradle");
		boolean exists = settingsFile.exists();
		if (!exists) {
			settingsFile = new File(rootDir, "settings.gradle.kts");
			exists = settingsFile.exists();
		}
		if (exists) {
			final String settingsContentString = FileUtils.getContentsAsString(settingsFile);
			final HashMap<String, String> defs = new HashMap<>();
			final Matcher defMatcher = GradleRegexPatterns.DEFINITION.matcher(settingsContentString);
			while (defMatcher.find()) {
				defs.put(defMatcher.group(1), defMatcher.group(2));
			}
			subRoots.addAll(searchIncludes(settingsContentString, rootDir, defs));
		}
		return subRoots;
	}

	/**
	 * Searches for includes in the settings file and adds those build.gradle files to the set of build.gradle files
	 * @param contentString  The content of the settings file
	 * @param rootDir        The gradle root dir
	 * @param defs           A table of defined vars
	 * @throws IOException
	 */
	public Set<Path> searchIncludes(String contentString, File rootDir, HashMap<String, String> defs)
			throws IOException {
		final Set<Path> includedFiles = new HashSet<>();
		final Matcher includeMatcher = GradleRegexPatterns.INCLUDE.matcher(contentString);
		while (includeMatcher.find()) {
			String match = includeMatcher.group(4);
			if (match != null) {
				final String var = includeMatcher.group(15);
				if (var != null) {
					match = defs.get(var);
				}
			}
			searchSingleInclude(match, rootDir, includedFiles);
		}
		return includedFiles;
	}

	public void scanRootForSourceFiles(File rootDir, Set<Path> javaSourceFiles) throws IOException {
		final File srcFolder = new File(rootDir, "src");
		if (srcFolder.exists()) {
			for (final String name : new String[] { "main", "java" }) {
				final File main = new File(srcFolder, name);
				if (main.exists()) {
					final ExtensionFileVisitor extensionFileVisitor = new ExtensionFileVisitor("java");
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
		return buildDotGradleFiles;
	}
}