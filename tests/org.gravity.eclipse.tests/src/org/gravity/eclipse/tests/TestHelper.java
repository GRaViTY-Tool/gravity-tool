/**
 *
 */
package org.gravity.eclipse.tests;

import java.util.Collection;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * Useful functionalities frequently needed in tests
 *
 * @author speldszus
 *
 */
public final class TestHelper {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(TestHelper.class);

	private TestHelper() {
		// This class shouldn't be instantiated
	}

	/**
	 * Prepares the projects for a parameterized test
	 *
	 * @param importProjects The projects the test should be executed on
	 * @return The collection containing the prepared test data
	 */
	public static Collection<Object[]> prepareTestData(Collection<IProject> importProjects) {
		return importProjects.parallelStream().filter(project -> {
			try {
				return project.hasNature(JavaCore.NATURE_ID);
			} catch (final CoreException e) {
				LOGGER.error(e);
				return false;
			}
		}).map(project -> {

			final IJavaProject javaProject = JavaCore.create(project);
			return new Object[] { project.getName(), javaProject };
		}).collect(Collectors.toList());
	}

}
