/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HGetterMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HGetterCalculator;
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
 * An implementation of the model object '<em><b>HGetter Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGetterCalculatorImpl extends HClassBasedMetricCalculatorImpl implements HGetterCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HGetterCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HGETTER_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HGetterCalculatorImpl.pattern_HGetterCalculator_0_1_ActivityNode28_blackBB(this,
				tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HGetterCalculatorImpl.pattern_HGetterCalculator_0_1_ActivityNode28_greenBFB(this,
				tClass);
		HGetterMetric metric = (HGetterMetric) result1_green[1];

		return HGetterCalculatorImpl.pattern_HGetterCalculator_0_2_expressionFB(metric);
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
				if (name.toLowerCase().startsWith("get")) {
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
		case MetricsPackage.HGETTER_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HGETTER_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HGetterCalculator_0_1_ActivityNode28_blackBB(HGetterCalculator _this,
			TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HGetterCalculator_0_1_ActivityNode28_greenBFB(HGetterCalculator _this,
			TClass tClass) {
		HGetterMetric metric = MetricsFactory.eINSTANCE.createHGetterMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { _this, metric, tClass };
	}

	public static final HMetric pattern_HGetterCalculator_0_2_expressionFB(HGetterMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	public String getGuiName() {
		return "Number of Getters";
	}

	// [user code injected with eMoflon] -->
} //HGetterCalculatorImpl
