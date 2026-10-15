package org.gravity.tgg.tests.api;

import static org.junit.Assert.assertFalse;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.eclipse.core.resources.IFile;
import org.gravity.typegraph.basic.BasicFactory;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.tests.TestHelper;
import org.eclipse.core.resources.ResourcesPlugin;
import org.gravity.tgg.modisco.pm.TggProgramModelBuilder;
import org.eclipse.core.runtime.Platform;
import org.gravity.tgg.modisco.pm.MoDiscoTGGActivator;
import org.osgi.framework.Bundle;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Test;

public class TggProgramModelBuilderTest {

	private IJavaProject javaProject;

	@BeforeClass
	public static void printPatcherPluginDiagnostics() {
		final String bundleId = "org.gravity.modisco.patcher.emfcompare";
		final Bundle bundle = Platform.getBundle(bundleId);
		System.out.println("MoDisco patcher bundle: " + (bundle == null ? "NOT INSTALLED"
				: bundle.getSymbolicName() + " [" + bundle.getVersion() + "], state=" + bundle.getState()));
		assertNotNull("MoDisco patcher bundle missing from test runtime: " + bundleId, bundle);
		final var activator = MoDiscoTGGActivator.getDefault();
		assertNotNull("MoDisco TGG activator was not started", activator);
		final var patcher = activator.getSelectedPatcher();
		System.out.println("Selected MoDisco patcher: " + (patcher == null ? "NONE"
				: patcher.getClass().getName()));
		assertNotNull("No MoDisco patcher selected; check extension registration", patcher);
	}


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
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("TggProgramModelBuilderNonJava");
		project.create(new NullProgressMonitor());
		project.open(new NullProgressMonitor());
		try {
			final var builder = new TggProgramModelBuilder();
			assertFalse(builder.supports(project));
		} finally {
			project.delete(true, new NullProgressMonitor());
		}
	}

	@Test
	public void forwardSynchronizationUsesBuiltModel() throws Exception {
		javaProject = TestHelper.generateSimpleProject("TggBuilderForwardSync");
		final var builder = new TggProgramModelBuilder();
		final var model = builder.build(javaProject.getProject(), new NullProgressMonitor());
		final IFile file = javaProject.getProject().getFile("src/dummy/Clazz.java");
		final var source = "package dummy; public class Clazz { public void added() {} }";
		file.setContents(new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8)), true, false,
				new NullProgressMonitor());
		assertTrue("Forward synchronization failed", builder.synchronizeForward(javaProject.getProject(),
				model, new NullProgressMonitor()));
		assertNotNull("Existing model must still be available", model.getClass("dummy.Clazz"));
		assertNotNull("Forward synchronization must add the method", model.getClass("dummy.Clazz").getTMethodDefinition("added():void"));
	}

	@Test
	public void backwardSynchronizationUsesSuppliedModel() throws Exception {
		javaProject = TestHelper.generateSimpleProject("TggBuilderBackwardSync");
		final var builder = new TggProgramModelBuilder();
		final var model = builder.build(javaProject.getProject(), new NullProgressMonitor());
		assertNotNull(model.getClass("dummy.Clazz"));
		final var otherModel = BasicFactory.eINSTANCE.createTypeGraph();
		otherModel.setTName("unrelated-model");
		assertFalse("Adapter must not silently synchronize an unrelated TypeGraph",
				builder.synchronizeBackward(javaProject.getProject(), otherModel, new NullProgressMonitor()));
	}

	private static void assertEqualsId(final TggProgramModelBuilder builder) {
		org.junit.Assert.assertEquals(TggProgramModelBuilder.ID, builder.id());
	}
}
