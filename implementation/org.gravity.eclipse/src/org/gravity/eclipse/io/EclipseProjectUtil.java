package org.gravity.eclipse.io;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public class EclipseProjectUtil {

	public static IJavaProject copyJavaProject(IJavaProject original_project, String copy_name) {
		IProject project = original_project.getProject();
		IProject tmp = copyProject(project, copy_name);
		IJavaProject java_project = convertToJavaProject(tmp);
		return java_project;
	}

	public static IProject copyProject(IProject original_project, String copy_name) {
		IProject tmp = getProjectByName(copy_name);
		if (tmp != null && tmp.exists()) {
			try {
				tmp.delete(true, null);
			} catch (CoreException e) {
				e.printStackTrace();
				return null;
			}
		}
		try {
			original_project.copy(new Path(copy_name), true, null); // $NON-NLS-1$
		} catch (CoreException e2) {
			e2.printStackTrace();
			return null;
		}
		return tmp;
	}

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

	public static IProject getProjectByName(String name) {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(name);
	}
}
