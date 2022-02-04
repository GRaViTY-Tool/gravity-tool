package org.gravity.eclipse.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.io.FileUtils;

/**
 * This class provides frequently used functionalities when working with eclipse
 * java projects
 *
 * @author speldszus
 *
 */
@SuppressWarnings("restriction")
public final class JavaProjectUtil {

	private static final Logger LOGGER = Logger.getLogger(JavaProjectUtil.class);
	private static final Pattern packagePattern = Pattern.compile("package\\s+(\\w+(\\s*?\\.\\s*?\\w+)*+)\\s*;");

	private JavaProjectUtil() {
		// This class shouldn't be instantiated
	}

	/**
	 *
	 * Adds the given class path entries to the classpath of the eclipse java
	 * project
	 *
	 * @param project the java project
	 * @param entries the class path entries
	 * @param monitor a progress monitor
	 * @throws JavaModelException
	 */
	public static void addToClassPath(final IJavaProject project, final List<IClasspathEntry> entries,
			final IProgressMonitor monitor) throws JavaModelException {
		final var oldEntries = project.getRawClasspath();
		var i = oldEntries.length;
		final var newEntries = new IClasspathEntry[entries.size() + i];
		System.arraycopy(oldEntries, 0, newEntries, 0, i);
		for (final IClasspathEntry entry : entries) {
			newEntries[i++] = entry;
		}

		project.setRawClasspath(newEntries, monitor);
	}

	/**
	 * Creates a copy of a eclipse java project with the given name
	 *
	 * @param project    The java project to copy
	 * @param nameOfCopy The name of the copy
	 * @return The copy
	 */
	public static IJavaProject copyJavaProject(final IJavaProject project, final String nameOfCopy) {
		final var tmp = EclipseProjectUtil.copyProject(project.getProject(), nameOfCopy);
		return getJavaProject(tmp);
	}

	/**
	 * Converts a eclipse project to a java project if the java nature has already
	 * been applied
	 *
	 * @param project The eclipse project
	 * @return a java project or null if the conversion failed
	 */
	public static IJavaProject getJavaProject(final IProject project) {
		try {
			if (project.hasNature(JavaCore.NATURE_ID)) {
				return JavaCore.create(project);
			}
		} catch (final CoreException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}
		return null;
	}

	/**
	 * Creates a new empty java project in the current workspace
	 *
	 * @param name              The desired name of the project
	 * @param sourceFolderNames The names of the source folders
	 * @param monitor           A progress monitor
	 * @return The new java project
	 * @throws DuplicateProjectNameException If there is already a project with this
	 *                                       name
	 * @throws CoreException                 If the creation fails
	 */
	public static IJavaProject createJavaProject(final String name, final Collection<String> sourceFolderNames,
			final IProgressMonitor monitor) throws DuplicateProjectNameException, CoreException {
		// Create new project with given name
		final var project = EclipseProjectUtil.createProject(name, monitor);

		return convertToJavaProject(sourceFolderNames, project, monitor);
	}

	/**
	 * Converts the project into a Java project
	 *
	 * @param project           The project to be converted
	 * @param sourceFolderNames The names of the source folders
	 * @param monitor           A progress monitor
	 * @return The java project
	 * @throws CoreException If the conversion fails
	 */
	public static IJavaProject convertToJavaProject(final Collection<String> sourceFolderNames, final IProject project,
			final IProgressMonitor monitor) throws CoreException {
		// Add Java-Nature
		if (project.hasNature(JavaCore.NATURE_ID)) {
			return JavaCore.create(project);
		}
		EclipseProjectUtil.addNature(project, JavaCore.NATURE_ID, monitor);

		final var javaProject = JavaCore.create(project);

		// Add lib folder
		final var libFolder = project.getProject().getFolder("lib");
		if (libFolder.exists()) {
			libFolder.delete(true, monitor);
		}
		libFolder.create(true, true, monitor);

		final List<IClasspathEntry> entries = new ArrayList<>();

		// Create src folder
		for (final String sourceFolderName : sourceFolderNames) {
			final var sourceFolder = project.getFolder(sourceFolderName);
			sourceFolder.create(false, true, monitor);
			final var packageFragmentRoot = javaProject.getPackageFragmentRoot(sourceFolder);
			entries.add(JavaCore.newSourceEntry(packageFragmentRoot.getPath()));
		}

		// Add Java libs
		final var vmInstall = JavaRuntime.getDefaultVMInstall();
		final var locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (final LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[0]), monitor);

		return javaProject;
	}

	/**
	 * Adds the set of Java source files to the given package fragment root
	 *
	 * @param javaSourceFiles The java source files
	 * @param root            The package fragment root
	 * @param link            If the files should be linked or copied to the root
	 * @param monitor         A progress monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	public static void addJavaSourceFilesToRoot(final Collection<Path> javaSourceFiles, final IPackageFragmentRoot root,
			final boolean link, final IProgressMonitor monitor) throws CoreException, IOException {
		final var packages = getPackagesOfJavaFiles(javaSourceFiles);

		for (final Entry<String, List<Path>> entry : packages.entrySet()) {
			final var packeFragment = root.createPackageFragment(entry.getKey(), false, monitor);
			addJavaClassesToPackageFragment(packeFragment, entry.getValue(), link, monitor);
		}
	}

	/**
	 * Adds the given java classes to the given package fragment
	 *
	 * @param packeFragment The package fragment
	 * @param javaClasses   The java classes
	 * @param link          true, iff the file should be linked on the project,
	 *                      false if on the file system
	 * @param monitor       A progress monitor
	 * @throws IOException   If a file cannot be found or is a duplicate
	 * @throws CoreException If a class file cannot be linked on the project
	 */
	public static void addJavaClassesToPackageFragment(final IPackageFragment packeFragment,
			final List<Path> javaClasses, final boolean link, final IProgressMonitor monitor)
					throws IOException, CoreException {
		for (final Path javaFile : javaClasses) {
			final var fileName = javaFile.getFileName().toFile().getName();
			final IPath location = new org.eclipse.core.runtime.Path(javaFile.toFile().getAbsolutePath());
			final var iFile = ((IFolder) packeFragment.getResource()).getFile(fileName);
			if (iFile.getLocation().toFile().exists()) {
				checkAlreadyExistingClass(location, iFile);
			} else if (link) {
				iFile.createLink(location, IResource.NONE, monitor);
			} else {
				Files.createSymbolicLink(iFile.getLocation().toFile().toPath(), location.toFile().toPath());
			}
		}
	}

	/**
	 * Checks whether two classes with the same namespace and name can be ignored or not
	 *
	 * @param additional The class that should be added to the projecz
	 * @param existing The class already contained in the project
	 * @throws IOException If the overlap cannot be ignored
	 */
	private static void checkAlreadyExistingClass(final IPath additional, final IFile existing) throws IOException {
		final var sameFile = existing.getLocation().toFile().getAbsolutePath()
				.equals(additional.toFile().getAbsolutePath());
		if (!sameFile) {
			// It is not the same file that should be added to the project, again
			final var sameContent = FileUtils.getContentsAsString(existing.getLocation().toFile())
					.equals(FileUtils.getContentsAsString(additional.toFile()));
			if (sameContent) {
				// The two classes have the same content and adding only one is ok
				LOGGER.warn("Duplicate with identical content: " + additional.toString());
			} else {
				throw new IOException(
						"Duplicate: \n\t" + existing.getLocation().toFile().toPath().toRealPath().toString()
						+ "\n\t" + additional.toString());
			}
		}
	}

	/**
	 * Searches the packages of the given java source files
	 *
	 * @param javaSourceFiles A collection of java source files
	 * @return A mapping from packages to java source files
	 * @throws IOException If a source file cannot be read
	 */
	public static Map<String, List<Path>> getPackagesOfJavaFiles(final Collection<Path> javaSourceFiles)
			throws IOException {
		final var packages = new HashMap<String, List<Path>>();

		for (final Path path : javaSourceFiles) {
			try (var reader = Files.newBufferedReader(path)) {
				String line;
				String packageName = null;
				while (((line = reader.readLine()) != null) && (packageName == null)) {
					final var m = packagePattern.matcher(line);
					if (m.find()) {
						packageName = m.group(1).replace(" ", "");
						List<Path> files;
						if (packages.containsKey(packageName)) {
							files = packages.get(packageName);
						} else {
							files = new LinkedList<>();
							packages.put(packageName, files);
						}
						files.add(path);
					}
				}
			}
		}
		return packages;
	}

	/**
	 * Creates and initializes a new java project for the gradle project with a new
	 * unused name by appending a number to the desired name
	 *
	 * @param name    The desired name of the project
	 * @param monitor A progress monitor
	 * @return A new java project
	 * @throws CoreException
	 */
	public static IJavaProject createJavaProjectWithUniqueName(final String name, final IProgressMonitor monitor)
			throws CoreException {
		var appendix = 0;
		IJavaProject project = null;
		do {
			String uniqueName;
			if (appendix != 0) {
				uniqueName = name.concat(Integer.toString(appendix));
			} else {
				uniqueName = name;
			}
			try {
				project = createJavaProject(uniqueName, Collections.emptySet(), monitor);
			} catch (final DuplicateProjectNameException e) {
				appendix++;
			}
		} while (project == null);
		return project;
	}

	/**
	 * Creates class path entries for the given binary files
	 *
	 * @param binaries The files
	 * @return A stream containing the classpath entries
	 */
	public static Stream<IClasspathEntry> getClasspathEntries(final List<IFile> binaries) {
		return getClasspathEntries(binaries.parallelStream());

	}

	/**
	 * Creates class path entries for the given binary files
	 *
	 * @param binaries The files
	 * @return A stream containing the classpath entries
	 */
	public static Stream<IClasspathEntry> getClasspathEntries(final Stream<IFile> binaries) {
		return binaries.map(b -> new ClasspathEntry(IPackageFragmentRoot.K_BINARY, IClasspathEntry.CPE_LIBRARY,
				b.getFullPath(), ClasspathEntry.INCLUDE_ALL, // inclusion patterns
				ClasspathEntry.EXCLUDE_NONE, // exclusion patterns
				null, null, null, // specific output folder
				false, // exported
				ClasspathEntry.NO_ACCESS_RULES, false, // no access rules to combine
				ClasspathEntry.NO_EXTRA_ATTRIBUTES));
	}

	public static IJavaProject importSourceFolderAsProject(final File sourceFolder, final String name,
			final IProgressMonitor monitor) throws DuplicateProjectNameException, CoreException {
		final var sourceFolderName = sourceFolder.getName();
		final var old = EclipseProjectUtil.getProjectByName(name);
		if (old.exists()) {
			old.delete(true, true, monitor);
		}
		final var project = createJavaProject(name, Collections.singleton(sourceFolderName), monitor);
		final var folder = project.getProject().getFolder(sourceFolderName);
		folder.delete(true, monitor);
		folder.createLink(sourceFolder.toURI(), IResource.DEPTH_INFINITE, monitor);
		return project;
	}
}
