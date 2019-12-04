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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLarge Class Low Cohesion Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLargeClassLowCohesionDetectorImpl extends HClassBasedCalculatorImpl
		implements HLargeClassLowCohesionDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLargeClassLowCohesionDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLARGE_CLASS_LOW_COHESION_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {// 
		Object[] result1_black = HLargeClassLowCohesionDetectorImpl
				.pattern_HLargeClassLowCohesionDetector_0_1_ActivityNode33_blackFB(tClass);
		if (result1_black != null) {
			//nothing HLargeClassSmell large = (HLargeClassSmell) result1_black[0];
		} else {
			// 
			Object[] result2_black = HLargeClassLowCohesionDetectorImpl
					.pattern_HLargeClassLowCohesionDetector_0_2_ActivityNode34_blackFB(tClass);
			if (result2_black != null) {
				//nothing HLowCohesionSmell low = (HLowCohesionSmell) result2_black[0];
			} else {
				return HLargeClassLowCohesionDetectorImpl.pattern_HLargeClassLowCohesionDetector_0_3_expressionF();
			}

		}

		Object[] result4_black = HLargeClassLowCohesionDetectorImpl
				.pattern_HLargeClassLowCohesionDetector_0_4_ActivityNode35_blackBB(tClass, this);
		if (result4_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}
		Object[] result4_green = HLargeClassLowCohesionDetectorImpl
				.pattern_HLargeClassLowCohesionDetector_0_4_ActivityNode35_greenFBB(tClass, this);
		HLargeClassLowCohesionSmell smell = (HLargeClassLowCohesionSmell) result4_green[0];

		// 
		Object[] result5_black = HLargeClassLowCohesionDetectorImpl
				.pattern_HLargeClassLowCohesionDetector_0_5_ActivityNode53_blackBFB(smell, tClass);
		if (result5_black != null) {
			HLargeClassSmell large = (HLargeClassSmell) result5_black[1];
			HLargeClassLowCohesionDetectorImpl.pattern_HLargeClassLowCohesionDetector_0_5_ActivityNode53_greenBB(smell,
					large);

		} else {
		}
		// 
		Object[] result6_black = HLargeClassLowCohesionDetectorImpl
				.pattern_HLargeClassLowCohesionDetector_0_6_ActivityNode54_blackBFB(smell, tClass);
		if (result6_black != null) {
			HLowCohesionSmell low = (HLowCohesionSmell) result6_black[1];
			HLargeClassLowCohesionDetectorImpl.pattern_HLargeClassLowCohesionDetector_0_6_ActivityNode54_greenBB(smell,
					low);

		} else {
		}
		return HLargeClassLowCohesionDetectorImpl.pattern_HLargeClassLowCohesionDetector_0_7_expressionFB(smell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HLargeClassLowCohesionDetector_0_1_ActivityNode33_blackFB(TClass tClass) {
		for (TAnnotation tmpLarge : tClass.getTAnnotation()) {
			if (tmpLarge instanceof HLargeClassSmell) {
				HLargeClassSmell large = (HLargeClassSmell) tmpLarge;
				return new Object[] { large, tClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_HLargeClassLowCohesionDetector_0_2_ActivityNode34_blackFB(TClass tClass) {
		for (TAnnotation tmpLow : tClass.getTAnnotation()) {
			if (tmpLow instanceof HLowCohesionSmell) {
				HLowCohesionSmell low = (HLowCohesionSmell) tmpLow;
				return new Object[] { low, tClass };
			}
		}
		return null;
	}

	public static final HAnnotation pattern_HLargeClassLowCohesionDetector_0_3_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HLargeClassLowCohesionDetector_0_4_ActivityNode35_blackBB(TClass tClass,
			HLargeClassLowCohesionDetector _this) {
		return new Object[] { tClass, _this };
	}

	public static final Object[] pattern_HLargeClassLowCohesionDetector_0_4_ActivityNode35_greenFBB(TClass tClass,
			HLargeClassLowCohesionDetector _this) {
		HLargeClassLowCohesionSmell smell = CodesmellsFactory.eINSTANCE.createHLargeClassLowCohesionSmell();
		smell.setTAnnotated(tClass);
		_this.getHAnnotation().add(smell);
		return new Object[] { smell, tClass, _this };
	}

	public static final Object[] pattern_HLargeClassLowCohesionDetector_0_5_ActivityNode53_blackBFB(
			HLargeClassLowCohesionSmell smell, TClass tClass) {
		for (TAnnotation tmpLarge : tClass.getTAnnotation()) {
			if (tmpLarge instanceof HLargeClassSmell) {
				HLargeClassSmell large = (HLargeClassSmell) tmpLarge;
				return new Object[] { smell, large, tClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_HLargeClassLowCohesionDetector_0_5_ActivityNode53_greenBB(
			HLargeClassLowCohesionSmell smell, HLargeClassSmell large) {
		smell.setHLargeClassSmell(large);
		large.getPartOf().add(smell);
		return new Object[] { smell, large };
	}

	public static final Object[] pattern_HLargeClassLowCohesionDetector_0_6_ActivityNode54_blackBFB(
			HLargeClassLowCohesionSmell smell, TClass tClass) {
		for (TAnnotation tmpLow : tClass.getTAnnotation()) {
			if (tmpLow instanceof HLowCohesionSmell) {
				HLowCohesionSmell low = (HLowCohesionSmell) tmpLow;
				return new Object[] { smell, low, tClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_HLargeClassLowCohesionDetector_0_6_ActivityNode54_greenBB(
			HLargeClassLowCohesionSmell smell, HLowCohesionSmell low) {
		smell.setHLowCohesionSmell(low);
		low.getPartOf().add(smell);
		return new Object[] { smell, low };
	}

	public static final HAnnotation pattern_HLargeClassLowCohesionDetector_0_7_expressionFB(
			HLargeClassLowCohesionSmell smell) {
		HAnnotation _result = smell;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Large Class or Low Cohesion Smell";
	}

	// [user code injected with eMoflon] -->
} //HLargeClassLowCohesionDetectorImpl
