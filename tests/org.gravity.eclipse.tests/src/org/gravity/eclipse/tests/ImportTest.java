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
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.ProjectImport;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class ImportTest {

	private static final Logger LOGGER = Logger.getLogger(ImportTest.class);
	
		protected final Map<String, String> expected;
	protected final ProjectImport importer;

	

	public ImportTest(ProjectImport importer, String name, File projectLocation, Map<String, String> expected) {
		this.expected = expected;
		this.importer = importer;
	}

	public static Collection<Object[]> getTestProjects(String fileExtension) throws CoreException, IOException {
		ExtensionFileVisitor visitor = new ExtensionFileVisitor(fileExtension);
		Path path = new File("data").getAbsoluteFile().toPath();
		LOGGER.info("Search for test in: " + path);
		Files.walkFileTree(path, visitor);
		List<Path> files = visitor.getFiles();
		Collection<Object[]> data = new ArrayList<>(files.size());
		for (Path file : files) {
			Map<String, String> expected = Files.readAllLines(file).parallelStream().map(line -> line.split(","))
					.filter(entry -> entry.length == 2).collect(Collectors.toMap(entry -> entry[1], entry -> entry[0]));
			File location = file.toFile().getParentFile();
			LOGGER.info("Found project in: " + location);
			data.add(new Object[] { location.getName(), location, expected });
		}
		return data;
	}

	

	/**
	 * Imports a Eclipse project and checks if the imported project fits to the expectations
	 * 
	 * @throws ImportException
	 * @throws JavaModelException
	 * @throws IOException
	 */
	@Test
	public void importGradleProject() throws ImportException, JavaModelException, IOException {
		IJavaProject importedProject = importer.importProject(new NullProgressMonitor());
		Set<String> libs = Stream.of(importedProject.getRawClasspath()).parallel()
				.filter(entry -> entry.getEntryKind() == IClasspathEntry.CPE_LIBRARY).map(entry -> entry.getPath())
				.map(path -> path.lastSegment()).collect(Collectors.toSet());
		for (Entry<String, String> entry : expected.entrySet()) {
			switch (entry.getValue()) {
			case "class":
				assertNotNull("Class \""+entry.getKey()+"\" is missing!", importedProject.findType(entry.getKey()));
				break;
			case "jar":
				assertTrue("Lib \""+entry.getKey()+"\" is missing!", libs.contains(entry.getKey()));
				break;
			}
		}
	}
}
