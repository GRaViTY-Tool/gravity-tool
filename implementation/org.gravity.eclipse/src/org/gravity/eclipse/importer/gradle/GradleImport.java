package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.eclipse.importer.maven.PomParser;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.eclipse.os.UnsupportedOperationSystemException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;

/**
 * Allows to import a gradle java project as single eclipse project into the
 * workspace
 * 
 * @author speldszus
 *
 */
public class GradleImport {

	private final File gradleCache;
	private final File buildDotGradle;
	private final File rootDir;

	private final Set<Path> buildDotGradleFiles;
	private final Set<Path> includes;

	private Set<String> appliedPlugins;

	private boolean androidApp;

	private static final String GRADLE_CACHE = "caches" + File.separator + "modules-2" + File.separator + "files-2.1";
	private static final boolean LINKONPROJECT = false;

	private static final Logger LOGGER = Logger.getLogger(GradleImport.class);

	/**
	 * An instance of the gradle builder
	 */
	private final GradleBuild gradleBuild;
	private boolean ignoreBuildErrors;
	private boolean buildSuccess;

	/**
	 * Creates an importer for the given gradle root directory of a gradle project
	 * 
	 * The gradle home directory has to be registered at the environment variable
	 * GRADLE_USER_HOME. If the imported project is an Android project the Android
	 * Sdk should be registered at the environment variable ANDROID_HOME.
	 * 
	 * @param rootDir           the path to the gradle root directory
	 * @param ignoreBuildErrors If set to true gradle project are imported even if
	 *                          there are build errors
	 * @throws NoGradleRootFolderException iff the given root directory is not the
	 *                                     root of a gradle project
	 * @throws IOException
	 */
	public GradleImport(File rootDir, boolean ignoreBuildErrors) throws NoGradleRootFolderException, IOException {
		this.buildSuccess = false;
		this.ignoreBuildErrors = ignoreBuildErrors;
		this.rootDir = getRoot(rootDir);
		this.buildDotGradle = new File(this.rootDir, "build.gradle");
		this.includes = new HashSet<>();
		if (new File(this.rootDir, "src").exists()) {
			this.includes.add(this.rootDir.toPath());
		}
		this.buildDotGradleFiles = scanDirectoryForSubRoots(this.rootDir);
		this.gradleCache = initGradleUserHome();
		this.gradleBuild = new GradleBuild();
	}

	/**
	 * Imports the gradle project as single eclipse project
	 * 
	 * @param monitor A progress monitor
	 * @return The new eclipse java project
	 * @throws GradleImportException
	 */
	public IJavaProject importGradleProject(IProgressMonitor monitor) throws GradleImportException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		appliedPlugins = getAppliedPlugins(buildDotGradleFiles);
		androidApp = appliedPlugins.contains("com.android.application");

		build();

		Set<Path> javaSourceFiles = getAllJavaSourceFiles(buildDotGradle.toPath());
		return createJavaProject(javaSourceFiles, monitor);
	}

	/**
	 * Creates a new Java project containing a set of given java source files
	 * 
	 * @param javaSourceFiles The Java source files
	 * @param monitor         A progress monitor
	 * @return The new Java project
	 * @throws GradleImportException If the project cannot be created
	 */
	private IJavaProject createJavaProject(Set<Path> javaSourceFiles, IProgressMonitor monitor)
			throws GradleImportException {
		IJavaProject project = null;
		try {
			project = JavaProjectUtil.createJavaProjectWithUniqueName(rootDir.getName(), monitor);
			HashMap<String, Set<Path>> sourceFolders = getSourceFolderMapping(javaSourceFiles);
			for (Entry<String, Set<Path>> entry : sourceFolders.entrySet()) {
				final IFolder folder = project.getProject().getFolder(entry.getKey().replace("/", "-"));
				if (!folder.exists()) {
					EclipseProjectUtil.createFolder(folder, monitor);
				}
				IPackageFragmentRoot packageFragmentRoot = project.getPackageFragmentRoot(folder);
				JavaProjectUtil.addToClassPath(project,
						Arrays.asList(JavaCore.newSourceEntry(packageFragmentRoot.getPath())), monitor);
				JavaProjectUtil.addJavaSourceFilesToRoot(entry.getValue(), packageFragmentRoot, LINKONPROJECT, monitor);
			}

			if (androidApp) {
				linkApkFolderToProject(project, monitor);
			}
			return addRequiredLibsToProject(project, monitor);
		} catch (IOException | CoreException e) {
			try {
				if (project != null) {
					project.getProject().delete(true, true, monitor);
				}
			} catch (CoreException e1) {
				LOGGER.log(Level.WARN, e1.getLocalizedMessage(), e1);
			}
			throw new GradleImportException(e);
		}
	}

	/**
	 * Builds the gradle project.
	 * 
	 * @throws GradleImportException If the build failed
	 */
	private void build() throws GradleImportException {
		try {
			buildSuccess = gradleBuild.buildGradleProject(rootDir, buildDotGradleFiles, androidApp);
			if (!buildSuccess && !ignoreBuildErrors) {
				throw new GradleImportException("Building the gradle project failed and errors aren't ignored!");
			}
		} catch (UnsupportedOperationSystemException e) {
			LOGGER.log(Level.WARN, "WARNING: Build of gradle project failed, some lib imports might be missing.");
			if (!ignoreBuildErrors) {
				throw new GradleImportException("Building the gradle project failed and errors aren't ignored!", e);
			}
		} catch (IOException | InterruptedException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			throw new GradleImportException(e);
		}
	}

	/**
	 * Searches all java source files of the gradle project including the generated
	 * android R.java
	 * 
	 * @param buildDotGradle The path to the build.gradle file
	 * @return A set of all java source files
	 * @throws GradleImportException If the source files cannot be found
	 */
	private Set<Path> getAllJavaSourceFiles(Path buildDotGradle) throws GradleImportException {
		Set<Path> javaSourceFiles;
		try {
			javaSourceFiles = getJavaSourceFiles(buildDotGradle);
		} catch (IOException e) {
			throw new GradleImportException(e);
		}
		if (javaSourceFiles.size() == 0) {
			final String message = "No Java source files found!";
			LOGGER.log(Level.ERROR, message);
			throw new GradleImportException(message);
		}
		if (androidApp && buildSuccess) {
			try {
				Set<Path> rClasses = GradleAndroid.getRClasses(buildDotGradleFiles);
				javaSourceFiles.addAll(rClasses);
			} catch (IOException e) {
				LOGGER.log(Level.WARN, e.getLocalizedMessage(), e);
			}
		}
		return javaSourceFiles;
	}

	/**
	 * Searches all java source files of the gradle project
	 * 
	 * @param buildDotGradle The path to the build.gradle file
	 * @return All java source files of the build
	 * @throws IOException
	 */
	private Set<Path> getJavaSourceFiles(Path buildDotGradle) throws IOException {
		Set<Path> javaSourceFiles = null;
		try {
			javaSourceFiles = new GradleJavaFiles(buildDotGradle).getJavaFiles();
		} catch (IOException | GradleImportException e) {
			LOGGER.log(Level.WARN, e.getLocalizedMessage(), e);
		}
		if (javaSourceFiles == null || javaSourceFiles.size() == 0) {
			LOGGER.log(Level.WARN, "Falling back to manual analysis of build.gradle files!");
			javaSourceFiles = new HashSet<>();
			for (Path root : includes) {
				scanRootForSourceFiles(root.toFile(), javaSourceFiles);
			}
		}
		return javaSourceFiles;
	}

	/**
	 * Creates a map from names for source folders to java files
	 * 
	 * @param javaSourceFiles A set of java files
	 * @return the mapping
	 */
	private HashMap<String, Set<Path>> getSourceFolderMapping(Set<Path> javaSourceFiles) {
		HashMap<String, Set<Path>> sourceFolders = new HashMap<>();
		for (Path sourceFile : javaSourceFiles) {
			Path path = rootDir.toPath();
			String relativize;
			try {
				relativize = path.relativize(sourceFile).toString();
			} catch (IllegalArgumentException e) {
				relativize = sourceFile.toString().replaceFirst(new File("").getAbsolutePath(), "");
				if (relativize.startsWith("/") || relativize.startsWith("\\")) {
					relativize = relativize.substring(1);
				}
			}
			String[] split = relativize.split("/src/((main|test)/(java|scala)/)?");
			String key;
			if (split.length == 2) {
				key = split[0];
			} else {
				LOGGER.log(Level.WARN, "Couldn't determine source folder of file, using \"src\": " + relativize);
				key = "src";
			}
			Set<Path> files;
			if (sourceFolders.containsKey(key)) {
				files = sourceFolders.get(key);
			} else {
				sourceFolders.put(key, files = new HashSet<>());
			}
			files.add(sourceFile);
		}
		return sourceFolders;
	}

	/**
	 * Searches the root directory containing the build.gradle file
	 * 
	 * @param rootDir The top level root directory
	 * @return The root folder
	 * @throws NoGradleRootFolderException If no build.gradle file has been found
	 */
	private File getRoot(File rootDir) throws NoGradleRootFolderException {
		File buildDotGradle = FileUtils.findRecursive(rootDir, "build.gradle");
		if (buildDotGradle == null) {
			throw new NoGradleRootFolderException();
		}
		return buildDotGradle.getParentFile();
	}

	/**
	 * Resolves the GRADLE_USER_HOME directory
	 * 
	 * @return A file holding the location of GRADLE_USER_HOME
	 * @throws FileNotFoundException If GRADLE_USER_HOME hasn't been found
	 */
	private File initGradleUserHome() throws FileNotFoundException {
		String gradleHome = System.getenv("GRADL_USER_HOME");
		if (gradleHome != null) {
			File tmpGradleHome = new File(gradleHome);
			if (tmpGradleHome.exists()) {
				return tmpGradleHome;
			}
		}
		File tmpGradleHome = new File(new File(System.getProperty("user.home")), ".gradle");
		if (tmpGradleHome.exists()) {
			return tmpGradleHome;
		} else {
			throw new FileNotFoundException("Gradle user home not found");
		}
	}

	/**
	 * Links the gradle folder as "apk" folder to the projects output location
	 * 
	 * @param project The project
	 * @param monitor A progress monitor
	 * @throws JavaModelException
	 * @throws CoreException
	 */
	private void linkApkFolderToProject(IJavaProject project, IProgressMonitor monitor)
			throws JavaModelException, CoreException {
		IPath outputLocation = project.getOutputLocation().removeFirstSegments(1);
		IFolder outputLocationFolder = project.getProject().getFolder(outputLocation);
		if (!outputLocationFolder.exists()) {
			outputLocationFolder.create(true, true, monitor);
		}
		outputLocationFolder.getFolder("apk").createLink(new org.eclipse.core.runtime.Path(rootDir.getAbsolutePath()),
				IResource.ALLOW_MISSING_LOCAL, monitor);
	}

	/**
	 * Searches the libs required by the gradle project and adds them to the given
	 * eclipse project
	 * 
	 * @param monitor A progress monitor
	 * @param project The project to which the libs should be added
	 * @return The eclipse project with the required libs
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws CoreException
	 * @throws GradleImportException
	 */
	private IJavaProject addRequiredLibsToProject(IJavaProject project, IProgressMonitor monitor)
			throws IOException, FileNotFoundException, CoreException, GradleImportException {
		IFolder libFolder = project.getProject().getFolder("lib");
		Stream<IClasspathEntry> entries = Stream.empty();
		Collection<Path> requiredLibs = getLibs(buildDotGradleFiles);
		for (Path libPath : requiredLibs) {
			List<IFile> jarFiles = new LinkedList<>();
			String libName = libPath.toFile().getName();
			if (libName.endsWith(".jar")) {
				IFile f = libFolder.getFile(libPath.getFileName().toString());
				jarFiles.add(f);
				IPath jarPath = new org.eclipse.core.runtime.Path(libPath.toFile().getAbsolutePath());
				if (f.exists()) {
					LOGGER.log(Level.WARN, "Lib is already existent: " + jarFiles);
					continue;
				}
				f.createLink(jarPath, IResource.FILE, monitor);
			} else if (libName.endsWith(".aar")) {
				jarFiles = GradleLibs.extractAar(libPath, libFolder, monitor);
			}
			if (jarFiles.size() == 0) {
				jarFiles = GradleLibs.searchOtherVersionOfLib(libName, libFolder, libPath, jarFiles, monitor);
				if (jarFiles.size() == 0) {
					LOGGER.log(Level.WARN, "No jar found in aar file: " + libPath);
					continue;
				}
			}
			entries = Stream.concat(entries, JavaProjectUtil.getClasspathEntries(jarFiles));
		}
		JavaProjectUtil.addToClassPath(project, entries.collect(Collectors.toList()), monitor);

		return project;
	}

	/**
	 * Returns the plugins applied in the gradle project config
	 * 
	 * @param path The paths of all build.gradle files of the project
	 * @return A set of the applied plugins
	 */
	private Set<String> getAppliedPlugins(Set<Path> buildDotGradleFiles) {
		Set<String> appliedPlugins = new HashSet<>();
		for (Path path : buildDotGradleFiles) {
			appliedPlugins.addAll(getAppliedPlugins(path));
		}
		return appliedPlugins;
	}

	/**
	 * Returns the plugins applied in the gradle project config
	 * 
	 * @param path The path to the build.gradle file
	 * @return A set of the applied plugins
	 */
	private Set<String> getAppliedPlugins(Path path) {
		Set<String> appliedPlugins = new HashSet<>();
		try (Stream<String> lines = Files.lines(path)) {
			lines.forEach(line -> {
				Matcher androidMatcher = GradleRegexPatterns.PLUGIN.matcher(line);
				while (androidMatcher.find()) {
					appliedPlugins.add(androidMatcher.group(2));
				}
			});
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, e);
		}
		return appliedPlugins;
	}

	private Set<Path> scanDirectoryForSubRoots(File rootDir) throws IOException, NoGradleRootFolderException {
		Set<Path> buildDotGradleFiles = new HashSet<Path>();
		File buildFile = new File(rootDir, "build.gradle");
		if (buildFile.exists()) {
			buildDotGradleFiles.add(buildFile.toPath());
		} else {
			throw new NoGradleRootFolderException();
		}

		File settingsFile = new File(rootDir, "settings.gradle");
		if (settingsFile.exists() || (settingsFile = new File(rootDir, "settings.gradle.kts")).exists()) {
			String settingsContentString = FileUtils.getContentsAsString(settingsFile);

			Hashtable<String, String> defs = new Hashtable<>();

			// 1. get all variable definitions
			Matcher defMatcher = GradleRegexPatterns.DEFINITION.matcher(settingsContentString);
			while (defMatcher.find()) {
				defs.put(defMatcher.group(1), defMatcher.group(2));
			}

			// 2. Search for includes
			buildDotGradleFiles.addAll(searchIncludes(settingsContentString, rootDir, defs));

		}
		return buildDotGradleFiles;
	}

	/**
	 * Searches for includes in the settings file and adds those build.gradle files
	 * to the set of build.gradle files
	 * 
	 * @param contentString The content of the settings file
	 * @param rootDir       The gradle root dir
	 * @param defs          A table of defined vars
	 * @throws IOException
	 * @throws NoGradleRootFolderException
	 */
	private Set<Path> searchIncludes(String contentString, File rootDir, Hashtable<String, String> defs)
			throws IOException, NoGradleRootFolderException {
		Set<Path> buildDotGradleFiles = new HashSet<Path>();

		Matcher includeMatcher = GradleRegexPatterns.INCLUDE.matcher(contentString);
		while (includeMatcher.find()) {
			String match = includeMatcher.group(4);
			if (match != null) {
				String var = includeMatcher.group(15);
				if (var != null) {
					match = defs.get(var);
				}
			}
			searchSingleInclude(match, rootDir, buildDotGradleFiles);
		}
		return buildDotGradleFiles;

	}

	/**
	 * Searches if the included sub project and all its sub projects in the root
	 * 
	 * @param include             The the include specification
	 * @param rootDir             The root of the project
	 * @param buildDotGradleFiles All included build.gradle files
	 * @throws IOException If a settings file cannot be read
	 */
	private void searchSingleInclude(String include, File rootDir, Set<Path> buildDotGradleFiles) throws IOException {
		Matcher mEntry = GradleRegexPatterns.INCLUDE_ENTRY.matcher(include);
		while (mEntry.find()) {
			final String includeMatch = mEntry.group(4);
			String subProject = includeMatch.replace(':', File.separatorChar);
			File nextRoot = FileUtils.findRecursive(rootDir, subProject);
			if (nextRoot != null) {
				if (includes.add(nextRoot.toPath())) {
					// If the path hasn't already been included: scan for more roots in the
					// inclusion
					try {
						buildDotGradleFiles.addAll(scanDirectoryForSubRoots(nextRoot));
					} catch (NoGradleRootFolderException e) {
						LOGGER.log(Level.WARN, "The subroot \"" + nextRoot + "\" has no build.gradle file!");
					}
				}
			} else {
				LOGGER.log(Level.ERROR, "Include not found: " + includeMatch);
			}
		}
	}

	private void scanRootForSourceFiles(File rootDir, Set<Path> javaSourceFiles) throws IOException {
		File srcFolder = new File(rootDir, "src");
		if (srcFolder.exists()) {
			File main = new File(srcFolder, "main");
			if (main.exists()) {
				srcFolder = main;
			}
			ExtensionFileVisitor extensionFileVisitor = new ExtensionFileVisitor("java");
			Files.walkFileTree(srcFolder.toPath(), extensionFileVisitor);
			javaSourceFiles.addAll(extensionFileVisitor.getFiles());
		}
	}

	private Collection<Path> getLibs(Collection<Path> buildDotGradleFiles)
			throws IOException, FileNotFoundException, GradleImportException {
		Set<String> compileLibs = new HashSet<>();
		Set<String> useLibs = new HashSet<String>();

		ArrayList<String> parsedBuildFiles = new ArrayList<String>(buildDotGradleFiles.size());

		for (Path path : buildDotGradleFiles) {
			parsedBuildFiles.add(FileUtils.getContentsAsString(path.toFile()));
		}

		SdkVersion sdkVersion = null;
		for (String content : parsedBuildFiles) {
			Matcher m = GradleRegexPatterns.SINGLE_DEPENDENCY.matcher(content);
			while (m.find()) {
				String dependency = m.group(4);
				dependency = resolveDependencyString(dependency, content, parsedBuildFiles);
				if ("compile".equals(m.group(0))) {
					compileLibs.add(dependency);
				} else {
					if (dependency.contains(":")) {
						compileLibs.add(dependency);
					} else {
						useLibs.add(dependency);
					}
				}
			}

			if (androidApp) {
				sdkVersion = GradleAndroid.getAndroidSdkVersion(content);
			}

		}

		Hashtable<String, Path> pathsToLibs = PomParser.searchInCache(compileLibs,
				new File(this.gradleCache, GRADLE_CACHE));
		compileLibs.removeAll(pathsToLibs.keySet());

		Collection<Path> libsAsJar = new ArrayList<>(pathsToLibs.values());
		if (androidApp) {
			try {
				libsAsJar.addAll(GradleAndroid.getAndroidLibs(compileLibs, useLibs, sdkVersion).values());
			} catch (GradleImportException e) {
				if (ignoreBuildErrors) {
					LOGGER.log(Level.WARN, e.getLocalizedMessage(), e);
				} else {
					throw e;
				}
			}

		}
		if (compileLibs.size() > 0) {
			LOGGER.log(Level.WARN, "The following libs haven't been found on the system:");
			for (String lib : compileLibs) {
				LOGGER.log(Level.WARN, "\t" + lib);
			}
		}
		return libsAsJar;
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
	private String resolveDependencyString(String dependency, String content, ArrayList<String> parsedBuildFiles) throws GradleImportException {
		int index = dependency.indexOf('$');
		if (index < 0) {
			// Nothing has to be done
			return dependency;
		}
		final String regex = dependency.substring(index + 1).replaceAll("\\{|\\}", "") + "\\s+=\\s+('|\")(.+)('|\")";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		if (matcher.find()) {
			// Try the file containing the dependency first
			return dependency.substring(0, index) + matcher.group(2);
		}
		// Try to find the variable in all other build.gradle files
		for (String buildFile : parsedBuildFiles) {
			matcher = pattern.matcher(buildFile);
			if (matcher.find()) {
				return dependency.substring(0, index) + matcher.group(2);
			}
		}
		throw new GradleImportException("The dependency cannot be resolved: "+dependency);
	}
}
