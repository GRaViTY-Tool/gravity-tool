/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HMethodNumberCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;

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
	public HMetric calculateMetric(final TClass tClass) {
		removeAnnotations(tClass);

		if(tClass.isTLib()) {
			throw new IllegalArgumentException("Class is defined in a library " + tClass.getFullyQualifiedName() + ".");
		}
		final var nm = MetricsFactory.eINSTANCE.createHNumberOfMethodsMetric();
		nm.setTAnnotated(tClass);
		getHAnnotation().add(nm);
		nm.setValue(calculateValue(tClass));
		return nm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double calculateValue(final TClass tClass) {
		return tClass.getDeclaredTMethodDefinitions().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HMETHOD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HMETHOD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of Methods";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHNumberOfMethodsMetric();
	}

	// [user code injected with eMoflon] -->
} //HMethodNumberCalculatorImpl
