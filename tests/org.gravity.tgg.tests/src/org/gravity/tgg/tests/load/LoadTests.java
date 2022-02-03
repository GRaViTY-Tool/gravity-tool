package org.gravity.tgg.tests.load;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.tgg.tests.MoDiscoTestActivator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests the loading of already created program models if these are requested
 * again
 *
 * @author speldszus
 *
 */
public class LoadTests {

	private static final String PROJECT_NAME = "DummyProject";

	private static IProject project;

	/**
	 * Creates a new instance and imports a Java project for testing
	 *
	 * @throws CoreException
	 * @throws DuplicateProjectNameException
	 */
	@BeforeClass
	public static void initProject() throws CoreException, DuplicateProjectNameException {
		clean();
		project = MoDiscoTestActivator.generateSimpleProject(PROJECT_NAME).getProject();
	}

	/**
	 * Tests the discarding of a converter that has saved the models
	 *
	 * @throws NoConverterRegisteredException
	 * @throws CoreException
	 */
	@Test
	public void trafoAndLoad() throws NoConverterRegisteredException, CoreException {
		final var first = GravityActivator.getDefault().getConverter(LoadTests.project);
		assertTrue(first.convertProject(null));
		assertNotNull(first.getPG());
		first.discard();

		final var second = GravityActivator.getDefault().getConverter(LoadTests.project);
		assertNotEquals(first, second);
		assertTrue(second.convertProject(null));
		assertNotNull(second.getPG());
	}

	/**
	 * Delete the generated project after test execution
	 *
	 * @throws CoreException
	 */
	@AfterClass
	public static void clean() throws CoreException {
		if (project == null) {
			project = EclipseProjectUtil.getProjectByName(PROJECT_NAME);
		}
		if ((project != null) && project.exists()) {
			project.delete(true, null);
		}
	}
}
