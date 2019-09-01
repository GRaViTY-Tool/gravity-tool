package org.gravity.modisco.dataflow.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.gravity.eclipse.GravityActivator;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

/**
 * A parameterized test for testing the dataflow extension of GRaViTY
 * 
 * @author speldszus
 *
 */
@RunWith(Parameterized.class)
public class DataflowProcessingTest {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(DataflowProcessingTest.class);

	private static final boolean VERBOSE = false;
	
	/**
	 * The project the tests should be performed on
	 */
	private final IJavaProject project;
	
	/**
	 * Creates a new instance of this test
	 * 
	 * @param name The name of the test
	 * @param project The project to test on
	 */
	public DataflowProcessingTest(String name, IJavaProject project) {
		this.project = project;
		GravityActivator.getDefault().setVerbose(VERBOSE);
	}
	
	@BeforeClass
	public static void configureLogger() {
		BasicConfigurator.configure();
		LOGGER.setLevel(Level.ALL);
	}
	
	/**
	 * Collects the test cases from the test workspace
	 * 
	 * @return A collection of test configurations as name - project pair
	 */
	@Parameters(name="{0}")
	public static Collection<Object[]> collectTestcases() {
		Collection<Object[]> testCases = new LinkedList<>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		for (IProject test : projects) {
			try {
				if (test.getNature(JavaCore.NATURE_ID) != null) {
					testCases.add(new Object[] { test.getName(), JavaCore.create(test) });
				}
			} catch (CoreException e) {
				LOGGER.log(Level.ERROR, e);
			}
		}
		return testCases;
	}
	
	/**
	 * Transforms every input project and checks the created model
	 *  
	 * @throws DiscoveryException If the discovery failed
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void test() throws DiscoveryException, FileNotFoundException, IOException {
		MGravityModel pm = new GravityModiscoProjectDiscoverer().discoverMGravityModelFromProject(project, new NullProgressMonitor());
		pm.eResource().save(new FileOutputStream("out/"+pm.getName()+".xmi"), Collections.emptyMap());
		
		assertNotNull(pm);
		
		// Check, if element counts (e. g. number of TFlows) are as expected
		IPath path = project.getProject().getLocation().addTrailingSeparator().append("expectModisco.json");
		File file = new File(path.toString());
		if (file.exists()) {
			JsonObject map;
			try (FileReader fileReader = new FileReader(file)) {
				map = (JsonObject) Jsoner.deserialize(fileReader);
			} catch (IOException | JsonException e) {
				LOGGER.error(e.getMessage(), e);
				return;
			}
			TreeIterator<EObject> it = pm.eResource().getAllContents();
			BigDecimal one = new BigDecimal(1);
			while (it.hasNext()) {
				EObject eObject = it.next();
				//						e.eClass().getEAllSuperTypes(); // TODO Count super types as well
				String typeName = eObject.eClass().getName();
				if (map.containsKey(typeName)) {
					BigDecimal count = (BigDecimal) map.get(typeName);
					map.put(typeName, count.subtract(one));
				}
			}
			for (Entry<String, Object> entry : map.entrySet()) {
				Object value = entry.getValue();
				assertEquals(value + " elements of type " + entry.getKey() + " could not be transformed.", 0,
						((BigDecimal) value).intValue());
			}
		}
	}
}
