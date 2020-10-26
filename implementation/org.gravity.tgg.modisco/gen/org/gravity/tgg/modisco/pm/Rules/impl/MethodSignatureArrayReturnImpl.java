/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MMethodNameToTMethod;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodSignatureArrayReturn;
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
 * An implementation of the model object '<em><b>Method Signature Array Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodSignatureArrayReturnImpl extends AbstractRuleImpl implements MethodSignatureArrayReturn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignatureArrayReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodSignatureArrayReturn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType, MMethodSignature mSignature) {

		Object[] result1_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_0_1_initialbindings_blackBBBBBBB(this, match, mTypeOfArray,
						mTypeAccess, mName, mType, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
					+ mSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, mTypeOfArray,
						mTypeAccess, mName, mType, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
					+ mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_0_4_collectelementstobetranslated_blackBBBBBB(match,
							mTypeOfArray, mTypeAccess, mName, mType, mSignature);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mTypeOfArray] = "
								+ mTypeOfArray + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mName] = " + mName
								+ ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_0_4_collectelementstobetranslated_greenBBBBFF(match, mName,
							mType, mSignature);
			//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_0_5_collectcontextelements_blackBBBBBB(match, mTypeOfArray,
							mTypeAccess, mName, mType, mSignature);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mTypeOfArray] = "
								+ mTypeOfArray + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mName] = " + mName
								+ ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_0_5_collectcontextelements_greenBBBBBFFF(
					match, mTypeOfArray, mTypeAccess, mName, mType);
			//nothing EMoflonEdge mTypeAccess__mTypeOfArray____type = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mTypeOfArray__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge mType__mTypeAccess____elementType = (EMoflonEdge) result5_green[7];

			// 
			MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
							mTypeOfArray, mTypeAccess, mName, mType, mSignature);
			return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_0_7_expressionF();
		} else {
			return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[1];
		Type mTypeOfArray = (Type) result1_bindingAndBlack[2];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[3];
		TMethod tName = (TMethod) result1_bindingAndBlack[4];
		TypeAccess mTypeAccess = (TypeAccess) result1_bindingAndBlack[5];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[6];
		ArrayType mType = (ArrayType) result1_bindingAndBlack[7];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_1_1_performtransformation_greenFBBFFB(tType, tName, mSignature);
		TMethodSignature tSignature = (TMethodSignature) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[4];

		Object[] result2_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_1_2_collecttranslatedelements_blackBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		Object[] result2_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_1_2_collecttranslatedelements_greenFBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, tSignature,
						mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mFlowElementToTFlowElement, mTypeAccess,
						mName, mSignatureToTSignature, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSignature] = " + tSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ", " + "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mNameToTName] = "
					+ mNameToTName + ", " + "[tName] = " + tName + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mName] = " + mName
					+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
						tSignature, tType, tName, mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType,
						mSignature);
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
				this, ruleresult, tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
				mFlowElementToTFlowElement, mTypeAccess, mName, mSignatureToTSignature, mType, mSignature);
		return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Type mTypeOfArray = (Type) result2_binding[0];
		TypeAccess mTypeAccess = (TypeAccess) result2_binding[1];
		MMethodName mName = (MMethodName) result2_binding[2];
		ArrayType mType = (ArrayType) result2_binding[3];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[4];
		for (Object[] result2_black : MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_2_2_corematch_blackFFBFFBBBBB(mTypeOfArray, mTypeAccess, mName,
						mType, mSignature, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[3];
			TMethod tName = (TMethod) result2_black[4];
			// ForEach 
			for (Object[] result3_black : MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_2_3_findcontext_blackBBBBBBBBB(mTypeToTType, tType,
							mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType, mSignature)) {
				Object[] result3_green = MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFF(mTypeToTType,
								tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mTypeAccess__mTypeOfArray____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeOfArray__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mTypeToTType__mTypeOfArray____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mType__mTypeAccess____elementType = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess,
								mName, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tType] = " + tType + ", " + "[mTypeOfArray] = " + mTypeOfArray + ", "
							+ "[mNameToTName] = " + mNameToTName + ", " + "[tName] = " + tName + ", "
							+ "[mTypeAccess] = " + mTypeAccess + ", " + "[mName] = " + mName + ", " + "[mType] = "
							+ mType + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodSignatureArrayReturnImpl
							.pattern_MethodSignatureArrayReturn_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType, MMethodSignature mSignature) {
		match.registerObject("mTypeOfArray", mTypeOfArray);
		match.registerObject("mTypeAccess", mTypeAccess);
		match.registerObject("mName", mName);
		match.registerObject("mType", mType);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType, MMethodSignature mSignature) {// Create CSP
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
			TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName, TMethod tName,
			TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature) {// Create CSP
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
		isApplicableMatch.registerObject("mTypeOfArray", mTypeOfArray);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mTypeAccess", mTypeAccess);
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
			EObject tType, EObject mTypeOfArray, EObject mNameToTName, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mName, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeOfArray", mTypeOfArray);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeAccess", mTypeAccess);
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

		Object[] result1_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_10_1_initialbindings_blackBBBBB(this, match, tSignature, tType,
						tName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
					+ "[tName] = " + tName + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSignature, tType,
						tName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
					+ "[tName] = " + tName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_10_4_collectelementstobetranslated_blackBBBB(match, tSignature,
							tType, tName);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tSignature] = "
								+ tSignature + ", " + "[tType] = " + tType + ", " + "[tName] = " + tName + ".");
			}
			MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							tSignature, tType, tName);
			//nothing EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result4_green[6];

			Object[] result5_black = MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_10_5_collectcontextelements_blackBBBB(match, tSignature, tType,
							tName);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tSignature] = "
								+ tSignature + ", " + "[tType] = " + tType + ", " + "[tName] = " + tName + ".");
			}
			MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_10_5_collectcontextelements_greenBBB(match, tType, tName);

			// 
			MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tSignature, tType, tName);
			return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_10_7_expressionF();
		} else {
			return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		Type mTypeOfArray = (Type) result1_bindingAndBlack[3];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[4];
		TMethod tName = (TMethod) result1_bindingAndBlack[5];
		TypeAccess mTypeAccess = (TypeAccess) result1_bindingAndBlack[6];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[7];
		ArrayType mType = (ArrayType) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_11_1_performtransformation_greenBFBFBF(tSignature, mName, mType);
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[1];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[3];
		MMethodSignature mSignature = (MMethodSignature) result1_green[5];

		Object[] result2_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_11_2_collecttranslatedelements_blackBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		Object[] result2_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_11_2_collecttranslatedelements_greenFBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, tSignature,
						mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mFlowElementToTFlowElement, mTypeAccess,
						mName, mSignatureToTSignature, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSignature] = " + tSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ", " + "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mNameToTName] = "
					+ mNameToTName + ", " + "[tName] = " + tName + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mName] = " + mName
					+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
						tSignature, tType, tName, mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType,
						mSignature);
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
				this, ruleresult, tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
				mFlowElementToTFlowElement, mTypeAccess, mName, mSignatureToTSignature, mType, mSignature);
		return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result2_binding[0];
		TAbstractType tType = (TAbstractType) result2_binding[1];
		TMethod tName = (TMethod) result2_binding[2];
		for (Object[] result2_black : MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_12_2_corematch_blackBFBFFBFB(tSignature, tType, tName, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			Type mTypeOfArray = (Type) result2_black[3];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[4];
			MMethodName mName = (MMethodName) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_12_3_findcontext_blackBBBBBBFBF(tSignature, mTypeToTType, tType,
							mTypeOfArray, mNameToTName, tName, mName)) {
				TypeAccess mTypeAccess = (TypeAccess) result3_black[6];
				ArrayType mType = (ArrayType) result3_black[8];
				Object[] result3_green = MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(tSignature,
								mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mTypeAccess__mTypeOfArray____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeOfArray__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeToTType__mTypeOfArray____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mType__mTypeAccess____elementType = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tSignature__tType____returnType = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[19];

				Object[] result4_bindingAndBlack = MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
								mTypeAccess, mName, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSignature] = " + tSignature
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType + ", "
							+ "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mNameToTName] = " + mNameToTName + ", "
							+ "[tName] = " + tName + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mName] = "
							+ mName + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodSignatureArrayReturnImpl
							.pattern_MethodSignatureArrayReturn_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_12_7_expressionFB(ruleresult);
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
			TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType) {// Create CSP
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
		isApplicableMatch.registerObject("mTypeOfArray", mTypeOfArray);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mTypeAccess", mTypeAccess);
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
			EObject tType, EObject mTypeOfArray, EObject mNameToTName, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mName, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeOfArray", mTypeOfArray);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeAccess", mTypeAccess);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_44(EMoflonEdge _edge_returnType) {

		Object[] result1_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_20_2_testcorematchandDECs_blackFFFB(_edge_returnType)) {
			TMethodSignature tSignature = (TMethodSignature) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			TMethod tName = (TMethod) result2_black[2];
			Object[] result2_green = MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tSignature, tType, tName)) {
				// 
				if (MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodSignatureArrayReturnImpl
							.pattern_MethodSignatureArrayReturn_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodSignatureArrayReturnImpl
							.pattern_MethodSignatureArrayReturn_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_45(EMoflonEdge _edge_mSignatures) {

		Object[] result1_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_21_2_testcorematchandDECs_blackFFFFFB(_edge_mSignatures)) {
			Type mTypeOfArray = (Type) result2_black[0];
			TypeAccess mTypeAccess = (TypeAccess) result2_black[1];
			MMethodName mName = (MMethodName) result2_black[2];
			ArrayType mType = (ArrayType) result2_black[3];
			MMethodSignature mSignature = (MMethodSignature) result2_black[4];
			Object[] result2_green = MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, mTypeOfArray, mTypeAccess, mName, mType, mSignature)) {
				// 
				if (MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodSignatureArrayReturnImpl
							.pattern_MethodSignatureArrayReturn_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodSignatureArrayReturnImpl
							.pattern_MethodSignatureArrayReturn_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodSignatureArrayReturn");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "upperBound", -1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("MethodSignatureArrayReturn");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "upperBound", -1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
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

		Object[] result1_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result2_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[1];
		Type mTypeOfArray = (Type) result2_bindingAndBlack[2];
		TMethod tName = (TMethod) result2_bindingAndBlack[3];
		TypeAccess mTypeAccess = (TypeAccess) result2_bindingAndBlack[4];
		MMethodName mName = (MMethodName) result2_bindingAndBlack[5];
		ArrayType mType = (ArrayType) result2_bindingAndBlack[6];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, tSignature, tType,
						mTypeOfArray, tName, mTypeAccess, mName, mType, mSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[mTypeOfArray] = "
					+ mTypeOfArray + ", " + "[tName] = " + tName + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
					+ "[mName] = " + mName + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_24_5_matchcorrcontext_blackFBBFBBBB(tType, mTypeOfArray, tName,
							mName, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result5_black[3];
				Object[] result5_green = MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_24_5_matchcorrcontext_greenBBBBF(mTypeToTType, mNameToTName,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_24_6_createcorrespondence_blackBBBBBBBBB(tSignature, tType,
								mTypeOfArray, tName, mTypeAccess, mName, mType, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = "
							+ tSignature + ", " + "[tType] = " + tType + ", " + "[mTypeOfArray] = " + mTypeOfArray
							+ ", " + "[tName] = " + tName + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
							+ "[mName] = " + mName + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_24_6_createcorrespondence_greenBFFBB(
						tSignature, mSignature, ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
				//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[2];

				Object[] result7_black = MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMethodSignature tSignature, TAbstractType tType, Type mTypeOfArray,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature,
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
	public boolean checkDEC_FWD(Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType,
			MMethodSignature mSignature) {// 
		Object[] result1_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_27_1_matchtggpattern_blackBBBBB(mTypeOfArray, mTypeAccess, mName,
						mType, mSignature);
		if (result1_black != null) {
			return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_27_2_expressionF();
		} else {
			return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tSignature, TAbstractType tType, TMethod tName) {// 
		Object[] result1_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_28_1_matchtggpattern_blackBBB(tSignature, tType, tName);
		if (result1_black != null) {
			MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_28_1_matchtggpattern_greenB(tSignature);

			return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_28_2_expressionF();
		} else {
			return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MMethodNameToTMethod mNameToTNameParameter) {

		Object[] result1_black = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodSignatureArrayReturnImpl
				.pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_blackFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TAbstractType tType = (TAbstractType) result2_black[2];
			Type mTypeOfArray = (Type) result2_black[3];
			TypeAccess mTypeAccess = (TypeAccess) result2_black[4];
			ArrayType mType = (ArrayType) result2_black[5];
			//nothing RuleEntryList mNameToTNameList = (RuleEntryList) result2_black[6];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[7];
			MMethodName mName = (MMethodName) result2_black[8];
			TMethod tName = (TMethod) result2_black[9];

			Object[] result3_bindingAndBlack = MethodSignatureArrayReturnImpl
					.pattern_MethodSignatureArrayReturn_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
							isApplicableMatch, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess,
							mName, mType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[tType] = " + tType + ", " + "[mTypeOfArray] = " + mTypeOfArray + ", "
						+ "[mNameToTName] = " + mNameToTName + ", " + "[tName] = " + tName + ", " + "[mTypeAccess] = "
						+ mTypeAccess + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MethodSignatureArrayReturnImpl
						.pattern_MethodSignatureArrayReturn_29_5_checknacs_blackBBBBBBBB(mTypeToTType, tType,
								mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType);
				if (result5_black != null) {

					Object[] result6_black = MethodSignatureArrayReturnImpl
							.pattern_MethodSignatureArrayReturn_29_6_perform_blackBBBBBBBBB(mTypeToTType, tType,
									mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tType] = " + tType + ", " + "[mTypeOfArray] = " + mTypeOfArray
								+ ", " + "[mNameToTName] = " + mNameToTName + ", " + "[tName] = " + tName + ", "
								+ "[mTypeAccess] = " + mTypeAccess + ", " + "[mName] = " + mName + ", " + "[mType] = "
								+ mType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_29_6_perform_greenFBBFBFBFB(tType,
							tName, mName, mType, ruleResult);
					//nothing TMethodSignature tSignature = (TMethodSignature) result6_green[0];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[3];
					//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[5];
					//nothing MMethodSignature mSignature = (MMethodSignature) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return MethodSignatureArrayReturnImpl.pattern_MethodSignatureArrayReturn_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName, TMethod tName,
			TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("mTypeOfArray", mTypeOfArray);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mTypeAccess", mTypeAccess);
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
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPROPRIATE_FWD__MATCH_TYPE_TYPEACCESS_MMETHODNAME_ARRAYTYPE_MMETHODSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1), (TypeAccess) arguments.get(2),
					(MMethodName) arguments.get(3), (ArrayType) arguments.get(4), (MMethodSignature) arguments.get(5));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_TYPEACCESS_MMETHODNAME_ARRAYTYPE_MMETHODSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1), (TypeAccess) arguments.get(2),
					(MMethodName) arguments.get(3), (ArrayType) arguments.get(4), (MMethodSignature) arguments.get(5));
			return null;
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_TYPEACCESS_MMETHODNAME_ARRAYTYPE_MMETHODSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(TypeAccess) arguments.get(2), (MMethodName) arguments.get(3), (ArrayType) arguments.get(4),
					(MMethodSignature) arguments.get(5));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TYPE_MMETHODNAMETOTMETHOD_TMETHOD_TYPEACCESS_MMETHODNAME_ARRAYTYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2), (Type) arguments.get(3),
					(MMethodNameToTMethod) arguments.get(4), (TMethod) arguments.get(5), (TypeAccess) arguments.get(6),
					(MMethodName) arguments.get(7), (ArrayType) arguments.get(8), (MMethodSignature) arguments.get(9));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TMethod) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TMethod) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TMethod) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TYPE_MMETHODNAMETOTMETHOD_TMETHOD_TYPEACCESS_MMETHODNAME_ARRAYTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TAbstractType) arguments.get(3), (Type) arguments.get(4),
					(MMethodNameToTMethod) arguments.get(5), (TMethod) arguments.get(6), (TypeAccess) arguments.get(7),
					(MMethodName) arguments.get(8), (ArrayType) arguments.get(9));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_45((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPLICABLE_SOLVE_CSP_CC__TMETHODSIGNATURE_TABSTRACTTYPE_TYPE_TMETHOD_TYPEACCESS_MMETHODNAME_ARRAYTYPE_MMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(Type) arguments.get(2), (TMethod) arguments.get(3), (TypeAccess) arguments.get(4),
					(MMethodName) arguments.get(5), (ArrayType) arguments.get(6), (MMethodSignature) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___CHECK_DEC_FWD__TYPE_TYPEACCESS_MMETHODNAME_ARRAYTYPE_MMETHODSIGNATURE:
			return checkDEC_FWD((Type) arguments.get(0), (TypeAccess) arguments.get(1), (MMethodName) arguments.get(2),
					(ArrayType) arguments.get(3), (MMethodSignature) arguments.get(4));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___CHECK_DEC_BWD__TMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethod) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MMETHODNAMETOTMETHOD:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MMethodNameToTMethod) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TYPE_MMETHODNAMETOTMETHOD_TMETHOD_TYPEACCESS_MMETHODNAME_ARRAYTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2), (Type) arguments.get(3),
					(MMethodNameToTMethod) arguments.get(4), (TMethod) arguments.get(5), (TypeAccess) arguments.get(6),
					(MMethodName) arguments.get(7), (ArrayType) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_0_1_initialbindings_blackBBBBBBB(
			MethodSignatureArrayReturn _this, Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType, MMethodSignature mSignature) {
		if (!mType.equals(mTypeOfArray)) {
			return new Object[] { _this, match, mTypeOfArray, mTypeAccess, mName, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_0_2_SolveCSP_bindingFBBBBBBB(
			MethodSignatureArrayReturn _this, Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mTypeOfArray, mTypeAccess, mName, mType,
				mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mTypeOfArray, mTypeAccess, mName, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			MethodSignatureArrayReturn _this, Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodSignatureArrayReturn_0_2_SolveCSP_binding = pattern_MethodSignatureArrayReturn_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, mTypeOfArray, mTypeAccess, mName, mType, mSignature);
		if (result_pattern_MethodSignatureArrayReturn_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureArrayReturn_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_0_2_SolveCSP_black = pattern_MethodSignatureArrayReturn_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureArrayReturn_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mTypeOfArray, mTypeAccess, mName, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_0_3_CheckCSP_expressionFBB(
			MethodSignatureArrayReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_0_4_collectelementstobetranslated_blackBBBBBB(
			Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType,
			MMethodSignature mSignature) {
		if (!mType.equals(mTypeOfArray)) {
			return new Object[] { match, mTypeOfArray, mTypeAccess, mName, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, MMethodName mName, ArrayType mType, MMethodSignature mSignature) {
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

	public static final Object[] pattern_MethodSignatureArrayReturn_0_5_collectcontextelements_blackBBBBBB(Match match,
			Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType,
			MMethodSignature mSignature) {
		if (!mType.equals(mTypeOfArray)) {
			return new Object[] { match, mTypeOfArray, mTypeAccess, mName, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_0_5_collectcontextelements_greenBBBBBFFF(
			Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType) {
		EMoflonEdge mTypeAccess__mTypeOfArray____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeOfArray__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mTypeOfArray);
		match.getContextNodes().add(mTypeAccess);
		match.getContextNodes().add(mName);
		match.getContextNodes().add(mType);
		String mTypeAccess__mTypeOfArray____type_name_prime = "type";
		String mTypeOfArray__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mType__mTypeAccess____elementType_name_prime = "elementType";
		mTypeAccess__mTypeOfArray____type.setSrc(mTypeAccess);
		mTypeAccess__mTypeOfArray____type.setTrg(mTypeOfArray);
		match.getContextEdges().add(mTypeAccess__mTypeOfArray____type);
		mTypeOfArray__mTypeAccess____usagesInTypeAccess.setSrc(mTypeOfArray);
		mTypeOfArray__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		match.getContextEdges().add(mTypeOfArray__mTypeAccess____usagesInTypeAccess);
		mType__mTypeAccess____elementType.setSrc(mType);
		mType__mTypeAccess____elementType.setTrg(mTypeAccess);
		match.getContextEdges().add(mType__mTypeAccess____elementType);
		mTypeAccess__mTypeOfArray____type.setName(mTypeAccess__mTypeOfArray____type_name_prime);
		mTypeOfArray__mTypeAccess____usagesInTypeAccess
				.setName(mTypeOfArray__mTypeAccess____usagesInTypeAccess_name_prime);
		mType__mTypeAccess____elementType.setName(mType__mTypeAccess____elementType_name_prime);
		return new Object[] { match, mTypeOfArray, mTypeAccess, mName, mType, mTypeAccess__mTypeOfArray____type,
				mTypeOfArray__mTypeAccess____usagesInTypeAccess, mType__mTypeAccess____elementType };
	}

	public static final void pattern_MethodSignatureArrayReturn_0_6_registerobjectstomatch_expressionBBBBBBB(
			MethodSignatureArrayReturn _this, Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType, MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mTypeOfArray, mTypeAccess, mName, mType, mSignature);

	}

	public static final boolean pattern_MethodSignatureArrayReturn_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeOfArray");
		EObject _localVariable_3 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_4 = isApplicableMatch.getObject("tName");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("mName");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject _localVariable_8 = isApplicableMatch.getObject("mSignature");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMTypeOfArray = _localVariable_2;
		EObject tmpMNameToTName = _localVariable_3;
		EObject tmpTName = _localVariable_4;
		EObject tmpMTypeAccess = _localVariable_5;
		EObject tmpMName = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		EObject tmpMSignature = _localVariable_8;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMTypeOfArray instanceof Type) {
					Type mTypeOfArray = (Type) tmpMTypeOfArray;
					if (tmpMNameToTName instanceof MMethodNameToTMethod) {
						MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
						if (tmpTName instanceof TMethod) {
							TMethod tName = (TMethod) tmpTName;
							if (tmpMTypeAccess instanceof TypeAccess) {
								TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
								if (tmpMName instanceof MMethodName) {
									MMethodName mName = (MMethodName) tmpMName;
									if (tmpMType instanceof ArrayType) {
										ArrayType mType = (ArrayType) tmpMType;
										if (tmpMSignature instanceof MMethodSignature) {
											MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
											return new Object[] { mTypeToTType, tType, mTypeOfArray, mNameToTName,
													tName, mTypeAccess, mName, mType, mSignature, isApplicableMatch };
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

	public static final Object[] pattern_MethodSignatureArrayReturn_1_1_performtransformation_blackBBBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature,
			MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch) {
		if (!mType.equals(mTypeOfArray)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName,
							mType, mSignature, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding = pattern_MethodSignatureArrayReturn_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding[1];
			Type mTypeOfArray = (Type) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding[2];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding[3];
			TMethod tName = (TMethod) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding[4];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding[5];
			MMethodName mName = (MMethodName) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding[6];
			ArrayType mType = (ArrayType) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding[7];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_binding[8];

			Object[] result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_black = pattern_MethodSignatureArrayReturn_1_1_performtransformation_blackBBBBBBBBBFBB(
					mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType, mSignature,
					_this, isApplicableMatch);
			if (result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignatureArrayReturn_1_1_performtransformation_black[9];

				return new Object[] { mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType,
						mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_1_1_performtransformation_greenFBBFFB(
			TAbstractType tType, TMethod tName, MMethodSignature mSignature) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		int tSignature_upperBound_prime = Integer.valueOf(-1);
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		tSignature.setReturnType(tType);
		tName.getSignatures().add(tSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		return new Object[] { tSignature, tType, tName, mFlowElementToTFlowElement, mSignatureToTSignature,
				mSignature };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_1_2_collecttranslatedelements_blackBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_1_2_collecttranslatedelements_greenFBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getTranslatedElements().add(mSignature);
		return new Object[] { ruleresult, tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType, EObject tType, EObject mTypeOfArray,
			EObject mNameToTName, EObject tName, EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		if (!tSignature.equals(tType)) {
			if (!mTypeToTType.equals(tSignature)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mTypeToTType.equals(tName)) {
						if (!mTypeOfArray.equals(tSignature)) {
							if (!mTypeOfArray.equals(mTypeToTType)) {
								if (!mTypeOfArray.equals(tType)) {
									if (!mTypeOfArray.equals(tName)) {
										if (!mNameToTName.equals(tSignature)) {
											if (!mNameToTName.equals(mTypeToTType)) {
												if (!mNameToTName.equals(tType)) {
													if (!mNameToTName.equals(mTypeOfArray)) {
														if (!mNameToTName.equals(tName)) {
															if (!mNameToTName.equals(mTypeAccess)) {
																if (!mNameToTName.equals(mSignatureToTSignature)) {
																	if (!mNameToTName.equals(mType)) {
																		if (!mNameToTName.equals(mSignature)) {
																			if (!tName.equals(tSignature)) {
																				if (!tName.equals(tType)) {
																					if (!mFlowElementToTFlowElement
																							.equals(tSignature)) {
																						if (!mFlowElementToTFlowElement
																								.equals(mTypeToTType)) {
																							if (!mFlowElementToTFlowElement
																									.equals(tType)) {
																								if (!mFlowElementToTFlowElement
																										.equals(mTypeOfArray)) {
																									if (!mFlowElementToTFlowElement
																											.equals(mNameToTName)) {
																										if (!mFlowElementToTFlowElement
																												.equals(tName)) {
																											if (!mFlowElementToTFlowElement
																													.equals(mTypeAccess)) {
																												if (!mFlowElementToTFlowElement
																														.equals(mName)) {
																													if (!mFlowElementToTFlowElement
																															.equals(mSignatureToTSignature)) {
																														if (!mFlowElementToTFlowElement
																																.equals(mType)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(mSignature)) {
																																if (!mTypeAccess
																																		.equals(tSignature)) {
																																	if (!mTypeAccess
																																			.equals(mTypeToTType)) {
																																		if (!mTypeAccess
																																				.equals(tType)) {
																																			if (!mTypeAccess
																																					.equals(mTypeOfArray)) {
																																				if (!mTypeAccess
																																						.equals(tName)) {
																																					if (!mName
																																							.equals(tSignature)) {
																																						if (!mName
																																								.equals(mTypeToTType)) {
																																							if (!mName
																																									.equals(tType)) {
																																								if (!mName
																																										.equals(mTypeOfArray)) {
																																									if (!mName
																																											.equals(mNameToTName)) {
																																										if (!mName
																																												.equals(tName)) {
																																											if (!mName
																																													.equals(mTypeAccess)) {
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
																																																				.equals(mTypeOfArray)) {
																																																			if (!mSignatureToTSignature
																																																					.equals(tName)) {
																																																				if (!mSignatureToTSignature
																																																						.equals(mTypeAccess)) {
																																																					if (!mSignatureToTSignature
																																																							.equals(mType)) {
																																																						if (!mType
																																																								.equals(tSignature)) {
																																																							if (!mType
																																																									.equals(mTypeToTType)) {
																																																								if (!mType
																																																										.equals(tType)) {
																																																									if (!mType
																																																											.equals(mTypeOfArray)) {
																																																										if (!mType
																																																												.equals(tName)) {
																																																											if (!mType
																																																													.equals(mTypeAccess)) {
																																																												if (!mSignature
																																																														.equals(tSignature)) {
																																																													if (!mSignature
																																																															.equals(mTypeToTType)) {
																																																														if (!mSignature
																																																																.equals(tType)) {
																																																															if (!mSignature
																																																																	.equals(mTypeOfArray)) {
																																																																if (!mSignature
																																																																		.equals(tName)) {
																																																																	if (!mSignature
																																																																			.equals(mTypeAccess)) {
																																																																		if (!mSignature
																																																																				.equals(mSignatureToTSignature)) {
																																																																			if (!mSignature
																																																																					.equals(mType)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						tSignature,
																																																																						mTypeToTType,
																																																																						tType,
																																																																						mTypeOfArray,
																																																																						mNameToTName,
																																																																						tName,
																																																																						mFlowElementToTFlowElement,
																																																																						mTypeAccess,
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

	public static final Object[] pattern_MethodSignatureArrayReturn_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mName, EObject mSignatureToTSignature, EObject mType,
			EObject mSignature) {
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignatureArrayReturn";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mSignature__mType____returnType_name_prime = "returnType";
		String tSignature__tType____returnType_name_prime = "returnType";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
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
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		ruleresult.getCreatedEdges().add(tSignature__tType____returnType);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____method);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		return new Object[] { ruleresult, tSignature, tType, tName, mFlowElementToTFlowElement, mName,
				mSignatureToTSignature, mType, mSignature, mSignatureToTSignature__mSignature____source,
				mName__mSignature____mSignatures, mSignatureToTSignature__tSignature____target,
				mFlowElementToTFlowElement__mSignature____source, mSignature__mType____returnType,
				tSignature__tType____returnType, mFlowElementToTFlowElement__tSignature____target,
				tName__tSignature____signatures, tSignature__tName____method };
	}

	public static final void pattern_MethodSignatureArrayReturn_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType,
			EObject tType, EObject mTypeOfArray, EObject mNameToTName, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mName, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
				mFlowElementToTFlowElement, mTypeAccess, mName, mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodSignatureArrayReturn_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_bindingFB(
			MethodSignatureArrayReturn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignatureArrayReturn _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignatureArrayReturn _this) {
		Object[] result_pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_binding = pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_black = pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodSignatureArrayReturn";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mTypeOfArray");
		EObject _localVariable_1 = match.getObject("mTypeAccess");
		EObject _localVariable_2 = match.getObject("mName");
		EObject _localVariable_3 = match.getObject("mType");
		EObject _localVariable_4 = match.getObject("mSignature");
		EObject tmpMTypeOfArray = _localVariable_0;
		EObject tmpMTypeAccess = _localVariable_1;
		EObject tmpMName = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpMSignature = _localVariable_4;
		if (tmpMTypeOfArray instanceof Type) {
			Type mTypeOfArray = (Type) tmpMTypeOfArray;
			if (tmpMTypeAccess instanceof TypeAccess) {
				TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
				if (tmpMName instanceof MMethodName) {
					MMethodName mName = (MMethodName) tmpMName;
					if (tmpMType instanceof ArrayType) {
						ArrayType mType = (ArrayType) tmpMType;
						if (tmpMSignature instanceof MMethodSignature) {
							MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
							return new Object[] { mTypeOfArray, mTypeAccess, mName, mType, mSignature, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureArrayReturn_2_2_corematch_blackFFBFFBBBBB(
			Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mType.equals(mTypeOfArray)) {
			for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
				TMethod tName = mNameToTName.getTarget();
				if (tName != null) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mTypeOfArray, TypeToTAbstractType.class, "source")) {
						TAbstractType tType = mTypeToTType.getTarget();
						if (tType != null) {
							_result.add(new Object[] { mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
									mTypeAccess, mName, mType, mSignature, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureArrayReturn_2_3_findcontext_blackBBBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mType.equals(mTypeOfArray)) {
			if (mTypeOfArray.equals(mTypeAccess.getType())) {
				if (mName.getMSignatures().contains(mSignature)) {
					if (mType.equals(mSignature.getReturnType())) {
						if (tName.equals(mNameToTName.getTarget())) {
							if (mName.equals(mNameToTName.getSource())) {
								if (mTypeOfArray.equals(mTypeToTType.getSource())) {
									if (mTypeAccess.equals(mType.getElementType())) {
										if (tType.equals(mTypeToTType.getTarget())) {
											_result.add(new Object[] { mTypeToTType, tType, mTypeOfArray, mNameToTName,
													tName, mTypeAccess, mName, mType, mSignature });
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

	public static final Object[] pattern_MethodSignatureArrayReturn_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFF(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeAccess__mTypeOfArray____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeOfArray__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mTypeOfArray____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeAccess__mTypeOfArray____type_name_prime = "type";
		String mTypeOfArray__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mType____returnType_name_prime = "returnType";
		String mNameToTName__tName____target_name_prime = "target";
		String mNameToTName__mName____source_name_prime = "source";
		String mTypeToTType__mTypeOfArray____source_name_prime = "source";
		String mType__mTypeAccess____elementType_name_prime = "elementType";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mTypeAccess__mTypeOfArray____type.setSrc(mTypeAccess);
		mTypeAccess__mTypeOfArray____type.setTrg(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mTypeAccess__mTypeOfArray____type);
		mTypeOfArray__mTypeAccess____usagesInTypeAccess.setSrc(mTypeOfArray);
		mTypeOfArray__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mTypeOfArray__mTypeAccess____usagesInTypeAccess);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mName__mSignature____mSignatures);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mSignature__mType____returnType);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mTypeToTType__mTypeOfArray____source.setSrc(mTypeToTType);
		mTypeToTType__mTypeOfArray____source.setTrg(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mTypeOfArray____source);
		mType__mTypeAccess____elementType.setSrc(mType);
		mType__mTypeAccess____elementType.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mTypeAccess____elementType);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mTypeAccess__mTypeOfArray____type.setName(mTypeAccess__mTypeOfArray____type_name_prime);
		mTypeOfArray__mTypeAccess____usagesInTypeAccess
				.setName(mTypeOfArray__mTypeAccess____usagesInTypeAccess_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mTypeToTType__mTypeOfArray____source.setName(mTypeToTType__mTypeOfArray____source_name_prime);
		mType__mTypeAccess____elementType.setName(mType__mTypeAccess____elementType_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType,
				mSignature, isApplicableMatch, mTypeAccess__mTypeOfArray____type,
				mTypeOfArray__mTypeAccess____usagesInTypeAccess, mName__mSignature____mSignatures,
				mSignature__mType____returnType, mNameToTName__tName____target, mNameToTName__mName____source,
				mTypeToTType__mTypeOfArray____source, mType__mTypeAccess____elementType,
				mTypeToTType__tType____target };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName, TMethod tName,
			TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToTType, tType, mTypeOfArray,
				mNameToTName, tName, mTypeAccess, mName, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
					mTypeAccess, mName, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName, TMethod tName,
			TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodSignatureArrayReturn_2_4_solveCSP_binding = pattern_MethodSignatureArrayReturn_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName,
				mType, mSignature);
		if (result_pattern_MethodSignatureArrayReturn_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureArrayReturn_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_2_4_solveCSP_black = pattern_MethodSignatureArrayReturn_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureArrayReturn_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mTypeOfArray, mNameToTName,
						tName, mTypeAccess, mName, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_2_5_checkCSP_expressionFBB(
			MethodSignatureArrayReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignatureArrayReturn";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureArrayReturn_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_10_1_initialbindings_blackBBBBB(
			MethodSignatureArrayReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		return new Object[] { _this, match, tSignature, tType, tName };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_10_2_SolveCSP_bindingFBBBBB(
			MethodSignatureArrayReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tType, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tType, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodSignatureArrayReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		Object[] result_pattern_MethodSignatureArrayReturn_10_2_SolveCSP_binding = pattern_MethodSignatureArrayReturn_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSignature, tType, tName);
		if (result_pattern_MethodSignatureArrayReturn_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureArrayReturn_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_10_2_SolveCSP_black = pattern_MethodSignatureArrayReturn_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureArrayReturn_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tType, tName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_10_3_CheckCSP_expressionFBB(
			MethodSignatureArrayReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TMethodSignature tSignature, TAbstractType tType, TMethod tName) {
		return new Object[] { match, tSignature, tType, tName };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_10_4_collectelementstobetranslated_greenBBBBFFF(
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

	public static final Object[] pattern_MethodSignatureArrayReturn_10_5_collectcontextelements_blackBBBB(Match match,
			TMethodSignature tSignature, TAbstractType tType, TMethod tName) {
		return new Object[] { match, tSignature, tType, tName };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tType, TMethod tName) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tName);
		return new Object[] { match, tType, tName };
	}

	public static final void pattern_MethodSignatureArrayReturn_10_6_registerobjectstomatch_expressionBBBBB(
			MethodSignatureArrayReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tType, tName);

	}

	public static final boolean pattern_MethodSignatureArrayReturn_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeOfArray");
		EObject _localVariable_4 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_5 = isApplicableMatch.getObject("tName");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTypeAccess");
		EObject _localVariable_7 = isApplicableMatch.getObject("mName");
		EObject _localVariable_8 = isApplicableMatch.getObject("mType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMTypeOfArray = _localVariable_3;
		EObject tmpMNameToTName = _localVariable_4;
		EObject tmpTName = _localVariable_5;
		EObject tmpMTypeAccess = _localVariable_6;
		EObject tmpMName = _localVariable_7;
		EObject tmpMType = _localVariable_8;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMTypeOfArray instanceof Type) {
						Type mTypeOfArray = (Type) tmpMTypeOfArray;
						if (tmpMNameToTName instanceof MMethodNameToTMethod) {
							MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
							if (tmpTName instanceof TMethod) {
								TMethod tName = (TMethod) tmpTName;
								if (tmpMTypeAccess instanceof TypeAccess) {
									TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
									if (tmpMName instanceof MMethodName) {
										MMethodName mName = (MMethodName) tmpMName;
										if (tmpMType instanceof ArrayType) {
											ArrayType mType = (ArrayType) tmpMType;
											return new Object[] { tSignature, mTypeToTType, tType, mTypeOfArray,
													mNameToTName, tName, mTypeAccess, mName, mType, isApplicableMatch };
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

	public static final Object[] pattern_MethodSignatureArrayReturn_11_1_performtransformation_blackBBBBBBBBBFBB(
			TMethodSignature tSignature, TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray,
			MMethodNameToTMethod mNameToTName, TMethod tName, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType, MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch) {
		if (!mType.equals(mTypeOfArray)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
							mTypeAccess, mName, mType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding = pattern_MethodSignatureArrayReturn_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding != null) {
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding[2];
			Type mTypeOfArray = (Type) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding[3];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding[4];
			TMethod tName = (TMethod) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding[5];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding[6];
			MMethodName mName = (MMethodName) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding[7];
			ArrayType mType = (ArrayType) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_binding[8];

			Object[] result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_black = pattern_MethodSignatureArrayReturn_11_1_performtransformation_blackBBBBBBBBBFBB(
					tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType,
					_this, isApplicableMatch);
			if (result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignatureArrayReturn_11_1_performtransformation_black[9];

				return new Object[] { tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess,
						mName, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_11_1_performtransformation_greenBFBFBF(
			TMethodSignature tSignature, MMethodName mName, ArrayType mType) {
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

	public static final Object[] pattern_MethodSignatureArrayReturn_11_2_collecttranslatedelements_blackBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_11_2_collecttranslatedelements_greenFBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getCreatedElements().add(mSignature);
		return new Object[] { ruleresult, tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType, EObject tType, EObject mTypeOfArray,
			EObject mNameToTName, EObject tName, EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		if (!tSignature.equals(tType)) {
			if (!mTypeToTType.equals(tSignature)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mTypeToTType.equals(tName)) {
						if (!mTypeOfArray.equals(tSignature)) {
							if (!mTypeOfArray.equals(mTypeToTType)) {
								if (!mTypeOfArray.equals(tType)) {
									if (!mTypeOfArray.equals(tName)) {
										if (!mNameToTName.equals(tSignature)) {
											if (!mNameToTName.equals(mTypeToTType)) {
												if (!mNameToTName.equals(tType)) {
													if (!mNameToTName.equals(mTypeOfArray)) {
														if (!mNameToTName.equals(tName)) {
															if (!mNameToTName.equals(mTypeAccess)) {
																if (!mNameToTName.equals(mSignatureToTSignature)) {
																	if (!mNameToTName.equals(mType)) {
																		if (!mNameToTName.equals(mSignature)) {
																			if (!tName.equals(tSignature)) {
																				if (!tName.equals(tType)) {
																					if (!mFlowElementToTFlowElement
																							.equals(tSignature)) {
																						if (!mFlowElementToTFlowElement
																								.equals(mTypeToTType)) {
																							if (!mFlowElementToTFlowElement
																									.equals(tType)) {
																								if (!mFlowElementToTFlowElement
																										.equals(mTypeOfArray)) {
																									if (!mFlowElementToTFlowElement
																											.equals(mNameToTName)) {
																										if (!mFlowElementToTFlowElement
																												.equals(tName)) {
																											if (!mFlowElementToTFlowElement
																													.equals(mTypeAccess)) {
																												if (!mFlowElementToTFlowElement
																														.equals(mName)) {
																													if (!mFlowElementToTFlowElement
																															.equals(mSignatureToTSignature)) {
																														if (!mFlowElementToTFlowElement
																																.equals(mType)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(mSignature)) {
																																if (!mTypeAccess
																																		.equals(tSignature)) {
																																	if (!mTypeAccess
																																			.equals(mTypeToTType)) {
																																		if (!mTypeAccess
																																				.equals(tType)) {
																																			if (!mTypeAccess
																																					.equals(mTypeOfArray)) {
																																				if (!mTypeAccess
																																						.equals(tName)) {
																																					if (!mName
																																							.equals(tSignature)) {
																																						if (!mName
																																								.equals(mTypeToTType)) {
																																							if (!mName
																																									.equals(tType)) {
																																								if (!mName
																																										.equals(mTypeOfArray)) {
																																									if (!mName
																																											.equals(mNameToTName)) {
																																										if (!mName
																																												.equals(tName)) {
																																											if (!mName
																																													.equals(mTypeAccess)) {
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
																																																				.equals(mTypeOfArray)) {
																																																			if (!mSignatureToTSignature
																																																					.equals(tName)) {
																																																				if (!mSignatureToTSignature
																																																						.equals(mTypeAccess)) {
																																																					if (!mSignatureToTSignature
																																																							.equals(mType)) {
																																																						if (!mType
																																																								.equals(tSignature)) {
																																																							if (!mType
																																																									.equals(mTypeToTType)) {
																																																								if (!mType
																																																										.equals(tType)) {
																																																									if (!mType
																																																											.equals(mTypeOfArray)) {
																																																										if (!mType
																																																												.equals(tName)) {
																																																											if (!mType
																																																													.equals(mTypeAccess)) {
																																																												if (!mSignature
																																																														.equals(tSignature)) {
																																																													if (!mSignature
																																																															.equals(mTypeToTType)) {
																																																														if (!mSignature
																																																																.equals(tType)) {
																																																															if (!mSignature
																																																																	.equals(mTypeOfArray)) {
																																																																if (!mSignature
																																																																		.equals(tName)) {
																																																																	if (!mSignature
																																																																			.equals(mTypeAccess)) {
																																																																		if (!mSignature
																																																																				.equals(mSignatureToTSignature)) {
																																																																			if (!mSignature
																																																																					.equals(mType)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						tSignature,
																																																																						mTypeToTType,
																																																																						tType,
																																																																						mTypeOfArray,
																																																																						mNameToTName,
																																																																						tName,
																																																																						mFlowElementToTFlowElement,
																																																																						mTypeAccess,
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

	public static final Object[] pattern_MethodSignatureArrayReturn_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mName, EObject mSignatureToTSignature, EObject mType,
			EObject mSignature) {
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignatureArrayReturn";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mSignature__mType____returnType_name_prime = "returnType";
		String tSignature__tType____returnType_name_prime = "returnType";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
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
		tSignature__tType____returnType.setSrc(tSignature);
		tSignature__tType____returnType.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tSignature__tType____returnType);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____method);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		return new Object[] { ruleresult, tSignature, tType, tName, mFlowElementToTFlowElement, mName,
				mSignatureToTSignature, mType, mSignature, mSignatureToTSignature__mSignature____source,
				mName__mSignature____mSignatures, mSignatureToTSignature__tSignature____target,
				mFlowElementToTFlowElement__mSignature____source, mSignature__mType____returnType,
				tSignature__tType____returnType, mFlowElementToTFlowElement__tSignature____target,
				tName__tSignature____signatures, tSignature__tName____method };
	}

	public static final void pattern_MethodSignatureArrayReturn_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType,
			EObject tType, EObject mTypeOfArray, EObject mNameToTName, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mName, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
				mFlowElementToTFlowElement, mTypeAccess, mName, mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodSignatureArrayReturn_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_bindingFB(
			MethodSignatureArrayReturn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignatureArrayReturn _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignatureArrayReturn _this) {
		Object[] result_pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_binding = pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_black = pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodSignatureArrayReturn";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_2_corematch_bindingFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MethodSignatureArrayReturn_12_2_corematch_blackBFBFFBFB(
			TMethodSignature tSignature, TAbstractType tType, TMethod tName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tSignature_upperBound = tSignature.getUpperBound();
		if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(-1))) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tName, MMethodNameToTMethod.class, "target")) {
					MMethodName mName = mNameToTName.getSource();
					if (mName != null) {
						for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
							Type mTypeOfArray = mTypeToTType.getSource();
							if (mTypeOfArray != null) {
								_result.add(new Object[] { tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName,
										tName, mName, match });
							}

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureArrayReturn_12_3_findcontext_blackBBBBBBFBF(
			TMethodSignature tSignature, TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray,
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tName.equals(mNameToTName.getTarget())) {
			if (mName.equals(mNameToTName.getSource())) {
				if (mTypeOfArray.equals(mTypeToTType.getSource())) {
					if (tType.equals(tSignature.getReturnType())) {
						if (tType.equals(mTypeToTType.getTarget())) {
							if (tName.getSignatures().contains(tSignature)) {
								int tSignature_upperBound = tSignature.getUpperBound();
								if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(-1))) {
									int tSignature_lowerBound = tSignature.getLowerBound();
									if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
										for (TypeAccess mTypeAccess : mTypeOfArray.getUsagesInTypeAccess()) {
											for (ArrayType mType : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(mTypeAccess, ArrayType.class,
															"elementType")) {
												if (!mType.equals(mTypeOfArray)) {
													_result.add(new Object[] { tSignature, mTypeToTType, tType,
															mTypeOfArray, mNameToTName, tName, mTypeAccess, mName,
															mType });
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

	public static final Object[] pattern_MethodSignatureArrayReturn_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(
			TMethodSignature tSignature, TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray,
			MMethodNameToTMethod mNameToTName, TMethod tName, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeAccess__mTypeOfArray____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeOfArray__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mTypeOfArray____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeAccess__mTypeOfArray____type_name_prime = "type";
		String mTypeOfArray__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mNameToTName__tName____target_name_prime = "target";
		String mNameToTName__mName____source_name_prime = "source";
		String mTypeToTType__mTypeOfArray____source_name_prime = "source";
		String mType__mTypeAccess____elementType_name_prime = "elementType";
		String tSignature__tType____returnType_name_prime = "returnType";
		String mTypeToTType__tType____target_name_prime = "target";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mType);
		mTypeAccess__mTypeOfArray____type.setSrc(mTypeAccess);
		mTypeAccess__mTypeOfArray____type.setTrg(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mTypeAccess__mTypeOfArray____type);
		mTypeOfArray__mTypeAccess____usagesInTypeAccess.setSrc(mTypeOfArray);
		mTypeOfArray__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mTypeOfArray__mTypeAccess____usagesInTypeAccess);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mTypeToTType__mTypeOfArray____source.setSrc(mTypeToTType);
		mTypeToTType__mTypeOfArray____source.setTrg(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mTypeOfArray____source);
		mType__mTypeAccess____elementType.setSrc(mType);
		mType__mTypeAccess____elementType.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mTypeAccess____elementType);
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
		mTypeAccess__mTypeOfArray____type.setName(mTypeAccess__mTypeOfArray____type_name_prime);
		mTypeOfArray__mTypeAccess____usagesInTypeAccess
				.setName(mTypeOfArray__mTypeAccess____usagesInTypeAccess_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mTypeToTType__mTypeOfArray____source.setName(mTypeToTType__mTypeOfArray____source_name_prime);
		mType__mTypeAccess____elementType.setName(mType__mTypeAccess____elementType_name_prime);
		tSignature__tType____returnType.setName(tSignature__tType____returnType_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		return new Object[] { tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName,
				mType, isApplicableMatch, mTypeAccess__mTypeOfArray____type,
				mTypeOfArray__mTypeAccess____usagesInTypeAccess, mNameToTName__tName____target,
				mNameToTName__mName____source, mTypeToTType__mTypeOfArray____source, mType__mTypeAccess____elementType,
				tSignature__tType____returnType, mTypeToTType__tType____target, tName__tSignature____signatures,
				tSignature__tName____method };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tSignature, mTypeToTType, tType,
				mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSignature, mTypeToTType, tType, mTypeOfArray,
					mNameToTName, tName, mTypeAccess, mName, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType) {
		Object[] result_pattern_MethodSignatureArrayReturn_12_4_solveCSP_binding = pattern_MethodSignatureArrayReturn_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tSignature, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
				mTypeAccess, mName, mType);
		if (result_pattern_MethodSignatureArrayReturn_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureArrayReturn_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_12_4_solveCSP_black = pattern_MethodSignatureArrayReturn_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureArrayReturn_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSignature, mTypeToTType, tType, mTypeOfArray,
						mNameToTName, tName, mTypeAccess, mName, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_12_5_checkCSP_expressionFBB(
			MethodSignatureArrayReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignatureArrayReturn";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureArrayReturn_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_bindingFB(
			MethodSignatureArrayReturn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignatureArrayReturn _this) {
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

	public static final Object[] pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignatureArrayReturn _this) {
		Object[] result_pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_binding = pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_black = pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignatureArrayReturn_20_2_testcorematchandDECs_blackFFFB(
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
						int tSignature_upperBound = tSignature.getUpperBound();
						if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(-1))) {
							int tSignature_lowerBound = tSignature.getLowerBound();
							if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
								_result.add(new Object[] { tSignature, tType, tName, _edge_returnType });
							}

						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureArrayReturn_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodSignatureArrayReturn _this, Match match, TMethodSignature tSignature, TAbstractType tType,
			TMethod tName) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tType, tName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignatureArrayReturn _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignatureArrayReturn_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_bindingFB(
			MethodSignatureArrayReturn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignatureArrayReturn _this) {
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

	public static final Object[] pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignatureArrayReturn _this) {
		Object[] result_pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_binding = pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_black = pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignatureArrayReturn_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_mSignatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMName = _edge_mSignatures.getSrc();
		if (tmpMName instanceof MMethodName) {
			MMethodName mName = (MMethodName) tmpMName;
			EObject tmpMSignature = _edge_mSignatures.getTrg();
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				if (mName.getMSignatures().contains(mSignature)) {
					Type tmpMType = mSignature.getReturnType();
					if (tmpMType instanceof ArrayType) {
						ArrayType mType = (ArrayType) tmpMType;
						TypeAccess mTypeAccess = mType.getElementType();
						if (mTypeAccess != null) {
							Type mTypeOfArray = mTypeAccess.getType();
							if (mTypeOfArray != null) {
								if (!mType.equals(mTypeOfArray)) {
									_result.add(new Object[] { mTypeOfArray, mTypeAccess, mName, mType, mSignature,
											_edge_mSignatures });
								}
							}

						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignatureArrayReturn_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			MethodSignatureArrayReturn _this, Match match, Type mTypeOfArray, TypeAccess mTypeAccess, MMethodName mName,
			ArrayType mType, MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mTypeOfArray, mTypeAccess, mName, mType, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignatureArrayReturn _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignatureArrayReturn_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_1_prepare_blackB(
			MethodSignatureArrayReturn _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tSignature");
		EObject _localVariable_1 = targetMatch.getObject("tType");
		EObject _localVariable_2 = sourceMatch.getObject("mTypeOfArray");
		EObject _localVariable_3 = targetMatch.getObject("tName");
		EObject _localVariable_4 = sourceMatch.getObject("mTypeAccess");
		EObject _localVariable_5 = sourceMatch.getObject("mName");
		EObject _localVariable_6 = sourceMatch.getObject("mType");
		EObject _localVariable_7 = sourceMatch.getObject("mSignature");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMTypeOfArray = _localVariable_2;
		EObject tmpTName = _localVariable_3;
		EObject tmpMTypeAccess = _localVariable_4;
		EObject tmpMName = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		EObject tmpMSignature = _localVariable_7;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMTypeOfArray instanceof Type) {
					Type mTypeOfArray = (Type) tmpMTypeOfArray;
					if (tmpTName instanceof TMethod) {
						TMethod tName = (TMethod) tmpTName;
						if (tmpMTypeAccess instanceof TypeAccess) {
							TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
							if (tmpMName instanceof MMethodName) {
								MMethodName mName = (MMethodName) tmpMName;
								if (tmpMType instanceof ArrayType) {
									ArrayType mType = (ArrayType) tmpMType;
									if (tmpMSignature instanceof MMethodSignature) {
										MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
										return new Object[] { tSignature, tType, mTypeOfArray, tName, mTypeAccess,
												mName, mType, mSignature, targetMatch, sourceMatch };
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

	public static final Object[] pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
			TMethodSignature tSignature, TAbstractType tType, Type mTypeOfArray, TMethod tName, TypeAccess mTypeAccess,
			MMethodName mName, ArrayType mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		if (!mType.equals(mTypeOfArray)) {
			if (!sourceMatch.equals(targetMatch)) {
				int tSignature_upperBound = tSignature.getUpperBound();
				if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(-1))) {
					int tSignature_lowerBound = tSignature.getLowerBound();
					if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
						return new Object[] { tSignature, tType, mTypeOfArray, tName, mTypeAccess, mName, mType,
								mSignature, sourceMatch, targetMatch };
					}

				}

			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding = pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding != null) {
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding[1];
			Type mTypeOfArray = (Type) result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding[2];
			TMethod tName = (TMethod) result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding[3];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding[4];
			MMethodName mName = (MMethodName) result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding[5];
			ArrayType mType = (ArrayType) result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding[6];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_black = pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					tSignature, tType, mTypeOfArray, tName, mTypeAccess, mName, mType, mSignature, sourceMatch,
					targetMatch);
			if (result_pattern_MethodSignatureArrayReturn_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tSignature, tType, mTypeOfArray, tName, mTypeAccess, mName, mType, mSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_3_solvecsp_bindingFBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, TMethodSignature tSignature, TAbstractType tType, Type mTypeOfArray,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(tSignature, tType, mTypeOfArray, tName, mTypeAccess,
				mName, mType, mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, tSignature, tType, mTypeOfArray, tName, mTypeAccess, mName, mType,
					mSignature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, TMethodSignature tSignature, TAbstractType tType, Type mTypeOfArray,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignatureArrayReturn_24_3_solvecsp_binding = pattern_MethodSignatureArrayReturn_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, tSignature, tType, mTypeOfArray, tName, mTypeAccess, mName, mType, mSignature, sourceMatch,
				targetMatch);
		if (result_pattern_MethodSignatureArrayReturn_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureArrayReturn_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_24_3_solvecsp_black = pattern_MethodSignatureArrayReturn_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodSignatureArrayReturn_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tSignature, tType, mTypeOfArray, tName, mTypeAccess, mName, mType,
						mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureArrayReturn_24_5_matchcorrcontext_blackFBBFBBBB(
			TAbstractType tType, Type mTypeOfArray, TMethod tName, MMethodName mName, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tName, MMethodNameToTMethod.class, "target")) {
				if (mName.equals(mNameToTName.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mTypeOfArray, TypeToTAbstractType.class, "source")) {
						if (tType.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mName,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MMethodNameToTMethod mNameToTName, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodSignatureArrayReturn";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mNameToTName);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mNameToTName, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_6_createcorrespondence_blackBBBBBBBBB(
			TMethodSignature tSignature, TAbstractType tType, Type mTypeOfArray, TMethod tName, TypeAccess mTypeAccess,
			MMethodName mName, ArrayType mType, MMethodSignature mSignature, CCMatch ccMatch) {
		if (!mType.equals(mTypeOfArray)) {
			return new Object[] { tSignature, tType, mTypeOfArray, tName, mTypeAccess, mName, mType, mSignature,
					ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_6_createcorrespondence_greenBFFBB(
			TMethodSignature tSignature, MMethodSignature mSignature, CCMatch ccMatch) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		ccMatch.getCreateCorr().add(mSignatureToTSignature);
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature, ccMatch };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodSignatureArrayReturn";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignatureArrayReturn_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_27_1_matchtggpattern_blackBBBBB(Type mTypeOfArray,
			TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, MMethodSignature mSignature) {
		if (!mType.equals(mTypeOfArray)) {
			if (mTypeOfArray.equals(mTypeAccess.getType())) {
				if (mName.getMSignatures().contains(mSignature)) {
					if (mType.equals(mSignature.getReturnType())) {
						if (mTypeAccess.equals(mType.getElementType())) {
							return new Object[] { mTypeOfArray, mTypeAccess, mName, mType, mSignature };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_28_1_matchtggpattern_blackBBB(
			TMethodSignature tSignature, TAbstractType tType, TMethod tName) {
		if (tType.equals(tSignature.getReturnType())) {
			if (tName.getSignatures().contains(tSignature)) {
				return new Object[] { tSignature, tType, tName };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_28_1_matchtggpattern_greenB(
			TMethodSignature tSignature) {
		int tSignature_upperBound_prime = Integer.valueOf(-1);
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		return new Object[] { tSignature };
	}

	public static final boolean pattern_MethodSignatureArrayReturn_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_1_createresult_blackB(
			MethodSignatureArrayReturn _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type mTypeOfArray) {
		if (ruleResult.getSourceObjects().contains(mTypeOfArray)) {
			return new Object[] { ruleResult, mTypeOfArray };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeAccess mTypeAccess) {
		if (ruleResult.getSourceObjects().contains(mTypeAccess)) {
			return new Object[] { ruleResult, mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ArrayType mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MMethodNameToTMethod mNameToTName) {
		if (ruleResult.getCorrObjects().contains(mNameToTName)) {
			return new Object[] { ruleResult, mNameToTName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MMethodName mName) {
		if (ruleResult.getSourceObjects().contains(mName)) {
			return new Object[] { ruleResult, mName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TMethod tName) {
		if (ruleResult.getTargetObjects().contains(tName)) {
			return new Object[] { ruleResult, tName };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_blackFFFFFFFFFFBB(
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
								Type mTypeOfArray = mTypeToTType.getSource();
								if (mTypeOfArray != null) {
									if (pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, mTypeToTType) == null) {
										if (pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, tType) == null) {
											if (pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mTypeOfArray) == null) {
												for (EObject tmpMNameToTName : mNameToTNameList.getEntryObjects()) {
													if (tmpMNameToTName instanceof MMethodNameToTMethod) {
														MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
														MMethodName mName = mNameToTName.getSource();
														if (mName != null) {
															TMethod tName = mNameToTName.getTarget();
															if (tName != null) {
																if (pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mNameToTName) == null) {
																	if (pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_6BB(
																			ruleResult, mName) == null) {
																		if (pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_7BB(
																				ruleResult, tName) == null) {
																			for (TypeAccess mTypeAccess : mTypeOfArray
																					.getUsagesInTypeAccess()) {
																				if (pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult,
																						mTypeAccess) == null) {
																					for (ArrayType mType : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									mTypeAccess,
																									ArrayType.class,
																									"elementType")) {
																						if (!mType
																								.equals(mTypeOfArray)) {
																							if (pattern_MethodSignatureArrayReturn_29_2_isapplicablecore_black_nac_4BB(
																									ruleResult,
																									mType) == null) {
																								_result.add(
																										new Object[] {
																												mTypeToTTypeList,
																												mTypeToTType,
																												tType,
																												mTypeOfArray,
																												mTypeAccess,
																												mType,
																												mNameToTNameList,
																												mNameToTName,
																												mName,
																												tName,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_3_solveCSP_bindingFBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName, TMethod tName,
			TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, tType, mTypeOfArray,
				mNameToTName, tName, mTypeAccess, mName, mType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName,
					mTypeAccess, mName, mType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodSignatureArrayReturn _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName, TMethod tName,
			TypeAccess mTypeAccess, MMethodName mName, ArrayType mType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodSignatureArrayReturn_29_3_solveCSP_binding = pattern_MethodSignatureArrayReturn_29_3_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName,
				mType, ruleResult);
		if (result_pattern_MethodSignatureArrayReturn_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignatureArrayReturn_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodSignatureArrayReturn_29_3_solveCSP_black = pattern_MethodSignatureArrayReturn_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignatureArrayReturn_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mTypeOfArray, mNameToTName,
						tName, mTypeAccess, mName, mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignatureArrayReturn_29_4_checkCSP_expressionFBB(
			MethodSignatureArrayReturn _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_5_checknacs_blackBBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType) {
		if (!mType.equals(mTypeOfArray)) {
			return new Object[] { mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_6_perform_blackBBBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, Type mTypeOfArray, MMethodNameToTMethod mNameToTName,
			TMethod tName, TypeAccess mTypeAccess, MMethodName mName, ArrayType mType,
			ModelgeneratorRuleResult ruleResult) {
		if (!mType.equals(mTypeOfArray)) {
			return new Object[] { mTypeToTType, tType, mTypeOfArray, mNameToTName, tName, mTypeAccess, mName, mType,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignatureArrayReturn_29_6_perform_greenFBBFBFBFB(TAbstractType tType,
			TMethod tName, MMethodName mName, ArrayType mType, ModelgeneratorRuleResult ruleResult) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MMethodSignature mSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
		int tSignature_upperBound_prime = Integer.valueOf(-1);
		int tSignature_lowerBound_prime = Integer.valueOf(0);
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
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tSignature, tType, tName, mFlowElementToTFlowElement, mName, mSignatureToTSignature,
				mType, mSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodSignatureArrayReturn_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodSignatureArrayReturnImpl
