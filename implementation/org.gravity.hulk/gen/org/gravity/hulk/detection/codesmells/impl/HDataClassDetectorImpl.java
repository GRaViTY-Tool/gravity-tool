/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell;

import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HRelativeDetector;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HDataClassDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HData Class Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HDataClassDetectorImpl#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.gravity.hulk.detection.codesmells.impl.HDataClassDetectorImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HDataClassDetectorImpl extends HCodeSmellDetectorImpl implements HDataClassDetector {
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
	protected HDataClassDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HDATA_CLASS_DETECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HDATA_CLASS_DETECTOR__RELATIVE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodesmellsPackage.HDATA_CLASS_DETECTOR__THRESHOLD,
					oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {// 
		Object[] result1_black = HDataClassDetectorImpl.pattern_HDataClassDetector_0_1_ActivityNode28_blackBF(tClass);
		if (result1_black != null) {
			HNACCMetric nm = (HNACCMetric) result1_black[1];
			// 
			Object[] result2_black = HDataClassDetectorImpl
					.pattern_HDataClassDetector_0_2_ActivityNode79_blackFB(tClass);
			if (result2_black != null) {
				//nothing HDataClassSmell dc = (HDataClassSmell) result2_black[0];
				return HDataClassDetectorImpl.pattern_HDataClassDetector_0_3_expressionF();
			} else {
				// 
				Object[] result4_black = HDataClassDetectorImpl
						.pattern_HDataClassDetector_0_4_ActivityNode91_blackB(this);
				if (result4_black != null) {

					Object[] result5_black = HDataClassDetectorImpl
							.pattern_HDataClassDetector_0_5_ActivityNode95_blackB(this);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
					}
					HDataClassDetectorImpl.pattern_HDataClassDetector_0_5_ActivityNode95_greenB(this);

				} else {
				}
				// 
				Object[] result6_black = HDataClassDetectorImpl
						.pattern_HDataClassDetector_0_6_ActivityNode92_blackBB(this, nm);
				if (result6_black != null) {

					Object[] result7_black = HDataClassDetectorImpl
							.pattern_HDataClassDetector_0_7_ActivityNode27_blackBBB(tClass, this, nm);
					if (result7_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
								+ ", " + "[this] = " + this + ", " + "[nm] = " + nm + ".");
					}
					Object[] result7_green = HDataClassDetectorImpl
							.pattern_HDataClassDetector_0_7_ActivityNode27_greenBFBB(tClass, this, nm);
					HDataClassSmell dataClassSmell = (HDataClassSmell) result7_green[1];

					// ForEach 
					for (Object[] result8_black : HDataClassDetectorImpl
							.pattern_HDataClassDetector_0_8_ActivityNode46_blackBF(nm)) {
						HGetterSetterSmell getterSetter = (HGetterSetterSmell) result8_black[1];

						Object[] result9_black = HDataClassDetectorImpl
								.pattern_HDataClassDetector_0_9_ActivityNode47_blackBB(getterSetter, dataClassSmell);
						if (result9_black == null) {
							throw new RuntimeException("Pattern matching failed." + " Variables: " + "[getterSetter] = "
									+ getterSetter + ", " + "[dataClassSmell] = " + dataClassSmell + ".");
						}
						HDataClassDetectorImpl.pattern_HDataClassDetector_0_9_ActivityNode47_greenBB(getterSetter,
								dataClassSmell);

					}
					// ForEach 
					for (Object[] result10_black : HDataClassDetectorImpl
							.pattern_HDataClassDetector_0_10_ActivityNode77_blackBF(tClass)) {
						TClass tChild = (TClass) result10_black[1];
						// 
						HDataClassDetectorImpl.pattern_HDataClassDetector_0_11_ActivityNode78_expressionBBB(this,
								tChild, dataClassSmell);

					}
					return HDataClassDetectorImpl.pattern_HDataClassDetector_0_12_expressionFB(dataClassSmell);
				} else {
					return HDataClassDetectorImpl.pattern_HDataClassDetector_0_13_expressionF();
				}

			}

		} else {
			return HDataClassDetectorImpl.pattern_HDataClassDetector_0_14_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeChildDC(TClass tChild, HDataClassSmell tSmell) {// 
		Object[] result1_black = HDataClassDetectorImpl.pattern_HDataClassDetector_1_1_ActivityNode73_blackBB(tChild,
				this);
		if (result1_black != null) {

			Object[] result2_black = HDataClassDetectorImpl
					.pattern_HDataClassDetector_1_2_ActivityNode74_blackBB(tChild, tSmell);
			if (result2_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tChild] = " + tChild + ", "
						+ "[tSmell] = " + tSmell + ".");
			}
			Object[] result2_green = HDataClassDetectorImpl
					.pattern_HDataClassDetector_1_2_ActivityNode74_greenBFB(tChild, tSmell);
			HDataClassSmell data = (HDataClassSmell) result2_green[1];

			// ForEach 
			for (Object[] result3_black : HDataClassDetectorImpl
					.pattern_HDataClassDetector_1_3_ActivityNode75_blackBF(tChild)) {
				TClass next = (TClass) result3_black[1];
				// 
				HDataClassDetectorImpl.pattern_HDataClassDetector_1_4_ActivityNode76_expressionBBB(this, next, data);

			}
			return;
		} else {
			return;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateRelativeThreshold(HRelativeValueConstants level) {
		// [user code injected with eMoflon]

		return calculateRelativeThreshold(level, HNACCMetric.class);

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
		case CodesmellsPackage.HDATA_CLASS_DETECTOR__RELATIVE:
			return isRelative();
		case CodesmellsPackage.HDATA_CLASS_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HDATA_CLASS_DETECTOR__RELATIVE:
			setRelative((Boolean) newValue);
			return;
		case CodesmellsPackage.HDATA_CLASS_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HDATA_CLASS_DETECTOR__RELATIVE:
			setRelative(RELATIVE_EDEFAULT);
			return;
		case CodesmellsPackage.HDATA_CLASS_DETECTOR__THRESHOLD:
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
		case CodesmellsPackage.HDATA_CLASS_DETECTOR__RELATIVE:
			return relative != RELATIVE_EDEFAULT;
		case CodesmellsPackage.HDATA_CLASS_DETECTOR__THRESHOLD:
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
			case CodesmellsPackage.HDATA_CLASS_DETECTOR__RELATIVE:
				return DetectionPackage.HRELATIVE_DETECTOR__RELATIVE;
			case CodesmellsPackage.HDATA_CLASS_DETECTOR__THRESHOLD:
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
				return CodesmellsPackage.HDATA_CLASS_DETECTOR__RELATIVE;
			case DetectionPackage.HRELATIVE_DETECTOR__THRESHOLD:
				return CodesmellsPackage.HDATA_CLASS_DETECTOR__THRESHOLD;
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
				return CodesmellsPackage.HDATA_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HDATA_CLASS_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HDATA_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return -1;
			}
		}
		if (baseClass == HRelativeDetector.class) {
			switch (baseOperationID) {
			case DetectionPackage.HRELATIVE_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
				return CodesmellsPackage.HDATA_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS;
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
		case CodesmellsPackage.HDATA_CLASS_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HDATA_CLASS_DETECTOR___MAKE_CHILD_DC__TCLASS_HDATACLASSSMELL:
			makeChildDC((TClass) arguments.get(0), (HDataClassSmell) arguments.get(1));
			return null;
		case CodesmellsPackage.HDATA_CLASS_DETECTOR___CALCULATE_RELATIVE_THRESHOLD__HRELATIVEVALUECONSTANTS:
			return calculateRelativeThreshold((HRelativeValueConstants) arguments.get(0));
		case CodesmellsPackage.HDATA_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH:
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

	public static final Object[] pattern_HDataClassDetector_0_1_ActivityNode28_blackBF(TClass tClass) {
		for (TAnnotation tmpNm : tClass.getTAnnotation()) {
			if (tmpNm instanceof HNACCMetric) {
				HNACCMetric nm = (HNACCMetric) tmpNm;
				return new Object[] { tClass, nm };
			}
		}
		return null;
	}

	public static final Object[] pattern_HDataClassDetector_0_2_ActivityNode79_blackFB(TClass tClass) {
		for (TAnnotation tmpDc : tClass.getTAnnotation()) {
			if (tmpDc instanceof HDataClassSmell) {
				HDataClassSmell dc = (HDataClassSmell) tmpDc;
				return new Object[] { dc, tClass };
			}
		}
		return null;
	}

	public static final HAnnotation pattern_HDataClassDetector_0_3_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HDataClassDetector_0_4_ActivityNode91_blackB(HDataClassDetector _this) {
		boolean this_relative = _this.isRelative();
		if (Boolean.valueOf(this_relative).equals(Boolean.valueOf(true))) {
			return new Object[] { _this };
		}

		return null;
	}

	public static final Object[] pattern_HDataClassDetector_0_5_ActivityNode95_blackB(HDataClassDetector _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HDataClassDetector_0_5_ActivityNode95_greenB(HDataClassDetector _this) {
		double _localVariable_0 = _this.calculateRelativeThreshold(HRelativeValueConstants.HIGH);
		double this_threshold_prime = Double.valueOf(_localVariable_0);
		_this.setThreshold(Double.valueOf(this_threshold_prime));
		return new Object[] { _this };
	}

	public static final Object[] pattern_HDataClassDetector_0_6_ActivityNode92_blackBB(HDataClassDetector _this,
			HNACCMetric nm) {
		double this_threshold = _this.getThreshold();
		double nm_value = nm.getValue();
		if (Double.valueOf(this_threshold).compareTo(Double.valueOf(nm_value)) < 0) {
			return new Object[] { _this, nm };
		}

		return null;
	}

	public static final Object[] pattern_HDataClassDetector_0_7_ActivityNode27_blackBBB(TClass tClass,
			HDataClassDetector _this, HNACCMetric nm) {
		return new Object[] { tClass, _this, nm };
	}

	public static final Object[] pattern_HDataClassDetector_0_7_ActivityNode27_greenBFBB(TClass tClass,
			HDataClassDetector _this, HNACCMetric nm) {
		HDataClassSmell dataClassSmell = CodesmellsFactory.eINSTANCE.createHDataClassSmell();
		dataClassSmell.setTAnnotated(tClass);
		dataClassSmell.setHNACCMetric(nm);
		_this.getHAnnotation().add(dataClassSmell);
		nm.getPartOf().add(dataClassSmell);
		return new Object[] { tClass, dataClassSmell, _this, nm };
	}

	public static final Iterable<Object[]> pattern_HDataClassDetector_0_8_ActivityNode46_blackBF(HNACCMetric nm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (HGetterSetterSmell getterSetter : nm.getHGetterSetterSmells()) {
			_result.add(new Object[] { nm, getterSetter });
		}
		return _result;
	}

	public static final Object[] pattern_HDataClassDetector_0_9_ActivityNode47_blackBB(HGetterSetterSmell getterSetter,
			HDataClassSmell dataClassSmell) {
		return new Object[] { getterSetter, dataClassSmell };
	}

	public static final Object[] pattern_HDataClassDetector_0_9_ActivityNode47_greenBB(HGetterSetterSmell getterSetter,
			HDataClassSmell dataClassSmell) {
		getterSetter.getPartOf().add(dataClassSmell);
		dataClassSmell.getGetterSetterSmells().add(getterSetter);
		return new Object[] { getterSetter, dataClassSmell };
	}

	public static final Iterable<Object[]> pattern_HDataClassDetector_0_10_ActivityNode77_blackBF(TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChild : tClass.getChildClasses()) {
			if (!tChild.equals(tClass)) {
				_result.add(new Object[] { tClass, tChild });
			}
		}
		return _result;
	}

	public static final void pattern_HDataClassDetector_0_11_ActivityNode78_expressionBBB(HDataClassDetector _this,
			TClass tChild, HDataClassSmell dataClassSmell) {
		_this.makeChildDC(tChild, dataClassSmell);

	}

	public static final HAnnotation pattern_HDataClassDetector_0_12_expressionFB(HDataClassSmell dataClassSmell) {
		HAnnotation _result = dataClassSmell;
		return _result;
	}

	public static final HAnnotation pattern_HDataClassDetector_0_13_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HDataClassDetector_0_14_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HDataClassDetector_1_1_ActivityNode73_black_nac_0B(TClass tChild) {
		for (TAnnotation tmpSmell : tChild.getTAnnotation()) {
			if (tmpSmell instanceof HDataClassSmell) {
				HDataClassSmell smell = (HDataClassSmell) tmpSmell;
				return new Object[] { tChild };
			}
		}
		return null;
	}

	public static final Object[] pattern_HDataClassDetector_1_1_ActivityNode73_blackBB(TClass tChild,
			HDataClassDetector _this) {
		if (pattern_HDataClassDetector_1_1_ActivityNode73_black_nac_0B(tChild) == null) {
			return new Object[] { tChild, _this };
		}
		return null;
	}

	public static final Object[] pattern_HDataClassDetector_1_2_ActivityNode74_blackBB(TClass tChild,
			HDataClassSmell tSmell) {
		return new Object[] { tChild, tSmell };
	}

	public static final Object[] pattern_HDataClassDetector_1_2_ActivityNode74_greenBFB(TClass tChild,
			HDataClassSmell tSmell) {
		HDataClassSmell data = CodesmellsFactory.eINSTANCE.createHDataClassSmell();
		data.setTAnnotated(tChild);
		data.getPartOf().add(tSmell);
		return new Object[] { tChild, data, tSmell };
	}

	public static final Iterable<Object[]> pattern_HDataClassDetector_1_3_ActivityNode75_blackBF(TClass tChild) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass next : tChild.getChildClasses()) {
			if (!next.equals(tChild)) {
				_result.add(new Object[] { tChild, next });
			}
		}
		return _result;
	}

	public static final void pattern_HDataClassDetector_1_4_ActivityNode76_expressionBBB(HDataClassDetector _this,
			TClass next, HDataClassSmell data) {
		_this.makeChildDC(next, data);

	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Data Class Smell";
	}

	// [user code injected with eMoflon] -->
} //HDataClassDetectorImpl
