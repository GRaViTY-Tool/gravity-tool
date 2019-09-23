/**
 */
package org.gravity.typegraph.basic.annotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.gravity.typegraph.basic.BasicPackage;

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
 * @see org.gravity.typegraph.basic.annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/basic#//annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "annotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsPackage eINSTANCE = org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationValueImpl <em>TAnnotation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.annotations.impl.TAnnotationValueImpl
	 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTAnnotationValue()
	 * @generated
	 */
	int TANNOTATION_VALUE = 0;

	/**
	 * The feature id for the '<em><b>TKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_VALUE__TKEY = 0;

	/**
	 * The feature id for the '<em><b>TValue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_VALUE__TVALUE = 1;

	/**
	 * The number of structural features of the '<em>TAnnotation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TAnnotation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl <em>TAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl
	 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTAnnotation()
	 * @generated
	 */
	int TANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION__TANNOTATED = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION__TYPE = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION__TVALUES = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION___GET_VALUE__STRING = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.annotations.impl.TTextAnnotationImpl <em>TText Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.annotations.impl.TTextAnnotationImpl
	 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTTextAnnotation()
	 * @generated
	 */
	int TTEXT_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__TANNOTATED = TANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__TYPE = TANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__TVALUES = TANNOTATION__TVALUES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__TEXT = TANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION_FEATURE_COUNT = TANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___ECLASS = TANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___EIS_PROXY = TANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___ERESOURCE = TANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___ECONTAINER = TANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___ECONTAINING_FEATURE = TANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___ECONTAINMENT_FEATURE = TANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___ECONTENTS = TANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___EALL_CONTENTS = TANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___ECROSS_REFERENCES = TANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___EGET__ESTRUCTURALFEATURE = TANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = TANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT = TANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___EIS_SET__ESTRUCTURALFEATURE = TANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___EUNSET__ESTRUCTURALFEATURE = TANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___EINVOKE__EOPERATION_ELIST = TANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION___GET_VALUE__STRING = TANNOTATION___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION_OPERATION_COUNT = TANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl <em>TAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl
	 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTAnnotatable()
	 * @generated
	 */
	int TANNOTATABLE = 4;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATABLE__TANNOTATION = 0;

	/**
	 * The number of structural features of the '<em>TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATABLE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATABLE___GET_TANNOTATION__ECLASS = 0;

	/**
	 * The number of operations of the '<em>TAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationTypeImpl <em>TAnnotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.annotations.impl.TAnnotationTypeImpl
	 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTAnnotationType()
	 * @generated
	 */
	int TANNOTATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>TAnnotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__TANNOTATION = BasicPackage.TABSTRACT_TYPE__TANNOTATION;

	/**
	 * The feature id for the '<em><b>Pg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__PG = BasicPackage.TABSTRACT_TYPE__PG;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__PACKAGE = BasicPackage.TABSTRACT_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__SIGNATURE = BasicPackage.TABSTRACT_TYPE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__DEFINES = BasicPackage.TABSTRACT_TYPE__DEFINES;

	/**
	 * The feature id for the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__TLIB = BasicPackage.TABSTRACT_TYPE__TLIB;

	/**
	 * The feature id for the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__TNAME = BasicPackage.TABSTRACT_TYPE__TNAME;

	/**
	 * The feature id for the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__TMODIFIER = BasicPackage.TABSTRACT_TYPE__TMODIFIER;

	/**
	 * The feature id for the '<em><b>Inner Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__INNER_TYPES = BasicPackage.TABSTRACT_TYPE__INNER_TYPES;

	/**
	 * The feature id for the '<em><b>Outer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__OUTER_TYPE = BasicPackage.TABSTRACT_TYPE__OUTER_TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE__ANNOTATIONS = BasicPackage.TABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TAnnotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE_FEATURE_COUNT = BasicPackage.TABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get TAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___GET_TANNOTATION__ECLASS = BasicPackage.TABSTRACT_TYPE___GET_TANNOTATION__ECLASS;

	/**
	 * The operation id for the '<em>Is Declared</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___IS_DECLARED = BasicPackage.TABSTRACT_TYPE___IS_DECLARED;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___GET_FULLY_QUALIFIED_NAME = BasicPackage.TABSTRACT_TYPE___GET_FULLY_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get TMethod Signature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___GET_TMETHOD_SIGNATURE__STRING = BasicPackage.TABSTRACT_TYPE___GET_TMETHOD_SIGNATURE__STRING;

	/**
	 * The operation id for the '<em>Get TMethod Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___GET_TMETHOD_DEFINITION__STRING = BasicPackage.TABSTRACT_TYPE___GET_TMETHOD_DEFINITION__STRING;

	/**
	 * The operation id for the '<em>Get Base Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___GET_BASE_PACKAGE = BasicPackage.TABSTRACT_TYPE___GET_BASE_PACKAGE;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___GET_TDEFINITION__TSIGNATURE = BasicPackage.TABSTRACT_TYPE___GET_TDEFINITION__TSIGNATURE;

	/**
	 * The operation id for the '<em>Get TDefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___GET_TDEFINITION__STRING = BasicPackage.TABSTRACT_TYPE___GET_TDEFINITION__STRING;

	/**
	 * The operation id for the '<em>Has TMember</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___HAS_TMEMBER__TMEMBER = BasicPackage.TABSTRACT_TYPE___HAS_TMEMBER__TMEMBER;

	/**
	 * The operation id for the '<em>Has Common Super Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE = BasicPackage.TABSTRACT_TYPE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE;

	/**
	 * The operation id for the '<em>Fill Same Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___FILL_SAME_TYPE__ELIST = BasicPackage.TABSTRACT_TYPE___FILL_SAME_TYPE__ELIST;

	/**
	 * The operation id for the '<em>Is Inner Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___IS_INNER_TYPE__TABSTRACTTYPE = BasicPackage.TABSTRACT_TYPE___IS_INNER_TYPE__TABSTRACTTYPE;

	/**
	 * The operation id for the '<em>Get Real Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE = BasicPackage.TABSTRACT_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE;

	/**
	 * The operation id for the '<em>Is Sub Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___IS_SUB_TYPE_OF__TABSTRACTTYPE = BasicPackage.TABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE___IS_SUPER_TYPE_OF__TABSTRACTTYPE = BasicPackage.TABSTRACT_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>TAnnotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_TYPE_OPERATION_COUNT = BasicPackage.TABSTRACT_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.annotations.impl.TTextNodeImpl <em>TText Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.annotations.impl.TTextNodeImpl
	 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTTextNode()
	 * @generated
	 */
	int TTEXT_NODE = 5;

	/**
	 * The feature id for the '<em><b>TText</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE__TTEXT = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TText Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>TText Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_NODE_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.annotations.impl.TNumberNodeImpl <em>TNumber Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.annotations.impl.TNumberNodeImpl
	 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTNumberNode()
	 * @generated
	 */
	int TNUMBER_NODE = 6;

	/**
	 * The feature id for the '<em><b>TNumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE__TNUMBER = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TNumber Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>TNumber Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNUMBER_NODE_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.annotations.impl.TBoolNodeImpl <em>TBool Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.annotations.impl.TBoolNodeImpl
	 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTBoolNode()
	 * @generated
	 */
	int TBOOL_NODE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE__VALUE = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TBool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>TBool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_NODE_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.typegraph.basic.annotations.impl.TClassNodeImpl <em>TClass Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.typegraph.basic.annotations.impl.TClassNodeImpl
	 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTClassNode()
	 * @generated
	 */
	int TCLASS_NODE = 8;

	/**
	 * The feature id for the '<em><b>TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE__TCLASS = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TClass Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>TClass Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLASS_NODE_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.annotations.TAnnotationValue <em>TAnnotation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAnnotation Value</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationValue
	 * @generated
	 */
	EClass getTAnnotationValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.annotations.TAnnotationValue#getTKey <em>TKey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TKey</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationValue#getTKey()
	 * @see #getTAnnotationValue()
	 * @generated
	 */
	EAttribute getTAnnotationValue_TKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.annotations.TAnnotationValue#getTValue <em>TValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TValue</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationValue#getTValue()
	 * @see #getTAnnotationValue()
	 * @generated
	 */
	EReference getTAnnotationValue_TValue();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.annotations.TTextAnnotation <em>TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TText Annotation</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TTextAnnotation
	 * @generated
	 */
	EClass getTTextAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.annotations.TTextAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TTextAnnotation#getText()
	 * @see #getTTextAnnotation()
	 * @generated
	 */
	EAttribute getTTextAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.annotations.TAnnotation <em>TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAnnotation</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotation
	 * @generated
	 */
	EClass getTAnnotation();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.typegraph.basic.annotations.TAnnotation#getTAnnotated <em>TAnnotated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>TAnnotated</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotation#getTAnnotated()
	 * @see #getTAnnotation()
	 * @generated
	 */
	EReference getTAnnotation_TAnnotated();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.annotations.TAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotation#getType()
	 * @see #getTAnnotation()
	 * @generated
	 */
	EReference getTAnnotation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.annotations.TAnnotation#getTValues <em>TValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TValues</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotation#getTValues()
	 * @see #getTAnnotation()
	 * @generated
	 */
	EReference getTAnnotation_TValues();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.annotations.TAnnotation#getValue(java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotation#getValue(java.lang.String)
	 * @generated
	 */
	EOperation getTAnnotation__GetValue__String();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.annotations.TAnnotationType <em>TAnnotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAnnotation Type</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationType
	 * @generated
	 */
	EClass getTAnnotationType();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.typegraph.basic.annotations.TAnnotationType#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationType#getAnnotations()
	 * @see #getTAnnotationType()
	 * @generated
	 */
	EReference getTAnnotationType_Annotations();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.annotations.TAnnotationType#isSubTypeOf(org.gravity.typegraph.basic.TAbstractType) <em>Is Sub Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Type Of</em>' operation.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationType#isSubTypeOf(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTAnnotationType__IsSubTypeOf__TAbstractType();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.annotations.TAnnotationType#isSuperTypeOf(org.gravity.typegraph.basic.TAbstractType) <em>Is Super Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Type Of</em>' operation.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationType#isSuperTypeOf(org.gravity.typegraph.basic.TAbstractType)
	 * @generated
	 */
	EOperation getTAnnotationType__IsSuperTypeOf__TAbstractType();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.annotations.TAnnotatable <em>TAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAnnotatable</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotatable
	 * @generated
	 */
	EClass getTAnnotatable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.typegraph.basic.annotations.TAnnotatable#getTAnnotation <em>TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TAnnotation</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotatable#getTAnnotation()
	 * @see #getTAnnotatable()
	 * @generated
	 */
	EReference getTAnnotatable_TAnnotation();

	/**
	 * Returns the meta object for the '{@link org.gravity.typegraph.basic.annotations.TAnnotatable#getTAnnotation(org.eclipse.emf.ecore.EClass) <em>Get TAnnotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get TAnnotation</em>' operation.
	 * @see org.gravity.typegraph.basic.annotations.TAnnotatable#getTAnnotation(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getTAnnotatable__GetTAnnotation__EClass();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.annotations.TTextNode <em>TText Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TText Node</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TTextNode
	 * @generated
	 */
	EClass getTTextNode();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.annotations.TTextNode#getTText <em>TText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TText</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TTextNode#getTText()
	 * @see #getTTextNode()
	 * @generated
	 */
	EAttribute getTTextNode_TText();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.annotations.TNumberNode <em>TNumber Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNumber Node</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TNumberNode
	 * @generated
	 */
	EClass getTNumberNode();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.annotations.TNumberNode#getTNumber <em>TNumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TNumber</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TNumberNode#getTNumber()
	 * @see #getTNumberNode()
	 * @generated
	 */
	EAttribute getTNumberNode_TNumber();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.annotations.TBoolNode <em>TBool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBool Node</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TBoolNode
	 * @generated
	 */
	EClass getTBoolNode();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.typegraph.basic.annotations.TBoolNode#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TBoolNode#isValue()
	 * @see #getTBoolNode()
	 * @generated
	 */
	EAttribute getTBoolNode_Value();

	/**
	 * Returns the meta object for class '{@link org.gravity.typegraph.basic.annotations.TClassNode <em>TClass Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClass Node</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TClassNode
	 * @generated
	 */
	EClass getTClassNode();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.typegraph.basic.annotations.TClassNode#getTClass <em>TClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TClass</em>'.
	 * @see org.gravity.typegraph.basic.annotations.TClassNode#getTClass()
	 * @see #getTClassNode()
	 * @generated
	 */
	EReference getTClassNode_TClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationsFactory getAnnotationsFactory();

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
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationValueImpl <em>TAnnotation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.annotations.impl.TAnnotationValueImpl
		 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTAnnotationValue()
		 * @generated
		 */
		EClass TANNOTATION_VALUE = eINSTANCE.getTAnnotationValue();

		/**
		 * The meta object literal for the '<em><b>TKey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TANNOTATION_VALUE__TKEY = eINSTANCE.getTAnnotationValue_TKey();

		/**
		 * The meta object literal for the '<em><b>TValue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATION_VALUE__TVALUE = eINSTANCE.getTAnnotationValue_TValue();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.annotations.impl.TTextAnnotationImpl <em>TText Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.annotations.impl.TTextAnnotationImpl
		 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTTextAnnotation()
		 * @generated
		 */
		EClass TTEXT_ANNOTATION = eINSTANCE.getTTextAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTEXT_ANNOTATION__TEXT = eINSTANCE.getTTextAnnotation_Text();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl <em>TAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.annotations.impl.TAnnotationImpl
		 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTAnnotation()
		 * @generated
		 */
		EClass TANNOTATION = eINSTANCE.getTAnnotation();

		/**
		 * The meta object literal for the '<em><b>TAnnotated</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATION__TANNOTATED = eINSTANCE.getTAnnotation_TAnnotated();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATION__TYPE = eINSTANCE.getTAnnotation_Type();

		/**
		 * The meta object literal for the '<em><b>TValues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATION__TVALUES = eINSTANCE.getTAnnotation_TValues();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TANNOTATION___GET_VALUE__STRING = eINSTANCE.getTAnnotation__GetValue__String();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.annotations.impl.TAnnotationTypeImpl <em>TAnnotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.annotations.impl.TAnnotationTypeImpl
		 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTAnnotationType()
		 * @generated
		 */
		EClass TANNOTATION_TYPE = eINSTANCE.getTAnnotationType();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATION_TYPE__ANNOTATIONS = eINSTANCE.getTAnnotationType_Annotations();

		/**
		 * The meta object literal for the '<em><b>Is Sub Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TANNOTATION_TYPE___IS_SUB_TYPE_OF__TABSTRACTTYPE = eINSTANCE.getTAnnotationType__IsSubTypeOf__TAbstractType();

		/**
		 * The meta object literal for the '<em><b>Is Super Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TANNOTATION_TYPE___IS_SUPER_TYPE_OF__TABSTRACTTYPE = eINSTANCE.getTAnnotationType__IsSuperTypeOf__TAbstractType();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl <em>TAnnotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.annotations.impl.TAnnotatableImpl
		 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTAnnotatable()
		 * @generated
		 */
		EClass TANNOTATABLE = eINSTANCE.getTAnnotatable();

		/**
		 * The meta object literal for the '<em><b>TAnnotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATABLE__TANNOTATION = eINSTANCE.getTAnnotatable_TAnnotation();

		/**
		 * The meta object literal for the '<em><b>Get TAnnotation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TANNOTATABLE___GET_TANNOTATION__ECLASS = eINSTANCE.getTAnnotatable__GetTAnnotation__EClass();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.annotations.impl.TTextNodeImpl <em>TText Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.annotations.impl.TTextNodeImpl
		 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTTextNode()
		 * @generated
		 */
		EClass TTEXT_NODE = eINSTANCE.getTTextNode();

		/**
		 * The meta object literal for the '<em><b>TText</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTEXT_NODE__TTEXT = eINSTANCE.getTTextNode_TText();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.annotations.impl.TNumberNodeImpl <em>TNumber Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.annotations.impl.TNumberNodeImpl
		 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTNumberNode()
		 * @generated
		 */
		EClass TNUMBER_NODE = eINSTANCE.getTNumberNode();

		/**
		 * The meta object literal for the '<em><b>TNumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNUMBER_NODE__TNUMBER = eINSTANCE.getTNumberNode_TNumber();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.annotations.impl.TBoolNodeImpl <em>TBool Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.annotations.impl.TBoolNodeImpl
		 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTBoolNode()
		 * @generated
		 */
		EClass TBOOL_NODE = eINSTANCE.getTBoolNode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBOOL_NODE__VALUE = eINSTANCE.getTBoolNode_Value();

		/**
		 * The meta object literal for the '{@link org.gravity.typegraph.basic.annotations.impl.TClassNodeImpl <em>TClass Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.typegraph.basic.annotations.impl.TClassNodeImpl
		 * @see org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl#getTClassNode()
		 * @generated
		 */
		EClass TCLASS_NODE = eINSTANCE.getTClassNode();

		/**
		 * The meta object literal for the '<em><b>TClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCLASS_NODE__TCLASS = eINSTANCE.getTClassNode_TClass();

	}

} //AnnotationsPackage
