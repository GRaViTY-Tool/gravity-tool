/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
// <-- [user defined imports]
import java.util.ArrayList;
import java.util.List;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSpaghetti Code Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSpaghettiCodeDetectorImpl extends HClassBasedCalculatorImpl implements HSpaghettiCodeDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSpaghettiCodeDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HSPAGHETTI_CODE_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {

		Object[] result1_black = HSpaghettiCodeDetectorImpl
				.pattern_HSpaghettiCodeDetector_0_1_ActivityNode55_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		// 
		Object[] result2_black = HSpaghettiCodeDetectorImpl
				.pattern_HSpaghettiCodeDetector_0_2_ActivityNode43_blackBF(tClass);
		if (result2_black != null) {
			HIntenseFieldUsageCodeSmell field = (HIntenseFieldUsageCodeSmell) result2_black[1];
			// 
			HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_3_ActivityNode45_expressionFBB(this, field);

			Object[] result4_black = HSpaghettiCodeDetectorImpl
					.pattern_HSpaghettiCodeDetector_0_4_ActivityNode42_blackBF(tClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
			}
			HAverageParametersMetric param = (HAverageParametersMetric) result4_black[1];
			// 
			Object[] result5_bindingAndBlack = HSpaghettiCodeDetectorImpl
					.pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_bindingAndBlackFB(param);
			if (result5_bindingAndBlack != null) {
				//nothing HRelativeValue pRelative = (HRelativeValue) result5_bindingAndBlack[0];
				// 
				HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_6_ActivityNode46_expressionFBB(this, param);

				Object[] result7_black = HSpaghettiCodeDetectorImpl
						.pattern_HSpaghettiCodeDetector_0_7_ActivityNode42_blackBF(tClass);
				if (result7_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
				}
				HDepthOfInheritanceMetric inher = (HDepthOfInheritanceMetric) result7_black[1];
				// 
				Object[] result8_bindingAndBlack = HSpaghettiCodeDetectorImpl
						.pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_bindingAndBlackFB(inher);
				if (result8_bindingAndBlack != null) {
					//nothing HRelativeValue iRelative = (HRelativeValue) result8_bindingAndBlack[0];
					// 
					HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_9_ActivityNode48_expressionFBB(this,
							inher);

					Object[] result10_black = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_10_ActivityNode42_blackBF(tClass);
					if (result10_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
					}
					HNumberOfChildMetric child = (HNumberOfChildMetric) result10_black[1];
					// 
					Object[] result11_bindingAndBlack = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_bindingAndBlackFB(child);
					if (result11_bindingAndBlack != null) {
						//nothing HRelativeValue cRelative = (HRelativeValue) result11_bindingAndBlack[0];
						// 
						HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_12_ActivityNode49_expressionFBB(this, child);

					} else {
					}

					Object[] result13_black = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_13_ActivityNode42_blackBF(tClass);
					if (result13_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
					}
					HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) result13_black[1];
					// 
					Object[] result14_bindingAndBlack = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_bindingAndBlackFB(over);
					if (result14_bindingAndBlack != null) {
						//nothing HRelativeValue oRelative = (HRelativeValue) result14_bindingAndBlack[0];
						// 
						HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_15_ActivityNode51_expressionFBB(this, over);

					} else {
					}

				} else {

					Object[] result16_black = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_16_ActivityNode42_blackBF(tClass);
					if (result16_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
					}
					HNumberOfChildMetric child = (HNumberOfChildMetric) result16_black[1];
					// 
					Object[] result17_bindingAndBlack = HSpaghettiCodeDetectorImpl
							.pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_bindingAndBlackFB(child);
					if (result17_bindingAndBlack != null) {
						//nothing HRelativeValue cRelative = (HRelativeValue) result17_bindingAndBlack[0];
						// 
						HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_18_ActivityNode50_expressionFBB(this, child);

						Object[] result19_black = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_19_ActivityNode42_blackBF(tClass);
						if (result19_black == null) {
							throw new RuntimeException(
									"Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
						}
						HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) result19_black[1];
						// 
						Object[] result20_bindingAndBlack = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_bindingAndBlackFB(over);
						if (result20_bindingAndBlack != null) {
							//nothing HRelativeValue oRelative = (HRelativeValue) result20_bindingAndBlack[0];
							// 
							HSpaghettiCodeDetectorImpl
									.pattern_HSpaghettiCodeDetector_0_21_ActivityNode52_expressionFBB(this, over);

						} else {
						}

					} else {

						Object[] result22_black = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_22_ActivityNode42_blackBF(tClass);
						if (result22_black == null) {
							throw new RuntimeException(
									"Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
						}
						HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) result22_black[1];
						// 
						Object[] result23_bindingAndBlack = HSpaghettiCodeDetectorImpl
								.pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_bindingAndBlackFB(over);
						if (result23_bindingAndBlack != null) {
							//nothing HRelativeValue oRelative = (HRelativeValue) result23_bindingAndBlack[0];
							// 
							HSpaghettiCodeDetectorImpl
									.pattern_HSpaghettiCodeDetector_0_24_ActivityNode53_expressionFBB(this, over);

						} else {
							return HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_25_expressionF();
						}

					}

				}

				Object[] result26_black = HSpaghettiCodeDetectorImpl
						.pattern_HSpaghettiCodeDetector_0_26_ActivityNode44_blackBB(tClass, this);
				if (result26_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
							+ ", " + "[this] = " + this + ".");
				}
				Object[] result26_green = HSpaghettiCodeDetectorImpl
						.pattern_HSpaghettiCodeDetector_0_26_ActivityNode44_greenBFB(tClass, this);
				HSpaghettiCodeAntiPattern anti = (HSpaghettiCodeAntiPattern) result26_green[1];

				// 
				HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_27_ActivityNode54_expressionFBB(this, anti);
				// 
				Object[] result28_black = HSpaghettiCodeDetectorImpl
						.pattern_HSpaghettiCodeDetector_0_28_ActivityNode71_blackFBF(tClass);
				if (result28_black != null) {
					TAnnotationType tType = (TAnnotationType) result28_black[0];
					//nothing TypeGraph pg = (TypeGraph) result28_black[2];
					HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_28_ActivityNode71_greenFBB(tType,
							tClass);
					//nothing TAnnotation tAnnotation = (TAnnotation) result28_green[0];

				} else {
				}
				return HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_29_expressionFB(anti);
			} else {
				return HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_30_expressionF();
			}

		} else {
			return HSpaghettiCodeDetectorImpl.pattern_HSpaghettiCodeDetector_0_31_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean collect(HAnnotation hAnnotation) {
		// [user code injected with eMoflon]

		return annotations.add(hAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean connect(HSpaghettiCodeAntiPattern hAntiPattern) {
		// [user code injected with eMoflon]

		for (HAnnotation a : annotations) {
			a.getPartOf().add(hAntiPattern);
			if (a instanceof HIntenseFieldUsageCodeSmell) {
				hAntiPattern.setHIntenseFieldUsageCodeSmell((HIntenseFieldUsageCodeSmell) a);
			} else if (a instanceof HAverageParametersMetric) {
				hAntiPattern.setHAverageParametersMetric((HAverageParametersMetric) a);
			} else if (a instanceof HAverageOverloadingInClassMetric) {
				hAntiPattern.setHAverageOverloadingInClassMetric((HAverageOverloadingInClassMetric) a);
			} else if (a instanceof HNumberOfChildMetric) {
				hAntiPattern.setHNumberOfChild((HNumberOfChildMetric) a);
			} else if (a instanceof HDepthOfInheritanceMetric) {
				hAntiPattern.setHDepthOfInheritanceMetric((HDepthOfInheritanceMetric) a);
			}
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR___COLLECT__HANNOTATION:
			return collect((HAnnotation) arguments.get(0));
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR___CONNECT__HSPAGHETTICODEANTIPATTERN:
			return connect((HSpaghettiCodeAntiPattern) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_1_ActivityNode55_blackB(
			HSpaghettiCodeDetector _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_2_ActivityNode43_blackBF(TClass tClass) {
		for (TAnnotation tmpField : tClass.getTAnnotation()) {
			if (tmpField instanceof HIntenseFieldUsageCodeSmell) {
				HIntenseFieldUsageCodeSmell field = (HIntenseFieldUsageCodeSmell) tmpField;
				return new Object[] { tClass, field };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_3_ActivityNode45_expressionFBB(
			HSpaghettiCodeDetector _this, HIntenseFieldUsageCodeSmell field) {
		boolean _localVariable_0 = _this.collect(field);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_4_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpParam : tClass.getTAnnotation()) {
			if (tmpParam instanceof HAverageParametersMetric) {
				HAverageParametersMetric param = (HAverageParametersMetric) tmpParam;
				return new Object[] { tClass, param };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_bindingFB(
			HAverageParametersMetric param) {
		HRelativeValue _localVariable_0 = param.getRelativeAmount();
		HRelativeValue pRelative = _localVariable_0;
		if (pRelative != null) {
			return new Object[] { pRelative, param };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_blackB(HRelativeValue pRelative) {
		HRelativeValueConstants pRelative_value = pRelative.getValue();
		if (pRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { pRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_bindingAndBlackFB(
			HAverageParametersMetric param) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_binding = pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_bindingFB(
				param);
		if (result_pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_binding != null) {
			HRelativeValue pRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_black = pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_blackB(
					pRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_5_ActivityNode57_black != null) {

				return new Object[] { pRelative, param };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_6_ActivityNode46_expressionFBB(
			HSpaghettiCodeDetector _this, HAverageParametersMetric param) {
		boolean _localVariable_0 = _this.collect(param);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_7_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpInher : tClass.getTAnnotation()) {
			if (tmpInher instanceof HDepthOfInheritanceMetric) {
				HDepthOfInheritanceMetric inher = (HDepthOfInheritanceMetric) tmpInher;
				return new Object[] { tClass, inher };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_bindingFB(
			HDepthOfInheritanceMetric inher) {
		HRelativeValue _localVariable_0 = inher.getRelativeAmount();
		HRelativeValue iRelative = _localVariable_0;
		if (iRelative != null) {
			return new Object[] { iRelative, inher };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_blackB(HRelativeValue iRelative) {
		HRelativeValueConstants iRelative_value = iRelative.getValue();
		if (iRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { iRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_bindingAndBlackFB(
			HDepthOfInheritanceMetric inher) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_binding = pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_bindingFB(
				inher);
		if (result_pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_binding != null) {
			HRelativeValue iRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_black = pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_blackB(
					iRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_8_ActivityNode58_black != null) {

				return new Object[] { iRelative, inher };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_9_ActivityNode48_expressionFBB(
			HSpaghettiCodeDetector _this, HDepthOfInheritanceMetric inher) {
		boolean _localVariable_0 = _this.collect(inher);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_10_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpChild : tClass.getTAnnotation()) {
			if (tmpChild instanceof HNumberOfChildMetric) {
				HNumberOfChildMetric child = (HNumberOfChildMetric) tmpChild;
				return new Object[] { tClass, child };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_bindingFB(
			HNumberOfChildMetric child) {
		HRelativeValue _localVariable_0 = child.getRelativeAmount();
		HRelativeValue cRelative = _localVariable_0;
		if (cRelative != null) {
			return new Object[] { cRelative, child };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_blackB(HRelativeValue cRelative) {
		HRelativeValueConstants cRelative_value = cRelative.getValue();
		if (cRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { cRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_bindingAndBlackFB(
			HNumberOfChildMetric child) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_binding = pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_bindingFB(
				child);
		if (result_pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_binding != null) {
			HRelativeValue cRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_black = pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_blackB(
					cRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_11_ActivityNode60_black != null) {

				return new Object[] { cRelative, child };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_12_ActivityNode49_expressionFBB(
			HSpaghettiCodeDetector _this, HNumberOfChildMetric child) {
		boolean _localVariable_0 = _this.collect(child);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_13_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HAverageOverloadingInClassMetric) {
				HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) tmpOver;
				return new Object[] { tClass, over };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_bindingFB(
			HAverageOverloadingInClassMetric over) {
		HRelativeValue _localVariable_0 = over.getRelativeAmount();
		HRelativeValue oRelative = _localVariable_0;
		if (oRelative != null) {
			return new Object[] { oRelative, over };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_blackB(HRelativeValue oRelative) {
		HRelativeValueConstants oRelative_value = oRelative.getValue();
		if (oRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { oRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_bindingAndBlackFB(
			HAverageOverloadingInClassMetric over) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_binding = pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_bindingFB(
				over);
		if (result_pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_binding != null) {
			HRelativeValue oRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_black = pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_blackB(
					oRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_14_ActivityNode63_black != null) {

				return new Object[] { oRelative, over };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_15_ActivityNode51_expressionFBB(
			HSpaghettiCodeDetector _this, HAverageOverloadingInClassMetric over) {
		boolean _localVariable_0 = _this.collect(over);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_16_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpChild : tClass.getTAnnotation()) {
			if (tmpChild instanceof HNumberOfChildMetric) {
				HNumberOfChildMetric child = (HNumberOfChildMetric) tmpChild;
				return new Object[] { tClass, child };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_bindingFB(
			HNumberOfChildMetric child) {
		HRelativeValue _localVariable_0 = child.getRelativeAmount();
		HRelativeValue cRelative = _localVariable_0;
		if (cRelative != null) {
			return new Object[] { cRelative, child };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_blackB(HRelativeValue cRelative) {
		HRelativeValueConstants cRelative_value = cRelative.getValue();
		if (cRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { cRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_bindingAndBlackFB(
			HNumberOfChildMetric child) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_binding = pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_bindingFB(
				child);
		if (result_pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_binding != null) {
			HRelativeValue cRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_black = pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_blackB(
					cRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_17_ActivityNode59_black != null) {

				return new Object[] { cRelative, child };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_18_ActivityNode50_expressionFBB(
			HSpaghettiCodeDetector _this, HNumberOfChildMetric child) {
		boolean _localVariable_0 = _this.collect(child);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_19_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HAverageOverloadingInClassMetric) {
				HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) tmpOver;
				return new Object[] { tClass, over };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_bindingFB(
			HAverageOverloadingInClassMetric over) {
		HRelativeValue _localVariable_0 = over.getRelativeAmount();
		HRelativeValue oRelative = _localVariable_0;
		if (oRelative != null) {
			return new Object[] { oRelative, over };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_blackB(HRelativeValue oRelative) {
		HRelativeValueConstants oRelative_value = oRelative.getValue();
		if (oRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { oRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_bindingAndBlackFB(
			HAverageOverloadingInClassMetric over) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_binding = pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_bindingFB(
				over);
		if (result_pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_binding != null) {
			HRelativeValue oRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_black = pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_blackB(
					oRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_20_ActivityNode62_black != null) {

				return new Object[] { oRelative, over };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_21_ActivityNode52_expressionFBB(
			HSpaghettiCodeDetector _this, HAverageOverloadingInClassMetric over) {
		boolean _localVariable_0 = _this.collect(over);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_22_ActivityNode42_blackBF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HAverageOverloadingInClassMetric) {
				HAverageOverloadingInClassMetric over = (HAverageOverloadingInClassMetric) tmpOver;
				return new Object[] { tClass, over };
			}
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_bindingFB(
			HAverageOverloadingInClassMetric over) {
		HRelativeValue _localVariable_0 = over.getRelativeAmount();
		HRelativeValue oRelative = _localVariable_0;
		if (oRelative != null) {
			return new Object[] { oRelative, over };
		}
		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_blackB(HRelativeValue oRelative) {
		HRelativeValueConstants oRelative_value = oRelative.getValue();
		if (oRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { oRelative };
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_bindingAndBlackFB(
			HAverageOverloadingInClassMetric over) {
		Object[] result_pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_binding = pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_bindingFB(
				over);
		if (result_pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_binding != null) {
			HRelativeValue oRelative = (HRelativeValue) result_pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_binding[0];

			Object[] result_pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_black = pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_blackB(
					oRelative);
			if (result_pattern_HSpaghettiCodeDetector_0_23_ActivityNode61_black != null) {

				return new Object[] { oRelative, over };
			}
		}
		return null;
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_24_ActivityNode53_expressionFBB(
			HSpaghettiCodeDetector _this, HAverageOverloadingInClassMetric over) {
		boolean _localVariable_0 = _this.collect(over);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final HAnnotation pattern_HSpaghettiCodeDetector_0_25_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_26_ActivityNode44_blackBB(TClass tClass,
			HSpaghettiCodeDetector _this) {
		return new Object[] { tClass, _this };
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_26_ActivityNode44_greenBFB(TClass tClass,
			HSpaghettiCodeDetector _this) {
		HSpaghettiCodeAntiPattern anti = AntipatternFactory.eINSTANCE.createHSpaghettiCodeAntiPattern();
		anti.setTAnnotated(tClass);
		_this.getHAnnotation().add(anti);
		return new Object[] { tClass, anti, _this };
	}

	public static final boolean pattern_HSpaghettiCodeDetector_0_27_ActivityNode54_expressionFBB(
			HSpaghettiCodeDetector _this, HSpaghettiCodeAntiPattern anti) {
		boolean _localVariable_0 = _this.connect(anti);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_28_ActivityNode71_blackFBF(TClass tClass) {
		TypeGraph pg = tClass.getPg();
		if (pg != null) {
			for (TAnnotationType tType : pg.getTAnnotationTypes()) {
				String tType_tName = tType.getTName();
				if (tType_tName.equals("SpaghettiCode")) {
					return new Object[] { tType, tClass, pg };
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_HSpaghettiCodeDetector_0_28_ActivityNode71_greenFBB(TAnnotationType tType,
			TClass tClass) {
		TAnnotation tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
		tAnnotation.setTAnnotated(tClass);
		tType.getAnnotations().add(tAnnotation);
		return new Object[] { tAnnotation, tType, tClass };
	}

	public static final HAnnotation pattern_HSpaghettiCodeDetector_0_29_expressionFB(HSpaghettiCodeAntiPattern anti) {
		HAnnotation _result = anti;
		return _result;
	}

	public static final HAnnotation pattern_HSpaghettiCodeDetector_0_30_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HSpaghettiCodeDetector_0_31_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	private List<HAnnotation> annotations = new ArrayList<>();

	@Override
	public String getGuiName() {
		return "Spaghetti Code [Anti-Pattern]";
	}

	// [user code injected with eMoflon] -->
} //HSpaghettiCodeDetectorImpl
