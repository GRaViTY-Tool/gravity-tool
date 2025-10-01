package org.gravity.testsuite;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.tgg.modisco.pm.MoDiscoTGGActivator;
import org.gravity.typegraph.basic.TypeGraph;

public abstract class AbstractRefactoringTestCase {

	private static final Logger LOGGER = Logger.getLogger(AbstractRefactoringTestCase.class);

	protected static String projectName;

	private static TypeGraph pm;

	public static void initialize(final String projectName) throws CoreException, TransformationFailedException {
		MoDiscoTGGActivator.getDefault();
		if (projectName == null) {
			fail("Project not set!");
		}
		final var src = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile();
		final var projectLocation = new File(src, projectName);
		if (!projectLocation.exists()) {
			fail("Project \"" + projectName + "\" doesn't exist at \"" + src.toString() + "\"!");
		}
		LOGGER.info("Import project: " + projectName);
		final var monitor = new NullProgressMonitor();
		final var project = EclipseProjectUtil.importProject(projectLocation, monitor);
		if ((project == null) || !project.exists()) {
			fail("Project \"" + projectName + "\" doesn't exist at \"" + src.toString() + "\"!");
		}
		final var java = JavaProjectUtil.getJavaProject(project);
		if ((java == null) || !java.exists()) {
			fail("Project \"" + projectName + "\" couldn't be converted to a Java project!");
		}
		try {
			GravityModiscoProjectDiscoverer.getModiscoFile(project, monitor).delete(true, monitor);
		} catch (CoreException | IOException e) {
			LOGGER.warn(e);
		}
		pm = GravityAPI.createProgramModel(java, monitor);
		if(pm == null) {
			fail("Creating PM failed!");
		}
	}

	protected static TypeGraph getProgramModel() {
		return EcoreUtil.copy(pm);
	}

}
