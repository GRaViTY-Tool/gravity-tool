/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import java.util.ArrayList;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLocal Field Unique Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalFieldUniqueAccessCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HLocalFieldUniqueAccessCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLocalFieldUniqueAccessCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HLocalFieldUniqueAccessCalculatorImpl
				.pattern_HLocalFieldUniqueAccessCalculator_0_1_ActivityNode21_blackBB(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HLocalFieldUniqueAccessCalculatorImpl
				.pattern_HLocalFieldUniqueAccessCalculator_0_1_ActivityNode21_greenBBF(this, tClass);
		HLocalFieldUniqueAccessMetric metric = (HLocalFieldUniqueAccessMetric) result1_green[2];

		return HLocalFieldUniqueAccessCalculatorImpl.pattern_HLocalFieldUniqueAccessCalculator_0_2_expressionFB(metric);
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
			ArrayList<TMember> accessedMembers = new ArrayList<TMember>();
			for (TAccess t : m.getTAccessing()) {
				TMember tTarget = t.getTTarget();
				if (tTarget instanceof TFieldDefinition && tClass.equals(tTarget.getDefinedBy())
						&& !accessedMembers.contains(tTarget)) {
					i++;
					accessedMembers.add(tTarget);
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
		case MetricsPackage.HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLocalFieldUniqueAccessCalculator_0_1_ActivityNode21_blackBB(
			HLocalFieldUniqueAccessCalculator _this, TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HLocalFieldUniqueAccessCalculator_0_1_ActivityNode21_greenBBF(
			HLocalFieldUniqueAccessCalculator _this, TClass tClass) {
		HLocalFieldUniqueAccessMetric metric = MetricsFactory.eINSTANCE.createHLocalFieldUniqueAccessMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { _this, tClass, metric };
	}

	public static final HMetric pattern_HLocalFieldUniqueAccessCalculator_0_2_expressionFB(
			HLocalFieldUniqueAccessMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of distinct fields accessed by each method";
	}

	// [user code injected with eMoflon] -->
} //HLocalFieldUniqueAccessCalculatorImpl
