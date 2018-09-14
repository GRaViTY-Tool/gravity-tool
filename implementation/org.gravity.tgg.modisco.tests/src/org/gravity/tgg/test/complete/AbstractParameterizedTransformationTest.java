package org.gravity.tgg.test.complete;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.tgg.test.activator.MoDiscoTestActivator;
import org.gravity.tgg.test.util.ToFileLogger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * An abstract test template collecting test java projects and allows to test transformations on them.
 * 
 *  The test has to be launched as junit plugin test
 * 
 * @author speldszus
 *
 */
@RunWith(Parameterized.class)
public abstract class AbstractParameterizedTransformationTest {

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
	 * @param name The name of the project
	 * @param project The project
	 */
	public AbstractParameterizedTransformationTest(String name, IJavaProject project) {
		this.project = project;
		this.name = name;
		this.out = Platform.getBundle(MoDiscoTestActivator.PLUGIN_ID).getLocation().substring("platform:/base/".length());
		
		// Set up logging
		BasicConfigurator.configure();
	}

	/**
	 * The method for collecting the java projects from the workspace.
	 * 
	 * This constructor should be only called by junit!
	 * 
	 * @return The test parameters as needed by junit paramterized tests
	 */
	@Parameters(name = "{index}: Forward Transformation From Src: {0}")
	public static final Collection<Object[]> data() {
		List<Object[]> testcases = new ArrayList<>();

		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		for (IProject test : projects) {
			try {
				if (test.getNature(JavaCore.NATURE_ID) != null) {
					testcases.add(new Object[] { test.getName(), JavaCore.create(test) });
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return testcases;
	}

	/**
	 * The method in which tests on eclipse java projects can be defined
	 */
	@Test
	public abstract void testForward();

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
	 * A helper method for deleting files
	 * 
	 * @param filepath The path of the file
	 * @return true, iff the file has been deleted successfully
	 */
	protected boolean deleteFile(final String filepath) {
		final URI uri = URI.createFileURI(filepath);
		final File file = new File(uri.toFileString());
		if (file.exists()) {
			return file.delete();
		}
		return true;
	}

	/**
	 * Returns a formatted path for saving the source model
	 * 
	 * @param name The test name
	 * @return The path as string
	 */
	protected String createSrcName(final String name) {
		return String.format("%s/Testcases/CreatedOutput/%s.src.xmi", out, name);
	}

	/**
	 * Returns a formatted path for saving the target model
	 * 
	 * @param name The test name
	 * @return The path as string
	 */
	protected String createTrgName(final String name) {
		return String.format("%s/Testcases/CreatedOutput/%s.trg.xmi", out, name);
	}

	/**
	 * Returns a formatted path for saving the correspondence model
	 * 
	 * @param name The test name
	 * @return The path as string
	 */
	protected String createCorrName(final String name) {
		return String.format("%s/Testcases/CreatedOutput/%s.corr.xmi", out, name);
	}

	/**
	 * Returns a formatted path for saving the transformation protocol
	 * 
	 * @param name The test name
	 * @return The path as string
	 */
	protected String createProtocolName(final String name) {
		return String.format("%s/Testcases/CreatedOutput/%s.protocol.xmi", out, name);
	}

	/**
	 * Returns a formatted path for loading the expected results
	 * 
	 * @param name The test name
	 * @return The path as string
	 */
	protected String createExpectedName(final String name) {
		return String.format("%s/Testcases/ExpectedResults/%s.xmi", out, name);
	}

}
