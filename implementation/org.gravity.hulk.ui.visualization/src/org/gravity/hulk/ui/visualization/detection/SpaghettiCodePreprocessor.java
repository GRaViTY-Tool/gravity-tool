package org.gravity.hulk.ui.visualization.detection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
import org.gravity.typegraph.basic.TClass;

public class SpaghettiCodePreprocessor extends DetectionPreprocessor {

	@Override
	public Map<Flaws, List<DetectionObject>> preprocessDetections(HAntiPatternGraph apg) {
		Map<Flaws, List<DetectionObject>> detectionObjects = initMap();

		if (apg != null) {
			for (HAnnotation a : apg.getHAnnotations()) {
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
		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		detections.put(createDetectionString((TClass) spaghettiCodeAntiPattern.getTAnnotated()), "-1");	
		
		DetectionObject spaghettiCodeDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_SPAGHETTI_CODE_ANTIPATTERN);
		detectionObjects.get(Flaws.H_SPAGHETTI_CODE_ANTIPATTERN).add(spaghettiCodeDetectionObject);
		
		HIntenseFieldUsageCodeSmell intenseFieldUsageCodeSmell = spaghettiCodeAntiPattern
				.getHIntenseFieldUsageCodeSmell();
		preprocessDetections(detectionObjects, intenseFieldUsageCodeSmell);
		
		HAverageOverloadingInClassMetric averageOverloadingInClassMetric = spaghettiCodeAntiPattern
				.getHAverageOverloadingInClassMetric();
		if (averageOverloadingInClassMetric != null) {
			thresholds.put(Flaws.H_AVERAGE_OVERLOADING_METRIC + ": VERY_LOW", (ThresholdCalculator
					.getThresholdValue(averageOverloadingInClassMetric, HRelativeValueConstants.VERY_LOW, false)));
		}
		preprocessDetections(detectionObjects, averageOverloadingInClassMetric);
		
		HAverageParametersMetric averageParametersMetric = spaghettiCodeAntiPattern.getHAverageParametersMetric();
		if (averageParametersMetric != null) {
			thresholds.put(Flaws.H_AVERAGE_PARAMETERS_METRIC + ": VERY_LOW", (ThresholdCalculator
					.getThresholdValue(averageParametersMetric, HRelativeValueConstants.VERY_LOW, false)));
		}
		preprocessDetections(detectionObjects, averageParametersMetric);
		
		HNumberOfChildMetric numberOfChildMetric = spaghettiCodeAntiPattern.getHNumberOfChild();
		if (numberOfChildMetric != null) {
			thresholds.put(Flaws.H_NUMBER_OF_CHILD_METRIC + ": VERY_LOW", (ThresholdCalculator
					.getThresholdValue(numberOfChildMetric, HRelativeValueConstants.VERY_LOW, false)));
		}
		preprocessDetections(detectionObjects, numberOfChildMetric);
		
		HDepthOfInheritanceMetric depthOfInheritanceMetric = spaghettiCodeAntiPattern.getHDepthOfInheritanceMetric();
		if (depthOfInheritanceMetric != null) {
			thresholds.put(Flaws.H_DEPTH_OF_INHERITANCE_METRIC + ": VERY_LOW", (ThresholdCalculator
					.getThresholdValue(depthOfInheritanceMetric, HRelativeValueConstants.VERY_LOW, false)));
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
		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// IntensiveFielsUsage
		if (intenseFieldUsageCodeSmell != null) {
			TClass tClass = (TClass) intenseFieldUsageCodeSmell.getTAnnotated();
			detections.put(createDetectionString(tClass), "-1");
			thresholds.put(Flaws.H_LOCAL_ACCESS_RELATION_METRIC + ": VERY_HIGH",
					(ThresholdCalculator.getThresholdValue(intenseFieldUsageCodeSmell.getHLocalAccessRelationMetric(),
							HRelativeValueConstants.VERY_HIGH, true)));
		}
		DetectionObject intensiveFieldUsageDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_INTENSIVE_FIELD_USAGE_SMELL);
		detectionObjects.get(Flaws.H_INTENSIVE_FIELD_USAGE_SMELL).add(intensiveFieldUsageDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param averageOverloadingInClassMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HAverageOverloadingInClassMetric averageOverloadingInClassMetric) {
		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// AverageOverlaoding
		if (averageOverloadingInClassMetric != null) {
			TClass tClass = (TClass) averageOverloadingInClassMetric.getTAnnotated();
			detections.put(createDetectionString(tClass),
					averageOverloadingInClassMetric.getRelativeAmount().getValue().toString() + ": "
							+ String.valueOf(averageOverloadingInClassMetric.getValue()));
			thresholds.put("none", -1);
		}
		DetectionObject averageOverloadingDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_AVERAGE_OVERLOADING_METRIC);
		detectionObjects.get(Flaws.H_AVERAGE_OVERLOADING_METRIC).add(averageOverloadingDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param averageParametersMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HAverageParametersMetric averageParametersMetric) {
		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// AverageParameters
		if (averageParametersMetric != null) {
			TClass tClass = (TClass) averageParametersMetric.getTAnnotated();
			detections.put(createDetectionString(tClass),
					averageParametersMetric.getRelativeAmount().getValue().toString() + ": "
							+ String.valueOf(averageParametersMetric.getValue()));
			thresholds.put("none", -1);
		}
		DetectionObject averageParametersDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_AVERAGE_PARAMETERS_METRIC);
		detectionObjects.get(Flaws.H_AVERAGE_PARAMETERS_METRIC).add(averageParametersDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param numberOfChildMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HNumberOfChildMetric numberOfChildMetric) {
		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// NumberOfChild
		if (numberOfChildMetric != null) {
			TClass tClass = (TClass) numberOfChildMetric.getTAnnotated();
			detections.put(createDetectionString(tClass), numberOfChildMetric.getRelativeAmount().getValue().toString()
					+ ": " + String.valueOf(numberOfChildMetric.getValue()));
			thresholds.put("none", -1);
		}
		DetectionObject numberOfChildDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_NUMBER_OF_CHILD_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_CHILD_METRIC).add(numberOfChildDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param depthOfInheritanceMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HDepthOfInheritanceMetric depthOfInheritanceMetric) {
		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// DepthOfInheritance
		if (depthOfInheritanceMetric != null) {
			TClass tClass = (TClass) depthOfInheritanceMetric.getTAnnotated();
			detections.put(createDetectionString(tClass),
					depthOfInheritanceMetric.getRelativeAmount().getValue().toString() + ": "
							+ String.valueOf(depthOfInheritanceMetric.getValue()));
			thresholds.put("none", -1);
		}
		DetectionObject depthOfInheritanceDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_DEPTH_OF_INHERITANCE_METRIC);
		detectionObjects.get(Flaws.H_DEPTH_OF_INHERITANCE_METRIC).add(depthOfInheritanceDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param localAccessRelationMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLocalAccessRelationMetric localAccessRelationMetric) {
		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// LocalAccessRelation
		if (localAccessRelationMetric != null) {
			TClass tClass = (TClass) localAccessRelationMetric.getTAnnotated();
			detections.put(createDetectionString(tClass),
					localAccessRelationMetric.getRelativeAmount().getValue().toString() + ": "
							+ String.valueOf(localAccessRelationMetric.getValue()));
			thresholds.put("none", -1);
		}
		DetectionObject localAccessRelationDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_LOCAL_ACCESS_RELATION_METRIC);
		detectionObjects.get(Flaws.H_LOCAL_ACCESS_RELATION_METRIC).add(localAccessRelationDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param localFieldAccessesMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLocalFieldAccessesMetric localFieldAccessesMetric) {
		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// LocalFieldAccess
		if (localFieldAccessesMetric != null) {
			TClass tClass = (TClass) localFieldAccessesMetric.getTAnnotated();
			detections.put(createDetectionString(tClass),
					localFieldAccessesMetric.getRelativeAmount().getValue().toString() + ": "
							+ String.valueOf(localFieldAccessesMetric.getValue()));
			thresholds.put("none", -1);
		}
		DetectionObject localFieldAccessDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_LOCAL_FIELD_ACCESSES_METRIC);
		detectionObjects.get(Flaws.H_LOCAL_FIELD_ACCESSES_METRIC).add(localFieldAccessDetectionObject);
	}

	/**
	 * @param detectionObjects
	 * @param localMethodAccessesMetric
	 */
	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLocalMethodAccessesMetric localMethodAccessesMetric) {
		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// LocalMethodAccess
		if (localMethodAccessesMetric != null) {
			TClass tClass = (TClass) localMethodAccessesMetric.getTAnnotated();
			detections.put(createDetectionString(tClass),
					localMethodAccessesMetric.getRelativeAmount().getValue().toString() + ": "
							+ String.valueOf(localMethodAccessesMetric.getValue()));
			thresholds.put("none", -1);
		}
		DetectionObject localMethodAccessDetectionObject = new DetectionObject(detections, thresholds, "",
				Flaws.H_LOCAL_METHOD_ACCESSES_METRIC);
		detectionObjects.get(Flaws.H_LOCAL_METHOD_ACCESSES_METRIC).add(localMethodAccessDetectionObject);
	}

	/**
	 * @return
	 */
	private Map<Flaws, List<DetectionObject>> initMap() {
		Map<Flaws, List<DetectionObject>> detectionObjects = new HashMap<Flaws, List<DetectionObject>>();
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
