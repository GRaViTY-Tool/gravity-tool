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
import org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HOutgoing Invocation Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HOutgoingInvocationCalculatorImpl extends HClassBasedMetricCalculatorImpl
implements HOutgoingInvocationCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HOutgoingInvocationCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HOUTGOING_INVOCATION_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHOutgoingInvocationMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(calculateValue(tClass));
		getHAnnotation().add(metric);
		return metric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double calculateValue(final TClass tClass) {
		// [user code injected with eMoflon]

		var invoc = 0;
		final var invocedMethods = new ArrayList<TMember>();
		for (final TMember m : tClass.getDefines()) {
			for (final TAccess t : m.getAccessing()) {
				final var tTarget = t.getTarget();
				if (tTarget instanceof TMethodDefinitionImpl) {
					final var targetMethod = (TMethodDefinitionImpl) tTarget;
					final var definingClass = targetMethod.getDefinedBy();

					if (definingClass == null) {
						System.out.println(
								"Method in Class " + tClass.getTName() + " accesses a Method without defining Class");
						continue;
					}

					if (!definingClass.equals(tClass) && !definingClass.isTLib()
							&& !invocedMethods.contains(targetMethod)) {

						invocedMethods.add(targetMethod);
						invoc++;

					}
				}
			}
		}

		return invoc;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HOUTGOING_INVOCATION_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HOUTGOING_INVOCATION_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of outgoing invocations";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHOutgoingInvocationMetric();
	}

	// [user code injected with eMoflon] -->
} // HOutgoingInvocationCalculatorImpl
