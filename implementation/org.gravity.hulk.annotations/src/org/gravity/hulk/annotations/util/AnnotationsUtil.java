package org.gravity.hulk.annotations.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.hulk.annotations.activator.AnnotationsActivator;

/**
 * This class contains the functionality for adding the annotations binary to a
 * Java project
 * 
 * @author speldszus
 *
 */
public class AnnotationsUtil {

	private static final Logger LOGGER = Logger.getLogger(AnnotationsUtil.class);

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
			} catch (CoreException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}
		IFile annotationsOut = folder.getFile(AnnotationsActivator.ANNOTATIONS_JAR);
		if (!annotationsOut.exists()) {
			InputStream in = null;
			OutputStream out = null;
			try {
				in = new URL(AnnotationsActivator.ANNOTATIONS_JAR_PLATFORM).openConnection().getInputStream();
				out = new FileOutputStream(annotationsOut.getLocation().toFile());
				byte[] buffer = new byte[4096];
				int read;
				while ((read = in.read(buffer)) != -1) {
					out.write(buffer, 0, read);
				}
			} catch (IOException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
					}
				}
				if (out != null) {
					try {
						out.close();
					} catch (IOException e) {
						LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
					}
				}
			}

			try {
				IClasspathEntry[] cpOld = project.getRawClasspath();
				IClasspathEntry[] cpNew = new IClasspathEntry[cpOld.length + 1];
				System.arraycopy(cpOld, 0, cpNew, 0, cpOld.length);
				cpNew[cpOld.length] = JavaCore.newLibraryEntry(annotationsOut.getFullPath(), null, null);
				project.setRawClasspath(cpNew, monitor);
			} catch (JavaModelException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}

		return annotationsOut.getFullPath();
	}
}
