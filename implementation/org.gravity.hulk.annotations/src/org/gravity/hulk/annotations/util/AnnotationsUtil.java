package org.gravity.hulk.annotations.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.hulk.annotations.activator.AnnotationsActivator;

/**
 * This class contains the functionality for adding the annotations binary to a
 * Java project
 *
 * @author speldszus
 *
 */
public class AnnotationsUtil {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(AnnotationsUtil.class);

	private AnnotationsUtil() {
		// This class shouldn't be instantiated
	}

	/**
	 * Copies the library containing the annotation binaries into the Java project
	 * and adds it to the build path
	 *
	 * @param project The Java project
	 * @param folder  The folder within the project, where the binary should be
	 *                stored
	 * @param monitor A progress monitor
	 * @return The copied file
	 */
	public static IPath copyAnnotationsJar(IJavaProject project, IFolder folder, IProgressMonitor monitor) {
		if (!folder.getProject().equals(project.getProject())) {
			return null;
		}
		if (!folder.exists()) {
			try {
				folder.create(true, true, monitor);
			} catch (final CoreException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}
		final IFile annotationsOut = folder.getFile(AnnotationsActivator.ANNOTATIONS_JAR);
		if (!annotationsOut.exists()) {
			try (InputStream in = new URL(AnnotationsActivator.ANNOTATIONS_JAR_PLATFORM).openConnection()
					.getInputStream();
					OutputStream out = Files.newOutputStream(annotationsOut.getLocation().toFile().toPath())) {
				final byte[] buffer = new byte[4096];
				int read;
				while ((read = in.read(buffer)) != -1) {
					out.write(buffer, 0, read);
				}
			} catch (final IOException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
			try {
				EclipseProjectUtil.addLibToClasspath(project, annotationsOut, monitor);
			} catch (final JavaModelException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}

		return annotationsOut.getFullPath();
	}
}
