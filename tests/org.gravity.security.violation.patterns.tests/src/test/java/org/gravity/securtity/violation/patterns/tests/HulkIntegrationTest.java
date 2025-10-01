/**
 *
 */
package org.gravity.securtity.violation.patterns.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.impl.HAntiPatternDetectionImpl;
import org.gravity.security.violation.patterns.SecurityViolationPattern;

/**
 * Tests for the integration into the Hulk anti-pattern detection tool
 *
 * @author speldszus
 *
 */
public class HulkIntegrationTest extends AbstractExisitingModelsTest {

	@Override
	protected void run(final IProject project, final NullProgressMonitor monitor) {
		IPGConverter converter;
		try {
			converter = GravityActivator.getDefault().getConverter(project);
		} catch (NoConverterRegisteredException | CoreException e) {
			throw new IllegalStateException(e);
		}
		final var success = converter.convertProject(monitor);
		assertTrue(success);

		final var apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		final var pm = converter.getPG();
		assertNotNull(pm);
		apg.setPg(pm);

		final var hulk = new HAntiPatternDetectionImpl();
		hulk.setApg(apg);
		hulk.setProgramlocation(project.getLocation().toString());

		final var pattern = new SecurityViolationPattern();
		pattern.setHAntiPatternHandling(hulk);
		assertTrue(pattern.detect(apg));
		assertFalse(apg.getHAnnotations().isEmpty());
	}

}
