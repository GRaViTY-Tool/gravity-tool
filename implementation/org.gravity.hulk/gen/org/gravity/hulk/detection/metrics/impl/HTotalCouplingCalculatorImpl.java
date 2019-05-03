/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HTotalCouplingMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HTotalCouplingCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TAbstractType;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTotal Coupling Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HTotalCouplingCalculatorImpl extends HClassBasedMetricCalculatorImpl implements HTotalCouplingCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTotalCouplingCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HTOTAL_COUPLING_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HTotalCouplingCalculatorImpl
				.pattern_HTotalCouplingCalculator_0_1_ActivityNode29_blackBB(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HTotalCouplingCalculatorImpl
				.pattern_HTotalCouplingCalculator_0_1_ActivityNode29_greenBFB(this, tClass);
		HTotalCouplingMetric metric = (HTotalCouplingMetric) result1_green[1];

		return HTotalCouplingCalculatorImpl.pattern_HTotalCouplingCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		double coupling = 0;

		for (TMember m : tClass.getDefines()) {
			for (TAccess access : m.getAccessedBy()) {
				if (access.getTSource().getDefinedBy() != tClass) {
					coupling++;
				}
			}

			for (TAccess access : m.getTAccessing()) {
				TAbstractType target = access.getTTarget().getDefinedBy();
				if (!target.isTLib() && target != tClass && !target.getTName().equals("T")) {
					coupling++;
				}
			}
		}
		return coupling;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HTOTAL_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HTOTAL_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HTotalCouplingCalculator_0_1_ActivityNode29_blackBB(
			HTotalCouplingCalculator _this, TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HTotalCouplingCalculator_0_1_ActivityNode29_greenBFB(
			HTotalCouplingCalculator _this, TClass tClass) {
		HTotalCouplingMetric metric = MetricsFactory.eINSTANCE.createHTotalCouplingMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { _this, metric, tClass };
	}

	public static final HMetric pattern_HTotalCouplingCalculator_0_2_expressionFB(HTotalCouplingMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Total Coupling";
	}

	// [user code injected with eMoflon] -->
} //HTotalCouplingCalculatorImpl
