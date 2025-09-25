/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HNumberOfChildCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HNumber Of Child Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HNumberOfChildCalculatorImpl extends HClassBasedMetricCalculatorImpl implements HNumberOfChildCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HNumberOfChildCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HNUMBER_OF_CHILD_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		removeAnnotations(tClass);

		final var child = MetricsFactory.eINSTANCE.createHNumberOfChildMetric();
		child.setTAnnotated(tClass);
		child.setValue(calculateValue(tClass));
		getHAnnotation().add(child);
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double calculateValue(final TClass tParent) {
		// [user code injected with eMoflon]

		return tParent.getChildClasses().size();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of members";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHNumberOfChildMetric();
	}

	// [user code injected with eMoflon] -->
} //HNumberOfChildCalculatorImpl
