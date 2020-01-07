/**
 */
package org.gravity.hulk.antipatterngraph.antipattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory
 * @model kind="package"
 * @generated
 */
public interface AntipatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "antipattern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/antipatterngraph#//antipattern";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "antipattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntipatternPackage eINSTANCE = org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HBlobAntiPatternImpl <em>HBlob Anti Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.HBlobAntiPatternImpl
	 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl#getHBlobAntiPattern()
	 * @generated
	 */
	int HBLOB_ANTI_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN__TANNOTATED = AntipatterngraphPackage.HANTI_PATTERN__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN__TYPE = AntipatterngraphPackage.HANTI_PATTERN__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN__TVALUES = AntipatterngraphPackage.HANTI_PATTERN__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN__APG = AntipatterngraphPackage.HANTI_PATTERN__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN__PART_OF = AntipatterngraphPackage.HANTI_PATTERN__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN__CHANGED = AntipatterngraphPackage.HANTI_PATTERN__CHANGED;

	/**
	 * The feature id for the '<em><b>HData Class Smells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN__HDATA_CLASS_SMELLS = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HGod Class Anti Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN__HGOD_CLASS_ANTI_PATTERN = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HBlob Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN_FEATURE_COUNT = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>HBlob Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_ANTI_PATTERN_OPERATION_COUNT = AntipatterngraphPackage.HANTI_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HGodClassAntiPatternImpl <em>HGod Class Anti Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.HGodClassAntiPatternImpl
	 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl#getHGodClassAntiPattern()
	 * @generated
	 */
	int HGOD_CLASS_ANTI_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN__TANNOTATED = AntipatterngraphPackage.HANTI_PATTERN__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN__TYPE = AntipatterngraphPackage.HANTI_PATTERN__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN__TVALUES = AntipatterngraphPackage.HANTI_PATTERN__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN__APG = AntipatterngraphPackage.HANTI_PATTERN__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN__PART_OF = AntipatterngraphPackage.HANTI_PATTERN__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN__CHANGED = AntipatterngraphPackage.HANTI_PATTERN__CHANGED;

	/**
	 * The feature id for the '<em><b>HLarge Class Low Cohesion Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN__HLARGE_CLASS_LOW_COHESION_SMELL = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>HController Class Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN__HCONTROLLER_CLASS_SMELL = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HGod Class Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN_FEATURE_COUNT = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>HGod Class Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGOD_CLASS_ANTI_PATTERN_OPERATION_COUNT = AntipatterngraphPackage.HANTI_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSwissArmyKnifeAntiPatternImpl <em>HSwiss Army Knife Anti Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.HSwissArmyKnifeAntiPatternImpl
	 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl#getHSwissArmyKnifeAntiPattern()
	 * @generated
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN__TANNOTATED = AntipatterngraphPackage.HANTI_PATTERN__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN__TYPE = AntipatterngraphPackage.HANTI_PATTERN__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN__TVALUES = AntipatterngraphPackage.HANTI_PATTERN__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN__APG = AntipatterngraphPackage.HANTI_PATTERN__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN__PART_OF = AntipatterngraphPackage.HANTI_PATTERN__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN__CHANGED = AntipatterngraphPackage.HANTI_PATTERN__CHANGED;

	/**
	 * The feature id for the '<em><b>HIncomming Invocation Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN__HINCOMMING_INVOCATION_CUSTOM_METRIC = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>HLarge Class Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN__HLARGE_CLASS_SMELL = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HMuch Overloading Code Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN__HMUCH_OVERLOADING_CODE_SMELL = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>HSwiss Army Knife Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN_FEATURE_COUNT = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>HSwiss Army Knife Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSWISS_ARMY_KNIFE_ANTI_PATTERN_OPERATION_COUNT = AntipatterngraphPackage.HANTI_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSpaghettiCodeAntiPatternImpl <em>HSpaghetti Code Anti Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.HSpaghettiCodeAntiPatternImpl
	 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl#getHSpaghettiCodeAntiPattern()
	 * @generated
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__TANNOTATED = AntipatterngraphPackage.HANTI_PATTERN__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__TYPE = AntipatterngraphPackage.HANTI_PATTERN__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__TVALUES = AntipatterngraphPackage.HANTI_PATTERN__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__APG = AntipatterngraphPackage.HANTI_PATTERN__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__PART_OF = AntipatterngraphPackage.HANTI_PATTERN__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__CHANGED = AntipatterngraphPackage.HANTI_PATTERN__CHANGED;

	/**
	 * The feature id for the '<em><b>HDepth Of Inheritance Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__HDEPTH_OF_INHERITANCE_METRIC = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>HIntense Field Usage Code Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__HINTENSE_FIELD_USAGE_CODE_SMELL = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>HAverage Overloading In Class Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_OVERLOADING_IN_CLASS_METRIC = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>HAverage Parameters Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_PARAMETERS_METRIC = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>HNumber Of Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN__HNUMBER_OF_CHILD = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>HSpaghetti Code Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN_FEATURE_COUNT = AntipatterngraphPackage.HANTI_PATTERN_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>HSpaghetti Code Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPAGHETTI_CODE_ANTI_PATTERN_OPERATION_COUNT = AntipatterngraphPackage.HANTI_PATTERN_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern <em>HBlob Anti Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HBlob Anti Pattern</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern
	 * @generated
	 */
	EClass getHBlobAntiPattern();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern#getHDataClassSmells <em>HData Class Smells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HData Class Smells</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern#getHDataClassSmells()
	 * @see #getHBlobAntiPattern()
	 * @generated
	 */
	EReference getHBlobAntiPattern_HDataClassSmells();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern#getHGodClassAntiPattern <em>HGod Class Anti Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HGod Class Anti Pattern</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern#getHGodClassAntiPattern()
	 * @see #getHBlobAntiPattern()
	 * @generated
	 */
	EReference getHBlobAntiPattern_HGodClassAntiPattern();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern <em>HGod Class Anti Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HGod Class Anti Pattern</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern
	 * @generated
	 */
	EClass getHGodClassAntiPattern();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHLargeClassLowCohesionSmell <em>HLarge Class Low Cohesion Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLarge Class Low Cohesion Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHLargeClassLowCohesionSmell()
	 * @see #getHGodClassAntiPattern()
	 * @generated
	 */
	EReference getHGodClassAntiPattern_HLargeClassLowCohesionSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHControllerClassSmell <em>HController Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HController Class Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHControllerClassSmell()
	 * @see #getHGodClassAntiPattern()
	 * @generated
	 */
	EReference getHGodClassAntiPattern_HControllerClassSmell();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern <em>HSwiss Army Knife Anti Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSwiss Army Knife Anti Pattern</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern
	 * @generated
	 */
	EClass getHSwissArmyKnifeAntiPattern();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern#getHIncommingInvocationCustomMetric <em>HIncomming Invocation Custom Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HIncomming Invocation Custom Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern#getHIncommingInvocationCustomMetric()
	 * @see #getHSwissArmyKnifeAntiPattern()
	 * @generated
	 */
	EReference getHSwissArmyKnifeAntiPattern_HIncommingInvocationCustomMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern#getHLargeClassSmell <em>HLarge Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLarge Class Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern#getHLargeClassSmell()
	 * @see #getHSwissArmyKnifeAntiPattern()
	 * @generated
	 */
	EReference getHSwissArmyKnifeAntiPattern_HLargeClassSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern#getHMuchOverloadingCodeSmell <em>HMuch Overloading Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HMuch Overloading Code Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern#getHMuchOverloadingCodeSmell()
	 * @see #getHSwissArmyKnifeAntiPattern()
	 * @generated
	 */
	EReference getHSwissArmyKnifeAntiPattern_HMuchOverloadingCodeSmell();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern <em>HSpaghetti Code Anti Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSpaghetti Code Anti Pattern</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern
	 * @generated
	 */
	EClass getHSpaghettiCodeAntiPattern();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHDepthOfInheritanceMetric <em>HDepth Of Inheritance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HDepth Of Inheritance Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHDepthOfInheritanceMetric()
	 * @see #getHSpaghettiCodeAntiPattern()
	 * @generated
	 */
	EReference getHSpaghettiCodeAntiPattern_HDepthOfInheritanceMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHIntenseFieldUsageCodeSmell <em>HIntense Field Usage Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HIntense Field Usage Code Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHIntenseFieldUsageCodeSmell()
	 * @see #getHSpaghettiCodeAntiPattern()
	 * @generated
	 */
	EReference getHSpaghettiCodeAntiPattern_HIntenseFieldUsageCodeSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHAverageOverloadingInClassMetric <em>HAverage Overloading In Class Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HAverage Overloading In Class Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHAverageOverloadingInClassMetric()
	 * @see #getHSpaghettiCodeAntiPattern()
	 * @generated
	 */
	EReference getHSpaghettiCodeAntiPattern_HAverageOverloadingInClassMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHAverageParametersMetric <em>HAverage Parameters Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HAverage Parameters Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHAverageParametersMetric()
	 * @see #getHSpaghettiCodeAntiPattern()
	 * @generated
	 */
	EReference getHSpaghettiCodeAntiPattern_HAverageParametersMetric();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHNumberOfChild <em>HNumber Of Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Child</em>'.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern#getHNumberOfChild()
	 * @see #getHSpaghettiCodeAntiPattern()
	 * @generated
	 */
	EReference getHSpaghettiCodeAntiPattern_HNumberOfChild();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AntipatternFactory getAntipatternFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HBlobAntiPatternImpl <em>HBlob Anti Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.HBlobAntiPatternImpl
		 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl#getHBlobAntiPattern()
		 * @generated
		 */
		EClass HBLOB_ANTI_PATTERN = eINSTANCE.getHBlobAntiPattern();

		/**
		 * The meta object literal for the '<em><b>HData Class Smells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBLOB_ANTI_PATTERN__HDATA_CLASS_SMELLS = eINSTANCE.getHBlobAntiPattern_HDataClassSmells();

		/**
		 * The meta object literal for the '<em><b>HGod Class Anti Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBLOB_ANTI_PATTERN__HGOD_CLASS_ANTI_PATTERN = eINSTANCE.getHBlobAntiPattern_HGodClassAntiPattern();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HGodClassAntiPatternImpl <em>HGod Class Anti Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.HGodClassAntiPatternImpl
		 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl#getHGodClassAntiPattern()
		 * @generated
		 */
		EClass HGOD_CLASS_ANTI_PATTERN = eINSTANCE.getHGodClassAntiPattern();

		/**
		 * The meta object literal for the '<em><b>HLarge Class Low Cohesion Smell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HGOD_CLASS_ANTI_PATTERN__HLARGE_CLASS_LOW_COHESION_SMELL = eINSTANCE
				.getHGodClassAntiPattern_HLargeClassLowCohesionSmell();

		/**
		 * The meta object literal for the '<em><b>HController Class Smell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HGOD_CLASS_ANTI_PATTERN__HCONTROLLER_CLASS_SMELL = eINSTANCE
				.getHGodClassAntiPattern_HControllerClassSmell();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSwissArmyKnifeAntiPatternImpl <em>HSwiss Army Knife Anti Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.HSwissArmyKnifeAntiPatternImpl
		 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl#getHSwissArmyKnifeAntiPattern()
		 * @generated
		 */
		EClass HSWISS_ARMY_KNIFE_ANTI_PATTERN = eINSTANCE.getHSwissArmyKnifeAntiPattern();

		/**
		 * The meta object literal for the '<em><b>HIncomming Invocation Custom Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSWISS_ARMY_KNIFE_ANTI_PATTERN__HINCOMMING_INVOCATION_CUSTOM_METRIC = eINSTANCE
				.getHSwissArmyKnifeAntiPattern_HIncommingInvocationCustomMetric();

		/**
		 * The meta object literal for the '<em><b>HLarge Class Smell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSWISS_ARMY_KNIFE_ANTI_PATTERN__HLARGE_CLASS_SMELL = eINSTANCE
				.getHSwissArmyKnifeAntiPattern_HLargeClassSmell();

		/**
		 * The meta object literal for the '<em><b>HMuch Overloading Code Smell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSWISS_ARMY_KNIFE_ANTI_PATTERN__HMUCH_OVERLOADING_CODE_SMELL = eINSTANCE
				.getHSwissArmyKnifeAntiPattern_HMuchOverloadingCodeSmell();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.antipattern.impl.HSpaghettiCodeAntiPatternImpl <em>HSpaghetti Code Anti Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.HSpaghettiCodeAntiPatternImpl
		 * @see org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl#getHSpaghettiCodeAntiPattern()
		 * @generated
		 */
		EClass HSPAGHETTI_CODE_ANTI_PATTERN = eINSTANCE.getHSpaghettiCodeAntiPattern();

		/**
		 * The meta object literal for the '<em><b>HDepth Of Inheritance Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPAGHETTI_CODE_ANTI_PATTERN__HDEPTH_OF_INHERITANCE_METRIC = eINSTANCE
				.getHSpaghettiCodeAntiPattern_HDepthOfInheritanceMetric();

		/**
		 * The meta object literal for the '<em><b>HIntense Field Usage Code Smell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPAGHETTI_CODE_ANTI_PATTERN__HINTENSE_FIELD_USAGE_CODE_SMELL = eINSTANCE
				.getHSpaghettiCodeAntiPattern_HIntenseFieldUsageCodeSmell();

		/**
		 * The meta object literal for the '<em><b>HAverage Overloading In Class Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_OVERLOADING_IN_CLASS_METRIC = eINSTANCE
				.getHSpaghettiCodeAntiPattern_HAverageOverloadingInClassMetric();

		/**
		 * The meta object literal for the '<em><b>HAverage Parameters Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPAGHETTI_CODE_ANTI_PATTERN__HAVERAGE_PARAMETERS_METRIC = eINSTANCE
				.getHSpaghettiCodeAntiPattern_HAverageParametersMetric();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPAGHETTI_CODE_ANTI_PATTERN__HNUMBER_OF_CHILD = eINSTANCE
				.getHSpaghettiCodeAntiPattern_HNumberOfChild();

	}

} //AntipatternPackage
