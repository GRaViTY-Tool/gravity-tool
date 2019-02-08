package org.gravity.hulk.ui.visualization.detection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

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
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.TClass;

public class TheBlobPreprocessor extends DetectionPreprocessor {

	private static final Logger LOGGER = Logger.getLogger(TheBlobPreprocessor.class.getName());

	private TheBlobInformationStringProvider theBlobStringProvider;

	public TheBlobPreprocessor() {
		theBlobStringProvider = new TheBlobInformationStringProvider();
	}

	@Override
	public Map<GlobalStrings, List<DetectionObject>> preprocessDetections(HAntiPatternGraph apg) {
		Map<GlobalStrings, List<DetectionObject>> detectionObjectDummys = initializeMap();

		if (apg != null) {
			for (HAnnotation a : apg.getHAnnotations()) {
				if (a instanceof HBlobAntiPattern) {
					preprocessDetections(detectionObjectDummys, (HBlobAntiPattern) a);
				}
			}

		}
		return detectionObjectDummys;
	}

	private void preprocessDetections(Map<GlobalStrings, List<DetectionObject>> detectionObjectDummys,
			HBlobAntiPattern hBlob) {
		boolean printHeader = true;

		Map<String, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// The Blob
		TClass tClass = (TClass) hBlob.getTAnnotated();
		for (TAnnotation tAnnotation : tClass.getTAnnotation()) {
			if (tAnnotation instanceof HDataClassAccessor) {
				HDataClassAccessor hDataClassAccessor = (HDataClassAccessor) tAnnotation;
				// HDataClassAccessor
				TClass accessorClass = (TClass) hDataClassAccessor.getTAnnotated();
				DetectionObject dataClassAccessorObject = new DetectionObject(detections, thresholds, null,
						GlobalStrings.H_DATA_CLASS_ACCESSOR);
				detections.put(createDetectionString(accessorClass), String.valueOf(hDataClassAccessor.getValue()));
				thresholds.put("none", -1);
				detectionObjectDummys.get(GlobalStrings.H_DATA_CLASS_ACCESSOR).add(dataClassAccessorObject);
				detections.clear();
				thresholds.clear();
				// .....
				thresholds.put("HDataClassAccessor: MEDIUM", (ThresholdCalculator
						.getThresholdValue(hDataClassAccessor, HRelativeValueConstants.MEDIUM, true)));
				break;
			}
		}
		detections.put(createDetectionString(tClass), "-1");
		DetectionObject theBlobDetectionObjectDummy = new DetectionObject(detections, thresholds,
				theBlobStringProvider.getInformationString(hBlob, true, TheBlobInformationStringProvider.THE_BLOB),
				GlobalStrings.H_BLOB_ANTIPATTERN);
		detectionObjectDummys.get(GlobalStrings.H_BLOB_ANTIPATTERN).add(theBlobDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		// GodClass
		HGodClassAntiPattern hGodClassAntiPattern = hBlob.getHGodClassAntiPattern();
		if (hGodClassAntiPattern != null) {
			tClass = (TClass) hGodClassAntiPattern.getTAnnotated();
			detections.put(createDetectionString(tClass), "-1");
		}
		thresholds.put("none", -1);
		DetectionObject godClassDetectionObjectDummy = new DetectionObject(detections, thresholds, theBlobStringProvider
				.getInformationString(hGodClassAntiPattern, true, TheBlobInformationStringProvider.GOD_CLASS),
				GlobalStrings.H_GODCLASS_ANTIPATTERN);
		detectionObjectDummys.get(GlobalStrings.H_GODCLASS_ANTIPATTERN).add(godClassDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		// DataClassSmells
		thresholds.put("HNACCMetric: HIGH", -1);
		String dataClassFullInformationString = "";
		List<HDataClassSmell> hDataClassSmells = hBlob.getHDataClassSmells();
		if (hDataClassSmells.size() > 0) {
			HNACCMetric hnacc = hDataClassSmells.get(0).getHNACCMetric();
			for (HDataClassSmell smell : hDataClassSmells) {
				tClass = (TClass) smell.getTAnnotated();
				detections.put(createDetectionString(tClass), "-1");
				if (smell.getHNACCMetric() != null) {
					dataClassFullInformationString = theBlobStringProvider.getInformationString(smell,
							printHeader, TheBlobInformationStringProvider.DATA_CLASS);
				}
				printHeader = false;
			}
			if (hnacc != null)
				thresholds.put("HNACCMetric: HIGH", ThresholdCalculator.getThresholdValue(hnacc, HRelativeValueConstants.HIGH, true));
		}
		DetectionObject dataClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				dataClassFullInformationString, GlobalStrings.H_DATA_CLASS_SMELL);
		detectionObjectDummys.get(GlobalStrings.H_DATA_CLASS_SMELL).add(dataClassDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
		// HLargeClassLowCohesionSmell
		String lclcInformationString = null;
		HLargeClassLowCohesionSmell hLargeClassLowCohesionSmell = null;
		if (hGodClassAntiPattern != null) {
			hLargeClassLowCohesionSmell = hGodClassAntiPattern.getHLargeClassLowCohesionSmell();
		}
		if (hLargeClassLowCohesionSmell != null) {
			tClass = (TClass) hLargeClassLowCohesionSmell.getTAnnotated();
			detections.put(createDetectionString(tClass), "-1");
			lclcInformationString = theBlobStringProvider.getInformationString(hLargeClassLowCohesionSmell, true,
					TheBlobInformationStringProvider.LARGE_CLASS_LOW_COHESION_SMELL);

		}
		thresholds.put("none", -1);
		DetectionObject hLargeClassLowCohesionDetectionObjectDummy = new DetectionObject(detections, thresholds,
				lclcInformationString, GlobalStrings.H_LARGE_CLASS_LOW_COHESION_SMELL);
		detectionObjectDummys.get(GlobalStrings.H_LARGE_CLASS_LOW_COHESION_SMELL)
				.add(hLargeClassLowCohesionDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		// HControllerClassSmell
		thresholds.put("HInvocationRelationMetric: MEDIUM", -1);
		HControllerClassSmell hControllerClassSmell = null;
		if (hGodClassAntiPattern != null) {
			hControllerClassSmell = hGodClassAntiPattern.getHControllerClassSmell();
		}
		String controllerInformationString = null;
		HInvocationRelation hInvocationRelation = null;
		if (hControllerClassSmell != null) {
			hInvocationRelation = hControllerClassSmell.getHInvocationRelation();
			tClass = (TClass) hControllerClassSmell.getTAnnotated();
			detections.put(createDetectionString(tClass), "-1");
			if (hInvocationRelation != null) {
				thresholds.put("HInvocationRelationMetric: MEDIUM", (ThresholdCalculator
						.getThresholdValue(hInvocationRelation, HRelativeValueConstants.MEDIUM, true)));
			}
			controllerInformationString = theBlobStringProvider.getInformationString(hControllerClassSmell, true,
					TheBlobInformationStringProvider.CONTROLLER_CLASS);
		}
		DetectionObject hControllerClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				controllerInformationString, GlobalStrings.H_CONTROLLERCLASS_SMELL);
		detectionObjectDummys.get(GlobalStrings.H_CONTROLLERCLASS_SMELL).add(hControllerClassDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		// HNACCMetric
		String fullInformationString = "";
		for (HDataClassSmell smell : hDataClassSmells) {
			HNACCMetric hnaccMetric = smell.getHNACCMetric();
			if (hnaccMetric != null) {
				tClass = (TClass) hnaccMetric.getTAnnotated();
				detections.put(createDetectionString(tClass), hnaccMetric.getRelativeAmount().getValue()
						+ ": " + (hnaccMetric.getValue()));
				fullInformationString = fullInformationString + theBlobStringProvider.getInformationString(hnaccMetric,
						printHeader, TheBlobInformationStringProvider.NACC_METRIC);
				printHeader = false;
			} else {
				LOGGER.log(Level.WARN, "HNACC IS NULL");
			}
		}
		thresholds.put("none", -1);
		DetectionObject hnaccDetectionObjectDummy = new DetectionObject(detections, thresholds, fullInformationString,
				GlobalStrings.H_NACC_METRIC);
		detectionObjectDummys.get(GlobalStrings.H_NACC_METRIC).add(hnaccDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
		// HGetterSetterSmell
		String getterSetterFullInformationString = "";
		for (HDataClassSmell smell : hDataClassSmells) {
			List<HGetterSetterSmell> getterSetterSmells = smell.getGetterSetterSmells();
			int numberOfGetterSetters = 0;
			tClass = (TClass) smell.getTAnnotated();
			for (HGetterSetterSmell getterSetter : getterSetterSmells) {
				numberOfGetterSetters++;
				getterSetterFullInformationString = getterSetterFullInformationString + theBlobStringProvider.getInformationString(getterSetter,
						printHeader, TheBlobInformationStringProvider.GETTER_SETTER_SMELL);
				printHeader = false;
			}
			detections.put(createDetectionString(tClass), (numberOfGetterSetters) + " getters/setters");
		}
		thresholds.put("none", -1);
		DetectionObject hGetterSetterDetectionObjectDummy = new DetectionObject(detections, thresholds,
				getterSetterFullInformationString, GlobalStrings.H_GETTER_SETTER_SMELLS);
		detectionObjectDummys.get(GlobalStrings.H_GETTER_SETTER_SMELLS).add(hGetterSetterDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
		// HLowCohesionSmell
		String lowCohesionFullInformationString = "";
		thresholds.put("HLCOM5Metric : at least HIGH", -1);
		HLowCohesionSmell hLowCohesionSmell = null;
		if (hLargeClassLowCohesionSmell != null) {
			hLowCohesionSmell = hLargeClassLowCohesionSmell.getHLowCohesionSmell();
		}
		if (hLowCohesionSmell != null) {
			HLCOM5Metric metric = hLowCohesionSmell.getHLCOM5CustomMetric();
			tClass = (TClass) hLowCohesionSmell.getTAnnotated();
			detections.put(createDetectionString(tClass), "-1");
			thresholds.put("HLCOM5Metric : at least HIGH",
					(ThresholdCalculator.getThresholdValue(metric, HRelativeValueConstants.HIGH, true)));
			lowCohesionFullInformationString = theBlobStringProvider.getInformationString(hLowCohesionSmell, true,
					TheBlobInformationStringProvider.LOW_COHESION_SMELL);
		}
		DetectionObject hLowCohesionDetectionObjectDummy = new DetectionObject(detections, thresholds,
				lowCohesionFullInformationString, GlobalStrings.H_LOW_COHESION_SMELL);
		detectionObjectDummys.get(GlobalStrings.H_LOW_COHESION_SMELL).add(hLowCohesionDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
		// HLargeClassSmell
		String largeClassfullInformationString = "";
		thresholds.put("HNumberOfMembersMetric: at least HIGH", -1);
		HLargeClassSmell hLargeClassSmell = null;
		if (hLargeClassLowCohesionSmell != null) {
			hLargeClassSmell = hLargeClassLowCohesionSmell.getHLargeClassSmell();
		}
		HNumberOfMembersMetric hNumberOfMembersMetric = null;
		if (hLargeClassSmell != null) {
			hNumberOfMembersMetric = hLargeClassSmell.getHNumberOfMembers();
			tClass = (TClass) hLargeClassSmell.getTAnnotated();
			detections.put(createDetectionString(tClass), "-1");
			if (hNumberOfMembersMetric != null) {
				thresholds.put("HNumberOfMembersMetric: at least HIGH", (ThresholdCalculator
						.getThresholdValue(hNumberOfMembersMetric, HRelativeValueConstants.HIGH, true)));
			}
			largeClassfullInformationString = theBlobStringProvider.getInformationString(hLargeClassSmell, true,
					TheBlobInformationStringProvider.LARGE_CLASS_SMELL);
		}
		DetectionObject hLargeClassDetectionObjectDummy = new DetectionObject(detections,thresholds,largeClassfullInformationString,GlobalStrings.H_LARGE_CLASS_SMELL);
		detectionObjectDummys.get(GlobalStrings.H_LARGE_CLASS_SMELL).add(hLargeClassDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
		// HInvocationRelation
		String invocRelFullInformationString = "";
		thresholds.put("none", -1);
		if (hInvocationRelation != null) {
			tClass = (TClass) hInvocationRelation.getTAnnotated();
			detections.put(createDetectionString(tClass), hInvocationRelation.getRelativeAmount().getValue().toString()
					+ ": " + (hInvocationRelation.getValue()));
			invocRelFullInformationString = theBlobStringProvider.getInformationString(hInvocationRelation, true,
					TheBlobInformationStringProvider.INVOCATION_RELATION);
		}
		DetectionObject hInvocationRelationDetectionObjectDummy = new DetectionObject(detections,thresholds,invocRelFullInformationString,GlobalStrings.H_INVOCATIONRELATION_SMELL);
		detectionObjectDummys.get(GlobalStrings.H_INVOCATIONRELATION_SMELL)
				.add(hInvocationRelationDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
		// HLCOM5Metric
		String lcomFullInformationString = "";
		thresholds.put("none", -1);
		HLCOM5Metric hlcom5Metric = null;
		if (hLowCohesionSmell != null) {
			hlcom5Metric = hLowCohesionSmell.getHLCOM5CustomMetric();
		}
		if (hlcom5Metric != null) {
			tClass = (TClass) hlcom5Metric.getTAnnotated();
			detections.put(createDetectionString(tClass), hlcom5Metric.getRelativeAmount().getValue().toString() + ": "
					+ (hlcom5Metric.getValue()));
			lcomFullInformationString = theBlobStringProvider.getInformationString(hlcom5Metric, true,
					TheBlobInformationStringProvider.LCOM5);
		}
		DetectionObject hLCOM5DetectionObjectDummy = new DetectionObject(detections,thresholds,lcomFullInformationString,GlobalStrings.H_LCOM5_METRIC);
		detectionObjectDummys.get(GlobalStrings.H_LCOM5_METRIC).add(hLCOM5DetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
		// HNumberOfMembersMetric
		String numMembersFullInformationString = "";
		thresholds.put("none", -1);
		if (hLargeClassSmell != null)
			hNumberOfMembersMetric = hLargeClassSmell.getHNumberOfMembers();
		if (hNumberOfMembersMetric != null) {
			tClass = (TClass) hNumberOfMembersMetric.getTAnnotated();
			detections.put(createDetectionString(tClass),
					hNumberOfMembersMetric.getRelativeAmount().getValue().toString() + ": "
							+ (hNumberOfMembersMetric.getValue()));
			thresholds.put("none", -1);
			numMembersFullInformationString = theBlobStringProvider.getInformationString(hNumberOfMembersMetric, true,
					TheBlobInformationStringProvider.NUMBER_OF_MEMBERS_METRIC);
		}
		DetectionObject hNumberOfMembersDetectionObjectDummy = new DetectionObject(detections,thresholds,numMembersFullInformationString,GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC);
		detectionObjectDummys.get(GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC).add(hNumberOfMembersDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
		// HNumberOfIncommingInvocation
		String inInvocFullInformationString = "";
		thresholds.put("none", -1);
		HIncommingInvocationMetric hNumberOfIncommingInvocationsMetric = null;
		if (hInvocationRelation != null) {
			hNumberOfIncommingInvocationsMetric = hInvocationRelation.getHIncommingInvocationCustomMetric();
		}
		if (hNumberOfIncommingInvocationsMetric != null) {
			tClass = (TClass) hNumberOfIncommingInvocationsMetric.getTAnnotated();
			detections.put(createDetectionString(tClass),
					hNumberOfIncommingInvocationsMetric.getRelativeAmount().getValue() + ": "
							+ (hNumberOfIncommingInvocationsMetric.getValue()));
			inInvocFullInformationString = theBlobStringProvider.getInformationString(hNumberOfIncommingInvocationsMetric,
					true, TheBlobInformationStringProvider.NUMBER_OF_INCOMMING_INVOCATIONS_METRIC);
		}
		DetectionObject hNumberOfIcommingInvocationsDetectionObjectDummy = new DetectionObject(detections,thresholds,inInvocFullInformationString, GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL);
		detectionObjectDummys.get(GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL)
				.add(hNumberOfIcommingInvocationsDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
		// HNumberOfOutgoingInvocationsMetric
		String outInvocFullInformationString = "";
		thresholds.put("none", -1);
		HOutgoingInvocationMetric hNumberOfOutgoingInvocationsMetric = null;
		if (hInvocationRelation != null) {
			hNumberOfOutgoingInvocationsMetric = hInvocationRelation.getHOutgoingInvocationCustomMetric();
		}
		if (hNumberOfOutgoingInvocationsMetric != null) {
			tClass = (TClass) hNumberOfOutgoingInvocationsMetric.getTAnnotated();
			detections.put(createDetectionString(tClass),
					hNumberOfOutgoingInvocationsMetric.getRelativeAmount().getValue().toString() + ": "
							+ (hNumberOfOutgoingInvocationsMetric.getValue()));
			outInvocFullInformationString = theBlobStringProvider.getInformationString(hNumberOfOutgoingInvocationsMetric, true,
					TheBlobInformationStringProvider.NUMBER_OF_OUTGOING_INVOCATIONS_METRIC);
		}
		DetectionObject hNumberOfOutgoingInvocationsDetectionObjectDummy = new DetectionObject(detections,thresholds,outInvocFullInformationString, GlobalStrings.H_NUMBER_OF_OUTGOING_INVOCATIONS_SMELL);
		detectionObjectDummys.get(GlobalStrings.H_NUMBER_OF_OUTGOING_INVOCATIONS_SMELL)
				.add(hNumberOfOutgoingInvocationsDetectionObjectDummy);
		detections.clear();
		thresholds.clear();
		tClass = null;
		printHeader = true;
	}

	private Map<GlobalStrings, List<DetectionObject>> initializeMap() {
		Map<GlobalStrings, List<DetectionObject>> detectionObjectDummys = new HashMap<GlobalStrings, List<DetectionObject>>();
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
		detectionObjectDummys.put(GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL,
				new LinkedList<DetectionObject>());
		detectionObjectDummys.put(GlobalStrings.H_NUMBER_OF_OUTGOING_INVOCATIONS_SMELL,
				new LinkedList<DetectionObject>());
		return detectionObjectDummys;
	}

}
