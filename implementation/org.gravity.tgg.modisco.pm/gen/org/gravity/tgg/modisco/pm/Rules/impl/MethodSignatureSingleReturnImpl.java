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

import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MMethodNameToTMethod;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodSignatureSingleReturn;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;

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
 * An implementation of the model object '<em><b>Method Signature Single Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodSignatureSingleReturnImpl extends AbstractRuleImpl implements MethodSignatureSingleReturn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignatureSingleReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodSignatureSingleReturn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {

		Object[] result1_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_0_1_initialbindings_blackBBBBB(this, match, mName, mType,
						mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mName, mType,
						mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_0_4_collectelementstobetranslated_blackBBBB(match, mName,
							mType, mSignature);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mName] = " + mName
								+ ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_0_4_collectelementstobetranslated_greenBBBBFF(match, mName,
							mType, mSignature);
			//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_0_5_collectcontextelements_blackBBBB(match, mName, mType,
							mSignature);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mName] = " + mName
								+ ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_0_5_collectcontextelements_greenBBB(match, mName, mType);

			// 
			MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_0_6_registerobjectstomatch_expressionBBBBB(this, match, mName,
							mType, mSignature);
			return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_0_7_expressionF();
		} else {
			return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[1];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[2];
		TMethod tName = (TMethod) result1_bindingAndBlack[3];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_1_1_performtransformation_greenFBBFFB(tType, tName, mSignature);
		TMethodSignature tSignature = (TMethodSignature) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[4];

		Object[] result2_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_1_2_collecttranslatedelements_blackBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		Object[] result2_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_1_2_collecttranslatedelements_greenFBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, tSignature,
						mTypeToTType, tType, mNameToTName, tName, mFlowElementToTFlowElement, mName,
						mSignatureToTSignature, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSignature] = " + tSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ", " + "[mNameToTName] = " + mNameToTName + ", " + "[tName] = " + tName
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mName] = "
					+ mName + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = "
					+ mType + ", " + "[mSignature] = " + mSignature + ".");
		}
		MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
						tSignature, tType, tName, mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType,
						mSignature);
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_1_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, tSignature, mTypeToTType, tType, mNameToTName, tName, mFlowElementToTFlowElement,
				mName, mSignatureToTSignature, mType, mSignature);
		return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodName mName = (MMethodName) result2_binding[0];
		Type mType = (Type) result2_binding[1];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[2];
		for (Object[] result2_black : MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_2_2_corematch_blackFFFFBBBB(mName, mType, mSignature, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[2];
			TMethod tName = (TMethod) result2_black[3];
			// ForEach 
			for (Object[] result3_black : MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_2_3_findcontext_blackBBBBBBB(mTypeToTType, tType, mNameToTName,
							tName, mName, mType, mSignature)) {
				Object[] result3_green = MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_2_3_findcontext_greenBBBBBBBFFFFFFF(mTypeToTType, tType,
								mNameToTName, tName, mName, mType, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, mTypeToTType, tType, mNameToTName, tName, mName, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tType] = " + tType + ", " + "[mNameToTName] = " + mNameToTName + ", "
							+ "[tName] = " + tName + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", "
							+ "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodSignatureSingleReturnImpl
							.pattern_MethodSignatureSingleReturn_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodSignatureSingleReturnImpl
							.pattern_MethodSignatureSingleReturn_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {
		match.registerObject("mName", mName);
		match.registerObject("mType", mType);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, Type mType,
			MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mName", mName);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType,
			EObject tType, EObject mNameToTName, EObject tName, EObject mFlowElementToTFlowElement, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mName", mName);
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
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mSignature").eClass())
				.equals("modisco.MMethodSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMethodSignature tSignature, TAbstractType tType, TMethod tName) {

		Object[] result1_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_10_1_initialbindings_blackBBBBB(this, match, tSignature, tType,
						tName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
					+ "[tName] = " + tName + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSignature, tType,
						tName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
					+ "[tName] = " + tName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_10_4_collectelementstobetranslated_blackBBBB(match, tSignature,
							tType, tName);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tSignature] = "
								+ tSignature + ", " + "[tType] = " + tType + ", " + "[tName] = " + tName + ".");
			}
			MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							tSignature, tType, tName);
			//nothing EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result4_green[6];

			Object[] result5_black = MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_10_5_collectcontextelements_blackBBBB(match, tSignature, tType,
							tName);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tSignature] = "
								+ tSignature + ", " + "[tType] = " + tType + ", " + "[tName] = " + tName + ".");
			}
			MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_10_5_collectcontextelements_greenBBB(match, tType, tName);

			// 
			MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tSignature, tType, tName);
			return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_10_7_expressionF();
		} else {
			return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[3];
		TMethod tName = (TMethod) result1_bindingAndBlack[4];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[5];
		Type mType = (Type) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_11_1_performtransformation_greenBFBFBF(tSignature, mName, mType);
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[1];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[3];
		MMethodSignature mSignature = (MMethodSignature) result1_green[5];

		Object[] result2_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_11_2_collecttranslatedelements_blackBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		Object[] result2_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_11_2_collecttranslatedelements_greenFBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, tSignature,
						mTypeToTType, tType, mNameToTName, tName, mFlowElementToTFlowElement, mName,
						mSignatureToTSignature, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSignature] = " + tSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ", " + "[mNameToTName] = " + mNameToTName + ", " + "[tName] = " + tName
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mName] = "
					+ mName + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = "
					+ mType + ", " + "[mSignature] = " + mSignature + ".");
		}
		MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
						tSignature, tType, tName, mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType,
						mSignature);
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_11_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, tSignature, mTypeToTType, tType, mNameToTName, tName, mFlowElementToTFlowElement,
				mName, mSignatureToTSignature, mType, mSignature);
		return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result2_binding[0];
		TAbstractType tType = (TAbstractType) result2_binding[1];
		TMethod tName = (TMethod) result2_binding[2];
		for (Object[] result2_black : MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_12_2_corematch_blackBFBFBFFB(tSignature, tType, tName, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[3];
			MMethodName mName = (MMethodName) result2_black[5];
			Type mType = (Type) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_12_3_findcontext_blackBBBBBBB(tSignature, mTypeToTType, tType,
							mNameToTName, tName, mName, mType)) {
				Object[] result3_green = MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_12_3_findcontext_greenBBBBBBBFFFFFFFF(tSignature,
								mTypeToTType, tType, mNameToTName, tName, mName, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tSignature, mTypeToTType, tType, mNameToTName, tName, mName, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSignature] = " + tSignature
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType + ", "
							+ "[mNameToTName] = " + mNameToTName + ", " + "[tName] = " + tName + ", " + "[mName] = "
							+ mName + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodSignatureSingleReturnImpl
							.pattern_MethodSignatureSingleReturn_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodSignatureSingleReturnImpl
							.pattern_MethodSignatureSingleReturn_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("tType", tType);
		match.registerObject("tName", tName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMethodSignature tSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName,
			MMethodName mName, Type mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType,
			EObject tType, EObject mNameToTName, EObject tName, EObject mFlowElementToTFlowElement, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mName", mName);
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
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
				.equals("basic.TMethodSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_36(EMoflonEdge _edge_returnType) {

		Object[] result1_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_20_2_testcorematchandDECs_blackFFFB(_edge_returnType)) {
			TMethodSignature tSignature = (TMethodSignature) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			TMethod tName = (TMethod) result2_black[2];
			Object[] result2_green = MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tSignature, tType, tName)) {
				// 
				if (MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodSignatureSingleReturnImpl
							.pattern_MethodSignatureSingleReturn_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodSignatureSingleReturnImpl
							.pattern_MethodSignatureSingleReturn_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_38(EMoflonEdge _edge_mSignatures) {

		Object[] result1_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_21_2_testcorematchandDECs_blackFFFB(_edge_mSignatures)) {
			MMethodName mName = (MMethodName) result2_black[0];
			Type mType = (Type) result2_black[1];
			MMethodSignature mSignature = (MMethodSignature) result2_black[2];
			Object[] result2_green = MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mName, mType, mSignature)) {
				// 
				if (MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodSignatureSingleReturnImpl
							.pattern_MethodSignatureSingleReturn_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodSignatureSingleReturnImpl
							.pattern_MethodSignatureSingleReturn_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodSignatureSingleReturn");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tSignature", "upperBound", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

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
		ruleResult.setRule("MethodSignatureSingleReturn");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tSignature", "upperBound", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

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

		Object[] result1_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result2_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[1];
		TMethod tName = (TMethod) result2_bindingAndBlack[2];
		MMethodName mName = (MMethodName) result2_bindingAndBlack[3];
		Type mType = (Type) result2_bindingAndBlack[4];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tSignature, tType,
						tName, mName, mType, mSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[tName] = " + tName + ", "
					+ "[mName] = " + mName + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_24_5_matchcorrcontext_blackFBFBBBBB(tType, tName, mName, mType,
							sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result5_black[2];
				Object[] result5_green = MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_24_5_matchcorrcontext_greenBBBBF(mTypeToTType,
								mNameToTName, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_24_6_createcorrespondence_blackBBBBBBB(tSignature, tType,
								tName, mName, mType, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = "
							+ tSignature + ", " + "[tType] = " + tType + ", " + "[tName] = " + tName + ", "
							+ "[mName] = " + mName + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_24_6_createcorrespondence_greenBFFBB(tSignature,
								mSignature, ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
				//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[2];

				Object[] result7_black = MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMethodSignature tSignature, TAbstractType tType, TMethod tName,
			MMethodName mName, Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MMethodName mName, Type mType, MMethodSignature mSignature) {// 
		Object[] result1_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_27_1_matchtggpattern_blackBBB(mName, mType, mSignature);
		if (result1_black != null) {
			return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_27_2_expressionF();
		} else {
			return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tSignature, TAbstractType tType, TMethod tName) {// 
		Object[] result1_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_28_1_matchtggpattern_blackBBB(tSignature, tType, tName);
		if (result1_black != null) {
			MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_28_1_matchtggpattern_greenB(tSignature);

			return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_28_2_expressionF();
		} else {
			return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MMethodNameToTMethod mNameToTNameParameter) {

		Object[] result1_black = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodSignatureSingleReturnImpl
				.pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TAbstractType tType = (TAbstractType) result2_black[2];
			Type mType = (Type) result2_black[3];
			//nothing RuleEntryList mNameToTNameList = (RuleEntryList) result2_black[4];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[5];
			TMethod tName = (TMethod) result2_black[6];
			MMethodName mName = (MMethodName) result2_black[7];

			Object[] result3_bindingAndBlack = MethodSignatureSingleReturnImpl
					.pattern_MethodSignatureSingleReturn_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, mTypeToTType, tType, mNameToTName, tName, mName, mType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[tType] = " + tType + ", " + "[mNameToTName] = " + mNameToTName + ", " + "[tName] = "
						+ tName + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MethodSignatureSingleReturnImpl
						.pattern_MethodSignatureSingleReturn_29_5_checknacs_blackBBBBBB(mTypeToTType, tType,
								mNameToTName, tName, mName, mType);
				if (result5_black != null) {

					Object[] result6_black = MethodSignatureSingleReturnImpl
							.pattern_MethodSignatureSingleReturn_29_6_perform_blackBBBBBBB(mTypeToTType, tType,
									mNameToTName, tName, mName, mType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tType] = " + tType + ", " + "[mNameToTName] = " + mNameToTName
								+ ", " + "[tName] = " + tName + ", " + "[mName] = " + mName + ", " + "[mType] = "
								+ mType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_29_6_perform_greenFBBFBFBFB(
							tType, tName, mName, mType, ruleResult);
					//nothing TMethodSignature tSignature = (TMethodSignature) result6_green[0];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[3];
					//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[5];
					//nothing MMethodSignature mSignature = (MMethodSignature) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return MethodSignatureSingleReturnImpl.pattern_MethodSignatureSingleReturn_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, Type mType,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mType", mType);
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
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPROPRIATE_FWD__MATCH_MMETHODNAME_TYPE_MMETHODSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodName) arguments.get(1), (Type) arguments.get(2),
					(MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODNAME_TYPE_MMETHODSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodName) arguments.get(1),
					(Type) arguments.get(2), (MMethodSignature) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODNAME_TYPE_MMETHODSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodName) arguments.get(1),
					(Type) arguments.get(2), (MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MMETHODNAMETOTMETHOD_TMETHOD_MMETHODNAME_TYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(MMethodNameToTMethod) arguments.get(3), (TMethod) arguments.get(4), (MMethodName) arguments.get(5),
					(Type) arguments.get(6), (MMethodSignature) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TMethod) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TMethod) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TMethod) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MMETHODNAMETOTMETHOD_TMETHOD_MMETHODNAME_TYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TAbstractType) arguments.get(3),
					(MMethodNameToTMethod) arguments.get(4), (TMethod) arguments.get(5), (MMethodName) arguments.get(6),
					(Type) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_36__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_36((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPLICABLE_SOLVE_CSP_CC__TMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD_MMETHODNAME_TYPE_MMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethod) arguments.get(2), (MMethodName) arguments.get(3), (Type) arguments.get(4),
					(MMethodSignature) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___CHECK_DEC_FWD__MMETHODNAME_TYPE_MMETHODSIGNATURE:
			return checkDEC_FWD((MMethodName) arguments.get(0), (Type) arguments.get(1),
					(MMethodSignature) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___CHECK_DEC_BWD__TMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethod) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MMETHODNAMETOTMETHOD:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MMethodNameToTMethod) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MMETHODNAMETOTMETHOD_TMETHOD_MMETHODNAME_TYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(MMethodNameToTMethod) arguments.get(3), (TMethod) arguments.get(4), (MMethodName) arguments.get(5),
					(Type) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_0_1_initialbindings_blackBBBBB(
			MethodSignatureSingleReturn _this, Match match, MMethodName mName, Type mType,
			MMethodSignature mSignature) {
		return new Object[] { _this, match, mName, mType, mSignature };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_0_2_SolveCSP_bindingFBBBBB(
			MethodSignatureSingleReturn _this, Match match, MMethodName mName, Type mType,
			MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mName, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mName, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodSignatureSingleReturn _this, Match match, MMethodName mName, Type mType,
			MMethodSignature mSignature) {
		Object[] result_pattern_MethodSignatureSingleReturn_0_2_SolveCSP_binding = pattern_MethodSignatureSingleReturn_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mName, mType, mSignature);
		if (result_pattern_MethodSignatureSingleReturn_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureSingleReturn_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_0_2_SolveCSP_black = pattern_MethodSignatureSingleReturn_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureSingleReturn_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mName, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_0_3_CheckCSP_expressionFBB(
			MethodSignatureSingleReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_0_4_collectelementstobetranslated_blackBBBB(
			Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {
		return new Object[] { match, mName, mType, mSignature };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mSignature);
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mType____returnType_name_prime = "returnType";
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(mName__mSignature____mSignatures);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		match.getToBeTranslatedEdges().add(mSignature__mType____returnType);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		return new Object[] { match, mName, mType, mSignature, mName__mSignature____mSignatures,
				mSignature__mType____returnType };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_0_5_collectcontextelements_blackBBBB(Match match,
			MMethodName mName, Type mType, MMethodSignature mSignature) {
		return new Object[] { match, mName, mType, mSignature };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_0_5_collectcontextelements_greenBBB(Match match,
			MMethodName mName, Type mType) {
		match.getContextNodes().add(mName);
		match.getContextNodes().add(mType);
		return new Object[] { match, mName, mType };
	}

	public static final void pattern_MethodSignatureSingleReturn_0_6_registerobjectstomatch_expressionBBBBB(
			MethodSignatureSingleReturn _this, Match match, MMethodName mName, Type mType,
			MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mName, mType, mSignature);

	}

	public static final boolean pattern_MethodSignatureSingleReturn_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_3 = isApplicableMatch.getObject("tName");
		EObject _localVariable_4 = isApplicableMatch.getObject("mName");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignature");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMNameToTName = _localVariable_2;
		EObject tmpTName = _localVariable_3;
		EObject tmpMName = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpMSignature = _localVariable_6;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMNameToTName instanceof MMethodNameToTMethod) {
					MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
					if (tmpTName instanceof TMethod) {
						TMethod tName = (TMethod) tmpTName;
						if (tmpMName instanceof MMethodName) {
							MMethodName mName = (MMethodName) tmpMName;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpMSignature instanceof MMethodSignature) {
									MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
									return new Object[] { mTypeToTType, tType, mNameToTName, tName, mName, mType,
											mSignature, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_1_1_performtransformation_blackBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName,
			MMethodName mName, Type mType, MMethodSignature mSignature, MethodSignatureSingleReturn _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, tType, mNameToTName, tName, mName, mType, mSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodSignatureSingleReturn _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_binding = pattern_MethodSignatureSingleReturn_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_binding[1];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_binding[2];
			TMethod tName = (TMethod) result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_binding[3];
			MMethodName mName = (MMethodName) result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_binding[5];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_binding[6];

			Object[] result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_black = pattern_MethodSignatureSingleReturn_1_1_performtransformation_blackBBBBBBBFBB(
					mTypeToTType, tType, mNameToTName, tName, mName, mType, mSignature, _this, isApplicableMatch);
			if (result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignatureSingleReturn_1_1_performtransformation_black[7];

				return new Object[] { mTypeToTType, tType, mNameToTName, tName, mName, mType, mSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_1_1_performtransformation_greenFBBFFB(
			TAbstractType tType, TMethod tName, MMethodSignature mSignature) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		int tSignature_upperBound_prime = Integer.valueOf(1);
		tSignature.setReturnType(tType);
		tName.getSignatures().add(tSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		return new Object[] { tSignature, tType, tName, mFlowElementToTFlowElement, mSignatureToTSignature,
				mSignature };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_1_2_collecttranslatedelements_blackBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_1_2_collecttranslatedelements_greenFBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getTranslatedElements().add(mSignature);
		return new Object[] { ruleresult, tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType, EObject tType, EObject mNameToTName,
			EObject tName, EObject mFlowElementToTFlowElement, EObject mName, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		if (!tSignature.equals(tType)) {
			if (!mTypeToTType.equals(tSignature)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mTypeToTType.equals(tName)) {
						if (!mNameToTName.equals(tSignature)) {
							if (!mNameToTName.equals(mTypeToTType)) {
								if (!mNameToTName.equals(tType)) {
									if (!mNameToTName.equals(tName)) {
										if (!mNameToTName.equals(mSignatureToTSignature)) {
											if (!mNameToTName.equals(mType)) {
												if (!mNameToTName.equals(mSignature)) {
													if (!tName.equals(tSignature)) {
														if (!tName.equals(tType)) {
															if (!mFlowElementToTFlowElement.equals(tSignature)) {
																if (!mFlowElementToTFlowElement.equals(mTypeToTType)) {
																	if (!mFlowElementToTFlowElement.equals(tType)) {
																		if (!mFlowElementToTFlowElement
																				.equals(mNameToTName)) {
																			if (!mFlowElementToTFlowElement
																					.equals(tName)) {
																				if (!mFlowElementToTFlowElement
																						.equals(mName)) {
																					if (!mFlowElementToTFlowElement
																							.equals(mSignatureToTSignature)) {
																						if (!mFlowElementToTFlowElement
																								.equals(mType)) {
																							if (!mFlowElementToTFlowElement
																									.equals(mSignature)) {
																								if (!mName.equals(
																										tSignature)) {
																									if (!mName.equals(
																											mTypeToTType)) {
																										if (!mName
																												.equals(tType)) {
																											if (!mName
																													.equals(mNameToTName)) {
																												if (!mName
																														.equals(tName)) {
																													if (!mName
																															.equals(mSignatureToTSignature)) {
																														if (!mName
																																.equals(mType)) {
																															if (!mName
																																	.equals(mSignature)) {
																																if (!mSignatureToTSignature
																																		.equals(tSignature)) {
																																	if (!mSignatureToTSignature
																																			.equals(mTypeToTType)) {
																																		if (!mSignatureToTSignature
																																				.equals(tType)) {
																																			if (!mSignatureToTSignature
																																					.equals(tName)) {
																																				if (!mSignatureToTSignature
																																						.equals(mType)) {
																																					if (!mType
																																							.equals(tSignature)) {
																																						if (!mType
																																								.equals(mTypeToTType)) {
																																							if (!mType
																																									.equals(tType)) {
																																								if (!mType
																																										.equals(tName)) {
																																									if (!mSignature
																																											.equals(tSignature)) {
																																										if (!mSignature
																																												.equals(mTypeToTType)) {
																																											if (!mSignature
																																													.equals(tType)) {
																																												if (!mSignature
																																														.equals(tName)) {
																																													if (!mSignature
																																															.equals(mSignatureToTSignature)) {
																																														if (!mSignature
																																																.equals(mType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tSignature,
																																																	mTypeToTType,
																																																	tType,
																																																	mNameToTName,
																																																	tName,
																																																	mFlowElementToTFlowElement,
																																																	mName,
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

	public static final Object[] pattern_MethodSignatureSingleReturn_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mName, EObject mSignatureToTSignature, EObject mType,
			EObject mSignature) {
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignatureSingleReturn";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tSignature__tType____returnType_name_prime = "returnType";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mSignature__mType____returnType_name_prime = "returnType";
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		ruleresult.getCreatedEdges().add(tSignature__tType____returnType);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____method);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mName__mSignature____mSignatures);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mSignature__mType____returnType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		return new Object[] { ruleresult, tSignature, tType, tName, mFlowElementToTFlowElement, mName,
				mSignatureToTSignature, mType, mSignature, mSignatureToTSignature__mSignature____source,
				tSignature__tType____returnType, tName__tSignature____signatures, tSignature__tName____method,
				mFlowElementToTFlowElement__tSignature____target, mName__mSignature____mSignatures,
				mSignatureToTSignature__tSignature____target, mFlowElementToTFlowElement__mSignature____source,
				mSignature__mType____returnType };
	}

	public static final void pattern_MethodSignatureSingleReturn_1_5_registerobjects_expressionBBBBBBBBBBBB(
			MethodSignatureSingleReturn _this, PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType,
			EObject tType, EObject mNameToTName, EObject tName, EObject mFlowElementToTFlowElement, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, tSignature, mTypeToTType, tType, mNameToTName, tName,
				mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodSignatureSingleReturn_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_bindingFB(
			MethodSignatureSingleReturn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignatureSingleReturn _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignatureSingleReturn _this) {
		Object[] result_pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_binding = pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_black = pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodSignatureSingleReturn";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mName");
		EObject _localVariable_1 = match.getObject("mType");
		EObject _localVariable_2 = match.getObject("mSignature");
		EObject tmpMName = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		if (tmpMName instanceof MMethodName) {
			MMethodName mName = (MMethodName) tmpMName;
			if (tmpMType instanceof Type) {
				Type mType = (Type) tmpMType;
				if (tmpMSignature instanceof MMethodSignature) {
					MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
					return new Object[] { mName, mType, mSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureSingleReturn_2_2_corematch_blackFFFFBBBB(
			MMethodName mName, Type mType, MMethodSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
			TMethod tName = mNameToTName.getTarget();
			if (tName != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tType = mTypeToTType.getTarget();
					if (tType != null) {
						_result.add(new Object[] { mTypeToTType, tType, mNameToTName, tName, mName, mType, mSignature,
								match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureSingleReturn_2_3_findcontext_blackBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName,
			MMethodName mName, Type mType, MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mName.equals(mNameToTName.getSource())) {
			if (tType.equals(mTypeToTType.getTarget())) {
				if (mName.getMSignatures().contains(mSignature)) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (mType.equals(mSignature.getReturnType())) {
							if (tName.equals(mNameToTName.getTarget())) {
								_result.add(new Object[] { mTypeToTType, tType, mNameToTName, tName, mName, mType,
										mSignature });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_3_findcontext_greenBBBBBBBFFFFFFF(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName,
			MMethodName mName, Type mType, MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mNameToTName__mName____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mTypeToTType__mType____source_name_prime = "source";
		String mSignature__mType____returnType_name_prime = "returnType";
		String mNameToTName__tName____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mName__mSignature____mSignatures);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mSignature__mType____returnType);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		return new Object[] { mTypeToTType, tType, mNameToTName, tName, mName, mType, mSignature, isApplicableMatch,
				mNameToTName__mName____source, mTypeToTType__tType____target, mName__mSignature____mSignatures,
				mTypeToTType__mType____source, mSignature__mType____returnType, mNameToTName__tName____target };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_4_solveCSP_bindingFBBBBBBBBB(
			MethodSignatureSingleReturn _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, Type mType,
			MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToTType, tType, mNameToTName,
				tName, mName, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mNameToTName, tName, mName, mType,
					mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodSignatureSingleReturn _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, Type mType,
			MMethodSignature mSignature) {
		Object[] result_pattern_MethodSignatureSingleReturn_2_4_solveCSP_binding = pattern_MethodSignatureSingleReturn_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mNameToTName, tName, mName, mType, mSignature);
		if (result_pattern_MethodSignatureSingleReturn_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureSingleReturn_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_2_4_solveCSP_black = pattern_MethodSignatureSingleReturn_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureSingleReturn_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mNameToTName, tName, mName,
						mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_2_5_checkCSP_expressionFBB(
			MethodSignatureSingleReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignatureSingleReturn";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureSingleReturn_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_10_1_initialbindings_blackBBBBB(
			MethodSignatureSingleReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		return new Object[] { _this, match, tSignature, tType, tName };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_10_2_SolveCSP_bindingFBBBBB(
			MethodSignatureSingleReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tType, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tType, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodSignatureSingleReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		Object[] result_pattern_MethodSignatureSingleReturn_10_2_SolveCSP_binding = pattern_MethodSignatureSingleReturn_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSignature, tType, tName);
		if (result_pattern_MethodSignatureSingleReturn_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureSingleReturn_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_10_2_SolveCSP_black = pattern_MethodSignatureSingleReturn_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureSingleReturn_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tType, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_10_3_CheckCSP_expressionFBB(
			MethodSignatureSingleReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TMethodSignature tSignature, TAbstractType tType, TMethod tName) {
		return new Object[] { match, tSignature, tType, tName };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TMethodSignature tSignature, TAbstractType tType, TMethod tName) {
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		String tSignature__tType____returnType_name_prime = "returnType";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		match.getToBeTranslatedEdges().add(tSignature__tType____returnType);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____method);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		return new Object[] { match, tSignature, tType, tName, tSignature__tType____returnType,
				tName__tSignature____signatures, tSignature__tName____method };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_10_5_collectcontextelements_blackBBBB(Match match,
			TMethodSignature tSignature, TAbstractType tType, TMethod tName) {
		return new Object[] { match, tSignature, tType, tName };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tType, TMethod tName) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tName);
		return new Object[] { match, tType, tName };
	}

	public static final void pattern_MethodSignatureSingleReturn_10_6_registerobjectstomatch_expressionBBBBB(
			MethodSignatureSingleReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tType, tName);

	}

	public static final boolean pattern_MethodSignatureSingleReturn_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_4 = isApplicableMatch.getObject("tName");
		EObject _localVariable_5 = isApplicableMatch.getObject("mName");
		EObject _localVariable_6 = isApplicableMatch.getObject("mType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMNameToTName = _localVariable_3;
		EObject tmpTName = _localVariable_4;
		EObject tmpMName = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMNameToTName instanceof MMethodNameToTMethod) {
						MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
						if (tmpTName instanceof TMethod) {
							TMethod tName = (TMethod) tmpTName;
							if (tmpMName instanceof MMethodName) {
								MMethodName mName = (MMethodName) tmpMName;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									return new Object[] { tSignature, mTypeToTType, tType, mNameToTName, tName, mName,
											mType, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_11_1_performtransformation_blackBBBBBBBFBB(
			TMethodSignature tSignature, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, Type mType,
			MethodSignatureSingleReturn _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tSignature, mTypeToTType, tType, mNameToTName, tName, mName, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodSignatureSingleReturn _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_binding = pattern_MethodSignatureSingleReturn_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_binding != null) {
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_binding[2];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_binding[3];
			TMethod tName = (TMethod) result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_binding[4];
			MMethodName mName = (MMethodName) result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_binding[5];
			Type mType = (Type) result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_black = pattern_MethodSignatureSingleReturn_11_1_performtransformation_blackBBBBBBBFBB(
					tSignature, mTypeToTType, tType, mNameToTName, tName, mName, mType, _this, isApplicableMatch);
			if (result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignatureSingleReturn_11_1_performtransformation_black[7];

				return new Object[] { tSignature, mTypeToTType, tType, mNameToTName, tName, mName, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_11_1_performtransformation_greenBFBFBF(
			TMethodSignature tSignature, MMethodName mName, Type mType) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MMethodSignature mSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
		mFlowElementToTFlowElement.setTarget(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		mName.getMSignatures().add(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mSignature.setReturnType(mType);
		return new Object[] { tSignature, mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType,
				mSignature };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_11_2_collecttranslatedelements_blackBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_11_2_collecttranslatedelements_greenFBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getCreatedElements().add(mSignature);
		return new Object[] { ruleresult, tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType, EObject tType, EObject mNameToTName,
			EObject tName, EObject mFlowElementToTFlowElement, EObject mName, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		if (!tSignature.equals(tType)) {
			if (!mTypeToTType.equals(tSignature)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mTypeToTType.equals(tName)) {
						if (!mNameToTName.equals(tSignature)) {
							if (!mNameToTName.equals(mTypeToTType)) {
								if (!mNameToTName.equals(tType)) {
									if (!mNameToTName.equals(tName)) {
										if (!mNameToTName.equals(mSignatureToTSignature)) {
											if (!mNameToTName.equals(mType)) {
												if (!mNameToTName.equals(mSignature)) {
													if (!tName.equals(tSignature)) {
														if (!tName.equals(tType)) {
															if (!mFlowElementToTFlowElement.equals(tSignature)) {
																if (!mFlowElementToTFlowElement.equals(mTypeToTType)) {
																	if (!mFlowElementToTFlowElement.equals(tType)) {
																		if (!mFlowElementToTFlowElement
																				.equals(mNameToTName)) {
																			if (!mFlowElementToTFlowElement
																					.equals(tName)) {
																				if (!mFlowElementToTFlowElement
																						.equals(mName)) {
																					if (!mFlowElementToTFlowElement
																							.equals(mSignatureToTSignature)) {
																						if (!mFlowElementToTFlowElement
																								.equals(mType)) {
																							if (!mFlowElementToTFlowElement
																									.equals(mSignature)) {
																								if (!mName.equals(
																										tSignature)) {
																									if (!mName.equals(
																											mTypeToTType)) {
																										if (!mName
																												.equals(tType)) {
																											if (!mName
																													.equals(mNameToTName)) {
																												if (!mName
																														.equals(tName)) {
																													if (!mName
																															.equals(mSignatureToTSignature)) {
																														if (!mName
																																.equals(mType)) {
																															if (!mName
																																	.equals(mSignature)) {
																																if (!mSignatureToTSignature
																																		.equals(tSignature)) {
																																	if (!mSignatureToTSignature
																																			.equals(mTypeToTType)) {
																																		if (!mSignatureToTSignature
																																				.equals(tType)) {
																																			if (!mSignatureToTSignature
																																					.equals(tName)) {
																																				if (!mSignatureToTSignature
																																						.equals(mType)) {
																																					if (!mType
																																							.equals(tSignature)) {
																																						if (!mType
																																								.equals(mTypeToTType)) {
																																							if (!mType
																																									.equals(tType)) {
																																								if (!mType
																																										.equals(tName)) {
																																									if (!mSignature
																																											.equals(tSignature)) {
																																										if (!mSignature
																																												.equals(mTypeToTType)) {
																																											if (!mSignature
																																													.equals(tType)) {
																																												if (!mSignature
																																														.equals(tName)) {
																																													if (!mSignature
																																															.equals(mSignatureToTSignature)) {
																																														if (!mSignature
																																																.equals(mType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tSignature,
																																																	mTypeToTType,
																																																	tType,
																																																	mNameToTName,
																																																	tName,
																																																	mFlowElementToTFlowElement,
																																																	mName,
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

	public static final Object[] pattern_MethodSignatureSingleReturn_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mName, EObject mSignatureToTSignature, EObject mType,
			EObject mSignature) {
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignatureSingleReturn";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tSignature__tType____returnType_name_prime = "returnType";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mSignature__mType____returnType_name_prime = "returnType";
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tSignature__tType____returnType);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____method);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mName__mSignature____mSignatures);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getCreatedEdges().add(mSignature__mType____returnType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		return new Object[] { ruleresult, tSignature, tType, tName, mFlowElementToTFlowElement, mName,
				mSignatureToTSignature, mType, mSignature, mSignatureToTSignature__mSignature____source,
				tSignature__tType____returnType, tName__tSignature____signatures, tSignature__tName____method,
				mFlowElementToTFlowElement__tSignature____target, mName__mSignature____mSignatures,
				mSignatureToTSignature__tSignature____target, mFlowElementToTFlowElement__mSignature____source,
				mSignature__mType____returnType };
	}

	public static final void pattern_MethodSignatureSingleReturn_11_5_registerobjects_expressionBBBBBBBBBBBB(
			MethodSignatureSingleReturn _this, PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType,
			EObject tType, EObject mNameToTName, EObject tName, EObject mFlowElementToTFlowElement, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, tSignature, mTypeToTType, tType, mNameToTName, tName,
				mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodSignatureSingleReturn_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_bindingFB(
			MethodSignatureSingleReturn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignatureSingleReturn _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignatureSingleReturn _this) {
		Object[] result_pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_binding = pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_black = pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodSignatureSingleReturn";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("tType");
		EObject _localVariable_2 = match.getObject("tName");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpTName instanceof TMethod) {
					TMethod tName = (TMethod) tmpTName;
					return new Object[] { tSignature, tType, tName, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureSingleReturn_12_2_corematch_blackBFBFBFFB(
			TMethodSignature tSignature, TAbstractType tType, TMethod tName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tSignature_lowerBound = tSignature.getLowerBound();
		if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
			int tSignature_upperBound = tSignature.getUpperBound();
			if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(1))) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
					Type mType = mTypeToTType.getSource();
					if (mType != null) {
						for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tName, MMethodNameToTMethod.class, "target")) {
							MMethodName mName = mNameToTName.getSource();
							if (mName != null) {
								_result.add(new Object[] { tSignature, mTypeToTType, tType, mNameToTName, tName, mName,
										mType, match });
							}

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureSingleReturn_12_3_findcontext_blackBBBBBBB(
			TMethodSignature tSignature, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, Type mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mName.equals(mNameToTName.getSource())) {
			if (tType.equals(tSignature.getReturnType())) {
				if (tType.equals(mTypeToTType.getTarget())) {
					if (tName.getSignatures().contains(tSignature)) {
						if (mType.equals(mTypeToTType.getSource())) {
							if (tName.equals(mNameToTName.getTarget())) {
								int tSignature_lowerBound = tSignature.getLowerBound();
								if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
									int tSignature_upperBound = tSignature.getUpperBound();
									if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(1))) {
										_result.add(new Object[] { tSignature, mTypeToTType, tType, mNameToTName, tName,
												mName, mType });
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

	public static final Object[] pattern_MethodSignatureSingleReturn_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			TMethodSignature tSignature, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, Type mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mNameToTName__mName____source_name_prime = "source";
		String tSignature__tType____returnType_name_prime = "returnType";
		String mTypeToTType__tType____target_name_prime = "target";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mTypeToTType__mType____source_name_prime = "source";
		String mNameToTName__tName____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mType);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tSignature__tType____returnType);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____method);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		return new Object[] { tSignature, mTypeToTType, tType, mNameToTName, tName, mName, mType, isApplicableMatch,
				mNameToTName__mName____source, tSignature__tType____returnType, mTypeToTType__tType____target,
				tName__tSignature____signatures, tSignature__tName____method, mTypeToTType__mType____source,
				mNameToTName__tName____target };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_4_solveCSP_bindingFBBBBBBBBB(
			MethodSignatureSingleReturn _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName,
			MMethodName mName, Type mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tSignature, mTypeToTType, tType,
				mNameToTName, tName, mName, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSignature, mTypeToTType, tType, mNameToTName, tName,
					mName, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodSignatureSingleReturn _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName,
			MMethodName mName, Type mType) {
		Object[] result_pattern_MethodSignatureSingleReturn_12_4_solveCSP_binding = pattern_MethodSignatureSingleReturn_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tSignature, mTypeToTType, tType, mNameToTName, tName, mName, mType);
		if (result_pattern_MethodSignatureSingleReturn_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureSingleReturn_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_12_4_solveCSP_black = pattern_MethodSignatureSingleReturn_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureSingleReturn_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSignature, mTypeToTType, tType, mNameToTName,
						tName, mName, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_12_5_checkCSP_expressionFBB(
			MethodSignatureSingleReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignatureSingleReturn";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureSingleReturn_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_bindingFB(
			MethodSignatureSingleReturn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignatureSingleReturn _this) {
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

	public static final Object[] pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignatureSingleReturn _this) {
		Object[] result_pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_binding = pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_black = pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_20_2_testcorematchandDECs_black_nac_0BB(
			TMethodSignature tSignature, TMethod tName) {
		TMethod __DEC_tSignature_method_303414 = tSignature.getMethod();
		if (__DEC_tSignature_method_303414 != null) {
			if (!tName.equals(__DEC_tSignature_method_303414)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureSingleReturn_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSignature = _edge_returnType.getSrc();
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			EObject tmpTType = _edge_returnType.getTrg();
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tType.equals(tSignature.getReturnType())) {
					TMethod tName = tSignature.getMethod();
					if (tName != null) {
						int tSignature_lowerBound = tSignature.getLowerBound();
						if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
							int tSignature_upperBound = tSignature.getUpperBound();
							if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(1))) {
								if (pattern_MethodSignatureSingleReturn_20_2_testcorematchandDECs_black_nac_0BB(
										tSignature, tName) == null) {
									_result.add(new Object[] { tSignature, tType, tName, _edge_returnType });
								}
							}

						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureSingleReturn_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodSignatureSingleReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tType, tName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignatureSingleReturn _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignatureSingleReturn_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_bindingFB(
			MethodSignatureSingleReturn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignatureSingleReturn _this) {
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

	public static final Object[] pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignatureSingleReturn _this) {
		Object[] result_pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_binding = pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_black = pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignatureSingleReturn_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mSignatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMName = _edge_mSignatures.getSrc();
		if (tmpMName instanceof MMethodName) {
			MMethodName mName = (MMethodName) tmpMName;
			EObject tmpMSignature = _edge_mSignatures.getTrg();
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				if (mName.getMSignatures().contains(mSignature)) {
					Type mType = mSignature.getReturnType();
					if (mType != null) {
						_result.add(new Object[] { mName, mType, mSignature, _edge_mSignatures });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureSingleReturn_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodSignatureSingleReturn _this, Match match, MMethodName mName, Type mType,
			MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mName, mType, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignatureSingleReturn _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignatureSingleReturn_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_1_prepare_blackB(
			MethodSignatureSingleReturn _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tSignature");
		EObject _localVariable_1 = targetMatch.getObject("tType");
		EObject _localVariable_2 = targetMatch.getObject("tName");
		EObject _localVariable_3 = sourceMatch.getObject("mName");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject _localVariable_5 = sourceMatch.getObject("mSignature");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpMName = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpTName instanceof TMethod) {
					TMethod tName = (TMethod) tmpTName;
					if (tmpMName instanceof MMethodName) {
						MMethodName mName = (MMethodName) tmpMName;
						if (tmpMType instanceof Type) {
							Type mType = (Type) tmpMType;
							if (tmpMSignature instanceof MMethodSignature) {
								MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
								return new Object[] { tSignature, tType, tName, mName, mType, mSignature, targetMatch,
										sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_blackBBBBBBBB(
			TMethodSignature tSignature, TAbstractType tType, TMethod tName, MMethodName mName, Type mType,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				int tSignature_upperBound = tSignature.getUpperBound();
				if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(1))) {
					return new Object[] { tSignature, tType, tName, mName, mType, mSignature, sourceMatch,
							targetMatch };
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_binding = pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_binding != null) {
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_binding[1];
			TMethod tName = (TMethod) result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_binding[2];
			MMethodName mName = (MMethodName) result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_binding[3];
			Type mType = (Type) result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_binding[4];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_black = pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tSignature, tType, tName, mName, mType, mSignature, sourceMatch, targetMatch);
			if (result_pattern_MethodSignatureSingleReturn_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tSignature, tType, tName, mName, mType, mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_3_solvecsp_bindingFBBBBBBBBB(
			MethodSignatureSingleReturn _this, TMethodSignature tSignature, TAbstractType tType, TMethod tName,
			MMethodName mName, Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tSignature, tType, tName, mName, mType, mSignature,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tSignature, tType, tName, mName, mType, mSignature, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			MethodSignatureSingleReturn _this, TMethodSignature tSignature, TAbstractType tType, TMethod tName,
			MMethodName mName, Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignatureSingleReturn_24_3_solvecsp_binding = pattern_MethodSignatureSingleReturn_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tSignature, tType, tName, mName, mType, mSignature, sourceMatch, targetMatch);
		if (result_pattern_MethodSignatureSingleReturn_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureSingleReturn_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_24_3_solvecsp_black = pattern_MethodSignatureSingleReturn_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodSignatureSingleReturn_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tSignature, tType, tName, mName, mType, mSignature, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureSingleReturn_24_5_matchcorrcontext_blackFBFBBBBB(
			TAbstractType tType, TMethod tName, MMethodName mName, Type mType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
				if (tName.equals(mNameToTName.getTarget())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
						if (mType.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { mTypeToTType, tType, mNameToTName, tName, mName, mType,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MMethodNameToTMethod mNameToTName, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodSignatureSingleReturn";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mNameToTName);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mNameToTName, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_6_createcorrespondence_blackBBBBBBB(
			TMethodSignature tSignature, TAbstractType tType, TMethod tName, MMethodName mName, Type mType,
			MMethodSignature mSignature, CCMatch ccMatch) {
		return new Object[] { tSignature, tType, tName, mName, mType, mSignature, ccMatch };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_6_createcorrespondence_greenBFFBB(
			TMethodSignature tSignature, MMethodSignature mSignature, CCMatch ccMatch) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		mFlowElementToTFlowElement.setTarget(tSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		ccMatch.getCreateCorr().add(mSignatureToTSignature);
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature, ccMatch };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodSignatureSingleReturn";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureSingleReturn_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_27_1_matchtggpattern_blackBBB(MMethodName mName,
			Type mType, MMethodSignature mSignature) {
		if (mName.getMSignatures().contains(mSignature)) {
			if (mType.equals(mSignature.getReturnType())) {
				return new Object[] { mName, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_28_1_matchtggpattern_black_nac_0BB(
			TMethodSignature tSignature, TMethod tName) {
		TMethod __DEC_tSignature_method_558899 = tSignature.getMethod();
		if (__DEC_tSignature_method_558899 != null) {
			if (!tName.equals(__DEC_tSignature_method_558899)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_28_1_matchtggpattern_blackBBB(
			TMethodSignature tSignature, TAbstractType tType, TMethod tName) {
		if (tType.equals(tSignature.getReturnType())) {
			if (tName.getSignatures().contains(tSignature)) {
				if (pattern_MethodSignatureSingleReturn_28_1_matchtggpattern_black_nac_0BB(tSignature, tName) == null) {
					return new Object[] { tSignature, tType, tName };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_28_1_matchtggpattern_greenB(
			TMethodSignature tSignature) {
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		int tSignature_upperBound_prime = Integer.valueOf(1);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		return new Object[] { tSignature };
	}

	public static final boolean pattern_MethodSignatureSingleReturn_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_1_createresult_blackB(
			MethodSignatureSingleReturn _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MMethodNameToTMethod mNameToTName) {
		if (ruleResult.getCorrObjects().contains(mNameToTName)) {
			return new Object[] { ruleResult, mNameToTName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TMethod tName) {
		if (ruleResult.getTargetObjects().contains(tName)) {
			return new Object[] { ruleResult, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MMethodName mName) {
		if (ruleResult.getSourceObjects().contains(mName)) {
			return new Object[] { ruleResult, mName };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mNameToTNameList : ruleEntryContainer.getRuleEntryList()) {
				if (!mNameToTNameList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							TAbstractType tType = mTypeToTType.getTarget();
							if (tType != null) {
								Type mType = mTypeToTType.getSource();
								if (mType != null) {
									if (pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, mTypeToTType) == null) {
										if (pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, tType) == null) {
											if (pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mType) == null) {
												for (EObject tmpMNameToTName : mNameToTNameList.getEntryObjects()) {
													if (tmpMNameToTName instanceof MMethodNameToTMethod) {
														MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
														TMethod tName = mNameToTName.getTarget();
														if (tName != null) {
															MMethodName mName = mNameToTName.getSource();
															if (mName != null) {
																if (pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, mNameToTName) == null) {
																	if (pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, tName) == null) {
																		if (pattern_MethodSignatureSingleReturn_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mName) == null) {
																			_result.add(new Object[] { mTypeToTTypeList,
																					mTypeToTType, tType, mType,
																					mNameToTNameList, mNameToTName,
																					tName, mName, ruleEntryContainer,
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

	public static final Object[] pattern_MethodSignatureSingleReturn_29_3_solveCSP_bindingFBBBBBBBBB(
			MethodSignatureSingleReturn _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, Type mType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, tType, mNameToTName,
				tName, mName, mType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mNameToTName, tName, mName, mType,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodSignatureSingleReturn _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, Type mType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodSignatureSingleReturn_29_3_solveCSP_binding = pattern_MethodSignatureSingleReturn_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mNameToTName, tName, mName, mType, ruleResult);
		if (result_pattern_MethodSignatureSingleReturn_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureSingleReturn_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodSignatureSingleReturn_29_3_solveCSP_black = pattern_MethodSignatureSingleReturn_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureSingleReturn_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mNameToTName, tName, mName,
						mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureSingleReturn_29_4_checkCSP_expressionFBB(
			MethodSignatureSingleReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_5_checknacs_blackBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName,
			MMethodName mName, Type mType) {
		return new Object[] { mTypeToTType, tType, mNameToTName, tName, mName, mType };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_6_perform_blackBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MMethodNameToTMethod mNameToTName, TMethod tName,
			MMethodName mName, Type mType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mTypeToTType, tType, mNameToTName, tName, mName, mType, ruleResult };
	}

	public static final Object[] pattern_MethodSignatureSingleReturn_29_6_perform_greenFBBFBFBFB(TAbstractType tType,
			TMethod tName, MMethodName mName, Type mType, ModelgeneratorRuleResult ruleResult) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MMethodSignature mSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		int tSignature_upperBound_prime = Integer.valueOf(1);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		tSignature.setReturnType(tType);
		tName.getSignatures().add(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		mSignatureToTSignature.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mSignatureToTSignature);
		mSignatureToTSignature.setSource(mSignature);
		mName.getMSignatures().add(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mSignature.setReturnType(mType);
		ruleResult.getSourceObjects().add(mSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tSignature, tType, tName, mFlowElementToTFlowElement, mName, mSignatureToTSignature,
				mType, mSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodSignatureSingleReturn_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodSignatureSingleReturnImpl
