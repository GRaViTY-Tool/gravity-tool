package org.gravity.eclipse.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.gradle.GradleImport;
import org.junit.runners.Parameterized.Parameters;

public class GradleImportTest extends ImportTest {
	
	public GradleImportTest(String name, File projectLocation, Map<String, String> expected) throws IOException, ImportException {
		super(new GradleImport(projectLocation, false), name, projectLocation, expected);
	}

	@Parameters(name = "{0}")
	public static Collection<Object[]> getTestProjects() throws CoreException, IOException {
		return getTestProjects(".gradle.csv");
	}
}
