/**
 */
package org.gravity.hulk.refactoringgraph.refactorings;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactorings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.hulk.refactoringgraph/model/Refactoringgraph.ecore#//refactorings";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refactorings";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringsPackage eINSTANCE = org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HRefactoringImpl <em>HRefactoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HRefactoringImpl
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHRefactoring()
	 * @generated
	 */
	int HREFACTORING = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HRefactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___ECLASS = AntipatterngraphPackage.HMETRIC___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___EIS_PROXY = AntipatterngraphPackage.HMETRIC___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___ERESOURCE = AntipatterngraphPackage.HMETRIC___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___ECONTAINER = AntipatterngraphPackage.HMETRIC___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___ECONTAINING_FEATURE = AntipatterngraphPackage.HMETRIC___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HMETRIC___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___ECONTENTS = AntipatterngraphPackage.HMETRIC___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___EALL_CONTENTS = AntipatterngraphPackage.HMETRIC___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___ECROSS_REFERENCES = AntipatterngraphPackage.HMETRIC___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HMETRIC___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HMETRIC___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HMETRIC___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HMETRIC___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HMETRIC___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HMETRIC___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HRefactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREFACTORING_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMemberImpl <em>HMove Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMemberImpl
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHMoveMember()
	 * @generated
	 */
	int HMOVE_MEMBER = 3;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__TANNOTATED = HREFACTORING__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__TYPE = HREFACTORING__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__TVALUES = HREFACTORING__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__APG = HREFACTORING__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__PART_OF = HREFACTORING__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__CHANGED = HREFACTORING__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__VALUE = HREFACTORING__VALUE;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__SOURCE_CLASS = HREFACTORING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__TARGET_CLASS = HREFACTORING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>M2dc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__M2DC = HREFACTORING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iba</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__IBA = HREFACTORING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>TSignature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER__TSIGNATURE = HREFACTORING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>HMove Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER_FEATURE_COUNT = HREFACTORING_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___ECLASS = HREFACTORING___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___EIS_PROXY = HREFACTORING___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___ERESOURCE = HREFACTORING___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___ECONTAINER = HREFACTORING___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___ECONTAINING_FEATURE = HREFACTORING___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___ECONTAINMENT_FEATURE = HREFACTORING___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___ECONTENTS = HREFACTORING___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___EALL_CONTENTS = HREFACTORING___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___ECROSS_REFERENCES = HREFACTORING___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___EGET__ESTRUCTURALFEATURE = HREFACTORING___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___EGET__ESTRUCTURALFEATURE_BOOLEAN = HREFACTORING___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___ESET__ESTRUCTURALFEATURE_OBJECT = HREFACTORING___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___EIS_SET__ESTRUCTURALFEATURE = HREFACTORING___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___EUNSET__ESTRUCTURALFEATURE = HREFACTORING___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___EINVOKE__EOPERATION_ELIST = HREFACTORING___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___GET_RELATIVE_AMOUNT = HREFACTORING___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER___INCREMENT = HREFACTORING___INCREMENT;

	/**
	 * The number of operations of the '<em>HMove Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBER_OPERATION_COUNT = HREFACTORING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMethodImpl <em>HMove Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMethodImpl
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHMoveMethod()
	 * @generated
	 */
	int HMOVE_METHOD = 1;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__TANNOTATED = HMOVE_MEMBER__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__TYPE = HMOVE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__TVALUES = HMOVE_MEMBER__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__APG = HMOVE_MEMBER__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__PART_OF = HMOVE_MEMBER__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__CHANGED = HMOVE_MEMBER__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__VALUE = HMOVE_MEMBER__VALUE;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__SOURCE_CLASS = HMOVE_MEMBER__SOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__TARGET_CLASS = HMOVE_MEMBER__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>M2dc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__M2DC = HMOVE_MEMBER__M2DC;

	/**
	 * The feature id for the '<em><b>Iba</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__IBA = HMOVE_MEMBER__IBA;

	/**
	 * The feature id for the '<em><b>TSignature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD__TSIGNATURE = HMOVE_MEMBER__TSIGNATURE;

	/**
	 * The number of structural features of the '<em>HMove Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD_FEATURE_COUNT = HMOVE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___ECLASS = HMOVE_MEMBER___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___EIS_PROXY = HMOVE_MEMBER___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___ERESOURCE = HMOVE_MEMBER___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___ECONTAINER = HMOVE_MEMBER___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___ECONTAINING_FEATURE = HMOVE_MEMBER___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___ECONTAINMENT_FEATURE = HMOVE_MEMBER___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___ECONTENTS = HMOVE_MEMBER___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___EALL_CONTENTS = HMOVE_MEMBER___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___ECROSS_REFERENCES = HMOVE_MEMBER___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___EGET__ESTRUCTURALFEATURE = HMOVE_MEMBER___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___EGET__ESTRUCTURALFEATURE_BOOLEAN = HMOVE_MEMBER___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___ESET__ESTRUCTURALFEATURE_OBJECT = HMOVE_MEMBER___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___EIS_SET__ESTRUCTURALFEATURE = HMOVE_MEMBER___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___EUNSET__ESTRUCTURALFEATURE = HMOVE_MEMBER___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___EINVOKE__EOPERATION_ELIST = HMOVE_MEMBER___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___GET_RELATIVE_AMOUNT = HMOVE_MEMBER___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD___INCREMENT = HMOVE_MEMBER___INCREMENT;

	/**
	 * The number of operations of the '<em>HMove Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_METHOD_OPERATION_COUNT = HMOVE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HExtractClassImpl <em>HExtract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HExtractClassImpl
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHExtractClass()
	 * @generated
	 */
	int HEXTRACT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS__TANNOTATED = HREFACTORING__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS__TYPE = HREFACTORING__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS__TVALUES = HREFACTORING__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS__APG = HREFACTORING__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS__PART_OF = HREFACTORING__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS__CHANGED = HREFACTORING__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS__VALUE = HREFACTORING__VALUE;

	/**
	 * The feature id for the '<em><b>TMembers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS__TMEMBERS = HREFACTORING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HExtract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS_FEATURE_COUNT = HREFACTORING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___ECLASS = HREFACTORING___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___EIS_PROXY = HREFACTORING___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___ERESOURCE = HREFACTORING___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___ECONTAINER = HREFACTORING___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___ECONTAINING_FEATURE = HREFACTORING___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___ECONTAINMENT_FEATURE = HREFACTORING___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___ECONTENTS = HREFACTORING___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___EALL_CONTENTS = HREFACTORING___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___ECROSS_REFERENCES = HREFACTORING___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___EGET__ESTRUCTURALFEATURE = HREFACTORING___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN = HREFACTORING___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT = HREFACTORING___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___EIS_SET__ESTRUCTURALFEATURE = HREFACTORING___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___EUNSET__ESTRUCTURALFEATURE = HREFACTORING___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___EINVOKE__EOPERATION_ELIST = HREFACTORING___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___GET_RELATIVE_AMOUNT = HREFACTORING___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___INCREMENT = HREFACTORING___INCREMENT;

	/**
	 * The operation id for the '<em>Get Avg Iba</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS___GET_AVG_IBA = HREFACTORING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>HExtract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXTRACT_CLASS_OPERATION_COUNT = HREFACTORING_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveFieldImpl <em>HMove Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveFieldImpl
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHMoveField()
	 * @generated
	 */
	int HMOVE_FIELD = 4;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__TANNOTATED = HMOVE_MEMBER__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__TYPE = HMOVE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__TVALUES = HMOVE_MEMBER__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__APG = HMOVE_MEMBER__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__PART_OF = HMOVE_MEMBER__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__CHANGED = HMOVE_MEMBER__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__VALUE = HMOVE_MEMBER__VALUE;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__SOURCE_CLASS = HMOVE_MEMBER__SOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__TARGET_CLASS = HMOVE_MEMBER__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>M2dc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__M2DC = HMOVE_MEMBER__M2DC;

	/**
	 * The feature id for the '<em><b>Iba</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__IBA = HMOVE_MEMBER__IBA;

	/**
	 * The feature id for the '<em><b>TSignature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD__TSIGNATURE = HMOVE_MEMBER__TSIGNATURE;

	/**
	 * The number of structural features of the '<em>HMove Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD_FEATURE_COUNT = HMOVE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___ECLASS = HMOVE_MEMBER___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___EIS_PROXY = HMOVE_MEMBER___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___ERESOURCE = HMOVE_MEMBER___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___ECONTAINER = HMOVE_MEMBER___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___ECONTAINING_FEATURE = HMOVE_MEMBER___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___ECONTAINMENT_FEATURE = HMOVE_MEMBER___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___ECONTENTS = HMOVE_MEMBER___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___EALL_CONTENTS = HMOVE_MEMBER___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___ECROSS_REFERENCES = HMOVE_MEMBER___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___EGET__ESTRUCTURALFEATURE = HMOVE_MEMBER___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___EGET__ESTRUCTURALFEATURE_BOOLEAN = HMOVE_MEMBER___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___ESET__ESTRUCTURALFEATURE_OBJECT = HMOVE_MEMBER___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___EIS_SET__ESTRUCTURALFEATURE = HMOVE_MEMBER___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___EUNSET__ESTRUCTURALFEATURE = HMOVE_MEMBER___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___EINVOKE__EOPERATION_ELIST = HMOVE_MEMBER___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___GET_RELATIVE_AMOUNT = HMOVE_MEMBER___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD___INCREMENT = HMOVE_MEMBER___INCREMENT;

	/**
	 * The number of operations of the '<em>HMove Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_FIELD_OPERATION_COUNT = HMOVE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMembersImpl <em>HMove Members</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMembersImpl
	 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHMoveMembers()
	 * @generated
	 */
	int HMOVE_MEMBERS = 5;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__TANNOTATED = HREFACTORING__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__TYPE = HREFACTORING__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__TVALUES = HREFACTORING__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__APG = HREFACTORING__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__PART_OF = HREFACTORING__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__CHANGED = HREFACTORING__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__VALUE = HREFACTORING__VALUE;

	/**
	 * The feature id for the '<em><b>HMove Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__HMOVE_MEMBERS = HREFACTORING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__TARGET_CLASS = HREFACTORING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS__SOURCE_CLASS = HREFACTORING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HMove Members</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS_FEATURE_COUNT = HREFACTORING_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___ECLASS = HREFACTORING___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___EIS_PROXY = HREFACTORING___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___ERESOURCE = HREFACTORING___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___ECONTAINER = HREFACTORING___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___ECONTAINING_FEATURE = HREFACTORING___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___ECONTAINMENT_FEATURE = HREFACTORING___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___ECONTENTS = HREFACTORING___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___EALL_CONTENTS = HREFACTORING___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___ECROSS_REFERENCES = HREFACTORING___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___EGET__ESTRUCTURALFEATURE = HREFACTORING___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___EGET__ESTRUCTURALFEATURE_BOOLEAN = HREFACTORING___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___ESET__ESTRUCTURALFEATURE_OBJECT = HREFACTORING___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___EIS_SET__ESTRUCTURALFEATURE = HREFACTORING___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___EUNSET__ESTRUCTURALFEATURE = HREFACTORING___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___EINVOKE__EOPERATION_ELIST = HREFACTORING___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___GET_RELATIVE_AMOUNT = HREFACTORING___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS___INCREMENT = HREFACTORING___INCREMENT;

	/**
	 * The number of operations of the '<em>HMove Members</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMOVE_MEMBERS_OPERATION_COUNT = HREFACTORING_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.refactorings.HRefactoring <em>HRefactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HRefactoring</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HRefactoring
	 * @generated
	 */
	EClass getHRefactoring();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod <em>HMove Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMove Method</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod
	 * @generated
	 */
	EClass getHMoveMethod();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.refactorings.HExtractClass <em>HExtract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HExtract Class</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HExtractClass
	 * @generated
	 */
	EClass getHExtractClass();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.refactoringgraph.refactorings.HExtractClass#getTMembers <em>TMembers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TMembers</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HExtractClass#getTMembers()
	 * @see #getHExtractClass()
	 * @generated
	 */
	EReference getHExtractClass_TMembers();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.refactoringgraph.refactorings.HExtractClass#getAvgIba() <em>Get Avg Iba</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Avg Iba</em>' operation.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HExtractClass#getAvgIba()
	 * @generated
	 */
	EOperation getHExtractClass__GetAvgIba();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember <em>HMove Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMove Member</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMember
	 * @generated
	 */
	EClass getHMoveMember();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getSourceClass()
	 * @see #getHMoveMember()
	 * @generated
	 */
	EReference getHMoveMember_SourceClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getTargetClass()
	 * @see #getHMoveMember()
	 * @generated
	 */
	EReference getHMoveMember_TargetClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getM2dc <em>M2dc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>M2dc</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getM2dc()
	 * @see #getHMoveMember()
	 * @generated
	 */
	EReference getHMoveMember_M2dc();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getIba <em>Iba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iba</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getIba()
	 * @see #getHMoveMember()
	 * @generated
	 */
	EReference getHMoveMember_Iba();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getTSignature <em>TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TSignature</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getTSignature()
	 * @see #getHMoveMember()
	 * @generated
	 */
	EReference getHMoveMember_TSignature();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveField <em>HMove Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMove Field</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveField
	 * @generated
	 */
	EClass getHMoveField();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers <em>HMove Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMove Members</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers
	 * @generated
	 */
	EClass getHMoveMembers();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getHMoveMembers <em>HMove Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HMove Members</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getHMoveMembers()
	 * @see #getHMoveMembers()
	 * @generated
	 */
	EReference getHMoveMembers_HMoveMembers();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getTargetClass()
	 * @see #getHMoveMembers()
	 * @generated
	 */
	EReference getHMoveMembers_TargetClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getSourceClass()
	 * @see #getHMoveMembers()
	 * @generated
	 */
	EReference getHMoveMembers_SourceClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefactoringsFactory getRefactoringsFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HRefactoringImpl <em>HRefactoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HRefactoringImpl
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHRefactoring()
		 * @generated
		 */
		EClass HREFACTORING = eINSTANCE.getHRefactoring();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMethodImpl <em>HMove Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMethodImpl
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHMoveMethod()
		 * @generated
		 */
		EClass HMOVE_METHOD = eINSTANCE.getHMoveMethod();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HExtractClassImpl <em>HExtract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HExtractClassImpl
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHExtractClass()
		 * @generated
		 */
		EClass HEXTRACT_CLASS = eINSTANCE.getHExtractClass();

		/**
		 * The meta object literal for the '<em><b>TMembers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEXTRACT_CLASS__TMEMBERS = eINSTANCE.getHExtractClass_TMembers();

		/**
		 * The meta object literal for the '<em><b>Get Avg Iba</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEXTRACT_CLASS___GET_AVG_IBA = eINSTANCE.getHExtractClass__GetAvgIba();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMemberImpl <em>HMove Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMemberImpl
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHMoveMember()
		 * @generated
		 */
		EClass HMOVE_MEMBER = eINSTANCE.getHMoveMember();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMOVE_MEMBER__SOURCE_CLASS = eINSTANCE.getHMoveMember_SourceClass();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMOVE_MEMBER__TARGET_CLASS = eINSTANCE.getHMoveMember_TargetClass();

		/**
		 * The meta object literal for the '<em><b>M2dc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMOVE_MEMBER__M2DC = eINSTANCE.getHMoveMember_M2dc();

		/**
		 * The meta object literal for the '<em><b>Iba</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMOVE_MEMBER__IBA = eINSTANCE.getHMoveMember_Iba();

		/**
		 * The meta object literal for the '<em><b>TSignature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMOVE_MEMBER__TSIGNATURE = eINSTANCE.getHMoveMember_TSignature();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveFieldImpl <em>HMove Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveFieldImpl
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHMoveField()
		 * @generated
		 */
		EClass HMOVE_FIELD = eINSTANCE.getHMoveField();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMembersImpl <em>HMove Members</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.HMoveMembersImpl
		 * @see org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsPackageImpl#getHMoveMembers()
		 * @generated
		 */
		EClass HMOVE_MEMBERS = eINSTANCE.getHMoveMembers();

		/**
		 * The meta object literal for the '<em><b>HMove Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMOVE_MEMBERS__HMOVE_MEMBERS = eINSTANCE.getHMoveMembers_HMoveMembers();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMOVE_MEMBERS__TARGET_CLASS = eINSTANCE.getHMoveMembers_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMOVE_MEMBERS__SOURCE_CLASS = eINSTANCE.getHMoveMembers_SourceClass();

	}

} //RefactoringsPackage
