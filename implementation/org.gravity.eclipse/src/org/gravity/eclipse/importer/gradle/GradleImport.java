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

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

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
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.eclipse.os.UnsupportedOperationSystemException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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

	/**
	 * Creates an importer for the given gradle root directory of a gradle project
	 * 
	 * The gradle home directory has to be registered at the environment variable
	 * GRADLE_USER_HOME. If the imported project is an Android project the Android
	 * Sdk should be registered at the environment variable ANDROID_HOME.
	 * 
	 * @param rootDir the path to the gradle root directory
	 * @throws NoGradleRootFolderException iff the given root directory is not the
	 *                                     root of a gradle project
	 * @throws IOException
	 */
	public GradleImport(File rootDir) throws NoGradleRootFolderException, IOException {
		LinkedList<File> queue = new LinkedList<File>();
		queue.add(rootDir);
		File root = null;
		File buildDotGradle = null;
		while (!queue.isEmpty()) {
			File dir = queue.poll();
			buildDotGradle = new File(dir, "build.gradle");
			if (buildDotGradle.exists()) {
				root = dir;
				break;
			}
			for (File file : dir.listFiles()) {
				if (file.isDirectory()) {
					queue.add(file);
				}
			}
		}
		if (root == null) {
			throw new NoGradleRootFolderException();
		}
		this.buildDotGradle = buildDotGradle;
		this.rootDir = root;
		this.includes = new HashSet<>();
		if (new File(root, "src").exists()) {
			this.includes.add(root.toPath());
		}
		this.buildDotGradleFiles = scanDirectoryForSubRoots(this.rootDir);
		this.gradleCache = initGradleUserHome();
		gradleBuild = new GradleBuild();
	}

	/**
	 * Imports the gradle project as single eclipse project
	 * 
	 * @param ignoreBuildErrors If set to true gradle project are imported even if
	 *                          there are build errors
	 * @param monitor           A progress monitor
	 * @return The new eclipse java project
	 * @throws GradleImportException
	 */
	public IJavaProject importGradleProject(boolean ignoreBuildErrors, IProgressMonitor monitor)
			throws GradleImportException {

		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		appliedPlugins = getAppliedPlugins(buildDotGradleFiles);
		androidApp = appliedPlugins.contains("com.android.application");

		build(ignoreBuildErrors);

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
	 * @param ignoreBuildErrors If non critical errors should be ignored
	 * @throws GradleImportException If the build failed
	 */
	private void build(boolean ignoreBuildErrors) throws GradleImportException {
		try {
			if (!gradleBuild.buildGradleProject(rootDir, buildDotGradleFiles, androidApp) && !ignoreBuildErrors) {
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
		if (androidApp) {
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

	private File initAndroidHome() throws GradleImportException {
		String androidHome = System.getenv("ANDROID_HOME");
		if (androidHome != null) {
			File tmpAndroidHome = new File(androidHome);
			if (tmpAndroidHome.exists()) {
				return tmpAndroidHome;
			}
		}
		File tmpAndroidHome = new File(new File(System.getProperty("user.home")), "Android/Sdk");
		if (tmpAndroidHome.exists()) {
			return tmpAndroidHome;
		} else {
			String message = "Adroid home not specified.";
			LOGGER.log(Level.WARN, message);
			throw new GradleImportException(message);
		}

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

	private Set<String> getAppliedPlugins(Set<Path> buildDotGradleFiles) {
		Set<String> appliedPlugins = new HashSet<>();
		for (Path path : buildDotGradleFiles) {
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

			Matcher mEntry = GradleRegexPatterns.INCLUDE_ENTRY.matcher(match);
			while (mEntry.find()) {
				final String includeMatch = mEntry.group(4);
				String subProject = includeMatch.replace(':', File.separatorChar);
				File nextRoot = null;
				LinkedList<File> queue = new LinkedList<>();
				queue.add(rootDir);
				while (!queue.isEmpty()) {
					File tmp = queue.poll();
					File tmpSubProject = new File(tmp, subProject);
					if (tmpSubProject.exists()) {
						nextRoot = tmpSubProject;
						break;
					} else {
						for (File f : tmp.listFiles()) {
							if (f.isDirectory()) {
								queue.add(f);
							}
						}
					}
				}
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
		return buildDotGradleFiles;

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
				int index = dependency.indexOf('$');
				if (index > 0) {
					final String regex = dependency.substring(index + 1).replaceAll("\\{|\\}", "")
							+ "\\s+=\\s+('|\")(.+)('|\")";
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher = pattern.matcher(content);
					if (matcher.find()) {
						dependency = dependency.substring(0, index) + matcher.group(2);
					} else {
						for (String buildFile : parsedBuildFiles) {
							matcher = pattern.matcher(buildFile);
							if (matcher.find()) {
								dependency = dependency.substring(0, index) + matcher.group(2);
								break;
							}
						}
					}
				}
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
				sdkVersion = getAndroidSdkVersion(content);
			}

		}

		Hashtable<String, Path> pathsToLibs = searchInCache(compileLibs, new File(this.gradleCache, GRADLE_CACHE));
		compileLibs.removeAll(pathsToLibs.keySet());

		Collection<Path> libsAsJar = pathsToLibs.values();
		if (androidApp) {
			libsAsJar.addAll(getAndroidLibs(compileLibs, useLibs, sdkVersion));

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
	 * Searches the Android libraries
	 * 
	 * @param compileLibs The signatures of the compile libs
	 * @param useLibs The signatures of the use libs
	 * @param sdkVersion  The SDK information for the project
	 * @return The jar files of the libraries
	 * @throws GradleImportException If the search for the libraries in the Android SDK location failed
	 */
	private Set<Path> getAndroidLibs(Set<String> compileLibs, Set<String> useLibs,
			SdkVersion sdkVersion) throws GradleImportException {
		Hashtable<String, Path> pathsToLibs;
		if (sdkVersion == null || Double.isNaN(sdkVersion.getTargetSdk()) || Double.isNaN(sdkVersion.getMinSdk())) {
			throw new GradleImportException("Couldn't determine the SDK version information");
		}

		File androidHome = initAndroidHome();

		boolean compAndroidSdk = false;
		File platforms = new File(androidHome, GradleAndroid.ANDROID_SDK_PLATFORMS);
		Set<Path> libsAsJar = new HashSet<>();
		for (int i = (int) sdkVersion.getTargetSdk(); i >= (int) sdkVersion.getMinSdk(); i--) {
			File androidPlatform = new File(platforms, "android-" + i);
			File androidJar = new File(androidPlatform, "android.jar");
			if (androidJar.exists()) {
				compAndroidSdk = true;
				libsAsJar.add(androidJar.toPath());

				File optional = new File(androidPlatform, "optional");
				for (String use : useLibs) {
					File lib = new File(optional, use + ".jar");
					if (lib.exists()) {
						libsAsJar.add(lib.toPath());
					} else {
						LOGGER.log(Level.WARN, "UseLib dependency not resolved: " + use);
					}
				}
				break;
			}
		}
		if (!compAndroidSdk) {
			LOGGER.log(Level.WARN, "WARNING: Install android SDK " + sdkVersion.getTargetSdk());
			for (File sdk : platforms.listFiles()) {
				int i = Integer.valueOf(sdk.getName().substring("android-".length()));
				if (i > sdkVersion.getTargetSdk()) {
					libsAsJar.add(new File(sdk, "android.jar").toPath());
					break;
				}
			}
		}
		boolean newLibs = false;
		do {
			for (String location : new String[] { "extras/android/m2repository", "extras/google/m2repository",
					"extras/m2repository" }) {
				int before = compileLibs.size();
				try {
					pathsToLibs = searchInCache(compileLibs, new File(androidHome, location));
					newLibs |= compileLibs.size() > before;
					compileLibs.removeAll(pathsToLibs.keySet());
					libsAsJar.addAll(pathsToLibs.values());
				} catch (IOException e) {
					throw new GradleImportException(e);
				}
			}
		} while (newLibs);
		
		return libsAsJar;
	}

	/**
	 * Determines the SDK version information of the android project described in
	 * the gradle build file
	 * 
	 * @param gradleContent The content of the gradle build file
	 * @return The SDK version information
	 */
	private SdkVersion getAndroidSdkVersion(String gradleContent) {
		SdkVersion sdkVersion = new SdkVersion();
		Matcher matcherSdk = GradleRegexPatterns.ANDROID_SDK_VERSION.matcher(gradleContent);
		while (matcherSdk.find()) {
			String group = matcherSdk.group(1);
			if ("minSdkVersion".equals(group)) {
				int value = Integer.valueOf(matcherSdk.group(6));
				double minSdk = sdkVersion.getMinSdk();
				if (Double.isNaN(minSdk) || minSdk > value) {
					sdkVersion.setMinSdk(value);
				}
			} else if ("targetSdkVersion".equals(group)) {
				int value = Integer.valueOf(matcherSdk.group(6));
				double targetSdk = sdkVersion.getTargetSdk();
				if (Double.isNaN(targetSdk) || targetSdk < value) {
					sdkVersion.setTargetSdk(value);
				}
			}
		}
		return sdkVersion;
	}

	private Hashtable<String, Path> searchInCache(Set<String> libs, File cacheFile) throws IOException {
		Hashtable<String, Path> results = new Hashtable<>();
		HashSet<String> newLibs = new HashSet<>();
		for (String lib : libs) {
			String[] segments = lib.split(":");
			File libFile = cacheFile;
			String name;
			if (segments.length == 1) {
				name = segments[0];
			} else if (segments.length >= 3) {
				name = segments[1] + '-' + segments[2];
			} else {
				throw new IllegalAccessError("The lib \"" + lib + "\" doesn't has the expected amount of segments");
			}
			for (String segment : segments) {
				File tmpLibFile = new File(libFile, segment);
				if (tmpLibFile.exists()) {
					libFile = tmpLibFile;
				} else {
					libFile = new File(libFile, segment.replace('.', '/'));
				}
			}
			if (libFile.exists()) {
				ExtensionFileVisitor extensionFileVisitor = new ExtensionFileVisitor(Arrays.asList("jar", "aar"));
				Files.walkFileTree(libFile.toPath(), extensionFileVisitor);
				List<Path> files = extensionFileVisitor.getFiles();
				if (files.size() == 1) {
					Path libJar = files.get(0);
					results.put(lib, libJar);
					File pom = libJar.getParent().resolve(name + ".pom").toFile();
					if (pom.exists()) {
						parsePomFile(pom, cacheFile, results, newLibs);
					}
				}
			}
		}
		if (newLibs.size() > 0) {
			libs.addAll(newLibs);
		}
		return results;
	}

	/**
	 * Discovers new libs from the given pom file
	 * 
	 * @param pom       The pom file
	 * @param cacheFile A cache of already discovered libs
	 * @param results   A mapping between libs and their locations
	 * @param newLibs   The set of newly discovered libs
	 */
	private void parsePomFile(File pom, File cacheFile, Hashtable<String, Path> results, HashSet<String> newLibs) {
		try {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pom);
			document.getDocumentElement().normalize();
			NodeList deps = document.getElementsByTagName("dependency");
			for (int i = 0; i < deps.getLength(); i++) {
				Node dependency = deps.item(i);
				String group = null, artifact = null, version = null;
				NodeList childNodes = dependency.getChildNodes();
				for (int j = 0; j < childNodes.getLength(); j++) {
					Node child = childNodes.item(j);
					String nodeName = child.getNodeName();
					if ("groupId".equals(nodeName)) {
						group = child.getChildNodes().item(0).getNodeValue();
					} else if ("artifactId".equals(nodeName)) {
						artifact = child.getChildNodes().item(0).getNodeValue();
					} else if ("version".equals(nodeName)) {
						version = child.getChildNodes().item(0).getNodeValue();
					}
				}
				String string = group + ':' + artifact + ':' + version;
				HashSet<String> set = new HashSet<String>();
				set.add(string);
				Hashtable<String, Path> subResults = searchInCache(set, cacheFile);
				if (subResults.isEmpty()) {
					if (!results.containsKey(string)) {
						newLibs.add(string);
					}
				} else {
					results.putAll(subResults);
				}
			}
		} catch (SAXException | IOException | ParserConfigurationException e) {
			LOGGER.log(Level.WARN, e);
		}
	}
}
