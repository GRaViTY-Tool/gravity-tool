/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HAfferentCouplingMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator;
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
 * An implementation of the model object '<em><b>HAfferent Coupling Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAfferentCouplingCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HAfferentCouplingCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAfferentCouplingCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HAFFERENT_COUPLING_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HAfferentCouplingCalculatorImpl
				.pattern_HAfferentCouplingCalculator_0_1_ActivityNode23_blackBB(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HAfferentCouplingCalculatorImpl
				.pattern_HAfferentCouplingCalculator_0_1_ActivityNode23_greenBBF(this, tClass);
		HAfferentCouplingMetric metric = (HAfferentCouplingMetric) result1_green[2];

		return HAfferentCouplingCalculatorImpl.pattern_HAfferentCouplingCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		ArrayList<TAbstractType> accessingClasses = new ArrayList<TAbstractType>();
		for (TMember m : tClass.getDefines()) {
			for (TAccess t : m.getAccessedBy()) {
				TMember tSource = t.getTSource();
				if (tSource == null) {
					System.out.println(
							"Member within Class " + tClass.getTName() + " was accessed without an TAccess Source");
					continue;
				}
				TAbstractType definingClass = tSource.getDefinedBy();
				if (definingClass == null) {
					System.out.println("Member within Class " + tClass.getTName()
							+ " was accessed by a Source without defining Class");
					continue;
				}
				if (!tSource.getDefinedBy().equals(tClass) && !accessingClasses.contains(tSource.getDefinedBy())) {
					accessingClasses.add(definingClass);
				}
			}

		}
		return accessingClasses.size();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HAFFERENT_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HAFFERENT_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HAfferentCouplingCalculator_0_1_ActivityNode23_blackBB(
			HAfferentCouplingCalculator _this, TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HAfferentCouplingCalculator_0_1_ActivityNode23_greenBBF(
			HAfferentCouplingCalculator _this, TClass tClass) {
		HAfferentCouplingMetric metric = MetricsFactory.eINSTANCE.createHAfferentCouplingMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { _this, tClass, metric };
	}

	public static final HMetric pattern_HAfferentCouplingCalculator_0_2_expressionFB(HAfferentCouplingMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Afferent Coupling";
	}

	// [user code injected with eMoflon] -->
} //HAfferentCouplingCalculatorImpl
