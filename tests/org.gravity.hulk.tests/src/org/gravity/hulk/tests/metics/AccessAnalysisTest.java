package org.gravity.hulk.tests.metics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.GitCloneException;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.detection.metrics.HIGAMCalculator;
import org.gravity.hulk.detection.metrics.HIGATCalculator;
import org.gravity.hulk.detection.metrics.MetricsFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.osgi.framework.Bundle;

/**
 * A test if our implementation of the IGAM and IGAT metrics return the results
 * as the original implementation
 *
 * @author speldszus
 *
 */
@RunWith(Parameterized.class)
public class AccessAnalysisTest {

	private static final Logger LOGGER = Logger.getLogger(AccessAnalysisTest.class.getName());

	private final TypeGraph pmExpect;
	private final TypeGraph pmInput;

	private static final String[] projects = new String[] {"SecureMailApp"};

	/**
	 * Creates a new test instance for the given project
	 *
	 * @param name    The name of the project
	 * @param project The project
	 * @param The     program model containing the expected annotations
	 * @throws IOException If the expected program model cannot be loaded
	 */
	public AccessAnalysisTest(String name, URL pmInput, URL pmExpect) throws IOException {
		final ResourceSetImpl resourceSet = new ResourceSetImpl();
		this.pmInput = (TypeGraph) loadModel(resourceSet, pmInput).get(0);
		this.pmExpect = (TypeGraph) loadModel(resourceSet, pmExpect).get(0);
		LOGGER.log(Level.INFO, "Perform test on project: " + name);
	}

	/**
	 * Loads the model from the given URL into the reousce set
	 *
	 * @param set The resource set
	 * @param url The url to the model
	 * @return The contents of the model
	 * @throws IOException If reading the model failed
	 */
	private EList<EObject> loadModel(ResourceSetImpl set, URL url) throws IOException {
		final Resource resource = set.createResource(URI.createFileURI(url.getFile()));
		resource.load(url.openStream(), Collections.emptyMap());
		return resource.getContents();
	}

	/**
	 * Collects all Java projects in the workspace
	 *
	 * @return The test data
	 */
	@Parameters(name = "{index}: Test HulkAPI on \"{0}\"")
	public static Collection<Object[]> collectProjects() throws CoreException, GitCloneException, IOException {
		final Bundle bundle = Platform.getBundle("org.gravity.hulk.tests");
		final Collection<Object[]> results = new ArrayList<>(projects.length);
		for(final String name : projects) {
			final URL input = bundle.getEntry("input/"+name+".xmi");
			final URL expect = bundle.getEntry("expect/"+name+".xmi");
			results.add(new Object[] {name, input, expect});
		}
		return results;
	}

	/**
	 *
	 * Calculates IGAM and IGAT on all projects with Hulk and compares the values to
	 * those of the original AccessAnalysis
	 *
	 * @throws AnalysisException             If the AccessAnalysis tool failed
	 * @throws TransformationFailedException If a pm cannot be created
	 */
	@Test
	public void testAccessAnalysis() throws TransformationFailedException {
		final String location = this.pmInput.eResource().getURI().toString();
		final HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(this.pmInput);

		final HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		hulk.setApg(apg);
		hulk.setProgramlocation(location);

		final HIGAMCalculator igam = MetricsFactory.eINSTANCE.createHIGAMCalculator();
		igam.setHAntiPatternHandling(hulk);
		assertTrue(igam.detect(apg));
		compareResults(igam.getHAnnotation());

		final HIGATCalculator igat = MetricsFactory.eINSTANCE.createHIGATCalculator();
		igat.setHAntiPatternHandling(hulk);
		assertTrue(igat.detect(apg));
		compareResults(igat.getHAnnotation());
	}

	/**
	 * Compares the results of Hulk and the AccessAnalysis tool
	 *
	 * @param detector The igat calculator
	 */
	private void compareResults(Collection<HAnnotation> annotations) {
		for (final HAnnotation annotation : annotations) {
			TAnnotatable expectedAnnotatedElement;
			final TAnnotatable annotated = annotation.getTAnnotated();
			if (annotated instanceof TAbstractType) {
				final String name = ((TAbstractType) annotated).getFullyQualifiedName();
				expectedAnnotatedElement = this.pmExpect.getType(name);
			} else if (annotated instanceof TPackage) {
				final String name = ((TPackage) annotated).getFullyQualifiedName();
				expectedAnnotatedElement = this.pmExpect.getPackage(name);
			} else if (annotated instanceof TMember) {
				final TAbstractType type = this.pmExpect.getType(((TMember) annotated).getDefinedBy().getFullyQualifiedName());
				assertNotNull(type);
				expectedAnnotatedElement = type.getTDefinition(((TMember) annotated).getSignatureString());
			} else if (annotated instanceof TypeGraph) {
				expectedAnnotatedElement = this.pmExpect;
			} else {
				final String message = "Unhandeled element: " + annotated;
				LOGGER.error(message);
				fail(message);
				continue;
			}
			assertNotNull(expectedAnnotatedElement);
			final EClass eClass = annotation.eClass();
			final EList<TAnnotation> expectedAnnotations = expectedAnnotatedElement.getTAnnotation(eClass);
			assertEquals(1, expectedAnnotations.size());
			if (AntipatterngraphPackage.eINSTANCE.getHMetric().isSuperTypeOf(eClass)) {
				assertEquals(((HMetric) expectedAnnotations.get(0)).getValue(), ((HMetric) annotation).getValue(),
						0.001);
			} else {
				LOGGER.warn("No detailed comparison for: " + eClass.getName());
			}
		}
	}
}
