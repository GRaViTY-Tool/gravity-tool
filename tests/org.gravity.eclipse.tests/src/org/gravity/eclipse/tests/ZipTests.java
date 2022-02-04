package org.gravity.eclipse.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.stream.Stream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IClasspathEntry;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.eclipse.io.ZipUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.junit.Test;

public class ZipTests {

	@Test
	public void testProjectZipExport() throws CoreException, DuplicateProjectNameException, IOException {
		final var project = TestHelper.generateSimpleProject("ZipTestProject");
		final var out = FileUtils.createTempFile("test", ".zip").toFile();
		ZipUtil.zipProject(project, out);
		assertTrue(out.exists());

		project.getProject().delete(true, null);
		final var unzip = FileUtils.createTempDirectory("zipOut").toFile();
		ZipUtil.unzip(out.toString(), unzip.getAbsolutePath());
		final var imported = EclipseProjectUtil.importProject(unzip, null);
		assertNotNull(imported);
		assertTrue(imported.exists());

		final var java = JavaProjectUtil.getJavaProject(imported);
		final var cp = java.getRawClasspath();
		assertTrue(cp.length > 0);
		assertTrue(Stream.of(cp).anyMatch(e -> e.getEntryKind() == IClasspathEntry.CPE_SOURCE));
	}
}
