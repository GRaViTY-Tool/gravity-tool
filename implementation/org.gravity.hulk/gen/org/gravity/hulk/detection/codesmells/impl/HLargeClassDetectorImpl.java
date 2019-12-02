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
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.HRelativeDetector;
import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HLargeClassDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLarge Class Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HLargeClassDetectorImpl#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HLargeClassDetectorImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLargeClassDetectorImpl extends HClassBasedCalculatorImpl implements HLargeClassDetector {
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
	protected HLargeClassDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HLARGE_CLASS_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRelative() {
		return this.relative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelative(boolean newRelative) {
		final boolean oldRelative = this.relative;
		this.relative = newRelative;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HLARGE_CLASS_DETECTOR__RELATIVE,
					oldRelative, this.relative));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getThreshold() {
		return this.threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreshold(double newThreshold) {
		final double oldThreshold = this.threshold;
		this.threshold = newThreshold;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HLARGE_CLASS_DETECTOR__THRESHOLD,
					oldThreshold, this.threshold));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAnnotation calculate(TClass tClass) {//
		final Object[] result1_black = HLargeClassDetectorImpl.pattern_HLargeClassDetector_0_1_ActivityNode28_blackFB(tClass);
		if (result1_black != null) {
			final HNumberOfMembersMetric nm = (HNumberOfMembersMetric) result1_black[0];
			//
			final Object[] result2_black = HLargeClassDetectorImpl
					.pattern_HLargeClassDetector_0_2_ActivityNode87_blackB(this);
			if (result2_black != null) {

				final Object[] result3_black = HLargeClassDetectorImpl
						.pattern_HLargeClassDetector_0_3_ActivityNode71_blackB(this);
				if (result3_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
				}
				HLargeClassDetectorImpl.pattern_HLargeClassDetector_0_3_ActivityNode71_greenB(this);

			} else {
			}
			//
			final Object[] result4_black = HLargeClassDetectorImpl
					.pattern_HLargeClassDetector_0_4_ActivityNode88_blackBB(this, nm);
			if (result4_black != null) {

				final Object[] result5_black = HLargeClassDetectorImpl
						.pattern_HLargeClassDetector_0_5_ActivityNode27_blackBBB(nm, tClass, this);
				if (result5_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[nm] = " + nm + ", "
							+ "[tClass] = " + tClass + ", " + "[this] = " + this + ".");
				}
				final Object[] result5_green = HLargeClassDetectorImpl
						.pattern_HLargeClassDetector_0_5_ActivityNode27_greenFBBB(nm, tClass, this);
				final HLargeClassSmell largeClassSmell = (HLargeClassSmell) result5_green[0];

				return HLargeClassDetectorImpl.pattern_HLargeClassDetector_0_6_expressionFB(largeClassSmell);
			} else {
				return HLargeClassDetectorImpl.pattern_HLargeClassDetector_0_7_expressionF();
			}

		} else {
			return HLargeClassDetectorImpl.pattern_HLargeClassDetector_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double calculateRelativeThreshold(HRelativeValueConstants level) {
		// [user code injected with eMoflon]

		return calculateRelativeThreshold(HRelativeValueConstants.HIGH, HNumberOfMembersMetric.class);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR__RELATIVE:
			return isRelative();
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR__RELATIVE:
			setRelative((Boolean) newValue);
			return;
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR__RELATIVE:
			setRelative(RELATIVE_EDEFAULT);
			return;
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR__RELATIVE:
			return this.relative != RELATIVE_EDEFAULT;
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR__THRESHOLD:
			return this.threshold != THRESHOLD_EDEFAULT;
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
			case CodesmellsPackage.HLARGE_CLASS_DETECTOR__RELATIVE:
				return DetectionPackage.HRELATIVE_DETECTOR__RELATIVE;
			case CodesmellsPackage.HLARGE_CLASS_DETECTOR__THRESHOLD:
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
				return CodesmellsPackage.HLARGE_CLASS_DETECTOR__RELATIVE;
			case DetectionPackage.HRELATIVE_DETECTOR__THRESHOLD:
				return CodesmellsPackage.HLARGE_CLASS_DETECTOR__THRESHOLD;
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
				return CodesmellsPackage.HLARGE_CLASS_DETECTOR___CALCULATE__TCLASS;
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
				return CodesmellsPackage.HLARGE_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS;
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
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
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
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relative: ");
		result.append(this.relative);
		result.append(", threshold: ");
		result.append(this.threshold);
		result.append(')');
		return result.toString();
	}

	public static final Object[] pattern_HLargeClassDetector_0_1_ActivityNode28_blackFB(TClass tClass) {
		if (!tClass.isTLib()) {
			for (final TAnnotation tmpNm : tClass.getTAnnotation()) {
				if (tmpNm instanceof HNumberOfMembersMetric) {
					final HNumberOfMembersMetric nm = (HNumberOfMembersMetric) tmpNm;
					return new Object[] { nm, tClass };
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_HLargeClassDetector_0_2_ActivityNode87_blackB(HLargeClassDetector _this) {
		final boolean this_relative = _this.isRelative();
		if (Boolean.valueOf(this_relative).equals(Boolean.TRUE)) {
			return new Object[] { _this };
		}

		return null;
	}

	public static final Object[] pattern_HLargeClassDetector_0_3_ActivityNode71_blackB(HLargeClassDetector _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HLargeClassDetector_0_3_ActivityNode71_greenB(HLargeClassDetector _this) {
		final double _localVariable_0 = _this.calculateRelativeThreshold(HRelativeValueConstants.VERY_HIGH);
		final double this_threshold_prime = Double.valueOf(_localVariable_0);
		_this.setThreshold(Double.valueOf(this_threshold_prime));
		return new Object[] { _this };
	}

	public static final Object[] pattern_HLargeClassDetector_0_4_ActivityNode88_blackBB(HLargeClassDetector _this,
			HNumberOfMembersMetric nm) {
		final double this_threshold = _this.getThreshold();
		final double nm_value = nm.getValue();
		if (Double.valueOf(this_threshold).compareTo(Double.valueOf(nm_value)) < 0) {
			return new Object[] { _this, nm };
		}

		return null;
	}

	public static final Object[] pattern_HLargeClassDetector_0_5_ActivityNode27_blackBBB(HNumberOfMembersMetric nm,
			TClass tClass, HLargeClassDetector _this) {
		return new Object[] { nm, tClass, _this };
	}

	public static final Object[] pattern_HLargeClassDetector_0_5_ActivityNode27_greenFBBB(HNumberOfMembersMetric nm,
			TClass tClass, HLargeClassDetector _this) {
		final HLargeClassSmell largeClassSmell = CodesmellsFactory.eINSTANCE.createHLargeClassSmell();
		largeClassSmell.setTAnnotated(tClass);
		largeClassSmell.setHNumberOfMembers(nm);
		nm.getPartOf().add(largeClassSmell);
		_this.getHAnnotation().add(largeClassSmell);
		return new Object[] { largeClassSmell, nm, tClass, _this };
	}

	public static final HAnnotation pattern_HLargeClassDetector_0_6_expressionFB(HLargeClassSmell largeClassSmell) {
		final HAnnotation _result = largeClassSmell;
		return _result;
	}

	public static final HAnnotation pattern_HLargeClassDetector_0_7_expressionF() {
		final HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HLargeClassDetector_0_8_expressionF() {
		final HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Large Class Smell";
	}

	// [user code injected with eMoflon] -->
} //HLargeClassDetectorImpl
