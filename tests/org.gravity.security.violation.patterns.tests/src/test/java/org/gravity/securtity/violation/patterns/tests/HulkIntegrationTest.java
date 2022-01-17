/**
 *
 */
package org.gravity.securtity.violation.patterns.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.security.violation.patterns.SecurityViolationPattern;
import org.junit.Test;

/**
 * Tests for the integration into the Hulk anti-pattern detection tool
 *
 * @author speldszus
 *
 */
public class HulkIntegrationTest {

	@Test
	public void testHulkIntegration() throws IOException, CoreException, NoConverterRegisteredException {
		final var monitor = new NullProgressMonitor();
		final var location = new File("instances/SecureViolationPatternsViolation");
		final var project = EclipseProjectUtil.importProject(location, monitor);
		assertNotNull("Couldn't load the test project", project);

		final var converter = GravityActivator.getDefault().getConverter(project);
		final var success = converter.convertProject(monitor);
		assertTrue(success);

		final var apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(converter.getPG());

		final var hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		hulk.setApg(apg);
		hulk.setProgramlocation(location.getAbsolutePath());

		final var pattern = new SecurityViolationPattern();
		pattern.setHAntiPatternHandling(hulk);
		assertTrue(pattern.detect(apg));
		assertFalse(apg.getHAnnotations().isEmpty());
	}

}
