/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;
import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLarge
 * Class Low Cohesion Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLargeClassLowCohesionDetectorImpl extends HClassBasedCalculatorImpl
implements HLargeClassLowCohesionDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HLargeClassLowCohesionDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLARGE_CLASS_LOW_COHESION_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		boolean hasLowCohesion = false;
		HLowCohesionSmell low = null;

		boolean isLargeClass = false;
		HLargeClassSmell large = null;
		for (final TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HLowCohesionSmell) {
				hasLowCohesion = true;
				low = (HLowCohesionSmell) annotation;
			} else if (annotation instanceof HLargeClassSmell) {
				isLargeClass = true;
				large = (HLargeClassSmell) annotation;
			}
		}

		if (!hasLowCohesion && !isLargeClass) {
			return null;
		}

		final HLargeClassLowCohesionSmell smell = createLargeClassLowCohesionCodeSmell(tClass);

		if (isLargeClass) {
			smell.setHLargeClassSmell(large);
			large.getPartOf().add(smell);
		}
		if (hasLowCohesion) {
			smell.setHLowCohesionSmell(low);
			low.getPartOf().add(smell);

		}
		return smell;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public final HLargeClassLowCohesionSmell createLargeClassLowCohesionCodeSmell(final TClass tClass) {
		final HLargeClassLowCohesionSmell smell = CodesmellsFactory.eINSTANCE.createHLargeClassLowCohesionSmell();
		smell.setTAnnotated(tClass);
		getHAnnotation().add(smell);
		return smell;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Large Class or Low Cohesion Smell";
	}

	// [user code injected with eMoflon] -->
} // HLargeClassLowCohesionDetectorImpl
