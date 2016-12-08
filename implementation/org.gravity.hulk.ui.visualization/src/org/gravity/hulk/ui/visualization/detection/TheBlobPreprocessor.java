package org.gravity.hulk.ui.visualization.detection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;
import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.ui.visualization.information.providers.TheBlobInformationStringProvider;
import org.gravity.hulk.ui.visualization.util.GlobalStrings;
import org.gravity.hulk.ui.visualization.util.ThresholdCalculator;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;

public class TheBlobPreprocessor extends DetectionPreprocessor {

	private TheBlobInformationStringProvider theBlobStringProvider;

	public TheBlobPreprocessor() {
		theBlobStringProvider = new TheBlobInformationStringProvider();
	}

	@Override
	public Map<String, List<DetectionObject>> preprocessDetectionts(HAntiPatternGraph apg) {
		Map<String, List<DetectionObject>> detectionObjectDummys = new HashMap<String, List<DetectionObject>>();
		detectionObjectDummys.put(GlobalStrings.H_BLOB_ANTIPATTERN, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_GODCLASS_ANTIPATTERN, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_DATA_CLASS_ACCESSOR, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_DATA_CLASS_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_GETTER_SETTER_SMELLS, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_NACC_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_CONTROLLERCLASS_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_LARGE_CLASS_LOW_COHESION_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_INVOCATIONRELATION_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_LOW_COHESION_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_LARGE_CLASS_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_LCOM5_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL, new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_NUMBER_OF_OUTGOING_INVOCATIONS_SMELL, new LinkedList<DetectionObject>());

		if (apg != null) {
			for (HAnnotation a : apg.getHAnnotations()) {
				if (a instanceof HBlobAntiPattern) {
					HBlobAntiPattern blob = null;
					boolean printHeader = true;
					HDataClassAccessor hDataClassAccessor = null;
					HGodClassAntiPattern hGodClassAntiPattern = null;
					List<HDataClassSmell> hDataClassSmells = new LinkedList<HDataClassSmell>();
					HLargeClassLowCohesionSmell hLargeClassLowCohesionSmell = null;
					HControllerClassSmell hControllerClassSmell = null;
					HNACCMetric hnaccMetric = null;
					HLowCohesionSmell hLowCohesionSmell = null;
					HLargeClassSmell hLargeClassSmell = null;
					HInvocationRelation hInvocationRelation = null;
					HLCOM5Metric hlcom5Metric = null;
					HNumberOfMembersMetric hNumberOfMembersMetric = null;
					HIncommingInvocationMetric hNumberOfIncommingInvocationsMetric = null;
					HOutgoingInvocationMetric hNumberOfOutgoingInvocationsMetric = null;

					TClass tClass = null;
					Map<String, String> detections = new HashMap<String, String>();
					Map<String, String> thresholds = new HashMap<String, String>();

					// The Blob
					blob = (HBlobAntiPattern) a;
					tClass = (TClass) blob.getTAnnotated();
					for (TAnnotation tAnnotation : tClass.getTAnnotation()) {
						if (tAnnotation instanceof HDataClassAccessor) {
							hDataClassAccessor = (HDataClassAccessor) tAnnotation;
							//HDataClassAccessor
							TClass accessorClass = (TClass) hDataClassAccessor.getTAnnotated();
							DetectionObject dataClassAccessorObject = new DetectionObject();
							detections.put(createDetectionString(accessorClass),String.valueOf(hDataClassAccessor.getValue()));
							thresholds.put("none", "-1");
							dataClassAccessorObject.setType(GlobalStrings.H_DATA_CLASS_ACCESSOR);
							dataClassAccessorObject.setDetections(detections);
							dataClassAccessorObject.setThresholds(thresholds);
							detectionObjectDummys.get(GlobalStrings.H_DATA_CLASS_ACCESSOR).add(dataClassAccessorObject);
							detections.clear();
							thresholds.clear();
							//.....
							thresholds.put("HDataClassAccessor: MEDIUM", String.valueOf(ThresholdCalculator
									.getThresholdValue(hDataClassAccessor, HRelativeValueConstants.MEDIUM, true)));
							break;
						}
					}
					detections.put(createDetectionString(tClass), "-1");
					DetectionObject theBlobDetectionObjectDummy = new DetectionObject();
					theBlobDetectionObjectDummy.setType(GlobalStrings.H_BLOB_ANTIPATTERN);
					theBlobDetectionObjectDummy.setDetections(detections);
					theBlobDetectionObjectDummy.setThresholds(thresholds);
					theBlobDetectionObjectDummy.setFullInformationString(theBlobStringProvider
							.getInformationString(blob, true, TheBlobInformationStringProvider.THE_BLOB));
					detectionObjectDummys.get(GlobalStrings.H_BLOB_ANTIPATTERN).add(theBlobDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// GodClass
					hGodClassAntiPattern = blob.getHGodClassAntiPattern();
					if (hGodClassAntiPattern != null) {
						tClass = (TClass) hGodClassAntiPattern.getTAnnotated();
						detections.put(createDetectionString(tClass), "-1");
					}
					thresholds.put("none", "-1");
					DetectionObject godClassDetectionObjectDummy = new DetectionObject();
					godClassDetectionObjectDummy.setType(GlobalStrings.H_GODCLASS_ANTIPATTERN);
					godClassDetectionObjectDummy.setDetections(detections);
					godClassDetectionObjectDummy.setThresholds(thresholds);
					godClassDetectionObjectDummy.setFullInformationString(theBlobStringProvider.getInformationString(
							hGodClassAntiPattern, true, TheBlobInformationStringProvider.GOD_CLASS));
					detectionObjectDummys.get(GlobalStrings.H_GODCLASS_ANTIPATTERN).add(godClassDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// DataClassSmells
					hDataClassSmells = blob.getHDataClassSmells();
					thresholds.put("HNACCMetric: HIGH", "-1");
					String fullInformationString = "";
					if (hDataClassSmells.size() > 0) {
						HNACCMetric hnacc = hDataClassSmells.get(0).getHNACCMetric();
						for (HDataClassSmell smell : hDataClassSmells) {
							tClass = (TClass) smell.getTAnnotated();
							detections.put(createDetectionString(tClass), "-1");
							if (smell.getHNACCMetric() != null) {
								fullInformationString = fullInformationString
										+ theBlobStringProvider.getInformationString(smell, printHeader,
												TheBlobInformationStringProvider.DATA_CLASS);
							}
							printHeader = false;
						}
						if (hnacc != null)
							thresholds.put("HNACCMetric: HIGH", String.valueOf(
									ThresholdCalculator.getThresholdValue(hnacc, HRelativeValueConstants.HIGH, true)));
					}
					DetectionObject dataClassDetectionObjectDummy = new DetectionObject();
					dataClassDetectionObjectDummy.setType(GlobalStrings.H_DATA_CLASS_SMELL);
					dataClassDetectionObjectDummy.setDetections(detections);
					dataClassDetectionObjectDummy.setThresholds(thresholds);
					dataClassDetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_DATA_CLASS_SMELL).add(dataClassDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
					// HLargeClassLowCohesionSmell
					DetectionObject hLargeClassLowCohesionDetectionObjectDummy = new DetectionObject();
					if (hGodClassAntiPattern != null)
						hLargeClassLowCohesionSmell = hGodClassAntiPattern.getHLargeClassLowCohesionSmell();
					if (hLargeClassLowCohesionSmell != null) {
						tClass = (TClass) hLargeClassLowCohesionSmell.getTAnnotated();
						detections.put(createDetectionString(tClass), "-1");
						hLargeClassLowCohesionDetectionObjectDummy.setFullInformationString(
								theBlobStringProvider.getInformationString(hLargeClassLowCohesionSmell, true,
										TheBlobInformationStringProvider.LARGE_CLASS_LOW_COHESION_SMELL));
					}
					thresholds.put("none", "-1");
					hLargeClassLowCohesionDetectionObjectDummy.setType(GlobalStrings.H_LARGE_CLASS_LOW_COHESION_SMELL);
					hLargeClassLowCohesionDetectionObjectDummy.setDetections(detections);
					hLargeClassLowCohesionDetectionObjectDummy.setThresholds(thresholds);
					detectionObjectDummys.get(GlobalStrings.H_LARGE_CLASS_LOW_COHESION_SMELL)
							.add(hLargeClassLowCohesionDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// HControllerClassSmell
					DetectionObject hControllerClassDetectionObjectDummy = new DetectionObject();
					thresholds.put("HInvocationRelationMetric: MEDIUM", "-1");
					if (hGodClassAntiPattern != null)
						hControllerClassSmell = hGodClassAntiPattern.getHControllerClassSmell();
					if (hControllerClassSmell != null) {
						hInvocationRelation = hControllerClassSmell.getHInvocationRelation();
						tClass = (TClass) hControllerClassSmell.getTAnnotated();
						detections.put(createDetectionString(tClass), "-1");
						if (hInvocationRelation != null)
							thresholds.put("HInvocationRelationMetric: MEDIUM", String.valueOf(ThresholdCalculator
									.getThresholdValue(hInvocationRelation, HRelativeValueConstants.MEDIUM, true)));
						hControllerClassDetectionObjectDummy.setFullInformationString(
								theBlobStringProvider.getInformationString(hControllerClassSmell, true,
										TheBlobInformationStringProvider.CONTROLLER_CLASS));
					}
					hControllerClassDetectionObjectDummy.setType(GlobalStrings.H_CONTROLLERCLASS_SMELL);
					hControllerClassDetectionObjectDummy.setDetections(detections);
					hControllerClassDetectionObjectDummy.setThresholds(thresholds);
					detectionObjectDummys.get(GlobalStrings.H_CONTROLLERCLASS_SMELL).add(hControllerClassDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					// HNACCMetric
					fullInformationString = "";
					for (HDataClassSmell smell : hDataClassSmells) {
						hnaccMetric = smell.getHNACCMetric();
						if (hnaccMetric != null) {
							tClass = (TClass) hnaccMetric.getTAnnotated();
							detections.put(createDetectionString(tClass),
									hnaccMetric.getRelativeAmount().getValue().toString() + ": "
											+ String.valueOf(hnaccMetric.getValue()));
							fullInformationString = fullInformationString + theBlobStringProvider.getInformationString(
									hnaccMetric, printHeader, TheBlobInformationStringProvider.NACC_METRIC);
							printHeader = false;
						}
						else{System.out.println("HNACC IS NULL");}
					}
					thresholds.put("none", "-1");
					DetectionObject hnaccDetectionObjectDummy = new DetectionObject();
					hnaccDetectionObjectDummy.setType(GlobalStrings.H_NACC_METRIC);
					hnaccDetectionObjectDummy.setDetections(detections);
					hnaccDetectionObjectDummy.setThresholds(thresholds);
					hnaccDetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_NACC_METRIC).add(hnaccDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
					// HGetterSetterSmell
					fullInformationString = "";
					for (HDataClassSmell smell : hDataClassSmells) {
						List<HGetterSetterSmell> getterSetterSmells = smell.getGetterSetterSmells();
						int numberOfGetterSetters = 0;
						tClass = (TClass) smell.getTAnnotated();
						for (HGetterSetterSmell getterSetter : getterSetterSmells) {
							numberOfGetterSetters++;
							fullInformationString = fullInformationString + theBlobStringProvider.getInformationString(
									getterSetter, printHeader, TheBlobInformationStringProvider.GETTER_SETTER_SMELL);
							printHeader = false;
						}
						detections.put(createDetectionString(tClass),
								String.valueOf(numberOfGetterSetters) + " getters/setters");
					}
					thresholds.put("none", "-1");
					DetectionObject hGetterSetterDetectionObjectDummy = new DetectionObject();
					hGetterSetterDetectionObjectDummy.setType(GlobalStrings.H_GETTER_SETTER_SMELLS);
					hGetterSetterDetectionObjectDummy.setDetections(detections);
					hGetterSetterDetectionObjectDummy.setThresholds(thresholds);
					hGetterSetterDetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_GETTER_SETTER_SMELLS).add(hGetterSetterDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
					// HLowCohesionSmell
					fullInformationString = "";
					thresholds.put("HLCOM5Metric : at least HIGH", "-1");
					if (hLargeClassLowCohesionSmell != null)
						hLowCohesionSmell = hLargeClassLowCohesionSmell.getHLowCohesionSmell();
					if (hLowCohesionSmell != null) {
						HLCOM5Metric metric = hLowCohesionSmell.getHLCOM5CustomMetric();
						tClass = (TClass) hLowCohesionSmell.getTAnnotated();
						detections.put(createDetectionString(tClass), "-1");
						thresholds.put("HLCOM5Metric : at least HIGH", String.valueOf(
								ThresholdCalculator.getThresholdValue(metric, HRelativeValueConstants.HIGH, true)));
						fullInformationString = theBlobStringProvider.getInformationString(hLowCohesionSmell, true,
								TheBlobInformationStringProvider.LOW_COHESION_SMELL);
					}
					DetectionObject hLowCohesionDetectionObjectDummy = new DetectionObject();
					hLowCohesionDetectionObjectDummy.setType(GlobalStrings.H_LOW_COHESION_SMELL);
					hLowCohesionDetectionObjectDummy.setDetections(detections);
					hLowCohesionDetectionObjectDummy.setThresholds(thresholds);
					hLowCohesionDetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_LOW_COHESION_SMELL).add(hLowCohesionDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
					// HLargeClassSmell
					fullInformationString = "";
					thresholds.put("HNumberOfMembersMetric: at least HIGH", "-1");
					if (hLargeClassLowCohesionSmell != null)
						hLargeClassSmell = hLargeClassLowCohesionSmell.getHLargeClassSmell();
					if (hLargeClassSmell != null) {
						hNumberOfMembersMetric = hLargeClassSmell.getHNumberOfMembers();
						tClass = (TClass) hLargeClassSmell.getTAnnotated();
						detections.put(createDetectionString(tClass), "-1");
						if (hNumberOfMembersMetric != null)
							thresholds.put("HNumberOfMembersMetric: at least HIGH", String.valueOf(ThresholdCalculator
									.getThresholdValue(hNumberOfMembersMetric, HRelativeValueConstants.HIGH, true)));
						fullInformationString = theBlobStringProvider.getInformationString(hLargeClassSmell, true,
								TheBlobInformationStringProvider.LARGE_CLASS_SMELL);
					}
					DetectionObject hLargeClassDetectionObjectDummy = new DetectionObject();
					hLargeClassDetectionObjectDummy.setType(GlobalStrings.H_LARGE_CLASS_SMELL);
					hLargeClassDetectionObjectDummy.setDetections(detections);
					hLargeClassDetectionObjectDummy.setThresholds(thresholds);
					hLargeClassDetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_LARGE_CLASS_SMELL).add(hLargeClassDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
					//HInvocationRelation
					fullInformationString = "";
					thresholds.put("none", "-1");
					if (hInvocationRelation != null) {
						tClass = (TClass) hInvocationRelation.getTAnnotated();
						detections.put(createDetectionString(tClass),
								hInvocationRelation.getRelativeAmount().getValue().toString() + ": "
										+ String.valueOf(hInvocationRelation.getValue()));
						fullInformationString = theBlobStringProvider.getInformationString(hInvocationRelation, true,
								TheBlobInformationStringProvider.INVOCATION_RELATION);
					}
					DetectionObject hInvocationRelationDetectionObjectDummy = new DetectionObject();
					hInvocationRelationDetectionObjectDummy.setType(GlobalStrings.H_INVOCATIONRELATION_SMELL);
					hInvocationRelationDetectionObjectDummy.setDetections(detections);
					hInvocationRelationDetectionObjectDummy.setThresholds(thresholds);
					hInvocationRelationDetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_INVOCATIONRELATION_SMELL).add(hInvocationRelationDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
					//HLCOM5Metric
					fullInformationString = "";
					thresholds.put("none", "-1");
					if(hLowCohesionSmell!=null)
						hlcom5Metric = hLowCohesionSmell.getHLCOM5CustomMetric();
					if (hlcom5Metric != null) {
						tClass = (TClass) hlcom5Metric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								hlcom5Metric.getRelativeAmount().getValue().toString() + ": " + String.valueOf(hlcom5Metric.getValue()));
						fullInformationString = theBlobStringProvider.getInformationString(hlcom5Metric, true,
								TheBlobInformationStringProvider.LCOM5);
					}
					DetectionObject hLCOM5DetectionObjectDummy = new DetectionObject();
					hLCOM5DetectionObjectDummy.setType(GlobalStrings.H_LCOM5_METRIC);
					hLCOM5DetectionObjectDummy.setDetections(detections);
					hLCOM5DetectionObjectDummy.setThresholds(thresholds);
					hLCOM5DetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_LCOM5_METRIC).add(hLCOM5DetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
					//HNumberOfMembersMetric
					fullInformationString = "";
					thresholds.put("none", "-1");
					if(hLargeClassSmell!=null)
						hNumberOfMembersMetric = hLargeClassSmell.getHNumberOfMembers();
					if (hNumberOfMembersMetric != null) {
						tClass = (TClass) hNumberOfMembersMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								hNumberOfMembersMetric.getRelativeAmount().getValue().toString() + ": " + String.valueOf(hNumberOfMembersMetric.getValue()));
						thresholds.put("none", "-1");
						fullInformationString = theBlobStringProvider.getInformationString(hNumberOfMembersMetric, true,
								TheBlobInformationStringProvider.NUMBER_OF_MEMBERS_METRIC);
					}
					DetectionObject hNumberOfMembersDetectionObjectDummy = new DetectionObject();
					hNumberOfMembersDetectionObjectDummy.setType(GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC);
					hNumberOfMembersDetectionObjectDummy.setDetections(detections);
					hNumberOfMembersDetectionObjectDummy.setThresholds(thresholds);
					hNumberOfMembersDetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC).add(hNumberOfMembersDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
					//HNumberOfIncommingInvocation
					fullInformationString = "";
					thresholds.put("none", "-1");
					if(hInvocationRelation!=null)
						hNumberOfIncommingInvocationsMetric = hInvocationRelation.getHIncommingInvocationCustomMetric();
					if (hNumberOfIncommingInvocationsMetric != null) {
						tClass = (TClass) hNumberOfIncommingInvocationsMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								hNumberOfIncommingInvocationsMetric.getRelativeAmount().getValue().toString() + ": " + String.valueOf(hNumberOfIncommingInvocationsMetric.getValue()));
						fullInformationString = theBlobStringProvider.getInformationString(hNumberOfIncommingInvocationsMetric, true,
								TheBlobInformationStringProvider.NUMBER_OF_INCOMMING_INVOCATIONS_METRIC);
					}
					DetectionObject hNumberOfIcommingInvocationsDetectionObjectDummy = new DetectionObject();
					hNumberOfIcommingInvocationsDetectionObjectDummy.setType(GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL);
					hNumberOfIcommingInvocationsDetectionObjectDummy.setDetections(detections);
					hNumberOfIcommingInvocationsDetectionObjectDummy.setThresholds(thresholds);
					hNumberOfIcommingInvocationsDetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL).add(hNumberOfIcommingInvocationsDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
					//HNumberOfOutgoingInvocationsMetric
					fullInformationString = "";
					thresholds.put("none", "-1");
					if(hInvocationRelation!=null)
						hNumberOfOutgoingInvocationsMetric = hInvocationRelation.getHOutgoingInvocationCustomMetric();
					if (hNumberOfOutgoingInvocationsMetric != null) {
						tClass = (TClass) hNumberOfOutgoingInvocationsMetric.getTAnnotated();
						detections.put(createDetectionString(tClass),
								hNumberOfOutgoingInvocationsMetric.getRelativeAmount().getValue().toString() + ": " + String.valueOf(hNumberOfOutgoingInvocationsMetric.getValue()));
						fullInformationString = theBlobStringProvider.getInformationString(hNumberOfOutgoingInvocationsMetric, true,
								TheBlobInformationStringProvider.NUMBER_OF_OUTGOING_INVOCATIONS_METRIC);
					} 
					DetectionObject hNumberOfOutgoingInvocationsDetectionObjectDummy = new DetectionObject();
					hNumberOfOutgoingInvocationsDetectionObjectDummy.setType(GlobalStrings.H_NUMBER_OF_OUTGOING_INVOCATIONS_SMELL);
					hNumberOfOutgoingInvocationsDetectionObjectDummy.setDetections(detections);
					hNumberOfOutgoingInvocationsDetectionObjectDummy.setThresholds(thresholds);
					hNumberOfOutgoingInvocationsDetectionObjectDummy.setFullInformationString(fullInformationString);
					detectionObjectDummys.get(GlobalStrings.H_NUMBER_OF_OUTGOING_INVOCATIONS_SMELL).add(hNumberOfOutgoingInvocationsDetectionObjectDummy);
					detections.clear();
					thresholds.clear();
					tClass = null;
					printHeader = true;
				}
			}

		}
		return detectionObjectDummys;
	}

}
