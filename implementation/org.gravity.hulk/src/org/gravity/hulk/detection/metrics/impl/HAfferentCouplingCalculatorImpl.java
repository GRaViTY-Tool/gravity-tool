/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;
// <-- [user defined imports]
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAfferent Coupling Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAfferentCouplingCalculatorImpl extends HClassBasedMetricCalculatorImpl
implements HAfferentCouplingCalculator {
	private static final Logger LOGGER = Logger.getLogger(HAfferentCouplingCalculatorImpl.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAfferentCouplingCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HAFFERENT_COUPLING_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		final var metric = MetricsFactory.eINSTANCE.createHAfferentCouplingMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(calculateValue(tClass));
		getHAnnotation().add(metric);
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double calculateValue(final TClass tClass) {
		// [user code injected with eMoflon]
		removeAnnotations(tClass);

		final var accessingClasses = new ArrayList<TAbstractType>();
		for (final TMember m : tClass.getDefines()) {
			for (final TAccess t : m.getAccessedBy()) {
				final var tSource = t.getSource();
				if (tSource == null) {
					LOGGER.warn(
							"Member within Class " + tClass.getTName() + " was accessed without an TAccess Source");
					continue;
				}
				final var definingClass = tSource.getDefinedBy();
				if (definingClass == null) {
					LOGGER.warn("Member within Class " + tClass.getTName()
					+ " was accessed by a Source without defining Class");
					continue;
				}
				if (!tSource.getDefinedBy().equals(tClass) && !accessingClasses.contains(tSource.getDefinedBy())) {
					accessingClasses.add(definingClass);
				}
			}

		}
		return accessingClasses.size();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HAFFERENT_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HAFFERENT_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Afferent Coupling";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHAfferentCouplingMetric();

	}

	// [user code injected with eMoflon] -->
} //HAfferentCouplingCalculatorImpl
