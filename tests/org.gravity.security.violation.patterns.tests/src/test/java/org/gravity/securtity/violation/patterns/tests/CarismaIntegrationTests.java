package org.gravity.securtity.violation.patterns.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.security.violation.patterns.SecurityViolationPattern;
import org.gravity.tgg.uml.Transformation;

import carisma.core.Carisma;
import carisma.core.analysis.Analysis;
import carisma.core.analysis.CheckReference;
import carisma.core.analysis.UIConnector;
import carisma.core.analysis.result.StatusType;
import carisma.core.checks.CheckDescriptor;
import carisma.core.checks.CheckParameter;
import carisma.core.checks.CheckRegistry;

/**
 *
 * Tests the integration into CARiSMA
 *
 * @author speldszus
 *
 */
public class CarismaIntegrationTests extends AbstractIntegrationTest {

	protected static final Logger LOGGER = Logger.getLogger(CarismaIntegrationTests.class);

	@Override
	protected void run(final IProject project, final NullProgressMonitor monitor) {
		assertNotNull("Couldn't load the test project", project);

		final var carisma = Carisma.getInstance();
		final var checkRegistry = carisma.getCheckRegistry();
		final var descriptor = checkRegistry.getCheckDescriptor(SecurityViolationPattern.CARISMA_ID);
		assertNotNull("Couldn't load check descriptor from CARiSMA.", descriptor);
		final var check = CheckRegistry.getCheck(descriptor);
		assertNotNull("Couldn't load check from CARiSMA.", check);

		IFile uml;
		try {
			uml = Transformation.getUMLFile(project, monitor);
		} catch (final IOException e) {
			throw new IllegalStateException(e);
		}
		assertNotNull("Couldn't find generated UML model", uml);

		final var analysis = new Analysis("Test CARiSMA Integration", "uml", uml);
		analysis.getChecks().add(new CheckReference(SecurityViolationPattern.CARISMA_ID, true));
		carisma.runAnalysis(analysis, new UIConnector() {

			@Override
			public void updateView() {
				// Nothing to do
			}

			@Override
			public int sendMessage(final String title, final String message, final StatusType type,
					final String[] answers, final int defaultIndex) {
				final var string = title + ": " + message;
				switch (type) {
				case INFO:
					LOGGER.info(string);
					break;
				case WARNING:
					LOGGER.warn(string);
					break;
				case ERROR:
					LOGGER.error(string);
					break;
				}
				return 0;
			}

			@Override
			public <T extends CheckParameter> T askParameter(final CheckDescriptor checkDescriptor,
					final T checkParameter) {
				// No params used in this test
				return null;
			}
		});
		final var results = carisma.getAnalysisResults();
		assertFalse(results.isEmpty());
	}
}
