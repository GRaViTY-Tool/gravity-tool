package org.gravity.hulk.tests.metics;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.JavaHelper;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric;
import org.gravity.hulk.antipatterngraph.metrics.HIGATMetric;
import org.gravity.hulk.detection.metrics.HIGAMCalculator;
import org.gravity.hulk.detection.metrics.HIGATCalculator;
import org.gravity.hulk.detection.metrics.MetricsFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_hamburg.informatik.swt.accessanalysis.Analysis;
import de.uni_hamburg.informatik.swt.accessanalysis.AnalysisException;
import de.uni_hamburg.informatik.swt.accessanalysis.AnalysisFactory;
import de.uni_hamburg.informatik.swt.accessanalysis.AnalysisFactory.AnalysisMode;
import de.uni_hamburg.informatik.swt.accessanalysis.results.Result;

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

	/**
	 * Creates a new test instance for the given project
	 * 
	 * @param name The name of the project
	 * @param project The project
	 */
	public AccessAnalysisTest(String name, IJavaProject project) {
		this.javaProject = project;
		LOGGER.log(Level.INFO, "Perform test on project: " + name);
	}

	/**
	 * Collects all Java projects in the workspace
	 * 
	 * @return The test data
	 */
	@Parameters(name = "{index}: Test HulkAPI on \"{0}\"")
	public static Collection<Object[]> collectProjects() {
		Collection<Object[]> data = new LinkedList<>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (IProject project : root.getProjects()) {
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					IJavaProject javaProject = JavaCore.create(project);
					data.add(new Object[] { project.getName(), javaProject });
				}
			} catch (CoreException e) {
				LOGGER.log(Level.ERROR, e.toString());
			}
		}
		return data;
	}

	/**
	 * 
	 * Calculates IGAM and IGAT on all projects with Hulk and compares the values to those of the original AccessAnalysis
	 * 
	 * @throws AnalysisException If the AccessAnalysis tool failed
	 * @throws TransformationFailedException If a pm cannot be created
	 */
	@Test
	public void testAccessAnalysis() throws AnalysisException, TransformationFailedException {
		IProgressMonitor monitor = new NullProgressMonitor();
		TypeGraph pg = createProgramModel(javaProject, monitor);

		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(pg);

		HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		hulk.setApg(apg);
		hulk.setProgramlocation(javaProject.getProject().getLocation().toString());

		HIGAMCalculator igam = MetricsFactory.eINSTANCE.createHIGAMCalculator();
		igam.setHAntiPatternHandling(hulk);
		igam.detect(apg);

		HIGATCalculator igat = MetricsFactory.eINSTANCE.createHIGATCalculator();
		igat.setHAntiPatternHandling(hulk);
		igat.detect(apg);

		Analysis accessAnalysis = AnalysisFactory.analyzer(Arrays.asList(javaProject), AnalysisMode.ACCESS_QUIET);
		accessAnalysis.run(monitor);

		compareResults(pg, accessAnalysis.getResults());
	}

	/**
	 * Compares the results of Hulk and the AccessAnalysis tool
	 * 
	 * @param programModel The program model of Hulk
	 * @param accessAnalysis The result list of the AccessAnalysis tool
	 */
	private void compareResults(TypeGraph programModel, List<Result> accessAnalysis) {
		Stack<Result> stack = new Stack<>();
		stack.addAll(accessAnalysis);
		while (!stack.isEmpty()) {
			Result r = stack.pop();
			stack.addAll(r.getChildren());
			
			Collection<TAnnotation> tAnnotations = getTAnnotations(programModel, r);
			if(tAnnotations == null) {
				continue;
			}
			for (TAnnotation tAnnotation : tAnnotations) {
				double hValue = -1;
				double aValue = -1;
				String kind = null;
				if (tAnnotation instanceof HIGATMetric) {
					hValue = ((HIGATMetric) tAnnotation).getValue();
					aValue = Double.valueOf(r.getFormatter().igat());
					kind = "IGAT";
				} else if (tAnnotation instanceof HIGAMMetric) {
					hValue = ((HIGAMMetric) tAnnotation).getValue();
					aValue = Double.valueOf(r.getFormatter().igam());
					kind = "IGAM";
				}

				if (hValue != aValue) {
					String element = null;
					TAnnotatable tAnnotated = tAnnotation.getTAnnotated();
					if (tAnnotated instanceof TMember) {
						TMember tMember = (TMember) tAnnotated;
						element = "Member \"" + tMember.getDefinedBy().getFullyQualifiedName() + " -> "
								+ tMember.getSignatureString() + '\"';
					} else if (tAnnotated instanceof TAbstractType) {
						element = "Type \"" + ((TAbstractType) tAnnotated).getFullyQualifiedName() + '\"';
					} else if (tAnnotated instanceof TPackage) {
						element = "Package \"" + ((TPackage) tAnnotated).getFullyQualifiedName();

					} else if (tAnnotated instanceof TypeGraph) {
						element = "Java Project \"" + ((TypeGraph) tAnnotated).getTName() + "\"";
					}

					LOGGER.log(Level.ERROR,
							kind + " not equal for " + element + ": hulk=" + hValue + "\" aa=\"" + aValue + "\"");
				}
			}
		}
	}

	/**
	 * Searches the annotations corresponding with the AccessAnalysis result
	 * 
	 * @param programModel The program model
	 * @param result The AccessAnalysis result
	 * @return The corresponding annotations
	 */
	private Collection<TAnnotation> getTAnnotations(TypeGraph programModel, Result result) {
		EList<TAnnotation> tAnnotations = null;

		IJavaElement javaElement = result.getJavaElement();
		if (javaElement instanceof IJavaProject) {
			tAnnotations = programModel.getTAnnotation();
		} else if (javaElement instanceof IPackageFragmentRoot) {
			TPackage tPackage = programModel
					.getPackage(new String[] { ((IPackageFragmentRoot) javaElement).getElementName() });
			if (tPackage == null) {
				return null;
			}
			tAnnotations = tPackage.getTAnnotation();

		} else if (javaElement instanceof IPackageFragment) {
			List<String> namespace = new LinkedList<>();
			IJavaElement tmp = javaElement;
			while (tmp != null && tmp instanceof IPackageFragment) {
				String[] names = tmp.getElementName().split("\\.");
				for (int i = names.length - 1; i >= 0; i--) {
					namespace.add(0, names[i]);
				}
				tmp = tmp.getParent();
			}

			TPackage tPackage = programModel.getPackage(namespace.toArray(new String[namespace.size()]));

			tAnnotations = tPackage.getTAnnotation();
		} else if (javaElement instanceof IType) {
			TAbstractType tClass = programModel.getType(((IType) javaElement).getFullyQualifiedName());
			tAnnotations = tClass.getTAnnotation();
		} else if (javaElement instanceof IMethod) {
			TMethodDefinition tMethodDefinition = JavaHelper.getTMethodDefinition((IMethod) javaElement, programModel);
			tAnnotations = tMethodDefinition.getTAnnotation();
		}
		else {
			String message = "Annotations cannot be retrieved for the following element: "+javaElement;
			LOGGER.log(Level.ERROR, message);
			fail(message);
			return null;
		}
		return tAnnotations;
	}

	/**
	 * Discovers the Java project and creates a program model
	 * 
	 * @param project A Java project
	 * @param monitor A progress monitor
	 * @return The program model
	 * @throws TransformationFailedException If the program model cannot be created
	 */
	private TypeGraph createProgramModel(IJavaProject project, IProgressMonitor monitor) throws TransformationFailedException {
		IProject iproject = project.getProject();
		IPGConverter converter;
		try {
			converter = GravityActivator.getDefault().getNewConverter(iproject);
		} catch (CoreException | NoConverterRegisteredException e) {
			throw new TransformationFailedException(e);
		}

		boolean success = converter.convertProject(project, Collections.emptySet(), monitor);
		if (!success || converter.getPG() == null) {
			throw new TransformationFailedException(
					"Creating PG from project failed: " + project.getProject().getName());
		}
		TypeGraph pg = converter.getPG();
		return pg;
	}
}
