package org.gravity.eclipse.tests.importer;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.gradle.GradleImport;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GradleImportTest extends ImportTest {

	private static final Logger LOGGER = Logger.getLogger(GradleImportTest.class);

	public GradleImportTest(final String name, final File projectLocation, final Map<String, String> expected) throws IOException, ImportException {
		super(new GradleImport(projectLocation, true), expected);
		LOGGER.info("Run: "+name);
	}

	@Parameters(name = "{index}: Import gradle project: {0}")
	public static Collection<Object[]> getTestProjects() throws CoreException, IOException {
		return getTestProjects(".gradle.csv");
	}
}
