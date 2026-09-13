package org.gravity.hulk.ui.visualization.detection;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;
import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.ui.visualization.util.Flaws;
import org.gravity.hulk.ui.visualization.util.ThresholdCalculator;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;

public class SpaghettiCodePreprocessor implements DetectionPreprocessor {

	@Override
	public Map<Flaws, List<DetectionObject>> preprocessDetections(HAntiPatternGraph apg) {
		final Map<Flaws, List<DetectionObject>> detectionObjects = initMap();

		if (apg != null) {
			for (final HAnnotation a : apg.getHAnnotations()) {
				if (a instanceof HSpaghettiCodeAntiPattern) {
					preprocessDetections(detectionObjects, (HSpaghettiCodeAntiPattern) a);

				}
			}
		}
		return detectionObjects;
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HSpaghettiCodeAntiPattern spaghettiCodeAntiPattern) {

		// SpaghettiCode
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		detections.put(((TClass) spaghettiCodeAntiPattern.getTAnnotated()), "-1");

		final DetectionObject spaghettiCodeDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_SPAGHETTI_CODE_ANTIPATTERN);
		detectionObjects.get(Flaws.H_SPAGHETTI_CODE_ANTIPATTERN).add(spaghettiCodeDetectionObject);

		final HIntenseFieldUsageCodeSmell intenseFieldUsageCodeSmell = spaghettiCodeAntiPattern
				.getHIntenseFieldUsageCodeSmell();
		preprocessDetections(detectionObjects, intenseFieldUsageCodeSmell);

		final HAverageOverloadingInClassMetric averageOverloadingInClassMetric = spaghettiCodeAntiPattern
				.getHAverageOverloadingInClassMetric();
		if (averageOverloadingInClassMetric != null) {
			thresholds.put(Flaws.H_AVERAGE_OVERLOADING_METRIC + ":" + HRelativeValueConstants.VERY_LOW,
					(ThresholdCalculator.getThresholdValue(averageOverloadingInClassMetric,
							HRelativeValueConstants.VERY_LOW, false)));
		}
		preprocessDetections(detectionObjects, averageOverloadingInClassMetric);

		final HAverageParametersMetric averageParametersMetric = spaghettiCodeAntiPattern.getHAverageParametersMetric();
		if (averageParametersMetric != null) {
			thresholds.put(Flaws.H_AVERAGE_PARAMETERS_METRIC + ":" + HRelativeValueConstants.VERY_LOW,
					(ThresholdCalculator.getThresholdValue(averageParametersMetric, HRelativeValueConstants.VERY_LOW,
							false)));
		}
		preprocessDetections(detectionObjects, averageParametersMetric);

		final HNumberOfChildMetric numberOfChildMetric = spaghettiCodeAntiPattern.getHNumberOfChild();
		if (numberOfChildMetric != null) {
			thresholds.put(Flaws.H_NUMBER_OF_CHILD_METRIC + ":" + HRelativeValueConstants.VERY_LOW, (ThresholdCalculator
					.getThresholdValue(numberOfChildMetric, HRelativeValueConstants.VERY_LOW, false)));
		}
		preprocessDetections(detectionObjects, numberOfChildMetric);

		final HDepthOfInheritanceMetric depthOfInheritanceMetric = spaghettiCodeAntiPattern.getHDepthOfInheritanceMetric();
		if (depthOfInheritanceMetric != null) {
			thresholds.put(Flaws.H_DEPTH_OF_INHERITANCE_METRIC + ":" + HRelativeValueConstants.VERY_LOW,
					(ThresholdCalculator.getThresholdValue(depthOfInheritanceMetric, HRelativeValueConstants.VERY_LOW,
							false)));
		}
		preprocessDetections(detectionObjects, depthOfInheritanceMetric);

		HLocalAccessRelationMetric localAccessRelationMetric = null;
		if (intenseFieldUsageCodeSmell != null) {
			localAccessRelationMetric = intenseFieldUsageCodeSmell.getHLocalAccessRelationMetric();
		}
		preprocessDetections(detectionObjects, localAccessRelationMetric);

		HLocalFieldAccessesMetric localFieldAccessesMetric = null;
		HLocalMethodAccessesMetric localMethodAccessesMetric = null;
		if (localAccessRelationMetric != null) {
			localFieldAccessesMetric = localAccessRelationMetric.getHLocalFieldAccesses();
			localMethodAccessesMetric = localAccessRelationMetric.getHLocalMethodAccesses();
		}
		preprocessDetections(detectionObjects, localFieldAccessesMetric);
		preprocessDetections(detectionObjects, localMethodAccessesMetric);
	}

	/**
	 * @param detectionObjects
	 * @param intenseFieldUsageCodeSmell
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HIntenseFieldUsageCodeSmell intenseFieldUsageCodeSmell) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();

		// IntensiveFielsUsage
		if (intenseFieldUsageCodeSmell != null) {
			final TClass tClass = (TClass) intenseFieldUsageCodeSmell.getTAnnotated();
			detections.put(tClass, "-1");
			thresholds.put(Flaws.H_LOCAL_ACCESS_RELATION_METRIC + ": VERY_HIGH",
					(ThresholdCalculator.getThresholdValue(intenseFieldUsageCodeSmell.getHLocalAccessRelationMetric(),
							HRelativeValueConstants.VERY_HIGH, true)));
		}
		final DetectionObject intensiveFieldUsageDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_INTENSIVE_FIELD_USAGE_SMELL);
		detectionObjects.get(Flaws.H_INTENSIVE_FIELD_USAGE_SMELL).add(intensiveFieldUsageDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param averageOverloadingInClassMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HAverageOverloadingInClassMetric averageOverloadingInClassMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();

		// AverageOverlaoding
		if (averageOverloadingInClassMetric != null) {
			final TClass tClass = (TClass) averageOverloadingInClassMetric.getTAnnotated();
			detections.put(tClass, averageOverloadingInClassMetric.getRelativeAmount().getValue().toString() + ": "
					+ averageOverloadingInClassMetric.getValue());
			thresholds.put("none", -1);
		}
		final DetectionObject averageOverloadingDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_AVERAGE_OVERLOADING_METRIC);
		detectionObjects.get(Flaws.H_AVERAGE_OVERLOADING_METRIC).add(averageOverloadingDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param averageParametersMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HAverageParametersMetric averageParametersMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();

		// AverageParameters
		if (averageParametersMetric != null) {
			final TClass tClass = (TClass) averageParametersMetric.getTAnnotated();
			detections.put(tClass, averageParametersMetric.getRelativeAmount().getValue().toString() + ": "
					+ averageParametersMetric.getValue());
			thresholds.put("none", -1);
		}
		final DetectionObject averageParametersDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_AVERAGE_PARAMETERS_METRIC);
		detectionObjects.get(Flaws.H_AVERAGE_PARAMETERS_METRIC).add(averageParametersDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param numberOfChildMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HNumberOfChildMetric numberOfChildMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();

		// NumberOfChild
		if (numberOfChildMetric != null) {
			final TClass tClass = (TClass) numberOfChildMetric.getTAnnotated();
			detections.put(tClass, numberOfChildMetric.getRelativeAmount().getValue().toString() + ": "
					+ numberOfChildMetric.getValue());
			thresholds.put("none", -1);
		}
		final DetectionObject numberOfChildDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_NUMBER_OF_CHILD_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_CHILD_METRIC).add(numberOfChildDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param depthOfInheritanceMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HDepthOfInheritanceMetric depthOfInheritanceMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();

		// DepthOfInheritance
		if (depthOfInheritanceMetric != null) {
			final TClass tClass = (TClass) depthOfInheritanceMetric.getTAnnotated();
			detections.put(tClass, depthOfInheritanceMetric.getRelativeAmount().getValue().toString() + ": "
					+ depthOfInheritanceMetric.getValue());
			thresholds.put("none", -1);
		}
		final DetectionObject depthOfInheritanceDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_DEPTH_OF_INHERITANCE_METRIC);
		detectionObjects.get(Flaws.H_DEPTH_OF_INHERITANCE_METRIC).add(depthOfInheritanceDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param localAccessRelationMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLocalAccessRelationMetric localAccessRelationMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();

		// LocalAccessRelation
		if (localAccessRelationMetric != null) {
			final TClass tClass = (TClass) localAccessRelationMetric.getTAnnotated();
			detections.put(tClass, localAccessRelationMetric.getRelativeAmount().getValue().toString() + ": "
					+ localAccessRelationMetric.getValue());
			thresholds.put("none", -1);
		}
		final DetectionObject localAccessRelationDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_LOCAL_ACCESS_RELATION_METRIC);
		detectionObjects.get(Flaws.H_LOCAL_ACCESS_RELATION_METRIC).add(localAccessRelationDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param localFieldAccessesMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLocalFieldAccessesMetric localFieldAccessesMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();

		// LocalFieldAccess
		if (localFieldAccessesMetric != null) {
			final TClass tClass = (TClass) localFieldAccessesMetric.getTAnnotated();
			detections.put(tClass, localFieldAccessesMetric.getRelativeAmount().getValue().toString() + ": "
					+ localFieldAccessesMetric.getValue());
			thresholds.put("none", -1);
		}
		final DetectionObject localFieldAccessDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_LOCAL_FIELD_ACCESSES_METRIC);
		detectionObjects.get(Flaws.H_LOCAL_FIELD_ACCESSES_METRIC).add(localFieldAccessDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param localMethodAccessesMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLocalMethodAccessesMetric localMethodAccessesMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();

		// LocalMethodAccess
		if (localMethodAccessesMetric != null) {
			final TClass tClass = (TClass) localMethodAccessesMetric.getTAnnotated();
			detections.put(tClass, localMethodAccessesMetric.getRelativeAmount().getValue().toString() + ": "
					+ localMethodAccessesMetric.getValue());
			thresholds.put("none", -1);
		}
		final DetectionObject localMethodAccessDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_LOCAL_METHOD_ACCESSES_METRIC);
		detectionObjects.get(Flaws.H_LOCAL_METHOD_ACCESSES_METRIC).add(localMethodAccessDetectionObject);
	}

	/**
	 * @return
	 */
	private Map<Flaws, List<DetectionObject>> initMap() {
		final Map<Flaws, List<DetectionObject>> detectionObjects = new EnumMap<>(Flaws.class);
		detectionObjects.put(Flaws.H_SPAGHETTI_CODE_ANTIPATTERN, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_INTENSIVE_FIELD_USAGE_SMELL, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_AVERAGE_OVERLOADING_METRIC, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_AVERAGE_PARAMETERS_METRIC, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_NUMBER_OF_CHILD_METRIC, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_DEPTH_OF_INHERITANCE_METRIC, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_LOCAL_ACCESS_RELATION_METRIC, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_LOCAL_FIELD_ACCESSES_METRIC, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_LOCAL_METHOD_ACCESSES_METRIC, new LinkedList<DetectionObject>());
		return detectionObjects;
	}

}
