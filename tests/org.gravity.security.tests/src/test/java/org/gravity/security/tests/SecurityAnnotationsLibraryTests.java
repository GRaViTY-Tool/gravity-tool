package org.gravity.security.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.security.annotations.SecurityAnnoationsCheckActivator;
import org.junit.Test;

public class SecurityAnnotationsLibraryTests {

	@Test
	public void testAddAnnotations() throws DuplicateProjectNameException, CoreException, IOException {
		final var monitor = new NullProgressMonitor();
		IJavaProject project = null;
		try {
			final var name = "noAnnotations";
			project = JavaProjectUtil.createJavaProject(name, Collections.singleton("src"), monitor);

			final var cpBefore = project.getRawClasspath().length;

			// Add UMLsec lib
			final var path1 = SecurityAnnoationsCheckActivator.applyUMLsecLib(project, monitor);

			// Check if lib has been added
			assertTrue(project.getProject().getFile(path1).exists());
			assertEquals(cpBefore + 1, project.getRawClasspath().length);

			// Try to add lib again
			final var path2 = SecurityAnnoationsCheckActivator.applyUMLsecLib(project, monitor);

			// Check that file has not been added again
			assertEquals(path1, path2);
			assertTrue(project.getProject().getFile(path2).exists());
			assertEquals(cpBefore + 1, project.getRawClasspath().length);
		} finally {
			if (project != null) {
				project.getProject().delete(true, monitor);
			}
		}
	}
}
