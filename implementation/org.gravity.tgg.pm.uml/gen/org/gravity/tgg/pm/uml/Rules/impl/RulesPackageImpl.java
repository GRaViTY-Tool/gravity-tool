/**
 */
package org.gravity.tgg.pm.uml.Rules.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.gravity.tgg.pm.uml.Rules.Model2TypeGraph;
import org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph;
import org.gravity.tgg.pm.uml.Rules.RulesFactory;
import org.gravity.tgg.pm.uml.Rules.RulesPackage;

import org.gravity.tgg.pm.uml.UmlPackage;

import org.gravity.tgg.pm.uml.impl.UmlPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.language.csp.CspPackage;

import org.moflon.tgg.language.modelgenerator.ModelgeneratorPackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelNested2TypeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model2TypeGraphEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gravity.tgg.pm.uml.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRulesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RulesPackageImpl theRulesPackage = registeredRulesPackage instanceof RulesPackageImpl
				? (RulesPackageImpl) registeredRulesPackage
				: new RulesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl) (registeredPackage instanceof UmlPackageImpl ? registeredPackage
				: UmlPackage.eINSTANCE);

		// Create package meta-data objects
		theRulesPackage.createPackageContents();
		theUmlPackage.createPackageContents();

		// Initialize created meta-data
		theRulesPackage.initializePackageContents();
		theUmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelNested2TypeGraph() {
		return modelNested2TypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsAppropriate_FWD__Match_Model_Model() {
		return modelNested2TypeGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__Perform_FWD__IsApplicableMatch() {
		return modelNested2TypeGraphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsApplicable_FWD__Match() {
		return modelNested2TypeGraphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__RegisterObjectsToMatch_FWD__Match_Model_Model() {
		return modelNested2TypeGraphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsAppropriate_solveCsp_FWD__Match_Model_Model() {
		return modelNested2TypeGraphEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsAppropriate_checkCsp_FWD__CSP() {
		return modelNested2TypeGraphEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_Model_Model2TypeGraph() {
		return modelNested2TypeGraphEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsApplicable_checkCsp_FWD__CSP() {
		return modelNested2TypeGraphEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return modelNested2TypeGraphEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__CheckTypes_FWD__Match() {
		return modelNested2TypeGraphEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsAppropriate_BWD__Match_TypeGraph() {
		return modelNested2TypeGraphEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__Perform_BWD__IsApplicableMatch() {
		return modelNested2TypeGraphEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsApplicable_BWD__Match() {
		return modelNested2TypeGraphEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__RegisterObjectsToMatch_BWD__Match_TypeGraph() {
		return modelNested2TypeGraphEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsAppropriate_solveCsp_BWD__Match_TypeGraph() {
		return modelNested2TypeGraphEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsAppropriate_checkCsp_BWD__CSP() {
		return modelNested2TypeGraphEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_Model_Model2TypeGraph() {
		return modelNested2TypeGraphEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsApplicable_checkCsp_BWD__CSP() {
		return modelNested2TypeGraphEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return modelNested2TypeGraphEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__CheckTypes_BWD__Match() {
		return modelNested2TypeGraphEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsAppropriate_BWD_TypeGraph_8__TypeGraph() {
		return modelNested2TypeGraphEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsAppropriate_FWD_EMoflonEdge_212__EMoflonEdge() {
		return modelNested2TypeGraphEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__CheckAttributes_FWD__TripleMatch() {
		return modelNested2TypeGraphEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__CheckAttributes_BWD__TripleMatch() {
		return modelNested2TypeGraphEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsApplicable_CC__Match_Match() {
		return modelNested2TypeGraphEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsApplicable_solveCsp_CC__TypeGraph_Model_Model_Match_Match() {
		return modelNested2TypeGraphEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__IsApplicable_checkCsp_CC__CSP() {
		return modelNested2TypeGraphEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__CheckDEC_FWD__Model_Model() {
		return modelNested2TypeGraphEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__CheckDEC_BWD__TypeGraph() {
		return modelNested2TypeGraphEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__GenerateModel__RuleEntryContainer_Model2TypeGraph() {
		return modelNested2TypeGraphEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model_Model2TypeGraph_ModelgeneratorRuleResult() {
		return modelNested2TypeGraphEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelNested2TypeGraph__GenerateModel_checkCsp_BWD__CSP() {
		return modelNested2TypeGraphEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel2TypeGraph() {
		return model2TypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsAppropriate_FWD__Match_Model() {
		return model2TypeGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__Perform_FWD__IsApplicableMatch() {
		return model2TypeGraphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsApplicable_FWD__Match() {
		return model2TypeGraphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__RegisterObjectsToMatch_FWD__Match_Model() {
		return model2TypeGraphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsAppropriate_solveCsp_FWD__Match_Model() {
		return model2TypeGraphEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsAppropriate_checkCsp_FWD__CSP() {
		return model2TypeGraphEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model() {
		return model2TypeGraphEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsApplicable_checkCsp_FWD__CSP() {
		return model2TypeGraphEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return model2TypeGraphEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__CheckTypes_FWD__Match() {
		return model2TypeGraphEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsAppropriate_BWD__Match_TypeGraph() {
		return model2TypeGraphEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__Perform_BWD__IsApplicableMatch() {
		return model2TypeGraphEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsApplicable_BWD__Match() {
		return model2TypeGraphEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__RegisterObjectsToMatch_BWD__Match_TypeGraph() {
		return model2TypeGraphEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsAppropriate_solveCsp_BWD__Match_TypeGraph() {
		return model2TypeGraphEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsAppropriate_checkCsp_BWD__CSP() {
		return model2TypeGraphEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph() {
		return model2TypeGraphEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsApplicable_checkCsp_BWD__CSP() {
		return model2TypeGraphEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return model2TypeGraphEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__CheckTypes_BWD__Match() {
		return model2TypeGraphEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsAppropriate_BWD_TypeGraph_9__TypeGraph() {
		return model2TypeGraphEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsAppropriate_FWD_Model_2__Model() {
		return model2TypeGraphEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__CheckAttributes_FWD__TripleMatch() {
		return model2TypeGraphEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__CheckAttributes_BWD__TripleMatch() {
		return model2TypeGraphEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsApplicable_CC__Match_Match() {
		return model2TypeGraphEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsApplicable_solveCsp_CC__Model_TypeGraph_Match_Match() {
		return model2TypeGraphEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__IsApplicable_checkCsp_CC__CSP() {
		return model2TypeGraphEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__CheckDEC_FWD__Model() {
		return model2TypeGraphEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__CheckDEC_BWD__TypeGraph() {
		return model2TypeGraphEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__GenerateModel__RuleEntryContainer() {
		return model2TypeGraphEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return model2TypeGraphEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel2TypeGraph__GenerateModel_checkCsp_BWD__CSP() {
		return model2TypeGraphEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modelNested2TypeGraphEClass = createEClass(MODEL_NESTED2_TYPE_GRAPH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_FWD__MATCH_MODEL_MODEL);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_FWD__MATCH);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_MODEL);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_MODEL);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_MODEL_MODEL2TYPEGRAPH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___CHECK_TYPES_FWD__MATCH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_BWD__MATCH);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_MODEL_MODEL2TYPEGRAPH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___CHECK_TYPES_BWD__MATCH);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_BWD_TYPE_GRAPH_8__TYPEGRAPH);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_212__EMOFLONEDGE);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CC__MATCH_MATCH);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_MODEL_MODEL_MATCH_MATCH);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_CC__CSP);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___CHECK_DEC_FWD__MODEL_MODEL);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___CHECK_DEC_BWD__TYPEGRAPH);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL__RULEENTRYCONTAINER_MODEL2TYPEGRAPH);
		createEOperation(modelNested2TypeGraphEClass,
				MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_MODEL2TYPEGRAPH_MODELGENERATORRULERESULT);
		createEOperation(modelNested2TypeGraphEClass, MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		model2TypeGraphEClass = createEClass(MODEL2_TYPE_GRAPH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPROPRIATE_FWD__MATCH_MODEL);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPLICABLE_FWD__MATCH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(model2TypeGraphEClass,
				MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(model2TypeGraphEClass,
				MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___CHECK_TYPES_FWD__MATCH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPLICABLE_BWD__MATCH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(model2TypeGraphEClass,
				MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(model2TypeGraphEClass,
				MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___CHECK_TYPES_BWD__MATCH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPROPRIATE_BWD_TYPE_GRAPH_9__TYPEGRAPH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPROPRIATE_FWD_MODEL_2__MODEL);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPLICABLE_CC__MATCH_MATCH);
		createEOperation(model2TypeGraphEClass,
				MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_TYPEGRAPH_MATCH_MATCH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_CC__CSP);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___CHECK_DEC_FWD__MODEL);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___CHECK_DEC_BWD__TYPEGRAPH);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___GENERATE_MODEL__RULEENTRYCONTAINER);
		createEOperation(model2TypeGraphEClass,
				MODEL2_TYPE_GRAPH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT);
		createEOperation(model2TypeGraphEClass, MODEL2_TYPE_GRAPH___GENERATE_MODEL_CHECK_CSP_BWD__CSP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RuntimePackage theRuntimePackage = (RuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(RuntimePackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		CspPackage theCspPackage = (CspPackage) EPackage.Registry.INSTANCE.getEPackage(CspPackage.eNS_URI);
		UmlPackage theUmlPackage = (UmlPackage) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		ModelgeneratorPackage theModelgeneratorPackage = (ModelgeneratorPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModelgeneratorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelNested2TypeGraphEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());
		model2TypeGraphEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelNested2TypeGraphEClass, ModelNested2TypeGraph.class, "ModelNested2TypeGraph", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getModelNested2TypeGraph__IsAppropriate_FWD__Match_Model_Model(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__Perform_FWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsApplicable_FWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__RegisterObjectsToMatch_FWD__Match_Model_Model(), null,
				"registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsAppropriate_solveCsp_FWD__Match_Model_Model(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsAppropriate_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getModelNested2TypeGraph__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_Model_Model2TypeGraph(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUmlPackage.getModel2TypeGraph(), "outerModel2PM", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsApplicable_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getModelNested2TypeGraph__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "outerModel2PM", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model2PM", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__CheckTypes_FWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsAppropriate_BWD__Match_TypeGraph(), ecorePackage.getEBoolean(),
				"isAppropriate_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__Perform_BWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsApplicable_BWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__RegisterObjectsToMatch_BWD__Match_TypeGraph(), null,
				"registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsAppropriate_solveCsp_BWD__Match_TypeGraph(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsAppropriate_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getModelNested2TypeGraph__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_Model_Model2TypeGraph(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUmlPackage.getModel2TypeGraph(), "outerModel2PM", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsApplicable_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getModelNested2TypeGraph__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "outerModel2PM", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model2PM", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__CheckTypes_BWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsAppropriate_BWD_TypeGraph_8__TypeGraph(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_BWD_TypeGraph_8", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsAppropriate_FWD_EMoflonEdge_212__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_FWD_EMoflonEdge_212", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_nestedPackage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__CheckAttributes_FWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__CheckAttributes_BWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsApplicable_CC__Match_Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsApplicable_solveCsp_CC__TypeGraph_Model_Model_Match_Match(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__IsApplicable_checkCsp_CC__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__CheckDEC_FWD__Model_Model(), ecorePackage.getEBoolean(),
				"checkDEC_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__CheckDEC_BWD__TypeGraph(), ecorePackage.getEBoolean(),
				"checkDEC_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__GenerateModel__RuleEntryContainer_Model2TypeGraph(),
				theRuntimePackage.getModelgeneratorRuleResult(), "generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(), "ruleEntryContainer", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theUmlPackage.getModel2TypeGraph(), "outerModel2PMParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getModelNested2TypeGraph__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model_Model2TypeGraph_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "outerModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUmlPackage.getModel2TypeGraph(), "outerModel2PM", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getModelgeneratorRuleResult(), "ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelNested2TypeGraph__GenerateModel_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"generateModel_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(model2TypeGraphEClass, Model2TypeGraph.class, "Model2TypeGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getModel2TypeGraph__IsAppropriate_FWD__Match_Model(), ecorePackage.getEBoolean(),
				"isAppropriate_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__Perform_FWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsApplicable_FWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__RegisterObjectsToMatch_FWD__Match_Model(), null,
				"registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsAppropriate_solveCsp_FWD__Match_Model(), theCspPackage.getCSP(),
				"isAppropriate_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsAppropriate_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsApplicable_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject(), null,
				"registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model2PM", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__CheckTypes_FWD__Match(), ecorePackage.getEBoolean(), "checkTypes_FWD",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsAppropriate_BWD__Match_TypeGraph(), ecorePackage.getEBoolean(),
				"isAppropriate_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__Perform_BWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsApplicable_BWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__RegisterObjectsToMatch_BWD__Match_TypeGraph(), null,
				"registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsAppropriate_solveCsp_BWD__Match_TypeGraph(), theCspPackage.getCSP(),
				"isAppropriate_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsAppropriate_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsApplicable_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject(), null,
				"registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "model2PM", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__CheckTypes_BWD__Match(), ecorePackage.getEBoolean(), "checkTypes_BWD",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsAppropriate_BWD_TypeGraph_9__TypeGraph(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_BWD_TypeGraph_9", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsAppropriate_FWD_Model_2__Model(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_FWD_Model_2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__CheckAttributes_FWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__CheckAttributes_BWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsApplicable_CC__Match_Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsApplicable_solveCsp_CC__Model_TypeGraph_Match_Match(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__IsApplicable_checkCsp_CC__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__CheckDEC_FWD__Model(), ecorePackage.getEBoolean(), "checkDEC_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUMLPackage.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__CheckDEC_BWD__TypeGraph(), ecorePackage.getEBoolean(), "checkDEC_BWD",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTypeGraph(), "pm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__GenerateModel__RuleEntryContainer(),
				theRuntimePackage.getModelgeneratorRuleResult(), "generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(), "ruleEntryContainer", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getModel2TypeGraph__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getModelgeneratorRuleResult(), "ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModel2TypeGraph__GenerateModel_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"generateModel_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //RulesPackageImpl
