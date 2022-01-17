package org.gravity.securtity.violation.patterns.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.security.violation.patterns.SecurityViolationPattern;
import org.gravity.tgg.uml.Transformation;
import org.junit.Test;

import carisma.core.Carisma;
import carisma.core.analysis.Analysis;
import carisma.core.analysis.CheckReference;
import carisma.core.checks.CheckRegistry;
import carisma.ui.console.ConsoleUIConnector;

/**
 *
 * Tests the integration into CARiSMA
 *
 * @author speldszus
 *
 */
public class CarismaIntegrationTests {

	@Test
	public void testCarismaIntegration() throws IOException, CoreException {
		final var monitor = new NullProgressMonitor();
		final var location = new File("instances/SecureViolationPatternsViolation");
		final var project = EclipseProjectUtil.importProject(location, monitor);
		assertNotNull("Couldn't load the test project", project);

		final var carisma = Carisma.getInstance();
		final var checkRegistry = carisma.getCheckRegistry();
		final var descriptor = checkRegistry.getCheckDescriptor(SecurityViolationPattern.CARISMA_ID);
		assertNotNull("Couldn't load check descriptor from CARiSMA.", descriptor);
		final var check = CheckRegistry.getCheck(descriptor);
		assertNotNull("Couldn't load check from CARiSMA.", check);

		final var uml = Transformation.getUMLFile(project, monitor);
		assertNotNull("Couldn't find generated UML model", uml);

		final var analysis = new Analysis("Test CARiSMA Integration", "uml", uml);
		analysis.getChecks().add(new CheckReference(SecurityViolationPattern.CARISMA_ID, true));
		carisma.runAnalysis(analysis, new ConsoleUIConnector());
		final var results = carisma.getAnalysisResults();
		assertFalse(results.isEmpty());
	}
}
