/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLocal Method Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalMethodAccessCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HLocalMethodAccessCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLocalMethodAccessCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_METHOD_ACCESS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HLocalMethodAccessCalculatorImpl
				.pattern_HLocalMethodAccessCalculator_0_1_ActivityNode11_blackBB(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HLocalMethodAccessCalculatorImpl
				.pattern_HLocalMethodAccessCalculator_0_1_ActivityNode11_greenFBB(this, tClass);
		HLocalMethodAccessesMetric metric = (HLocalMethodAccessesMetric) result1_green[0];

		// ForEach 
		for (Object[] result2_black : HLocalMethodAccessCalculatorImpl
				.pattern_HLocalMethodAccessCalculator_0_2_ActivityNode10_blackBFFF(tClass)) {
			//nothing TMethodDefinition tAnyAccessingMethod = (TMethodDefinition) result2_black[1];
			//nothing TMethodDefinition tAnyAccessedMethod = (TMethodDefinition) result2_black[2];
			//nothing TAccess tAnyAccess = (TAccess) result2_black[3];
			// 
			HLocalMethodAccessCalculatorImpl
					.pattern_HLocalMethodAccessCalculator_0_3_ActivityNode12_expressionFB(metric);

		}
		return HLocalMethodAccessCalculatorImpl.pattern_HLocalMethodAccessCalculator_0_4_expressionFB(metric);
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
				if (tTarget instanceof TMethodDefinition && tTarget.getDefinedBy().equals(tClass)) {
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
		case MetricsPackage.HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLocalMethodAccessCalculator_0_1_ActivityNode11_blackBB(
			HLocalMethodAccessCalculator _this, TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HLocalMethodAccessCalculator_0_1_ActivityNode11_greenFBB(
			HLocalMethodAccessCalculator _this, TClass tClass) {
		HLocalMethodAccessesMetric metric = MetricsFactory.eINSTANCE.createHLocalMethodAccessesMetric();
		double metric_value_prime = Double.valueOf(0.0);
		metric.setTAnnotated(tClass);
		_this.getHAnnotation().add(metric);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { metric, _this, tClass };
	}

	public static final Iterable<Object[]> pattern_HLocalMethodAccessCalculator_0_2_ActivityNode10_blackBFFF(
			TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tmpTAnyAccessingMethod : tClass.getDefines()) {
			if (tmpTAnyAccessingMethod instanceof TMethodDefinition) {
				TMethodDefinition tAnyAccessingMethod = (TMethodDefinition) tmpTAnyAccessingMethod;
				for (TMember tmpTAnyAccessedMethod : tClass.getDefines()) {
					if (tmpTAnyAccessedMethod instanceof TMethodDefinition) {
						TMethodDefinition tAnyAccessedMethod = (TMethodDefinition) tmpTAnyAccessedMethod;
						if (!tAnyAccessedMethod.equals(tAnyAccessingMethod)) {
							for (TAccess tAnyAccess : tAnyAccessingMethod.getTAccessing()) {
								if (tAnyAccessedMethod.getAccessedBy().contains(tAnyAccess)) {
									_result.add(new Object[] { tClass, tAnyAccessingMethod, tAnyAccessedMethod,
											tAnyAccess });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final double pattern_HLocalMethodAccessCalculator_0_3_ActivityNode12_expressionFB(
			HLocalMethodAccessesMetric metric) {
		double _localVariable_0 = metric.increment();
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	public static final HMetric pattern_HLocalMethodAccessCalculator_0_4_expressionFB(
			HLocalMethodAccessesMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of in Class Methodcalls";
	}

	// [user code injected with eMoflon] -->
} //HLocalMethodAccessCalculatorImpl
