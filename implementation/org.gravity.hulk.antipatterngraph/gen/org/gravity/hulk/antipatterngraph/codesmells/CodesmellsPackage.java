/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

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
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory
 * @model kind="package"
 * @generated
 */
public interface CodesmellsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codesmells";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/antipatterngraph#//codesmells";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codesmells";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodesmellsPackage eINSTANCE = org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HControllerClassSmellImpl <em>HController Class Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HControllerClassSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHControllerClassSmell()
	 * @generated
	 */
	int HCONTROLLER_CLASS_SMELL = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>HInvocation Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL__HINVOCATION_RELATION = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HController Class Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HController Class Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCONTROLLER_CLASS_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassSmellImpl <em>HData Class Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHDataClassSmell()
	 * @generated
	 */
	int HDATA_CLASS_SMELL = 1;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>Getter Setter Smells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL__GETTER_SETTER_SMELLS = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HNACC Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL__HNACC_METRIC = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HData Class Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HData Class Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HEmptyClassSmellImpl <em>HEmpty Class Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HEmptyClassSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHEmptyClassSmell()
	 * @generated
	 */
	int HEMPTY_CLASS_SMELL = 2;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The number of structural features of the '<em>HEmpty Class Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HEmpty Class Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEMPTY_CLASS_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HGetterSetterSmellImpl <em>HGetter Setter Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HGetterSetterSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHGetterSetterSmell()
	 * @generated
	 */
	int HGETTER_SETTER_SMELL = 3;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>TField Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL__TFIELD_DEFINITION = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HGetter Setter Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HGetter Setter Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HGETTER_SETTER_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassLowCohesionSmellImpl <em>HLarge Class Low Cohesion Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassLowCohesionSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHLargeClassLowCohesionSmell()
	 * @generated
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL = 4;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>HLow Cohesion Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL__HLOW_COHESION_SMELL = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HLarge Class Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL__HLARGE_CLASS_SMELL = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HLarge Class Low Cohesion Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HLarge Class Low Cohesion Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_LOW_COHESION_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassSmellImpl <em>HLarge Class Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHLargeClassSmell()
	 * @generated
	 */
	int HLARGE_CLASS_SMELL = 5;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>HNumber Of Members</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL__HNUMBER_OF_MEMBERS = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HLarge Class Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HLarge Class Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARGE_CLASS_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLowCohesionSmellImpl <em>HLow Cohesion Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HLowCohesionSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHLowCohesionSmell()
	 * @generated
	 */
	int HLOW_COHESION_SMELL = 6;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>HLCOM5 Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL__HLCOM5_CUSTOM_METRIC = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HLow Cohesion Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HLow Cohesion Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLOW_COHESION_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassAccessorImpl <em>HData Class Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassAccessorImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHDataClassAccessor()
	 * @generated
	 */
	int HDATA_CLASS_ACCESSOR = 7;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR__VALUE = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HData Class Smells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR__HDATA_CLASS_SMELLS = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HData Class Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Relative Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___GET_RELATIVE_AMOUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR___INCREMENT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>HData Class Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDATA_CLASS_ACCESSOR_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HMuchOverloadingCodeSmellImpl <em>HMuch Overloading Code Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HMuchOverloadingCodeSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHMuchOverloadingCodeSmell()
	 * @generated
	 */
	int HMUCH_OVERLOADING_CODE_SMELL = 8;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>HAverage Overloading In Class Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL__HAVERAGE_OVERLOADING_IN_CLASS_METRIC = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>HMuch Overloading Code Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HMuch Overloading Code Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMUCH_OVERLOADING_CODE_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HManyParametersCodeSmellImpl <em>HMany Parameters Code Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HManyParametersCodeSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHManyParametersCodeSmell()
	 * @generated
	 */
	int HMANY_PARAMETERS_CODE_SMELL = 9;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>HAverage Parameters Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL__HAVERAGE_PARAMETERS_METRIC = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HMany Parameters Code Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HMany Parameters Code Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMANY_PARAMETERS_CODE_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HIntenseFieldUsageCodeSmellImpl <em>HIntense Field Usage Code Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HIntenseFieldUsageCodeSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHIntenseFieldUsageCodeSmell()
	 * @generated
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL = 10;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>HLocal Access Relation Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL__HLOCAL_ACCESS_RELATION_METRIC = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>HIntense Field Usage Code Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HIntense Field Usage Code Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINTENSE_FIELD_USAGE_CODE_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HNoInheritanceCodeSmellImpl <em>HNo Inheritance Code Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HNoInheritanceCodeSmellImpl
	 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHNoInheritanceCodeSmell()
	 * @generated
	 */
	int HNO_INHERITANCE_CODE_SMELL = 11;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>HChild Classes Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL__HCHILD_CLASSES_METRIC = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HNo Inheritance Code Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>HNo Inheritance Code Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HNO_INHERITANCE_CODE_SMELL_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell <em>HController Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HController Class Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell
	 * @generated
	 */
	EClass getHControllerClassSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell#getHInvocationRelation <em>HInvocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HInvocation Relation</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell#getHInvocationRelation()
	 * @see #getHControllerClassSmell()
	 * @generated
	 */
	EReference getHControllerClassSmell_HInvocationRelation();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell <em>HData Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HData Class Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell
	 * @generated
	 */
	EClass getHDataClassSmell();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell#getGetterSetterSmells <em>Getter Setter Smells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Getter Setter Smells</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell#getGetterSetterSmells()
	 * @see #getHDataClassSmell()
	 * @generated
	 */
	EReference getHDataClassSmell_GetterSetterSmells();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell#getHNACCMetric <em>HNACC Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNACC Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell#getHNACCMetric()
	 * @see #getHDataClassSmell()
	 * @generated
	 */
	EReference getHDataClassSmell_HNACCMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HEmptyClassSmell <em>HEmpty Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HEmpty Class Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HEmptyClassSmell
	 * @generated
	 */
	EClass getHEmptyClassSmell();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell <em>HGetter Setter Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HGetter Setter Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell
	 * @generated
	 */
	EClass getHGetterSetterSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell#getTFieldDefinition <em>TField Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TField Definition</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell#getTFieldDefinition()
	 * @see #getHGetterSetterSmell()
	 * @generated
	 */
	EReference getHGetterSetterSmell_TFieldDefinition();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell <em>HLarge Class Low Cohesion Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLarge Class Low Cohesion Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell
	 * @generated
	 */
	EClass getHLargeClassLowCohesionSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell#getHLowCohesionSmell <em>HLow Cohesion Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLow Cohesion Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell#getHLowCohesionSmell()
	 * @see #getHLargeClassLowCohesionSmell()
	 * @generated
	 */
	EReference getHLargeClassLowCohesionSmell_HLowCohesionSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell#getHLargeClassSmell <em>HLarge Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLarge Class Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell#getHLargeClassSmell()
	 * @see #getHLargeClassLowCohesionSmell()
	 * @generated
	 */
	EReference getHLargeClassLowCohesionSmell_HLargeClassSmell();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell <em>HLarge Class Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLarge Class Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell
	 * @generated
	 */
	EClass getHLargeClassSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell#getHNumberOfMembers <em>HNumber Of Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HNumber Of Members</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell#getHNumberOfMembers()
	 * @see #getHLargeClassSmell()
	 * @generated
	 */
	EReference getHLargeClassSmell_HNumberOfMembers();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell <em>HLow Cohesion Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLow Cohesion Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell
	 * @generated
	 */
	EClass getHLowCohesionSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell#getHLCOM5CustomMetric <em>HLCOM5 Custom Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLCOM5 Custom Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell#getHLCOM5CustomMetric()
	 * @see #getHLowCohesionSmell()
	 * @generated
	 */
	EReference getHLowCohesionSmell_HLCOM5CustomMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor <em>HData Class Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HData Class Accessor</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor
	 * @generated
	 */
	EClass getHDataClassAccessor();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor#getHDataClassSmells <em>HData Class Smells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HData Class Smells</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor#getHDataClassSmells()
	 * @see #getHDataClassAccessor()
	 * @generated
	 */
	EReference getHDataClassAccessor_HDataClassSmells();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell <em>HMuch Overloading Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMuch Overloading Code Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell
	 * @generated
	 */
	EClass getHMuchOverloadingCodeSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell#getHAverageOverloadingInClassMetric <em>HAverage Overloading In Class Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HAverage Overloading In Class Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell#getHAverageOverloadingInClassMetric()
	 * @see #getHMuchOverloadingCodeSmell()
	 * @generated
	 */
	EReference getHMuchOverloadingCodeSmell_HAverageOverloadingInClassMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell <em>HMany Parameters Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMany Parameters Code Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell
	 * @generated
	 */
	EClass getHManyParametersCodeSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell#getHAverageParametersMetric <em>HAverage Parameters Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HAverage Parameters Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell#getHAverageParametersMetric()
	 * @see #getHManyParametersCodeSmell()
	 * @generated
	 */
	EReference getHManyParametersCodeSmell_HAverageParametersMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell <em>HIntense Field Usage Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIntense Field Usage Code Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell
	 * @generated
	 */
	EClass getHIntenseFieldUsageCodeSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell#getHLocalAccessRelationMetric <em>HLocal Access Relation Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLocal Access Relation Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell#getHLocalAccessRelationMetric()
	 * @see #getHIntenseFieldUsageCodeSmell()
	 * @generated
	 */
	EReference getHIntenseFieldUsageCodeSmell_HLocalAccessRelationMetric();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell <em>HNo Inheritance Code Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HNo Inheritance Code Smell</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell
	 * @generated
	 */
	EClass getHNoInheritanceCodeSmell();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell#getHChildClassesMetric <em>HChild Classes Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HChild Classes Metric</em>'.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell#getHChildClassesMetric()
	 * @see #getHNoInheritanceCodeSmell()
	 * @generated
	 */
	EReference getHNoInheritanceCodeSmell_HChildClassesMetric();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodesmellsFactory getCodesmellsFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HControllerClassSmellImpl <em>HController Class Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HControllerClassSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHControllerClassSmell()
		 * @generated
		 */
		EClass HCONTROLLER_CLASS_SMELL = eINSTANCE.getHControllerClassSmell();

		/**
		 * The meta object literal for the '<em><b>HInvocation Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HCONTROLLER_CLASS_SMELL__HINVOCATION_RELATION = eINSTANCE
				.getHControllerClassSmell_HInvocationRelation();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassSmellImpl <em>HData Class Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHDataClassSmell()
		 * @generated
		 */
		EClass HDATA_CLASS_SMELL = eINSTANCE.getHDataClassSmell();

		/**
		 * The meta object literal for the '<em><b>Getter Setter Smells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDATA_CLASS_SMELL__GETTER_SETTER_SMELLS = eINSTANCE.getHDataClassSmell_GetterSetterSmells();

		/**
		 * The meta object literal for the '<em><b>HNACC Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDATA_CLASS_SMELL__HNACC_METRIC = eINSTANCE.getHDataClassSmell_HNACCMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HEmptyClassSmellImpl <em>HEmpty Class Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HEmptyClassSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHEmptyClassSmell()
		 * @generated
		 */
		EClass HEMPTY_CLASS_SMELL = eINSTANCE.getHEmptyClassSmell();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HGetterSetterSmellImpl <em>HGetter Setter Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HGetterSetterSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHGetterSetterSmell()
		 * @generated
		 */
		EClass HGETTER_SETTER_SMELL = eINSTANCE.getHGetterSetterSmell();

		/**
		 * The meta object literal for the '<em><b>TField Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HGETTER_SETTER_SMELL__TFIELD_DEFINITION = eINSTANCE.getHGetterSetterSmell_TFieldDefinition();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassLowCohesionSmellImpl <em>HLarge Class Low Cohesion Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassLowCohesionSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHLargeClassLowCohesionSmell()
		 * @generated
		 */
		EClass HLARGE_CLASS_LOW_COHESION_SMELL = eINSTANCE.getHLargeClassLowCohesionSmell();

		/**
		 * The meta object literal for the '<em><b>HLow Cohesion Smell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLARGE_CLASS_LOW_COHESION_SMELL__HLOW_COHESION_SMELL = eINSTANCE
				.getHLargeClassLowCohesionSmell_HLowCohesionSmell();

		/**
		 * The meta object literal for the '<em><b>HLarge Class Smell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLARGE_CLASS_LOW_COHESION_SMELL__HLARGE_CLASS_SMELL = eINSTANCE
				.getHLargeClassLowCohesionSmell_HLargeClassSmell();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassSmellImpl <em>HLarge Class Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HLargeClassSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHLargeClassSmell()
		 * @generated
		 */
		EClass HLARGE_CLASS_SMELL = eINSTANCE.getHLargeClassSmell();

		/**
		 * The meta object literal for the '<em><b>HNumber Of Members</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLARGE_CLASS_SMELL__HNUMBER_OF_MEMBERS = eINSTANCE.getHLargeClassSmell_HNumberOfMembers();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HLowCohesionSmellImpl <em>HLow Cohesion Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HLowCohesionSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHLowCohesionSmell()
		 * @generated
		 */
		EClass HLOW_COHESION_SMELL = eINSTANCE.getHLowCohesionSmell();

		/**
		 * The meta object literal for the '<em><b>HLCOM5 Custom Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLOW_COHESION_SMELL__HLCOM5_CUSTOM_METRIC = eINSTANCE.getHLowCohesionSmell_HLCOM5CustomMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassAccessorImpl <em>HData Class Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HDataClassAccessorImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHDataClassAccessor()
		 * @generated
		 */
		EClass HDATA_CLASS_ACCESSOR = eINSTANCE.getHDataClassAccessor();

		/**
		 * The meta object literal for the '<em><b>HData Class Smells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDATA_CLASS_ACCESSOR__HDATA_CLASS_SMELLS = eINSTANCE.getHDataClassAccessor_HDataClassSmells();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HMuchOverloadingCodeSmellImpl <em>HMuch Overloading Code Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HMuchOverloadingCodeSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHMuchOverloadingCodeSmell()
		 * @generated
		 */
		EClass HMUCH_OVERLOADING_CODE_SMELL = eINSTANCE.getHMuchOverloadingCodeSmell();

		/**
		 * The meta object literal for the '<em><b>HAverage Overloading In Class Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMUCH_OVERLOADING_CODE_SMELL__HAVERAGE_OVERLOADING_IN_CLASS_METRIC = eINSTANCE
				.getHMuchOverloadingCodeSmell_HAverageOverloadingInClassMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HManyParametersCodeSmellImpl <em>HMany Parameters Code Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HManyParametersCodeSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHManyParametersCodeSmell()
		 * @generated
		 */
		EClass HMANY_PARAMETERS_CODE_SMELL = eINSTANCE.getHManyParametersCodeSmell();

		/**
		 * The meta object literal for the '<em><b>HAverage Parameters Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMANY_PARAMETERS_CODE_SMELL__HAVERAGE_PARAMETERS_METRIC = eINSTANCE
				.getHManyParametersCodeSmell_HAverageParametersMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HIntenseFieldUsageCodeSmellImpl <em>HIntense Field Usage Code Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HIntenseFieldUsageCodeSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHIntenseFieldUsageCodeSmell()
		 * @generated
		 */
		EClass HINTENSE_FIELD_USAGE_CODE_SMELL = eINSTANCE.getHIntenseFieldUsageCodeSmell();

		/**
		 * The meta object literal for the '<em><b>HLocal Access Relation Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HINTENSE_FIELD_USAGE_CODE_SMELL__HLOCAL_ACCESS_RELATION_METRIC = eINSTANCE
				.getHIntenseFieldUsageCodeSmell_HLocalAccessRelationMetric();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.codesmells.impl.HNoInheritanceCodeSmellImpl <em>HNo Inheritance Code Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.HNoInheritanceCodeSmellImpl
		 * @see org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl#getHNoInheritanceCodeSmell()
		 * @generated
		 */
		EClass HNO_INHERITANCE_CODE_SMELL = eINSTANCE.getHNoInheritanceCodeSmell();

		/**
		 * The meta object literal for the '<em><b>HChild Classes Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HNO_INHERITANCE_CODE_SMELL__HCHILD_CLASSES_METRIC = eINSTANCE
				.getHNoInheritanceCodeSmell_HChildClassesMetric();

	}

} //CodesmellsPackage
