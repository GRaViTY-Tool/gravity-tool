package org.gravity.hulk.ui.visualization.detection;

import java.util.EnumMap;
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
import org.gravity.hulk.ui.visualization.util.Flaws;
import org.gravity.hulk.ui.visualization.util.ThresholdCalculator;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;

public class TheBlobPreprocessor extends DetectionPreprocessor {

	private static final Logger LOGGER = Logger.getLogger(TheBlobPreprocessor.class.getName());

	private TheBlobInformationStringProvider theBlobStringProvider;

	public TheBlobPreprocessor() {
		theBlobStringProvider = new TheBlobInformationStringProvider();
	}

	@Override
	public Map<Flaws, List<DetectionObject>> preprocessDetections(HAntiPatternGraph apg) {
		Map<Flaws, List<DetectionObject>> detectionObjects = initializeMap();

		if (apg != null) {
			for (HAnnotation a : apg.getHAnnotations()) {
				if (a instanceof HBlobAntiPattern) {
					preprocessDetections(detectionObjects, (HBlobAntiPattern) a);
				}
			}

		}
		return detectionObjects;
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects, HBlobAntiPattern hBlob) {

		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();

		// The Blob
		for (TAnnotation tAnnotation : hBlob.getTAnnotated().getTAnnotation()) {
			if (tAnnotation instanceof HDataClassAccessor) {
				HDataClassAccessor hDataClassAccessor = (HDataClassAccessor) tAnnotation;
				// HDataClassAccessor
				TClass accessorClass = (TClass) hDataClassAccessor.getTAnnotated();
				DetectionObject dataClassAccessorObject = new DetectionObject(detections, thresholds, null,
						Flaws.H_DATA_CLASS_ACCESSOR);
				detections.put(accessorClass, String.valueOf(hDataClassAccessor.getValue()));
				detectionObjects.get(Flaws.H_DATA_CLASS_ACCESSOR).add(dataClassAccessorObject);
				thresholds.put("HDataClassAccessor: MEDIUM", ThresholdCalculator.getThresholdValue(hDataClassAccessor,
						HRelativeValueConstants.MEDIUM, true));
				break;
			}
		}
		detections.put(((TClass) hBlob.getTAnnotated()), "-1");
		DetectionObject theBlobDetectionObjectDummy = new DetectionObject(detections, thresholds,
				theBlobStringProvider.getInformationString(hBlob, true, Flaws.H_BLOB_ANTIPATTERN),
				Flaws.H_BLOB_ANTIPATTERN);
		detectionObjects.get(Flaws.H_BLOB_ANTIPATTERN).add(theBlobDetectionObjectDummy);

		HGodClassAntiPattern hGodClassAntiPattern = hBlob.getHGodClassAntiPattern();
		preprocessDetections(detectionObjects, hGodClassAntiPattern);

		List<HDataClassSmell> hDataClassSmells = hBlob.getHDataClassSmells();
		preprocessDetections(detectionObjects, hDataClassSmells.toArray(new HDataClassSmell[hDataClassSmells.size()]));

		// HLargeClassLowCohesionSmell
		HLargeClassLowCohesionSmell hLargeClassLowCohesionSmell = null;
		if (hGodClassAntiPattern != null) {
			hLargeClassLowCohesionSmell = hGodClassAntiPattern.getHLargeClassLowCohesionSmell();
		}
		preprocessDetections(detectionObjects, hLargeClassLowCohesionSmell);

		HControllerClassSmell hControllerClassSmell = null;
		if (hGodClassAntiPattern != null) {
			hControllerClassSmell = hGodClassAntiPattern.getHControllerClassSmell();
		}
		HInvocationRelation hInvocationRelation = preprocessDetections(detectionObjects, hControllerClassSmell);

		// HLowCohesionSmell
		HLowCohesionSmell hLowCohesionSmell = null;
		if (hLargeClassLowCohesionSmell != null) {
			hLowCohesionSmell = hLargeClassLowCohesionSmell.getHLowCohesionSmell();
		}
		preprocessDetections(detectionObjects, hLowCohesionSmell);

		// HLargeClassSmell
		HLargeClassSmell hLargeClassSmell = null;
		if (hLargeClassLowCohesionSmell != null) {
			hLargeClassSmell = hLargeClassLowCohesionSmell.getHLargeClassSmell();
		}
		HNumberOfMembersMetric hNumberOfMembersMetric = preprocessDetections(detectionObjects, hLargeClassSmell);

		preprocessDetections(detectionObjects, hInvocationRelation);

		HLCOM5Metric hlcom5Metric = null;
		if (hLowCohesionSmell != null) {
			hlcom5Metric = hLowCohesionSmell.getHLCOM5CustomMetric();
		}
		preprocessDetections(detectionObjects, hlcom5Metric);

		if (hLargeClassSmell != null) {
			hNumberOfMembersMetric = hLargeClassSmell.getHNumberOfMembers();
		}
		preprocessDetections(detectionObjects, hNumberOfMembersMetric);

		HIncommingInvocationMetric hNumberOfIncommingInvocationsMetric = null;
		if (hInvocationRelation != null) {
			hNumberOfIncommingInvocationsMetric = hInvocationRelation.getHIncommingInvocationCustomMetric();
		}
		preprocessDetections(detectionObjects, hNumberOfIncommingInvocationsMetric);

		HOutgoingInvocationMetric hNumberOfOutgoingInvocationsMetric = null;
		if (hInvocationRelation != null) {
			hNumberOfOutgoingInvocationsMetric = hInvocationRelation.getHOutgoingInvocationCustomMetric();
		}
		preprocessDetections(detectionObjects, hNumberOfOutgoingInvocationsMetric);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HNumberOfMembersMetric hNumberOfMembersMetric) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		// HNumberOfMembersMetric
		String numMembersFullInformationString = "";
		thresholds.put("none", -1);
		if (hNumberOfMembersMetric != null) {
			TClass tClass = (TClass) hNumberOfMembersMetric.getTAnnotated();
			detections.put(tClass,
					hNumberOfMembersMetric.getRelativeAmount().getValue().toString() + ": "
							+ (hNumberOfMembersMetric.getValue()));
			thresholds.put("none", -1);
			numMembersFullInformationString = theBlobStringProvider.getInformationString(hNumberOfMembersMetric, true,
					Flaws.H_NUMBER_OF_MEMBERS_METRIC);
		}
		DetectionObject hNumberOfMembersDetectionObjectDummy = new DetectionObject(detections, thresholds,
				numMembersFullInformationString, Flaws.H_NUMBER_OF_MEMBERS_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_MEMBERS_METRIC).add(hNumberOfMembersDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HIncommingInvocationMetric hNumberOfIncommingInvocationsMetric) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		// HNumberOfIncommingInvocation
		String inInvocFullInformationString = "";
		thresholds.put("none", -1);
		if (hNumberOfIncommingInvocationsMetric != null) {
			TClass tClass = (TClass) hNumberOfIncommingInvocationsMetric.getTAnnotated();
			detections.put(tClass,
					hNumberOfIncommingInvocationsMetric.getRelativeAmount().getValue() + ": "
							+ (hNumberOfIncommingInvocationsMetric.getValue()));
			inInvocFullInformationString = theBlobStringProvider.getInformationString(
					hNumberOfIncommingInvocationsMetric, true, Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC);
		}
		DetectionObject hNumberOfIcommingInvocationsDetectionObjectDummy = new DetectionObject(detections, thresholds,
				inInvocFullInformationString, Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC)
				.add(hNumberOfIcommingInvocationsDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HOutgoingInvocationMetric hNumberOfOutgoingInvocationsMetric) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		// HNumberOfOutgoingInvocationsMetric
		String outInvocFullInformationString = "";
		thresholds.put("none", -1);
		if (hNumberOfOutgoingInvocationsMetric != null) {
			TClass tClass = (TClass) hNumberOfOutgoingInvocationsMetric.getTAnnotated();
			detections.put(tClass,
					hNumberOfOutgoingInvocationsMetric.getRelativeAmount().getValue().toString() + ": "
							+ (hNumberOfOutgoingInvocationsMetric.getValue()));
			outInvocFullInformationString = theBlobStringProvider.getInformationString(
					hNumberOfOutgoingInvocationsMetric, true, Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC);
		}
		DetectionObject hNumberOfOutgoingInvocationsDetectionObjectDummy = new DetectionObject(detections, thresholds,
				outInvocFullInformationString, Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC)
				.add(hNumberOfOutgoingInvocationsDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects, HLCOM5Metric hlcom5Metric) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		// HLCOM5Metric
		String lcomFullInformationString = "";
		thresholds.put("none", -1);
		if (hlcom5Metric != null) {
			TClass tClass = (TClass) hlcom5Metric.getTAnnotated();
			detections.put(tClass,
					hlcom5Metric.getRelativeAmount().getValue().toString() + ": " + (hlcom5Metric.getValue()));
			lcomFullInformationString = theBlobStringProvider.getInformationString(hlcom5Metric, true,
					Flaws.H_LCOM5_METRIC);
		}
		DetectionObject hLCOM5DetectionObjectDummy = new DetectionObject(detections, thresholds,
				lcomFullInformationString, Flaws.H_LCOM5_METRIC);
		detectionObjects.get(Flaws.H_LCOM5_METRIC).add(hLCOM5DetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HInvocationRelation hInvocationRelation) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		// HInvocationRelation
		String invocRelFullInformationString = "";
		thresholds.put("none", -1);
		if (hInvocationRelation != null) {
			TClass tClass = (TClass) hInvocationRelation.getTAnnotated();
			detections.put(tClass, hInvocationRelation.getRelativeAmount().getValue().toString()
					+ ": " + (hInvocationRelation.getValue()));
			invocRelFullInformationString = theBlobStringProvider.getInformationString(hInvocationRelation, true,
					Flaws.H_INVOCATIONRELATION_METRIC);
		}
		DetectionObject hInvocationRelationDetectionObjectDummy = new DetectionObject(detections, thresholds,
				invocRelFullInformationString, Flaws.H_INVOCATIONRELATION_METRIC);
		detectionObjects.get(Flaws.H_INVOCATIONRELATION_METRIC).add(hInvocationRelationDetectionObjectDummy);
	}

	private HNumberOfMembersMetric preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLargeClassSmell hLargeClassSmell) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		String largeClassfullInformationString = "";
		thresholds.put("HNumberOfMembersMetric: at least HIGH", -1);
		HNumberOfMembersMetric hNumberOfMembersMetric = null;
		if (hLargeClassSmell != null) {
			hNumberOfMembersMetric = hLargeClassSmell.getHNumberOfMembers();
			TClass tClass = (TClass) hLargeClassSmell.getTAnnotated();
			detections.put(tClass, "-1");
			if (hNumberOfMembersMetric != null) {
				thresholds.put("HNumberOfMembersMetric: at least HIGH", (ThresholdCalculator
						.getThresholdValue(hNumberOfMembersMetric, HRelativeValueConstants.HIGH, true)));
			}
			largeClassfullInformationString = theBlobStringProvider.getInformationString(hLargeClassSmell, true,
					Flaws.H_LARGE_CLASS_SMELL);
		}
		DetectionObject hLargeClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				largeClassfullInformationString, Flaws.H_LARGE_CLASS_SMELL);
		detectionObjects.get(Flaws.H_LARGE_CLASS_SMELL).add(hLargeClassDetectionObjectDummy);
		return hNumberOfMembersMetric;
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLowCohesionSmell hLowCohesionSmell) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		String lowCohesionFullInformationString = "";
		thresholds.put("HLCOM5Metric : at least HIGH", -1);
		if (hLowCohesionSmell != null) {
			HLCOM5Metric metric = hLowCohesionSmell.getHLCOM5CustomMetric();
			TClass tClass = (TClass) hLowCohesionSmell.getTAnnotated();
			detections.put(tClass, "-1");
			thresholds.put("HLCOM5Metric : at least HIGH",
					(ThresholdCalculator.getThresholdValue(metric, HRelativeValueConstants.HIGH, true)));
			lowCohesionFullInformationString = theBlobStringProvider.getInformationString(hLowCohesionSmell, true,
					Flaws.H_LOW_COHESION_SMELL);
		}
		DetectionObject hLowCohesionDetectionObjectDummy = new DetectionObject(detections, thresholds,
				lowCohesionFullInformationString, Flaws.H_LOW_COHESION_SMELL);
		detectionObjects.get(Flaws.H_LOW_COHESION_SMELL).add(hLowCohesionDetectionObjectDummy);
	}

	private HInvocationRelation preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HControllerClassSmell hControllerClassSmell) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		// HControllerClassSmell
		thresholds.put("HInvocationRelationMetric: MEDIUM", -1);
		String controllerInformationString = "";
		HInvocationRelation hInvocationRelation = null;
		if (hControllerClassSmell != null) {
			hInvocationRelation = hControllerClassSmell.getHInvocationRelation();
			TClass tClass = (TClass) hControllerClassSmell.getTAnnotated();
			detections.put(tClass, "-1");
			if (hInvocationRelation != null) {
				thresholds.put("HInvocationRelationMetric: MEDIUM", (ThresholdCalculator
						.getThresholdValue(hInvocationRelation, HRelativeValueConstants.MEDIUM, true)));
			}
			controllerInformationString = theBlobStringProvider.getInformationString(hControllerClassSmell, true,
					Flaws.H_CONTROLLERCLASS_SMELL);
		}
		DetectionObject hControllerClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				controllerInformationString, Flaws.H_CONTROLLERCLASS_SMELL);
		detectionObjects.get(Flaws.H_CONTROLLERCLASS_SMELL).add(hControllerClassDetectionObjectDummy);
		return hInvocationRelation;
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLargeClassLowCohesionSmell hLargeClassLowCohesionSmell) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		String lclcInformationString = "";
		if (hLargeClassLowCohesionSmell != null) {
			TClass tClass = (TClass) hLargeClassLowCohesionSmell.getTAnnotated();
			detections.put(tClass, "-1");
			lclcInformationString = theBlobStringProvider.getInformationString(hLargeClassLowCohesionSmell, true,
					Flaws.H_LARGE_CLASS_LOW_COHESION_SMELL);

		}
		thresholds.put("none", -1);
		DetectionObject hLargeClassLowCohesionDetectionObjectDummy = new DetectionObject(detections, thresholds,
				lclcInformationString, Flaws.H_LARGE_CLASS_LOW_COHESION_SMELL);
		detectionObjects.get(Flaws.H_LARGE_CLASS_LOW_COHESION_SMELL).add(hLargeClassLowCohesionDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HDataClassSmell[] hDataClassSmells) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		// DataClassSmells
		thresholds.put("HNACCMetric: HIGH", -1);
		String dataClassFullInformationString = "";
		boolean printHeader = true;

		if (hDataClassSmells.length > 0) {
			List<HNACCMetric> hnaccMetrics = new LinkedList<HNACCMetric>();
			for (HDataClassSmell smell : hDataClassSmells) {
				HNACCMetric hnaccMetric = smell.getHNACCMetric();
				if (hnaccMetric != null) {
					hnaccMetrics.add(hnaccMetric);
				}
				TClass tClass = (TClass) smell.getTAnnotated();
				detections.put(tClass, "-1");
				if (hnaccMetric != null) {
					dataClassFullInformationString = theBlobStringProvider.getInformationString(smell, printHeader,
							Flaws.H_DATA_CLASS_SMELL);
				}
				printHeader = false;
			}
			if (!hnaccMetrics.isEmpty()) {
				thresholds.put("HNACCMetric: HIGH",
						ThresholdCalculator.getThresholdValue(hnaccMetrics.get(0), HRelativeValueConstants.HIGH, true));
			}

			preprocessDetections(detectionObjects, hnaccMetrics.toArray(new HNACCMetric[hnaccMetrics.size()]));

			Map<TAbstractType, String> detections2 = new HashMap<>();
			Map<String, Number> thresholds2 = new HashMap<>();
			// HGetterSetterSmell
			StringBuilder getterSetterFullInformationString = new StringBuilder();
			for (HDataClassSmell smell : hDataClassSmells) {
				List<HGetterSetterSmell> getterSetterSmells = smell.getGetterSetterSmells();
				int numberOfGetterSetters = 0;
				for (HGetterSetterSmell getterSetter : getterSetterSmells) {
					numberOfGetterSetters++;
					getterSetterFullInformationString.append(theBlobStringProvider.getInformationString(getterSetter,
							printHeader, Flaws.H_GETTER_SETTER_SMELLS));
					printHeader = false;
				}
				TClass tClass = (TClass) smell.getTAnnotated();
				detections2.put(tClass, (numberOfGetterSetters) + " getters/setters");
			}
			thresholds2.put("none", -1);
			DetectionObject hGetterSetterDetectionObjectDummy = new DetectionObject(detections2, thresholds2,
					getterSetterFullInformationString.toString(), Flaws.H_GETTER_SETTER_SMELLS);
			detectionObjects.get(Flaws.H_GETTER_SETTER_SMELLS).add(hGetterSetterDetectionObjectDummy);
		}
		DetectionObject dataClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				dataClassFullInformationString, Flaws.H_DATA_CLASS_SMELL);
		detectionObjects.get(Flaws.H_DATA_CLASS_SMELL).add(dataClassDetectionObjectDummy);

	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects, HNACCMetric[] hnaccMetrics) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		// HNACCMetric
		StringBuilder fullInformationString = new StringBuilder();
		boolean printHeader = true;
		for (HNACCMetric hnaccMetric : hnaccMetrics) {
			if (hnaccMetric != null) {
				TClass tClass = (TClass) hnaccMetric.getTAnnotated();
				detections.put(tClass,
						hnaccMetric.getRelativeAmount().getValue() + ": " + (hnaccMetric.getValue()));
				fullInformationString.append(
						theBlobStringProvider.getInformationString(hnaccMetric, printHeader, Flaws.H_NACC_METRIC));
				printHeader = false;
			} else {
				LOGGER.log(Level.WARN, "HNACC IS NULL");
			}
		}
		thresholds.put("none", -1);
		DetectionObject hnaccDetectionObjectDummy = new DetectionObject(detections, thresholds,
				fullInformationString.toString(), Flaws.H_NACC_METRIC);
		detectionObjects.get(Flaws.H_NACC_METRIC).add(hnaccDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HGodClassAntiPattern hGodClassAntiPattern) {
		Map<TAbstractType, String> detections = new HashMap<>();
		Map<String, Number> thresholds = new HashMap<>();
		// GodClass
		if (hGodClassAntiPattern != null) {
			TClass tClass = (TClass) hGodClassAntiPattern.getTAnnotated();
			detections.put(tClass, "-1");
		}
		thresholds.put("none", -1);
		DetectionObject godClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				theBlobStringProvider.getInformationString(hGodClassAntiPattern, true, Flaws.H_GODCLASS_ANTIPATTERN),
				Flaws.H_GODCLASS_ANTIPATTERN);
		detectionObjects.get(Flaws.H_GODCLASS_ANTIPATTERN).add(godClassDetectionObjectDummy);
	}

	private Map<Flaws, List<DetectionObject>> initializeMap() {
		Map<Flaws, List<DetectionObject>> detectionObjects = new EnumMap<>(Flaws.class);
		detectionObjects.put(Flaws.H_BLOB_ANTIPATTERN, new LinkedList<>());
		detectionObjects.put(Flaws.H_GODCLASS_ANTIPATTERN, new LinkedList<>());
		detectionObjects.put(Flaws.H_DATA_CLASS_ACCESSOR, new LinkedList<>());
		detectionObjects.put(Flaws.H_DATA_CLASS_SMELL, new LinkedList<>());
		detectionObjects.put(Flaws.H_GETTER_SETTER_SMELLS, new LinkedList<>());
		detectionObjects.put(Flaws.H_NACC_METRIC, new LinkedList<>());
		detectionObjects.put(Flaws.H_CONTROLLERCLASS_SMELL, new LinkedList<>());
		detectionObjects.put(Flaws.H_LARGE_CLASS_LOW_COHESION_SMELL, new LinkedList<>());
		detectionObjects.put(Flaws.H_INVOCATIONRELATION_METRIC, new LinkedList<>());
		detectionObjects.put(Flaws.H_LOW_COHESION_SMELL, new LinkedList<>());
		detectionObjects.put(Flaws.H_LARGE_CLASS_SMELL, new LinkedList<>());
		detectionObjects.put(Flaws.H_LCOM5_METRIC, new LinkedList<>());
		detectionObjects.put(Flaws.H_NUMBER_OF_MEMBERS_METRIC, new LinkedList<>());
		detectionObjects.put(Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC, new LinkedList<>());
		detectionObjects.put(Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC, new LinkedList<>());
		return detectionObjects;
	}

}
