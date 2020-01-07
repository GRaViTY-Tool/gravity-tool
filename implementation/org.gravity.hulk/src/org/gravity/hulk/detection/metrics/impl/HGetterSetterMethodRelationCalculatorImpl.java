/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HGetterMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HSetterMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HGetter
 * Setter Method Relation Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGetterSetterMethodRelationCalculatorImpl extends HClassBasedMetricCalculatorImpl
implements HGetterSetterMethodRelationCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HGetterSetterMethodRelationCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HGETTER_SETTER_METHOD_RELATION_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		HSetterMetric setter = null;
		HGetterMetric getter = null;
		HNumberOfMethodsMetric methods = null;

		for (final TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HSetterMetric) {
				setter = (HSetterMetric) annotation;
			} else if (annotation instanceof HGetterMetric) {
				getter = (HGetterMetric) annotation;
			} else if (annotation instanceof HNumberOfMethodsMetric) {
				methods = (HNumberOfMethodsMetric) annotation;
			}
		}
		if (methods == null || setter == null || getter == null) {
			throw new IllegalStateException();
		}

		final HNACCMetric metric = MetricsFactory.eINSTANCE.createHNACCMetric();
		metric.setTAnnotated(tClass);
		metric.setHSetterCustomMetric(setter);
		metric.setHGetterCustomMetric(getter);
		metric.setHNumberOfMethodsMetric(methods);
		metric.setValue(calculateValue(setter, getter, methods));

		getHAnnotation().add(metric);
		methods.getPartOf().add(metric);
		setter.getPartOf().add(metric);
		getter.getPartOf().add(metric);
		return metric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateValue(final HSetterMetric setter, final HGetterMetric getter, final HNumberOfMethodsMetric methods) {
		// [user code injected with eMoflon]

		final double methods_value = methods.getValue();
		if (methods_value == 0) {
			return 0;
		}
		return (setter.getValue() + getter.getValue()) / methods_value;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateValue(final TClass tClass) {
		HSetterMetric setter = null;
		HGetterMetric getter = null;
		HNumberOfMethodsMetric methods = null;

		for (final TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HSetterMetric) {
				setter = (HSetterMetric) annotation;
			} else if (annotation instanceof HGetterMetric) {
				getter = (HGetterMetric) annotation;
			} else if (annotation instanceof HNumberOfMethodsMetric) {
				methods = (HNumberOfMethodsMetric) annotation;
			}
		}
		return calculateValue(setter, getter, methods);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__HSETTERMETRIC_HGETTERMETRIC_HNUMBEROFMETHODSMETRIC:
			return calculateValue((HSetterMetric) arguments.get(0), (HGetterMetric) arguments.get(1),
					(HNumberOfMethodsMetric) arguments.get(2));
		case MetricsPackage.HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Relation between Methods and Getters/Setters";
	}

	// [user code injected with eMoflon] -->
} // HGetterSetterMethodRelationCalculatorImpl
