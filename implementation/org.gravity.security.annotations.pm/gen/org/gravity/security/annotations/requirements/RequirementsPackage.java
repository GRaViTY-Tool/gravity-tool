/**
 */
package org.gravity.security.annotations.requirements;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.gravity.security.annotations.requirements.RequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gravity-tool.org/typegraph/annotations/security#/requirements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.security.annotations.requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.security.annotations.requirements.impl.TAnnotationWithCounterMeasureImpl <em>TAnnotation With Counter Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.security.annotations.requirements.impl.TAnnotationWithCounterMeasureImpl
	 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTAnnotationWithCounterMeasure()
	 * @generated
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE = 4;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE__TANNOTATED = AnnotationsPackage.TANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE__TYPE = AnnotationsPackage.TANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE__TVALUES = AnnotationsPackage.TANNOTATION__TVALUES;

	/**
	 * The feature id for the '<em><b>Countermeasure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TAnnotation With Counter Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE_FEATURE_COUNT = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___ECLASS = AnnotationsPackage.TANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___EIS_PROXY = AnnotationsPackage.TANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___ERESOURCE = AnnotationsPackage.TANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINER = AnnotationsPackage.TANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINING_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINMENT_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___ECONTENTS = AnnotationsPackage.TANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___EALL_CONTENTS = AnnotationsPackage.TANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___ECROSS_REFERENCES = AnnotationsPackage.TANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___EGET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___EGET__ESTRUCTURALFEATURE_BOOLEAN = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___ESET__ESTRUCTURALFEATURE_OBJECT = AnnotationsPackage.TANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___EIS_SET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___EUNSET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___EINVOKE__EOPERATION_ELIST = AnnotationsPackage.TANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE___GET_VALUE__STRING = AnnotationsPackage.TANNOTATION___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TAnnotation With Counter Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATION_WITH_COUNTER_MEASURE_OPERATION_COUNT = AnnotationsPackage.TANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.security.annotations.requirements.impl.TSecrecyImpl <em>TSecrecy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.security.annotations.requirements.impl.TSecrecyImpl
	 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTSecrecy()
	 * @generated
	 */
	int TSECRECY = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY__TANNOTATED = TANNOTATION_WITH_COUNTER_MEASURE__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY__TYPE = TANNOTATION_WITH_COUNTER_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY__TVALUES = TANNOTATION_WITH_COUNTER_MEASURE__TVALUES;

	/**
	 * The feature id for the '<em><b>Countermeasure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY__COUNTERMEASURE = TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE;

	/**
	 * The number of structural features of the '<em>TSecrecy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY_FEATURE_COUNT = TANNOTATION_WITH_COUNTER_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___ECLASS = TANNOTATION_WITH_COUNTER_MEASURE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___EIS_PROXY = TANNOTATION_WITH_COUNTER_MEASURE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___ERESOURCE = TANNOTATION_WITH_COUNTER_MEASURE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___ECONTAINER = TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___ECONTAINING_FEATURE = TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___ECONTAINMENT_FEATURE = TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___ECONTENTS = TANNOTATION_WITH_COUNTER_MEASURE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___EALL_CONTENTS = TANNOTATION_WITH_COUNTER_MEASURE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___ECROSS_REFERENCES = TANNOTATION_WITH_COUNTER_MEASURE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___EGET__ESTRUCTURALFEATURE = TANNOTATION_WITH_COUNTER_MEASURE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___EGET__ESTRUCTURALFEATURE_BOOLEAN = TANNOTATION_WITH_COUNTER_MEASURE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___ESET__ESTRUCTURALFEATURE_OBJECT = TANNOTATION_WITH_COUNTER_MEASURE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___EIS_SET__ESTRUCTURALFEATURE = TANNOTATION_WITH_COUNTER_MEASURE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___EUNSET__ESTRUCTURALFEATURE = TANNOTATION_WITH_COUNTER_MEASURE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___EINVOKE__EOPERATION_ELIST = TANNOTATION_WITH_COUNTER_MEASURE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY___GET_VALUE__STRING = TANNOTATION_WITH_COUNTER_MEASURE___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TSecrecy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSECRECY_OPERATION_COUNT = TANNOTATION_WITH_COUNTER_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.security.annotations.requirements.impl.TIntegrityImpl <em>TIntegrity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.security.annotations.requirements.impl.TIntegrityImpl
	 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTIntegrity()
	 * @generated
	 */
	int TINTEGRITY = 1;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY__TANNOTATED = TANNOTATION_WITH_COUNTER_MEASURE__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY__TYPE = TANNOTATION_WITH_COUNTER_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY__TVALUES = TANNOTATION_WITH_COUNTER_MEASURE__TVALUES;

	/**
	 * The feature id for the '<em><b>Countermeasure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY__COUNTERMEASURE = TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE;

	/**
	 * The number of structural features of the '<em>TIntegrity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY_FEATURE_COUNT = TANNOTATION_WITH_COUNTER_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___ECLASS = TANNOTATION_WITH_COUNTER_MEASURE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___EIS_PROXY = TANNOTATION_WITH_COUNTER_MEASURE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___ERESOURCE = TANNOTATION_WITH_COUNTER_MEASURE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___ECONTAINER = TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___ECONTAINING_FEATURE = TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___ECONTAINMENT_FEATURE = TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___ECONTENTS = TANNOTATION_WITH_COUNTER_MEASURE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___EALL_CONTENTS = TANNOTATION_WITH_COUNTER_MEASURE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___ECROSS_REFERENCES = TANNOTATION_WITH_COUNTER_MEASURE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___EGET__ESTRUCTURALFEATURE = TANNOTATION_WITH_COUNTER_MEASURE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = TANNOTATION_WITH_COUNTER_MEASURE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___ESET__ESTRUCTURALFEATURE_OBJECT = TANNOTATION_WITH_COUNTER_MEASURE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___EIS_SET__ESTRUCTURALFEATURE = TANNOTATION_WITH_COUNTER_MEASURE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___EUNSET__ESTRUCTURALFEATURE = TANNOTATION_WITH_COUNTER_MEASURE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___EINVOKE__EOPERATION_ELIST = TANNOTATION_WITH_COUNTER_MEASURE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY___GET_VALUE__STRING = TANNOTATION_WITH_COUNTER_MEASURE___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TIntegrity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGRITY_OPERATION_COUNT = TANNOTATION_WITH_COUNTER_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.security.annotations.requirements.impl.THighImpl <em>THigh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.security.annotations.requirements.impl.THighImpl
	 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTHigh()
	 * @generated
	 */
	int THIGH = 2;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH__TANNOTATED = TANNOTATION_WITH_COUNTER_MEASURE__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH__TYPE = TANNOTATION_WITH_COUNTER_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH__TVALUES = TANNOTATION_WITH_COUNTER_MEASURE__TVALUES;

	/**
	 * The feature id for the '<em><b>Countermeasure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH__COUNTERMEASURE = TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE;

	/**
	 * The number of structural features of the '<em>THigh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH_FEATURE_COUNT = TANNOTATION_WITH_COUNTER_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___ECLASS = TANNOTATION_WITH_COUNTER_MEASURE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___EIS_PROXY = TANNOTATION_WITH_COUNTER_MEASURE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___ERESOURCE = TANNOTATION_WITH_COUNTER_MEASURE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___ECONTAINER = TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___ECONTAINING_FEATURE = TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___ECONTAINMENT_FEATURE = TANNOTATION_WITH_COUNTER_MEASURE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___ECONTENTS = TANNOTATION_WITH_COUNTER_MEASURE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___EALL_CONTENTS = TANNOTATION_WITH_COUNTER_MEASURE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___ECROSS_REFERENCES = TANNOTATION_WITH_COUNTER_MEASURE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___EGET__ESTRUCTURALFEATURE = TANNOTATION_WITH_COUNTER_MEASURE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___EGET__ESTRUCTURALFEATURE_BOOLEAN = TANNOTATION_WITH_COUNTER_MEASURE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___ESET__ESTRUCTURALFEATURE_OBJECT = TANNOTATION_WITH_COUNTER_MEASURE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___EIS_SET__ESTRUCTURALFEATURE = TANNOTATION_WITH_COUNTER_MEASURE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___EUNSET__ESTRUCTURALFEATURE = TANNOTATION_WITH_COUNTER_MEASURE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___EINVOKE__EOPERATION_ELIST = TANNOTATION_WITH_COUNTER_MEASURE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH___GET_VALUE__STRING = TANNOTATION_WITH_COUNTER_MEASURE___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>THigh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIGH_OPERATION_COUNT = TANNOTATION_WITH_COUNTER_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.security.annotations.requirements.impl.TCriticalImpl <em>TCritical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.security.annotations.requirements.impl.TCriticalImpl
	 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTCritical()
	 * @generated
	 */
	int TCRITICAL = 3;

	/**
	 * The meta object id for the '{@link org.gravity.security.annotations.requirements.impl.TAbstractCriticalElementImpl <em>TAbstract Critical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.security.annotations.requirements.impl.TAbstractCriticalElementImpl
	 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTAbstractCriticalElement()
	 * @generated
	 */
	int TABSTRACT_CRITICAL_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT__TANNOTATED = AnnotationsPackage.TANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT__TYPE = AnnotationsPackage.TANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT__TVALUES = AnnotationsPackage.TANNOTATION__TVALUES;

	/**
	 * The number of structural features of the '<em>TAbstract Critical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT_FEATURE_COUNT = AnnotationsPackage.TANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___ECLASS = AnnotationsPackage.TANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___EIS_PROXY = AnnotationsPackage.TANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___ERESOURCE = AnnotationsPackage.TANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___ECONTAINER = AnnotationsPackage.TANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___ECONTAINING_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___ECONTAINMENT_FEATURE = AnnotationsPackage.TANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___ECONTENTS = AnnotationsPackage.TANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___EALL_CONTENTS = AnnotationsPackage.TANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___ECROSS_REFERENCES = AnnotationsPackage.TANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___EGET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT = AnnotationsPackage.TANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___EIS_SET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___EUNSET__ESTRUCTURALFEATURE = AnnotationsPackage.TANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___EINVOKE__EOPERATION_ELIST = AnnotationsPackage.TANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT___GET_VALUE__STRING = AnnotationsPackage.TANNOTATION___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TAbstract Critical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CRITICAL_ELEMENT_OPERATION_COUNT = AnnotationsPackage.TANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL__TANNOTATED = TABSTRACT_CRITICAL_ELEMENT__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL__TYPE = TABSTRACT_CRITICAL_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL__TVALUES = TABSTRACT_CRITICAL_ELEMENT__TVALUES;

	/**
	 * The feature id for the '<em><b>Secrecy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL__SECRECY = TABSTRACT_CRITICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL__INTEGRITY = TABSTRACT_CRITICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL__HIGH = TABSTRACT_CRITICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TCritical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL_FEATURE_COUNT = TABSTRACT_CRITICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___ECLASS = TABSTRACT_CRITICAL_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___EIS_PROXY = TABSTRACT_CRITICAL_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___ERESOURCE = TABSTRACT_CRITICAL_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___ECONTAINER = TABSTRACT_CRITICAL_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___ECONTAINING_FEATURE = TABSTRACT_CRITICAL_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___ECONTAINMENT_FEATURE = TABSTRACT_CRITICAL_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___ECONTENTS = TABSTRACT_CRITICAL_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___EALL_CONTENTS = TABSTRACT_CRITICAL_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___ECROSS_REFERENCES = TABSTRACT_CRITICAL_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___EGET__ESTRUCTURALFEATURE = TABSTRACT_CRITICAL_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___EGET__ESTRUCTURALFEATURE_BOOLEAN = TABSTRACT_CRITICAL_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___ESET__ESTRUCTURALFEATURE_OBJECT = TABSTRACT_CRITICAL_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___EIS_SET__ESTRUCTURALFEATURE = TABSTRACT_CRITICAL_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___EUNSET__ESTRUCTURALFEATURE = TABSTRACT_CRITICAL_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___EINVOKE__EOPERATION_ELIST = TABSTRACT_CRITICAL_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL___GET_VALUE__STRING = TABSTRACT_CRITICAL_ELEMENT___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TCritical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITICAL_OPERATION_COUNT = TABSTRACT_CRITICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.security.annotations.requirements.TSecrecy <em>TSecrecy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSecrecy</em>'.
	 * @see org.gravity.security.annotations.requirements.TSecrecy
	 * @generated
	 */
	EClass getTSecrecy();

	/**
	 * Returns the meta object for class '{@link org.gravity.security.annotations.requirements.TIntegrity <em>TIntegrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIntegrity</em>'.
	 * @see org.gravity.security.annotations.requirements.TIntegrity
	 * @generated
	 */
	EClass getTIntegrity();

	/**
	 * Returns the meta object for class '{@link org.gravity.security.annotations.requirements.THigh <em>THigh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>THigh</em>'.
	 * @see org.gravity.security.annotations.requirements.THigh
	 * @generated
	 */
	EClass getTHigh();

	/**
	 * Returns the meta object for class '{@link org.gravity.security.annotations.requirements.TCritical <em>TCritical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCritical</em>'.
	 * @see org.gravity.security.annotations.requirements.TCritical
	 * @generated
	 */
	EClass getTCritical();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.security.annotations.requirements.TCritical#getSecrecy <em>Secrecy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Secrecy</em>'.
	 * @see org.gravity.security.annotations.requirements.TCritical#getSecrecy()
	 * @see #getTCritical()
	 * @generated
	 */
	EReference getTCritical_Secrecy();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.security.annotations.requirements.TCritical#getIntegrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integrity</em>'.
	 * @see org.gravity.security.annotations.requirements.TCritical#getIntegrity()
	 * @see #getTCritical()
	 * @generated
	 */
	EReference getTCritical_Integrity();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.security.annotations.requirements.TCritical#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>High</em>'.
	 * @see org.gravity.security.annotations.requirements.TCritical#getHigh()
	 * @see #getTCritical()
	 * @generated
	 */
	EReference getTCritical_High();

	/**
	 * Returns the meta object for class '{@link org.gravity.security.annotations.requirements.TAnnotationWithCounterMeasure <em>TAnnotation With Counter Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAnnotation With Counter Measure</em>'.
	 * @see org.gravity.security.annotations.requirements.TAnnotationWithCounterMeasure
	 * @generated
	 */
	EClass getTAnnotationWithCounterMeasure();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.security.annotations.requirements.TAnnotationWithCounterMeasure#getCountermeasure <em>Countermeasure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Countermeasure</em>'.
	 * @see org.gravity.security.annotations.requirements.TAnnotationWithCounterMeasure#getCountermeasure()
	 * @see #getTAnnotationWithCounterMeasure()
	 * @generated
	 */
	EReference getTAnnotationWithCounterMeasure_Countermeasure();

	/**
	 * Returns the meta object for class '{@link org.gravity.security.annotations.requirements.TAbstractCriticalElement <em>TAbstract Critical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAbstract Critical Element</em>'.
	 * @see org.gravity.security.annotations.requirements.TAbstractCriticalElement
	 * @generated
	 */
	EClass getTAbstractCriticalElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

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
		 * The meta object literal for the '{@link org.gravity.security.annotations.requirements.impl.TSecrecyImpl <em>TSecrecy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.security.annotations.requirements.impl.TSecrecyImpl
		 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTSecrecy()
		 * @generated
		 */
		EClass TSECRECY = eINSTANCE.getTSecrecy();

		/**
		 * The meta object literal for the '{@link org.gravity.security.annotations.requirements.impl.TIntegrityImpl <em>TIntegrity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.security.annotations.requirements.impl.TIntegrityImpl
		 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTIntegrity()
		 * @generated
		 */
		EClass TINTEGRITY = eINSTANCE.getTIntegrity();

		/**
		 * The meta object literal for the '{@link org.gravity.security.annotations.requirements.impl.THighImpl <em>THigh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.security.annotations.requirements.impl.THighImpl
		 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTHigh()
		 * @generated
		 */
		EClass THIGH = eINSTANCE.getTHigh();

		/**
		 * The meta object literal for the '{@link org.gravity.security.annotations.requirements.impl.TCriticalImpl <em>TCritical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.security.annotations.requirements.impl.TCriticalImpl
		 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTCritical()
		 * @generated
		 */
		EClass TCRITICAL = eINSTANCE.getTCritical();

		/**
		 * The meta object literal for the '<em><b>Secrecy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCRITICAL__SECRECY = eINSTANCE.getTCritical_Secrecy();

		/**
		 * The meta object literal for the '<em><b>Integrity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCRITICAL__INTEGRITY = eINSTANCE.getTCritical_Integrity();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCRITICAL__HIGH = eINSTANCE.getTCritical_High();

		/**
		 * The meta object literal for the '{@link org.gravity.security.annotations.requirements.impl.TAnnotationWithCounterMeasureImpl <em>TAnnotation With Counter Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.security.annotations.requirements.impl.TAnnotationWithCounterMeasureImpl
		 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTAnnotationWithCounterMeasure()
		 * @generated
		 */
		EClass TANNOTATION_WITH_COUNTER_MEASURE = eINSTANCE.getTAnnotationWithCounterMeasure();

		/**
		 * The meta object literal for the '<em><b>Countermeasure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANNOTATION_WITH_COUNTER_MEASURE__COUNTERMEASURE = eINSTANCE
				.getTAnnotationWithCounterMeasure_Countermeasure();

		/**
		 * The meta object literal for the '{@link org.gravity.security.annotations.requirements.impl.TAbstractCriticalElementImpl <em>TAbstract Critical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.security.annotations.requirements.impl.TAbstractCriticalElementImpl
		 * @see org.gravity.security.annotations.requirements.impl.RequirementsPackageImpl#getTAbstractCriticalElement()
		 * @generated
		 */
		EClass TABSTRACT_CRITICAL_ELEMENT = eINSTANCE.getTAbstractCriticalElement();

	}

} //RequirementsPackage
