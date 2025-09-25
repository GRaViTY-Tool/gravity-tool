/**
 */
package org.gravity.hulk.detection.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.impl.HDetectorImpl;
import org.gravity.typegraph.basic.TClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HClass
 * Based Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HClassBasedCalculatorImpl extends HDetectorImpl implements HClassBasedCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HClassBasedCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DetectionPackage.Literals.HCLASS_BASED_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {// ForEach
		for (final TClass tClass : getClassesToVisit(apg, this)) {
			final var metric = calculate(tClass);
			if (metric != null) {
				metric.setTAnnotated(tClass);
				apg.getHAnnotations().add(metric);
				getHAnnotation().add(metric);
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Iterable<TClass> getClassesToVisit(final HAntiPatternGraph apg, final HDetector detector) {
		final List<TClass> result = new LinkedList<>();
		final var pm = apg.getModel();
		if (pm != null) {
			for (final TClass tClass : pm.getClasses()) {
				if (!tClass.isTLib() && !"Anonymous".equals(tClass.getTName()) && !"T".equals(tClass.getTName())
						&& !detector.hasAlreadyBeenAnnotated(tClass)) {
					result.add(tClass);

				}
			}
		}
		return result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HClassBasedCalculatorImpl
