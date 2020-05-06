package org.gravity.eclipse.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.maven.MavenImport;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.apache.log4j.Logger;

@RunWith(Parameterized.class)
public class MavenImportTest {

	private static final Logger LOGGER = Logger.getLogger(MavenImportTest.class);

	private File projectLocation;
	private Map<String, String> expected;

	public MavenImportTest(String name, File projectLocation, Map<String, String> expected) {
		this.projectLocation = projectLocation;
		this.expected = expected;
	}

	@Parameters(name = "{0}")
	public static Collection<Object[]> getTestProjects() throws CoreException, IOException {
		ExtensionFileVisitor visitor = new ExtensionFileVisitor(".csv");
		Path path = new File("data").getAbsoluteFile().toPath();
		LOGGER.info("Search for test in: " + path);
		Files.walkFileTree(path, visitor);
		List<Path> files = visitor.getFiles();
		Collection<Object[]> data = new ArrayList<>(files.size());
		for (Path file : files) {
			Map<String, String> expected = Files.readAllLines(file).parallelStream().map(line -> line.split(","))
					.filter(entry -> entry.length == 2).collect(Collectors.toMap(entry -> entry[1], entry -> entry[0]));
			File location = file.toFile().getParentFile();
			LOGGER.info("Found maven project in: " + location);
			data.add(new Object[] { location.getName(), location, expected });
		}
		return data;
	}

	@Test
	public void importMavenProject() throws ImportException, JavaModelException {
		MavenImport maven = new MavenImport(projectLocation, false);
		IJavaProject importedProject = maven.importProject(new NullProgressMonitor());
		Set<String> libs = Stream.of(importedProject.getRawClasspath()).parallel()
				.filter(entry -> entry.getEntryKind() == IClasspathEntry.CPE_LIBRARY).map(entry -> entry.getPath())
				.map(path -> path.lastSegment()).collect(Collectors.toSet());
		for (Entry<String, String> entry : expected.entrySet()) {
			switch (entry.getValue()) {
			case "class":
				assertNotNull(importedProject.findType(entry.getKey()));
				break;
			case "jar":
				assertTrue(libs.contains(entry.getKey()));
				break;
			}
		}
	}
}
