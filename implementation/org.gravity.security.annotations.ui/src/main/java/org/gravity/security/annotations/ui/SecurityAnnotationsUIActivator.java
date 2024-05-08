package org.gravity.security.annotations.ui;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SecurityAnnotationsUIActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.gravity.security.annotations.ui"; //$NON-NLS-1$

	// The shared instance
	private static SecurityAnnotationsUIActivator plugin;
	
	/**
	 * The constructor
	 */
	public SecurityAnnotationsUIActivator() {
		// Nothing to initialize
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SecurityAnnotationsUIActivator getDefault() {
		return plugin;
	}

	/**
	 * The name of the security annotations file
	 */
	private static final String ANNOTATIONS_JAR = "org.gravity.security.annotations.jar";

	/**
	 * Stores the GRaViTY UMLsec security annotations to a file
	 *
	 * @param file    The file
	 * @param monitor A progress monitor
	 * @throws IOException If the annotations can not be saved
	 */
	public static void storeAnnotationsToFile(final IFile file, final IProgressMonitor monitor) throws IOException {
		try (var annotations = new URL("platform:/plugin/" + PLUGIN_ID + "/target/dependency/" + ANNOTATIONS_JAR)
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
				.getFile(ANNOTATIONS_JAR);
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
				} else {
					path = project.getProject().getFile(path).getLocation();
				}
				if (path.equals(annotationsFile.getLocation())) {
					return entry.getPath().makeRelativeTo(project.getPath());
				}
			}
		}
		return EclipseProjectUtil.addLibToClasspath(project, annotationsFile).getPath();
	}

}
