/**
 *
 */
package org.gravity.eclipse.tests;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.internal.resources.ResourceException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;

/**
 * Useful functionalities frequently needed in tests
 *
 * @author speldszus
 *
 */
@SuppressWarnings("restriction")
public final class TestHelper {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(TestHelper.class);

	private TestHelper() {
		// This class shouldn't be instantiated
	}

	/**
	 * Prepares the projects for a parameterized test:
	 *
	 * Object[]{name:java.lang.String, project:org.eclipse.jdt.core.IJavaProject}
	 *
	 * @param importProjects The projects the test should be executed on
	 * @return The collection containing the prepared test data
	 */
	public static List<Object[]> prepareTestData(final Collection<IProject> importProjects) {
		return importProjects.parallelStream().filter(project -> {
			try {
				return project.hasNature(JavaCore.NATURE_ID);
			} catch (final CoreException e) {
				LOGGER.error(e);
				return false;
			}
		}).sorted(Comparator.comparing(IProject::getName)).map(project -> {
			final var javaProject = JavaCore.create(project);
			return new Object[] { project.getName(), javaProject };
		}).collect(Collectors.toList());
	}

	/**
	 * Generates a simple Java project with only one class
	 * (<code>dummy.Clazz</code>)
	 *
	 * @param name  The name of the project
	 * @param force If an already existing project should be overwritten
	 *
	 * @return the generated Java project
	 *
	 * @throws CoreException                 If the creation fails
	 * @throws DuplicateProjectNameException If the project already exists and
	 *                                       creation is not enforced
	 */
	public static IJavaProject generateSimpleProject(final String name, final boolean force)
			throws CoreException, DuplicateProjectNameException {
		if (force) {
			final var existing = EclipseProjectUtil.getProjectByName(name);
			if (existing != null) {
				existing.delete(true, null);
			}
		}
		final var project = JavaProjectUtil.createJavaProject(name, true, Collections.singleton("src"), null);

		final var srcDummy = project.getProject().getFolder("src").getFolder("dummy");
		srcDummy.create(true, true, null);

		final var clazzFile = srcDummy.getFile("Clazz.java");
		final var content = """
				package dummy;
				public class Clazz {
				}""";
		try (var stream = new ByteArrayInputStream(content.getBytes())) {
			clazzFile.create(stream, true, null);
		} catch (final IOException e) {
			project.getProject().delete(true, null);
			throw new ResourceException(IStatus.ERROR, clazzFile.getFullPath(), e.getMessage(), e);
		}
		return project;
	}

	/**
	 * Generates a simple Java project with only one class
	 * (<code>dummy.Clazz</code>)
	 *
	 * @param name The name of the project
	 *
	 * @return the generated Java project
	 *
	 * @throws CoreException                 If the creation fails
	 * @throws DuplicateProjectNameException If the project already exists
	 */
	public static IJavaProject generateSimpleProject(final String name)
			throws CoreException, DuplicateProjectNameException {
		return generateSimpleProject(name, false);
	}

}
