/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HLcom5Calculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLcom5
 * Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLcom5CalculatorImpl extends HClassBasedMetricCalculatorImpl implements HLcom5Calculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HLcom5CalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLCOM5_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		removeAnnotations(tClass);

		final var result1_black = HLcom5CalculatorImpl.pattern_HLcom5Calculator_0_1_ActivityNode19_blackFBFFB(this,
				tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		final var lfau = (HLocalFieldUniqueAccessMetric) result1_black[0];
		final var nof = (HNumberOfFieldsMetric) result1_black[2];
		final var nom = (HNumberOfMethodsMetric) result1_black[3];
		return createMetric(lfau, nof, nom, tClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateValue(final TClass tClass) {

		final var result1_black = HLcom5CalculatorImpl.pattern_HLcom5Calculator_1_1_ActivityNode20_blackBBFFF(this,
				tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		final var nof = (HNumberOfFieldsMetric) result1_black[2];
		final var nom = (HNumberOfMethodsMetric) result1_black[3];
		final var lfa = (HLocalFieldUniqueAccessMetric) result1_black[4];
		return calculateLcom5Value(nof, nom, lfa);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateLcom5Value(final HNumberOfFieldsMetric nof, final HNumberOfMethodsMetric nom,
			final HLocalFieldUniqueAccessMetric lfa) {
		// [user code injected with eMoflon]

		final var nomTimesNof = nom.getValue() * nof.getValue();
		final var dividend = lfa.getValue() - (nomTimesNof);
		final var divisor = nof.getValue() - (nomTimesNof);

		if (divisor == 0) {
			return 0;
		} else {
			return dividend / divisor;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HLCOM5_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HLCOM5_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		case MetricsPackage.HLCOM5_CALCULATOR___CALCULATE_LCOM5_VALUE__HNUMBEROFFIELDSMETRIC_HNUMBEROFMETHODSMETRIC_HLOCALFIELDUNIQUEACCESSMETRIC:
			return calculateLcom5Value((HNumberOfFieldsMetric) arguments.get(0),
					(HNumberOfMethodsMetric) arguments.get(1), (HLocalFieldUniqueAccessMetric) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLcom5Calculator_0_1_ActivityNode19_blackFBFFB(final HLcom5Calculator _this,
			final TClass tClass) {
		for (final TAnnotation tmpLfau : tClass.getTAnnotation()) {
			if (tmpLfau instanceof HLocalFieldUniqueAccessMetric) {
				final var lfau = (HLocalFieldUniqueAccessMetric) tmpLfau;
				for (final TAnnotation tmpNof : tClass.getTAnnotation()) {
					if (tmpNof instanceof HNumberOfFieldsMetric) {
						final var nof = (HNumberOfFieldsMetric) tmpNof;
						for (final TAnnotation tmpNom : tClass.getTAnnotation()) {
							if (tmpNom instanceof HNumberOfMethodsMetric) {
								final var nom = (HNumberOfMethodsMetric) tmpNom;
								return new Object[] { lfau, _this, nof, nom, tClass };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public final HLCOM5Metric createMetric(final HLocalFieldUniqueAccessMetric lfau, final HNumberOfFieldsMetric nof,
			final HNumberOfMethodsMetric nom, final TClass tClass) {
		final var metric = MetricsFactory.eINSTANCE.createHLCOM5Metric();
		metric.setTAnnotated(tClass);
		metric.setValue(calculateLcom5Value(nof, nom, lfau));
		metric.setHLocalFieldUniqueAccessMetric(lfau);
		metric.setHNumberOfFieldsMetric(nof);
		metric.setHNumberOfMethodsMetric(nom);
		lfau.getPartOf().add(metric);
		nof.getPartOf().add(metric);
		nom.getPartOf().add(metric);
		getHAnnotation().add(metric);
		return metric;
	}

	public static final Object[] pattern_HLcom5Calculator_1_1_ActivityNode20_blackBBFFF(final HLcom5Calculator _this,
			final TClass tClass) {
		for (final TAnnotation tmpNof : tClass.getTAnnotation()) {
			if (tmpNof instanceof HNumberOfFieldsMetric) {
				final var nof = (HNumberOfFieldsMetric) tmpNof;
				for (final TAnnotation tmpNom : tClass.getTAnnotation()) {
					if (tmpNom instanceof HNumberOfMethodsMetric) {
						final var nom = (HNumberOfMethodsMetric) tmpNom;
						for (final TAnnotation tmpLfa : tClass.getTAnnotation()) {
							if (tmpLfa instanceof HLocalFieldUniqueAccessMetric) {
								final var lfa = (HLocalFieldUniqueAccessMetric) tmpLfa;
								return new Object[] { _this, tClass, nof, nom, lfa };
							}
						}
					}
				}
			}
		}
		return null;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {

		return "Calculate LCOM5 on PG";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHLCOM5Metric();
	}

	// [user code injected with eMoflon] -->
} // HLcom5CalculatorImpl
