/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HTotalCouplingCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;

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
	 * @generated NOT
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHTotalCouplingMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(calculateValue(tClass));
		getHAnnotation().add(metric);
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double calculateValue(final TClass tClass) {
		// [user code injected with eMoflon]

		var coupling = 0D;

		for (final TMember m : tClass.getDefines()) {
			for (final TAccess access : m.getAccessedBy()) {
				if (access.getSource().getDefinedBy() != tClass) {
					coupling++;
				}
			}

			for (final TAccess access : m.getAccessing()) {
				final var target = access.getTarget().getDefinedBy();
				if (!target.isTLib() && (target != tClass) && !target.getTName().equals("T")) {
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
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HTOTAL_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HTOTAL_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Total Coupling";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHTotalCouplingMetric();
	}

	// [user code injected with eMoflon] -->
} //HTotalCouplingCalculatorImpl
