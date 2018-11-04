package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

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
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.eclipse.io.ZipUtil;
import org.gravity.eclipse.os.UnsupportedOperationSystemException;
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

	private File gradleHome, androidHome;

	private final Set<Path> javaSourceFiles = new HashSet<Path>();
	private final Set<Path> buildDotGradleFiles;
	private final Set<Path> includes;

	private Set<String> appliedPlugins;

	private boolean androidApp;

	private final File rootDir;

	private static final String GRADLE_CACHE = "caches" + File.separator + "modules-2" + File.separator + "files-2.1";
	private static final boolean LINKONPROJECT = false;

	static final Logger LOGGER = Logger.getLogger(GradleImport.class);

	/**
	 * Creates an importer for the given gradle root directory of a gradle project
	 * 
	 * The gradle home directory has to be registered at the environment variable
	 * GRADLE_HOME. If the imported project is an Android project the Android Sdk
	 * should be registered at the environment variable ANDROID_HOME.
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
		while (!queue.isEmpty()) {
			File dir = queue.poll();
			if (new File(dir, "build.gradle").exists()) {
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
		this.rootDir = root;
		this.includes = new HashSet<>();
		if (new File(root, "src").exists()) {
			this.includes.add(root.toPath());
		}
		this.buildDotGradleFiles = scanDirectoryForSubRoots(this.rootDir);

		initGradleHome();
	}

	/**
	 * Imports the gradle project as single eclipse project
	 * 
	 * @param ignoreBuildErrors If set to true gradle project are imported even if
	 *                          there are build errors
	 * @param monitor           A progress monitor
	 * @return The new eclipse java project
	 * @throws IOException
	 * @throws CoreException
	 * @throws InterruptedException
	 * @throws NoGradleRootFolderException
	 */
	public IJavaProject importGradleProject(boolean ignoreBuildErrors, IProgressMonitor monitor)
			throws IOException, CoreException, InterruptedException, NoGradleRootFolderException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		appliedPlugins = getAppliedPlugins(buildDotGradleFiles);
		androidApp = appliedPlugins.contains("com.android.application");

		for (Path root : includes) {
			scanRootForSourceFiles(root.toFile());
		}
		if (javaSourceFiles.size() == 0) {
			LOGGER.log(Level.ERROR, "No Java source files found!");
			return null;
		}

		IJavaProject project = JavaProjectUtil.createJavaProjectWithUniqueName(rootDir.getName(), monitor);

		if (androidApp) {
			javaSourceFiles.addAll(GradleAndroid.getRClasses(buildDotGradleFiles));
		}
		JavaProjectUtil.addJavaSourceFilesToRoot(javaSourceFiles,
				project.getPackageFragmentRoot(project.getProject().getFolder("src")), LINKONPROJECT, monitor);

		// build gradle project
		try {
			if (!GradleBuild.buildGradleProject(rootDir, buildDotGradleFiles, androidApp) && !ignoreBuildErrors) {
				return null;
			}
		} catch (UnsupportedOperationSystemException e1) {
			LOGGER.log(Level.WARN, "WARNING: Build of gradle project failed, some lib imports might be missing.");
		}

		if (androidApp) {
			linkApkFolderToProject(project, monitor);
		}

		return addRequiredLibsToProject(project, monitor);
	}

	private void initAndroidHome() {
		String androidHome = System.getenv("ANDROID_HOME");
		if (androidHome != null) {
			File tmpAndroidHome = new File(androidHome);
			if (tmpAndroidHome.exists()) {
				this.androidHome = tmpAndroidHome;
			}
		}
		if (this.androidHome == null) {
			File tmpAndroidHome = new File(new File(System.getProperty("user.home")), "Android/Sdk");
			if (tmpAndroidHome.exists()) {
				this.androidHome = tmpAndroidHome;
			} else {
				LOGGER.log(Level.WARN, "Adroid home not specified.");
			}
		}
	}

	private void initGradleHome() throws FileNotFoundException {
		String gradleHome = System.getenv("GRADLE_HOME");
		if (gradleHome != null) {
			File tmpGradleHome = new File(gradleHome);
			if (tmpGradleHome.exists()) {
				this.gradleHome = tmpGradleHome;
			}
		}
		if (this.gradleHome == null) {
			File tmpGradleHome = new File(new File(System.getProperty("user.home")), ".gradle");
			if (tmpGradleHome.exists()) {
				this.gradleHome = tmpGradleHome;
			} else {
				throw new FileNotFoundException("Gradle home not found");
			}
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
	 * @return The eclise project with the requried libs
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws CoreException
	 */
	private IJavaProject addRequiredLibsToProject(IJavaProject project, IProgressMonitor monitor)
			throws IOException, FileNotFoundException, CoreException {
		IFolder libFolder = project.getProject().getFolder("lib");
		List<IClasspathEntry> entries = new LinkedList<>();
		Set<Path> requiredLibs = getLibs(buildDotGradleFiles);
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
				jarFiles = extractAar(libPath, libFolder, monitor);
			}
			if (jarFiles.size() == 0) {
				jarFiles = searchOtherVersionOfLib(libName, libFolder, libPath, jarFiles, monitor);
				if (jarFiles.size() == 0) {
					LOGGER.log(Level.WARN, "No jar found in aar file: " + libPath);
					continue;
				}
			}
			for (IFile jarFile : jarFiles) {
				IClasspathEntry entry = new ClasspathEntry(IPackageFragmentRoot.K_BINARY, IClasspathEntry.CPE_LIBRARY,
						jarFile.getFullPath(), ClasspathEntry.INCLUDE_ALL, // inclusion patterns
						ClasspathEntry.EXCLUDE_NONE, // exclusion patterns
						null, null, null, // specific output folder
						false, // exported
						ClasspathEntry.NO_ACCESS_RULES, false, // no access rules to combine
						ClasspathEntry.NO_EXTRA_ATTRIBUTES);
				entries.add(entry);
			}
		}
		JavaProjectUtil.addToClassPath(project, entries, monitor);

		return project;
	}

	/**
	 * 
	 * Searches a other version of a lib. This method should only be used if an
	 * exact version match hasn't been found before!
	 * 
	 * @param libName   The name of the lib
	 * @param libFolder The folder to which the lib should be linked or copied
	 * @param libPath   The path to the not existing exact version match
	 * @param jarFiles  The found files
	 * @param monitor   A progress monitor
	 * @return The found files
	 * @throws IOException
	 * @throws CoreException
	 * @throws FileNotFoundException
	 */
	private List<IFile> searchOtherVersionOfLib(String libName, IFolder libFolder, Path libPath, List<IFile> jarFiles,
			IProgressMonitor monitor) throws IOException, CoreException, FileNotFoundException {
		File currentVersion = libPath.getParent().toFile();
		List<File> otherVersions = Arrays.asList(currentVersion.getParentFile().listFiles());
		otherVersions.sort(new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});
		for (int i = otherVersions.indexOf(currentVersion) - 1; i > 0; i--) {
			File tmpFolder = otherVersions.get(i);
			File tmpFile = new File(tmpFolder,
					libName.replace(currentVersion.getName().toString(), tmpFolder.getName()));
			if (tmpFile.exists()) {
				jarFiles = extractAar(tmpFile.toPath(), libFolder, monitor);
				if (jarFiles.size() > 0) {
					break;
				}
			}
		}
		return jarFiles;
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

	private List<IFile> extractAar(Path pathToAar, IFolder destinationFolder, IProgressMonitor monitor)
			throws IOException, CoreException, FileNotFoundException {
		String libName = pathToAar.getFileName().toString();
		List<IFile> extractedJarFiles = new LinkedList<>();
		try (ZipInputStream zipStream = new ZipInputStream(new FileInputStream(pathToAar.toFile()))) {
			boolean copy = false;
			ZipEntry entry;
			while ((entry = zipStream.getNextEntry()) != null) {
				String name = entry.getName();
				if (copy) {
					if (entry.isDirectory()) {
						copy = false;
					} else {
						IFile extractedJarFile = destinationFolder
								.getFile(name.substring(name.lastIndexOf('/') + 1, name.length()));
						if (!extractedJarFile.exists()) {
							extractedJarFiles.add(ZipUtil.extractZipEntry(zipStream, extractedJarFile, monitor));
						}
					}

				} else {
					if (entry.isDirectory() && "libs/".equals(name)) {
						copy = true;
					} else if ("classes.jar".equals(name)) {
						IFile extractedJarFile = destinationFolder
								.getFile(libName.substring(0, libName.length() - "aar".length()) + "jar");
						if (!extractedJarFile.exists()) {
							extractedJarFiles.add(ZipUtil.extractZipEntry(zipStream, extractedJarFile, monitor));
						}
					}
				}
			}
		}
		return extractedJarFiles;
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
		if (settingsFile.exists() || (settingsFile  = new File(rootDir, "settings.gradle.kts")).exists()) {
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
						// If the path hasn't already been included: scan for more roots in the inclusion
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

	private void scanRootForSourceFiles(File rootDir) throws IOException {
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

	private Set<Path> getLibs(Collection<Path> buildDotGradleFiles) throws IOException, FileNotFoundException {
		Set<String> compileLibs = new HashSet<>(), useLibs = new HashSet<String>();

		int minSdk = Integer.MAX_VALUE;
		int targetSdk = -1;

		ArrayList<String> parsedBuildFiles = new ArrayList<String>(buildDotGradleFiles.size());

		for (Path path : buildDotGradleFiles) {
			parsedBuildFiles.add(FileUtils.getContentsAsString(path.toFile()));
		}
		for (String content : parsedBuildFiles) {
			Matcher m = GradleRegexPatterns.SINGLE_DEPENDENCY.matcher(content);
			while (m.find()) {
				String dependency = m.group(4);
				int index = dependency.indexOf('$');
				if (index > 0) {
					final String regex = dependency.substring(index + 1).replaceAll("\\{|\\}","") + "\\s+=\\s+('|\")(.+)('|\")";
					System.err.println("Regex: " + regex); // TODO: Remove
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
				Matcher matcherSdk = GradleRegexPatterns.ANDROID_SDK_VERSION.matcher(content);
				while (matcherSdk.find()) {
					String group = matcherSdk.group(1);
					if ("minSdkVersion".equals(group)) {
						int value = Integer.valueOf(matcherSdk.group(6));
						if (minSdk > value) {
							minSdk = value;
						}
					} else if ("targetSdkVersion".equals(group)) {
						int value = Integer.valueOf(matcherSdk.group(6));
						if (targetSdk < value) {
							targetSdk = value;
						}
					}
				}
			}

		}

		Hashtable<String, Path> pathsToLibs = searchInCache(compileLibs, new File(this.gradleHome, GRADLE_CACHE));
		compileLibs.removeAll(pathsToLibs.keySet());

		Set<Path> libsAsJar = new HashSet<>(pathsToLibs.values());
		if (androidApp) {
			initAndroidHome();

			if (targetSdk != -1) {
				boolean compAndroidSdk = false;
				File platforms = new File(androidHome, GradleAndroid.ANDROID_SDK_PLATFORMS);
				for (int i = targetSdk; i >= minSdk; i--) {
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
					LOGGER.log(Level.WARN, "WARNING: Install android SDK " + targetSdk);
					for (File sdk : platforms.listFiles()) {
						int i = Integer.valueOf(sdk.getName().substring("android-".length()));
						if (i > targetSdk) {
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
						pathsToLibs = searchInCache(compileLibs, new File(this.androidHome, location));
						newLibs |= compileLibs.size() > before;
						compileLibs.removeAll(pathsToLibs.keySet());
						libsAsJar.addAll(pathsToLibs.values());
					}
				} while (newLibs);
			}
		}
		if (compileLibs.size() > 0)

		{
			LOGGER.log(Level.WARN, "The following libs haven't been found on the system:");
			for (String lib : compileLibs) {
				LOGGER.log(Level.WARN, "\t" + lib);
			}
		}
		return libsAsJar;
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
