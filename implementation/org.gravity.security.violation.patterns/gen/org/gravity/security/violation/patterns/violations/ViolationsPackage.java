/**
 */
package org.gravity.security.violation.patterns.violations;

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
 * @see org.gravity.security.violation.patterns.violations.ViolationsFactory
 * @model kind="package"
 * @generated
 */
public interface ViolationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "violations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/security.violation.pattern/violations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.security.violation.pattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViolationsPackage eINSTANCE = org.gravity.security.violation.patterns.violations.impl.ViolationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.security.violation.patterns.violations.impl.SecureDependencyViolationImpl <em>Secure Dependency Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.security.violation.patterns.violations.impl.SecureDependencyViolationImpl
	 * @see org.gravity.security.violation.patterns.violations.impl.ViolationsPackageImpl#getSecureDependencyViolation()
	 * @generated
	 */
	int SECURE_DEPENDENCY_VIOLATION = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION__TANNOTATED = AntipatterngraphPackage.HANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION__TYPE = AntipatterngraphPackage.HANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION__TVALUES = AntipatterngraphPackage.HANNOTATION__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION__APG = AntipatterngraphPackage.HANNOTATION__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION__PART_OF = AntipatterngraphPackage.HANNOTATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION__CHANGED = AntipatterngraphPackage.HANNOTATION__CHANGED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION__SOURCE = AntipatterngraphPackage.HANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION__TARGET = AntipatterngraphPackage.HANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION__REQUIREMENT = AntipatterngraphPackage.HANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Secure Dependency Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION_FEATURE_COUNT = AntipatterngraphPackage.HANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___ECLASS = AntipatterngraphPackage.HANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___EIS_PROXY = AntipatterngraphPackage.HANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___ERESOURCE = AntipatterngraphPackage.HANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___ECONTAINER = AntipatterngraphPackage.HANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___ECONTAINING_FEATURE = AntipatterngraphPackage.HANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___ECONTENTS = AntipatterngraphPackage.HANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___EALL_CONTENTS = AntipatterngraphPackage.HANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___ECROSS_REFERENCES = AntipatterngraphPackage.HANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION___GET_VALUE__STRING = AntipatterngraphPackage.HANNOTATION___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>Secure Dependency Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_DEPENDENCY_VIOLATION_OPERATION_COUNT = AntipatterngraphPackage.HANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation <em>Secure Dependency Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secure Dependency Violation</em>'.
	 * @see org.gravity.security.violation.patterns.violations.SecureDependencyViolation
	 * @generated
	 */
	EClass getSecureDependencyViolation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getSource()
	 * @see #getSecureDependencyViolation()
	 * @generated
	 */
	EReference getSecureDependencyViolation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getTarget()
	 * @see #getSecureDependencyViolation()
	 * @generated
	 */
	EReference getSecureDependencyViolation_Target();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getRequirement()
	 * @see #getSecureDependencyViolation()
	 * @generated
	 */
	EReference getSecureDependencyViolation_Requirement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViolationsFactory getViolationsFactory();

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
		 * The meta object literal for the '{@link org.gravity.security.violation.patterns.violations.impl.SecureDependencyViolationImpl <em>Secure Dependency Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.security.violation.patterns.violations.impl.SecureDependencyViolationImpl
		 * @see org.gravity.security.violation.patterns.violations.impl.ViolationsPackageImpl#getSecureDependencyViolation()
		 * @generated
		 */
		EClass SECURE_DEPENDENCY_VIOLATION = eINSTANCE.getSecureDependencyViolation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURE_DEPENDENCY_VIOLATION__SOURCE = eINSTANCE.getSecureDependencyViolation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURE_DEPENDENCY_VIOLATION__TARGET = eINSTANCE.getSecureDependencyViolation_Target();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURE_DEPENDENCY_VIOLATION__REQUIREMENT = eINSTANCE.getSecureDependencyViolation_Requirement();

	}

} //ViolationsPackage
