package org.gravity.eclipse.util;

import java.io.BufferedReader;
import java.io.FileReader;
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
import java.util.Set;
import java.util.regex.Matcher;
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
import org.eclipse.jdt.launching.IVMInstall;
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
public class JavaProjectUtil {
	
	private static final Logger LOGGER = Logger.getLogger(JavaProjectUtil.class);
	
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
	public static void addToClassPath(IJavaProject project, List<IClasspathEntry> entries, IProgressMonitor monitor)
			throws JavaModelException {
		IClasspathEntry[] oldEntries = project.getRawClasspath();
		int i = oldEntries.length;
		IClasspathEntry[] newEntries = new IClasspathEntry[entries.size() + i];
		System.arraycopy(oldEntries, 0, newEntries, 0, i);
		for (IClasspathEntry entry : entries) {
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
	public static IJavaProject copyJavaProject(IJavaProject project, String nameOfCopy) {
		IProject tmp = EclipseProjectUtil.copyProject(project.getProject(), nameOfCopy);
		return convertToJavaProject(tmp);
	}

	/**
	 * Converts a eclipse project to a java project if the java nature has already
	 * been applied
	 * 
	 * @param project The eclipse project
	 * @return a java project or null if the conversion failed
	 */
	public static IJavaProject convertToJavaProject(IProject project) {
		try {
			if (project.hasNature(JavaCore.NATURE_ID)) {
				return JavaCore.create(project);
			}
		} catch (CoreException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}
		return null;
	}

	/**
	 * Creates a new empty java project in the current workspace
	 * 
	 * @param name The desired name of the project
	 * @param sourceFolderNames The names of the source folders
	 * @param monitor A progress monitor
	 * @return The new java project
	 * @throws DuplicateProjectNameException If there is already a project with this name
	 * @throws CoreException If the creation fails
	 */
	public static IJavaProject createJavaProject(String name, Set<String> sourceFolderNames, IProgressMonitor monitor)
			throws DuplicateProjectNameException, CoreException {
		// Create new project with given name
		IProject project = EclipseProjectUtil.createProject(name, monitor);

		// Add Java-Nature
		EclipseProjectUtil.addNature(project, JavaCore.NATURE_ID, monitor);

		IJavaProject javaProject = JavaCore.create(project);

		// Add lib folder
		IFolder libFolder = project.getProject().getFolder("lib");
		if (libFolder.exists()) {
			libFolder.delete(true, monitor);
		}
		libFolder.create(true, true, monitor);

		List<IClasspathEntry> entries = new ArrayList<>();

		// Create src folder
		for(String sourceFolderName : sourceFolderNames) {
			IFolder sourceFolder = project.getFolder(sourceFolderName);
			sourceFolder.create(false, true, monitor);
			IPackageFragmentRoot packageFragmentRoot = javaProject.getPackageFragmentRoot(sourceFolder);
			entries.add(JavaCore.newSourceEntry(packageFragmentRoot.getPath()));
		}
		
		// Add Java libs
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), monitor);

		return javaProject;
	}

	/**
	 * Adds the set of Java source files to the given package fragment root
	 * 
	 * @param javaSourceFiles The java source files
	 * @param root The package fragment root
	 * @param link If the files should be linked or copied to the root
	 * @param monitor A progress monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	public static void addJavaSourceFilesToRoot(Collection<Path> javaSourceFiles, IPackageFragmentRoot root,
			boolean link, IProgressMonitor monitor) throws CoreException, IOException {
		Map<String, List<Path>> packages = getPackagesOfJavaFiles(javaSourceFiles);

		for (Entry<String, List<Path>> entry : packages.entrySet()) {
			IPackageFragment packeFragment = root.createPackageFragment(entry.getKey(), false, monitor);
			addJavaClassesToPackageFragment(packeFragment, entry.getValue(), link, monitor);
		}
	}

	/**
	 * Adds the given java classes to the given package fragment
	 * 
	 * @param packeFragment The package fragment
	 * @param javaClasses The java classes
	 * @param link  true, iff the file should be linked on the project, false if on the file system 
	 * @param monitor A progress monitor
	 * @throws IOException If a file cannot be found or is a duplicate
	 * @throws CoreException If a class file cannot be linked on the project
	 */
	public static void addJavaClassesToPackageFragment(IPackageFragment packeFragment, List<Path> javaClasses,
			boolean link, IProgressMonitor monitor) throws IOException, CoreException {
		for (Path javaFile : javaClasses) {
			String fileName = javaFile.getFileName().toFile().getName();
			IPath location = new org.eclipse.core.runtime.Path(javaFile.toFile().getAbsolutePath());
			IFile iFile = ((IFolder) packeFragment.getResource()).getFile(fileName);
			if (iFile.getLocation().toFile().exists()) {
				if (iFile.getLocation().toFile().getAbsolutePath().equals(location.toFile().getAbsolutePath())) {
					continue;
				} else if(FileUtils.getContentsAsString(iFile.getLocation().toFile()).equals(FileUtils.getContentsAsString(location.toFile()))){
					LOGGER.log(Level.WARN, "Duplicate with identical content: "+location.toString());
					continue;
				} else {
					throw new IOException("Duplicate: \n\t" + iFile.getLocation().toFile().toPath().toRealPath().toString() + "\n\t" + location.toString());
				}
			}
			if (link) {
				iFile.createLink(location, IResource.NONE, monitor);
			} else {
				Files.createSymbolicLink(iFile.getLocation().toFile().toPath(), location.toFile().toPath());
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
	public static Map<String, List<Path>> getPackagesOfJavaFiles(Collection<Path> javaSourceFiles)
			throws IOException {
		HashMap<String, List<Path>> packages = new HashMap<>();

		Pattern packagePattern = Pattern.compile("((package)\\s+)((\\w|(\\.\\s*))+)((\\s*);)");

		for (Path path : javaSourceFiles) {
			try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
				String line;
				String packageName = null;
				while ((line = reader.readLine()) != null && packageName == null) {
					Matcher m = packagePattern.matcher(line);
					if (m.find()) {
						packageName = m.group(3);
						List<Path> files;
						if (packages.containsKey(packageName)) {
							files = packages.get(packageName);
						} else {
							files = new LinkedList<Path>();
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
	 * unused name by appending a number
	 *  to the desired name
	 *  
	 * @param name The desired name of the project
	 * @param monitor A progress monitor
	 * @return A new java project
	 * @throws CoreException
	 */
	public static IJavaProject createJavaProjectWithUniqueName(String name, IProgressMonitor monitor) throws CoreException {
		int appendix = 0;
		IJavaProject project = null;
		do {
			String uniqueName;
			if(appendix != 0) {
				uniqueName = name.concat(Integer.toString(appendix));
			}
			else {
				uniqueName = name;
			}
			try {
				project = createJavaProject(uniqueName, Collections.emptySet(), monitor);
			} catch (DuplicateProjectNameException e) {
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
	public static Stream<IClasspathEntry> getClasspathEntries(List<IFile> binaries) {
		return binaries.parallelStream()
				.map(b -> new ClasspathEntry(IPackageFragmentRoot.K_BINARY, IClasspathEntry.CPE_LIBRARY,
						b.getFullPath(), ClasspathEntry.INCLUDE_ALL, // inclusion patterns
						ClasspathEntry.EXCLUDE_NONE, // exclusion patterns
						null, null, null, // specific output folder
						false, // exported
						ClasspathEntry.NO_ACCESS_RULES, false, // no access rules to combine
						ClasspathEntry.NO_EXTRA_ATTRIBUTES));
	
	}
}
