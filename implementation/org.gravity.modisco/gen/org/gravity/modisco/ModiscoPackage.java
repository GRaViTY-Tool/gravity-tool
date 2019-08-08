/**
 */
package org.gravity.modisco;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gmt.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gravity.modisco.ModiscoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.gravity'"
 * @generated
 */
public interface ModiscoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modisco";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/modisco";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.modisco";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoPackage eINSTANCE = org.gravity.modisco.impl.ModiscoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MDefinitionImpl <em>MDefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MDefinitionImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMDefinition()
	 * @generated
	 */
	int MDEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__COMMENTS = JavaPackage.BODY_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__ORIGINAL_COMPILATION_UNIT = JavaPackage.BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__ORIGINAL_CLASS_FILE = JavaPackage.BODY_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__NAME = JavaPackage.BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__PROXY = JavaPackage.BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__USAGES_IN_IMPORTS = JavaPackage.BODY_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__ABSTRACT_TYPE_DECLARATION = JavaPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__ANNOTATIONS = JavaPackage.BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__ANONYMOUS_CLASS_DECLARATION_OWNER = JavaPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__MODIFIER = JavaPackage.BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>MMethod Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__MMETHOD_INVOCATIONS = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__MABSTRACT_FIELD_ACCESS = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MDefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_FEATURE_COUNT = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MAbstractMethodDefinitionImpl <em>MAbstract Method Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MAbstractMethodDefinitionImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAbstractMethodDefinition()
	 * @generated
	 */
	int MABSTRACT_METHOD_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__COMMENTS = MDEFINITION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__ORIGINAL_COMPILATION_UNIT = MDEFINITION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__ORIGINAL_CLASS_FILE = MDEFINITION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__NAME = MDEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__PROXY = MDEFINITION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__USAGES_IN_IMPORTS = MDEFINITION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__ABSTRACT_TYPE_DECLARATION = MDEFINITION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__ANNOTATIONS = MDEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__ANONYMOUS_CLASS_DECLARATION_OWNER = MDEFINITION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__MODIFIER = MDEFINITION__MODIFIER;

	/**
	 * The feature id for the '<em><b>MMethod Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__MMETHOD_INVOCATIONS = MDEFINITION__MMETHOD_INVOCATIONS;

	/**
	 * The feature id for the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__MABSTRACT_FIELD_ACCESS = MDEFINITION__MABSTRACT_FIELD_ACCESS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__BODY = MDEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__PARAMETERS = MDEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS = MDEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS = MDEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usages In Doc Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS = MDEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__USAGES = MDEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MInner Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__MINNER_TYPES = MDEFINITION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MAbstract Method Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION_FEATURE_COUNT = MDEFINITION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MConstructorDefinitionImpl <em>MConstructor Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MConstructorDefinitionImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMConstructorDefinition()
	 * @generated
	 */
	int MCONSTRUCTOR_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__COMMENTS = MABSTRACT_METHOD_DEFINITION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__ORIGINAL_COMPILATION_UNIT = MABSTRACT_METHOD_DEFINITION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__ORIGINAL_CLASS_FILE = MABSTRACT_METHOD_DEFINITION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__NAME = MABSTRACT_METHOD_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__PROXY = MABSTRACT_METHOD_DEFINITION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__USAGES_IN_IMPORTS = MABSTRACT_METHOD_DEFINITION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__ABSTRACT_TYPE_DECLARATION = MABSTRACT_METHOD_DEFINITION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__ANNOTATIONS = MABSTRACT_METHOD_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__ANONYMOUS_CLASS_DECLARATION_OWNER = MABSTRACT_METHOD_DEFINITION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__MODIFIER = MABSTRACT_METHOD_DEFINITION__MODIFIER;

	/**
	 * The feature id for the '<em><b>MMethod Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__MMETHOD_INVOCATIONS = MABSTRACT_METHOD_DEFINITION__MMETHOD_INVOCATIONS;

	/**
	 * The feature id for the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__MABSTRACT_FIELD_ACCESS = MABSTRACT_METHOD_DEFINITION__MABSTRACT_FIELD_ACCESS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__BODY = MABSTRACT_METHOD_DEFINITION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__PARAMETERS = MABSTRACT_METHOD_DEFINITION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__THROWN_EXCEPTIONS = MABSTRACT_METHOD_DEFINITION__THROWN_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__TYPE_PARAMETERS = MABSTRACT_METHOD_DEFINITION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Usages In Doc Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__USAGES_IN_DOC_COMMENTS = MABSTRACT_METHOD_DEFINITION__USAGES_IN_DOC_COMMENTS;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__USAGES = MABSTRACT_METHOD_DEFINITION__USAGES;

	/**
	 * The feature id for the '<em><b>MInner Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__MINNER_TYPES = MABSTRACT_METHOD_DEFINITION__MINNER_TYPES;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__MODEL = MABSTRACT_METHOD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MParameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST = MABSTRACT_METHOD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MConstructor Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION_FEATURE_COUNT = MABSTRACT_METHOD_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MSignatureImpl <em>MSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MSignatureImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSignature()
	 * @generated
	 */
	int MSIGNATURE = 11;

	/**
	 * The feature id for the '<em><b>MDefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE__MDEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE__IMPLEMENTED_BY = 1;

	/**
	 * The number of structural features of the '<em>MSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MMethodSignatureImpl <em>MMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MMethodSignatureImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodSignature()
	 * @generated
	 */
	int MMETHOD_SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>MDefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MDEFINITIONS = MSIGNATURE__MDEFINITIONS;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__IMPLEMENTED_BY = MSIGNATURE__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MODEL = MSIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MMethod Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MMETHOD_NAME = MSIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__RETURN_TYPE = MSIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MMethod Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS = MSIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MParameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MPARAMETER_LIST = MSIGNATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_FEATURE_COUNT = MSIGNATURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MParameterListImpl <em>MParameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MParameterListImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMParameterList()
	 * @generated
	 */
	int MPARAMETER_LIST = 4;

	/**
	 * The feature id for the '<em><b>MFirst Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_LIST__MFIRST_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>MEntrys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_LIST__MENTRYS = 1;

	/**
	 * The number of structural features of the '<em>MParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MNameImpl <em>MName</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MNameImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMName()
	 * @generated
	 */
	int MNAME = 5;

	/**
	 * The feature id for the '<em><b>MSignatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNAME__MSIGNATURES = 0;

	/**
	 * The feature id for the '<em><b>MName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNAME__MNAME = 1;

	/**
	 * The number of structural features of the '<em>MName</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNAME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MMethodNameImpl <em>MMethod Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MMethodNameImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodName()
	 * @generated
	 */
	int MMETHOD_NAME = 6;

	/**
	 * The feature id for the '<em><b>MSignatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME__MSIGNATURES = MNAME__MSIGNATURES;

	/**
	 * The feature id for the '<em><b>MName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME__MNAME = MNAME__MNAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME__MODEL = MNAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MMethod Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME__MMETHOD_DEFINITIONS = MNAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MMethod Signatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME__MMETHOD_SIGNATURES = MNAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MMethod Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_NAME_FEATURE_COUNT = MNAME_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MFieldNameImpl <em>MField Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MFieldNameImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMFieldName()
	 * @generated
	 */
	int MFIELD_NAME = 7;

	/**
	 * The feature id for the '<em><b>MSignatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME__MSIGNATURES = MNAME__MSIGNATURES;

	/**
	 * The feature id for the '<em><b>MName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME__MNAME = MNAME__MNAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME__MODEL = MNAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MField Signatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME__MFIELD_SIGNATURES = MNAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MField Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME__MFIELD_DEFINITIONS = MNAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MField Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_NAME_FEATURE_COUNT = MNAME_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MFieldDefinitionImpl <em>MField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MFieldDefinitionImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMFieldDefinition()
	 * @generated
	 */
	int MFIELD_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__COMMENTS = MDEFINITION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__ORIGINAL_COMPILATION_UNIT = MDEFINITION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__ORIGINAL_CLASS_FILE = MDEFINITION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__NAME = MDEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__PROXY = MDEFINITION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__USAGES_IN_IMPORTS = MDEFINITION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__ABSTRACT_TYPE_DECLARATION = MDEFINITION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__ANNOTATIONS = MDEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__ANONYMOUS_CLASS_DECLARATION_OWNER = MDEFINITION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__MODIFIER = MDEFINITION__MODIFIER;

	/**
	 * The feature id for the '<em><b>MMethod Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__MMETHOD_INVOCATIONS = MDEFINITION__MMETHOD_INVOCATIONS;

	/**
	 * The feature id for the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__MABSTRACT_FIELD_ACCESS = MDEFINITION__MABSTRACT_FIELD_ACCESS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__TYPE = MDEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__FRAGMENTS = MDEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MField Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__MFIELD_SIGNATURE = MDEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MField Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__MFIELD_NAME = MDEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__MODEL = MDEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION_FEATURE_COUNT = MDEFINITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MMethodDefinitionImpl <em>MMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MMethodDefinitionImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodDefinition()
	 * @generated
	 */
	int MMETHOD_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__COMMENTS = JavaPackage.METHOD_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__ORIGINAL_COMPILATION_UNIT = JavaPackage.METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__ORIGINAL_CLASS_FILE = JavaPackage.METHOD_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__NAME = JavaPackage.METHOD_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__PROXY = JavaPackage.METHOD_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__USAGES_IN_IMPORTS = JavaPackage.METHOD_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__ABSTRACT_TYPE_DECLARATION = JavaPackage.METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__ANNOTATIONS = JavaPackage.METHOD_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__ANONYMOUS_CLASS_DECLARATION_OWNER = JavaPackage.METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MODIFIER = JavaPackage.METHOD_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__BODY = JavaPackage.METHOD_DECLARATION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__PARAMETERS = JavaPackage.METHOD_DECLARATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__THROWN_EXCEPTIONS = JavaPackage.METHOD_DECLARATION__THROWN_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__TYPE_PARAMETERS = JavaPackage.METHOD_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Usages In Doc Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__USAGES_IN_DOC_COMMENTS = JavaPackage.METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__USAGES = JavaPackage.METHOD_DECLARATION__USAGES;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__EXTRA_ARRAY_DIMENSIONS = JavaPackage.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__RETURN_TYPE = JavaPackage.METHOD_DECLARATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Redefined Method Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__REDEFINED_METHOD_DECLARATION = JavaPackage.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION;

	/**
	 * The feature id for the '<em><b>Redefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__REDEFINITIONS = JavaPackage.METHOD_DECLARATION__REDEFINITIONS;

	/**
	 * The feature id for the '<em><b>MMethod Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MMETHOD_INVOCATIONS = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MInner Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MINNER_TYPES = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MMethod Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MMETHOD_NAME = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MMETHOD_SIGNATURE = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MODEL = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Synthetic Method Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION_FEATURE_COUNT = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MMethodInvocationImpl <em>MMethod Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MMethodInvocationImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodInvocation()
	 * @generated
	 */
	int MMETHOD_INVOCATION = 10;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__COMMENTS = JavaPackage.METHOD_INVOCATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = JavaPackage.METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__ORIGINAL_CLASS_FILE = JavaPackage.METHOD_INVOCATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__METHOD = JavaPackage.METHOD_INVOCATION__METHOD;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__ARGUMENTS = JavaPackage.METHOD_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__TYPE_ARGUMENTS = JavaPackage.METHOD_INVOCATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__EXPRESSION = JavaPackage.METHOD_INVOCATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>MStatic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__MSTATIC_TYPE = JavaPackage.METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MMethod Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION_FEATURE_COUNT = JavaPackage.METHOD_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MEntryImpl <em>MEntry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MEntryImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMEntry()
	 * @generated
	 */
	int MENTRY = 12;

	/**
	 * The feature id for the '<em><b>MNext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__MNEXT = 0;

	/**
	 * The feature id for the '<em><b>MPrevious</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__MPREVIOUS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Single Variable Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__SINGLE_VARIABLE_DECLARATION = 3;

	/**
	 * The number of structural features of the '<em>MEntry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MGravityModelImpl <em>MGravity Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MGravityModelImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMGravityModel()
	 * @generated
	 */
	int MGRAVITY_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__NAME = JavaPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__OWNED_ELEMENTS = JavaPackage.MODEL__OWNED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Orphan Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__ORPHAN_TYPES = JavaPackage.MODEL__ORPHAN_TYPES;

	/**
	 * The feature id for the '<em><b>Unresolved Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__UNRESOLVED_ITEMS = JavaPackage.MODEL__UNRESOLVED_ITEMS;

	/**
	 * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__COMPILATION_UNITS = JavaPackage.MODEL__COMPILATION_UNITS;

	/**
	 * The feature id for the '<em><b>Class Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__CLASS_FILES = JavaPackage.MODEL__CLASS_FILES;

	/**
	 * The feature id for the '<em><b>Archives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__ARCHIVES = JavaPackage.MODEL__ARCHIVES;

	/**
	 * The feature id for the '<em><b>MMethod Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MMETHOD_DEFINITIONS = JavaPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MField Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MFIELD_DEFINITIONS = JavaPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MConstructor Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS = JavaPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MMethod Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MMETHOD_NAMES = JavaPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MNames</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MNAMES = JavaPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MMethod Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MMETHOD_SIGNATURES = JavaPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MField Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MFIELD_SIGNATURES = JavaPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MField Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MFIELD_NAMES = JavaPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MAbstract Method Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS = JavaPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__TYPE_PARAMETERS = JavaPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>MExtensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MEXTENSIONS = JavaPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>MGravity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL_FEATURE_COUNT = JavaPackage.MODEL_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MFieldSignatureImpl <em>MField Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MFieldSignatureImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMFieldSignature()
	 * @generated
	 */
	int MFIELD_SIGNATURE = 14;

	/**
	 * The feature id for the '<em><b>MDefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__MDEFINITIONS = MSIGNATURE__MDEFINITIONS;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__IMPLEMENTED_BY = MSIGNATURE__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>MField Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__MFIELD_NAME = MSIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__MODEL = MSIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__TYPE = MSIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MField Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__MFIELD_DEFINITIONS = MSIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE_FEATURE_COUNT = MSIGNATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MAnnotationImpl <em>MAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MAnnotationImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAnnotation()
	 * @generated
	 */
	int MANNOTATION = 15;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANNOTATION__COMMENTS = JavaPackage.ANNOTATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANNOTATION__ORIGINAL_COMPILATION_UNIT = JavaPackage.ANNOTATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANNOTATION__ORIGINAL_CLASS_FILE = JavaPackage.ANNOTATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANNOTATION__TYPE = JavaPackage.ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANNOTATION__VALUES = JavaPackage.ANNOTATION__VALUES;

	/**
	 * The feature id for the '<em><b>MRelevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANNOTATION__MRELEVANT = JavaPackage.ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANNOTATION_FEATURE_COUNT = JavaPackage.ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MSyntheticMethodDefinitionImpl <em>MSynthetic Method Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MSyntheticMethodDefinitionImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSyntheticMethodDefinition()
	 * @generated
	 */
	int MSYNTHETIC_METHOD_DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__COMMENTS = JavaPackage.BODY_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_COMPILATION_UNIT = JavaPackage.BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_CLASS_FILE = JavaPackage.BODY_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__NAME = JavaPackage.BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__PROXY = JavaPackage.BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__USAGES_IN_IMPORTS = JavaPackage.BODY_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__ABSTRACT_TYPE_DECLARATION = JavaPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__ANNOTATIONS = JavaPackage.BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__ANONYMOUS_CLASS_DECLARATION_OWNER = JavaPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__MODIFIER = JavaPackage.BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Original Method Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MSynthetic Method Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSYNTHETIC_METHOD_DEFINITION_FEATURE_COUNT = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MAnonymousImpl <em>MAnonymous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MAnonymousImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAnonymous()
	 * @generated
	 */
	int MANONYMOUS = 17;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANONYMOUS__COMMENTS = JavaPackage.ANONYMOUS_CLASS_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANONYMOUS__ORIGINAL_COMPILATION_UNIT = JavaPackage.ANONYMOUS_CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANONYMOUS__ORIGINAL_CLASS_FILE = JavaPackage.ANONYMOUS_CLASS_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANONYMOUS__BODY_DECLARATIONS = JavaPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Class Instance Creation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANONYMOUS__CLASS_INSTANCE_CREATION = JavaPackage.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION;

	/**
	 * The feature id for the '<em><b>MSourrounding Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANONYMOUS__MSOURROUNDING_TYPE = JavaPackage.ANONYMOUS_CLASS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MAnonymous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANONYMOUS_FEATURE_COUNT = JavaPackage.ANONYMOUS_CLASS_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MClassImpl <em>MClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MClassImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMClass()
	 * @generated
	 */
	int MCLASS = 18;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__COMMENTS = JavaPackage.CLASS_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__ORIGINAL_COMPILATION_UNIT = JavaPackage.CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__ORIGINAL_CLASS_FILE = JavaPackage.CLASS_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__NAME = JavaPackage.CLASS_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__PROXY = JavaPackage.CLASS_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__USAGES_IN_IMPORTS = JavaPackage.CLASS_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__ABSTRACT_TYPE_DECLARATION = JavaPackage.CLASS_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__ANNOTATIONS = JavaPackage.CLASS_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__ANONYMOUS_CLASS_DECLARATION_OWNER = JavaPackage.CLASS_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__MODIFIER = JavaPackage.CLASS_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__USAGES_IN_TYPE_ACCESS = JavaPackage.CLASS_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__BODY_DECLARATIONS = JavaPackage.CLASS_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__COMMENTS_BEFORE_BODY = JavaPackage.CLASS_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__COMMENTS_AFTER_BODY = JavaPackage.CLASS_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__PACKAGE = JavaPackage.CLASS_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__SUPER_INTERFACES = JavaPackage.CLASS_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__TYPE_PARAMETERS = JavaPackage.CLASS_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__SUPER_CLASS = JavaPackage.CLASS_DECLARATION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__DEPENDENCIES = JavaPackage.CLASS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_FEATURE_COUNT = JavaPackage.CLASS_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MExtensionImpl <em>MExtension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MExtensionImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMExtension()
	 * @generated
	 */
	int MEXTENSION = 19;

	/**
	 * The number of structural features of the '<em>MExtension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEXTENSION_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MAbstractMethodDefinition <em>MAbstract Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAbstract Method Definition</em>'.
	 * @see org.gravity.modisco.MAbstractMethodDefinition
	 * @generated
	 */
	EClass getMAbstractMethodDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MAbstractMethodDefinition#getMInnerTypes <em>MInner Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MInner Types</em>'.
	 * @see org.gravity.modisco.MAbstractMethodDefinition#getMInnerTypes()
	 * @see #getMAbstractMethodDefinition()
	 * @generated
	 */
	EReference getMAbstractMethodDefinition_MInnerTypes();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MConstructorDefinition <em>MConstructor Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MConstructor Definition</em>'.
	 * @see org.gravity.modisco.MConstructorDefinition
	 * @generated
	 */
	EClass getMConstructorDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MConstructorDefinition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.gravity.modisco.MConstructorDefinition#getModel()
	 * @see #getMConstructorDefinition()
	 * @generated
	 */
	EReference getMConstructorDefinition_Model();

	/**
	 * Returns the meta object for the containment reference '{@link org.gravity.modisco.MConstructorDefinition#getMParameterList <em>MParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MParameter List</em>'.
	 * @see org.gravity.modisco.MConstructorDefinition#getMParameterList()
	 * @see #getMConstructorDefinition()
	 * @generated
	 */
	EReference getMConstructorDefinition_MParameterList();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MDefinition <em>MDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDefinition</em>'.
	 * @see org.gravity.modisco.MDefinition
	 * @generated
	 */
	EClass getMDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MDefinition#getMMethodInvocations <em>MMethod Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MMethod Invocations</em>'.
	 * @see org.gravity.modisco.MDefinition#getMMethodInvocations()
	 * @see #getMDefinition()
	 * @generated
	 */
	EReference getMDefinition_MMethodInvocations();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MDefinition#getMAbstractFieldAccess <em>MAbstract Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MAbstract Field Access</em>'.
	 * @see org.gravity.modisco.MDefinition#getMAbstractFieldAccess()
	 * @see #getMDefinition()
	 * @generated
	 */
	EReference getMDefinition_MAbstractFieldAccess();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MMethodSignature <em>MMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Signature</em>'.
	 * @see org.gravity.modisco.MMethodSignature
	 * @generated
	 */
	EClass getMMethodSignature();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.modisco.MMethodSignature#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.gravity.modisco.MMethodSignature#getModel()
	 * @see #getMMethodSignature()
	 * @generated
	 */
	EReference getMMethodSignature_Model();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MMethodSignature#getMMethodName <em>MMethod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MMethod Name</em>'.
	 * @see org.gravity.modisco.MMethodSignature#getMMethodName()
	 * @see #getMMethodSignature()
	 * @generated
	 */
	EReference getMMethodSignature_MMethodName();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MMethodSignature#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.gravity.modisco.MMethodSignature#getReturnType()
	 * @see #getMMethodSignature()
	 * @generated
	 */
	EReference getMMethodSignature_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MMethodSignature#getMMethodDefinitions <em>MMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MMethod Definitions</em>'.
	 * @see org.gravity.modisco.MMethodSignature#getMMethodDefinitions()
	 * @see #getMMethodSignature()
	 * @generated
	 */
	EReference getMMethodSignature_MMethodDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link org.gravity.modisco.MMethodSignature#getMParameterList <em>MParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MParameter List</em>'.
	 * @see org.gravity.modisco.MMethodSignature#getMParameterList()
	 * @see #getMMethodSignature()
	 * @generated
	 */
	EReference getMMethodSignature_MParameterList();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MParameterList <em>MParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MParameter List</em>'.
	 * @see org.gravity.modisco.MParameterList
	 * @generated
	 */
	EClass getMParameterList();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MParameterList#getMFirstEntry <em>MFirst Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MFirst Entry</em>'.
	 * @see org.gravity.modisco.MParameterList#getMFirstEntry()
	 * @see #getMParameterList()
	 * @generated
	 */
	EReference getMParameterList_MFirstEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.modisco.MParameterList#getMEntrys <em>MEntrys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MEntrys</em>'.
	 * @see org.gravity.modisco.MParameterList#getMEntrys()
	 * @see #getMParameterList()
	 * @generated
	 */
	EReference getMParameterList_MEntrys();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MName <em>MName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MName</em>'.
	 * @see org.gravity.modisco.MName
	 * @generated
	 */
	EClass getMName();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MName#getMSignatures <em>MSignatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MSignatures</em>'.
	 * @see org.gravity.modisco.MName#getMSignatures()
	 * @see #getMName()
	 * @generated
	 */
	EReference getMName_MSignatures();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.modisco.MName#getMName <em>MName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MName</em>'.
	 * @see org.gravity.modisco.MName#getMName()
	 * @see #getMName()
	 * @generated
	 */
	EAttribute getMName_MName();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MMethodName <em>MMethod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Name</em>'.
	 * @see org.gravity.modisco.MMethodName
	 * @generated
	 */
	EClass getMMethodName();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.modisco.MMethodName#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.gravity.modisco.MMethodName#getModel()
	 * @see #getMMethodName()
	 * @generated
	 */
	EReference getMMethodName_Model();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MMethodName#getMMethodDefinitions <em>MMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MMethod Definitions</em>'.
	 * @see org.gravity.modisco.MMethodName#getMMethodDefinitions()
	 * @see #getMMethodName()
	 * @generated
	 */
	EReference getMMethodName_MMethodDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MMethodName#getMMethodSignatures <em>MMethod Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MMethod Signatures</em>'.
	 * @see org.gravity.modisco.MMethodName#getMMethodSignatures()
	 * @see #getMMethodName()
	 * @generated
	 */
	EReference getMMethodName_MMethodSignatures();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MFieldName <em>MField Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MField Name</em>'.
	 * @see org.gravity.modisco.MFieldName
	 * @generated
	 */
	EClass getMFieldName();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.modisco.MFieldName#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.gravity.modisco.MFieldName#getModel()
	 * @see #getMFieldName()
	 * @generated
	 */
	EReference getMFieldName_Model();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MFieldName#getMFieldSignatures <em>MField Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MField Signatures</em>'.
	 * @see org.gravity.modisco.MFieldName#getMFieldSignatures()
	 * @see #getMFieldName()
	 * @generated
	 */
	EReference getMFieldName_MFieldSignatures();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MFieldName#getMFieldDefinitions <em>MField Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MField Definitions</em>'.
	 * @see org.gravity.modisco.MFieldName#getMFieldDefinitions()
	 * @see #getMFieldName()
	 * @generated
	 */
	EReference getMFieldName_MFieldDefinitions();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MFieldDefinition <em>MField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MField Definition</em>'.
	 * @see org.gravity.modisco.MFieldDefinition
	 * @generated
	 */
	EClass getMFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MFieldDefinition#getMFieldSignature <em>MField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MField Signature</em>'.
	 * @see org.gravity.modisco.MFieldDefinition#getMFieldSignature()
	 * @see #getMFieldDefinition()
	 * @generated
	 */
	EReference getMFieldDefinition_MFieldSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MFieldDefinition#getMFieldName <em>MField Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MField Name</em>'.
	 * @see org.gravity.modisco.MFieldDefinition#getMFieldName()
	 * @see #getMFieldDefinition()
	 * @generated
	 */
	EReference getMFieldDefinition_MFieldName();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MFieldDefinition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.gravity.modisco.MFieldDefinition#getModel()
	 * @see #getMFieldDefinition()
	 * @generated
	 */
	EReference getMFieldDefinition_Model();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MMethodDefinition <em>MMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Definition</em>'.
	 * @see org.gravity.modisco.MMethodDefinition
	 * @generated
	 */
	EClass getMMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MMethodDefinition#getMMethodName <em>MMethod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MMethod Name</em>'.
	 * @see org.gravity.modisco.MMethodDefinition#getMMethodName()
	 * @see #getMMethodDefinition()
	 * @generated
	 */
	EReference getMMethodDefinition_MMethodName();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MMethodDefinition#getMMethodSignature <em>MMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MMethod Signature</em>'.
	 * @see org.gravity.modisco.MMethodDefinition#getMMethodSignature()
	 * @see #getMMethodDefinition()
	 * @generated
	 */
	EReference getMMethodDefinition_MMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MMethodDefinition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.gravity.modisco.MMethodDefinition#getModel()
	 * @see #getMMethodDefinition()
	 * @generated
	 */
	EReference getMMethodDefinition_Model();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MMethodDefinition#getSyntheticMethodDefinitions <em>Synthetic Method Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synthetic Method Definitions</em>'.
	 * @see org.gravity.modisco.MMethodDefinition#getSyntheticMethodDefinitions()
	 * @see #getMMethodDefinition()
	 * @generated
	 */
	EReference getMMethodDefinition_SyntheticMethodDefinitions();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MMethodInvocation <em>MMethod Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod Invocation</em>'.
	 * @see org.gravity.modisco.MMethodInvocation
	 * @generated
	 */
	EClass getMMethodInvocation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MMethodInvocation#getMStaticType <em>MStatic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MStatic Type</em>'.
	 * @see org.gravity.modisco.MMethodInvocation#getMStaticType()
	 * @see #getMMethodInvocation()
	 * @generated
	 */
	EReference getMMethodInvocation_MStaticType();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MSignature <em>MSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSignature</em>'.
	 * @see org.gravity.modisco.MSignature
	 * @generated
	 */
	EClass getMSignature();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MSignature#getMDefinitions <em>MDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MDefinitions</em>'.
	 * @see org.gravity.modisco.MSignature#getMDefinitions()
	 * @see #getMSignature()
	 * @generated
	 */
	EReference getMSignature_MDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MSignature#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented By</em>'.
	 * @see org.gravity.modisco.MSignature#getImplementedBy()
	 * @see #getMSignature()
	 * @generated
	 */
	EReference getMSignature_ImplementedBy();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MEntry <em>MEntry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEntry</em>'.
	 * @see org.gravity.modisco.MEntry
	 * @generated
	 */
	EClass getMEntry();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MEntry#getMNext <em>MNext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MNext</em>'.
	 * @see org.gravity.modisco.MEntry#getMNext()
	 * @see #getMEntry()
	 * @generated
	 */
	EReference getMEntry_MNext();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MEntry#getMPrevious <em>MPrevious</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MPrevious</em>'.
	 * @see org.gravity.modisco.MEntry#getMPrevious()
	 * @see #getMEntry()
	 * @generated
	 */
	EReference getMEntry_MPrevious();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gravity.modisco.MEntry#getType()
	 * @see #getMEntry()
	 * @generated
	 */
	EReference getMEntry_Type();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MEntry#getSingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Variable Declaration</em>'.
	 * @see org.gravity.modisco.MEntry#getSingleVariableDeclaration()
	 * @see #getMEntry()
	 * @generated
	 */
	EReference getMEntry_SingleVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MGravityModel <em>MGravity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MGravity Model</em>'.
	 * @see org.gravity.modisco.MGravityModel
	 * @generated
	 */
	EClass getMGravityModel();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MGravityModel#getMMethodDefinitions <em>MMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MMethod Definitions</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMMethodDefinitions()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MMethodDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MGravityModel#getMFieldDefinitions <em>MField Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MField Definitions</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMFieldDefinitions()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MFieldDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MGravityModel#getMConstructorDefinitions <em>MConstructor Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MConstructor Definitions</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMConstructorDefinitions()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MConstructorDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.modisco.MGravityModel#getMMethodNames <em>MMethod Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MMethod Names</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMMethodNames()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MMethodNames();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MGravityModel#getMNames <em>MNames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MNames</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMNames()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.modisco.MGravityModel#getMMethodSignatures <em>MMethod Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MMethod Signatures</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMMethodSignatures()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MMethodSignatures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.modisco.MGravityModel#getMFieldSignatures <em>MField Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MField Signatures</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMFieldSignatures()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MFieldSignatures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.modisco.MGravityModel#getMFieldNames <em>MField Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MField Names</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMFieldNames()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MFieldNames();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MGravityModel#getMAbstractMethodDefinitions <em>MAbstract Method Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MAbstract Method Definitions</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMAbstractMethodDefinitions()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MAbstractMethodDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MGravityModel#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Parameters</em>'.
	 * @see org.gravity.modisco.MGravityModel#getTypeParameters()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_TypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.modisco.MGravityModel#getMExtensions <em>MExtensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MExtensions</em>'.
	 * @see org.gravity.modisco.MGravityModel#getMExtensions()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_MExtensions();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MFieldSignature <em>MField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MField Signature</em>'.
	 * @see org.gravity.modisco.MFieldSignature
	 * @generated
	 */
	EClass getMFieldSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MFieldSignature#getMFieldName <em>MField Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MField Name</em>'.
	 * @see org.gravity.modisco.MFieldSignature#getMFieldName()
	 * @see #getMFieldSignature()
	 * @generated
	 */
	EReference getMFieldSignature_MFieldName();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.modisco.MFieldSignature#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.gravity.modisco.MFieldSignature#getModel()
	 * @see #getMFieldSignature()
	 * @generated
	 */
	EReference getMFieldSignature_Model();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MFieldSignature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gravity.modisco.MFieldSignature#getType()
	 * @see #getMFieldSignature()
	 * @generated
	 */
	EReference getMFieldSignature_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MFieldSignature#getMFieldDefinitions <em>MField Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>MField Definitions</em>'.
	 * @see org.gravity.modisco.MFieldSignature#getMFieldDefinitions()
	 * @see #getMFieldSignature()
	 * @generated
	 */
	EReference getMFieldSignature_MFieldDefinitions();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MAnnotation <em>MAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAnnotation</em>'.
	 * @see org.gravity.modisco.MAnnotation
	 * @generated
	 */
	EClass getMAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.modisco.MAnnotation#isMRelevant <em>MRelevant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MRelevant</em>'.
	 * @see org.gravity.modisco.MAnnotation#isMRelevant()
	 * @see #getMAnnotation()
	 * @generated
	 */
	EAttribute getMAnnotation_MRelevant();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MSyntheticMethodDefinition <em>MSynthetic Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSynthetic Method Definition</em>'.
	 * @see org.gravity.modisco.MSyntheticMethodDefinition
	 * @generated
	 */
	EClass getMSyntheticMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MSyntheticMethodDefinition#getOriginalMethodDefinition <em>Original Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Method Definition</em>'.
	 * @see org.gravity.modisco.MSyntheticMethodDefinition#getOriginalMethodDefinition()
	 * @see #getMSyntheticMethodDefinition()
	 * @generated
	 */
	EReference getMSyntheticMethodDefinition_OriginalMethodDefinition();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MAnonymous <em>MAnonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAnonymous</em>'.
	 * @see org.gravity.modisco.MAnonymous
	 * @generated
	 */
	EClass getMAnonymous();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MAnonymous#getMSourroundingType <em>MSourrounding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MSourrounding Type</em>'.
	 * @see org.gravity.modisco.MAnonymous#getMSourroundingType()
	 * @see #getMAnonymous()
	 * @generated
	 */
	EReference getMAnonymous_MSourroundingType();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass</em>'.
	 * @see org.gravity.modisco.MClass
	 * @generated
	 */
	EClass getMClass();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MClass#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.gravity.modisco.MClass#getDependencies()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_Dependencies();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MExtension <em>MExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MExtension</em>'.
	 * @see org.gravity.modisco.MExtension
	 * @generated
	 */
	EClass getMExtension();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModiscoFactory getModiscoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MAbstractMethodDefinitionImpl <em>MAbstract Method Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MAbstractMethodDefinitionImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAbstractMethodDefinition()
		 * @generated
		 */
		EClass MABSTRACT_METHOD_DEFINITION = eINSTANCE.getMAbstractMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>MInner Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MABSTRACT_METHOD_DEFINITION__MINNER_TYPES = eINSTANCE.getMAbstractMethodDefinition_MInnerTypes();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MConstructorDefinitionImpl <em>MConstructor Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MConstructorDefinitionImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMConstructorDefinition()
		 * @generated
		 */
		EClass MCONSTRUCTOR_DEFINITION = eINSTANCE.getMConstructorDefinition();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONSTRUCTOR_DEFINITION__MODEL = eINSTANCE.getMConstructorDefinition_Model();

		/**
		 * The meta object literal for the '<em><b>MParameter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONSTRUCTOR_DEFINITION__MPARAMETER_LIST = eINSTANCE.getMConstructorDefinition_MParameterList();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MDefinitionImpl <em>MDefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MDefinitionImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMDefinition()
		 * @generated
		 */
		EClass MDEFINITION = eINSTANCE.getMDefinition();

		/**
		 * The meta object literal for the '<em><b>MMethod Invocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDEFINITION__MMETHOD_INVOCATIONS = eINSTANCE.getMDefinition_MMethodInvocations();

		/**
		 * The meta object literal for the '<em><b>MAbstract Field Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDEFINITION__MABSTRACT_FIELD_ACCESS = eINSTANCE.getMDefinition_MAbstractFieldAccess();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MMethodSignatureImpl <em>MMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MMethodSignatureImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodSignature()
		 * @generated
		 */
		EClass MMETHOD_SIGNATURE = eINSTANCE.getMMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_SIGNATURE__MODEL = eINSTANCE.getMMethodSignature_Model();

		/**
		 * The meta object literal for the '<em><b>MMethod Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_SIGNATURE__MMETHOD_NAME = eINSTANCE.getMMethodSignature_MMethodName();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_SIGNATURE__RETURN_TYPE = eINSTANCE.getMMethodSignature_ReturnType();

		/**
		 * The meta object literal for the '<em><b>MMethod Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS = eINSTANCE.getMMethodSignature_MMethodDefinitions();

		/**
		 * The meta object literal for the '<em><b>MParameter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_SIGNATURE__MPARAMETER_LIST = eINSTANCE.getMMethodSignature_MParameterList();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MParameterListImpl <em>MParameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MParameterListImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMParameterList()
		 * @generated
		 */
		EClass MPARAMETER_LIST = eINSTANCE.getMParameterList();

		/**
		 * The meta object literal for the '<em><b>MFirst Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPARAMETER_LIST__MFIRST_ENTRY = eINSTANCE.getMParameterList_MFirstEntry();

		/**
		 * The meta object literal for the '<em><b>MEntrys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPARAMETER_LIST__MENTRYS = eINSTANCE.getMParameterList_MEntrys();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MNameImpl <em>MName</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MNameImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMName()
		 * @generated
		 */
		EClass MNAME = eINSTANCE.getMName();

		/**
		 * The meta object literal for the '<em><b>MSignatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MNAME__MSIGNATURES = eINSTANCE.getMName_MSignatures();

		/**
		 * The meta object literal for the '<em><b>MName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MNAME__MNAME = eINSTANCE.getMName_MName();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MMethodNameImpl <em>MMethod Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MMethodNameImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodName()
		 * @generated
		 */
		EClass MMETHOD_NAME = eINSTANCE.getMMethodName();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_NAME__MODEL = eINSTANCE.getMMethodName_Model();

		/**
		 * The meta object literal for the '<em><b>MMethod Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_NAME__MMETHOD_DEFINITIONS = eINSTANCE.getMMethodName_MMethodDefinitions();

		/**
		 * The meta object literal for the '<em><b>MMethod Signatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_NAME__MMETHOD_SIGNATURES = eINSTANCE.getMMethodName_MMethodSignatures();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MFieldNameImpl <em>MField Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MFieldNameImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMFieldName()
		 * @generated
		 */
		EClass MFIELD_NAME = eINSTANCE.getMFieldName();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_NAME__MODEL = eINSTANCE.getMFieldName_Model();

		/**
		 * The meta object literal for the '<em><b>MField Signatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_NAME__MFIELD_SIGNATURES = eINSTANCE.getMFieldName_MFieldSignatures();

		/**
		 * The meta object literal for the '<em><b>MField Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_NAME__MFIELD_DEFINITIONS = eINSTANCE.getMFieldName_MFieldDefinitions();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MFieldDefinitionImpl <em>MField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MFieldDefinitionImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMFieldDefinition()
		 * @generated
		 */
		EClass MFIELD_DEFINITION = eINSTANCE.getMFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>MField Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_DEFINITION__MFIELD_SIGNATURE = eINSTANCE.getMFieldDefinition_MFieldSignature();

		/**
		 * The meta object literal for the '<em><b>MField Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_DEFINITION__MFIELD_NAME = eINSTANCE.getMFieldDefinition_MFieldName();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_DEFINITION__MODEL = eINSTANCE.getMFieldDefinition_Model();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MMethodDefinitionImpl <em>MMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MMethodDefinitionImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodDefinition()
		 * @generated
		 */
		EClass MMETHOD_DEFINITION = eINSTANCE.getMMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>MMethod Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_DEFINITION__MMETHOD_NAME = eINSTANCE.getMMethodDefinition_MMethodName();

		/**
		 * The meta object literal for the '<em><b>MMethod Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_DEFINITION__MMETHOD_SIGNATURE = eINSTANCE.getMMethodDefinition_MMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_DEFINITION__MODEL = eINSTANCE.getMMethodDefinition_Model();

		/**
		 * The meta object literal for the '<em><b>Synthetic Method Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS = eINSTANCE.getMMethodDefinition_SyntheticMethodDefinitions();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MMethodInvocationImpl <em>MMethod Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MMethodInvocationImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodInvocation()
		 * @generated
		 */
		EClass MMETHOD_INVOCATION = eINSTANCE.getMMethodInvocation();

		/**
		 * The meta object literal for the '<em><b>MStatic Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD_INVOCATION__MSTATIC_TYPE = eINSTANCE.getMMethodInvocation_MStaticType();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MSignatureImpl <em>MSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MSignatureImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSignature()
		 * @generated
		 */
		EClass MSIGNATURE = eINSTANCE.getMSignature();

		/**
		 * The meta object literal for the '<em><b>MDefinitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIGNATURE__MDEFINITIONS = eINSTANCE.getMSignature_MDefinitions();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSIGNATURE__IMPLEMENTED_BY = eINSTANCE.getMSignature_ImplementedBy();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MEntryImpl <em>MEntry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MEntryImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMEntry()
		 * @generated
		 */
		EClass MENTRY = eINSTANCE.getMEntry();

		/**
		 * The meta object literal for the '<em><b>MNext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTRY__MNEXT = eINSTANCE.getMEntry_MNext();

		/**
		 * The meta object literal for the '<em><b>MPrevious</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTRY__MPREVIOUS = eINSTANCE.getMEntry_MPrevious();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTRY__TYPE = eINSTANCE.getMEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Single Variable Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTRY__SINGLE_VARIABLE_DECLARATION = eINSTANCE.getMEntry_SingleVariableDeclaration();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MGravityModelImpl <em>MGravity Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MGravityModelImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMGravityModel()
		 * @generated
		 */
		EClass MGRAVITY_MODEL = eINSTANCE.getMGravityModel();

		/**
		 * The meta object literal for the '<em><b>MMethod Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MMETHOD_DEFINITIONS = eINSTANCE.getMGravityModel_MMethodDefinitions();

		/**
		 * The meta object literal for the '<em><b>MField Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MFIELD_DEFINITIONS = eINSTANCE.getMGravityModel_MFieldDefinitions();

		/**
		 * The meta object literal for the '<em><b>MConstructor Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MCONSTRUCTOR_DEFINITIONS = eINSTANCE.getMGravityModel_MConstructorDefinitions();

		/**
		 * The meta object literal for the '<em><b>MMethod Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MMETHOD_NAMES = eINSTANCE.getMGravityModel_MMethodNames();

		/**
		 * The meta object literal for the '<em><b>MNames</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MNAMES = eINSTANCE.getMGravityModel_MNames();

		/**
		 * The meta object literal for the '<em><b>MMethod Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MMETHOD_SIGNATURES = eINSTANCE.getMGravityModel_MMethodSignatures();

		/**
		 * The meta object literal for the '<em><b>MField Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MFIELD_SIGNATURES = eINSTANCE.getMGravityModel_MFieldSignatures();

		/**
		 * The meta object literal for the '<em><b>MField Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MFIELD_NAMES = eINSTANCE.getMGravityModel_MFieldNames();

		/**
		 * The meta object literal for the '<em><b>MAbstract Method Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS = eINSTANCE.getMGravityModel_MAbstractMethodDefinitions();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__TYPE_PARAMETERS = eINSTANCE.getMGravityModel_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>MExtensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__MEXTENSIONS = eINSTANCE.getMGravityModel_MExtensions();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MFieldSignatureImpl <em>MField Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MFieldSignatureImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMFieldSignature()
		 * @generated
		 */
		EClass MFIELD_SIGNATURE = eINSTANCE.getMFieldSignature();

		/**
		 * The meta object literal for the '<em><b>MField Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_SIGNATURE__MFIELD_NAME = eINSTANCE.getMFieldSignature_MFieldName();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_SIGNATURE__MODEL = eINSTANCE.getMFieldSignature_Model();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_SIGNATURE__TYPE = eINSTANCE.getMFieldSignature_Type();

		/**
		 * The meta object literal for the '<em><b>MField Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFIELD_SIGNATURE__MFIELD_DEFINITIONS = eINSTANCE.getMFieldSignature_MFieldDefinitions();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MAnnotationImpl <em>MAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MAnnotationImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAnnotation()
		 * @generated
		 */
		EClass MANNOTATION = eINSTANCE.getMAnnotation();

		/**
		 * The meta object literal for the '<em><b>MRelevant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANNOTATION__MRELEVANT = eINSTANCE.getMAnnotation_MRelevant();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MSyntheticMethodDefinitionImpl <em>MSynthetic Method Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MSyntheticMethodDefinitionImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSyntheticMethodDefinition()
		 * @generated
		 */
		EClass MSYNTHETIC_METHOD_DEFINITION = eINSTANCE.getMSyntheticMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Original Method Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION = eINSTANCE.getMSyntheticMethodDefinition_OriginalMethodDefinition();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MAnonymousImpl <em>MAnonymous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MAnonymousImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAnonymous()
		 * @generated
		 */
		EClass MANONYMOUS = eINSTANCE.getMAnonymous();

		/**
		 * The meta object literal for the '<em><b>MSourrounding Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANONYMOUS__MSOURROUNDING_TYPE = eINSTANCE.getMAnonymous_MSourroundingType();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MClassImpl <em>MClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MClassImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMClass()
		 * @generated
		 */
		EClass MCLASS = eINSTANCE.getMClass();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__DEPENDENCIES = eINSTANCE.getMClass_Dependencies();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MExtensionImpl <em>MExtension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MExtensionImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMExtension()
		 * @generated
		 */
		EClass MEXTENSION = eINSTANCE.getMExtension();

	}

} //ModiscoPackage
