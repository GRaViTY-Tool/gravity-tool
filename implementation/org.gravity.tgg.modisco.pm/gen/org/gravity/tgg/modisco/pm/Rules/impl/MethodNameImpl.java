/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Model;

import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MMethodNameToTMethod;
import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodName;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TMethod;
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
 * An implementation of the model object '<em><b>Method Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodNameImpl extends AbstractRuleImpl implements MethodName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MGravityModel mModel, MMethodName mName) {

		Object[] result1_black = MethodNameImpl.pattern_MethodName_0_1_initialbindings_blackBBBB(this, match, mModel,
				mName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mName] = " + mName + ".");
		}

		Object[] result2_bindingAndBlack = MethodNameImpl.pattern_MethodName_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, mModel, mName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mName] = " + mName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodNameImpl.pattern_MethodName_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodNameImpl.pattern_MethodName_0_4_collectelementstobetranslated_blackBBB(match,
					mModel, mName);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mName] = " + mName + ".");
			}
			MethodNameImpl.pattern_MethodName_0_4_collectelementstobetranslated_greenBBBF(match, mModel, mName);
			//nothing EMoflonEdge mModel__mName____mMethodNames = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MethodNameImpl.pattern_MethodName_0_5_collectcontextelements_blackBBB(match,
					mModel, mName);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mName] = " + mName + ".");
			}
			MethodNameImpl.pattern_MethodName_0_5_collectcontextelements_greenBB(match, mModel);

			// 
			MethodNameImpl.pattern_MethodName_0_6_registerobjectstomatch_expressionBBBB(this, match, mModel, mName);
			return MethodNameImpl.pattern_MethodName_0_7_expressionF();
		} else {
			return MethodNameImpl.pattern_MethodName_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodNameImpl
				.pattern_MethodName_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MGravityModel mModel = (MGravityModel) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		ModelToTypeGraph modelToPg = (ModelToTypeGraph) result1_bindingAndBlack[2];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodNameImpl.pattern_MethodName_1_1_performtransformation_greenBFBFB(pg, mName, csp);
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_green[1];
		TMethod tName = (TMethod) result1_green[3];

		Object[] result2_black = MethodNameImpl.pattern_MethodName_1_2_collecttranslatedelements_blackBBB(mNameToTName,
				mName, tName);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mNameToTName] = " + mNameToTName
					+ ", " + "[mName] = " + mName + ", " + "[tName] = " + tName + ".");
		}
		Object[] result2_green = MethodNameImpl.pattern_MethodName_1_2_collecttranslatedelements_greenFBBB(mNameToTName,
				mName, tName);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodNameImpl.pattern_MethodName_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				mModel, pg, modelToPg, mNameToTName, mName, tName);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModel] = " + mModel + ", " + "[pg] = " + pg + ", " + "[modelToPg] = " + modelToPg + ", "
					+ "[mNameToTName] = " + mNameToTName + ", " + "[mName] = " + mName + ", " + "[tName] = " + tName
					+ ".");
		}
		MethodNameImpl.pattern_MethodName_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, mModel, pg, mNameToTName,
				mName, tName);
		//nothing EMoflonEdge pg__tName____methods = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tName__pg____model = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModel__mName____mMethodNames = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		MethodNameImpl.pattern_MethodName_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mModel, pg,
				modelToPg, mNameToTName, mName, tName);
		return MethodNameImpl.pattern_MethodName_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodNameImpl
				.pattern_MethodName_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodNameImpl.pattern_MethodName_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodNameImpl.pattern_MethodName_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MGravityModel mModel = (MGravityModel) result2_binding[0];
		MMethodName mName = (MMethodName) result2_binding[1];
		for (Object[] result2_black : MethodNameImpl.pattern_MethodName_2_2_corematch_blackBFFBB(mModel, mName,
				match)) {
			TypeGraph pg = (TypeGraph) result2_black[1];
			ModelToTypeGraph modelToPg = (ModelToTypeGraph) result2_black[2];
			// ForEach 
			for (Object[] result3_black : MethodNameImpl.pattern_MethodName_2_3_findcontext_blackBBBB(mModel, pg,
					modelToPg, mName)) {
				Object[] result3_green = MethodNameImpl.pattern_MethodName_2_3_findcontext_greenBBBBFFFF(mModel, pg,
						modelToPg, mName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge modelToPg__pg____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge modelToPg__mModel____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mModel__mName____mMethodNames = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = MethodNameImpl
						.pattern_MethodName_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mModel, pg,
								modelToPg, mName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ", "
							+ "[pg] = " + pg + ", " + "[modelToPg] = " + modelToPg + ", " + "[mName] = " + mName + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodNameImpl.pattern_MethodName_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodNameImpl
							.pattern_MethodName_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodNameImpl.pattern_MethodName_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodNameImpl.pattern_MethodName_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MGravityModel mModel, MMethodName mName) {
		match.registerObject("mModel", mModel);
		match.registerObject("mName", mName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MGravityModel mModel, MMethodName mName) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MGravityModel mModel, TypeGraph pg,
			ModelToTypeGraph modelToPg, MMethodName mName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mName.mName", true, csp);
		var_mName_mName.setValue(mName.getMName());
		var_mName_mName.setType("String");

		// Create unbound variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mName_mName, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("modelToPg", modelToPg);
		isApplicableMatch.registerObject("mName", mName);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mModel, EObject pg, EObject modelToPg,
			EObject mNameToTName, EObject mName, EObject tName) {
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("modelToPg", modelToPg);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("tName", tName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mName").eClass())
				.equals("modisco.MMethodName.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph pg, TMethod tName) {

		Object[] result1_black = MethodNameImpl.pattern_MethodName_10_1_initialbindings_blackBBBB(this, match, pg,
				tName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tName] = " + tName + ".");
		}

		Object[] result2_bindingAndBlack = MethodNameImpl.pattern_MethodName_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, pg, tName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tName] = " + tName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodNameImpl.pattern_MethodName_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodNameImpl
					.pattern_MethodName_10_4_collectelementstobetranslated_blackBBB(match, pg, tName);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tName] = " + tName + ".");
			}
			MethodNameImpl.pattern_MethodName_10_4_collectelementstobetranslated_greenBBBFF(match, pg, tName);
			//nothing EMoflonEdge pg__tName____methods = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tName__pg____model = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodNameImpl.pattern_MethodName_10_5_collectcontextelements_blackBBB(match, pg,
					tName);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tName] = " + tName + ".");
			}
			MethodNameImpl.pattern_MethodName_10_5_collectcontextelements_greenBB(match, pg);

			// 
			MethodNameImpl.pattern_MethodName_10_6_registerobjectstomatch_expressionBBBB(this, match, pg, tName);
			return MethodNameImpl.pattern_MethodName_10_7_expressionF();
		} else {
			return MethodNameImpl.pattern_MethodName_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodNameImpl
				.pattern_MethodName_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MGravityModel mModel = (MGravityModel) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		ModelToTypeGraph modelToPg = (ModelToTypeGraph) result1_bindingAndBlack[2];
		TMethod tName = (TMethod) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodNameImpl.pattern_MethodName_11_1_performtransformation_greenBFFBB(mModel, tName,
				csp);
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_green[1];
		MMethodName mName = (MMethodName) result1_green[2];

		Object[] result2_black = MethodNameImpl.pattern_MethodName_11_2_collecttranslatedelements_blackBBB(mNameToTName,
				mName, tName);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mNameToTName] = " + mNameToTName
					+ ", " + "[mName] = " + mName + ", " + "[tName] = " + tName + ".");
		}
		Object[] result2_green = MethodNameImpl
				.pattern_MethodName_11_2_collecttranslatedelements_greenFBBB(mNameToTName, mName, tName);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodNameImpl.pattern_MethodName_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				mModel, pg, modelToPg, mNameToTName, mName, tName);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModel] = " + mModel + ", " + "[pg] = " + pg + ", " + "[modelToPg] = " + modelToPg + ", "
					+ "[mNameToTName] = " + mNameToTName + ", " + "[mName] = " + mName + ", " + "[tName] = " + tName
					+ ".");
		}
		MethodNameImpl.pattern_MethodName_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, mModel, pg,
				mNameToTName, mName, tName);
		//nothing EMoflonEdge pg__tName____methods = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tName__pg____model = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModel__mName____mMethodNames = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		MethodNameImpl.pattern_MethodName_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mModel, pg,
				modelToPg, mNameToTName, mName, tName);
		return MethodNameImpl.pattern_MethodName_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodNameImpl
				.pattern_MethodName_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodNameImpl.pattern_MethodName_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodNameImpl.pattern_MethodName_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph pg = (TypeGraph) result2_binding[0];
		TMethod tName = (TMethod) result2_binding[1];
		for (Object[] result2_black : MethodNameImpl.pattern_MethodName_12_2_corematch_blackFBFBB(pg, tName, match)) {
			MGravityModel mModel = (MGravityModel) result2_black[0];
			ModelToTypeGraph modelToPg = (ModelToTypeGraph) result2_black[2];
			// ForEach 
			for (Object[] result3_black : MethodNameImpl.pattern_MethodName_12_3_findcontext_blackBBBB(mModel, pg,
					modelToPg, tName)) {
				Object[] result3_green = MethodNameImpl.pattern_MethodName_12_3_findcontext_greenBBBBFFFFF(mModel, pg,
						modelToPg, tName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge pg__tName____methods = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge tName__pg____model = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge modelToPg__pg____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge modelToPg__mModel____source = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = MethodNameImpl
						.pattern_MethodName_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mModel, pg,
								modelToPg, tName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ", "
							+ "[pg] = " + pg + ", " + "[modelToPg] = " + modelToPg + ", " + "[tName] = " + tName + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodNameImpl.pattern_MethodName_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodNameImpl
							.pattern_MethodName_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodNameImpl.pattern_MethodName_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodNameImpl.pattern_MethodName_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pg, TMethod tName) {
		match.registerObject("pg", pg);
		match.registerObject("tName", tName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg, TMethod tName) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MGravityModel mModel, TypeGraph pg,
			ModelToTypeGraph modelToPg, TMethod tName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");

		// Create unbound variables
		Variable var_mName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mName.mName", csp);
		var_mName_mName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mName_mName, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("modelToPg", modelToPg);
		isApplicableMatch.registerObject("tName", tName);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mModel, EObject pg, EObject modelToPg,
			EObject mNameToTName, EObject mName, EObject tName) {
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("modelToPg", modelToPg);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("tName", tName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tName").eClass()).equals("basic.TMethod.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_70(EMoflonEdge _edge_methods) {

		Object[] result1_bindingAndBlack = MethodNameImpl
				.pattern_MethodName_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodNameImpl.pattern_MethodName_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodNameImpl
				.pattern_MethodName_20_2_testcorematchandDECs_blackFFB(_edge_methods)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TMethod tName = (TMethod) result2_black[1];
			Object[] result2_green = MethodNameImpl.pattern_MethodName_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodNameImpl.pattern_MethodName_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, pg, tName)) {
				// 
				if (MethodNameImpl.pattern_MethodName_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = MethodNameImpl.pattern_MethodName_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodNameImpl.pattern_MethodName_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodNameImpl.pattern_MethodName_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_73(EMoflonEdge _edge_mMethodNames) {

		Object[] result1_bindingAndBlack = MethodNameImpl
				.pattern_MethodName_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodNameImpl.pattern_MethodName_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodNameImpl
				.pattern_MethodName_21_2_testcorematchandDECs_blackFFB(_edge_mMethodNames)) {
			MGravityModel mModel = (MGravityModel) result2_black[0];
			MMethodName mName = (MMethodName) result2_black[1];
			Object[] result2_green = MethodNameImpl.pattern_MethodName_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodNameImpl.pattern_MethodName_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, mModel, mName)) {
				// 
				if (MethodNameImpl.pattern_MethodName_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = MethodNameImpl.pattern_MethodName_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodNameImpl.pattern_MethodName_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodNameImpl.pattern_MethodName_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodName");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_mName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mName", true, csp);
		var_mName_mName.setValue(__helper.getValue("mName", "mName"));
		var_mName_mName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("MethodName");
		eq0.solve(var_mName_mName, var_tName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tName_tName.setBound(false);
			eq0.solve(var_mName_mName, var_tName_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tName", "tName", var_tName_tName.getValue());
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
		ruleResult.setRule("MethodName");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_mName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mName", true, csp);
		var_mName_mName.setValue(__helper.getValue("mName", "mName"));
		var_mName_mName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("MethodName");
		eq0.solve(var_mName_mName, var_tName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mName_mName.setBound(false);
			eq0.solve(var_mName_mName, var_tName_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mName", "mName", var_mName_mName.getValue());
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

		Object[] result1_black = MethodNameImpl.pattern_MethodName_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodNameImpl.pattern_MethodName_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodNameImpl
				.pattern_MethodName_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MGravityModel mModel = (MGravityModel) result2_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[1];
		MMethodName mName = (MMethodName) result2_bindingAndBlack[2];
		TMethod tName = (TMethod) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = MethodNameImpl.pattern_MethodName_24_3_solvecsp_bindingAndBlackFBBBBBBB(this,
				mModel, pg, mName, tName, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mModel] = " + mModel + ", " + "[pg] = " + pg + ", " + "[mName] = " + mName + ", " + "[tName] = "
					+ tName + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodNameImpl.pattern_MethodName_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodNameImpl.pattern_MethodName_24_5_matchcorrcontext_blackBBFBB(mModel, pg,
					sourceMatch, targetMatch)) {
				ModelToTypeGraph modelToPg = (ModelToTypeGraph) result5_black[2];
				Object[] result5_green = MethodNameImpl.pattern_MethodName_24_5_matchcorrcontext_greenBBBF(modelToPg,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = MethodNameImpl.pattern_MethodName_24_6_createcorrespondence_blackBBBBB(mModel,
						pg, mName, tName, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModel] = " + mModel
							+ ", " + "[pg] = " + pg + ", " + "[mName] = " + mName + ", " + "[tName] = " + tName + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				MethodNameImpl.pattern_MethodName_24_6_createcorrespondence_greenFBBB(mName, tName, ccMatch);
				//nothing MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result6_green[0];

				Object[] result7_black = MethodNameImpl.pattern_MethodName_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodNameImpl.pattern_MethodName_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodNameImpl.pattern_MethodName_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MGravityModel mModel, TypeGraph pg, MMethodName mName, TMethod tName,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mName.mName", true, csp);
		var_mName_mName.setValue(mName.getMName());
		var_mName_mName.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mName_mName, var_tName_tName);
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
	public boolean checkDEC_FWD(MGravityModel mModel, MMethodName mName) {// 
		Object[] result1_black = MethodNameImpl.pattern_MethodName_27_1_matchtggpattern_blackBB(mModel, mName);
		if (result1_black != null) {
			return MethodNameImpl.pattern_MethodName_27_2_expressionF();
		} else {
			return MethodNameImpl.pattern_MethodName_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph pg, TMethod tName) {// 
		Object[] result1_black = MethodNameImpl.pattern_MethodName_28_1_matchtggpattern_blackBB(pg, tName);
		if (result1_black != null) {
			return MethodNameImpl.pattern_MethodName_28_2_expressionF();
		} else {
			return MethodNameImpl.pattern_MethodName_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph modelToPgParameter) {

		Object[] result1_black = MethodNameImpl.pattern_MethodName_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodNameImpl.pattern_MethodName_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodNameImpl
				.pattern_MethodName_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList modelToPgList = (RuleEntryList) result2_black[0];
			MGravityModel mModel = (MGravityModel) result2_black[1];
			ModelToTypeGraph modelToPg = (ModelToTypeGraph) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];

			Object[] result3_bindingAndBlack = MethodNameImpl.pattern_MethodName_29_3_solveCSP_bindingAndBlackFBBBBBB(
					this, isApplicableMatch, mModel, pg, modelToPg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ", "
						+ "[pg] = " + pg + ", " + "[modelToPg] = " + modelToPg + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodNameImpl.pattern_MethodName_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodNameImpl.pattern_MethodName_29_5_checknacs_blackBBB(mModel, pg,
						modelToPg);
				if (result5_black != null) {

					Object[] result6_black = MethodNameImpl.pattern_MethodName_29_6_perform_blackBBBB(mModel, pg,
							modelToPg, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModel] = " + mModel
								+ ", " + "[pg] = " + pg + ", " + "[modelToPg] = " + modelToPg + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					MethodNameImpl.pattern_MethodName_29_6_perform_greenBBFFFBB(mModel, pg, ruleResult, csp);
					//nothing MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result6_green[2];
					//nothing MMethodName mName = (MMethodName) result6_green[3];
					//nothing TMethod tName = (TMethod) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return MethodNameImpl.pattern_MethodName_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MGravityModel mModel, TypeGraph pg,
			ModelToTypeGraph modelToPg, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mName.mName", csp);
		var_mName_mName.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mName_mName, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("modelToPg", modelToPg);
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
		case RulesPackage.METHOD_NAME___IS_APPROPRIATE_FWD__MATCH_MGRAVITYMODEL_MMETHODNAME:
			return isAppropriate_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(MMethodName) arguments.get(2));
		case RulesPackage.METHOD_NAME___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_NAME___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_NAME___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MGRAVITYMODEL_MMETHODNAME:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(MMethodName) arguments.get(2));
			return null;
		case RulesPackage.METHOD_NAME___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MGRAVITYMODEL_MMETHODNAME:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(MMethodName) arguments.get(2));
		case RulesPackage.METHOD_NAME___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_NAME___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TYPEGRAPH_MODELTOTYPEGRAPH_MMETHODNAME:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(TypeGraph) arguments.get(2), (ModelToTypeGraph) arguments.get(3), (MMethodName) arguments.get(4));
		case RulesPackage.METHOD_NAME___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_NAME___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_NAME___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_NAME___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TMETHOD:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TMethod) arguments.get(2));
		case RulesPackage.METHOD_NAME___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_NAME___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_NAME___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TMETHOD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TMethod) arguments.get(2));
			return null;
		case RulesPackage.METHOD_NAME___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TMETHOD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TMethod) arguments.get(2));
		case RulesPackage.METHOD_NAME___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_NAME___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TYPEGRAPH_MODELTOTYPEGRAPH_TMETHOD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(TypeGraph) arguments.get(2), (ModelToTypeGraph) arguments.get(3), (TMethod) arguments.get(4));
		case RulesPackage.METHOD_NAME___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_NAME___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_NAME___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_NAME___IS_APPROPRIATE_BWD_EMOFLON_EDGE_70__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_70((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_NAME___IS_APPROPRIATE_FWD_EMOFLON_EDGE_73__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_73((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_NAME___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_NAME___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_NAME___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_NAME___IS_APPLICABLE_SOLVE_CSP_CC__MGRAVITYMODEL_TYPEGRAPH_MMETHODNAME_TMETHOD_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MGravityModel) arguments.get(0), (TypeGraph) arguments.get(1),
					(MMethodName) arguments.get(2), (TMethod) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.METHOD_NAME___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_NAME___CHECK_DEC_FWD__MGRAVITYMODEL_MMETHODNAME:
			return checkDEC_FWD((MGravityModel) arguments.get(0), (MMethodName) arguments.get(1));
		case RulesPackage.METHOD_NAME___CHECK_DEC_BWD__TYPEGRAPH_TMETHOD:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TMethod) arguments.get(1));
		case RulesPackage.METHOD_NAME___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.METHOD_NAME___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TYPEGRAPH_MODELTOTYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(TypeGraph) arguments.get(2), (ModelToTypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.METHOD_NAME___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodName_0_1_initialbindings_blackBBBB(MethodName _this, Match match,
			MGravityModel mModel, MMethodName mName) {
		return new Object[] { _this, match, mModel, mName };
	}

	public static final Object[] pattern_MethodName_0_2_SolveCSP_bindingFBBBB(MethodName _this, Match match,
			MGravityModel mModel, MMethodName mName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModel, mName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModel, mName };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodName_0_2_SolveCSP_bindingAndBlackFBBBB(MethodName _this, Match match,
			MGravityModel mModel, MMethodName mName) {
		Object[] result_pattern_MethodName_0_2_SolveCSP_binding = pattern_MethodName_0_2_SolveCSP_bindingFBBBB(_this,
				match, mModel, mName);
		if (result_pattern_MethodName_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodName_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodName_0_2_SolveCSP_black = pattern_MethodName_0_2_SolveCSP_blackB(csp);
			if (result_pattern_MethodName_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModel, mName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodName_0_3_CheckCSP_expressionFBB(MethodName _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodName_0_4_collectelementstobetranslated_blackBBB(Match match,
			MGravityModel mModel, MMethodName mName) {
		return new Object[] { match, mModel, mName };
	}

	public static final Object[] pattern_MethodName_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MGravityModel mModel, MMethodName mName) {
		EMoflonEdge mModel__mName____mMethodNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mName);
		String mModel__mName____mMethodNames_name_prime = "mMethodNames";
		mModel__mName____mMethodNames.setSrc(mModel);
		mModel__mName____mMethodNames.setTrg(mName);
		match.getToBeTranslatedEdges().add(mModel__mName____mMethodNames);
		mModel__mName____mMethodNames.setName(mModel__mName____mMethodNames_name_prime);
		return new Object[] { match, mModel, mName, mModel__mName____mMethodNames };
	}

	public static final Object[] pattern_MethodName_0_5_collectcontextelements_blackBBB(Match match,
			MGravityModel mModel, MMethodName mName) {
		return new Object[] { match, mModel, mName };
	}

	public static final Object[] pattern_MethodName_0_5_collectcontextelements_greenBB(Match match,
			MGravityModel mModel) {
		match.getContextNodes().add(mModel);
		return new Object[] { match, mModel };
	}

	public static final void pattern_MethodName_0_6_registerobjectstomatch_expressionBBBB(MethodName _this, Match match,
			MGravityModel mModel, MMethodName mName) {
		_this.registerObjectsToMatch_FWD(match, mModel, mName);

	}

	public static final boolean pattern_MethodName_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodName_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodName_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch.getObject("modelToPg");
		EObject _localVariable_3 = isApplicableMatch.getObject("mName");
		EObject tmpMModel = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpModelToPg = _localVariable_2;
		EObject tmpMName = _localVariable_3;
		if (tmpMModel instanceof MGravityModel) {
			MGravityModel mModel = (MGravityModel) tmpMModel;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph modelToPg = (ModelToTypeGraph) tmpModelToPg;
					if (tmpMName instanceof MMethodName) {
						MMethodName mName = (MMethodName) tmpMName;
						return new Object[] { mModel, pg, modelToPg, mName, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_1_1_performtransformation_blackBBBBFBB(MGravityModel mModel,
			TypeGraph pg, ModelToTypeGraph modelToPg, MMethodName mName, MethodName _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModel, pg, modelToPg, mName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_1_1_performtransformation_bindingAndBlackFFFFFBB(MethodName _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodName_1_1_performtransformation_binding = pattern_MethodName_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodName_1_1_performtransformation_binding != null) {
			MGravityModel mModel = (MGravityModel) result_pattern_MethodName_1_1_performtransformation_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_MethodName_1_1_performtransformation_binding[1];
			ModelToTypeGraph modelToPg = (ModelToTypeGraph) result_pattern_MethodName_1_1_performtransformation_binding[2];
			MMethodName mName = (MMethodName) result_pattern_MethodName_1_1_performtransformation_binding[3];

			Object[] result_pattern_MethodName_1_1_performtransformation_black = pattern_MethodName_1_1_performtransformation_blackBBBBFBB(
					mModel, pg, modelToPg, mName, _this, isApplicableMatch);
			if (result_pattern_MethodName_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodName_1_1_performtransformation_black[4];

				return new Object[] { mModel, pg, modelToPg, mName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_1_1_performtransformation_greenBFBFB(TypeGraph pg,
			MMethodName mName, CSP csp) {
		MMethodNameToTMethod mNameToTName = PmFactory.eINSTANCE.createMMethodNameToTMethod();
		TMethod tName = BasicFactory.eINSTANCE.createTMethod();
		Object _localVariable_0 = csp.getValue("tName", "tName");
		mNameToTName.setSource(mName);
		pg.getMethods().add(tName);
		mNameToTName.setTarget(tName);
		String tName_tName_prime = (String) _localVariable_0;
		tName.setTName(tName_tName_prime);
		return new Object[] { pg, mNameToTName, mName, tName, csp };
	}

	public static final Object[] pattern_MethodName_1_2_collecttranslatedelements_blackBBB(
			MMethodNameToTMethod mNameToTName, MMethodName mName, TMethod tName) {
		return new Object[] { mNameToTName, mName, tName };
	}

	public static final Object[] pattern_MethodName_1_2_collecttranslatedelements_greenFBBB(
			MMethodNameToTMethod mNameToTName, MMethodName mName, TMethod tName) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mNameToTName);
		ruleresult.getTranslatedElements().add(mName);
		ruleresult.getCreatedElements().add(tName);
		return new Object[] { ruleresult, mNameToTName, mName, tName };
	}

	public static final Object[] pattern_MethodName_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject mModel, EObject pg, EObject modelToPg, EObject mNameToTName, EObject mName, EObject tName) {
		if (!mModel.equals(pg)) {
			if (!mModel.equals(modelToPg)) {
				if (!mModel.equals(mNameToTName)) {
					if (!mModel.equals(mName)) {
						if (!mModel.equals(tName)) {
							if (!pg.equals(tName)) {
								if (!modelToPg.equals(pg)) {
									if (!modelToPg.equals(tName)) {
										if (!mNameToTName.equals(pg)) {
											if (!mNameToTName.equals(modelToPg)) {
												if (!mNameToTName.equals(tName)) {
													if (!mName.equals(pg)) {
														if (!mName.equals(modelToPg)) {
															if (!mName.equals(mNameToTName)) {
																if (!mName.equals(tName)) {
																	return new Object[] { ruleresult, mModel, pg,
																			modelToPg, mNameToTName, mName, tName };
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

	public static final Object[] pattern_MethodName_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mModel, EObject pg, EObject mNameToTName, EObject mName,
			EObject tName) {
		EMoflonEdge pg__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mName____mMethodNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodName";
		String pg__tName____methods_name_prime = "methods";
		String tName__pg____model_name_prime = "model";
		String mModel__mName____mMethodNames_name_prime = "mMethodNames";
		String mNameToTName__mName____source_name_prime = "source";
		String mNameToTName__tName____target_name_prime = "target";
		pg__tName____methods.setSrc(pg);
		pg__tName____methods.setTrg(tName);
		ruleresult.getCreatedEdges().add(pg__tName____methods);
		tName__pg____model.setSrc(tName);
		tName__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tName__pg____model);
		mModel__mName____mMethodNames.setSrc(mModel);
		mModel__mName____mMethodNames.setTrg(mName);
		ruleresult.getTranslatedEdges().add(mModel__mName____mMethodNames);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		ruleresult.getCreatedEdges().add(mNameToTName__mName____source);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		ruleresult.getCreatedEdges().add(mNameToTName__tName____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tName____methods.setName(pg__tName____methods_name_prime);
		tName__pg____model.setName(tName__pg____model_name_prime);
		mModel__mName____mMethodNames.setName(mModel__mName____mMethodNames_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		return new Object[] { ruleresult, mModel, pg, mNameToTName, mName, tName, pg__tName____methods,
				tName__pg____model, mModel__mName____mMethodNames, mNameToTName__mName____source,
				mNameToTName__tName____target };
	}

	public static final void pattern_MethodName_1_5_registerobjects_expressionBBBBBBBB(MethodName _this,
			PerformRuleResult ruleresult, EObject mModel, EObject pg, EObject modelToPg, EObject mNameToTName,
			EObject mName, EObject tName) {
		_this.registerObjects_FWD(ruleresult, mModel, pg, modelToPg, mNameToTName, mName, tName);

	}

	public static final PerformRuleResult pattern_MethodName_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodName_2_1_preparereturnvalue_bindingFB(MethodName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_2_1_preparereturnvalue_blackFBB(EClass eClass, MethodName _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodName_2_1_preparereturnvalue_bindingAndBlackFFB(MethodName _this) {
		Object[] result_pattern_MethodName_2_1_preparereturnvalue_binding = pattern_MethodName_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodName_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodName_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodName_2_1_preparereturnvalue_black = pattern_MethodName_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodName_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodName_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodName";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodName_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mModel");
		EObject _localVariable_1 = match.getObject("mName");
		EObject tmpMModel = _localVariable_0;
		EObject tmpMName = _localVariable_1;
		if (tmpMModel instanceof MGravityModel) {
			MGravityModel mModel = (MGravityModel) tmpMModel;
			if (tmpMName instanceof MMethodName) {
				MMethodName mName = (MMethodName) tmpMName;
				return new Object[] { mModel, mName, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodName_2_2_corematch_blackBFFBB(MGravityModel mModel,
			MMethodName mName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph modelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(mModel,
				ModelToTypeGraph.class, "source")) {
			TypeGraph pg = modelToPg.getTarget();
			if (pg != null) {
				_result.add(new Object[] { mModel, pg, modelToPg, mName, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodName_2_3_findcontext_blackBBBB(MGravityModel mModel,
			TypeGraph pg, ModelToTypeGraph modelToPg, MMethodName mName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.equals(modelToPg.getTarget())) {
			if (mModel.equals(modelToPg.getSource())) {
				if (mModel.getMMethodNames().contains(mName)) {
					_result.add(new Object[] { mModel, pg, modelToPg, mName });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodName_2_3_findcontext_greenBBBBFFFF(MGravityModel mModel, TypeGraph pg,
			ModelToTypeGraph modelToPg, MMethodName mName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge modelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToPg__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mName____mMethodNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String modelToPg__pg____target_name_prime = "target";
		String modelToPg__mModel____source_name_prime = "source";
		String mModel__mName____mMethodNames_name_prime = "mMethodNames";
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(modelToPg);
		isApplicableMatch.getAllContextElements().add(mName);
		modelToPg__pg____target.setSrc(modelToPg);
		modelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(modelToPg__pg____target);
		modelToPg__mModel____source.setSrc(modelToPg);
		modelToPg__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(modelToPg__mModel____source);
		mModel__mName____mMethodNames.setSrc(mModel);
		mModel__mName____mMethodNames.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mModel__mName____mMethodNames);
		modelToPg__pg____target.setName(modelToPg__pg____target_name_prime);
		modelToPg__mModel____source.setName(modelToPg__mModel____source_name_prime);
		mModel__mName____mMethodNames.setName(mModel__mName____mMethodNames_name_prime);
		return new Object[] { mModel, pg, modelToPg, mName, isApplicableMatch, modelToPg__pg____target,
				modelToPg__mModel____source, mModel__mName____mMethodNames };
	}

	public static final Object[] pattern_MethodName_2_4_solveCSP_bindingFBBBBBB(MethodName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel mModel, TypeGraph pg, ModelToTypeGraph modelToPg,
			MMethodName mName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mModel, pg, modelToPg, mName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel, pg, modelToPg, mName };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodName_2_4_solveCSP_bindingAndBlackFBBBBBB(MethodName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel mModel, TypeGraph pg, ModelToTypeGraph modelToPg,
			MMethodName mName) {
		Object[] result_pattern_MethodName_2_4_solveCSP_binding = pattern_MethodName_2_4_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, mModel, pg, modelToPg, mName);
		if (result_pattern_MethodName_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodName_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodName_2_4_solveCSP_black = pattern_MethodName_2_4_solveCSP_blackB(csp);
			if (result_pattern_MethodName_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel, pg, modelToPg, mName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodName_2_5_checkCSP_expressionFBB(MethodName _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodName_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodName_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodName";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodName_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodName_10_1_initialbindings_blackBBBB(MethodName _this, Match match,
			TypeGraph pg, TMethod tName) {
		return new Object[] { _this, match, pg, tName };
	}

	public static final Object[] pattern_MethodName_10_2_SolveCSP_bindingFBBBB(MethodName _this, Match match,
			TypeGraph pg, TMethod tName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pg, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pg, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodName_10_2_SolveCSP_bindingAndBlackFBBBB(MethodName _this, Match match,
			TypeGraph pg, TMethod tName) {
		Object[] result_pattern_MethodName_10_2_SolveCSP_binding = pattern_MethodName_10_2_SolveCSP_bindingFBBBB(_this,
				match, pg, tName);
		if (result_pattern_MethodName_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodName_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodName_10_2_SolveCSP_black = pattern_MethodName_10_2_SolveCSP_blackB(csp);
			if (result_pattern_MethodName_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pg, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodName_10_3_CheckCSP_expressionFBB(MethodName _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodName_10_4_collectelementstobetranslated_blackBBB(Match match,
			TypeGraph pg, TMethod tName) {
		return new Object[] { match, pg, tName };
	}

	public static final Object[] pattern_MethodName_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TypeGraph pg, TMethod tName) {
		EMoflonEdge pg__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tName);
		String pg__tName____methods_name_prime = "methods";
		String tName__pg____model_name_prime = "model";
		pg__tName____methods.setSrc(pg);
		pg__tName____methods.setTrg(tName);
		match.getToBeTranslatedEdges().add(pg__tName____methods);
		tName__pg____model.setSrc(tName);
		tName__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tName__pg____model);
		pg__tName____methods.setName(pg__tName____methods_name_prime);
		tName__pg____model.setName(tName__pg____model_name_prime);
		return new Object[] { match, pg, tName, pg__tName____methods, tName__pg____model };
	}

	public static final Object[] pattern_MethodName_10_5_collectcontextelements_blackBBB(Match match, TypeGraph pg,
			TMethod tName) {
		return new Object[] { match, pg, tName };
	}

	public static final Object[] pattern_MethodName_10_5_collectcontextelements_greenBB(Match match, TypeGraph pg) {
		match.getContextNodes().add(pg);
		return new Object[] { match, pg };
	}

	public static final void pattern_MethodName_10_6_registerobjectstomatch_expressionBBBB(MethodName _this,
			Match match, TypeGraph pg, TMethod tName) {
		_this.registerObjectsToMatch_BWD(match, pg, tName);

	}

	public static final boolean pattern_MethodName_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodName_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodName_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch.getObject("modelToPg");
		EObject _localVariable_3 = isApplicableMatch.getObject("tName");
		EObject tmpMModel = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpModelToPg = _localVariable_2;
		EObject tmpTName = _localVariable_3;
		if (tmpMModel instanceof MGravityModel) {
			MGravityModel mModel = (MGravityModel) tmpMModel;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph modelToPg = (ModelToTypeGraph) tmpModelToPg;
					if (tmpTName instanceof TMethod) {
						TMethod tName = (TMethod) tmpTName;
						return new Object[] { mModel, pg, modelToPg, tName, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_11_1_performtransformation_blackBBBBFBB(MGravityModel mModel,
			TypeGraph pg, ModelToTypeGraph modelToPg, TMethod tName, MethodName _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModel, pg, modelToPg, tName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_11_1_performtransformation_bindingAndBlackFFFFFBB(MethodName _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodName_11_1_performtransformation_binding = pattern_MethodName_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodName_11_1_performtransformation_binding != null) {
			MGravityModel mModel = (MGravityModel) result_pattern_MethodName_11_1_performtransformation_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_MethodName_11_1_performtransformation_binding[1];
			ModelToTypeGraph modelToPg = (ModelToTypeGraph) result_pattern_MethodName_11_1_performtransformation_binding[2];
			TMethod tName = (TMethod) result_pattern_MethodName_11_1_performtransformation_binding[3];

			Object[] result_pattern_MethodName_11_1_performtransformation_black = pattern_MethodName_11_1_performtransformation_blackBBBBFBB(
					mModel, pg, modelToPg, tName, _this, isApplicableMatch);
			if (result_pattern_MethodName_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodName_11_1_performtransformation_black[4];

				return new Object[] { mModel, pg, modelToPg, tName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_11_1_performtransformation_greenBFFBB(MGravityModel mModel,
			TMethod tName, CSP csp) {
		MMethodNameToTMethod mNameToTName = PmFactory.eINSTANCE.createMMethodNameToTMethod();
		MMethodName mName = ModiscoFactory.eINSTANCE.createMMethodName();
		Object _localVariable_0 = csp.getValue("mName", "mName");
		mNameToTName.setTarget(tName);
		mModel.getMMethodNames().add(mName);
		mNameToTName.setSource(mName);
		String mName_mName_prime = (String) _localVariable_0;
		mName.setMName(mName_mName_prime);
		return new Object[] { mModel, mNameToTName, mName, tName, csp };
	}

	public static final Object[] pattern_MethodName_11_2_collecttranslatedelements_blackBBB(
			MMethodNameToTMethod mNameToTName, MMethodName mName, TMethod tName) {
		return new Object[] { mNameToTName, mName, tName };
	}

	public static final Object[] pattern_MethodName_11_2_collecttranslatedelements_greenFBBB(
			MMethodNameToTMethod mNameToTName, MMethodName mName, TMethod tName) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mNameToTName);
		ruleresult.getCreatedElements().add(mName);
		ruleresult.getTranslatedElements().add(tName);
		return new Object[] { ruleresult, mNameToTName, mName, tName };
	}

	public static final Object[] pattern_MethodName_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject mModel, EObject pg, EObject modelToPg, EObject mNameToTName, EObject mName, EObject tName) {
		if (!mModel.equals(pg)) {
			if (!mModel.equals(modelToPg)) {
				if (!mModel.equals(mNameToTName)) {
					if (!mModel.equals(mName)) {
						if (!mModel.equals(tName)) {
							if (!pg.equals(tName)) {
								if (!modelToPg.equals(pg)) {
									if (!modelToPg.equals(tName)) {
										if (!mNameToTName.equals(pg)) {
											if (!mNameToTName.equals(modelToPg)) {
												if (!mNameToTName.equals(tName)) {
													if (!mName.equals(pg)) {
														if (!mName.equals(modelToPg)) {
															if (!mName.equals(mNameToTName)) {
																if (!mName.equals(tName)) {
																	return new Object[] { ruleresult, mModel, pg,
																			modelToPg, mNameToTName, mName, tName };
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

	public static final Object[] pattern_MethodName_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mModel, EObject pg, EObject mNameToTName, EObject mName,
			EObject tName) {
		EMoflonEdge pg__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mName____mMethodNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodName";
		String pg__tName____methods_name_prime = "methods";
		String tName__pg____model_name_prime = "model";
		String mModel__mName____mMethodNames_name_prime = "mMethodNames";
		String mNameToTName__mName____source_name_prime = "source";
		String mNameToTName__tName____target_name_prime = "target";
		pg__tName____methods.setSrc(pg);
		pg__tName____methods.setTrg(tName);
		ruleresult.getTranslatedEdges().add(pg__tName____methods);
		tName__pg____model.setSrc(tName);
		tName__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tName__pg____model);
		mModel__mName____mMethodNames.setSrc(mModel);
		mModel__mName____mMethodNames.setTrg(mName);
		ruleresult.getCreatedEdges().add(mModel__mName____mMethodNames);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		ruleresult.getCreatedEdges().add(mNameToTName__mName____source);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		ruleresult.getCreatedEdges().add(mNameToTName__tName____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tName____methods.setName(pg__tName____methods_name_prime);
		tName__pg____model.setName(tName__pg____model_name_prime);
		mModel__mName____mMethodNames.setName(mModel__mName____mMethodNames_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		return new Object[] { ruleresult, mModel, pg, mNameToTName, mName, tName, pg__tName____methods,
				tName__pg____model, mModel__mName____mMethodNames, mNameToTName__mName____source,
				mNameToTName__tName____target };
	}

	public static final void pattern_MethodName_11_5_registerobjects_expressionBBBBBBBB(MethodName _this,
			PerformRuleResult ruleresult, EObject mModel, EObject pg, EObject modelToPg, EObject mNameToTName,
			EObject mName, EObject tName) {
		_this.registerObjects_BWD(ruleresult, mModel, pg, modelToPg, mNameToTName, mName, tName);

	}

	public static final PerformRuleResult pattern_MethodName_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodName_12_1_preparereturnvalue_bindingFB(MethodName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_12_1_preparereturnvalue_blackFBB(EClass eClass, MethodName _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodName_12_1_preparereturnvalue_bindingAndBlackFFB(MethodName _this) {
		Object[] result_pattern_MethodName_12_1_preparereturnvalue_binding = pattern_MethodName_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodName_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodName_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodName_12_1_preparereturnvalue_black = pattern_MethodName_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodName_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodName_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodName";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodName_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pg");
		EObject _localVariable_1 = match.getObject("tName");
		EObject tmpPg = _localVariable_0;
		EObject tmpTName = _localVariable_1;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpTName instanceof TMethod) {
				TMethod tName = (TMethod) tmpTName;
				return new Object[] { pg, tName, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodName_12_2_corematch_blackFBFBB(TypeGraph pg, TMethod tName,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph modelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
				ModelToTypeGraph.class, "target")) {
			Model tmpMModel = modelToPg.getSource();
			if (tmpMModel instanceof MGravityModel) {
				MGravityModel mModel = (MGravityModel) tmpMModel;
				_result.add(new Object[] { mModel, pg, modelToPg, tName, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodName_12_3_findcontext_blackBBBB(MGravityModel mModel,
			TypeGraph pg, ModelToTypeGraph modelToPg, TMethod tName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.getMethods().contains(tName)) {
			if (pg.equals(modelToPg.getTarget())) {
				if (mModel.equals(modelToPg.getSource())) {
					_result.add(new Object[] { mModel, pg, modelToPg, tName });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodName_12_3_findcontext_greenBBBBFFFFF(MGravityModel mModel, TypeGraph pg,
			ModelToTypeGraph modelToPg, TMethod tName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pg__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToPg__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pg__tName____methods_name_prime = "methods";
		String tName__pg____model_name_prime = "model";
		String modelToPg__pg____target_name_prime = "target";
		String modelToPg__mModel____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(modelToPg);
		isApplicableMatch.getAllContextElements().add(tName);
		pg__tName____methods.setSrc(pg);
		pg__tName____methods.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(pg__tName____methods);
		tName__pg____model.setSrc(tName);
		tName__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tName__pg____model);
		modelToPg__pg____target.setSrc(modelToPg);
		modelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(modelToPg__pg____target);
		modelToPg__mModel____source.setSrc(modelToPg);
		modelToPg__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(modelToPg__mModel____source);
		pg__tName____methods.setName(pg__tName____methods_name_prime);
		tName__pg____model.setName(tName__pg____model_name_prime);
		modelToPg__pg____target.setName(modelToPg__pg____target_name_prime);
		modelToPg__mModel____source.setName(modelToPg__mModel____source_name_prime);
		return new Object[] { mModel, pg, modelToPg, tName, isApplicableMatch, pg__tName____methods, tName__pg____model,
				modelToPg__pg____target, modelToPg__mModel____source };
	}

	public static final Object[] pattern_MethodName_12_4_solveCSP_bindingFBBBBBB(MethodName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel mModel, TypeGraph pg, ModelToTypeGraph modelToPg,
			TMethod tName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mModel, pg, modelToPg, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel, pg, modelToPg, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodName_12_4_solveCSP_bindingAndBlackFBBBBBB(MethodName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel mModel, TypeGraph pg, ModelToTypeGraph modelToPg,
			TMethod tName) {
		Object[] result_pattern_MethodName_12_4_solveCSP_binding = pattern_MethodName_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModel, pg, modelToPg, tName);
		if (result_pattern_MethodName_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodName_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodName_12_4_solveCSP_black = pattern_MethodName_12_4_solveCSP_blackB(csp);
			if (result_pattern_MethodName_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel, pg, modelToPg, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodName_12_5_checkCSP_expressionFBB(MethodName _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodName_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodName_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodName";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodName_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodName_20_1_preparereturnvalue_bindingFB(MethodName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodName _this) {
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

	public static final Object[] pattern_MethodName_20_1_preparereturnvalue_bindingAndBlackFFBF(MethodName _this) {
		Object[] result_pattern_MethodName_20_1_preparereturnvalue_binding = pattern_MethodName_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodName_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodName_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodName_20_1_preparereturnvalue_black = pattern_MethodName_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodName_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodName_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodName_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodName_20_2_testcorematchandDECs_black_nac_0BB(TMethod tName,
			TypeGraph pg) {
		TypeGraph __DEC_tName_model_888334 = tName.getModel();
		if (__DEC_tName_model_888334 != null) {
			if (!pg.equals(__DEC_tName_model_888334)) {
				return new Object[] { tName, pg };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodName_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_methods) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_methods.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTName = _edge_methods.getTrg();
			if (tmpTName instanceof TMethod) {
				TMethod tName = (TMethod) tmpTName;
				if (pg.getMethods().contains(tName)) {
					if (pattern_MethodName_20_2_testcorematchandDECs_black_nac_0BB(tName, pg) == null) {
						_result.add(new Object[] { pg, tName, _edge_methods });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodName_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodName_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodName _this, Match match, TypeGraph pg, TMethod tName) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg, tName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodName_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodName _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodName_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodName_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodName_21_1_preparereturnvalue_bindingFB(MethodName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodName _this) {
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

	public static final Object[] pattern_MethodName_21_1_preparereturnvalue_bindingAndBlackFFBF(MethodName _this) {
		Object[] result_pattern_MethodName_21_1_preparereturnvalue_binding = pattern_MethodName_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodName_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodName_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodName_21_1_preparereturnvalue_black = pattern_MethodName_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodName_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodName_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodName_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodName_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mMethodNames) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMModel = _edge_mMethodNames.getSrc();
		if (tmpMModel instanceof MGravityModel) {
			MGravityModel mModel = (MGravityModel) tmpMModel;
			EObject tmpMName = _edge_mMethodNames.getTrg();
			if (tmpMName instanceof MMethodName) {
				MMethodName mName = (MMethodName) tmpMName;
				if (mModel.getMMethodNames().contains(mName)) {
					_result.add(new Object[] { mModel, mName, _edge_mMethodNames });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodName_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodName_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodName _this, Match match, MGravityModel mModel, MMethodName mName) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModel, mName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodName_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodName _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodName_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodName_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodName_24_1_prepare_blackB(MethodName _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodName_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodName_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mModel");
		EObject _localVariable_1 = targetMatch.getObject("pg");
		EObject _localVariable_2 = sourceMatch.getObject("mName");
		EObject _localVariable_3 = targetMatch.getObject("tName");
		EObject tmpMModel = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpMName = _localVariable_2;
		EObject tmpTName = _localVariable_3;
		if (tmpMModel instanceof MGravityModel) {
			MGravityModel mModel = (MGravityModel) tmpMModel;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpMName instanceof MMethodName) {
					MMethodName mName = (MMethodName) tmpMName;
					if (tmpTName instanceof TMethod) {
						TMethod tName = (TMethod) tmpTName;
						return new Object[] { mModel, pg, mName, tName, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_24_2_matchsrctrgcontext_blackBBBBBB(MGravityModel mModel,
			TypeGraph pg, MMethodName mName, TMethod tName, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mModel, pg, mName, tName, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_MethodName_24_2_matchsrctrgcontext_binding = pattern_MethodName_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodName_24_2_matchsrctrgcontext_binding != null) {
			MGravityModel mModel = (MGravityModel) result_pattern_MethodName_24_2_matchsrctrgcontext_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_MethodName_24_2_matchsrctrgcontext_binding[1];
			MMethodName mName = (MMethodName) result_pattern_MethodName_24_2_matchsrctrgcontext_binding[2];
			TMethod tName = (TMethod) result_pattern_MethodName_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_MethodName_24_2_matchsrctrgcontext_black = pattern_MethodName_24_2_matchsrctrgcontext_blackBBBBBB(
					mModel, pg, mName, tName, sourceMatch, targetMatch);
			if (result_pattern_MethodName_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mModel, pg, mName, tName, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodName_24_3_solvecsp_bindingFBBBBBBB(MethodName _this,
			MGravityModel mModel, TypeGraph pg, MMethodName mName, TMethod tName, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mModel, pg, mName, tName, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mModel, pg, mName, tName, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodName_24_3_solvecsp_bindingAndBlackFBBBBBBB(MethodName _this,
			MGravityModel mModel, TypeGraph pg, MMethodName mName, TMethod tName, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_MethodName_24_3_solvecsp_binding = pattern_MethodName_24_3_solvecsp_bindingFBBBBBBB(
				_this, mModel, pg, mName, tName, sourceMatch, targetMatch);
		if (result_pattern_MethodName_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodName_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodName_24_3_solvecsp_black = pattern_MethodName_24_3_solvecsp_blackB(csp);
			if (result_pattern_MethodName_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mModel, pg, mName, tName, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodName_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodName_24_5_matchcorrcontext_blackBBFBB(MGravityModel mModel,
			TypeGraph pg, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph modelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
					ModelToTypeGraph.class, "target")) {
				if (mModel.equals(modelToPg.getSource())) {
					_result.add(new Object[] { mModel, pg, modelToPg, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodName_24_5_matchcorrcontext_greenBBBF(ModelToTypeGraph modelToPg,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodName";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(modelToPg);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { modelToPg, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodName_24_6_createcorrespondence_blackBBBBB(MGravityModel mModel,
			TypeGraph pg, MMethodName mName, TMethod tName, CCMatch ccMatch) {
		return new Object[] { mModel, pg, mName, tName, ccMatch };
	}

	public static final Object[] pattern_MethodName_24_6_createcorrespondence_greenFBBB(MMethodName mName,
			TMethod tName, CCMatch ccMatch) {
		MMethodNameToTMethod mNameToTName = PmFactory.eINSTANCE.createMMethodNameToTMethod();
		mNameToTName.setSource(mName);
		mNameToTName.setTarget(tName);
		ccMatch.getCreateCorr().add(mNameToTName);
		return new Object[] { mNameToTName, mName, tName, ccMatch };
	}

	public static final Object[] pattern_MethodName_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodName_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodName";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodName_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodName_27_1_matchtggpattern_blackBB(MGravityModel mModel,
			MMethodName mName) {
		if (mModel.getMMethodNames().contains(mName)) {
			return new Object[] { mModel, mName };
		}
		return null;
	}

	public static final boolean pattern_MethodName_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodName_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodName_28_1_matchtggpattern_black_nac_0BB(TMethod tName, TypeGraph pg) {
		TypeGraph __DEC_tName_model_748478 = tName.getModel();
		if (__DEC_tName_model_748478 != null) {
			if (!pg.equals(__DEC_tName_model_748478)) {
				return new Object[] { tName, pg };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodName_28_1_matchtggpattern_blackBB(TypeGraph pg, TMethod tName) {
		if (pg.getMethods().contains(tName)) {
			if (pattern_MethodName_28_1_matchtggpattern_black_nac_0BB(tName, pg) == null) {
				return new Object[] { pg, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodName_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodName_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodName_29_1_createresult_blackB(MethodName _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodName_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodName_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MGravityModel mModel) {
		if (ruleResult.getSourceObjects().contains(mModel)) {
			return new Object[] { ruleResult, mModel };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph modelToPg) {
		if (ruleResult.getCorrObjects().contains(modelToPg)) {
			return new Object[] { ruleResult, modelToPg };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodName_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList modelToPgList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpModelToPg : modelToPgList.getEntryObjects()) {
				if (tmpModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph modelToPg = (ModelToTypeGraph) tmpModelToPg;
					Model tmpMModel = modelToPg.getSource();
					if (tmpMModel instanceof MGravityModel) {
						MGravityModel mModel = (MGravityModel) tmpMModel;
						TypeGraph pg = modelToPg.getTarget();
						if (pg != null) {
							if (pattern_MethodName_29_2_isapplicablecore_black_nac_1BB(ruleResult, modelToPg) == null) {
								if (pattern_MethodName_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mModel) == null) {
									if (pattern_MethodName_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											pg) == null) {
										_result.add(new Object[] { modelToPgList, mModel, modelToPg, pg,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_MethodName_29_3_solveCSP_bindingFBBBBBB(MethodName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel mModel, TypeGraph pg, ModelToTypeGraph modelToPg,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mModel, pg, modelToPg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel, pg, modelToPg, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodName_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodName_29_3_solveCSP_bindingAndBlackFBBBBBB(MethodName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel mModel, TypeGraph pg, ModelToTypeGraph modelToPg,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodName_29_3_solveCSP_binding = pattern_MethodName_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModel, pg, modelToPg, ruleResult);
		if (result_pattern_MethodName_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodName_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodName_29_3_solveCSP_black = pattern_MethodName_29_3_solveCSP_blackB(csp);
			if (result_pattern_MethodName_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel, pg, modelToPg, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodName_29_4_checkCSP_expressionFBB(MethodName _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodName_29_5_checknacs_blackBBB(MGravityModel mModel, TypeGraph pg,
			ModelToTypeGraph modelToPg) {
		return new Object[] { mModel, pg, modelToPg };
	}

	public static final Object[] pattern_MethodName_29_6_perform_blackBBBB(MGravityModel mModel, TypeGraph pg,
			ModelToTypeGraph modelToPg, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mModel, pg, modelToPg, ruleResult };
	}

	public static final Object[] pattern_MethodName_29_6_perform_greenBBFFFBB(MGravityModel mModel, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MMethodNameToTMethod mNameToTName = PmFactory.eINSTANCE.createMMethodNameToTMethod();
		MMethodName mName = ModiscoFactory.eINSTANCE.createMMethodName();
		TMethod tName = BasicFactory.eINSTANCE.createTMethod();
		Object _localVariable_0 = csp.getValue("mName", "mName");
		Object _localVariable_1 = csp.getValue("tName", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mNameToTName);
		mModel.getMMethodNames().add(mName);
		mNameToTName.setSource(mName);
		ruleResult.getSourceObjects().add(mName);
		pg.getMethods().add(tName);
		mNameToTName.setTarget(tName);
		ruleResult.getTargetObjects().add(tName);
		String mName_mName_prime = (String) _localVariable_0;
		String tName_tName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		mName.setMName(mName_mName_prime);
		tName.setTName(tName_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mModel, pg, mNameToTName, mName, tName, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodName_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodNameImpl