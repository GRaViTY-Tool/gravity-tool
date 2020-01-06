/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

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

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLocal
 * Fields Access Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalFieldsAccessCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HLocalFieldsAccessCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HLocalFieldsAccessCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_FIELDS_ACCESS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {
		HLocalFieldAccessesMetric metric = MetricsFactory.eINSTANCE.createHLocalFieldAccessesMetric();
		metric.setTAnnotated(tClass);
		getHAnnotation().add(metric);
		metric.setValue(Double.valueOf(0.0));

		for (TMember tMember : tClass.getDefines()) {
			for (TMember tAnyAccessedField : tClass.getDefines()) {
				if (tAnyAccessedField instanceof TFieldDefinition) {
					for (TAccess tAnyAccess : tMember.getTAccessing()) {
						if (tAnyAccessedField.getAccessedBy().contains(tAnyAccess)) {
							metric.increment();
						}
					}
				}
			}
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of in Class Fieldaccesses";
	}

	// [user code injected with eMoflon] -->
} // HLocalFieldsAccessCalculatorImpl
