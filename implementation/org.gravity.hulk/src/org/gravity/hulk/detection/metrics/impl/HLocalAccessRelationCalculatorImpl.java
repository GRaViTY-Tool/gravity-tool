/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLocal
 * Access Relation Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalAccessRelationCalculatorImpl extends HClassBasedMetricCalculatorImpl
implements HLocalAccessRelationCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HLocalAccessRelationCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_ACCESS_RELATION_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		removeAnnotations(tClass);

		HLocalFieldAccessesMetric hField = null;
		HLocalMethodAccessesMetric hMethod = null;
		for (final TAnnotation tmpHField : tClass.getTAnnotation()) {
			if (tmpHField instanceof HLocalFieldAccessesMetric) {
				hField = (HLocalFieldAccessesMetric) tmpHField;
			} else if (tmpHField instanceof HLocalMethodAccessesMetric) {
				hMethod = (HLocalMethodAccessesMetric) tmpHField;
			}
		}
		if ((hField == null) || (hMethod == null)) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}

		final var metric = MetricsFactory.eINSTANCE.createHLocalAccessRelationMetric();
		metric.setTAnnotated(tClass);
		metric.setHLocalMethodAccesses(hMethod);
		metric.setHLocalFieldAccesses(hField);
		metric.setValue(calculateValue(hField, hMethod));
		hField.getPartOf().add(metric);
		hMethod.getPartOf().add(metric);
		getHAnnotation().add(metric);

		return metric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateValue(final HLocalFieldAccessesMetric fa, final HLocalMethodAccessesMetric ma) {
		// [user code injected with eMoflon]

		return fa.getValue() / (ma.getValue() + 1);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateValue(final TClass tClass) {
		HLocalFieldAccessesMetric hField = null;
		HLocalMethodAccessesMetric hMethod = null;
		for (final TAnnotation tmpHField : tClass.getTAnnotation()) {
			if (tmpHField instanceof HLocalFieldAccessesMetric) {
				hField = (HLocalFieldAccessesMetric) tmpHField;
			} else if (tmpHField instanceof HLocalMethodAccessesMetric) {
				hMethod = (HLocalMethodAccessesMetric) tmpHField;
			}
		}
		if ((hField == null) || (hMethod == null)) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		return calculateValue(hField, hMethod);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__HLOCALFIELDACCESSESMETRIC_HLOCALMETHODACCESSESMETRIC:
			return calculateValue((HLocalFieldAccessesMetric) arguments.get(0),
					(HLocalMethodAccessesMetric) arguments.get(1));
		case MetricsPackage.HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Relation beteen in Class Methodcalls and Fieldaccesses";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHLocalAccessRelationMetric();
	}

	// [user code injected with eMoflon] -->
} // HLocalAccessRelationCalculatorImpl
