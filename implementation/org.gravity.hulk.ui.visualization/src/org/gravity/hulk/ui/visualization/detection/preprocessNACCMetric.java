package org.gravity.hulk.ui.visualization.detection;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;

public class TheBlobPreprocessor implements DetectionPreprocessor {

	private static final Logger LOGGER = Logger.getLogger(TheBlobPreprocessor.class.getName());

	private final TheBlobInformationStringProvider theBlobStringProvider;

	public TheBlobPreprocessor() {
		this.theBlobStringProvider = new TheBlobInformationStringProvider();
	}

	@Override
	public Map<Flaws, List<DetectionObject>> preprocessDetections(HAntiPatternGraph apg) {
		final Map<Flaws, List<DetectionObject>> detectionObjects = initializeMap();

		if (apg != null) {
			for (final HAnnotation a : apg.getHAnnotations()) {
				if (a instanceof HBlobAntiPattern) {
					preprocessDetections(detectionObjects, (HBlobAntiPattern) a);
				}
			}

		}
		return detectionObjects;
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects, HBlobAntiPattern hBlob) {

		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();

		// The Blob
		for (final TAnnotation tAnnotation : hBlob.getTAnnotated().getTAnnotation()) {
			if (tAnnotation instanceof HDataClassAccessor) {
				final HDataClassAccessor hDataClassAccessor = (HDataClassAccessor) tAnnotation;
				// HDataClassAccessor
				final TClass accessorClass = (TClass) hDataClassAccessor.getTAnnotated();
				final DetectionObject dataClassAccessorObject = new DetectionObject(detections, thresholds, null,
						Flaws.H_DATA_CLASS_ACCESSOR);
				detections.put(accessorClass, String.valueOf(hDataClassAccessor.getValue()));
				detectionObjects.get(Flaws.H_DATA_CLASS_ACCESSOR).add(dataClassAccessorObject);
				thresholds.put("HDataClassAccessor: MEDIUM", ThresholdCalculator.getThresholdValue(hDataClassAccessor,
						HRelativeValueConstants.MEDIUM, true));
				break;
			}
		}
		detections.put(((TClass) hBlob.getTAnnotated()), "-1");
		final DetectionObject theBlobDetectionObjectDummy = new DetectionObject(detections, thresholds,
				this.theBlobStringProvider.getInformationString(hBlob, true, Flaws.H_BLOB_ANTIPATTERN),
				Flaws.H_BLOB_ANTIPATTERN);
		detectionObjects.get(Flaws.H_BLOB_ANTIPATTERN).add(theBlobDetectionObjectDummy);

		final HGodClassAntiPattern hGodClassAntiPattern = hBlob.getHGodClassAntiPattern();
		preprocessDetections(detectionObjects, hGodClassAntiPattern);

		final List<HDataClassSmell> hDataClassSmells = hBlob.getHDataClassSmells();
		preprocessDetections(detectionObjects, hDataClassSmells.toArray(new HDataClassSmell[0]));

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
		final HInvocationRelation hInvocationRelation = preprocessDetections(detectionObjects, hControllerClassSmell);

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
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HNumberOfMembersMetric
		String numMembersFullInformationString = "";
		thresholds.put("none", -1);
		if (hNumberOfMembersMetric != null) {
			final TClass tClass = (TClass) hNumberOfMembersMetric.getTAnnotated();
			detections.put(tClass,
					hNumberOfMembersMetric.getRelativeAmount().getValue().toString() + ": "
							+ (hNumberOfMembersMetric.getValue()));
			thresholds.put("none", -1);
			numMembersFullInformationString = this.theBlobStringProvider.getInformationString(hNumberOfMembersMetric, true,
					Flaws.H_NUMBER_OF_MEMBERS_METRIC);
		}
		final DetectionObject hNumberOfMembersDetectionObjectDummy = new DetectionObject(detections, thresholds,
				numMembersFullInformationString, Flaws.H_NUMBER_OF_MEMBERS_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_MEMBERS_METRIC).add(hNumberOfMembersDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HIncommingInvocationMetric hNumberOfIncommingInvocationsMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HNumberOfIncommingInvocation
		String inInvocFullInformationString = "";
		thresholds.put("none", -1);
		if (hNumberOfIncommingInvocationsMetric != null) {
			final TClass tClass = (TClass) hNumberOfIncommingInvocationsMetric.getTAnnotated();
			detections.put(tClass,
					hNumberOfIncommingInvocationsMetric.getRelativeAmount().getValue() + ": "
							+ (hNumberOfIncommingInvocationsMetric.getValue()));
			inInvocFullInformationString = this.theBlobStringProvider.getInformationString(
					hNumberOfIncommingInvocationsMetric, true, Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC);
		}
		final DetectionObject hNumberOfIcommingInvocationsDetectionObjectDummy = new DetectionObject(detections, thresholds,
				inInvocFullInformationString, Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC)
		.add(hNumberOfIcommingInvocationsDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HOutgoingInvocationMetric hNumberOfOutgoingInvocationsMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HNumberOfOutgoingInvocationsMetric
		String outInvocFullInformationString = "";
		thresholds.put("none", -1);
		if (hNumberOfOutgoingInvocationsMetric != null) {
			final TClass tClass = (TClass) hNumberOfOutgoingInvocationsMetric.getTAnnotated();
			detections.put(tClass,
					hNumberOfOutgoingInvocationsMetric.getRelativeAmount().getValue().toString() + ": "
							+ (hNumberOfOutgoingInvocationsMetric.getValue()));
			outInvocFullInformationString = this.theBlobStringProvider.getInformationString(
					hNumberOfOutgoingInvocationsMetric, true, Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC);
		}
		final DetectionObject hNumberOfOutgoingInvocationsDetectionObjectDummy = new DetectionObject(detections, thresholds,
				outInvocFullInformationString, Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC)
		.add(hNumberOfOutgoingInvocationsDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects, HLCOM5Metric hlcom5Metric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HLCOM5Metric
		String lcomFullInformationString = "";
		thresholds.put("none", -1);
		if (hlcom5Metric != null) {
			final TClass tClass = (TClass) hlcom5Metric.getTAnnotated();
			detections.put(tClass,
					hlcom5Metric.getRelativeAmount().getValue().toString() + ": " + (hlcom5Metric.getValue()));
			lcomFullInformationString = this.theBlobStringProvider.getInformationString(hlcom5Metric, true,
					Flaws.H_LCOM5_METRIC);
		}
		final DetectionObject hLCOM5DetectionObjectDummy = new DetectionObject(detections, thresholds,
				lcomFullInformationString, Flaws.H_LCOM5_METRIC);
		detectionObjects.get(Flaws.H_LCOM5_METRIC).add(hLCOM5DetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HInvocationRelation hInvocationRelation) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HInvocationRelation
		String invocRelFullInformationString = "";
		thresholds.put("none", -1);
		if (hInvocationRelation != null) {
			final TClass tClass = (TClass) hInvocationRelation.getTAnnotated();
			detections.put(tClass, hInvocationRelation.getRelativeAmount().getValue().toString()
					+ ": " + (hInvocationRelation.getValue()));
			invocRelFullInformationString = this.theBlobStringProvider.getInformationString(hInvocationRelation, true,
					Flaws.H_INVOCATIONRELATION_METRIC);
		}
		final DetectionObject hInvocationRelationDetectionObjectDummy = new DetectionObject(detections, thresholds,
				invocRelFullInformationString, Flaws.H_INVOCATIONRELATION_METRIC);
		detectionObjects.get(Flaws.H_INVOCATIONRELATION_METRIC).add(hInvocationRelationDetectionObjectDummy);
	}

	private HNumberOfMembersMetric preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLargeClassSmell hLargeClassSmell) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		String largeClassfullInformationString = "";
		thresholds.put("HNumberOfMembersMetric: at least HIGH", -1);
		HNumberOfMembersMetric hNumberOfMembersMetric = null;
		if (hLargeClassSmell != null) {
			hNumberOfMembersMetric = hLargeClassSmell.getHNumberOfMembers();
			final TClass tClass = (TClass) hLargeClassSmell.getTAnnotated();
			detections.put(tClass, "-1");
			if (hNumberOfMembersMetric != null) {
				thresholds.put("HNumberOfMembersMetric: at least HIGH", (ThresholdCalculator
						.getThresholdValue(hNumberOfMembersMetric, HRelativeValueConstants.HIGH, true)));
			}
			largeClassfullInformationString = this.theBlobStringProvider.getInformationString(hLargeClassSmell, true,
					Flaws.H_LARGE_CLASS_SMELL);
		}
		final DetectionObject hLargeClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				largeClassfullInformationString, Flaws.H_LARGE_CLASS_SMELL);
		detectionObjects.get(Flaws.H_LARGE_CLASS_SMELL).add(hLargeClassDetectionObjectDummy);
		return hNumberOfMembersMetric;
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLowCohesionSmell hLowCohesionSmell) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		String lowCohesionFullInformationString = "";
		thresholds.put("HLCOM5Metric : at least HIGH", -1);
		if (hLowCohesionSmell != null) {
			final HLCOM5Metric metric = hLowCohesionSmell.getHLCOM5CustomMetric();
			final TClass tClass = (TClass) hLowCohesionSmell.getTAnnotated();
			detections.put(tClass, "-1");
			thresholds.put("HLCOM5Metric : at least HIGH",
					(ThresholdCalculator.getThresholdValue(metric, HRelativeValueConstants.HIGH, true)));
			lowCohesionFullInformationString = this.theBlobStringProvider.getInformationString(hLowCohesionSmell, true,
					Flaws.H_LOW_COHESION_SMELL);
		}
		final DetectionObject hLowCohesionDetectionObjectDummy = new DetectionObject(detections, thresholds,
				lowCohesionFullInformationString, Flaws.H_LOW_COHESION_SMELL);
		detectionObjects.get(Flaws.H_LOW_COHESION_SMELL).add(hLowCohesionDetectionObjectDummy);
	}

	private HInvocationRelation preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HControllerClassSmell hControllerClassSmell) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HControllerClassSmell
		thresholds.put("HInvocationRelationMetric: MEDIUM", -1);
		String controllerInformationString = "";
		HInvocationRelation hInvocationRelation = null;
		if (hControllerClassSmell != null) {
			hInvocationRelation = hControllerClassSmell.getHInvocationRelation();
			final TClass tClass = (TClass) hControllerClassSmell.getTAnnotated();
			detections.put(tClass, "-1");
			if (hInvocationRelation != null) {
				thresholds.put("HInvocationRelationMetric: MEDIUM", (ThresholdCalculator
						.getThresholdValue(hInvocationRelation, HRelativeValueConstants.MEDIUM, true)));
			}
			controllerInformationString = this.theBlobStringProvider.getInformationString(hControllerClassSmell, true,
					Flaws.H_CONTROLLERCLASS_SMELL);
		}
		final DetectionObject hControllerClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				controllerInformationString, Flaws.H_CONTROLLERCLASS_SMELL);
		detectionObjects.get(Flaws.H_CONTROLLERCLASS_SMELL).add(hControllerClassDetectionObjectDummy);
		return hInvocationRelation;
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLargeClassLowCohesionSmell hLargeClassLowCohesionSmell) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		String lclcInformationString = "";
		if (hLargeClassLowCohesionSmell != null) {
			final TClass tClass = (TClass) hLargeClassLowCohesionSmell.getTAnnotated();
			detections.put(tClass, "-1");
			lclcInformationString = this.theBlobStringProvider.getInformationString(hLargeClassLowCohesionSmell, true,
					Flaws.H_LARGE_CLASS_LOW_COHESION_SMELL);

		}
		thresholds.put("none", -1);
		final DetectionObject hLargeClassLowCohesionDetectionObjectDummy = new DetectionObject(detections, thresholds,
				lclcInformationString, Flaws.H_LARGE_CLASS_LOW_COHESION_SMELL);
		detectionObjects.get(Flaws.H_LARGE_CLASS_LOW_COHESION_SMELL).add(hLargeClassLowCohesionDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HDataClassSmell[] hDataClassSmells) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// DataClassSmells
		thresholds.put("HNACCMetric: HIGH", -1);
		String dataClassFullInformationString = "";
		boolean printHeader = true;

		if (hDataClassSmells.length > 0) {
			final List<HNACCMetric> hnaccMetrics = new LinkedList<>();
			for (final HDataClassSmell smell : hDataClassSmells) {
				final HNACCMetric hnaccMetric = smell.getHNACCMetric();
				if (hnaccMetric != null) {
					hnaccMetrics.add(hnaccMetric);
				}
				final TClass tClass = (TClass) smell.getTAnnotated();
				detections.put(tClass, "-1");
				if (hnaccMetric != null) {
					dataClassFullInformationString = this.theBlobStringProvider.getInformationString(smell, printHeader,
							Flaws.H_DATA_CLASS_SMELL);
				}
				printHeader = false;
			}
			if (!hnaccMetrics.isEmpty()) {
				thresholds.put("HNACCMetric: HIGH",
						ThresholdCalculator.getThresholdValue(hnaccMetrics.get(0), HRelativeValueConstants.HIGH, true));
			}

			preprocessDetections(detectionObjects, hnaccMetrics.toArray(new HNACCMetric[0]));

			final Map<TAbstractType, String> detections2 = new ConcurrentHashMap<>();
			final Map<String, Number> thresholds2 = new ConcurrentHashMap<>();
			// HGetterSetterSmell
			final StringBuilder getterSetterFullInformationString = new StringBuilder();
			for (final HDataClassSmell smell : hDataClassSmells) {
				final List<HGetterSetterSmell> getterSetterSmells = smell.getGetterSetterSmells();
				int numberOfGetterSetters = 0;
				for (final HGetterSetterSmell getterSetter : getterSetterSmells) {
					numberOfGetterSetters++;
					getterSetterFullInformationString.append(this.theBlobStringProvider.getInformationString(getterSetter,
							printHeader, Flaws.H_GETTER_SETTER_SMELLS));
					printHeader = false;
				}
				final TClass tClass = (TClass) smell.getTAnnotated();
				detections2.put(tClass, (numberOfGetterSetters) + " getters/setters");
			}
			thresholds2.put("none", -1);
			final DetectionObject hGetterSetterDetectionObjectDummy = new DetectionObject(detections2, thresholds2,
					getterSetterFullInformationString.toString(), Flaws.H_GETTER_SETTER_SMELLS);
			detectionObjects.get(Flaws.H_GETTER_SETTER_SMELLS).add(hGetterSetterDetectionObjectDummy);
		}
		final DetectionObject dataClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				dataClassFullInformationString, Flaws.H_DATA_CLASS_SMELL);
		detectionObjects.get(Flaws.H_DATA_CLASS_SMELL).add(dataClassDetectionObjectDummy);

	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects, HNACCMetric[] hnaccMetrics) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HNACCMetric
		final StringBuilder fullInformationString = new StringBuilder();
		boolean printHeader = true;
		for (final HNACCMetric hnaccMetric : hnaccMetrics) {
			if (hnaccMetric != null) {
				final TClass tClass = (TClass) hnaccMetric.getTAnnotated();
				detections.put(tClass,
						hnaccMetric.getRelativeAmount().getValue() + ": " + (hnaccMetric.getValue()));
				fullInformationString.append(
						this.theBlobStringProvider.getInformationString(hnaccMetric, printHeader, Flaws.H_NACC_METRIC));
				printHeader = false;
			} else {
				LOGGER.warn("HNACC IS NULL");
			}
		}
		thresholds.put("none", -1);
		final DetectionObject hnaccDetectionObjectDummy = new DetectionObject(detections, thresholds,
				fullInformationString.toString(), Flaws.H_NACC_METRIC);
		detectionObjects.get(Flaws.H_NACC_METRIC).add(hnaccDetectionObjectDummy);
	}

	private void preprocessDetections(Map<Flaws, List<DetectionObject>> detectionObjects,
			HGodClassAntiPattern hGodClassAntiPattern) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// GodClass
		if (hGodClassAntiPattern != null) {
			final TClass tClass = (TClass) hGodClassAntiPattern.getTAnnotated();
			detections.put(tClass, "-1");
		}
		thresholds.put("none", -1);
		final DetectionObject godClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				this.theBlobStringProvider.getInformationString(hGodClassAntiPattern, true, Flaws.H_GODCLASS_ANTIPATTERN),
				Flaws.H_GODCLASS_ANTIPATTERN);
		detectionObjects.get(Flaws.H_GODCLASS_ANTIPATTERN).add(godClassDetectionObjectDummy);
	}

	private Map<Flaws, List<DetectionObject>> initializeMap() {
		final Map<Flaws, List<DetectionObject>> detectionObjects = new EnumMap<>(Flaws.class);
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
