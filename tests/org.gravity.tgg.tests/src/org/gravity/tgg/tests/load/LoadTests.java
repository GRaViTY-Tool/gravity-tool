package org.gravity.tgg.tests.load;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.junit.Test;

/**
 * Tests the loading of already created program models if these are requested again
 *
 * @author speldszus
 *
 */
public class LoadTests {

	IProject project;

	/**
	 * Creates a new instance and imports a Java project for testing
	 *
	 * @throws CoreException
	 */
	public LoadTests() throws CoreException {
		this.project = EclipseProjectUtil.importProject(new File(new File("java_src"), "SingleClass"), null);
	}

	/**
	 * Tests the discarding of a converter that has saved the models
	 *
	 * @throws NoConverterRegisteredException
	 * @throws CoreException
	 */
	@Test
	public void trafoAndLoad() throws NoConverterRegisteredException, CoreException {
		final var first = GravityActivator.getDefault().getConverter(this.project);
		assertTrue(first.convertProject(null));
		assertNotNull(first.getPG());
		first.discard();

		final var second = GravityActivator.getDefault().getConverter(this.project);
		assertNotEquals(first, second);
		assertTrue(second.convertProject(null));
		assertNotNull(second.getPG());
	}
}
