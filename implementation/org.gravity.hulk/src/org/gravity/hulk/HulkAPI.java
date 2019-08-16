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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.hulk.exceptions.DetectionFailedException;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * This class provides an API for easily using the Hulk anti-pattern detection
 * 
 * @author speldszus
 *
 */
public class HulkAPI {

	/**
	 * The Logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(HulkAPI.class);

	private HulkAPI() {
		// This class shouldn't be instantiated
	}

	/**
	 * Detects given anti-patterns on an Eclipse java project
	 * 
	 * @param project The java project
	 * @param monitor A progress monitor, if null is given the variable is
	 *                instantiated with a new NullProgressMonitor
	 * @param aps     The list of anti-patterns to detect
	 * @return a list of all detected anti-pattern instances
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
		GravityActivator.getDefault().discardConverter(iproject);
		if (!success || pg == null) {
			throw new DetectionFailedException(new TransformationFailedException(
					"Creating PG from project failed: " + project.getProject().getName()));
		}
		String programLocation = project.getProject().getLocation().toString();

		final List<HAnnotation> results = detect(pg, programLocation, aps);

		clean(iproject, pg);

		return results;
	}

	/**
	 * Detects given anti-patterns on a program model
	 * 
	 * @param pm              The program model
	 * @param programLocation The location of the project from which the model has
	 *                        been created
	 * @param aps             The list of anti-patterns to detect
	 * @return a list of all detected anti-pattern instances
	 * @throws DetectionFailedException If the anti-pattern detection failed
	 */
	public static List<HAnnotation> detect(TypeGraph pm, String programLocation, AntiPatternNames... aps)
			throws DetectionFailedException {
		ResourceSet rs;
		Resource pgResource = pm.eResource();
		if (pgResource == null) {
			rs = new ResourceSetImpl();
			pgResource = rs.createResource(URI.createURI(pm.getTName() + ".xmi"));
			pgResource.getContents().add(pm);
		} else {
			rs = pgResource.getResourceSet();
		}

		HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		Resource apgResource = rs.createResource(URI.createURI("Hulk.xmi"));
		apgResource.getContents().add(hulk); // $NON-NLS-1$
		hulk.setProgramlocation(programLocation);

		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		hulk.setApg(apg);
		apg.setPg(pm);
//		apgResource.getContents().add(apg);

		Set<EClass> detectors = getDetecors(aps);
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
	 * Creates detector instances for all given anti-patterns
	 * 
	 * @param aps The anti-patterns
	 * @return The list of detectors
	 */
	private static Set<EClass> getDetecors(AntiPatternNames... aps) {
		Set<EClass> detectors = new HashSet<>();
		for (AntiPatternNames name : aps) {
			detectors.add(name.getEClass());
		}
		return detectors;
	}

	/**
	 * Removes all generated EMF models except for the PG
	 * 
	 * @param iproject  The project which has been discovered
	 * @param pg        The created PG
	 * @return true, iff the cleanup was successful
	 */
	private static boolean clean(IProject iproject, TypeGraph pg) {
		final Resource keep = pg.eResource();
		final EList<Resource> resources = keep.getResourceSet().getResources();
		while (!resources.isEmpty()) {
			Resource resource = resources.remove(0);
			if (resource != keep) {
				try {
					resource.delete(Collections.emptyMap());
				} catch (IOException e) {
					LOGGER.log(Level.WARN, "Cleaninig resource failed: " + e.getMessage(), e);
					return false;
				}
			}
		}
		resources.add(keep);
		return GravityActivator.getDefault().discardConverter(iproject);
	}

	/**
	 * An enumeration over all anti-patterns supported by the HulkAPI
	 * 
	 * @author speldszus
	 *
	 */
	public enum AntiPatternNames {

		BLOB(AntipatternPackageImpl.eINSTANCE.getHBlobDetector()),
		GOD_CLASS(AntipatternPackageImpl.eINSTANCE.getHGodClassDetector()),
		SPAGHETTI_CODE(AntipatternPackageImpl.eINSTANCE.getHSpaghettiCodeDetector()),
		SWISS_ARMY_KNIFE(AntipatternPackageImpl.eINSTANCE.getHSwissArmyKnifeDetector()),
		IGAM(MetricsPackage.eINSTANCE.getHIGAMCalculator()), IGAT(MetricsPackage.eINSTANCE.getHIGATCalculator()),
		LCOM5(MetricsPackage.eINSTANCE.getHLcom5Calculator()),
		TOTAL_COUPLING(MetricsPackage.eINSTANCE.getHTotalCouplingCalculator()),
		TOTAL_METHOD_VISIBILITY(MetricsPackage.eINSTANCE.getHTotalVisibilityCalculator()),
		DIT(MetricsPackage.eINSTANCE.getHDepthOfInheritanceCalculator());

		private final EClass eClass;

		private AntiPatternNames(EClass eClass) {
			this.eClass = eClass;
		}

		/**
		 * Get the enum constant corresponding with the EClass of a given anti-pattern
		 * annotation
		 * 
		 * @param metricClass The EClass of the anti-pattern annotation
		 * @return The corresponding enum constant
		 */
		public static AntiPatternNames get(EClass metricClass) {
			for (AntiPatternNames name : AntiPatternNames.values()) {
				if (name.getEClass().isSuperTypeOf(metricClass)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * A getter for the EClass of the calculator
		 * 
		 * @return the eClass
		 */
		public EClass getEClass() {
			return eClass;
		}
	}
}
