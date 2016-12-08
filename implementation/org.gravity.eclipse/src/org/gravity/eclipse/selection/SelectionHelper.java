package org.gravity.eclipse.selection;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.gravity.eclipse.Messages;

/**
 * A Helper for selection java elements from eclipse
 */
public class SelectionHelper {

	/**
	 * Get all IJavaProjects from a selection
	 *
	 * @param selection
	 *            the selection
	 * @return the java projects
	 */
	public static Set<IJavaProject> getJavaProjects(Iterable<Object> selection) {
		Set<IJavaProject> projects = new HashSet<>();
		for (Object entry : selection) {
			if (entry instanceof IResource) {
				throw new RuntimeException(Messages.JavaParseHandler_0 + entry);
			} else if (entry instanceof IJavaProject) {
				projects.add((IJavaProject) entry);
			} else if (entry instanceof IPackageFragment) {
				throw new RuntimeException(Messages.JavaParseHandler_1 + entry);
			} else {
				throw new RuntimeException(Messages.JavaParseHandler_2 + entry);
			}
		}

		return projects;

	}
}
