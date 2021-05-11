/**
 */
package org.gravity.hulk.antipatterngraph.metrics.security;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.gravity.hulk.antipatterngraph.metrics.security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/antipatterngraph#//metrics/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.hulk.antipatterngraph.metrics.security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = org.gravity.hulk.antipatterngraph.metrics.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.metrics.security.impl.CriticalClassRatioImpl <em>Critical Class Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.metrics.security.impl.CriticalClassRatioImpl
	 * @see org.gravity.hulk.antipatterngraph.metrics.security.impl.SecurityPackageImpl#getCriticalClassRatio()
	 * @generated
	 */
	int CRITICAL_CLASS_RATIO = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>Critical Class Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___ECLASS = AntipatterngraphPackage.HMETRIC___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___EIS_PROXY = AntipatterngraphPackage.HMETRIC___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___ERESOURCE = AntipatterngraphPackage.HMETRIC___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___ECONTAINER = AntipatterngraphPackage.HMETRIC___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___ECONTAINING_FEATURE = AntipatterngraphPackage.HMETRIC___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HMETRIC___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___ECONTENTS = AntipatterngraphPackage.HMETRIC___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___EALL_CONTENTS = AntipatterngraphPackage.HMETRIC___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___ECROSS_REFERENCES = AntipatterngraphPackage.HMETRIC___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HMETRIC___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HMETRIC___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HMETRIC___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HMETRIC___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HMETRIC___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HMETRIC___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___GET_VALUE__STRING = AntipatterngraphPackage.HMETRIC___GET_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>Critical Class Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_CLASS_RATIO_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.metrics.security.CriticalClassRatio <em>Critical Class Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Critical Class Ratio</em>'.
	 * @see org.gravity.hulk.antipatterngraph.metrics.security.CriticalClassRatio
	 * @generated
	 */
	EClass getCriticalClassRatio();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.metrics.security.impl.CriticalClassRatioImpl <em>Critical Class Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.metrics.security.impl.CriticalClassRatioImpl
		 * @see org.gravity.hulk.antipatterngraph.metrics.security.impl.SecurityPackageImpl#getCriticalClassRatio()
		 * @generated
		 */
		EClass CRITICAL_CLASS_RATIO = eINSTANCE.getCriticalClassRatio();

	}

} //SecurityPackage
