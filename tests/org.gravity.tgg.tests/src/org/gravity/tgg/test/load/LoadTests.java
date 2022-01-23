package org.gravity.tgg.test.load;

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

public class LoadTests {

	IProject project;

	public LoadTests() throws CoreException {
		this.project = EclipseProjectUtil.importProject(new File(new File("java_src"), "SingleClass"), null);
	}

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
