package org.gravity.hulk.ui.visualization.detection;

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
import org.gravity.hulk.ui.visualization.util.GlobalStrings;
import org.gravity.hulk.ui.visualization.util.ThresholdCalculator;
import org.gravity.typegraph.basic.TClass;

public class SwissArmyKnifePreprocessor extends DetectionPreprocessor {

	@Override
	public Map<String, List<DetectionObject>> preprocessDetectionts(HAntiPatternGraph apg) {
		Map<String, List<DetectionObject>> detectionObjectDummys = new HashMap<String, List<DetectionObject>>();
		detectionObjectDummys.put(GlobalStrings.H_SWISS_ARMY_KNIFE_ANTIPATTERN, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_LARGE_CLASS_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_MUCH_OVERLOADING_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_AVERAGE_OVERLOADING_METRIC, new LinkedList<DetectionObject>());
		if (apg != null) {
			for (HAnnotation a : apg.getHAnnotations()) {
				if (a instanceof HSwissArmyKnifeAntiPattern) {
					HSwissArmyKnifeAntiPattern swissArmyKife = (HSwissArmyKnifeAntiPattern) a;
					TClass tClass;
					
					HLargeClassSmell largeClass = swissArmyKife.getHLargeClassSmell();
					HMuchOverloadingCodeSmell muchOverloadingSmell = swissArmyKife.getHMuchOverloadingCodeSmell();
					HIncommingInvocationMetric numberOfIncommingInvocationsMetric = swissArmyKife.getHIncommingInvocationCustomMetric();
					
					HNumberOfMembersMetric numberOfMembersMetric = null;
					HAverageOverloadingInClassMetric averageOverloadingInClassMetric = null;
					
					Map<String, String> detections = new HashMap<String, String>();
					Map<String, String> thresholds = new HashMap<String, String>();
					
					if(largeClass!=null)
						numberOfMembersMetric = largeClass.getHNumberOfMembers();
					if(muchOverloadingSmell!=null)
						averageOverloadingInClassMetric = muchOverloadingSmell.getHAverageOverloadingInClassMetric();
					//SwissArmyKnife
					tClass = (TClass) swissArmyKife.getTAnnotated();
					detections.put(createDetectionString(tClass), "-1");
					thresholds.put(GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL+": HIGH", String.valueOf(ThresholdCalculator.getThresholdValue(numberOfIncommingInvocationsMetric, HRelativeValueConstants.HIGH, true)));
					DetectionObject swissArmyKnifeDetectionObject = new DetectionObject();
					swissArmyKnifeDetectionObject.setType(GlobalStrings.H_SWISS_ARMY_KNIFE_ANTIPATTERN);
					swissArmyKnifeDetectionObject.setDetections(detections);
					swissArmyKnifeDetectionObject.setThresholds(thresholds);
					detectionObjectDummys.get(GlobalStrings.H_SWISS_ARMY_KNIFE_ANTIPATTERN).add(swissArmyKnifeDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					//LargeClass
					if(largeClass!=null){
						tClass = (TClass) largeClass.getTAnnotated();
						detections.put(createDetectionString(tClass), "-1");
						thresholds.put(GlobalStrings.H_LARGE_CLASS_SMELL+": HIGH", String.valueOf(ThresholdCalculator.getThresholdValue(numberOfMembersMetric, HRelativeValueConstants.HIGH, true)));
					}
					DetectionObject largeClassDetectionObject = new DetectionObject();
					largeClassDetectionObject.setType(GlobalStrings.H_LARGE_CLASS_SMELL);
					largeClassDetectionObject.setDetections(detections);
					largeClassDetectionObject.setThresholds(thresholds);
					detectionObjectDummys.get(GlobalStrings.H_LARGE_CLASS_SMELL).add(largeClassDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					//MuchOverloadingSmell
					if(muchOverloadingSmell!=null){
						tClass = (TClass) muchOverloadingSmell.getTAnnotated();
						detections.put(createDetectionString(tClass), "-1");
						thresholds.put(GlobalStrings.H_AVERAGE_OVERLOADING_METRIC + ": HIGH", String.valueOf(ThresholdCalculator.getThresholdValue(averageOverloadingInClassMetric, HRelativeValueConstants.HIGH, true)));
					}
					DetectionObject muchOverloadigSmellDetectionObject = new DetectionObject();
					muchOverloadigSmellDetectionObject.setType(GlobalStrings.H_MUCH_OVERLOADING_SMELL);
					muchOverloadigSmellDetectionObject.setDetections(detections);
					muchOverloadigSmellDetectionObject.setThresholds(thresholds);
					detectionObjectDummys.get(GlobalStrings.H_MUCH_OVERLOADING_SMELL).add(muchOverloadigSmellDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					//NumberOfIncommingInvocationsMetric
					if(numberOfIncommingInvocationsMetric!=null){
						tClass = (TClass) numberOfIncommingInvocationsMetric.getTAnnotated();
						detections.put(createDetectionString(tClass), numberOfIncommingInvocationsMetric.getRelativeAmount().getValue().toString()+": "+String.valueOf(numberOfIncommingInvocationsMetric.getValue()));
						thresholds.put("none", "-1");
					}
					DetectionObject numberOfIncommingInvocationsMetricDetectionObject = new DetectionObject();
					numberOfIncommingInvocationsMetricDetectionObject.setType(GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL);
					numberOfIncommingInvocationsMetricDetectionObject.setDetections(detections);
					numberOfIncommingInvocationsMetricDetectionObject.setThresholds(thresholds);
					detectionObjectDummys.get(GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL).add(numberOfIncommingInvocationsMetricDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					//NumberOfMembersMetric
					if(numberOfMembersMetric!=null){
						tClass = (TClass) numberOfMembersMetric.getTAnnotated();
						detections.put(createDetectionString(tClass), numberOfMembersMetric.getRelativeAmount().getValue().toString()+": "+String.valueOf(numberOfMembersMetric.getValue()));
						thresholds.put("none", "-1");
					}
					DetectionObject numberOfMembersMetricDetectionObject = new DetectionObject();
					numberOfMembersMetricDetectionObject.setType(GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC);
					numberOfMembersMetricDetectionObject.setDetections(detections);
					numberOfMembersMetricDetectionObject.setThresholds(thresholds);
					detectionObjectDummys.get(GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC).add(numberOfMembersMetricDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					//AverageOverloadingInClassSmell
					if(averageOverloadingInClassMetric!=null){
						tClass = (TClass) averageOverloadingInClassMetric.getTAnnotated();
						detections.put(createDetectionString(tClass), averageOverloadingInClassMetric.getRelativeAmount().getValue().toString()+": "+ String.valueOf(averageOverloadingInClassMetric.getValue()));
						thresholds.put("none", "-1");
					}
					DetectionObject averageOverloadingDetectionObject = new DetectionObject();
					averageOverloadingDetectionObject.setType(GlobalStrings.H_AVERAGE_OVERLOADING_METRIC);
					averageOverloadingDetectionObject.setDetections(detections);
					averageOverloadingDetectionObject.setThresholds(thresholds);
					detectionObjectDummys.get(GlobalStrings.H_AVERAGE_OVERLOADING_METRIC).add(averageOverloadingDetectionObject);
					detections.clear();
					thresholds.clear();
					tClass = null;
					
				}
			}
		}

		return detectionObjectDummys;
	}

}
