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
import org.gravity.tgg.pm.uml.UmlFactory;
import org.gravity.tgg.pm.uml.Rules.Model2TypeGraph;
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
	@Override
	public boolean isAppropriate_FWD(final Match match, final Model model) {

		final Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_0_1_initialbindings_blackBBB(this, match,
				model);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ".");
		}

		final Object[] result2_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_0_2_SolveCSP_bindingAndBlackFBBB(this, match, model);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ".");
		}
		final CSP csp = (CSP) result2_bindingAndBlack[0];
		//
		if (Model2TypeGraphImpl.pattern_Model2TypeGraph_0_3_CheckCSP_expressionFBB(this, csp)) {

			final Object[] result4_black = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_0_4_collectelementstobetranslated_blackBB(match, model);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ".");
			}
			Model2TypeGraphImpl.pattern_Model2TypeGraph_0_4_collectelementstobetranslated_greenBB(match, model);

			final Object[] result5_black = Model2TypeGraphImpl
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
	@Override
	public PerformRuleResult perform_FWD(final IsApplicableMatch isApplicableMatch) {

		final Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		final Model model = (Model) result1_bindingAndBlack[0];
		final CSP csp = (CSP) result1_bindingAndBlack[1];
		final Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_1_1_performtransformation_greenBFFB(model,
				csp);
		final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = (org.gravity.tgg.pm.uml.Model2TypeGraph) result1_green[1];
		final TypeGraph pm = (TypeGraph) result1_green[2];

		final Object[] result2_black = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_1_2_collecttranslatedelements_blackBBB(model, model2PM, pm);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
					+ "[model2PM] = " + model2PM + ", " + "[pm] = " + pm + ".");
		}
		final Object[] result2_green = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_1_2_collecttranslatedelements_greenFBBB(model, model2PM, pm);
		final PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		final Object[] result3_black = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_1_3_bookkeepingforedges_blackBBBB(ruleresult, model, model2PM, pm);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model] = " + model + ", " + "[model2PM] = " + model2PM + ", " + "[pm] = " + pm + ".");
		}
		Model2TypeGraphImpl.pattern_Model2TypeGraph_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, model, model2PM,
				pm);
		//nothing EMoflonEdge model2PM__pm____target = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge model2PM__model____source = (EMoflonEdge) result3_green[5];

		//
		//
		Model2TypeGraphImpl.pattern_Model2TypeGraph_1_5_registerobjects_expressionBBBBB(this, ruleresult, model,
				model2PM, pm);
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsApplicableRuleResult isApplicable_FWD(final Match match) {

		final Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		final Object[] result1_green = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_2_1_preparereturnvalue_greenBF(performOperation);
		final IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach
		final Object[] result2_binding = Model2TypeGraphImpl.pattern_Model2TypeGraph_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		final Model model = (Model) result2_binding[0];
		for (final Object[] result2_black : Model2TypeGraphImpl.pattern_Model2TypeGraph_2_2_corematch_blackBB(model, match)) {
			// ForEach
			for (final Object[] result3_black : Model2TypeGraphImpl.pattern_Model2TypeGraph_2_3_findcontext_blackB(model)) {
				final Object[] result3_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_2_3_findcontext_greenBF(model);
				final IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				final Object[] result4_bindingAndBlack = Model2TypeGraphImpl
						.pattern_Model2TypeGraph_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, model);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ".");
				}
				final CSP csp = (CSP) result4_bindingAndBlack[0];
				//
				if (Model2TypeGraphImpl.pattern_Model2TypeGraph_2_5_checkCSP_expressionFBB(this, csp)) {

					final Object[] result6_black = Model2TypeGraphImpl
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
	@Override
	public void registerObjectsToMatch_FWD(final Match match, final Model model) {
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSP isAppropriate_solveCsp_FWD(final Match match, final Model model) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(final IsApplicableMatch isApplicableMatch, final Model model) {// Create CSP
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
	public void registerObjects_FWD(final PerformRuleResult ruleresult, final EObject model, final EObject model2PM, final EObject pm) {
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("model2PM", model2PM);
		ruleresult.registerObject("pm", pm);

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

		final Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_10_1_initialbindings_blackBBB(this, match,
				pm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ".");
		}

		final Object[] result2_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_10_2_SolveCSP_bindingAndBlackFBBB(this, match, pm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pm] = " + pm + ".");
		}
		final CSP csp = (CSP) result2_bindingAndBlack[0];
		//
		if (Model2TypeGraphImpl.pattern_Model2TypeGraph_10_3_CheckCSP_expressionFBB(this, csp)) {

			final Object[] result4_black = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_10_4_collectelementstobetranslated_blackBB(match, pm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pm] = " + pm + ".");
			}
			Model2TypeGraphImpl.pattern_Model2TypeGraph_10_4_collectelementstobetranslated_greenBB(match, pm);

			final Object[] result5_black = Model2TypeGraphImpl
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
	@Override
	public PerformRuleResult perform_BWD(final IsApplicableMatch isApplicableMatch) {

		final Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		final TypeGraph pm = (TypeGraph) result1_bindingAndBlack[0];
		final CSP csp = (CSP) result1_bindingAndBlack[1];
		final Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_11_1_performtransformation_greenFFBB(pm,
				csp);
		final Model model = (Model) result1_green[0];
		final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = (org.gravity.tgg.pm.uml.Model2TypeGraph) result1_green[1];

		final Object[] result2_black = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_11_2_collecttranslatedelements_blackBBB(model, model2PM, pm);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
					+ "[model2PM] = " + model2PM + ", " + "[pm] = " + pm + ".");
		}
		final Object[] result2_green = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_11_2_collecttranslatedelements_greenFBBB(model, model2PM, pm);
		final PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		final Object[] result3_black = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_11_3_bookkeepingforedges_blackBBBB(ruleresult, model, model2PM, pm);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model] = " + model + ", " + "[model2PM] = " + model2PM + ", " + "[pm] = " + pm + ".");
		}
		Model2TypeGraphImpl.pattern_Model2TypeGraph_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, model, model2PM,
				pm);
		//nothing EMoflonEdge model2PM__pm____target = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge model2PM__model____source = (EMoflonEdge) result3_green[5];

		//
		//
		Model2TypeGraphImpl.pattern_Model2TypeGraph_11_5_registerobjects_expressionBBBBB(this, ruleresult, model,
				model2PM, pm);
		return Model2TypeGraphImpl.pattern_Model2TypeGraph_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsApplicableRuleResult isApplicable_BWD(final Match match) {

		final Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		final Object[] result1_green = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_12_1_preparereturnvalue_greenBF(performOperation);
		final IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach
		final Object[] result2_binding = Model2TypeGraphImpl.pattern_Model2TypeGraph_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		final TypeGraph pm = (TypeGraph) result2_binding[0];
		for (final Object[] result2_black : Model2TypeGraphImpl.pattern_Model2TypeGraph_12_2_corematch_blackBB(pm, match)) {
			// ForEach
			for (final Object[] result3_black : Model2TypeGraphImpl.pattern_Model2TypeGraph_12_3_findcontext_blackB(pm)) {
				final Object[] result3_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_12_3_findcontext_greenBF(pm);
				final IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				final Object[] result4_bindingAndBlack = Model2TypeGraphImpl
						.pattern_Model2TypeGraph_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, pm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pm] = " + pm + ".");
				}
				final CSP csp = (CSP) result4_bindingAndBlack[0];
				//
				if (Model2TypeGraphImpl.pattern_Model2TypeGraph_12_5_checkCSP_expressionFBB(this, csp)) {

					final Object[] result6_black = Model2TypeGraphImpl
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
	public CSP isApplicable_solveCsp_BWD(final IsApplicableMatch isApplicableMatch, final TypeGraph pm) {// Create CSP
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
	public void registerObjects_BWD(final PerformRuleResult ruleresult, final EObject model, final EObject model2PM, final EObject pm) {
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("model2PM", model2PM);
		ruleresult.registerObject("pm", pm);

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
	public EObjectContainer isAppropriate_BWD_TypeGraph_4(final TypeGraph pm) {

		final Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		final EClass __eClass = (EClass) result1_bindingAndBlack[1];
		final EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		final Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_20_1_preparereturnvalue_greenF();
		final EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach
		for (final Object[] result2_black : Model2TypeGraphImpl
				.pattern_Model2TypeGraph_20_2_testcorematchandDECs_blackB(pm)) {
			final Object[] result2_green = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_20_2_testcorematchandDECs_greenFB(__eClass);
			final Match match = (Match) result2_green[0];

			//
			if (Model2TypeGraphImpl
					.pattern_Model2TypeGraph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
							pm)) {
				//
				if (Model2TypeGraphImpl
						.pattern_Model2TypeGraph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					final Object[] result5_black = Model2TypeGraphImpl
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
	@Override
	public EObjectContainer isAppropriate_FWD_Model_1(final Model model) {

		final Object[] result1_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		final EClass __eClass = (EClass) result1_bindingAndBlack[1];
		final EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		final Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_21_1_preparereturnvalue_greenF();
		final EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach
		for (final Object[] result2_black : Model2TypeGraphImpl
				.pattern_Model2TypeGraph_21_2_testcorematchandDECs_blackB(model)) {
			final Object[] result2_green = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_21_2_testcorematchandDECs_greenFB(__eClass);
			final Match match = (Match) result2_green[0];

			//
			if (Model2TypeGraphImpl
					.pattern_Model2TypeGraph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
							model)) {
				//
				if (Model2TypeGraphImpl
						.pattern_Model2TypeGraph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					final Object[] result5_black = Model2TypeGraphImpl
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
	@Override
	public AttributeConstraintsRuleResult checkAttributes_FWD(final TripleMatch __tripleMatch) {
		final AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Model2TypeGraph");
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
	@Override
	public AttributeConstraintsRuleResult checkAttributes_BWD(final TripleMatch __tripleMatch) {
		final AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Model2TypeGraph");
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
	@Override
	public IsApplicableRuleResult isApplicable_CC(final Match sourceMatch, final Match targetMatch) {

		final Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_24_1_prepare_greenF();
		final IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		final Object[] result2_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		final Model model = (Model) result2_bindingAndBlack[0];
		final TypeGraph pm = (TypeGraph) result2_bindingAndBlack[1];

		final Object[] result3_bindingAndBlack = Model2TypeGraphImpl
				.pattern_Model2TypeGraph_24_3_solvecsp_bindingAndBlackFBBBBB(this, model, pm, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[model] = " + model + ", " + "[pm] = " + pm + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		final CSP csp = (CSP) result3_bindingAndBlack[0];
		//
		if (Model2TypeGraphImpl.pattern_Model2TypeGraph_24_4_checkCSP_expressionFB(csp)) {
			// ForEach
			for (final Object[] result5_black : Model2TypeGraphImpl
					.pattern_Model2TypeGraph_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				final Object[] result5_green = Model2TypeGraphImpl
						.pattern_Model2TypeGraph_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				final CCMatch ccMatch = (CCMatch) result5_green[2];

				final Object[] result6_black = Model2TypeGraphImpl
						.pattern_Model2TypeGraph_24_6_createcorrespondence_blackBBB(model, pm, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
							+ "[pm] = " + pm + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				Model2TypeGraphImpl.pattern_Model2TypeGraph_24_6_createcorrespondence_greenBFBB(model, pm, ccMatch);
				//nothing org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = (org.gravity.tgg.pm.uml.Model2TypeGraph) result6_green[1];

				final Object[] result7_black = Model2TypeGraphImpl
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
	@Override
	public CSP isApplicable_solveCsp_CC(final Model model, final TypeGraph pm, final Match sourceMatch, final Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(final Model model) {//
		final Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_27_1_matchtggpattern_blackB(model);
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
	@Override
	public boolean checkDEC_BWD(final TypeGraph pm) {//
		final Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_28_1_matchtggpattern_blackB(pm);
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
	@Override
	public ModelgeneratorRuleResult generateModel(final RuleEntryContainer ruleEntryContainer) {

		final Object[] result1_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final Object[] result1_green = Model2TypeGraphImpl.pattern_Model2TypeGraph_29_1_createresult_greenFF();
		final IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		final ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		//
		final Object[] result2_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			final Object[] result3_bindingAndBlack = Model2TypeGraphImpl
					.pattern_Model2TypeGraph_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			final CSP csp = (CSP) result3_bindingAndBlack[0];
			//
			if (Model2TypeGraphImpl.pattern_Model2TypeGraph_29_4_checkCSP_expressionFBB(this, csp)) {
				//

				final Object[] result6_black = Model2TypeGraphImpl.pattern_Model2TypeGraph_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				Model2TypeGraphImpl.pattern_Model2TypeGraph_29_6_perform_greenFFFBB(ruleResult, csp);
				//nothing Model model = (Model) result6_green[0];
				//nothing org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = (org.gravity.tgg.pm.uml.Model2TypeGraph) result6_green[1];
				//nothing TypeGraph pm = (TypeGraph) result6_green[2];

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
	@Override
	public CSP generateModel_solveCsp_BWD(final IsApplicableMatch isApplicableMatch, final ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		case RulesPackage.MODEL2_TYPE_GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_TYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (TypeGraph) arguments.get(1),
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

	public static final Object[] pattern_Model2TypeGraph_0_1_initialbindings_blackBBB(final Model2TypeGraph _this,
			final Match match, final Model model) {
		return new Object[] { _this, match, model };
	}

	public static final Object[] pattern_Model2TypeGraph_0_2_SolveCSP_bindingFBBB(final Model2TypeGraph _this, final Match match,
			final Model model) {
		final CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, model);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_0_2_SolveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_0_2_SolveCSP_bindingAndBlackFBBB(final Model2TypeGraph _this,
			final Match match, final Model model) {
		final Object[] result_pattern_Model2TypeGraph_0_2_SolveCSP_binding = pattern_Model2TypeGraph_0_2_SolveCSP_bindingFBBB(
				_this, match, model);
		if (result_pattern_Model2TypeGraph_0_2_SolveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_Model2TypeGraph_0_2_SolveCSP_binding[0];

			final Object[] result_pattern_Model2TypeGraph_0_2_SolveCSP_black = pattern_Model2TypeGraph_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, model };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_0_3_CheckCSP_expressionFBB(final Model2TypeGraph _this, final CSP csp) {
		final boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_0_4_collectelementstobetranslated_blackBB(final Match match,
			final Model model) {
		return new Object[] { match, model };
	}

	public static final Object[] pattern_Model2TypeGraph_0_4_collectelementstobetranslated_greenBB(final Match match,
			final Model model) {
		match.getToBeTranslatedNodes().add(model);
		return new Object[] { match, model };
	}

	public static final Object[] pattern_Model2TypeGraph_0_5_collectcontextelements_blackBB(final Match match, final Model model) {
		return new Object[] { match, model };
	}

	public static final void pattern_Model2TypeGraph_0_6_registerobjectstomatch_expressionBBB(final Model2TypeGraph _this,
			final Match match, final Model model) {
		_this.registerObjectsToMatch_FWD(match, model);

	}

	public static final boolean pattern_Model2TypeGraph_0_7_expressionF() {
		final boolean _result = true;
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_0_8_expressionF() {
		final boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_1_1_performtransformation_bindingFB(
			final IsApplicableMatch isApplicableMatch) {
		final EObject _localVariable_0 = isApplicableMatch.getObject("model");
		final EObject tmpModel = _localVariable_0;
		if (tmpModel instanceof Model) {
			final Model model = (Model) tmpModel;
			return new Object[] { model, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_1_1_performtransformation_blackBFBB(final Model model,
			final Model2TypeGraph _this, final IsApplicableMatch isApplicableMatch) {
		for (final EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				final CSP csp = (CSP) tmpCsp;
				return new Object[] { model, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_1_1_performtransformation_bindingAndBlackFFBB(
			final Model2TypeGraph _this, final IsApplicableMatch isApplicableMatch) {
		final Object[] result_pattern_Model2TypeGraph_1_1_performtransformation_binding = pattern_Model2TypeGraph_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_Model2TypeGraph_1_1_performtransformation_binding != null) {
			final Model model = (Model) result_pattern_Model2TypeGraph_1_1_performtransformation_binding[0];

			final Object[] result_pattern_Model2TypeGraph_1_1_performtransformation_black = pattern_Model2TypeGraph_1_1_performtransformation_blackBFBB(
					model, _this, isApplicableMatch);
			if (result_pattern_Model2TypeGraph_1_1_performtransformation_black != null) {
				final CSP csp = (CSP) result_pattern_Model2TypeGraph_1_1_performtransformation_black[1];

				return new Object[] { model, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_1_1_performtransformation_greenBFFB(final Model model, final CSP csp) {
		final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		final TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		final Object _localVariable_0 = csp.getValue("pm", "tName");
		model2PM.setSource(model);
		model2PM.setTarget(pm);
		final String pm_tName_prime = (String) _localVariable_0;
		pm.setTName(pm_tName_prime);
		return new Object[] { model, model2PM, pm, csp };
	}

	public static final Object[] pattern_Model2TypeGraph_1_2_collecttranslatedelements_blackBBB(final Model model,
			final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM, final TypeGraph pm) {
		return new Object[] { model, model2PM, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_1_2_collecttranslatedelements_greenFBBB(final Model model,
			final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM, final TypeGraph pm) {
		final PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(model);
		ruleresult.getCreatedLinkElements().add(model2PM);
		ruleresult.getCreatedElements().add(pm);
		return new Object[] { ruleresult, model, model2PM, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_1_3_bookkeepingforedges_blackBBBB(final PerformRuleResult ruleresult,
			final EObject model, final EObject model2PM, final EObject pm) {
		if (!model.equals(model2PM) && !model.equals(pm)) {
			if (!model2PM.equals(pm)) {
				return new Object[] { ruleresult, model, model2PM, pm };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_1_3_bookkeepingforedges_greenBBBBFF(
			final PerformRuleResult ruleresult, final EObject model, final EObject model2PM, final EObject pm) {
		final EMoflonEdge model2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge model2PM__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final String ruleresult_ruleName_prime = "Model2TypeGraph";
		final String model2PM__pm____target_name_prime = "target";
		final String model2PM__model____source_name_prime = "source";
		model2PM__pm____target.setSrc(model2PM);
		model2PM__pm____target.setTrg(pm);
		ruleresult.getCreatedEdges().add(model2PM__pm____target);
		model2PM__model____source.setSrc(model2PM);
		model2PM__model____source.setTrg(model);
		ruleresult.getCreatedEdges().add(model2PM__model____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model2PM__pm____target.setName(model2PM__pm____target_name_prime);
		model2PM__model____source.setName(model2PM__model____source_name_prime);
		return new Object[] { ruleresult, model, model2PM, pm, model2PM__pm____target, model2PM__model____source };
	}

	public static final void pattern_Model2TypeGraph_1_5_registerobjects_expressionBBBBB(final Model2TypeGraph _this,
			final PerformRuleResult ruleresult, final EObject model, final EObject model2PM, final EObject pm) {
		_this.registerObjects_FWD(ruleresult, model, model2PM, pm);

	}

	public static final PerformRuleResult pattern_Model2TypeGraph_1_6_expressionFB(final PerformRuleResult ruleresult) {
		final PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_2_1_preparereturnvalue_bindingFB(final Model2TypeGraph _this) {
		final EClass _localVariable_0 = _this.eClass();
		final EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_2_1_preparereturnvalue_blackFBB(final EClass eClass,
			final Model2TypeGraph _this) {
		for (final EOperation performOperation : eClass.getEOperations()) {
			final String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_2_1_preparereturnvalue_bindingAndBlackFFB(
			final Model2TypeGraph _this) {
		final Object[] result_pattern_Model2TypeGraph_2_1_preparereturnvalue_binding = pattern_Model2TypeGraph_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Model2TypeGraph_2_1_preparereturnvalue_binding != null) {
			final EClass eClass = (EClass) result_pattern_Model2TypeGraph_2_1_preparereturnvalue_binding[0];

			final Object[] result_pattern_Model2TypeGraph_2_1_preparereturnvalue_black = pattern_Model2TypeGraph_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Model2TypeGraph_2_1_preparereturnvalue_black != null) {
				final EOperation performOperation = (EOperation) result_pattern_Model2TypeGraph_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_2_1_preparereturnvalue_greenBF(final EOperation performOperation) {
		final IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		final boolean ruleresult_success_prime = false;
		final String ruleresult_rule_prime = "Model2TypeGraph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(ruleresult_success_prime);
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Model2TypeGraph_2_2_corematch_bindingFB(final Match match) {
		final EObject _localVariable_0 = match.getObject("model");
		final EObject tmpModel = _localVariable_0;
		if (tmpModel instanceof Model) {
			final Model model = (Model) tmpModel;
			return new Object[] { model, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_2_2_corematch_blackBB(final Model model, final Match match) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		_result.add(new Object[] { model, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_2_3_findcontext_blackB(final Model model) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		_result.add(new Object[] { model });
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_2_3_findcontext_greenBF(final Model model) {
		final IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(model);
		return new Object[] { model, isApplicableMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_2_4_solveCSP_bindingFBBB(final Model2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch, final Model model) {
		final CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, model);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_2_4_solveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_2_4_solveCSP_bindingAndBlackFBBB(final Model2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch, final Model model) {
		final Object[] result_pattern_Model2TypeGraph_2_4_solveCSP_binding = pattern_Model2TypeGraph_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, model);
		if (result_pattern_Model2TypeGraph_2_4_solveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_Model2TypeGraph_2_4_solveCSP_binding[0];

			final Object[] result_pattern_Model2TypeGraph_2_4_solveCSP_black = pattern_Model2TypeGraph_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_2_5_checkCSP_expressionFBB(final Model2TypeGraph _this, final CSP csp) {
		final boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_2_6_addmatchtoruleresult_blackBB(
			final IsApplicableRuleResult ruleresult, final IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_2_6_addmatchtoruleresult_greenBB(
			final IsApplicableRuleResult ruleresult, final IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		final boolean ruleresult_success_prime = true;
		final String isApplicableMatch_ruleName_prime = "Model2TypeGraph";
		ruleresult.setSuccess(ruleresult_success_prime);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Model2TypeGraph_2_7_expressionFB(
			final IsApplicableRuleResult ruleresult) {
		final IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_10_1_initialbindings_blackBBB(final Model2TypeGraph _this,
			final Match match, final TypeGraph pm) {
		return new Object[] { _this, match, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_10_2_SolveCSP_bindingFBBB(final Model2TypeGraph _this, final Match match,
			final TypeGraph pm) {
		final CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pm);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pm };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_10_2_SolveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_10_2_SolveCSP_bindingAndBlackFBBB(final Model2TypeGraph _this,
			final Match match, final TypeGraph pm) {
		final Object[] result_pattern_Model2TypeGraph_10_2_SolveCSP_binding = pattern_Model2TypeGraph_10_2_SolveCSP_bindingFBBB(
				_this, match, pm);
		if (result_pattern_Model2TypeGraph_10_2_SolveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_Model2TypeGraph_10_2_SolveCSP_binding[0];

			final Object[] result_pattern_Model2TypeGraph_10_2_SolveCSP_black = pattern_Model2TypeGraph_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_10_3_CheckCSP_expressionFBB(final Model2TypeGraph _this, final CSP csp) {
		final boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_10_4_collectelementstobetranslated_blackBB(final Match match,
			final TypeGraph pm) {
		return new Object[] { match, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_10_4_collectelementstobetranslated_greenBB(final Match match,
			final TypeGraph pm) {
		match.getToBeTranslatedNodes().add(pm);
		return new Object[] { match, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_10_5_collectcontextelements_blackBB(final Match match,
			final TypeGraph pm) {
		return new Object[] { match, pm };
	}

	public static final void pattern_Model2TypeGraph_10_6_registerobjectstomatch_expressionBBB(final Model2TypeGraph _this,
			final Match match, final TypeGraph pm) {
		_this.registerObjectsToMatch_BWD(match, pm);

	}

	public static final boolean pattern_Model2TypeGraph_10_7_expressionF() {
		final boolean _result = true;
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_10_8_expressionF() {
		final boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_11_1_performtransformation_bindingFB(
			final IsApplicableMatch isApplicableMatch) {
		final EObject _localVariable_0 = isApplicableMatch.getObject("pm");
		final EObject tmpPm = _localVariable_0;
		if (tmpPm instanceof TypeGraph) {
			final TypeGraph pm = (TypeGraph) tmpPm;
			return new Object[] { pm, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_11_1_performtransformation_blackBFBB(final TypeGraph pm,
			final Model2TypeGraph _this, final IsApplicableMatch isApplicableMatch) {
		for (final EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				final CSP csp = (CSP) tmpCsp;
				return new Object[] { pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_11_1_performtransformation_bindingAndBlackFFBB(
			final Model2TypeGraph _this, final IsApplicableMatch isApplicableMatch) {
		final Object[] result_pattern_Model2TypeGraph_11_1_performtransformation_binding = pattern_Model2TypeGraph_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_Model2TypeGraph_11_1_performtransformation_binding != null) {
			final TypeGraph pm = (TypeGraph) result_pattern_Model2TypeGraph_11_1_performtransformation_binding[0];

			final Object[] result_pattern_Model2TypeGraph_11_1_performtransformation_black = pattern_Model2TypeGraph_11_1_performtransformation_blackBFBB(
					pm, _this, isApplicableMatch);
			if (result_pattern_Model2TypeGraph_11_1_performtransformation_black != null) {
				final CSP csp = (CSP) result_pattern_Model2TypeGraph_11_1_performtransformation_black[1];

				return new Object[] { pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_11_1_performtransformation_greenFFBB(final TypeGraph pm, final CSP csp) {
		final Model model = UMLFactory.eINSTANCE.createModel();
		final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		final Object _localVariable_0 = csp.getValue("model", "name");
		model2PM.setTarget(pm);
		model2PM.setSource(model);
		final String model_name_prime = (String) _localVariable_0;
		model.setName(model_name_prime);
		return new Object[] { model, model2PM, pm, csp };
	}

	public static final Object[] pattern_Model2TypeGraph_11_2_collecttranslatedelements_blackBBB(final Model model,
			final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM, final TypeGraph pm) {
		return new Object[] { model, model2PM, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_11_2_collecttranslatedelements_greenFBBB(final Model model,
			final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM, final TypeGraph pm) {
		final PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(model);
		ruleresult.getCreatedLinkElements().add(model2PM);
		ruleresult.getTranslatedElements().add(pm);
		return new Object[] { ruleresult, model, model2PM, pm };
	}

	public static final Object[] pattern_Model2TypeGraph_11_3_bookkeepingforedges_blackBBBB(
			final PerformRuleResult ruleresult, final EObject model, final EObject model2PM, final EObject pm) {
		if (!model.equals(model2PM) && !model.equals(pm)) {
			if (!model2PM.equals(pm)) {
				return new Object[] { ruleresult, model, model2PM, pm };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_11_3_bookkeepingforedges_greenBBBBFF(
			final PerformRuleResult ruleresult, final EObject model, final EObject model2PM, final EObject pm) {
		final EMoflonEdge model2PM__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final EMoflonEdge model2PM__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		final String ruleresult_ruleName_prime = "Model2TypeGraph";
		final String model2PM__pm____target_name_prime = "target";
		final String model2PM__model____source_name_prime = "source";
		model2PM__pm____target.setSrc(model2PM);
		model2PM__pm____target.setTrg(pm);
		ruleresult.getCreatedEdges().add(model2PM__pm____target);
		model2PM__model____source.setSrc(model2PM);
		model2PM__model____source.setTrg(model);
		ruleresult.getCreatedEdges().add(model2PM__model____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model2PM__pm____target.setName(model2PM__pm____target_name_prime);
		model2PM__model____source.setName(model2PM__model____source_name_prime);
		return new Object[] { ruleresult, model, model2PM, pm, model2PM__pm____target, model2PM__model____source };
	}

	public static final void pattern_Model2TypeGraph_11_5_registerobjects_expressionBBBBB(final Model2TypeGraph _this,
			final PerformRuleResult ruleresult, final EObject model, final EObject model2PM, final EObject pm) {
		_this.registerObjects_BWD(ruleresult, model, model2PM, pm);

	}

	public static final PerformRuleResult pattern_Model2TypeGraph_11_6_expressionFB(final PerformRuleResult ruleresult) {
		final PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_12_1_preparereturnvalue_bindingFB(final Model2TypeGraph _this) {
		final EClass _localVariable_0 = _this.eClass();
		final EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_12_1_preparereturnvalue_blackFBB(final EClass eClass,
			final Model2TypeGraph _this) {
		for (final EOperation performOperation : eClass.getEOperations()) {
			final String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_12_1_preparereturnvalue_bindingAndBlackFFB(
			final Model2TypeGraph _this) {
		final Object[] result_pattern_Model2TypeGraph_12_1_preparereturnvalue_binding = pattern_Model2TypeGraph_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Model2TypeGraph_12_1_preparereturnvalue_binding != null) {
			final EClass eClass = (EClass) result_pattern_Model2TypeGraph_12_1_preparereturnvalue_binding[0];

			final Object[] result_pattern_Model2TypeGraph_12_1_preparereturnvalue_black = pattern_Model2TypeGraph_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Model2TypeGraph_12_1_preparereturnvalue_black != null) {
				final EOperation performOperation = (EOperation) result_pattern_Model2TypeGraph_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_12_1_preparereturnvalue_greenBF(final EOperation performOperation) {
		final IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		final boolean ruleresult_success_prime = false;
		final String ruleresult_rule_prime = "Model2TypeGraph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(ruleresult_success_prime);
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Model2TypeGraph_12_2_corematch_bindingFB(final Match match) {
		final EObject _localVariable_0 = match.getObject("pm");
		final EObject tmpPm = _localVariable_0;
		if (tmpPm instanceof TypeGraph) {
			final TypeGraph pm = (TypeGraph) tmpPm;
			return new Object[] { pm, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_12_2_corematch_blackBB(final TypeGraph pm, final Match match) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		_result.add(new Object[] { pm, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_12_3_findcontext_blackB(final TypeGraph pm) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		_result.add(new Object[] { pm });
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_12_3_findcontext_greenBF(final TypeGraph pm) {
		final IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(pm);
		return new Object[] { pm, isApplicableMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_12_4_solveCSP_bindingFBBB(final Model2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch, final TypeGraph pm) {
		final CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pm);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pm };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_12_4_solveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_12_4_solveCSP_bindingAndBlackFBBB(final Model2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch, final TypeGraph pm) {
		final Object[] result_pattern_Model2TypeGraph_12_4_solveCSP_binding = pattern_Model2TypeGraph_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, pm);
		if (result_pattern_Model2TypeGraph_12_4_solveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_Model2TypeGraph_12_4_solveCSP_binding[0];

			final Object[] result_pattern_Model2TypeGraph_12_4_solveCSP_black = pattern_Model2TypeGraph_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_12_5_checkCSP_expressionFBB(final Model2TypeGraph _this, final CSP csp) {
		final boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_12_6_addmatchtoruleresult_blackBB(
			final IsApplicableRuleResult ruleresult, final IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_12_6_addmatchtoruleresult_greenBB(
			final IsApplicableRuleResult ruleresult, final IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		final boolean ruleresult_success_prime = true;
		final String isApplicableMatch_ruleName_prime = "Model2TypeGraph";
		ruleresult.setSuccess(ruleresult_success_prime);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Model2TypeGraph_12_7_expressionFB(
			final IsApplicableRuleResult ruleresult) {
		final IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_20_1_preparereturnvalue_bindingFB(final Model2TypeGraph _this) {
		final EClass _localVariable_0 = _this.eClass();
		final EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_20_1_preparereturnvalue_blackFBBF(final EClass __eClass,
			final Model2TypeGraph _this) {
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

	public static final Object[] pattern_Model2TypeGraph_20_1_preparereturnvalue_bindingAndBlackFFBF(
			final Model2TypeGraph _this) {
		final Object[] result_pattern_Model2TypeGraph_20_1_preparereturnvalue_binding = pattern_Model2TypeGraph_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Model2TypeGraph_20_1_preparereturnvalue_binding != null) {
			final EClass __eClass = (EClass) result_pattern_Model2TypeGraph_20_1_preparereturnvalue_binding[0];

			final Object[] result_pattern_Model2TypeGraph_20_1_preparereturnvalue_black = pattern_Model2TypeGraph_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Model2TypeGraph_20_1_preparereturnvalue_black != null) {
				final EOperation __performOperation = (EOperation) result_pattern_Model2TypeGraph_20_1_preparereturnvalue_black[0];
				final EOperation isApplicableCC = (EOperation) result_pattern_Model2TypeGraph_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_20_1_preparereturnvalue_greenF() {
		final EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_20_2_testcorematchandDECs_blackB(final TypeGraph pm) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		_result.add(new Object[] { pm });
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_20_2_testcorematchandDECs_greenFB(final EClass __eClass) {
		final Match match = RuntimeFactory.eINSTANCE.createMatch();
		final String __eClass_name = __eClass.getName();
		final String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Model2TypeGraph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			final Model2TypeGraph _this, final Match match, final TypeGraph pm) {
		final boolean _localVariable_0 = _this.isAppropriate_BWD(match, pm);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			final Model2TypeGraph _this, final Match match) {
		final boolean _localVariable_0 = _this.checkTypes_BWD(match);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_20_5_Addmatchtoruleresult_blackBBBB(final Match match,
			final EOperation __performOperation, final EObjectContainer __result, final EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_20_5_Addmatchtoruleresult_greenBBBB(final Match match,
			final EOperation __performOperation, final EObjectContainer __result, final EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Model2TypeGraph_20_6_expressionFB(final EObjectContainer __result) {
		final EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_21_1_preparereturnvalue_bindingFB(final Model2TypeGraph _this) {
		final EClass _localVariable_0 = _this.eClass();
		final EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_21_1_preparereturnvalue_blackFBBF(final EClass __eClass,
			final Model2TypeGraph _this) {
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

	public static final Object[] pattern_Model2TypeGraph_21_1_preparereturnvalue_bindingAndBlackFFBF(
			final Model2TypeGraph _this) {
		final Object[] result_pattern_Model2TypeGraph_21_1_preparereturnvalue_binding = pattern_Model2TypeGraph_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Model2TypeGraph_21_1_preparereturnvalue_binding != null) {
			final EClass __eClass = (EClass) result_pattern_Model2TypeGraph_21_1_preparereturnvalue_binding[0];

			final Object[] result_pattern_Model2TypeGraph_21_1_preparereturnvalue_black = pattern_Model2TypeGraph_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Model2TypeGraph_21_1_preparereturnvalue_black != null) {
				final EOperation __performOperation = (EOperation) result_pattern_Model2TypeGraph_21_1_preparereturnvalue_black[0];
				final EOperation isApplicableCC = (EOperation) result_pattern_Model2TypeGraph_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_21_1_preparereturnvalue_greenF() {
		final EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_21_2_testcorematchandDECs_blackB(final Model model) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		_result.add(new Object[] { model });
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_21_2_testcorematchandDECs_greenFB(final EClass __eClass) {
		final Match match = RuntimeFactory.eINSTANCE.createMatch();
		final String __eClass_name = __eClass.getName();
		final String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Model2TypeGraph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			final Model2TypeGraph _this, final Match match, final Model model) {
		final boolean _localVariable_0 = _this.isAppropriate_FWD(match, model);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			final Model2TypeGraph _this, final Match match) {
		final boolean _localVariable_0 = _this.checkTypes_FWD(match);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_21_5_Addmatchtoruleresult_blackBBBB(final Match match,
			final EOperation __performOperation, final EObjectContainer __result, final EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_21_5_Addmatchtoruleresult_greenBBBB(final Match match,
			final EOperation __performOperation, final EObjectContainer __result, final EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Model2TypeGraph_21_6_expressionFB(final EObjectContainer __result) {
		final EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_24_1_prepare_blackB(final Model2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Model2TypeGraph_24_1_prepare_greenF() {
		final IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Model2TypeGraph_24_2_matchsrctrgcontext_bindingFFBB(final Match sourceMatch,
			final Match targetMatch) {
		final EObject _localVariable_0 = sourceMatch.getObject("model");
		final EObject _localVariable_1 = targetMatch.getObject("pm");
		final EObject tmpModel = _localVariable_0;
		final EObject tmpPm = _localVariable_1;
		if (tmpModel instanceof Model) {
			final Model model = (Model) tmpModel;
			if (tmpPm instanceof TypeGraph) {
				final TypeGraph pm = (TypeGraph) tmpPm;
				return new Object[] { model, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_24_2_matchsrctrgcontext_blackBBBB(final Model model, final TypeGraph pm,
			final Match sourceMatch, final Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { model, pm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_24_2_matchsrctrgcontext_bindingAndBlackFFBB(final Match sourceMatch,
			final Match targetMatch) {
		final Object[] result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_binding = pattern_Model2TypeGraph_24_2_matchsrctrgcontext_bindingFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_binding != null) {
			final Model model = (Model) result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_binding[0];
			final TypeGraph pm = (TypeGraph) result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_binding[1];

			final Object[] result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_black = pattern_Model2TypeGraph_24_2_matchsrctrgcontext_blackBBBB(
					model, pm, sourceMatch, targetMatch);
			if (result_pattern_Model2TypeGraph_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { model, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_24_3_solvecsp_bindingFBBBBB(final Model2TypeGraph _this, final Model model,
			final TypeGraph pm, final Match sourceMatch, final Match targetMatch) {
		final CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(model, pm, sourceMatch, targetMatch);
		final CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, model, pm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_24_3_solvecsp_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_24_3_solvecsp_bindingAndBlackFBBBBB(final Model2TypeGraph _this,
			final Model model, final TypeGraph pm, final Match sourceMatch, final Match targetMatch) {
		final Object[] result_pattern_Model2TypeGraph_24_3_solvecsp_binding = pattern_Model2TypeGraph_24_3_solvecsp_bindingFBBBBB(
				_this, model, pm, sourceMatch, targetMatch);
		if (result_pattern_Model2TypeGraph_24_3_solvecsp_binding != null) {
			final CSP csp = (CSP) result_pattern_Model2TypeGraph_24_3_solvecsp_binding[0];

			final Object[] result_pattern_Model2TypeGraph_24_3_solvecsp_black = pattern_Model2TypeGraph_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, model, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_24_4_checkCSP_expressionFB(final CSP csp) {
		final boolean _localVariable_0 = csp.check();
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Iterable<Object[]> pattern_Model2TypeGraph_24_5_matchcorrcontext_blackBB(final Match sourceMatch,
			final Match targetMatch) {
		final LinkedList<Object[]> _result = new LinkedList<>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_24_5_matchcorrcontext_greenBBF(final Match sourceMatch,
			final Match targetMatch) {
		final CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		final String ccMatch_ruleName_prime = "Model2TypeGraph";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_24_6_createcorrespondence_blackBBB(final Model model, final TypeGraph pm,
			final CCMatch ccMatch) {
		return new Object[] { model, pm, ccMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_24_6_createcorrespondence_greenBFBB(final Model model, final TypeGraph pm,
			final CCMatch ccMatch) {
		final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		model2PM.setTarget(pm);
		model2PM.setSource(model);
		ccMatch.getCreateCorr().add(model2PM);
		return new Object[] { model, model2PM, pm, ccMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_24_7_addtoreturnedresult_blackBB(final IsApplicableRuleResult result,
			final CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_Model2TypeGraph_24_7_addtoreturnedresult_greenBB(final IsApplicableRuleResult result,
			final CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		final boolean result_success_prime = true;
		final String ccMatch_ruleName_prime = "Model2TypeGraph";
		result.setSuccess(result_success_prime);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_Model2TypeGraph_24_8_expressionFB(
			final IsApplicableRuleResult result) {
		final IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_27_1_matchtggpattern_blackB(final Model model) {
		return new Object[] { model };
	}

	public static final boolean pattern_Model2TypeGraph_27_2_expressionF() {
		final boolean _result = true;
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_27_3_expressionF() {
		final boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_28_1_matchtggpattern_blackB(final TypeGraph pm) {
		return new Object[] { pm };
	}

	public static final boolean pattern_Model2TypeGraph_28_2_expressionF() {
		final boolean _result = true;
		return _result;
	}

	public static final boolean pattern_Model2TypeGraph_28_3_expressionF() {
		final boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_29_1_createresult_blackB(final Model2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Model2TypeGraph_29_1_createresult_greenFF() {
		final IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		final ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		final boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(ruleResult_success_prime);
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Model2TypeGraph_29_2_isapplicablecore_blackB(final Model2TypeGraph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Model2TypeGraph_29_3_solveCSP_bindingFBBB(final Model2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch, final ModelgeneratorRuleResult ruleResult) {
		final CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		final CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Model2TypeGraph_29_3_solveCSP_blackB(final CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Model2TypeGraph_29_3_solveCSP_bindingAndBlackFBBB(final Model2TypeGraph _this,
			final IsApplicableMatch isApplicableMatch, final ModelgeneratorRuleResult ruleResult) {
		final Object[] result_pattern_Model2TypeGraph_29_3_solveCSP_binding = pattern_Model2TypeGraph_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_Model2TypeGraph_29_3_solveCSP_binding != null) {
			final CSP csp = (CSP) result_pattern_Model2TypeGraph_29_3_solveCSP_binding[0];

			final Object[] result_pattern_Model2TypeGraph_29_3_solveCSP_black = pattern_Model2TypeGraph_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_Model2TypeGraph_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Model2TypeGraph_29_4_checkCSP_expressionFBB(final Model2TypeGraph _this, final CSP csp) {
		final boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		final boolean _result = _localVariable_0;
		return _result;
	}

	public static final Object[] pattern_Model2TypeGraph_29_6_perform_blackB(final ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_Model2TypeGraph_29_6_perform_greenFFFBB(final ModelgeneratorRuleResult ruleResult,
			final CSP csp) {
		final Model model = UMLFactory.eINSTANCE.createModel();
		final org.gravity.tgg.pm.uml.Model2TypeGraph model2PM = UmlFactory.eINSTANCE.createModel2TypeGraph();
		final TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		final Object _localVariable_0 = csp.getValue("model", "name");
		final Object _localVariable_1 = csp.getValue("pm", "tName");
		final boolean ruleResult_success_prime = true;
		final int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(model);
		model2PM.setSource(model);
		ruleResult.getCorrObjects().add(model2PM);
		model2PM.setTarget(pm);
		ruleResult.getTargetObjects().add(pm);
		final String model_name_prime = (String) _localVariable_0;
		final String pm_tName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(ruleResult_success_prime);
		final int ruleResult_performCount_prime = _localVariable_2;
		model.setName(model_name_prime);
		pm.setTName(pm_tName_prime);
		ruleResult.setPerformCount(ruleResult_performCount_prime);
		return new Object[] { model, model2PM, pm, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_Model2TypeGraph_29_7_expressionFB(
			final ModelgeneratorRuleResult ruleResult) {
		final ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Model2TypeGraphImpl
