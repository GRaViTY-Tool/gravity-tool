/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MEntryToTParameter;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodParameterParameterizedType;
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
 * An implementation of the model object '<em><b>Method Parameter Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodParameterParameterizedTypeImpl extends AbstractRuleImpl implements MethodParameterParameterizedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterParameterizedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodParameterParameterizedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess mElementTypeAccess, MEntry mEntry,
			ParameterizedType mParameterizedType, Type mType, MMethodSignature mSignature) {

		Object[] result1_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_0_1_initialbindings_blackBBBBBBB(this, match,
						mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mElementTypeAccess] = " + mElementTypeAccess + ", "
					+ "[mEntry] = " + mEntry + ", " + "[mParameterizedType] = " + mParameterizedType + ", "
					+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match,
						mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mElementTypeAccess] = " + mElementTypeAccess + ", "
					+ "[mEntry] = " + mEntry + ", " + "[mParameterizedType] = " + mParameterizedType + ", "
					+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_0_4_collectelementstobetranslated_blackBBBBBB(match,
							mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mElementTypeAccess] = " + mElementTypeAccess + ", " + "[mEntry] = " + mEntry + ", "
						+ "[mParameterizedType] = " + mParameterizedType + ", " + "[mType] = " + mType + ", "
						+ "[mSignature] = " + mSignature + ".");
			}
			MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_0_4_collectelementstobetranslated_greenBBBBFF(match,
							mEntry, mParameterizedType, mSignature);
			//nothing EMoflonEdge mEntry__mParameterizedType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_0_5_collectcontextelements_blackBBBBBB(match,
							mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mElementTypeAccess] = " + mElementTypeAccess + ", " + "[mEntry] = " + mEntry + ", "
						+ "[mParameterizedType] = " + mParameterizedType + ", " + "[mType] = " + mType + ", "
						+ "[mSignature] = " + mSignature + ".");
			}
			MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_0_5_collectcontextelements_greenBBBBBFFF(match,
							mElementTypeAccess, mParameterizedType, mType, mSignature);
			//nothing EMoflonEdge mElementTypeAccess__mType____type = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mType__mElementTypeAccess____usagesInTypeAccess = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge mParameterizedType__mElementTypeAccess____type = (EMoflonEdge) result5_green[7];

			// 
			MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
							mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature);
			return MethodParameterParameterizedTypeImpl.pattern_MethodParameterParameterizedType_0_7_expressionF();
		} else {
			return MethodParameterParameterizedTypeImpl.pattern_MethodParameterParameterizedType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tSiganture = (TMethodSignature) result1_bindingAndBlack[0];
		TypeAccess mElementTypeAccess = (TypeAccess) result1_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[4];
		ParameterizedType mParameterizedType = (ParameterizedType) result1_bindingAndBlack[5];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[6];
		Type mType = (Type) result1_bindingAndBlack[7];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_1_1_performtransformation_greenBBBFFF(tSiganture,
						tAbstractType, mEntry);
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[3];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[4];
		TParameter tParameter = (TParameter) result1_green[5];

		Object[] result2_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_1_2_collecttranslatedelements_blackBBBB(mEntry,
						mEntryToTParameter, mFlowElementToTFlowElement, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_1_2_collecttranslatedelements_greenFBBBB(mEntry,
						mEntryToTParameter, mFlowElementToTFlowElement, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult,
						tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry, mParameterizedType,
						mEntryToTParameter, mFlowElementToTFlowElement, tParameter, mSignatureToTSignature, mType,
						mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSiganture] = " + tSiganture + ", " + "[mElementTypeAccess] = " + mElementTypeAccess
					+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTAbstractType] = "
					+ mTypeToTAbstractType + ", " + "[mEntry] = " + mEntry + ", " + "[mParameterizedType] = "
					+ mParameterizedType + ", " + "[mEntryToTParameter] = " + mEntryToTParameter + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[tParameter] = "
					+ tParameter + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = "
					+ mType + ", " + "[mSignature] = " + mSignature + ".");
		}
		MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult,
						tSiganture, tAbstractType, mEntry, mParameterizedType, mEntryToTParameter,
						mFlowElementToTFlowElement, tParameter, mSignature);
		//nothing EMoflonEdge mFlowElementToTFlowElement__mEntry____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mEntry__mParameterizedType____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tParameter____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[16];

		// 
		// 
		MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
						tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry, mParameterizedType,
						mEntryToTParameter, mFlowElementToTFlowElement, tParameter, mSignatureToTSignature, mType,
						mSignature);
		return MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess mElementTypeAccess = (TypeAccess) result2_binding[0];
		MEntry mEntry = (MEntry) result2_binding[1];
		ParameterizedType mParameterizedType = (ParameterizedType) result2_binding[2];
		Type mType = (Type) result2_binding[3];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[4];
		for (Object[] result2_black : MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_2_2_corematch_blackFBFFBBFBBB(mElementTypeAccess, mEntry,
						mParameterizedType, mType, mSignature, match)) {
			TMethodSignature tSiganture = (TMethodSignature) result2_black[0];
			TAbstractType tAbstractType = (TAbstractType) result2_black[2];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[3];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_2_3_findcontext_blackBBBBBBBBB(tSiganture,
							mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry, mParameterizedType,
							mSignatureToTSignature, mType, mSignature)) {
				Object[] result3_green = MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFF(tSiganture,
								mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry, mParameterizedType,
								mSignatureToTSignature, mType, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mElementTypeAccess__mType____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mType__mElementTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignatureToTSignature__tSiganture____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mEntry__mParameterizedType____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mParameterizedType__mElementTypeAccess____type = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToTAbstractType__mType____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
								mEntry, mParameterizedType, mSignatureToTSignature, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSiganture] = " + tSiganture
							+ ", " + "[mElementTypeAccess] = " + mElementTypeAccess + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[mTypeToTAbstractType] = " + mTypeToTAbstractType + ", "
							+ "[mEntry] = " + mEntry + ", " + "[mParameterizedType] = " + mParameterizedType + ", "
							+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
							+ ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess mElementTypeAccess, MEntry mEntry,
			ParameterizedType mParameterizedType, Type mType, MMethodSignature mSignature) {
		match.registerObject("mElementTypeAccess", mElementTypeAccess);
		match.registerObject("mEntry", mEntry);
		match.registerObject("mParameterizedType", mParameterizedType);
		match.registerObject("mType", mType);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess mElementTypeAccess, MEntry mEntry,
			ParameterizedType mParameterizedType, Type mType, MMethodSignature mSignature) {// Create CSP
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
			TypeAccess mElementTypeAccess, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			MEntry mEntry, ParameterizedType mParameterizedType, MSignatureToTSignature mSignatureToTSignature,
			Type mType, MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSiganture", tSiganture);
		isApplicableMatch.registerObject("mElementTypeAccess", mElementTypeAccess);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("mParameterizedType", mParameterizedType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tSiganture, EObject mElementTypeAccess,
			EObject tAbstractType, EObject mTypeToTAbstractType, EObject mEntry, EObject mParameterizedType,
			EObject mEntryToTParameter, EObject mFlowElementToTFlowElement, EObject tParameter,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSiganture", tSiganture);
		ruleresult.registerObject("mElementTypeAccess", mElementTypeAccess);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mParameterizedType", mParameterizedType);
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

		Object[] result1_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_10_1_initialbindings_blackBBBBB(this, match, tSiganture,
						tAbstractType, tParameter);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[tParameter] = " + tParameter + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSiganture,
						tAbstractType, tParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[tParameter] = " + tParameter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_10_4_collectelementstobetranslated_blackBBBB(match,
							tSiganture, tAbstractType, tParameter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tParameter] = " + tParameter + ".");
			}
			MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_10_4_collectelementstobetranslated_greenBBBBFF(match,
							tSiganture, tAbstractType, tParameter);
			//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_10_5_collectcontextelements_blackBBBB(match, tSiganture,
							tAbstractType, tParameter);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tParameter] = " + tParameter + ".");
			}
			MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_10_5_collectcontextelements_greenBBB(match, tSiganture,
							tAbstractType);

			// 
			MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tSiganture, tAbstractType, tParameter);
			return MethodParameterParameterizedTypeImpl.pattern_MethodParameterParameterizedType_10_7_expressionF();
		} else {
			return MethodParameterParameterizedTypeImpl.pattern_MethodParameterParameterizedType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tSiganture = (TMethodSignature) result1_bindingAndBlack[0];
		TypeAccess mElementTypeAccess = (TypeAccess) result1_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		ParameterizedType mParameterizedType = (ParameterizedType) result1_bindingAndBlack[4];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[5];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[6];
		Type mType = (Type) result1_bindingAndBlack[7];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_11_1_performtransformation_greenFBFFBB(mParameterizedType,
						tParameter, mSignature);
		MEntry mEntry = (MEntry) result1_green[0];
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];

		Object[] result2_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_11_2_collecttranslatedelements_blackBBBB(mEntry,
						mEntryToTParameter, mFlowElementToTFlowElement, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_11_2_collecttranslatedelements_greenFBBBB(mEntry,
						mEntryToTParameter, mFlowElementToTFlowElement, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult,
						tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry, mParameterizedType,
						mEntryToTParameter, mFlowElementToTFlowElement, tParameter, mSignatureToTSignature, mType,
						mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSiganture] = " + tSiganture + ", " + "[mElementTypeAccess] = " + mElementTypeAccess
					+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTAbstractType] = "
					+ mTypeToTAbstractType + ", " + "[mEntry] = " + mEntry + ", " + "[mParameterizedType] = "
					+ mParameterizedType + ", " + "[mEntryToTParameter] = " + mEntryToTParameter + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[tParameter] = "
					+ tParameter + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = "
					+ mType + ", " + "[mSignature] = " + mSignature + ".");
		}
		MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult,
						tSiganture, tAbstractType, mEntry, mParameterizedType, mEntryToTParameter,
						mFlowElementToTFlowElement, tParameter, mSignature);
		//nothing EMoflonEdge mFlowElementToTFlowElement__mEntry____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mEntry__mParameterizedType____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tParameter____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[16];

		// 
		// 
		MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
						ruleresult, tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry,
						mParameterizedType, mEntryToTParameter, mFlowElementToTFlowElement, tParameter,
						mSignatureToTSignature, mType, mSignature);
		return MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tSiganture = (TMethodSignature) result2_binding[0];
		TAbstractType tAbstractType = (TAbstractType) result2_binding[1];
		TParameter tParameter = (TParameter) result2_binding[2];
		for (Object[] result2_black : MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_12_2_corematch_blackBBFBFFFB(tSiganture, tAbstractType,
						tParameter, match)) {
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[2];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[4];
			Type mType = (Type) result2_black[5];
			MMethodSignature mSignature = (MMethodSignature) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_12_3_findcontext_blackBFBBFBBBB(tSiganture, tAbstractType,
							mTypeToTAbstractType, tParameter, mSignatureToTSignature, mType, mSignature)) {
				TypeAccess mElementTypeAccess = (TypeAccess) result3_black[1];
				ParameterizedType mParameterizedType = (ParameterizedType) result3_black[4];
				Object[] result3_green = MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFF(tSiganture,
								mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mParameterizedType, tParameter,
								mSignatureToTSignature, mType, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mElementTypeAccess__mType____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mType__mElementTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignatureToTSignature__tSiganture____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mParameterizedType__mElementTypeAccess____type = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mTypeToTAbstractType__mType____source = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
								mParameterizedType, tParameter, mSignatureToTSignature, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSiganture] = " + tSiganture
							+ ", " + "[mElementTypeAccess] = " + mElementTypeAccess + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[mTypeToTAbstractType] = " + mTypeToTAbstractType + ", "
							+ "[mParameterizedType] = " + mParameterizedType + ", " + "[tParameter] = " + tParameter
							+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = "
							+ mType + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_12_7_expressionFB(ruleresult);
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
			TypeAccess mElementTypeAccess, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			ParameterizedType mParameterizedType, TParameter tParameter, MSignatureToTSignature mSignatureToTSignature,
			Type mType, MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSiganture", tSiganture);
		isApplicableMatch.registerObject("mElementTypeAccess", mElementTypeAccess);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("mParameterizedType", mParameterizedType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tSiganture, EObject mElementTypeAccess,
			EObject tAbstractType, EObject mTypeToTAbstractType, EObject mEntry, EObject mParameterizedType,
			EObject mEntryToTParameter, EObject mFlowElementToTFlowElement, EObject tParameter,
			EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSiganture", tSiganture);
		ruleresult.registerObject("mElementTypeAccess", mElementTypeAccess);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mParameterizedType", mParameterizedType);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_19(EMoflonEdge _edge_parameters) {

		Object[] result1_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_20_2_testcorematchandDECs_blackFFFB(_edge_parameters)) {
			TMethodSignature tSiganture = (TMethodSignature) result2_black[0];
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			TParameter tParameter = (TParameter) result2_black[2];
			Object[] result2_green = MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tSiganture, tAbstractType, tParameter)) {
				// 
				if (MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_19(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_21_2_testcorematchandDECs_blackFFFFFB(_edge_type)) {
			TypeAccess mElementTypeAccess = (TypeAccess) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[1];
			ParameterizedType mParameterizedType = (ParameterizedType) result2_black[2];
			Type mType = (Type) result2_black[3];
			MMethodSignature mSignature = (MMethodSignature) result2_black[4];
			Object[] result2_green = MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature)) {
				// 
				if (MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodParameterParameterizedType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tParameter", "upperBound", -1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tParameter", "lowerBound", 0, ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("MethodParameterParameterizedType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tParameter", "upperBound", -1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tParameter", "lowerBound", 0, ComparingOperator.EQUAL)) {
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

		Object[] result1_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMethodSignature tSiganture = (TMethodSignature) result2_bindingAndBlack[0];
		TypeAccess mElementTypeAccess = (TypeAccess) result2_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[2];
		MEntry mEntry = (MEntry) result2_bindingAndBlack[3];
		ParameterizedType mParameterizedType = (ParameterizedType) result2_bindingAndBlack[4];
		TParameter tParameter = (TParameter) result2_bindingAndBlack[5];
		Type mType = (Type) result2_bindingAndBlack[6];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, tSiganture,
						mElementTypeAccess, tAbstractType, mEntry, mParameterizedType, tParameter, mType, mSignature,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tSiganture] = " + tSiganture + ", " + "[mElementTypeAccess] = " + mElementTypeAccess + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[mEntry] = " + mEntry + ", "
					+ "[mParameterizedType] = " + mParameterizedType + ", " + "[tParameter] = " + tParameter + ", "
					+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_24_5_matchcorrcontext_blackBBFFBBBB(tSiganture,
							tAbstractType, mType, mSignature, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result5_black[2];
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result5_black[3];
				Object[] result5_green = MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_24_5_matchcorrcontext_greenBBBBF(mTypeToTAbstractType,
								mSignatureToTSignature, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_24_6_createcorrespondence_blackBBBBBBBBB(tSiganture,
								mElementTypeAccess, tAbstractType, mEntry, mParameterizedType, tParameter, mType,
								mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSiganture] = "
							+ tSiganture + ", " + "[mElementTypeAccess] = " + mElementTypeAccess + ", "
							+ "[tAbstractType] = " + tAbstractType + ", " + "[mEntry] = " + mEntry + ", "
							+ "[mParameterizedType] = " + mParameterizedType + ", " + "[tParameter] = " + tParameter
							+ ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_24_6_createcorrespondence_greenBFFBB(mEntry,
								tParameter, ccMatch);
				//nothing MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[1];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[2];

				Object[] result7_black = MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodParameterParameterizedTypeImpl.pattern_MethodParameterParameterizedType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMethodSignature tSiganture, TypeAccess mElementTypeAccess,
			TAbstractType tAbstractType, MEntry mEntry, ParameterizedType mParameterizedType, TParameter tParameter,
			Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess mElementTypeAccess, MEntry mEntry, ParameterizedType mParameterizedType,
			Type mType, MMethodSignature mSignature) {// 
		Object[] result1_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_27_1_matchtggpattern_blackBBBBB(mElementTypeAccess, mEntry,
						mParameterizedType, mType, mSignature);
		if (result1_black != null) {
			return MethodParameterParameterizedTypeImpl.pattern_MethodParameterParameterizedType_27_2_expressionF();
		} else {
			return MethodParameterParameterizedTypeImpl.pattern_MethodParameterParameterizedType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {// 
		Object[] result1_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_28_1_matchtggpattern_blackBBB(tSiganture, tAbstractType,
						tParameter);
		if (result1_black != null) {
			MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_28_1_matchtggpattern_greenB(tParameter);

			return MethodParameterParameterizedTypeImpl.pattern_MethodParameterParameterizedType_28_2_expressionF();
		} else {
			return MethodParameterParameterizedTypeImpl.pattern_MethodParameterParameterizedType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MSignatureToTSignature mSignatureToTSignatureParameter, TypeToTAbstractType mTypeToTAbstractTypeParameter) {

		Object[] result1_black = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_29_2_isapplicablecore_blackFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mSignatureToTSignatureList = (RuleEntryList) result2_black[0];
			TMethodSignature tSiganture = (TMethodSignature) result2_black[1];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[2];
			MMethodSignature mSignature = (MMethodSignature) result2_black[3];
			//nothing RuleEntryList mTypeToTAbstractTypeList = (RuleEntryList) result2_black[4];
			TypeAccess mElementTypeAccess = (TypeAccess) result2_black[5];
			Type mType = (Type) result2_black[6];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result2_black[7];
			TAbstractType tAbstractType = (TAbstractType) result2_black[8];
			ParameterizedType mParameterizedType = (ParameterizedType) result2_black[9];

			Object[] result3_bindingAndBlack = MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
							isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
							mParameterizedType, mSignatureToTSignature, mType, mSignature, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSiganture] = " + tSiganture + ", "
						+ "[mElementTypeAccess] = " + mElementTypeAccess + ", " + "[tAbstractType] = " + tAbstractType
						+ ", " + "[mTypeToTAbstractType] = " + mTypeToTAbstractType + ", " + "[mParameterizedType] = "
						+ mParameterizedType + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
						+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodParameterParameterizedTypeImpl
					.pattern_MethodParameterParameterizedType_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodParameterParameterizedTypeImpl
						.pattern_MethodParameterParameterizedType_29_5_checknacs_blackBBBBBBBB(tSiganture,
								mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mParameterizedType,
								mSignatureToTSignature, mType, mSignature);
				if (result5_black != null) {

					Object[] result6_black = MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_29_6_perform_blackBBBBBBBBB(tSiganture,
									mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mParameterizedType,
									mSignatureToTSignature, mType, mSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSiganture] = "
								+ tSiganture + ", " + "[mElementTypeAccess] = " + mElementTypeAccess + ", "
								+ "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTAbstractType] = "
								+ mTypeToTAbstractType + ", " + "[mParameterizedType] = " + mParameterizedType + ", "
								+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
								+ ", " + "[mSignature] = " + mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterParameterizedTypeImpl
							.pattern_MethodParameterParameterizedType_29_6_perform_greenBBFBFFFBB(tSiganture,
									tAbstractType, mParameterizedType, mSignature, ruleResult);
					//nothing MEntry mEntry = (MEntry) result6_green[2];
					//nothing MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[4];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[5];
					//nothing TParameter tParameter = (TParameter) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return MethodParameterParameterizedTypeImpl
				.pattern_MethodParameterParameterizedType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeAccess mElementTypeAccess, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			ParameterizedType mParameterizedType, MSignatureToTSignature mSignatureToTSignature, Type mType,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSiganture", tSiganture);
		isApplicableMatch.registerObject("mElementTypeAccess", mElementTypeAccess);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTAbstractType", mTypeToTAbstractType);
		isApplicableMatch.registerObject("mParameterizedType", mParameterizedType);
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
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_MENTRY_PARAMETERIZEDTYPE_TYPE_MMETHODSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1), (MEntry) arguments.get(2),
					(ParameterizedType) arguments.get(3), (Type) arguments.get(4), (MMethodSignature) arguments.get(5));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_MENTRY_PARAMETERIZEDTYPE_TYPE_MMETHODSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(MEntry) arguments.get(2), (ParameterizedType) arguments.get(3), (Type) arguments.get(4),
					(MMethodSignature) arguments.get(5));
			return null;
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_MENTRY_PARAMETERIZEDTYPE_TYPE_MMETHODSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(MEntry) arguments.get(2), (ParameterizedType) arguments.get(3), (Type) arguments.get(4),
					(MMethodSignature) arguments.get(5));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TYPEACCESS_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MENTRY_PARAMETERIZEDTYPE_MSIGNATURETOTSIGNATURE_TYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TypeAccess) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (MEntry) arguments.get(5),
					(ParameterizedType) arguments.get(6), (MSignatureToTSignature) arguments.get(7),
					(Type) arguments.get(8), (MMethodSignature) arguments.get(9));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3));
			return null;
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TYPEACCESS_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_PARAMETERIZEDTYPE_TPARAMETER_MSIGNATURETOTSIGNATURE_TYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TypeAccess) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (ParameterizedType) arguments.get(5),
					(TParameter) arguments.get(6), (MSignatureToTSignature) arguments.get(7), (Type) arguments.get(8),
					(MMethodSignature) arguments.get(9));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_19((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_19((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__TMETHODSIGNATURE_TYPEACCESS_TABSTRACTTYPE_MENTRY_PARAMETERIZEDTYPE_TPARAMETER_TYPE_MMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMethodSignature) arguments.get(0), (TypeAccess) arguments.get(1),
					(TAbstractType) arguments.get(2), (MEntry) arguments.get(3), (ParameterizedType) arguments.get(4),
					(TParameter) arguments.get(5), (Type) arguments.get(6), (MMethodSignature) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___CHECK_DEC_FWD__TYPEACCESS_MENTRY_PARAMETERIZEDTYPE_TYPE_MMETHODSIGNATURE:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (MEntry) arguments.get(1),
					(ParameterizedType) arguments.get(2), (Type) arguments.get(3), (MMethodSignature) arguments.get(4));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___CHECK_DEC_BWD__TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TParameter) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MSIGNATURETOTSIGNATURE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (MSignatureToTSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_TYPEACCESS_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_PARAMETERIZEDTYPE_MSIGNATURETOTSIGNATURE_TYPE_MMETHODSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TypeAccess) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (ParameterizedType) arguments.get(5),
					(MSignatureToTSignature) arguments.get(6), (Type) arguments.get(7),
					(MMethodSignature) arguments.get(8), (ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.METHOD_PARAMETER_PARAMETERIZED_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameterParameterizedType_0_1_initialbindings_blackBBBBBBB(
			MethodParameterParameterizedType _this, Match match, TypeAccess mElementTypeAccess, MEntry mEntry,
			ParameterizedType mParameterizedType, Type mType, MMethodSignature mSignature) {
		if (!mParameterizedType.equals(mType)) {
			return new Object[] { _this, match, mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_0_2_SolveCSP_bindingFBBBBBBB(
			MethodParameterParameterizedType _this, Match match, TypeAccess mElementTypeAccess, MEntry mEntry,
			ParameterizedType mParameterizedType, Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mElementTypeAccess, mEntry, mParameterizedType,
				mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mElementTypeAccess, mEntry, mParameterizedType, mType,
					mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			MethodParameterParameterizedType _this, Match match, TypeAccess mElementTypeAccess, MEntry mEntry,
			ParameterizedType mParameterizedType, Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodParameterParameterizedType_0_2_SolveCSP_binding = pattern_MethodParameterParameterizedType_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature);
		if (result_pattern_MethodParameterParameterizedType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterParameterizedType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_0_2_SolveCSP_black = pattern_MethodParameterParameterizedType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterParameterizedType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mElementTypeAccess, mEntry, mParameterizedType, mType,
						mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterParameterizedType_0_3_CheckCSP_expressionFBB(
			MethodParameterParameterizedType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_0_4_collectelementstobetranslated_blackBBBBBB(
			Match match, TypeAccess mElementTypeAccess, MEntry mEntry, ParameterizedType mParameterizedType, Type mType,
			MMethodSignature mSignature) {
		if (!mParameterizedType.equals(mType)) {
			return new Object[] { match, mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, MEntry mEntry, ParameterizedType mParameterizedType, MMethodSignature mSignature) {
		EMoflonEdge mEntry__mParameterizedType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mEntry);
		String mEntry__mParameterizedType____type_name_prime = "type";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mEntry__mParameterizedType____type.setSrc(mEntry);
		mEntry__mParameterizedType____type.setTrg(mParameterizedType);
		match.getToBeTranslatedEdges().add(mEntry__mParameterizedType____type);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		match.getToBeTranslatedEdges().add(mSignature__mEntry____mEntrys);
		mEntry__mParameterizedType____type.setName(mEntry__mParameterizedType____type_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { match, mEntry, mParameterizedType, mSignature, mEntry__mParameterizedType____type,
				mSignature__mEntry____mEntrys };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_0_5_collectcontextelements_blackBBBBBB(
			Match match, TypeAccess mElementTypeAccess, MEntry mEntry, ParameterizedType mParameterizedType, Type mType,
			MMethodSignature mSignature) {
		if (!mParameterizedType.equals(mType)) {
			return new Object[] { match, mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_0_5_collectcontextelements_greenBBBBBFFF(
			Match match, TypeAccess mElementTypeAccess, ParameterizedType mParameterizedType, Type mType,
			MMethodSignature mSignature) {
		EMoflonEdge mElementTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mElementTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParameterizedType__mElementTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mElementTypeAccess);
		match.getContextNodes().add(mParameterizedType);
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mSignature);
		String mElementTypeAccess__mType____type_name_prime = "type";
		String mType__mElementTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mParameterizedType__mElementTypeAccess____type_name_prime = "type";
		mElementTypeAccess__mType____type.setSrc(mElementTypeAccess);
		mElementTypeAccess__mType____type.setTrg(mType);
		match.getContextEdges().add(mElementTypeAccess__mType____type);
		mType__mElementTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mElementTypeAccess____usagesInTypeAccess.setTrg(mElementTypeAccess);
		match.getContextEdges().add(mType__mElementTypeAccess____usagesInTypeAccess);
		mParameterizedType__mElementTypeAccess____type.setSrc(mParameterizedType);
		mParameterizedType__mElementTypeAccess____type.setTrg(mElementTypeAccess);
		match.getContextEdges().add(mParameterizedType__mElementTypeAccess____type);
		mElementTypeAccess__mType____type.setName(mElementTypeAccess__mType____type_name_prime);
		mType__mElementTypeAccess____usagesInTypeAccess
				.setName(mType__mElementTypeAccess____usagesInTypeAccess_name_prime);
		mParameterizedType__mElementTypeAccess____type
				.setName(mParameterizedType__mElementTypeAccess____type_name_prime);
		return new Object[] { match, mElementTypeAccess, mParameterizedType, mType, mSignature,
				mElementTypeAccess__mType____type, mType__mElementTypeAccess____usagesInTypeAccess,
				mParameterizedType__mElementTypeAccess____type };
	}

	public static final void pattern_MethodParameterParameterizedType_0_6_registerobjectstomatch_expressionBBBBBBB(
			MethodParameterParameterizedType _this, Match match, TypeAccess mElementTypeAccess, MEntry mEntry,
			ParameterizedType mParameterizedType, Type mType, MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature);

	}

	public static final boolean pattern_MethodParameterParameterizedType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterParameterizedType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSiganture");
		EObject _localVariable_1 = isApplicableMatch.getObject("mElementTypeAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTAbstractType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_5 = isApplicableMatch.getObject("mParameterizedType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject _localVariable_8 = isApplicableMatch.getObject("mSignature");
		EObject tmpTSiganture = _localVariable_0;
		EObject tmpMElementTypeAccess = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpMTypeToTAbstractType = _localVariable_3;
		EObject tmpMEntry = _localVariable_4;
		EObject tmpMParameterizedType = _localVariable_5;
		EObject tmpMSignatureToTSignature = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		EObject tmpMSignature = _localVariable_8;
		if (tmpTSiganture instanceof TMethodSignature) {
			TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
			if (tmpMElementTypeAccess instanceof TypeAccess) {
				TypeAccess mElementTypeAccess = (TypeAccess) tmpMElementTypeAccess;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpMTypeToTAbstractType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) tmpMTypeToTAbstractType;
						if (tmpMEntry instanceof MEntry) {
							MEntry mEntry = (MEntry) tmpMEntry;
							if (tmpMParameterizedType instanceof ParameterizedType) {
								ParameterizedType mParameterizedType = (ParameterizedType) tmpMParameterizedType;
								if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
									MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
									if (tmpMType instanceof Type) {
										Type mType = (Type) tmpMType;
										if (tmpMSignature instanceof MMethodSignature) {
											MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
											return new Object[] { tSiganture, mElementTypeAccess, tAbstractType,
													mTypeToTAbstractType, mEntry, mParameterizedType,
													mSignatureToTSignature, mType, mSignature, isApplicableMatch };
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

	public static final Object[] pattern_MethodParameterParameterizedType_1_1_performtransformation_blackBBBBBBBBBFBB(
			TMethodSignature tSiganture, TypeAccess mElementTypeAccess, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MEntry mEntry, ParameterizedType mParameterizedType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature,
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch) {
		if (!mParameterizedType.equals(mType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry,
							mParameterizedType, mSignatureToTSignature, mType, mSignature, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding = pattern_MethodParameterParameterizedType_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding != null) {
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding[0];
			TypeAccess mElementTypeAccess = (TypeAccess) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding[3];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding[4];
			ParameterizedType mParameterizedType = (ParameterizedType) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding[5];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding[6];
			Type mType = (Type) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding[7];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_binding[8];

			Object[] result_pattern_MethodParameterParameterizedType_1_1_performtransformation_black = pattern_MethodParameterParameterizedType_1_1_performtransformation_blackBBBBBBBBBFBB(
					tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry, mParameterizedType,
					mSignatureToTSignature, mType, mSignature, _this, isApplicableMatch);
			if (result_pattern_MethodParameterParameterizedType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterParameterizedType_1_1_performtransformation_black[9];

				return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry,
						mParameterizedType, mSignatureToTSignature, mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_1_1_performtransformation_greenBBBFFF(
			TMethodSignature tSiganture, TAbstractType tAbstractType, MEntry mEntry) {
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		int tParameter_upperBound_prime = Integer.valueOf(-1);
		int tParameter_lowerBound_prime = Integer.valueOf(0);
		mEntryToTParameter.setSource(mEntry);
		mFlowElementToTFlowElement.setSource(mEntry);
		tSiganture.getParameters().add(tParameter);
		tParameter.setType(tAbstractType);
		mFlowElementToTFlowElement.setTarget(tParameter);
		mEntryToTParameter.setTarget(tParameter);
		tParameter.setUpperBound(Integer.valueOf(tParameter_upperBound_prime));
		tParameter.setLowerBound(Integer.valueOf(tParameter_lowerBound_prime));
		return new Object[] { tSiganture, tAbstractType, mEntry, mEntryToTParameter, mFlowElementToTFlowElement,
				tParameter };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_1_2_collecttranslatedelements_blackBBBB(
			MEntry mEntry, MEntryToTParameter mEntryToTParameter,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		return new Object[] { mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_1_2_collecttranslatedelements_greenFBBBB(
			MEntry mEntry, MEntryToTParameter mEntryToTParameter,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSiganture, EObject mElementTypeAccess, EObject tAbstractType,
			EObject mTypeToTAbstractType, EObject mEntry, EObject mParameterizedType, EObject mEntryToTParameter,
			EObject mFlowElementToTFlowElement, EObject tParameter, EObject mSignatureToTSignature, EObject mType,
			EObject mSignature) {
		if (!mElementTypeAccess.equals(tSiganture)) {
			if (!mElementTypeAccess.equals(tAbstractType)) {
				if (!mElementTypeAccess.equals(mTypeToTAbstractType)) {
					if (!mElementTypeAccess.equals(mEntry)) {
						if (!mElementTypeAccess.equals(mParameterizedType)) {
							if (!mElementTypeAccess.equals(mEntryToTParameter)) {
								if (!mElementTypeAccess.equals(mFlowElementToTFlowElement)) {
									if (!mElementTypeAccess.equals(tParameter)) {
										if (!mElementTypeAccess.equals(mSignatureToTSignature)) {
											if (!mElementTypeAccess.equals(mType)) {
												if (!mElementTypeAccess.equals(mSignature)) {
													if (!tAbstractType.equals(tSiganture)) {
														if (!tAbstractType.equals(tParameter)) {
															if (!mTypeToTAbstractType.equals(tSiganture)) {
																if (!mTypeToTAbstractType.equals(tAbstractType)) {
																	if (!mTypeToTAbstractType.equals(tParameter)) {
																		if (!mEntry.equals(tSiganture)) {
																			if (!mEntry.equals(tAbstractType)) {
																				if (!mEntry
																						.equals(mTypeToTAbstractType)) {
																					if (!mEntry.equals(
																							mParameterizedType)) {
																						if (!mEntry.equals(
																								mEntryToTParameter)) {
																							if (!mEntry.equals(
																									mFlowElementToTFlowElement)) {
																								if (!mEntry.equals(
																										tParameter)) {
																									if (!mEntry.equals(
																											mSignatureToTSignature)) {
																										if (!mEntry
																												.equals(mType)) {
																											if (!mEntry
																													.equals(mSignature)) {
																												if (!mParameterizedType
																														.equals(tSiganture)) {
																													if (!mParameterizedType
																															.equals(tAbstractType)) {
																														if (!mParameterizedType
																																.equals(mTypeToTAbstractType)) {
																															if (!mParameterizedType
																																	.equals(tParameter)) {
																																if (!mParameterizedType
																																		.equals(mSignatureToTSignature)) {
																																	if (!mParameterizedType
																																			.equals(mType)) {
																																		if (!mParameterizedType
																																				.equals(mSignature)) {
																																			if (!mEntryToTParameter
																																					.equals(tSiganture)) {
																																				if (!mEntryToTParameter
																																						.equals(tAbstractType)) {
																																					if (!mEntryToTParameter
																																							.equals(mTypeToTAbstractType)) {
																																						if (!mEntryToTParameter
																																								.equals(mParameterizedType)) {
																																							if (!mEntryToTParameter
																																									.equals(mFlowElementToTFlowElement)) {
																																								if (!mEntryToTParameter
																																										.equals(tParameter)) {
																																									if (!mEntryToTParameter
																																											.equals(mSignatureToTSignature)) {
																																										if (!mEntryToTParameter
																																												.equals(mType)) {
																																											if (!mEntryToTParameter
																																													.equals(mSignature)) {
																																												if (!mFlowElementToTFlowElement
																																														.equals(tSiganture)) {
																																													if (!mFlowElementToTFlowElement
																																															.equals(tAbstractType)) {
																																														if (!mFlowElementToTFlowElement
																																																.equals(mTypeToTAbstractType)) {
																																															if (!mFlowElementToTFlowElement
																																																	.equals(mParameterizedType)) {
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
																																																								.equals(tAbstractType)) {
																																																							if (!mSignatureToTSignature
																																																									.equals(mTypeToTAbstractType)) {
																																																								if (!mSignatureToTSignature
																																																										.equals(tParameter)) {
																																																									if (!mSignatureToTSignature
																																																											.equals(mType)) {
																																																										if (!mType
																																																												.equals(tSiganture)) {
																																																											if (!mType
																																																													.equals(tAbstractType)) {
																																																												if (!mType
																																																														.equals(mTypeToTAbstractType)) {
																																																													if (!mType
																																																															.equals(tParameter)) {
																																																														if (!mSignature
																																																																.equals(tSiganture)) {
																																																															if (!mSignature
																																																																	.equals(tAbstractType)) {
																																																																if (!mSignature
																																																																		.equals(mTypeToTAbstractType)) {
																																																																	if (!mSignature
																																																																			.equals(tParameter)) {
																																																																		if (!mSignature
																																																																				.equals(mSignatureToTSignature)) {
																																																																			if (!mSignature
																																																																					.equals(mType)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						tSiganture,
																																																																						mElementTypeAccess,
																																																																						tAbstractType,
																																																																						mTypeToTAbstractType,
																																																																						mEntry,
																																																																						mParameterizedType,
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
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodParameterParameterizedType_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSiganture, EObject tAbstractType, EObject mEntry,
			EObject mParameterizedType, EObject mEntryToTParameter, EObject mFlowElementToTFlowElement,
			EObject tParameter, EObject mSignature) {
		EMoflonEdge mFlowElementToTFlowElement__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mParameterizedType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterParameterizedType";
		String mFlowElementToTFlowElement__mEntry____source_name_prime = "source";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String mEntry__mParameterizedType____type_name_prime = "type";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mFlowElementToTFlowElement__tParameter____target_name_prime = "target";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mFlowElementToTFlowElement__mEntry____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mEntry____source);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tSiganture__tParameter____parameters);
		mEntry__mParameterizedType____type.setSrc(mEntry);
		mEntry__mParameterizedType____type.setTrg(mParameterizedType);
		ruleresult.getTranslatedEdges().add(mEntry__mParameterizedType____type);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tParameter__tAbstractType____type);
		mFlowElementToTFlowElement__tParameter____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tParameter____target);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mSignature__mEntry____mEntrys);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mFlowElementToTFlowElement__mEntry____source.setName(mFlowElementToTFlowElement__mEntry____source_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		mEntry__mParameterizedType____type.setName(mEntry__mParameterizedType____type_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mFlowElementToTFlowElement__tParameter____target
				.setName(mFlowElementToTFlowElement__tParameter____target_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { ruleresult, tSiganture, tAbstractType, mEntry, mParameterizedType, mEntryToTParameter,
				mFlowElementToTFlowElement, tParameter, mSignature, mFlowElementToTFlowElement__mEntry____source,
				mEntryToTParameter__mEntry____source, tSiganture__tParameter____parameters,
				mEntry__mParameterizedType____type, tParameter__tAbstractType____type,
				mFlowElementToTFlowElement__tParameter____target, mEntryToTParameter__tParameter____target,
				mSignature__mEntry____mEntrys };
	}

	public static final void pattern_MethodParameterParameterizedType_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodParameterParameterizedType _this, PerformRuleResult ruleresult, EObject tSiganture,
			EObject mElementTypeAccess, EObject tAbstractType, EObject mTypeToTAbstractType, EObject mEntry,
			EObject mParameterizedType, EObject mEntryToTParameter, EObject mFlowElementToTFlowElement,
			EObject tParameter, EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
				mEntry, mParameterizedType, mEntryToTParameter, mFlowElementToTFlowElement, tParameter,
				mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodParameterParameterizedType_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_bindingFB(
			MethodParameterParameterizedType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterParameterizedType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterParameterizedType _this) {
		Object[] result_pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_binding = pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_black = pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameterParameterizedType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mElementTypeAccess");
		EObject _localVariable_1 = match.getObject("mEntry");
		EObject _localVariable_2 = match.getObject("mParameterizedType");
		EObject _localVariable_3 = match.getObject("mType");
		EObject _localVariable_4 = match.getObject("mSignature");
		EObject tmpMElementTypeAccess = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		EObject tmpMParameterizedType = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpMSignature = _localVariable_4;
		if (tmpMElementTypeAccess instanceof TypeAccess) {
			TypeAccess mElementTypeAccess = (TypeAccess) tmpMElementTypeAccess;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (tmpMParameterizedType instanceof ParameterizedType) {
					ParameterizedType mParameterizedType = (ParameterizedType) tmpMParameterizedType;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						if (tmpMSignature instanceof MMethodSignature) {
							MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
							return new Object[] { mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature,
									match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterParameterizedType_2_2_corematch_blackFBFFBBFBBB(
			TypeAccess mElementTypeAccess, MEntry mEntry, ParameterizedType mParameterizedType, Type mType,
			MMethodSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mParameterizedType.equals(mType)) {
			for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
				TSignature tmpTSiganture = mSignatureToTSignature.getTarget();
				if (tmpTSiganture instanceof TMethodSignature) {
					TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
					for (TypeToTAbstractType mTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
						TAbstractType tAbstractType = mTypeToTAbstractType.getTarget();
						if (tAbstractType != null) {
							_result.add(new Object[] { tSiganture, mElementTypeAccess, tAbstractType,
									mTypeToTAbstractType, mEntry, mParameterizedType, mSignatureToTSignature, mType,
									mSignature, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterParameterizedType_2_3_findcontext_blackBBBBBBBBB(
			TMethodSignature tSiganture, TypeAccess mElementTypeAccess, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MEntry mEntry, ParameterizedType mParameterizedType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mParameterizedType.equals(mType)) {
			if (mType.equals(mElementTypeAccess.getType())) {
				if (mSignature.equals(mSignatureToTSignature.getSource())) {
					if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
						if (tAbstractType.equals(mTypeToTAbstractType.getTarget())) {
							if (mParameterizedType.equals(mEntry.getType())) {
								if (mElementTypeAccess.equals(mParameterizedType.getType())) {
									if (mType.equals(mTypeToTAbstractType.getSource())) {
										if (mSignature.getMEntrys().contains(mEntry)) {
											_result.add(new Object[] { tSiganture, mElementTypeAccess, tAbstractType,
													mTypeToTAbstractType, mEntry, mParameterizedType,
													mSignatureToTSignature, mType, mSignature });
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

	public static final Object[] pattern_MethodParameterParameterizedType_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFF(
			TMethodSignature tSiganture, TypeAccess mElementTypeAccess, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, MEntry mEntry, ParameterizedType mParameterizedType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mElementTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mElementTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSiganture____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mParameterizedType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParameterizedType__mElementTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mElementTypeAccess__mType____type_name_prime = "type";
		String mType__mElementTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSiganture____target_name_prime = "target";
		String mTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String mEntry__mParameterizedType____type_name_prime = "type";
		String mParameterizedType__mElementTypeAccess____type_name_prime = "type";
		String mTypeToTAbstractType__mType____source_name_prime = "source";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		isApplicableMatch.getAllContextElements().add(tSiganture);
		isApplicableMatch.getAllContextElements().add(mElementTypeAccess);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(mParameterizedType);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mElementTypeAccess__mType____type.setSrc(mElementTypeAccess);
		mElementTypeAccess__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mElementTypeAccess__mType____type);
		mType__mElementTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mElementTypeAccess____usagesInTypeAccess.setTrg(mElementTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mElementTypeAccess____usagesInTypeAccess);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSiganture____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSiganture____target.setTrg(tSiganture);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSiganture____target);
		mTypeToTAbstractType__tAbstractType____target.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__tAbstractType____target);
		mEntry__mParameterizedType____type.setSrc(mEntry);
		mEntry__mParameterizedType____type.setTrg(mParameterizedType);
		isApplicableMatch.getAllContextElements().add(mEntry__mParameterizedType____type);
		mParameterizedType__mElementTypeAccess____type.setSrc(mParameterizedType);
		mParameterizedType__mElementTypeAccess____type.setTrg(mElementTypeAccess);
		isApplicableMatch.getAllContextElements().add(mParameterizedType__mElementTypeAccess____type);
		mTypeToTAbstractType__mType____source.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__mType____source);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mSignature__mEntry____mEntrys);
		mElementTypeAccess__mType____type.setName(mElementTypeAccess__mType____type_name_prime);
		mType__mElementTypeAccess____usagesInTypeAccess
				.setName(mType__mElementTypeAccess____usagesInTypeAccess_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSiganture____target.setName(mSignatureToTSignature__tSiganture____target_name_prime);
		mTypeToTAbstractType__tAbstractType____target.setName(mTypeToTAbstractType__tAbstractType____target_name_prime);
		mEntry__mParameterizedType____type.setName(mEntry__mParameterizedType____type_name_prime);
		mParameterizedType__mElementTypeAccess____type
				.setName(mParameterizedType__mElementTypeAccess____type_name_prime);
		mTypeToTAbstractType__mType____source.setName(mTypeToTAbstractType__mType____source_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry,
				mParameterizedType, mSignatureToTSignature, mType, mSignature, isApplicableMatch,
				mElementTypeAccess__mType____type, mType__mElementTypeAccess____usagesInTypeAccess,
				mSignatureToTSignature__mSignature____source, mSignatureToTSignature__tSiganture____target,
				mTypeToTAbstractType__tAbstractType____target, mEntry__mParameterizedType____type,
				mParameterizedType__mElementTypeAccess____type, mTypeToTAbstractType__mType____source,
				mSignature__mEntry____mEntrys };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeAccess mElementTypeAccess, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			MEntry mEntry, ParameterizedType mParameterizedType, MSignatureToTSignature mSignatureToTSignature,
			Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tSiganture, mElementTypeAccess,
				tAbstractType, mTypeToTAbstractType, mEntry, mParameterizedType, mSignatureToTSignature, mType,
				mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType,
					mTypeToTAbstractType, mEntry, mParameterizedType, mSignatureToTSignature, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeAccess mElementTypeAccess, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			MEntry mEntry, ParameterizedType mParameterizedType, MSignatureToTSignature mSignatureToTSignature,
			Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodParameterParameterizedType_2_4_solveCSP_binding = pattern_MethodParameterParameterizedType_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mEntry,
				mParameterizedType, mSignatureToTSignature, mType, mSignature);
		if (result_pattern_MethodParameterParameterizedType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterParameterizedType_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_2_4_solveCSP_black = pattern_MethodParameterParameterizedType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterParameterizedType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType,
						mTypeToTAbstractType, mEntry, mParameterizedType, mSignatureToTSignature, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterParameterizedType_2_5_checkCSP_expressionFBB(
			MethodParameterParameterizedType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterParameterizedType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterParameterizedType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_10_1_initialbindings_blackBBBBB(
			MethodParameterParameterizedType _this, Match match, TMethodSignature tSiganture,
			TAbstractType tAbstractType, TParameter tParameter) {
		return new Object[] { _this, match, tSiganture, tAbstractType, tParameter };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_10_2_SolveCSP_bindingFBBBBB(
			MethodParameterParameterizedType _this, Match match, TMethodSignature tSiganture,
			TAbstractType tAbstractType, TParameter tParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSiganture, tAbstractType, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSiganture, tAbstractType, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodParameterParameterizedType _this, Match match, TMethodSignature tSiganture,
			TAbstractType tAbstractType, TParameter tParameter) {
		Object[] result_pattern_MethodParameterParameterizedType_10_2_SolveCSP_binding = pattern_MethodParameterParameterizedType_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSiganture, tAbstractType, tParameter);
		if (result_pattern_MethodParameterParameterizedType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterParameterizedType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_10_2_SolveCSP_black = pattern_MethodParameterParameterizedType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterParameterizedType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSiganture, tAbstractType, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterParameterizedType_10_3_CheckCSP_expressionFBB(
			MethodParameterParameterizedType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		return new Object[] { match, tSiganture, tAbstractType, tParameter };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_10_4_collectelementstobetranslated_greenBBBBFF(
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

	public static final Object[] pattern_MethodParameterParameterizedType_10_5_collectcontextelements_blackBBBB(
			Match match, TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		return new Object[] { match, tSiganture, tAbstractType, tParameter };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_10_5_collectcontextelements_greenBBB(
			Match match, TMethodSignature tSiganture, TAbstractType tAbstractType) {
		match.getContextNodes().add(tSiganture);
		match.getContextNodes().add(tAbstractType);
		return new Object[] { match, tSiganture, tAbstractType };
	}

	public static final void pattern_MethodParameterParameterizedType_10_6_registerobjectstomatch_expressionBBBBB(
			MethodParameterParameterizedType _this, Match match, TMethodSignature tSiganture,
			TAbstractType tAbstractType, TParameter tParameter) {
		_this.registerObjectsToMatch_BWD(match, tSiganture, tAbstractType, tParameter);

	}

	public static final boolean pattern_MethodParameterParameterizedType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterParameterizedType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSiganture");
		EObject _localVariable_1 = isApplicableMatch.getObject("mElementTypeAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTAbstractType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mParameterizedType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject _localVariable_8 = isApplicableMatch.getObject("mSignature");
		EObject tmpTSiganture = _localVariable_0;
		EObject tmpMElementTypeAccess = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpMTypeToTAbstractType = _localVariable_3;
		EObject tmpMParameterizedType = _localVariable_4;
		EObject tmpTParameter = _localVariable_5;
		EObject tmpMSignatureToTSignature = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		EObject tmpMSignature = _localVariable_8;
		if (tmpTSiganture instanceof TMethodSignature) {
			TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
			if (tmpMElementTypeAccess instanceof TypeAccess) {
				TypeAccess mElementTypeAccess = (TypeAccess) tmpMElementTypeAccess;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpMTypeToTAbstractType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) tmpMTypeToTAbstractType;
						if (tmpMParameterizedType instanceof ParameterizedType) {
							ParameterizedType mParameterizedType = (ParameterizedType) tmpMParameterizedType;
							if (tmpTParameter instanceof TParameter) {
								TParameter tParameter = (TParameter) tmpTParameter;
								if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
									MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
									if (tmpMType instanceof Type) {
										Type mType = (Type) tmpMType;
										if (tmpMSignature instanceof MMethodSignature) {
											MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
											return new Object[] { tSiganture, mElementTypeAccess, tAbstractType,
													mTypeToTAbstractType, mParameterizedType, tParameter,
													mSignatureToTSignature, mType, mSignature, isApplicableMatch };
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

	public static final Object[] pattern_MethodParameterParameterizedType_11_1_performtransformation_blackBBBBBBBBBFBB(
			TMethodSignature tSiganture, TypeAccess mElementTypeAccess, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, ParameterizedType mParameterizedType, TParameter tParameter,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature,
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch) {
		if (!mParameterizedType.equals(mType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
							mParameterizedType, tParameter, mSignatureToTSignature, mType, mSignature, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding = pattern_MethodParameterParameterizedType_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding != null) {
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding[0];
			TypeAccess mElementTypeAccess = (TypeAccess) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTAbstractType = (TypeToTAbstractType) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding[3];
			ParameterizedType mParameterizedType = (ParameterizedType) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding[4];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding[5];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding[6];
			Type mType = (Type) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding[7];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_binding[8];

			Object[] result_pattern_MethodParameterParameterizedType_11_1_performtransformation_black = pattern_MethodParameterParameterizedType_11_1_performtransformation_blackBBBBBBBBBFBB(
					tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mParameterizedType, tParameter,
					mSignatureToTSignature, mType, mSignature, _this, isApplicableMatch);
			if (result_pattern_MethodParameterParameterizedType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterParameterizedType_11_1_performtransformation_black[9];

				return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
						mParameterizedType, tParameter, mSignatureToTSignature, mType, mSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_11_1_performtransformation_greenFBFFBB(
			ParameterizedType mParameterizedType, TParameter tParameter, MMethodSignature mSignature) {
		MEntry mEntry = ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mEntry.setType(mParameterizedType);
		mSignature.getMEntrys().add(mEntry);
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		mFlowElementToTFlowElement.setSource(mEntry);
		mFlowElementToTFlowElement.setTarget(tParameter);
		return new Object[] { mEntry, mParameterizedType, mEntryToTParameter, mFlowElementToTFlowElement, tParameter,
				mSignature };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_11_2_collecttranslatedelements_blackBBBB(
			MEntry mEntry, MEntryToTParameter mEntryToTParameter,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		return new Object[] { mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_11_2_collecttranslatedelements_greenFBBBB(
			MEntry mEntry, MEntryToTParameter mEntryToTParameter,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getTranslatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntry, mEntryToTParameter, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSiganture, EObject mElementTypeAccess, EObject tAbstractType,
			EObject mTypeToTAbstractType, EObject mEntry, EObject mParameterizedType, EObject mEntryToTParameter,
			EObject mFlowElementToTFlowElement, EObject tParameter, EObject mSignatureToTSignature, EObject mType,
			EObject mSignature) {
		if (!mElementTypeAccess.equals(tSiganture)) {
			if (!mElementTypeAccess.equals(tAbstractType)) {
				if (!mElementTypeAccess.equals(mTypeToTAbstractType)) {
					if (!mElementTypeAccess.equals(mEntry)) {
						if (!mElementTypeAccess.equals(mParameterizedType)) {
							if (!mElementTypeAccess.equals(mEntryToTParameter)) {
								if (!mElementTypeAccess.equals(mFlowElementToTFlowElement)) {
									if (!mElementTypeAccess.equals(tParameter)) {
										if (!mElementTypeAccess.equals(mSignatureToTSignature)) {
											if (!mElementTypeAccess.equals(mType)) {
												if (!mElementTypeAccess.equals(mSignature)) {
													if (!tAbstractType.equals(tSiganture)) {
														if (!tAbstractType.equals(tParameter)) {
															if (!mTypeToTAbstractType.equals(tSiganture)) {
																if (!mTypeToTAbstractType.equals(tAbstractType)) {
																	if (!mTypeToTAbstractType.equals(tParameter)) {
																		if (!mEntry.equals(tSiganture)) {
																			if (!mEntry.equals(tAbstractType)) {
																				if (!mEntry
																						.equals(mTypeToTAbstractType)) {
																					if (!mEntry.equals(
																							mParameterizedType)) {
																						if (!mEntry.equals(
																								mEntryToTParameter)) {
																							if (!mEntry.equals(
																									mFlowElementToTFlowElement)) {
																								if (!mEntry.equals(
																										tParameter)) {
																									if (!mEntry.equals(
																											mSignatureToTSignature)) {
																										if (!mEntry
																												.equals(mType)) {
																											if (!mEntry
																													.equals(mSignature)) {
																												if (!mParameterizedType
																														.equals(tSiganture)) {
																													if (!mParameterizedType
																															.equals(tAbstractType)) {
																														if (!mParameterizedType
																																.equals(mTypeToTAbstractType)) {
																															if (!mParameterizedType
																																	.equals(tParameter)) {
																																if (!mParameterizedType
																																		.equals(mSignatureToTSignature)) {
																																	if (!mParameterizedType
																																			.equals(mType)) {
																																		if (!mParameterizedType
																																				.equals(mSignature)) {
																																			if (!mEntryToTParameter
																																					.equals(tSiganture)) {
																																				if (!mEntryToTParameter
																																						.equals(tAbstractType)) {
																																					if (!mEntryToTParameter
																																							.equals(mTypeToTAbstractType)) {
																																						if (!mEntryToTParameter
																																								.equals(mParameterizedType)) {
																																							if (!mEntryToTParameter
																																									.equals(mFlowElementToTFlowElement)) {
																																								if (!mEntryToTParameter
																																										.equals(tParameter)) {
																																									if (!mEntryToTParameter
																																											.equals(mSignatureToTSignature)) {
																																										if (!mEntryToTParameter
																																												.equals(mType)) {
																																											if (!mEntryToTParameter
																																													.equals(mSignature)) {
																																												if (!mFlowElementToTFlowElement
																																														.equals(tSiganture)) {
																																													if (!mFlowElementToTFlowElement
																																															.equals(tAbstractType)) {
																																														if (!mFlowElementToTFlowElement
																																																.equals(mTypeToTAbstractType)) {
																																															if (!mFlowElementToTFlowElement
																																																	.equals(mParameterizedType)) {
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
																																																								.equals(tAbstractType)) {
																																																							if (!mSignatureToTSignature
																																																									.equals(mTypeToTAbstractType)) {
																																																								if (!mSignatureToTSignature
																																																										.equals(tParameter)) {
																																																									if (!mSignatureToTSignature
																																																											.equals(mType)) {
																																																										if (!mType
																																																												.equals(tSiganture)) {
																																																											if (!mType
																																																													.equals(tAbstractType)) {
																																																												if (!mType
																																																														.equals(mTypeToTAbstractType)) {
																																																													if (!mType
																																																															.equals(tParameter)) {
																																																														if (!mSignature
																																																																.equals(tSiganture)) {
																																																															if (!mSignature
																																																																	.equals(tAbstractType)) {
																																																																if (!mSignature
																																																																		.equals(mTypeToTAbstractType)) {
																																																																	if (!mSignature
																																																																			.equals(tParameter)) {
																																																																		if (!mSignature
																																																																				.equals(mSignatureToTSignature)) {
																																																																			if (!mSignature
																																																																					.equals(mType)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						tSiganture,
																																																																						mElementTypeAccess,
																																																																						tAbstractType,
																																																																						mTypeToTAbstractType,
																																																																						mEntry,
																																																																						mParameterizedType,
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
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodParameterParameterizedType_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSiganture, EObject tAbstractType, EObject mEntry,
			EObject mParameterizedType, EObject mEntryToTParameter, EObject mFlowElementToTFlowElement,
			EObject tParameter, EObject mSignature) {
		EMoflonEdge mFlowElementToTFlowElement__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mParameterizedType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterParameterizedType";
		String mFlowElementToTFlowElement__mEntry____source_name_prime = "source";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String mEntry__mParameterizedType____type_name_prime = "type";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mFlowElementToTFlowElement__tParameter____target_name_prime = "target";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mFlowElementToTFlowElement__mEntry____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mEntry____source);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(tSiganture__tParameter____parameters);
		mEntry__mParameterizedType____type.setSrc(mEntry);
		mEntry__mParameterizedType____type.setTrg(mParameterizedType);
		ruleresult.getCreatedEdges().add(mEntry__mParameterizedType____type);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tParameter__tAbstractType____type);
		mFlowElementToTFlowElement__tParameter____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tParameter____target);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mSignature__mEntry____mEntrys);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mFlowElementToTFlowElement__mEntry____source.setName(mFlowElementToTFlowElement__mEntry____source_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		mEntry__mParameterizedType____type.setName(mEntry__mParameterizedType____type_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mFlowElementToTFlowElement__tParameter____target
				.setName(mFlowElementToTFlowElement__tParameter____target_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { ruleresult, tSiganture, tAbstractType, mEntry, mParameterizedType, mEntryToTParameter,
				mFlowElementToTFlowElement, tParameter, mSignature, mFlowElementToTFlowElement__mEntry____source,
				mEntryToTParameter__mEntry____source, tSiganture__tParameter____parameters,
				mEntry__mParameterizedType____type, tParameter__tAbstractType____type,
				mFlowElementToTFlowElement__tParameter____target, mEntryToTParameter__tParameter____target,
				mSignature__mEntry____mEntrys };
	}

	public static final void pattern_MethodParameterParameterizedType_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodParameterParameterizedType _this, PerformRuleResult ruleresult, EObject tSiganture,
			EObject mElementTypeAccess, EObject tAbstractType, EObject mTypeToTAbstractType, EObject mEntry,
			EObject mParameterizedType, EObject mEntryToTParameter, EObject mFlowElementToTFlowElement,
			EObject tParameter, EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
				mEntry, mParameterizedType, mEntryToTParameter, mFlowElementToTFlowElement, tParameter,
				mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodParameterParameterizedType_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_bindingFB(
			MethodParameterParameterizedType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_blackFBB(
			EClass eClass, MethodParameterParameterizedType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterParameterizedType _this) {
		Object[] result_pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_binding = pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_black = pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameterParameterizedType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_2_corematch_bindingFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MethodParameterParameterizedType_12_2_corematch_blackBBFBFFFB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tParameter_upperBound = tParameter.getUpperBound();
		if (Integer.valueOf(tParameter_upperBound).equals(Integer.valueOf(-1))) {
			int tParameter_lowerBound = tParameter.getLowerBound();
			if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
				for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tSiganture, MSignatureToTSignature.class, "target")) {
					MSignature tmpMSignature = mSignatureToTSignature.getSource();
					if (tmpMSignature instanceof MMethodSignature) {
						MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
						for (TypeToTAbstractType mTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
							Type mType = mTypeToTAbstractType.getSource();
							if (mType != null) {
								_result.add(new Object[] { tSiganture, tAbstractType, mTypeToTAbstractType, tParameter,
										mSignatureToTSignature, mType, mSignature, match });
							}

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterParameterizedType_12_3_findcontext_blackBFBBFBBBB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			TParameter tParameter, MSignatureToTSignature mSignatureToTSignature, Type mType,
			MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mSignature.equals(mSignatureToTSignature.getSource())) {
			if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
				if (tAbstractType.equals(mTypeToTAbstractType.getTarget())) {
					if (tSiganture.getParameters().contains(tParameter)) {
						if (tAbstractType.equals(tParameter.getType())) {
							if (mType.equals(mTypeToTAbstractType.getSource())) {
								int tParameter_upperBound = tParameter.getUpperBound();
								if (Integer.valueOf(tParameter_upperBound).equals(Integer.valueOf(-1))) {
									int tParameter_lowerBound = tParameter.getLowerBound();
									if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
										for (TypeAccess mElementTypeAccess : mType.getUsagesInTypeAccess()) {
											for (ParameterizedType mParameterizedType : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(mElementTypeAccess,
															ParameterizedType.class, "type")) {
												if (!mParameterizedType.equals(mType)) {
													_result.add(new Object[] { tSiganture, mElementTypeAccess,
															tAbstractType, mTypeToTAbstractType, mParameterizedType,
															tParameter, mSignatureToTSignature, mType, mSignature });
												}
											}
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

	public static final Object[] pattern_MethodParameterParameterizedType_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFF(
			TMethodSignature tSiganture, TypeAccess mElementTypeAccess, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, ParameterizedType mParameterizedType, TParameter tParameter,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mElementTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mElementTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSiganture____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParameterizedType__mElementTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTAbstractType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mElementTypeAccess__mType____type_name_prime = "type";
		String mType__mElementTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSiganture____target_name_prime = "target";
		String mTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mParameterizedType__mElementTypeAccess____type_name_prime = "type";
		String mTypeToTAbstractType__mType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tSiganture);
		isApplicableMatch.getAllContextElements().add(mElementTypeAccess);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(mParameterizedType);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mElementTypeAccess__mType____type.setSrc(mElementTypeAccess);
		mElementTypeAccess__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mElementTypeAccess__mType____type);
		mType__mElementTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mElementTypeAccess____usagesInTypeAccess.setTrg(mElementTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mElementTypeAccess____usagesInTypeAccess);
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
		mParameterizedType__mElementTypeAccess____type.setSrc(mParameterizedType);
		mParameterizedType__mElementTypeAccess____type.setTrg(mElementTypeAccess);
		isApplicableMatch.getAllContextElements().add(mParameterizedType__mElementTypeAccess____type);
		mTypeToTAbstractType__mType____source.setSrc(mTypeToTAbstractType);
		mTypeToTAbstractType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTAbstractType__mType____source);
		mElementTypeAccess__mType____type.setName(mElementTypeAccess__mType____type_name_prime);
		mType__mElementTypeAccess____usagesInTypeAccess
				.setName(mType__mElementTypeAccess____usagesInTypeAccess_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSiganture____target.setName(mSignatureToTSignature__tSiganture____target_name_prime);
		mTypeToTAbstractType__tAbstractType____target.setName(mTypeToTAbstractType__tAbstractType____target_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mParameterizedType__mElementTypeAccess____type
				.setName(mParameterizedType__mElementTypeAccess____type_name_prime);
		mTypeToTAbstractType__mType____source.setName(mTypeToTAbstractType__mType____source_name_prime);
		return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType, mParameterizedType,
				tParameter, mSignatureToTSignature, mType, mSignature, isApplicableMatch,
				mElementTypeAccess__mType____type, mType__mElementTypeAccess____usagesInTypeAccess,
				mSignatureToTSignature__mSignature____source, mSignatureToTSignature__tSiganture____target,
				mTypeToTAbstractType__tAbstractType____target, tSiganture__tParameter____parameters,
				tParameter__tAbstractType____type, mParameterizedType__mElementTypeAccess____type,
				mTypeToTAbstractType__mType____source };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeAccess mElementTypeAccess, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			ParameterizedType mParameterizedType, TParameter tParameter, MSignatureToTSignature mSignatureToTSignature,
			Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tSiganture, mElementTypeAccess,
				tAbstractType, mTypeToTAbstractType, mParameterizedType, tParameter, mSignatureToTSignature, mType,
				mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType,
					mTypeToTAbstractType, mParameterizedType, tParameter, mSignatureToTSignature, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeAccess mElementTypeAccess, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			ParameterizedType mParameterizedType, TParameter tParameter, MSignatureToTSignature mSignatureToTSignature,
			Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodParameterParameterizedType_12_4_solveCSP_binding = pattern_MethodParameterParameterizedType_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
				mParameterizedType, tParameter, mSignatureToTSignature, mType, mSignature);
		if (result_pattern_MethodParameterParameterizedType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterParameterizedType_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_12_4_solveCSP_black = pattern_MethodParameterParameterizedType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterParameterizedType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType,
						mTypeToTAbstractType, mParameterizedType, tParameter, mSignatureToTSignature, mType,
						mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterParameterizedType_12_5_checkCSP_expressionFBB(
			MethodParameterParameterizedType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterParameterizedType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterParameterizedType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_bindingFB(
			MethodParameterParameterizedType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, MethodParameterParameterizedType _this) {
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

	public static final Object[] pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterParameterizedType _this) {
		Object[] result_pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_binding = pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_black = pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterParameterizedType_20_2_testcorematchandDECs_blackFFFB(
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
						int tParameter_upperBound = tParameter.getUpperBound();
						if (Integer.valueOf(tParameter_upperBound).equals(Integer.valueOf(-1))) {
							int tParameter_lowerBound = tParameter.getLowerBound();
							if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
								_result.add(new Object[] { tSiganture, tAbstractType, tParameter, _edge_parameters });
							}

						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterParameterizedType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodParameterParameterizedType _this, Match match, TMethodSignature tSiganture,
			TAbstractType tAbstractType, TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSiganture, tAbstractType, tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterParameterizedType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterParameterizedType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterParameterizedType_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_bindingFB(
			MethodParameterParameterizedType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, MethodParameterParameterizedType _this) {
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

	public static final Object[] pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterParameterizedType _this) {
		Object[] result_pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_binding = pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_black = pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterParameterizedType_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMEntry = _edge_type.getSrc();
		if (tmpMEntry instanceof MEntry) {
			MEntry mEntry = (MEntry) tmpMEntry;
			EObject tmpMParameterizedType = _edge_type.getTrg();
			if (tmpMParameterizedType instanceof ParameterizedType) {
				ParameterizedType mParameterizedType = (ParameterizedType) tmpMParameterizedType;
				if (mParameterizedType.equals(mEntry.getType())) {
					TypeAccess mElementTypeAccess = mParameterizedType.getType();
					if (mElementTypeAccess != null) {
						Type mType = mElementTypeAccess.getType();
						if (mType != null) {
							if (!mParameterizedType.equals(mType)) {
								for (MParameterList tmpMSignature : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(mEntry, MParameterList.class, "mEntrys")) {
									if (tmpMSignature instanceof MMethodSignature) {
										MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
										_result.add(new Object[] { mElementTypeAccess, mEntry, mParameterizedType,
												mType, mSignature, _edge_type });
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

	public static final Object[] pattern_MethodParameterParameterizedType_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterParameterizedType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			MethodParameterParameterizedType _this, Match match, TypeAccess mElementTypeAccess, MEntry mEntry,
			ParameterizedType mParameterizedType, Type mType, MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mElementTypeAccess, mEntry, mParameterizedType, mType,
				mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterParameterizedType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterParameterizedType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterParameterizedType_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_1_prepare_blackB(
			MethodParameterParameterizedType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tSiganture");
		EObject _localVariable_1 = sourceMatch.getObject("mElementTypeAccess");
		EObject _localVariable_2 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_3 = sourceMatch.getObject("mEntry");
		EObject _localVariable_4 = sourceMatch.getObject("mParameterizedType");
		EObject _localVariable_5 = targetMatch.getObject("tParameter");
		EObject _localVariable_6 = sourceMatch.getObject("mType");
		EObject _localVariable_7 = sourceMatch.getObject("mSignature");
		EObject tmpTSiganture = _localVariable_0;
		EObject tmpMElementTypeAccess = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpMEntry = _localVariable_3;
		EObject tmpMParameterizedType = _localVariable_4;
		EObject tmpTParameter = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		EObject tmpMSignature = _localVariable_7;
		if (tmpTSiganture instanceof TMethodSignature) {
			TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
			if (tmpMElementTypeAccess instanceof TypeAccess) {
				TypeAccess mElementTypeAccess = (TypeAccess) tmpMElementTypeAccess;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpMEntry instanceof MEntry) {
						MEntry mEntry = (MEntry) tmpMEntry;
						if (tmpMParameterizedType instanceof ParameterizedType) {
							ParameterizedType mParameterizedType = (ParameterizedType) tmpMParameterizedType;
							if (tmpTParameter instanceof TParameter) {
								TParameter tParameter = (TParameter) tmpTParameter;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									if (tmpMSignature instanceof MMethodSignature) {
										MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
										return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mEntry,
												mParameterizedType, tParameter, mType, mSignature, targetMatch,
												sourceMatch };
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

	public static final Object[] pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
			TMethodSignature tSiganture, TypeAccess mElementTypeAccess, TAbstractType tAbstractType, MEntry mEntry,
			ParameterizedType mParameterizedType, TParameter tParameter, Type mType, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		if (!mParameterizedType.equals(mType)) {
			if (!sourceMatch.equals(targetMatch)) {
				int tParameter_upperBound = tParameter.getUpperBound();
				if (Integer.valueOf(tParameter_upperBound).equals(Integer.valueOf(-1))) {
					int tParameter_lowerBound = tParameter.getLowerBound();
					if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
						return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mEntry, mParameterizedType,
								tParameter, mType, mSignature, sourceMatch, targetMatch };
					}

				}

			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding = pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding != null) {
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding[0];
			TypeAccess mElementTypeAccess = (TypeAccess) result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding[2];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding[3];
			ParameterizedType mParameterizedType = (ParameterizedType) result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding[4];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding[5];
			Type mType = (Type) result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding[6];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_black = pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					tSiganture, mElementTypeAccess, tAbstractType, mEntry, mParameterizedType, tParameter, mType,
					mSignature, sourceMatch, targetMatch);
			if (result_pattern_MethodParameterParameterizedType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mEntry, mParameterizedType,
						tParameter, mType, mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_3_solvecsp_bindingFBBBBBBBBBBB(
			MethodParameterParameterizedType _this, TMethodSignature tSiganture, TypeAccess mElementTypeAccess,
			TAbstractType tAbstractType, MEntry mEntry, ParameterizedType mParameterizedType, TParameter tParameter,
			Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(tSiganture, mElementTypeAccess, tAbstractType, mEntry,
				mParameterizedType, tParameter, mType, mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, tSiganture, mElementTypeAccess, tAbstractType, mEntry, mParameterizedType,
					tParameter, mType, mSignature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			MethodParameterParameterizedType _this, TMethodSignature tSiganture, TypeAccess mElementTypeAccess,
			TAbstractType tAbstractType, MEntry mEntry, ParameterizedType mParameterizedType, TParameter tParameter,
			Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterParameterizedType_24_3_solvecsp_binding = pattern_MethodParameterParameterizedType_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, tSiganture, mElementTypeAccess, tAbstractType, mEntry, mParameterizedType, tParameter, mType,
				mSignature, sourceMatch, targetMatch);
		if (result_pattern_MethodParameterParameterizedType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterParameterizedType_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_24_3_solvecsp_black = pattern_MethodParameterParameterizedType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodParameterParameterizedType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tSiganture, mElementTypeAccess, tAbstractType, mEntry,
						mParameterizedType, tParameter, mType, mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterParameterizedType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterParameterizedType_24_5_matchcorrcontext_blackBBFFBBBB(
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
							_result.add(new Object[] { tSiganture, tAbstractType, mTypeToTAbstractType,
									mSignatureToTSignature, mType, mSignature, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTAbstractType, MSignatureToTSignature mSignatureToTSignature, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodParameterParameterizedType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTAbstractType);
		ccMatch.getAllContextElements().add(mSignatureToTSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTAbstractType, mSignatureToTSignature, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_6_createcorrespondence_blackBBBBBBBBB(
			TMethodSignature tSiganture, TypeAccess mElementTypeAccess, TAbstractType tAbstractType, MEntry mEntry,
			ParameterizedType mParameterizedType, TParameter tParameter, Type mType, MMethodSignature mSignature,
			CCMatch ccMatch) {
		if (!mParameterizedType.equals(mType)) {
			return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mEntry, mParameterizedType, tParameter,
					mType, mSignature, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_6_createcorrespondence_greenBFFBB(
			MEntry mEntry, TParameter tParameter, CCMatch ccMatch) {
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

	public static final Object[] pattern_MethodParameterParameterizedType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodParameterParameterizedType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterParameterizedType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_27_1_matchtggpattern_blackBBBBB(
			TypeAccess mElementTypeAccess, MEntry mEntry, ParameterizedType mParameterizedType, Type mType,
			MMethodSignature mSignature) {
		if (!mParameterizedType.equals(mType)) {
			if (mType.equals(mElementTypeAccess.getType())) {
				if (mParameterizedType.equals(mEntry.getType())) {
					if (mElementTypeAccess.equals(mParameterizedType.getType())) {
						if (mSignature.getMEntrys().contains(mEntry)) {
							return new Object[] { mElementTypeAccess, mEntry, mParameterizedType, mType, mSignature };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterParameterizedType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterParameterizedType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_28_1_matchtggpattern_blackBBB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		if (tSiganture.getParameters().contains(tParameter)) {
			if (tAbstractType.equals(tParameter.getType())) {
				return new Object[] { tSiganture, tAbstractType, tParameter };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_28_1_matchtggpattern_greenB(
			TParameter tParameter) {
		int tParameter_upperBound_prime = Integer.valueOf(-1);
		int tParameter_lowerBound_prime = Integer.valueOf(0);
		tParameter.setUpperBound(Integer.valueOf(tParameter_upperBound_prime));
		tParameter.setLowerBound(Integer.valueOf(tParameter_lowerBound_prime));
		return new Object[] { tParameter };
	}

	public static final boolean pattern_MethodParameterParameterizedType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterParameterizedType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_1_createresult_blackB(
			MethodParameterParameterizedType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tSiganture) {
		if (ruleResult.getTargetObjects().contains(tSiganture)) {
			return new Object[] { ruleResult, tSiganture };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeAccess mElementTypeAccess) {
		if (ruleResult.getSourceObjects().contains(mElementTypeAccess)) {
			return new Object[] { ruleResult, mElementTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTAbstractType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTAbstractType)) {
			return new Object[] { ruleResult, mTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, ParameterizedType mParameterizedType) {
		if (ruleResult.getSourceObjects().contains(mParameterizedType)) {
			return new Object[] { ruleResult, mParameterizedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterParameterizedType_29_2_isapplicablecore_blackFFFFFFFFFFBB(
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
									if (pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, mSignatureToTSignature) == null) {
										if (pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, tSiganture) == null) {
											if (pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_2BB(
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
																if (pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mTypeToTAbstractType) == null) {
																	if (pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, mType) == null) {
																		if (pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_6BB(
																				ruleResult, tAbstractType) == null) {
																			for (TypeAccess mElementTypeAccess : mType
																					.getUsagesInTypeAccess()) {
																				if (pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult,
																						mElementTypeAccess) == null) {
																					for (ParameterizedType mParameterizedType : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									mElementTypeAccess,
																									ParameterizedType.class,
																									"type")) {
																						if (!mParameterizedType
																								.equals(mType)) {
																							if (pattern_MethodParameterParameterizedType_29_2_isapplicablecore_black_nac_7BB(
																									ruleResult,
																									mParameterizedType) == null) {
																								_result.add(
																										new Object[] {
																												mSignatureToTSignatureList,
																												tSiganture,
																												mSignatureToTSignature,
																												mSignature,
																												mTypeToTAbstractTypeList,
																												mElementTypeAccess,
																												mType,
																												mTypeToTAbstractType,
																												tAbstractType,
																												mParameterizedType,
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

	public static final Object[] pattern_MethodParameterParameterizedType_29_3_solveCSP_bindingFBBBBBBBBBBB(
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeAccess mElementTypeAccess, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			ParameterizedType mParameterizedType, MSignatureToTSignature mSignatureToTSignature, Type mType,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tSiganture, mElementTypeAccess,
				tAbstractType, mTypeToTAbstractType, mParameterizedType, mSignatureToTSignature, mType, mSignature,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType,
					mTypeToTAbstractType, mParameterizedType, mSignatureToTSignature, mType, mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodParameterParameterizedType _this, IsApplicableMatch isApplicableMatch, TMethodSignature tSiganture,
			TypeAccess mElementTypeAccess, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTAbstractType,
			ParameterizedType mParameterizedType, MSignatureToTSignature mSignatureToTSignature, Type mType,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameterParameterizedType_29_3_solveCSP_binding = pattern_MethodParameterParameterizedType_29_3_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
				mParameterizedType, mSignatureToTSignature, mType, mSignature, ruleResult);
		if (result_pattern_MethodParameterParameterizedType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterParameterizedType_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterParameterizedType_29_3_solveCSP_black = pattern_MethodParameterParameterizedType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterParameterizedType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSiganture, mElementTypeAccess, tAbstractType,
						mTypeToTAbstractType, mParameterizedType, mSignatureToTSignature, mType, mSignature,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterParameterizedType_29_4_checkCSP_expressionFBB(
			MethodParameterParameterizedType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_5_checknacs_blackBBBBBBBB(
			TMethodSignature tSiganture, TypeAccess mElementTypeAccess, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, ParameterizedType mParameterizedType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature) {
		if (!mParameterizedType.equals(mType)) {
			return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
					mParameterizedType, mSignatureToTSignature, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_6_perform_blackBBBBBBBBB(
			TMethodSignature tSiganture, TypeAccess mElementTypeAccess, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTAbstractType, ParameterizedType mParameterizedType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		if (!mParameterizedType.equals(mType)) {
			return new Object[] { tSiganture, mElementTypeAccess, tAbstractType, mTypeToTAbstractType,
					mParameterizedType, mSignatureToTSignature, mType, mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterParameterizedType_29_6_perform_greenBBFBFFFBB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, ParameterizedType mParameterizedType,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		MEntry mEntry = ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		int tParameter_upperBound_prime = Integer.valueOf(-1);
		int tParameter_lowerBound_prime = Integer.valueOf(0);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mEntry.setType(mParameterizedType);
		mSignature.getMEntrys().add(mEntry);
		ruleResult.getSourceObjects().add(mEntry);
		mEntryToTParameter.setSource(mEntry);
		ruleResult.getCorrObjects().add(mEntryToTParameter);
		mFlowElementToTFlowElement.setSource(mEntry);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		tSiganture.getParameters().add(tParameter);
		tParameter.setType(tAbstractType);
		mFlowElementToTFlowElement.setTarget(tParameter);
		mEntryToTParameter.setTarget(tParameter);
		ruleResult.getTargetObjects().add(tParameter);
		tParameter.setUpperBound(Integer.valueOf(tParameter_upperBound_prime));
		tParameter.setLowerBound(Integer.valueOf(tParameter_lowerBound_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tSiganture, tAbstractType, mEntry, mParameterizedType, mEntryToTParameter,
				mFlowElementToTFlowElement, tParameter, mSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameterParameterizedType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterParameterizedTypeImpl
