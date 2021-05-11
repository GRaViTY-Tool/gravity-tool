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
import org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIncomming Invocation Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIncommingInvocationCalculatorImpl extends HClassBasedMetricCalculatorImpl
implements HIncommingInvocationCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HIncommingInvocationCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HINCOMMING_INVOCATION_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHIncommingInvocationMetric();
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

		var invoc = 0;
		final var invocingMethods = new ArrayList<TMember>();
		for (final TMember m : tClass.getDefines()) {
			if (m instanceof TMethodDefinitionImpl) {
				for (final TAccess t : m.getAccessedBy()) {
					final var tSource = t.getSource();
					if (tSource == null) {
						//System.out.println(
						//"Method within Class " + tClass.getTName() + " was accessed without an Access Source");
						continue;
					}
					final var definingClass = tSource.getDefinedBy();
					if (definingClass == null) {
						//System.out.println("Method within Class " + tClass.getTName()
						//+ " was accessed by a Source without defining Class");
						continue;
					}
					if (!definingClass.equals(tClass) && !invocingMethods.contains(tSource)) {

						invocingMethods.add(tSource);
						invoc++;

					}
				}
			}
		}
		return invoc;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HINCOMMING_INVOCATION_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HINCOMMING_INVOCATION_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Incomming Invocation custom";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHIncommingInvocationMetric();
	}

	// [user code injected with eMoflon] -->
} //HIncommingInvocationCalculatorImpl
