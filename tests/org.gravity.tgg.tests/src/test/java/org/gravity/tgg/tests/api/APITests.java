package org.gravity.tgg.tests.api;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.tests.TestHelper;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests of the simple GRaViTY API for creating program models
 *
 * @author speldszus
 *
 */
public class APITests {

	public static final String PROJECT_NAME = "APITestProject";

	private static final Logger LOGGER = Logger.getLogger(APITests.class);

	private static IJavaProject project;

	/**
	 * Generate a simple Java project for testing
	 *
	 * @throws DuplicateProjectNameException
	 * @throws CoreException
	 */
	@BeforeClass
	public static void createProject() throws DuplicateProjectNameException, CoreException {
		clean();
		project = TestHelper.generateSimpleProject(PROJECT_NAME);
	}

	@Test
	public void testCreateProgramModel() throws TransformationFailedException {
		final var pm = GravityAPI.createProgramModel(APITests.project, null);

		assertNotNull(pm);
	}

	@Test
	public void testCreateProgramModelAfterPMChange() throws TransformationFailedException, IOException {
		final var pm = GravityAPI.createProgramModel(APITests.project, true, null);
		assertNotNull(pm);

		this.addInterface(pm);

		final var newPm = GravityAPI.createProgramModel(APITests.project, true, null);
		assertNotNull(newPm);
		assertNotEquals(pm, newPm);
		assertTrue(newPm.getInterfaces().isEmpty());
	}

	@Test
	public void testCreateProgramModelAfterSrcChange()
			throws TransformationFailedException, IOException, CoreException {
		final var pm = GravityAPI.createProgramModel(APITests.project, true, null);
		assertNotNull(pm);

		// Change project src
		final var file = APITests.project.getProject().getFile("src/dummy/Other.java");
		final var content = """
				package dummy;
				public class Other {
				}""";
		try (var stream = new ByteArrayInputStream(content.getBytes())) {
			file.create(stream, true, null);

			final var newPm = GravityAPI.createProgramModel(APITests.project, null);
			assertNotNull(newPm);
			assertNotEquals(pm, newPm);
			assertNotNull(newPm.getClass("dummy.Other"));
		} finally {
			file.delete(true, null);
		}
	}

	/**
	 * Delete the generated project after test execution
	 *
	 * @throws CoreException
	 */
	@AfterClass
	public static void clean() throws CoreException {
		IProject delete;
		if (project == null) {
			delete = EclipseProjectUtil.getProjectByName(PROJECT_NAME);
		} else {
			delete = project.getProject();
		}
		if ((delete != null) && delete.exists()) {
			delete.delete(true, null);
		}
	}

	private void addInterface(final TypeGraph pm) throws IOException {
		final var iface = BasicFactory.eINSTANCE.createTInterface();
		iface.setTName("Added");
		final var p = pm.getPackage("dummy");
		p.getAllOwnedTypes().add(iface);
		p.getInterfaces().add(iface);
		pm.getInterfaces().add(iface);
		pm.getAllTypes().add(iface);

		final var module = BasicFactory.eINSTANCE.createTModule();
		iface.setModule(module);
		pm.getModules().add(module);

		try {
			pm.eResource().save(Collections.emptyMap());
		} catch (final IOException e) {
			LOGGER.warn(e);
			LOGGER.warn("Manually deleting file and retrying");
			try {
				EclipseProjectUtil.getGravityFolder(APITests.project.getProject(), null).getFile("pm/pm.xmi")
						.delete(true, null);
			} catch (CoreException | IOException e1) {
				fail("Unable to delete pm.xmi: " + e.getLocalizedMessage());
			}
			pm.eResource().save(Collections.emptyMap());
		}
	}
}
