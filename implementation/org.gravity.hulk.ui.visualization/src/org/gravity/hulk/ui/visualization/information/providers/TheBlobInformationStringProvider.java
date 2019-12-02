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
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.annotations.TAnnotation;

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
		final HBlobAntiPattern blob = (HBlobAntiPattern) annotation;

		final TClass tClass = (TClass) blob.getTAnnotated();

		HDataClassAccessor hDataClassAccessor = null;
		double hDataClassAccessorThresholdValue = -1;
		double hDataClassAccessorValue = -1;
		String hDataClassAccessorRelativeAmount = "-1";
		for (final TAnnotation tAnnotation : tClass.getTAnnotation()) {
			if (tAnnotation instanceof HDataClassAccessor) {
				hDataClassAccessor = (HDataClassAccessor) tAnnotation;
				hDataClassAccessorValue = hDataClassAccessor.getValue();
				hDataClassAccessorRelativeAmount = hDataClassAccessor.getRelativeAmount().getValue().toString();
			}
		}

		StringBuilder theBlobInfo = new StringBuilder();
		if (printHeader && hDataClassAccessor != null) {
			hDataClassAccessorThresholdValue = ThresholdCalculator.getThresholdValue(hDataClassAccessor,
					HRelativeValueConstants.MEDIUM, true);
			theBlobInfo = theBlobInfo.append("HBlobAntiPattern").append(EOL).append("Thresholds: ").append(EOL)
					.append(" HDataClassAccessor: at least HRelativeValueConstnats.MEDIUM").append(EOL)
					.append("  Threshold for HDataClassAccessor(MEDIUM) > ").append(hDataClassAccessorThresholdValue)
					.append(EOL).append(EOL);
		}

		theBlobInfo = theBlobInfo.append("Detected in: ").append(tClass.getTName()).append(EOL)
				.append("Number of data class accesses: ").append(hDataClassAccessorValue).append(EOL)
				.append("Value of HDataClassAccessor: ").append(hDataClassAccessorValue).append(EOL)
				.append("Relative amount of HDataClassAccessor: ").append(hDataClassAccessorRelativeAmount).append(EOL)
				.append(EOL);

		return theBlobInfo.toString();
	}

	private String buildGodClassString(HAnnotation annotation, boolean printHeader) {
		StringBuilder godClassInfo = new StringBuilder();
		final HGodClassAntiPattern godClass = (HGodClassAntiPattern) annotation;
		TClass tClass;

		tClass = (TClass) godClass.getTAnnotated();

		if (printHeader) {
			godClassInfo = godClassInfo.append("HGodClassAntiPattern").append(EOL).append("Thresholds: ").append(EOL)
					.append(" none").append(EOL).append(EOL);
		}

		godClassInfo = godClassInfo.append("Detected in: ").append(tClass.getTName()).append(EOL).append(EOL);

		return godClassInfo.toString();
	}

	private String buildControllerClassString(HAnnotation annotation, boolean printHeader) {
		final HControllerClassSmell controllerClass = (HControllerClassSmell) annotation;

		StringBuilder controllerClassInfo = new StringBuilder();

		final HInvocationRelation hInvocationRelation = controllerClass.getHInvocationRelation();
		double hInvocationRelationThresholdValue = -1;

		final TClass tClass = (TClass) controllerClass.getTAnnotated();

		if (printHeader) {
			hInvocationRelationThresholdValue = ThresholdCalculator.getThresholdValue(hInvocationRelation,
					HRelativeValueConstants.MEDIUM, true);
			controllerClassInfo = controllerClassInfo.append("ControllerClass").append(EOL).append("Thresholds: ")
					.append(EOL).append(" HInvocationRelationMetric: at least HRelativeValueConstants.MEDIUM")
					.append(EOL)
					.append("  Threshold for HInvocationRelation(MEDIUM): (outgoing invocations / incomming invocations) > ")
					.append(hInvocationRelationThresholdValue).append(EOL).append(EOL);
		}

		controllerClassInfo = controllerClassInfo.append("Detected in: ").append(tClass.getTName()).append(EOL)
				.append(EOL);

		return controllerClassInfo.toString();
	}

	private String buildDataClassString(HAnnotation annotation, boolean printHeader) {
		StringBuilder dataClassInfo = new StringBuilder();
		final HDataClassSmell dataClassSmell = (HDataClassSmell) annotation;

		TClass tClass;
		final HNACCMetric hnacc = dataClassSmell.getHNACCMetric();
		double hnaccThresholdValue = -1;

		tClass = (TClass) dataClassSmell.getTAnnotated();

		if (printHeader) {
			hnaccThresholdValue = ThresholdCalculator.getThresholdValue(hnacc, HRelativeValueConstants.HIGH, true);
			dataClassInfo = dataClassInfo.append("HDataClassSmell").append(EOL).append("Thresholds: ").append(EOL)
					.append(" HNACCMetric: at least HRelativeValueConstants.HIGH").append(EOL)
					.append("  Threshold for HNACCMetric(HIGH): (getters+setters)/methods > ")
					.append(hnaccThresholdValue).append(EOL).append(EOL);
		}

		dataClassInfo = dataClassInfo.append("Detetcted in: ").append(tClass.getTName()).append(EOL).append(EOL);

		return dataClassInfo.toString();
	}

	private String buildGetterSetterString(HAnnotation annotation, boolean printHeader) {
		final HGetterSetterSmell getterSetterSmell = (HGetterSetterSmell) annotation;

		StringBuilder getterSetterInfo = new StringBuilder();

		final TMethodDefinition tMethodDefinition = (TMethodDefinition) getterSetterSmell.getTAnnotated();

		if (printHeader) {
			getterSetterInfo = getterSetterInfo.append("HGetterSetterSmell").append(EOL).append("Thresholds: ")
					.append(EOL).append(" none").append(EOL).append(EOL);
		}

		getterSetterInfo = getterSetterInfo.append("Detected in: ")
				.append(tMethodDefinition.getSignature().getMethod().getTName()).append(EOL).append(" in Class: ")
				.append(tMethodDefinition.getDefinedBy().getTName()).append(EOL).append(EOL);

		return getterSetterInfo.toString();
	}

	private String buildInvocationRelationString(HAnnotation annotation, boolean printHeader) {
		final HInvocationRelation invocationRelation = (HInvocationRelation) annotation;

		StringBuilder invocationRelationInfo = new StringBuilder();

		final TClass tClass = (TClass) invocationRelation.getTAnnotated();

		if (printHeader) {
			invocationRelationInfo = invocationRelationInfo.append("HInvocationRelation").append(EOL).append(EOL);
		}

		invocationRelationInfo = invocationRelationInfo.append("Detected in: ").append(tClass.getTName()).append(EOL)
				.append("Value: ").append(invocationRelation.getValue()).append(EOL).append("Relative amount: ")
				.append(invocationRelation.getRelativeAmount().getValue().toString()).append(EOL).append(EOL);

		return invocationRelationInfo.toString();
	}

	private String buildLargeClassLowCohesionString(HAnnotation annotation, boolean printHeader) {
		final HLargeClassLowCohesionSmell largeClassLowCohesionSmell = (HLargeClassLowCohesionSmell) annotation;

		StringBuilder largeClassLowCohesionInfo = new StringBuilder();

		final TClass tClass = (TClass) largeClassLowCohesionSmell.getTAnnotated();

		if (printHeader) {
			largeClassLowCohesionInfo = largeClassLowCohesionInfo.append("HLargeClassLowCohesionSmell").append(EOL)
					.append("Thresholds: ").append(EOL).append(" none").append(EOL).append(EOL);
		}

		largeClassLowCohesionInfo = largeClassLowCohesionInfo.append("Detected in: ").append(tClass.getTName())
				.append(EOL).append(EOL);

		return largeClassLowCohesionInfo.toString();
	}

	private String buildLargeClassString(HAnnotation annotation, boolean printHeader) {
		final HLargeClassSmell largeClass = (HLargeClassSmell) annotation;

		StringBuilder largeClassInfo = new StringBuilder();
		final TClass tClass = (TClass) largeClass.getTAnnotated();
		final HNumberOfMembersMetric numberOfMemberic = largeClass.getHNumberOfMembers();
		double numberOfMembersThresholdValue = -1;

		if (printHeader) {
			numberOfMembersThresholdValue = ThresholdCalculator.getThresholdValue(numberOfMemberic,
					HRelativeValueConstants.HIGH, true);
			largeClassInfo = largeClassInfo.append("HLargeClassSmell").append(EOL).append("Thresholds: ").append(EOL)
					.append(" HNumberOfMembersMetric: at least HRelativeValueConstants.HIGH").append(EOL)
					.append("  Threshold for HNumberOfMembersMetric(HIGH): number of members > ")
					.append(numberOfMembersThresholdValue).append(EOL).append(EOL);
		}

		largeClassInfo = largeClassInfo.append("Detected in: ").append(tClass.getTName()).append(EOL).append(EOL);

		return largeClassInfo.toString();
	}

	private String buildLCOM5String(HAnnotation annotation, boolean printHeader) {
		final HLCOM5Metric hlcom5 = (HLCOM5Metric) annotation;

		StringBuilder hlcom5Info = new StringBuilder();
		final TClass tClass = (TClass) hlcom5.getTAnnotated();

		if (printHeader) {
			hlcom5Info = hlcom5Info.append("HLCOM5Metric").append(EOL).append(EOL);
		}

		hlcom5Info = hlcom5Info.append("Detected in: ").append(tClass.getTName()).append(EOL).append("Value: ")
				.append(hlcom5.getValue()).append(EOL).append("Relative amount: ")
				.append(hlcom5.getRelativeAmount().getValue().toString()).append(EOL).append(EOL);

		return hlcom5Info.toString();
	}

	private String buildLowCohesionString(HAnnotation annotation, boolean printHeader) {
		final HLowCohesionSmell lowCohesionSmell = (HLowCohesionSmell) annotation;

		StringBuilder lowCohesionInfo = new StringBuilder();
		TClass tClass;
		HLCOM5Metric hlcom5;
		double hlcom5ThresholdValue = -1;

		tClass = (TClass) lowCohesionSmell.getTAnnotated();
		hlcom5 = lowCohesionSmell.getHLCOM5CustomMetric();

		if (printHeader) {
			hlcom5ThresholdValue = ThresholdCalculator.getThresholdValue(hlcom5, HRelativeValueConstants.HIGH, true);
			lowCohesionInfo = lowCohesionInfo.append("HLowCohesionSmell").append(EOL).append("Thresholds: ").append(EOL)
					.append(" HLCOM5Metric: at least HRelativeValueConstants.HIGH").append(EOL)
					.append("  Threshold for HLCOM5Metric(HIGH) > ").append(hlcom5ThresholdValue).append(EOL)
					.append(EOL);
		}

		lowCohesionInfo = lowCohesionInfo.append("Detected in: ").append(tClass.getTName()).append(EOL).append(EOL);

		return lowCohesionInfo.toString();
	}

	private String buildNACCString(HAnnotation annotation, boolean printHeader) {
		final HNACCMetric hNACCMetric = (HNACCMetric) annotation;

		StringBuilder hNACCMetricInfo = new StringBuilder();

		final TClass tClass = (TClass) hNACCMetric.getTAnnotated();

		if (printHeader) {
			hNACCMetricInfo = hNACCMetricInfo.append("HNACCMetric").append(EOL).append(EOL);
		}

		hNACCMetricInfo = hNACCMetricInfo.append("Detected in: ").append(tClass.getTName()).append(EOL)
				.append("Value: ").append(hNACCMetric.getValue()).append(EOL).append("Relative amount: ")
				.append(hNACCMetric.getRelativeAmount().getValue().toString()).append(EOL).append(EOL);

		return hNACCMetricInfo.toString();
	}

	private String buildNumberOfIncommingInvocationsString(HAnnotation annotation, boolean printHeader) {
		final HIncommingInvocationMetric numberOfIncommingInvocations = (HIncommingInvocationMetric) annotation;

		StringBuilder numberOfIncommingInvocationsInfo = new StringBuilder();

		final TClass tClass = (TClass) numberOfIncommingInvocations.getTAnnotated();

		if (printHeader) {
			numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo.append("HNumberOfIncommingInvocations")
					.append(EOL).append(EOL);
		}

		numberOfIncommingInvocationsInfo = numberOfIncommingInvocationsInfo.append("Detected in: ")
				.append(tClass.getTName()).append(EOL).append("Value: ").append(numberOfIncommingInvocations.getValue())
				.append(EOL).append("Relative amount: ")
				.append(numberOfIncommingInvocations.getRelativeAmount().getValue().toString()).append(EOL).append(EOL);

		return numberOfIncommingInvocationsInfo.toString();
	}

	private String buildNumberOfMembersString(HAnnotation annotation, boolean printHeader) {
		final HNumberOfMembersMetric numberOfMembers = (HNumberOfMembersMetric) annotation;

		StringBuilder numberOfMembersInfo = new StringBuilder();
		final TClass tClass = (TClass) numberOfMembers.getTAnnotated();

		if (printHeader) {
			numberOfMembersInfo = numberOfMembersInfo.append("HNumberOfMembersMetric").append(EOL).append(EOL);
		}

		numberOfMembersInfo = numberOfMembersInfo.append("Detected in: ").append(tClass.getTName()).append(EOL)
				.append("Value: ").append(numberOfMembers.getValue()).append(EOL).append("Relative amount: ")
				.append(numberOfMembers.getRelativeAmount().getValue().toString()).append(EOL).append(EOL);

		return numberOfMembersInfo.toString();
	}

	private String buildNumberOfOutgoingInvocationsString(HAnnotation annotation, boolean printHeader) {
		final HOutgoingInvocationMetric numberOfOutgoingInvocations = (HOutgoingInvocationMetric) annotation;

		StringBuilder numberOfOutgoingInvocationsInfo = new StringBuilder();

		final TClass tClass = (TClass) numberOfOutgoingInvocations.getTAnnotated();

		if (printHeader) {
			numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo.append("HNumberOfOutgoingInvocations")
					.append(EOL).append(EOL);
		}

		numberOfOutgoingInvocationsInfo = numberOfOutgoingInvocationsInfo.append("Detected in: ")
				.append(tClass.getTName()).append(EOL).append("Value: ").append(numberOfOutgoingInvocations.getValue())
				.append(EOL).append("Relative amount: ")
				.append(numberOfOutgoingInvocations.getRelativeAmount().getValue().toString()).append(EOL).append(EOL);

		return numberOfOutgoingInvocationsInfo.toString();
	}

}
