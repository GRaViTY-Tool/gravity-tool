/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLocal
 * Method Access Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalMethodAccessCalculatorImpl extends HClassBasedMetricCalculatorImpl
implements HLocalMethodAccessCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HLocalMethodAccessCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HLOCAL_METHOD_ACCESS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		final HLocalMethodAccessesMetric metric = MetricsFactory.eINSTANCE.createHLocalMethodAccessesMetric();
		metric.setTAnnotated(tClass);
		getHAnnotation().add(metric);

		long value = 0;
		final EList<TMethodDefinition> methods = tClass.getDeclaredTMethodDefinitions();
		for (int i = 0; i < methods.size(); i++) {
			final TMethodDefinition m0 = methods.get(i);
			for (int j = i + 1; j < methods.size(); j++) {
				final TMethodDefinition m1 = methods.get(j);
				value += m0.getAccessing().parallelStream().filter(access -> access.getTarget().equals(m1)).count();
				value += m0.getAccessedBy().parallelStream().filter(access -> access.getSource().equals(m1)).count();
			}
		}
		metric.setValue(value);
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

		int i = 0;
		for (final TMember m : tClass.getDefines()) {
			for (final TAccess t : m.getAccessing()) {
				final TMember tTarget = t.getTarget();
				if (tTarget instanceof TMethodDefinition && tTarget.getDefinedBy().equals(tClass)) {
					i++;
				}
			}
		}
		return i;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of in Class Methodcalls";
	}

	// [user code injected with eMoflon] -->
} // HLocalMethodAccessCalculatorImpl
