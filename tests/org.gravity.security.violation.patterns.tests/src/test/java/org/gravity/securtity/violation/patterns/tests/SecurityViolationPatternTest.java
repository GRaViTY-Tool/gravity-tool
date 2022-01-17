package org.gravity.securtity.violation.patterns.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.gravity.security.violation.patterns.SecurityViolationPattern;
import org.gravity.securtity.violation.patterns.tests.helper.ModelGen;
import org.junit.Test;

public class SecurityViolationPatternTest {

	private static final String OUTPUT_LOCATION = "instances/";

	/**
	 * Generates a compliant model and tests if no violation is detected
	 * @throws IOException
	 */
	@Test
	public void testCompliantModel() throws IOException {
		final var corr = new ModelGen(OUTPUT_LOCATION).generateCompliantModel("compliant");
		final var matches = new SecurityViolationPattern().detect(corr);
		assertTrue(matches.isEmpty());
	}

	/**
	 * Generates a violating model and tests if the violation is detected
	 * @throws IOException
	 */
	@Test
	public void testViolatingModel() throws IOException {
		final var corr = new ModelGen(OUTPUT_LOCATION).generateViolatingModel("violating");
		final var matches =  new SecurityViolationPattern().detect(corr);
		assertFalse(matches.isEmpty());
	}
}
