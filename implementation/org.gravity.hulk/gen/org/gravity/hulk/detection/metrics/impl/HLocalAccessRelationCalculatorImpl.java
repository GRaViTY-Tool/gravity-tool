/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLocal Access Relation Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalAccessRelationCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HLocalAccessRelationCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLocalAccessRelationCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_ACCESS_RELATION_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HLocalAccessRelationCalculatorImpl
				.pattern_HLocalAccessRelationCalculator_0_1_ActivityNode13_blackBFFB(tClass, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}
		HLocalFieldAccessesMetric hField = (HLocalFieldAccessesMetric) result1_black[1];
		HLocalMethodAccessesMetric hMethod = (HLocalMethodAccessesMetric) result1_black[2];
		Object[] result1_green = HLocalAccessRelationCalculatorImpl
				.pattern_HLocalAccessRelationCalculator_0_1_ActivityNode13_greenBBBFB(tClass, hField, hMethod, this);
		HLocalAccessRelationMetric metric = (HLocalAccessRelationMetric) result1_green[3];

		return HLocalAccessRelationCalculatorImpl.pattern_HLocalAccessRelationCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(HLocalFieldAccessesMetric fa, HLocalMethodAccessesMetric ma) {
		// [user code injected with eMoflon]

		return fa.getValue() / (ma.getValue() + 1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {

		Object[] result1_black = HLocalAccessRelationCalculatorImpl
				.pattern_HLocalAccessRelationCalculator_2_1_ActivityNode17_blackBBFF(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		HLocalFieldAccessesMetric hField = (HLocalFieldAccessesMetric) result1_black[2];
		HLocalMethodAccessesMetric hMethod = (HLocalMethodAccessesMetric) result1_black[3];
		return HLocalAccessRelationCalculatorImpl.pattern_HLocalAccessRelationCalculator_2_2_expressionFBBB(this,
				hField, hMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__HLOCALFIELDACCESSESMETRIC_HLOCALMETHODACCESSESMETRIC:
			return calculateValue((HLocalFieldAccessesMetric) arguments.get(0),
					(HLocalMethodAccessesMetric) arguments.get(1));
		case MetricsPackage.HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLocalAccessRelationCalculator_0_1_ActivityNode13_blackBFFB(TClass tClass,
			HLocalAccessRelationCalculator _this) {
		for (TAnnotation tmpHField : tClass.getTAnnotation()) {
			if (tmpHField instanceof HLocalFieldAccessesMetric) {
				HLocalFieldAccessesMetric hField = (HLocalFieldAccessesMetric) tmpHField;
				for (TAnnotation tmpHMethod : tClass.getTAnnotation()) {
					if (tmpHMethod instanceof HLocalMethodAccessesMetric) {
						HLocalMethodAccessesMetric hMethod = (HLocalMethodAccessesMetric) tmpHMethod;
						return new Object[] { tClass, hField, hMethod, _this };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HLocalAccessRelationCalculator_0_1_ActivityNode13_greenBBBFB(TClass tClass,
			HLocalFieldAccessesMetric hField, HLocalMethodAccessesMetric hMethod,
			HLocalAccessRelationCalculator _this) {
		HLocalAccessRelationMetric metric = MetricsFactory.eINSTANCE.createHLocalAccessRelationMetric();
		double _localVariable_0 = _this.calculateValue(hField, hMethod);
		hField.getPartOf().add(metric);
		hMethod.getPartOf().add(metric);
		metric.setTAnnotated(tClass);
		metric.setHLocalMethodAccesses(hMethod);
		metric.setHLocalFieldAccesses(hField);
		_this.getHAnnotation().add(metric);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { tClass, hField, hMethod, metric, _this };
	}

	public static final HMetric pattern_HLocalAccessRelationCalculator_0_2_expressionFB(
			HLocalAccessRelationMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	public static final Object[] pattern_HLocalAccessRelationCalculator_2_1_ActivityNode17_blackBBFF(
			HLocalAccessRelationCalculator _this, TClass tClass) {
		for (TAnnotation tmpHMethod : tClass.getTAnnotation()) {
			if (tmpHMethod instanceof HLocalMethodAccessesMetric) {
				HLocalMethodAccessesMetric hMethod = (HLocalMethodAccessesMetric) tmpHMethod;
				for (TAnnotation tmpHField : tClass.getTAnnotation()) {
					if (tmpHField instanceof HLocalFieldAccessesMetric) {
						HLocalFieldAccessesMetric hField = (HLocalFieldAccessesMetric) tmpHField;
						return new Object[] { _this, tClass, hField, hMethod };
					}
				}
			}
		}
		return null;
	}

	public static final double pattern_HLocalAccessRelationCalculator_2_2_expressionFBBB(
			HLocalAccessRelationCalculator _this, HLocalFieldAccessesMetric hField,
			HLocalMethodAccessesMetric hMethod) {
		double _localVariable_0 = _this.calculateValue(hField, hMethod);
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Relation beteen in Class Methodcalls and Fieldaccesses";
	}

	// [user code injected with eMoflon] -->
} //HLocalAccessRelationCalculatorImpl
