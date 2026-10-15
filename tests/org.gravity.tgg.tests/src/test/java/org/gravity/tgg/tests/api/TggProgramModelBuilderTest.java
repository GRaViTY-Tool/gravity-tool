package org.gravity.tgg.tests.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.tests.TestHelper;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.tgg.modisco.pm.TggProgramModelBuilder;
import org.junit.After;
import org.junit.Test;

public class TggProgramModelBuilderTest {

	private IJavaProject javaProject;

	@After
	public void clean() throws Exception {
		if (javaProject != null && javaProject.getProject().exists()) {
			javaProject.getProject().delete(true, new NullProgressMonitor());
		}
	}

	@Test
	public void supportsJavaProjectAndBuildsProgramModel() throws Exception {
		javaProject = TestHelper.generateSimpleProject("TggProgramModelBuilderTest");
		final var builder = new TggProgramModelBuilder();

		assertEqualsId(builder);
		assertTrue(builder.supports(javaProject.getProject()));
		final var model = builder.build(javaProject.getProject(), new NullProgressMonitor());
		assertNotNull(model);
		assertNotNull(model.getClass("dummy.Clazz"));
	}

	@Test
	public void rejectsNonJavaProject() throws Exception {
		final IProject project = EclipseProjectUtil.createProject("TggProgramModelBuilderNonJava", null);
		try {
			final var builder = new TggProgramModelBuilder();
			assertFalse(builder.supports(project));
		} finally {
			project.delete(true, new NullProgressMonitor());
		}
	}

	private static void assertEqualsId(final TggProgramModelBuilder builder) {
		org.junit.Assert.assertEquals(TggProgramModelBuilder.ID, builder.id());
	}
}
