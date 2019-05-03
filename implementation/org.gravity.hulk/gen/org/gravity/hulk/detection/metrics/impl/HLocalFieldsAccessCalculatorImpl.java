/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLocal Fields Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalFieldsAccessCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HLocalFieldsAccessCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLocalFieldsAccessCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_FIELDS_ACCESS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HLocalFieldsAccessCalculatorImpl
				.pattern_HLocalFieldsAccessCalculator_0_1_ActivityNode11_blackBB(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HLocalFieldsAccessCalculatorImpl
				.pattern_HLocalFieldsAccessCalculator_0_1_ActivityNode11_greenFBB(this, tClass);
		HLocalFieldAccessesMetric metric = (HLocalFieldAccessesMetric) result1_green[0];

		// ForEach 
		for (Object[] result2_black : HLocalFieldsAccessCalculatorImpl
				.pattern_HLocalFieldsAccessCalculator_0_2_ActivityNode10_blackBFFF(tClass)) {
			//nothing TMethodDefinition tAnyAccessingMethod = (TMethodDefinition) result2_black[1];
			//nothing TFieldDefinition tAnyAccessedField = (TFieldDefinition) result2_black[2];
			//nothing TAccess tAnyAccess = (TAccess) result2_black[3];
			// 
			HLocalFieldsAccessCalculatorImpl
					.pattern_HLocalFieldsAccessCalculator_0_3_ActivityNode12_expressionFB(metric);

		}
		return HLocalFieldsAccessCalculatorImpl.pattern_HLocalFieldsAccessCalculator_0_4_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		int i = 0;
		for (TMember m : tClass.getDefines()) {
			for (TAccess t : m.getTAccessing()) {
				TMember tTarget = t.getTTarget();
				if (tTarget instanceof TFieldDefinition && tTarget.getDefinedBy().equals(tClass)) {
					i++;
				}
			}
		}
		return i;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLocalFieldsAccessCalculator_0_1_ActivityNode11_blackBB(
			HLocalFieldsAccessCalculator _this, TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HLocalFieldsAccessCalculator_0_1_ActivityNode11_greenFBB(
			HLocalFieldsAccessCalculator _this, TClass tClass) {
		HLocalFieldAccessesMetric metric = MetricsFactory.eINSTANCE.createHLocalFieldAccessesMetric();
		double metric_value_prime = Double.valueOf(0.0);
		metric.setTAnnotated(tClass);
		_this.getHAnnotation().add(metric);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { metric, _this, tClass };
	}

	public static final Iterable<Object[]> pattern_HLocalFieldsAccessCalculator_0_2_ActivityNode10_blackBFFF(
			TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tmpTAnyAccessingMethod : tClass.getDefines()) {
			if (tmpTAnyAccessingMethod instanceof TMethodDefinition) {
				TMethodDefinition tAnyAccessingMethod = (TMethodDefinition) tmpTAnyAccessingMethod;
				for (TMember tmpTAnyAccessedField : tClass.getDefines()) {
					if (tmpTAnyAccessedField instanceof TFieldDefinition) {
						TFieldDefinition tAnyAccessedField = (TFieldDefinition) tmpTAnyAccessedField;
						for (TAccess tAnyAccess : tAnyAccessingMethod.getTAccessing()) {
							if (tAnyAccessedField.getAccessedBy().contains(tAnyAccess)) {
								_result.add(
										new Object[] { tClass, tAnyAccessingMethod, tAnyAccessedField, tAnyAccess });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final double pattern_HLocalFieldsAccessCalculator_0_3_ActivityNode12_expressionFB(
			HLocalFieldAccessesMetric metric) {
		double _localVariable_0 = metric.increment();
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	public static final HMetric pattern_HLocalFieldsAccessCalculator_0_4_expressionFB(
			HLocalFieldAccessesMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of in Class Fieldaccesses";
	}

	// [user code injected with eMoflon] -->
} //HLocalFieldsAccessCalculatorImpl
