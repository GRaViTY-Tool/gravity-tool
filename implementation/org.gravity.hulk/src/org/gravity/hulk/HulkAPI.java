package org.gravity.hulk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.hulk.exceptions.DetectionFailedException;
import org.gravity.typegraph.basic.TypeGraph;

public class HulkAPI {

	private static final Logger LOGGER = Logger.getLogger(HulkAPI.class);

	/**
	 * Detects given anti-patterns on an Eclipse java project
	 * 
	 * @param project The java project
	 * @param monitor A progress monitor, if null is given the variable is
	 *                instantiated with a new NullProgressMonitor
	 * @param aps     The list of anti-patterns to detect
	 * @return a lost of all detected anti-pattern instances
	 * @throws DetectionFailedException If the anti-pattern detection failed
	 */
	public static List<HAnnotation> detect(IJavaProject project, IProgressMonitor monitor, AntiPatternNames... aps)
			throws DetectionFailedException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		IProject iproject = project.getProject();
		IPGConverter converter;
		try {
			converter = GravityActivator.getDefault().getNewConverter(iproject);
		} catch (NoConverterRegisteredException | CoreException e) {
			throw new DetectionFailedException(e);
		}
		boolean success = converter.convertProject(project, Collections.emptySet(), monitor);
		TypeGraph pg = converter.getPG();
		if (!success || pg == null) {
			throw new DetectionFailedException(new TransformationFailedException(
					"Creating PG from project failed: " + project.getProject().getName()));
		}
		String programLocation = project.getProject().getLocation().toString();

		final List<HAnnotation> results = detect(pg, programLocation, aps);
		
		clean(iproject, converter, pg);
		
		return results;
	}

	public static List<HAnnotation> detect(TypeGraph pg, String programLocation, AntiPatternNames... aps)
			throws DetectionFailedException {
		ResourceSet rs = pg.eResource().getResourceSet();
		// TODO: keep PG in old resource set

		HAntiPatternGraph apg;
		EObject eContainer = pg.eContainer();
		if (eContainer == null || !(eContainer instanceof HAntiPatternGraph)) {
			apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
			apg.setPg(pg);
		} else {
			apg = (HAntiPatternGraph) eContainer;
		}

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
		if (!new HulkDetector(hulk, HulkDetector.getDefaultThresholds()).detectSelectedAntiPattern(detectors,
				detectorResults, new HashSet<>())) {
			throw new DetectionFailedException("Anti-pattern detection failed.");
		}

		List<HAnnotation> results = new ArrayList<>();
		for (HDetector detector : detectorResults) {
			for (HAnnotation annotation : detector.getHAnnotation()) {
				results.add(annotation);
			}
		}

		return results;
	}

	/**
	 * Removes all generated EMF models except for the PG
	 * 
	 * @param iproject The project which has been discovered
	 * @param converter The executed converter
	 * @param pg The created PG
	 * @return true, iff the cleanup was successful
	 */
	private static boolean clean(IProject iproject, IPGConverter converter, TypeGraph pg) {
		final Resource keep = pg.eResource();
		final EList<Resource> resources = converter.getResourceSet().getResources();
		while(!resources.isEmpty()) {
			Resource resource = resources.remove(0);
			if(resource != keep) {
				try {
					resource.delete(Collections.EMPTY_MAP);
				} catch (IOException e) {
					LOGGER.log(Level.WARN, "Cleaninig resource failed: "+e.getMessage(), e);
					return false;
				}
			}
		}
		resources.add(keep);
		return GravityActivator.getDefault().discardConverter(iproject);
	}

	public static enum AntiPatternNames {

		Blob, GodClass, SpaghettiCode, SwissArmyKnife, IGAM, IGAT, LCOM5, TotalCoupling, TotalMethodVisibility;

		public static AntiPatternNames get(EClass metricClass) {
			org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage antipattern = AntipatternPackage.eINSTANCE;
			if (antipattern.getHBlobAntiPattern().isSuperTypeOf(metricClass)) {
				return Blob;
			}
			if (antipattern.getHGodClassAntiPattern().isSuperTypeOf(metricClass)) {
				return GodClass;
			}
			if (antipattern.getHSpaghettiCodeAntiPattern().isSuperTypeOf(metricClass)) {
				return SpaghettiCode;
			}
			if (antipattern.getHSwissArmyKnifeAntiPattern().isSuperTypeOf(metricClass)) {
				return SwissArmyKnife;
			}
			org.gravity.hulk.antipatterngraph.metrics.MetricsPackage metricPackage = org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE;
			if (metricPackage.getHIGAMMetric().isSuperTypeOf(metricClass)) {
				return IGAM;
			}
			if (metricPackage.getHIGATMetric().isSuperTypeOf(metricClass)) {
				return IGAT;
			}
			if (metricPackage.getHLCOM5Metric().isSuperTypeOf(metricClass)) {
				return LCOM5;
			}
			if (metricPackage.getHTotalCouplingMetric().isSuperTypeOf(metricClass)) {
				return TotalCoupling;
			}
			if (metricPackage.getHTotalVisibilityMetric().isSuperTypeOf(metricClass)) {
				return TotalMethodVisibility;
			}
			return null;
		}
	}
}
