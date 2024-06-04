package org.gravity.tgg.tests.configure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.RegistryFactory;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverterFactory;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.tgg.tests.configure.dummy.DummyConverterFactory;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConverterSelectionTests {

	private static final String PROJECT = "selectionTest";
	private static final Logger LOGGER = Logger.getLogger(ConverterSelectionTests.class);

	@BeforeClass
	public static void init() throws IOException {
		final var bundle = Platform.getBundle("org.gravity.tgg.tests");
		try (var stream = new FileInputStream("src/test/resources/configure/plugin.xml")) {
			final var contributor = ContributorFactoryOSGi.createContributor(bundle);
			Platform.getExtensionRegistry().addContribution(stream, contributor,
					false, "TestContribution", null,
					((ExtensionRegistry) RegistryFactory.getRegistry()).getTemporaryUserToken());
		}
	}

	@Test
	public void testConverterSelection() {
		try {
			final var javaProject = JavaProjectUtil.createJavaProject(PROJECT, Collections.singleton("src"), null);
			final var project = javaProject.getProject();
			final var file = EclipseProjectUtil.getGravityFolder(project, null).getFile(".converter");
			file.create(new ByteArrayInputStream(DummyConverterFactory.class.getName().getBytes()), true,
					null);

			final var activator = GravityActivator.getDefault();

			final var compatible = activator.getCompatibleConverterFactories(project);
			assertEquals(2, compatible.size());

			final var selectedViaFile = activator.getSelectedConverterFactory(project);
			assertTrue(selectedViaFile instanceof DummyConverterFactory);

			final var converter = compatible.stream().filter(f -> !(f instanceof DummyConverterFactory)).findAny()
					.get();
			activator.setSelectedConverterFactory(project, converter);
			final var selectedViaAPI = activator.getSelectedConverterFactory(project);
			assertEquals(converter, selectedViaAPI);
			assertEquals(converter.getClass().getName(), new String(file.getContents().readAllBytes()));

			assertTrue(activator.getSuitableConverterFactory(project,
					IPGConverterFactory::supportsFWDSync) instanceof DummyConverterFactory);

			project.delete(true, true, null);
		} catch (DuplicateProjectNameException | CoreException | IOException e) {
			try {
				final var project = EclipseProjectUtil.getProjectByName(PROJECT);
				if (project != null) {
					project.delete(true, true, null);
				}
			} catch (final CoreException e1) {
				LOGGER.error(e);
			}
			fail(e.getLocalizedMessage());
		}
	}
}
