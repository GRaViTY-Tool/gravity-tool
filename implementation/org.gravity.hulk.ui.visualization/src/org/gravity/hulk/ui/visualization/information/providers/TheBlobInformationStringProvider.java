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
import org.gravity.hulk.ui.visualization.util.Flaws;
import org.gravity.hulk.ui.visualization.util.ThresholdCalculator;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;

public class TheBlobInformationStringProvider implements InformationStringProvider {

	private static final String EOL = System.getProperty("line.separator");

	@Override
	public String getInformationString(HAnnotation annotation, boolean printHeader, Flaws annotationID) {
		
		switch (annotationID) {
		case H_BLOB_ANTIPATTERN:
			return buildTheBlobString(annotation, printHeader);
		case H_GODCLASS_ANTIPATTERN:
			return buildGodClassString(annotation, printHeader);
		case H_CONTROLLERCLASS_SMELL:
			return buildControllerClassString(annotation, printHeader);
		case H_DATA_CLASS_SMELL:
			return buildDataClassString(annotation, printHeader);
		case H_GETTER_SETTER_SMELLS:
			return buildGetterSetterString(annotation, printHeader);
		case H_INVOCATIONRELATION_METRIC:
			return buildInvocationRelationString(annotation, printHeader);
		case H_LARGE_CLASS_LOW_COHESION_SMELL:
			return buildLargeClassLowCohesionString(annotation, printHeader);
		case H_LARGE_CLASS_SMELL:
			return buildLargeClassString(annotation, printHeader);
		case H_LCOM5_METRIC:
			return buildLCOM5String(annotation, printHeader);
		case H_LOW_COHESION_SMELL:
			return buildLowCohesionString(annotation, printHeader);
		case H_NACC_METRIC:
			return buildNACCString(annotation, printHeader);
		case H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC:
			return buildNumberOfIncommingInvocationsString(annotation, printHeader);
		case H_NUMBER_OF_MEMBERS_METRIC:
			return buildNumberOfMembersString(annotation, printHeader);
		case H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC:
			return buildNumberOfOutgoingInvocationsString(annotation, printHeader);
		default:
			return "annotationID not supported";
		}
	}

	private String buildTheBlobString(HAnnotation annotation, boolean printHeader) {
		HBlobAntiPattern blob = (HBlobAntiPattern) annotation;
		
		TClass tClass = (TClass) blob.getTAnnotated();

		HDataClassAccessor hDataClassAccessor = null;
		double hDataClassAccessorThresholdValue = -1;
		double hDataClassAccessorValue = -1;
		String hDataClassAccessorRelativeAmount = "-1";
		for (TAnnotation tAnnotation : tClass.getTAnnotation()) {
			if (tAnnotation instanceof HDataClassAccessor) {
				hDataClassAccessor = (HDataClassAccessor) tAnnotation;
				hDataClassAccessorValue = hDataClassAccessor.getValue();
				hDataClassAccessorRelativeAmount = hDataClassAccessor.getRelativeAmount().getValue().toString();
			}
		}

		String theBlobInfo = "";
		if (printHeader && hDataClassAccessor != null) {
			hDataClassAccessorThresholdValue = ThresholdCalculator.getThresholdValue(hDataClassAccessor,
					HRelativeValueConstants.MEDIUM, true);
			theBlobInfo = theBlobInfo + "HBlobAntiPattern" + EOL;
			theBlobInfo = theBlobInfo + "Thresholds: " + EOL;
			theBlobInfo = theBlobInfo + " HDataClassAccessor: at least HRelativeValueConstnats.MEDIUM" + EOL;
			theBlobInfo = theBlobInfo + "  Threshold for HDataClassAccessor(MEDIUM) > "
					+ hDataClassAccessorThresholdValue + EOL + EOL;
		}

		theBlobInfo = theBlobInfo + "Detected in: " + tClass.getTName() + EOL;
		theBlobInfo = theBlobInfo + "Number of data class accesses: " + hDataClassAccessorValue + EOL;
		theBlobInfo = theBlobInfo + "Value of HDataClassAccessor: " + hDataClassAccessorValue + EOL;
		theBlobInfo = theBlobInfo + "Relative amount of HDataClassAccessor: " + hDataClassAccessorRelativeAmount
				+ EOL + EOL;

		return theBlobInfo;
	}

	private String buildGodClassString(HAnnotation annotation, boolean printHeader) {
		String godClassInfo = "";
		HGodClassAntiPattern godClass = (HGodClassAntiPattern) annotation;
		TClass tClass;

		tClass = (TClass) godClass.getTAnnotated();

		if (printHeader) {
			godClassInfo = godClassInfo + "HGodClassAntiPattern" + EOL;
			godClassInfo = godClassInfo + "Thresholds: " + EOL;
			godClassInfo = godClassInfo + " none" + EOL + EOL;
		}

		godClassInfo = godClassInfo + "Detected in: " + tClass.getTName() + EOL + EOL;

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
			controllerClassInfo = controllerClassInfo + "ControllerClass" + EOL;
			controllerClassInfo = controllerClassInfo + "Thresholds: " + EOL;
			controllerClassInfo = controllerClassInfo
					+ " HInvocationRelationMetric: at least HRelativeValueConstants.MEDIUM" + EOL;
			controllerClassInfo = controllerClassInfo
					+ "  Threshold for HInvocationRelation(MEDIUM): (outgoing invocations / incomming invocations) > "
					+ hInvocationRelationThresholdValue + EOL + EOL;
		}

		controllerClassInfo = controllerClassInfo + "Detected in: " + tClass.getTName() + EOL + EOL;

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
			dataClassInfo = dataClassInfo + "HDataClassSmell" + EOL;
			dataClassInfo = dataClassInfo + "Thresholds: " + EOL;
			dataClassInfo = dataClassInfo + " HNACCMetric: at least HRelativeValueConstants.HIGH" + EOL;
			dataClassInfo = dataClassInfo + "  Threshold for HNACCMetric(HIGH): (getters+setters)/methods > "
					+ hnaccThresholdValue + EOL + EOL;
		}

		dataClassInfo = dataClassInfo + "Detetcted in: " + tClass.getTName() + EOL + EOL;

		return dataClassInfo;
	}

	private String buildGetterSetterString(HAnnotation annotation, boolean printHeader) {
		HGetterSetterSmell getterSetterSmell = (HGetterSetterSmell) annotation;

		String getterSetterInfo = "";

		TMethodDefinition tMethodDefinition = (TMethodDefinition) getterSetterSmell.getTAnnotated();

		if (printHeader) {
			getterSetterInfo = getterSetterInfo + "HGetterSetterSmell" + EOL;
			getterSetterInfo = getterSetterInfo + "Thresholds: " + EOL;
			getterSetterInfo = getterSetterInfo + " none" + EOL + EOL;
		}

		getterSetterInfo = getterSetterInfo + "Detected in: " + tMethodDefinition.getSignature().getMethod().getTName()
				+ EOL;
		getterSetterInfo = getterSetterInfo + " in Class: " + tMethodDefinition.getDefinedBy().getTName() + EOL + EOL;

		return getterSetterInfo;
	}

	private String buildInvocationRelationString(HAnnotation annotation, boolean printHeader) {
		HInvocationRelation invocationRelation = (HInvocationRelation) annotation;

		String invocationRelationInfo = "";

		TClass tClass = (TClass) invocationRelation.getTAnnotated();

		if (printHeader) {
			invocationRelationInfo = invocationRelationInfo + "HInvocationRelation" + EOL + EOL;
		}

		invocationRelationInfo = invocationRelationInfo + "Detected in: " + tClass.getTName() + EOL;
		invocationRelationInfo = invocationRelationInfo + "Value: " + invocationRelation.getValue() + EOL;
		invocationRelationInfo = invocationRelationInfo + "Relative amount: "
				+ invocationRelation.getRelativeAmount().getValue().toString() + EOL + EOL;

		return invocationRelationInfo;
	}

	private String buildLargeClassLowCohesionString(HAnnotation annotation, boolean printHeader) {
		HLargeClassLowCohesionSmell largeClassLowCohesionSmell = (HLargeClassLowCohesionSmell) annotation;

		String largeClassLowCohesionInfo = "";

		TClass tClass = (TClass) largeClassLowCohesionSmell.getTAnnotated();

		if (printHeader) {
			largeClassLowCohesionInfo = largeClassLowCohesionInfo + "HLargeClassLowCohesionSmell" + EOL;
			largeClassLowCohesionInfo = largeClassLowCohesionInfo + "Thresholds: " + EOL;
			largeClassLowCohesionInfo = largeClassLowCohesionInfo + " none" + EOL + EOL;
		}

		largeClassLowCohesionInfo = largeClassLowCohesionInfo + "Detected in: " + tClass.getTName() + EOL + EOL;

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
			largeClassInfo = largeClassInfo + "HLargeClassSmell" + EOL;
			largeClassInfo = largeClassInfo + "Thresholds: " + EOL;
			largeClassInfo = largeClassInfo + " HNumberOfMembersMetric: at least HRelativeValueConstants.HIGH" + EOL;
			largeClassInfo = largeClassInfo + "  Threshold for HNumberOfMembersMetric(HIGH): number of members > "
					+ numberOfMembersThresholdValue + EOL + EOL;
		}

		largeClassInfo = largeClassInfo + "Detected in: " + tClass.getTName() + EOL + EOL;

		return largeClassInfo;
	}

	private String buildLCOM5String(HAnnotation annotation, boolean printHeader) {
		HLCOM5Metric hlcom5 = (HLCOM5Metric) annotation;

		String hlcom5Info = "";
		TClass tClass = (TClass) hlcom5.getTAnnotated();

		if (printHeader) {
			hlcom5Info = hlcom5Info + "HLCOM5Metric" + EOL + EOL;
		}

		hlcom5Info = hlcom5Info + "Detected in: " + tClass.getTName() + EOL;
		hlcom5Info = hlcom5Info + "Value: " + hlcom5.getValue() + EOL;
		hlcom5Info = hlcom5Info + "Relative amount: " + hlcom5.getRelativeAmount().getValue().toString() + EOL + EOL;

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
			lowCohesionInfo = lowCohesionInfo + "HLowCohesionSmell" + EOL;
			lowCohesionInfo = lowCohesionInfo + "Thresholds: " + EOL;
			lowCohesionInfo = lowCohesionInfo + " HLCOM5Metric: at least HRelativeValueConstants.HIGH" + EOL;
			lowCohesionInfo = lowCohesionInfo + "  Threshold for HLCOM5Metric(HIGH) > " + hlcom5ThresholdValue + EOL + EOL;
		}

		lowCohesionInfo = lowCohesionInfo + "Detected in: " + tClass.getTName() + EOL + EOL;

		return lowCohesionInfo;
	}

	private String buildNACCString(HAnnotation annotation, boolean printHeader) {
		HNACCMetric hNACCMetric = (HNACCMetric) annotation;

		String hNACCMetricInfo = "";

		TClass tClass = (TClass) hNACCMetric.getTAnnotated();

		if (printHeader) {
			hNACCMetricInfo = hNACCMetricInfo + "HNACCMetric" + EOL + EOL;
		}

		hNACCMetricInfo = hNACCMetricInfo + "Detected in: " + tClass.getTName() + EOL;
		hNACCMetricInfo = hNACCMetricInfo + "Value: " + hNACCMetric.getValue() + EOL;
		hNACCMetricInfo = hNACCMetricInfo + "Relative amount: " + hNACCMetric.getRelativeAmount().getValue().toString()
				+ EOL + EOL;

		return hNACCMetricInfo;
	}

	private String buildNumberOfIncommingInvocationsString(HAnnotation annotation, boolean printHeader) {
		HIncommingInvocationMetric numberOfIncommingInvocations = (HIncommingInvocationMetric) annotation;

		String numberOfIncommingInvocationsInfo = "";

		TClass tClass = (TClass) numberOfIncommingInvocations.getTAnnotated();

		if (printHeader) {
			numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo + "HNumberOfIncommingInvocations"
					+ EOL + EOL;
		}

		numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo + "Detected in: " + tClass.getTName()
				+ EOL;
		numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo + "Value: "
				+ numberOfIncommingInvocations.getValue() + EOL;
		numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo + "Relative amount: "
				+ numberOfIncommingInvocations.getRelativeAmount().getValue().toString() + EOL + EOL;

		return numberOfIncommingInvocationsInfo;
	}

	private String buildNumberOfMembersString(HAnnotation annotation, boolean printHeader) {
		HNumberOfMembersMetric numberOfMembers = (HNumberOfMembersMetric) annotation;

		String numberOfMembersInfo = "";
		TClass tClass = (TClass) numberOfMembers.getTAnnotated();

		if (printHeader) {
			numberOfMembersInfo = numberOfMembersInfo + "HNumberOfMembersMetric" + EOL + EOL;
		}

		numberOfMembersInfo = numberOfMembersInfo + "Detected in: " + tClass.getTName() + EOL;
		numberOfMembersInfo = numberOfMembersInfo + "Value: " + numberOfMembers.getValue() + EOL;
		numberOfMembersInfo = numberOfMembersInfo + "Relative amount: "
				+ numberOfMembers.getRelativeAmount().getValue().toString() + EOL + EOL;

		return numberOfMembersInfo;
	}

	private String buildNumberOfOutgoingInvocationsString(HAnnotation annotation, boolean printHeader) {
		HOutgoingInvocationMetric numberOfOutgoingInvocations = (HOutgoingInvocationMetric) annotation;

		String numberOfOutgoingInvocationsInfo = "";

		TClass tClass = (TClass) numberOfOutgoingInvocations.getTAnnotated();

		if (printHeader) {
			numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo + "HNumberOfOutgoingInvocations" + EOL + EOL;
		}

		numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo + "Detected in: " + tClass.getTName() + EOL;
		numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo + "Value: "
				+ numberOfOutgoingInvocations.getValue() + EOL;
		numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo + "Relative amount: "
				+ numberOfOutgoingInvocations.getRelativeAmount().getValue().toString() + EOL + EOL;

		return numberOfOutgoingInvocationsInfo;
	}

}
