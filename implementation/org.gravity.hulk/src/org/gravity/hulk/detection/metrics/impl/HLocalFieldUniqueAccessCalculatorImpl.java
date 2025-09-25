/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
// [user defined imports] -->

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLocal Field Unique Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalFieldUniqueAccessCalculatorImpl extends HClassBasedMetricCalculatorImpl
implements HLocalFieldUniqueAccessCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLocalFieldUniqueAccessCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHLocalFieldUniqueAccessMetric();
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
		var i = 0;
		for (final TMember m : tClass.getDefines()) {
			final var accessedMembers = new ArrayList<TMember>();
			for (final TAccess t : m.getAccessing()) {
				final var tTarget = t.getTarget();
				if ((tTarget instanceof TFieldDefinition) && tClass.equals(tTarget.getDefinedBy())
						&& !accessedMembers.contains(tTarget)) {
					i++;
					accessedMembers.add(tTarget);
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
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of distinct fields accessed by each method";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHLocalFieldUniqueAccessMetric();
	}

	// [user code injected with eMoflon] -->
} //HLocalFieldUniqueAccessCalculatorImpl
