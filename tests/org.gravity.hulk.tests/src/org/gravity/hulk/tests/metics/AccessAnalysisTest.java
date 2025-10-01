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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.GitCloneException;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.detection.metrics.impl.HIGAMCalculator;
import org.gravity.hulk.detection.metrics.impl.HIGATCalculator;
import org.gravity.hulk.impl.HAntiPatternDetectionImpl;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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

	private static final String[] projects = { "SecureMailApp" };

	/**
	 * Creates a new test instance for the given project
	 *
	 * @param name    The name of the project
	 * @param project The project
	 * @param The     program model containing the expected annotations
	 * @throws IOException If the expected program model cannot be loaded
	 */
	public AccessAnalysisTest(final String name, final URL pmInput, final URL pmExpect) throws IOException {
		final var resourceSet = new ResourceSetImpl();
		this.pmInput = (TypeGraph) this.loadModel(resourceSet, pmInput).get(0);
		this.pmExpect = (TypeGraph) this.loadModel(resourceSet, pmExpect).get(0);
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
	private EList<EObject> loadModel(final ResourceSetImpl set, final URL url) throws IOException {
		final var resource = set.createResource(URI.createFileURI(url.getFile()));
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
		final var bundle = Platform.getBundle("org.gravity.hulk.tests");
		final Collection<Object[]> results = new ArrayList<>(projects.length);
		for (final String name : projects) {
			final var input = bundle.getEntry("input/" + name + ".xmi");
			final var expect = bundle.getEntry("expect/" + name + ".xmi");
			results.add(new Object[] { name, input, expect });
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
		final var location = this.pmInput.eResource().getURI().toString();
		final var apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(this.pmInput);

		final HAntiPatternDetection hulk = new HAntiPatternDetectionImpl();
		hulk.setApg(apg);
		hulk.setProgramlocation(location);

		final var igat = new HIGATCalculator(hulk.getDependencyGraph());
		igat.setHAntiPatternHandling(hulk);
		assertTrue(igat.detect(apg));
		this.compareResults(igat.getHAnnotation());

		final var igam = new HIGAMCalculator(hulk.getDependencyGraph(), igat);
		igam.setHAntiPatternHandling(hulk);
		assertTrue(igam.detect(apg));
		this.compareResults(igam.getHAnnotation());
	}

	/**
	 * Compares the results of Hulk and the AccessAnalysis tool
	 *
	 * @param detector The igat calculator
	 */
	private void compareResults(final Collection<HAnnotation> annotations) {
		for (final HAnnotation annotation : annotations) {
			TAnnotatable expectedAnnotatedElement;
			final var annotated = annotation.getTAnnotated();
			if (annotated instanceof TAbstractType) {
				final var name = ((TAbstractType) annotated).getFullyQualifiedName();
				expectedAnnotatedElement = this.pmExpect.getType(name);
			} else if (annotated instanceof TPackage) {
				final var name = ((TPackage) annotated).getFullyQualifiedName();
				expectedAnnotatedElement = this.pmExpect.getPackage(name);
			} else if (annotated instanceof TMember) {
				final var type = this.pmExpect
						.getType(((TMember) annotated).getDefinedBy().getFullyQualifiedName());
				assertNotNull(type);
				expectedAnnotatedElement = type.getTDefinition(((TMember) annotated).getSignatureString());
			} else if (annotated instanceof TypeGraph) {
				expectedAnnotatedElement = this.pmExpect;
			} else {
				final var message = "Unhandeled element: " + annotated;
				LOGGER.error(message);
				fail(message);
				continue;
			}
			assertNotNull(expectedAnnotatedElement);
			final var eClass = annotation.eClass();
			final var expectedAnnotations = expectedAnnotatedElement.getTAnnotation(eClass);
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
