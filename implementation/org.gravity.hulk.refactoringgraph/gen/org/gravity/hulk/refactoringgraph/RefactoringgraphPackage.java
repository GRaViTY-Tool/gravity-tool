/**
 */
package org.gravity.hulk.refactoringgraph;

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
 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringgraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refactoringgraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.hulk.refactoringgraph/model/Refactoringgraph.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.hulk.refactoringgraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringgraphPackage eINSTANCE = org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.impl.HMethodToDataClassAccessImpl <em>HMethod To Data Class Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.impl.HMethodToDataClassAccessImpl
	 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHMethodToDataClassAccess()
	 * @generated
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HData Class Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS_SMELL = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HData Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TMethod Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS__TMETHOD_DEFINITION = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HMethod To Data Class Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>HMethod To Data Class Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMETHOD_TO_DATA_CLASS_ACCESS_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.impl.HInBlobAccessImpl <em>HIn Blob Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.impl.HInBlobAccessImpl
	 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHInBlobAccess()
	 * @generated
	 */
	int HIN_BLOB_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The number of structural features of the '<em>HIn Blob Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HIn Blob Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_ACCESS_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.impl.HBlobResolveAnnotationImpl <em>HBlob Resolve Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.impl.HBlobResolveAnnotationImpl
	 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHBlobResolveAnnotation()
	 * @generated
	 */
	int HBLOB_RESOLVE_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION__TANNOTATED = AntipatterngraphPackage.HANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION__TYPE = AntipatterngraphPackage.HANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION__TVALUES = AntipatterngraphPackage.HANNOTATION__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION__APG = AntipatterngraphPackage.HANNOTATION__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION__PART_OF = AntipatterngraphPackage.HANNOTATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION__CHANGED = AntipatterngraphPackage.HANNOTATION__CHANGED;

	/**
	 * The feature id for the '<em><b>HBlob Anti Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION__HBLOB_ANTI_PATTERN = AntipatterngraphPackage.HANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HMoves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION__HMOVES = AntipatterngraphPackage.HANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HRefactorings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION__HREFACTORINGS = AntipatterngraphPackage.HANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HBlob Resolve Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION_FEATURE_COUNT = AntipatterngraphPackage.HANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>HBlob Resolve Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBLOB_RESOLVE_ANNOTATION_OPERATION_COUNT = AntipatterngraphPackage.HANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.impl.HClusterImpl <em>HCluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.impl.HClusterImpl
	 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHCluster()
	 * @generated
	 */
	int HCLUSTER = 3;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>TMembers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER__TMEMBERS = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HCluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC___GET_RELATIVE_AMOUNT;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The number of operations of the '<em>HCluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLUSTER_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.refactoringgraph.impl.HInBlobClusterAccessImpl <em>HIn Blob Cluster Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.refactoringgraph.impl.HInBlobClusterAccessImpl
	 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHInBlobClusterAccess()
	 * @generated
	 */
	int HIN_BLOB_CLUSTER_ACCESS = 4;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS__TANNOTATED = AntipatterngraphPackage.HMETRIC__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS__TYPE = AntipatterngraphPackage.HMETRIC__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS__TVALUES = AntipatterngraphPackage.HMETRIC__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS__APG = AntipatterngraphPackage.HMETRIC__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS__PART_OF = AntipatterngraphPackage.HMETRIC__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS__CHANGED = AntipatterngraphPackage.HMETRIC__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS__VALUE = AntipatterngraphPackage.HMETRIC__VALUE;

	/**
	 * The feature id for the '<em><b>HCluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS__HCLUSTER = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HIn Blob Cluster Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS_FEATURE_COUNT = AntipatterngraphPackage.HMETRIC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS___INCREMENT = AntipatterngraphPackage.HMETRIC___INCREMENT;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>HIn Blob Cluster Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIN_BLOB_CLUSTER_ACCESS_OPERATION_COUNT = AntipatterngraphPackage.HMETRIC_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess <em>HMethod To Data Class Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMethod To Data Class Access</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess
	 * @generated
	 */
	EClass getHMethodToDataClassAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getHDataClassSmell <em>HData Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HData Class Smell</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getHDataClassSmell()
	 * @see #getHMethodToDataClassAccess()
	 * @generated
	 */
	EReference getHMethodToDataClassAccess_HDataClassSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getHDataClass <em>HData Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HData Class</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getHDataClass()
	 * @see #getHMethodToDataClassAccess()
	 * @generated
	 */
	EReference getHMethodToDataClassAccess_HDataClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getTMethodDefinition <em>TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMethod Definition</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getTMethodDefinition()
	 * @see #getHMethodToDataClassAccess()
	 * @generated
	 */
	EReference getHMethodToDataClassAccess_TMethodDefinition();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getRelativeAmount() <em>Get Relative Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Relative Amount</em>' operation.
	 * @see org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getRelativeAmount()
	 * @generated
	 */
	EOperation getHMethodToDataClassAccess__GetRelativeAmount();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.HInBlobAccess <em>HIn Blob Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIn Blob Access</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HInBlobAccess
	 * @generated
	 */
	EClass getHInBlobAccess();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation <em>HBlob Resolve Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HBlob Resolve Annotation</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation
	 * @generated
	 */
	EClass getHBlobResolveAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHBlobAntiPattern <em>HBlob Anti Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HBlob Anti Pattern</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHBlobAntiPattern()
	 * @see #getHBlobResolveAnnotation()
	 * @generated
	 */
	EReference getHBlobResolveAnnotation_HBlobAntiPattern();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHMoves <em>HMoves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HMoves</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHMoves()
	 * @see #getHBlobResolveAnnotation()
	 * @generated
	 */
	EReference getHBlobResolveAnnotation_HMoves();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHRefactorings <em>HRefactorings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HRefactorings</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHRefactorings()
	 * @see #getHBlobResolveAnnotation()
	 * @generated
	 */
	EReference getHBlobResolveAnnotation_HRefactorings();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.HCluster <em>HCluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HCluster</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HCluster
	 * @generated
	 */
	EClass getHCluster();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.refactoringgraph.HCluster#getTMembers <em>TMembers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>TMembers</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HCluster#getTMembers()
	 * @see #getHCluster()
	 * @generated
	 */
	EReference getHCluster_TMembers();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.refactoringgraph.HInBlobClusterAccess <em>HIn Blob Cluster Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIn Blob Cluster Access</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HInBlobClusterAccess
	 * @generated
	 */
	EClass getHInBlobClusterAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.refactoringgraph.HInBlobClusterAccess#getHCluster <em>HCluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HCluster</em>'.
	 * @see org.gravity.hulk.refactoringgraph.HInBlobClusterAccess#getHCluster()
	 * @see #getHInBlobClusterAccess()
	 * @generated
	 */
	EReference getHInBlobClusterAccess_HCluster();

	/**
	 * Returns the meta object for the '{@link org.gravity.hulk.refactoringgraph.HInBlobClusterAccess#getRelativeAmount() <em>Get Relative Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Relative Amount</em>' operation.
	 * @see org.gravity.hulk.refactoringgraph.HInBlobClusterAccess#getRelativeAmount()
	 * @generated
	 */
	EOperation getHInBlobClusterAccess__GetRelativeAmount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefactoringgraphFactory getRefactoringgraphFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.impl.HMethodToDataClassAccessImpl <em>HMethod To Data Class Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.impl.HMethodToDataClassAccessImpl
		 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHMethodToDataClassAccess()
		 * @generated
		 */
		EClass HMETHOD_TO_DATA_CLASS_ACCESS = eINSTANCE.getHMethodToDataClassAccess();

		/**
		 * The meta object literal for the '<em><b>HData Class Smell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS_SMELL = eINSTANCE
				.getHMethodToDataClassAccess_HDataClassSmell();

		/**
		 * The meta object literal for the '<em><b>HData Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMETHOD_TO_DATA_CLASS_ACCESS__HDATA_CLASS = eINSTANCE.getHMethodToDataClassAccess_HDataClass();

		/**
		 * The meta object literal for the '<em><b>TMethod Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMETHOD_TO_DATA_CLASS_ACCESS__TMETHOD_DEFINITION = eINSTANCE
				.getHMethodToDataClassAccess_TMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Get Relative Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMETHOD_TO_DATA_CLASS_ACCESS___GET_RELATIVE_AMOUNT = eINSTANCE
				.getHMethodToDataClassAccess__GetRelativeAmount();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.impl.HInBlobAccessImpl <em>HIn Blob Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.impl.HInBlobAccessImpl
		 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHInBlobAccess()
		 * @generated
		 */
		EClass HIN_BLOB_ACCESS = eINSTANCE.getHInBlobAccess();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.impl.HBlobResolveAnnotationImpl <em>HBlob Resolve Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.impl.HBlobResolveAnnotationImpl
		 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHBlobResolveAnnotation()
		 * @generated
		 */
		EClass HBLOB_RESOLVE_ANNOTATION = eINSTANCE.getHBlobResolveAnnotation();

		/**
		 * The meta object literal for the '<em><b>HBlob Anti Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBLOB_RESOLVE_ANNOTATION__HBLOB_ANTI_PATTERN = eINSTANCE
				.getHBlobResolveAnnotation_HBlobAntiPattern();

		/**
		 * The meta object literal for the '<em><b>HMoves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBLOB_RESOLVE_ANNOTATION__HMOVES = eINSTANCE.getHBlobResolveAnnotation_HMoves();

		/**
		 * The meta object literal for the '<em><b>HRefactorings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBLOB_RESOLVE_ANNOTATION__HREFACTORINGS = eINSTANCE.getHBlobResolveAnnotation_HRefactorings();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.impl.HClusterImpl <em>HCluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.impl.HClusterImpl
		 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHCluster()
		 * @generated
		 */
		EClass HCLUSTER = eINSTANCE.getHCluster();

		/**
		 * The meta object literal for the '<em><b>TMembers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HCLUSTER__TMEMBERS = eINSTANCE.getHCluster_TMembers();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.refactoringgraph.impl.HInBlobClusterAccessImpl <em>HIn Blob Cluster Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.refactoringgraph.impl.HInBlobClusterAccessImpl
		 * @see org.gravity.hulk.refactoringgraph.impl.RefactoringgraphPackageImpl#getHInBlobClusterAccess()
		 * @generated
		 */
		EClass HIN_BLOB_CLUSTER_ACCESS = eINSTANCE.getHInBlobClusterAccess();

		/**
		 * The meta object literal for the '<em><b>HCluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIN_BLOB_CLUSTER_ACCESS__HCLUSTER = eINSTANCE.getHInBlobClusterAccess_HCluster();

		/**
		 * The meta object literal for the '<em><b>Get Relative Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIN_BLOB_CLUSTER_ACCESS___GET_RELATIVE_AMOUNT = eINSTANCE
				.getHInBlobClusterAccess__GetRelativeAmount();

	}

} //RefactoringgraphPackage
