/**
 */
package org.gravity.modisco;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	int MDEFINITION = 3;

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
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__OWNED_FLOWS = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__INCOMING_FLOWS = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__OUTGOING_FLOWS = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invocation Static Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__INVOCATION_STATIC_TYPES = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MMethod Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__MMETHOD_INVOCATIONS = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION__MABSTRACT_FIELD_ACCESS = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MDefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDEFINITION_FEATURE_COUNT = JavaPackage.BODY_DECLARATION_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__OWNED_FLOWS = MDEFINITION__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__INCOMING_FLOWS = MDEFINITION__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__OUTGOING_FLOWS = MDEFINITION__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Invocation Static Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__INVOCATION_STATIC_TYPES = MDEFINITION__INVOCATION_STATIC_TYPES;

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
	 * The feature id for the '<em><b>MMethod Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__MMETHOD_NAME = MDEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION__MMETHOD_SIGNATURE = MDEFINITION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>MAbstract Method Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_DEFINITION_FEATURE_COUNT = MDEFINITION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MAbstractFlowElementImpl <em>MAbstract Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MAbstractFlowElementImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAbstractFlowElement()
	 * @generated
	 */
	int MABSTRACT_FLOW_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS = 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS = 2;

	/**
	 * The number of structural features of the '<em>MAbstract Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MAccessImpl <em>MAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MAccessImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAccess()
	 * @generated
	 */
	int MACCESS = 1;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACCESS__OWNED_FLOWS = MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACCESS__INCOMING_FLOWS = MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACCESS__OUTGOING_FLOWS = MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;

	/**
	 * The number of structural features of the '<em>MAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACCESS_FEATURE_COUNT = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MConstructorDefinitionImpl <em>MConstructor Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MConstructorDefinitionImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMConstructorDefinition()
	 * @generated
	 */
	int MCONSTRUCTOR_DEFINITION = 2;

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
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__OWNED_FLOWS = MABSTRACT_METHOD_DEFINITION__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__INCOMING_FLOWS = MABSTRACT_METHOD_DEFINITION__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__OUTGOING_FLOWS = MABSTRACT_METHOD_DEFINITION__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Invocation Static Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__INVOCATION_STATIC_TYPES = MABSTRACT_METHOD_DEFINITION__INVOCATION_STATIC_TYPES;

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
	 * The feature id for the '<em><b>MMethod Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__MMETHOD_NAME = MABSTRACT_METHOD_DEFINITION__MMETHOD_NAME;

	/**
	 * The feature id for the '<em><b>MMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__MMETHOD_SIGNATURE = MABSTRACT_METHOD_DEFINITION__MMETHOD_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION__MODEL = MABSTRACT_METHOD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MConstructor Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_DEFINITION_FEATURE_COUNT = MABSTRACT_METHOD_DEFINITION_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE__OWNED_FLOWS = MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE__INCOMING_FLOWS = MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE__OUTGOING_FLOWS = MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>MDefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE__MDEFINITIONS = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSIGNATURE_FEATURE_COUNT = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MMethodSignatureImpl <em>MMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MMethodSignatureImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodSignature()
	 * @generated
	 */
	int MMETHOD_SIGNATURE = 4;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__OWNED_FLOWS = MSIGNATURE__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__INCOMING_FLOWS = MSIGNATURE__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__OUTGOING_FLOWS = MSIGNATURE__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>MDefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MDEFINITIONS = MSIGNATURE__MDEFINITIONS;

	/**
	 * The feature id for the '<em><b>MFirst Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MFIRST_ENTRY = MSIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MEntrys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MENTRYS = MSIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MODEL = MSIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MMethod Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MMETHOD_NAME = MSIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__RETURN_TYPE = MSIGNATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MMethod Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE__MMETHOD_DEFINITIONS = MSIGNATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_SIGNATURE_FEATURE_COUNT = MSIGNATURE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MParameterListImpl <em>MParameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MParameterListImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMParameterList()
	 * @generated
	 */
	int MPARAMETER_LIST = 5;

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
	int MNAME = 6;

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
	int MMETHOD_NAME = 7;

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
	int MFIELD_NAME = 8;

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
	int MFIELD_DEFINITION = 9;

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
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__OWNED_FLOWS = MDEFINITION__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__INCOMING_FLOWS = MDEFINITION__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__OUTGOING_FLOWS = MDEFINITION__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Invocation Static Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_DEFINITION__INVOCATION_STATIC_TYPES = MDEFINITION__INVOCATION_STATIC_TYPES;

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
	int MMETHOD_DEFINITION = 10;

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
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__OWNED_FLOWS = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__INCOMING_FLOWS = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__OUTGOING_FLOWS = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invocation Static Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__INVOCATION_STATIC_TYPES = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MMethod Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MMETHOD_INVOCATIONS = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MABSTRACT_FIELD_ACCESS = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MInner Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MINNER_TYPES = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MMethod Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MMETHOD_NAME = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MMethod Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MMETHOD_SIGNATURE = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__MODEL = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synthetic Method Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>MMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_DEFINITION_FEATURE_COUNT = JavaPackage.METHOD_DECLARATION_FEATURE_COUNT + 11;

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
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__OWNED_FLOWS = MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__INCOMING_FLOWS = MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__OUTGOING_FLOWS = MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>MNext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__MNEXT = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MPrevious</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__MPREVIOUS = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__TYPE = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY__PARAMETERS = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MEntry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTRY_FEATURE_COUNT = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Anonymous Class Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS = JavaPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MMethod Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MMETHOD_NAMES = JavaPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MNames</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MNAMES = JavaPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MMethod Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MMETHOD_SIGNATURES = JavaPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MField Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MFIELD_SIGNATURES = JavaPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>MField Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MFIELD_NAMES = JavaPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>MAbstract Method Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS = JavaPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__TYPE_PARAMETERS = JavaPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>MExtensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL__MEXTENSIONS = JavaPackage.MODEL_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>MGravity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRAVITY_MODEL_FEATURE_COUNT = JavaPackage.MODEL_FEATURE_COUNT + 12;

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
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__OWNED_FLOWS = MSIGNATURE__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__INCOMING_FLOWS = MSIGNATURE__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__OUTGOING_FLOWS = MSIGNATURE__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>MDefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFIELD_SIGNATURE__MDEFINITIONS = MSIGNATURE__MDEFINITIONS;

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
	 * The meta object id for the '{@link org.gravity.modisco.impl.MSyntheticMethodDefinitionImpl <em>MSynthetic Method Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MSyntheticMethodDefinitionImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSyntheticMethodDefinition()
	 * @generated
	 */
	int MSYNTHETIC_METHOD_DEFINITION = 15;

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
	 * The meta object id for the '{@link org.gravity.modisco.impl.MethodInvocationStaticTypeImpl <em>Method Invocation Static Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MethodInvocationStaticTypeImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMethodInvocationStaticType()
	 * @generated
	 */
	int METHOD_INVOCATION_STATIC_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Method Invoc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE__METHOD_INVOC = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Method Invocation Static Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_STATIC_TYPE_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link org.gravity.modisco.impl.MFlowImpl <em>MFlow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MFlowImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMFlow()
	 * @generated
	 */
	int MFLOW = 20;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW__OWNED_FLOWS = MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW__INCOMING_FLOWS = MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW__OUTGOING_FLOWS = MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Flow Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW__FLOW_SOURCE = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW__FLOW_TARGET = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flow Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW__FLOW_OWNER = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFLOW_FEATURE_COUNT = MABSTRACT_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MSingleVariableAccessImpl <em>MSingle Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MSingleVariableAccessImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSingleVariableAccess()
	 * @generated
	 */
	int MSINGLE_VARIABLE_ACCESS = 22;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS__COMMENTS = JavaPackage.SINGLE_VARIABLE_ACCESS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS__ORIGINAL_COMPILATION_UNIT = JavaPackage.SINGLE_VARIABLE_ACCESS__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS__ORIGINAL_CLASS_FILE = JavaPackage.SINGLE_VARIABLE_ACCESS__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS__VARIABLE = JavaPackage.SINGLE_VARIABLE_ACCESS__VARIABLE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS__QUALIFIER = JavaPackage.SINGLE_VARIABLE_ACCESS__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS__OWNED_FLOWS = JavaPackage.SINGLE_VARIABLE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS__INCOMING_FLOWS = JavaPackage.SINGLE_VARIABLE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS__OUTGOING_FLOWS = JavaPackage.SINGLE_VARIABLE_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS__ACCESS_KIND = JavaPackage.SINGLE_VARIABLE_ACCESS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MSingle Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_ACCESS_FEATURE_COUNT = JavaPackage.SINGLE_VARIABLE_ACCESS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MMethodInvocationImpl <em>MMethod Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MMethodInvocationImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMMethodInvocation()
	 * @generated
	 */
	int MMETHOD_INVOCATION = 23;

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
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__OWNED_FLOWS = JavaPackage.METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__INCOMING_FLOWS = JavaPackage.METHOD_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__OUTGOING_FLOWS = JavaPackage.METHOD_INVOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MStatic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION__MSTATIC_TYPE = JavaPackage.METHOD_INVOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MMethod Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_INVOCATION_FEATURE_COUNT = JavaPackage.METHOD_INVOCATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MConstructorInvocationImpl <em>MConstructor Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MConstructorInvocationImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMConstructorInvocation()
	 * @generated
	 */
	int MCONSTRUCTOR_INVOCATION = 24;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION__COMMENTS = JavaPackage.CONSTRUCTOR_INVOCATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION__ORIGINAL_COMPILATION_UNIT = JavaPackage.CONSTRUCTOR_INVOCATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION__ORIGINAL_CLASS_FILE = JavaPackage.CONSTRUCTOR_INVOCATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION__METHOD = JavaPackage.CONSTRUCTOR_INVOCATION__METHOD;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION__ARGUMENTS = JavaPackage.CONSTRUCTOR_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS = JavaPackage.CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION__OWNED_FLOWS = JavaPackage.CONSTRUCTOR_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION__INCOMING_FLOWS = JavaPackage.CONSTRUCTOR_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION__OUTGOING_FLOWS = JavaPackage.CONSTRUCTOR_INVOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MConstructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_INVOCATION_FEATURE_COUNT = JavaPackage.CONSTRUCTOR_INVOCATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MSingleVariableDeclarationImpl <em>MSingle Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MSingleVariableDeclarationImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSingleVariableDeclaration()
	 * @generated
	 */
	int MSINGLE_VARIABLE_DECLARATION = 25;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__COMMENTS = JavaPackage.SINGLE_VARIABLE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT = JavaPackage.SINGLE_VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE = JavaPackage.SINGLE_VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__NAME = JavaPackage.SINGLE_VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__PROXY = JavaPackage.SINGLE_VARIABLE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__USAGES_IN_IMPORTS = JavaPackage.SINGLE_VARIABLE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = JavaPackage.SINGLE_VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__INITIALIZER = JavaPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER;

	/**
	 * The feature id for the '<em><b>Usage In Variable Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS = JavaPackage.SINGLE_VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__MODIFIER = JavaPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Varargs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__VARARGS = JavaPackage.SINGLE_VARIABLE_DECLARATION__VARARGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__TYPE = JavaPackage.SINGLE_VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__ANNOTATIONS = JavaPackage.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Method Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION = JavaPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION;

	/**
	 * The feature id for the '<em><b>Catch Clause</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE = JavaPackage.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE;

	/**
	 * The feature id for the '<em><b>Enhanced For Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT = JavaPackage.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT;

	/**
	 * The feature id for the '<em><b>MEntry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION__MENTRY = JavaPackage.SINGLE_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MSingle Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSINGLE_VARIABLE_DECLARATION_FEATURE_COUNT = JavaPackage.SINGLE_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MAbstractMethodInvocationImpl <em>MAbstract Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MAbstractMethodInvocationImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAbstractMethodInvocation()
	 * @generated
	 */
	int MABSTRACT_METHOD_INVOCATION = 26;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION__COMMENTS = JavaPackage.ABSTRACT_METHOD_INVOCATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = JavaPackage.ABSTRACT_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION__ORIGINAL_CLASS_FILE = JavaPackage.ABSTRACT_METHOD_INVOCATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION__METHOD = JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION__ARGUMENTS = JavaPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS = JavaPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION__OWNED_FLOWS = JavaPackage.ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION__INCOMING_FLOWS = JavaPackage.ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION__OUTGOING_FLOWS = JavaPackage.ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MAbstract Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_METHOD_INVOCATION_FEATURE_COUNT = JavaPackage.ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MSuperMethodInvocationImpl <em>MSuper Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MSuperMethodInvocationImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSuperMethodInvocation()
	 * @generated
	 */
	int MSUPER_METHOD_INVOCATION = 27;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__COMMENTS = JavaPackage.SUPER_METHOD_INVOCATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = JavaPackage.SUPER_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__ORIGINAL_CLASS_FILE = JavaPackage.SUPER_METHOD_INVOCATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__QUALIFIER = JavaPackage.SUPER_METHOD_INVOCATION__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__METHOD = JavaPackage.SUPER_METHOD_INVOCATION__METHOD;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__ARGUMENTS = JavaPackage.SUPER_METHOD_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__TYPE_ARGUMENTS = JavaPackage.SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__OWNED_FLOWS = JavaPackage.SUPER_METHOD_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__INCOMING_FLOWS = JavaPackage.SUPER_METHOD_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION__OUTGOING_FLOWS = JavaPackage.SUPER_METHOD_INVOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MSuper Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_METHOD_INVOCATION_FEATURE_COUNT = JavaPackage.SUPER_METHOD_INVOCATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MClassInstanceCreationImpl <em>MClass Instance Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MClassInstanceCreationImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMClassInstanceCreation()
	 * @generated
	 */
	int MCLASS_INSTANCE_CREATION = 28;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__COMMENTS = JavaPackage.CLASS_INSTANCE_CREATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__ORIGINAL_COMPILATION_UNIT = JavaPackage.CLASS_INSTANCE_CREATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__ORIGINAL_CLASS_FILE = JavaPackage.CLASS_INSTANCE_CREATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__METHOD = JavaPackage.CLASS_INSTANCE_CREATION__METHOD;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__ARGUMENTS = JavaPackage.CLASS_INSTANCE_CREATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__TYPE_ARGUMENTS = JavaPackage.CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION = JavaPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__EXPRESSION = JavaPackage.CLASS_INSTANCE_CREATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__TYPE = JavaPackage.CLASS_INSTANCE_CREATION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__OWNED_FLOWS = JavaPackage.CLASS_INSTANCE_CREATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__INCOMING_FLOWS = JavaPackage.CLASS_INSTANCE_CREATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION__OUTGOING_FLOWS = JavaPackage.CLASS_INSTANCE_CREATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MClass Instance Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_INSTANCE_CREATION_FEATURE_COUNT = JavaPackage.CLASS_INSTANCE_CREATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.impl.MSuperConstructorInvocationImpl <em>MSuper Constructor Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.impl.MSuperConstructorInvocationImpl
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSuperConstructorInvocation()
	 * @generated
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION = 29;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__COMMENTS = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__ORIGINAL_COMPILATION_UNIT = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__ORIGINAL_CLASS_FILE = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__METHOD = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__EXPRESSION = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__OWNED_FLOWS = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__INCOMING_FLOWS = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION__OUTGOING_FLOWS = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MSuper Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSUPER_CONSTRUCTOR_INVOCATION_FEATURE_COUNT = JavaPackage.SUPER_CONSTRUCTOR_INVOCATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gravity.modisco.AccessKind <em>Access Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.modisco.AccessKind
	 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getAccessKind()
	 * @generated
	 */
	int ACCESS_KIND = 30;


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
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MAbstractMethodDefinition#getMMethodName <em>MMethod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MMethod Name</em>'.
	 * @see org.gravity.modisco.MAbstractMethodDefinition#getMMethodName()
	 * @see #getMAbstractMethodDefinition()
	 * @generated
	 */
	EReference getMAbstractMethodDefinition_MMethodName();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MAbstractMethodDefinition#getMMethodSignature <em>MMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MMethod Signature</em>'.
	 * @see org.gravity.modisco.MAbstractMethodDefinition#getMMethodSignature()
	 * @see #getMAbstractMethodDefinition()
	 * @generated
	 */
	EReference getMAbstractMethodDefinition_MMethodSignature();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MAccess <em>MAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAccess</em>'.
	 * @see org.gravity.modisco.MAccess
	 * @generated
	 */
	EClass getMAccess();

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
	 * Returns the meta object for class '{@link org.gravity.modisco.MDefinition <em>MDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDefinition</em>'.
	 * @see org.gravity.modisco.MDefinition
	 * @generated
	 */
	EClass getMDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MDefinition#getInvocationStaticTypes <em>Invocation Static Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invocation Static Types</em>'.
	 * @see org.gravity.modisco.MDefinition#getInvocationStaticTypes()
	 * @see #getMDefinition()
	 * @generated
	 */
	EReference getMDefinition_InvocationStaticTypes();

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
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MEntry#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.gravity.modisco.MEntry#getParameters()
	 * @see #getMEntry()
	 * @generated
	 */
	EReference getMEntry_Parameters();

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
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MGravityModel#getAnonymousClassDeclarations <em>Anonymous Class Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Anonymous Class Declarations</em>'.
	 * @see org.gravity.modisco.MGravityModel#getAnonymousClassDeclarations()
	 * @see #getMGravityModel()
	 * @generated
	 */
	EReference getMGravityModel_AnonymousClassDeclarations();

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
	 * Returns the meta object for class '{@link org.gravity.modisco.MethodInvocationStaticType <em>Method Invocation Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation Static Type</em>'.
	 * @see org.gravity.modisco.MethodInvocationStaticType
	 * @generated
	 */
	EClass getMethodInvocationStaticType();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MethodInvocationStaticType#getMethodInvoc <em>Method Invoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method Invoc</em>'.
	 * @see org.gravity.modisco.MethodInvocationStaticType#getMethodInvoc()
	 * @see #getMethodInvocationStaticType()
	 * @generated
	 */
	EReference getMethodInvocationStaticType_MethodInvoc();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MethodInvocationStaticType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gravity.modisco.MethodInvocationStaticType#getType()
	 * @see #getMethodInvocationStaticType()
	 * @generated
	 */
	EReference getMethodInvocationStaticType_Type();

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
	 * Returns the meta object for class '{@link org.gravity.modisco.MFlow <em>MFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFlow</em>'.
	 * @see org.gravity.modisco.MFlow
	 * @generated
	 */
	EClass getMFlow();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MFlow#getFlowSource <em>Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow Source</em>'.
	 * @see org.gravity.modisco.MFlow#getFlowSource()
	 * @see #getMFlow()
	 * @generated
	 */
	EReference getMFlow_FlowSource();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MFlow#getFlowTarget <em>Flow Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow Target</em>'.
	 * @see org.gravity.modisco.MFlow#getFlowTarget()
	 * @see #getMFlow()
	 * @generated
	 */
	EReference getMFlow_FlowTarget();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.modisco.MFlow#getFlowOwner <em>Flow Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flow Owner</em>'.
	 * @see org.gravity.modisco.MFlow#getFlowOwner()
	 * @see #getMFlow()
	 * @generated
	 */
	EReference getMFlow_FlowOwner();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MAbstractFlowElement <em>MAbstract Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAbstract Flow Element</em>'.
	 * @see org.gravity.modisco.MAbstractFlowElement
	 * @generated
	 */
	EClass getMAbstractFlowElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.modisco.MAbstractFlowElement#getOwnedFlows <em>Owned Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Flows</em>'.
	 * @see org.gravity.modisco.MAbstractFlowElement#getOwnedFlows()
	 * @see #getMAbstractFlowElement()
	 * @generated
	 */
	EReference getMAbstractFlowElement_OwnedFlows();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MAbstractFlowElement#getIncomingFlows <em>Incoming Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Flows</em>'.
	 * @see org.gravity.modisco.MAbstractFlowElement#getIncomingFlows()
	 * @see #getMAbstractFlowElement()
	 * @generated
	 */
	EReference getMAbstractFlowElement_IncomingFlows();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.modisco.MAbstractFlowElement#getOutgoingFlows <em>Outgoing Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Flows</em>'.
	 * @see org.gravity.modisco.MAbstractFlowElement#getOutgoingFlows()
	 * @see #getMAbstractFlowElement()
	 * @generated
	 */
	EReference getMAbstractFlowElement_OutgoingFlows();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MSingleVariableAccess <em>MSingle Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSingle Variable Access</em>'.
	 * @see org.gravity.modisco.MSingleVariableAccess
	 * @generated
	 */
	EClass getMSingleVariableAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.modisco.MSingleVariableAccess#getAccessKind <em>Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Kind</em>'.
	 * @see org.gravity.modisco.MSingleVariableAccess#getAccessKind()
	 * @see #getMSingleVariableAccess()
	 * @generated
	 */
	EAttribute getMSingleVariableAccess_AccessKind();

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
	 * Returns the meta object for class '{@link org.gravity.modisco.MConstructorInvocation <em>MConstructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MConstructor Invocation</em>'.
	 * @see org.gravity.modisco.MConstructorInvocation
	 * @generated
	 */
	EClass getMConstructorInvocation();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MSingleVariableDeclaration <em>MSingle Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSingle Variable Declaration</em>'.
	 * @see org.gravity.modisco.MSingleVariableDeclaration
	 * @generated
	 */
	EClass getMSingleVariableDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.modisco.MSingleVariableDeclaration#getMEntry <em>MEntry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MEntry</em>'.
	 * @see org.gravity.modisco.MSingleVariableDeclaration#getMEntry()
	 * @see #getMSingleVariableDeclaration()
	 * @generated
	 */
	EReference getMSingleVariableDeclaration_MEntry();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MAbstractMethodInvocation <em>MAbstract Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAbstract Method Invocation</em>'.
	 * @see org.gravity.modisco.MAbstractMethodInvocation
	 * @generated
	 */
	EClass getMAbstractMethodInvocation();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MSuperMethodInvocation <em>MSuper Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSuper Method Invocation</em>'.
	 * @see org.gravity.modisco.MSuperMethodInvocation
	 * @generated
	 */
	EClass getMSuperMethodInvocation();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MClassInstanceCreation <em>MClass Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass Instance Creation</em>'.
	 * @see org.gravity.modisco.MClassInstanceCreation
	 * @generated
	 */
	EClass getMClassInstanceCreation();

	/**
	 * Returns the meta object for class '{@link org.gravity.modisco.MSuperConstructorInvocation <em>MSuper Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSuper Constructor Invocation</em>'.
	 * @see org.gravity.modisco.MSuperConstructorInvocation
	 * @generated
	 */
	EClass getMSuperConstructorInvocation();

	/**
	 * Returns the meta object for enum '{@link org.gravity.modisco.AccessKind <em>Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Kind</em>'.
	 * @see org.gravity.modisco.AccessKind
	 * @generated
	 */
	EEnum getAccessKind();

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
		 * The meta object literal for the '<em><b>MMethod Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MABSTRACT_METHOD_DEFINITION__MMETHOD_NAME = eINSTANCE.getMAbstractMethodDefinition_MMethodName();

		/**
		 * The meta object literal for the '<em><b>MMethod Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MABSTRACT_METHOD_DEFINITION__MMETHOD_SIGNATURE = eINSTANCE.getMAbstractMethodDefinition_MMethodSignature();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MAccessImpl <em>MAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MAccessImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAccess()
		 * @generated
		 */
		EClass MACCESS = eINSTANCE.getMAccess();

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
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MDefinitionImpl <em>MDefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MDefinitionImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMDefinition()
		 * @generated
		 */
		EClass MDEFINITION = eINSTANCE.getMDefinition();

		/**
		 * The meta object literal for the '<em><b>Invocation Static Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDEFINITION__INVOCATION_STATIC_TYPES = eINSTANCE.getMDefinition_InvocationStaticTypes();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTRY__PARAMETERS = eINSTANCE.getMEntry_Parameters();

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
		 * The meta object literal for the '<em><b>Anonymous Class Declarations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS = eINSTANCE.getMGravityModel_AnonymousClassDeclarations();

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
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MethodInvocationStaticTypeImpl <em>Method Invocation Static Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MethodInvocationStaticTypeImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMethodInvocationStaticType()
		 * @generated
		 */
		EClass METHOD_INVOCATION_STATIC_TYPE = eINSTANCE.getMethodInvocationStaticType();

		/**
		 * The meta object literal for the '<em><b>Method Invoc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION_STATIC_TYPE__METHOD_INVOC = eINSTANCE.getMethodInvocationStaticType_MethodInvoc();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION_STATIC_TYPE__TYPE = eINSTANCE.getMethodInvocationStaticType_Type();

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

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MFlowImpl <em>MFlow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MFlowImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMFlow()
		 * @generated
		 */
		EClass MFLOW = eINSTANCE.getMFlow();

		/**
		 * The meta object literal for the '<em><b>Flow Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFLOW__FLOW_SOURCE = eINSTANCE.getMFlow_FlowSource();

		/**
		 * The meta object literal for the '<em><b>Flow Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFLOW__FLOW_TARGET = eINSTANCE.getMFlow_FlowTarget();

		/**
		 * The meta object literal for the '<em><b>Flow Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MFLOW__FLOW_OWNER = eINSTANCE.getMFlow_FlowOwner();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MAbstractFlowElementImpl <em>MAbstract Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MAbstractFlowElementImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAbstractFlowElement()
		 * @generated
		 */
		EClass MABSTRACT_FLOW_ELEMENT = eINSTANCE.getMAbstractFlowElement();

		/**
		 * The meta object literal for the '<em><b>Owned Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS = eINSTANCE.getMAbstractFlowElement_OwnedFlows();

		/**
		 * The meta object literal for the '<em><b>Incoming Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS = eINSTANCE.getMAbstractFlowElement_IncomingFlows();

		/**
		 * The meta object literal for the '<em><b>Outgoing Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS = eINSTANCE.getMAbstractFlowElement_OutgoingFlows();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MSingleVariableAccessImpl <em>MSingle Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MSingleVariableAccessImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSingleVariableAccess()
		 * @generated
		 */
		EClass MSINGLE_VARIABLE_ACCESS = eINSTANCE.getMSingleVariableAccess();

		/**
		 * The meta object literal for the '<em><b>Access Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSINGLE_VARIABLE_ACCESS__ACCESS_KIND = eINSTANCE.getMSingleVariableAccess_AccessKind();

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
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MConstructorInvocationImpl <em>MConstructor Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MConstructorInvocationImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMConstructorInvocation()
		 * @generated
		 */
		EClass MCONSTRUCTOR_INVOCATION = eINSTANCE.getMConstructorInvocation();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MSingleVariableDeclarationImpl <em>MSingle Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MSingleVariableDeclarationImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSingleVariableDeclaration()
		 * @generated
		 */
		EClass MSINGLE_VARIABLE_DECLARATION = eINSTANCE.getMSingleVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>MEntry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSINGLE_VARIABLE_DECLARATION__MENTRY = eINSTANCE.getMSingleVariableDeclaration_MEntry();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MAbstractMethodInvocationImpl <em>MAbstract Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MAbstractMethodInvocationImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMAbstractMethodInvocation()
		 * @generated
		 */
		EClass MABSTRACT_METHOD_INVOCATION = eINSTANCE.getMAbstractMethodInvocation();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MSuperMethodInvocationImpl <em>MSuper Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MSuperMethodInvocationImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSuperMethodInvocation()
		 * @generated
		 */
		EClass MSUPER_METHOD_INVOCATION = eINSTANCE.getMSuperMethodInvocation();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MClassInstanceCreationImpl <em>MClass Instance Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MClassInstanceCreationImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMClassInstanceCreation()
		 * @generated
		 */
		EClass MCLASS_INSTANCE_CREATION = eINSTANCE.getMClassInstanceCreation();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.impl.MSuperConstructorInvocationImpl <em>MSuper Constructor Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.impl.MSuperConstructorInvocationImpl
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getMSuperConstructorInvocation()
		 * @generated
		 */
		EClass MSUPER_CONSTRUCTOR_INVOCATION = eINSTANCE.getMSuperConstructorInvocation();

		/**
		 * The meta object literal for the '{@link org.gravity.modisco.AccessKind <em>Access Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.modisco.AccessKind
		 * @see org.gravity.modisco.impl.ModiscoPackageImpl#getAccessKind()
		 * @generated
		 */
		EEnum ACCESS_KIND = eINSTANCE.getAccessKind();

	}

} //ModiscoPackage
