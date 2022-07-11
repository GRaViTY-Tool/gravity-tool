package org.gravity.eclipse.tests.importer;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.maven.MavenImport;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MavenImportTest extends ImportTest {

	private static final Logger LOGGER = Logger.getLogger(MavenImportTest.class);

	public MavenImportTest(final String name, final File projectLocation, final Map<String, String> expected) throws ImportException {
		super(new MavenImport(projectLocation, false), expected);
		LOGGER.info("Run: "+name);
	}

	@Parameters(name = "{index}: Import gradle project: {0}")
	public static Collection<Object[]> getTestProjects() throws CoreException, IOException {
		return getTestProjects(".mvn.csv");
	}
}
