package org.gravity.hulk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TypeGraph;

public class HulkAPI {


	/**
	 * Detects given anti-patterns on an Eclipse java project
	 * 
	 * @param project The java project
	 * @param monitor A progress monitor, if null is given the variable is instantiated with a new NullProgressMonitor
	 * @param aps The list of anti-patterns to detect
	 * @return a lost of all detected anti-pattern instances
	 * @throws NoConverterRegisteredException if no converter from java sourcecode to the program model has been registered
	 */
	public static List<HAnnotation> detect(IJavaProject project, IProgressMonitor monitor, AntiPatternNames... aps) throws NoConverterRegisteredException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		IProject iproject = project.getProject();
		IPGConverter converter = GravityActivator.getDefault().getNewConverter(iproject);
		boolean success = converter.convertProject(project, Collections.emptySet(), monitor);
		TypeGraph pg = converter.getPG();
		if (!success || pg == null) {
			throw new RuntimeException("Creating PG from project failed: " + project.getProject().getName());
		}
		String programLocation = project.getProject().getLocation().toString();
		
		return detect(pg, programLocation, aps);
	}

	public static List<HAnnotation> detect(TypeGraph pg, String programLocation, AntiPatternNames... aps) {
		ResourceSet rs = pg.eResource().getResourceSet();
		//TODO: keep PG in old resource set
		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(pg);

		HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		hulk.setApg(apg);
		hulk.setProgramlocation(programLocation);

		rs.createResource(URI.createURI("Hulk.xmi")).getContents().add(hulk); //$NON-NLS-1$

		rs.createResource(URI.createURI("SmellDependencyGraph.xmi")).getContents().add(hulk.getDependencyGraph()); //$NON-NLS-1$

		Set<EClass> detectors = new HashSet<>();
		for (AntiPatternNames name : aps) {
			switch (name) {
			case Blob:
				detectors.add(AntipatternPackageImpl.eINSTANCE.getHBlobDetector());
				break;
			case GodClass:
				detectors.add(AntipatternPackageImpl.eINSTANCE.getHGodClassDetector());
				break;
			case SwissArmyKnife:
				detectors.add(AntipatternPackageImpl.eINSTANCE.getHSwissArmyKnifeDetector());
				break;
			case SpaghettiCode:
				detectors.add(AntipatternPackageImpl.eINSTANCE.getHSpaghettiCodeDetector());
				break;
			case IGAM:
				detectors.add(MetricsPackage.eINSTANCE.getHIGAMCalculator());
				break;
			case IGAT:
				detectors.add(MetricsPackage.eINSTANCE.getHIGATCalculator());
				break;
			case LCOM5:
				detectors.add(MetricsPackage.eINSTANCE.getHLcom5Calculator());
				break;
			case TotalCoupling:
				detectors.add(MetricsPackage.eINSTANCE.getHTotalCouplingCalculator());
				break;
			case TotalMethodVisibility:
				detectors.add(MetricsPackage.eINSTANCE.getHTotalVisibilityCalculator());
				break;
			}
		}
		HashSet<HDetector> detectorResults = new HashSet<>();
		if (!new HulkDetector(hulk, HulkDetector.getDefaultThresholds()).detectSelectedAntiPattern(detectors, detectorResults, new HashSet<>())) {
			throw new RuntimeException("Anti-pattern detection failed.");
		}

		List<HAnnotation> results = new ArrayList<>();
		for (HDetector detector : detectorResults) {
			for (HAnnotation annotation : detector.getHAnnotation()) {
				results.add(annotation);
			}
		}

		return results;
	}

	public static enum AntiPatternNames {
		Blob, GodClass, SpaghettiCode, SwissArmyKnife, IGAM, IGAT, LCOM5, TotalCoupling, TotalMethodVisibility
	}
}
