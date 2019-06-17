/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HEfferentCouplingMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import java.util.ArrayList;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEfferent Coupling Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HEfferentCouplingCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HEfferentCouplingCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HEfferentCouplingCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HEFFERENT_COUPLING_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HEfferentCouplingCalculatorImpl
				.pattern_HEfferentCouplingCalculator_0_1_ActivityNode22_blackBB(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HEfferentCouplingCalculatorImpl
				.pattern_HEfferentCouplingCalculator_0_1_ActivityNode22_greenBBF(this, tClass);
		HEfferentCouplingMetric metric = (HEfferentCouplingMetric) result1_green[2];

		return HEfferentCouplingCalculatorImpl.pattern_HEfferentCouplingCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		ArrayList<TAbstractType> accessedClasses = new ArrayList<TAbstractType>();
		for (TMember m : tClass.getDefines()) {
			for (TAccess t : m.getTAccessing()) {
				TMember tTarget = t.getTTarget();
				if (tTarget == null) {
					System.out.println(
							"Member within Class " + tClass.getTName() + " accesses an TAccess without Target");
					continue;
				}
				TAbstractType definingClass = tTarget.getDefinedBy();
				if (definingClass == null) {
					System.out.println(
							"Member within Class " + tClass.getTName() + " accesses a Target without defining Class");
					continue;
				}
				if (!tTarget.getDefinedBy().equals(tClass) && !accessedClasses.contains(tTarget.getDefinedBy())) {
					accessedClasses.add(definingClass);
				}
			}
		}
		return accessedClasses.size();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HEFFERENT_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HEFFERENT_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HEfferentCouplingCalculator_0_1_ActivityNode22_blackBB(
			HEfferentCouplingCalculator _this, TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HEfferentCouplingCalculator_0_1_ActivityNode22_greenBBF(
			HEfferentCouplingCalculator _this, TClass tClass) {
		HEfferentCouplingMetric metric = MetricsFactory.eINSTANCE.createHEfferentCouplingMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { _this, tClass, metric };
	}

	public static final HMetric pattern_HEfferentCouplingCalculator_0_2_expressionFB(HEfferentCouplingMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Efferent Coupling";
	}

	// [user code injected with eMoflon] -->
} //HEfferentCouplingCalculatorImpl
