package org.gravity.hulk.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPattern;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.detection.antipattern.AntipatternFactory;

public class HulkAPI {


	/**
	 * Detects given anti-patterns on an Eclipse java project
	 * 
	 * @param project The java project
	 * @param monitor A progress monitor, if null is given the variable is instantiated with a new NullProgressMonitor
	 * @param aps The list of anti-patterns to detect
	 * @return a lost of all detected anti-pattern instances
	 */
	public static List<HAntiPattern> detect(IJavaProject project, IProgressMonitor monitor, AntiPatternNames... aps) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		IPGConverter converter = GravityActivator.getDefault().getNewConverter(project.getProject());
		boolean success = converter.convertProject(project, Collections.emptySet(), monitor);
		if (!success || converter.getPG() == null) {
			throw new RuntimeException("Creating PG from project failed: " + project.getProject().getName());
		}
		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(converter.getPG());

		HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		hulk.setApg(apg);
		hulk.setProgramlocation(project.getProject().getLocation().toString());

		ResourceSet rs = converter.getResourceSet();
		rs.createResource(URI.createURI("Hulk.xmi")).getContents().add(hulk); //$NON-NLS-1$

		rs.createResource(URI.createURI("SmellDependencyGraph.xmi")).getContents().add(hulk.getDependencyGraph()); //$NON-NLS-1$

		Stack<HDetector> detectors = new Stack<>();
		for (AntiPatternNames name : aps) {
			switch (name) {
			case Blob:
				detectors.add(AntipatternFactory.eINSTANCE.createHBlobDetector());
				break;
			case GodClass:
				detectors.add(AntipatternFactory.eINSTANCE.createHGodClassDetector());
				break;
			case SwissArmyKnife:
				detectors.add(AntipatternFactory.eINSTANCE.createHSwissArmyKnifeDetector());
				break;
			case SpaghettiCode:
				detectors.add(AntipatternFactory.eINSTANCE.createHSpaghettiCodeDetector());
				break;
			}
		}
		if (!HulkDetector.detectSelectedAntiPattern(detectors, new HashSet<>(), hulk)) {
			throw new RuntimeException("Anti-pattern detection failed.");
		}

		List<HAntiPattern> results = new ArrayList<>();
		for (HDetector detector : detectors) {
			for (HAnnotation annotation : detector.getHAnnotation()) {
				if (annotation instanceof HAntiPattern) {
					results.add((HAntiPattern) annotation);
				} else {
					throw new RuntimeException("Element in results is no anti-pattern: " + annotation);
				}
			}
		}

		return results;
	}

	public static enum AntiPatternNames {
		Blob, GodClass, SpaghettiCode, SwissArmyKnife
	}
}
