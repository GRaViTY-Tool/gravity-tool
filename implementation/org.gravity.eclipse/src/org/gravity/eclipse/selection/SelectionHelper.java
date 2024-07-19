package org.gravity.eclipse.selection;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.gravity.eclipse.Messages;
import org.gravity.eclipse.util.JavaProjectUtil;

/**
 * A Helper for selection java elements from eclipse
 */
public final class SelectionHelper {

	private SelectionHelper() {
		// This class shouldn't be instantiated
	}

	/**
	 * Get all IJavaProjects from a selection
	 *
	 * @param selection the selection
	 * @return the java projects
	 */
	public static Set<IJavaProject> getJavaProjects(final Iterable<Object> selection) {
		final Set<IJavaProject> projects = new HashSet<>();
		for (final Object entry : selection) {
			if (entry instanceof IJavaProject) {
				projects.add((IJavaProject) entry);
			} else if (entry instanceof final IProject project) {
				final var java = JavaProjectUtil.getJavaProject(project);
				if (java == null) {
					throw new IllegalStateException("Project " + project.getName() + " has no Java nature");
				}
				projects.add(java);
			} else if (entry instanceof IPackageFragment) {
				throw new IllegalArgumentException(Messages.unhandledPackageFagment + entry);
			} else if (entry instanceof IResource) {
				throw new IllegalArgumentException(Messages.unhandledResource + entry);
			} else {
				throw new IllegalArgumentException(Messages.unhandledObject + entry);
			}
		}

		return projects;

	}
}
