package org.gravity.tgg.tests.api;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class APITests {

	private static final String PROJECT_NAME = "APITestProject";
	IJavaProject project;

	public APITests() throws DuplicateProjectNameException, CoreException {
		this.project = JavaProjectUtil.getJavaProject(EclipseProjectUtil.getProjectByName(PROJECT_NAME));
	}

	@BeforeClass
	public static void createProject() throws DuplicateProjectNameException, CoreException, IOException {
		final var project = JavaProjectUtil.createJavaProject(PROJECT_NAME, Collections.singleton("src"), null);

		final var srcDummy = project.getProject().getFolder("src").getFolder("dummy");
		srcDummy.create(true, true, null);

		final var content = "package dummy;\n" + "public class Clazz {\n" + "}";
		try(var stream = new ByteArrayInputStream(content.getBytes())){
			srcDummy.getFile("Clazz.java").create(stream, true, null);
		}
	}

	@Test
	public void testCreateProgramModel() throws TransformationFailedException {
		final var pm = GravityAPI.createProgramModel(this.project, null);

		assertNotNull(pm);
	}

	@Test
	public void testCreateProgramModelAfterPMChange() throws TransformationFailedException, IOException {
		final var pm = GravityAPI.createProgramModel(this.project, null);
		assertNotNull(pm);

		addInterface(pm);

		final var newPm = GravityAPI.createProgramModel(this.project, null);
		assertNotNull(newPm);
		assertNotEquals(pm, newPm);
		assertTrue(newPm.getInterfaces().isEmpty());
	}

	@Test
	public void testCreateProgramModelAfterSrcChange() throws TransformationFailedException, IOException, CoreException {
		final var pm = GravityAPI.createProgramModel(this.project, null);
		assertNotNull(pm);

		// Change project src
		final var file = this.project.getProject().getFile("src/dummy/Other.java");
		final var content = "package dummy;\n" + "public class Other {\n" + "}";
		try(var stream = new ByteArrayInputStream(content.getBytes())){
			file.create(stream, true, null);

			final var newPm = GravityAPI.createProgramModel(this.project, null);
			assertNotNull(newPm);
			assertNotEquals(pm, newPm);
			assertNotNull(newPm.getClass("dummy.Other"));
		}
		finally {
			file.delete(true, null);
		}
	}

	@AfterClass
	public static void clean() throws CoreException {
		final var project = EclipseProjectUtil.getProjectByName(PROJECT_NAME);
		if((project != null) && project.exists()) {
			project.delete(true, null);
		}
	}

	private void addInterface(final TypeGraph pm) throws IOException {
		final var iface = BasicFactory.eINSTANCE.createTInterface();
		iface.setTName("Added");
		final var p = pm.getPackage("dummy");
		p.getAllOwnedTypes().add(iface);
		p.getInterfaces().add(iface);
		pm.getOwnedTypes().add(iface);
		pm.getInterfaces().add(iface);
		pm.eResource().save(Collections.emptyMap());
	}
}
