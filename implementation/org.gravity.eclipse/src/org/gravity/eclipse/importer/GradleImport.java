package org.gravity.eclipse.importer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.gravity.eclipse.io.ZipUtil;
import org.gravity.eclipse.os.OperationSystem;
import org.gravity.eclipse.os.UnsupportedOperationSystemException;
import org.gravity.eclipse.util.EclipseProjectUtil;
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

	private Set<Path> javaSourceFiles = new HashSet<Path>();
	private Set<Path> buildDotGradleFiles = new HashSet<Path>();

	private Set<String> appliedPlugins;

	private boolean androidApp;

	private final File rootDir;

	private static final String GRADLE_CACHE = "caches" + File.separator + "modules-2" + File.separator + "files-2.1";
	private static final String ANDROID_SDK_PLATFORMS = "platforms";
	private static final boolean LINKONPROJECT = false;

	private static final Logger LOGGER = Logger.getLogger(GradleImport.class);

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
	 * @throws FileNotFoundException       iff the gradle home directory couldn't be
	 *                                     found
	 */
	public GradleImport(File rootDir) throws NoGradleRootFolderException, FileNotFoundException {
		LinkedList<File> queue = new LinkedList<File>();
		queue.add(rootDir);
		boolean success = false;
		while (!queue.isEmpty()) {
			File dir = queue.poll();
			if (new File(dir, "build.gradle").exists()) {
				success = true;
				break;
			}
			for (File file : dir.listFiles()) {
				if (file.isDirectory()) {
					queue.add(file);
				}
			}
		}
		if (!success) {
			throw new NoGradleRootFolderException();
		}
		this.rootDir = rootDir;
		initGradleHome();
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

	public IJavaProject importGradleProject(IProgressMonitor monitor)
			throws IOException, CoreException, InterruptedException, NoGradleRootFolderException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		buildDotGradleFiles = scanDirectoryForSubRoots(rootDir);

		appliedPlugins = getAppliedPlugins(buildDotGradleFiles);
		androidApp = appliedPlugins.contains("com.android.application");

		for (Path root : buildDotGradleFiles) {
			scanRootForSourceFiles(root.getParent().toFile());
		}

		String name = rootDir.getName();
		int appendix = 0;
		IJavaProject project = null;
		do {
			try {
				project = EclipseProjectUtil.createJavaProject(name + (appendix == 0 ? "" : appendix), monitor);
			} catch (DuplicateProjectNameException e) {
				appendix++;
			}
		} while (project == null);

		if (androidApp) {
			javaSourceFiles.addAll(getRClasses(buildDotGradleFiles));
		}
		EclipseProjectUtil.addJavaSourceFilesToRoot(javaSourceFiles, project.getPackageFragmentRoot(project.getProject().getFolder("src")),
				LINKONPROJECT, monitor);

		// build gradle project
		try {
			if (!GradleBuild.buildGradleProject(rootDir, buildDotGradleFiles, androidApp)) {
				return null;
			}
		} catch (UnsupportedOperationSystemException e1) {
			LOGGER.log(Level.WARN, "WARNING: Build of gradle project failed, some lib imports might be missing.");
		}

		if (androidApp) {
			IPath outputLocation = project.getOutputLocation().removeFirstSegments(1);
			IFolder outputLocationFolder = project.getProject().getFolder(outputLocation);
			if (!outputLocationFolder.exists()) {
				outputLocationFolder.create(true, true, monitor);
			}
			outputLocationFolder.getFolder("apk").createLink(
					new org.eclipse.core.runtime.Path(rootDir.getAbsolutePath()), IResource.ALLOW_MISSING_LOCAL,
					monitor);
		}

		return addRequiredLibsToProject(project, monitor);
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
						jarFile.getFullPath(), ClasspathEntry.INCLUDE_ALL, // inclusion
																			// patterns
						ClasspathEntry.EXCLUDE_NONE, // exclusion patterns
						null, null, null, // specific output folder
						false, // exported
						ClasspathEntry.NO_ACCESS_RULES, false, // no access rules to
																// combine
						ClasspathEntry.NO_EXTRA_ATTRIBUTES);
				entries.add(entry);
			}
		}

		EclipseProjectUtil.addToClassPath(project, entries, monitor);

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

	private static Set<Path> getRClasses(Set<Path> buildDotGradleFiles) throws IOException {
		Set<Path> classes = new HashSet<Path>();
		for (Path buildDotGradle : buildDotGradleFiles) {
			File mainFolder = new File(buildDotGradle.getParent().toFile(), "src/main");
			if (mainFolder.exists() && mainFolder.isDirectory()) {
				File manifestFile = new File(mainFolder, "AndroidManifest.xml");
				if (manifestFile.exists()) {
					File rFile = searchRClassInAdroidMainfest(manifestFile, buildDotGradle.getParent().toFile());

					if (rFile != null) {
						if (rFile.exists()) {
							classes.add(rFile.toPath());
						} else {
							LOGGER.log(Level.WARN, "The R.java does not exist: " + rFile.getAbsolutePath());
						}
					} else {
						LOGGER.log(Level.WARN, "No R.java file found");
					}
				}
			}
		}
		return classes;
	}

	private static File searchRClassInAdroidMainfest(File manifestFile, File gradleRoot) throws IOException {
		try {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(manifestFile);
			document.getDocumentElement().normalize();
			NodeList manifest = document.getElementsByTagName("manifest");
			Node attribute = manifest.item(0).getAttributes().getNamedItem("package");
			String basePackage = attribute.getNodeValue();
			File rFolder = new File(gradleRoot, "build/generated/source/r");
			File releaseFolder;
			if (!(releaseFolder = new File(rFolder, "release")).exists()) {
				if (!(releaseFolder = new File(rFolder, "debug")).exists()) {
					LOGGER.log(Level.WARN, "No \"release\" or \"debug\" folder in \"" + rFolder + "\"");
					return null;
				}
			}
			return new File(new File(releaseFolder, basePackage.replace('.', '/')), "R.java");
		} catch (ParserConfigurationException | SAXException e) {
			LOGGER.log(Level.ERROR, e);
		}
		return null;
	}

	private Set<String> getAppliedPlugins(Set<Path> buildDotGradleFiles) {
		Set<String> appliedPlugins = new HashSet<>();
		Pattern patternAndroid = Pattern.compile("(apply\\W+plugin:\\W*')(.+)(')");
		for (Path path : buildDotGradleFiles) {
			try (BufferedReader in = new BufferedReader(new FileReader(path.toFile()))) {
				String line;
				while ((line = in.readLine()) != null) {
					Matcher androidMatcher = patternAndroid.matcher(line);
					while (androidMatcher.find()) {
						appliedPlugins.add(androidMatcher.group(2));
					}
				}
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
		File buildFile = new File(rootDir, "build.gradle");
		if (!buildFile.exists()) {
			throw new NoGradleRootFolderException();
		}

		Set<Path> buildDotGradleFiles = new HashSet<>();
		buildDotGradleFiles.add(buildFile.toPath());

		File settingsFile = new File(rootDir, "settings.gradle");
		if (settingsFile.exists()) {
			Pattern includePattern = Pattern.compile(
					"(include)(\\s*)((((('(:)?)((\\w|-|_|\\d)+)('))(\\s*,\\s+)?)+)|\\((\\w+)\\s+as\\s+((\\w|\\[|\\]|_)+)\\))");
			Pattern entryPattern = Pattern.compile("('(:)?)((\\w|-|_|\\d)+)(')");
			Pattern defPattern = Pattern.compile("def\\s+(\\w+)\\s+=\\s+\\[((.|\\n|\\r)+?)\\]");
			try (BufferedReader reader = new BufferedReader(new FileReader(settingsFile))) {
				Hashtable<String, String> defs = new Hashtable<>();

				StringBuilder contents = new StringBuilder();
				String line;
				while ((line = reader.readLine()) != null) {
					contents.append(line);
					contents.append('\n');
				}
				String string = contents.toString();

				// 1. get all variable definitions
				Matcher defMatcher = defPattern.matcher(string);
				while (defMatcher.find()) {
					defs.put(defMatcher.group(1), defMatcher.group(2));
				}

				// 2. Search for includes
				Matcher includeMatcher = includePattern.matcher(string);
				while (includeMatcher.find()) {
					String match = includeMatcher.group(3);
					if (match != null) {
						String var = includeMatcher.group(13);
						if (var != null) {
							match = defs.get(var);
						}
					}

					Matcher mEntry = entryPattern.matcher(match);
					while (mEntry.find()) {
						String subProject = mEntry.group(3);
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
							buildDotGradleFiles.addAll(scanDirectoryForSubRoots(nextRoot));
						}
					}
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
			Files.walkFileTree(srcFolder.toPath(), new SimpleFileVisitor<Path>() {

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (attrs.isRegularFile() && file.getFileName().toString().endsWith("java")) {
						javaSourceFiles.add(file);
					}
					return super.visitFile(file, attrs);
				}
			});
		}
	}

	private Set<Path> getLibs(Collection<Path> buildDotGradleFiles) throws IOException, FileNotFoundException {
		Set<String> compileLibs = new HashSet<>(), useLibs = new HashSet<String>();

		int minSdk = Integer.MAX_VALUE;
		int targetSdk = -1;

		ArrayList<String> parsedBuildFiles = new ArrayList<String>(buildDotGradleFiles.size());

		// Pattern patternDepenencies =
		// Pattern.compile("(\\s*)(dependencies)(\\s+)(\\{)");
		Pattern patternSingleDependency = Pattern.compile("(compile|useLibrary)(\\s+)('|\")(.+)('|\")");
		Pattern patternSdk = Pattern.compile("(((min)|(target))SdkVersion)(\\s+)(\\d+)");
		for (Path path : buildDotGradleFiles) {
			try (BufferedReader in = new BufferedReader(new FileReader(path.toFile()))) {

				StringBuilder contentBuilder = new StringBuilder();
				String line;
				while ((line = in.readLine()) != null) {
					contentBuilder.append(line);
					contentBuilder.append('\n');
				}

				parsedBuildFiles.add(contentBuilder.toString());
			}
		}
		for (String content : parsedBuildFiles) {
			Matcher m = patternSingleDependency.matcher(content);
			while (m.find()) {
				String dependency = m.group(4);
				int index = dependency.indexOf('$');
				if (index > 0) {
					Pattern pattern = Pattern.compile(dependency.substring(index + 1) + "\\s+=\\s+('|\")(.+)('|\")");
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
				Matcher matcherSdk = patternSdk.matcher(content);
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
				File platforms = new File(androidHome, ANDROID_SDK_PLATFORMS);
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

	private Hashtable<String, Path> searchInCache(Set<String> libs, File cacheFile) {
		Hashtable<String, Path> results = new Hashtable<>();
		HashSet<String> newLibs = new HashSet<>();
		for (String lib : libs) {
			String[] segments = lib.split(":");
			File libFile = cacheFile;
			String name;
			if (segments.length == 1) {
				name = segments[0];
			} else if (segments.length == 3) {
				name = segments[1] + '-' + segments[2];
			} else {
				throw new RuntimeException();
			}
			for (String segment : segments) {
				File tmpLibFile = new File(libFile, segment);
				if (tmpLibFile.exists()) {
					libFile = tmpLibFile;
				} else {
					libFile = new File(libFile, segment.replace('.', '/'));
				}
			}
			File libJar = null;
			if (libFile.exists()) {
				for (File child : libFile.listFiles()) {
					if (child.isDirectory()) {
						for (File potentialLib : child.listFiles()) {
							if (potentialLib.getName().equals(name + ".jar")
									|| potentialLib.getName().equals(name + ".aar")) {
								libJar = potentialLib;
								break;
							}
						}
						if (libJar != null) {
							break;
						}
					} else {
						if (child.getName().equals(name + ".jar") || child.getName().equals(name + ".aar")) {
							libJar = child;
							break;
						}
					}
				}
				if (libJar != null) {
					results.put(lib, libJar.toPath());
					File pom = new File(libJar.getParent(), name + ".pom");
					if (pom.exists()) {
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
							e.printStackTrace();
						}
					}
				}
			}
		}
		if (newLibs.size() > 0) {
			libs.addAll(newLibs);
		}
		return results;
	}
}
