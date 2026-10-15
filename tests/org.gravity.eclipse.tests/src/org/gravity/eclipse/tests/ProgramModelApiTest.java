package org.gravity.eclipse.tests;

import static org.junit.Assert.assertEquals;

import org.gravity.eclipse.programmodel.ProgramModelBuildException;
import org.junit.Test;

public class ProgramModelApiTest {

	@Test
	public void buildExceptionPreservesMessageAndCause() {
		final var cause = new IllegalStateException("cause");
		final var withCause = new ProgramModelBuildException("build failed", cause);
		assertEquals("build failed", withCause.getMessage());
		assertEquals(cause, withCause.getCause());

		final var messageOnly = new ProgramModelBuildException("message");
		assertEquals("message", messageOnly.getMessage());
	}
}
