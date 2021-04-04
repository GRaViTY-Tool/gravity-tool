package org.gravity.hulk.ui.visualization.detection;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HCodeSmell;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;
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

public class preprocessNACCMetric implements DetectionPreprocessor {

	private static final Logger LOGGER = Logger.getLogger(preprocessNACCMetric.class.getName());

	private final TheBlobInformationStringProvider theBlobStringProvider;

	public preprocessNACCMetric() {
		this.theBlobStringProvider = new TheBlobInformationStringProvider();
	}

	@Override
	public Map<Flaws, List<DetectionObject>> preprocessDetections(HAntiPatternGraph apg) {
		final Map<Flaws, List<DetectionObject>> detectionObjects = initializeMap();

		if (apg != null) {
			for (final HAnnotation a : apg.getHAnnotations()) {
				if (a instanceof HBlobAntiPattern) {
					preprocessBlobAntiPattern(detectionObjects, (HBlobAntiPattern) a);
				}
			}

		}
		return detectionObjects;
	}

	private void preprocessBlobAntiPattern(Map<Flaws, List<DetectionObject>> detectionObjects, HBlobAntiPattern hBlob) {

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

		preprocessGodClassAntiPattern(detectionObjects, hBlob.getHGodClassAntiPattern());

		preprocessDataClassSmells(detectionObjects, hBlob.getHDataClassSmells());
	}

	private void preprocessGodClassAntiPattern(Map<Flaws, List<DetectionObject>> detectionObjects,
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
				this.theBlobStringProvider.getInformationString(hGodClassAntiPattern, true,
						Flaws.H_GODCLASS_ANTIPATTERN),
				Flaws.H_GODCLASS_ANTIPATTERN);
		detectionObjects.get(Flaws.H_GODCLASS_ANTIPATTERN).add(godClassDetectionObjectDummy);
	
		preprocessControllerClassSmell(detectionObjects, hGodClassAntiPattern.getHControllerClassSmell());
	
		for (HCodeSmell smell : hGodClassAntiPattern.getHLargeClassLowCohesionSmells()) {
			if (smell instanceof HLowCohesionSmell) {
				preprocessLowCohesionSmell(detectionObjects, (HLowCohesionSmell) smell);
			} else if (smell instanceof HLargeClassSmell) {
				preprocessLargeClassSmell(detectionObjects, (HLargeClassSmell) smell);
			}
		}
	}

	private void preprocessNumberOfMembersMetric(Map<Flaws, List<DetectionObject>> detectionObjects,
			HNumberOfMembersMetric metric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HNumberOfMembersMetric
		String numMembersFullInformationString = "";
		thresholds.put("none", -1);
		if (metric != null) {
			final TClass tClass = (TClass) metric.getTAnnotated();
			detections.put(tClass, metric.getRelativeAmount().getValue().toString() + ": " + (metric.getValue()));
			thresholds.put("none", -1);
			numMembersFullInformationString = this.theBlobStringProvider.getInformationString(metric, true,
					Flaws.H_NUMBER_OF_MEMBERS_METRIC);
		}
		final DetectionObject hNumberOfMembersDetectionObjectDummy = new DetectionObject(detections, thresholds,
				numMembersFullInformationString, Flaws.H_NUMBER_OF_MEMBERS_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_MEMBERS_METRIC).add(hNumberOfMembersDetectionObjectDummy);
	}

	private void preprocessIncomingInvocations(Map<Flaws, List<DetectionObject>> detectionObjects,
			HIncommingInvocationMetric hNumberOfIncommingInvocationsMetric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HNumberOfIncommingInvocation
		String inInvocFullInformationString = "";
		thresholds.put("none", -1);
		if (hNumberOfIncommingInvocationsMetric != null) {
			final TClass tClass = (TClass) hNumberOfIncommingInvocationsMetric.getTAnnotated();
			detections.put(tClass, hNumberOfIncommingInvocationsMetric.getRelativeAmount().getValue() + ": "
					+ (hNumberOfIncommingInvocationsMetric.getValue()));
			inInvocFullInformationString = this.theBlobStringProvider.getInformationString(
					hNumberOfIncommingInvocationsMetric, true, Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC);
		}
		final DetectionObject hNumberOfIcommingInvocationsDetectionObjectDummy = new DetectionObject(detections,
				thresholds, inInvocFullInformationString, Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC)
				.add(hNumberOfIcommingInvocationsDetectionObjectDummy);
	}

	private void preprocessOutgoingInvocations(Map<Flaws, List<DetectionObject>> detectionObjects,
			HOutgoingInvocationMetric metric) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HNumberOfOutgoingInvocationsMetric
		String informationString = "";
		thresholds.put("none", -1);
		if (metric != null) {
			final TClass tClass = (TClass) metric.getTAnnotated();
			detections.put(tClass, metric.getRelativeAmount().getValue().toString() + ": " + (metric.getValue()));
			informationString = this.theBlobStringProvider.getInformationString(metric, true,
					Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC);
		}
		final DetectionObject detectionObject = new DetectionObject(detections, thresholds, informationString,
				Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC);
		detectionObjects.get(Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC).add(detectionObject);
	}

	private void preprocessLCOM5Metric(Map<Flaws, List<DetectionObject>> detectionObjects, HLCOM5Metric metric) {
		if (metric == null) {
			return;
		}
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HLCOM5Metric
		String informationString = "";
		thresholds.put("none", -1);
		final TClass tClass = (TClass) metric.getTAnnotated();
		detections.put(tClass, metric.getRelativeAmount().getValue().toString() + ": " + (metric.getValue()));
		informationString = this.theBlobStringProvider.getInformationString(metric, true, Flaws.H_LCOM5_METRIC);

		final DetectionObject detectionObject = new DetectionObject(detections, thresholds, informationString,
				Flaws.H_LCOM5_METRIC);
		detectionObjects.get(Flaws.H_LCOM5_METRIC).add(detectionObject);
	}

	private void preprocessInvocationRelationMetric(Map<Flaws, List<DetectionObject>> detectionObjects,
			HInvocationRelation metric) {
		if (metric == null) {
			return;
		}
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HInvocationRelation
		String invocRelFullInformationString = "";
		thresholds.put("none", -1);
		final TClass tClass = (TClass) metric.getTAnnotated();
		detections.put(tClass, metric.getRelativeAmount().getValue().toString() + ": " + (metric.getValue()));
		invocRelFullInformationString = this.theBlobStringProvider.getInformationString(metric, true,
				Flaws.H_INVOCATIONRELATION_METRIC);

		final DetectionObject hInvocationRelationDetectionObjectDummy = new DetectionObject(detections, thresholds,
				invocRelFullInformationString, Flaws.H_INVOCATIONRELATION_METRIC);
		detectionObjects.get(Flaws.H_INVOCATIONRELATION_METRIC).add(hInvocationRelationDetectionObjectDummy);

		preprocessIncomingInvocations(detectionObjects, metric.getHIncommingInvocationCustomMetric());

		preprocessOutgoingInvocations(detectionObjects, metric.getHOutgoingInvocationCustomMetric());
	}

	private void preprocessLargeClassSmell(Map<Flaws, List<DetectionObject>> detectionObjects, HLargeClassSmell smell) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		String largeClassfullInformationString = "";
		thresholds.put("HNumberOfMembersMetric: at least HIGH", -1);
		HNumberOfMembersMetric hNumberOfMembersMetric = null;
		if (smell != null) {
			hNumberOfMembersMetric = smell.getHNumberOfMembers();
			final TClass tClass = (TClass) smell.getTAnnotated();
			detections.put(tClass, "-1");
			if (hNumberOfMembersMetric != null) {
				thresholds.put("HNumberOfMembersMetric: at least HIGH", (ThresholdCalculator
						.getThresholdValue(hNumberOfMembersMetric, HRelativeValueConstants.HIGH, true)));
			}
			largeClassfullInformationString = this.theBlobStringProvider.getInformationString(smell, true,
					Flaws.H_LARGE_CLASS_SMELL);
		}
		final DetectionObject hLargeClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				largeClassfullInformationString, Flaws.H_LARGE_CLASS_SMELL);
		detectionObjects.get(Flaws.H_LARGE_CLASS_SMELL).add(hLargeClassDetectionObjectDummy);

		preprocessNumberOfMembersMetric(detectionObjects, smell.getHNumberOfMembers());
	}

	private void preprocessLowCohesionSmell(Map<Flaws, List<DetectionObject>> detectionObjects,
			HLowCohesionSmell smell) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		String lowCohesionFullInformationString = "";
		thresholds.put("HLCOM5Metric : at least HIGH", -1);
		if (smell != null) {
			final HLCOM5Metric metric = smell.getHLCOM5CustomMetric();
			final TClass tClass = (TClass) smell.getTAnnotated();
			detections.put(tClass, "-1");
			thresholds.put("HLCOM5Metric : at least HIGH",
					(ThresholdCalculator.getThresholdValue(metric, HRelativeValueConstants.HIGH, true)));
			lowCohesionFullInformationString = this.theBlobStringProvider.getInformationString(smell, true,
					Flaws.H_LOW_COHESION_SMELL);
		}
		final DetectionObject hLowCohesionDetectionObjectDummy = new DetectionObject(detections, thresholds,
				lowCohesionFullInformationString, Flaws.H_LOW_COHESION_SMELL);
		detectionObjects.get(Flaws.H_LOW_COHESION_SMELL).add(hLowCohesionDetectionObjectDummy);

		preprocessLCOM5Metric(detectionObjects, smell.getHLCOM5CustomMetric());
	}

	private void preprocessControllerClassSmell(Map<Flaws, List<DetectionObject>> detectionObjects,
			HControllerClassSmell smell) {
		if (smell == null) {
			return;
		}
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HControllerClassSmell
		thresholds.put("HInvocationRelationMetric: MEDIUM", -1);
		String informationString = "";
		HInvocationRelation hInvocationRelation = smell.getHInvocationRelation();
		final TClass tClass = (TClass) smell.getTAnnotated();
		detections.put(tClass, "-1");
		if (hInvocationRelation != null) {
			thresholds.put("HInvocationRelationMetric: MEDIUM",
					(ThresholdCalculator.getThresholdValue(hInvocationRelation, HRelativeValueConstants.MEDIUM, true)));
		}
		informationString = this.theBlobStringProvider.getInformationString(smell, true, Flaws.H_CONTROLLERCLASS_SMELL);

		final DetectionObject detectionObject = new DetectionObject(detections, thresholds, informationString,
				Flaws.H_CONTROLLERCLASS_SMELL);
		detectionObjects.get(Flaws.H_CONTROLLERCLASS_SMELL).add(detectionObject);

		preprocessInvocationRelationMetric(detectionObjects, hInvocationRelation);
	}

	private void preprocessDataClassSmells(Map<Flaws, List<DetectionObject>> detectionObjects,
			List<HDataClassSmell> smells) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// DataClassSmells
		thresholds.put("HNACCMetric: HIGH", -1);
		String dataClassFullInformationString = "";
		boolean printHeader = true;

		final List<HNACCMetric> hnaccMetrics = new LinkedList<>();
		for (final HDataClassSmell smell : smells) {
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

		preprocessNACCMetrics(detectionObjects, hnaccMetrics);

		final Map<TAbstractType, String> detections2 = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds2 = new ConcurrentHashMap<>();
		// HGetterSetterSmell
		final StringBuilder getterSetterFullInformationString = new StringBuilder();
		for (final HDataClassSmell smell : smells) {
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

		final DetectionObject dataClassDetectionObjectDummy = new DetectionObject(detections, thresholds,
				dataClassFullInformationString, Flaws.H_DATA_CLASS_SMELL);
		detectionObjects.get(Flaws.H_DATA_CLASS_SMELL).add(dataClassDetectionObjectDummy);

	}

	private void preprocessNACCMetrics(Map<Flaws, List<DetectionObject>> detectionObjects,
			List<HNACCMetric> hnaccMetrics) {
		final Map<TAbstractType, String> detections = new ConcurrentHashMap<>();
		final Map<String, Number> thresholds = new ConcurrentHashMap<>();
		// HNACCMetric
		final StringBuilder fullInformationString = new StringBuilder();
		boolean printHeader = true;
		for (final HNACCMetric hnaccMetric : hnaccMetrics) {
			if (hnaccMetric != null) {
				final TClass tClass = (TClass) hnaccMetric.getTAnnotated();
				detections.put(tClass, hnaccMetric.getRelativeAmount().getValue() + ": " + (hnaccMetric.getValue()));
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

	private Map<Flaws, List<DetectionObject>> initializeMap() {
		final Map<Flaws, List<DetectionObject>> detectionObjects = new EnumMap<>(Flaws.class);
		detectionObjects.put(Flaws.H_BLOB_ANTIPATTERN, new LinkedList<>());
		detectionObjects.put(Flaws.H_GODCLASS_ANTIPATTERN, new LinkedList<>());
		detectionObjects.put(Flaws.H_DATA_CLASS_ACCESSOR, new LinkedList<>());
		detectionObjects.put(Flaws.H_DATA_CLASS_SMELL, new LinkedList<>());
		detectionObjects.put(Flaws.H_GETTER_SETTER_SMELLS, new LinkedList<>());
		detectionObjects.put(Flaws.H_NACC_METRIC, new LinkedList<>());
		detectionObjects.put(Flaws.H_CONTROLLERCLASS_SMELL, new LinkedList<>());
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
