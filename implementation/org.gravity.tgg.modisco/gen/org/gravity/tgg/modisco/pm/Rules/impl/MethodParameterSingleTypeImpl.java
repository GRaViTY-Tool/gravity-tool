/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MEntryToTParameter;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodParameterSingleType;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;

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
 * An implementation of the model object '<em><b>Method Parameter Single Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodParameterSingleTypeImpl extends AbstractRuleImpl implements MethodParameterSingleType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterSingleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodParameterSingleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {

		Object[] result1_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_0_1_initialbindings_blackBBBBB(this, match, mEntry, mType,
						mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mEntry] = " + mEntry + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mEntry, mType,
						mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mEntry] = " + mEntry + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_0_4_collectelementstobetranslated_blackBBBB(match, mEntry, mType,
							mSignature);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mEntry] = "
								+ mEntry + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_0_4_collectelementstobetranslated_greenBBBBFF(match, mEntry,
							mType, mSignature);
			//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_0_5_collectcontextelements_blackBBBB(match, mEntry, mType,
							mSignature);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mEntry] = "
								+ mEntry + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_0_5_collectcontextelements_greenBBB(match,
					mType, mSignature);

			// 
			MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, mEntry, mType, mSignature);
			return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_0_7_expressionF();
		} else {
			return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tSiganture = (TMethodSignature) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[2];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_1_1_performtransformation_greenBBBFFF(tSiganture, tAbstractType,
						mEntry);
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[3];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[4];
		TParameter tParameter = (TParameter) result1_green[5];

		Object[] result2_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_1_2_collecttranslatedelements_blackBBBB(mEntry, mEntryToTParameter,
						mFlowElementToTFlowElement, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_1_2_collecttranslatedelements_greenFBBBB(mEntry, mEntryToTParameter,
						mFlowElementToTFlowElement, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, tSiganture,
						mTypeToTAbstractType, tAbstractType, mEntry, mEntryToTParameter, mFlowElementToTFlowElement,
						tParameter, mSignatureToTSignature, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSiganture] = " + tSiganture + ", " + "[mTypeToTAbstractType] = " + mTypeToTAbstractType
					+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tParameter] = " + tParameter + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, tSiganture, tAbstractType, mEntry, mEntryToTParameter, mFlowElementToTFlowElement,
				tParameter, mType, mSignature);
		//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mEntry____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tParameter____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[16];

		// 
		// 
		MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, tSiganture, mTypeToTAbstractType, tAbstractType, mEntry, mEntryToTParameter,
				mFlowElementToTFlowElement, tParameter, mSignatureToTSignature, mType, mSignature);
		return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MEntry mEntry = (MEntry) result2_binding[0];
		Type mType = (Type) result2_binding[1];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[2];
		for (Object[] result2_black : MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_2_2_corematch_blackFFFBFBBB(mEntry, mType, mSignature, match)) {
			TMethodSignature tSiganture = (TMethodSignature) result2_black[0];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[1];
			TAbstractType tAbstractType = (TAbstractType) result2_black[2];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[4];
			// ForEach 
			for (Object[] result3_black : MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_2_3_findcontext_blackBBBBBBB(tSiganture, mTypeToTAbstractType,
							tAbstractType, mEntry, mSignatureToTSignature, mType, mSignature)) {
				Object[] result3_green = MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_2_3_findcontext_greenBBBBBBBFFFFFFF(tSiganture,
								mTypeToTAbstractType, tAbstractType, mEntry, mSignatureToTSignature, mType, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mSignatureToTSignature__tSiganture____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTAbstractType__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType, mEntry,
								mSignatureToTSignature, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSiganture] = " + tSiganture
							+ ", " + "[mTypeToTAbstractType] = " + mTypeToTAbstractType + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[mEntry] = " + mEntry + ", " + "[mSignatureToTSignature] = "
							+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
							+ mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodParameterSingleTypeImpl
							.pattern_MethodParameterSingleType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {
		match.registerObject("mEntry", mEntry);
		match.registerObject("mType", mType);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType, MEntry mEntry,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSiganture", tSiganture);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mSignature", mSignature);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tSiganture, EObject mTypeToTAbstractType,
			EObject tAbstractType, EObject mEntry, EObject mEntryToTParameter, EObject mFlowElementToTFlowElement,
			EObject tParameter, EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSiganture", tSiganture);
		ruleresult.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mEntry").eClass()).equals("modisco.MEntry.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMethodSignature tSiganture, TAbstractType tAbstractType,
			TParameter tParameter) {

		Object[] result1_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_10_1_initialbindings_blackBBBBB(this, match, tSiganture,
						tAbstractType, tParameter);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[tParameter] = " + tParameter + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSiganture,
						tAbstractType, tParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[tParameter] = " + tParameter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_10_4_collectelementstobetranslated_blackBBBB(match, tSiganture,
							tAbstractType, tParameter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tParameter] = " + tParameter + ".");
			}
			MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_10_4_collectelementstobetranslated_greenBBBBFF(match, tSiganture,
							tAbstractType, tParameter);
			//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_10_5_collectcontextelements_blackBBBB(match, tSiganture,
							tAbstractType, tParameter);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tParameter] = " + tParameter + ".");
			}
			MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_10_5_collectcontextelements_greenBBB(match,
					tSiganture, tAbstractType);

			// 
			MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, tSiganture, tAbstractType, tParameter);
			return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_10_7_expressionF();
		} else {
			return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tSiganture = (TMethodSignature) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[2];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_11_1_performtransformation_greenFFFBBB(tParameter, mType,
						mSignature);
		MEntry mEntry = (MEntry) result1_green[0];
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[1];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[2];

		Object[] result2_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_11_2_collecttranslatedelements_blackBBBB(mEntry, mEntryToTParameter,
						mFlowElementToTFlowElement, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_11_2_collecttranslatedelements_greenFBBBB(mEntry, mEntryToTParameter,
						mFlowElementToTFlowElement, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, tSiganture,
						mTypeToTAbstractType, tAbstractType, mEntry, mEntryToTParameter, mFlowElementToTFlowElement,
						tParameter, mSignatureToTSignature, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSiganture] = " + tSiganture + ", " + "[mTypeToTAbstractType] = " + mTypeToTAbstractType
					+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tParameter] = " + tParameter + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, tSiganture, tAbstractType, mEntry, mEntryToTParameter, mFlowElementToTFlowElement,
				tParameter, mType, mSignature);
		//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mEntry____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tParameter____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[16];

		// 
		// 
		MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_11_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, tSiganture, mTypeToTAbstractType, tAbstractType, mEntry, mEntryToTParameter,
				mFlowElementToTFlowElement, tParameter, mSignatureToTSignature, mType, mSignature);
		return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tSiganture = (TMethodSignature) result2_binding[0];
		TAbstractType tAbstractType = (TAbstractType) result2_binding[1];
		TParameter tParameter = (TParameter) result2_binding[2];
		for (Object[] result2_black : MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_12_2_corematch_blackBFBBFFFB(tSiganture, tAbstractType, tParameter,
						match)) {
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[1];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[4];
			Type mType = (Type) result2_black[5];
			MMethodSignature mSignature = (MMethodSignature) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_12_3_findcontext_blackBBBBBBB(tSiganture, mTypeToTAbstractType,
							tAbstractType, tParameter, mSignatureToTSignature, mType, mSignature)) {
				Object[] result3_green = MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_12_3_findcontext_greenBBBBBBBFFFFFFF(tSiganture,
								mTypeToTAbstractType, tAbstractType, tParameter, mSignatureToTSignature, mType,
								mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mSignatureToTSignature__tSiganture____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTAbstractType__mType____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType, tParameter,
								mSignatureToTSignature, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSiganture] = " + tSiganture
							+ ", " + "[mTypeToTAbstractType] = " + mTypeToTAbstractType + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[tParameter] = " + tParameter + ", "
							+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
							+ ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodParameterSingleTypeImpl
							.pattern_MethodParameterSingleType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodSignature tSiganture, TAbstractType tAbstractType,
			TParameter tParameter) {
		match.registerObject("tSiganture", tSiganture);
		match.registerObject("tAbstractType", tAbstractType);
		match.registerObject("tParameter", tParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodSignature tSiganture, TAbstractType tAbstractType,
			TParameter tParameter) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType, TParameter tParameter,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSiganture", tSiganture);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mSignature", mSignature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tSiganture, EObject mTypeToTAbstractType,
			EObject tAbstractType, EObject mEntry, EObject mEntryToTParameter, EObject mFlowElementToTFlowElement,
			EObject tParameter, EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSiganture", tSiganture);
		ruleresult.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tParameter").eClass())
				.equals("basic.TParameter.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_7(EMoflonEdge _edge_parameters) {

		Object[] result1_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_20_2_testcorematchandDECs_blackFFFB(_edge_parameters)) {
			TMethodSignature tSiganture = (TMethodSignature) result2_black[0];
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			TParameter tParameter = (TParameter) result2_black[2];
			Object[] result2_green = MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tSiganture, tAbstractType, tParameter)) {
				// 
				if (MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterSingleTypeImpl
							.pattern_MethodParameterSingleType_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_21_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			MEntry mEntry = (MEntry) result2_black[0];
			Type mType = (Type) result2_black[1];
			MMethodSignature mSignature = (MMethodSignature) result2_black[2];
			Object[] result2_green = MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mEntry, mType, mSignature)) {
				// 
				if (MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterSingleTypeImpl
							.pattern_MethodParameterSingleType_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodParameterSingleType");
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
		ruleResult.setRule("MethodParameterSingleType");
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

		Object[] result1_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMethodSignature tSiganture = (TMethodSignature) result2_bindingAndBlack[0];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[1];
		MEntry mEntry = (MEntry) result2_bindingAndBlack[2];
		TParameter tParameter = (TParameter) result2_bindingAndBlack[3];
		Type mType = (Type) result2_bindingAndBlack[4];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tSiganture,
						tAbstractType, mEntry, tParameter, mType, mSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[mEntry] = " + mEntry + ", " + "[tParameter] = " + tParameter + ", " + "[mType] = " + mType
					+ ", " + "[mSignature] = " + mSignature + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_24_5_matchcorrcontext_blackBFBFBBBB(tSiganture, tAbstractType,
							mType, mSignature, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result5_black[1];
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result5_black[3];
				Object[] result5_green = MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_24_5_matchcorrcontext_greenBBBBF(mTypeToTAbstractType,
								mSignatureToTSignature, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_24_6_createcorrespondence_blackBBBBBBB(tSiganture,
								tAbstractType, mEntry, tParameter, mType, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSiganture] = "
							+ tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mEntry] = " + mEntry
							+ ", " + "[tParameter] = " + tParameter + ", " + "[mType] = " + mType + ", "
							+ "[mSignature] = " + mSignature + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_24_6_createcorrespondence_greenBFFBB(
						mEntry, tParameter, ccMatch);
				//nothing MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[1];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[2];

				Object[] result7_black = MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMethodSignature tSiganture, TAbstractType tAbstractType, MEntry mEntry,
			TParameter tParameter, Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MEntry mEntry, Type mType, MMethodSignature mSignature) {// 
		Object[] result1_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_27_1_matchtggpattern_blackBBB(mEntry, mType, mSignature);
		if (result1_black != null) {
			return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_27_2_expressionF();
		} else {
			return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {// 
		Object[] result1_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_28_1_matchtggpattern_blackBBB(tSiganture, tAbstractType, tParameter);
		if (result1_black != null) {
			return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_28_2_expressionF();
		} else {
			return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MSignatureToTSignature mSignatureToTSignatureParameter, TypeToTAbstractType mTypeToTAbstractTypeParameter) {

		Object[] result1_black = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodParameterSingleTypeImpl
				.pattern_MethodParameterSingleType_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mSignatureToTSignatureList = (RuleEntryList) result2_black[0];
			TMethodSignature tSiganture = (TMethodSignature) result2_black[1];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[2];
			MMethodSignature mSignature = (MMethodSignature) result2_black[3];
			//nothing RuleEntryList mTypeToTAbstractTypeList = (RuleEntryList) result2_black[4];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[5];
			Type mType = (Type) result2_black[6];
			TAbstractType tAbstractType = (TAbstractType) result2_black[7];

			Object[] result3_bindingAndBlack = MethodParameterSingleTypeImpl
					.pattern_MethodParameterSingleType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							tSiganture, mTypeToTAbstractType, tAbstractType, mSignatureToTSignature, mType, mSignature,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSiganture] = " + tSiganture + ", "
						+ "[mTypeToTAbstractType] = " + mTypeToTAbstractType + ", " + "[tAbstractType] = "
						+ tAbstractType + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
						+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MethodParameterSingleTypeImpl
						.pattern_MethodParameterSingleType_29_5_checknacs_blackBBBBBB(tSiganture, mTypeToTAbstractType,
								tAbstractType, mSignatureToTSignature, mType, mSignature);
				if (result5_black != null) {

					Object[] result6_black = MethodParameterSingleTypeImpl
							.pattern_MethodParameterSingleType_29_6_perform_blackBBBBBBB(tSiganture,
									mTypeToTAbstractType, tAbstractType, mSignatureToTSignature, mType, mSignature,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSiganture] = "
								+ tSiganture + ", " + "[mTypeToTAbstractType] = " + mTypeToTAbstractType + ", "
								+ "[tAbstractType] = " + tAbstractType + ", " + "[mSignatureToTSignature] = "
								+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
								+ mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_29_6_perform_greenBBFFFFBBB(
							tSiganture, tAbstractType, mType, mSignature, ruleResult);
					//nothing MEntry mEntry = (MEntry) result6_green[2];
					//nothing MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[3];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[4];
					//nothing TParameter tParameter = (TParameter) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return MethodParameterSingleTypeImpl.pattern_MethodParameterSingleType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSiganture", tSiganture);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mSignature", mSignature);
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
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPROPRIATE_FWD__MATCH_MENTRY_TYPE_MMETHODSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (MEntry) arguments.get(1), (Type) arguments.get(2),
					(MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MENTRY_TYPE_MMETHODSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MEntry) arguments.get(1), (Type) arguments.get(2),
					(MMethodSignature) arguments.get(3));
			return null;
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MENTRY_TYPE_MMETHODSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MEntry) arguments.get(1),
					(Type) arguments.get(2), (MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MENTRY_MSIGNATURETOTSIGNATURE_TYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TAbstractType) arguments.get(3), (MEntry) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (Type) arguments.get(6),
					(MMethodSignature) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3));
			return null;
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TPARAMETER_MSIGNATURETOTSIGNATURE_TYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TAbstractType) arguments.get(3),
					(TParameter) arguments.get(4), (MSignatureToTSignature) arguments.get(5), (Type) arguments.get(6),
					(MMethodSignature) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__TMETHODSIGNATURE_TABSTRACTTYPE_MENTRY_TPARAMETER_TYPE_MMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(MEntry) arguments.get(2), (TParameter) arguments.get(3), (Type) arguments.get(4),
					(MMethodSignature) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___CHECK_DEC_FWD__MENTRY_TYPE_MMETHODSIGNATURE:
			return checkDEC_FWD((MEntry) arguments.get(0), (Type) arguments.get(1),
					(MMethodSignature) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___CHECK_DEC_BWD__TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TParameter) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MSIGNATURETOTSIGNATURE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (MSignatureToTSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MSIGNATURETOTSIGNATURE_TYPE_MMETHODSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TAbstractType) arguments.get(3),
					(MSignatureToTSignature) arguments.get(4), (Type) arguments.get(5),
					(MMethodSignature) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameterSingleType_0_1_initialbindings_blackBBBBB(
			MethodParameterSingleType _this, Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {
		return new Object[] { _this, match, mEntry, mType, mSignature };
	}

	public static final Object[] pattern_MethodParameterSingleType_0_2_SolveCSP_bindingFBBBBB(
			MethodParameterSingleType _this, Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mEntry, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mEntry, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterSingleType_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodParameterSingleType _this, Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodParameterSingleType_0_2_SolveCSP_binding = pattern_MethodParameterSingleType_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mEntry, mType, mSignature);
		if (result_pattern_MethodParameterSingleType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterSingleType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterSingleType_0_2_SolveCSP_black = pattern_MethodParameterSingleType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterSingleType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mEntry, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterSingleType_0_3_CheckCSP_expressionFBB(
			MethodParameterSingleType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_0_4_collectelementstobetranslated_blackBBBB(
			Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {
		return new Object[] { match, mEntry, mType, mSignature };
	}

	public static final Object[] pattern_MethodParameterSingleType_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mEntry);
		String mEntry__mType____type_name_prime = "type";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(mEntry__mType____type);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		match.getToBeTranslatedEdges().add(mSignature__mEntry____mEntrys);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { match, mEntry, mType, mSignature, mEntry__mType____type, mSignature__mEntry____mEntrys };
	}

	public static final Object[] pattern_MethodParameterSingleType_0_5_collectcontextelements_blackBBBB(Match match,
			MEntry mEntry, Type mType, MMethodSignature mSignature) {
		return new Object[] { match, mEntry, mType, mSignature };
	}

	public static final Object[] pattern_MethodParameterSingleType_0_5_collectcontextelements_greenBBB(Match match,
			Type mType, MMethodSignature mSignature) {
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mSignature);
		return new Object[] { match, mType, mSignature };
	}

	public static final void pattern_MethodParameterSingleType_0_6_registerobjectstomatch_expressionBBBBB(
			MethodParameterSingleType _this, Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mEntry, mType, mSignature);

	}

	public static final boolean pattern_MethodParameterSingleType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterSingleType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSiganture");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTAbstractType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignature");
		EObject tmpTSiganture = _localVariable_0;
		EObject tmpMTypeToTAbstractType = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpMEntry = _localVariable_3;
		EObject tmpMSignatureToTSignature = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpMSignature = _localVariable_6;
		if (tmpTSiganture instanceof TMethodSignature) {
			TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
			if (tmpMTypeToTAbstractType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) tmpMTypeToTAbstractType;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpMEntry instanceof MEntry) {
						MEntry mEntry = (MEntry) tmpMEntry;
						if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpMSignature instanceof MMethodSignature) {
									MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
									return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, mEntry,
											mSignatureToTSignature, mType, mSignature, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_1_1_performtransformation_blackBBBBBBBFBB(
			TMethodSignature tSiganture, TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			MEntry mEntry, MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature,
			MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, mEntry, mSignatureToTSignature,
						mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterSingleType_1_1_performtransformation_binding = pattern_MethodParameterSingleType_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterSingleType_1_1_performtransformation_binding != null) {
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameterSingleType_1_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result_pattern_MethodParameterSingleType_1_1_performtransformation_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameterSingleType_1_1_performtransformation_binding[2];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterSingleType_1_1_performtransformation_binding[3];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_MethodParameterSingleType_1_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_MethodParameterSingleType_1_1_performtransformation_binding[5];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameterSingleType_1_1_performtransformation_binding[6];

			Object[] result_pattern_MethodParameterSingleType_1_1_performtransformation_black = pattern_MethodParameterSingleType_1_1_performtransformation_blackBBBBBBBFBB(
					tSiganture, mTypeToTAbstractType, tAbstractType, mEntry, mSignatureToTSignature, mType, mSignature,
					_this, isApplicableMatch);
			if (result_pattern_MethodParameterSingleType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterSingleType_1_1_performtransformation_black[7];

				return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, mEntry, mSignatureToTSignature,
						mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_1_1_performtransformation_greenBBBFFF(
			TMethodSignature tSiganture, TAbstractType tAbstractType, MEntry mEntry) {
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		mEntryToTParameter.setSource(mEntry);
		mFlowElementToTFlowElement.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		tSiganture.getParameters().add(tParameter);
		tParameter.setType(tAbstractType);
		mFlowElementToTFlowElement.setTarget(tParameter);
		return new Object[] { tSiganture, tAbstractType, mEntry, mEntryToTParameter, mFlowElementToTFlowElement,
				tParameter };
	}

	public static final Object[] pattern_MethodParameterSingleType_1_2_collecttranslatedelements_blackBBBB(
			MEntry mEntry, MEntryToTParameter mEntryToTParameter,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		return new Object[] { mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameterSingleType_1_2_collecttranslatedelements_greenFBBBB(
			MEntry mEntry, MEntryToTParameter mEntryToTParameter,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameterSingleType_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSiganture, EObject mTypeToTAbstractType, EObject tAbstractType,
			EObject mEntry, EObject mEntryToTParameter, EObject mFlowElementToTFlowElement, EObject tParameter,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		if (!mTypeToTAbstractType.equals(tSiganture)) {
			if (!mTypeToTAbstractType.equals(tAbstractType)) {
				if (!mTypeToTAbstractType.equals(tParameter)) {
					if (!tAbstractType.equals(tSiganture)) {
						if (!tAbstractType.equals(tParameter)) {
							if (!mEntry.equals(tSiganture)) {
								if (!mEntry.equals(mTypeToTAbstractType)) {
									if (!mEntry.equals(tAbstractType)) {
										if (!mEntry.equals(mEntryToTParameter)) {
											if (!mEntry.equals(mFlowElementToTFlowElement)) {
												if (!mEntry.equals(tParameter)) {
													if (!mEntry.equals(mSignatureToTSignature)) {
														if (!mEntry.equals(mType)) {
															if (!mEntry.equals(mSignature)) {
																if (!mEntryToTParameter.equals(tSiganture)) {
																	if (!mEntryToTParameter
																			.equals(mTypeToTAbstractType)) {
																		if (!mEntryToTParameter.equals(tAbstractType)) {
																			if (!mEntryToTParameter.equals(
																					mFlowElementToTFlowElement)) {
																				if (!mEntryToTParameter
																						.equals(tParameter)) {
																					if (!mEntryToTParameter.equals(
																							mSignatureToTSignature)) {
																						if (!mEntryToTParameter
																								.equals(mType)) {
																							if (!mEntryToTParameter
																									.equals(mSignature)) {
																								if (!mFlowElementToTFlowElement
																										.equals(tSiganture)) {
																									if (!mFlowElementToTFlowElement
																											.equals(mTypeToTAbstractType)) {
																										if (!mFlowElementToTFlowElement
																												.equals(tAbstractType)) {
																											if (!mFlowElementToTFlowElement
																													.equals(tParameter)) {
																												if (!mFlowElementToTFlowElement
																														.equals(mSignatureToTSignature)) {
																													if (!mFlowElementToTFlowElement
																															.equals(mType)) {
																														if (!mFlowElementToTFlowElement
																																.equals(mSignature)) {
																															if (!tParameter
																																	.equals(tSiganture)) {
																																if (!mSignatureToTSignature
																																		.equals(tSiganture)) {
																																	if (!mSignatureToTSignature
																																			.equals(mTypeToTAbstractType)) {
																																		if (!mSignatureToTSignature
																																				.equals(tAbstractType)) {
																																			if (!mSignatureToTSignature
																																					.equals(tParameter)) {
																																				if (!mSignatureToTSignature
																																						.equals(mType)) {
																																					if (!mType
																																							.equals(tSiganture)) {
																																						if (!mType
																																								.equals(mTypeToTAbstractType)) {
																																							if (!mType
																																									.equals(tAbstractType)) {
																																								if (!mType
																																										.equals(tParameter)) {
																																									if (!mSignature
																																											.equals(tSiganture)) {
																																										if (!mSignature
																																												.equals(mTypeToTAbstractType)) {
																																											if (!mSignature
																																													.equals(tAbstractType)) {
																																												if (!mSignature
																																														.equals(tParameter)) {
																																													if (!mSignature
																																															.equals(mSignatureToTSignature)) {
																																														if (!mSignature
																																																.equals(mType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tSiganture,
																																																	mTypeToTAbstractType,
																																																	tAbstractType,
																																																	mEntry,
																																																	mEntryToTParameter,
																																																	mFlowElementToTFlowElement,
																																																	tParameter,
																																																	mSignatureToTSignature,
																																																	mType,
																																																	mSignature };
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
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSiganture, EObject tAbstractType, EObject mEntry,
			EObject mEntryToTParameter, EObject mFlowElementToTFlowElement, EObject tParameter, EObject mType,
			EObject mSignature) {
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterSingleType";
		String mEntry__mType____type_name_prime = "type";
		String mFlowElementToTFlowElement__mEntry____source_name_prime = "source";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mFlowElementToTFlowElement__tParameter____target_name_prime = "target";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mEntry__mType____type);
		mFlowElementToTFlowElement__mEntry____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mEntry____source);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tSiganture__tParameter____parameters);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tParameter__tAbstractType____type);
		mFlowElementToTFlowElement__tParameter____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tParameter____target);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mSignature__mEntry____mEntrys);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mFlowElementToTFlowElement__mEntry____source.setName(mFlowElementToTFlowElement__mEntry____source_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mFlowElementToTFlowElement__tParameter____target
				.setName(mFlowElementToTFlowElement__tParameter____target_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { ruleresult, tSiganture, tAbstractType, mEntry, mEntryToTParameter,
				mFlowElementToTFlowElement, tParameter, mType, mSignature, mEntry__mType____type,
				mFlowElementToTFlowElement__mEntry____source, mEntryToTParameter__mEntry____source,
				mEntryToTParameter__tParameter____target, tSiganture__tParameter____parameters,
				tParameter__tAbstractType____type, mFlowElementToTFlowElement__tParameter____target,
				mSignature__mEntry____mEntrys };
	}

	public static final void pattern_MethodParameterSingleType_1_5_registerobjects_expressionBBBBBBBBBBBB(
			MethodParameterSingleType _this, PerformRuleResult ruleresult, EObject tSiganture,
			EObject mTypeToTAbstractType, EObject tAbstractType, EObject mEntry, EObject mEntryToTParameter,
			EObject mFlowElementToTFlowElement, EObject tParameter, EObject mSignatureToTSignature, EObject mType,
			EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, tSiganture, mTypeToTAbstractType, tAbstractType, mEntry,
				mEntryToTParameter, mFlowElementToTFlowElement, tParameter, mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodParameterSingleType_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_2_1_preparereturnvalue_bindingFB(
			MethodParameterSingleType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterSingleType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterSingleType _this) {
		Object[] result_pattern_MethodParameterSingleType_2_1_preparereturnvalue_binding = pattern_MethodParameterSingleType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterSingleType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterSingleType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterSingleType_2_1_preparereturnvalue_black = pattern_MethodParameterSingleType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterSingleType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterSingleType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameterSingleType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterSingleType_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mEntry");
		EObject _localVariable_1 = match.getObject("mType");
		EObject _localVariable_2 = match.getObject("mSignature");
		EObject tmpMEntry = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		if (tmpMEntry instanceof MEntry) {
			MEntry mEntry = (MEntry) tmpMEntry;
			if (tmpMType instanceof Type) {
				Type mType = (Type) tmpMType;
				if (tmpMSignature instanceof MMethodSignature) {
					MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
					return new Object[] { mEntry, mType, mSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterSingleType_2_2_corematch_blackFFFBFBBB(MEntry mEntry,
			Type mType, MMethodSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
			TSignature tmpTSiganture = mSignatureToTSignature.getTarget();
			if (tmpTSiganture instanceof TMethodSignature) {
				TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
				for (TypeToTAbstractType mTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tAbstractType = mTypeToTAbstractType.getTarget();
					if (tAbstractType != null) {
						_result.add(new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, mEntry,
								mSignatureToTSignature, mType, mSignature, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterSingleType_2_3_findcontext_blackBBBBBBB(
			TMethodSignature tSiganture, TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			MEntry mEntry, MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mSignature.equals(mSignatureToTSignature.getSource())) {
			if (mType.equals(mEntry.getType())) {
				if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
					if (tAbstractType.equals(mTypeToTAbstractType.getTarget())) {
						if (mType.equals(mTypeToTAbstractType.getSource())) {
							if (mSignature.getMEntrys().contains(mEntry)) {
								_result.add(new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, mEntry,
										mSignatureToTSignature, mType, mSignature });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_2_3_findcontext_greenBBBBBBBFFFFFFF(
			TMethodSignature tSiganture, TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			MEntry mEntry, MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSiganture____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mEntry__mType____type_name_prime = "type";
		String mSignatureToTSignature__tSiganture____target_name_prime = "target";
		String mTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String mTypeToTAbstractType__mType____source_name_prime = "source";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		isApplicableMatch.getAllContextElements().add(tSiganture);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mEntry__mType____type);
		mSignatureToTSignature__tSiganture____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSiganture____target.setTrg(tSiganture);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSiganture____target);
		mTypeToTAbstractType__tAbstractType____target.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__tAbstractType____target);
		mTypeToTAbstractType__mType____source.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__mType____source);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mSignature__mEntry____mEntrys);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mSignatureToTSignature__tSiganture____target.setName(mSignatureToTSignature__tSiganture____target_name_prime);
		mTypeToTAbstractType__tAbstractType____target.setName(mTypeToTAbstractType__tAbstractType____target_name_prime);
		mTypeToTAbstractType__mType____source.setName(mTypeToTAbstractType__mType____source_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, mEntry, mSignatureToTSignature, mType,
				mSignature, isApplicableMatch, mSignatureToTSignature__mSignature____source, mEntry__mType____type,
				mSignatureToTSignature__tSiganture____target, mTypeToTAbstractType__tAbstractType____target,
				mTypeToTAbstractType__mType____source, mSignature__mEntry____mEntrys };
	}

	public static final Object[] pattern_MethodParameterSingleType_2_4_solveCSP_bindingFBBBBBBBBB(
			MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType, MEntry mEntry,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tSiganture, mTypeToTAbstractType,
				tAbstractType, mEntry, mSignatureToTSignature, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType,
					mEntry, mSignatureToTSignature, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterSingleType_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType, MEntry mEntry,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodParameterSingleType_2_4_solveCSP_binding = pattern_MethodParameterSingleType_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType, mEntry,
				mSignatureToTSignature, mType, mSignature);
		if (result_pattern_MethodParameterSingleType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterSingleType_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterSingleType_2_4_solveCSP_black = pattern_MethodParameterSingleType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterSingleType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType,
						mEntry, mSignatureToTSignature, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterSingleType_2_5_checkCSP_expressionFBB(
			MethodParameterSingleType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterSingleType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterSingleType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterSingleType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_10_1_initialbindings_blackBBBBB(
			MethodParameterSingleType _this, Match match, TMethodSignature tSiganture, TAbstractType tAbstractType,
			TParameter tParameter) {
		return new Object[] { _this, match, tSiganture, tAbstractType, tParameter };
	}

	public static final Object[] pattern_MethodParameterSingleType_10_2_SolveCSP_bindingFBBBBB(
			MethodParameterSingleType _this, Match match, TMethodSignature tSiganture, TAbstractType tAbstractType,
			TParameter tParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSiganture, tAbstractType, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSiganture, tAbstractType, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterSingleType_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodParameterSingleType _this, Match match, TMethodSignature tSiganture, TAbstractType tAbstractType,
			TParameter tParameter) {
		Object[] result_pattern_MethodParameterSingleType_10_2_SolveCSP_binding = pattern_MethodParameterSingleType_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSiganture, tAbstractType, tParameter);
		if (result_pattern_MethodParameterSingleType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterSingleType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterSingleType_10_2_SolveCSP_black = pattern_MethodParameterSingleType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterSingleType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSiganture, tAbstractType, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterSingleType_10_3_CheckCSP_expressionFBB(
			MethodParameterSingleType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		return new Object[] { match, tSiganture, tAbstractType, tParameter };
	}

	public static final Object[] pattern_MethodParameterSingleType_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tParameter);
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String tParameter__tAbstractType____type_name_prime = "type";
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(tSiganture__tParameter____parameters);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		match.getToBeTranslatedEdges().add(tParameter__tAbstractType____type);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		return new Object[] { match, tSiganture, tAbstractType, tParameter, tSiganture__tParameter____parameters,
				tParameter__tAbstractType____type };
	}

	public static final Object[] pattern_MethodParameterSingleType_10_5_collectcontextelements_blackBBBB(Match match,
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		return new Object[] { match, tSiganture, tAbstractType, tParameter };
	}

	public static final Object[] pattern_MethodParameterSingleType_10_5_collectcontextelements_greenBBB(Match match,
			TMethodSignature tSiganture, TAbstractType tAbstractType) {
		match.getContextNodes().add(tSiganture);
		match.getContextNodes().add(tAbstractType);
		return new Object[] { match, tSiganture, tAbstractType };
	}

	public static final void pattern_MethodParameterSingleType_10_6_registerobjectstomatch_expressionBBBBB(
			MethodParameterSingleType _this, Match match, TMethodSignature tSiganture, TAbstractType tAbstractType,
			TParameter tParameter) {
		_this.registerObjectsToMatch_BWD(match, tSiganture, tAbstractType, tParameter);

	}

	public static final boolean pattern_MethodParameterSingleType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterSingleType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSiganture");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTAbstractType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignature");
		EObject tmpTSiganture = _localVariable_0;
		EObject tmpMTypeToTAbstractType = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpTParameter = _localVariable_3;
		EObject tmpMSignatureToTSignature = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpMSignature = _localVariable_6;
		if (tmpTSiganture instanceof TMethodSignature) {
			TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
			if (tmpMTypeToTAbstractType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) tmpMTypeToTAbstractType;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpTParameter instanceof TParameter) {
						TParameter tParameter = (TParameter) tmpTParameter;
						if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpMSignature instanceof MMethodSignature) {
									MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
									return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, tParameter,
											mSignatureToTSignature, mType, mSignature, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_11_1_performtransformation_blackBBBBBBBFBB(
			TMethodSignature tSiganture, TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			TParameter tParameter, MSignatureToTSignature mSignatureToTSignature, Type mType,
			MMethodSignature mSignature, MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, tParameter,
						mSignatureToTSignature, mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterSingleType_11_1_performtransformation_binding = pattern_MethodParameterSingleType_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterSingleType_11_1_performtransformation_binding != null) {
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameterSingleType_11_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result_pattern_MethodParameterSingleType_11_1_performtransformation_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameterSingleType_11_1_performtransformation_binding[2];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterSingleType_11_1_performtransformation_binding[3];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_MethodParameterSingleType_11_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_MethodParameterSingleType_11_1_performtransformation_binding[5];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameterSingleType_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodParameterSingleType_11_1_performtransformation_black = pattern_MethodParameterSingleType_11_1_performtransformation_blackBBBBBBBFBB(
					tSiganture, mTypeToTAbstractType, tAbstractType, tParameter, mSignatureToTSignature, mType,
					mSignature, _this, isApplicableMatch);
			if (result_pattern_MethodParameterSingleType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterSingleType_11_1_performtransformation_black[7];

				return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, tParameter,
						mSignatureToTSignature, mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_11_1_performtransformation_greenFFFBBB(
			TParameter tParameter, Type mType, MMethodSignature mSignature) {
		MEntry mEntry = ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mEntry.setType(mType);
		mSignature.getMEntrys().add(mEntry);
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		mFlowElementToTFlowElement.setSource(mEntry);
		mFlowElementToTFlowElement.setTarget(tParameter);
		return new Object[] { mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter, mType, mSignature };
	}

	public static final Object[] pattern_MethodParameterSingleType_11_2_collecttranslatedelements_blackBBBB(
			MEntry mEntry, MEntryToTParameter mEntryToTParameter,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		return new Object[] { mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameterSingleType_11_2_collecttranslatedelements_greenFBBBB(
			MEntry mEntry, MEntryToTParameter mEntryToTParameter,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getTranslatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameterSingleType_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSiganture, EObject mTypeToTAbstractType, EObject tAbstractType,
			EObject mEntry, EObject mEntryToTParameter, EObject mFlowElementToTFlowElement, EObject tParameter,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		if (!mTypeToTAbstractType.equals(tSiganture)) {
			if (!mTypeToTAbstractType.equals(tAbstractType)) {
				if (!mTypeToTAbstractType.equals(tParameter)) {
					if (!tAbstractType.equals(tSiganture)) {
						if (!tAbstractType.equals(tParameter)) {
							if (!mEntry.equals(tSiganture)) {
								if (!mEntry.equals(mTypeToTAbstractType)) {
									if (!mEntry.equals(tAbstractType)) {
										if (!mEntry.equals(mEntryToTParameter)) {
											if (!mEntry.equals(mFlowElementToTFlowElement)) {
												if (!mEntry.equals(tParameter)) {
													if (!mEntry.equals(mSignatureToTSignature)) {
														if (!mEntry.equals(mType)) {
															if (!mEntry.equals(mSignature)) {
																if (!mEntryToTParameter.equals(tSiganture)) {
																	if (!mEntryToTParameter
																			.equals(mTypeToTAbstractType)) {
																		if (!mEntryToTParameter.equals(tAbstractType)) {
																			if (!mEntryToTParameter.equals(
																					mFlowElementToTFlowElement)) {
																				if (!mEntryToTParameter
																						.equals(tParameter)) {
																					if (!mEntryToTParameter.equals(
																							mSignatureToTSignature)) {
																						if (!mEntryToTParameter
																								.equals(mType)) {
																							if (!mEntryToTParameter
																									.equals(mSignature)) {
																								if (!mFlowElementToTFlowElement
																										.equals(tSiganture)) {
																									if (!mFlowElementToTFlowElement
																											.equals(mTypeToTAbstractType)) {
																										if (!mFlowElementToTFlowElement
																												.equals(tAbstractType)) {
																											if (!mFlowElementToTFlowElement
																													.equals(tParameter)) {
																												if (!mFlowElementToTFlowElement
																														.equals(mSignatureToTSignature)) {
																													if (!mFlowElementToTFlowElement
																															.equals(mType)) {
																														if (!mFlowElementToTFlowElement
																																.equals(mSignature)) {
																															if (!tParameter
																																	.equals(tSiganture)) {
																																if (!mSignatureToTSignature
																																		.equals(tSiganture)) {
																																	if (!mSignatureToTSignature
																																			.equals(mTypeToTAbstractType)) {
																																		if (!mSignatureToTSignature
																																				.equals(tAbstractType)) {
																																			if (!mSignatureToTSignature
																																					.equals(tParameter)) {
																																				if (!mSignatureToTSignature
																																						.equals(mType)) {
																																					if (!mType
																																							.equals(tSiganture)) {
																																						if (!mType
																																								.equals(mTypeToTAbstractType)) {
																																							if (!mType
																																									.equals(tAbstractType)) {
																																								if (!mType
																																										.equals(tParameter)) {
																																									if (!mSignature
																																											.equals(tSiganture)) {
																																										if (!mSignature
																																												.equals(mTypeToTAbstractType)) {
																																											if (!mSignature
																																													.equals(tAbstractType)) {
																																												if (!mSignature
																																														.equals(tParameter)) {
																																													if (!mSignature
																																															.equals(mSignatureToTSignature)) {
																																														if (!mSignature
																																																.equals(mType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tSiganture,
																																																	mTypeToTAbstractType,
																																																	tAbstractType,
																																																	mEntry,
																																																	mEntryToTParameter,
																																																	mFlowElementToTFlowElement,
																																																	tParameter,
																																																	mSignatureToTSignature,
																																																	mType,
																																																	mSignature };
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
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSiganture, EObject tAbstractType, EObject mEntry,
			EObject mEntryToTParameter, EObject mFlowElementToTFlowElement, EObject tParameter, EObject mType,
			EObject mSignature) {
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterSingleType";
		String mEntry__mType____type_name_prime = "type";
		String mFlowElementToTFlowElement__mEntry____source_name_prime = "source";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mFlowElementToTFlowElement__tParameter____target_name_prime = "target";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mEntry__mType____type);
		mFlowElementToTFlowElement__mEntry____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mEntry____source);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(tSiganture__tParameter____parameters);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tParameter__tAbstractType____type);
		mFlowElementToTFlowElement__tParameter____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tParameter____target);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mSignature__mEntry____mEntrys);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mFlowElementToTFlowElement__mEntry____source.setName(mFlowElementToTFlowElement__mEntry____source_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mFlowElementToTFlowElement__tParameter____target
				.setName(mFlowElementToTFlowElement__tParameter____target_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { ruleresult, tSiganture, tAbstractType, mEntry, mEntryToTParameter,
				mFlowElementToTFlowElement, tParameter, mType, mSignature, mEntry__mType____type,
				mFlowElementToTFlowElement__mEntry____source, mEntryToTParameter__mEntry____source,
				mEntryToTParameter__tParameter____target, tSiganture__tParameter____parameters,
				tParameter__tAbstractType____type, mFlowElementToTFlowElement__tParameter____target,
				mSignature__mEntry____mEntrys };
	}

	public static final void pattern_MethodParameterSingleType_11_5_registerobjects_expressionBBBBBBBBBBBB(
			MethodParameterSingleType _this, PerformRuleResult ruleresult, EObject tSiganture,
			EObject mTypeToTAbstractType, EObject tAbstractType, EObject mEntry, EObject mEntryToTParameter,
			EObject mFlowElementToTFlowElement, EObject tParameter, EObject mSignatureToTSignature, EObject mType,
			EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, tSiganture, mTypeToTAbstractType, tAbstractType, mEntry,
				mEntryToTParameter, mFlowElementToTFlowElement, tParameter, mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodParameterSingleType_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_12_1_preparereturnvalue_bindingFB(
			MethodParameterSingleType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterSingleType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterSingleType _this) {
		Object[] result_pattern_MethodParameterSingleType_12_1_preparereturnvalue_binding = pattern_MethodParameterSingleType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterSingleType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterSingleType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterSingleType_12_1_preparereturnvalue_black = pattern_MethodParameterSingleType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterSingleType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterSingleType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameterSingleType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterSingleType_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSiganture");
		EObject _localVariable_1 = match.getObject("tAbstractType");
		EObject _localVariable_2 = match.getObject("tParameter");
		EObject tmpTSiganture = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpTParameter = _localVariable_2;
		if (tmpTSiganture instanceof TMethodSignature) {
			TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpTParameter instanceof TParameter) {
					TParameter tParameter = (TParameter) tmpTParameter;
					return new Object[] { tSiganture, tAbstractType, tParameter, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterSingleType_12_2_corematch_blackBFBBFFFB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSiganture, MSignatureToTSignature.class, "target")) {
			MSignature tmpMSignature = mSignatureToTSignature.getSource();
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				for (TypeToTAbstractType mTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
					Type mType = mTypeToTAbstractType.getSource();
					if (mType != null) {
						_result.add(new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, tParameter,
								mSignatureToTSignature, mType, mSignature, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterSingleType_12_3_findcontext_blackBBBBBBB(
			TMethodSignature tSiganture, TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			TParameter tParameter, MSignatureToTSignature mSignatureToTSignature, Type mType,
			MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mSignature.equals(mSignatureToTSignature.getSource())) {
			if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
				if (tAbstractType.equals(mTypeToTAbstractType.getTarget())) {
					if (tSiganture.getParameters().contains(tParameter)) {
						if (tAbstractType.equals(tParameter.getType())) {
							if (mType.equals(mTypeToTAbstractType.getSource())) {
								_result.add(new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, tParameter,
										mSignatureToTSignature, mType, mSignature });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_12_3_findcontext_greenBBBBBBBFFFFFFF(
			TMethodSignature tSiganture, TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			TParameter tParameter, MSignatureToTSignature mSignatureToTSignature, Type mType,
			MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSiganture____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSiganture____target_name_prime = "target";
		String mTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mTypeToTAbstractType__mType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tSiganture);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSiganture____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSiganture____target.setTrg(tSiganture);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSiganture____target);
		mTypeToTAbstractType__tAbstractType____target.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__tAbstractType____target);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(tSiganture__tParameter____parameters);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tParameter__tAbstractType____type);
		mTypeToTAbstractType__mType____source.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__mType____source);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSiganture____target.setName(mSignatureToTSignature__tSiganture____target_name_prime);
		mTypeToTAbstractType__tAbstractType____target.setName(mTypeToTAbstractType__tAbstractType____target_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mTypeToTAbstractType__mType____source.setName(mTypeToTAbstractType__mType____source_name_prime);
		return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, tParameter, mSignatureToTSignature,
				mType, mSignature, isApplicableMatch, mSignatureToTSignature__mSignature____source,
				mSignatureToTSignature__tSiganture____target, mTypeToTAbstractType__tAbstractType____target,
				tSiganture__tParameter____parameters, tParameter__tAbstractType____type,
				mTypeToTAbstractType__mType____source };
	}

	public static final Object[] pattern_MethodParameterSingleType_12_4_solveCSP_bindingFBBBBBBBBB(
			MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType, TParameter tParameter,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tSiganture, mTypeToTAbstractType,
				tAbstractType, tParameter, mSignatureToTSignature, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType,
					tParameter, mSignatureToTSignature, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterSingleType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType, TParameter tParameter,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodParameterSingleType_12_4_solveCSP_binding = pattern_MethodParameterSingleType_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType, tParameter,
				mSignatureToTSignature, mType, mSignature);
		if (result_pattern_MethodParameterSingleType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterSingleType_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterSingleType_12_4_solveCSP_black = pattern_MethodParameterSingleType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterSingleType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType,
						tParameter, mSignatureToTSignature, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterSingleType_12_5_checkCSP_expressionFBB(
			MethodParameterSingleType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterSingleType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterSingleType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterSingleType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_20_1_preparereturnvalue_bindingFB(
			MethodParameterSingleType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterSingleType _this) {
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

	public static final Object[] pattern_MethodParameterSingleType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterSingleType _this) {
		Object[] result_pattern_MethodParameterSingleType_20_1_preparereturnvalue_binding = pattern_MethodParameterSingleType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterSingleType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterSingleType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterSingleType_20_1_preparereturnvalue_black = pattern_MethodParameterSingleType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterSingleType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterSingleType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterSingleType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterSingleType_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_parameters) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSiganture = _edge_parameters.getSrc();
		if (tmpTSiganture instanceof TMethodSignature) {
			TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
			EObject tmpTParameter = _edge_parameters.getTrg();
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tSiganture.getParameters().contains(tParameter)) {
					TAbstractType tAbstractType = tParameter.getType();
					if (tAbstractType != null) {
						_result.add(new Object[] { tSiganture, tAbstractType, tParameter, _edge_parameters });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterSingleType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodParameterSingleType _this, Match match, TMethodSignature tSiganture, TAbstractType tAbstractType,
			TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSiganture, tAbstractType, tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterSingleType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterSingleType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterSingleType_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_21_1_preparereturnvalue_bindingFB(
			MethodParameterSingleType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterSingleType _this) {
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

	public static final Object[] pattern_MethodParameterSingleType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterSingleType _this) {
		Object[] result_pattern_MethodParameterSingleType_21_1_preparereturnvalue_binding = pattern_MethodParameterSingleType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterSingleType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterSingleType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterSingleType_21_1_preparereturnvalue_black = pattern_MethodParameterSingleType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterSingleType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterSingleType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterSingleType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterSingleType_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMEntry = _edge_type.getSrc();
		if (tmpMEntry instanceof MEntry) {
			MEntry mEntry = (MEntry) tmpMEntry;
			EObject tmpMType = _edge_type.getTrg();
			if (tmpMType instanceof Type) {
				Type mType = (Type) tmpMType;
				if (mType.equals(mEntry.getType())) {
					for (MParameterList tmpMSignature : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mEntry, MParameterList.class, "mEntrys")) {
						if (tmpMSignature instanceof MMethodSignature) {
							MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
							_result.add(new Object[] { mEntry, mType, mSignature, _edge_type });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterSingleType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodParameterSingleType _this, Match match, MEntry mEntry, Type mType, MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mEntry, mType, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterSingleType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterSingleType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterSingleType_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_24_1_prepare_blackB(
			MethodParameterSingleType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterSingleType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tSiganture");
		EObject _localVariable_1 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_2 = sourceMatch.getObject("mEntry");
		EObject _localVariable_3 = targetMatch.getObject("tParameter");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject _localVariable_5 = sourceMatch.getObject("mSignature");
		EObject tmpTSiganture = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpMEntry = _localVariable_2;
		EObject tmpTParameter = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		if (tmpTSiganture instanceof TMethodSignature) {
			TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpMEntry instanceof MEntry) {
					MEntry mEntry = (MEntry) tmpMEntry;
					if (tmpTParameter instanceof TParameter) {
						TParameter tParameter = (TParameter) tmpTParameter;
						if (tmpMType instanceof Type) {
							Type mType = (Type) tmpMType;
							if (tmpMSignature instanceof MMethodSignature) {
								MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
								return new Object[] { tSiganture, tAbstractType, mEntry, tParameter, mType, mSignature,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_blackBBBBBBBB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, MEntry mEntry, TParameter tParameter, Type mType,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tSiganture, tAbstractType, mEntry, tParameter, mType, mSignature, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_binding = pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_binding != null) {
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_binding[0];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_binding[1];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_binding[2];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_binding[3];
			Type mType = (Type) result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_binding[4];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_black = pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tSiganture, tAbstractType, mEntry, tParameter, mType, mSignature, sourceMatch, targetMatch);
			if (result_pattern_MethodParameterSingleType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tSiganture, tAbstractType, mEntry, tParameter, mType, mSignature, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_24_3_solvecsp_bindingFBBBBBBBBB(
			MethodParameterSingleType _this, TMethodSignature tSiganture, TAbstractType tAbstractType, MEntry mEntry,
			TParameter tParameter, Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tSiganture, tAbstractType, mEntry, tParameter, mType,
				mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tSiganture, tAbstractType, mEntry, tParameter, mType, mSignature,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterSingleType_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			MethodParameterSingleType _this, TMethodSignature tSiganture, TAbstractType tAbstractType, MEntry mEntry,
			TParameter tParameter, Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterSingleType_24_3_solvecsp_binding = pattern_MethodParameterSingleType_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tSiganture, tAbstractType, mEntry, tParameter, mType, mSignature, sourceMatch, targetMatch);
		if (result_pattern_MethodParameterSingleType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterSingleType_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodParameterSingleType_24_3_solvecsp_black = pattern_MethodParameterSingleType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodParameterSingleType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tSiganture, tAbstractType, mEntry, tParameter, mType, mSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterSingleType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterSingleType_24_5_matchcorrcontext_blackBFBFBBBB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, Type mType, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
				if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
					for (TypeToTAbstractType mTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
						if (mType.equals(mTypeToTAbstractType.getSource())) {
							_result.add(new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType,
									mSignatureToTSignature, mType, mSignature, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTAbstractType, MSignatureToTSignature mSignatureToTSignature, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodParameterSingleType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTAbstractType);
		ccMatch.getAllContextElements().add(mSignatureToTSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTAbstractType, mSignatureToTSignature, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodParameterSingleType_24_6_createcorrespondence_blackBBBBBBB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, MEntry mEntry, TParameter tParameter, Type mType,
			MMethodSignature mSignature, CCMatch ccMatch) {
		return new Object[] { tSiganture, tAbstractType, mEntry, tParameter, mType, mSignature, ccMatch };
	}

	public static final Object[] pattern_MethodParameterSingleType_24_6_createcorrespondence_greenBFFBB(MEntry mEntry,
			TParameter tParameter, CCMatch ccMatch) {
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		ccMatch.getCreateCorr().add(mEntryToTParameter);
		mFlowElementToTFlowElement.setSource(mEntry);
		mFlowElementToTFlowElement.setTarget(tParameter);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		return new Object[] { mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter, ccMatch };
	}

	public static final Object[] pattern_MethodParameterSingleType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodParameterSingleType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodParameterSingleType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterSingleType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_27_1_matchtggpattern_blackBBB(MEntry mEntry,
			Type mType, MMethodSignature mSignature) {
		if (mType.equals(mEntry.getType())) {
			if (mSignature.getMEntrys().contains(mEntry)) {
				return new Object[] { mEntry, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterSingleType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterSingleType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_28_1_matchtggpattern_blackBBB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		if (tSiganture.getParameters().contains(tParameter)) {
			if (tAbstractType.equals(tParameter.getType())) {
				return new Object[] { tSiganture, tAbstractType, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterSingleType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterSingleType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_29_1_createresult_blackB(
			MethodParameterSingleType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterSingleType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tSiganture) {
		if (ruleResult.getTargetObjects().contains(tSiganture)) {
			return new Object[] { ruleResult, tSiganture };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTAbstractType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTAbstractType)) {
			return new Object[] { ruleResult, mTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterSingleType_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mSignatureToTSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTAbstractTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!mSignatureToTSignatureList.equals(mTypeToTAbstractTypeList)) {
					for (EObject tmpMSignatureToTSignature : mSignatureToTSignatureList.getEntryObjects()) {
						if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
							TSignature tmpTSiganture = mSignatureToTSignature.getTarget();
							if (tmpTSiganture instanceof TMethodSignature) {
								TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
								MSignature tmpMSignature = mSignatureToTSignature.getSource();
								if (tmpMSignature instanceof MMethodSignature) {
									MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
									if (pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, mSignatureToTSignature) == null) {
										if (pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, tSiganture) == null) {
											if (pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mSignature) == null) {
												for (EObject tmpMTypeToTAbstractType : mTypeToTAbstractTypeList
														.getEntryObjects()) {
													if (tmpMTypeToTAbstractType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) tmpMTypeToTAbstractType;
														Type mType = mTypeToTAbstractType.getSource();
														if (mType != null) {
															TAbstractType tAbstractType = mTypeToTAbstractType
																	.getTarget();
															if (tAbstractType != null) {
																if (pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, mTypeToTAbstractType) == null) {
																	if (pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, mType) == null) {
																		if (pattern_MethodParameterSingleType_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, tAbstractType) == null) {
																			_result.add(new Object[] {
																					mSignatureToTSignatureList,
																					tSiganture, mSignatureToTSignature,
																					mSignature,
																					mTypeToTAbstractTypeList,
																					mTypeToTAbstractType, mType,
																					tAbstractType, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_29_3_solveCSP_bindingFBBBBBBBBB(
			MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tSiganture, mTypeToTAbstractType,
				tAbstractType, mSignatureToTSignature, mType, mSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType,
					mSignatureToTSignature, mType, mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterSingleType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterSingleType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodParameterSingleType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameterSingleType_29_3_solveCSP_binding = pattern_MethodParameterSingleType_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType, mSignatureToTSignature,
				mType, mSignature, ruleResult);
		if (result_pattern_MethodParameterSingleType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterSingleType_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterSingleType_29_3_solveCSP_black = pattern_MethodParameterSingleType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterSingleType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSiganture, mTypeToTAbstractType, tAbstractType,
						mSignatureToTSignature, mType, mSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterSingleType_29_4_checkCSP_expressionFBB(
			MethodParameterSingleType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterSingleType_29_5_checknacs_blackBBBBBB(
			TMethodSignature tSiganture, TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, mSignatureToTSignature, mType,
				mSignature };
	}

	public static final Object[] pattern_MethodParameterSingleType_29_6_perform_blackBBBBBBB(
			TMethodSignature tSiganture, TypeToTAbstractType mTypeToTAbstractType, TAbstractType tAbstractType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tSiganture, mTypeToTAbstractType, tAbstractType, mSignatureToTSignature, mType,
				mSignature, ruleResult };
	}

	public static final Object[] pattern_MethodParameterSingleType_29_6_perform_greenBBFFFFBBB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		MEntry mEntry = ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mEntry.setType(mType);
		mSignature.getMEntrys().add(mEntry);
		ruleResult.getSourceObjects().add(mEntry);
		mEntryToTParameter.setSource(mEntry);
		ruleResult.getCorrObjects().add(mEntryToTParameter);
		mFlowElementToTFlowElement.setSource(mEntry);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		mEntryToTParameter.setTarget(tParameter);
		tSiganture.getParameters().add(tParameter);
		tParameter.setType(tAbstractType);
		mFlowElementToTFlowElement.setTarget(tParameter);
		ruleResult.getTargetObjects().add(tParameter);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tSiganture, tAbstractType, mEntry, mEntryToTParameter, mFlowElementToTFlowElement,
				tParameter, mType, mSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameterSingleType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterSingleTypeImpl
