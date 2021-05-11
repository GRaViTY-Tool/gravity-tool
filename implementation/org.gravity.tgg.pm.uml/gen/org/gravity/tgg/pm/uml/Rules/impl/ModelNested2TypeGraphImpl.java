/**
 */
package org.gravity.tgg.pm.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.gravity.tgg.pm.uml.Model2TypeGraph;
import org.gravity.tgg.pm.uml.UmlFactory;
import org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph;
import org.gravity.tgg.pm.uml.Rules.RulesPackage;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
// <-- [user defined imports]
import org.moflon.tgg.csp.CSPFactoryHelper;
import org.moflon.tgg.csp.constraints.Eq;
import org.moflon.tgg.language.csp.CSP;
import org.moflon.tgg.language.csp.CspFactory;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;
import org.moflon.tgg.language.modelgenerator.RuleEntryList;
import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;
import org.moflon.tgg.runtime.impl.AbstractRuleImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Nested2 Type Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ModelNested2TypeGraphImpl extends AbstractRuleImpl implements ModelNested2TypeGraph {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelNested2TypeGraphImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.MODEL_NESTED2_TYPE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAppropriate_FWD(final Match match, final Model outerModel, final Model model) {

		final Object[] result1_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_0_1_initialbindings_blackBBBB(this, match, outerModel, model);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[outerModel] = " + outerModel + ", " + "[model] = " + model + ".");
		}

		final Object[] result2_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, outerModel, model);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[outerModel] = " + outerModel + ", " + "[model] = " + model + ".");
		}
		final CSP csp = (CSP) result2_bindingAndBlack[0];
		//
		if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_3_CheckCSP_expressionFBB(this, csp)) {

			final Object[] result4_black = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_0_4_collectelementstobetranslated_blackBBB(match, outerModel, model);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[outerModel] = " + outerModel + ", " + "[model] = " + model + ".");
			}
			ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_4_collectelementstobetranslated_greenBBBFF(match,
					outerModel, model);
			//nothing EMoflonEdge outerModel__model____nestedPackage = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge model__outerModel____nestingPackage = (EMoflonEdge) result4_green[4];

			final Object[] result5_black = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_0_5_collectcontextelements_blackBBB(match, outerModel, model);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[outerModel] = " + outerModel + ", " + "[model] = " + model + ".");
			}
			ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_5_collectcontextelements_greenBB(match,
					outerModel);

			//
			ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_6_registerobjectstomatch_expressionBBBB(this,
					match, outerModel, model);
			return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_7_expressionF();
		} else {
			return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformRuleResult perform_FWD(final IsApplicableMatch isApplicableMatch) {

		final Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_1_performtransformation_bindingAndBlackFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		final Model2TypeGraph outerModel2PM = (Model2TypeGraph) result1_bindingAndBlack[0];
		final Model outerModel = (Model) result1_bindingAndBlack[1];
		final Model model = (Model) result1_bindingAndBlack[2];
		final CSP csp = (CSP) result1_bindingAndBlack[3];
		final Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_1_performtransformation_greenFFBB(model, csp);
		final Model2TypeGraph model2PM = (Model2TypeGraph) result1_green[0];
		final TypeGraph pm = (TypeGraph) result1_green[1];

		final Object[] result2_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_2_collecttranslatedelements_blackBBB(model2PM, pm, model);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model2PM] = " + model2PM + ", "
					+ "[pm] = " + pm + ", " + "[model] = " + model + ".");
		}
		final Object[] result2_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_2_collecttranslatedelements_greenFBBB(model2PM, pm, model);
		final PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		final Object[] result3_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_3_bookkeepingforedges_blackBBBBBB(ruleresult, model2PM, outerModel2PM,
						outerModel, pm, model);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model2PM] = " + model2PM + ", " + "[outerModel2PM] = " + outerModel2PM + ", "
					+ "[outerModel] = " + outerModel + ", " + "[pm] = " + pm + ", " + "[model] = " + model + ".");
		}
		ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				model2PM, outerModel, pm, model);
		//nothing EMoflonEdge model2PM__pm____target = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge outerModel__model____nestedPackage = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge model__outerModel____nestingPackage = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge model2PM__model____source = (EMoflonEdge) result3_green[8];

		//
		//
		ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_1_5_registerobjects_expressionBBBBBBB(this, ruleresult,
				model2PM, outerModel2PM, outerModel, pm, model);
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsApplicableRuleResult isApplicable_FWD(final Match match) {

		final Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		final Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_greenBF(performOperation);
		final IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach
		final Object[] result2_binding = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		final Model outerModel = (Model) result2_binding[0];
		final Model model = (Model) result2_binding[1];
		for (final Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_2_2_corematch_blackFBBB(outerModel, model, match)) {
			final Model2TypeGraph outerModel2PM = (Model2TypeGraph) result2_black[0];
			// ForEach
			for (final Object[] result3_black : ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_2_3_findcontext_blackBBB(outerModel2PM, outerModel, model)) {
				final Object[] result3_green = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_2_3_findcontext_greenBBBFFFF(outerModel2PM, outerModel, model);
				final IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[3];
				//nothing EMoflonEdge outerModel2PM__outerModel____source = (EMoflonEdge) result3_green[4];
				//nothing EMoflonEdge outerModel__model____nestedPackage = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge model__outerModel____nestingPackage = (EMoflonEdge) result3_green[6];

				final Object[] result4_bindingAndBlack = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_2_4_solveCSP_bindingAndBlackFBBBBB(this, isApplicableMatch,
								outerModel2PM, outerModel, model);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[outerModel2PM] = " + outerModel2PM
							+ ", " + "[outerModel] = " + outerModel + ", " + "[model] = " + model + ".");
				}
				final CSP csp = (CSP) result4_bindingAndBlack[0];
				//
				if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_2_5_checkCSP_expressionFBB(this, csp)) {

					final Object[] result6_black = ModelNested2TypeGraphImpl
							.pattern_ModelNested2TypeGraph_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void registerObjectsToMatch_FWD(final Match match, final Model outerModel, final Model model) {
		match.registerObject("outerModel", outerModel);
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSP isAppropriate_solveCsp_FWD(final Match match, final Model outerModel, final Model model) {// Create CSP
		final CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAppropriate_checkCsp_FWD(final CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSP isApplicable_solveCsp_FWD(final IsApplicableMatch isApplicableMatch, final Model2TypeGraph outerModel2PM,
			final Model outerModel, final Model model) {// Create CSP
		final CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		final Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model.name", true, csp);
		var_model_name.setValue(model.getName());
		var_model_name.setType("String");

		// Create unbound variables
		final Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm.tName", csp);
		var_pm_tName.setType("String");

		// Create constraints
		final Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_model_name, var_pm_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("outerModel2PM", outerModel2PM);
		isApplicableMatch.registerObject("outerModel", outerModel);
		isApplicableMatch.registerObject("model", model);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isApplicable_checkCsp_FWD(final CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void registerObjects_FWD(final PerformRuleResult ruleresult, final EObject model2PM, final EObject outerModel2PM,
			final EObject outerModel, final EObject pm, final EObject model) {
		ruleresult.registerObject("model2PM", model2PM);
		ruleresult.registerObject("outerModel2PM", outerModel2PM);
		ruleresult.registerObject("outerModel", outerModel);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkTypes_FWD(final Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("model").eClass()).equals("uml.Model.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAppropriate_BWD(final Match match, final TypeGraph pm) {

		final Object[] result1_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_10_1_initialbindings_blackBBB(this, match, pm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ".");
		}

		final Object[] result2_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_10_2_SolveCSP_bindingAndBlackFBBB(this, match, pm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ".");
		}
		final CSP csp = (CSP) result2_bindingAndBlack[0];
		//
		if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_10_3_CheckCSP_expressionFBB(this, csp)) {

			final Object[] result4_black = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_10_4_collectelementstobetranslated_blackBB(match, pm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pm] = " + pm + ".");
			}
			ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_10_4_collectelementstobetranslated_greenBB(match,
					pm);

			final Object[] result5_black = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_10_5_collectcontextelements_blackBB(match, pm);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pm] = " + pm + ".");
			}
			//
			ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_10_6_registerobjectstomatch_expressionBBB(this,
					match, pm);
			return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_10_7_expressionF();
		} else {
			return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformRuleResult perform_BWD(final IsApplicableMatch isApplicableMatch) {

		final Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_1_performtransformation_bindingAndBlackFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		final Model2TypeGraph outerModel2PM = (Model2TypeGraph) result1_bindingAndBlack[0];
		final Model outerModel = (Model) result1_bindingAndBlack[1];
		final TypeGraph pm = (TypeGraph) result1_bindingAndBlack[2];
		final CSP csp = (CSP) result1_bindingAndBlack[3];
		final Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_1_performtransformation_greenFBBFB(outerModel, pm, csp);
		final Model2TypeGraph model2PM = (Model2TypeGraph) result1_green[0];
		final Model model = (Model) result1_green[3];

		final Object[] result2_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_2_collecttranslatedelements_blackBBB(model2PM, pm, model);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model2PM] = " + model2PM + ", "
					+ "[pm] = " + pm + ", " + "[model] = " + model + ".");
		}
		final Object[] result2_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_2_collecttranslatedelements_greenFBBB(model2PM, pm, model);
		final PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		final Object[] result3_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_3_bookkeepingforedges_blackBBBBBB(ruleresult, model2PM, outerModel2PM,
						outerModel, pm, model);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model2PM] = " + model2PM + ", " + "[outerModel2PM] = " + outerModel2PM + ", "
					+ "[outerModel] = " + outerModel + ", " + "[pm] = " + pm + ", " + "[model] = " + model + ".");
		}
		ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				model2PM, outerModel, pm, model);
		//nothing EMoflonEdge model2PM__pm____target = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge outerModel__model____nestedPackage = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge model__outerModel____nestingPackage = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge model2PM__model____source = (EMoflonEdge) result3_green[8];

		//
		//
		ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_11_5_registerobjects_expressionBBBBBBB(this, ruleresult,
				model2PM, outerModel2PM, outerModel, pm, model);
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsApplicableRuleResult isApplicable_BWD(final Match match) {

		final Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		final Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_greenBF(performOperation);
		final IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach
		final Object[] result2_binding = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		final TypeGraph pm = (TypeGraph) result2_binding[0];
		for (final Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_12_2_corematch_blackFFBB(pm, match)) {
			final Model2TypeGraph outerModel2PM = (Model2TypeGraph) result2_black[0];
			final Model outerModel = (Model) result2_black[1];
			// ForEach
			for (final Object[] result3_black : ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_12_3_findcontext_blackBBB(outerModel2PM, outerModel, pm)) {
				final Object[] result3_green = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_12_3_findcontext_greenBBBFFF(outerModel2PM, outerModel, pm);
				final IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[3];
				//nothing EMoflonEdge outerModel2PM__outerModel____source = (EMoflonEdge) result3_green[4];
				//nothing EMoflonEdge outerModel2PM__pm____target = (EMoflonEdge) result3_green[5];

				final Object[] result4_bindingAndBlack = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_12_4_solveCSP_bindingAndBlackFBBBBB(this, isApplicableMatch,
								outerModel2PM, outerModel, pm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[outerModel2PM] = " + outerModel2PM
							+ ", " + "[outerModel] = " + outerModel + ", " + "[pm] = " + pm + ".");
				}
				final CSP csp = (CSP) result4_bindingAndBlack[0];
				//
				if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_12_5_checkCSP_expressionFBB(this, csp)) {

					final Object[] result6_black = ModelNested2TypeGraphImpl
							.pattern_ModelNested2TypeGraph_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void registerObjectsToMatch_BWD(final Match match, final TypeGraph pm) {
		match.registerObject("pm", pm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSP isAppropriate_solveCsp_BWD(final Match match, final TypeGraph pm) {// Create CSP
		final CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAppropriate_checkCsp_BWD(final CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSP isApplicable_solveCsp_BWD(final IsApplicableMatch isApplicableMatch, final Model2TypeGraph outerModel2PM,
			final Model outerModel, final TypeGraph pm) {// Create CSP
		final CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		final Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm.tName", true, csp);
		var_pm_tName.setValue(pm.getTName());
		var_pm_tName.setType("String");

		// Create unbound variables
		final Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model.name", csp);
		var_model_name.setType("String");

		// Create constraints
		final Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_model_name, var_pm_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("outerModel2PM", outerModel2PM);
		isApplicableMatch.registerObject("outerModel", outerModel);
		isApplicableMatch.registerObject("pm", pm);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isApplicable_checkCsp_BWD(final CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void registerObjects_BWD(final PerformRuleResult ruleresult, final EObject model2PM, final EObject outerModel2PM,
			final EObject outerModel, final EObject pm, final EObject model) {
		ruleresult.registerObject("model2PM", model2PM);
		ruleresult.registerObject("outerModel2PM", outerModel2PM);
		ruleresult.registerObject("outerModel", outerModel);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkTypes_BWD(final Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("pm").eClass()).equals("basic.TypeGraph.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObjectContainer isAppropriate_BWD_TypeGraph_5(final TypeGraph pm) {

		final Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		final EClass __eClass = (EClass) result1_bindingAndBlack[1];
		final EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		final Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_greenF();
		final EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach
		for (final Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_20_2_testcorematchandDECs_blackB(pm)) {
			final Object[] result2_green = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_20_2_testcorematchandDECs_greenFB(__eClass);
			final Match match = (Match) result2_green[0];

			//
			if (ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, pm)) {
				//
				if (ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					final Object[] result5_black = ModelNested2TypeGraphImpl
							.pattern_ModelNested2TypeGraph_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_154(final EMoflonEdge _edge_nestedPackage) {

		final Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		final EClass __eClass = (EClass) result1_bindingAndBlack[1];
		final EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		final Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_greenF();
		final EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach
		for (final Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_21_2_testcorematchandDECs_blackFFB(_edge_nestedPackage)) {
			final Model outerModel = (Model) result2_black[0];
			final Model model = (Model) result2_black[1];
			final Object[] result2_green = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_21_2_testcorematchandDECs_greenFB(__eClass);
			final Match match = (Match) result2_green[0];

			//
			if (ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, outerModel, model)) {
				//
				if (ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					final Object[] result5_black = ModelNested2TypeGraphImpl
							.pattern_ModelNested2TypeGraph_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeConstraintsRuleResult checkAttributes_FWD(final TripleMatch __tripleMatch) {
		final AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ModelNested2TypeGraph");
		ruleResult.setSuccess(true);

		final CSP csp = CspFactory.eINSTANCE.createCSP();

		final CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		final Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model", true, csp);
		var_model_name.setValue(__helper.getValue("model", "name"));
		var_model_name.setType("String");

		final Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm", true, csp);
		var_pm_tName.setValue(__helper.getValue("pm", "tName"));
		var_pm_tName.setType("String");

		final Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ModelNested2TypeGraph");
		eq0.solve(var_model_name, var_pm_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_pm_tName.setBound(false);
			eq0.solve(var_model_name, var_pm_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("pm", "tName", var_pm_tName.getValue());
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeConstraintsRuleResult checkAttributes_BWD(final TripleMatch __tripleMatch) {
		final AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ModelNested2TypeGraph");
		ruleResult.setSuccess(true);

		final CSP csp = CspFactory.eINSTANCE.createCSP();

		final CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		final Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model", true, csp);
		var_model_name.setValue(__helper.getValue("model", "name"));
		var_model_name.setType("String");

		final Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm", true, csp);
		var_pm_tName.setValue(__helper.getValue("pm", "tName"));
		var_pm_tName.setType("String");

		final Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ModelNested2TypeGraph");
		eq0.solve(var_model_name, var_pm_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_model_name.setBound(false);
			eq0.solve(var_model_name, var_pm_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("model", "name", var_model_name.getValue());
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsApplicableRuleResult isApplicable_CC(final Match sourceMatch, final Match targetMatch) {

		final Object[] result1_black = ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final Object[] result1_green = ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_1_prepare_greenF();
		final IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		final Object[] result2_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		final Model outerModel = (Model) result2_bindingAndBlack[0];
		final TypeGraph pm = (TypeGraph) result2_bindingAndBlack[1];
		final Model model = (Model) result2_bindingAndBlack[2];

		final Object[] result3_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_24_3_solvecsp_bindingAndBlackFBBBBBB(this, outerModel, pm, model,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[outerModel] = " + outerModel + ", " + "[pm] = " + pm + ", " + "[model] = " + model + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		final CSP csp = (CSP) result3_bindingAndBlack[0];
		//
		if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_4_checkCSP_expressionFB(csp)) {
			// ForEach
			for (final Object[] result5_black : ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_24_5_matchcorrcontext_blackFBBBB(outerModel, pm, sourceMatch,
							targetMatch)) {
				final Model2TypeGraph outerModel2PM = (Model2TypeGraph) result5_black[0];
				final Object[] result5_green = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_24_5_matchcorrcontext_greenBBBF(outerModel2PM, sourceMatch,
								targetMatch);
				final CCMatch ccMatch = (CCMatch) result5_green[3];

				final Object[] result6_black = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_24_6_createcorrespondence_blackBBBB(outerModel, pm, model,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[outerModel] = "
							+ outerModel + ", " + "[pm] = " + pm + ", " + "[model] = " + model + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_6_createcorrespondence_greenFBBB(pm, model,
						ccMatch);
				//nothing Model2TypeGraph model2PM = (Model2TypeGraph) result6_green[0];

				final Object[] result7_black = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSP isApplicable_solveCsp_CC(final Model outerModel, final TypeGraph pm, final Model model, final Match sourceMatch,
			final Match targetMatch) {// Create CSP
		final CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		final Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model.name", true, csp);
		var_model_name.setValue(model.getName());
		var_model_name.setType("String");
		final Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm.tName", true, csp);
		var_pm_tName.setValue(pm.getTName());
		var_pm_tName.setType("String");

		// Create unbound variables

		// Create constraints
		final Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_model_name, var_pm_tName);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isApplicable_checkCsp_CC(final CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkDEC_FWD(final Model outerModel, final Model model) {//
		final Object[] result1_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_27_1_matchtggpattern_blackBB(outerModel, model);
		if (result1_black != null) {
			return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_27_2_expressionF();
		} else {
			return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkDEC_BWD(final TypeGraph pm) {//
		final Object[] result1_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_28_1_matchtggpattern_blackB(pm);
		if (result1_black != null) {
			return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_28_2_expressionF();
		} else {
			return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelgeneratorRuleResult generateModel(final RuleEntryContainer ruleEntryContainer,
			final Model2TypeGraph outerModel2PMParameter) {

		final Object[] result1_black = ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final Object[] result1_green = ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_29_1_createresult_greenFF();
		final IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		final ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach
		for (final Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_29_2_isapplicablecore_blackFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList outerModel2PMList = (RuleEntryList) result2_black[0];
			final Model2TypeGraph outerModel2PM = (Model2TypeGraph) result2_black[1];
			final Model outerModel = (Model) result2_black[2];

			final Object[] result3_bindingAndBlack = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_29_3_solveCSP_bindingAndBlackFBBBBB(this, isApplicableMatch,
							outerModel2PM, outerModel, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[outerModel2PM] = " + outerModel2PM
						+ ", " + "[outerModel] = " + outerModel + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			final CSP csp = (CSP) result3_bindingAndBlack[0];
			//
			if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_29_4_checkCSP_expressionFBB(this, csp)) {
				//
				final Object[] result5_black = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_29_5_checknacs_blackBB(outerModel2PM, outerModel);
				if (result5_black != null) {

					final Object[] result6_black = ModelNested2TypeGraphImpl
							.pattern_ModelNested2TypeGraph_29_6_perform_blackBBB(outerModel2PM, outerModel, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[outerModel2PM] = "
								+ outerModel2PM + ", " + "[outerModel] = " + outerModel + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_29_6_perform_greenFBFFBB(outerModel,
							ruleResult, csp);
					//nothing Model2TypeGraph model2PM = (Model2TypeGraph) result6_green[0];
					//nothing TypeGraph pm = (TypeGraph) result6_green[2];
					//nothing Model model = (Model) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSP generateModel_solveCsp_BWD(final IsApplicableMatch isApplicableMatch, final Model2TypeGraph outerModel2PM,
			final Model outerModel, final ModelgeneratorRuleResult ruleResult) {// Create CSP
		final CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		final Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model.name", csp);
		var_model_name.setType("String");
		final Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm.tName", csp);
		var_pm_tName.setType("String");

		// Create constraints
		final Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_model_name, var_pm_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("outerModel2PM", outerModel2PM);
		isApplicableMatch.registerObject("outerModel", outerModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean generateModel_checkCsp_BWD(final CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_FWD__MATCH_MODEL_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1), (Model) arguments.get(2));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1), (Model) arguments.get(2));
			return null;
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL2TYPEGRAPH_MODEL_MODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model2TypeGraph) arguments.get(1),
					(Model) arguments.get(2), (Model) arguments.get(3));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5));
			return null;
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1));
			return null;
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL2TYPEGRAPH_MODEL_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model2TypeGraph) arguments.get(1),
					(Model) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5));
			return null;
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_BWD_TYPE_GRAPH_5__TYPEGRAPH:
			return isAppropriate_BWD_TypeGraph_5((TypeGraph) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_154__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_154((EMoflonEdge) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_TYPEGRAPH_MODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (TypeGraph) arguments.get(1),
					(Model) arguments.get(2), (Match) arguments.get(3), (Match) arguments.get(4));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___CHECK_DEC_FWD__MODEL_MODEL:
			return checkDEC_FWD((Model) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___CHECK_DEC_BWD__TYPEGRAPH:
			return checkDEC_BWD((TypeGraph) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL__RULEENTRYCONTAINER_MODEL2TYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (Model2TypeGraph) arguments.get(1));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL2TYPEGRAPH_MODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model2TypeGraph) arguments.get(1),
					(Model) arguments.get(2), (ModelgeneratorRuleResult) arguments.get(3));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_1_initialbindings_blackBBBB(
			final ModelNested2TypeGraph _this, final Match match, final Model outerModel, final Model model) {
		if (!model.equals(outerModel)) {
			return new Object[] { _this, match, outerModel, model };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_2_SolveCSP_bindingFBBBB(final ModelNested2TypeGraph _this,
			final Match match, final Model outerModel, final Model model) {
		final CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, outerModel, model);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, outerModel, model };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_2_SolveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_2_SolveCSP_bindingAndBlackFBBBB(
			final ModelNested2TypeGraph _this, final Match match, final Model outerModel, final Model model) {
		final Object[] result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_binding = pattern_ModelNested2TypeGraph_0_2_SolveCSP_bindingFBBBB(
				_this, match, outerModel, model);
		if (result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_black = pattern_ModelNested2TypeGraph_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, outerModel, model };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_0_3_CheckCSP_expressionFBB(final ModelNested2TypeGraph _this,
			final CSP csp) {
		final boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_4_collectelementstobetranslated_blackBBB(final Match match,
			final Model outerModel, final Model model) {
		if (!model.equals(outerModel)) {
			return new Object[] { match, outerModel, model };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_4_collectelementstobetranslated_greenBBBFF(final Match match,
			final Model outerModel, final Model model) {
		final EMoflonEdge outerModel__model____nestedPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge model__outerModel____nestingPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(model);
		final String outerModel__model____nestedPackage_name_prime = "nestedPackage";
		final String model__outerModel____nestingPackage_name_prime = "nestingPackage";
		outerModel__model____nestedPackage.setSrc(outerModel);
		outerModel__model____nestedPackage.setTrg(model);
		match.getToBeTranslatedEdges().add(outerModel__model____nestedPackage);
		model__outerModel____nestingPackage.setSrc(model);
		model__outerModel____nestingPackage.setTrg(outerModel);
		match.getToBeTranslatedEdges().add(model__outerModel____nestingPackage);
		outerModel__model____nestedPackage.setName(outerModel__model____nestedPackage_name_prime);
		model__outerModel____nestingPackage.setName(model__outerModel____nestingPackage_name_prime);
		return new Object[] { match, outerModel, model, outerModel__model____nestedPackage,
				model__outerModel____nestingPackage };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_5_collectcontextelements_blackBBB(final Match match,
			final Model outerModel, final Model model) {
		if (!model.equals(outerModel)) {
			return new Object[] { match, outerModel, model };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_5_collectcontextelements_greenBB(final Match match,
			final Model outerModel) {
		match.getContextNodes().add(outerModel);
		return new Object[] { match, outerModel };
	}

	public static final void pattern_ModelNested2TypeGraph_0_6_registerobjectstomatch_expressionBBBB(
			final ModelNested2TypeGraph _this, final Match match, final Model outerModel, final Model model) {
		_this.registerObjectsToMatch_FWD(match, outerModel, model);

	}

	public static final boolean pattern_ModelNested2TypeGraph_0_7_expressionF() {
		final boolean _result = true;
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_0_8_expressionF() {
		final boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_1_performtransformation_bindingFFFB(
			final IsApplicableMatch isApplicableMatch) {
		final EObject _localVariable_0 = isApplicableMatch.getObject("outerModel2PM");
		final EObject _localVariable_1 = isApplicableMatch.getObject("outerModel");
		final EObject _localVariable_2 = isApplicableMatch.getObject("model");
		final EObject tmpOuterModel2PM = _localVariable_0;
		final EObject tmpOuterModel = _localVariable_1;
		final EObject tmpModel = _localVariable_2;
		if (tmpOuterModel2PM instanceof Model2TypeGraph) {
			final Model2TypeGraph outerModel2PM = (Model2TypeGraph) tmpOuterModel2PM;
			if (tmpOuterModel instanceof Model) {
				final Model outerModel = (Model) tmpOuterModel;
				if (tmpModel instanceof Model) {
					final Model model = (Model) tmpModel;
					return new Object[] { outerModel2PM, outerModel, model, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_1_performtransformation_blackBBBFBB(
			final Model2TypeGraph outerModel2PM, final Model outerModel, final Model model, final ModelNested2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch) {
		if (!model.equals(outerModel)) {
			for (final EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					final CSP csp = (CSP) tmpCsp;
					return new Object[] { outerModel2PM, outerModel, model, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_1_performtransformation_bindingAndBlackFFFFBB(
			final ModelNested2TypeGraph _this, final IsApplicableMatch isApplicableMatch) {
		final Object[] result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding = pattern_ModelNested2TypeGraph_1_1_performtransformation_bindingFFFB(
				isApplicableMatch);
		if (result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding != null) {
			final Model2TypeGraph outerModel2PM = (Model2TypeGraph) result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding[0];
			final Model outerModel = (Model) result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding[1];
			final Model model = (Model) result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding[2];

			final Object[] result_pattern_ModelNested2TypeGraph_1_1_performtransformation_black = pattern_ModelNested2TypeGraph_1_1_performtransformation_blackBBBFBB(
					outerModel2PM, outerModel, model, _this, isApplicableMatch);
			if (result_pattern_ModelNested2TypeGraph_1_1_performtransformation_black != null) {
				final CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_1_1_performtransformation_black[3];

				return new Object[] { outerModel2PM, outerModel, model, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_1_performtransformation_greenFFBB(final Model model,
			final CSP csp) {
		final Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		final TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		final Object _localVariable_0 = csp.getValue("pm", "tName");
		model2PM.setSource(model);
		model2PM.setTarget(pm);
		final String pm_tName_prime = (String) _localVariable_0;
		pm.setTName(pm_tName_prime);
		return new Object[] { model2PM, pm, model, csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_2_collecttranslatedelements_blackBBB(
			final Model2TypeGraph model2PM, final TypeGraph pm, final Model model) {
		return new Object[] { model2PM, pm, model };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_2_collecttranslatedelements_greenFBBB(
			final Model2TypeGraph model2PM, final TypeGraph pm, final Model model) {
		final PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(model2PM);
		ruleresult.getCreatedElements().add(pm);
		ruleresult.getTranslatedElements().add(model);
		return new Object[] { ruleresult, model2PM, pm, model };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_3_bookkeepingforedges_blackBBBBBB(
			final PerformRuleResult ruleresult, final EObject model2PM, final EObject outerModel2PM, final EObject outerModel, final EObject pm,
			final EObject model) {
		if (!model2PM.equals(outerModel2PM) && !model2PM.equals(outerModel)) {
			if (!model2PM.equals(pm)) {
				if (!outerModel2PM.equals(pm)) {
					if (!outerModel.equals(outerModel2PM)) {
						if (!outerModel.equals(pm)) {
							if (!model.equals(model2PM)) {
								if (!model.equals(outerModel2PM)) {
									if (!model.equals(outerModel)) {
										if (!model.equals(pm)) {
											return new Object[] { ruleresult, model2PM, outerModel2PM, outerModel,
													pm, model };
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_3_bookkeepingforedges_greenBBBBBFFFF(
			final PerformRuleResult ruleresult, final EObject model2PM, final EObject outerModel, final EObject pm, final EObject model) {
		final EMoflonEdge model2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge outerModel__model____nestedPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge model__outerModel____nestingPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge model2PM__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final String ruleresult_ruleName_prime = "ModelNested2TypeGraph";
		final String model2PM__pm____target_name_prime = "target";
		final String outerModel__model____nestedPackage_name_prime = "nestedPackage";
		final String model__outerModel____nestingPackage_name_prime = "nestingPackage";
		final String model2PM__model____source_name_prime = "source";
		model2PM__pm____target.setSrc(model2PM);
		model2PM__pm____target.setTrg(pm);
		ruleresult.getCreatedEdges().add(model2PM__pm____target);
		outerModel__model____nestedPackage.setSrc(outerModel);
		outerModel__model____nestedPackage.setTrg(model);
		ruleresult.getTranslatedEdges().add(outerModel__model____nestedPackage);
		model__outerModel____nestingPackage.setSrc(model);
		model__outerModel____nestingPackage.setTrg(outerModel);
		ruleresult.getTranslatedEdges().add(model__outerModel____nestingPackage);
		model2PM__model____source.setSrc(model2PM);
		model2PM__model____source.setTrg(model);
		ruleresult.getCreatedEdges().add(model2PM__model____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model2PM__pm____target.setName(model2PM__pm____target_name_prime);
		outerModel__model____nestedPackage.setName(outerModel__model____nestedPackage_name_prime);
		model__outerModel____nestingPackage.setName(model__outerModel____nestingPackage_name_prime);
		model2PM__model____source.setName(model2PM__model____source_name_prime);
		return new Object[] { ruleresult, model2PM, outerModel, pm, model, model2PM__pm____target,
				outerModel__model____nestedPackage, model__outerModel____nestingPackage, model2PM__model____source };
	}

	public static final void pattern_ModelNested2TypeGraph_1_5_registerobjects_expressionBBBBBBB(
			final ModelNested2TypeGraph _this, final PerformRuleResult ruleresult, final EObject model2PM, final EObject outerModel2PM,
			final EObject outerModel, final EObject pm, final EObject model) {
		_this.registerObjects_FWD(ruleresult, model2PM, outerModel2PM, outerModel, pm, model);

	}

	public static final PerformRuleResult pattern_ModelNested2TypeGraph_1_6_expressionFB(final PerformRuleResult ruleresult) {
		final PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_bindingFB(
			final ModelNested2TypeGraph _this) {
		final EClass _localVariable_0 = _this.eClass();
		final EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_blackFBB(final EClass eClass,
			final ModelNested2TypeGraph _this) {
		for (final EOperation performOperation : eClass.getEOperations()) {
			final String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_bindingAndBlackFFB(
			final ModelNested2TypeGraph _this) {
		final Object[] result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_binding = pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_binding != null) {
			final EClass eClass = (EClass) result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_black = pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_black != null) {
				final EOperation performOperation = (EOperation) result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_greenBF(
			final EOperation performOperation) {
		final IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		final boolean ruleresult_success_prime = false;
		final String ruleresult_rule_prime = "ModelNested2TypeGraph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(ruleresult_success_prime);
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_2_corematch_bindingFFB(final Match match) {
		final EObject _localVariable_0 = match.getObject("outerModel");
		final EObject _localVariable_1 = match.getObject("model");
		final EObject tmpOuterModel = _localVariable_0;
		final EObject tmpModel = _localVariable_1;
		if (tmpOuterModel instanceof Model) {
			final Model outerModel = (Model) tmpOuterModel;
			if (tmpModel instanceof Model) {
				final Model model = (Model) tmpModel;
				return new Object[] { outerModel, model, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_2_2_corematch_blackFBBB(final Model outerModel,
			final Model model, final Match match) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		if (!model.equals(outerModel)) {
			for (final Model2TypeGraph outerModel2PM : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outerModel, Model2TypeGraph.class, "source")) {
				_result.add(new Object[] { outerModel2PM, outerModel, model, match });
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_2_3_findcontext_blackBBB(
			final Model2TypeGraph outerModel2PM, final Model outerModel, final Model model) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		if (!model.equals(outerModel) && outerModel.equals(outerModel2PM.getSource())) {
			if (outerModel.getNestedPackages().contains(model)) {
				_result.add(new Object[] { outerModel2PM, outerModel, model });
			}
		}
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_3_findcontext_greenBBBFFFF(
			final Model2TypeGraph outerModel2PM, final Model outerModel, final Model model) {
		final IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		final EMoflonEdge outerModel2PM__outerModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge outerModel__model____nestedPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge model__outerModel____nestingPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final String outerModel2PM__outerModel____source_name_prime = "source";
		final String outerModel__model____nestedPackage_name_prime = "nestedPackage";
		final String model__outerModel____nestingPackage_name_prime = "nestingPackage";
		isApplicableMatch.getAllContextElements().add(outerModel2PM);
		isApplicableMatch.getAllContextElements().add(outerModel);
		isApplicableMatch.getAllContextElements().add(model);
		outerModel2PM__outerModel____source.setSrc(outerModel2PM);
		outerModel2PM__outerModel____source.setTrg(outerModel);
		isApplicableMatch.getAllContextElements().add(outerModel2PM__outerModel____source);
		outerModel__model____nestedPackage.setSrc(outerModel);
		outerModel__model____nestedPackage.setTrg(model);
		isApplicableMatch.getAllContextElements().add(outerModel__model____nestedPackage);
		model__outerModel____nestingPackage.setSrc(model);
		model__outerModel____nestingPackage.setTrg(outerModel);
		isApplicableMatch.getAllContextElements().add(model__outerModel____nestingPackage);
		outerModel2PM__outerModel____source.setName(outerModel2PM__outerModel____source_name_prime);
		outerModel__model____nestedPackage.setName(outerModel__model____nestedPackage_name_prime);
		model__outerModel____nestingPackage.setName(model__outerModel____nestingPackage_name_prime);
		return new Object[] { outerModel2PM, outerModel, model, isApplicableMatch, outerModel2PM__outerModel____source,
				outerModel__model____nestedPackage, model__outerModel____nestingPackage };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_4_solveCSP_bindingFBBBBB(final ModelNested2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch, final Model2TypeGraph outerModel2PM, final Model outerModel, final Model model) {
		final CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, outerModel2PM, outerModel, model);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, model };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_4_solveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_4_solveCSP_bindingAndBlackFBBBBB(
			final ModelNested2TypeGraph _this, final IsApplicableMatch isApplicableMatch, final Model2TypeGraph outerModel2PM,
			final Model outerModel, final Model model) {
		final Object[] result_pattern_ModelNested2TypeGraph_2_4_solveCSP_binding = pattern_ModelNested2TypeGraph_2_4_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, outerModel2PM, outerModel, model);
		if (result_pattern_ModelNested2TypeGraph_2_4_solveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_2_4_solveCSP_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_2_4_solveCSP_black = pattern_ModelNested2TypeGraph_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, model };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_2_5_checkCSP_expressionFBB(final ModelNested2TypeGraph _this,
			final CSP csp) {
		final boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_6_addmatchtoruleresult_blackBB(
			final IsApplicableRuleResult ruleresult, final IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_6_addmatchtoruleresult_greenBB(
			final IsApplicableRuleResult ruleresult, final IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		final boolean ruleresult_success_prime = true;
		final String isApplicableMatch_ruleName_prime = "ModelNested2TypeGraph";
		ruleresult.setSuccess(ruleresult_success_prime);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ModelNested2TypeGraph_2_7_expressionFB(
			final IsApplicableRuleResult ruleresult) {
		final IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_1_initialbindings_blackBBB(
			final ModelNested2TypeGraph _this, final Match match, final TypeGraph pm) {
		return new Object[] { _this, match, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_2_SolveCSP_bindingFBBB(final ModelNested2TypeGraph _this,
			final Match match, final TypeGraph pm) {
		final CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pm);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pm };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_2_SolveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_2_SolveCSP_bindingAndBlackFBBB(
			final ModelNested2TypeGraph _this, final Match match, final TypeGraph pm) {
		final Object[] result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_binding = pattern_ModelNested2TypeGraph_10_2_SolveCSP_bindingFBBB(
				_this, match, pm);
		if (result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_black = pattern_ModelNested2TypeGraph_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_10_3_CheckCSP_expressionFBB(final ModelNested2TypeGraph _this,
			final CSP csp) {
		final boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_4_collectelementstobetranslated_blackBB(final Match match,
			final TypeGraph pm) {
		return new Object[] { match, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_4_collectelementstobetranslated_greenBB(final Match match,
			final TypeGraph pm) {
		match.getToBeTranslatedNodes().add(pm);
		return new Object[] { match, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_5_collectcontextelements_blackBB(final Match match,
			final TypeGraph pm) {
		return new Object[] { match, pm };
	}

	public static final void pattern_ModelNested2TypeGraph_10_6_registerobjectstomatch_expressionBBB(
			final ModelNested2TypeGraph _this, final Match match, final TypeGraph pm) {
		_this.registerObjectsToMatch_BWD(match, pm);

	}

	public static final boolean pattern_ModelNested2TypeGraph_10_7_expressionF() {
		final boolean _result = true;
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_10_8_expressionF() {
		final boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_1_performtransformation_bindingFFFB(
			final IsApplicableMatch isApplicableMatch) {
		final EObject _localVariable_0 = isApplicableMatch.getObject("outerModel2PM");
		final EObject _localVariable_1 = isApplicableMatch.getObject("outerModel");
		final EObject _localVariable_2 = isApplicableMatch.getObject("pm");
		final EObject tmpOuterModel2PM = _localVariable_0;
		final EObject tmpOuterModel = _localVariable_1;
		final EObject tmpPm = _localVariable_2;
		if (tmpOuterModel2PM instanceof Model2TypeGraph) {
			final Model2TypeGraph outerModel2PM = (Model2TypeGraph) tmpOuterModel2PM;
			if (tmpOuterModel instanceof Model) {
				final Model outerModel = (Model) tmpOuterModel;
				if (tmpPm instanceof TypeGraph) {
					final TypeGraph pm = (TypeGraph) tmpPm;
					return new Object[] { outerModel2PM, outerModel, pm, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_1_performtransformation_blackBBBFBB(
			final Model2TypeGraph outerModel2PM, final Model outerModel, final TypeGraph pm, final ModelNested2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch) {
		for (final EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				final CSP csp = (CSP) tmpCsp;
				return new Object[] { outerModel2PM, outerModel, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_1_performtransformation_bindingAndBlackFFFFBB(
			final ModelNested2TypeGraph _this, final IsApplicableMatch isApplicableMatch) {
		final Object[] result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding = pattern_ModelNested2TypeGraph_11_1_performtransformation_bindingFFFB(
				isApplicableMatch);
		if (result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding != null) {
			final Model2TypeGraph outerModel2PM = (Model2TypeGraph) result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding[0];
			final Model outerModel = (Model) result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding[1];
			final TypeGraph pm = (TypeGraph) result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding[2];

			final Object[] result_pattern_ModelNested2TypeGraph_11_1_performtransformation_black = pattern_ModelNested2TypeGraph_11_1_performtransformation_blackBBBFBB(
					outerModel2PM, outerModel, pm, _this, isApplicableMatch);
			if (result_pattern_ModelNested2TypeGraph_11_1_performtransformation_black != null) {
				final CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_11_1_performtransformation_black[3];

				return new Object[] { outerModel2PM, outerModel, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_1_performtransformation_greenFBBFB(final Model outerModel,
			final TypeGraph pm, final CSP csp) {
		final Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		final Model model = UMLFactory.eINSTANCE.createModel();
		final Object _localVariable_0 = csp.getValue("model", "name");
		model2PM.setTarget(pm);
		outerModel.getNestedPackages().add(model);
		model2PM.setSource(model);
		final String model_name_prime = (String) _localVariable_0;
		model.setName(model_name_prime);
		return new Object[] { model2PM, outerModel, pm, model, csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_2_collecttranslatedelements_blackBBB(
			final Model2TypeGraph model2PM, final TypeGraph pm, final Model model) {
		return new Object[] { model2PM, pm, model };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_2_collecttranslatedelements_greenFBBB(
			final Model2TypeGraph model2PM, final TypeGraph pm, final Model model) {
		final PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(model2PM);
		ruleresult.getTranslatedElements().add(pm);
		ruleresult.getCreatedElements().add(model);
		return new Object[] { ruleresult, model2PM, pm, model };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_3_bookkeepingforedges_blackBBBBBB(
			final PerformRuleResult ruleresult, final EObject model2PM, final EObject outerModel2PM, final EObject outerModel, final EObject pm,
			final EObject model) {
		if (!model2PM.equals(outerModel2PM) && !model2PM.equals(outerModel)) {
			if (!model2PM.equals(pm)) {
				if (!outerModel2PM.equals(pm)) {
					if (!outerModel.equals(outerModel2PM)) {
						if (!outerModel.equals(pm)) {
							if (!model.equals(model2PM)) {
								if (!model.equals(outerModel2PM)) {
									if (!model.equals(outerModel)) {
										if (!model.equals(pm)) {
											return new Object[] { ruleresult, model2PM, outerModel2PM, outerModel,
													pm, model };
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_3_bookkeepingforedges_greenBBBBBFFFF(
			final PerformRuleResult ruleresult, final EObject model2PM, final EObject outerModel, final EObject pm, final EObject model) {
		final EMoflonEdge model2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge outerModel__model____nestedPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge model__outerModel____nestingPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge model2PM__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final String ruleresult_ruleName_prime = "ModelNested2TypeGraph";
		final String model2PM__pm____target_name_prime = "target";
		final String outerModel__model____nestedPackage_name_prime = "nestedPackage";
		final String model__outerModel____nestingPackage_name_prime = "nestingPackage";
		final String model2PM__model____source_name_prime = "source";
		model2PM__pm____target.setSrc(model2PM);
		model2PM__pm____target.setTrg(pm);
		ruleresult.getCreatedEdges().add(model2PM__pm____target);
		outerModel__model____nestedPackage.setSrc(outerModel);
		outerModel__model____nestedPackage.setTrg(model);
		ruleresult.getCreatedEdges().add(outerModel__model____nestedPackage);
		model__outerModel____nestingPackage.setSrc(model);
		model__outerModel____nestingPackage.setTrg(outerModel);
		ruleresult.getCreatedEdges().add(model__outerModel____nestingPackage);
		model2PM__model____source.setSrc(model2PM);
		model2PM__model____source.setTrg(model);
		ruleresult.getCreatedEdges().add(model2PM__model____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model2PM__pm____target.setName(model2PM__pm____target_name_prime);
		outerModel__model____nestedPackage.setName(outerModel__model____nestedPackage_name_prime);
		model__outerModel____nestingPackage.setName(model__outerModel____nestingPackage_name_prime);
		model2PM__model____source.setName(model2PM__model____source_name_prime);
		return new Object[] { ruleresult, model2PM, outerModel, pm, model, model2PM__pm____target,
				outerModel__model____nestedPackage, model__outerModel____nestingPackage, model2PM__model____source };
	}

	public static final void pattern_ModelNested2TypeGraph_11_5_registerobjects_expressionBBBBBBB(
			final ModelNested2TypeGraph _this, final PerformRuleResult ruleresult, final EObject model2PM, final EObject outerModel2PM,
			final EObject outerModel, final EObject pm, final EObject model) {
		_this.registerObjects_BWD(ruleresult, model2PM, outerModel2PM, outerModel, pm, model);

	}

	public static final PerformRuleResult pattern_ModelNested2TypeGraph_11_6_expressionFB(
			final PerformRuleResult ruleresult) {
		final PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_bindingFB(
			final ModelNested2TypeGraph _this) {
		final EClass _localVariable_0 = _this.eClass();
		final EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_blackFBB(final EClass eClass,
			final ModelNested2TypeGraph _this) {
		for (final EOperation performOperation : eClass.getEOperations()) {
			final String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_bindingAndBlackFFB(
			final ModelNested2TypeGraph _this) {
		final Object[] result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_binding = pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_binding != null) {
			final EClass eClass = (EClass) result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_black = pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_black != null) {
				final EOperation performOperation = (EOperation) result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_greenBF(
			final EOperation performOperation) {
		final IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		final boolean ruleresult_success_prime = false;
		final String ruleresult_rule_prime = "ModelNested2TypeGraph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(ruleresult_success_prime);
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_2_corematch_bindingFB(final Match match) {
		final EObject _localVariable_0 = match.getObject("pm");
		final EObject tmpPm = _localVariable_0;
		if (tmpPm instanceof TypeGraph) {
			final TypeGraph pm = (TypeGraph) tmpPm;
			return new Object[] { pm, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_12_2_corematch_blackFFBB(final TypeGraph pm,
			final Match match) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		for (final Model2TypeGraph outerModel2PM : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pm,
				Model2TypeGraph.class, "target")) {
			final Model outerModel = outerModel2PM.getSource();
			if (outerModel != null) {
				_result.add(new Object[] { outerModel2PM, outerModel, pm, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_12_3_findcontext_blackBBB(
			final Model2TypeGraph outerModel2PM, final Model outerModel, final TypeGraph pm) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		if (outerModel.equals(outerModel2PM.getSource()) && pm.equals(outerModel2PM.getTarget())) {
			_result.add(new Object[] { outerModel2PM, outerModel, pm });
		}
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_3_findcontext_greenBBBFFF(
			final Model2TypeGraph outerModel2PM, final Model outerModel, final TypeGraph pm) {
		final IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		final EMoflonEdge outerModel2PM__outerModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge outerModel2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final String outerModel2PM__outerModel____source_name_prime = "source";
		final String outerModel2PM__pm____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(outerModel2PM);
		isApplicableMatch.getAllContextElements().add(outerModel);
		isApplicableMatch.getAllContextElements().add(pm);
		outerModel2PM__outerModel____source.setSrc(outerModel2PM);
		outerModel2PM__outerModel____source.setTrg(outerModel);
		isApplicableMatch.getAllContextElements().add(outerModel2PM__outerModel____source);
		outerModel2PM__pm____target.setSrc(outerModel2PM);
		outerModel2PM__pm____target.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(outerModel2PM__pm____target);
		outerModel2PM__outerModel____source.setName(outerModel2PM__outerModel____source_name_prime);
		outerModel2PM__pm____target.setName(outerModel2PM__pm____target_name_prime);
		return new Object[] { outerModel2PM, outerModel, pm, isApplicableMatch, outerModel2PM__outerModel____source,
				outerModel2PM__pm____target };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_4_solveCSP_bindingFBBBBB(final ModelNested2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch, final Model2TypeGraph outerModel2PM, final Model outerModel, final TypeGraph pm) {
		final CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, outerModel2PM, outerModel, pm);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, pm };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_4_solveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_4_solveCSP_bindingAndBlackFBBBBB(
			final ModelNested2TypeGraph _this, final IsApplicableMatch isApplicableMatch, final Model2TypeGraph outerModel2PM,
			final Model outerModel, final TypeGraph pm) {
		final Object[] result_pattern_ModelNested2TypeGraph_12_4_solveCSP_binding = pattern_ModelNested2TypeGraph_12_4_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, outerModel2PM, outerModel, pm);
		if (result_pattern_ModelNested2TypeGraph_12_4_solveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_12_4_solveCSP_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_12_4_solveCSP_black = pattern_ModelNested2TypeGraph_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_12_5_checkCSP_expressionFBB(final ModelNested2TypeGraph _this,
			final CSP csp) {
		final boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_6_addmatchtoruleresult_blackBB(
			final IsApplicableRuleResult ruleresult, final IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_6_addmatchtoruleresult_greenBB(
			final IsApplicableRuleResult ruleresult, final IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		final boolean ruleresult_success_prime = true;
		final String isApplicableMatch_ruleName_prime = "ModelNested2TypeGraph";
		ruleresult.setSuccess(ruleresult_success_prime);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ModelNested2TypeGraph_12_7_expressionFB(
			final IsApplicableRuleResult ruleresult) {
		final IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_bindingFB(
			final ModelNested2TypeGraph _this) {
		final EClass _localVariable_0 = _this.eClass();
		final EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_blackFBBF(final EClass __eClass,
			final ModelNested2TypeGraph _this) {
		for (final EOperation __performOperation : __eClass.getEOperations()) {
			final String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (final EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						final String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_bindingAndBlackFFBF(
			final ModelNested2TypeGraph _this) {
		final Object[] result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_binding = pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_binding != null) {
			final EClass __eClass = (EClass) result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_black = pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_black != null) {
				final EOperation __performOperation = (EOperation) result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_black[0];
				final EOperation isApplicableCC = (EOperation) result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_greenF() {
		final EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_20_2_testcorematchandDECs_blackB(
			final TypeGraph pm) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		_result.add(new Object[] { pm });
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_2_testcorematchandDECs_greenFB(final EClass __eClass) {
		final Match match = RuntimeFactory.eINSTANCE.createMatch();
		final String __eClass_name = __eClass.getName();
		final String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ModelNested2TypeGraph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			final ModelNested2TypeGraph _this, final Match match, final TypeGraph pm) {
		final boolean _localVariable_0 = _this.isAppropriate_BWD(match, pm);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			final ModelNested2TypeGraph _this, final Match match) {
		final boolean _localVariable_0 = _this.checkTypes_BWD(match);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_5_Addmatchtoruleresult_blackBBBB(final Match match,
			final EOperation __performOperation, final EObjectContainer __result, final EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_5_Addmatchtoruleresult_greenBBBB(final Match match,
			final EOperation __performOperation, final EObjectContainer __result, final EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ModelNested2TypeGraph_20_6_expressionFB(final EObjectContainer __result) {
		final EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_bindingFB(
			final ModelNested2TypeGraph _this) {
		final EClass _localVariable_0 = _this.eClass();
		final EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_blackFBBF(final EClass __eClass,
			final ModelNested2TypeGraph _this) {
		for (final EOperation __performOperation : __eClass.getEOperations()) {
			final String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (final EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						final String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_bindingAndBlackFFBF(
			final ModelNested2TypeGraph _this) {
		final Object[] result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_binding = pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_binding != null) {
			final EClass __eClass = (EClass) result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_black = pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_black != null) {
				final EOperation __performOperation = (EOperation) result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_black[0];
				final EOperation isApplicableCC = (EOperation) result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_greenF() {
		final EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_21_2_testcorematchandDECs_blackFFB(
			final EMoflonEdge _edge_nestedPackage) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		final EObject tmpOuterModel = _edge_nestedPackage.getSrc();
		if (tmpOuterModel instanceof Model) {
			final Model outerModel = (Model) tmpOuterModel;
			final EObject tmpModel = _edge_nestedPackage.getTrg();
			if (tmpModel instanceof Model) {
				final Model model = (Model) tmpModel;
				if (!model.equals(outerModel) && outerModel.getNestedPackages().contains(model)) {
					_result.add(new Object[] { outerModel, model, _edge_nestedPackage });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_2_testcorematchandDECs_greenFB(final EClass __eClass) {
		final Match match = RuntimeFactory.eINSTANCE.createMatch();
		final String __eClass_name = __eClass.getName();
		final String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ModelNested2TypeGraph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			final ModelNested2TypeGraph _this, final Match match, final Model outerModel, final Model model) {
		final boolean _localVariable_0 = _this.isAppropriate_FWD(match, outerModel, model);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			final ModelNested2TypeGraph _this, final Match match) {
		final boolean _localVariable_0 = _this.checkTypes_FWD(match);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_5_Addmatchtoruleresult_blackBBBB(final Match match,
			final EOperation __performOperation, final EObjectContainer __result, final EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_5_Addmatchtoruleresult_greenBBBB(final Match match,
			final EOperation __performOperation, final EObjectContainer __result, final EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ModelNested2TypeGraph_21_6_expressionFB(final EObjectContainer __result) {
		final EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_1_prepare_blackB(final ModelNested2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_1_prepare_greenF() {
		final IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_bindingFFFBB(final Match sourceMatch,
			final Match targetMatch) {
		final EObject _localVariable_0 = sourceMatch.getObject("outerModel");
		final EObject _localVariable_1 = targetMatch.getObject("pm");
		final EObject _localVariable_2 = sourceMatch.getObject("model");
		final EObject tmpOuterModel = _localVariable_0;
		final EObject tmpPm = _localVariable_1;
		final EObject tmpModel = _localVariable_2;
		if (tmpOuterModel instanceof Model) {
			final Model outerModel = (Model) tmpOuterModel;
			if (tmpPm instanceof TypeGraph) {
				final TypeGraph pm = (TypeGraph) tmpPm;
				if (tmpModel instanceof Model) {
					final Model model = (Model) tmpModel;
					return new Object[] { outerModel, pm, model, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_blackBBBBB(final Model outerModel,
			final TypeGraph pm, final Model model, final Match sourceMatch, final Match targetMatch) {
		if (!model.equals(outerModel) && !sourceMatch.equals(targetMatch)) {
			return new Object[] { outerModel, pm, model, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(
			final Match sourceMatch, final Match targetMatch) {
		final Object[] result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding = pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_bindingFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding != null) {
			final Model outerModel = (Model) result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding[0];
			final TypeGraph pm = (TypeGraph) result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding[1];
			final Model model = (Model) result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding[2];

			final Object[] result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_black = pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_blackBBBBB(
					outerModel, pm, model, sourceMatch, targetMatch);
			if (result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { outerModel, pm, model, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_3_solvecsp_bindingFBBBBBB(final ModelNested2TypeGraph _this,
			final Model outerModel, final TypeGraph pm, final Model model, final Match sourceMatch, final Match targetMatch) {
		final CSP _localVariable_3 = _this.isApplicable_solveCsp_CC(outerModel, pm, model, sourceMatch, targetMatch);
		final CSP csp = _localVariable_3;
		if (csp != null) {
			return new Object[] { csp, _this, outerModel, pm, model, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_3_solvecsp_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_3_solvecsp_bindingAndBlackFBBBBBB(
			final ModelNested2TypeGraph _this, final Model outerModel, final TypeGraph pm, final Model model, final Match sourceMatch,
			final Match targetMatch) {
		final Object[] result_pattern_ModelNested2TypeGraph_24_3_solvecsp_binding = pattern_ModelNested2TypeGraph_24_3_solvecsp_bindingFBBBBBB(
				_this, outerModel, pm, model, sourceMatch, targetMatch);
		if (result_pattern_ModelNested2TypeGraph_24_3_solvecsp_binding != null) {
			final CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_24_3_solvecsp_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_24_3_solvecsp_black = pattern_ModelNested2TypeGraph_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, outerModel, pm, model, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_24_4_checkCSP_expressionFB(final CSP csp) {
		final boolean _localVariable_0 = csp.check();
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_24_5_matchcorrcontext_blackFBBBB(
			final Model outerModel, final TypeGraph pm, final Match sourceMatch, final Match targetMatch) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		if (!sourceMatch.equals(targetMatch)) {
			for (final Model2TypeGraph outerModel2PM : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outerModel, Model2TypeGraph.class, "source")) {
				if (pm.equals(outerModel2PM.getTarget())) {
					_result.add(new Object[] { outerModel2PM, outerModel, pm, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_5_matchcorrcontext_greenBBBF(
			final Model2TypeGraph outerModel2PM, final Match sourceMatch, final Match targetMatch) {
		final CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		final String ccMatch_ruleName_prime = "ModelNested2TypeGraph";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(outerModel2PM);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { outerModel2PM, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_6_createcorrespondence_blackBBBB(final Model outerModel,
			final TypeGraph pm, final Model model, final CCMatch ccMatch) {
		if (!model.equals(outerModel)) {
			return new Object[] { outerModel, pm, model, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_6_createcorrespondence_greenFBBB(final TypeGraph pm,
			final Model model, final CCMatch ccMatch) {
		final Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		model2PM.setTarget(pm);
		model2PM.setSource(model);
		ccMatch.getCreateCorr().add(model2PM);
		return new Object[] { model2PM, pm, model, ccMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_7_addtoreturnedresult_blackBB(
			final IsApplicableRuleResult result, final CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_7_addtoreturnedresult_greenBB(
			final IsApplicableRuleResult result, final CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		final boolean result_success_prime = true;
		final String ccMatch_ruleName_prime = "ModelNested2TypeGraph";
		result.setSuccess(result_success_prime);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ModelNested2TypeGraph_24_8_expressionFB(
			final IsApplicableRuleResult result) {
		final IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_27_1_matchtggpattern_blackBB(final Model outerModel,
			final Model model) {
		if (!model.equals(outerModel) && outerModel.getNestedPackages().contains(model)) {
			return new Object[] { outerModel, model };
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_27_2_expressionF() {
		final boolean _result = true;
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_27_3_expressionF() {
		final boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_28_1_matchtggpattern_blackB(final TypeGraph pm) {
		return new Object[] { pm };
	}

	public static final boolean pattern_ModelNested2TypeGraph_28_2_expressionF() {
		final boolean _result = true;
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_28_3_expressionF() {
		final boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_1_createresult_blackB(final ModelNested2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_1_createresult_greenFF() {
		final IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		final ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		final boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(ruleResult_success_prime);
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_2_isapplicablecore_black_nac_0BB(
			final ModelgeneratorRuleResult ruleResult, final Model2TypeGraph outerModel2PM) {
		if (ruleResult.getCorrObjects().contains(outerModel2PM)) {
			return new Object[] { ruleResult, outerModel2PM };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_2_isapplicablecore_black_nac_1BB(
			final ModelgeneratorRuleResult ruleResult, final Model outerModel) {
		if (ruleResult.getSourceObjects().contains(outerModel)) {
			return new Object[] { ruleResult, outerModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_29_2_isapplicablecore_blackFFFBB(
			final RuleEntryContainer ruleEntryContainer, final ModelgeneratorRuleResult ruleResult) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		for (final RuleEntryList outerModel2PMList : ruleEntryContainer.getRuleEntryList()) {
			for (final EObject tmpOuterModel2PM : outerModel2PMList.getEntryObjects()) {
				if (tmpOuterModel2PM instanceof Model2TypeGraph) {
					final Model2TypeGraph outerModel2PM = (Model2TypeGraph) tmpOuterModel2PM;
					final Model outerModel = outerModel2PM.getSource();
					if ((outerModel != null) && (pattern_ModelNested2TypeGraph_29_2_isapplicablecore_black_nac_0BB(ruleResult,
							outerModel2PM) == null)) {
						if (pattern_ModelNested2TypeGraph_29_2_isapplicablecore_black_nac_1BB(ruleResult,
								outerModel) == null) {
							_result.add(new Object[] { outerModel2PMList, outerModel2PM, outerModel,
									ruleEntryContainer, ruleResult });
						}
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_3_solveCSP_bindingFBBBBB(final ModelNested2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch, final Model2TypeGraph outerModel2PM, final Model outerModel,
			final ModelgeneratorRuleResult ruleResult) {
		final CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, outerModel2PM, outerModel,
				ruleResult);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_3_solveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_3_solveCSP_bindingAndBlackFBBBBB(
			final ModelNested2TypeGraph _this, final IsApplicableMatch isApplicableMatch, final Model2TypeGraph outerModel2PM,
			final Model outerModel, final ModelgeneratorRuleResult ruleResult) {
		final Object[] result_pattern_ModelNested2TypeGraph_29_3_solveCSP_binding = pattern_ModelNested2TypeGraph_29_3_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, outerModel2PM, outerModel, ruleResult);
		if (result_pattern_ModelNested2TypeGraph_29_3_solveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_29_3_solveCSP_binding[0];

			final Object[] result_pattern_ModelNested2TypeGraph_29_3_solveCSP_black = pattern_ModelNested2TypeGraph_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_29_4_checkCSP_expressionFBB(final ModelNested2TypeGraph _this,
			final CSP csp) {
		final boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_5_checknacs_blackBB(final Model2TypeGraph outerModel2PM,
			final Model outerModel) {
		return new Object[] { outerModel2PM, outerModel };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_6_perform_blackBBB(final Model2TypeGraph outerModel2PM,
			final Model outerModel, final ModelgeneratorRuleResult ruleResult) {
		return new Object[] { outerModel2PM, outerModel, ruleResult };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_6_perform_greenFBFFBB(final Model outerModel,
			final ModelgeneratorRuleResult ruleResult, final CSP csp) {
		final Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		final TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		final Model model = UMLFactory.eINSTANCE.createModel();
		final Object _localVariable_0 = csp.getValue("pm", "tName");
		final Object _localVariable_1 = csp.getValue("model", "name");
		final boolean ruleResult_success_prime = true;
		final int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(model2PM);
		model2PM.setTarget(pm);
		ruleResult.getTargetObjects().add(pm);
		outerModel.getNestedPackages().add(model);
		model2PM.setSource(model);
		ruleResult.getSourceObjects().add(model);
		final String pm_tName_prime = (String) _localVariable_0;
		final String model_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(ruleResult_success_prime);
		final int ruleResult_performCount_prime = _localVariable_2;
		pm.setTName(pm_tName_prime);
		model.setName(model_name_prime);
		ruleResult.setPerformCount(ruleResult_performCount_prime);
		return new Object[] { model2PM, outerModel, pm, model, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ModelNested2TypeGraph_29_7_expressionFB(
			final ModelgeneratorRuleResult ruleResult) {
		final ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ModelNested2TypeGraphImpl
