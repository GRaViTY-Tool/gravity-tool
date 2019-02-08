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
		Map<Flaws, List<DetectionObject>> detectionObjectDummys = new HashMap<Flaws, List<DetectionObject>>();
		detectionObjectDummys.put(Flaws.H_SPAGHETTI_CODE_ANTIPATTERN, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(Flaws.H_INTENSIVE_FIELD_USAGE_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(Flaws.H_AVERAGE_OVERLOADING_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(Flaws.H_AVERAGE_PARAMETERS_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(Flaws.H_NUMBER_OF_CHILD_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(Flaws.H_DEPTH_OF_INHERITANCE_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(Flaws.H_LOCAL_ACCESS_RELATION_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(Flaws.H_LOCAL_FIELD_ACCESSES_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(Flaws.H_LOCAL_METHOD_ACCESSES_METRIC, new LinkedList<DetectionObject>());

		if (apg != null) {
			for (HAnnotation a : apg.getHAnnotations()) {
				if (a instanceof HSpaghettiCodeAntiPattern) {
					HSpaghettiCodeAntiPattern spaghettiCodeAntiPattern = (HSpaghettiCodeAntiPattern) a;
					TClass tClass;
					HIntenseFieldUsageCodeSmell intenseFieldUsageCodeSmell = spaghettiCodeAntiPattern
							.getHIntenseFieldUsageCodeSmell();
					HAverageOverloadingInClassMetric averageOverloadingInClassMetric = spaghettiCodeAntiPattern
							.getHAverageOverloadingInClassMetric();
					HAverageParametersMetric averageParametersMetric = spaghettiCodeAntiPattern
							.getHAverageParametersMetric();
					HNumberOfChildMetric numberOfChildMetric = spaghettiCodeAntiPattern.getHNumberOfChild();
					HDepthOfInheritanceMetric depthOfInheritanceMetric = spaghettiCodeAntiPattern
							.getHDepthOfInheritanceMetric();
					HLocalAccessRelationMetric localAccessRelationMetric = null;
					HLocalFieldAccessesMetric localFieldAccessesMetric = null;
					HLocalMethodAccessesMetric localMethodAccessesMetric = null;

					Map<String, String> detections = new HashMap<>();
					Map<String, Number> thresholds = new HashMap<>();

					if (intenseFieldUsageCodeSmell != null)
						localAccessRelationMetric = intenseFieldUsageCodeSmell.getHLocalAccessRelationMetric();
					if (localAccessRelationMetric != null) {
						localFieldAccessesMetric = localAccessRelationMetric.getHLocalFieldAccesses();
						localMethodAccessesMetric = localAccessRelationMetric.getHLocalMethodAccesses();
					}
					// SpaghettiCode
					tClass = (TClass) spaghettiCodeAntiPattern.getTAnnotated();
					detections.put(createDetectionString(tClass), "-1");
					if (averageOverloadingInClassMetric != null)
						thresholds.put(Flaws.H_AVERAGE_OVERLOADING_METRIC + ": VERY_LOW",
								(ThresholdCalculator.getThresholdValue(averageOverloadingInClassMetric,
										HRelativeValueConstants.VERY_LOW, false)));
					if (averageParametersMetric != null)
						thresholds.put(Flaws.H_AVERAGE_PARAMETERS_METRIC + ": VERY_LOW",
								(ThresholdCalculator.getThresholdValue(averageParametersMetric,
										HRelativeValueConstants.VERY_LOW, false)));
					if (numberOfChildMetric != null)
						thresholds.put(Flaws.H_NUMBER_OF_CHILD_METRIC + ": VERY_LOW",
								(ThresholdCalculator.getThresholdValue(numberOfChildMetric,
										HRelativeValueConstants.VERY_LOW, false)));
					if (depthOfInheritanceMetric != null)
						thresholds.put(Flaws.H_DEPTH_OF_INHERITANCE_METRIC + ": VERY_LOW",
								(ThresholdCalculator.getThresholdValue(depthOfInheritanceMetric,
										HRelativeValueConstants.VERY_LOW, false)));
					DetectionObject spaghettiCodeDetectionObject = new DetectionObject(detections, thresholds, "",
							Flaws.H_SPAGHETTI_CODE_ANTIPATTERN);
					detectionObjectDummys.get(Flaws.H_SPAGHETTI_CODE_ANTIPATTERN)
							.add(spaghettiCodeDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// IntensiveFielsUsage
					if (intenseFieldUsageCodeSmell != null) {
						tClass = (TClass) intenseFieldUsageCodeSmell.getTAnnotated();
						detections.put(createDetectionString(tClass), "-1");
						thresholds.put(Flaws.H_LOCAL_ACCESS_RELATION_METRIC + ": VERY_HIGH",
								(ThresholdCalculator.getThresholdValue(
										intenseFieldUsageCodeSmell.getHLocalAccessRelationMetric(),
										HRelativeValueConstants.VERY_HIGH, true)));
					}
					DetectionObject intensiveFieldUsageDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_INTENSIVE_FIELD_USAGE_SMELL);
					detectionObjectDummys.get(Flaws.H_INTENSIVE_FIELD_USAGE_SMELL)
							.add(intensiveFieldUsageDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// AverageOverlaoding
					if (averageOverloadingInClassMetric != null) {
						tClass = (TClass) averageOverloadingInClassMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								averageOverloadingInClassMetric.getRelativeAmount().getValue().toString() + ": "
										+ String.valueOf(averageOverloadingInClassMetric.getValue()));
						thresholds.put("none", -1);
					}
					DetectionObject averageOverloadingDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_AVERAGE_OVERLOADING_METRIC);
					detectionObjectDummys.get(Flaws.H_AVERAGE_OVERLOADING_METRIC)
							.add(averageOverloadingDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// AverageParameters
					if (averageParametersMetric != null) {
						tClass = (TClass) averageParametersMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								averageParametersMetric.getRelativeAmount().getValue().toString() + ": "
										+ String.valueOf(averageParametersMetric.getValue()));
						thresholds.put("none", -1);
					}
					DetectionObject averageParametersDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_AVERAGE_PARAMETERS_METRIC);
					detectionObjectDummys.get(Flaws.H_AVERAGE_PARAMETERS_METRIC)
							.add(averageParametersDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// NumberOfChild
					if (numberOfChildMetric != null) {
						tClass = (TClass) numberOfChildMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								numberOfChildMetric.getRelativeAmount().getValue().toString() + ": "
										+ String.valueOf(numberOfChildMetric.getValue()));
						thresholds.put("none", -1);
					}
					DetectionObject numberOfChildDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_NUMBER_OF_CHILD_METRIC);
					detectionObjectDummys.get(Flaws.H_NUMBER_OF_CHILD_METRIC).add(numberOfChildDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// DepthOfInheritance
					if (depthOfInheritanceMetric != null) {
						tClass = (TClass) depthOfInheritanceMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								depthOfInheritanceMetric.getRelativeAmount().getValue().toString() + ": "
										+ String.valueOf(depthOfInheritanceMetric.getValue()));
						thresholds.put("none", -1);
					}
					DetectionObject depthOfInheritanceDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_DEPTH_OF_INHERITANCE_METRIC);
					detectionObjectDummys.get(Flaws.H_DEPTH_OF_INHERITANCE_METRIC)
							.add(depthOfInheritanceDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// LocalAccessRelation
					if (localAccessRelationMetric != null) {
						tClass = (TClass) localAccessRelationMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								localAccessRelationMetric.getRelativeAmount().getValue().toString() + ": "
										+ String.valueOf(localAccessRelationMetric.getValue()));
						thresholds.put("none", -1);
					}
					DetectionObject localAccessRelationDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_LOCAL_ACCESS_RELATION_METRIC);
					detectionObjectDummys.get(Flaws.H_LOCAL_ACCESS_RELATION_METRIC)
							.add(localAccessRelationDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// LocalFieldAccess
					if (localFieldAccessesMetric != null) {
						tClass = (TClass) localFieldAccessesMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								localFieldAccessesMetric.getRelativeAmount().getValue().toString() + ": "
										+ String.valueOf(localFieldAccessesMetric.getValue()));
						thresholds.put("none", -1);
					}
					DetectionObject localFieldAccessDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_LOCAL_FIELD_ACCESSES_METRIC);
					detectionObjectDummys.get(Flaws.H_LOCAL_FIELD_ACCESSES_METRIC)
							.add(localFieldAccessDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// LocalMethodAccess
					if (localMethodAccessesMetric != null) {
						tClass = (TClass) localMethodAccessesMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								localMethodAccessesMetric.getRelativeAmount().getValue().toString() + ": "
										+ String.valueOf(localMethodAccessesMetric.getValue()));
						thresholds.put("none", -1);
					}
					DetectionObject localMethodAccessDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_LOCAL_METHOD_ACCESSES_METRIC);
					detectionObjectDummys.get(Flaws.H_LOCAL_METHOD_ACCESSES_METRIC)
							.add(localMethodAccessDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;

				}
			}
		}
		return detectionObjectDummys;
	}

}
