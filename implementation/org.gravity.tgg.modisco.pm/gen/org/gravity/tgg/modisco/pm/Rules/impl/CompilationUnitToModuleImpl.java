/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.Model;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ElementToModule;
import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.CompilationUnitToModule;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TModule;
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
import org.gravity.tgg.modisco.pm.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Compilation Unit To Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CompilationUnitToModuleImpl extends AbstractRuleImpl implements CompilationUnitToModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitToModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getCompilationUnitToModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, CompilationUnit cu, Model model) {

		Object[] result1_black = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_0_1_initialbindings_blackBBBB(this, match, cu, model);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cu] = " + cu + ", " + "[model] = " + model + ".");
		}

		Object[] result2_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, cu, model);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cu] = " + cu + ", " + "[model] = " + model + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_0_4_collectelementstobetranslated_blackBBB(match, cu, model);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cu] = " + cu + ", " + "[model] = " + model + ".");
			}
			CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_0_4_collectelementstobetranslated_greenBBBF(match, cu, model);
			//nothing EMoflonEdge model__cu____compilationUnits = (EMoflonEdge) result4_green[3];

			Object[] result5_black = CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_0_5_collectcontextelements_blackBBB(match, cu, model);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cu] = " + cu + ", " + "[model] = " + model + ".");
			}
			CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_0_5_collectcontextelements_greenBB(match,
					model);

			// 
			CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_0_6_registerobjectstomatch_expressionBBBB(this,
					match, cu, model);
			return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_0_7_expressionF();
		} else {
			return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ModelToTypeGraph m2pm = (ModelToTypeGraph) result1_bindingAndBlack[0];
		CompilationUnit cu = (CompilationUnit) result1_bindingAndBlack[1];
		Model model = (Model) result1_bindingAndBlack[2];
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_1_1_performtransformation_greenBFFBB(cu, pm, csp);
		ElementToModule cu2m = (ElementToModule) result1_green[1];
		TModule module = (TModule) result1_green[2];

		Object[] result2_black = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_1_2_collecttranslatedelements_blackBBB(cu, cu2m, module);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cu] = " + cu + ", " + "[cu2m] = "
					+ cu2m + ", " + "[module] = " + module + ".");
		}
		Object[] result2_green = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_1_2_collecttranslatedelements_greenFBBB(cu, cu2m, module);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, m2pm, cu, cu2m,
						module, model, pm);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2pm] = " + m2pm + ", " + "[cu] = " + cu + ", " + "[cu2m] = " + cu2m + ", "
					+ "[module] = " + module + ", " + "[model] = " + model + ", " + "[pm] = " + pm + ".");
		}
		CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				cu, cu2m, module, model, pm);
		//nothing EMoflonEdge cu2m__cu____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge pm__module____modules = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge model__cu____compilationUnits = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge cu2m__module____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, m2pm, cu, cu2m, module, model, pm);
		return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		CompilationUnit cu = (CompilationUnit) result2_binding[0];
		Model model = (Model) result2_binding[1];
		for (Object[] result2_black : CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_2_2_corematch_blackFBBFB(cu, model, match)) {
			ModelToTypeGraph m2pm = (ModelToTypeGraph) result2_black[0];
			TypeGraph pm = (TypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_2_3_findcontext_blackBBBB(m2pm, cu, model, pm)) {
				Object[] result3_green = CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_2_3_findcontext_greenBBBBFFFF(m2pm, cu, model, pm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge model__cu____compilationUnits = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge m2pm__model____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge m2pm__pm____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								m2pm, cu, model, pm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[m2pm] = " + m2pm + ", "
							+ "[cu] = " + cu + ", " + "[model] = " + model + ", " + "[pm] = " + pm + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = CompilationUnitToModuleImpl
							.pattern_CompilationUnitToModule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, CompilationUnit cu, Model model) {
		match.registerObject("cu", cu);
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, CompilationUnit cu, Model model) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph m2pm, CompilationUnit cu,
			Model model, TypeGraph pm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cu_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("cu.originalFilePath", true, csp);
		var_cu_originalFilePath.setValue(cu.getOriginalFilePath());
		var_cu_originalFilePath.setType("String");

		// Create unbound variables
		Variable var_module_location = CSPFactoryHelper.eINSTANCE.createVariable("module.location", csp);
		var_module_location.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cu_originalFilePath, var_module_location);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("m2pm", m2pm);
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("pm", pm);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m2pm, EObject cu, EObject cu2m,
			EObject module, EObject model, EObject pm) {
		ruleresult.registerObject("m2pm", m2pm);
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("cu2m", cu2m);
		ruleresult.registerObject("module", module);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("pm", pm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cu").eClass())
				.equals("java.CompilationUnit.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TModule module, TypeGraph pm) {

		Object[] result1_black = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_10_1_initialbindings_blackBBBB(this, match, module, pm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[module] = " + module + ", " + "[pm] = " + pm + ".");
		}

		Object[] result2_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, module, pm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[module] = " + module + ", " + "[pm] = " + pm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_10_4_collectelementstobetranslated_blackBBB(match, module, pm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[module] = " + module + ", " + "[pm] = " + pm + ".");
			}
			CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_10_4_collectelementstobetranslated_greenBBBF(match, module, pm);
			//nothing EMoflonEdge pm__module____modules = (EMoflonEdge) result4_green[3];

			Object[] result5_black = CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_10_5_collectcontextelements_blackBBB(match, module, pm);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[module] = " + module + ", " + "[pm] = " + pm + ".");
			}
			CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_10_5_collectcontextelements_greenBB(match, pm);

			// 
			CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_10_6_registerobjectstomatch_expressionBBBB(this,
					match, module, pm);
			return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_10_7_expressionF();
		} else {
			return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ModelToTypeGraph m2pm = (ModelToTypeGraph) result1_bindingAndBlack[0];
		TModule module = (TModule) result1_bindingAndBlack[1];
		Model model = (Model) result1_bindingAndBlack[2];
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_11_1_performtransformation_greenFFBBB(module, model, csp);
		CompilationUnit cu = (CompilationUnit) result1_green[0];
		ElementToModule cu2m = (ElementToModule) result1_green[1];

		Object[] result2_black = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_11_2_collecttranslatedelements_blackBBB(cu, cu2m, module);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cu] = " + cu + ", " + "[cu2m] = "
					+ cu2m + ", " + "[module] = " + module + ".");
		}
		Object[] result2_green = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_11_2_collecttranslatedelements_greenFBBB(cu, cu2m, module);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, m2pm, cu, cu2m,
						module, model, pm);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2pm] = " + m2pm + ", " + "[cu] = " + cu + ", " + "[cu2m] = " + cu2m + ", "
					+ "[module] = " + module + ", " + "[model] = " + model + ", " + "[pm] = " + pm + ".");
		}
		CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				cu, cu2m, module, model, pm);
		//nothing EMoflonEdge cu2m__cu____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge pm__module____modules = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge model__cu____compilationUnits = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge cu2m__module____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, m2pm, cu, cu2m, module, model, pm);
		return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TModule module = (TModule) result2_binding[0];
		TypeGraph pm = (TypeGraph) result2_binding[1];
		for (Object[] result2_black : CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_12_2_corematch_blackFBFBB(module, pm, match)) {
			ModelToTypeGraph m2pm = (ModelToTypeGraph) result2_black[0];
			Model model = (Model) result2_black[2];
			// ForEach 
			for (Object[] result3_black : CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_12_3_findcontext_blackBBBB(m2pm, module, model, pm)) {
				Object[] result3_green = CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_12_3_findcontext_greenBBBBFFFF(m2pm, module, model, pm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge pm__module____modules = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge m2pm__model____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge m2pm__pm____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								m2pm, module, model, pm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[m2pm] = " + m2pm + ", "
							+ "[module] = " + module + ", " + "[model] = " + model + ", " + "[pm] = " + pm + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = CompilationUnitToModuleImpl
							.pattern_CompilationUnitToModule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TModule module, TypeGraph pm) {
		match.registerObject("module", module);
		match.registerObject("pm", pm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TModule module, TypeGraph pm) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph m2pm, TModule module,
			Model model, TypeGraph pm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_module_location = CSPFactoryHelper.eINSTANCE.createVariable("module.location", true, csp);
		var_module_location.setValue(module.getLocation());
		var_module_location.setType("String");

		// Create unbound variables
		Variable var_cu_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("cu.originalFilePath", csp);
		var_cu_originalFilePath.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cu_originalFilePath, var_module_location);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("m2pm", m2pm);
		isApplicableMatch.registerObject("module", module);
		isApplicableMatch.registerObject("model", model);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m2pm, EObject cu, EObject cu2m,
			EObject module, EObject model, EObject pm) {
		ruleresult.registerObject("m2pm", m2pm);
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("cu2m", cu2m);
		ruleresult.registerObject("module", module);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("pm", pm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("module").eClass()).equals("basic.TModule.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_111(EMoflonEdge _edge_modules) {

		Object[] result1_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_20_2_testcorematchandDECs_blackFFB(_edge_modules)) {
			TModule module = (TModule) result2_black[0];
			TypeGraph pm = (TypeGraph) result2_black[1];
			Object[] result2_green = CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, module, pm)) {
				// 
				if (CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = CompilationUnitToModuleImpl
							.pattern_CompilationUnitToModule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_116(EMoflonEdge _edge_compilationUnits) {

		Object[] result1_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_21_2_testcorematchandDECs_blackFFB(_edge_compilationUnits)) {
			CompilationUnit cu = (CompilationUnit) result2_black[0];
			Model model = (Model) result2_black[1];
			Object[] result2_green = CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, cu, model)) {
				// 
				if (CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = CompilationUnitToModuleImpl
							.pattern_CompilationUnitToModule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("CompilationUnitToModule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_module_location = CSPFactoryHelper.eINSTANCE.createVariable("module", true, csp);
		var_module_location.setValue(__helper.getValue("module", "location"));
		var_module_location.setType("String");

		Variable var_cu_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("cu", true, csp);
		var_cu_originalFilePath.setValue(__helper.getValue("cu", "originalFilePath"));
		var_cu_originalFilePath.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("CompilationUnitToModule");
		eq0.solve(var_cu_originalFilePath, var_module_location);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_module_location.setBound(false);
			eq0.solve(var_cu_originalFilePath, var_module_location);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("module", "location", var_module_location.getValue());
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
		ruleResult.setRule("CompilationUnitToModule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_module_location = CSPFactoryHelper.eINSTANCE.createVariable("module", true, csp);
		var_module_location.setValue(__helper.getValue("module", "location"));
		var_module_location.setType("String");

		Variable var_cu_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("cu", true, csp);
		var_cu_originalFilePath.setValue(__helper.getValue("cu", "originalFilePath"));
		var_cu_originalFilePath.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("CompilationUnitToModule");
		eq0.solve(var_cu_originalFilePath, var_module_location);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_cu_originalFilePath.setBound(false);
			eq0.solve(var_cu_originalFilePath, var_module_location);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("cu", "originalFilePath", var_cu_originalFilePath.getValue());
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

		Object[] result1_black = CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CompilationUnit cu = (CompilationUnit) result2_bindingAndBlack[0];
		TModule module = (TModule) result2_bindingAndBlack[1];
		Model model = (Model) result2_bindingAndBlack[2];
		TypeGraph pm = (TypeGraph) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, cu, module, model, pm,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[cu] = " + cu + ", " + "[module] = " + module + ", " + "[model] = " + model + ", " + "[pm] = "
					+ pm + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_24_5_matchcorrcontext_blackFBBBB(model, pm, sourceMatch,
							targetMatch)) {
				ModelToTypeGraph m2pm = (ModelToTypeGraph) result5_black[0];
				Object[] result5_green = CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_24_5_matchcorrcontext_greenBBBF(m2pm, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_24_6_createcorrespondence_blackBBBBB(cu, module, model, pm,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cu] = " + cu + ", "
							+ "[module] = " + module + ", " + "[model] = " + model + ", " + "[pm] = " + pm + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_24_6_createcorrespondence_greenBFBB(cu,
						module, ccMatch);
				//nothing ElementToModule cu2m = (ElementToModule) result6_green[1];

				Object[] result7_black = CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CompilationUnit cu, TModule module, Model model, TypeGraph pm,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_cu_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("cu.originalFilePath", true, csp);
		var_cu_originalFilePath.setValue(cu.getOriginalFilePath());
		var_cu_originalFilePath.setType("String");
		Variable var_module_location = CSPFactoryHelper.eINSTANCE.createVariable("module.location", true, csp);
		var_module_location.setValue(module.getLocation());
		var_module_location.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cu_originalFilePath, var_module_location);
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
	public boolean checkDEC_FWD(CompilationUnit cu, Model model) {// 
		Object[] result1_black = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_27_1_matchtggpattern_blackBB(cu, model);
		if (result1_black != null) {
			return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_27_2_expressionF();
		} else {
			return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TModule module, TypeGraph pm) {// 
		Object[] result1_black = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_28_1_matchtggpattern_blackBB(module, pm);
		if (result1_black != null) {
			return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_28_2_expressionF();
		} else {
			return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph m2pmParameter) {

		Object[] result1_black = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : CompilationUnitToModuleImpl
				.pattern_CompilationUnitToModule_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList m2pmList = (RuleEntryList) result2_black[0];
			ModelToTypeGraph m2pm = (ModelToTypeGraph) result2_black[1];
			Model model = (Model) result2_black[2];
			TypeGraph pm = (TypeGraph) result2_black[3];

			Object[] result3_bindingAndBlack = CompilationUnitToModuleImpl
					.pattern_CompilationUnitToModule_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, m2pm,
							model, pm, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[m2pm] = " + m2pm + ", " + "[model] = "
						+ model + ", " + "[pm] = " + pm + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = CompilationUnitToModuleImpl
						.pattern_CompilationUnitToModule_29_5_checknacs_blackBBB(m2pm, model, pm);
				if (result5_black != null) {

					Object[] result6_black = CompilationUnitToModuleImpl
							.pattern_CompilationUnitToModule_29_6_perform_blackBBBB(m2pm, model, pm, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[m2pm] = " + m2pm + ", " + "[model] = "
										+ model + ", " + "[pm] = " + pm + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_29_6_perform_greenFFFBBBB(model, pm,
							ruleResult, csp);
					//nothing CompilationUnit cu = (CompilationUnit) result6_green[0];
					//nothing ElementToModule cu2m = (ElementToModule) result6_green[1];
					//nothing TModule module = (TModule) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return CompilationUnitToModuleImpl.pattern_CompilationUnitToModule_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph m2pm, Model model,
			TypeGraph pm, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_cu_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("cu.originalFilePath", csp);
		var_cu_originalFilePath.setType("String");
		Variable var_module_location = CSPFactoryHelper.eINSTANCE.createVariable("module.location", csp);
		var_module_location.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cu_originalFilePath, var_module_location);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("m2pm", m2pm);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("pm", pm);
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
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPROPRIATE_FWD__MATCH_COMPILATIONUNIT_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (CompilationUnit) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_COMPILATIONUNIT_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (CompilationUnit) arguments.get(1),
					(Model) arguments.get(2));
			return null;
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_COMPILATIONUNIT_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (CompilationUnit) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_COMPILATIONUNIT_MODEL_TYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(CompilationUnit) arguments.get(2), (Model) arguments.get(3), (TypeGraph) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPROPRIATE_BWD__MATCH_TMODULE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TModule) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMODULE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TModule) arguments.get(1),
					(TypeGraph) arguments.get(2));
			return null;
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMODULE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TModule) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_TMODULE_MODEL_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(TModule) arguments.get(2), (Model) arguments.get(3), (TypeGraph) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_111__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_111((EMoflonEdge) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_116__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_116((EMoflonEdge) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPLICABLE_SOLVE_CSP_CC__COMPILATIONUNIT_TMODULE_MODEL_TYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CompilationUnit) arguments.get(0), (TModule) arguments.get(1),
					(Model) arguments.get(2), (TypeGraph) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___CHECK_DEC_FWD__COMPILATIONUNIT_MODEL:
			return checkDEC_FWD((CompilationUnit) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___CHECK_DEC_BWD__TMODULE_TYPEGRAPH:
			return checkDEC_BWD((TModule) arguments.get(0), (TypeGraph) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_MODEL_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(Model) arguments.get(2), (TypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT_TO_MODULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_CompilationUnitToModule_0_1_initialbindings_blackBBBB(
			CompilationUnitToModule _this, Match match, CompilationUnit cu, Model model) {
		return new Object[] { _this, match, cu, model };
	}

	public static final Object[] pattern_CompilationUnitToModule_0_2_SolveCSP_bindingFBBBB(
			CompilationUnitToModule _this, Match match, CompilationUnit cu, Model model) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, cu, model);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cu, model };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnitToModule_0_2_SolveCSP_bindingAndBlackFBBBB(
			CompilationUnitToModule _this, Match match, CompilationUnit cu, Model model) {
		Object[] result_pattern_CompilationUnitToModule_0_2_SolveCSP_binding = pattern_CompilationUnitToModule_0_2_SolveCSP_bindingFBBBB(
				_this, match, cu, model);
		if (result_pattern_CompilationUnitToModule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnitToModule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_CompilationUnitToModule_0_2_SolveCSP_black = pattern_CompilationUnitToModule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnitToModule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cu, model };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnitToModule_0_3_CheckCSP_expressionFBB(
			CompilationUnitToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_0_4_collectelementstobetranslated_blackBBB(Match match,
			CompilationUnit cu, Model model) {
		return new Object[] { match, cu, model };
	}

	public static final Object[] pattern_CompilationUnitToModule_0_4_collectelementstobetranslated_greenBBBF(
			Match match, CompilationUnit cu, Model model) {
		EMoflonEdge model__cu____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(cu);
		String model__cu____compilationUnits_name_prime = "compilationUnits";
		model__cu____compilationUnits.setSrc(model);
		model__cu____compilationUnits.setTrg(cu);
		match.getToBeTranslatedEdges().add(model__cu____compilationUnits);
		model__cu____compilationUnits.setName(model__cu____compilationUnits_name_prime);
		return new Object[] { match, cu, model, model__cu____compilationUnits };
	}

	public static final Object[] pattern_CompilationUnitToModule_0_5_collectcontextelements_blackBBB(Match match,
			CompilationUnit cu, Model model) {
		return new Object[] { match, cu, model };
	}

	public static final Object[] pattern_CompilationUnitToModule_0_5_collectcontextelements_greenBB(Match match,
			Model model) {
		match.getContextNodes().add(model);
		return new Object[] { match, model };
	}

	public static final void pattern_CompilationUnitToModule_0_6_registerobjectstomatch_expressionBBBB(
			CompilationUnitToModule _this, Match match, CompilationUnit cu, Model model) {
		_this.registerObjectsToMatch_FWD(match, cu, model);

	}

	public static final boolean pattern_CompilationUnitToModule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnitToModule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("m2pm");
		EObject _localVariable_1 = isApplicableMatch.getObject("cu");
		EObject _localVariable_2 = isApplicableMatch.getObject("model");
		EObject _localVariable_3 = isApplicableMatch.getObject("pm");
		EObject tmpM2pm = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		EObject tmpModel = _localVariable_2;
		EObject tmpPm = _localVariable_3;
		if (tmpM2pm instanceof ModelToTypeGraph) {
			ModelToTypeGraph m2pm = (ModelToTypeGraph) tmpM2pm;
			if (tmpCu instanceof CompilationUnit) {
				CompilationUnit cu = (CompilationUnit) tmpCu;
				if (tmpModel instanceof Model) {
					Model model = (Model) tmpModel;
					if (tmpPm instanceof TypeGraph) {
						TypeGraph pm = (TypeGraph) tmpPm;
						return new Object[] { m2pm, cu, model, pm, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_1_1_performtransformation_blackBBBBFBB(
			ModelToTypeGraph m2pm, CompilationUnit cu, Model model, TypeGraph pm, CompilationUnitToModule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { m2pm, cu, model, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_1_1_performtransformation_bindingAndBlackFFFFFBB(
			CompilationUnitToModule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_CompilationUnitToModule_1_1_performtransformation_binding = pattern_CompilationUnitToModule_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_CompilationUnitToModule_1_1_performtransformation_binding != null) {
			ModelToTypeGraph m2pm = (ModelToTypeGraph) result_pattern_CompilationUnitToModule_1_1_performtransformation_binding[0];
			CompilationUnit cu = (CompilationUnit) result_pattern_CompilationUnitToModule_1_1_performtransformation_binding[1];
			Model model = (Model) result_pattern_CompilationUnitToModule_1_1_performtransformation_binding[2];
			TypeGraph pm = (TypeGraph) result_pattern_CompilationUnitToModule_1_1_performtransformation_binding[3];

			Object[] result_pattern_CompilationUnitToModule_1_1_performtransformation_black = pattern_CompilationUnitToModule_1_1_performtransformation_blackBBBBFBB(
					m2pm, cu, model, pm, _this, isApplicableMatch);
			if (result_pattern_CompilationUnitToModule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_CompilationUnitToModule_1_1_performtransformation_black[4];

				return new Object[] { m2pm, cu, model, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_1_1_performtransformation_greenBFFBB(
			CompilationUnit cu, TypeGraph pm, CSP csp) {
		ElementToModule cu2m = PmFactory.eINSTANCE.createElementToModule();
		TModule module = BasicFactory.eINSTANCE.createTModule();
		Object _localVariable_0 = csp.getValue("module", "location");
		cu2m.setSource(cu);
		pm.getModules().add(module);
		cu2m.setTarget(module);
		String module_location_prime = (String) _localVariable_0;
		module.setLocation(module_location_prime);
		return new Object[] { cu, cu2m, module, pm, csp };
	}

	public static final Object[] pattern_CompilationUnitToModule_1_2_collecttranslatedelements_blackBBB(
			CompilationUnit cu, ElementToModule cu2m, TModule module) {
		return new Object[] { cu, cu2m, module };
	}

	public static final Object[] pattern_CompilationUnitToModule_1_2_collecttranslatedelements_greenFBBB(
			CompilationUnit cu, ElementToModule cu2m, TModule module) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(cu);
		ruleresult.getCreatedLinkElements().add(cu2m);
		ruleresult.getCreatedElements().add(module);
		return new Object[] { ruleresult, cu, cu2m, module };
	}

	public static final Object[] pattern_CompilationUnitToModule_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject m2pm, EObject cu, EObject cu2m, EObject module, EObject model,
			EObject pm) {
		if (!m2pm.equals(module)) {
			if (!m2pm.equals(model)) {
				if (!m2pm.equals(pm)) {
					if (!cu.equals(m2pm)) {
						if (!cu.equals(cu2m)) {
							if (!cu.equals(module)) {
								if (!cu.equals(model)) {
									if (!cu.equals(pm)) {
										if (!cu2m.equals(m2pm)) {
											if (!cu2m.equals(module)) {
												if (!cu2m.equals(model)) {
													if (!cu2m.equals(pm)) {
														if (!module.equals(pm)) {
															if (!model.equals(module)) {
																if (!model.equals(pm)) {
																	return new Object[] { ruleresult, m2pm, cu, cu2m,
																			module, model, pm };
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
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject cu, EObject cu2m, EObject module, EObject model, EObject pm) {
		EMoflonEdge cu2m__cu____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__module____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__cu____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu2m__module____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "CompilationUnitToModule";
		String cu2m__cu____source_name_prime = "source";
		String pm__module____modules_name_prime = "modules";
		String model__cu____compilationUnits_name_prime = "compilationUnits";
		String cu2m__module____target_name_prime = "target";
		cu2m__cu____source.setSrc(cu2m);
		cu2m__cu____source.setTrg(cu);
		ruleresult.getCreatedEdges().add(cu2m__cu____source);
		pm__module____modules.setSrc(pm);
		pm__module____modules.setTrg(module);
		ruleresult.getCreatedEdges().add(pm__module____modules);
		model__cu____compilationUnits.setSrc(model);
		model__cu____compilationUnits.setTrg(cu);
		ruleresult.getTranslatedEdges().add(model__cu____compilationUnits);
		cu2m__module____target.setSrc(cu2m);
		cu2m__module____target.setTrg(module);
		ruleresult.getCreatedEdges().add(cu2m__module____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cu2m__cu____source.setName(cu2m__cu____source_name_prime);
		pm__module____modules.setName(pm__module____modules_name_prime);
		model__cu____compilationUnits.setName(model__cu____compilationUnits_name_prime);
		cu2m__module____target.setName(cu2m__module____target_name_prime);
		return new Object[] { ruleresult, cu, cu2m, module, model, pm, cu2m__cu____source, pm__module____modules,
				model__cu____compilationUnits, cu2m__module____target };
	}

	public static final void pattern_CompilationUnitToModule_1_5_registerobjects_expressionBBBBBBBB(
			CompilationUnitToModule _this, PerformRuleResult ruleresult, EObject m2pm, EObject cu, EObject cu2m,
			EObject module, EObject model, EObject pm) {
		_this.registerObjects_FWD(ruleresult, m2pm, cu, cu2m, module, model, pm);

	}

	public static final PerformRuleResult pattern_CompilationUnitToModule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_2_1_preparereturnvalue_bindingFB(
			CompilationUnitToModule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			CompilationUnitToModule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_2_1_preparereturnvalue_bindingAndBlackFFB(
			CompilationUnitToModule _this) {
		Object[] result_pattern_CompilationUnitToModule_2_1_preparereturnvalue_binding = pattern_CompilationUnitToModule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnitToModule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_CompilationUnitToModule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnitToModule_2_1_preparereturnvalue_black = pattern_CompilationUnitToModule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_CompilationUnitToModule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_CompilationUnitToModule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "CompilationUnitToModule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_CompilationUnitToModule_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cu");
		EObject _localVariable_1 = match.getObject("model");
		EObject tmpCu = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		if (tmpCu instanceof CompilationUnit) {
			CompilationUnit cu = (CompilationUnit) tmpCu;
			if (tmpModel instanceof Model) {
				Model model = (Model) tmpModel;
				return new Object[] { cu, model, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnitToModule_2_2_corematch_blackFBBFB(CompilationUnit cu,
			Model model, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph m2pm : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(model,
				ModelToTypeGraph.class, "source")) {
			TypeGraph pm = m2pm.getTarget();
			if (pm != null) {
				_result.add(new Object[] { m2pm, cu, model, pm, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnitToModule_2_3_findcontext_blackBBBB(
			ModelToTypeGraph m2pm, CompilationUnit cu, Model model, TypeGraph pm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (model.getCompilationUnits().contains(cu)) {
			if (model.equals(m2pm.getSource())) {
				if (pm.equals(m2pm.getTarget())) {
					_result.add(new Object[] { m2pm, cu, model, pm });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_2_3_findcontext_greenBBBBFFFF(ModelToTypeGraph m2pm,
			CompilationUnit cu, Model model, TypeGraph pm) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge model__cu____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2pm__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2pm__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__cu____compilationUnits_name_prime = "compilationUnits";
		String m2pm__model____source_name_prime = "source";
		String m2pm__pm____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(m2pm);
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(pm);
		model__cu____compilationUnits.setSrc(model);
		model__cu____compilationUnits.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(model__cu____compilationUnits);
		m2pm__model____source.setSrc(m2pm);
		m2pm__model____source.setTrg(model);
		isApplicableMatch.getAllContextElements().add(m2pm__model____source);
		m2pm__pm____target.setSrc(m2pm);
		m2pm__pm____target.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(m2pm__pm____target);
		model__cu____compilationUnits.setName(model__cu____compilationUnits_name_prime);
		m2pm__model____source.setName(m2pm__model____source_name_prime);
		m2pm__pm____target.setName(m2pm__pm____target_name_prime);
		return new Object[] { m2pm, cu, model, pm, isApplicableMatch, model__cu____compilationUnits,
				m2pm__model____source, m2pm__pm____target };
	}

	public static final Object[] pattern_CompilationUnitToModule_2_4_solveCSP_bindingFBBBBBB(
			CompilationUnitToModule _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph m2pm,
			CompilationUnit cu, Model model, TypeGraph pm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, m2pm, cu, model, pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, m2pm, cu, model, pm };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnitToModule_2_4_solveCSP_bindingAndBlackFBBBBBB(
			CompilationUnitToModule _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph m2pm,
			CompilationUnit cu, Model model, TypeGraph pm) {
		Object[] result_pattern_CompilationUnitToModule_2_4_solveCSP_binding = pattern_CompilationUnitToModule_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, m2pm, cu, model, pm);
		if (result_pattern_CompilationUnitToModule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnitToModule_2_4_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnitToModule_2_4_solveCSP_black = pattern_CompilationUnitToModule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnitToModule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, m2pm, cu, model, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnitToModule_2_5_checkCSP_expressionFBB(
			CompilationUnitToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_CompilationUnitToModule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CompilationUnitToModule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnitToModule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_10_1_initialbindings_blackBBBB(
			CompilationUnitToModule _this, Match match, TModule module, TypeGraph pm) {
		return new Object[] { _this, match, module, pm };
	}

	public static final Object[] pattern_CompilationUnitToModule_10_2_SolveCSP_bindingFBBBB(
			CompilationUnitToModule _this, Match match, TModule module, TypeGraph pm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, module, pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, module, pm };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnitToModule_10_2_SolveCSP_bindingAndBlackFBBBB(
			CompilationUnitToModule _this, Match match, TModule module, TypeGraph pm) {
		Object[] result_pattern_CompilationUnitToModule_10_2_SolveCSP_binding = pattern_CompilationUnitToModule_10_2_SolveCSP_bindingFBBBB(
				_this, match, module, pm);
		if (result_pattern_CompilationUnitToModule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnitToModule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_CompilationUnitToModule_10_2_SolveCSP_black = pattern_CompilationUnitToModule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnitToModule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, module, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnitToModule_10_3_CheckCSP_expressionFBB(
			CompilationUnitToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_10_4_collectelementstobetranslated_blackBBB(
			Match match, TModule module, TypeGraph pm) {
		return new Object[] { match, module, pm };
	}

	public static final Object[] pattern_CompilationUnitToModule_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TModule module, TypeGraph pm) {
		EMoflonEdge pm__module____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(module);
		String pm__module____modules_name_prime = "modules";
		pm__module____modules.setSrc(pm);
		pm__module____modules.setTrg(module);
		match.getToBeTranslatedEdges().add(pm__module____modules);
		pm__module____modules.setName(pm__module____modules_name_prime);
		return new Object[] { match, module, pm, pm__module____modules };
	}

	public static final Object[] pattern_CompilationUnitToModule_10_5_collectcontextelements_blackBBB(Match match,
			TModule module, TypeGraph pm) {
		return new Object[] { match, module, pm };
	}

	public static final Object[] pattern_CompilationUnitToModule_10_5_collectcontextelements_greenBB(Match match,
			TypeGraph pm) {
		match.getContextNodes().add(pm);
		return new Object[] { match, pm };
	}

	public static final void pattern_CompilationUnitToModule_10_6_registerobjectstomatch_expressionBBBB(
			CompilationUnitToModule _this, Match match, TModule module, TypeGraph pm) {
		_this.registerObjectsToMatch_BWD(match, module, pm);

	}

	public static final boolean pattern_CompilationUnitToModule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnitToModule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("m2pm");
		EObject _localVariable_1 = isApplicableMatch.getObject("module");
		EObject _localVariable_2 = isApplicableMatch.getObject("model");
		EObject _localVariable_3 = isApplicableMatch.getObject("pm");
		EObject tmpM2pm = _localVariable_0;
		EObject tmpModule = _localVariable_1;
		EObject tmpModel = _localVariable_2;
		EObject tmpPm = _localVariable_3;
		if (tmpM2pm instanceof ModelToTypeGraph) {
			ModelToTypeGraph m2pm = (ModelToTypeGraph) tmpM2pm;
			if (tmpModule instanceof TModule) {
				TModule module = (TModule) tmpModule;
				if (tmpModel instanceof Model) {
					Model model = (Model) tmpModel;
					if (tmpPm instanceof TypeGraph) {
						TypeGraph pm = (TypeGraph) tmpPm;
						return new Object[] { m2pm, module, model, pm, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_11_1_performtransformation_blackBBBBFBB(
			ModelToTypeGraph m2pm, TModule module, Model model, TypeGraph pm, CompilationUnitToModule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { m2pm, module, model, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_11_1_performtransformation_bindingAndBlackFFFFFBB(
			CompilationUnitToModule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_CompilationUnitToModule_11_1_performtransformation_binding = pattern_CompilationUnitToModule_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_CompilationUnitToModule_11_1_performtransformation_binding != null) {
			ModelToTypeGraph m2pm = (ModelToTypeGraph) result_pattern_CompilationUnitToModule_11_1_performtransformation_binding[0];
			TModule module = (TModule) result_pattern_CompilationUnitToModule_11_1_performtransformation_binding[1];
			Model model = (Model) result_pattern_CompilationUnitToModule_11_1_performtransformation_binding[2];
			TypeGraph pm = (TypeGraph) result_pattern_CompilationUnitToModule_11_1_performtransformation_binding[3];

			Object[] result_pattern_CompilationUnitToModule_11_1_performtransformation_black = pattern_CompilationUnitToModule_11_1_performtransformation_blackBBBBFBB(
					m2pm, module, model, pm, _this, isApplicableMatch);
			if (result_pattern_CompilationUnitToModule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_CompilationUnitToModule_11_1_performtransformation_black[4];

				return new Object[] { m2pm, module, model, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_11_1_performtransformation_greenFFBBB(TModule module,
			Model model, CSP csp) {
		CompilationUnit cu = JavaFactory.eINSTANCE.createCompilationUnit();
		ElementToModule cu2m = PmFactory.eINSTANCE.createElementToModule();
		Object _localVariable_0 = csp.getValue("cu", "originalFilePath");
		model.getCompilationUnits().add(cu);
		cu2m.setSource(cu);
		cu2m.setTarget(module);
		String cu_originalFilePath_prime = (String) _localVariable_0;
		cu.setOriginalFilePath(cu_originalFilePath_prime);
		return new Object[] { cu, cu2m, module, model, csp };
	}

	public static final Object[] pattern_CompilationUnitToModule_11_2_collecttranslatedelements_blackBBB(
			CompilationUnit cu, ElementToModule cu2m, TModule module) {
		return new Object[] { cu, cu2m, module };
	}

	public static final Object[] pattern_CompilationUnitToModule_11_2_collecttranslatedelements_greenFBBB(
			CompilationUnit cu, ElementToModule cu2m, TModule module) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(cu);
		ruleresult.getCreatedLinkElements().add(cu2m);
		ruleresult.getTranslatedElements().add(module);
		return new Object[] { ruleresult, cu, cu2m, module };
	}

	public static final Object[] pattern_CompilationUnitToModule_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject m2pm, EObject cu, EObject cu2m, EObject module, EObject model,
			EObject pm) {
		if (!m2pm.equals(module)) {
			if (!m2pm.equals(model)) {
				if (!m2pm.equals(pm)) {
					if (!cu.equals(m2pm)) {
						if (!cu.equals(cu2m)) {
							if (!cu.equals(module)) {
								if (!cu.equals(model)) {
									if (!cu.equals(pm)) {
										if (!cu2m.equals(m2pm)) {
											if (!cu2m.equals(module)) {
												if (!cu2m.equals(model)) {
													if (!cu2m.equals(pm)) {
														if (!module.equals(pm)) {
															if (!model.equals(module)) {
																if (!model.equals(pm)) {
																	return new Object[] { ruleresult, m2pm, cu, cu2m,
																			module, model, pm };
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
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject cu, EObject cu2m, EObject module, EObject model, EObject pm) {
		EMoflonEdge cu2m__cu____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__module____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__cu____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu2m__module____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "CompilationUnitToModule";
		String cu2m__cu____source_name_prime = "source";
		String pm__module____modules_name_prime = "modules";
		String model__cu____compilationUnits_name_prime = "compilationUnits";
		String cu2m__module____target_name_prime = "target";
		cu2m__cu____source.setSrc(cu2m);
		cu2m__cu____source.setTrg(cu);
		ruleresult.getCreatedEdges().add(cu2m__cu____source);
		pm__module____modules.setSrc(pm);
		pm__module____modules.setTrg(module);
		ruleresult.getTranslatedEdges().add(pm__module____modules);
		model__cu____compilationUnits.setSrc(model);
		model__cu____compilationUnits.setTrg(cu);
		ruleresult.getCreatedEdges().add(model__cu____compilationUnits);
		cu2m__module____target.setSrc(cu2m);
		cu2m__module____target.setTrg(module);
		ruleresult.getCreatedEdges().add(cu2m__module____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cu2m__cu____source.setName(cu2m__cu____source_name_prime);
		pm__module____modules.setName(pm__module____modules_name_prime);
		model__cu____compilationUnits.setName(model__cu____compilationUnits_name_prime);
		cu2m__module____target.setName(cu2m__module____target_name_prime);
		return new Object[] { ruleresult, cu, cu2m, module, model, pm, cu2m__cu____source, pm__module____modules,
				model__cu____compilationUnits, cu2m__module____target };
	}

	public static final void pattern_CompilationUnitToModule_11_5_registerobjects_expressionBBBBBBBB(
			CompilationUnitToModule _this, PerformRuleResult ruleresult, EObject m2pm, EObject cu, EObject cu2m,
			EObject module, EObject model, EObject pm) {
		_this.registerObjects_BWD(ruleresult, m2pm, cu, cu2m, module, model, pm);

	}

	public static final PerformRuleResult pattern_CompilationUnitToModule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_12_1_preparereturnvalue_bindingFB(
			CompilationUnitToModule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			CompilationUnitToModule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_12_1_preparereturnvalue_bindingAndBlackFFB(
			CompilationUnitToModule _this) {
		Object[] result_pattern_CompilationUnitToModule_12_1_preparereturnvalue_binding = pattern_CompilationUnitToModule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnitToModule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_CompilationUnitToModule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnitToModule_12_1_preparereturnvalue_black = pattern_CompilationUnitToModule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_CompilationUnitToModule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_CompilationUnitToModule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "CompilationUnitToModule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_CompilationUnitToModule_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("module");
		EObject _localVariable_1 = match.getObject("pm");
		EObject tmpModule = _localVariable_0;
		EObject tmpPm = _localVariable_1;
		if (tmpModule instanceof TModule) {
			TModule module = (TModule) tmpModule;
			if (tmpPm instanceof TypeGraph) {
				TypeGraph pm = (TypeGraph) tmpPm;
				return new Object[] { module, pm, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnitToModule_12_2_corematch_blackFBFBB(TModule module,
			TypeGraph pm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph m2pm : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pm,
				ModelToTypeGraph.class, "target")) {
			Model model = m2pm.getSource();
			if (model != null) {
				_result.add(new Object[] { m2pm, module, model, pm, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnitToModule_12_3_findcontext_blackBBBB(
			ModelToTypeGraph m2pm, TModule module, Model model, TypeGraph pm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pm.getModules().contains(module)) {
			if (model.equals(m2pm.getSource())) {
				if (pm.equals(m2pm.getTarget())) {
					_result.add(new Object[] { m2pm, module, model, pm });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_12_3_findcontext_greenBBBBFFFF(ModelToTypeGraph m2pm,
			TModule module, Model model, TypeGraph pm) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pm__module____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2pm__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2pm__pm____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pm__module____modules_name_prime = "modules";
		String m2pm__model____source_name_prime = "source";
		String m2pm__pm____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(m2pm);
		isApplicableMatch.getAllContextElements().add(module);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(pm);
		pm__module____modules.setSrc(pm);
		pm__module____modules.setTrg(module);
		isApplicableMatch.getAllContextElements().add(pm__module____modules);
		m2pm__model____source.setSrc(m2pm);
		m2pm__model____source.setTrg(model);
		isApplicableMatch.getAllContextElements().add(m2pm__model____source);
		m2pm__pm____target.setSrc(m2pm);
		m2pm__pm____target.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(m2pm__pm____target);
		pm__module____modules.setName(pm__module____modules_name_prime);
		m2pm__model____source.setName(m2pm__model____source_name_prime);
		m2pm__pm____target.setName(m2pm__pm____target_name_prime);
		return new Object[] { m2pm, module, model, pm, isApplicableMatch, pm__module____modules, m2pm__model____source,
				m2pm__pm____target };
	}

	public static final Object[] pattern_CompilationUnitToModule_12_4_solveCSP_bindingFBBBBBB(
			CompilationUnitToModule _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph m2pm, TModule module,
			Model model, TypeGraph pm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, m2pm, module, model, pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, m2pm, module, model, pm };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnitToModule_12_4_solveCSP_bindingAndBlackFBBBBBB(
			CompilationUnitToModule _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph m2pm, TModule module,
			Model model, TypeGraph pm) {
		Object[] result_pattern_CompilationUnitToModule_12_4_solveCSP_binding = pattern_CompilationUnitToModule_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, m2pm, module, model, pm);
		if (result_pattern_CompilationUnitToModule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnitToModule_12_4_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnitToModule_12_4_solveCSP_black = pattern_CompilationUnitToModule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnitToModule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, m2pm, module, model, pm };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnitToModule_12_5_checkCSP_expressionFBB(
			CompilationUnitToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_CompilationUnitToModule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CompilationUnitToModule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnitToModule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_20_1_preparereturnvalue_bindingFB(
			CompilationUnitToModule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			CompilationUnitToModule _this) {
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

	public static final Object[] pattern_CompilationUnitToModule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			CompilationUnitToModule _this) {
		Object[] result_pattern_CompilationUnitToModule_20_1_preparereturnvalue_binding = pattern_CompilationUnitToModule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnitToModule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_CompilationUnitToModule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnitToModule_20_1_preparereturnvalue_black = pattern_CompilationUnitToModule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_CompilationUnitToModule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CompilationUnitToModule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_CompilationUnitToModule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_CompilationUnitToModule_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_modules) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPm = _edge_modules.getSrc();
		if (tmpPm instanceof TypeGraph) {
			TypeGraph pm = (TypeGraph) tmpPm;
			EObject tmpModule = _edge_modules.getTrg();
			if (tmpModule instanceof TModule) {
				TModule module = (TModule) tmpModule;
				if (pm.getModules().contains(module)) {
					_result.add(new Object[] { module, pm, _edge_modules });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CompilationUnitToModule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			CompilationUnitToModule _this, Match match, TModule module, TypeGraph pm) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, module, pm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CompilationUnitToModule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			CompilationUnitToModule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_CompilationUnitToModule_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_21_1_preparereturnvalue_bindingFB(
			CompilationUnitToModule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			CompilationUnitToModule _this) {
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

	public static final Object[] pattern_CompilationUnitToModule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			CompilationUnitToModule _this) {
		Object[] result_pattern_CompilationUnitToModule_21_1_preparereturnvalue_binding = pattern_CompilationUnitToModule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnitToModule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_CompilationUnitToModule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnitToModule_21_1_preparereturnvalue_black = pattern_CompilationUnitToModule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_CompilationUnitToModule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CompilationUnitToModule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_CompilationUnitToModule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_CompilationUnitToModule_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_compilationUnits) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModel = _edge_compilationUnits.getSrc();
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			EObject tmpCu = _edge_compilationUnits.getTrg();
			if (tmpCu instanceof CompilationUnit) {
				CompilationUnit cu = (CompilationUnit) tmpCu;
				if (model.getCompilationUnits().contains(cu)) {
					_result.add(new Object[] { cu, model, _edge_compilationUnits });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CompilationUnitToModule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			CompilationUnitToModule _this, Match match, CompilationUnit cu, Model model) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, cu, model);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CompilationUnitToModule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			CompilationUnitToModule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_CompilationUnitToModule_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_24_1_prepare_blackB(CompilationUnitToModule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_CompilationUnitToModule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("cu");
		EObject _localVariable_1 = targetMatch.getObject("module");
		EObject _localVariable_2 = sourceMatch.getObject("model");
		EObject _localVariable_3 = targetMatch.getObject("pm");
		EObject tmpCu = _localVariable_0;
		EObject tmpModule = _localVariable_1;
		EObject tmpModel = _localVariable_2;
		EObject tmpPm = _localVariable_3;
		if (tmpCu instanceof CompilationUnit) {
			CompilationUnit cu = (CompilationUnit) tmpCu;
			if (tmpModule instanceof TModule) {
				TModule module = (TModule) tmpModule;
				if (tmpModel instanceof Model) {
					Model model = (Model) tmpModel;
					if (tmpPm instanceof TypeGraph) {
						TypeGraph pm = (TypeGraph) tmpPm;
						return new Object[] { cu, module, model, pm, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_blackBBBBBB(CompilationUnit cu,
			TModule module, Model model, TypeGraph pm, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { cu, module, model, pm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_binding = pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_binding != null) {
			CompilationUnit cu = (CompilationUnit) result_pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_binding[0];
			TModule module = (TModule) result_pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_binding[1];
			Model model = (Model) result_pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_binding[2];
			TypeGraph pm = (TypeGraph) result_pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_black = pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_blackBBBBBB(
					cu, module, model, pm, sourceMatch, targetMatch);
			if (result_pattern_CompilationUnitToModule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { cu, module, model, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_24_3_solvecsp_bindingFBBBBBBB(
			CompilationUnitToModule _this, CompilationUnit cu, TModule module, Model model, TypeGraph pm,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(cu, module, model, pm, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, cu, module, model, pm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnitToModule_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			CompilationUnitToModule _this, CompilationUnit cu, TModule module, Model model, TypeGraph pm,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_CompilationUnitToModule_24_3_solvecsp_binding = pattern_CompilationUnitToModule_24_3_solvecsp_bindingFBBBBBBB(
				_this, cu, module, model, pm, sourceMatch, targetMatch);
		if (result_pattern_CompilationUnitToModule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnitToModule_24_3_solvecsp_binding[0];

			Object[] result_pattern_CompilationUnitToModule_24_3_solvecsp_black = pattern_CompilationUnitToModule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_CompilationUnitToModule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, cu, module, model, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnitToModule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnitToModule_24_5_matchcorrcontext_blackFBBBB(Model model,
			TypeGraph pm, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph m2pm : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(model,
					ModelToTypeGraph.class, "source")) {
				if (pm.equals(m2pm.getTarget())) {
					_result.add(new Object[] { m2pm, model, pm, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_24_5_matchcorrcontext_greenBBBF(ModelToTypeGraph m2pm,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "CompilationUnitToModule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(m2pm);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { m2pm, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_CompilationUnitToModule_24_6_createcorrespondence_blackBBBBB(
			CompilationUnit cu, TModule module, Model model, TypeGraph pm, CCMatch ccMatch) {
		return new Object[] { cu, module, model, pm, ccMatch };
	}

	public static final Object[] pattern_CompilationUnitToModule_24_6_createcorrespondence_greenBFBB(CompilationUnit cu,
			TModule module, CCMatch ccMatch) {
		ElementToModule cu2m = PmFactory.eINSTANCE.createElementToModule();
		cu2m.setSource(cu);
		cu2m.setTarget(module);
		ccMatch.getCreateCorr().add(cu2m);
		return new Object[] { cu, cu2m, module, ccMatch };
	}

	public static final Object[] pattern_CompilationUnitToModule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_CompilationUnitToModule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "CompilationUnitToModule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnitToModule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_27_1_matchtggpattern_blackBB(CompilationUnit cu,
			Model model) {
		if (model.getCompilationUnits().contains(cu)) {
			return new Object[] { cu, model };
		}
		return null;
	}

	public static final boolean pattern_CompilationUnitToModule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnitToModule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_28_1_matchtggpattern_blackBB(TModule module,
			TypeGraph pm) {
		if (pm.getModules().contains(module)) {
			return new Object[] { module, pm };
		}
		return null;
	}

	public static final boolean pattern_CompilationUnitToModule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnitToModule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_29_1_createresult_blackB(
			CompilationUnitToModule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_CompilationUnitToModule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_CompilationUnitToModule_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph m2pm) {
		if (ruleResult.getCorrObjects().contains(m2pm)) {
			return new Object[] { ruleResult, m2pm };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Model model) {
		if (ruleResult.getSourceObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pm) {
		if (ruleResult.getTargetObjects().contains(pm)) {
			return new Object[] { ruleResult, pm };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnitToModule_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList m2pmList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpM2pm : m2pmList.getEntryObjects()) {
				if (tmpM2pm instanceof ModelToTypeGraph) {
					ModelToTypeGraph m2pm = (ModelToTypeGraph) tmpM2pm;
					Model model = m2pm.getSource();
					if (model != null) {
						TypeGraph pm = m2pm.getTarget();
						if (pm != null) {
							if (pattern_CompilationUnitToModule_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									m2pm) == null) {
								if (pattern_CompilationUnitToModule_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										model) == null) {
									if (pattern_CompilationUnitToModule_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											pm) == null) {
										_result.add(new Object[] { m2pmList, m2pm, model, pm, ruleEntryContainer,
												ruleResult });
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_29_3_solveCSP_bindingFBBBBBB(
			CompilationUnitToModule _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph m2pm, Model model,
			TypeGraph pm, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, m2pm, model, pm, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, m2pm, model, pm, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnitToModule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnitToModule_29_3_solveCSP_bindingAndBlackFBBBBBB(
			CompilationUnitToModule _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph m2pm, Model model,
			TypeGraph pm, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_CompilationUnitToModule_29_3_solveCSP_binding = pattern_CompilationUnitToModule_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, m2pm, model, pm, ruleResult);
		if (result_pattern_CompilationUnitToModule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnitToModule_29_3_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnitToModule_29_3_solveCSP_black = pattern_CompilationUnitToModule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnitToModule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, m2pm, model, pm, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnitToModule_29_4_checkCSP_expressionFBB(
			CompilationUnitToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnitToModule_29_5_checknacs_blackBBB(ModelToTypeGraph m2pm,
			Model model, TypeGraph pm) {
		return new Object[] { m2pm, model, pm };
	}

	public static final Object[] pattern_CompilationUnitToModule_29_6_perform_blackBBBB(ModelToTypeGraph m2pm,
			Model model, TypeGraph pm, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { m2pm, model, pm, ruleResult };
	}

	public static final Object[] pattern_CompilationUnitToModule_29_6_perform_greenFFFBBBB(Model model, TypeGraph pm,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		CompilationUnit cu = JavaFactory.eINSTANCE.createCompilationUnit();
		ElementToModule cu2m = PmFactory.eINSTANCE.createElementToModule();
		TModule module = BasicFactory.eINSTANCE.createTModule();
		Object _localVariable_0 = csp.getValue("cu", "originalFilePath");
		Object _localVariable_1 = csp.getValue("module", "location");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		model.getCompilationUnits().add(cu);
		ruleResult.getSourceObjects().add(cu);
		cu2m.setSource(cu);
		ruleResult.getCorrObjects().add(cu2m);
		pm.getModules().add(module);
		cu2m.setTarget(module);
		ruleResult.getTargetObjects().add(module);
		String cu_originalFilePath_prime = (String) _localVariable_0;
		String module_location_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		cu.setOriginalFilePath(cu_originalFilePath_prime);
		module.setLocation(module_location_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cu, cu2m, module, model, pm, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_CompilationUnitToModule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CompilationUnitToModuleImpl
