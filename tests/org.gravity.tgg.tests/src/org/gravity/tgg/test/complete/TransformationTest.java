package org.gravity.tgg.test.complete;

import java.io.File;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.tests.TestHelper;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.tgg.test.activator.MoDiscoTestActivator;
import org.gravity.tgg.test.util.ToFileLogger;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * An abstract test template collecting test java projects and allows to test
 * transformations on them.
 * 
 * The test has to be launched as junit plugin test
 * 
 * @author speldszus
 *
 */
@RunWith(Parameterized.class)
public abstract class AbstractParameterizedTransformationTest {

	/**
	 * The location where the output files should be stored
	 */
	private static final String TESTCASES_CREATED_OUTPUT = "/Testcases/CreatedOutput/";

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(AbstractParameterizedTransformationTest.class);

	@Rule
	public ToFileLogger logToFile = new ToFileLogger(Paths.get(new File("testlogs").toURI()));

	protected final IJavaProject project;
	protected final String name;
	protected final String out;

	/**
	 * The constructor taking the collected projects
	 * 
	 * This constructor should be only called by junit!
	 * 
	 * @param name    The name of the project
	 * @param project The project
	 */
	public AbstractParameterizedTransformationTest(String name, IJavaProject project) {
		this.project = project;
		this.name = name;
		this.out = Platform.getBundle(MoDiscoTestActivator.PLUGIN_ID).getLocation()
				.substring("platform:/base/".length());
	}

	@BeforeClass
	public static void initLogging() {
		// Set up logging
		BasicConfigurator.configure();	
		Logger rootLogger = Logger.getRootLogger();
        	rootLogger.setLevel(Level.WARN);
        }

	/**
	 * The method for collecting the java projects from the workspace.
	 * 
	 * This constructor should be only called by junit!
	 * 
	 * @return The test parameters as needed by junit paramterized tests
	 * @throws CoreException
	 */
	@Parameters(name = "{index}: Forward Transformation From Src: {0}")
	public static final Collection<Object[]> data() throws CoreException {
		LOGGER.info("Collect test data");
		List<IProject> projects = EclipseProjectUtil.importProjectsFromWorkspaceLocation(new NullProgressMonitor());
		LOGGER.info("Imported " + projects.size() + "projects into workspace.");
		return TestHelper.prepareTestData(projects);
	}

	/**
	 * The method in which tests on eclipse java projects can be defined
	 * 
	 * @throws Exception The test might throws exceptions
	 */
	@Test(timeout = 20 * 60 * 1000)
	public abstract void testForward() throws AssertionError;

	/**
	 * Loads the resource located at the given URI into a new ResourceSet
	 * 
	 * @param uri The URI
	 * @return The new ResourceSet
	 */
	protected final ResourceSet loadResourceSet(final URI uri) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResource(uri, true);
		return resourceSet;
	}

	/**
	 * Returns a formatted path for saving the source model
	 * 
	 * @param name      The test name
	 * @param extension The file extension of the result file
	 * @return The path as string
	 */
	protected String createSrcName(final String name, final String extension) {
		return String.format("%s" + TESTCASES_CREATED_OUTPUT + "%s.src.%s", out, name, extension);
	}

	/**
	 * Returns a formatted path for saving the target model
	 * 
	 * @param name The test name
	 * @return The path as string
	 */
	protected String createTrgFile(final String name, final String extension) {
		return String.format("%s" + TESTCASES_CREATED_OUTPUT + "%s.trg.%s", out, name, extension);
	}

	/**
	 * Returns a formatted path for saving the correspondence model
	 * 
	 * @param name The test name
	 * @return The path as string
	 */
	protected String createCorrName(final String name, final String extension) {
		return String.format("%s" + TESTCASES_CREATED_OUTPUT + "%s.corr.%s", out, name, extension);
	}

	/**
	 * Returns a formatted path for saving the transformation protocol
	 * 
	 * @param name The test name
	 * @return The path as string
	 */
	protected String createProtocolName(final String name, final String extension) {
		return String.format("%s" + TESTCASES_CREATED_OUTPUT + "%s.protocol.%s", out, name, extension);
	}

	/**
	 * Returns a formatted path for loading the expected results
	 * 
	 * @param name The test name
	 * @return The path as string
	 */
	protected String createExpectedName(final String name, final String extension) {
		return String.format("%s/Testcases/ExpectedResults/%s.%s", out, name, extension);
	}

}
