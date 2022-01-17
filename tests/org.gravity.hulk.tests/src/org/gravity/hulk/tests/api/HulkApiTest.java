package org.gravity.hulk.tests.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.io.GitCloneException;
import org.gravity.eclipse.io.GitTools;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.hulk.HulkAPI;
import org.gravity.hulk.HulkAPI.AntiPatternNames;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric;
import org.gravity.hulk.antipatterngraph.metrics.HIGATMetric;
import org.gravity.hulk.exceptions.DetectionFailedException;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.model.InitializationError;

/**
 * A class for testing the HulkAPI This test should be executed as JUnit plugin
 * test. The test subjects have to be loaded in the workspace of the plugin test
 *
 * @author speldszus
 *
 */
public class HulkApiTest {

	private static final Logger LOGGER = Logger.getLogger(HulkApiTest.class);

	private static IJavaProject javaProject;

	/**
	 * Collects the projects from the current workspace on which Hulk should be
	 * executed
	 *
	 * @return A list of projects and their names
	 * @throws CoreException     If no projects could be imported
	 * @throws GitCloneException If the test projects cannot be cloned
	 * @throws IOException       If the git client cannot be closed
	 * @throws InitializationError
	 */
	@BeforeClass
	public static void collectProjects() throws CoreException, GitCloneException, IOException, InitializationError {
		final var location = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile(), "repository");
		new GitTools("https://github.com/GRaViTY-Tool/gravity-evaluation-data.git", location, true, false).close();

		javaProject = EclipseProjectUtil
				.importProjects(new File(location, "gravity-evaluation-data"), new NullProgressMonitor())
				.parallelStream().filter(project -> "SecureMailApp".equals(project.getName()))
				.map(JavaProjectUtil::getJavaProject).findAny().orElse(null);
		if(javaProject == null) {
			throw new InitializationError("Couldn't load java project");
		}
		BasicConfigurator.configure();
	}

	/**
	 * Deletes old transformation files to force a transformation from scratch
	 *
	 * @throws CoreException
	 * @throws IOException
	 */
	@Before
	public void clean() throws CoreException, IOException {
		EclipseProjectUtil.getGravityFolder(javaProject.getProject(), null).delete(true, null);
	}

	/**
	 * The HulkAPI is used to detect Blob anti-pattern
	 *
	 * @throws DetectionFailedException If the detection failed
	 */
	@Test
	public void detectBlobsAPI() throws DetectionFailedException {
		final var results = HulkAPI.detect(javaProject, new NullProgressMonitor(), AntiPatternNames.BLOB);
		assertNotNull(results);
		LOGGER.log(Level.INFO, "Number of Blobs = " + results.size());
	}

	/**
	 * The HulkAPI is used to calculate multiple metrics and anti-patterns
	 *
	 * @throws DetectionFailedException If the detection failed
	 */
	@Test
	public void detectAllAPI() throws DetectionFailedException {
		final var results = HulkAPI.detect(javaProject, new NullProgressMonitor(), AntiPatternNames.BLOB,
				AntiPatternNames.IGAT, AntiPatternNames.IGAM, AntiPatternNames.SPAGHETTI_CODE,
				AntiPatternNames.SWISS_ARMY_KNIFE, AntiPatternNames.TOTAL_METHOD_VISIBILITY,
				AntiPatternNames.TOTAL_COUPLING);
		assertNotNull(results);
		var blobs = 0;
		for (final HAnnotation hAnnotation : results) {
			if (hAnnotation instanceof HBlobAntiPattern) {
				blobs++;
			}
			if (hAnnotation.getTAnnotated() instanceof TypeGraph) {
				if (hAnnotation instanceof HIGAMMetric) {
					LOGGER.log(Level.INFO, "IGAM = " + ((HMetric) hAnnotation).getValue());
				} else if (hAnnotation instanceof HIGATMetric) {
					LOGGER.log(Level.INFO, "IGAT = " + ((HMetric) hAnnotation).getValue());
				}
			}
		}
		LOGGER.log(Level.INFO, "Blobs = " + blobs);
	}

	@Test
	public void detectAllWithSync() throws NoConverterRegisteredException, CoreException, DetectionFailedException {
		final var converter = GravityActivator.getDefault().getNewConverter(javaProject.getProject());
		final var success = converter.convertProject(new NullProgressMonitor());
		assertTrue(success);
		final var pm = converter.getPG();
		assertNotNull(pm);
		final var results = HulkAPI.detect(pm, javaProject.getProject().getLocation().toString(),
				AntiPatternNames.BLOB, AntiPatternNames.IGAT, AntiPatternNames.IGAM, AntiPatternNames.SPAGHETTI_CODE,
				AntiPatternNames.SWISS_ARMY_KNIFE, AntiPatternNames.TOTAL_METHOD_VISIBILITY,
				AntiPatternNames.TOTAL_COUPLING);
		assertNotNull(results);
	}
}
