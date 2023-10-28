/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

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
 * @see org.gravity.tgg.pm.uml.UmlFactory
 * @model kind="package"
 * @generated
 */
public interface UmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.tgg.pm.uml/model/Uml.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.tgg.pm.uml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlPackage eINSTANCE = org.gravity.tgg.pm.uml.impl.UmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.StereotypeProperty2AnnotationNodeImpl <em>Stereotype Property2 Annotation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.StereotypeProperty2AnnotationNodeImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getStereotypeProperty2AnnotationNode()
	 * @generated
	 */
	int STEREOTYPE_PROPERTY2_ANNOTATION_NODE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY2_ANNOTATION_NODE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY2_ANNOTATION_NODE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stereotype Property2 Annotation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY2_ANNOTATION_NODE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stereotype Property2 Annotation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_PROPERTY2_ANNOTATION_NODE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Comment2TTextAnnotationImpl <em>Comment2 TText Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Comment2TTextAnnotationImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getComment2TTextAnnotation()
	 * @generated
	 */
	int COMMENT2_TTEXT_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT2_TTEXT_ANNOTATION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT2_TTEXT_ANNOTATION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment2 TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT2_TTEXT_ANNOTATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comment2 TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT2_TTEXT_ANNOTATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Property2TFieldNameImpl <em>Property2 TField Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Property2TFieldNameImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getProperty2TFieldName()
	 * @generated
	 */
	int PROPERTY2_TFIELD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_NAME__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_NAME__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property2 TField Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_NAME_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property2 TField Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_NAME_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Operation2TMethodSignatureImpl <em>Operation2 TMethod Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Operation2TMethodSignatureImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getOperation2TMethodSignature()
	 * @generated
	 */
	int OPERATION2_TMETHOD_SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_SIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_SIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation2 TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_SIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation2 TMethod Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_SIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Operation2TMethodNameImpl <em>Operation2 TMethod Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Operation2TMethodNameImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getOperation2TMethodName()
	 * @generated
	 */
	int OPERATION2_TMETHOD_NAME = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_NAME__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_NAME__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation2 TMethod Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_NAME_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation2 TMethod Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_NAME_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Type2TAbstractTypeImpl <em>Type2 TAbstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Type2TAbstractTypeImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getType2TAbstractType()
	 * @generated
	 */
	int TYPE2_TABSTRACT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_TABSTRACT_TYPE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_TABSTRACT_TYPE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type2 TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_TABSTRACT_TYPE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type2 TAbstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_TABSTRACT_TYPE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Feature2TMemberImpl <em>Feature2 TMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Feature2TMemberImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getFeature2TMember()
	 * @generated
	 */
	int FEATURE2_TMEMBER = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_TMEMBER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_TMEMBER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature2 TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_TMEMBER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature2 TMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_TMEMBER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Feature2TSignatureImpl <em>Feature2 TSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Feature2TSignatureImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getFeature2TSignature()
	 * @generated
	 */
	int FEATURE2_TSIGNATURE = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_TSIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_TSIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature2 TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_TSIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature2 TSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2_TSIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Class2TClassImpl <em>Class2 TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Class2TClassImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getClass2TClass()
	 * @generated
	 */
	int CLASS2_TCLASS = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class2 TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class2 TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Property2TFieldDefinitionImpl <em>Property2 TField Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Property2TFieldDefinitionImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getProperty2TFieldDefinition()
	 * @generated
	 */
	int PROPERTY2_TFIELD_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property2 TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property2 TField Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Parameter2TParameterImpl <em>Parameter2 TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Parameter2TParameterImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getParameter2TParameter()
	 * @generated
	 */
	int PARAMETER2_TPARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER2_TPARAMETER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER2_TPARAMETER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter2 TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER2_TPARAMETER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter2 TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER2_TPARAMETER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.FDependency2TAccessImpl <em>FDependency2 TAccess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.FDependency2TAccessImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getFDependency2TAccess()
	 * @generated
	 */
	int FDEPENDENCY2_TACCESS = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDEPENDENCY2_TACCESS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDEPENDENCY2_TACCESS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FDependency2 TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDEPENDENCY2_TACCESS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FDependency2 TAccess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDEPENDENCY2_TACCESS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Property2TFieldSignatureImpl <em>Property2 TField Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Property2TFieldSignatureImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getProperty2TFieldSignature()
	 * @generated
	 */
	int PROPERTY2_TFIELD_SIGNATURE = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_SIGNATURE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_SIGNATURE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property2 TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_SIGNATURE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property2 TField Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY2_TFIELD_SIGNATURE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Interface2TInterfaceImpl <em>Interface2 TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Interface2TInterfaceImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getInterface2TInterface()
	 * @generated
	 */
	int INTERFACE2_TINTERFACE = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE2_TINTERFACE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE2_TINTERFACE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface2 TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE2_TINTERFACE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface2 TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE2_TINTERFACE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Stereotype2TAnnotationImpl <em>Stereotype2 TAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Stereotype2TAnnotationImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getStereotype2TAnnotation()
	 * @generated
	 */
	int STEREOTYPE2_TANNOTATION = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE2_TANNOTATION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE2_TANNOTATION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stereotype2 TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE2_TANNOTATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stereotype2 TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE2_TANNOTATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Model2TypeGraphImpl <em>Model2 Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Model2TypeGraphImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getModel2TypeGraph()
	 * @generated
	 */
	int MODEL2_TYPE_GRAPH = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model2 Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model2 Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Package2TPackageImpl <em>Package2 TPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Package2TPackageImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getPackage2TPackage()
	 * @generated
	 */
	int PACKAGE2_TPACKAGE = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE2_TPACKAGE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE2_TPACKAGE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package2 TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE2_TPACKAGE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package2 TPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE2_TPACKAGE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Element2TAnnotatableImpl <em>Element2 TAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Element2TAnnotatableImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getElement2TAnnotatable()
	 * @generated
	 */
	int ELEMENT2_TANNOTATABLE = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT2_TANNOTATABLE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT2_TANNOTATABLE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element2 TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT2_TANNOTATABLE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element2 TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT2_TANNOTATABLE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.PrimitiveType2TClassImpl <em>Primitive Type2 TClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.PrimitiveType2TClassImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getPrimitiveType2TClass()
	 * @generated
	 */
	int PRIMITIVE_TYPE2_TCLASS = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_TCLASS__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_TCLASS__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Type2 TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_TCLASS_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Type2 TClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_TCLASS_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.impl.Operation2TMethodDefinitionImpl <em>Operation2 TMethod Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.impl.Operation2TMethodDefinitionImpl
	 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getOperation2TMethodDefinition()
	 * @generated
	 */
	int OPERATION2_TMETHOD_DEFINITION = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_DEFINITION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_DEFINITION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation2 TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_DEFINITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation2 TMethod Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION2_TMETHOD_DEFINITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode <em>Stereotype Property2 Annotation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype Property2 Annotation Node</em>'.
	 * @see org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode
	 * @generated
	 */
	EClass getStereotypeProperty2AnnotationNode();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode#getSource()
	 * @see #getStereotypeProperty2AnnotationNode()
	 * @generated
	 */
	EReference getStereotypeProperty2AnnotationNode_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode#getTarget()
	 * @see #getStereotypeProperty2AnnotationNode()
	 * @generated
	 */
	EReference getStereotypeProperty2AnnotationNode_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Comment2TTextAnnotation <em>Comment2 TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment2 TText Annotation</em>'.
	 * @see org.gravity.tgg.pm.uml.Comment2TTextAnnotation
	 * @generated
	 */
	EClass getComment2TTextAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Comment2TTextAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Comment2TTextAnnotation#getSource()
	 * @see #getComment2TTextAnnotation()
	 * @generated
	 */
	EReference getComment2TTextAnnotation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Comment2TTextAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Comment2TTextAnnotation#getTarget()
	 * @see #getComment2TTextAnnotation()
	 * @generated
	 */
	EReference getComment2TTextAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Property2TFieldName <em>Property2 TField Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property2 TField Name</em>'.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldName
	 * @generated
	 */
	EClass getProperty2TFieldName();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Property2TFieldName#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldName#getSource()
	 * @see #getProperty2TFieldName()
	 * @generated
	 */
	EReference getProperty2TFieldName_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Property2TFieldName#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldName#getTarget()
	 * @see #getProperty2TFieldName()
	 * @generated
	 */
	EReference getProperty2TFieldName_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Operation2TMethodSignature <em>Operation2 TMethod Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation2 TMethod Signature</em>'.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodSignature
	 * @generated
	 */
	EClass getOperation2TMethodSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Operation2TMethodSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodSignature#getSource()
	 * @see #getOperation2TMethodSignature()
	 * @generated
	 */
	EReference getOperation2TMethodSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Operation2TMethodSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodSignature#getTarget()
	 * @see #getOperation2TMethodSignature()
	 * @generated
	 */
	EReference getOperation2TMethodSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Operation2TMethodName <em>Operation2 TMethod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation2 TMethod Name</em>'.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodName
	 * @generated
	 */
	EClass getOperation2TMethodName();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Operation2TMethodName#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodName#getSource()
	 * @see #getOperation2TMethodName()
	 * @generated
	 */
	EReference getOperation2TMethodName_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Operation2TMethodName#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodName#getTarget()
	 * @see #getOperation2TMethodName()
	 * @generated
	 */
	EReference getOperation2TMethodName_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Type2TAbstractType <em>Type2 TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type2 TAbstract Type</em>'.
	 * @see org.gravity.tgg.pm.uml.Type2TAbstractType
	 * @generated
	 */
	EClass getType2TAbstractType();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Type2TAbstractType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Type2TAbstractType#getSource()
	 * @see #getType2TAbstractType()
	 * @generated
	 */
	EReference getType2TAbstractType_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Type2TAbstractType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Type2TAbstractType#getTarget()
	 * @see #getType2TAbstractType()
	 * @generated
	 */
	EReference getType2TAbstractType_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Feature2TMember <em>Feature2 TMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature2 TMember</em>'.
	 * @see org.gravity.tgg.pm.uml.Feature2TMember
	 * @generated
	 */
	EClass getFeature2TMember();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Feature2TMember#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Feature2TMember#getSource()
	 * @see #getFeature2TMember()
	 * @generated
	 */
	EReference getFeature2TMember_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Feature2TMember#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Feature2TMember#getTarget()
	 * @see #getFeature2TMember()
	 * @generated
	 */
	EReference getFeature2TMember_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Feature2TSignature <em>Feature2 TSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature2 TSignature</em>'.
	 * @see org.gravity.tgg.pm.uml.Feature2TSignature
	 * @generated
	 */
	EClass getFeature2TSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Feature2TSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Feature2TSignature#getSource()
	 * @see #getFeature2TSignature()
	 * @generated
	 */
	EReference getFeature2TSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Feature2TSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Feature2TSignature#getTarget()
	 * @see #getFeature2TSignature()
	 * @generated
	 */
	EReference getFeature2TSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Class2TClass <em>Class2 TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class2 TClass</em>'.
	 * @see org.gravity.tgg.pm.uml.Class2TClass
	 * @generated
	 */
	EClass getClass2TClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Class2TClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Class2TClass#getSource()
	 * @see #getClass2TClass()
	 * @generated
	 */
	EReference getClass2TClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Class2TClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Class2TClass#getTarget()
	 * @see #getClass2TClass()
	 * @generated
	 */
	EReference getClass2TClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Property2TFieldDefinition <em>Property2 TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property2 TField Definition</em>'.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldDefinition
	 * @generated
	 */
	EClass getProperty2TFieldDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Property2TFieldDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldDefinition#getSource()
	 * @see #getProperty2TFieldDefinition()
	 * @generated
	 */
	EReference getProperty2TFieldDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Property2TFieldDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldDefinition#getTarget()
	 * @see #getProperty2TFieldDefinition()
	 * @generated
	 */
	EReference getProperty2TFieldDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Parameter2TParameter <em>Parameter2 TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter2 TParameter</em>'.
	 * @see org.gravity.tgg.pm.uml.Parameter2TParameter
	 * @generated
	 */
	EClass getParameter2TParameter();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Parameter2TParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Parameter2TParameter#getSource()
	 * @see #getParameter2TParameter()
	 * @generated
	 */
	EReference getParameter2TParameter_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Parameter2TParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Parameter2TParameter#getTarget()
	 * @see #getParameter2TParameter()
	 * @generated
	 */
	EReference getParameter2TParameter_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.FDependency2TAccess <em>FDependency2 TAccess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FDependency2 TAccess</em>'.
	 * @see org.gravity.tgg.pm.uml.FDependency2TAccess
	 * @generated
	 */
	EClass getFDependency2TAccess();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.FDependency2TAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.FDependency2TAccess#getSource()
	 * @see #getFDependency2TAccess()
	 * @generated
	 */
	EReference getFDependency2TAccess_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.FDependency2TAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.FDependency2TAccess#getTarget()
	 * @see #getFDependency2TAccess()
	 * @generated
	 */
	EReference getFDependency2TAccess_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Property2TFieldSignature <em>Property2 TField Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property2 TField Signature</em>'.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldSignature
	 * @generated
	 */
	EClass getProperty2TFieldSignature();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Property2TFieldSignature#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldSignature#getSource()
	 * @see #getProperty2TFieldSignature()
	 * @generated
	 */
	EReference getProperty2TFieldSignature_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Property2TFieldSignature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Property2TFieldSignature#getTarget()
	 * @see #getProperty2TFieldSignature()
	 * @generated
	 */
	EReference getProperty2TFieldSignature_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Interface2TInterface <em>Interface2 TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface2 TInterface</em>'.
	 * @see org.gravity.tgg.pm.uml.Interface2TInterface
	 * @generated
	 */
	EClass getInterface2TInterface();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Interface2TInterface#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Interface2TInterface#getSource()
	 * @see #getInterface2TInterface()
	 * @generated
	 */
	EReference getInterface2TInterface_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Interface2TInterface#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Interface2TInterface#getTarget()
	 * @see #getInterface2TInterface()
	 * @generated
	 */
	EReference getInterface2TInterface_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Stereotype2TAnnotation <em>Stereotype2 TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype2 TAnnotation</em>'.
	 * @see org.gravity.tgg.pm.uml.Stereotype2TAnnotation
	 * @generated
	 */
	EClass getStereotype2TAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Stereotype2TAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Stereotype2TAnnotation#getSource()
	 * @see #getStereotype2TAnnotation()
	 * @generated
	 */
	EReference getStereotype2TAnnotation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Stereotype2TAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Stereotype2TAnnotation#getTarget()
	 * @see #getStereotype2TAnnotation()
	 * @generated
	 */
	EReference getStereotype2TAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Model2TypeGraph <em>Model2 Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model2 Type Graph</em>'.
	 * @see org.gravity.tgg.pm.uml.Model2TypeGraph
	 * @generated
	 */
	EClass getModel2TypeGraph();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Model2TypeGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Model2TypeGraph#getSource()
	 * @see #getModel2TypeGraph()
	 * @generated
	 */
	EReference getModel2TypeGraph_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Model2TypeGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Model2TypeGraph#getTarget()
	 * @see #getModel2TypeGraph()
	 * @generated
	 */
	EReference getModel2TypeGraph_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Package2TPackage <em>Package2 TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package2 TPackage</em>'.
	 * @see org.gravity.tgg.pm.uml.Package2TPackage
	 * @generated
	 */
	EClass getPackage2TPackage();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Package2TPackage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Package2TPackage#getSource()
	 * @see #getPackage2TPackage()
	 * @generated
	 */
	EReference getPackage2TPackage_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Package2TPackage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Package2TPackage#getTarget()
	 * @see #getPackage2TPackage()
	 * @generated
	 */
	EReference getPackage2TPackage_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Element2TAnnotatable <em>Element2 TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element2 TAnnotatable</em>'.
	 * @see org.gravity.tgg.pm.uml.Element2TAnnotatable
	 * @generated
	 */
	EClass getElement2TAnnotatable();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Element2TAnnotatable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Element2TAnnotatable#getSource()
	 * @see #getElement2TAnnotatable()
	 * @generated
	 */
	EReference getElement2TAnnotatable_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Element2TAnnotatable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Element2TAnnotatable#getTarget()
	 * @see #getElement2TAnnotatable()
	 * @generated
	 */
	EReference getElement2TAnnotatable_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.PrimitiveType2TClass <em>Primitive Type2 TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type2 TClass</em>'.
	 * @see org.gravity.tgg.pm.uml.PrimitiveType2TClass
	 * @generated
	 */
	EClass getPrimitiveType2TClass();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.PrimitiveType2TClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.PrimitiveType2TClass#getSource()
	 * @see #getPrimitiveType2TClass()
	 * @generated
	 */
	EReference getPrimitiveType2TClass_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.PrimitiveType2TClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.PrimitiveType2TClass#getTarget()
	 * @see #getPrimitiveType2TClass()
	 * @generated
	 */
	EReference getPrimitiveType2TClass_Target();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Operation2TMethodDefinition <em>Operation2 TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation2 TMethod Definition</em>'.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodDefinition
	 * @generated
	 */
	EClass getOperation2TMethodDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Operation2TMethodDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodDefinition#getSource()
	 * @see #getOperation2TMethodDefinition()
	 * @generated
	 */
	EReference getOperation2TMethodDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.tgg.pm.uml.Operation2TMethodDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gravity.tgg.pm.uml.Operation2TMethodDefinition#getTarget()
	 * @see #getOperation2TMethodDefinition()
	 * @generated
	 */
	EReference getOperation2TMethodDefinition_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UmlFactory getUmlFactory();

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
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.StereotypeProperty2AnnotationNodeImpl <em>Stereotype Property2 Annotation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.StereotypeProperty2AnnotationNodeImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getStereotypeProperty2AnnotationNode()
		 * @generated
		 */
		EClass STEREOTYPE_PROPERTY2_ANNOTATION_NODE = eINSTANCE.getStereotypeProperty2AnnotationNode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEREOTYPE_PROPERTY2_ANNOTATION_NODE__SOURCE = eINSTANCE
				.getStereotypeProperty2AnnotationNode_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEREOTYPE_PROPERTY2_ANNOTATION_NODE__TARGET = eINSTANCE
				.getStereotypeProperty2AnnotationNode_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Comment2TTextAnnotationImpl <em>Comment2 TText Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Comment2TTextAnnotationImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getComment2TTextAnnotation()
		 * @generated
		 */
		EClass COMMENT2_TTEXT_ANNOTATION = eINSTANCE.getComment2TTextAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT2_TTEXT_ANNOTATION__SOURCE = eINSTANCE.getComment2TTextAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT2_TTEXT_ANNOTATION__TARGET = eINSTANCE.getComment2TTextAnnotation_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Property2TFieldNameImpl <em>Property2 TField Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Property2TFieldNameImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getProperty2TFieldName()
		 * @generated
		 */
		EClass PROPERTY2_TFIELD_NAME = eINSTANCE.getProperty2TFieldName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY2_TFIELD_NAME__SOURCE = eINSTANCE.getProperty2TFieldName_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY2_TFIELD_NAME__TARGET = eINSTANCE.getProperty2TFieldName_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Operation2TMethodSignatureImpl <em>Operation2 TMethod Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Operation2TMethodSignatureImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getOperation2TMethodSignature()
		 * @generated
		 */
		EClass OPERATION2_TMETHOD_SIGNATURE = eINSTANCE.getOperation2TMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION2_TMETHOD_SIGNATURE__SOURCE = eINSTANCE.getOperation2TMethodSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION2_TMETHOD_SIGNATURE__TARGET = eINSTANCE.getOperation2TMethodSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Operation2TMethodNameImpl <em>Operation2 TMethod Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Operation2TMethodNameImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getOperation2TMethodName()
		 * @generated
		 */
		EClass OPERATION2_TMETHOD_NAME = eINSTANCE.getOperation2TMethodName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION2_TMETHOD_NAME__SOURCE = eINSTANCE.getOperation2TMethodName_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION2_TMETHOD_NAME__TARGET = eINSTANCE.getOperation2TMethodName_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Type2TAbstractTypeImpl <em>Type2 TAbstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Type2TAbstractTypeImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getType2TAbstractType()
		 * @generated
		 */
		EClass TYPE2_TABSTRACT_TYPE = eINSTANCE.getType2TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE2_TABSTRACT_TYPE__SOURCE = eINSTANCE.getType2TAbstractType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE2_TABSTRACT_TYPE__TARGET = eINSTANCE.getType2TAbstractType_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Feature2TMemberImpl <em>Feature2 TMember</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Feature2TMemberImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getFeature2TMember()
		 * @generated
		 */
		EClass FEATURE2_TMEMBER = eINSTANCE.getFeature2TMember();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE2_TMEMBER__SOURCE = eINSTANCE.getFeature2TMember_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE2_TMEMBER__TARGET = eINSTANCE.getFeature2TMember_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Feature2TSignatureImpl <em>Feature2 TSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Feature2TSignatureImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getFeature2TSignature()
		 * @generated
		 */
		EClass FEATURE2_TSIGNATURE = eINSTANCE.getFeature2TSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE2_TSIGNATURE__SOURCE = eINSTANCE.getFeature2TSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE2_TSIGNATURE__TARGET = eINSTANCE.getFeature2TSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Class2TClassImpl <em>Class2 TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Class2TClassImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getClass2TClass()
		 * @generated
		 */
		EClass CLASS2_TCLASS = eINSTANCE.getClass2TClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS2_TCLASS__SOURCE = eINSTANCE.getClass2TClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS2_TCLASS__TARGET = eINSTANCE.getClass2TClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Property2TFieldDefinitionImpl <em>Property2 TField Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Property2TFieldDefinitionImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getProperty2TFieldDefinition()
		 * @generated
		 */
		EClass PROPERTY2_TFIELD_DEFINITION = eINSTANCE.getProperty2TFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY2_TFIELD_DEFINITION__SOURCE = eINSTANCE.getProperty2TFieldDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY2_TFIELD_DEFINITION__TARGET = eINSTANCE.getProperty2TFieldDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Parameter2TParameterImpl <em>Parameter2 TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Parameter2TParameterImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getParameter2TParameter()
		 * @generated
		 */
		EClass PARAMETER2_TPARAMETER = eINSTANCE.getParameter2TParameter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER2_TPARAMETER__SOURCE = eINSTANCE.getParameter2TParameter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER2_TPARAMETER__TARGET = eINSTANCE.getParameter2TParameter_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.FDependency2TAccessImpl <em>FDependency2 TAccess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.FDependency2TAccessImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getFDependency2TAccess()
		 * @generated
		 */
		EClass FDEPENDENCY2_TACCESS = eINSTANCE.getFDependency2TAccess();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FDEPENDENCY2_TACCESS__SOURCE = eINSTANCE.getFDependency2TAccess_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FDEPENDENCY2_TACCESS__TARGET = eINSTANCE.getFDependency2TAccess_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Property2TFieldSignatureImpl <em>Property2 TField Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Property2TFieldSignatureImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getProperty2TFieldSignature()
		 * @generated
		 */
		EClass PROPERTY2_TFIELD_SIGNATURE = eINSTANCE.getProperty2TFieldSignature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY2_TFIELD_SIGNATURE__SOURCE = eINSTANCE.getProperty2TFieldSignature_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY2_TFIELD_SIGNATURE__TARGET = eINSTANCE.getProperty2TFieldSignature_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Interface2TInterfaceImpl <em>Interface2 TInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Interface2TInterfaceImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getInterface2TInterface()
		 * @generated
		 */
		EClass INTERFACE2_TINTERFACE = eINSTANCE.getInterface2TInterface();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE2_TINTERFACE__SOURCE = eINSTANCE.getInterface2TInterface_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE2_TINTERFACE__TARGET = eINSTANCE.getInterface2TInterface_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Stereotype2TAnnotationImpl <em>Stereotype2 TAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Stereotype2TAnnotationImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getStereotype2TAnnotation()
		 * @generated
		 */
		EClass STEREOTYPE2_TANNOTATION = eINSTANCE.getStereotype2TAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEREOTYPE2_TANNOTATION__SOURCE = eINSTANCE.getStereotype2TAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEREOTYPE2_TANNOTATION__TARGET = eINSTANCE.getStereotype2TAnnotation_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Model2TypeGraphImpl <em>Model2 Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Model2TypeGraphImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getModel2TypeGraph()
		 * @generated
		 */
		EClass MODEL2_TYPE_GRAPH = eINSTANCE.getModel2TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL2_TYPE_GRAPH__SOURCE = eINSTANCE.getModel2TypeGraph_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL2_TYPE_GRAPH__TARGET = eINSTANCE.getModel2TypeGraph_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Package2TPackageImpl <em>Package2 TPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Package2TPackageImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getPackage2TPackage()
		 * @generated
		 */
		EClass PACKAGE2_TPACKAGE = eINSTANCE.getPackage2TPackage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE2_TPACKAGE__SOURCE = eINSTANCE.getPackage2TPackage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE2_TPACKAGE__TARGET = eINSTANCE.getPackage2TPackage_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Element2TAnnotatableImpl <em>Element2 TAnnotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Element2TAnnotatableImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getElement2TAnnotatable()
		 * @generated
		 */
		EClass ELEMENT2_TANNOTATABLE = eINSTANCE.getElement2TAnnotatable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT2_TANNOTATABLE__SOURCE = eINSTANCE.getElement2TAnnotatable_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT2_TANNOTATABLE__TARGET = eINSTANCE.getElement2TAnnotatable_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.PrimitiveType2TClassImpl <em>Primitive Type2 TClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.PrimitiveType2TClassImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getPrimitiveType2TClass()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE2_TCLASS = eINSTANCE.getPrimitiveType2TClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE2_TCLASS__SOURCE = eINSTANCE.getPrimitiveType2TClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE2_TCLASS__TARGET = eINSTANCE.getPrimitiveType2TClass_Target();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.impl.Operation2TMethodDefinitionImpl <em>Operation2 TMethod Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.impl.Operation2TMethodDefinitionImpl
		 * @see org.gravity.tgg.pm.uml.impl.UmlPackageImpl#getOperation2TMethodDefinition()
		 * @generated
		 */
		EClass OPERATION2_TMETHOD_DEFINITION = eINSTANCE.getOperation2TMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION2_TMETHOD_DEFINITION__SOURCE = eINSTANCE.getOperation2TMethodDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION2_TMETHOD_DEFINITION__TARGET = eINSTANCE.getOperation2TMethodDefinition_Target();

	}

} //UmlPackage
