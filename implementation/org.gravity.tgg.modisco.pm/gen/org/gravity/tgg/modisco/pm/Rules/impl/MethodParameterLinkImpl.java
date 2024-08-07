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

import org.gravity.tgg.modisco.pm.MEntryToTParameter;

import org.gravity.tgg.modisco.pm.Rules.MethodParameterLink;
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
 * An implementation of the model object '<em><b>Method Parameter Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodParameterLinkImpl extends AbstractRuleImpl implements MethodParameterLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodParameterLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MEntry mPrevEntry, MEntry mEntry) {

		Object[] result1_black = MethodParameterLinkImpl.pattern_MethodParameterLink_0_1_initialbindings_blackBBBB(this,
				match, mPrevEntry, mEntry);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mPrevEntry] = " + mPrevEntry + ", " + "[mEntry] = " + mEntry + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mPrevEntry, mEntry);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mPrevEntry] = " + mPrevEntry + ", " + "[mEntry] = " + mEntry + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterLinkImpl.pattern_MethodParameterLink_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterLinkImpl
					.pattern_MethodParameterLink_0_4_collectelementstobetranslated_blackBBB(match, mPrevEntry, mEntry);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPrevEntry] = " + mPrevEntry + ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterLinkImpl.pattern_MethodParameterLink_0_4_collectelementstobetranslated_greenBBBFF(match,
					mPrevEntry, mEntry);
			//nothing EMoflonEdge mPrevEntry__mEntry____mNext = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mEntry__mPrevEntry____mPrevious = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodParameterLinkImpl
					.pattern_MethodParameterLink_0_5_collectcontextelements_blackBBB(match, mPrevEntry, mEntry);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPrevEntry] = " + mPrevEntry + ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterLinkImpl.pattern_MethodParameterLink_0_5_collectcontextelements_greenBBB(match, mPrevEntry,
					mEntry);

			// 
			MethodParameterLinkImpl.pattern_MethodParameterLink_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mPrevEntry, mEntry);
			return MethodParameterLinkImpl.pattern_MethodParameterLink_0_7_expressionF();
		} else {
			return MethodParameterLinkImpl.pattern_MethodParameterLink_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) result1_bindingAndBlack[0];
		MEntry mPrevEntry = (MEntry) result1_bindingAndBlack[1];
		TParameter tPrevParameter = (TParameter) result1_bindingAndBlack[2];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[3];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[4];
		MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodParameterLinkImpl.pattern_MethodParameterLink_1_1_performtransformation_greenBB(tPrevParameter,
				tParameter);

		Object[] result2_green = MethodParameterLinkImpl
				.pattern_MethodParameterLink_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterLinkImpl
				.pattern_MethodParameterLink_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
						eSingleVariableDeclarationToTParameter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
					+ "[mPrevEntry] = " + mPrevEntry + ", " + "[tPrevParameter] = " + tPrevParameter + ", "
					+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", "
					+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter + ".");
		}
		MethodParameterLinkImpl.pattern_MethodParameterLink_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				mPrevEntry, tPrevParameter, mEntry, tParameter);
		//nothing EMoflonEdge mPrevEntry__mEntry____mNext = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mEntry__mPrevEntry____mPrevious = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tPrevParameter__tParameter____next = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tParameter__tPrevParameter____previous = (EMoflonEdge) result3_green[8];

		// 
		// 
		MethodParameterLinkImpl.pattern_MethodParameterLink_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
				eSingleVariableDeclarationToTParameter);
		return MethodParameterLinkImpl.pattern_MethodParameterLink_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterLinkImpl
				.pattern_MethodParameterLink_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterLinkImpl.pattern_MethodParameterLink_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MEntry mPrevEntry = (MEntry) result2_binding[0];
		MEntry mEntry = (MEntry) result2_binding[1];
		for (Object[] result2_black : MethodParameterLinkImpl
				.pattern_MethodParameterLink_2_2_corematch_blackFBFBFFB(mPrevEntry, mEntry, match)) {
			MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) result2_black[0];
			TParameter tPrevParameter = (TParameter) result2_black[2];
			TParameter tParameter = (TParameter) result2_black[4];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodParameterLinkImpl
					.pattern_MethodParameterLink_2_3_findcontext_blackBBBBBB(mmethodSignatureToTMethodSignature,
							mPrevEntry, tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter)) {
				Object[] result3_green = MethodParameterLinkImpl
						.pattern_MethodParameterLink_2_3_findcontext_greenBBBBBBFFFFFFF(
								mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
								eSingleVariableDeclarationToTParameter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mmethodSignatureToTMethodSignature__mPrevEntry____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mmethodSignatureToTMethodSignature__tPrevParameter____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mPrevEntry__mEntry____mNext = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mEntry__mPrevEntry____mPrevious = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = MethodParameterLinkImpl
						.pattern_MethodParameterLink_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
								eSingleVariableDeclarationToTParameter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
							+ "[mPrevEntry] = " + mPrevEntry + ", " + "[tPrevParameter] = " + tPrevParameter + ", "
							+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", "
							+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterLinkImpl.pattern_MethodParameterLink_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodParameterLinkImpl
							.pattern_MethodParameterLink_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterLinkImpl.pattern_MethodParameterLink_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterLinkImpl.pattern_MethodParameterLink_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MEntry mPrevEntry, MEntry mEntry) {
		match.registerObject("mPrevEntry", mPrevEntry);
		match.registerObject("mEntry", mEntry);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MEntry mPrevEntry, MEntry mEntry) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		isApplicableMatch.registerObject("mPrevEntry", mPrevEntry);
		isApplicableMatch.registerObject("tPrevParameter", tPrevParameter);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature,
			EObject mPrevEntry, EObject tPrevParameter, EObject mEntry, EObject tParameter,
			EObject eSingleVariableDeclarationToTParameter) {
		ruleresult.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		ruleresult.registerObject("mPrevEntry", mPrevEntry);
		ruleresult.registerObject("tPrevParameter", tPrevParameter);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("eSingleVariableDeclarationToTParameter", eSingleVariableDeclarationToTParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TParameter tPrevParameter, TParameter tParameter) {

		Object[] result1_black = MethodParameterLinkImpl
				.pattern_MethodParameterLink_10_1_initialbindings_blackBBBB(this, match, tPrevParameter, tParameter);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPrevParameter] = " + tPrevParameter + ", " + "[tParameter] = "
					+ tParameter + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tPrevParameter,
						tParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPrevParameter] = " + tPrevParameter + ", " + "[tParameter] = "
					+ tParameter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterLinkImpl.pattern_MethodParameterLink_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterLinkImpl
					.pattern_MethodParameterLink_10_4_collectelementstobetranslated_blackBBB(match, tPrevParameter,
							tParameter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPrevParameter] = " + tPrevParameter + ", " + "[tParameter] = " + tParameter + ".");
			}
			MethodParameterLinkImpl.pattern_MethodParameterLink_10_4_collectelementstobetranslated_greenBBBFF(match,
					tPrevParameter, tParameter);
			//nothing EMoflonEdge tPrevParameter__tParameter____next = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tParameter__tPrevParameter____previous = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodParameterLinkImpl
					.pattern_MethodParameterLink_10_5_collectcontextelements_blackBBB(match, tPrevParameter,
							tParameter);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPrevParameter] = " + tPrevParameter + ", " + "[tParameter] = " + tParameter + ".");
			}
			MethodParameterLinkImpl.pattern_MethodParameterLink_10_5_collectcontextelements_greenBBB(match,
					tPrevParameter, tParameter);

			// 
			MethodParameterLinkImpl.pattern_MethodParameterLink_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tPrevParameter, tParameter);
			return MethodParameterLinkImpl.pattern_MethodParameterLink_10_7_expressionF();
		} else {
			return MethodParameterLinkImpl.pattern_MethodParameterLink_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) result1_bindingAndBlack[0];
		MEntry mPrevEntry = (MEntry) result1_bindingAndBlack[1];
		TParameter tPrevParameter = (TParameter) result1_bindingAndBlack[2];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[3];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[4];
		MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodParameterLinkImpl.pattern_MethodParameterLink_11_1_performtransformation_greenBB(mPrevEntry, mEntry);

		Object[] result2_green = MethodParameterLinkImpl
				.pattern_MethodParameterLink_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterLinkImpl
				.pattern_MethodParameterLink_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
						eSingleVariableDeclarationToTParameter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
					+ "[mPrevEntry] = " + mPrevEntry + ", " + "[tPrevParameter] = " + tPrevParameter + ", "
					+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", "
					+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter + ".");
		}
		MethodParameterLinkImpl.pattern_MethodParameterLink_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				mPrevEntry, tPrevParameter, mEntry, tParameter);
		//nothing EMoflonEdge mPrevEntry__mEntry____mNext = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mEntry__mPrevEntry____mPrevious = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tPrevParameter__tParameter____next = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tParameter__tPrevParameter____previous = (EMoflonEdge) result3_green[8];

		// 
		// 
		MethodParameterLinkImpl.pattern_MethodParameterLink_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
				eSingleVariableDeclarationToTParameter);
		return MethodParameterLinkImpl.pattern_MethodParameterLink_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterLinkImpl
				.pattern_MethodParameterLink_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterLinkImpl.pattern_MethodParameterLink_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TParameter tPrevParameter = (TParameter) result2_binding[0];
		TParameter tParameter = (TParameter) result2_binding[1];
		for (Object[] result2_black : MethodParameterLinkImpl
				.pattern_MethodParameterLink_12_2_corematch_blackFFBFBFB(tPrevParameter, tParameter, match)) {
			MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) result2_black[0];
			MEntry mPrevEntry = (MEntry) result2_black[1];
			MEntry mEntry = (MEntry) result2_black[3];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodParameterLinkImpl
					.pattern_MethodParameterLink_12_3_findcontext_blackBBBBBB(mmethodSignatureToTMethodSignature,
							mPrevEntry, tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter)) {
				Object[] result3_green = MethodParameterLinkImpl
						.pattern_MethodParameterLink_12_3_findcontext_greenBBBBBBFFFFFFF(
								mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
								eSingleVariableDeclarationToTParameter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mmethodSignatureToTMethodSignature__mPrevEntry____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mmethodSignatureToTMethodSignature__tPrevParameter____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tPrevParameter__tParameter____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tParameter__tPrevParameter____previous = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = MethodParameterLinkImpl
						.pattern_MethodParameterLink_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
								eSingleVariableDeclarationToTParameter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
							+ "[mPrevEntry] = " + mPrevEntry + ", " + "[tPrevParameter] = " + tPrevParameter + ", "
							+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", "
							+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterLinkImpl.pattern_MethodParameterLink_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodParameterLinkImpl
							.pattern_MethodParameterLink_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterLinkImpl.pattern_MethodParameterLink_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterLinkImpl.pattern_MethodParameterLink_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TParameter tPrevParameter, TParameter tParameter) {
		match.registerObject("tPrevParameter", tPrevParameter);
		match.registerObject("tParameter", tParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TParameter tPrevParameter, TParameter tParameter) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		isApplicableMatch.registerObject("mPrevEntry", mPrevEntry);
		isApplicableMatch.registerObject("tPrevParameter", tPrevParameter);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature,
			EObject mPrevEntry, EObject tPrevParameter, EObject mEntry, EObject tParameter,
			EObject eSingleVariableDeclarationToTParameter) {
		ruleresult.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		ruleresult.registerObject("mPrevEntry", mPrevEntry);
		ruleresult.registerObject("tPrevParameter", tPrevParameter);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("eSingleVariableDeclarationToTParameter", eSingleVariableDeclarationToTParameter);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_976(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterLinkImpl.pattern_MethodParameterLink_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterLinkImpl
				.pattern_MethodParameterLink_20_2_testcorematchandDECs_blackFFB(_edge_next)) {
			TParameter tPrevParameter = (TParameter) result2_black[0];
			TParameter tParameter = (TParameter) result2_black[1];
			Object[] result2_green = MethodParameterLinkImpl
					.pattern_MethodParameterLink_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterLinkImpl
					.pattern_MethodParameterLink_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tPrevParameter, tParameter)) {
				// 
				if (MethodParameterLinkImpl
						.pattern_MethodParameterLink_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterLinkImpl
							.pattern_MethodParameterLink_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterLinkImpl.pattern_MethodParameterLink_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterLinkImpl.pattern_MethodParameterLink_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1071(EMoflonEdge _edge_mNext) {

		Object[] result1_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterLinkImpl.pattern_MethodParameterLink_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterLinkImpl
				.pattern_MethodParameterLink_21_2_testcorematchandDECs_blackFFB(_edge_mNext)) {
			MEntry mPrevEntry = (MEntry) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[1];
			Object[] result2_green = MethodParameterLinkImpl
					.pattern_MethodParameterLink_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterLinkImpl
					.pattern_MethodParameterLink_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mPrevEntry, mEntry)) {
				// 
				if (MethodParameterLinkImpl
						.pattern_MethodParameterLink_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterLinkImpl
							.pattern_MethodParameterLink_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterLinkImpl.pattern_MethodParameterLink_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterLinkImpl.pattern_MethodParameterLink_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodParameterLink");
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
		ruleResult.setRule("MethodParameterLink");
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

		Object[] result1_black = MethodParameterLinkImpl.pattern_MethodParameterLink_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterLinkImpl.pattern_MethodParameterLink_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MEntry mPrevEntry = (MEntry) result2_bindingAndBlack[0];
		TParameter tPrevParameter = (TParameter) result2_bindingAndBlack[1];
		MEntry mEntry = (MEntry) result2_bindingAndBlack[2];
		TParameter tParameter = (TParameter) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = MethodParameterLinkImpl
				.pattern_MethodParameterLink_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, mPrevEntry, tPrevParameter,
						mEntry, tParameter, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mPrevEntry] = " + mPrevEntry + ", " + "[tPrevParameter] = " + tPrevParameter + ", "
					+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodParameterLinkImpl.pattern_MethodParameterLink_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodParameterLinkImpl
					.pattern_MethodParameterLink_24_5_matchcorrcontext_blackFBBBBFBB(mPrevEntry, tPrevParameter, mEntry,
							tParameter, sourceMatch, targetMatch)) {
				MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) result5_black[0];
				MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result5_black[5];
				Object[] result5_green = MethodParameterLinkImpl
						.pattern_MethodParameterLink_24_5_matchcorrcontext_greenBBBBF(
								mmethodSignatureToTMethodSignature, eSingleVariableDeclarationToTParameter, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodParameterLinkImpl
						.pattern_MethodParameterLink_24_6_createcorrespondence_blackBBBBB(mPrevEntry, tPrevParameter,
								mEntry, tParameter, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mPrevEntry] = "
							+ mPrevEntry + ", " + "[tPrevParameter] = " + tPrevParameter + ", " + "[mEntry] = " + mEntry
							+ ", " + "[tParameter] = " + tParameter + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = MethodParameterLinkImpl
						.pattern_MethodParameterLink_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterLinkImpl.pattern_MethodParameterLink_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodParameterLinkImpl.pattern_MethodParameterLink_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MEntry mPrevEntry, TParameter tPrevParameter, MEntry mEntry,
			TParameter tParameter, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MEntry mPrevEntry, MEntry mEntry) {// 
		Object[] result1_black = MethodParameterLinkImpl
				.pattern_MethodParameterLink_27_1_matchtggpattern_blackBB(mPrevEntry, mEntry);
		if (result1_black != null) {
			return MethodParameterLinkImpl.pattern_MethodParameterLink_27_2_expressionF();
		} else {
			return MethodParameterLinkImpl.pattern_MethodParameterLink_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TParameter tPrevParameter, TParameter tParameter) {// 
		Object[] result1_black = MethodParameterLinkImpl
				.pattern_MethodParameterLink_28_1_matchtggpattern_blackBB(tPrevParameter, tParameter);
		if (result1_black != null) {
			return MethodParameterLinkImpl.pattern_MethodParameterLink_28_2_expressionF();
		} else {
			return MethodParameterLinkImpl.pattern_MethodParameterLink_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MEntryToTParameter mmethodSignatureToTMethodSignatureParameter,
			MEntryToTParameter eSingleVariableDeclarationToTParameterParameter) {

		Object[] result1_black = MethodParameterLinkImpl.pattern_MethodParameterLink_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterLinkImpl.pattern_MethodParameterLink_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodParameterLinkImpl
				.pattern_MethodParameterLink_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mmethodSignatureToTMethodSignatureList = (RuleEntryList) result2_black[0];
			MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) result2_black[1];
			MEntry mPrevEntry = (MEntry) result2_black[2];
			TParameter tPrevParameter = (TParameter) result2_black[3];
			//nothing RuleEntryList eSingleVariableDeclarationToTParameterList = (RuleEntryList) result2_black[4];
			MEntry mEntry = (MEntry) result2_black[5];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[6];
			TParameter tParameter = (TParameter) result2_black[7];

			Object[] result3_bindingAndBlack = MethodParameterLinkImpl
					.pattern_MethodParameterLink_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
							eSingleVariableDeclarationToTParameter, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
						+ "[mPrevEntry] = " + mPrevEntry + ", " + "[tPrevParameter] = " + tPrevParameter + ", "
						+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", "
						+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodParameterLinkImpl.pattern_MethodParameterLink_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodParameterLinkImpl.pattern_MethodParameterLink_29_5_checknacs_blackBBBBBB(
						mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
						eSingleVariableDeclarationToTParameter);
				if (result5_black != null) {

					Object[] result6_black = MethodParameterLinkImpl
							.pattern_MethodParameterLink_29_6_perform_blackBBBBBBB(mmethodSignatureToTMethodSignature,
									mPrevEntry, tPrevParameter, mEntry, tParameter,
									eSingleVariableDeclarationToTParameter, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
								+ "[mPrevEntry] = " + mPrevEntry + ", " + "[tPrevParameter] = " + tPrevParameter + ", "
								+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", "
								+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterLinkImpl.pattern_MethodParameterLink_29_6_perform_greenBBBBB(mPrevEntry,
							tPrevParameter, mEntry, tParameter, ruleResult);

				} else {
				}

			} else {
			}

		}
		return MethodParameterLinkImpl.pattern_MethodParameterLink_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		isApplicableMatch.registerObject("mPrevEntry", mPrevEntry);
		isApplicableMatch.registerObject("tPrevParameter", tPrevParameter);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
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
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPROPRIATE_FWD__MATCH_MENTRY_MENTRY:
				return isAppropriate_FWD((Match) arguments.get(0), (MEntry) arguments.get(1),
						(MEntry) arguments.get(2));
			case RulesPackage.METHOD_PARAMETER_LINK___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MENTRY_MENTRY:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MEntry) arguments.get(1),
						(MEntry) arguments.get(2));
				return null;
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MENTRY_MENTRY:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MEntry) arguments.get(1),
						(MEntry) arguments.get(2));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MENTRYTOTPARAMETER_MENTRY_TPARAMETER_MENTRY_TPARAMETER_MENTRYTOTPARAMETER:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(MEntryToTParameter) arguments.get(1), (MEntry) arguments.get(2), (TParameter) arguments.get(3),
						(MEntry) arguments.get(4), (TParameter) arguments.get(5),
						(MEntryToTParameter) arguments.get(6));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.METHOD_PARAMETER_LINK___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPROPRIATE_BWD__MATCH_TPARAMETER_TPARAMETER:
				return isAppropriate_BWD((Match) arguments.get(0), (TParameter) arguments.get(1),
						(TParameter) arguments.get(2));
			case RulesPackage.METHOD_PARAMETER_LINK___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPARAMETER_TPARAMETER:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TParameter) arguments.get(1),
						(TParameter) arguments.get(2));
				return null;
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPARAMETER_TPARAMETER:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TParameter) arguments.get(1),
						(TParameter) arguments.get(2));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MENTRYTOTPARAMETER_MENTRY_TPARAMETER_MENTRY_TPARAMETER_MENTRYTOTPARAMETER:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MEntryToTParameter) arguments.get(1), (MEntry) arguments.get(2), (TParameter) arguments.get(3),
						(MEntry) arguments.get(4), (TParameter) arguments.get(5),
						(MEntryToTParameter) arguments.get(6));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.METHOD_PARAMETER_LINK___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_976__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_976((EMoflonEdge) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1071__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1071((EMoflonEdge) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPLICABLE_SOLVE_CSP_CC__MENTRY_TPARAMETER_MENTRY_TPARAMETER_MATCH_MATCH:
				return isApplicable_solveCsp_CC((MEntry) arguments.get(0), (TParameter) arguments.get(1),
						(MEntry) arguments.get(2), (TParameter) arguments.get(3), (Match) arguments.get(4),
						(Match) arguments.get(5));
			case RulesPackage.METHOD_PARAMETER_LINK___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.METHOD_PARAMETER_LINK___CHECK_DEC_FWD__MENTRY_MENTRY:
				return checkDEC_FWD((MEntry) arguments.get(0), (MEntry) arguments.get(1));
			case RulesPackage.METHOD_PARAMETER_LINK___CHECK_DEC_BWD__TPARAMETER_TPARAMETER:
				return checkDEC_BWD((TParameter) arguments.get(0), (TParameter) arguments.get(1));
			case RulesPackage.METHOD_PARAMETER_LINK___GENERATE_MODEL__RULEENTRYCONTAINER_MENTRYTOTPARAMETER_MENTRYTOTPARAMETER:
				return generateModel((RuleEntryContainer) arguments.get(0), (MEntryToTParameter) arguments.get(1),
						(MEntryToTParameter) arguments.get(2));
			case RulesPackage.METHOD_PARAMETER_LINK___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MENTRYTOTPARAMETER_MENTRY_TPARAMETER_MENTRY_TPARAMETER_MENTRYTOTPARAMETER_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MEntryToTParameter) arguments.get(1), (MEntry) arguments.get(2), (TParameter) arguments.get(3),
						(MEntry) arguments.get(4), (TParameter) arguments.get(5), (MEntryToTParameter) arguments.get(6),
						(ModelgeneratorRuleResult) arguments.get(7));
			case RulesPackage.METHOD_PARAMETER_LINK___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameterLink_0_1_initialbindings_blackBBBB(MethodParameterLink _this,
			Match match, MEntry mPrevEntry, MEntry mEntry) {
		if (!mEntry.equals(mPrevEntry)) {
			return new Object[] { _this, match, mPrevEntry, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_0_2_SolveCSP_bindingFBBBB(MethodParameterLink _this,
			Match match, MEntry mPrevEntry, MEntry mEntry) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPrevEntry, mEntry);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPrevEntry, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLink_0_2_SolveCSP_bindingAndBlackFBBBB(
			MethodParameterLink _this, Match match, MEntry mPrevEntry, MEntry mEntry) {
		Object[] result_pattern_MethodParameterLink_0_2_SolveCSP_binding = pattern_MethodParameterLink_0_2_SolveCSP_bindingFBBBB(
				_this, match, mPrevEntry, mEntry);
		if (result_pattern_MethodParameterLink_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLink_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterLink_0_2_SolveCSP_black = pattern_MethodParameterLink_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLink_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPrevEntry, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLink_0_3_CheckCSP_expressionFBB(MethodParameterLink _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_0_4_collectelementstobetranslated_blackBBB(Match match,
			MEntry mPrevEntry, MEntry mEntry) {
		if (!mEntry.equals(mPrevEntry)) {
			return new Object[] { match, mPrevEntry, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MEntry mPrevEntry, MEntry mEntry) {
		EMoflonEdge mPrevEntry__mEntry____mNext = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mPrevEntry____mPrevious = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mPrevEntry__mEntry____mNext_name_prime = "mNext";
		String mEntry__mPrevEntry____mPrevious_name_prime = "mPrevious";
		mPrevEntry__mEntry____mNext.setSrc(mPrevEntry);
		mPrevEntry__mEntry____mNext.setTrg(mEntry);
		match.getToBeTranslatedEdges().add(mPrevEntry__mEntry____mNext);
		mEntry__mPrevEntry____mPrevious.setSrc(mEntry);
		mEntry__mPrevEntry____mPrevious.setTrg(mPrevEntry);
		match.getToBeTranslatedEdges().add(mEntry__mPrevEntry____mPrevious);
		mPrevEntry__mEntry____mNext.setName(mPrevEntry__mEntry____mNext_name_prime);
		mEntry__mPrevEntry____mPrevious.setName(mEntry__mPrevEntry____mPrevious_name_prime);
		return new Object[] { match, mPrevEntry, mEntry, mPrevEntry__mEntry____mNext, mEntry__mPrevEntry____mPrevious };
	}

	public static final Object[] pattern_MethodParameterLink_0_5_collectcontextelements_blackBBB(Match match,
			MEntry mPrevEntry, MEntry mEntry) {
		if (!mEntry.equals(mPrevEntry)) {
			return new Object[] { match, mPrevEntry, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_0_5_collectcontextelements_greenBBB(Match match,
			MEntry mPrevEntry, MEntry mEntry) {
		match.getContextNodes().add(mPrevEntry);
		match.getContextNodes().add(mEntry);
		return new Object[] { match, mPrevEntry, mEntry };
	}

	public static final void pattern_MethodParameterLink_0_6_registerobjectstomatch_expressionBBBB(
			MethodParameterLink _this, Match match, MEntry mPrevEntry, MEntry mEntry) {
		_this.registerObjectsToMatch_FWD(match, mPrevEntry, mEntry);

	}

	public static final boolean pattern_MethodParameterLink_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLink_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mmethodSignatureToTMethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mPrevEntry");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPrevParameter");
		EObject _localVariable_3 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_4 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSingleVariableDeclarationToTParameter");
		EObject tmpMmethodSignatureToTMethodSignature = _localVariable_0;
		EObject tmpMPrevEntry = _localVariable_1;
		EObject tmpTPrevParameter = _localVariable_2;
		EObject tmpMEntry = _localVariable_3;
		EObject tmpTParameter = _localVariable_4;
		EObject tmpESingleVariableDeclarationToTParameter = _localVariable_5;
		if (tmpMmethodSignatureToTMethodSignature instanceof MEntryToTParameter) {
			MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) tmpMmethodSignatureToTMethodSignature;
			if (tmpMPrevEntry instanceof MEntry) {
				MEntry mPrevEntry = (MEntry) tmpMPrevEntry;
				if (tmpTPrevParameter instanceof TParameter) {
					TParameter tPrevParameter = (TParameter) tmpTPrevParameter;
					if (tmpMEntry instanceof MEntry) {
						MEntry mEntry = (MEntry) tmpMEntry;
						if (tmpTParameter instanceof TParameter) {
							TParameter tParameter = (TParameter) tmpTParameter;
							if (tmpESingleVariableDeclarationToTParameter instanceof MEntryToTParameter) {
								MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) tmpESingleVariableDeclarationToTParameter;
								return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter,
										mEntry, tParameter, eSingleVariableDeclarationToTParameter, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_1_1_performtransformation_blackBBBBBBFBB(
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MethodParameterLink _this, IsApplicableMatch isApplicableMatch) {
		if (!mEntry.equals(mPrevEntry)) {
			if (!tParameter.equals(tPrevParameter)) {
				if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignatureToTMethodSignature)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter,
									mEntry, tParameter, eSingleVariableDeclarationToTParameter, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodParameterLink _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterLink_1_1_performtransformation_binding = pattern_MethodParameterLink_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterLink_1_1_performtransformation_binding != null) {
			MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) result_pattern_MethodParameterLink_1_1_performtransformation_binding[0];
			MEntry mPrevEntry = (MEntry) result_pattern_MethodParameterLink_1_1_performtransformation_binding[1];
			TParameter tPrevParameter = (TParameter) result_pattern_MethodParameterLink_1_1_performtransformation_binding[2];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterLink_1_1_performtransformation_binding[3];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterLink_1_1_performtransformation_binding[4];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result_pattern_MethodParameterLink_1_1_performtransformation_binding[5];

			Object[] result_pattern_MethodParameterLink_1_1_performtransformation_black = pattern_MethodParameterLink_1_1_performtransformation_blackBBBBBBFBB(
					mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
					eSingleVariableDeclarationToTParameter, _this, isApplicableMatch);
			if (result_pattern_MethodParameterLink_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterLink_1_1_performtransformation_black[6];

				return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry,
						tParameter, eSingleVariableDeclarationToTParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_1_1_performtransformation_greenBB(
			TParameter tPrevParameter, TParameter tParameter) {
		tPrevParameter.setNext(tParameter);
		return new Object[] { tPrevParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameterLink_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodParameterLink_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature, EObject mPrevEntry,
			EObject tPrevParameter, EObject mEntry, EObject tParameter,
			EObject eSingleVariableDeclarationToTParameter) {
		if (!mmethodSignatureToTMethodSignature.equals(tPrevParameter)) {
			if (!mmethodSignatureToTMethodSignature.equals(tParameter)) {
				if (!mPrevEntry.equals(mmethodSignatureToTMethodSignature)) {
					if (!mPrevEntry.equals(tPrevParameter)) {
						if (!mPrevEntry.equals(tParameter)) {
							if (!mEntry.equals(mmethodSignatureToTMethodSignature)) {
								if (!mEntry.equals(mPrevEntry)) {
									if (!mEntry.equals(tPrevParameter)) {
										if (!mEntry.equals(tParameter)) {
											if (!tParameter.equals(tPrevParameter)) {
												if (!eSingleVariableDeclarationToTParameter
														.equals(mmethodSignatureToTMethodSignature)) {
													if (!eSingleVariableDeclarationToTParameter.equals(mPrevEntry)) {
														if (!eSingleVariableDeclarationToTParameter
																.equals(tPrevParameter)) {
															if (!eSingleVariableDeclarationToTParameter
																	.equals(mEntry)) {
																if (!eSingleVariableDeclarationToTParameter
																		.equals(tParameter)) {
																	return new Object[] { ruleresult,
																			mmethodSignatureToTMethodSignature,
																			mPrevEntry, tPrevParameter, mEntry,
																			tParameter,
																			eSingleVariableDeclarationToTParameter };
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

	public static final Object[] pattern_MethodParameterLink_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mPrevEntry, EObject tPrevParameter, EObject mEntry,
			EObject tParameter) {
		EMoflonEdge mPrevEntry__mEntry____mNext = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mPrevEntry____mPrevious = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrevParameter__tParameter____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tPrevParameter____previous = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterLink";
		String mPrevEntry__mEntry____mNext_name_prime = "mNext";
		String mEntry__mPrevEntry____mPrevious_name_prime = "mPrevious";
		String tPrevParameter__tParameter____next_name_prime = "next";
		String tParameter__tPrevParameter____previous_name_prime = "previous";
		mPrevEntry__mEntry____mNext.setSrc(mPrevEntry);
		mPrevEntry__mEntry____mNext.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mPrevEntry__mEntry____mNext);
		mEntry__mPrevEntry____mPrevious.setSrc(mEntry);
		mEntry__mPrevEntry____mPrevious.setTrg(mPrevEntry);
		ruleresult.getTranslatedEdges().add(mEntry__mPrevEntry____mPrevious);
		tPrevParameter__tParameter____next.setSrc(tPrevParameter);
		tPrevParameter__tParameter____next.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tPrevParameter__tParameter____next);
		tParameter__tPrevParameter____previous.setSrc(tParameter);
		tParameter__tPrevParameter____previous.setTrg(tPrevParameter);
		ruleresult.getCreatedEdges().add(tParameter__tPrevParameter____previous);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mPrevEntry__mEntry____mNext.setName(mPrevEntry__mEntry____mNext_name_prime);
		mEntry__mPrevEntry____mPrevious.setName(mEntry__mPrevEntry____mPrevious_name_prime);
		tPrevParameter__tParameter____next.setName(tPrevParameter__tParameter____next_name_prime);
		tParameter__tPrevParameter____previous.setName(tParameter__tPrevParameter____previous_name_prime);
		return new Object[] { ruleresult, mPrevEntry, tPrevParameter, mEntry, tParameter, mPrevEntry__mEntry____mNext,
				mEntry__mPrevEntry____mPrevious, tPrevParameter__tParameter____next,
				tParameter__tPrevParameter____previous };
	}

	public static final void pattern_MethodParameterLink_1_5_registerobjects_expressionBBBBBBBB(
			MethodParameterLink _this, PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature,
			EObject mPrevEntry, EObject tPrevParameter, EObject mEntry, EObject tParameter,
			EObject eSingleVariableDeclarationToTParameter) {
		_this.registerObjects_FWD(ruleresult, mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry,
				tParameter, eSingleVariableDeclarationToTParameter);

	}

	public static final PerformRuleResult pattern_MethodParameterLink_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_2_1_preparereturnvalue_bindingFB(
			MethodParameterLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterLink _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterLink _this) {
		Object[] result_pattern_MethodParameterLink_2_1_preparereturnvalue_binding = pattern_MethodParameterLink_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLink_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterLink_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLink_2_1_preparereturnvalue_black = pattern_MethodParameterLink_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterLink_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterLink_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameterLink";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterLink_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mPrevEntry");
		EObject _localVariable_1 = match.getObject("mEntry");
		EObject tmpMPrevEntry = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		if (tmpMPrevEntry instanceof MEntry) {
			MEntry mPrevEntry = (MEntry) tmpMPrevEntry;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				return new Object[] { mPrevEntry, mEntry, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLink_2_2_corematch_blackFBFBFFB(MEntry mPrevEntry,
			MEntry mEntry, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mEntry.equals(mPrevEntry)) {
			for (MEntryToTParameter mmethodSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mPrevEntry, MEntryToTParameter.class, "source")) {
				TParameter tPrevParameter = mmethodSignatureToTMethodSignature.getTarget();
				if (tPrevParameter != null) {
					for (MEntryToTParameter eSingleVariableDeclarationToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mEntry, MEntryToTParameter.class, "source")) {
						if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignatureToTMethodSignature)) {
							TParameter tParameter = eSingleVariableDeclarationToTParameter.getTarget();
							if (tParameter != null) {
								if (!tParameter.equals(tPrevParameter)) {
									_result.add(new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry,
											tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter,
											match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLink_2_3_findcontext_blackBBBBBB(
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mEntry.equals(mPrevEntry)) {
			if (!tParameter.equals(tPrevParameter)) {
				if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignatureToTMethodSignature)) {
					if (mPrevEntry.equals(mmethodSignatureToTMethodSignature.getSource())) {
						if (tPrevParameter.equals(mmethodSignatureToTMethodSignature.getTarget())) {
							if (mEntry.equals(mPrevEntry.getMNext())) {
								if (tParameter.equals(eSingleVariableDeclarationToTParameter.getTarget())) {
									if (mEntry.equals(eSingleVariableDeclarationToTParameter.getSource())) {
										_result.add(new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry,
												tPrevParameter, mEntry, tParameter,
												eSingleVariableDeclarationToTParameter });
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

	public static final Object[] pattern_MethodParameterLink_2_3_findcontext_greenBBBBBBFFFFFFF(
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mmethodSignatureToTMethodSignature__mPrevEntry____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mmethodSignatureToTMethodSignature__tPrevParameter____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mPrevEntry__mEntry____mNext = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mPrevEntry____mPrevious = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String mmethodSignatureToTMethodSignature__mPrevEntry____source_name_prime = "source";
		String mmethodSignatureToTMethodSignature__tPrevParameter____target_name_prime = "target";
		String mPrevEntry__mEntry____mNext_name_prime = "mNext";
		String mEntry__mPrevEntry____mPrevious_name_prime = "mPrevious";
		String eSingleVariableDeclarationToTParameter__tParameter____target_name_prime = "target";
		String eSingleVariableDeclarationToTParameter__mEntry____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(mPrevEntry);
		isApplicableMatch.getAllContextElements().add(tPrevParameter);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter);
		mmethodSignatureToTMethodSignature__mPrevEntry____source.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__mPrevEntry____source.setTrg(mPrevEntry);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__mPrevEntry____source);
		mmethodSignatureToTMethodSignature__tPrevParameter____target.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__tPrevParameter____target.setTrg(tPrevParameter);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__tPrevParameter____target);
		mPrevEntry__mEntry____mNext.setSrc(mPrevEntry);
		mPrevEntry__mEntry____mNext.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mPrevEntry__mEntry____mNext);
		mEntry__mPrevEntry____mPrevious.setSrc(mEntry);
		mEntry__mPrevEntry____mPrevious.setTrg(mPrevEntry);
		isApplicableMatch.getAllContextElements().add(mEntry__mPrevEntry____mPrevious);
		eSingleVariableDeclarationToTParameter__tParameter____target.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__tParameter____target.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__tParameter____target);
		eSingleVariableDeclarationToTParameter__mEntry____source.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__mEntry____source.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__mEntry____source);
		mmethodSignatureToTMethodSignature__mPrevEntry____source
				.setName(mmethodSignatureToTMethodSignature__mPrevEntry____source_name_prime);
		mmethodSignatureToTMethodSignature__tPrevParameter____target
				.setName(mmethodSignatureToTMethodSignature__tPrevParameter____target_name_prime);
		mPrevEntry__mEntry____mNext.setName(mPrevEntry__mEntry____mNext_name_prime);
		mEntry__mPrevEntry____mPrevious.setName(mEntry__mPrevEntry____mPrevious_name_prime);
		eSingleVariableDeclarationToTParameter__tParameter____target
				.setName(eSingleVariableDeclarationToTParameter__tParameter____target_name_prime);
		eSingleVariableDeclarationToTParameter__mEntry____source
				.setName(eSingleVariableDeclarationToTParameter__mEntry____source_name_prime);
		return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
				eSingleVariableDeclarationToTParameter, isApplicableMatch,
				mmethodSignatureToTMethodSignature__mPrevEntry____source,
				mmethodSignatureToTMethodSignature__tPrevParameter____target, mPrevEntry__mEntry____mNext,
				mEntry__mPrevEntry____mPrevious, eSingleVariableDeclarationToTParameter__tParameter____target,
				eSingleVariableDeclarationToTParameter__mEntry____source };
	}

	public static final Object[] pattern_MethodParameterLink_2_4_solveCSP_bindingFBBBBBBBB(MethodParameterLink _this,
			IsApplicableMatch isApplicableMatch, MEntryToTParameter mmethodSignatureToTMethodSignature,
			MEntry mPrevEntry, TParameter tPrevParameter, MEntry mEntry, TParameter tParameter,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mmethodSignatureToTMethodSignature,
				mPrevEntry, tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature, mPrevEntry,
					tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLink_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodParameterLink _this, IsApplicableMatch isApplicableMatch,
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		Object[] result_pattern_MethodParameterLink_2_4_solveCSP_binding = pattern_MethodParameterLink_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry,
				tParameter, eSingleVariableDeclarationToTParameter);
		if (result_pattern_MethodParameterLink_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLink_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterLink_2_4_solveCSP_black = pattern_MethodParameterLink_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLink_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature, mPrevEntry,
						tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLink_2_5_checkCSP_expressionFBB(MethodParameterLink _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterLink_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterLink";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterLink_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_10_1_initialbindings_blackBBBB(MethodParameterLink _this,
			Match match, TParameter tPrevParameter, TParameter tParameter) {
		if (!tParameter.equals(tPrevParameter)) {
			return new Object[] { _this, match, tPrevParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_10_2_SolveCSP_bindingFBBBB(MethodParameterLink _this,
			Match match, TParameter tPrevParameter, TParameter tParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tPrevParameter, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPrevParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLink_10_2_SolveCSP_bindingAndBlackFBBBB(
			MethodParameterLink _this, Match match, TParameter tPrevParameter, TParameter tParameter) {
		Object[] result_pattern_MethodParameterLink_10_2_SolveCSP_binding = pattern_MethodParameterLink_10_2_SolveCSP_bindingFBBBB(
				_this, match, tPrevParameter, tParameter);
		if (result_pattern_MethodParameterLink_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLink_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterLink_10_2_SolveCSP_black = pattern_MethodParameterLink_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLink_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tPrevParameter, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLink_10_3_CheckCSP_expressionFBB(MethodParameterLink _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_10_4_collectelementstobetranslated_blackBBB(Match match,
			TParameter tPrevParameter, TParameter tParameter) {
		if (!tParameter.equals(tPrevParameter)) {
			return new Object[] { match, tPrevParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TParameter tPrevParameter, TParameter tParameter) {
		EMoflonEdge tPrevParameter__tParameter____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tPrevParameter____previous = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tPrevParameter__tParameter____next_name_prime = "next";
		String tParameter__tPrevParameter____previous_name_prime = "previous";
		tPrevParameter__tParameter____next.setSrc(tPrevParameter);
		tPrevParameter__tParameter____next.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(tPrevParameter__tParameter____next);
		tParameter__tPrevParameter____previous.setSrc(tParameter);
		tParameter__tPrevParameter____previous.setTrg(tPrevParameter);
		match.getToBeTranslatedEdges().add(tParameter__tPrevParameter____previous);
		tPrevParameter__tParameter____next.setName(tPrevParameter__tParameter____next_name_prime);
		tParameter__tPrevParameter____previous.setName(tParameter__tPrevParameter____previous_name_prime);
		return new Object[] { match, tPrevParameter, tParameter, tPrevParameter__tParameter____next,
				tParameter__tPrevParameter____previous };
	}

	public static final Object[] pattern_MethodParameterLink_10_5_collectcontextelements_blackBBB(Match match,
			TParameter tPrevParameter, TParameter tParameter) {
		if (!tParameter.equals(tPrevParameter)) {
			return new Object[] { match, tPrevParameter, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_10_5_collectcontextelements_greenBBB(Match match,
			TParameter tPrevParameter, TParameter tParameter) {
		match.getContextNodes().add(tPrevParameter);
		match.getContextNodes().add(tParameter);
		return new Object[] { match, tPrevParameter, tParameter };
	}

	public static final void pattern_MethodParameterLink_10_6_registerobjectstomatch_expressionBBBB(
			MethodParameterLink _this, Match match, TParameter tPrevParameter, TParameter tParameter) {
		_this.registerObjectsToMatch_BWD(match, tPrevParameter, tParameter);

	}

	public static final boolean pattern_MethodParameterLink_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLink_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mmethodSignatureToTMethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mPrevEntry");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPrevParameter");
		EObject _localVariable_3 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_4 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSingleVariableDeclarationToTParameter");
		EObject tmpMmethodSignatureToTMethodSignature = _localVariable_0;
		EObject tmpMPrevEntry = _localVariable_1;
		EObject tmpTPrevParameter = _localVariable_2;
		EObject tmpMEntry = _localVariable_3;
		EObject tmpTParameter = _localVariable_4;
		EObject tmpESingleVariableDeclarationToTParameter = _localVariable_5;
		if (tmpMmethodSignatureToTMethodSignature instanceof MEntryToTParameter) {
			MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) tmpMmethodSignatureToTMethodSignature;
			if (tmpMPrevEntry instanceof MEntry) {
				MEntry mPrevEntry = (MEntry) tmpMPrevEntry;
				if (tmpTPrevParameter instanceof TParameter) {
					TParameter tPrevParameter = (TParameter) tmpTPrevParameter;
					if (tmpMEntry instanceof MEntry) {
						MEntry mEntry = (MEntry) tmpMEntry;
						if (tmpTParameter instanceof TParameter) {
							TParameter tParameter = (TParameter) tmpTParameter;
							if (tmpESingleVariableDeclarationToTParameter instanceof MEntryToTParameter) {
								MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) tmpESingleVariableDeclarationToTParameter;
								return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter,
										mEntry, tParameter, eSingleVariableDeclarationToTParameter, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_11_1_performtransformation_blackBBBBBBFBB(
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter,
			MethodParameterLink _this, IsApplicableMatch isApplicableMatch) {
		if (!mEntry.equals(mPrevEntry)) {
			if (!tParameter.equals(tPrevParameter)) {
				if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignatureToTMethodSignature)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter,
									mEntry, tParameter, eSingleVariableDeclarationToTParameter, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodParameterLink _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterLink_11_1_performtransformation_binding = pattern_MethodParameterLink_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterLink_11_1_performtransformation_binding != null) {
			MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) result_pattern_MethodParameterLink_11_1_performtransformation_binding[0];
			MEntry mPrevEntry = (MEntry) result_pattern_MethodParameterLink_11_1_performtransformation_binding[1];
			TParameter tPrevParameter = (TParameter) result_pattern_MethodParameterLink_11_1_performtransformation_binding[2];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterLink_11_1_performtransformation_binding[3];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterLink_11_1_performtransformation_binding[4];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result_pattern_MethodParameterLink_11_1_performtransformation_binding[5];

			Object[] result_pattern_MethodParameterLink_11_1_performtransformation_black = pattern_MethodParameterLink_11_1_performtransformation_blackBBBBBBFBB(
					mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
					eSingleVariableDeclarationToTParameter, _this, isApplicableMatch);
			if (result_pattern_MethodParameterLink_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterLink_11_1_performtransformation_black[6];

				return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry,
						tParameter, eSingleVariableDeclarationToTParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_11_1_performtransformation_greenBB(MEntry mPrevEntry,
			MEntry mEntry) {
		mPrevEntry.setMNext(mEntry);
		return new Object[] { mPrevEntry, mEntry };
	}

	public static final Object[] pattern_MethodParameterLink_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodParameterLink_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature, EObject mPrevEntry,
			EObject tPrevParameter, EObject mEntry, EObject tParameter,
			EObject eSingleVariableDeclarationToTParameter) {
		if (!mmethodSignatureToTMethodSignature.equals(tPrevParameter)) {
			if (!mmethodSignatureToTMethodSignature.equals(tParameter)) {
				if (!mPrevEntry.equals(mmethodSignatureToTMethodSignature)) {
					if (!mPrevEntry.equals(tPrevParameter)) {
						if (!mPrevEntry.equals(tParameter)) {
							if (!mEntry.equals(mmethodSignatureToTMethodSignature)) {
								if (!mEntry.equals(mPrevEntry)) {
									if (!mEntry.equals(tPrevParameter)) {
										if (!mEntry.equals(tParameter)) {
											if (!tParameter.equals(tPrevParameter)) {
												if (!eSingleVariableDeclarationToTParameter
														.equals(mmethodSignatureToTMethodSignature)) {
													if (!eSingleVariableDeclarationToTParameter.equals(mPrevEntry)) {
														if (!eSingleVariableDeclarationToTParameter
																.equals(tPrevParameter)) {
															if (!eSingleVariableDeclarationToTParameter
																	.equals(mEntry)) {
																if (!eSingleVariableDeclarationToTParameter
																		.equals(tParameter)) {
																	return new Object[] { ruleresult,
																			mmethodSignatureToTMethodSignature,
																			mPrevEntry, tPrevParameter, mEntry,
																			tParameter,
																			eSingleVariableDeclarationToTParameter };
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

	public static final Object[] pattern_MethodParameterLink_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mPrevEntry, EObject tPrevParameter, EObject mEntry,
			EObject tParameter) {
		EMoflonEdge mPrevEntry__mEntry____mNext = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mPrevEntry____mPrevious = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrevParameter__tParameter____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tPrevParameter____previous = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterLink";
		String mPrevEntry__mEntry____mNext_name_prime = "mNext";
		String mEntry__mPrevEntry____mPrevious_name_prime = "mPrevious";
		String tPrevParameter__tParameter____next_name_prime = "next";
		String tParameter__tPrevParameter____previous_name_prime = "previous";
		mPrevEntry__mEntry____mNext.setSrc(mPrevEntry);
		mPrevEntry__mEntry____mNext.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mPrevEntry__mEntry____mNext);
		mEntry__mPrevEntry____mPrevious.setSrc(mEntry);
		mEntry__mPrevEntry____mPrevious.setTrg(mPrevEntry);
		ruleresult.getCreatedEdges().add(mEntry__mPrevEntry____mPrevious);
		tPrevParameter__tParameter____next.setSrc(tPrevParameter);
		tPrevParameter__tParameter____next.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(tPrevParameter__tParameter____next);
		tParameter__tPrevParameter____previous.setSrc(tParameter);
		tParameter__tPrevParameter____previous.setTrg(tPrevParameter);
		ruleresult.getTranslatedEdges().add(tParameter__tPrevParameter____previous);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mPrevEntry__mEntry____mNext.setName(mPrevEntry__mEntry____mNext_name_prime);
		mEntry__mPrevEntry____mPrevious.setName(mEntry__mPrevEntry____mPrevious_name_prime);
		tPrevParameter__tParameter____next.setName(tPrevParameter__tParameter____next_name_prime);
		tParameter__tPrevParameter____previous.setName(tParameter__tPrevParameter____previous_name_prime);
		return new Object[] { ruleresult, mPrevEntry, tPrevParameter, mEntry, tParameter, mPrevEntry__mEntry____mNext,
				mEntry__mPrevEntry____mPrevious, tPrevParameter__tParameter____next,
				tParameter__tPrevParameter____previous };
	}

	public static final void pattern_MethodParameterLink_11_5_registerobjects_expressionBBBBBBBB(
			MethodParameterLink _this, PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature,
			EObject mPrevEntry, EObject tPrevParameter, EObject mEntry, EObject tParameter,
			EObject eSingleVariableDeclarationToTParameter) {
		_this.registerObjects_BWD(ruleresult, mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry,
				tParameter, eSingleVariableDeclarationToTParameter);

	}

	public static final PerformRuleResult pattern_MethodParameterLink_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_12_1_preparereturnvalue_bindingFB(
			MethodParameterLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterLink _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterLink _this) {
		Object[] result_pattern_MethodParameterLink_12_1_preparereturnvalue_binding = pattern_MethodParameterLink_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLink_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterLink_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLink_12_1_preparereturnvalue_black = pattern_MethodParameterLink_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterLink_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterLink_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameterLink";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterLink_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tPrevParameter");
		EObject _localVariable_1 = match.getObject("tParameter");
		EObject tmpTPrevParameter = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		if (tmpTPrevParameter instanceof TParameter) {
			TParameter tPrevParameter = (TParameter) tmpTPrevParameter;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				return new Object[] { tPrevParameter, tParameter, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLink_12_2_corematch_blackFFBFBFB(
			TParameter tPrevParameter, TParameter tParameter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tParameter.equals(tPrevParameter)) {
			for (MEntryToTParameter mmethodSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tPrevParameter, MEntryToTParameter.class, "target")) {
				MEntry mPrevEntry = mmethodSignatureToTMethodSignature.getSource();
				if (mPrevEntry != null) {
					for (MEntryToTParameter eSingleVariableDeclarationToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tParameter, MEntryToTParameter.class, "target")) {
						if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignatureToTMethodSignature)) {
							MEntry mEntry = eSingleVariableDeclarationToTParameter.getSource();
							if (mEntry != null) {
								if (!mEntry.equals(mPrevEntry)) {
									_result.add(new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry,
											tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter,
											match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLink_12_3_findcontext_blackBBBBBB(
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mEntry.equals(mPrevEntry)) {
			if (!tParameter.equals(tPrevParameter)) {
				if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignatureToTMethodSignature)) {
					if (mPrevEntry.equals(mmethodSignatureToTMethodSignature.getSource())) {
						if (tPrevParameter.equals(mmethodSignatureToTMethodSignature.getTarget())) {
							if (tParameter.equals(tPrevParameter.getNext())) {
								if (tParameter.equals(eSingleVariableDeclarationToTParameter.getTarget())) {
									if (mEntry.equals(eSingleVariableDeclarationToTParameter.getSource())) {
										_result.add(new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry,
												tPrevParameter, mEntry, tParameter,
												eSingleVariableDeclarationToTParameter });
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

	public static final Object[] pattern_MethodParameterLink_12_3_findcontext_greenBBBBBBFFFFFFF(
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mmethodSignatureToTMethodSignature__mPrevEntry____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mmethodSignatureToTMethodSignature__tPrevParameter____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPrevParameter__tParameter____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tPrevParameter____previous = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String mmethodSignatureToTMethodSignature__mPrevEntry____source_name_prime = "source";
		String mmethodSignatureToTMethodSignature__tPrevParameter____target_name_prime = "target";
		String tPrevParameter__tParameter____next_name_prime = "next";
		String tParameter__tPrevParameter____previous_name_prime = "previous";
		String eSingleVariableDeclarationToTParameter__tParameter____target_name_prime = "target";
		String eSingleVariableDeclarationToTParameter__mEntry____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(mPrevEntry);
		isApplicableMatch.getAllContextElements().add(tPrevParameter);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter);
		mmethodSignatureToTMethodSignature__mPrevEntry____source.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__mPrevEntry____source.setTrg(mPrevEntry);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__mPrevEntry____source);
		mmethodSignatureToTMethodSignature__tPrevParameter____target.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__tPrevParameter____target.setTrg(tPrevParameter);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__tPrevParameter____target);
		tPrevParameter__tParameter____next.setSrc(tPrevParameter);
		tPrevParameter__tParameter____next.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(tPrevParameter__tParameter____next);
		tParameter__tPrevParameter____previous.setSrc(tParameter);
		tParameter__tPrevParameter____previous.setTrg(tPrevParameter);
		isApplicableMatch.getAllContextElements().add(tParameter__tPrevParameter____previous);
		eSingleVariableDeclarationToTParameter__tParameter____target.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__tParameter____target.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__tParameter____target);
		eSingleVariableDeclarationToTParameter__mEntry____source.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__mEntry____source.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__mEntry____source);
		mmethodSignatureToTMethodSignature__mPrevEntry____source
				.setName(mmethodSignatureToTMethodSignature__mPrevEntry____source_name_prime);
		mmethodSignatureToTMethodSignature__tPrevParameter____target
				.setName(mmethodSignatureToTMethodSignature__tPrevParameter____target_name_prime);
		tPrevParameter__tParameter____next.setName(tPrevParameter__tParameter____next_name_prime);
		tParameter__tPrevParameter____previous.setName(tParameter__tPrevParameter____previous_name_prime);
		eSingleVariableDeclarationToTParameter__tParameter____target
				.setName(eSingleVariableDeclarationToTParameter__tParameter____target_name_prime);
		eSingleVariableDeclarationToTParameter__mEntry____source
				.setName(eSingleVariableDeclarationToTParameter__mEntry____source_name_prime);
		return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry, tParameter,
				eSingleVariableDeclarationToTParameter, isApplicableMatch,
				mmethodSignatureToTMethodSignature__mPrevEntry____source,
				mmethodSignatureToTMethodSignature__tPrevParameter____target, tPrevParameter__tParameter____next,
				tParameter__tPrevParameter____previous, eSingleVariableDeclarationToTParameter__tParameter____target,
				eSingleVariableDeclarationToTParameter__mEntry____source };
	}

	public static final Object[] pattern_MethodParameterLink_12_4_solveCSP_bindingFBBBBBBBB(MethodParameterLink _this,
			IsApplicableMatch isApplicableMatch, MEntryToTParameter mmethodSignatureToTMethodSignature,
			MEntry mPrevEntry, TParameter tPrevParameter, MEntry mEntry, TParameter tParameter,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mmethodSignatureToTMethodSignature,
				mPrevEntry, tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature, mPrevEntry,
					tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLink_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodParameterLink _this, IsApplicableMatch isApplicableMatch,
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		Object[] result_pattern_MethodParameterLink_12_4_solveCSP_binding = pattern_MethodParameterLink_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry,
				tParameter, eSingleVariableDeclarationToTParameter);
		if (result_pattern_MethodParameterLink_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLink_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterLink_12_4_solveCSP_black = pattern_MethodParameterLink_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLink_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature, mPrevEntry,
						tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLink_12_5_checkCSP_expressionFBB(MethodParameterLink _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterLink_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterLink";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterLink_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_20_1_preparereturnvalue_bindingFB(
			MethodParameterLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterLink _this) {
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

	public static final Object[] pattern_MethodParameterLink_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterLink _this) {
		Object[] result_pattern_MethodParameterLink_20_1_preparereturnvalue_binding = pattern_MethodParameterLink_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLink_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterLink_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLink_20_1_preparereturnvalue_black = pattern_MethodParameterLink_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterLink_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterLink_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterLink_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterLink_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTPrevParameter = _edge_next.getSrc();
		if (tmpTPrevParameter instanceof TParameter) {
			TParameter tPrevParameter = (TParameter) tmpTPrevParameter;
			EObject tmpTParameter = _edge_next.getTrg();
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (!tParameter.equals(tPrevParameter)) {
					if (tParameter.equals(tPrevParameter.getNext())) {
						_result.add(new Object[] { tPrevParameter, tParameter, _edge_next });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterLink_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodParameterLink _this, Match match, TParameter tPrevParameter, TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPrevParameter, tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterLink_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterLink _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterLink_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_21_1_preparereturnvalue_bindingFB(
			MethodParameterLink _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterLink _this) {
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

	public static final Object[] pattern_MethodParameterLink_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterLink _this) {
		Object[] result_pattern_MethodParameterLink_21_1_preparereturnvalue_binding = pattern_MethodParameterLink_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLink_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterLink_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLink_21_1_preparereturnvalue_black = pattern_MethodParameterLink_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterLink_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterLink_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterLink_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterLink_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mNext) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMPrevEntry = _edge_mNext.getSrc();
		if (tmpMPrevEntry instanceof MEntry) {
			MEntry mPrevEntry = (MEntry) tmpMPrevEntry;
			EObject tmpMEntry = _edge_mNext.getTrg();
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (!mEntry.equals(mPrevEntry)) {
					if (mEntry.equals(mPrevEntry.getMNext())) {
						_result.add(new Object[] { mPrevEntry, mEntry, _edge_mNext });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterLink_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodParameterLink _this, Match match, MEntry mPrevEntry, MEntry mEntry) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPrevEntry, mEntry);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterLink_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterLink _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterLink_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_24_1_prepare_blackB(MethodParameterLink _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterLink_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodParameterLink_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mPrevEntry");
		EObject _localVariable_1 = targetMatch.getObject("tPrevParameter");
		EObject _localVariable_2 = sourceMatch.getObject("mEntry");
		EObject _localVariable_3 = targetMatch.getObject("tParameter");
		EObject tmpMPrevEntry = _localVariable_0;
		EObject tmpTPrevParameter = _localVariable_1;
		EObject tmpMEntry = _localVariable_2;
		EObject tmpTParameter = _localVariable_3;
		if (tmpMPrevEntry instanceof MEntry) {
			MEntry mPrevEntry = (MEntry) tmpMPrevEntry;
			if (tmpTPrevParameter instanceof TParameter) {
				TParameter tPrevParameter = (TParameter) tmpTPrevParameter;
				if (tmpMEntry instanceof MEntry) {
					MEntry mEntry = (MEntry) tmpMEntry;
					if (tmpTParameter instanceof TParameter) {
						TParameter tParameter = (TParameter) tmpTParameter;
						return new Object[] { mPrevEntry, tPrevParameter, mEntry, tParameter, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_24_2_matchsrctrgcontext_blackBBBBBB(MEntry mPrevEntry,
			TParameter tPrevParameter, MEntry mEntry, TParameter tParameter, Match sourceMatch, Match targetMatch) {
		if (!mEntry.equals(mPrevEntry)) {
			if (!tParameter.equals(tPrevParameter)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { mPrevEntry, tPrevParameter, mEntry, tParameter, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterLink_24_2_matchsrctrgcontext_binding = pattern_MethodParameterLink_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodParameterLink_24_2_matchsrctrgcontext_binding != null) {
			MEntry mPrevEntry = (MEntry) result_pattern_MethodParameterLink_24_2_matchsrctrgcontext_binding[0];
			TParameter tPrevParameter = (TParameter) result_pattern_MethodParameterLink_24_2_matchsrctrgcontext_binding[1];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterLink_24_2_matchsrctrgcontext_binding[2];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterLink_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_MethodParameterLink_24_2_matchsrctrgcontext_black = pattern_MethodParameterLink_24_2_matchsrctrgcontext_blackBBBBBB(
					mPrevEntry, tPrevParameter, mEntry, tParameter, sourceMatch, targetMatch);
			if (result_pattern_MethodParameterLink_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mPrevEntry, tPrevParameter, mEntry, tParameter, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_24_3_solvecsp_bindingFBBBBBBB(MethodParameterLink _this,
			MEntry mPrevEntry, TParameter tPrevParameter, MEntry mEntry, TParameter tParameter, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mPrevEntry, tPrevParameter, mEntry, tParameter,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mPrevEntry, tPrevParameter, mEntry, tParameter, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLink_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			MethodParameterLink _this, MEntry mPrevEntry, TParameter tPrevParameter, MEntry mEntry,
			TParameter tParameter, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterLink_24_3_solvecsp_binding = pattern_MethodParameterLink_24_3_solvecsp_bindingFBBBBBBB(
				_this, mPrevEntry, tPrevParameter, mEntry, tParameter, sourceMatch, targetMatch);
		if (result_pattern_MethodParameterLink_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLink_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodParameterLink_24_3_solvecsp_black = pattern_MethodParameterLink_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodParameterLink_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mPrevEntry, tPrevParameter, mEntry, tParameter, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLink_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLink_24_5_matchcorrcontext_blackFBBBBFBB(
			MEntry mPrevEntry, TParameter tPrevParameter, MEntry mEntry, TParameter tParameter, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mEntry.equals(mPrevEntry)) {
			if (!tParameter.equals(tPrevParameter)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (MEntryToTParameter mmethodSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mPrevEntry, MEntryToTParameter.class, "source")) {
						if (tPrevParameter.equals(mmethodSignatureToTMethodSignature.getTarget())) {
							for (MEntryToTParameter eSingleVariableDeclarationToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tParameter, MEntryToTParameter.class, "target")) {
								if (!eSingleVariableDeclarationToTParameter
										.equals(mmethodSignatureToTMethodSignature)) {
									if (mEntry.equals(eSingleVariableDeclarationToTParameter.getSource())) {
										_result.add(new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry,
												tPrevParameter, mEntry, tParameter,
												eSingleVariableDeclarationToTParameter, sourceMatch, targetMatch });
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

	public static final Object[] pattern_MethodParameterLink_24_5_matchcorrcontext_greenBBBBF(
			MEntryToTParameter mmethodSignatureToTMethodSignature,
			MEntryToTParameter eSingleVariableDeclarationToTParameter, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodParameterLink";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature);
		ccMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mmethodSignatureToTMethodSignature, eSingleVariableDeclarationToTParameter, sourceMatch,
				targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodParameterLink_24_6_createcorrespondence_blackBBBBB(MEntry mPrevEntry,
			TParameter tPrevParameter, MEntry mEntry, TParameter tParameter, CCMatch ccMatch) {
		if (!mEntry.equals(mPrevEntry)) {
			if (!tParameter.equals(tPrevParameter)) {
				return new Object[] { mPrevEntry, tPrevParameter, mEntry, tParameter, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodParameterLink_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodParameterLink";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterLink_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_27_1_matchtggpattern_blackBB(MEntry mPrevEntry,
			MEntry mEntry) {
		if (!mEntry.equals(mPrevEntry)) {
			if (mEntry.equals(mPrevEntry.getMNext())) {
				return new Object[] { mPrevEntry, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLink_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLink_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_28_1_matchtggpattern_blackBB(TParameter tPrevParameter,
			TParameter tParameter) {
		if (!tParameter.equals(tPrevParameter)) {
			if (tParameter.equals(tPrevParameter.getNext())) {
				return new Object[] { tPrevParameter, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLink_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLink_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_29_1_createresult_blackB(MethodParameterLink _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterLink_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MEntryToTParameter mmethodSignatureToTMethodSignature) {
		if (ruleResult.getCorrObjects().contains(mmethodSignatureToTMethodSignature)) {
			return new Object[] { ruleResult, mmethodSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MEntry mPrevEntry) {
		if (ruleResult.getSourceObjects().contains(mPrevEntry)) {
			return new Object[] { ruleResult, mPrevEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TParameter tPrevParameter) {
		if (ruleResult.getTargetObjects().contains(tPrevParameter)) {
			return new Object[] { ruleResult, tPrevParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MEntry mEntry) {
		if (ruleResult.getSourceObjects().contains(mEntry)) {
			return new Object[] { ruleResult, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		if (ruleResult.getCorrObjects().contains(eSingleVariableDeclarationToTParameter)) {
			return new Object[] { ruleResult, eSingleVariableDeclarationToTParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TParameter tParameter) {
		if (ruleResult.getTargetObjects().contains(tParameter)) {
			return new Object[] { ruleResult, tParameter };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLink_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mmethodSignatureToTMethodSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eSingleVariableDeclarationToTParameterList : ruleEntryContainer.getRuleEntryList()) {
				if (!eSingleVariableDeclarationToTParameterList.equals(mmethodSignatureToTMethodSignatureList)) {
					for (EObject tmpMmethodSignatureToTMethodSignature : mmethodSignatureToTMethodSignatureList
							.getEntryObjects()) {
						if (tmpMmethodSignatureToTMethodSignature instanceof MEntryToTParameter) {
							MEntryToTParameter mmethodSignatureToTMethodSignature = (MEntryToTParameter) tmpMmethodSignatureToTMethodSignature;
							MEntry mPrevEntry = mmethodSignatureToTMethodSignature.getSource();
							if (mPrevEntry != null) {
								TParameter tPrevParameter = mmethodSignatureToTMethodSignature.getTarget();
								if (tPrevParameter != null) {
									if (pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mmethodSignatureToTMethodSignature) == null) {
										if (pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												mPrevEntry) == null) {
											if (pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tPrevParameter) == null) {
												for (EObject tmpESingleVariableDeclarationToTParameter : eSingleVariableDeclarationToTParameterList
														.getEntryObjects()) {
													if (tmpESingleVariableDeclarationToTParameter instanceof MEntryToTParameter) {
														MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) tmpESingleVariableDeclarationToTParameter;
														if (!eSingleVariableDeclarationToTParameter
																.equals(mmethodSignatureToTMethodSignature)) {
															MEntry mEntry = eSingleVariableDeclarationToTParameter
																	.getSource();
															if (mEntry != null) {
																if (!mEntry.equals(mPrevEntry)) {
																	TParameter tParameter = eSingleVariableDeclarationToTParameter
																			.getTarget();
																	if (tParameter != null) {
																		if (!tParameter.equals(tPrevParameter)) {
																			if (pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult,
																					eSingleVariableDeclarationToTParameter) == null) {
																				if (pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult, mEntry) == null) {
																					if (pattern_MethodParameterLink_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							tParameter) == null) {
																						_result.add(new Object[] {
																								mmethodSignatureToTMethodSignatureList,
																								mmethodSignatureToTMethodSignature,
																								mPrevEntry,
																								tPrevParameter,
																								eSingleVariableDeclarationToTParameterList,
																								mEntry,
																								eSingleVariableDeclarationToTParameter,
																								tParameter,
																								ruleEntryContainer,
																								ruleResult });
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

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_29_3_solveCSP_bindingFBBBBBBBBB(MethodParameterLink _this,
			IsApplicableMatch isApplicableMatch, MEntryToTParameter mmethodSignatureToTMethodSignature,
			MEntry mPrevEntry, TParameter tPrevParameter, MEntry mEntry, TParameter tParameter,
			MEntryToTParameter eSingleVariableDeclarationToTParameter, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mmethodSignatureToTMethodSignature,
				mPrevEntry, tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature, mPrevEntry,
					tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLink_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodParameterLink _this, IsApplicableMatch isApplicableMatch,
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameterLink_29_3_solveCSP_binding = pattern_MethodParameterLink_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry,
				tParameter, eSingleVariableDeclarationToTParameter, ruleResult);
		if (result_pattern_MethodParameterLink_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLink_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterLink_29_3_solveCSP_black = pattern_MethodParameterLink_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLink_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature, mPrevEntry,
						tPrevParameter, mEntry, tParameter, eSingleVariableDeclarationToTParameter, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLink_29_4_checkCSP_expressionFBB(MethodParameterLink _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLink_29_5_checknacs_blackBBBBBB(
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		if (!mEntry.equals(mPrevEntry)) {
			if (!tParameter.equals(tPrevParameter)) {
				if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignatureToTMethodSignature)) {
					return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry,
							tParameter, eSingleVariableDeclarationToTParameter };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_29_6_perform_blackBBBBBBB(
			MEntryToTParameter mmethodSignatureToTMethodSignature, MEntry mPrevEntry, TParameter tPrevParameter,
			MEntry mEntry, TParameter tParameter, MEntryToTParameter eSingleVariableDeclarationToTParameter,
			ModelgeneratorRuleResult ruleResult) {
		if (!mEntry.equals(mPrevEntry)) {
			if (!tParameter.equals(tPrevParameter)) {
				if (!eSingleVariableDeclarationToTParameter.equals(mmethodSignatureToTMethodSignature)) {
					return new Object[] { mmethodSignatureToTMethodSignature, mPrevEntry, tPrevParameter, mEntry,
							tParameter, eSingleVariableDeclarationToTParameter, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLink_29_6_perform_greenBBBBB(MEntry mPrevEntry,
			TParameter tPrevParameter, MEntry mEntry, TParameter tParameter, ModelgeneratorRuleResult ruleResult) {
		mPrevEntry.setMNext(mEntry);
		tPrevParameter.setNext(tParameter);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mPrevEntry, tPrevParameter, mEntry, tParameter, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameterLink_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterLinkImpl
