/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HMethodNumberCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMethod Number Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HMethodNumberCalculatorImpl extends HClassBasedMetricCalculatorImpl implements HMethodNumberCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMethodNumberCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HMETHOD_NUMBER_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HMetric calculateMetric(TClass tClass) {

		if(tClass.isTLib()) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}
		final Object[] result1_green = HMethodNumberCalculatorImpl
				.pattern_HMethodNumberCalculator_0_1_ActivityNode2_greenFBB(tClass, this);
		final HNumberOfMethodsMetric nm = (HNumberOfMethodsMetric) result1_green[0];

		return HMethodNumberCalculatorImpl.pattern_HMethodNumberCalculator_0_2_expressionFB(nm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		int i = 0;
		for (final TMember m : tClass.getDefines()) {
			if (m instanceof TMethodDefinition) {
				i++;
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
		case MetricsPackage.HMETHOD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HMETHOD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HMethodNumberCalculator_0_1_ActivityNode2_greenFBB(TClass tClass,
			HMethodNumberCalculator _this) {
		final HNumberOfMethodsMetric nm = MetricsFactory.eINSTANCE.createHNumberOfMethodsMetric();
		final double _localVariable_0 = _this.calculateValue(tClass);
		nm.setTAnnotated(tClass);
		_this.getHAnnotation().add(nm);
		final double nm_value_prime = Double.valueOf(_localVariable_0);
		nm.setValue(Double.valueOf(nm_value_prime));
		return new Object[] { nm, tClass, _this };
	}

	public static final HMetric pattern_HMethodNumberCalculator_0_2_expressionFB(HNumberOfMethodsMetric nm) {
		final HMetric _result = nm;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of Methods";
	}

	// [user code injected with eMoflon] -->
} //HMethodNumberCalculatorImpl
