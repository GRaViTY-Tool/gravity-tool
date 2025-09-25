package org.gravity.hulk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.hulk.exceptions.DetectionFailedException;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * This class provides an API for easily using the Hulk anti-pattern detection
 *
 * @author speldszus
 *
 */
public final class HulkAPI {

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
	 * @param monitor A progress monitor or null if no monitor is needed
	 * @param aps     The list of anti-patterns to detect
	 * @return a list of all detected anti-pattern instances
	 * @throws DetectionFailedException If the anti-pattern detection failed
	 */
	public static List<HAnnotation> detect(final IJavaProject project, final IProgressMonitor monitor, final AntiPatternNames... aps)
			throws DetectionFailedException {
		final var iproject = project.getProject();
		IPGConverter converter;
		try {
			converter = GravityActivator.getDefault().getNewConverter(iproject);
		} catch (NoConverterRegisteredException | CoreException e) {
			throw new DetectionFailedException(e);
		}
		final var success = converter.convertProject(monitor);
		final var pg = converter.getPG();
		if (!success || (pg == null)) {
			throw new DetectionFailedException(new TransformationFailedException(
					"Creating PG from project failed: " + project.getProject().getName()));
		}
		final var programLocation = project.getProject().getLocation().toString();

		final var results = detect(pg, programLocation, aps);

		converter.discard();
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
	public static List<HAnnotation> detect(final TypeGraph pm, final String programLocation, final AntiPatternNames... aps)
			throws DetectionFailedException {
		ResourceSet rs;
		var pgResource = pm.eResource();
		if (pgResource == null) {
			rs = new ResourceSetImpl();
			pgResource = rs.createResource(URI.createURI(pm.getTName() + ".xmi"));
			pgResource.getContents().add(pm);
		} else {
			rs = pgResource.getResourceSet();
		}

		final var hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		final var apgResource = rs.createResource(URI.createURI("Hulk.xmi"));
		apgResource.getContents().add(hulk); // $NON-NLS-1$
		hulk.setProgramlocation(programLocation);

		final var apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		hulk.setApg(apg);
		apg.setPg(pm);

		final var detectors = getDetecors(aps);
		final var detectorResults = new HashSet<HDetector>();
		if (!new HulkDetector(hulk, HulkDetector.getDefaultThresholds()).detectSelectedAntiPattern(detectors,
				detectorResults, new HashSet<>())) {
			throw new DetectionFailedException("Anti-pattern detection failed.");
		}

		final List<HAnnotation> results = new ArrayList<>();
		for (final HDetector detector : detectorResults) {
			results.addAll(detector.getHAnnotation());
		}

		return results;
	}

	/**
	 * Creates detector instances for all given anti-patterns
	 *
	 * @param aps The anti-patterns
	 * @return The list of detectors
	 */
	private static Set<EClass> getDetecors(final AntiPatternNames... aps) {
		final Set<EClass> detectors = new HashSet<>();
		for (final AntiPatternNames name : aps) {
			detectors.add(name.getEClass());
		}
		return detectors;
	}

	/**
	 * An enumeration over all anti-patterns supported by the HulkAPI
	 *
	 * @author speldszus
	 *
	 */
	public enum AntiPatternNames {

		BLOB(AntipatternPackage.eINSTANCE.getHBlobDetector()),
		GOD_CLASS(AntipatternPackage.eINSTANCE.getHGodClassDetector()),
		SPAGHETTI_CODE(AntipatternPackage.eINSTANCE.getHSpaghettiCodeDetector()),
		SWISS_ARMY_KNIFE(AntipatternPackage.eINSTANCE.getHSwissArmyKnifeDetector()),
		IGAM(MetricsPackage.eINSTANCE.getHIGAMCalculator()), IGAT(MetricsPackage.eINSTANCE.getHIGATCalculator()),
		LCOM5(MetricsPackage.eINSTANCE.getHLcom5Calculator()),
		TOTAL_COUPLING(MetricsPackage.eINSTANCE.getHTotalCouplingCalculator()),
		TOTAL_METHOD_VISIBILITY(MetricsPackage.eINSTANCE.getHTotalVisibilityCalculator()),
		DIT(MetricsPackage.eINSTANCE.getHDepthOfInheritanceCalculator());

		private final EClass eClass;

		AntiPatternNames(final EClass eClass) {
			this.eClass = eClass;
		}

		/**
		 * Get the enum constant corresponding with the EClass of a given anti-pattern
		 * annotation
		 *
		 * @param metricClass The EClass of the anti-pattern annotation
		 * @return The corresponding enum constant
		 */
		public static AntiPatternNames get(final EClass metricClass) {
			for (final AntiPatternNames name : AntiPatternNames.values()) {
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
			return this.eClass;
		}
	}
}
