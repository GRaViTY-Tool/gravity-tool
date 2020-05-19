package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
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
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.ProjectImport;
import org.gravity.eclipse.importer.maven.PomParser;
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
public class GradleImport extends ProjectImport {

	private final GradleIncludes includes;

	private final File gradleCache;

	private boolean androidApp;

	private static final String GRADLE_CACHE = "caches" + File.separator + "modules-2" + File.separator + "files-2.1";
	private static final boolean LINKONPROJECT = false;

	public static final Logger LOGGER = Logger.getLogger(GradleImport.class);

	/**
	 * An instance of the gradle builder
	 */
	private final GradleBuild gradleBuild;
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
	 * @throws ImportException
	 */
	public GradleImport(final File rootDir, final boolean ignoreBuildErrors) throws IOException, ImportException {
		super(rootDir, "build.gradle", ignoreBuildErrors);
		this.buildSuccess = false;
		this.gradleCache = initGradleUserHome();
		this.includes = new GradleIncludes(getRootDir());
		this.gradleBuild = new GradleBuild();
	}

	/**
	 * Imports the gradle project as single eclipse project
	 *
	 * @param monitor A progress monitor
	 * @return The new eclipse java project
	 * @throws ImportException
	 */
	@Override
	public IJavaProject importProject(final IProgressMonitor monitor) throws ImportException {
		return importProject(getRootDir().getName(), monitor);
	}

	/**
	 * Imports the gradle project as single eclipse project
	 *
	 * @param name    the desired name of the project
	 * @param monitor A progress monitor
	 * @return The new eclipse java project
	 * @throws ImportException
	 */
	public IJavaProject importProject(final String name, IProgressMonitor monitor) throws ImportException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		this.androidApp = getAppliedPlugins(this.includes.getBuildDotGradleFiles()).contains("com.android.application");

		build();

		final Set<Path> javaSourceFiles = getAllJavaSourceFiles(getRootFile().toPath());
		return createJavaProject(name, javaSourceFiles, monitor);
	}

	/**
	 * Creates a new Java project containing a set of given java source files
	 *
	 * @param javaSourceFiles The Java source files
	 * @param monitor         A progress monitor
	 * @return The new Java project
	 * @throws GradleImportException If the project cannot be created
	 */
	private IJavaProject createJavaProject(final String name, final Set<Path> javaSourceFiles, final IProgressMonitor monitor)
			throws GradleImportException {
		IJavaProject project = null;
		try {
			project = JavaProjectUtil.createJavaProjectWithUniqueName(name, monitor);
			final HashMap<String, Set<Path>> sourceFolders = getSourceFolderMapping(javaSourceFiles);
			for (final Entry<String, Set<Path>> entry : sourceFolders.entrySet()) {
				final IFolder folder = project.getProject().getFolder(entry.getKey().replace("/", "-"));
				if (!folder.exists()) {
					EclipseProjectUtil.createFolder(folder, monitor);
				}
				final IPackageFragmentRoot packageFragmentRoot = project.getPackageFragmentRoot(folder);
				JavaProjectUtil.addToClassPath(project,
						Arrays.asList(JavaCore.newSourceEntry(packageFragmentRoot.getPath())), monitor);
				JavaProjectUtil.addJavaSourceFilesToRoot(entry.getValue(), packageFragmentRoot, LINKONPROJECT, monitor);
			}

			if (this.androidApp) {
				linkApkFolderToProject(project, monitor);
			}
			addRequiredLibsToProject(project, monitor).getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			return project;
		} catch (IOException | CoreException e) {
			try {
				if (project != null) {
					project.getProject().delete(true, true, monitor);
				}
			} catch (final CoreException e1) {
				LOGGER.warn(e1.getLocalizedMessage(), e1);
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
			this.buildSuccess = this.gradleBuild.buildGradleProject(getRootDir(),
					this.includes.getBuildDotGradleFiles(), this.androidApp);
			if (!this.buildSuccess && !ignoreBuildErrors()) {
				throw new GradleImportException("Building the gradle project failed and errors aren't ignored!");
			}
		} catch (final UnsupportedOperationSystemException e) {
			LOGGER.warn("WARNING: Build of gradle project failed, some lib imports might be missing.");
			if (!ignoreBuildErrors()) {
				throw new GradleImportException("Building the gradle project failed and errors aren't ignored!", e);
			}
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			throw new GradleImportException(e);
		} catch (final InterruptedException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			Thread.currentThread().interrupt();
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
	private Set<Path> getAllJavaSourceFiles(final Path buildDotGradle) throws GradleImportException {
		Set<Path> javaSourceFiles;
		try {
			javaSourceFiles = this.includes.getJavaSourceFiles(buildDotGradle);
		} catch (final IOException e) {
			throw new GradleImportException(e);
		}
		if (javaSourceFiles.isEmpty()) {
			final String message = "No Java source files found!";
			LOGGER.log(Level.ERROR, message);
			throw new GradleImportException(message);
		}
		if (this.androidApp && this.buildSuccess) {
			try {
				final Set<Path> rClasses = GradleAndroid.getRClasses(this.includes.getBuildDotGradleFiles());
				javaSourceFiles.addAll(rClasses);
			} catch (final IOException e) {
				LOGGER.warn(e.getLocalizedMessage(), e);
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
	private HashMap<String, Set<Path>> getSourceFolderMapping(final Set<Path> javaSourceFiles) {
		final HashMap<String, Set<Path>> sourceFolders = new HashMap<>();
		for (final Path sourceFile : javaSourceFiles) {
			final Path path = getRootDir().getAbsoluteFile().toPath();
			String relativize;
			try {
				relativize = path.relativize(sourceFile).toString();
			} catch (final IllegalArgumentException e) {
				relativize = sourceFile.toString().replace(new File("").getAbsolutePath(), "");
				final char charAt0 = relativize.charAt(0);
				if (charAt0 == '/' || charAt0 == '\\') {
					relativize = relativize.substring(1);
				}
			}
			final String[] split = relativize.split("/src/((main|test)/(java|scala)/)?");
			String key;
			if (split.length == 2) {
				key = split[0];
			} else {
				LOGGER.warn("Couldn't determine source folder of file, using \"src\": " + relativize);
				key = "src";
			}
			Set<Path> files;
			if (sourceFolders.containsKey(key)) {
				files = sourceFolders.get(key);
			} else {
				files = new HashSet<>();
				sourceFolders.put(key, files);
			}
			files.add(sourceFile);
		}
		return sourceFolders;
	}

	/**
	 * Resolves the GRADLE_USER_HOME directory
	 *
	 * @return A file holding the location of GRADLE_USER_HOME
	 * @throws FileNotFoundException If GRADLE_USER_HOME hasn't been found
	 */
	private File initGradleUserHome() throws FileNotFoundException {
		final String gradleHome = System.getenv("GRADL_USER_HOME");
		if (gradleHome != null) {
			final File tmpGradleHome = new File(gradleHome);
			if (tmpGradleHome.exists()) {
				return tmpGradleHome;
			}
		}
		final File tmpGradleHome = new File(new File(System.getProperty("user.home")), ".gradle");
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
	 * @throws CoreException If the project cannot be changed
	 */
	private void linkApkFolderToProject(final IJavaProject project, final IProgressMonitor monitor) throws CoreException {
		final IPath outputLocation = project.getOutputLocation().removeFirstSegments(1);
		final IFolder outputLocationFolder = project.getProject().getFolder(outputLocation);
		if (!outputLocationFolder.exists()) {
			outputLocationFolder.create(true, true, monitor);
		}
		outputLocationFolder.getFolder("apk").createLink(
				new org.eclipse.core.runtime.Path(getRootDir().getAbsolutePath()), IResource.ALLOW_MISSING_LOCAL,
				monitor);
	}

	/**
	 * Searches the libs required by the gradle project and adds them to the given
	 * eclipse project
	 *
	 * @param monitor A progress monitor
	 * @param project The project to which the libs should be added
	 * @return The eclipse project with the required libs
	 * @throws IOException
	 * @throws CoreException
	 * @throws GradleImportException
	 */
	private IJavaProject addRequiredLibsToProject(final IJavaProject project, final IProgressMonitor monitor)
			throws IOException, CoreException, GradleImportException {
		final IFolder libFolder = project.getProject().getFolder("lib");
		Stream<IClasspathEntry> entries = Stream.empty();
		final Collection<Path> requiredLibs = getLibs(this.includes.getBuildDotGradleFiles());
		for (final Path libPath : requiredLibs) {
			List<IFile> jarFiles = new LinkedList<>();
			final File file = libPath.toFile();
			final String libName = file.getName();
			if (libName.endsWith(".jar")) {
				final IFile f = libFolder.getFile(libPath.getFileName().toString());
				if (f.exists()) {
					LOGGER.warn("Lib is already existent: " + jarFiles);
					continue;
				}
				jarFiles.add(f);
				EclipseProjectUtil.createLink(file, f, monitor);
			} else if (libName.endsWith(".aar")) {
				jarFiles = GradleLibsUtil.extractAar(libPath, libFolder, monitor);
			}
			if (jarFiles.isEmpty()) {
				jarFiles = GradleLibsUtil.searchOtherVersionOfAarLib(libName, libFolder, libPath, jarFiles, monitor);
				if (jarFiles.isEmpty()) {
					LOGGER.warn("No jar found in aar file: " + libPath);
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
	 * @param buildDotGradleFiles The paths of all build.gradle files of the project
	 * @return A set of the applied plugins
	 */
	private Set<String> getAppliedPlugins(final Set<Path> buildDotGradleFiles) {
		final Set<String> appliedPlugins = new HashSet<>();
		for (final Path path : buildDotGradleFiles) {
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
	private Set<String> getAppliedPlugins(final Path path) {
		final Set<String> appliedPlugins = new HashSet<>();
		if (!path.toFile().exists() || !Files.isReadable(path)) {
			return Collections.emptySet();
		}
		try (Stream<String> lines = Files.lines(path)) {
			lines.forEach(line -> {
				final Matcher androidMatcher = GradleRegexPatterns.PLUGIN.matcher(line);
				while (androidMatcher.find()) {
					appliedPlugins.add(androidMatcher.group(2));
				}
			});
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, e);
		}
		return appliedPlugins;
	}

	private Collection<Path> getLibs(final Collection<Path> buildDotGradleFiles) throws IOException, GradleImportException {
		final GradleDependencies gradleDependencies = new GradleDependencies(
				readBuildDotGradleFiles(buildDotGradleFiles), this.androidApp);
		final Set<String> compileLibs = gradleDependencies.getCompileDependencies();

		final Map<String, Path> pathsToLibs = PomParser.searchInCache(compileLibs,
				new File(this.gradleCache, GRADLE_CACHE));
		compileLibs.removeAll(pathsToLibs.keySet());

		final Collection<Path> libsAsJar = new ArrayList<>(pathsToLibs.values());
		if (this.androidApp) {
			try {
				libsAsJar.addAll(GradleAndroid.getAndroidLibs(gradleDependencies).values());
			} catch (final GradleImportException e) {
				if (ignoreBuildErrors()) {
					LOGGER.warn(e.getLocalizedMessage(), e);
				} else {
					throw e;
				}
			}

		}
		if (!compileLibs.isEmpty()) {
			LOGGER.warn("The following libs haven't been found on the system:");
			for (final String lib : compileLibs) {
				LOGGER.warn("\t" + lib);
			}
		}
		return libsAsJar;
	}

	/**
	 * Reads all build.gradle files and returns their contents
	 *
	 * @param buildDotGradleFiles The build.gradle files
	 * @return The files contents
	 * @throws GradleImportException
	 */
	private List<String> readBuildDotGradleFiles(final Collection<Path> buildDotGradleFiles) throws GradleImportException {
		final ExecutorService pool = Executors.newCachedThreadPool();
		final Collection<Callable<String>> tasks = buildDotGradleFiles.parallelStream()
				.map(path -> (Callable<String>) () -> FileUtils.getContentsAsString(path.toFile()))
				.collect(Collectors.toList());
		List<Future<String>> futures;
		try {
			futures = pool.invokeAll(tasks);
			pool.shutdown();
			final int duration = 10;
			final TimeUnit unit = TimeUnit.MINUTES;
			if (!pool.awaitTermination(duration, unit)) {
				throw new GradleImportException("Parsing " + buildDotGradleFiles.size()
				+ " build.gradle files timed out after " + duration + " " + unit.toString());
			}

			final List<String> results = new ArrayList<>(buildDotGradleFiles.size());
			for (final Future<String> f : futures) {
				results.add(f.get());
			}
			return results;
		} catch (final InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new GradleImportException(e);
		} catch (final ExecutionException e) {
			throw new GradleImportException(e);
		}
	}
}
