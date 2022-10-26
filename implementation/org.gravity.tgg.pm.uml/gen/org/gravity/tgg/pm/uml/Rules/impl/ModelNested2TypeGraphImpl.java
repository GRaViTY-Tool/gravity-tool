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

import org.gravity.tgg.pm.uml.Rules.ModelNested2TypeGraph;
import org.gravity.tgg.pm.uml.Rules.RulesPackage;

import org.gravity.tgg.pm.uml.UmlFactory;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TypeGraph;

import org.moflon.tgg.language.csp.CSP;

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
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import org.gravity.tgg.pm.uml.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

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
		super();
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
	public boolean isAppropriate_FWD(Match match, Model model, Model outerModel) {

		Object[] result1_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_0_1_initialbindings_blackBBBB(this, match, model, outerModel);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[outerModel] = " + outerModel + ".");
		}

		Object[] result2_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, model, outerModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[outerModel] = " + outerModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_0_4_collectelementstobetranslated_blackBBB(match, model, outerModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[outerModel] = " + outerModel + ".");
			}
			ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_4_collectelementstobetranslated_greenBBBFF(match,
					model, outerModel);
			//nothing EMoflonEdge outerModel__model____nestedPackage = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge model__outerModel____nestingPackage = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_0_5_collectcontextelements_blackBBB(match, model, outerModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[outerModel] = " + outerModel + ".");
			}
			ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_5_collectcontextelements_greenBB(match,
					outerModel);

			// 
			ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_0_6_registerobjectstomatch_expressionBBBB(this,
					match, model, outerModel);
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
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_1_performtransformation_bindingAndBlackFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model2TypeGraph outerModel2PM = (Model2TypeGraph) result1_bindingAndBlack[0];
		Model model = (Model) result1_bindingAndBlack[1];
		Model outerModel = (Model) result1_bindingAndBlack[2];
		CSP csp = (CSP) result1_bindingAndBlack[3];
		Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_1_performtransformation_greenFBFB(model, csp);
		Model2TypeGraph model2PM = (Model2TypeGraph) result1_green[0];
		TypeGraph pm = (TypeGraph) result1_green[2];

		Object[] result2_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_2_collecttranslatedelements_blackBBB(model2PM, model, pm);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model2PM] = " + model2PM + ", "
					+ "[model] = " + model + ", " + "[pm] = " + pm + ".");
		}
		Object[] result2_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_2_collecttranslatedelements_greenFBBB(model2PM, model, pm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_1_3_bookkeepingforedges_blackBBBBBB(ruleresult, outerModel2PM, model2PM,
						model, outerModel, pm);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[outerModel2PM] = " + outerModel2PM + ", " + "[model2PM] = " + model2PM + ", "
					+ "[model] = " + model + ", " + "[outerModel] = " + outerModel + ", " + "[pm] = " + pm + ".");
		}
		ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				model2PM, model, outerModel, pm);
		//nothing EMoflonEdge model2PM__model____source = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge model2PM__pm____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge outerModel__model____nestedPackage = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge model__outerModel____nestingPackage = (EMoflonEdge) result3_green[8];

		// 
		// 
		ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_1_5_registerobjects_expressionBBBBBBB(this, ruleresult,
				outerModel2PM, model2PM, model, outerModel, pm);
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model model = (Model) result2_binding[0];
		Model outerModel = (Model) result2_binding[1];
		for (Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_2_2_corematch_blackFBBB(model, outerModel, match)) {
			Model2TypeGraph outerModel2PM = (Model2TypeGraph) result2_black[0];
			// ForEach 
			for (Object[] result3_black : ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_2_3_findcontext_blackBBB(outerModel2PM, model, outerModel)) {
				Object[] result3_green = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_2_3_findcontext_greenBBBFFFF(outerModel2PM, model, outerModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[3];
				//nothing EMoflonEdge outerModel2PM__outerModel____source = (EMoflonEdge) result3_green[4];
				//nothing EMoflonEdge outerModel__model____nestedPackage = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge model__outerModel____nestingPackage = (EMoflonEdge) result3_green[6];

				Object[] result4_bindingAndBlack = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_2_4_solveCSP_bindingAndBlackFBBBBB(this, isApplicableMatch,
								outerModel2PM, model, outerModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[outerModel2PM] = " + outerModel2PM
							+ ", " + "[model] = " + model + ", " + "[outerModel] = " + outerModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ModelNested2TypeGraphImpl
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
	public void registerObjectsToMatch_FWD(Match match, Model model, Model outerModel) {
		match.registerObject("model", model);
		match.registerObject("outerModel", outerModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model model, Model outerModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

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
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model2TypeGraph outerModel2PM,
			Model model, Model outerModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model.name", true, csp);
		var_model_name.setValue(model.getName());
		var_model_name.setType("String");

		// Create unbound variables
		Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm.tName", csp);
		var_pm_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_model_name, var_pm_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("outerModel2PM", outerModel2PM);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("outerModel", outerModel);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject outerModel2PM, EObject model2PM,
			EObject model, EObject outerModel, EObject pm) {
		ruleresult.registerObject("outerModel2PM", outerModel2PM);
		ruleresult.registerObject("model2PM", model2PM);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("outerModel", outerModel);
		ruleresult.registerObject("pm", pm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("model").eClass()).equals("uml.Model.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph pm) {

		Object[] result1_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_10_1_initialbindings_blackBBB(this, match, pm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ".");
		}

		Object[] result2_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_10_2_SolveCSP_bindingAndBlackFBBB(this, match, pm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_10_4_collectelementstobetranslated_blackBB(match, pm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pm] = " + pm + ".");
			}
			ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_10_4_collectelementstobetranslated_greenBB(match,
					pm);

			Object[] result5_black = ModelNested2TypeGraphImpl
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
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_1_performtransformation_bindingAndBlackFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model2TypeGraph outerModel2PM = (Model2TypeGraph) result1_bindingAndBlack[0];
		Model outerModel = (Model) result1_bindingAndBlack[1];
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[2];
		CSP csp = (CSP) result1_bindingAndBlack[3];
		Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_1_performtransformation_greenFFBBB(outerModel, pm, csp);
		Model2TypeGraph model2PM = (Model2TypeGraph) result1_green[0];
		Model model = (Model) result1_green[1];

		Object[] result2_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_2_collecttranslatedelements_blackBBB(model2PM, model, pm);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model2PM] = " + model2PM + ", "
					+ "[model] = " + model + ", " + "[pm] = " + pm + ".");
		}
		Object[] result2_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_2_collecttranslatedelements_greenFBBB(model2PM, model, pm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_11_3_bookkeepingforedges_blackBBBBBB(ruleresult, outerModel2PM, model2PM,
						model, outerModel, pm);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[outerModel2PM] = " + outerModel2PM + ", " + "[model2PM] = " + model2PM + ", "
					+ "[model] = " + model + ", " + "[outerModel] = " + outerModel + ", " + "[pm] = " + pm + ".");
		}
		ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				model2PM, model, outerModel, pm);
		//nothing EMoflonEdge model2PM__model____source = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge model2PM__pm____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge outerModel__model____nestedPackage = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge model__outerModel____nestingPackage = (EMoflonEdge) result3_green[8];

		// 
		// 
		ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_11_5_registerobjects_expressionBBBBBBB(this, ruleresult,
				outerModel2PM, model2PM, model, outerModel, pm);
		return ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph pm = (TypeGraph) result2_binding[0];
		for (Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_12_2_corematch_blackFFBB(pm, match)) {
			Model2TypeGraph outerModel2PM = (Model2TypeGraph) result2_black[0];
			Model outerModel = (Model) result2_black[1];
			// ForEach 
			for (Object[] result3_black : ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_12_3_findcontext_blackBBB(outerModel2PM, outerModel, pm)) {
				Object[] result3_green = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_12_3_findcontext_greenBBBFFF(outerModel2PM, outerModel, pm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[3];
				//nothing EMoflonEdge outerModel2PM__outerModel____source = (EMoflonEdge) result3_green[4];
				//nothing EMoflonEdge outerModel2PM__pm____target = (EMoflonEdge) result3_green[5];

				Object[] result4_bindingAndBlack = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_12_4_solveCSP_bindingAndBlackFBBBBB(this, isApplicableMatch,
								outerModel2PM, outerModel, pm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[outerModel2PM] = " + outerModel2PM
							+ ", " + "[outerModel] = " + outerModel + ", " + "[pm] = " + pm + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ModelNested2TypeGraphImpl
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
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pm) {
		match.registerObject("pm", pm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

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
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model2TypeGraph outerModel2PM,
			Model outerModel, TypeGraph pm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm.tName", true, csp);
		var_pm_tName.setValue(pm.getTName());
		var_pm_tName.setType("String");

		// Create unbound variables
		Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model.name", csp);
		var_model_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

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
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject outerModel2PM, EObject model2PM,
			EObject model, EObject outerModel, EObject pm) {
		ruleresult.registerObject("outerModel2PM", outerModel2PM);
		ruleresult.registerObject("model2PM", model2PM);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("outerModel", outerModel);
		ruleresult.registerObject("pm", pm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("pm").eClass()).equals("basic.TypeGraph.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TypeGraph_1(TypeGraph pm) {

		Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_20_2_testcorematchandDECs_blackB(pm)) {
			Object[] result2_green = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, pm)) {
				// 
				if (ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ModelNested2TypeGraphImpl
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_0(EMoflonEdge _edge_nestedPackage) {

		Object[] result1_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_21_2_testcorematchandDECs_blackFFB(_edge_nestedPackage)) {
			Model model = (Model) result2_black[0];
			Model outerModel = (Model) result2_black[1];
			Object[] result2_green = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, model, outerModel)) {
				// 
				if (ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ModelNested2TypeGraphImpl
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
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ModelNested2TypeGraph");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model", true, csp);
		var_model_name.setValue(__helper.getValue("model", "name"));
		var_model_name.setType("String");

		Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm", true, csp);
		var_pm_tName.setValue(__helper.getValue("pm", "tName"));
		var_pm_tName.setType("String");

		Eq eq0 = new Eq();
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
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ModelNested2TypeGraph");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model", true, csp);
		var_model_name.setValue(__helper.getValue("model", "name"));
		var_model_name.setType("String");

		Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm", true, csp);
		var_pm_tName.setValue(__helper.getValue("pm", "tName"));
		var_pm_tName.setType("String");

		Eq eq0 = new Eq();
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
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {

		Object[] result1_black = ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model model = (Model) result2_bindingAndBlack[0];
		Model outerModel = (Model) result2_bindingAndBlack[1];
		TypeGraph pm = (TypeGraph) result2_bindingAndBlack[2];

		Object[] result3_bindingAndBlack = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_24_3_solvecsp_bindingAndBlackFBBBBBB(this, model, outerModel, pm,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[model] = " + model + ", " + "[outerModel] = " + outerModel + ", " + "[pm] = " + pm + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_24_5_matchcorrcontext_blackFBBBB(outerModel, pm, sourceMatch,
							targetMatch)) {
				Model2TypeGraph outerModel2PM = (Model2TypeGraph) result5_black[0];
				Object[] result5_green = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_24_5_matchcorrcontext_greenBBBF(outerModel2PM, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_24_6_createcorrespondence_blackBBBB(model, outerModel, pm,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
							+ "[outerModel] = " + outerModel + ", " + "[pm] = " + pm + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_24_6_createcorrespondence_greenFBBB(model, pm,
						ccMatch);
				//nothing Model2TypeGraph model2PM = (Model2TypeGraph) result6_green[0];

				Object[] result7_black = ModelNested2TypeGraphImpl
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
	public CSP isApplicable_solveCsp_CC(Model model, Model outerModel, TypeGraph pm, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model.name", true, csp);
		var_model_name.setValue(model.getName());
		var_model_name.setType("String");
		Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm.tName", true, csp);
		var_pm_tName.setValue(pm.getTName());
		var_pm_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

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
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(Model model, Model outerModel) {// 
		Object[] result1_black = ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_27_1_matchtggpattern_blackBB(model, outerModel);
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
	public boolean checkDEC_BWD(TypeGraph pm) {// 
		Object[] result1_black = ModelNested2TypeGraphImpl
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
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			Model2TypeGraph outerModel2PMParameter) {

		Object[] result1_black = ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ModelNested2TypeGraphImpl
				.pattern_ModelNested2TypeGraph_29_2_isapplicablecore_blackFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList outerModel2PMList = (RuleEntryList) result2_black[0];
			Model2TypeGraph outerModel2PM = (Model2TypeGraph) result2_black[1];
			Model outerModel = (Model) result2_black[2];

			Object[] result3_bindingAndBlack = ModelNested2TypeGraphImpl
					.pattern_ModelNested2TypeGraph_29_3_solveCSP_bindingAndBlackFBBBBB(this, isApplicableMatch,
							outerModel2PM, outerModel, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[outerModel2PM] = " + outerModel2PM
						+ ", " + "[outerModel] = " + outerModel + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ModelNested2TypeGraphImpl
						.pattern_ModelNested2TypeGraph_29_5_checknacs_blackBB(outerModel2PM, outerModel);
				if (result5_black != null) {

					Object[] result6_black = ModelNested2TypeGraphImpl
							.pattern_ModelNested2TypeGraph_29_6_perform_blackBBB(outerModel2PM, outerModel, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[outerModel2PM] = "
								+ outerModel2PM + ", " + "[outerModel] = " + outerModel + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					ModelNested2TypeGraphImpl.pattern_ModelNested2TypeGraph_29_6_perform_greenFFBFBB(outerModel,
							ruleResult, csp);
					//nothing Model2TypeGraph model2PM = (Model2TypeGraph) result6_green[0];
					//nothing Model model = (Model) result6_green[1];
					//nothing TypeGraph pm = (TypeGraph) result6_green[3];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model2TypeGraph outerModel2PM,
			Model outerModel, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_model_name = CSPFactoryHelper.eINSTANCE.createVariable("model.name", csp);
		var_model_name.setType("String");
		Variable var_pm_tName = CSPFactoryHelper.eINSTANCE.createVariable("pm.tName", csp);
		var_pm_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

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
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
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
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_BWD_TYPE_GRAPH_1__TYPEGRAPH:
			return isAppropriate_BWD_TypeGraph_1((TypeGraph) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_0((EMoflonEdge) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MODEL_NESTED2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_MODEL_TYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (Model) arguments.get(1),
					(TypeGraph) arguments.get(2), (Match) arguments.get(3), (Match) arguments.get(4));
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
			ModelNested2TypeGraph _this, Match match, Model model, Model outerModel) {
		if (!model.equals(outerModel)) {
			return new Object[] { _this, match, model, outerModel };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_2_SolveCSP_bindingFBBBB(ModelNested2TypeGraph _this,
			Match match, Model model, Model outerModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, model, outerModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model, outerModel };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_2_SolveCSP_bindingAndBlackFBBBB(
			ModelNested2TypeGraph _this, Match match, Model model, Model outerModel) {
		Object[] result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_binding = pattern_ModelNested2TypeGraph_0_2_SolveCSP_bindingFBBBB(
				_this, match, model, outerModel);
		if (result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_black = pattern_ModelNested2TypeGraph_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, model, outerModel };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_0_3_CheckCSP_expressionFBB(ModelNested2TypeGraph _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_4_collectelementstobetranslated_blackBBB(Match match,
			Model model, Model outerModel) {
		if (!model.equals(outerModel)) {
			return new Object[] { match, model, outerModel };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			Model model, Model outerModel) {
		EMoflonEdge outerModel__model____nestedPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__outerModel____nestingPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(model);
		String outerModel__model____nestedPackage_name_prime = "nestedPackage";
		String model__outerModel____nestingPackage_name_prime = "nestingPackage";
		outerModel__model____nestedPackage.setSrc(outerModel);
		outerModel__model____nestedPackage.setTrg(model);
		match.getToBeTranslatedEdges().add(outerModel__model____nestedPackage);
		model__outerModel____nestingPackage.setSrc(model);
		model__outerModel____nestingPackage.setTrg(outerModel);
		match.getToBeTranslatedEdges().add(model__outerModel____nestingPackage);
		outerModel__model____nestedPackage.setName(outerModel__model____nestedPackage_name_prime);
		model__outerModel____nestingPackage.setName(model__outerModel____nestingPackage_name_prime);
		return new Object[] { match, model, outerModel, outerModel__model____nestedPackage,
				model__outerModel____nestingPackage };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_5_collectcontextelements_blackBBB(Match match,
			Model model, Model outerModel) {
		if (!model.equals(outerModel)) {
			return new Object[] { match, model, outerModel };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_0_5_collectcontextelements_greenBB(Match match,
			Model outerModel) {
		match.getContextNodes().add(outerModel);
		return new Object[] { match, outerModel };
	}

	public static final void pattern_ModelNested2TypeGraph_0_6_registerobjectstomatch_expressionBBBB(
			ModelNested2TypeGraph _this, Match match, Model model, Model outerModel) {
		_this.registerObjectsToMatch_FWD(match, model, outerModel);

	}

	public static final boolean pattern_ModelNested2TypeGraph_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_1_performtransformation_bindingFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("outerModel2PM");
		EObject _localVariable_1 = isApplicableMatch.getObject("model");
		EObject _localVariable_2 = isApplicableMatch.getObject("outerModel");
		EObject tmpOuterModel2PM = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpOuterModel = _localVariable_2;
		if (tmpOuterModel2PM instanceof Model2TypeGraph) {
			Model2TypeGraph outerModel2PM = (Model2TypeGraph) tmpOuterModel2PM;
			if (tmpModel instanceof Model) {
				Model model = (Model) tmpModel;
				if (tmpOuterModel instanceof Model) {
					Model outerModel = (Model) tmpOuterModel;
					return new Object[] { outerModel2PM, model, outerModel, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_1_performtransformation_blackBBBFBB(
			Model2TypeGraph outerModel2PM, Model model, Model outerModel, ModelNested2TypeGraph _this,
			IsApplicableMatch isApplicableMatch) {
		if (!model.equals(outerModel)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { outerModel2PM, model, outerModel, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_1_performtransformation_bindingAndBlackFFFFBB(
			ModelNested2TypeGraph _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding = pattern_ModelNested2TypeGraph_1_1_performtransformation_bindingFFFB(
				isApplicableMatch);
		if (result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding != null) {
			Model2TypeGraph outerModel2PM = (Model2TypeGraph) result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding[0];
			Model model = (Model) result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding[1];
			Model outerModel = (Model) result_pattern_ModelNested2TypeGraph_1_1_performtransformation_binding[2];

			Object[] result_pattern_ModelNested2TypeGraph_1_1_performtransformation_black = pattern_ModelNested2TypeGraph_1_1_performtransformation_blackBBBFBB(
					outerModel2PM, model, outerModel, _this, isApplicableMatch);
			if (result_pattern_ModelNested2TypeGraph_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_1_1_performtransformation_black[3];

				return new Object[] { outerModel2PM, model, outerModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_1_performtransformation_greenFBFB(Model model,
			CSP csp) {
		Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		Object _localVariable_0 = csp.getValue("pm", "tName");
		model2PM.setSource(model);
		model2PM.setTarget(pm);
		String pm_tName_prime = (String) _localVariable_0;
		pm.setTName(pm_tName_prime);
		return new Object[] { model2PM, model, pm, csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_2_collecttranslatedelements_blackBBB(
			Model2TypeGraph model2PM, Model model, TypeGraph pm) {
		return new Object[] { model2PM, model, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_2_collecttranslatedelements_greenFBBB(
			Model2TypeGraph model2PM, Model model, TypeGraph pm) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(model2PM);
		ruleresult.getTranslatedElements().add(model);
		ruleresult.getCreatedElements().add(pm);
		return new Object[] { ruleresult, model2PM, model, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_1_3_bookkeepingforedges_blackBBBBBB(
			PerformRuleResult ruleresult, EObject outerModel2PM, EObject model2PM, EObject model, EObject outerModel,
			EObject pm) {
		if (!outerModel2PM.equals(pm)) {
			if (!model2PM.equals(outerModel2PM)) {
				if (!model2PM.equals(outerModel)) {
					if (!model2PM.equals(pm)) {
						if (!model.equals(outerModel2PM)) {
							if (!model.equals(model2PM)) {
								if (!model.equals(outerModel)) {
									if (!model.equals(pm)) {
										if (!outerModel.equals(outerModel2PM)) {
											if (!outerModel.equals(pm)) {
												return new Object[] { ruleresult, outerModel2PM, model2PM, model,
														outerModel, pm };
											}
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
			PerformRuleResult ruleresult, EObject model2PM, EObject model, EObject outerModel, EObject pm) {
		EMoflonEdge model2PM__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge outerModel__model____nestedPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__outerModel____nestingPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ModelNested2TypeGraph";
		String model2PM__model____source_name_prime = "source";
		String model2PM__pm____target_name_prime = "target";
		String outerModel__model____nestedPackage_name_prime = "nestedPackage";
		String model__outerModel____nestingPackage_name_prime = "nestingPackage";
		model2PM__model____source.setSrc(model2PM);
		model2PM__model____source.setTrg(model);
		ruleresult.getCreatedEdges().add(model2PM__model____source);
		model2PM__pm____target.setSrc(model2PM);
		model2PM__pm____target.setTrg(pm);
		ruleresult.getCreatedEdges().add(model2PM__pm____target);
		outerModel__model____nestedPackage.setSrc(outerModel);
		outerModel__model____nestedPackage.setTrg(model);
		ruleresult.getTranslatedEdges().add(outerModel__model____nestedPackage);
		model__outerModel____nestingPackage.setSrc(model);
		model__outerModel____nestingPackage.setTrg(outerModel);
		ruleresult.getTranslatedEdges().add(model__outerModel____nestingPackage);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model2PM__model____source.setName(model2PM__model____source_name_prime);
		model2PM__pm____target.setName(model2PM__pm____target_name_prime);
		outerModel__model____nestedPackage.setName(outerModel__model____nestedPackage_name_prime);
		model__outerModel____nestingPackage.setName(model__outerModel____nestingPackage_name_prime);
		return new Object[] { ruleresult, model2PM, model, outerModel, pm, model2PM__model____source,
				model2PM__pm____target, outerModel__model____nestedPackage, model__outerModel____nestingPackage };
	}

	public static final void pattern_ModelNested2TypeGraph_1_5_registerobjects_expressionBBBBBBB(
			ModelNested2TypeGraph _this, PerformRuleResult ruleresult, EObject outerModel2PM, EObject model2PM,
			EObject model, EObject outerModel, EObject pm) {
		_this.registerObjects_FWD(ruleresult, outerModel2PM, model2PM, model, outerModel, pm);

	}

	public static final PerformRuleResult pattern_ModelNested2TypeGraph_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_bindingFB(
			ModelNested2TypeGraph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ModelNested2TypeGraph _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_bindingAndBlackFFB(
			ModelNested2TypeGraph _this) {
		Object[] result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_binding = pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_black = pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ModelNested2TypeGraph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("model");
		EObject _localVariable_1 = match.getObject("outerModel");
		EObject tmpModel = _localVariable_0;
		EObject tmpOuterModel = _localVariable_1;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpOuterModel instanceof Model) {
				Model outerModel = (Model) tmpOuterModel;
				return new Object[] { model, outerModel, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_2_2_corematch_blackFBBB(Model model,
			Model outerModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!model.equals(outerModel)) {
			for (Model2TypeGraph outerModel2PM : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outerModel, Model2TypeGraph.class, "source")) {
				_result.add(new Object[] { outerModel2PM, model, outerModel, match });
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_2_3_findcontext_blackBBB(
			Model2TypeGraph outerModel2PM, Model model, Model outerModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!model.equals(outerModel)) {
			if (outerModel.equals(outerModel2PM.getSource())) {
				if (outerModel.getNestedPackages().contains(model)) {
					_result.add(new Object[] { outerModel2PM, model, outerModel });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_3_findcontext_greenBBBFFFF(
			Model2TypeGraph outerModel2PM, Model model, Model outerModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge outerModel2PM__outerModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge outerModel__model____nestedPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__outerModel____nestingPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String outerModel2PM__outerModel____source_name_prime = "source";
		String outerModel__model____nestedPackage_name_prime = "nestedPackage";
		String model__outerModel____nestingPackage_name_prime = "nestingPackage";
		isApplicableMatch.getAllContextElements().add(outerModel2PM);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(outerModel);
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
		return new Object[] { outerModel2PM, model, outerModel, isApplicableMatch, outerModel2PM__outerModel____source,
				outerModel__model____nestedPackage, model__outerModel____nestingPackage };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_4_solveCSP_bindingFBBBBB(ModelNested2TypeGraph _this,
			IsApplicableMatch isApplicableMatch, Model2TypeGraph outerModel2PM, Model model, Model outerModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, outerModel2PM, model, outerModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, model, outerModel };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_4_solveCSP_bindingAndBlackFBBBBB(
			ModelNested2TypeGraph _this, IsApplicableMatch isApplicableMatch, Model2TypeGraph outerModel2PM,
			Model model, Model outerModel) {
		Object[] result_pattern_ModelNested2TypeGraph_2_4_solveCSP_binding = pattern_ModelNested2TypeGraph_2_4_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, outerModel2PM, model, outerModel);
		if (result_pattern_ModelNested2TypeGraph_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_2_4_solveCSP_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_2_4_solveCSP_black = pattern_ModelNested2TypeGraph_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, model, outerModel };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_2_5_checkCSP_expressionFBB(ModelNested2TypeGraph _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ModelNested2TypeGraph";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ModelNested2TypeGraph_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_1_initialbindings_blackBBB(
			ModelNested2TypeGraph _this, Match match, TypeGraph pm) {
		return new Object[] { _this, match, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_2_SolveCSP_bindingFBBB(ModelNested2TypeGraph _this,
			Match match, TypeGraph pm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pm };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_2_SolveCSP_bindingAndBlackFBBB(
			ModelNested2TypeGraph _this, Match match, TypeGraph pm) {
		Object[] result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_binding = pattern_ModelNested2TypeGraph_10_2_SolveCSP_bindingFBBB(
				_this, match, pm);
		if (result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_black = pattern_ModelNested2TypeGraph_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_10_3_CheckCSP_expressionFBB(ModelNested2TypeGraph _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_4_collectelementstobetranslated_blackBB(Match match,
			TypeGraph pm) {
		return new Object[] { match, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_4_collectelementstobetranslated_greenBB(Match match,
			TypeGraph pm) {
		match.getToBeTranslatedNodes().add(pm);
		return new Object[] { match, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_10_5_collectcontextelements_blackBB(Match match,
			TypeGraph pm) {
		return new Object[] { match, pm };
	}

	public static final void pattern_ModelNested2TypeGraph_10_6_registerobjectstomatch_expressionBBB(
			ModelNested2TypeGraph _this, Match match, TypeGraph pm) {
		_this.registerObjectsToMatch_BWD(match, pm);

	}

	public static final boolean pattern_ModelNested2TypeGraph_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_1_performtransformation_bindingFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("outerModel2PM");
		EObject _localVariable_1 = isApplicableMatch.getObject("outerModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("pm");
		EObject tmpOuterModel2PM = _localVariable_0;
		EObject tmpOuterModel = _localVariable_1;
		EObject tmpPm = _localVariable_2;
		if (tmpOuterModel2PM instanceof Model2TypeGraph) {
			Model2TypeGraph outerModel2PM = (Model2TypeGraph) tmpOuterModel2PM;
			if (tmpOuterModel instanceof Model) {
				Model outerModel = (Model) tmpOuterModel;
				if (tmpPm instanceof TypeGraph) {
					TypeGraph pm = (TypeGraph) tmpPm;
					return new Object[] { outerModel2PM, outerModel, pm, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_1_performtransformation_blackBBBFBB(
			Model2TypeGraph outerModel2PM, Model outerModel, TypeGraph pm, ModelNested2TypeGraph _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { outerModel2PM, outerModel, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_1_performtransformation_bindingAndBlackFFFFBB(
			ModelNested2TypeGraph _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding = pattern_ModelNested2TypeGraph_11_1_performtransformation_bindingFFFB(
				isApplicableMatch);
		if (result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding != null) {
			Model2TypeGraph outerModel2PM = (Model2TypeGraph) result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding[0];
			Model outerModel = (Model) result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding[1];
			TypeGraph pm = (TypeGraph) result_pattern_ModelNested2TypeGraph_11_1_performtransformation_binding[2];

			Object[] result_pattern_ModelNested2TypeGraph_11_1_performtransformation_black = pattern_ModelNested2TypeGraph_11_1_performtransformation_blackBBBFBB(
					outerModel2PM, outerModel, pm, _this, isApplicableMatch);
			if (result_pattern_ModelNested2TypeGraph_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_11_1_performtransformation_black[3];

				return new Object[] { outerModel2PM, outerModel, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_1_performtransformation_greenFFBBB(Model outerModel,
			TypeGraph pm, CSP csp) {
		Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		Model model = UMLFactory.eINSTANCE.createModel();
		Object _localVariable_0 = csp.getValue("model", "name");
		model2PM.setTarget(pm);
		model2PM.setSource(model);
		outerModel.getNestedPackages().add(model);
		String model_name_prime = (String) _localVariable_0;
		model.setName(model_name_prime);
		return new Object[] { model2PM, model, outerModel, pm, csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_2_collecttranslatedelements_blackBBB(
			Model2TypeGraph model2PM, Model model, TypeGraph pm) {
		return new Object[] { model2PM, model, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_2_collecttranslatedelements_greenFBBB(
			Model2TypeGraph model2PM, Model model, TypeGraph pm) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(model2PM);
		ruleresult.getCreatedElements().add(model);
		ruleresult.getTranslatedElements().add(pm);
		return new Object[] { ruleresult, model2PM, model, pm };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_11_3_bookkeepingforedges_blackBBBBBB(
			PerformRuleResult ruleresult, EObject outerModel2PM, EObject model2PM, EObject model, EObject outerModel,
			EObject pm) {
		if (!outerModel2PM.equals(pm)) {
			if (!model2PM.equals(outerModel2PM)) {
				if (!model2PM.equals(outerModel)) {
					if (!model2PM.equals(pm)) {
						if (!model.equals(outerModel2PM)) {
							if (!model.equals(model2PM)) {
								if (!model.equals(outerModel)) {
									if (!model.equals(pm)) {
										if (!outerModel.equals(outerModel2PM)) {
											if (!outerModel.equals(pm)) {
												return new Object[] { ruleresult, outerModel2PM, model2PM, model,
														outerModel, pm };
											}
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
			PerformRuleResult ruleresult, EObject model2PM, EObject model, EObject outerModel, EObject pm) {
		EMoflonEdge model2PM__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge outerModel__model____nestedPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__outerModel____nestingPackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ModelNested2TypeGraph";
		String model2PM__model____source_name_prime = "source";
		String model2PM__pm____target_name_prime = "target";
		String outerModel__model____nestedPackage_name_prime = "nestedPackage";
		String model__outerModel____nestingPackage_name_prime = "nestingPackage";
		model2PM__model____source.setSrc(model2PM);
		model2PM__model____source.setTrg(model);
		ruleresult.getCreatedEdges().add(model2PM__model____source);
		model2PM__pm____target.setSrc(model2PM);
		model2PM__pm____target.setTrg(pm);
		ruleresult.getCreatedEdges().add(model2PM__pm____target);
		outerModel__model____nestedPackage.setSrc(outerModel);
		outerModel__model____nestedPackage.setTrg(model);
		ruleresult.getCreatedEdges().add(outerModel__model____nestedPackage);
		model__outerModel____nestingPackage.setSrc(model);
		model__outerModel____nestingPackage.setTrg(outerModel);
		ruleresult.getCreatedEdges().add(model__outerModel____nestingPackage);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model2PM__model____source.setName(model2PM__model____source_name_prime);
		model2PM__pm____target.setName(model2PM__pm____target_name_prime);
		outerModel__model____nestedPackage.setName(outerModel__model____nestedPackage_name_prime);
		model__outerModel____nestingPackage.setName(model__outerModel____nestingPackage_name_prime);
		return new Object[] { ruleresult, model2PM, model, outerModel, pm, model2PM__model____source,
				model2PM__pm____target, outerModel__model____nestedPackage, model__outerModel____nestingPackage };
	}

	public static final void pattern_ModelNested2TypeGraph_11_5_registerobjects_expressionBBBBBBB(
			ModelNested2TypeGraph _this, PerformRuleResult ruleresult, EObject outerModel2PM, EObject model2PM,
			EObject model, EObject outerModel, EObject pm) {
		_this.registerObjects_BWD(ruleresult, outerModel2PM, model2PM, model, outerModel, pm);

	}

	public static final PerformRuleResult pattern_ModelNested2TypeGraph_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_bindingFB(
			ModelNested2TypeGraph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ModelNested2TypeGraph _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_bindingAndBlackFFB(
			ModelNested2TypeGraph _this) {
		Object[] result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_binding = pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_black = pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ModelNested2TypeGraph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("pm");
		EObject tmpPm = _localVariable_0;
		if (tmpPm instanceof TypeGraph) {
			TypeGraph pm = (TypeGraph) tmpPm;
			return new Object[] { pm, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_12_2_corematch_blackFFBB(TypeGraph pm,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Model2TypeGraph outerModel2PM : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pm,
				Model2TypeGraph.class, "target")) {
			Model outerModel = outerModel2PM.getSource();
			if (outerModel != null) {
				_result.add(new Object[] { outerModel2PM, outerModel, pm, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_12_3_findcontext_blackBBB(
			Model2TypeGraph outerModel2PM, Model outerModel, TypeGraph pm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (outerModel.equals(outerModel2PM.getSource())) {
			if (pm.equals(outerModel2PM.getTarget())) {
				_result.add(new Object[] { outerModel2PM, outerModel, pm });
			}
		}
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_3_findcontext_greenBBBFFF(
			Model2TypeGraph outerModel2PM, Model outerModel, TypeGraph pm) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge outerModel2PM__outerModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge outerModel2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String outerModel2PM__outerModel____source_name_prime = "source";
		String outerModel2PM__pm____target_name_prime = "target";
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

	public static final Object[] pattern_ModelNested2TypeGraph_12_4_solveCSP_bindingFBBBBB(ModelNested2TypeGraph _this,
			IsApplicableMatch isApplicableMatch, Model2TypeGraph outerModel2PM, Model outerModel, TypeGraph pm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, outerModel2PM, outerModel, pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, pm };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_4_solveCSP_bindingAndBlackFBBBBB(
			ModelNested2TypeGraph _this, IsApplicableMatch isApplicableMatch, Model2TypeGraph outerModel2PM,
			Model outerModel, TypeGraph pm) {
		Object[] result_pattern_ModelNested2TypeGraph_12_4_solveCSP_binding = pattern_ModelNested2TypeGraph_12_4_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, outerModel2PM, outerModel, pm);
		if (result_pattern_ModelNested2TypeGraph_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_12_4_solveCSP_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_12_4_solveCSP_black = pattern_ModelNested2TypeGraph_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_12_5_checkCSP_expressionFBB(ModelNested2TypeGraph _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ModelNested2TypeGraph";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ModelNested2TypeGraph_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_bindingFB(
			ModelNested2TypeGraph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ModelNested2TypeGraph _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
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
			ModelNested2TypeGraph _this) {
		Object[] result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_binding = pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_black = pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_20_2_testcorematchandDECs_blackB(
			TypeGraph pm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { pm });
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ModelNested2TypeGraph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ModelNested2TypeGraph _this, Match match, TypeGraph pm) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ModelNested2TypeGraph _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ModelNested2TypeGraph_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_bindingFB(
			ModelNested2TypeGraph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ModelNested2TypeGraph _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
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
			ModelNested2TypeGraph _this) {
		Object[] result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_binding = pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_black = pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_nestedPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOuterModel = _edge_nestedPackage.getSrc();
		if (tmpOuterModel instanceof Model) {
			Model outerModel = (Model) tmpOuterModel;
			EObject tmpModel = _edge_nestedPackage.getTrg();
			if (tmpModel instanceof Model) {
				Model model = (Model) tmpModel;
				if (!model.equals(outerModel)) {
					if (outerModel.getNestedPackages().contains(model)) {
						_result.add(new Object[] { model, outerModel, _edge_nestedPackage });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ModelNested2TypeGraph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ModelNested2TypeGraph _this, Match match, Model model, Model outerModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, model, outerModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ModelNested2TypeGraph _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ModelNested2TypeGraph_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_1_prepare_blackB(ModelNested2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_bindingFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("model");
		EObject _localVariable_1 = sourceMatch.getObject("outerModel");
		EObject _localVariable_2 = targetMatch.getObject("pm");
		EObject tmpModel = _localVariable_0;
		EObject tmpOuterModel = _localVariable_1;
		EObject tmpPm = _localVariable_2;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpOuterModel instanceof Model) {
				Model outerModel = (Model) tmpOuterModel;
				if (tmpPm instanceof TypeGraph) {
					TypeGraph pm = (TypeGraph) tmpPm;
					return new Object[] { model, outerModel, pm, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_blackBBBBB(Model model,
			Model outerModel, TypeGraph pm, Match sourceMatch, Match targetMatch) {
		if (!model.equals(outerModel)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { model, outerModel, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding = pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_bindingFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding != null) {
			Model model = (Model) result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding[0];
			Model outerModel = (Model) result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding[1];
			TypeGraph pm = (TypeGraph) result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_binding[2];

			Object[] result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_black = pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_blackBBBBB(
					model, outerModel, pm, sourceMatch, targetMatch);
			if (result_pattern_ModelNested2TypeGraph_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { model, outerModel, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_3_solvecsp_bindingFBBBBBB(ModelNested2TypeGraph _this,
			Model model, Model outerModel, TypeGraph pm, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_3 = _this.isApplicable_solveCsp_CC(model, outerModel, pm, sourceMatch, targetMatch);
		CSP csp = _localVariable_3;
		if (csp != null) {
			return new Object[] { csp, _this, model, outerModel, pm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_3_solvecsp_bindingAndBlackFBBBBBB(
			ModelNested2TypeGraph _this, Model model, Model outerModel, TypeGraph pm, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ModelNested2TypeGraph_24_3_solvecsp_binding = pattern_ModelNested2TypeGraph_24_3_solvecsp_bindingFBBBBBB(
				_this, model, outerModel, pm, sourceMatch, targetMatch);
		if (result_pattern_ModelNested2TypeGraph_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_24_3_solvecsp_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_24_3_solvecsp_black = pattern_ModelNested2TypeGraph_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, model, outerModel, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_24_5_matchcorrcontext_blackFBBBB(
			Model outerModel, TypeGraph pm, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (Model2TypeGraph outerModel2PM : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(outerModel, Model2TypeGraph.class, "source")) {
				if (pm.equals(outerModel2PM.getTarget())) {
					_result.add(new Object[] { outerModel2PM, outerModel, pm, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_5_matchcorrcontext_greenBBBF(
			Model2TypeGraph outerModel2PM, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ModelNested2TypeGraph";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(outerModel2PM);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { outerModel2PM, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_6_createcorrespondence_blackBBBB(Model model,
			Model outerModel, TypeGraph pm, CCMatch ccMatch) {
		if (!model.equals(outerModel)) {
			return new Object[] { model, outerModel, pm, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_6_createcorrespondence_greenFBBB(Model model,
			TypeGraph pm, CCMatch ccMatch) {
		Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		model2PM.setSource(model);
		model2PM.setTarget(pm);
		ccMatch.getCreateCorr().add(model2PM);
		return new Object[] { model2PM, model, pm, ccMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ModelNested2TypeGraph";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ModelNested2TypeGraph_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_27_1_matchtggpattern_blackBB(Model model,
			Model outerModel) {
		if (!model.equals(outerModel)) {
			if (outerModel.getNestedPackages().contains(model)) {
				return new Object[] { model, outerModel };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_28_1_matchtggpattern_blackB(TypeGraph pm) {
		return new Object[] { pm };
	}

	public static final boolean pattern_ModelNested2TypeGraph_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ModelNested2TypeGraph_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_1_createresult_blackB(ModelNested2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model2TypeGraph outerModel2PM) {
		if (ruleResult.getCorrObjects().contains(outerModel2PM)) {
			return new Object[] { ruleResult, outerModel2PM };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Model outerModel) {
		if (ruleResult.getSourceObjects().contains(outerModel)) {
			return new Object[] { ruleResult, outerModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ModelNested2TypeGraph_29_2_isapplicablecore_blackFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList outerModel2PMList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpOuterModel2PM : outerModel2PMList.getEntryObjects()) {
				if (tmpOuterModel2PM instanceof Model2TypeGraph) {
					Model2TypeGraph outerModel2PM = (Model2TypeGraph) tmpOuterModel2PM;
					Model outerModel = outerModel2PM.getSource();
					if (outerModel != null) {
						if (pattern_ModelNested2TypeGraph_29_2_isapplicablecore_black_nac_0BB(ruleResult,
								outerModel2PM) == null) {
							if (pattern_ModelNested2TypeGraph_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									outerModel) == null) {
								_result.add(new Object[] { outerModel2PMList, outerModel2PM, outerModel,
										ruleEntryContainer, ruleResult });
							}
						}
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_3_solveCSP_bindingFBBBBB(ModelNested2TypeGraph _this,
			IsApplicableMatch isApplicableMatch, Model2TypeGraph outerModel2PM, Model outerModel,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, outerModel2PM, outerModel,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_3_solveCSP_bindingAndBlackFBBBBB(
			ModelNested2TypeGraph _this, IsApplicableMatch isApplicableMatch, Model2TypeGraph outerModel2PM,
			Model outerModel, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ModelNested2TypeGraph_29_3_solveCSP_binding = pattern_ModelNested2TypeGraph_29_3_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, outerModel2PM, outerModel, ruleResult);
		if (result_pattern_ModelNested2TypeGraph_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelNested2TypeGraph_29_3_solveCSP_binding[0];

			Object[] result_pattern_ModelNested2TypeGraph_29_3_solveCSP_black = pattern_ModelNested2TypeGraph_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ModelNested2TypeGraph_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, outerModel2PM, outerModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelNested2TypeGraph_29_4_checkCSP_expressionFBB(ModelNested2TypeGraph _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_5_checknacs_blackBB(Model2TypeGraph outerModel2PM,
			Model outerModel) {
		return new Object[] { outerModel2PM, outerModel };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_6_perform_blackBBB(Model2TypeGraph outerModel2PM,
			Model outerModel, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { outerModel2PM, outerModel, ruleResult };
	}

	public static final Object[] pattern_ModelNested2TypeGraph_29_6_perform_greenFFBFBB(Model outerModel,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		Model model = UMLFactory.eINSTANCE.createModel();
		TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		Object _localVariable_0 = csp.getValue("model", "name");
		Object _localVariable_1 = csp.getValue("pm", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(model2PM);
		model2PM.setSource(model);
		outerModel.getNestedPackages().add(model);
		ruleResult.getSourceObjects().add(model);
		model2PM.setTarget(pm);
		ruleResult.getTargetObjects().add(pm);
		String model_name_prime = (String) _localVariable_0;
		String pm_tName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		model.setName(model_name_prime);
		pm.setTName(pm_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { model2PM, model, outerModel, pm, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ModelNested2TypeGraph_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ModelNested2TypeGraphImpl
