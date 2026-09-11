package org.gravity.eclipse.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.junit.Test;

public class JavaProjectTests {

	private static final String ADDITIONAL = "additional";

	@Test
	public void testReCreateJavaProject() throws CoreException {
		final var generated = JavaProjectUtil.createJavaProjectWithUniqueName("Project", null);
		try {
			assertNotNull(generated);
			assertEquals(1, getSourceFolders(generated).size());

			final var converted = JavaProjectUtil.convertToJavaProject(Collections.singleton(ADDITIONAL),
					generated.getProject(), null);
			assertNotNull(converted);
			assertEquals(2, getSourceFolders(converted).size());
			final var src = converted.getProject().getFolder(ADDITIONAL);
			assertTrue(src.exists());
		} finally {
			generated.getProject().delete(true, null);
		}
	}

	@Test
	public void testAddSrcAgain() throws CoreException, DuplicateProjectNameException {
		final var generated = JavaProjectUtil.createJavaProject("TestProject", Arrays.asList("src", "src"), null);
		try {
			assertNotNull(generated);
			assertEquals(1, getSourceFolders(generated).size());
		} finally {
			generated.getProject().delete(true, null);
		}
	}

	@Test
	public void testAddAdditionalSrcFolder() throws CoreException, DuplicateProjectNameException {
		final var generated = JavaProjectUtil.createJavaProject("TestProject", Collections.emptyList(), null);
		try {
			assertNotNull(generated);
			assertTrue(getSourceFolders(generated).isEmpty());
			JavaProjectUtil.createSrcFolders(Arrays.asList("src", "gen"), generated, null);
			assertEquals(2, getSourceFolders(generated).size());
		} finally {
			generated.getProject().delete(true, null);
		}
	}

	private List<IPath> getSourceFolders(final IJavaProject project) throws JavaModelException {
		return Stream.of(project.getRawClasspath()).filter(c -> c.getEntryKind() == IClasspathEntry.CPE_SOURCE)
				.map(IClasspathEntry::getPath).collect(Collectors.toList());
	}
}
