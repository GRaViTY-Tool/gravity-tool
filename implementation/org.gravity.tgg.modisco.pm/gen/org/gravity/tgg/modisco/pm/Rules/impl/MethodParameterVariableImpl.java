/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.MEntryToTParameter;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodParameterVariable;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TParameter;

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
 * An implementation of the model object '<em><b>Method Parameter Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodParameterVariableImpl extends AbstractRuleImpl implements MethodParameterVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodParameterVariable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MSingleVariableDeclaration mVar, MEntry mEntry) {

		Object[] result1_black = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_0_1_initialbindings_blackBBBB(this, match, mVar, mEntry);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mVar] = " + mVar + ", " + "[mEntry] = " + mEntry + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mVar, mEntry);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mVar] = " + mVar + ", " + "[mEntry] = " + mEntry + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterVariableImpl.pattern_MethodParameterVariable_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterVariableImpl
					.pattern_MethodParameterVariable_0_4_collectelementstobetranslated_blackBBB(match, mVar, mEntry);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mVar] = " + mVar + ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterVariableImpl
					.pattern_MethodParameterVariable_0_4_collectelementstobetranslated_greenBBBFF(match, mVar, mEntry);
			//nothing EMoflonEdge mEntry__mVar____allParameterInstances = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mVar__mEntry____mEntry = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodParameterVariableImpl
					.pattern_MethodParameterVariable_0_5_collectcontextelements_blackBBB(match, mVar, mEntry);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mVar] = " + mVar + ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterVariableImpl.pattern_MethodParameterVariable_0_5_collectcontextelements_greenBB(match,
					mEntry);

			// 
			MethodParameterVariableImpl.pattern_MethodParameterVariable_0_6_registerobjectstomatch_expressionBBBB(this,
					match, mVar, mEntry);
			return MethodParameterVariableImpl.pattern_MethodParameterVariable_0_7_expressionF();
		} else {
			return MethodParameterVariableImpl.pattern_MethodParameterVariable_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) result1_bindingAndBlack[0];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[1];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[2];
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_1_1_performtransformation_greenBFB(mVar, tParameter);
		ASTNodeToTAnnotatable mAnnotToTAnnot = (ASTNodeToTAnnotatable) result1_green[1];

		Object[] result2_black = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_1_2_collecttranslatedelements_blackBB(mVar, mAnnotToTAnnot);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mVar] = " + mVar + ", "
					+ "[mAnnotToTAnnot] = " + mAnnotToTAnnot + ".");
		}
		Object[] result2_green = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_1_2_collecttranslatedelements_greenFBB(mVar, mAnnotToTAnnot);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_1_3_bookkeepingforedges_blackBBBBBB(ruleresult, mVar, mEntry,
						mAnnotToTAnnot, tParameter, mEntryToTParameter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mVar] = " + mVar + ", " + "[mEntry] = " + mEntry + ", " + "[mAnnotToTAnnot] = "
					+ mAnnotToTAnnot + ", " + "[tParameter] = " + tParameter + ", " + "[mEntryToTParameter] = "
					+ mEntryToTParameter + ".");
		}
		MethodParameterVariableImpl.pattern_MethodParameterVariable_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				mVar, mEntry, mAnnotToTAnnot, tParameter);
		//nothing EMoflonEdge mEntry__mVar____allParameterInstances = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mVar__mEntry____mEntry = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mAnnotToTAnnot__mVar____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mAnnotToTAnnot__tParameter____target = (EMoflonEdge) result3_green[8];

		// 
		// 
		MethodParameterVariableImpl.pattern_MethodParameterVariable_1_5_registerobjects_expressionBBBBBBB(this,
				ruleresult, mVar, mEntry, mAnnotToTAnnot, tParameter, mEntryToTParameter);
		return MethodParameterVariableImpl.pattern_MethodParameterVariable_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) result2_binding[0];
		MEntry mEntry = (MEntry) result2_binding[1];
		for (Object[] result2_black : MethodParameterVariableImpl
				.pattern_MethodParameterVariable_2_2_corematch_blackBBFFB(mVar, mEntry, match)) {
			TParameter tParameter = (TParameter) result2_black[2];
			MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result2_black[3];
			// ForEach 
			for (Object[] result3_black : MethodParameterVariableImpl
					.pattern_MethodParameterVariable_2_3_findcontext_blackBBBB(mVar, mEntry, tParameter,
							mEntryToTParameter)) {
				Object[] result3_green = MethodParameterVariableImpl
						.pattern_MethodParameterVariable_2_3_findcontext_greenBBBBFFFFF(mVar, mEntry, tParameter,
								mEntryToTParameter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mEntry__mVar____allParameterInstances = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mVar__mEntry____mEntry = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = MethodParameterVariableImpl
						.pattern_MethodParameterVariable_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mVar, mEntry, tParameter, mEntryToTParameter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mVar] = " + mVar + ", "
							+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", "
							+ "[mEntryToTParameter] = " + mEntryToTParameter + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterVariableImpl.pattern_MethodParameterVariable_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodParameterVariableImpl
							.pattern_MethodParameterVariable_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterVariableImpl.pattern_MethodParameterVariable_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterVariableImpl.pattern_MethodParameterVariable_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MSingleVariableDeclaration mVar, MEntry mEntry) {
		match.registerObject("mVar", mVar);
		match.registerObject("mEntry", mEntry);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MSingleVariableDeclaration mVar, MEntry mEntry) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MSingleVariableDeclaration mVar,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter mEntryToTParameter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mVar", mVar);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mEntryToTParameter", mEntryToTParameter);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mVar, EObject mEntry, EObject mAnnotToTAnnot,
			EObject tParameter, EObject mEntryToTParameter) {
		ruleresult.registerObject("mVar", mVar);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mAnnotToTAnnot", mAnnotToTAnnot);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mVar").eClass())
				.equals("modisco.MSingleVariableDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TParameter tParameter) {

		Object[] result1_black = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_10_1_initialbindings_blackBBB(this, match, tParameter);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tParameter] = " + tParameter + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_10_2_SolveCSP_bindingAndBlackFBBB(this, match, tParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tParameter] = " + tParameter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterVariableImpl.pattern_MethodParameterVariable_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterVariableImpl
					.pattern_MethodParameterVariable_10_4_collectelementstobetranslated_blackBB(match, tParameter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tParameter] = " + tParameter + ".");
			}

			Object[] result5_black = MethodParameterVariableImpl
					.pattern_MethodParameterVariable_10_5_collectcontextelements_blackBB(match, tParameter);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tParameter] = " + tParameter + ".");
			}
			MethodParameterVariableImpl.pattern_MethodParameterVariable_10_5_collectcontextelements_greenBB(match,
					tParameter);

			// 
			MethodParameterVariableImpl.pattern_MethodParameterVariable_10_6_registerobjectstomatch_expressionBBB(this,
					match, tParameter);
			return MethodParameterVariableImpl.pattern_MethodParameterVariable_10_7_expressionF();
		} else {
			return MethodParameterVariableImpl.pattern_MethodParameterVariable_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TParameter tParameter) {
		match.registerObject("tParameter", tParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TParameter tParameter) {// Create CSP
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
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TParameter_6(TParameter tParameter) {

		Object[] result1_bindingAndBlack = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterVariableImpl
				.pattern_MethodParameterVariable_17_2_testcorematchandDECs_blackB(tParameter)) {
			Object[] result2_green = MethodParameterVariableImpl
					.pattern_MethodParameterVariable_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterVariableImpl
					.pattern_MethodParameterVariable_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, tParameter)) {
				// 
				if (MethodParameterVariableImpl
						.pattern_MethodParameterVariable_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterVariableImpl
							.pattern_MethodParameterVariable_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterVariableImpl.pattern_MethodParameterVariable_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterVariableImpl.pattern_MethodParameterVariable_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1024(EMoflonEdge _edge_allParameterInstances) {

		Object[] result1_bindingAndBlack = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterVariableImpl
				.pattern_MethodParameterVariable_18_2_testcorematchandDECs_blackFFB(_edge_allParameterInstances)) {
			MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[1];
			Object[] result2_green = MethodParameterVariableImpl
					.pattern_MethodParameterVariable_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterVariableImpl
					.pattern_MethodParameterVariable_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, mVar, mEntry)) {
				// 
				if (MethodParameterVariableImpl
						.pattern_MethodParameterVariable_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterVariableImpl
							.pattern_MethodParameterVariable_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterVariableImpl.pattern_MethodParameterVariable_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterVariableImpl.pattern_MethodParameterVariable_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodParameterVariable");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
		ruleResult.setRule("MethodParameterVariable");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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

		Object[] result1_black = MethodParameterVariableImpl.pattern_MethodParameterVariable_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterVariableImpl.pattern_MethodParameterVariable_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_21_2_matchsrctrgcontext_bindingAndBlackFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) result2_bindingAndBlack[0];
		MEntry mEntry = (MEntry) result2_bindingAndBlack[1];
		TParameter tParameter = (TParameter) result2_bindingAndBlack[2];

		Object[] result3_bindingAndBlack = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_21_3_solvecsp_bindingAndBlackFBBBBBB(this, mVar, mEntry, tParameter,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mVar] = " + mVar + ", " + "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodParameterVariableImpl.pattern_MethodParameterVariable_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodParameterVariableImpl
					.pattern_MethodParameterVariable_21_5_matchcorrcontext_blackBBFBB(mEntry, tParameter, sourceMatch,
							targetMatch)) {
				MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result5_black[2];
				Object[] result5_green = MethodParameterVariableImpl
						.pattern_MethodParameterVariable_21_5_matchcorrcontext_greenBBBF(mEntryToTParameter,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = MethodParameterVariableImpl
						.pattern_MethodParameterVariable_21_6_createcorrespondence_blackBBBB(mVar, mEntry, tParameter,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mVar] = " + mVar + ", "
							+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				MethodParameterVariableImpl.pattern_MethodParameterVariable_21_6_createcorrespondence_greenBFBB(mVar,
						tParameter, ccMatch);
				//nothing ASTNodeToTAnnotatable mAnnotToTAnnot = (ASTNodeToTAnnotatable) result6_green[1];

				Object[] result7_black = MethodParameterVariableImpl
						.pattern_MethodParameterVariable_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterVariableImpl.pattern_MethodParameterVariable_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return MethodParameterVariableImpl.pattern_MethodParameterVariable_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MSingleVariableDeclaration mVar, MEntry mEntry, TParameter tParameter,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(MSingleVariableDeclaration mVar, MEntry mEntry) {// 
		Object[] result1_black = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_24_1_matchtggpattern_blackBB(mVar, mEntry);
		if (result1_black != null) {
			return MethodParameterVariableImpl.pattern_MethodParameterVariable_24_2_expressionF();
		} else {
			return MethodParameterVariableImpl.pattern_MethodParameterVariable_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TParameter tParameter) {// 
		Object[] result1_black = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_25_1_matchtggpattern_blackB(tParameter);
		if (result1_black != null) {
			return MethodParameterVariableImpl.pattern_MethodParameterVariable_25_2_expressionF();
		} else {
			return MethodParameterVariableImpl.pattern_MethodParameterVariable_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MEntryToTParameter mEntryToTParameterParameter) {

		Object[] result1_black = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterVariableImpl
				.pattern_MethodParameterVariable_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodParameterVariableImpl
				.pattern_MethodParameterVariable_26_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mEntryToTParameterList = (RuleEntryList) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[1];
			MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result2_black[2];
			TParameter tParameter = (TParameter) result2_black[3];

			Object[] result3_bindingAndBlack = MethodParameterVariableImpl
					.pattern_MethodParameterVariable_26_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mEntry, tParameter, mEntryToTParameter, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mEntry] = " + mEntry + ", "
						+ "[tParameter] = " + tParameter + ", " + "[mEntryToTParameter] = " + mEntryToTParameter + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodParameterVariableImpl.pattern_MethodParameterVariable_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodParameterVariableImpl
						.pattern_MethodParameterVariable_26_5_checknacs_blackBBB(mEntry, tParameter,
								mEntryToTParameter);
				if (result5_black != null) {

					Object[] result6_black = MethodParameterVariableImpl
							.pattern_MethodParameterVariable_26_6_perform_blackBBBB(mEntry, tParameter,
									mEntryToTParameter, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mEntry] = " + mEntry
								+ ", " + "[tParameter] = " + tParameter + ", " + "[mEntryToTParameter] = "
								+ mEntryToTParameter + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterVariableImpl.pattern_MethodParameterVariable_26_6_perform_greenFBFBB(mEntry,
							tParameter, ruleResult);
					//nothing MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) result6_green[0];
					//nothing ASTNodeToTAnnotatable mAnnotToTAnnot = (ASTNodeToTAnnotatable) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return MethodParameterVariableImpl.pattern_MethodParameterVariable_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MEntry mEntry, TParameter tParameter,
			MEntryToTParameter mEntryToTParameter, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mEntryToTParameter", mEntryToTParameter);
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
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPROPRIATE_FWD__MATCH_MSINGLEVARIABLEDECLARATION_MENTRY:
				return isAppropriate_FWD((Match) arguments.get(0), (MSingleVariableDeclaration) arguments.get(1),
						(MEntry) arguments.get(2));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MSINGLEVARIABLEDECLARATION_MENTRY:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MSingleVariableDeclaration) arguments.get(1),
						(MEntry) arguments.get(2));
				return null;
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MSINGLEVARIABLEDECLARATION_MENTRY:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
						(MSingleVariableDeclaration) arguments.get(1), (MEntry) arguments.get(2));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MSINGLEVARIABLEDECLARATION_MENTRY_TPARAMETER_MENTRYTOTPARAMETER:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(MSingleVariableDeclaration) arguments.get(1), (MEntry) arguments.get(2),
						(TParameter) arguments.get(3), (MEntryToTParameter) arguments.get(4));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5));
				return null;
			case RulesPackage.METHOD_PARAMETER_VARIABLE___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPROPRIATE_BWD__MATCH_TPARAMETER:
				return isAppropriate_BWD((Match) arguments.get(0), (TParameter) arguments.get(1));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETER:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TParameter) arguments.get(1));
				return null;
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETER:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TParameter) arguments.get(1));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPROPRIATE_BWD_TPARAMETER_6__TPARAMETER:
				return isAppropriate_BWD_TParameter_6((TParameter) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1024__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1024((EMoflonEdge) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPLICABLE_SOLVE_CSP_CC__MSINGLEVARIABLEDECLARATION_MENTRY_TPARAMETER_MATCH_MATCH:
				return isApplicable_solveCsp_CC((MSingleVariableDeclaration) arguments.get(0),
						(MEntry) arguments.get(1), (TParameter) arguments.get(2), (Match) arguments.get(3),
						(Match) arguments.get(4));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___CHECK_DEC_FWD__MSINGLEVARIABLEDECLARATION_MENTRY:
				return checkDEC_FWD((MSingleVariableDeclaration) arguments.get(0), (MEntry) arguments.get(1));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___CHECK_DEC_BWD__TPARAMETER:
				return checkDEC_BWD((TParameter) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___GENERATE_MODEL__RULEENTRYCONTAINER_MENTRYTOTPARAMETER:
				return generateModel((RuleEntryContainer) arguments.get(0), (MEntryToTParameter) arguments.get(1));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MENTRY_TPARAMETER_MENTRYTOTPARAMETER_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MEntry) arguments.get(1),
						(TParameter) arguments.get(2), (MEntryToTParameter) arguments.get(3),
						(ModelgeneratorRuleResult) arguments.get(4));
			case RulesPackage.METHOD_PARAMETER_VARIABLE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameterVariable_0_1_initialbindings_blackBBBB(
			MethodParameterVariable _this, Match match, MSingleVariableDeclaration mVar, MEntry mEntry) {
		return new Object[] { _this, match, mVar, mEntry };
	}

	public static final Object[] pattern_MethodParameterVariable_0_2_SolveCSP_bindingFBBBB(
			MethodParameterVariable _this, Match match, MSingleVariableDeclaration mVar, MEntry mEntry) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mVar, mEntry);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mVar, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterVariable_0_2_SolveCSP_bindingAndBlackFBBBB(
			MethodParameterVariable _this, Match match, MSingleVariableDeclaration mVar, MEntry mEntry) {
		Object[] result_pattern_MethodParameterVariable_0_2_SolveCSP_binding = pattern_MethodParameterVariable_0_2_SolveCSP_bindingFBBBB(
				_this, match, mVar, mEntry);
		if (result_pattern_MethodParameterVariable_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterVariable_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterVariable_0_2_SolveCSP_black = pattern_MethodParameterVariable_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterVariable_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mVar, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterVariable_0_3_CheckCSP_expressionFBB(
			MethodParameterVariable _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_0_4_collectelementstobetranslated_blackBBB(Match match,
			MSingleVariableDeclaration mVar, MEntry mEntry) {
		return new Object[] { match, mVar, mEntry };
	}

	public static final Object[] pattern_MethodParameterVariable_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MSingleVariableDeclaration mVar, MEntry mEntry) {
		EMoflonEdge mEntry__mVar____allParameterInstances = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mVar__mEntry____mEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mVar);
		String mEntry__mVar____allParameterInstances_name_prime = "allParameterInstances";
		String mVar__mEntry____mEntry_name_prime = "mEntry";
		mEntry__mVar____allParameterInstances.setSrc(mEntry);
		mEntry__mVar____allParameterInstances.setTrg(mVar);
		match.getToBeTranslatedEdges().add(mEntry__mVar____allParameterInstances);
		mVar__mEntry____mEntry.setSrc(mVar);
		mVar__mEntry____mEntry.setTrg(mEntry);
		match.getToBeTranslatedEdges().add(mVar__mEntry____mEntry);
		mEntry__mVar____allParameterInstances.setName(mEntry__mVar____allParameterInstances_name_prime);
		mVar__mEntry____mEntry.setName(mVar__mEntry____mEntry_name_prime);
		return new Object[] { match, mVar, mEntry, mEntry__mVar____allParameterInstances, mVar__mEntry____mEntry };
	}

	public static final Object[] pattern_MethodParameterVariable_0_5_collectcontextelements_blackBBB(Match match,
			MSingleVariableDeclaration mVar, MEntry mEntry) {
		return new Object[] { match, mVar, mEntry };
	}

	public static final Object[] pattern_MethodParameterVariable_0_5_collectcontextelements_greenBB(Match match,
			MEntry mEntry) {
		match.getContextNodes().add(mEntry);
		return new Object[] { match, mEntry };
	}

	public static final void pattern_MethodParameterVariable_0_6_registerobjectstomatch_expressionBBBB(
			MethodParameterVariable _this, Match match, MSingleVariableDeclaration mVar, MEntry mEntry) {
		_this.registerObjectsToMatch_FWD(match, mVar, mEntry);

	}

	public static final boolean pattern_MethodParameterVariable_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterVariable_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mVar");
		EObject _localVariable_1 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_2 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_3 = isApplicableMatch.getObject("mEntryToTParameter");
		EObject tmpMVar = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		EObject tmpTParameter = _localVariable_2;
		EObject tmpMEntryToTParameter = _localVariable_3;
		if (tmpMVar instanceof MSingleVariableDeclaration) {
			MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) tmpMVar;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (tmpTParameter instanceof TParameter) {
					TParameter tParameter = (TParameter) tmpTParameter;
					if (tmpMEntryToTParameter instanceof MEntryToTParameter) {
						MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) tmpMEntryToTParameter;
						return new Object[] { mVar, mEntry, tParameter, mEntryToTParameter, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_1_1_performtransformation_blackBBBBFBB(
			MSingleVariableDeclaration mVar, MEntry mEntry, TParameter tParameter,
			MEntryToTParameter mEntryToTParameter, MethodParameterVariable _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mVar, mEntry, tParameter, mEntryToTParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_1_1_performtransformation_bindingAndBlackFFFFFBB(
			MethodParameterVariable _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterVariable_1_1_performtransformation_binding = pattern_MethodParameterVariable_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterVariable_1_1_performtransformation_binding != null) {
			MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) result_pattern_MethodParameterVariable_1_1_performtransformation_binding[0];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterVariable_1_1_performtransformation_binding[1];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterVariable_1_1_performtransformation_binding[2];
			MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result_pattern_MethodParameterVariable_1_1_performtransformation_binding[3];

			Object[] result_pattern_MethodParameterVariable_1_1_performtransformation_black = pattern_MethodParameterVariable_1_1_performtransformation_blackBBBBFBB(
					mVar, mEntry, tParameter, mEntryToTParameter, _this, isApplicableMatch);
			if (result_pattern_MethodParameterVariable_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterVariable_1_1_performtransformation_black[4];

				return new Object[] { mVar, mEntry, tParameter, mEntryToTParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_1_1_performtransformation_greenBFB(
			MSingleVariableDeclaration mVar, TParameter tParameter) {
		ASTNodeToTAnnotatable mAnnotToTAnnot = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		mAnnotToTAnnot.setSource(mVar);
		mAnnotToTAnnot.setTarget(tParameter);
		return new Object[] { mVar, mAnnotToTAnnot, tParameter };
	}

	public static final Object[] pattern_MethodParameterVariable_1_2_collecttranslatedelements_blackBB(
			MSingleVariableDeclaration mVar, ASTNodeToTAnnotatable mAnnotToTAnnot) {
		return new Object[] { mVar, mAnnotToTAnnot };
	}

	public static final Object[] pattern_MethodParameterVariable_1_2_collecttranslatedelements_greenFBB(
			MSingleVariableDeclaration mVar, ASTNodeToTAnnotatable mAnnotToTAnnot) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mVar);
		ruleresult.getCreatedLinkElements().add(mAnnotToTAnnot);
		return new Object[] { ruleresult, mVar, mAnnotToTAnnot };
	}

	public static final Object[] pattern_MethodParameterVariable_1_3_bookkeepingforedges_blackBBBBBB(
			PerformRuleResult ruleresult, EObject mVar, EObject mEntry, EObject mAnnotToTAnnot, EObject tParameter,
			EObject mEntryToTParameter) {
		if (!mVar.equals(tParameter)) {
			if (!mEntry.equals(mVar)) {
				if (!mEntry.equals(tParameter)) {
					if (!mEntry.equals(mEntryToTParameter)) {
						if (!mAnnotToTAnnot.equals(mVar)) {
							if (!mAnnotToTAnnot.equals(mEntry)) {
								if (!mAnnotToTAnnot.equals(tParameter)) {
									if (!mAnnotToTAnnot.equals(mEntryToTParameter)) {
										if (!mEntryToTParameter.equals(mVar)) {
											if (!mEntryToTParameter.equals(tParameter)) {
												return new Object[] { ruleresult, mVar, mEntry, mAnnotToTAnnot,
														tParameter, mEntryToTParameter };
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

	public static final Object[] pattern_MethodParameterVariable_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mVar, EObject mEntry, EObject mAnnotToTAnnot, EObject tParameter) {
		EMoflonEdge mEntry__mVar____allParameterInstances = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mVar__mEntry____mEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotToTAnnot__mVar____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotToTAnnot__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterVariable";
		String mEntry__mVar____allParameterInstances_name_prime = "allParameterInstances";
		String mVar__mEntry____mEntry_name_prime = "mEntry";
		String mAnnotToTAnnot__mVar____source_name_prime = "source";
		String mAnnotToTAnnot__tParameter____target_name_prime = "target";
		mEntry__mVar____allParameterInstances.setSrc(mEntry);
		mEntry__mVar____allParameterInstances.setTrg(mVar);
		ruleresult.getTranslatedEdges().add(mEntry__mVar____allParameterInstances);
		mVar__mEntry____mEntry.setSrc(mVar);
		mVar__mEntry____mEntry.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mVar__mEntry____mEntry);
		mAnnotToTAnnot__mVar____source.setSrc(mAnnotToTAnnot);
		mAnnotToTAnnot__mVar____source.setTrg(mVar);
		ruleresult.getCreatedEdges().add(mAnnotToTAnnot__mVar____source);
		mAnnotToTAnnot__tParameter____target.setSrc(mAnnotToTAnnot);
		mAnnotToTAnnot__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mAnnotToTAnnot__tParameter____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mEntry__mVar____allParameterInstances.setName(mEntry__mVar____allParameterInstances_name_prime);
		mVar__mEntry____mEntry.setName(mVar__mEntry____mEntry_name_prime);
		mAnnotToTAnnot__mVar____source.setName(mAnnotToTAnnot__mVar____source_name_prime);
		mAnnotToTAnnot__tParameter____target.setName(mAnnotToTAnnot__tParameter____target_name_prime);
		return new Object[] { ruleresult, mVar, mEntry, mAnnotToTAnnot, tParameter,
				mEntry__mVar____allParameterInstances, mVar__mEntry____mEntry, mAnnotToTAnnot__mVar____source,
				mAnnotToTAnnot__tParameter____target };
	}

	public static final void pattern_MethodParameterVariable_1_5_registerobjects_expressionBBBBBBB(
			MethodParameterVariable _this, PerformRuleResult ruleresult, EObject mVar, EObject mEntry,
			EObject mAnnotToTAnnot, EObject tParameter, EObject mEntryToTParameter) {
		_this.registerObjects_FWD(ruleresult, mVar, mEntry, mAnnotToTAnnot, tParameter, mEntryToTParameter);

	}

	public static final PerformRuleResult pattern_MethodParameterVariable_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_2_1_preparereturnvalue_bindingFB(
			MethodParameterVariable _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterVariable _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterVariable _this) {
		Object[] result_pattern_MethodParameterVariable_2_1_preparereturnvalue_binding = pattern_MethodParameterVariable_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterVariable_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterVariable_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterVariable_2_1_preparereturnvalue_black = pattern_MethodParameterVariable_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterVariable_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterVariable_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameterVariable";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterVariable_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mVar");
		EObject _localVariable_1 = match.getObject("mEntry");
		EObject tmpMVar = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		if (tmpMVar instanceof MSingleVariableDeclaration) {
			MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) tmpMVar;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				return new Object[] { mVar, mEntry, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterVariable_2_2_corematch_blackBBFFB(
			MSingleVariableDeclaration mVar, MEntry mEntry, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MEntryToTParameter mEntryToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mEntry, MEntryToTParameter.class, "source")) {
			TParameter tParameter = mEntryToTParameter.getTarget();
			if (tParameter != null) {
				_result.add(new Object[] { mVar, mEntry, tParameter, mEntryToTParameter, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterVariable_2_3_findcontext_blackBBBB(
			MSingleVariableDeclaration mVar, MEntry mEntry, TParameter tParameter,
			MEntryToTParameter mEntryToTParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mEntry.getAllParameterInstances().contains(mVar)) {
			if (mEntry.equals(mEntryToTParameter.getSource())) {
				if (tParameter.equals(mEntryToTParameter.getTarget())) {
					_result.add(new Object[] { mVar, mEntry, tParameter, mEntryToTParameter });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_2_3_findcontext_greenBBBBFFFFF(
			MSingleVariableDeclaration mVar, MEntry mEntry, TParameter tParameter,
			MEntryToTParameter mEntryToTParameter) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mEntry__mVar____allParameterInstances = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mVar__mEntry____mEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mEntry__mVar____allParameterInstances_name_prime = "allParameterInstances";
		String mVar__mEntry____mEntry_name_prime = "mEntry";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mVar);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(mEntryToTParameter);
		mEntry__mVar____allParameterInstances.setSrc(mEntry);
		mEntry__mVar____allParameterInstances.setTrg(mVar);
		isApplicableMatch.getAllContextElements().add(mEntry__mVar____allParameterInstances);
		mVar__mEntry____mEntry.setSrc(mVar);
		mVar__mEntry____mEntry.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mVar__mEntry____mEntry);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mEntryToTParameter__mEntry____source);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(mEntryToTParameter__tParameter____target);
		mEntry__mVar____allParameterInstances.setName(mEntry__mVar____allParameterInstances_name_prime);
		mVar__mEntry____mEntry.setName(mVar__mEntry____mEntry_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		return new Object[] { mVar, mEntry, tParameter, mEntryToTParameter, isApplicableMatch,
				mEntry__mVar____allParameterInstances, mVar__mEntry____mEntry, mEntryToTParameter__mEntry____source,
				mEntryToTParameter__tParameter____target };
	}

	public static final Object[] pattern_MethodParameterVariable_2_4_solveCSP_bindingFBBBBBB(
			MethodParameterVariable _this, IsApplicableMatch isApplicableMatch, MSingleVariableDeclaration mVar,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter mEntryToTParameter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mVar, mEntry, tParameter,
				mEntryToTParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mVar, mEntry, tParameter, mEntryToTParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterVariable_2_4_solveCSP_bindingAndBlackFBBBBBB(
			MethodParameterVariable _this, IsApplicableMatch isApplicableMatch, MSingleVariableDeclaration mVar,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter mEntryToTParameter) {
		Object[] result_pattern_MethodParameterVariable_2_4_solveCSP_binding = pattern_MethodParameterVariable_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mVar, mEntry, tParameter, mEntryToTParameter);
		if (result_pattern_MethodParameterVariable_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterVariable_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterVariable_2_4_solveCSP_black = pattern_MethodParameterVariable_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterVariable_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mVar, mEntry, tParameter, mEntryToTParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterVariable_2_5_checkCSP_expressionFBB(
			MethodParameterVariable _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterVariable_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterVariable";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterVariable_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_10_1_initialbindings_blackBBB(
			MethodParameterVariable _this, Match match, TParameter tParameter) {
		return new Object[] { _this, match, tParameter };
	}

	public static final Object[] pattern_MethodParameterVariable_10_2_SolveCSP_bindingFBBB(
			MethodParameterVariable _this, Match match, TParameter tParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterVariable_10_2_SolveCSP_bindingAndBlackFBBB(
			MethodParameterVariable _this, Match match, TParameter tParameter) {
		Object[] result_pattern_MethodParameterVariable_10_2_SolveCSP_binding = pattern_MethodParameterVariable_10_2_SolveCSP_bindingFBBB(
				_this, match, tParameter);
		if (result_pattern_MethodParameterVariable_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterVariable_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterVariable_10_2_SolveCSP_black = pattern_MethodParameterVariable_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterVariable_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterVariable_10_3_CheckCSP_expressionFBB(
			MethodParameterVariable _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_10_4_collectelementstobetranslated_blackBB(Match match,
			TParameter tParameter) {
		return new Object[] { match, tParameter };
	}

	public static final Object[] pattern_MethodParameterVariable_10_5_collectcontextelements_blackBB(Match match,
			TParameter tParameter) {
		return new Object[] { match, tParameter };
	}

	public static final Object[] pattern_MethodParameterVariable_10_5_collectcontextelements_greenBB(Match match,
			TParameter tParameter) {
		match.getContextNodes().add(tParameter);
		return new Object[] { match, tParameter };
	}

	public static final void pattern_MethodParameterVariable_10_6_registerobjectstomatch_expressionBBB(
			MethodParameterVariable _this, Match match, TParameter tParameter) {
		_this.registerObjectsToMatch_BWD(match, tParameter);

	}

	public static final boolean pattern_MethodParameterVariable_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterVariable_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_17_1_preparereturnvalue_bindingFB(
			MethodParameterVariable _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterVariable _this) {
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

	public static final Object[] pattern_MethodParameterVariable_17_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterVariable _this) {
		Object[] result_pattern_MethodParameterVariable_17_1_preparereturnvalue_binding = pattern_MethodParameterVariable_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterVariable_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterVariable_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterVariable_17_1_preparereturnvalue_black = pattern_MethodParameterVariable_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterVariable_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterVariable_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterVariable_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterVariable_17_2_testcorematchandDECs_blackB(
			TParameter tParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tParameter });
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterVariable_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			MethodParameterVariable _this, Match match, TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterVariable_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterVariable _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterVariable_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_18_1_preparereturnvalue_bindingFB(
			MethodParameterVariable _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterVariable _this) {
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

	public static final Object[] pattern_MethodParameterVariable_18_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterVariable _this) {
		Object[] result_pattern_MethodParameterVariable_18_1_preparereturnvalue_binding = pattern_MethodParameterVariable_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterVariable_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterVariable_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterVariable_18_1_preparereturnvalue_black = pattern_MethodParameterVariable_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterVariable_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterVariable_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterVariable_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodParameterVariable_18_2_testcorematchandDECs_black_nac_0BB(
			MSingleVariableDeclaration mVar, MEntry mEntry) {
		MEntry __DEC_mVar_allParameterInstances_394790 = mVar.getMEntry();
		if (__DEC_mVar_allParameterInstances_394790 != null) {
			if (!mEntry.equals(__DEC_mVar_allParameterInstances_394790)) {
				return new Object[] { mVar, mEntry };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterVariable_18_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_allParameterInstances) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMEntry = _edge_allParameterInstances.getSrc();
		if (tmpMEntry instanceof MEntry) {
			MEntry mEntry = (MEntry) tmpMEntry;
			EObject tmpMVar = _edge_allParameterInstances.getTrg();
			if (tmpMVar instanceof MSingleVariableDeclaration) {
				MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) tmpMVar;
				if (mEntry.getAllParameterInstances().contains(mVar)) {
					if (pattern_MethodParameterVariable_18_2_testcorematchandDECs_black_nac_0BB(mVar, mEntry) == null) {
						_result.add(new Object[] { mVar, mEntry, _edge_allParameterInstances });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterVariable_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodParameterVariable _this, Match match, MSingleVariableDeclaration mVar, MEntry mEntry) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mVar, mEntry);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterVariable_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterVariable _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterVariable_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_21_1_prepare_blackB(MethodParameterVariable _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterVariable_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodParameterVariable_21_2_matchsrctrgcontext_bindingFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mVar");
		EObject _localVariable_1 = sourceMatch.getObject("mEntry");
		EObject _localVariable_2 = targetMatch.getObject("tParameter");
		EObject tmpMVar = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		EObject tmpTParameter = _localVariable_2;
		if (tmpMVar instanceof MSingleVariableDeclaration) {
			MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) tmpMVar;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (tmpTParameter instanceof TParameter) {
					TParameter tParameter = (TParameter) tmpTParameter;
					return new Object[] { mVar, mEntry, tParameter, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_21_2_matchsrctrgcontext_blackBBBBB(
			MSingleVariableDeclaration mVar, MEntry mEntry, TParameter tParameter, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mVar, mEntry, tParameter, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_21_2_matchsrctrgcontext_bindingAndBlackFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterVariable_21_2_matchsrctrgcontext_binding = pattern_MethodParameterVariable_21_2_matchsrctrgcontext_bindingFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodParameterVariable_21_2_matchsrctrgcontext_binding != null) {
			MSingleVariableDeclaration mVar = (MSingleVariableDeclaration) result_pattern_MethodParameterVariable_21_2_matchsrctrgcontext_binding[0];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterVariable_21_2_matchsrctrgcontext_binding[1];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterVariable_21_2_matchsrctrgcontext_binding[2];

			Object[] result_pattern_MethodParameterVariable_21_2_matchsrctrgcontext_black = pattern_MethodParameterVariable_21_2_matchsrctrgcontext_blackBBBBB(
					mVar, mEntry, tParameter, sourceMatch, targetMatch);
			if (result_pattern_MethodParameterVariable_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { mVar, mEntry, tParameter, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_21_3_solvecsp_bindingFBBBBBB(
			MethodParameterVariable _this, MSingleVariableDeclaration mVar, MEntry mEntry, TParameter tParameter,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_3 = _this.isApplicable_solveCsp_CC(mVar, mEntry, tParameter, sourceMatch, targetMatch);
		CSP csp = _localVariable_3;
		if (csp != null) {
			return new Object[] { csp, _this, mVar, mEntry, tParameter, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterVariable_21_3_solvecsp_bindingAndBlackFBBBBBB(
			MethodParameterVariable _this, MSingleVariableDeclaration mVar, MEntry mEntry, TParameter tParameter,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterVariable_21_3_solvecsp_binding = pattern_MethodParameterVariable_21_3_solvecsp_bindingFBBBBBB(
				_this, mVar, mEntry, tParameter, sourceMatch, targetMatch);
		if (result_pattern_MethodParameterVariable_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterVariable_21_3_solvecsp_binding[0];

			Object[] result_pattern_MethodParameterVariable_21_3_solvecsp_black = pattern_MethodParameterVariable_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodParameterVariable_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mVar, mEntry, tParameter, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterVariable_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterVariable_21_5_matchcorrcontext_blackBBFBB(
			MEntry mEntry, TParameter tParameter, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MEntryToTParameter mEntryToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mEntry, MEntryToTParameter.class, "source")) {
				if (tParameter.equals(mEntryToTParameter.getTarget())) {
					_result.add(new Object[] { mEntry, tParameter, mEntryToTParameter, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_21_5_matchcorrcontext_greenBBBF(
			MEntryToTParameter mEntryToTParameter, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodParameterVariable";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mEntryToTParameter);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mEntryToTParameter, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodParameterVariable_21_6_createcorrespondence_blackBBBB(
			MSingleVariableDeclaration mVar, MEntry mEntry, TParameter tParameter, CCMatch ccMatch) {
		return new Object[] { mVar, mEntry, tParameter, ccMatch };
	}

	public static final Object[] pattern_MethodParameterVariable_21_6_createcorrespondence_greenBFBB(
			MSingleVariableDeclaration mVar, TParameter tParameter, CCMatch ccMatch) {
		ASTNodeToTAnnotatable mAnnotToTAnnot = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		mAnnotToTAnnot.setSource(mVar);
		mAnnotToTAnnot.setTarget(tParameter);
		ccMatch.getCreateCorr().add(mAnnotToTAnnot);
		return new Object[] { mVar, mAnnotToTAnnot, tParameter, ccMatch };
	}

	public static final Object[] pattern_MethodParameterVariable_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodParameterVariable_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodParameterVariable";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterVariable_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_24_1_matchtggpattern_black_nac_0BB(
			MSingleVariableDeclaration mVar, MEntry mEntry) {
		MEntry __DEC_mVar_allParameterInstances_989085 = mVar.getMEntry();
		if (__DEC_mVar_allParameterInstances_989085 != null) {
			if (!mEntry.equals(__DEC_mVar_allParameterInstances_989085)) {
				return new Object[] { mVar, mEntry };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_24_1_matchtggpattern_blackBB(
			MSingleVariableDeclaration mVar, MEntry mEntry) {
		if (mEntry.getAllParameterInstances().contains(mVar)) {
			if (pattern_MethodParameterVariable_24_1_matchtggpattern_black_nac_0BB(mVar, mEntry) == null) {
				return new Object[] { mVar, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterVariable_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterVariable_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_25_1_matchtggpattern_blackB(TParameter tParameter) {
		return new Object[] { tParameter };
	}

	public static final boolean pattern_MethodParameterVariable_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterVariable_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_26_1_createresult_blackB(
			MethodParameterVariable _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterVariable_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodParameterVariable_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MEntry mEntry) {
		if (ruleResult.getSourceObjects().contains(mEntry)) {
			return new Object[] { ruleResult, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MEntryToTParameter mEntryToTParameter) {
		if (ruleResult.getCorrObjects().contains(mEntryToTParameter)) {
			return new Object[] { ruleResult, mEntryToTParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TParameter tParameter) {
		if (ruleResult.getTargetObjects().contains(tParameter)) {
			return new Object[] { ruleResult, tParameter };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterVariable_26_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mEntryToTParameterList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMEntryToTParameter : mEntryToTParameterList.getEntryObjects()) {
				if (tmpMEntryToTParameter instanceof MEntryToTParameter) {
					MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) tmpMEntryToTParameter;
					MEntry mEntry = mEntryToTParameter.getSource();
					if (mEntry != null) {
						TParameter tParameter = mEntryToTParameter.getTarget();
						if (tParameter != null) {
							if (pattern_MethodParameterVariable_26_2_isapplicablecore_black_nac_1BB(ruleResult,
									mEntryToTParameter) == null) {
								if (pattern_MethodParameterVariable_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										mEntry) == null) {
									if (pattern_MethodParameterVariable_26_2_isapplicablecore_black_nac_2BB(ruleResult,
											tParameter) == null) {
										_result.add(new Object[] { mEntryToTParameterList, mEntry, mEntryToTParameter,
												tParameter, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_MethodParameterVariable_26_3_solveCSP_bindingFBBBBBB(
			MethodParameterVariable _this, IsApplicableMatch isApplicableMatch, MEntry mEntry, TParameter tParameter,
			MEntryToTParameter mEntryToTParameter, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mEntry, tParameter,
				mEntryToTParameter, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mEntry, tParameter, mEntryToTParameter, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterVariable_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterVariable_26_3_solveCSP_bindingAndBlackFBBBBBB(
			MethodParameterVariable _this, IsApplicableMatch isApplicableMatch, MEntry mEntry, TParameter tParameter,
			MEntryToTParameter mEntryToTParameter, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameterVariable_26_3_solveCSP_binding = pattern_MethodParameterVariable_26_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mEntry, tParameter, mEntryToTParameter, ruleResult);
		if (result_pattern_MethodParameterVariable_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterVariable_26_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterVariable_26_3_solveCSP_black = pattern_MethodParameterVariable_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterVariable_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mEntry, tParameter, mEntryToTParameter,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterVariable_26_4_checkCSP_expressionFBB(
			MethodParameterVariable _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterVariable_26_5_checknacs_blackBBB(MEntry mEntry,
			TParameter tParameter, MEntryToTParameter mEntryToTParameter) {
		return new Object[] { mEntry, tParameter, mEntryToTParameter };
	}

	public static final Object[] pattern_MethodParameterVariable_26_6_perform_blackBBBB(MEntry mEntry,
			TParameter tParameter, MEntryToTParameter mEntryToTParameter, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mEntry, tParameter, mEntryToTParameter, ruleResult };
	}

	public static final Object[] pattern_MethodParameterVariable_26_6_perform_greenFBFBB(MEntry mEntry,
			TParameter tParameter, ModelgeneratorRuleResult ruleResult) {
		MSingleVariableDeclaration mVar = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
		ASTNodeToTAnnotatable mAnnotToTAnnot = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mEntry.getAllParameterInstances().add(mVar);
		ruleResult.getSourceObjects().add(mVar);
		mAnnotToTAnnot.setSource(mVar);
		mAnnotToTAnnot.setTarget(tParameter);
		ruleResult.getCorrObjects().add(mAnnotToTAnnot);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mVar, mEntry, mAnnotToTAnnot, tParameter, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameterVariable_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterVariableImpl
