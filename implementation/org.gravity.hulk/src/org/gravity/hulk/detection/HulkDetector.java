package org.gravity.hulk.detection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.Stack;
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

	private static final Logger LOGGER = Logger.getLogger( HulkDetector.class.getName() );
	
	private Hashtable<String, String> thresholds;
	private HAntiPatternHandling hulk;
	private Set<HDetector> initialized;
	
	private boolean verbose;

	/**
	 * Creates a new detection instance disabling verbose
	 * 
	 * @param hulk The detection configuration
	 * @param thresholds The thresholds for the detection
	 */
	public HulkDetector(HAntiPatternHandling hulk, Hashtable<String, String> thresholds){
		this(hulk, thresholds, false);
	}
	
	/**
	 * Creates a new detection instance
	 * 
	 * @param hulk The detection configuration
	 * @param thresholds The thresholds for the detection
	 * @param verbose The verbose state
	 */
	public HulkDetector(HAntiPatternHandling hulk, Hashtable<String, String> thresholds, boolean verbose) {
		this.hulk = hulk;
		this.thresholds = thresholds;
		this.verbose = verbose;
		initialized = new HashSet<>();
		Resource eResource = hulk.eResource();
		if(eResource == null) {
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

	private void handleDetector(HDetector detector, Stack<HDetector> worklist, Set<HDetector> processed_detectors,
			boolean verbose) throws DetectionFailedException {
		List<HDetector> sorted = getSorted(detector);
		for (HDetector n : sorted) {
			long t2 = 0;
			if (!processed_detectors.contains(n)) {
				if (worklist.contains(n)) {
					worklist.remove(n);
				}
				if (verbose) {
					t2 = System.currentTimeMillis();
					LOGGER.log( Level.INFO, t2 + " Hulk " + n.getGuiName());
				}
				if (n instanceof HRelativeDetector) {
					HRelativeDetector relativeDetector = (HRelativeDetector) n;
					String key = relativeDetector.getClass().getName().replace("Impl", "").replace(".impl", "");
					if (thresholds.containsKey(key)) {
						if (!initialized.contains(detector)) {
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
									throw new DetectionFailedException("The stored threshold of the metric \""+ key
											+ "\" is not a double!");
								}
							}
						}
					}
				}
				if (n.detect(hulk.getApg())) {
					n.setPostTraversal(0);
					n.setPreTraversal(0);
					processed_detectors.add(n);
				} else {
					LOGGER.log(Level.ERROR, Messages.getString("detector.failed") + n); //$NON-NLS-1$
				}
				if (verbose) {
					long t3 = System.currentTimeMillis();
					LOGGER.log( Level.INFO, t3 + " Hulk " + n.getGuiName() + " - done " + (t3 - t2) + "ms");
				}
			}
		}
	}

	private boolean detectSelectedAntiPattern(Stack<HDetector> worklist, Set<HDetector> processed_detectors,
			boolean verbose) throws DetectionFailedException {
		long h0 = 0;
		if (verbose) {
			h0 = System.currentTimeMillis();
			LOGGER.log( Level.INFO, h0 + " Hulk Anti-Pattern Detection");
		}
		while (!worklist.isEmpty()) {
			HDetector detector = worklist.pop();

			handleDetector(detector, worklist, processed_detectors, verbose);
		}
		if (verbose) {
			long h1 = System.currentTimeMillis();
			LOGGER.log( Level.INFO, h1 + " Hulk Anti-Pattern Detection - done " + (h1 - h0) + "ms");
		}

		return true;
	}

	/**
	 * Executes the anti-pattern detection with the selected detectors on the loaded program model
	 * 
	 * @param selection The types of the selected detectors
	 * @param selectedDetectors This set will contain the instances of the selected detectors after detection.
	 * @param processedDetectors This set will contain the instances of all executed detectors after detection.
	 * @return true, iff the detection has been performed successfully
	 */
	public boolean detectSelectedAntiPattern(Set<EClass> selection, Set<HDetector> selectedDetectors,
			Set<HDetector> processedDetectors) {
		Stack<HDetector> worklist = new Stack<>();

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
	public static Hashtable<String, String> getDefaultThresholds() {
		Hashtable<String, String> thresholds = new Hashtable<String, String>();
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
