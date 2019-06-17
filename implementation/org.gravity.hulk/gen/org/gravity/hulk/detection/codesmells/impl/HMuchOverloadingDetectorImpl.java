/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HRelativeDetector;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMuch Overloading Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetectorImpl#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetectorImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HMuchOverloadingDetectorImpl extends HCodeSmellDetectorImpl implements HMuchOverloadingDetector {
	/**
	 * The default value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected boolean relative = RELATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMuchOverloadingDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HMUCH_OVERLOADING_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelative() {
		return relative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelative(boolean newRelative) {
		boolean oldRelative = relative;
		relative = newRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__RELATIVE, oldRelative, relative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(double newThreshold) {
		double oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {

		Object[] result1_black = HMuchOverloadingDetectorImpl
				.pattern_HMuchOverloadingDetector_0_1_ActivityNode62_blackBF(tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
		}
		HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) result1_black[1];
		// 
		Object[] result2_black = HMuchOverloadingDetectorImpl
				.pattern_HMuchOverloadingDetector_0_2_ActivityNode82_blackB(this);
		if (result2_black != null) {

			Object[] result3_black = HMuchOverloadingDetectorImpl
					.pattern_HMuchOverloadingDetector_0_3_ActivityNode63_blackB(this);
			if (result3_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
			}
			HMuchOverloadingDetectorImpl.pattern_HMuchOverloadingDetector_0_3_ActivityNode63_greenB(this);

		} else {
		}
		// 
		Object[] result4_black = HMuchOverloadingDetectorImpl
				.pattern_HMuchOverloadingDetector_0_4_ActivityNode81_blackBB(this, over);
		if (result4_black != null) {

			Object[] result5_black = HMuchOverloadingDetectorImpl
					.pattern_HMuchOverloadingDetector_0_5_ActivityNode64_blackBBB(this, tClass, over);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[tClass] = " + tClass + ", " + "[over] = " + over + ".");
			}
			Object[] result5_green = HMuchOverloadingDetectorImpl
					.pattern_HMuchOverloadingDetector_0_5_ActivityNode64_greenBBFB(this, tClass, over);
			HMuchOverloadingCodeSmell smell = (HMuchOverloadingCodeSmell) result5_green[2];

			return HMuchOverloadingDetectorImpl.pattern_HMuchOverloadingDetector_0_6_expressionFB(smell);
		} else {
			return HMuchOverloadingDetectorImpl.pattern_HMuchOverloadingDetector_0_7_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateRelativeThreshold(HRelativeValueConstants level) {
		// [user code injected with eMoflon]

		return calculateRelativeThreshold(level, HAverageOverloadingInClassMetric.class);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph pg) {// ForEach 
		for (Object[] result1_black : HClassBasedCalculatorImpl
				.pattern_HClassBasedCalculator_1_1_ActivityNode6_blackFBFB(pg, this)) {
			TClass tClass = (TClass) result1_black[0];
			//nothing TypeGraph o = (TypeGraph) result1_black[2];
			// 
			Object[] result2_bindingAndBlack = HClassBasedCalculatorImpl
					.pattern_HClassBasedCalculator_1_2_ActivityNode7_bindingAndBlackFBBB(tClass, this, pg);
			if (result2_bindingAndBlack != null) {
				HAnnotation metric = (HAnnotation) result2_bindingAndBlack[0];
				HClassBasedCalculatorImpl.pattern_HClassBasedCalculator_1_2_ActivityNode7_greenBBBB(metric, tClass,
						this, pg);

			} else {
			}

		}
		return HClassBasedCalculatorImpl.pattern_HClassBasedCalculator_1_3_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__RELATIVE:
			return isRelative();
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__THRESHOLD:
			return getThreshold();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__RELATIVE:
			setRelative((Boolean) newValue);
			return;
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__THRESHOLD:
			setThreshold((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__RELATIVE:
			setRelative(RELATIVE_EDEFAULT);
			return;
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__THRESHOLD:
			setThreshold(THRESHOLD_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__RELATIVE:
			return relative != RELATIVE_EDEFAULT;
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__THRESHOLD:
			return threshold != THRESHOLD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HClassBasedCalculator.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (derivedFeatureID) {
			case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__RELATIVE:
				return DetectionPackage.HRELATIVE_DETECTOR__RELATIVE;
			case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__THRESHOLD:
				return DetectionPackage.HRELATIVE_DETECTOR__THRESHOLD;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (baseFeatureID) {
			case DetectionPackage.HRELATIVE_DETECTOR__RELATIVE:
				return CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__RELATIVE;
			case DetectionPackage.HRELATIVE_DETECTOR__THRESHOLD:
				return CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR__THRESHOLD;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == HDetector.class) {
			switch (baseOperationID) {
			case HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (baseOperationID) {
			case DetectionPackage.HRELATIVE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
				return CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
			return calculateRelativeThreshold((HRelativeValueConstants) arguments.get(0));
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relative: ");
		result.append(relative);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(')');
		return result.toString();
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_1_ActivityNode62_blackBF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HAverageOverloadingInClassMetric) {
				HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) tmpOver;
				return new Object[] { tClass, over };
			}
		}
		return null;
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_2_ActivityNode82_blackB(
			HMuchOverloadingDetector _this) {
		boolean this_relative = _this.isRelative();
		if (Boolean.valueOf(this_relative).equals(Boolean.valueOf(true))) {
			return new Object[] { _this };
		}

		return null;
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_3_ActivityNode63_blackB(
			HMuchOverloadingDetector _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_3_ActivityNode63_greenB(
			HMuchOverloadingDetector _this) {
		double _localVariable_0 = _this.calculateRelativeThreshold(HRelativeValueConstants.VERY_HIGH);
		double this_threshold_prime = Double.valueOf(_localVariable_0);
		_this.setThreshold(Double.valueOf(this_threshold_prime));
		return new Object[] { _this };
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_4_ActivityNode81_blackBB(
			HMuchOverloadingDetector _this, HAverageOverloadingInClassMetric over) {
		double this_threshold = _this.getThreshold();
		double over_value = over.getValue();
		if (Double.valueOf(this_threshold).compareTo(Double.valueOf(over_value)) < 0) {
			return new Object[] { _this, over };
		}

		return null;
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_5_ActivityNode64_blackBBB(
			HMuchOverloadingDetector _this, TClass tClass, HAverageOverloadingInClassMetric over) {
		return new Object[] { _this, tClass, over };
	}

	public static final Object[] pattern_HMuchOverloadingDetector_0_5_ActivityNode64_greenBBFB(
			HMuchOverloadingDetector _this, TClass tClass, HAverageOverloadingInClassMetric over) {
		HMuchOverloadingCodeSmell smell = CodesmellsFactory.eINSTANCE.createHMuchOverloadingCodeSmell();
		_this.getHAnnotation().add(smell);
		smell.setTAnnotated(tClass);
		smell.setHAverageOverloadingInClassMetric(over);
		over.getPartOf().add(smell);
		return new Object[] { _this, tClass, smell, over };
	}

	public static final HAnnotation pattern_HMuchOverloadingDetector_0_6_expressionFB(HMuchOverloadingCodeSmell smell) {
		HAnnotation _result = smell;
		return _result;
	}

	public static final HAnnotation pattern_HMuchOverloadingDetector_0_7_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Much Overloading Code Smell";
	}

	// [user code injected with eMoflon] -->
} //HMuchOverloadingDetectorImpl
