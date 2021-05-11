/**
 */
package org.gravity.security.annotations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.gravity.security.annotations.AnnotationsFactory
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
	String eNS_URI = "http://gravity-tool.org/typegraph/annotations/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.security.annotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsPackage eINSTANCE = org.gravity.security.annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.security.annotations.impl.TCounterMeasureImpl <em>TCounter Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.security.annotations.impl.TCounterMeasureImpl
	 * @see org.gravity.security.annotations.impl.AnnotationsPackageImpl#getTCounterMeasure()
	 * @generated
	 */
	int TCOUNTER_MEASURE = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE__TANNOTATED = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE__TYPE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE__TVALUES = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION__TVALUES;

	/**
	 * The number of structural features of the '<em>TCounter Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE_FEATURE_COUNT = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___ECLASS = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___EIS_PROXY = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___ERESOURCE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___ECONTAINER = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___ECONTAINING_FEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___ECONTAINMENT_FEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___ECONTENTS = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___EALL_CONTENTS = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___ECROSS_REFERENCES = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___EGET__ESTRUCTURALFEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___ESET__ESTRUCTURALFEATURE_OBJECT = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___EIS_SET__ESTRUCTURALFEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___EUNSET__ESTRUCTURALFEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___EINVOKE__EOPERATION_ELIST = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE___GET_VALUE__STRING = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TCounter Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTER_MEASURE_OPERATION_COUNT = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.gravity.security.annotations.impl.TTaintedImpl <em>TTainted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.security.annotations.impl.TTaintedImpl
	 * @see org.gravity.security.annotations.impl.AnnotationsPackageImpl#getTTainted()
	 * @generated
	 */
	int TTAINTED = 1;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED__TANNOTATED = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED__TYPE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED__TVALUES = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION__TVALUES;

	/**
	 * The number of structural features of the '<em>TTainted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED_FEATURE_COUNT = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___ECLASS = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___EIS_PROXY = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___ERESOURCE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___ECONTAINER = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___ECONTAINING_FEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___ECONTAINMENT_FEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___ECONTENTS = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___EALL_CONTENTS = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___ECROSS_REFERENCES = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___EGET__ESTRUCTURALFEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___ESET__ESTRUCTURALFEATURE_OBJECT = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___EIS_SET__ESTRUCTURALFEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___EUNSET__ESTRUCTURALFEATURE = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___EINVOKE__EOPERATION_ELIST = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED___GET_VALUE__STRING = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>TTainted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAINTED_OPERATION_COUNT = org.gravity.typegraph.basic.annotations.AnnotationsPackage.TANNOTATION_OPERATION_COUNT
			+ 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.security.annotations.TCounterMeasure <em>TCounter Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCounter Measure</em>'.
	 * @see org.gravity.security.annotations.TCounterMeasure
	 * @generated
	 */
	EClass getTCounterMeasure();

	/**
	 * Returns the meta object for class '{@link org.gravity.security.annotations.TTainted <em>TTainted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTainted</em>'.
	 * @see org.gravity.security.annotations.TTainted
	 * @generated
	 */
	EClass getTTainted();

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
		 * The meta object literal for the '{@link org.gravity.security.annotations.impl.TCounterMeasureImpl <em>TCounter Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.security.annotations.impl.TCounterMeasureImpl
		 * @see org.gravity.security.annotations.impl.AnnotationsPackageImpl#getTCounterMeasure()
		 * @generated
		 */
		EClass TCOUNTER_MEASURE = eINSTANCE.getTCounterMeasure();

		/**
		 * The meta object literal for the '{@link org.gravity.security.annotations.impl.TTaintedImpl <em>TTainted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.security.annotations.impl.TTaintedImpl
		 * @see org.gravity.security.annotations.impl.AnnotationsPackageImpl#getTTainted()
		 * @generated
		 */
		EClass TTAINTED = eINSTANCE.getTTainted();

	}

} //AnnotationsPackage
