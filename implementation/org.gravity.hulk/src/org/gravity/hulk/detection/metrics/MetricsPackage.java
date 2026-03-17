package org.gravity.hulk.detection.metrics;

import java.util.Arrays;
import java.util.List;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.detection.HulkDetectionPackage;
import org.gravity.hulk.detection.metrics.impl.HAfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculator;
import org.gravity.hulk.detection.metrics.impl.HAverageParametersCalculator;
import org.gravity.hulk.detection.metrics.impl.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.impl.HEfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.impl.HFieldNumberCalculator;
import org.gravity.hulk.detection.metrics.impl.HGetterCalculator;
import org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculator;
import org.gravity.hulk.detection.metrics.impl.HIGAMCalculator;
import org.gravity.hulk.detection.metrics.impl.HIGATCalculator;
import org.gravity.hulk.detection.metrics.impl.HIncommingInvocationCalculator;
import org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculator;
import org.gravity.hulk.detection.metrics.impl.HLcom5Calculator;
import org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculator;
import org.gravity.hulk.detection.metrics.impl.HLocalFieldUniqueAccessCalculator;
import org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculator;
import org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculator;
import org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculator;
import org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculator;
import org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculator;
import org.gravity.hulk.detection.metrics.impl.HOutgoingInvocationCalculator;
import org.gravity.hulk.detection.metrics.impl.HSetterCalculator;
import org.gravity.hulk.detection.metrics.impl.HTotalCouplingCalculator;
import org.gravity.hulk.detection.metrics.impl.HTotalVisibilityCalculator;

public class MetricsPackage extends HulkDetectionPackage {

	public static final MetricsPackage INSTANCE = new MetricsPackage();

	private MetricsPackage() {
		super("Code Metrics",
				Arrays.asList(
						HAfferentCouplingCalculator.class,
						HAverageOverloadingInClassCalculator.class,
						HAverageParametersCalculator.class,
						HDepthOfInheritanceCalculator.class,
						HEfferentCouplingCalculator.class,
						HFieldNumberCalculator.class,
						HGetterCalculator.class,
						HGetterSetterMethodRelationCalculator.class,
						HIGAMCalculator.class,
						HIGATCalculator.class,
						HIncommingInvocationCalculator.class,
						HInvocationRelationCalculator.class,
						HLcom5Calculator.class,
						HLocalAccessRelationCalculator.class,
						HLocalFieldsAccessCalculator.class,
						HLocalFieldUniqueAccessCalculator.class,
						HLocalMethodAccessCalculator.class,
						HMemberNumberCalculator.class,
						HMethodNumberCalculator.class,
						HNumberOfChildCalculator.class,
						HOutgoingInvocationCalculator.class,
						HSetterCalculator.class,
						HTotalCouplingCalculator.class,
						HTotalVisibilityCalculator.class));
	}

	protected MetricsPackage(final String name, final List<Class<? extends HDetector>> detectors) {
		// Allow subpackages
		super(name, detectors);
	}
}