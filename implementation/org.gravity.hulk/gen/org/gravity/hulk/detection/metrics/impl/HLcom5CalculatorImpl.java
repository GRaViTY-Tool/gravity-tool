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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLcom5 Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLcom5CalculatorImpl extends HClassBasedMetricCalculatorImpl implements HLcom5Calculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLcom5CalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLCOM5_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HLcom5CalculatorImpl.pattern_HLcom5Calculator_0_1_ActivityNode19_blackFBFFB(this,
				tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		HLocalFieldUniqueAccessMetric lfau = (HLocalFieldUniqueAccessMetric) result1_black[0];
		HNumberOfFieldsMetric nof = (HNumberOfFieldsMetric) result1_black[2];
		HNumberOfMethodsMetric nom = (HNumberOfMethodsMetric) result1_black[3];
		Object[] result1_green = HLcom5CalculatorImpl.pattern_HLcom5Calculator_0_1_ActivityNode19_greenBBBBFB(lfau,
				this, nof, nom, tClass);
		HLCOM5Metric metric = (HLCOM5Metric) result1_green[4];

		return HLcom5CalculatorImpl.pattern_HLcom5Calculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {

		Object[] result1_black = HLcom5CalculatorImpl.pattern_HLcom5Calculator_1_1_ActivityNode20_blackBBFFF(this,
				tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		HNumberOfFieldsMetric nof = (HNumberOfFieldsMetric) result1_black[2];
		HNumberOfMethodsMetric nom = (HNumberOfMethodsMetric) result1_black[3];
		HLocalFieldUniqueAccessMetric lfa = (HLocalFieldUniqueAccessMetric) result1_black[4];
		return HLcom5CalculatorImpl.pattern_HLcom5Calculator_1_2_expressionFBBBB(this, nof, nom, lfa);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double CalculateLcom5Value(HNumberOfFieldsMetric nof, HNumberOfMethodsMetric nom,
			HLocalFieldUniqueAccessMetric lfa) {
		// [user code injected with eMoflon]

		double nomTimesNof = nom.getValue() * nof.getValue();
		double dividend = lfa.getValue() - (nomTimesNof);
		double divisor = nof.getValue() - (nomTimesNof);

		if (divisor == 0) {
			return 0;
		} else {
			return dividend / divisor;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HLCOM5_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HLCOM5_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		case MetricsPackage.HLCOM5_CALCULATOR___CALCULATE_LCOM5_VALUE__HNUMBEROFFIELDSMETRIC_HNUMBEROFMETHODSMETRIC_HLOCALFIELDUNIQUEACCESSMETRIC:
			return CalculateLcom5Value((HNumberOfFieldsMetric) arguments.get(0),
					(HNumberOfMethodsMetric) arguments.get(1), (HLocalFieldUniqueAccessMetric) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLcom5Calculator_0_1_ActivityNode19_blackFBFFB(HLcom5Calculator _this,
			TClass tClass) {
		for (TAnnotation tmpLfau : tClass.getTAnnotation()) {
			if (tmpLfau instanceof HLocalFieldUniqueAccessMetric) {
				HLocalFieldUniqueAccessMetric lfau = (HLocalFieldUniqueAccessMetric) tmpLfau;
				for (TAnnotation tmpNof : tClass.getTAnnotation()) {
					if (tmpNof instanceof HNumberOfFieldsMetric) {
						HNumberOfFieldsMetric nof = (HNumberOfFieldsMetric) tmpNof;
						for (TAnnotation tmpNom : tClass.getTAnnotation()) {
							if (tmpNom instanceof HNumberOfMethodsMetric) {
								HNumberOfMethodsMetric nom = (HNumberOfMethodsMetric) tmpNom;
								return new Object[] { lfau, _this, nof, nom, tClass };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HLcom5Calculator_0_1_ActivityNode19_greenBBBBFB(
			HLocalFieldUniqueAccessMetric lfau, HLcom5Calculator _this, HNumberOfFieldsMetric nof,
			HNumberOfMethodsMetric nom, TClass tClass) {
		HLCOM5Metric metric = MetricsFactory.eINSTANCE.createHLCOM5Metric();
		double _localVariable_0 = _this.CalculateLcom5Value(nof, nom, lfau);
		lfau.getPartOf().add(metric);
		_this.getHAnnotation().add(metric);
		nof.getPartOf().add(metric);
		nom.getPartOf().add(metric);
		metric.setHLocalFieldUniqueAccessMetric(lfau);
		metric.setHNumberOfFieldsMetric(nof);
		metric.setHNumberOfMethodsMetric(nom);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { lfau, _this, nof, nom, metric, tClass };
	}

	public static final HMetric pattern_HLcom5Calculator_0_2_expressionFB(HLCOM5Metric metric) {
		HMetric _result = metric;
		return _result;
	}

	public static final Object[] pattern_HLcom5Calculator_1_1_ActivityNode20_blackBBFFF(HLcom5Calculator _this,
			TClass tClass) {
		for (TAnnotation tmpNof : tClass.getTAnnotation()) {
			if (tmpNof instanceof HNumberOfFieldsMetric) {
				HNumberOfFieldsMetric nof = (HNumberOfFieldsMetric) tmpNof;
				for (TAnnotation tmpNom : tClass.getTAnnotation()) {
					if (tmpNom instanceof HNumberOfMethodsMetric) {
						HNumberOfMethodsMetric nom = (HNumberOfMethodsMetric) tmpNom;
						for (TAnnotation tmpLfa : tClass.getTAnnotation()) {
							if (tmpLfa instanceof HLocalFieldUniqueAccessMetric) {
								HLocalFieldUniqueAccessMetric lfa = (HLocalFieldUniqueAccessMetric) tmpLfa;
								return new Object[] { _this, tClass, nof, nom, lfa };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final double pattern_HLcom5Calculator_1_2_expressionFBBBB(HLcom5Calculator _this,
			HNumberOfFieldsMetric nof, HNumberOfMethodsMetric nom, HLocalFieldUniqueAccessMetric lfa) {
		double _localVariable_0 = _this.CalculateLcom5Value(nof, nom, lfa);
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {

		return "Calculate LCOM5 on PG";
	}

	// [user code injected with eMoflon] -->
} //HLcom5CalculatorImpl
