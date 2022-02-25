/**
 */
package org.gravity.tgg.pm.uml.Rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.gravity.tgg.pm.uml.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.gravity.tgg.pm.uml/model/Uml.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = org.gravity.tgg.pm.uml.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.Rules.impl.Model2TypeGraphImpl <em>Model2 Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.Rules.impl.Model2TypeGraphImpl
	 * @see org.gravity.tgg.pm.uml.Rules.impl.RulesPackageImpl#getModel2TypeGraph()
	 * @generated
	 */
	int MODEL2_TYPE_GRAPH = 0;

	/**
	 * The number of structural features of the '<em>Model2 Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPROPRIATE_FWD__MATCH_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Type Graph 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPROPRIATE_BWD_TYPE_GRAPH_0__TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Model 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPROPRIATE_FWD_MODEL_0__MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_MODEL_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___CHECK_DEC_FWD__MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___CHECK_DEC_BWD__TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Model2 Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL2_TYPE_GRAPH_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.gravity.tgg.pm.uml.Rules.impl.ModelNested2TypeGraphImpl <em>Model Nested2 Type Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.tgg.pm.uml.Rules.impl.ModelNested2TypeGraphImpl
	 * @see org.gravity.tgg.pm.uml.Rules.impl.RulesPackageImpl#getModelNested2TypeGraph()
	 * @generated
	 */
	int MODEL_NESTED2_TYPE_GRAPH = 1;

	/**
	 * The number of structural features of the '<em>Model Nested2 Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_FWD__MATCH_MODEL_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_MODEL2TYPEGRAPH_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_MODEL2TYPEGRAPH_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Type Graph 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_BWD_TYPE_GRAPH_1__TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_TYPEGRAPH_MODEL_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___CHECK_DEC_FWD__MODEL_MODEL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___CHECK_DEC_BWD__TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL__RULEENTRYCONTAINER_MODEL2TYPEGRAPH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL2TYPEGRAPH_MODEL_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Model Nested2 Type Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NESTED2_TYPE_GRAPH_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph <em>Model2 Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model2 Type Graph</em>'.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph
	 * @generated
	 */
	EClass getModel2TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsAppropriate_FWD__Match_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getModel2TypeGraph__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModel2TypeGraph__RegisterObjectsToMatch_FWD__Match_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsAppropriate_solveCsp_FWD__Match_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.eclipse.uml2.uml.Model) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getModel2TypeGraph__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModel2TypeGraph__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsAppropriate_BWD__Match_TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getModel2TypeGraph__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModel2TypeGraph__RegisterObjectsToMatch_BWD__Match_TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsAppropriate_solveCsp_BWD__Match_TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.gravity.typegraph.basic.TypeGraph) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getModel2TypeGraph__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModel2TypeGraph__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_BWD_TypeGraph_0(org.gravity.typegraph.basic.TypeGraph) <em>Is Appropriate BWD Type Graph 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Type Graph 0</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_BWD_TypeGraph_0(org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsAppropriate_BWD_TypeGraph_0__TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_FWD_Model_0(org.eclipse.uml2.uml.Model) <em>Is Appropriate FWD Model 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Model 0</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isAppropriate_FWD_Model_0(org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsAppropriate_FWD_Model_0__Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getModel2TypeGraph__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getModel2TypeGraph__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_solveCsp_CC(org.gravity.typegraph.basic.TypeGraph, org.eclipse.uml2.uml.Model, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_solveCsp_CC(org.gravity.typegraph.basic.TypeGraph, org.eclipse.uml2.uml.Model, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsApplicable_solveCsp_CC__TypeGraph_Model_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModel2TypeGraph__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkDEC_FWD(org.eclipse.uml2.uml.Model) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkDEC_FWD(org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModel2TypeGraph__CheckDEC_FWD__Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkDEC_BWD(org.gravity.typegraph.basic.TypeGraph) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#checkDEC_BWD(org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModel2TypeGraph__CheckDEC_BWD__TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getModel2TypeGraph__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getModel2TypeGraph__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.Model2TypeGraph#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModel2TypeGraph__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph <em>Model Nested2 Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Nested2 Type Graph</em>'.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph
	 * @generated
	 */
	EClass getModelNested2TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model, org.eclipse.uml2.uml.Model) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsAppropriate_FWD__Match_Model_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model, org.eclipse.uml2.uml.Model) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__RegisterObjectsToMatch_FWD__Match_Model_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model, org.eclipse.uml2.uml.Model) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, org.eclipse.uml2.uml.Model, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsAppropriate_solveCsp_FWD__Match_Model_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.eclipse.uml2.uml.Model, org.gravity.tgg.pm.uml.Model2TypeGraph, org.eclipse.uml2.uml.Model) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, org.eclipse.uml2.uml.Model, org.gravity.tgg.pm.uml.Model2TypeGraph, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_Model2TypeGraph_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsAppropriate_BWD__Match_TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__RegisterObjectsToMatch_BWD__Match_TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsAppropriate_solveCsp_BWD__Match_TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.gravity.typegraph.basic.TypeGraph, org.gravity.tgg.pm.uml.Model2TypeGraph, org.eclipse.uml2.uml.Model) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.gravity.typegraph.basic.TypeGraph, org.gravity.tgg.pm.uml.Model2TypeGraph, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_Model2TypeGraph_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_BWD_TypeGraph_1(org.gravity.typegraph.basic.TypeGraph) <em>Is Appropriate BWD Type Graph 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Type Graph 1</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_BWD_TypeGraph_1(org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsAppropriate_BWD_TypeGraph_1__TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_FWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isAppropriate_FWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Model, org.gravity.typegraph.basic.TypeGraph, org.eclipse.uml2.uml.Model, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Model, org.gravity.typegraph.basic.TypeGraph, org.eclipse.uml2.uml.Model, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsApplicable_solveCsp_CC__Model_TypeGraph_Model_Match_Match();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkDEC_FWD(org.eclipse.uml2.uml.Model, org.eclipse.uml2.uml.Model) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkDEC_FWD(org.eclipse.uml2.uml.Model, org.eclipse.uml2.uml.Model)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__CheckDEC_FWD__Model_Model();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkDEC_BWD(org.gravity.typegraph.basic.TypeGraph) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#checkDEC_BWD(org.gravity.typegraph.basic.TypeGraph)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__CheckDEC_BWD__TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.gravity.tgg.pm.uml.Model2TypeGraph) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, org.gravity.tgg.pm.uml.Model2TypeGraph)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__GenerateModel__RuleEntryContainer_Model2TypeGraph();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.gravity.tgg.pm.uml.Model2TypeGraph, org.eclipse.uml2.uml.Model, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.gravity.tgg.pm.uml.Model2TypeGraph, org.eclipse.uml2.uml.Model, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model2TypeGraph_Model_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getModelNested2TypeGraph__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

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
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.Rules.impl.Model2TypeGraphImpl <em>Model2 Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.Rules.impl.Model2TypeGraphImpl
		 * @see org.gravity.tgg.pm.uml.Rules.impl.RulesPackageImpl#getModel2TypeGraph()
		 * @generated
		 */
		EClass MODEL2_TYPE_GRAPH = eINSTANCE.getModel2TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPROPRIATE_FWD__MATCH_MODEL = eINSTANCE
				.getModel2TypeGraph__IsAppropriate_FWD__Match_Model();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getModel2TypeGraph__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getModel2TypeGraph__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL = eINSTANCE
				.getModel2TypeGraph__RegisterObjectsToMatch_FWD__Match_Model();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL = eINSTANCE
				.getModel2TypeGraph__IsAppropriate_solveCsp_FWD__Match_Model();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getModel2TypeGraph__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL = eINSTANCE
				.getModel2TypeGraph__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getModel2TypeGraph__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getModel2TypeGraph__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___CHECK_TYPES_FWD__MATCH = eINSTANCE.getModel2TypeGraph__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH = eINSTANCE
				.getModel2TypeGraph__IsAppropriate_BWD__Match_TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getModel2TypeGraph__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getModel2TypeGraph__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH = eINSTANCE
				.getModel2TypeGraph__RegisterObjectsToMatch_BWD__Match_TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH = eINSTANCE
				.getModel2TypeGraph__IsAppropriate_solveCsp_BWD__Match_TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getModel2TypeGraph__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH = eINSTANCE
				.getModel2TypeGraph__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getModel2TypeGraph__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getModel2TypeGraph__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___CHECK_TYPES_BWD__MATCH = eINSTANCE.getModel2TypeGraph__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD Type Graph 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPROPRIATE_BWD_TYPE_GRAPH_0__TYPEGRAPH = eINSTANCE
				.getModel2TypeGraph__IsAppropriate_BWD_TypeGraph_0__TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD Model 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPROPRIATE_FWD_MODEL_0__MODEL = eINSTANCE
				.getModel2TypeGraph__IsAppropriate_FWD_Model_0__Model();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getModel2TypeGraph__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getModel2TypeGraph__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPLICABLE_CC__MATCH_MATCH = eINSTANCE
				.getModel2TypeGraph__IsApplicable_CC__Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_MODEL_MATCH_MATCH = eINSTANCE
				.getModel2TypeGraph__IsApplicable_solveCsp_CC__TypeGraph_Model_Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_CC__CSP = eINSTANCE
				.getModel2TypeGraph__IsApplicable_checkCsp_CC__CSP();

		/**
		 * The meta object literal for the '<em><b>Check DEC FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___CHECK_DEC_FWD__MODEL = eINSTANCE.getModel2TypeGraph__CheckDEC_FWD__Model();

		/**
		 * The meta object literal for the '<em><b>Check DEC BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___CHECK_DEC_BWD__TYPEGRAPH = eINSTANCE
				.getModel2TypeGraph__CheckDEC_BWD__TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___GENERATE_MODEL__RULEENTRYCONTAINER = eINSTANCE
				.getModel2TypeGraph__GenerateModel__RuleEntryContainer();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = eINSTANCE
				.getModel2TypeGraph__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL2_TYPE_GRAPH___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getModel2TypeGraph__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link org.gravity.tgg.pm.uml.Rules.impl.ModelNested2TypeGraphImpl <em>Model Nested2 Type Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.tgg.pm.uml.Rules.impl.ModelNested2TypeGraphImpl
		 * @see org.gravity.tgg.pm.uml.Rules.impl.RulesPackageImpl#getModelNested2TypeGraph()
		 * @generated
		 */
		EClass MODEL_NESTED2_TYPE_GRAPH = eINSTANCE.getModelNested2TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_FWD__MATCH_MODEL_MODEL = eINSTANCE
				.getModelNested2TypeGraph__IsAppropriate_FWD__Match_Model_Model();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getModelNested2TypeGraph__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getModelNested2TypeGraph__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_MODEL = eINSTANCE
				.getModelNested2TypeGraph__RegisterObjectsToMatch_FWD__Match_Model_Model();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_MODEL = eINSTANCE
				.getModelNested2TypeGraph__IsAppropriate_solveCsp_FWD__Match_Model_Model();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getModelNested2TypeGraph__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_MODEL2TYPEGRAPH_MODEL = eINSTANCE
				.getModelNested2TypeGraph__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_Model2TypeGraph_Model();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getModelNested2TypeGraph__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getModelNested2TypeGraph__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getModelNested2TypeGraph__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH = eINSTANCE
				.getModelNested2TypeGraph__IsAppropriate_BWD__Match_TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getModelNested2TypeGraph__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getModelNested2TypeGraph__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH = eINSTANCE
				.getModelNested2TypeGraph__RegisterObjectsToMatch_BWD__Match_TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH = eINSTANCE
				.getModelNested2TypeGraph__IsAppropriate_solveCsp_BWD__Match_TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getModelNested2TypeGraph__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_MODEL2TYPEGRAPH_MODEL = eINSTANCE
				.getModelNested2TypeGraph__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_Model2TypeGraph_Model();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getModelNested2TypeGraph__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getModelNested2TypeGraph__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getModelNested2TypeGraph__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD Type Graph 1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_BWD_TYPE_GRAPH_1__TYPEGRAPH = eINSTANCE
				.getModelNested2TypeGraph__IsAppropriate_BWD_TypeGraph_1__TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = eINSTANCE
				.getModelNested2TypeGraph__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getModelNested2TypeGraph__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getModelNested2TypeGraph__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CC__MATCH_MATCH = eINSTANCE
				.getModelNested2TypeGraph__IsApplicable_CC__Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_TYPEGRAPH_MODEL_MATCH_MATCH = eINSTANCE
				.getModelNested2TypeGraph__IsApplicable_solveCsp_CC__Model_TypeGraph_Model_Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_CC__CSP = eINSTANCE
				.getModelNested2TypeGraph__IsApplicable_checkCsp_CC__CSP();

		/**
		 * The meta object literal for the '<em><b>Check DEC FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___CHECK_DEC_FWD__MODEL_MODEL = eINSTANCE
				.getModelNested2TypeGraph__CheckDEC_FWD__Model_Model();

		/**
		 * The meta object literal for the '<em><b>Check DEC BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___CHECK_DEC_BWD__TYPEGRAPH = eINSTANCE
				.getModelNested2TypeGraph__CheckDEC_BWD__TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL__RULEENTRYCONTAINER_MODEL2TYPEGRAPH = eINSTANCE
				.getModelNested2TypeGraph__GenerateModel__RuleEntryContainer_Model2TypeGraph();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL2TYPEGRAPH_MODEL_MODELGENERATORRULERESULT = eINSTANCE
				.getModelNested2TypeGraph__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model2TypeGraph_Model_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getModelNested2TypeGraph__GenerateModel_checkCsp_BWD__CSP();

	}

} //RulesPackage
