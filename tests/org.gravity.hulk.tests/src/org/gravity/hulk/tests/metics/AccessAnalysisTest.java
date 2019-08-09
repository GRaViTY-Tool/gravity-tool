package org.gravity.hulk.tests.metics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.GitCloneException;
import org.gravity.eclipse.io.GitTools;
import org.gravity.eclipse.tests.TestHelper;
import org.gravity.eclipse.util.EclipseProjectUtil;
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

	private IJavaProject javaProject;

	private TypeGraph pmExpect;

	/**
	 * Creates a new test instance for the given project
	 * 
	 * @param name    The name of the project
	 * @param project The project
	 * @param The     program model containing the expected annotations
	 * @throws IOException If the expected program model cannot be loaded
	 */
	public AccessAnalysisTest(String name, IJavaProject project, URL pmExpect) throws IOException {
		this.javaProject = project;
		Resource resource = new ResourceSetImpl().createResource(URI.createFileURI(pmExpect.getFile()));
		resource.load(pmExpect.openStream(), Collections.emptyMap());
		this.pmExpect = (TypeGraph) resource.getContents().get(0);
		LOGGER.log(Level.INFO, "Perform test on project: " + name);
	}

	/**
	 * Collects all Java projects in the workspace
	 * 
	 * @return The test data
	 */
	@Parameters(name = "{index}: Test HulkAPI on \"{0}\"")
	public static Collection<Object[]> collectProjects() throws CoreException, GitCloneException, IOException {
		File location = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile(), "repository");

		new GitTools("https://github.com/GRaViTY-Tool/gravity-evaluation-data.git", location, true, false).close();
		Map<IProject, URL> importProjects = EclipseProjectUtil
				.importProjects(new File(location, "gravity-evaluation-data")).parallelStream().map(p -> {
					URL entry = Platform.getBundle("org.gravity.hulk.tests").getEntry("expect/" + p.getName() + ".xmi");
					if (entry == null) {
						return null;
					} else {
						return new AbstractMap.SimpleEntry<IProject, URL>(p, entry);
					}
				}).filter(Objects::nonNull)
				.collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
		Collection<Object[]> testData = TestHelper.prepareTestData(importProjects.keySet());
		return testData.parallelStream()
				.map(o -> new Object[] { o[0], o[1], importProjects.get(((IJavaProject) o[1]).getProject()) })
				.collect(Collectors.toList());
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
		IProgressMonitor monitor = new NullProgressMonitor();
		TypeGraph pg = GravityAPI.createProgramModel(javaProject, monitor);

		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(pg);

		HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		hulk.setApg(apg);
		hulk.setProgramlocation(javaProject.getProject().getLocation().toString());

		HIGAMCalculator igam = MetricsFactory.eINSTANCE.createHIGAMCalculator();
		igam.setHAntiPatternHandling(hulk);
		assertTrue(igam.detect(apg));
		compareResults(igam.getHAnnotation());

		HIGATCalculator igat = MetricsFactory.eINSTANCE.createHIGATCalculator();
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
		for (HAnnotation annotation : annotations) {
			TAnnotatable expectedAnnotatedElement;
			TAnnotatable annotated = annotation.getTAnnotated();
			if (annotated instanceof TAbstractType) {
				String name = ((TAbstractType) annotated).getFullyQualifiedName();
				expectedAnnotatedElement = pmExpect.getAbstractType(name);
			} else if (annotated instanceof TPackage) {
				String name = ((TPackage) annotated).getFullyQualifiedName();
				expectedAnnotatedElement = pmExpect.getPackage(name);
			} else if (annotated instanceof TMember) {
				TAbstractType type = pmExpect.getType(((TMember) annotated).getDefinedBy().getFullyQualifiedName());
				assertNotNull(type);
				expectedAnnotatedElement = type.getTDefinition(((TMember) annotated).getSignatureString());
			} else if (annotated instanceof TypeGraph) {
				expectedAnnotatedElement = pmExpect;
			} else {
				String message = "Unhandeled element: " + annotated;
				LOGGER.error(message);
				fail(message);
				continue;
			}
			assertNotNull(expectedAnnotatedElement);
			EClass eClass = annotation.eClass();
			EList<TAnnotation> expectedAnnotations = expectedAnnotatedElement.getTAnnotation(eClass);
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
