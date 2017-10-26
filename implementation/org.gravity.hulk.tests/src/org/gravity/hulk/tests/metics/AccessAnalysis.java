package org.gravity.hulk.tests.metics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.metrics.HInappropriateGenerosityWithAccessibilityOfMethodMetric;
import org.gravity.hulk.antipatterngraph.metrics.HInappropriateGenerosityWithAccessibilityOfTypesMetric;
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

@RunWith(Parameterized.class)
public class AccessAnalysis {

	private IJavaProject javaProject;

	public AccessAnalysis(String name, IJavaProject project) {
		this.javaProject = project;
	}

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
				e.printStackTrace();
			}
		}
		return data;
	}

	@Test
	public void test() throws NoConverterRegisteredException, AnalysisException {
		IProject iproject = javaProject.getProject();
		IPGConverter converter = GravityActivator.getDefault().getNewConverter(iproject);

		IProgressMonitor monitor = new NullProgressMonitor();
		boolean success = converter.convertProject(javaProject, Collections.emptySet(), monitor);
		if (!success || converter.getPG() == null) {
			throw new RuntimeException("Creating PG from project failed: " + javaProject.getProject().getName());
		}
		TypeGraph pg = converter.getPG();

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

		Stack<Result> stack = new Stack<>();
		stack.addAll(accessAnalysis.getResults());
		while (!stack.isEmpty()) {
			Result r = stack.pop();
			stack.addAll(r.getChildren());
			EList<TAnnotation> tAnnotations = null;

			IJavaElement javaElement = r.getJavaElement();
			if (javaElement instanceof IJavaProject) {
				tAnnotations = pg.getTAnnotation();
			} else if (javaElement instanceof IPackageFragmentRoot) {
				TPackage tPackage = pg
						.getPackage(new String[] { ((IPackageFragmentRoot) javaElement).getElementName() });
				if (tPackage == null) {
					continue;
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

				TPackage tPackage = pg.getPackage(namespace.toArray(new String[namespace.size()]));

				tAnnotations = tPackage.getTAnnotation();
			} else if (javaElement instanceof IType) {
				TAbstractType tClass = pg.getType(((IType) javaElement).getFullyQualifiedName());
				tAnnotations = tClass.getTAnnotation();
			} else if (javaElement instanceof IMethod) {
				TMethodDefinition tMethodDefinition = JavaHelper.getTMethodDefinition((IMethod) javaElement, pg);
				tAnnotations = tMethodDefinition.getTAnnotation();
			}

			for (TAnnotation tAnnotation : tAnnotations) {
				double hValue = -1;
				double aValue = -1;
				String kind = null;
				if (tAnnotation instanceof HInappropriateGenerosityWithAccessibilityOfTypesMetric) {
					hValue = ((HInappropriateGenerosityWithAccessibilityOfTypesMetric) tAnnotation).getValue();
					aValue = Double.valueOf(r.getFormatter().igat());
					kind = "IGAT";
				} else if (tAnnotation instanceof HInappropriateGenerosityWithAccessibilityOfMethodMetric) {
					hValue = ((HInappropriateGenerosityWithAccessibilityOfMethodMetric) tAnnotation).getValue();
					aValue = Double.valueOf(r.getFormatter().igam());
					kind = "IGAM";
				}

				if (hValue != aValue) {
					String element = null;
					TAnnotatable tAnnotated = tAnnotation.getTAnnotated();
					if (tAnnotated instanceof TMember) {
						TMember tMember = (TMember) tAnnotated;
						element = "Member \""+tMember.getDefinedBy().getFullyQualifiedName()+" -> "+tMember.getSignatureString()+ '\"';
					}
					else if (tAnnotated instanceof TAbstractType) {
						element = "Type \""+((TAbstractType) tAnnotated).getFullyQualifiedName()+ '\"';		
					}
					else if (tAnnotated instanceof TPackage) {
						element = "Package \""+((TPackage) tAnnotated).getFullyQualifiedName();
						
					}
					else if (tAnnotated instanceof TypeGraph) {
						element = "Java Project \""+((TypeGraph) tAnnotated).getTName()+"\"";
					}
					
					System.err.println(kind + " not equal for " + element + ": hulk=" + hValue + "\" aa=\"" + aValue + "\"");
				}
			}
		}
	}
}
