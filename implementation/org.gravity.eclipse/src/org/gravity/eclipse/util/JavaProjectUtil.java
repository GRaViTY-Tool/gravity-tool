package org.gravity.eclipse.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.gravity.eclipse.importer.DuplicateProjectNameException;

/**
 * This class provides frequently used functionalities when working with eclipse
 * java projects
 * 
 * @author speldszus
 *
 */
public class JavaProjectUtil extends EclipseProjectUtil {
	
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
		IProject tmp = copyProject(project.getProject(), nameOfCopy);
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
				IJavaProject java_project = JavaCore.create(project);
				return java_project;
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Creates a new empty java project in the current workspace
	 * 
	 * @param name The desired name of the project
	 * @param monitor A progress monitor
	 * @return The new java project
	 * @throws DuplicateProjectNameException If there is already a project with this name
	 * @throws CoreException
	 * @throws IOException
	 */
	public static IJavaProject createJavaProject(String name, IProgressMonitor monitor)
			throws DuplicateProjectNameException, CoreException, IOException {
		// Create new project with given name
		IProject project = getProjectByName(name);

		if (project.exists() || new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile(), name).exists()) {
			throw new DuplicateProjectNameException(
					"There is already a project with the name \"" + name + "\" in the workspace.");
		}

		project.create(monitor);
		project.open(monitor);

		// Add Java-Nature
		addNature(project, JavaCore.NATURE_ID, monitor);

		IJavaProject javaProject = JavaCore.create(project);

		// Add lib folder
		IFolder libFolder = project.getProject().getFolder("lib");
		if (libFolder.exists()) {
			libFolder.delete(true, monitor);
		}
		libFolder.create(true, true, monitor);

		List<IClasspathEntry> entries = new ArrayList<>();

		// Create src folder
		IFolder sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, monitor);
		IPackageFragmentRoot packageFragmentRoot = javaProject.getPackageFragmentRoot(sourceFolder);
		entries.add(JavaCore.newSourceEntry(packageFragmentRoot.getPath()));

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
		Hashtable<String, List<Path>> packages = getPackagesOfJavaFiles(javaSourceFiles);

		for (Entry<String, List<Path>> entry : packages.entrySet()) {
			String packageName = entry.getKey();
			IPackageFragment pack = root.createPackageFragment(packageName, false, monitor);
			for (Path javaFile : entry.getValue()) {
				String fileName = javaFile.getFileName().toFile().getName();
				fileName.substring(0, fileName.length() - ".java".length());
				IPath location = new org.eclipse.core.runtime.Path(javaFile.toFile().getAbsolutePath());
				IFile iFile = ((IFolder) pack.getResource()).getFile(fileName);
				if (iFile.exists()) {
					if (iFile.getLocation().toFile().getAbsolutePath().equals(location.toFile().getAbsolutePath())) {
						continue;
					} else {
						
						throw new IOException("Duplicate: \n\t" + iFile.getLocation().toString() + "\n\t" + location.toString());
					}
				}
				if (link) {
					iFile.createLink(location, IResource.NONE, monitor);
				} else {
					Files.createSymbolicLink(iFile.getLocation().toFile().toPath(), location.toFile().toPath());
				}

			}
		}
	}

	private static Hashtable<String, List<Path>> getPackagesOfJavaFiles(Collection<Path> javaSourceFiles)
			throws IOException, FileNotFoundException {
		Hashtable<String, List<Path>> packages = new Hashtable<>();

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
	 * @throws IOException
	 */
	public static IJavaProject createJavaProjectWithUniqueName(String name, IProgressMonitor monitor) throws CoreException, IOException {
		int appendix = 0;
		IJavaProject project = null;
		do {
			try {
				project = createJavaProject(name + (appendix == 0 ? "" : appendix), monitor);
			} catch (DuplicateProjectNameException e) {
				appendix++;
			}
		} while (project == null);
		return project;
	}
}
