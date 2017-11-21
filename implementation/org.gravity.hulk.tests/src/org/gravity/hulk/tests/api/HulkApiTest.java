package org.gravity.hulk.tests.api;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.hulk.HulkAPI;
import org.gravity.hulk.HulkAPI.AntiPatternNames;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.metrics.HInappropriateGenerosityWithAccessibilityOfMethodMetric;
import org.gravity.hulk.antipatterngraph.metrics.HInappropriateGenerosityWithAccessibilityOfTypesMetric;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HulkApiTest {

	private IJavaProject javaProject;

	public HulkApiTest(String name, IJavaProject project) {
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
	public void detectBlobs() throws NoConverterRegisteredException {
		List<HAnnotation> results = HulkAPI.detect(javaProject, new NullProgressMonitor(), AntiPatternNames.Blob);
		System.out.println("Number of Blobs = " + results.size());
	}

	@Test
	public void detectIGAM() throws NoConverterRegisteredException {
		List<HAnnotation> results = HulkAPI.detect(javaProject, new NullProgressMonitor(), AntiPatternNames.IGAM);
		for(HAnnotation hAnnotation : results) {
			if(hAnnotation.getTAnnotated() instanceof TypeGraph) {
				System.out.println("IGAM = "+((HMetric) hAnnotation).getValue());
			}
		}
	}

	@Test
	public void detectIGAT() throws NoConverterRegisteredException {
		List<HAnnotation> results = HulkAPI.detect(javaProject, new NullProgressMonitor(), AntiPatternNames.IGAT);
		for(HAnnotation hAnnotation : results) {
			if(hAnnotation.getTAnnotated() instanceof TypeGraph) {
				System.out.println("IGAT = "+((HMetric) hAnnotation).getValue());
			}
		}
	}

	@Test
	public void detectAll() throws NoConverterRegisteredException {
		List<HAnnotation> results = HulkAPI.detect(javaProject, new NullProgressMonitor(), AntiPatternNames.Blob,
				AntiPatternNames.IGAT, AntiPatternNames.IGAM);
		int blobs = 0;
		for(HAnnotation hAnnotation : results) {
			if (hAnnotation instanceof HBlobAntiPattern) {
				blobs++;		
			}
			if(hAnnotation.getTAnnotated() instanceof TypeGraph) {
				if (hAnnotation instanceof HInappropriateGenerosityWithAccessibilityOfMethodMetric) {
					System.out.println("IGAM = "+((HMetric) hAnnotation).getValue());
				}
				else if (hAnnotation instanceof HInappropriateGenerosityWithAccessibilityOfTypesMetric) {
					System.out.println("IGAT = "+((HMetric) hAnnotation).getValue());
				}
			}
		}
		System.out.println("Blobs = "+blobs);
	}
}
