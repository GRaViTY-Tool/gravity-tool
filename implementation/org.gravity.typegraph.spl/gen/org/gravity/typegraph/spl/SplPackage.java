/**
 */
package org.gravity.typegraph.spl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;

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
 * <!-- begin-model-doc -->
 * TODO: Add documentation for spl. Hint: You may copy this element in the Ecore editor to add documentation to EClasses, EOperations, ...
 * <!-- end-model-doc -->
 * @see org.gravity.typegraph.spl.SplFactory
 * @model kind="package"
 * @generated
 */
public interface SplPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/spl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.typegraph.spl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SplPackage eINSTANCE = org.gravity.typegraph.spl.impl.SplPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.spl.impl.TPresenceConditionImpl <em>TPresence Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.spl.impl.TPresenceConditionImpl
	 * @see org.gravity.typegraph.spl.impl.SplPackageImpl#getTPresenceCondition()
	 * @generated
	 */
	int TPRESENCE_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION__TANNOTATED = AnnotationsPackage.TANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION__TYPE = AnnotationsPackage.TANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION__TVALUES = AnnotationsPackage.TANNOTATION__TVALUES;

	/**
	 * The feature id for the '<em><b>Pc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION__PC = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TPresence Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION_FEATURE_COUNT = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___ECLASS = AnnotationsPackage.TANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___EIS_PROXY = AnnotationsPackage.TANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___ERESOURCE = AnnotationsPackage.TANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___ECONTAINER = AnnotationsPackage.TANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___ECONTAINING_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___ECONTAINMENT_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___ECONTENTS = AnnotationsPackage.TANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___EALL_CONTENTS = AnnotationsPackage.TANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___ECROSS_REFERENCES = AnnotationsPackage.TANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___EGET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___ESET__ESTRUCTURALFEATURE_OBJECT = AnnotationsPackage.TANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___EIS_SET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___EUNSET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___EINVOKE__EOPERATION_ELIST = AnnotationsPackage.TANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION___GET_VALUE__STRING = AnnotationsPackage.TANNOTATION___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TPresence Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRESENCE_CONDITION_OPERATION_COUNT = AnnotationsPackage.TANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.spl.TPresenceCondition <em>TPresence Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPresence Condition</em>'.
	 * @see org.gravity.typegraph.spl.TPresenceCondition
	 * @generated
	 */
	EClass getTPresenceCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.spl.TPresenceCondition#getPc <em>Pc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pc</em>'.
	 * @see org.gravity.typegraph.spl.TPresenceCondition#getPc()
	 * @see #getTPresenceCondition()
	 * @generated
	 */
	EAttribute getTPresenceCondition_Pc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SplFactory getSplFactory();

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
		 * The meta object literal for the '{@link org.gravity.typegraph.spl.impl.TPresenceConditionImpl <em>TPresence Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.spl.impl.TPresenceConditionImpl
		 * @see org.gravity.typegraph.spl.impl.SplPackageImpl#getTPresenceCondition()
		 * @generated
		 */
		EClass TPRESENCE_CONDITION = eINSTANCE.getTPresenceCondition();

		/**
		 * The meta object literal for the '<em><b>Pc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPRESENCE_CONDITION__PC = eINSTANCE.getTPresenceCondition_Pc();

	}

} //SplPackage
