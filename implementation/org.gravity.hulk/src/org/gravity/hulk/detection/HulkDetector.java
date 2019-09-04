package org.gravity.hulk.detection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Deque;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.Messages;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.codesmells.HContollerClassDetector;
import org.gravity.hulk.detection.codesmells.HDataClassDetector;
import org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector;
import org.gravity.hulk.detection.codesmells.HLargeClassDetector;
import org.gravity.hulk.detection.codesmells.HLowCohesionDetector;
import org.gravity.hulk.detection.codesmells.HManyParametersDetector;
import org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector;
import org.gravity.hulk.exceptions.DetectionFailedException;
import org.moflon.core.dfs.DepthFirstSearch;
import org.moflon.core.dfs.DfsFactory;
import org.moflon.core.dfs.Node;

/**
 * This class provides the functionality to execute the anti-pattern detection
 * 
 * @author speldszus
 *
 */
public class HulkDetector {

	private static final Logger LOGGER = Logger.getLogger(HulkDetector.class.getName());

	private Map<String, String> thresholds;
	private HAntiPatternHandling hulk;
	private Set<HDetector> initialized;

	private boolean verbose;

	/**
	 * Creates a new detection instance disabling verbose
	 * 
	 * @param hulk       The detection configuration
	 * @param thresholds The thresholds for the detection
	 */
	public HulkDetector(HAntiPatternHandling hulk, Map<String, String> thresholds) {
		this(hulk, thresholds, false);
	}

	/**
	 * Creates a new detection instance
	 * 
	 * @param hulk       The detection configuration
	 * @param thresholds The thresholds for the detection
	 * @param verbose    The verbose state
	 */
	public HulkDetector(HAntiPatternHandling hulk, Map<String, String> thresholds, boolean verbose) {
		this.hulk = hulk;
		this.thresholds = thresholds;
		this.verbose = verbose;
		initialized = new HashSet<>();
		Resource eResource = hulk.eResource();
		if (eResource == null) {
			eResource = new ResourceSetImpl().createResource(URI.createURI("Hulk"));
			eResource.getContents().add(hulk);
		}
		eResource.getContents().add(hulk.getDependencyGraph());
	}

	private List<HDetector> getSorted(HDetector detector) {
		initDFS().processNode(detector);

		Comparator<Node> comp = new Comparator<Node>() {

			@Override
			public int compare(Node arg0, Node arg1) {
				return arg0.getPostTraversal() - arg1.getPostTraversal();
			}

		};

		List<HDetector> sorted = new ArrayList<>();
		for (HDetector n : hulk.getHDetector()) {
			if (n.getPreTraversal() > 0) {
				sorted.add(n);
			}
		}
		sorted.sort(comp);
		return sorted;
	}

	private void handleDetector(HDetector detector, Deque<HDetector> worklist, Set<HDetector> processedDetectors,
			boolean verbose) throws DetectionFailedException {
		List<HDetector> sorted = getSorted(detector);
		for (HDetector nextDetector : sorted) {
			if (processedDetectors.contains(nextDetector)) {
				continue;
			}
			if (worklist.contains(nextDetector)) {
				worklist.remove(nextDetector);
			}
			if (nextDetector instanceof HRelativeDetector) {
				initializeRelativeDetector((HRelativeDetector) nextDetector);
			}
			if (nextDetector.detect(hulk.getApg())) {
				nextDetector.setPostTraversal(0);
				nextDetector.setPreTraversal(0);
				processedDetectors.add(nextDetector);
			} else {
				LOGGER.log(Level.ERROR, Messages.getString("detector.failed") + nextDetector); //$NON-NLS-1$
			}

		}
	}

	/**
	 * Initializes the thresholds of the relative detector
	 * 
	 * @param relativeDetector The detector
	 * @throws DetectionFailedException If the stored threshold is not valid
	 */
	private void initializeRelativeDetector(HRelativeDetector relativeDetector) throws DetectionFailedException {
		if (!initialized.contains(relativeDetector)) {
			String key = relativeDetector.getClass().getName().replace("Impl", "").replace(".impl", "");
			if (thresholds.containsKey(key)) {
				relativeDetector.setRelative(false);
				String value = thresholds.get(key);
				HRelativeValueConstants constant = HRelativeValueConstants.getByName(value);
				if (constant != null) {
					relativeDetector.setThreshold(relativeDetector.calculateRelativeThreshold(constant));
				} else {
					Double number = Double.valueOf(value);
					if (number != null) {
						relativeDetector.setThreshold(number.doubleValue());
					} else {
						throw new DetectionFailedException(
								"The stored threshold of the metric \"" + key + "\" is not a double!");
					}
				}
			}
		}
	}

	private boolean detectSelectedAntiPattern(Deque<HDetector> worklist, Set<HDetector> processedDetectors,
			boolean verbose) throws DetectionFailedException {
		long h0 = 0;
		if (verbose) {
			h0 = System.currentTimeMillis();
			LOGGER.log(Level.INFO, h0 + " Hulk Anti-Pattern Detection");
		}
		while (!worklist.isEmpty()) {
			HDetector detector = worklist.pop();

			handleDetector(detector, worklist, processedDetectors, verbose);
		}
		if (verbose) {
			long h1 = System.currentTimeMillis();
			LOGGER.log(Level.INFO, h1 + " Hulk Anti-Pattern Detection - done " + (h1 - h0) + "ms");
		}

		return true;
	}

	/**
	 * Executes the anti-pattern detection with the selected detectors on the loaded
	 * program model
	 * 
	 * @param selection          The types of the selected detectors
	 * @param selectedDetectors  This set will contain the instances of the selected
	 *                           detectors after detection.
	 * @param processedDetectors This set will contain the instances of all executed
	 *                           detectors after detection.
	 * @return true, iff the detection has been performed successfully
	 */
	public boolean detectSelectedAntiPattern(Set<EClass> selection, Set<HDetector> selectedDetectors,
			Set<HDetector> processedDetectors) {
		Deque<HDetector> worklist = new LinkedList<>();

		// Fill worklist
		for (HDetector detector : hulk.getHDetector()) {
			if (selection.contains(detector.eClass())) {
				selectedDetectors.add(detector);
				worklist.add(detector);
			}
		}

		if (selectedDetectors.size() != selection.size()) {
			LOGGER.log(Level.ERROR, "Not all detecors found.");
			return false;
		}

		try {
			return detectSelectedAntiPattern(worklist, processedDetectors, this.verbose);
		} catch (DetectionFailedException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
		return false;
	}

	/**
	 * A getter for the default detection thresholds
	 * 
	 * @return The defaults
	 */
	public static Map<String, String> getDefaultThresholds() {
		Map<String, String> thresholds = new HashMap<String, String>();
		thresholds.put(HDataClassDetector.class.getName(), HRelativeValueConstants.HIGH.getName());
		thresholds.put(HLargeClassDetector.class.getName(), HRelativeValueConstants.VERY_HIGH.getName());
		thresholds.put(HLowCohesionDetector.class.getName(), HRelativeValueConstants.HIGH.getName());
		thresholds.put(HContollerClassDetector.class.getName(), HRelativeValueConstants.MEDIUM.getName());
		thresholds.put(HIntenseFieldUsageDetector.class.getName(), HRelativeValueConstants.VERY_HIGH.getName());
		thresholds.put(HMuchOverloadingDetector.class.getName(), HRelativeValueConstants.HIGH.getName());
		thresholds.put(HManyParametersDetector.class.getName(), HRelativeValueConstants.VERY_HIGH.getName());
		return thresholds;
	}

	private static DepthFirstSearch initDFS() {
		DepthFirstSearch dfs = DfsFactory.eINSTANCE.createDepthFirstSearch();
		DepthFirstSearch delegate = DfsFactory.eINSTANCE.createDepthFirstSearch();
		dfs.setDelegate(delegate);
		delegate.setDelegate(dfs);
		return dfs;
	}
}
