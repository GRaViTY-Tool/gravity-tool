package org.gravity.hulk.annotations.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

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

public class AnnotationsUtil {

	public static IPath copyAnnotationsJar(IJavaProject project, IFolder folder, IProgressMonitor monitor) {
		if(!folder.getProject().equals(project.getProject())){
			return null;
		}
		if (!folder.exists()) {
			try {
				folder.create(true, true, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		IFile annotations_out = folder.getFile(AnnotationsActivator.ANNOTATIONS_JAR);
		if (!annotations_out.exists()) {
			InputStream in = null;
			OutputStream out = null;
			try {
				in = new URL(AnnotationsActivator.ANNOTATIONS_JAR_PLATFORM)
						.openConnection().getInputStream();
				out = new FileOutputStream(annotations_out.getLocation().toFile());
				byte[] buffer = new byte[4096];
				int read;
				while ((read = in.read(buffer)) != -1) {
					out.write(buffer, 0, read);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (out != null) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

			try {
				IClasspathEntry[] cp = project.getRawClasspath();
				IClasspathEntry[] cp_new = new IClasspathEntry[cp.length + 1];
				System.arraycopy(cp, 0, cp_new, 0, cp.length);
				cp_new[cp.length] = JavaCore.newLibraryEntry(annotations_out.getFullPath(), null, null);
				project.setRawClasspath(cp_new, monitor);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}

		return annotations_out.getFullPath();
	}
}
