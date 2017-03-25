package org.gravity.hulk.ui.visualization.information.providers;

import org.gravity.hulk.antipatterngraph.HAnnotation;
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
import org.gravity.hulk.ui.visualization.util.ThresholdCalculator;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;

public class TheBlobInformationStringProvider implements InformationStringProvider {

	public static final int THE_BLOB = 0;
	public static final int GOD_CLASS = 1;
	public static final int CONTROLLER_CLASS = 2;
	public static final int DATA_CLASS = 3;
	public static final int GETTER_SETTER_SMELL = 4;
	public static final int INVOCATION_RELATION = 5;
	public static final int LARGE_CLASS_LOW_COHESION_SMELL = 6;
	public static final int LARGE_CLASS_SMELL = 7;
	public static final int LCOM5 = 8;
	public static final int LOW_COHESION_SMELL = 9;
	public static final int NACC_METRIC = 10;
	public static final int NUMBER_OF_INCOMMING_INVOCATIONS_METRIC = 11;
	public static final int NUMBER_OF_MEMBERS_METRIC = 12;
	public static final int NUMBER_OF_OUTGOING_INVOCATIONS_METRIC = 13;
	
	private String eol = System.getProperty("line.separator");

	@Override
	public String getInformationString(HAnnotation annotation, boolean printHeader, int annotationID) {
		
		switch (annotationID) {
		case THE_BLOB:
			return buildTheBlobString(annotation, printHeader);
		case GOD_CLASS:
			return buildGodClassString(annotation, printHeader);
		case CONTROLLER_CLASS:
			return buildControllerClassString(annotation, printHeader);
		case DATA_CLASS:
			return buildDataClassString(annotation, printHeader);
		case GETTER_SETTER_SMELL:
			return buildGetterSetterString(annotation, printHeader);
		case INVOCATION_RELATION:
			return buildInvocationRelationString(annotation, printHeader);
		case LARGE_CLASS_LOW_COHESION_SMELL:
			return buildLargeClassLowCohesionString(annotation, printHeader);
		case LARGE_CLASS_SMELL:
			return buildLargeClassString(annotation, printHeader);
		case LCOM5:
			return buildLCOM5String(annotation, printHeader);
		case LOW_COHESION_SMELL:
			return buildLowCohesionString(annotation, printHeader);
		case NACC_METRIC:
			return buildNACCString(annotation, printHeader);
		case NUMBER_OF_INCOMMING_INVOCATIONS_METRIC:
			return buildNumberOfIncommingInvocationsString(annotation, printHeader);
		case NUMBER_OF_MEMBERS_METRIC:
			return buildNumberOfMembersString(annotation, printHeader);
		case NUMBER_OF_OUTGOING_INVOCATIONS_METRIC:
			return buildNumberOfOutgoingInvocationsString(annotation, printHeader);
		default:
			return "annotationID not supported";
		}
	}

	private String buildTheBlobString(HAnnotation annotation, boolean printHeader) {
		String theBlobInfo = "";
		HBlobAntiPattern blob = (HBlobAntiPattern) annotation;
		TClass tClass;
		HDataClassAccessor hDataClassAccessor = null;
		double hDataClassAccessorValue = -1;
		double hDataClassAccessorThresholdValue = -1;
		String hDataClassAccessorRelativeAmount = "-1";

		tClass = (TClass) blob.getTAnnotated();

		for (TAnnotation tAnnotation : tClass.getTAnnotation()) {
			if (tAnnotation instanceof HDataClassAccessor) {
				hDataClassAccessor = (HDataClassAccessor) tAnnotation;
				hDataClassAccessorValue = hDataClassAccessor.getValue();
				hDataClassAccessorRelativeAmount = hDataClassAccessor.getRelativeAmount().getValue().toString();
			}
		}

		if (printHeader && hDataClassAccessor != null) {
			hDataClassAccessorThresholdValue = ThresholdCalculator.getThresholdValue(hDataClassAccessor,
					HRelativeValueConstants.MEDIUM, true);
			theBlobInfo = theBlobInfo + "HBlobAntiPattern" + eol;
			theBlobInfo = theBlobInfo + "Thresholds: " + eol;
			theBlobInfo = theBlobInfo + " HDataClassAccessor: at least HRelativeValueConstnats.MEDIUM" + eol;
			theBlobInfo = theBlobInfo + "  Threshold for HDataClassAccessor(MEDIUM) > "
					+ hDataClassAccessorThresholdValue + eol + eol;
		}

		theBlobInfo = theBlobInfo + "Detected in: " + tClass.getTName() + eol;
		theBlobInfo = theBlobInfo + "Number of data class accesses: " + hDataClassAccessorValue + eol;
		theBlobInfo = theBlobInfo + "Value of HDataClassAccessor: " + hDataClassAccessorValue + eol;
		theBlobInfo = theBlobInfo + "Relative amount of HDataClassAccessor: " + hDataClassAccessorRelativeAmount
				+ eol + eol;

		return theBlobInfo;
	}

	private String buildGodClassString(HAnnotation annotation, boolean printHeader) {
		String godClassInfo = "";
		HGodClassAntiPattern godClass = (HGodClassAntiPattern) annotation;
		TClass tClass;

		tClass = (TClass) godClass.getTAnnotated();

		if (printHeader) {
			godClassInfo = godClassInfo + "HGodClassAntiPattern" + eol;
			godClassInfo = godClassInfo + "Thresholds: " + eol;
			godClassInfo = godClassInfo + " none" + eol + eol;
		}

		godClassInfo = godClassInfo + "Detected in: " + tClass.getTName() + eol + eol;

		return godClassInfo;
	}

	private String buildControllerClassString(HAnnotation annotation, boolean printHeader) {
		HControllerClassSmell controllerClass = (HControllerClassSmell) annotation;

		String controllerClassInfo = "";

		HInvocationRelation hInvocationRelation = controllerClass.getHInvocationRelation();
		double hInvocationRelationThresholdValue = -1;

		TClass tClass = (TClass) controllerClass.getTAnnotated();

		if (printHeader) {
			hInvocationRelationThresholdValue = ThresholdCalculator.getThresholdValue(hInvocationRelation,
					HRelativeValueConstants.MEDIUM, true);
			controllerClassInfo = controllerClassInfo + "ControllerClass" + eol;
			controllerClassInfo = controllerClassInfo + "Thresholds: " + eol;
			controllerClassInfo = controllerClassInfo
					+ " HInvocationRelationMetric: at least HRelativeValueConstants.MEDIUM" + eol;
			controllerClassInfo = controllerClassInfo
					+ "  Threshold for HInvocationRelation(MEDIUM): (outgoing invocations / incomming invocations) > "
					+ hInvocationRelationThresholdValue + eol + eol;
		}

		controllerClassInfo = controllerClassInfo + "Detected in: " + tClass.getTName() + eol + eol;

		return controllerClassInfo;
	}

	private String buildDataClassString(HAnnotation annotation, boolean printHeader) {
		String dataClassInfo = "";
		HDataClassSmell dataClassSmell = (HDataClassSmell) annotation;

		TClass tClass;
		HNACCMetric hnacc = dataClassSmell.getHNACCMetric();
		double hnaccThresholdValue = -1;

		tClass = (TClass) dataClassSmell.getTAnnotated();

		if (printHeader) {
			hnaccThresholdValue = ThresholdCalculator.getThresholdValue(hnacc, HRelativeValueConstants.HIGH, true);
			dataClassInfo = dataClassInfo + "HDataClassSmell" + eol;
			dataClassInfo = dataClassInfo + "Thresholds: " + eol;
			dataClassInfo = dataClassInfo + " HNACCMetric: at least HRelativeValueConstants.HIGH" + eol;
			dataClassInfo = dataClassInfo + "  Threshold for HNACCMetric(HIGH): (getters+setters)/methods > "
					+ hnaccThresholdValue + eol + eol;
		}

		dataClassInfo = dataClassInfo + "Detetcted in: " + tClass.getTName() + eol + eol;

		return dataClassInfo;
	}

	private String buildGetterSetterString(HAnnotation annotation, boolean printHeader) {
		HGetterSetterSmell getterSetterSmell = (HGetterSetterSmell) annotation;

		String getterSetterInfo = "";

		TMethodDefinition tMethodDefinition = (TMethodDefinition) getterSetterSmell.getTAnnotated();

		if (printHeader) {
			getterSetterInfo = getterSetterInfo + "HGetterSetterSmell" + eol;
			getterSetterInfo = getterSetterInfo + "Thresholds: " + eol;
			getterSetterInfo = getterSetterInfo + " none" + eol + eol;
		}

		getterSetterInfo = getterSetterInfo + "Detected in: " + tMethodDefinition.getSignature().getMethod().getTName()
				+ eol;
		getterSetterInfo = getterSetterInfo + " in Class: " + tMethodDefinition.getDefinedBy().getTName() + eol + eol;

		return getterSetterInfo;
	}

	private String buildInvocationRelationString(HAnnotation annotation, boolean printHeader) {
		HInvocationRelation invocationRelation = (HInvocationRelation) annotation;

		String invocationRelationInfo = "";

		TClass tClass = (TClass) invocationRelation.getTAnnotated();

		if (printHeader) {
			invocationRelationInfo = invocationRelationInfo + "HInvocationRelation" + eol + eol;
		}

		invocationRelationInfo = invocationRelationInfo + "Detected in: " + tClass.getTName() + eol;
		invocationRelationInfo = invocationRelationInfo + "Value: " + invocationRelation.getValue() + eol;
		invocationRelationInfo = invocationRelationInfo + "Relative amount: "
				+ invocationRelation.getRelativeAmount().getValue().toString() + eol + eol;

		return invocationRelationInfo;
	}

	private String buildLargeClassLowCohesionString(HAnnotation annotation, boolean printHeader) {
		HLargeClassLowCohesionSmell largeClassLowCohesionSmell = (HLargeClassLowCohesionSmell) annotation;

		String largeClassLowCohesionInfo = "";

		TClass tClass = (TClass) largeClassLowCohesionSmell.getTAnnotated();

		if (printHeader) {
			largeClassLowCohesionInfo = largeClassLowCohesionInfo + "HLargeClassLowCohesionSmell" + eol;
			largeClassLowCohesionInfo = largeClassLowCohesionInfo + "Thresholds: " + eol;
			largeClassLowCohesionInfo = largeClassLowCohesionInfo + " none" + eol + eol;
		}

		largeClassLowCohesionInfo = largeClassLowCohesionInfo + "Detected in: " + tClass.getTName() + eol + eol;

		return largeClassLowCohesionInfo;
	}

	private String buildLargeClassString(HAnnotation annotation, boolean printHeader) {
		HLargeClassSmell largeClass = (HLargeClassSmell) annotation;

		String largeClassInfo = "";
		TClass tClass = (TClass) largeClass.getTAnnotated();
		HNumberOfMembersMetric numberOfMemberic = largeClass.getHNumberOfMembers();
		double numberOfMembersThresholdValue = -1;

		if (printHeader) {
			numberOfMembersThresholdValue = ThresholdCalculator.getThresholdValue(numberOfMemberic,
					HRelativeValueConstants.HIGH, true);
			largeClassInfo = largeClassInfo + "HLargeClassSmell" + eol;
			largeClassInfo = largeClassInfo + "Thresholds: " + eol;
			largeClassInfo = largeClassInfo + " HNumberOfMembersMetric: at least HRelativeValueConstants.HIGH" + eol;
			largeClassInfo = largeClassInfo + "  Threshold for HNumberOfMembersMetric(HIGH): number of members > "
					+ numberOfMembersThresholdValue + eol + eol;
		}

		largeClassInfo = largeClassInfo + "Detected in: " + tClass.getTName() + eol + eol;

		return largeClassInfo;
	}

	private String buildLCOM5String(HAnnotation annotation, boolean printHeader) {
		HLCOM5Metric hlcom5 = (HLCOM5Metric) annotation;

		String hlcom5Info = "";
		TClass tClass = (TClass) hlcom5.getTAnnotated();

		if (printHeader) {
			hlcom5Info = hlcom5Info + "HLCOM5Metric" + eol + eol;
		}

		hlcom5Info = hlcom5Info + "Detected in: " + tClass.getTName() + eol;
		hlcom5Info = hlcom5Info + "Value: " + hlcom5.getValue() + eol;
		hlcom5Info = hlcom5Info + "Relative amount: " + hlcom5.getRelativeAmount().getValue().toString() + eol + eol;

		return hlcom5Info;
	}

	private String buildLowCohesionString(HAnnotation annotation, boolean printHeader) {
		HLowCohesionSmell lowCohesionSmell = (HLowCohesionSmell) annotation;

		String lowCohesionInfo = "";
		TClass tClass;
		HLCOM5Metric hlcom5;
		double hlcom5ThresholdValue = -1;

		tClass = (TClass) lowCohesionSmell.getTAnnotated();
		hlcom5 = lowCohesionSmell.getHLCOM5CustomMetric();

		if (printHeader) {
			hlcom5ThresholdValue = ThresholdCalculator.getThresholdValue(hlcom5, HRelativeValueConstants.HIGH, true);
			lowCohesionInfo = lowCohesionInfo + "HLowCohesionSmell" + eol;
			lowCohesionInfo = lowCohesionInfo + "Thresholds: " + eol;
			lowCohesionInfo = lowCohesionInfo + " HLCOM5Metric: at least HRelativeValueConstants.HIGH" + eol;
			lowCohesionInfo = lowCohesionInfo + "  Threshold for HLCOM5Metric(HIGH) > " + hlcom5ThresholdValue + eol + eol;
		}

		lowCohesionInfo = lowCohesionInfo + "Detected in: " + tClass.getTName() + eol + eol;

		return lowCohesionInfo;
	}

	private String buildNACCString(HAnnotation annotation, boolean printHeader) {
		HNACCMetric hNACCMetric = (HNACCMetric) annotation;

		String hNACCMetricInfo = "";

		TClass tClass = (TClass) hNACCMetric.getTAnnotated();

		if (printHeader) {
			hNACCMetricInfo = hNACCMetricInfo + "HNACCMetric" + eol + eol;
		}

		hNACCMetricInfo = hNACCMetricInfo + "Detected in: " + tClass.getTName() + eol;
		hNACCMetricInfo = hNACCMetricInfo + "Value: " + hNACCMetric.getValue() + eol;
		hNACCMetricInfo = hNACCMetricInfo + "Relative amount: " + hNACCMetric.getRelativeAmount().getValue().toString()
				+ eol + eol;

		return hNACCMetricInfo;
	}

	private String buildNumberOfIncommingInvocationsString(HAnnotation annotation, boolean printHeader) {
		HIncommingInvocationMetric numberOfIncommingInvocations = (HIncommingInvocationMetric) annotation;

		String numberOfIncommingInvocationsInfo = "";

		TClass tClass = (TClass) numberOfIncommingInvocations.getTAnnotated();

		if (printHeader) {
			numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo + "HNumberOfIncommingInvocations"
					+ eol + eol;
		}

		numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo + "Detected in: " + tClass.getTName()
				+ eol;
		numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo + "Value: "
				+ numberOfIncommingInvocations.getValue() + eol;
		numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo + "Relative amount: "
				+ numberOfIncommingInvocations.getRelativeAmount().getValue().toString() + eol + eol;

		return numberOfIncommingInvocationsInfo;
	}

	private String buildNumberOfMembersString(HAnnotation annotation, boolean printHeader) {
		HNumberOfMembersMetric numberOfMembers = (HNumberOfMembersMetric) annotation;

		String numberOfMembersInfo = "";
		TClass tClass = (TClass) numberOfMembers.getTAnnotated();

		if (printHeader) {
			numberOfMembersInfo = numberOfMembersInfo + "HNumberOfMembersMetric" + eol + eol;
		}

		numberOfMembersInfo = numberOfMembersInfo + "Detected in: " + tClass.getTName() + eol;
		numberOfMembersInfo = numberOfMembersInfo + "Value: " + numberOfMembers.getValue() + eol;
		numberOfMembersInfo = numberOfMembersInfo + "Relative amount: "
				+ numberOfMembers.getRelativeAmount().getValue().toString() + eol + eol;

		return numberOfMembersInfo;
	}

	private String buildNumberOfOutgoingInvocationsString(HAnnotation annotation, boolean printHeader) {
		HOutgoingInvocationMetric numberOfOutgoingInvocations = (HOutgoingInvocationMetric) annotation;

		String numberOfOutgoingInvocationsInfo = "";

		TClass tClass = (TClass) numberOfOutgoingInvocations.getTAnnotated();

		if (printHeader) {
			numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo + "HNumberOfOutgoingInvocations" + eol + eol;
		}

		numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo + "Detected in: " + tClass.getTName() + eol;
		numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo + "Value: "
				+ numberOfOutgoingInvocations.getValue() + eol;
		numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo + "Relative amount: "
				+ numberOfOutgoingInvocations.getRelativeAmount().getValue().toString() + eol + eol;

		return numberOfOutgoingInvocationsInfo;
	}

}
