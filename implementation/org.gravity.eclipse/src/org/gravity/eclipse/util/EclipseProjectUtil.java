package org.gravity.eclipse.util;

import java.io.File;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
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
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.importer.DuplicateProjectNameException;

/**
 * This class provides frequently used functionalities when working with eclipse
 * projects
 *
 * @author speldszus
 *
 */
@SuppressWarnings("restriction")
public class EclipseProjectUtil {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(EclipseProjectUtil.class);

	private EclipseProjectUtil() {
		// This class shouldn't be instantiated
	}

	/**
	 * Creates a copy of a eclipse project with the given name
	 *
	 * @param project    The project to copy
	 * @param nameOfCopy The name of the copy
	 * @return The copy
	 */
	public static IProject copyProject(IProject project, String nameOfCopy) {
		final IProject tmp = getProjectByName(nameOfCopy);
		if (tmp != null && tmp.exists()) {
			try {
				tmp.delete(true, null);
			} catch (final CoreException e) {
				LOGGER.log(Level.ERROR, e);
				return null;
			}
		}
		try {
			project.copy(new org.eclipse.core.runtime.Path(nameOfCopy), true, null); // $NON-NLS-1$
		} catch (final CoreException e) {
			LOGGER.log(Level.ERROR, e);
			return null;
		}
		return tmp;
	}

	/**
	 * Returns the eclipse project with the given name from the current workspace
	 *
	 * @param name The given name
	 * @return The eclipse project
	 */
	public static IProject getProjectByName(String name) {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(name);
	}

	/**
	 * Adds the given nature to an eclipse project if it hasn't this nature already
	 *
	 * @param project The eclipse project
	 * @param nature  The nature id to add
	 * @param monitor A progress monitor
	 * @throws CoreException @see
	 *                       org.eclipse.core.resources.IProject.setDescription(IProjectDescription
	 *                       description, IProgressMonitor monitor)
	 */
	public static void addNature(IProject project, String nature, IProgressMonitor monitor) throws CoreException {
		final IProjectDescription description = project.getDescription();
		final String[] oldNatures = description.getNatureIds();
		for (final String o : oldNatures) {
			if (o.equals(nature)) {
				return;
			}
		}
		final String[] newNatures = new String[oldNatures.length + 1];
		newNatures[0] = nature;
		System.arraycopy(oldNatures, 0, newNatures, 1, oldNatures.length);
		description.setNatureIds(newNatures);
		project.setDescription(description, monitor);
	}

	/**
	 * Creates the folder and all missing parents
	 *
	 * @param folder  The folder to create
	 * @param monitor A progress monitor
	 * @throws CoreException if the method fails @see
	 *                       org.eclipse.core.resources.IFolder.create(boolean,
	 *                       boolean, IProgressMonitor)
	 */
	public static void createFolder(IFolder folder, IProgressMonitor monitor) throws CoreException {
		final Deque<IFolder> stack = new LinkedList<>();
		IContainer parent = folder.getParent();
		while (!parent.exists() && parent.getType() == IResource.FOLDER) {
			stack.add((IFolder) parent);
			parent = parent.getParent();
		}
		while (!stack.isEmpty()) {
			stack.pop().create(true, true, monitor);
		}
		folder.create(true, true, monitor);
	}

	/**
	 * @param project The project
	 * @param monitor A progress monitor
	 * @return The gravity folder
	 * @throws IOException If the gravity folder doesn't exists and cannot be
	 *                     created
	 */
	public static IFolder getGravityFolder(IProject project, IProgressMonitor monitor) throws IOException {
		final IFolder gravityFolder = project.getFolder(GravityActivator.GRAVITY_FOLDER_NAME);
		if (!gravityFolder.exists()) {
			try {
				gravityFolder.create(true, true, monitor);
			} catch (final CoreException e) {
				throw new IOException(e);
			}
		}
		return gravityFolder;
	}

	/**
	 * Creates a class path entry for the given file
	 *
	 * @param file The file
	 * @return The class path entry
	 */
	public static ClasspathEntry createClassPathEntry(IFile file) {
		return new org.eclipse.jdt.internal.core.ClasspathEntry(IPackageFragmentRoot.K_BINARY,
				IClasspathEntry.CPE_LIBRARY, file.getLocation(), ClasspathEntry.INCLUDE_ALL, // inclusion
				// patterns
				ClasspathEntry.EXCLUDE_NONE, // exclusion patterns
				null, null, null, // specific output folder
				false, // exported
				ClasspathEntry.NO_ACCESS_RULES, false, // no access rules to combine
				ClasspathEntry.NO_EXTRA_ATTRIBUTES);
	}

	/**
	 * Adds a library to the classpath of the project
	 *
	 * @param project The Java project
	 * @param lib     The library
	 * @return The created classpath entry
	 * @throws JavaModelException if the classpath could not be set
	 */
	public static IClasspathEntry addLibToClasspath(IJavaProject project, IFile lib) throws JavaModelException {
		return addLibToClasspath(project, lib, new NullProgressMonitor());
	}

	/**
	 * Adds a library to the classpath of the project
	 *
	 * @param project The Java project
	 * @param lib     The library
	 * @param monitor A progress monitor
	 * @return The created classpath entry
	 * @throws JavaModelException if the classpath could not be set
	 */
	public static IClasspathEntry addLibToClasspath(IJavaProject project, IFile lib, IProgressMonitor monitor)
			throws JavaModelException {
		final IClasspathEntry relativeLibraryEntry = createClassPathEntry(lib);
		final IClasspathEntry[] oldEntries = project.getRawClasspath();
		final IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = relativeLibraryEntry;
		project.setRawClasspath(newEntries, monitor);
		return relativeLibraryEntry;
	}

	/**
	 * Creates a new empty project in the current workspace
	 *
	 * @param name    The desired name of the project
	 * @param monitor A progress monitor
	 * @return The new project
	 * @throws DuplicateProjectNameException If there is already a project with this
	 *                                       name
	 * @throws CoreException                 If there is an Exception in Eclipse
	 */
	public static IProject createProject(String name, IProgressMonitor monitor)
			throws DuplicateProjectNameException, CoreException {
		final IProject project = getProjectByName(name);

		if (project.exists()
				|| new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile(), name).exists()) {
			throw new DuplicateProjectNameException(
					"There is already a project with the name \"" + name + "\" in the workspace.");
		}

		project.create(monitor);
		project.open(monitor);
		return project;
	}

	/**
	 * Links a file to an eclipse IFile
	 *
	 * @param source  The source file
	 * @param target  The target file
	 * @param monitor A progress monitor
	 * @throws CoreException If the link cannot be created
	 */
	public static void createLink(File source, IFile target, IProgressMonitor monitor) throws CoreException {
		final IPath jarPath = new org.eclipse.core.runtime.Path(source.getAbsolutePath());
		target.createLink(jarPath, IResource.FILE, monitor);
	}

	/**
	 * Imports all projects present at the workspace location into the workspace
	 *
	 * @param monitor A progress monitor
	 *
	 * @return The imported Eclipse projects
	 * @throws CoreException If the import fails for a project
	 */
	public static List<IProject> importProjectsFromWorkspaceLocation(IProgressMonitor monitor) throws CoreException {
		final File src = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile();
		return importProjects(src, monitor);
	}

	/**
	 * Imports all projects present at the given location into the workspace
	 *
	 * @param rootFolder The folder containing the Eclipse projects
	 * @param monitor    A progress monitor
	 * @return The imported Eclipse projects
	 * @throws CoreException If the import fails for a project
	 */
	public static List<IProject> importProjects(File rootFolder, IProgressMonitor monitor) throws CoreException {
		final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		final List<IProject> projects = new LinkedList<>();
		for (final File projectFolder : rootFolder.listFiles()) {
			final IProject project = importProject(projectFolder, monitor);
			if (project != null) {
				projects.add(project);
			}
		}
		root.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		return projects;
	}

	/**
	 * Imports the project present at the given location into the workspace
	 *
	 * @param location The folder containing the Eclipse project
	 * @param monitor  A progress monitor
	 * @return The imported Eclipse project
	 * @throws CoreException If the import fails
	 */
	public static IProject importProject(File location, IProgressMonitor monitor) throws CoreException {
		File dotProject;
		if (".project".equals(location.getName())) {
			dotProject = location;
		} else {
			dotProject = new File(location, ".project");
		}
		if (!dotProject.exists()) {
			return null;
		}
		final IProjectDescription description = ResourcesPlugin.getWorkspace()
				.loadProjectDescription(new Path(dotProject.toString()));
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
		if (!project.exists()) {
			project.create(description, monitor);
		}
		project.open(monitor);
		return project;
	}
}
