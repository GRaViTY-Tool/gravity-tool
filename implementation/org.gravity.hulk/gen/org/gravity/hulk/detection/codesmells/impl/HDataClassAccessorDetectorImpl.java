/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HData Class Accessor Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDataClassAccessorDetectorImpl extends HCodeSmellDetectorImpl implements HDataClassAccessorDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDataClassAccessorDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HDATA_CLASS_ACCESSOR_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {

		Object[] result1_black = HDataClassAccessorDetectorImpl
				.pattern_HDataClassAccessorDetector_0_1_ActivityNode55_blackFB(tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
		}
		//nothing TypeGraph pg = (TypeGraph) result1_black[0];
		// 
		Object[] result2_black = HDataClassAccessorDetectorImpl
				.pattern_HDataClassAccessorDetector_0_2_ActivityNode65_blackFFFFBF(tClass);
		if (result2_black != null) {
			//nothing TMember tAnyAccessing = (TMember) result2_black[0];
			//nothing TMember tAnyAccessed = (TMember) result2_black[1];
			//nothing TAccess anyAccess = (TAccess) result2_black[2];
			//nothing TClass tAnyDataClass = (TClass) result2_black[3];
			//nothing HDataClassSmell tData = (HDataClassSmell) result2_black[5];

			Object[] result3_black = HDataClassAccessorDetectorImpl
					.pattern_HDataClassAccessorDetector_0_3_ActivityNode66_blackBB(tClass, this);
			if (result3_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
						+ "[this] = " + this + ".");
			}
			Object[] result3_green = HDataClassAccessorDetectorImpl
					.pattern_HDataClassAccessorDetector_0_3_ActivityNode66_greenFBB(tClass, this);
			HDataClassAccessor ad = (HDataClassAccessor) result3_green[0];

			// ForEach 
			for (Object[] result4_black : HDataClassAccessorDetectorImpl
					.pattern_HDataClassAccessorDetector_0_4_ActivityNode50_blackBFFFFF(tClass)) {
				//nothing TClass dataClass = (TClass) result4_black[1];
				//nothing TMember tAccessing = (TMember) result4_black[2];
				//nothing TMember tAccessed = (TMember) result4_black[3];
				//nothing TAccess access = (TAccess) result4_black[4];
				HDataClassSmell smell = (HDataClassSmell) result4_black[5];
				// 
				HDataClassAccessorDetectorImpl.pattern_HDataClassAccessorDetector_0_5_ActivityNode51_expressionFB(ad);

				Object[] result6_black = HDataClassAccessorDetectorImpl
						.pattern_HDataClassAccessorDetector_0_6_ActivityNode52_blackBB(ad, smell);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ad] = " + ad + ", "
							+ "[smell] = " + smell + ".");
				}
				HDataClassAccessorDetectorImpl.pattern_HDataClassAccessorDetector_0_6_ActivityNode52_greenBB(ad, smell);

			}
			return HDataClassAccessorDetectorImpl.pattern_HDataClassAccessorDetector_0_7_expressionFB(ad);
		} else {
			return HDataClassAccessorDetectorImpl.pattern_HDataClassAccessorDetector_0_8_expressionF();
		}

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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == HDetector.class) {
			switch (baseOperationID) {
			case HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HDataClassAccessorDetector_0_1_ActivityNode55_blackFB(TClass tClass) {
		TypeGraph pg = tClass.getPg();
		if (pg != null) {
			return new Object[] { pg, tClass };
		}

		return null;
	}

	public static final Object[] pattern_HDataClassAccessorDetector_0_2_ActivityNode65_blackFFFFBF(TClass tClass) {
		for (TMember tAnyAccessing : tClass.getDefines()) {
			for (TAccess anyAccess : tAnyAccessing.getTAccessing()) {
				TMember tAnyAccessed = anyAccess.getTTarget();
				if (tAnyAccessed != null) {
					if (!tAnyAccessed.equals(tAnyAccessing)) {
						TAbstractType tmpTAnyDataClass = tAnyAccessed.getDefinedBy();
						if (tmpTAnyDataClass instanceof TClass) {
							TClass tAnyDataClass = (TClass) tmpTAnyDataClass;
							if (!tAnyDataClass.equals(tClass)) {
								for (TAnnotation tmpTData : tAnyDataClass.getTAnnotation()) {
									if (tmpTData instanceof HDataClassSmell) {
										HDataClassSmell tData = (HDataClassSmell) tmpTData;
										return new Object[] { tAnyAccessing, tAnyAccessed, anyAccess, tAnyDataClass,
												tClass, tData };
									}
								}
							}
						}

					}
				}

			}
		}
		return null;
	}

	public static final Object[] pattern_HDataClassAccessorDetector_0_3_ActivityNode66_blackBB(TClass tClass,
			HDataClassAccessorDetector _this) {
		return new Object[] { tClass, _this };
	}

	public static final Object[] pattern_HDataClassAccessorDetector_0_3_ActivityNode66_greenFBB(TClass tClass,
			HDataClassAccessorDetector _this) {
		HDataClassAccessor ad = CodesmellsFactory.eINSTANCE.createHDataClassAccessor();
		double ad_value_prime = Double.valueOf(0.0);
		ad.setTAnnotated(tClass);
		_this.getHAnnotation().add(ad);
		ad.setValue(Double.valueOf(ad_value_prime));
		return new Object[] { ad, tClass, _this };
	}

	public static final Iterable<Object[]> pattern_HDataClassAccessorDetector_0_4_ActivityNode50_blackBFFFFF(
			TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tAccessing : tClass.getDefines()) {
			for (TAccess access : tAccessing.getTAccessing()) {
				TMember tAccessed = access.getTTarget();
				if (tAccessed != null) {
					if (!tAccessed.equals(tAccessing)) {
						TAbstractType tmpDataClass = tAccessed.getDefinedBy();
						if (tmpDataClass instanceof TClass) {
							TClass dataClass = (TClass) tmpDataClass;
							if (!dataClass.equals(tClass)) {
								for (TAnnotation tmpSmell : dataClass.getTAnnotation()) {
									if (tmpSmell instanceof HDataClassSmell) {
										HDataClassSmell smell = (HDataClassSmell) tmpSmell;
										_result.add(new Object[] { tClass, dataClass, tAccessing, tAccessed, access,
												smell });
									}
								}
							}
						}

					}
				}

			}
		}
		return _result;
	}

	public static final double pattern_HDataClassAccessorDetector_0_5_ActivityNode51_expressionFB(
			HDataClassAccessor ad) {
		double _localVariable_0 = ad.increment();
		double _result = Double.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HDataClassAccessorDetector_0_6_ActivityNode52_blackBB(HDataClassAccessor ad,
			HDataClassSmell smell) {
		return new Object[] { ad, smell };
	}

	public static final Object[] pattern_HDataClassAccessorDetector_0_6_ActivityNode52_greenBB(HDataClassAccessor ad,
			HDataClassSmell smell) {
		ad.getHDataClassSmells().add(smell);
		smell.getPartOf().add(ad);
		return new Object[] { ad, smell };
	}

	public static final HAnnotation pattern_HDataClassAccessorDetector_0_7_expressionFB(HDataClassAccessor ad) {
		HAnnotation _result = ad;
		return _result;
	}

	public static final HAnnotation pattern_HDataClassAccessorDetector_0_8_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Data Class Accessor Smell";
	}

	// [user code injected with eMoflon] -->
} //HDataClassAccessorDetectorImpl
