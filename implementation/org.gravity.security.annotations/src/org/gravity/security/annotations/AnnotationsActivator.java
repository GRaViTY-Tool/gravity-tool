package org.gravity.security.annotations;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.eclipse.util.EclipseProjectUtil;


/**
 * The Activator of the org.gravity.security.annotations plugin
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
	public static void storeAnnotationsToFile(IFile file, IProgressMonitor monitor) throws IOException {
		try (InputStream annotations = new URL(
				"platform:/plugin/org.gravity.security.annotations/org.gravity.annotations.jar") //$NON-NLS-1$
						.openConnection().getInputStream()) {
			file.create(annotations, true, monitor);
		} catch (CoreException e) {
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
	 * @throws MalformedURLException
	 * @throws JavaModelException
	 */
	public static Collection<IPath> applyUMLsecLib(IJavaProject project, IProgressMonitor monitor)
			throws CoreException, IOException, MalformedURLException, JavaModelException {
		Collection<IPath> libs;
		monitor.setTaskName("Prepare Java Project");
	
		IClasspathEntry relativeLibraryEntry = null;
		IFile annotationsFile = EclipseProjectUtil.getGravityFolder(project.getProject(), monitor)
				.getFile("org.gravity.annotations.jar");
		if (!annotationsFile.exists()) {
			storeAnnotationsToFile(annotationsFile, monitor);
			relativeLibraryEntry = EclipseProjectUtil.addLibToClasspath(project, annotationsFile);
	
		} else {
			for (IClasspathEntry entry : project.getRawClasspath()) {
				if (entry.getPath().makeAbsolute().equals(annotationsFile.getLocation())) {
					relativeLibraryEntry = entry;
				}
			}
			if (relativeLibraryEntry == null) {
				relativeLibraryEntry = EclipseProjectUtil.addLibToClasspath(project, annotationsFile);
			}
		}
		libs = Arrays.asList(relativeLibraryEntry.getPath());
		return libs;
	}

}
