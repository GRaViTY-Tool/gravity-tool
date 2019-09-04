/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HInvocationRelationCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HInvocation Relation Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HInvocationRelationCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HInvocationRelationCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HInvocationRelationCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HINVOCATION_RELATION_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HInvocationRelationCalculatorImpl
				.pattern_HInvocationRelationCalculator_0_1_ActivityNode6_blackBBFF(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		HIncommingInvocationMetric nii = (HIncommingInvocationMetric) result1_black[2];
		HOutgoingInvocationMetric noi = (HOutgoingInvocationMetric) result1_black[3];

		return createMetric(tClass, nii, noi);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double calculateInvocValue(HIncommingInvocationMetric nii, HOutgoingInvocationMetric noi) {
		// [user code injected with eMoflon]

		return (noi.getValue()) / (nii.getValue() + 1);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double calculateValue(TClass tClass) {

		Object[] result1_black = HInvocationRelationCalculatorImpl.getMetrics(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		HIncommingInvocationMetric nii = (HIncommingInvocationMetric) result1_black[0];
		HOutgoingInvocationMetric noi = (HOutgoingInvocationMetric) result1_black[1];
		return calculateInvocValue(nii, noi);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HINVOCATION_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HINVOCATION_RELATION_CALCULATOR___CALCULATE_INVOC_VALUE__HINCOMMINGINVOCATIONMETRIC_HOUTGOINGINVOCATIONMETRIC:
			return calculateInvocValue((HIncommingInvocationMetric) arguments.get(0),
					(HOutgoingInvocationMetric) arguments.get(1));
		case MetricsPackage.HINVOCATION_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HInvocationRelationCalculator_0_1_ActivityNode6_blackBBFF(
			HInvocationRelationCalculator _this, TClass tClass) {
		for (TAnnotation tmpNii : tClass.getTAnnotation()) {
			if (tmpNii instanceof HIncommingInvocationMetric) {
				HIncommingInvocationMetric nii = (HIncommingInvocationMetric) tmpNii;
				for (TAnnotation tmpNoi : tClass.getTAnnotation()) {
					if (tmpNoi instanceof HOutgoingInvocationMetric) {
						HOutgoingInvocationMetric noi = (HOutgoingInvocationMetric) tmpNoi;
						return new Object[] { _this, tClass, nii, noi };
					}
				}
			}
		}
		return null;
	}

	public final HInvocationRelation createMetric(TClass tClass, HIncommingInvocationMetric nii,
			HOutgoingInvocationMetric noi) {
		HInvocationRelation metric = MetricsFactory.eINSTANCE.createHInvocationRelation();
		metric.setTAnnotated(tClass);
		metric.setHOutgoingInvocationCustomMetric(noi);
		metric.setHIncommingInvocationCustomMetric(nii);
		metric.setValue(calculateInvocValue(nii, noi));
		nii.getPartOf().add(metric);
		noi.getPartOf().add(metric);
		getHAnnotation().add(metric);
		return metric;
	}

	private static final Object[] getMetrics(HInvocationRelationCalculator _this, TClass tClass) {
		for (TAnnotation tmpNii : tClass.getTAnnotation()) {
			if (tmpNii instanceof HIncommingInvocationMetric) {
				HIncommingInvocationMetric nii = (HIncommingInvocationMetric) tmpNii;
				for (TAnnotation tmpNoi : tClass.getTAnnotation()) {
					if (tmpNoi instanceof HOutgoingInvocationMetric) {
						HOutgoingInvocationMetric noi = (HOutgoingInvocationMetric) tmpNoi;
						return new Object[] { nii, noi };
					}
				}
			}
		}
		return null;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Relation between Incoming and Outgoing Invocations";
	}

	// [user code injected with eMoflon] -->
} // HInvocationRelationCalculatorImpl
