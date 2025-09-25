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

import org.gravity.tgg.pm.uml.Rules.Model2TypeGraph;
import org.gravity.tgg.pm.uml.Rules.RulesPackage;

import org.gravity.tgg.pm.uml.UmlFactory;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TypeGraph;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

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
 * An implementation of the model object '<em><b>Model2 Type Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Model2TypeGraphImpl extends AbstractRuleImpl implements Model2TypeGraph {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model2TypeGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.MODEL2_TYPE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model model) {

		Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_0_1_initialbindings_blackBBB(this, match,
				model);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ".");
		}

		Object[] result2_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_0_2_SolveCSP_bindingAndBlackFBBB(this, match, model);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (Model2TypeGraphImpl.pattern_Model2TypeGraph_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_0_4_collectelementstobetranslated_blackBB(match, model);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ".");
			}
			Model2TypeGraphImpl.pattern_Model2TypeGraph_0_4_collectelementstobetranslated_greenBB(match, model);

			Object[] result5_black = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_0_5_collectcontextelements_blackBB(match, model);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ".");
			}
			// 
			Model2TypeGraphImpl.pattern_Model2TypeGraph_0_6_registerobjectstomatch_expressionBBB(this, match, model);
			return Model2TypeGraphImpl.pattern_Model2TypeGraph_0_7_expressionF();
		} else {
			return Model2TypeGraphImpl.pattern_Model2TypeGraph_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model model = (Model) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_1_1_performtransformation_greenFFBB(model,
				csp);
		org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = (org.gravity.tgg.pm.uml.Model2TypeGraph) result1_green[0];
		TypeGraph pm = (TypeGraph) result1_green[1];

		Object[] result2_black = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_1_2_collecttranslatedelements_blackBBB(model2PM, pm, model);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model2PM] = " + model2PM + ", "
					+ "[pm] = " + pm + ", " + "[model] = " + model + ".");
		}
		Object[] result2_green = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_1_2_collecttranslatedelements_greenFBBB(model2PM, pm, model);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_1_3_bookkeepingforedges_blackBBBB(ruleresult, model2PM, pm, model);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model2PM] = " + model2PM + ", " + "[pm] = " + pm + ", " + "[model] = " + model + ".");
		}
		Model2TypeGraphImpl.pattern_Model2TypeGraph_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, model2PM, pm,
				model);
		//nothing EMoflonEdge model2PM__pm____target = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge model2PM__model____source = (EMoflonEdge) result3_green[5];

		// 
		// 
		Model2TypeGraphImpl.pattern_Model2TypeGraph_1_5_registerobjects_expressionBBBBB(this, ruleresult, model2PM, pm,
				model);
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = Model2TypeGraphImpl.pattern_Model2TypeGraph_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model model = (Model) result2_binding[0];
		for (Object[] result2_black : Model2TypeGraphImpl.pattern_Model2TypeGraph_2_2_corematch_blackBB(model, match)) {
			// ForEach 
			for (Object[] result3_black : Model2TypeGraphImpl.pattern_Model2TypeGraph_2_3_findcontext_blackB(model)) {
				Object[] result3_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_2_3_findcontext_greenBF(model);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = Model2TypeGraphImpl
						.pattern_Model2TypeGraph_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, model);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (Model2TypeGraphImpl.pattern_Model2TypeGraph_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = Model2TypeGraphImpl
							.pattern_Model2TypeGraph_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					Model2TypeGraphImpl.pattern_Model2TypeGraph_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model model) {
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model model) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model model) {// Create CSP
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
		isApplicableMatch.registerObject("model", model);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject model2PM, EObject pm, EObject model) {
		ruleresult.registerObject("model2PM", model2PM);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("model", model);

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

		Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_10_1_initialbindings_blackBBB(this, match,
				pm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ".");
		}

		Object[] result2_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_10_2_SolveCSP_bindingAndBlackFBBB(this, match, pm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (Model2TypeGraphImpl.pattern_Model2TypeGraph_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_10_4_collectelementstobetranslated_blackBB(match, pm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pm] = " + pm + ".");
			}
			Model2TypeGraphImpl.pattern_Model2TypeGraph_10_4_collectelementstobetranslated_greenBB(match, pm);

			Object[] result5_black = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_10_5_collectcontextelements_blackBB(match, pm);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pm] = " + pm + ".");
			}
			// 
			Model2TypeGraphImpl.pattern_Model2TypeGraph_10_6_registerobjectstomatch_expressionBBB(this, match, pm);
			return Model2TypeGraphImpl.pattern_Model2TypeGraph_10_7_expressionF();
		} else {
			return Model2TypeGraphImpl.pattern_Model2TypeGraph_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_11_1_performtransformation_greenFBFB(pm,
				csp);
		org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = (org.gravity.tgg.pm.uml.Model2TypeGraph) result1_green[0];
		Model model = (Model) result1_green[2];

		Object[] result2_black = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_11_2_collecttranslatedelements_blackBBB(model2PM, pm, model);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model2PM] = " + model2PM + ", "
					+ "[pm] = " + pm + ", " + "[model] = " + model + ".");
		}
		Object[] result2_green = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_11_2_collecttranslatedelements_greenFBBB(model2PM, pm, model);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_11_3_bookkeepingforedges_blackBBBB(ruleresult, model2PM, pm, model);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model2PM] = " + model2PM + ", " + "[pm] = " + pm + ", " + "[model] = " + model + ".");
		}
		Model2TypeGraphImpl.pattern_Model2TypeGraph_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, model2PM, pm,
				model);
		//nothing EMoflonEdge model2PM__pm____target = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge model2PM__model____source = (EMoflonEdge) result3_green[5];

		// 
		// 
		Model2TypeGraphImpl.pattern_Model2TypeGraph_11_5_registerobjects_expressionBBBBB(this, ruleresult, model2PM, pm,
				model);
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = Model2TypeGraphImpl.pattern_Model2TypeGraph_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph pm = (TypeGraph) result2_binding[0];
		for (Object[] result2_black : Model2TypeGraphImpl.pattern_Model2TypeGraph_12_2_corematch_blackBB(pm, match)) {
			// ForEach 
			for (Object[] result3_black : Model2TypeGraphImpl.pattern_Model2TypeGraph_12_3_findcontext_blackB(pm)) {
				Object[] result3_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_12_3_findcontext_greenBF(pm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = Model2TypeGraphImpl
						.pattern_Model2TypeGraph_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, pm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pm] = " + pm + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (Model2TypeGraphImpl.pattern_Model2TypeGraph_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = Model2TypeGraphImpl
							.pattern_Model2TypeGraph_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					Model2TypeGraphImpl.pattern_Model2TypeGraph_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_12_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph pm) {// Create CSP
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject model2PM, EObject pm, EObject model) {
		ruleresult.registerObject("model2PM", model2PM);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("model", model);

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
	public EObjectContainer isAppropriate_BWD_TypeGraph_4(TypeGraph pm) {

		Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : Model2TypeGraphImpl
				.pattern_Model2TypeGraph_20_2_testcorematchandDECs_blackB(pm)) {
			Object[] result2_green = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (Model2TypeGraphImpl
					.pattern_Model2TypeGraph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
							pm)) {
				// 
				if (Model2TypeGraphImpl
						.pattern_Model2TypeGraph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = Model2TypeGraphImpl
							.pattern_Model2TypeGraph_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					Model2TypeGraphImpl.pattern_Model2TypeGraph_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_Model_1(Model model) {

		Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : Model2TypeGraphImpl
				.pattern_Model2TypeGraph_21_2_testcorematchandDECs_blackB(model)) {
			Object[] result2_green = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (Model2TypeGraphImpl
					.pattern_Model2TypeGraph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
							model)) {
				// 
				if (Model2TypeGraphImpl
						.pattern_Model2TypeGraph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = Model2TypeGraphImpl
							.pattern_Model2TypeGraph_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					Model2TypeGraphImpl.pattern_Model2TypeGraph_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Model2TypeGraph");
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

		eq0.setRuleName("Model2TypeGraph");
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
		ruleResult.setRule("Model2TypeGraph");
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

		eq0.setRuleName("Model2TypeGraph");
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

		Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TypeGraph pm = (TypeGraph) result2_bindingAndBlack[0];
		Model model = (Model) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_24_3_solvecsp_bindingAndBlackFBBBBB(this, pm, model, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[pm] = " + pm + ", " + "[model] = " + model + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (Model2TypeGraphImpl.pattern_Model2TypeGraph_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : Model2TypeGraphImpl
					.pattern_Model2TypeGraph_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = Model2TypeGraphImpl
						.pattern_Model2TypeGraph_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = Model2TypeGraphImpl
						.pattern_Model2TypeGraph_24_6_createcorrespondence_blackBBB(pm, model, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pm] = " + pm + ", "
							+ "[model] = " + model + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				Model2TypeGraphImpl.pattern_Model2TypeGraph_24_6_createcorrespondence_greenFBBB(pm, model, ccMatch);
				//nothing org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = (org.gravity.tgg.pm.uml.Model2TypeGraph) result6_green[0];

				Object[] result7_black = Model2TypeGraphImpl
						.pattern_Model2TypeGraph_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				Model2TypeGraphImpl.pattern_Model2TypeGraph_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TypeGraph pm, Model model, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Model model) {// 
		Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_27_1_matchtggpattern_blackB(model);
		if (result1_black != null) {
			return Model2TypeGraphImpl.pattern_Model2TypeGraph_27_2_expressionF();
		} else {
			return Model2TypeGraphImpl.pattern_Model2TypeGraph_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph pm) {// 
		Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_28_1_matchtggpattern_blackB(pm);
		if (result1_black != null) {
			return Model2TypeGraphImpl.pattern_Model2TypeGraph_28_2_expressionF();
		} else {
			return Model2TypeGraphImpl.pattern_Model2TypeGraph_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (Model2TypeGraphImpl.pattern_Model2TypeGraph_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				Model2TypeGraphImpl.pattern_Model2TypeGraph_29_6_perform_greenFFFBB(ruleResult, csp);
				//nothing org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = (org.gravity.tgg.pm.uml.Model2TypeGraph) result6_green[0];
				//nothing TypeGraph pm = (TypeGraph) result6_green[1];
				//nothing Model model = (Model) result6_green[2];

			} else {
			}

		} else {
		}
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPROPRIATE_FWD__MATCH_MODEL:
				return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1));
			case RulesPackage.MODEL2_TYPE_GRAPH___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1));
				return null;
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3));
				return null;
			case RulesPackage.MODEL2_TYPE_GRAPH___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH:
				return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1));
			case RulesPackage.MODEL2_TYPE_GRAPH___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1));
				return null;
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3));
				return null;
			case RulesPackage.MODEL2_TYPE_GRAPH___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPROPRIATE_BWD_TYPE_GRAPH_4__TYPEGRAPH:
				return isAppropriate_BWD_TypeGraph_4((TypeGraph) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPROPRIATE_FWD_MODEL_1__MODEL:
				return isAppropriate_FWD_Model_1((Model) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_MODEL_MATCH_MATCH:
				return isApplicable_solveCsp_CC((TypeGraph) arguments.get(0), (Model) arguments.get(1),
						(Match) arguments.get(2), (Match) arguments.get(3));
			case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___CHECK_DEC_FWD__MODEL:
				return checkDEC_FWD((Model) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___CHECK_DEC_BWD__TYPEGRAPH:
				return checkDEC_BWD((TypeGraph) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___GENERATE_MODEL__RULEENTRYCONTAINER:
				return generateModel((RuleEntryContainer) arguments.get(0));
			case RulesPackage.MODEL2_TYPE_GRAPH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(ModelgeneratorRuleResult) arguments.get(1));
			case RulesPackage.MODEL2_TYPE_GRAPH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Model2TypeGraph_0_1_initialbindings_blackBBB(Model2TypeGraph _this,
			Match match, Model model) {
		return new Object[] { _this, match, model };
	}

	public static final Object[] pattern_Model2TypeGraph_0_2_SolveCSP_bindingFBBB(Model2TypeGraph _this, Match match,
			Model model) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, model);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_0_2_SolveCSP_bindingAndBlackFBBB(Model2TypeGraph _this,
			Match match, Model model) {
		Object[] result_pattern_Model2TypeGraph_0_2_SolveCSP_binding = pattern_Model2TypeGraph_0_2_SolveCSP_bindingFBBB(
				_this, match, model);
		if (result_pattern_Model2TypeGraph_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Model2TypeGraph_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Model2TypeGraph_0_2_SolveCSP_black = pattern_Model2TypeGraph_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, model };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_0_3_CheckCSP_expressionFBB(Model2TypeGraph _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_0_4_collectelementstobetranslated_blackBB(Match match,
			Model model) {
		return new Object[] { match, model };
	}

	public static final Object[] pattern_Model2TypeGraph_0_4_collectelementstobetranslated_greenBB(Match match,
			Model model) {
		match.getToBeTranslatedNodes().add(model);
		return new Object[] { match, model };
	}

	public static final Object[] pattern_Model2TypeGraph_0_5_collectcontextelements_blackBB(Match match, Model model) {
		return new Object[] { match, model };
	}

	public static final void pattern_Model2TypeGraph_0_6_registerobjectstomatch_expressionBBB(Model2TypeGraph _this,
			Match match, Model model) {
		_this.registerObjectsToMatch_FWD(match, model);

	}

	public static final boolean pattern_Model2TypeGraph_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject tmpModel = _localVariable_0;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			return new Object[] { model, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_1_1_performtransformation_blackBFBB(Model model,
			Model2TypeGraph _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_1_1_performtransformation_bindingAndBlackFFBB(
			Model2TypeGraph _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Model2TypeGraph_1_1_performtransformation_binding = pattern_Model2TypeGraph_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_Model2TypeGraph_1_1_performtransformation_binding != null) {
			Model model = (Model) result_pattern_Model2TypeGraph_1_1_performtransformation_binding[0];

			Object[] result_pattern_Model2TypeGraph_1_1_performtransformation_black = pattern_Model2TypeGraph_1_1_performtransformation_blackBFBB(
					model, _this, isApplicableMatch);
			if (result_pattern_Model2TypeGraph_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Model2TypeGraph_1_1_performtransformation_black[1];

				return new Object[] { model, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_1_1_performtransformation_greenFFBB(Model model, CSP csp) {
		org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		Object _localVariable_0 = csp.getValue("pm", "tName");
		model2PM.setSource(model);
		model2PM.setTarget(pm);
		String pm_tName_prime = (String) _localVariable_0;
		pm.setTName(pm_tName_prime);
		return new Object[] { model2PM, pm, model, csp };
	}

	public static final Object[] pattern_Model2TypeGraph_1_2_collecttranslatedelements_blackBBB(
			org.gravity.tgg.pm.uml.Model2TypeGraph model2PM, TypeGraph pm, Model model) {
		return new Object[] { model2PM, pm, model };
	}

	public static final Object[] pattern_Model2TypeGraph_1_2_collecttranslatedelements_greenFBBB(
			org.gravity.tgg.pm.uml.Model2TypeGraph model2PM, TypeGraph pm, Model model) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(model2PM);
		ruleresult.getCreatedElements().add(pm);
		ruleresult.getTranslatedElements().add(model);
		return new Object[] { ruleresult, model2PM, pm, model };
	}

	public static final Object[] pattern_Model2TypeGraph_1_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject model2PM, EObject pm, EObject model) {
		if (!model2PM.equals(pm)) {
			if (!model.equals(model2PM)) {
				if (!model.equals(pm)) {
					return new Object[] { ruleresult, model2PM, pm, model };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_1_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject model2PM, EObject pm, EObject model) {
		EMoflonEdge model2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model2PM__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Model2TypeGraph";
		String model2PM__pm____target_name_prime = "target";
		String model2PM__model____source_name_prime = "source";
		model2PM__pm____target.setSrc(model2PM);
		model2PM__pm____target.setTrg(pm);
		ruleresult.getCreatedEdges().add(model2PM__pm____target);
		model2PM__model____source.setSrc(model2PM);
		model2PM__model____source.setTrg(model);
		ruleresult.getCreatedEdges().add(model2PM__model____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model2PM__pm____target.setName(model2PM__pm____target_name_prime);
		model2PM__model____source.setName(model2PM__model____source_name_prime);
		return new Object[] { ruleresult, model2PM, pm, model, model2PM__pm____target, model2PM__model____source };
	}

	public static final void pattern_Model2TypeGraph_1_5_registerobjects_expressionBBBBB(Model2TypeGraph _this,
			PerformRuleResult ruleresult, EObject model2PM, EObject pm, EObject model) {
		_this.registerObjects_FWD(ruleresult, model2PM, pm, model);

	}

	public static final PerformRuleResult pattern_Model2TypeGraph_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_2_1_preparereturnvalue_bindingFB(Model2TypeGraph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_2_1_preparereturnvalue_blackFBB(EClass eClass,
			Model2TypeGraph _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_2_1_preparereturnvalue_bindingAndBlackFFB(
			Model2TypeGraph _this) {
		Object[] result_pattern_Model2TypeGraph_2_1_preparereturnvalue_binding = pattern_Model2TypeGraph_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Model2TypeGraph_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Model2TypeGraph_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Model2TypeGraph_2_1_preparereturnvalue_black = pattern_Model2TypeGraph_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Model2TypeGraph_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Model2TypeGraph_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Model2TypeGraph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Model2TypeGraph_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("model");
		EObject tmpModel = _localVariable_0;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			return new Object[] { model, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_2_2_corematch_blackBB(Model model, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { model, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_2_3_findcontext_blackB(Model model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { model });
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_2_3_findcontext_greenBF(Model model) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(model);
		return new Object[] { model, isApplicableMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_2_4_solveCSP_bindingFBBB(Model2TypeGraph _this,
			IsApplicableMatch isApplicableMatch, Model model) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, model);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_2_4_solveCSP_bindingAndBlackFBBB(Model2TypeGraph _this,
			IsApplicableMatch isApplicableMatch, Model model) {
		Object[] result_pattern_Model2TypeGraph_2_4_solveCSP_binding = pattern_Model2TypeGraph_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, model);
		if (result_pattern_Model2TypeGraph_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Model2TypeGraph_2_4_solveCSP_binding[0];

			Object[] result_pattern_Model2TypeGraph_2_4_solveCSP_black = pattern_Model2TypeGraph_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_2_5_checkCSP_expressionFBB(Model2TypeGraph _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Model2TypeGraph";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Model2TypeGraph_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_10_1_initialbindings_blackBBB(Model2TypeGraph _this,
			Match match, TypeGraph pm) {
		return new Object[] { _this, match, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_10_2_SolveCSP_bindingFBBB(Model2TypeGraph _this, Match match,
			TypeGraph pm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pm };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_10_2_SolveCSP_bindingAndBlackFBBB(Model2TypeGraph _this,
			Match match, TypeGraph pm) {
		Object[] result_pattern_Model2TypeGraph_10_2_SolveCSP_binding = pattern_Model2TypeGraph_10_2_SolveCSP_bindingFBBB(
				_this, match, pm);
		if (result_pattern_Model2TypeGraph_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Model2TypeGraph_10_2_SolveCSP_binding[0];

			Object[] result_pattern_Model2TypeGraph_10_2_SolveCSP_black = pattern_Model2TypeGraph_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_10_3_CheckCSP_expressionFBB(Model2TypeGraph _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_10_4_collectelementstobetranslated_blackBB(Match match,
			TypeGraph pm) {
		return new Object[] { match, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_10_4_collectelementstobetranslated_greenBB(Match match,
			TypeGraph pm) {
		match.getToBeTranslatedNodes().add(pm);
		return new Object[] { match, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_10_5_collectcontextelements_blackBB(Match match,
			TypeGraph pm) {
		return new Object[] { match, pm };
	}

	public static final void pattern_Model2TypeGraph_10_6_registerobjectstomatch_expressionBBB(Model2TypeGraph _this,
			Match match, TypeGraph pm) {
		_this.registerObjectsToMatch_BWD(match, pm);

	}

	public static final boolean pattern_Model2TypeGraph_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pm");
		EObject tmpPm = _localVariable_0;
		if (tmpPm instanceof TypeGraph) {
			TypeGraph pm = (TypeGraph) tmpPm;
			return new Object[] { pm, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_11_1_performtransformation_blackBFBB(TypeGraph pm,
			Model2TypeGraph _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_11_1_performtransformation_bindingAndBlackFFBB(
			Model2TypeGraph _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Model2TypeGraph_11_1_performtransformation_binding = pattern_Model2TypeGraph_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_Model2TypeGraph_11_1_performtransformation_binding != null) {
			TypeGraph pm = (TypeGraph) result_pattern_Model2TypeGraph_11_1_performtransformation_binding[0];

			Object[] result_pattern_Model2TypeGraph_11_1_performtransformation_black = pattern_Model2TypeGraph_11_1_performtransformation_blackBFBB(
					pm, _this, isApplicableMatch);
			if (result_pattern_Model2TypeGraph_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Model2TypeGraph_11_1_performtransformation_black[1];

				return new Object[] { pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_11_1_performtransformation_greenFBFB(TypeGraph pm, CSP csp) {
		org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		Model model = UMLFactory.eINSTANCE.createModel();
		Object _localVariable_0 = csp.getValue("model", "name");
		model2PM.setTarget(pm);
		model2PM.setSource(model);
		String model_name_prime = (String) _localVariable_0;
		model.setName(model_name_prime);
		return new Object[] { model2PM, pm, model, csp };
	}

	public static final Object[] pattern_Model2TypeGraph_11_2_collecttranslatedelements_blackBBB(
			org.gravity.tgg.pm.uml.Model2TypeGraph model2PM, TypeGraph pm, Model model) {
		return new Object[] { model2PM, pm, model };
	}

	public static final Object[] pattern_Model2TypeGraph_11_2_collecttranslatedelements_greenFBBB(
			org.gravity.tgg.pm.uml.Model2TypeGraph model2PM, TypeGraph pm, Model model) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(model2PM);
		ruleresult.getTranslatedElements().add(pm);
		ruleresult.getCreatedElements().add(model);
		return new Object[] { ruleresult, model2PM, pm, model };
	}

	public static final Object[] pattern_Model2TypeGraph_11_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject model2PM, EObject pm, EObject model) {
		if (!model2PM.equals(pm)) {
			if (!model.equals(model2PM)) {
				if (!model.equals(pm)) {
					return new Object[] { ruleresult, model2PM, pm, model };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_11_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject model2PM, EObject pm, EObject model) {
		EMoflonEdge model2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model2PM__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Model2TypeGraph";
		String model2PM__pm____target_name_prime = "target";
		String model2PM__model____source_name_prime = "source";
		model2PM__pm____target.setSrc(model2PM);
		model2PM__pm____target.setTrg(pm);
		ruleresult.getCreatedEdges().add(model2PM__pm____target);
		model2PM__model____source.setSrc(model2PM);
		model2PM__model____source.setTrg(model);
		ruleresult.getCreatedEdges().add(model2PM__model____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model2PM__pm____target.setName(model2PM__pm____target_name_prime);
		model2PM__model____source.setName(model2PM__model____source_name_prime);
		return new Object[] { ruleresult, model2PM, pm, model, model2PM__pm____target, model2PM__model____source };
	}

	public static final void pattern_Model2TypeGraph_11_5_registerobjects_expressionBBBBB(Model2TypeGraph _this,
			PerformRuleResult ruleresult, EObject model2PM, EObject pm, EObject model) {
		_this.registerObjects_BWD(ruleresult, model2PM, pm, model);

	}

	public static final PerformRuleResult pattern_Model2TypeGraph_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_12_1_preparereturnvalue_bindingFB(Model2TypeGraph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_12_1_preparereturnvalue_blackFBB(EClass eClass,
			Model2TypeGraph _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_12_1_preparereturnvalue_bindingAndBlackFFB(
			Model2TypeGraph _this) {
		Object[] result_pattern_Model2TypeGraph_12_1_preparereturnvalue_binding = pattern_Model2TypeGraph_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Model2TypeGraph_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Model2TypeGraph_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Model2TypeGraph_12_1_preparereturnvalue_black = pattern_Model2TypeGraph_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Model2TypeGraph_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Model2TypeGraph_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Model2TypeGraph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Model2TypeGraph_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("pm");
		EObject tmpPm = _localVariable_0;
		if (tmpPm instanceof TypeGraph) {
			TypeGraph pm = (TypeGraph) tmpPm;
			return new Object[] { pm, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_12_2_corematch_blackBB(TypeGraph pm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { pm, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_12_3_findcontext_blackB(TypeGraph pm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { pm });
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_12_3_findcontext_greenBF(TypeGraph pm) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(pm);
		return new Object[] { pm, isApplicableMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_12_4_solveCSP_bindingFBBB(Model2TypeGraph _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pm };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_12_4_solveCSP_bindingAndBlackFBBB(Model2TypeGraph _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pm) {
		Object[] result_pattern_Model2TypeGraph_12_4_solveCSP_binding = pattern_Model2TypeGraph_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, pm);
		if (result_pattern_Model2TypeGraph_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Model2TypeGraph_12_4_solveCSP_binding[0];

			Object[] result_pattern_Model2TypeGraph_12_4_solveCSP_black = pattern_Model2TypeGraph_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_12_5_checkCSP_expressionFBB(Model2TypeGraph _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Model2TypeGraph";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Model2TypeGraph_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_20_1_preparereturnvalue_bindingFB(Model2TypeGraph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			Model2TypeGraph _this) {
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

	public static final Object[] pattern_Model2TypeGraph_20_1_preparereturnvalue_bindingAndBlackFFBF(
			Model2TypeGraph _this) {
		Object[] result_pattern_Model2TypeGraph_20_1_preparereturnvalue_binding = pattern_Model2TypeGraph_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Model2TypeGraph_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Model2TypeGraph_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Model2TypeGraph_20_1_preparereturnvalue_black = pattern_Model2TypeGraph_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Model2TypeGraph_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Model2TypeGraph_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Model2TypeGraph_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_20_2_testcorematchandDECs_blackB(TypeGraph pm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { pm });
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Model2TypeGraph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			Model2TypeGraph _this, Match match, TypeGraph pm) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Model2TypeGraph _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Model2TypeGraph_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_21_1_preparereturnvalue_bindingFB(Model2TypeGraph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			Model2TypeGraph _this) {
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

	public static final Object[] pattern_Model2TypeGraph_21_1_preparereturnvalue_bindingAndBlackFFBF(
			Model2TypeGraph _this) {
		Object[] result_pattern_Model2TypeGraph_21_1_preparereturnvalue_binding = pattern_Model2TypeGraph_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Model2TypeGraph_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Model2TypeGraph_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Model2TypeGraph_21_1_preparereturnvalue_black = pattern_Model2TypeGraph_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Model2TypeGraph_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Model2TypeGraph_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Model2TypeGraph_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_21_2_testcorematchandDECs_blackB(Model model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { model });
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Model2TypeGraph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			Model2TypeGraph _this, Match match, Model model) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, model);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Model2TypeGraph _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Model2TypeGraph_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_24_1_prepare_blackB(Model2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Model2TypeGraph_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Model2TypeGraph_24_2_matchsrctrgcontext_bindingFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("pm");
		EObject _localVariable_1 = sourceMatch.getObject("model");
		EObject tmpPm = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		if (tmpPm instanceof TypeGraph) {
			TypeGraph pm = (TypeGraph) tmpPm;
			if (tmpModel instanceof Model) {
				Model model = (Model) tmpModel;
				return new Object[] { pm, model, targetMatch, sourceMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_24_2_matchsrctrgcontext_blackBBBB(TypeGraph pm, Model model,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { pm, model, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_24_2_matchsrctrgcontext_bindingAndBlackFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_binding = pattern_Model2TypeGraph_24_2_matchsrctrgcontext_bindingFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_binding != null) {
			TypeGraph pm = (TypeGraph) result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_binding[0];
			Model model = (Model) result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_black = pattern_Model2TypeGraph_24_2_matchsrctrgcontext_blackBBBB(
					pm, model, sourceMatch, targetMatch);
			if (result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { pm, model, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_24_3_solvecsp_bindingFBBBBB(Model2TypeGraph _this,
			TypeGraph pm, Model model, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(pm, model, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, pm, model, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_24_3_solvecsp_bindingAndBlackFBBBBB(Model2TypeGraph _this,
			TypeGraph pm, Model model, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Model2TypeGraph_24_3_solvecsp_binding = pattern_Model2TypeGraph_24_3_solvecsp_bindingFBBBBB(
				_this, pm, model, sourceMatch, targetMatch);
		if (result_pattern_Model2TypeGraph_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_Model2TypeGraph_24_3_solvecsp_binding[0];

			Object[] result_pattern_Model2TypeGraph_24_3_solvecsp_black = pattern_Model2TypeGraph_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, pm, model, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "Model2TypeGraph";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_24_6_createcorrespondence_blackBBB(TypeGraph pm, Model model,
			CCMatch ccMatch) {
		return new Object[] { pm, model, ccMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_24_6_createcorrespondence_greenFBBB(TypeGraph pm, Model model,
			CCMatch ccMatch) {
		org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		model2PM.setTarget(pm);
		model2PM.setSource(model);
		ccMatch.getCreateCorr().add(model2PM);
		return new Object[] { model2PM, pm, model, ccMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "Model2TypeGraph";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_Model2TypeGraph_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_27_1_matchtggpattern_blackB(Model model) {
		return new Object[] { model };
	}

	public static final boolean pattern_Model2TypeGraph_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_28_1_matchtggpattern_blackB(TypeGraph pm) {
		return new Object[] { pm };
	}

	public static final boolean pattern_Model2TypeGraph_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_29_1_createresult_blackB(Model2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Model2TypeGraph_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Model2TypeGraph_29_2_isapplicablecore_blackB(Model2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Model2TypeGraph_29_3_solveCSP_bindingFBBB(Model2TypeGraph _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_29_3_solveCSP_bindingAndBlackFBBB(Model2TypeGraph _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Model2TypeGraph_29_3_solveCSP_binding = pattern_Model2TypeGraph_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_Model2TypeGraph_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Model2TypeGraph_29_3_solveCSP_binding[0];

			Object[] result_pattern_Model2TypeGraph_29_3_solveCSP_black = pattern_Model2TypeGraph_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_29_4_checkCSP_expressionFBB(Model2TypeGraph _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_Model2TypeGraph_29_6_perform_greenFFFBB(ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		Model model = UMLFactory.eINSTANCE.createModel();
		Object _localVariable_0 = csp.getValue("pm", "tName");
		Object _localVariable_1 = csp.getValue("model", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(model2PM);
		model2PM.setTarget(pm);
		ruleResult.getTargetObjects().add(pm);
		model2PM.setSource(model);
		ruleResult.getSourceObjects().add(model);
		String pm_tName_prime = (String) _localVariable_0;
		String model_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		pm.setTName(pm_tName_prime);
		model.setName(model_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { model2PM, pm, model, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_Model2TypeGraph_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Model2TypeGraphImpl
