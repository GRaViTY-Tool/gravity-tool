package org.gravity.tgg.tests.load;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverterFactory;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.tests.TestHelper;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.tgg.modisco.pm.MoDiscoTGGConverterFactory;
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
		project = TestHelper.generateSimpleProject(PROJECT_NAME).getProject();
	}

	/**
	 * Tests the discarding of a converter that has saved the models
	 *
	 * @throws NoConverterRegisteredException
	 * @throws CoreException
	 */
	@Test
	public void trafoAndLoad() throws NoConverterRegisteredException, CoreException {
		selectTGGConverterFactory(LoadTests.project);

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
	 * Sets the TGG-based MoDisco to PM converter as selected for the given project
	 *
	 * @param project A project
	 * @return The selected converter factory
	 * @throws CoreException
	 */
	public static IPGConverterFactory selectTGGConverterFactory(final IProject project) {
		final var activator = GravityActivator.getDefault();
		final var result = activator.getCompatibleConverterFactories(project).stream()
				.filter(MoDiscoTGGConverterFactory.class::isInstance).findAny();
		if (result.isEmpty()) {
			throw new IllegalStateException("TGG Converter not found");
		}
		final var factory = result.get();
		activator.setSelectedConverterFactory(project, factory);
		return factory;
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
