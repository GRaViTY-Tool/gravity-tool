/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ModelToPg;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Model To Pg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ModelToPgImpl extends AbstractRuleImpl implements ModelToPg {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelToPgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getModelToPg();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MGravityModel mModel) {

		Object[] result1_black = ModelToPgImpl.pattern_ModelToPg_0_1_initialbindings_blackBBB(this, match, mModel);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ".");
		}

		Object[] result2_bindingAndBlack = ModelToPgImpl.pattern_ModelToPg_0_2_SolveCSP_bindingAndBlackFBBB(this, match,
				mModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ModelToPgImpl.pattern_ModelToPg_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ModelToPgImpl.pattern_ModelToPg_0_4_collectelementstobetranslated_blackBB(match,
					mModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ".");
			}
			ModelToPgImpl.pattern_ModelToPg_0_4_collectelementstobetranslated_greenBB(match, mModel);

			Object[] result5_black = ModelToPgImpl.pattern_ModelToPg_0_5_collectcontextelements_blackBB(match, mModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ".");
			}
			// 
			ModelToPgImpl.pattern_ModelToPg_0_6_registerobjectstomatch_expressionBBB(this, match, mModel);
			return ModelToPgImpl.pattern_ModelToPg_0_7_expressionF();
		} else {
			return ModelToPgImpl.pattern_ModelToPg_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ModelToPgImpl
				.pattern_ModelToPg_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MGravityModel mModel = (MGravityModel) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = ModelToPgImpl.pattern_ModelToPg_1_1_performtransformation_greenFBFB(mModel, csp);
		TypeGraph tPG = (TypeGraph) result1_green[0];
		ModelToTypeGraph mModelToTPG = (ModelToTypeGraph) result1_green[2];

		Object[] result2_black = ModelToPgImpl.pattern_ModelToPg_1_2_collecttranslatedelements_blackBBB(tPG, mModel,
				mModelToTPG);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPG] = " + tPG + ", "
					+ "[mModel] = " + mModel + ", " + "[mModelToTPG] = " + mModelToTPG + ".");
		}
		Object[] result2_green = ModelToPgImpl.pattern_ModelToPg_1_2_collecttranslatedelements_greenFBBB(tPG, mModel,
				mModelToTPG);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ModelToPgImpl.pattern_ModelToPg_1_3_bookkeepingforedges_blackBBBB(ruleresult, tPG,
				mModel, mModelToTPG);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[tPG] = "
							+ tPG + ", " + "[mModel] = " + mModel + ", " + "[mModelToTPG] = " + mModelToTPG + ".");
		}
		ModelToPgImpl.pattern_ModelToPg_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, tPG, mModel, mModelToTPG);
		//nothing EMoflonEdge mModelToTPG__mModel____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge mModelToTPG__tPG____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		ModelToPgImpl.pattern_ModelToPg_1_5_registerobjects_expressionBBBBB(this, ruleresult, tPG, mModel, mModelToTPG);
		return ModelToPgImpl.pattern_ModelToPg_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ModelToPgImpl
				.pattern_ModelToPg_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ModelToPgImpl.pattern_ModelToPg_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ModelToPgImpl.pattern_ModelToPg_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MGravityModel mModel = (MGravityModel) result2_binding[0];
		for (Object[] result2_black : ModelToPgImpl.pattern_ModelToPg_2_2_corematch_blackBB(mModel, match)) {
			// ForEach 
			for (Object[] result3_black : ModelToPgImpl.pattern_ModelToPg_2_3_findcontext_blackB(mModel)) {
				Object[] result3_green = ModelToPgImpl.pattern_ModelToPg_2_3_findcontext_greenBF(mModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = ModelToPgImpl
						.pattern_ModelToPg_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, mModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ModelToPgImpl.pattern_ModelToPg_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ModelToPgImpl
							.pattern_ModelToPg_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ModelToPgImpl.pattern_ModelToPg_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ModelToPgImpl.pattern_ModelToPg_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MGravityModel mModel) {
		match.registerObject("mModel", mModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MGravityModel mModel) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MGravityModel mModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mModel_name = CSPFactoryHelper.eINSTANCE.createVariable("mModel.name", true, csp);
		var_mModel_name.setValue(mModel.getName());
		var_mModel_name.setType("String");

		// Create unbound variables
		Variable var_tPG_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPG.tName", csp);
		var_tPG_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModel_name, var_tPG_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tPG, EObject mModel, EObject mModelToTPG) {
		ruleresult.registerObject("tPG", tPG);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("mModelToTPG", mModelToTPG);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mModel").eClass())
				.equals("modisco.MGravityModel.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph tPG) {

		Object[] result1_black = ModelToPgImpl.pattern_ModelToPg_10_1_initialbindings_blackBBB(this, match, tPG);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPG] = " + tPG + ".");
		}

		Object[] result2_bindingAndBlack = ModelToPgImpl.pattern_ModelToPg_10_2_SolveCSP_bindingAndBlackFBBB(this,
				match, tPG);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPG] = " + tPG + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ModelToPgImpl.pattern_ModelToPg_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ModelToPgImpl.pattern_ModelToPg_10_4_collectelementstobetranslated_blackBB(match,
					tPG);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPG] = " + tPG + ".");
			}
			ModelToPgImpl.pattern_ModelToPg_10_4_collectelementstobetranslated_greenBB(match, tPG);

			Object[] result5_black = ModelToPgImpl.pattern_ModelToPg_10_5_collectcontextelements_blackBB(match, tPG);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPG] = " + tPG + ".");
			}
			// 
			ModelToPgImpl.pattern_ModelToPg_10_6_registerobjectstomatch_expressionBBB(this, match, tPG);
			return ModelToPgImpl.pattern_ModelToPg_10_7_expressionF();
		} else {
			return ModelToPgImpl.pattern_ModelToPg_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ModelToPgImpl
				.pattern_ModelToPg_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeGraph tPG = (TypeGraph) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = ModelToPgImpl.pattern_ModelToPg_11_1_performtransformation_greenBFFB(tPG, csp);
		MGravityModel mModel = (MGravityModel) result1_green[1];
		ModelToTypeGraph mModelToTPG = (ModelToTypeGraph) result1_green[2];

		Object[] result2_black = ModelToPgImpl.pattern_ModelToPg_11_2_collecttranslatedelements_blackBBB(tPG, mModel,
				mModelToTPG);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPG] = " + tPG + ", "
					+ "[mModel] = " + mModel + ", " + "[mModelToTPG] = " + mModelToTPG + ".");
		}
		Object[] result2_green = ModelToPgImpl.pattern_ModelToPg_11_2_collecttranslatedelements_greenFBBB(tPG, mModel,
				mModelToTPG);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ModelToPgImpl.pattern_ModelToPg_11_3_bookkeepingforedges_blackBBBB(ruleresult, tPG,
				mModel, mModelToTPG);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[tPG] = "
							+ tPG + ", " + "[mModel] = " + mModel + ", " + "[mModelToTPG] = " + mModelToTPG + ".");
		}
		ModelToPgImpl.pattern_ModelToPg_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, tPG, mModel, mModelToTPG);
		//nothing EMoflonEdge mModelToTPG__mModel____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge mModelToTPG__tPG____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		ModelToPgImpl.pattern_ModelToPg_11_5_registerobjects_expressionBBBBB(this, ruleresult, tPG, mModel,
				mModelToTPG);
		return ModelToPgImpl.pattern_ModelToPg_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ModelToPgImpl
				.pattern_ModelToPg_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ModelToPgImpl.pattern_ModelToPg_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ModelToPgImpl.pattern_ModelToPg_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph tPG = (TypeGraph) result2_binding[0];
		for (Object[] result2_black : ModelToPgImpl.pattern_ModelToPg_12_2_corematch_blackBB(tPG, match)) {
			// ForEach 
			for (Object[] result3_black : ModelToPgImpl.pattern_ModelToPg_12_3_findcontext_blackB(tPG)) {
				Object[] result3_green = ModelToPgImpl.pattern_ModelToPg_12_3_findcontext_greenBF(tPG);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = ModelToPgImpl
						.pattern_ModelToPg_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, tPG);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPG] = " + tPG + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ModelToPgImpl.pattern_ModelToPg_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ModelToPgImpl
							.pattern_ModelToPg_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ModelToPgImpl.pattern_ModelToPg_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ModelToPgImpl.pattern_ModelToPg_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph tPG) {
		match.registerObject("tPG", tPG);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph tPG) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph tPG) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tPG_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPG.tName", true, csp);
		var_tPG_tName.setValue(tPG.getTName());
		var_tPG_tName.setType("String");

		// Create unbound variables
		Variable var_mModel_name = CSPFactoryHelper.eINSTANCE.createVariable("mModel.name", csp);
		var_mModel_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModel_name, var_tPG_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPG", tPG);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tPG, EObject mModel, EObject mModelToTPG) {
		ruleresult.registerObject("tPG", tPG);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("mModelToTPG", mModelToTPG);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tPG").eClass()).equals("basic.TypeGraph.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TypeGraph_0(TypeGraph tPG) {

		Object[] result1_bindingAndBlack = ModelToPgImpl
				.pattern_ModelToPg_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ModelToPgImpl.pattern_ModelToPg_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ModelToPgImpl.pattern_ModelToPg_20_2_testcorematchandDECs_blackB(tPG)) {
			Object[] result2_green = ModelToPgImpl.pattern_ModelToPg_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ModelToPgImpl.pattern_ModelToPg_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
					match, tPG)) {
				// 
				if (ModelToPgImpl.pattern_ModelToPg_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = ModelToPgImpl.pattern_ModelToPg_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ModelToPgImpl.pattern_ModelToPg_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ModelToPgImpl.pattern_ModelToPg_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_MGravityModel_0(MGravityModel mModel) {

		Object[] result1_bindingAndBlack = ModelToPgImpl
				.pattern_ModelToPg_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ModelToPgImpl.pattern_ModelToPg_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ModelToPgImpl.pattern_ModelToPg_21_2_testcorematchandDECs_blackB(mModel)) {
			Object[] result2_green = ModelToPgImpl.pattern_ModelToPg_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ModelToPgImpl.pattern_ModelToPg_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
					match, mModel)) {
				// 
				if (ModelToPgImpl.pattern_ModelToPg_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = ModelToPgImpl.pattern_ModelToPg_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ModelToPgImpl.pattern_ModelToPg_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ModelToPgImpl.pattern_ModelToPg_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ModelToPg");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModel_name = CSPFactoryHelper.eINSTANCE.createVariable("mModel", true, csp);
		var_mModel_name.setValue(__helper.getValue("mModel", "name"));
		var_mModel_name.setType("String");

		Variable var_tPG_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPG", true, csp);
		var_tPG_tName.setValue(__helper.getValue("tPG", "tName"));
		var_tPG_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ModelToPg");
		eq0.solve(var_mModel_name, var_tPG_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tPG_tName.setBound(false);
			eq0.solve(var_mModel_name, var_tPG_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tPG", "tName", var_tPG_tName.getValue());
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
		ruleResult.setRule("ModelToPg");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModel_name = CSPFactoryHelper.eINSTANCE.createVariable("mModel", true, csp);
		var_mModel_name.setValue(__helper.getValue("mModel", "name"));
		var_mModel_name.setType("String");

		Variable var_tPG_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPG", true, csp);
		var_tPG_tName.setValue(__helper.getValue("tPG", "tName"));
		var_tPG_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ModelToPg");
		eq0.solve(var_mModel_name, var_tPG_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mModel_name.setBound(false);
			eq0.solve(var_mModel_name, var_tPG_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mModel", "name", var_mModel_name.getValue());
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

		Object[] result1_black = ModelToPgImpl.pattern_ModelToPg_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ModelToPgImpl.pattern_ModelToPg_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ModelToPgImpl
				.pattern_ModelToPg_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TypeGraph tPG = (TypeGraph) result2_bindingAndBlack[0];
		MGravityModel mModel = (MGravityModel) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = ModelToPgImpl.pattern_ModelToPg_24_3_solvecsp_bindingAndBlackFBBBBB(this,
				tPG, mModel, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tPG] = " + tPG + ", " + "[mModel] = " + mModel + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ModelToPgImpl.pattern_ModelToPg_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ModelToPgImpl.pattern_ModelToPg_24_5_matchcorrcontext_blackBB(sourceMatch,
					targetMatch)) {
				Object[] result5_green = ModelToPgImpl.pattern_ModelToPg_24_5_matchcorrcontext_greenBBF(sourceMatch,
						targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = ModelToPgImpl.pattern_ModelToPg_24_6_createcorrespondence_blackBBB(tPG, mModel,
						ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPG] = " + tPG + ", "
							+ "[mModel] = " + mModel + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ModelToPgImpl.pattern_ModelToPg_24_6_createcorrespondence_greenBBFB(tPG, mModel, ccMatch);
				//nothing ModelToTypeGraph mModelToTPG = (ModelToTypeGraph) result6_green[2];

				Object[] result7_black = ModelToPgImpl.pattern_ModelToPg_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ModelToPgImpl.pattern_ModelToPg_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ModelToPgImpl.pattern_ModelToPg_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TypeGraph tPG, MGravityModel mModel, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mModel_name = CSPFactoryHelper.eINSTANCE.createVariable("mModel.name", true, csp);
		var_mModel_name.setValue(mModel.getName());
		var_mModel_name.setType("String");
		Variable var_tPG_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPG.tName", true, csp);
		var_tPG_tName.setValue(tPG.getTName());
		var_tPG_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModel_name, var_tPG_tName);
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
	public boolean checkDEC_FWD(MGravityModel mModel) {// 
		Object[] result1_black = ModelToPgImpl.pattern_ModelToPg_27_1_matchtggpattern_blackB(mModel);
		if (result1_black != null) {
			return ModelToPgImpl.pattern_ModelToPg_27_2_expressionF();
		} else {
			return ModelToPgImpl.pattern_ModelToPg_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph tPG) {// 
		Object[] result1_black = ModelToPgImpl.pattern_ModelToPg_28_1_matchtggpattern_blackB(tPG);
		if (result1_black != null) {
			return ModelToPgImpl.pattern_ModelToPg_28_2_expressionF();
		} else {
			return ModelToPgImpl.pattern_ModelToPg_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = ModelToPgImpl.pattern_ModelToPg_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ModelToPgImpl.pattern_ModelToPg_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = ModelToPgImpl.pattern_ModelToPg_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = ModelToPgImpl.pattern_ModelToPg_29_3_solveCSP_bindingAndBlackFBBB(this,
					isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ModelToPgImpl.pattern_ModelToPg_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = ModelToPgImpl.pattern_ModelToPg_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				ModelToPgImpl.pattern_ModelToPg_29_6_perform_greenFFFBB(ruleResult, csp);
				//nothing TypeGraph tPG = (TypeGraph) result6_green[0];
				//nothing MGravityModel mModel = (MGravityModel) result6_green[1];
				//nothing ModelToTypeGraph mModelToTPG = (ModelToTypeGraph) result6_green[2];

			} else {
			}

		} else {
		}
		return ModelToPgImpl.pattern_ModelToPg_29_7_expressionFB(ruleResult);
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
		Variable var_mModel_name = CSPFactoryHelper.eINSTANCE.createVariable("mModel.name", csp);
		var_mModel_name.setType("String");
		Variable var_tPG_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPG.tName", csp);
		var_tPG_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModel_name, var_tPG_tName);

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
		case RulesPackage.MODEL_TO_PG___IS_APPROPRIATE_FWD__MATCH_MGRAVITYMODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1));
		case RulesPackage.MODEL_TO_PG___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MGRAVITYMODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1));
			return null;
		case RulesPackage.MODEL_TO_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MGRAVITYMODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1));
		case RulesPackage.MODEL_TO_PG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MGRAVITYMODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1));
		case RulesPackage.MODEL_TO_PG___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.MODEL_TO_PG___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1));
		case RulesPackage.MODEL_TO_PG___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1));
			return null;
		case RulesPackage.MODEL_TO_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1));
		case RulesPackage.MODEL_TO_PG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1));
		case RulesPackage.MODEL_TO_PG___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.MODEL_TO_PG___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___IS_APPROPRIATE_BWD_TYPE_GRAPH_0__TYPEGRAPH:
			return isAppropriate_BWD_TypeGraph_0((TypeGraph) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___IS_APPROPRIATE_FWD_MGRAVITY_MODEL_0__MGRAVITYMODEL:
			return isAppropriate_FWD_MGravityModel_0((MGravityModel) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MODEL_TO_PG___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_MGRAVITYMODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeGraph) arguments.get(0), (MGravityModel) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.MODEL_TO_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___CHECK_DEC_FWD__MGRAVITYMODEL:
			return checkDEC_FWD((MGravityModel) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___CHECK_DEC_BWD__TYPEGRAPH:
			return checkDEC_BWD((TypeGraph) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.MODEL_TO_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.MODEL_TO_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ModelToPg_0_1_initialbindings_blackBBB(ModelToPg _this, Match match,
			MGravityModel mModel) {
		return new Object[] { _this, match, mModel };
	}

	public static final Object[] pattern_ModelToPg_0_2_SolveCSP_bindingFBBB(ModelToPg _this, Match match,
			MGravityModel mModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModel };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelToPg_0_2_SolveCSP_bindingAndBlackFBBB(ModelToPg _this, Match match,
			MGravityModel mModel) {
		Object[] result_pattern_ModelToPg_0_2_SolveCSP_binding = pattern_ModelToPg_0_2_SolveCSP_bindingFBBB(_this,
				match, mModel);
		if (result_pattern_ModelToPg_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelToPg_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ModelToPg_0_2_SolveCSP_black = pattern_ModelToPg_0_2_SolveCSP_blackB(csp);
			if (result_pattern_ModelToPg_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModel };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelToPg_0_3_CheckCSP_expressionFBB(ModelToPg _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_0_4_collectelementstobetranslated_blackBB(Match match,
			MGravityModel mModel) {
		return new Object[] { match, mModel };
	}

	public static final Object[] pattern_ModelToPg_0_4_collectelementstobetranslated_greenBB(Match match,
			MGravityModel mModel) {
		match.getToBeTranslatedNodes().add(mModel);
		return new Object[] { match, mModel };
	}

	public static final Object[] pattern_ModelToPg_0_5_collectcontextelements_blackBB(Match match,
			MGravityModel mModel) {
		return new Object[] { match, mModel };
	}

	public static final void pattern_ModelToPg_0_6_registerobjectstomatch_expressionBBB(ModelToPg _this, Match match,
			MGravityModel mModel) {
		_this.registerObjectsToMatch_FWD(match, mModel);

	}

	public static final boolean pattern_ModelToPg_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ModelToPg_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mModel");
		EObject tmpMModel = _localVariable_0;
		if (tmpMModel instanceof MGravityModel) {
			MGravityModel mModel = (MGravityModel) tmpMModel;
			return new Object[] { mModel, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_1_1_performtransformation_blackBFBB(MGravityModel mModel,
			ModelToPg _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_1_1_performtransformation_bindingAndBlackFFBB(ModelToPg _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ModelToPg_1_1_performtransformation_binding = pattern_ModelToPg_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_ModelToPg_1_1_performtransformation_binding != null) {
			MGravityModel mModel = (MGravityModel) result_pattern_ModelToPg_1_1_performtransformation_binding[0];

			Object[] result_pattern_ModelToPg_1_1_performtransformation_black = pattern_ModelToPg_1_1_performtransformation_blackBFBB(
					mModel, _this, isApplicableMatch);
			if (result_pattern_ModelToPg_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ModelToPg_1_1_performtransformation_black[1];

				return new Object[] { mModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_1_1_performtransformation_greenFBFB(MGravityModel mModel, CSP csp) {
		TypeGraph tPG = BasicFactory.eINSTANCE.createTypeGraph();
		ModelToTypeGraph mModelToTPG = PmFactory.eINSTANCE.createModelToTypeGraph();
		Object _localVariable_0 = csp.getValue("tPG", "tName");
		mModelToTPG.setSource(mModel);
		mModelToTPG.setTarget(tPG);
		String tPG_tName_prime = (String) _localVariable_0;
		tPG.setTName(tPG_tName_prime);
		return new Object[] { tPG, mModel, mModelToTPG, csp };
	}

	public static final Object[] pattern_ModelToPg_1_2_collecttranslatedelements_blackBBB(TypeGraph tPG,
			MGravityModel mModel, ModelToTypeGraph mModelToTPG) {
		return new Object[] { tPG, mModel, mModelToTPG };
	}

	public static final Object[] pattern_ModelToPg_1_2_collecttranslatedelements_greenFBBB(TypeGraph tPG,
			MGravityModel mModel, ModelToTypeGraph mModelToTPG) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tPG);
		ruleresult.getTranslatedElements().add(mModel);
		ruleresult.getCreatedLinkElements().add(mModelToTPG);
		return new Object[] { ruleresult, tPG, mModel, mModelToTPG };
	}

	public static final Object[] pattern_ModelToPg_1_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject tPG, EObject mModel, EObject mModelToTPG) {
		if (!mModel.equals(tPG)) {
			if (!mModel.equals(mModelToTPG)) {
				if (!mModelToTPG.equals(tPG)) {
					return new Object[] { ruleresult, tPG, mModel, mModelToTPG };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_1_3_bookkeepingforedges_greenBBBBFF(PerformRuleResult ruleresult,
			EObject tPG, EObject mModel, EObject mModelToTPG) {
		EMoflonEdge mModelToTPG__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTPG__tPG____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ModelToPg";
		String mModelToTPG__mModel____source_name_prime = "source";
		String mModelToTPG__tPG____target_name_prime = "target";
		mModelToTPG__mModel____source.setSrc(mModelToTPG);
		mModelToTPG__mModel____source.setTrg(mModel);
		ruleresult.getCreatedEdges().add(mModelToTPG__mModel____source);
		mModelToTPG__tPG____target.setSrc(mModelToTPG);
		mModelToTPG__tPG____target.setTrg(tPG);
		ruleresult.getCreatedEdges().add(mModelToTPG__tPG____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModelToTPG__mModel____source.setName(mModelToTPG__mModel____source_name_prime);
		mModelToTPG__tPG____target.setName(mModelToTPG__tPG____target_name_prime);
		return new Object[] { ruleresult, tPG, mModel, mModelToTPG, mModelToTPG__mModel____source,
				mModelToTPG__tPG____target };
	}

	public static final void pattern_ModelToPg_1_5_registerobjects_expressionBBBBB(ModelToPg _this,
			PerformRuleResult ruleresult, EObject tPG, EObject mModel, EObject mModelToTPG) {
		_this.registerObjects_FWD(ruleresult, tPG, mModel, mModelToTPG);

	}

	public static final PerformRuleResult pattern_ModelToPg_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelToPg_2_1_preparereturnvalue_bindingFB(ModelToPg _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_2_1_preparereturnvalue_blackFBB(EClass eClass, ModelToPg _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_2_1_preparereturnvalue_bindingAndBlackFFB(ModelToPg _this) {
		Object[] result_pattern_ModelToPg_2_1_preparereturnvalue_binding = pattern_ModelToPg_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelToPg_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ModelToPg_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ModelToPg_2_1_preparereturnvalue_black = pattern_ModelToPg_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ModelToPg_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ModelToPg_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ModelToPg";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ModelToPg_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("mModel");
		EObject tmpMModel = _localVariable_0;
		if (tmpMModel instanceof MGravityModel) {
			MGravityModel mModel = (MGravityModel) tmpMModel;
			return new Object[] { mModel, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ModelToPg_2_2_corematch_blackBB(MGravityModel mModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { mModel, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ModelToPg_2_3_findcontext_blackB(MGravityModel mModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { mModel });
		return _result;
	}

	public static final Object[] pattern_ModelToPg_2_3_findcontext_greenBF(MGravityModel mModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(mModel);
		return new Object[] { mModel, isApplicableMatch };
	}

	public static final Object[] pattern_ModelToPg_2_4_solveCSP_bindingFBBB(ModelToPg _this,
			IsApplicableMatch isApplicableMatch, MGravityModel mModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelToPg_2_4_solveCSP_bindingAndBlackFBBB(ModelToPg _this,
			IsApplicableMatch isApplicableMatch, MGravityModel mModel) {
		Object[] result_pattern_ModelToPg_2_4_solveCSP_binding = pattern_ModelToPg_2_4_solveCSP_bindingFBBB(_this,
				isApplicableMatch, mModel);
		if (result_pattern_ModelToPg_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelToPg_2_4_solveCSP_binding[0];

			Object[] result_pattern_ModelToPg_2_4_solveCSP_black = pattern_ModelToPg_2_4_solveCSP_blackB(csp);
			if (result_pattern_ModelToPg_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelToPg_2_5_checkCSP_expressionFBB(ModelToPg _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ModelToPg_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ModelToPg";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ModelToPg_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelToPg_10_1_initialbindings_blackBBB(ModelToPg _this, Match match,
			TypeGraph tPG) {
		return new Object[] { _this, match, tPG };
	}

	public static final Object[] pattern_ModelToPg_10_2_SolveCSP_bindingFBBB(ModelToPg _this, Match match,
			TypeGraph tPG) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tPG);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPG };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelToPg_10_2_SolveCSP_bindingAndBlackFBBB(ModelToPg _this, Match match,
			TypeGraph tPG) {
		Object[] result_pattern_ModelToPg_10_2_SolveCSP_binding = pattern_ModelToPg_10_2_SolveCSP_bindingFBBB(_this,
				match, tPG);
		if (result_pattern_ModelToPg_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelToPg_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ModelToPg_10_2_SolveCSP_black = pattern_ModelToPg_10_2_SolveCSP_blackB(csp);
			if (result_pattern_ModelToPg_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tPG };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelToPg_10_3_CheckCSP_expressionFBB(ModelToPg _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_10_4_collectelementstobetranslated_blackBB(Match match,
			TypeGraph tPG) {
		return new Object[] { match, tPG };
	}

	public static final Object[] pattern_ModelToPg_10_4_collectelementstobetranslated_greenBB(Match match,
			TypeGraph tPG) {
		match.getToBeTranslatedNodes().add(tPG);
		return new Object[] { match, tPG };
	}

	public static final Object[] pattern_ModelToPg_10_5_collectcontextelements_blackBB(Match match, TypeGraph tPG) {
		return new Object[] { match, tPG };
	}

	public static final void pattern_ModelToPg_10_6_registerobjectstomatch_expressionBBB(ModelToPg _this, Match match,
			TypeGraph tPG) {
		_this.registerObjectsToMatch_BWD(match, tPG);

	}

	public static final boolean pattern_ModelToPg_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ModelToPg_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tPG");
		EObject tmpTPG = _localVariable_0;
		if (tmpTPG instanceof TypeGraph) {
			TypeGraph tPG = (TypeGraph) tmpTPG;
			return new Object[] { tPG, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_11_1_performtransformation_blackBFBB(TypeGraph tPG, ModelToPg _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tPG, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_11_1_performtransformation_bindingAndBlackFFBB(ModelToPg _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ModelToPg_11_1_performtransformation_binding = pattern_ModelToPg_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_ModelToPg_11_1_performtransformation_binding != null) {
			TypeGraph tPG = (TypeGraph) result_pattern_ModelToPg_11_1_performtransformation_binding[0];

			Object[] result_pattern_ModelToPg_11_1_performtransformation_black = pattern_ModelToPg_11_1_performtransformation_blackBFBB(
					tPG, _this, isApplicableMatch);
			if (result_pattern_ModelToPg_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ModelToPg_11_1_performtransformation_black[1];

				return new Object[] { tPG, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_11_1_performtransformation_greenBFFB(TypeGraph tPG, CSP csp) {
		MGravityModel mModel = ModiscoFactory.eINSTANCE.createMGravityModel();
		ModelToTypeGraph mModelToTPG = PmFactory.eINSTANCE.createModelToTypeGraph();
		Object _localVariable_0 = csp.getValue("mModel", "name");
		mModelToTPG.setSource(mModel);
		mModelToTPG.setTarget(tPG);
		String mModel_name_prime = (String) _localVariable_0;
		mModel.setName(mModel_name_prime);
		return new Object[] { tPG, mModel, mModelToTPG, csp };
	}

	public static final Object[] pattern_ModelToPg_11_2_collecttranslatedelements_blackBBB(TypeGraph tPG,
			MGravityModel mModel, ModelToTypeGraph mModelToTPG) {
		return new Object[] { tPG, mModel, mModelToTPG };
	}

	public static final Object[] pattern_ModelToPg_11_2_collecttranslatedelements_greenFBBB(TypeGraph tPG,
			MGravityModel mModel, ModelToTypeGraph mModelToTPG) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tPG);
		ruleresult.getCreatedElements().add(mModel);
		ruleresult.getCreatedLinkElements().add(mModelToTPG);
		return new Object[] { ruleresult, tPG, mModel, mModelToTPG };
	}

	public static final Object[] pattern_ModelToPg_11_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject tPG, EObject mModel, EObject mModelToTPG) {
		if (!mModel.equals(tPG)) {
			if (!mModel.equals(mModelToTPG)) {
				if (!mModelToTPG.equals(tPG)) {
					return new Object[] { ruleresult, tPG, mModel, mModelToTPG };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_11_3_bookkeepingforedges_greenBBBBFF(PerformRuleResult ruleresult,
			EObject tPG, EObject mModel, EObject mModelToTPG) {
		EMoflonEdge mModelToTPG__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTPG__tPG____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ModelToPg";
		String mModelToTPG__mModel____source_name_prime = "source";
		String mModelToTPG__tPG____target_name_prime = "target";
		mModelToTPG__mModel____source.setSrc(mModelToTPG);
		mModelToTPG__mModel____source.setTrg(mModel);
		ruleresult.getCreatedEdges().add(mModelToTPG__mModel____source);
		mModelToTPG__tPG____target.setSrc(mModelToTPG);
		mModelToTPG__tPG____target.setTrg(tPG);
		ruleresult.getCreatedEdges().add(mModelToTPG__tPG____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModelToTPG__mModel____source.setName(mModelToTPG__mModel____source_name_prime);
		mModelToTPG__tPG____target.setName(mModelToTPG__tPG____target_name_prime);
		return new Object[] { ruleresult, tPG, mModel, mModelToTPG, mModelToTPG__mModel____source,
				mModelToTPG__tPG____target };
	}

	public static final void pattern_ModelToPg_11_5_registerobjects_expressionBBBBB(ModelToPg _this,
			PerformRuleResult ruleresult, EObject tPG, EObject mModel, EObject mModelToTPG) {
		_this.registerObjects_BWD(ruleresult, tPG, mModel, mModelToTPG);

	}

	public static final PerformRuleResult pattern_ModelToPg_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelToPg_12_1_preparereturnvalue_bindingFB(ModelToPg _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_12_1_preparereturnvalue_blackFBB(EClass eClass, ModelToPg _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_12_1_preparereturnvalue_bindingAndBlackFFB(ModelToPg _this) {
		Object[] result_pattern_ModelToPg_12_1_preparereturnvalue_binding = pattern_ModelToPg_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelToPg_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ModelToPg_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ModelToPg_12_1_preparereturnvalue_black = pattern_ModelToPg_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ModelToPg_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ModelToPg_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ModelToPg";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ModelToPg_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("tPG");
		EObject tmpTPG = _localVariable_0;
		if (tmpTPG instanceof TypeGraph) {
			TypeGraph tPG = (TypeGraph) tmpTPG;
			return new Object[] { tPG, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ModelToPg_12_2_corematch_blackBB(TypeGraph tPG, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tPG, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ModelToPg_12_3_findcontext_blackB(TypeGraph tPG) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tPG });
		return _result;
	}

	public static final Object[] pattern_ModelToPg_12_3_findcontext_greenBF(TypeGraph tPG) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(tPG);
		return new Object[] { tPG, isApplicableMatch };
	}

	public static final Object[] pattern_ModelToPg_12_4_solveCSP_bindingFBBB(ModelToPg _this,
			IsApplicableMatch isApplicableMatch, TypeGraph tPG) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tPG);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPG };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelToPg_12_4_solveCSP_bindingAndBlackFBBB(ModelToPg _this,
			IsApplicableMatch isApplicableMatch, TypeGraph tPG) {
		Object[] result_pattern_ModelToPg_12_4_solveCSP_binding = pattern_ModelToPg_12_4_solveCSP_bindingFBBB(_this,
				isApplicableMatch, tPG);
		if (result_pattern_ModelToPg_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelToPg_12_4_solveCSP_binding[0];

			Object[] result_pattern_ModelToPg_12_4_solveCSP_black = pattern_ModelToPg_12_4_solveCSP_blackB(csp);
			if (result_pattern_ModelToPg_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPG };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelToPg_12_5_checkCSP_expressionFBB(ModelToPg _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ModelToPg_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ModelToPg";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ModelToPg_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ModelToPg_20_1_preparereturnvalue_bindingFB(ModelToPg _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_20_1_preparereturnvalue_blackFBBF(EClass __eClass, ModelToPg _this) {
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

	public static final Object[] pattern_ModelToPg_20_1_preparereturnvalue_bindingAndBlackFFBF(ModelToPg _this) {
		Object[] result_pattern_ModelToPg_20_1_preparereturnvalue_binding = pattern_ModelToPg_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelToPg_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ModelToPg_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ModelToPg_20_1_preparereturnvalue_black = pattern_ModelToPg_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ModelToPg_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ModelToPg_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ModelToPg_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ModelToPg_20_2_testcorematchandDECs_blackB(TypeGraph tPG) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tPG });
		return _result;
	}

	public static final Object[] pattern_ModelToPg_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ModelToPg_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ModelToPg _this, Match match, TypeGraph tPG) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPG);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ModelToPg_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ModelToPg _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ModelToPg_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ModelToPg_21_1_preparereturnvalue_bindingFB(ModelToPg _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_21_1_preparereturnvalue_blackFBBF(EClass __eClass, ModelToPg _this) {
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

	public static final Object[] pattern_ModelToPg_21_1_preparereturnvalue_bindingAndBlackFFBF(ModelToPg _this) {
		Object[] result_pattern_ModelToPg_21_1_preparereturnvalue_binding = pattern_ModelToPg_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ModelToPg_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ModelToPg_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ModelToPg_21_1_preparereturnvalue_black = pattern_ModelToPg_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ModelToPg_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ModelToPg_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ModelToPg_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ModelToPg_21_2_testcorematchandDECs_blackB(MGravityModel mModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { mModel });
		return _result;
	}

	public static final Object[] pattern_ModelToPg_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ModelToPg_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ModelToPg _this, Match match, MGravityModel mModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ModelToPg_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ModelToPg _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ModelToPg_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ModelToPg_24_1_prepare_blackB(ModelToPg _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ModelToPg_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ModelToPg_24_2_matchsrctrgcontext_bindingFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tPG");
		EObject _localVariable_1 = sourceMatch.getObject("mModel");
		EObject tmpTPG = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		if (tmpTPG instanceof TypeGraph) {
			TypeGraph tPG = (TypeGraph) tmpTPG;
			if (tmpMModel instanceof MGravityModel) {
				MGravityModel mModel = (MGravityModel) tmpMModel;
				return new Object[] { tPG, mModel, targetMatch, sourceMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_24_2_matchsrctrgcontext_blackBBBB(TypeGraph tPG,
			MGravityModel mModel, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tPG, mModel, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_24_2_matchsrctrgcontext_bindingAndBlackFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ModelToPg_24_2_matchsrctrgcontext_binding = pattern_ModelToPg_24_2_matchsrctrgcontext_bindingFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ModelToPg_24_2_matchsrctrgcontext_binding != null) {
			TypeGraph tPG = (TypeGraph) result_pattern_ModelToPg_24_2_matchsrctrgcontext_binding[0];
			MGravityModel mModel = (MGravityModel) result_pattern_ModelToPg_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_ModelToPg_24_2_matchsrctrgcontext_black = pattern_ModelToPg_24_2_matchsrctrgcontext_blackBBBB(
					tPG, mModel, sourceMatch, targetMatch);
			if (result_pattern_ModelToPg_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tPG, mModel, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_24_3_solvecsp_bindingFBBBBB(ModelToPg _this, TypeGraph tPG,
			MGravityModel mModel, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(tPG, mModel, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, tPG, mModel, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelToPg_24_3_solvecsp_bindingAndBlackFBBBBB(ModelToPg _this, TypeGraph tPG,
			MGravityModel mModel, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ModelToPg_24_3_solvecsp_binding = pattern_ModelToPg_24_3_solvecsp_bindingFBBBBB(_this,
				tPG, mModel, sourceMatch, targetMatch);
		if (result_pattern_ModelToPg_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ModelToPg_24_3_solvecsp_binding[0];

			Object[] result_pattern_ModelToPg_24_3_solvecsp_black = pattern_ModelToPg_24_3_solvecsp_blackB(csp);
			if (result_pattern_ModelToPg_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tPG, mModel, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelToPg_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ModelToPg_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_ModelToPg_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ModelToPg";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ModelToPg_24_6_createcorrespondence_blackBBB(TypeGraph tPG,
			MGravityModel mModel, CCMatch ccMatch) {
		return new Object[] { tPG, mModel, ccMatch };
	}

	public static final Object[] pattern_ModelToPg_24_6_createcorrespondence_greenBBFB(TypeGraph tPG,
			MGravityModel mModel, CCMatch ccMatch) {
		ModelToTypeGraph mModelToTPG = PmFactory.eINSTANCE.createModelToTypeGraph();
		mModelToTPG.setSource(mModel);
		mModelToTPG.setTarget(tPG);
		ccMatch.getCreateCorr().add(mModelToTPG);
		return new Object[] { tPG, mModel, mModelToTPG, ccMatch };
	}

	public static final Object[] pattern_ModelToPg_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ModelToPg_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ModelToPg";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ModelToPg_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ModelToPg_27_1_matchtggpattern_blackB(MGravityModel mModel) {
		return new Object[] { mModel };
	}

	public static final boolean pattern_ModelToPg_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ModelToPg_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_28_1_matchtggpattern_blackB(TypeGraph tPG) {
		return new Object[] { tPG };
	}

	public static final boolean pattern_ModelToPg_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ModelToPg_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_29_1_createresult_blackB(ModelToPg _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ModelToPg_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ModelToPg_29_2_isapplicablecore_blackB(ModelToPg _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ModelToPg_29_3_solveCSP_bindingFBBB(ModelToPg _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ModelToPg_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ModelToPg_29_3_solveCSP_bindingAndBlackFBBB(ModelToPg _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ModelToPg_29_3_solveCSP_binding = pattern_ModelToPg_29_3_solveCSP_bindingFBBB(_this,
				isApplicableMatch, ruleResult);
		if (result_pattern_ModelToPg_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ModelToPg_29_3_solveCSP_binding[0];

			Object[] result_pattern_ModelToPg_29_3_solveCSP_black = pattern_ModelToPg_29_3_solveCSP_blackB(csp);
			if (result_pattern_ModelToPg_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ModelToPg_29_4_checkCSP_expressionFBB(ModelToPg _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ModelToPg_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_ModelToPg_29_6_perform_greenFFFBB(ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		TypeGraph tPG = BasicFactory.eINSTANCE.createTypeGraph();
		MGravityModel mModel = ModiscoFactory.eINSTANCE.createMGravityModel();
		ModelToTypeGraph mModelToTPG = PmFactory.eINSTANCE.createModelToTypeGraph();
		Object _localVariable_0 = csp.getValue("tPG", "tName");
		Object _localVariable_1 = csp.getValue("mModel", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(tPG);
		ruleResult.getSourceObjects().add(mModel);
		mModelToTPG.setSource(mModel);
		mModelToTPG.setTarget(tPG);
		ruleResult.getCorrObjects().add(mModelToTPG);
		String tPG_tName_prime = (String) _localVariable_0;
		String mModel_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tPG.setTName(tPG_tName_prime);
		mModel.setName(mModel_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tPG, mModel, mModelToTPG, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ModelToPg_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ModelToPgImpl
