/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HSetterMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HSetterCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSetter Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSetterCalculatorImpl extends HClassBasedMetricCalculatorImpl implements HSetterCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSetterCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HSETTER_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HSetterCalculatorImpl.pattern_HSetterCalculator_0_1_ActivityNode27_blackBB(this,
				tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HSetterCalculatorImpl.pattern_HSetterCalculator_0_1_ActivityNode27_greenBFB(this,
				tClass);
		HSetterMetric metric = (HSetterMetric) result1_green[1];

		return HSetterCalculatorImpl.pattern_HSetterCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		if (tClass == null || tClass.isTLib()) {
			return 0;
		}

		int i = 0;
		for (TMember m : tClass.getDefines()) {
			if (m instanceof TMethodDefinitionImpl) {
				TMethodSignature sig = ((TMethodDefinitionImpl) m).getSignature();
				if (sig == null) {
					//System.out.println("Method within Class " + tClass.getTName() + " does not have a signature");
					continue;
				}
				TMethod method = sig.getMethod();
				if (method == null) {
					//System.out.println(
					//"MethodSignature of a Method in Class " + tClass.getTName() + " does not have a TMethod");
					continue;
				}
				String name = method.getTName();
				if (name.toLowerCase().startsWith("set")) {
					i++;
				}
			}
		}
		i += calculateValue(tClass.getParentClass());

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
		case MetricsPackage.HSETTER_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HSETTER_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HSetterCalculator_0_1_ActivityNode27_blackBB(HSetterCalculator _this,
			TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HSetterCalculator_0_1_ActivityNode27_greenBFB(HSetterCalculator _this,
			TClass tClass) {
		HSetterMetric metric = MetricsFactory.eINSTANCE.createHSetterMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { _this, metric, tClass };
	}

	public static final HMetric pattern_HSetterCalculator_0_2_expressionFB(HSetterMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	public String getGuiName() {
		return "Number of setter Methods";
	}

	// [user code injected with eMoflon] -->
} //HSetterCalculatorImpl
