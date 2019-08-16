package org.gravity.hulk.ui.visualization.detection;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;
import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.ui.visualization.util.Flaws;
import org.gravity.hulk.ui.visualization.util.ThresholdCalculator;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;

public class SwissArmyKnifePreprocessor extends DetectionPreprocessor {

	@Override
	public Map<Flaws, List<DetectionObject>> preprocessDetections(HAntiPatternGraph apg) {
		Map<Flaws, List<DetectionObject>> detectionObjects = new EnumMap<Flaws, List<DetectionObject>>(Flaws.class);
		detectionObjects.put(Flaws.H_SWISS_ARMY_KNIFE_ANTIPATTERN, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_LARGE_CLASS_SMELL, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_MUCH_OVERLOADING_SMELL, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC,
				new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_NUMBER_OF_MEMBERS_METRIC, new LinkedList<DetectionObject>());
		detectionObjects.put(Flaws.H_AVERAGE_OVERLOADING_METRIC, new LinkedList<DetectionObject>());
		if (apg != null) {
			for (HAnnotation a : apg.getHAnnotations()) {
				if (a instanceof HSwissArmyKnifeAntiPattern) {
					HSwissArmyKnifeAntiPattern swissArmyKife = (HSwissArmyKnifeAntiPattern) a;
					
					HLargeClassSmell largeClass = swissArmyKife.getHLargeClassSmell();
					HMuchOverloadingCodeSmell muchOverloadingSmell = swissArmyKife.getHMuchOverloadingCodeSmell();
					HIncommingInvocationMetric numberOfIncommingInvocationsMetric = swissArmyKife
							.getHIncommingInvocationCustomMetric();

					Map<TAbstractType, String> detections = new HashMap<>();
					Map<String, Number> thresholds = new HashMap<>();

					HNumberOfMembersMetric numberOfMembersMetric = null;
					if (largeClass != null) {
						numberOfMembersMetric = largeClass.getHNumberOfMembers();
					}
					
					HAverageOverloadingInClassMetric averageOverloadingInClassMetric = null;
					if (muchOverloadingSmell != null) {
						averageOverloadingInClassMetric = muchOverloadingSmell.getHAverageOverloadingInClassMetric();
					}

					// SwissArmyKnife
					detections.put(((TClass) swissArmyKife.getTAnnotated()), "-1");
					thresholds.put(Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC + ":" + HRelativeValueConstants.HIGH,
							(ThresholdCalculator.getThresholdValue(numberOfIncommingInvocationsMetric,
									HRelativeValueConstants.HIGH, true)));
					DetectionObject swissArmyKnifeDetectionObject = new DetectionObject(detections, thresholds, "",Flaws.H_SWISS_ARMY_KNIFE_ANTIPATTERN);
					detectionObjects.get(Flaws.H_SWISS_ARMY_KNIFE_ANTIPATTERN)
							.add(swissArmyKnifeDetectionObject);
					detections.clear();
					thresholds.clear();
					
					// LargeClass
					if (largeClass != null) {
						detections.put(((TClass) largeClass.getTAnnotated()), "-1");
						thresholds.put(Flaws.H_LARGE_CLASS_SMELL + ":" + HRelativeValueConstants.HIGH, (ThresholdCalculator
								.getThresholdValue(numberOfMembersMetric, HRelativeValueConstants.HIGH, true)));
					}
					DetectionObject largeClassDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_LARGE_CLASS_SMELL);
					detectionObjects.get(Flaws.H_LARGE_CLASS_SMELL).add(largeClassDetectionObject);
					detections.clear();
					thresholds.clear();

					// MuchOverloadingSmell
					if (muchOverloadingSmell != null) {
						detections.put(((TClass) muchOverloadingSmell.getTAnnotated()), "-1");
						thresholds.put(Flaws.H_AVERAGE_OVERLOADING_METRIC + ":" + HRelativeValueConstants.HIGH,
								(ThresholdCalculator.getThresholdValue(averageOverloadingInClassMetric,
										HRelativeValueConstants.HIGH, true)));
					}
					DetectionObject muchOverloadigSmellDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_MUCH_OVERLOADING_SMELL);
					detectionObjects.get(Flaws.H_MUCH_OVERLOADING_SMELL)
							.add(muchOverloadigSmellDetectionObject);
					detections.clear();
					thresholds.clear();

					// NumberOfIncommingInvocationsMetric
					if (numberOfIncommingInvocationsMetric != null) {
						detections.put(((TClass) numberOfIncommingInvocationsMetric.getTAnnotated()),
								numberOfIncommingInvocationsMetric.getRelativeAmount().getValue().toString() + ": "
										+ numberOfIncommingInvocationsMetric.getValue());
						thresholds.put("none", -1);
					}
					DetectionObject numberOfIncommingInvocationsMetricDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC);
					detectionObjects.get(Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC)
							.add(numberOfIncommingInvocationsMetricDetectionObject);
					detections.clear();
					thresholds.clear();

					// NumberOfMembersMetric
					if (numberOfMembersMetric != null) {
						detections.put(((TClass) numberOfMembersMetric.getTAnnotated()),
								numberOfMembersMetric.getRelativeAmount().getValue().toString() + ": "
										+ numberOfMembersMetric.getValue());
						thresholds.put("none", -1);
					}
					DetectionObject numberOfMembersMetricDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_NUMBER_OF_MEMBERS_METRIC);
					detectionObjects.get(Flaws.H_NUMBER_OF_MEMBERS_METRIC)
							.add(numberOfMembersMetricDetectionObject);
					detections.clear();
					thresholds.clear();

					// AverageOverloadingInClassSmell
					if (averageOverloadingInClassMetric != null) {
						detections.put(((TClass) averageOverloadingInClassMetric.getTAnnotated()),
								averageOverloadingInClassMetric.getRelativeAmount().getValue().toString() + ": "
										+ averageOverloadingInClassMetric.getValue());
						thresholds.put("none", -1);
					}
					DetectionObject averageOverloadingDetectionObject = new DetectionObject(detections,thresholds,"",Flaws.H_AVERAGE_OVERLOADING_METRIC);
					detectionObjects.get(Flaws.H_AVERAGE_OVERLOADING_METRIC)
							.add(averageOverloadingDetectionObject);
					detections.clear();
					thresholds.clear();

				}
			}
		}

		return detectionObjects;
	}

}
