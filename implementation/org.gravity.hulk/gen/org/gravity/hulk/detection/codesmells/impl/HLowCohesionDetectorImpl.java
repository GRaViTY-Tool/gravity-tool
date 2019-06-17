/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;

import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.HRelativeDetector;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HLowCohesionDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;

import org.gravity.typegraph.basic.TClass;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLow Cohesion Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetectorImpl#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetectorImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLowCohesionDetectorImpl extends HClassBasedCalculatorImpl implements HLowCohesionDetector {
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
	protected HLowCohesionDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLOW_COHESION_DETECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE,
					oldRelative, relative));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD,
					oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {// 
		Object[] result1_black = HLowCohesionDetectorImpl
				.pattern_HLowCohesionDetector_0_1_ActivityNode30_blackFB(tClass);
		if (result1_black != null) {
			HLCOM5Metric lcom = (HLCOM5Metric) result1_black[0];
			// 
			Object[] result2_black = HLowCohesionDetectorImpl
					.pattern_HLowCohesionDetector_0_2_ActivityNode85_blackB(this);
			if (result2_black != null) {
				HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_2_ActivityNode85_greenB(this);

				Object[] result3_black = HLowCohesionDetectorImpl
						.pattern_HLowCohesionDetector_0_3_ActivityNode80_blackB(this);
				if (result3_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
				}
				HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_3_ActivityNode80_greenB(this);

			} else {
			}
			// 
			Object[] result4_black = HLowCohesionDetectorImpl
					.pattern_HLowCohesionDetector_0_4_ActivityNode86_blackBB(this, lcom);
			if (result4_black != null) {
				// 
				Object[] result5_black = HLowCohesionDetectorImpl
						.pattern_HLowCohesionDetector_0_5_ActivityNode32_blackBBB(lcom, tClass, this);
				if (result5_black != null) {
					Object[] result5_green = HLowCohesionDetectorImpl
							.pattern_HLowCohesionDetector_0_5_ActivityNode32_greenBFBB(lcom, tClass, this);
					HLowCohesionSmell smell = (HLowCohesionSmell) result5_green[1];

					return HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_6_expressionFB(smell);
				} else {
					return HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_7_expressionF();
				}

			} else {
				return HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_8_expressionF();
			}

		} else {
			return HLowCohesionDetectorImpl.pattern_HLowCohesionDetector_0_9_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateRelativeThreshold(HRelativeValueConstants level) {
		// [user code injected with eMoflon]

		return calculateRelativeThreshold(level, HLCOM5Metric.class);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
			return isRelative();
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
			setRelative((Boolean) newValue);
			return;
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
			setRelative(RELATIVE_EDEFAULT);
			return;
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
			return relative != RELATIVE_EDEFAULT;
		case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
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
		if (baseClass == HCodeSmellDetector.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (derivedFeatureID) {
			case CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE:
				return DetectionPackage.HRELATIVE_DETECTOR__RELATIVE;
			case CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD:
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
		if (baseClass == HCodeSmellDetector.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (baseFeatureID) {
			case DetectionPackage.HRELATIVE_DETECTOR__RELATIVE:
				return CodesmellsPackage.HLOW_COHESION_DETECTOR__RELATIVE;
			case DetectionPackage.HRELATIVE_DETECTOR__THRESHOLD:
				return CodesmellsPackage.HLOW_COHESION_DETECTOR__THRESHOLD;
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
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HLOW_COHESION_DETECTOR___CALCULATE__TCLASS;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HCodeSmellDetector.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (baseOperationID) {
			case DetectionPackage.HRELATIVE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
				return CodesmellsPackage.HLOW_COHESION_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS;
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
		case CodesmellsPackage.HLOW_COHESION_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HLOW_COHESION_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
			return calculateRelativeThreshold((HRelativeValueConstants) arguments.get(0));
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

	public static final Object[] pattern_HLowCohesionDetector_0_1_ActivityNode30_blackFB(TClass tClass) {
		boolean tClass_tLib = tClass.isTLib();
		if (Boolean.valueOf(tClass_tLib).equals(Boolean.valueOf(false))) {
			for (TAnnotation tmpLcom : tClass.getTAnnotation()) {
				if (tmpLcom instanceof HLCOM5Metric) {
					HLCOM5Metric lcom = (HLCOM5Metric) tmpLcom;
					return new Object[] { lcom, tClass };
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_HLowCohesionDetector_0_2_ActivityNode85_blackB(HLowCohesionDetector _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HLowCohesionDetector_0_2_ActivityNode85_greenB(HLowCohesionDetector _this) {
		boolean this_relative_prime = Boolean.valueOf(true);
		_this.setRelative(Boolean.valueOf(this_relative_prime));
		return new Object[] { _this };
	}

	public static final Object[] pattern_HLowCohesionDetector_0_3_ActivityNode80_blackB(HLowCohesionDetector _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HLowCohesionDetector_0_3_ActivityNode80_greenB(HLowCohesionDetector _this) {
		double _localVariable_0 = _this.calculateRelativeThreshold(HRelativeValueConstants.HIGH);
		double this_threshold_prime = Double.valueOf(_localVariable_0);
		_this.setThreshold(Double.valueOf(this_threshold_prime));
		return new Object[] { _this };
	}

	public static final Object[] pattern_HLowCohesionDetector_0_4_ActivityNode86_blackBB(HLowCohesionDetector _this,
			HLCOM5Metric lcom) {
		double this_threshold = _this.getThreshold();
		double lcom_value = lcom.getValue();
		if (Double.valueOf(this_threshold).compareTo(Double.valueOf(lcom_value)) < 0) {
			return new Object[] { _this, lcom };
		}

		return null;
	}

	public static final Object[] pattern_HLowCohesionDetector_0_5_ActivityNode32_blackBBB(HLCOM5Metric lcom,
			TClass tClass, HLowCohesionDetector _this) {
		return new Object[] { lcom, tClass, _this };
	}

	public static final Object[] pattern_HLowCohesionDetector_0_5_ActivityNode32_greenBFBB(HLCOM5Metric lcom,
			TClass tClass, HLowCohesionDetector _this) {
		HLowCohesionSmell smell = CodesmellsFactory.eINSTANCE.createHLowCohesionSmell();
		lcom.getPartOf().add(smell);
		smell.setTAnnotated(tClass);
		smell.setHLCOM5CustomMetric(lcom);
		_this.getHAnnotation().add(smell);
		return new Object[] { lcom, smell, tClass, _this };
	}

	public static final HAnnotation pattern_HLowCohesionDetector_0_6_expressionFB(HLowCohesionSmell smell) {
		HAnnotation _result = smell;
		return _result;
	}

	public static final HAnnotation pattern_HLowCohesionDetector_0_7_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HLowCohesionDetector_0_8_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HLowCohesionDetector_0_9_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Low Cohesion Smell";
	}

	// [user code injected with eMoflon] -->
} //HLowCohesionDetectorImpl
