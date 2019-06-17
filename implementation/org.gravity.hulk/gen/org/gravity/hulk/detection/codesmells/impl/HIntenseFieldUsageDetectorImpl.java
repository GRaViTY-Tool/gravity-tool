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
import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HRelativeDetector;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
import org.gravity.hulk.antipatterngraph.HMetric;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIntense Field Usage Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetectorImpl#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetectorImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HIntenseFieldUsageDetectorImpl extends HCodeSmellDetectorImpl implements HIntenseFieldUsageDetector {
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
	protected HIntenseFieldUsageDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HINTENSE_FIELD_USAGE_DETECTOR;
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
					CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__RELATIVE, oldRelative, relative));
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
					CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {

		Object[] result1_black = HIntenseFieldUsageDetectorImpl
				.pattern_HIntenseFieldUsageDetector_0_1_ActivityNode67_blackBF(tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
		}
		HLocalAccessRelationMetric hMetric = (HLocalAccessRelationMetric) result1_black[1];
		// 
		Object[] result2_black = HIntenseFieldUsageDetectorImpl
				.pattern_HIntenseFieldUsageDetector_0_2_ActivityNode89_blackB(this);
		if (result2_black != null) {

			Object[] result3_black = HIntenseFieldUsageDetectorImpl
					.pattern_HIntenseFieldUsageDetector_0_3_ActivityNode68_blackB(this);
			if (result3_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
			}
			HIntenseFieldUsageDetectorImpl.pattern_HIntenseFieldUsageDetector_0_3_ActivityNode68_greenB(this);

		} else {
		}
		// 
		Object[] result4_black = HIntenseFieldUsageDetectorImpl
				.pattern_HIntenseFieldUsageDetector_0_4_ActivityNode90_blackBB(this, hMetric);
		if (result4_black != null) {

			Object[] result5_black = HIntenseFieldUsageDetectorImpl
					.pattern_HIntenseFieldUsageDetector_0_5_ActivityNode69_blackBBB(tClass, this, hMetric);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
						+ "[this] = " + this + ", " + "[hMetric] = " + hMetric + ".");
			}
			Object[] result5_green = HIntenseFieldUsageDetectorImpl
					.pattern_HIntenseFieldUsageDetector_0_5_ActivityNode69_greenBFBB(tClass, this, hMetric);
			HIntenseFieldUsageCodeSmell smell = (HIntenseFieldUsageCodeSmell) result5_green[1];

			return HIntenseFieldUsageDetectorImpl.pattern_HIntenseFieldUsageDetector_0_6_expressionFB(smell);
		} else {
			return HIntenseFieldUsageDetectorImpl.pattern_HIntenseFieldUsageDetector_0_7_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateRelativeThreshold(HRelativeValueConstants level) {
		// [user code injected with eMoflon]

		return calculateRelativeThreshold(level, HLocalAccessRelationMetric.class);

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
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__RELATIVE:
			return isRelative();
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__RELATIVE:
			setRelative((Boolean) newValue);
			return;
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__RELATIVE:
			setRelative(RELATIVE_EDEFAULT);
			return;
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__RELATIVE:
			return relative != RELATIVE_EDEFAULT;
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__THRESHOLD:
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
			case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__RELATIVE:
				return DetectionPackage.HRELATIVE_DETECTOR__RELATIVE;
			case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__THRESHOLD:
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
				return CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__RELATIVE;
			case DetectionPackage.HRELATIVE_DETECTOR__THRESHOLD:
				return CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR__THRESHOLD;
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
				return CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (baseOperationID) {
			case DetectionPackage.HRELATIVE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
				return CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS;
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
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
			return calculateRelativeThreshold((HRelativeValueConstants) arguments.get(0));
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR___DETECT__HANTIPATTERNGRAPH:
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

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_1_ActivityNode67_blackBF(TClass tClass) {
		for (TAnnotation tmpHMetric : tClass.getTAnnotation()) {
			if (tmpHMetric instanceof HLocalAccessRelationMetric) {
				HLocalAccessRelationMetric hMetric = (HLocalAccessRelationMetric) tmpHMetric;
				return new Object[] { tClass, hMetric };
			}
		}
		return null;
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_2_ActivityNode89_blackB(
			HIntenseFieldUsageDetector _this) {
		boolean this_relative = _this.isRelative();
		if (Boolean.valueOf(this_relative).equals(Boolean.valueOf(true))) {
			return new Object[] { _this };
		}

		return null;
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_3_ActivityNode68_blackB(
			HIntenseFieldUsageDetector _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_3_ActivityNode68_greenB(
			HIntenseFieldUsageDetector _this) {
		double _localVariable_0 = _this.calculateRelativeThreshold(HRelativeValueConstants.VERY_HIGH);
		double this_threshold_prime = Double.valueOf(_localVariable_0);
		_this.setThreshold(Double.valueOf(this_threshold_prime));
		return new Object[] { _this };
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_4_ActivityNode90_blackBB(
			HIntenseFieldUsageDetector _this, HLocalAccessRelationMetric hMetric) {
		double this_threshold = _this.getThreshold();
		double hMetric_value = hMetric.getValue();
		if (Double.valueOf(this_threshold).compareTo(Double.valueOf(hMetric_value)) < 0) {
			return new Object[] { _this, hMetric };
		}

		return null;
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_5_ActivityNode69_blackBBB(TClass tClass,
			HIntenseFieldUsageDetector _this, HLocalAccessRelationMetric hMetric) {
		return new Object[] { tClass, _this, hMetric };
	}

	public static final Object[] pattern_HIntenseFieldUsageDetector_0_5_ActivityNode69_greenBFBB(TClass tClass,
			HIntenseFieldUsageDetector _this, HLocalAccessRelationMetric hMetric) {
		HIntenseFieldUsageCodeSmell smell = CodesmellsFactory.eINSTANCE.createHIntenseFieldUsageCodeSmell();
		smell.setHLocalAccessRelationMetric(hMetric);
		smell.setTAnnotated(tClass);
		_this.getHAnnotation().add(smell);
		hMetric.getPartOf().add(smell);
		return new Object[] { tClass, smell, _this, hMetric };
	}

	public static final HAnnotation pattern_HIntenseFieldUsageDetector_0_6_expressionFB(
			HIntenseFieldUsageCodeSmell smell) {
		HAnnotation _result = smell;
		return _result;
	}

	public static final HAnnotation pattern_HIntenseFieldUsageDetector_0_7_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Intense usage of local fields";
	}

	// [user code injected with eMoflon] -->
} //HIntenseFieldUsageDetectorImpl
