package org.gravity.security.annotations;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.util.EclipseProjectUtil;

/**
 * The Activator of the org.gravity.security.annotations plugin
 *
 * @author speldszus
 *
 */
public class AnnotationsActivator extends Plugin {

	/**
	 * The id of this plugin
	 */
	public static final String PLUGIN_ID = "org.gravity.security.annotations";

	/**
	 * Stores the GRaViTY UMLsec security annotations to a file
	 *
	 * @param file    The file
	 * @param monitor A progress monitor
	 * @throws IOException If the annotations can not be saved
	 */
	public static void storeAnnotationsToFile(final IFile file, final IProgressMonitor monitor) throws IOException {
		try (var annotations = new URL(
				"platform:/plugin/org.gravity.security.annotations/org.gravity.annotations.jar") //$NON-NLS-1$
				.openConnection().getInputStream()) {
			file.create(annotations, true, monitor);
		} catch (final CoreException e) {
			throw new IOException(e);
		}
	}

	/**
	 * Adds the UMLsec Java-Annotations library to the project
	 *
	 * @param project The Java project
	 * @param monitor A progress monitor
	 * @return The libs of the project
	 * @throws CoreException
	 * @throws IOException
	 */
	public static IPath applyUMLsecLib(final IJavaProject project, final IProgressMonitor monitor)
			throws CoreException, IOException {
		monitor.setTaskName("Prepare Java Project");

		final var annotationsFile = EclipseProjectUtil.getGravityFolder(project.getProject(), monitor)
				.getFile("org.gravity.annotations.jar");
		if (!annotationsFile.exists()) {
			storeAnnotationsToFile(annotationsFile, monitor);
			return EclipseProjectUtil.addLibToClasspath(project, annotationsFile).getPath();
		}

		// If the file exists already, check if it is on the classpath
		final var ws = project.getProject().getWorkspace().getRoot();
		for (final IClasspathEntry entry : project.getRawClasspath()) {
			if (entry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
				var path = entry.getPath();
				if (path.isAbsolute()) {
					final var containingProject = ws.getProject(path.segment(0));
					if (containingProject.getLocation() != null) {
						path = containingProject.getLocation().append(path.removeFirstSegments(1));
					}
				}
				else {
					path = project.getProject().getFile(path).getLocation();
				}
				if (path.equals(annotationsFile.getLocation())) {
					return entry.getPath();
				}
			}
		}
		return EclipseProjectUtil.addLibToClasspath(project, annotationsFile).getPath();
	}
}
