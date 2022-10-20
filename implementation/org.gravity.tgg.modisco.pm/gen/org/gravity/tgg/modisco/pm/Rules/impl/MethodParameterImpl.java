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
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MEntryToTParameter;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodParameter;
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
 * An implementation of the model object '<em><b>Method Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodParameterImpl extends AbstractRuleImpl implements MethodParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Type mType, MMethodSignature mSignature, MEntry mEntry) {

		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_0_1_initialbindings_blackBBBBB(this, match,
				mType, mSignature, mEntry);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mEntry] = " + mEntry + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mType, mSignature, mEntry);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mEntry] = " + mEntry + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterImpl.pattern_MethodParameter_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterImpl
					.pattern_MethodParameter_0_4_collectelementstobetranslated_blackBBBB(match, mType, mSignature,
							mEntry);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mType] = " + mType
								+ ", " + "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_0_4_collectelementstobetranslated_greenBBBBFF(match, mType,
					mSignature, mEntry);
			//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodParameterImpl
					.pattern_MethodParameter_0_5_collectcontextelements_blackBBBB(match, mType, mSignature, mEntry);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mType] = " + mType
								+ ", " + "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_0_5_collectcontextelements_greenBBB(match, mType, mSignature);

			// 
			MethodParameterImpl.pattern_MethodParameter_0_6_registerobjectstomatch_expressionBBBBB(this, match, mType,
					mSignature, mEntry);
			return MethodParameterImpl.pattern_MethodParameter_0_7_expressionF();
		} else {
			return MethodParameterImpl.pattern_MethodParameter_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[1];
		Type mType = (Type) result1_bindingAndBlack[2];
		TMethodSignature tSiganture = (TMethodSignature) result1_bindingAndBlack[3];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[4];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[5];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_1_1_performtransformation_greenFBBBFFB(tSiganture, tAbstractType, mEntry, csp);
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[0];
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[4];
		TParameter tParameter = (TParameter) result1_green[5];

		Object[] result2_black = MethodParameterImpl.pattern_MethodParameter_1_2_collecttranslatedelements_blackBBBB(
				mFlowElementToTFlowElement, mEntry, mEntryToTParameter, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mEntry] = " + mEntry + ", " + "[mEntryToTParameter] = "
					+ mEntryToTParameter + ", " + "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterImpl.pattern_MethodParameter_1_2_collecttranslatedelements_greenFBBBB(
				mFlowElementToTFlowElement, mEntry, mEntryToTParameter, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterImpl.pattern_MethodParameter_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mTypeToTType, mSignatureToTSignature, mType, mFlowElementToTFlowElement, tSiganture,
				tAbstractType, mSignature, mEntry, mEntryToTParameter, tParameter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[tParameter] = " + tParameter + ".");
		}
		MethodParameterImpl.pattern_MethodParameter_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, mType,
				mFlowElementToTFlowElement, tSiganture, tAbstractType, mSignature, mEntry, mEntryToTParameter,
				tParameter);
		//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mEntry____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tParameter____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[16];

		// 
		// 
		MethodParameterImpl.pattern_MethodParameter_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mTypeToTType, mSignatureToTSignature, mType, mFlowElementToTFlowElement, tSiganture, tAbstractType,
				mSignature, mEntry, mEntryToTParameter, tParameter);
		return MethodParameterImpl.pattern_MethodParameter_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterImpl.pattern_MethodParameter_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Type mType = (Type) result2_binding[0];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[1];
		MEntry mEntry = (MEntry) result2_binding[2];
		for (Object[] result2_black : MethodParameterImpl.pattern_MethodParameter_2_2_corematch_blackFFBFFBBB(mType,
				mSignature, mEntry, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[1];
			TMethodSignature tSiganture = (TMethodSignature) result2_black[3];
			TAbstractType tAbstractType = (TAbstractType) result2_black[4];
			// ForEach 
			for (Object[] result3_black : MethodParameterImpl.pattern_MethodParameter_2_3_findcontext_blackBBBBBBB(
					mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature, mEntry)) {
				Object[] result3_green = MethodParameterImpl
						.pattern_MethodParameter_2_3_findcontext_greenBBBBBBBFFFFFFF(mTypeToTType,
								mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature, mEntry);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mSignatureToTSignature__tSiganture____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodParameterImpl
						.pattern_MethodParameter_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature,
								mEntry);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = "
							+ mType + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterImpl.pattern_MethodParameter_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodParameterImpl
							.pattern_MethodParameter_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterImpl.pattern_MethodParameter_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Type mType, MMethodSignature mSignature, MEntry mEntry) {
		match.registerObject("mType", mType);
		match.registerObject("mSignature", mSignature);
		match.registerObject("mEntry", mEntry);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type mType, MMethodSignature mSignature, MEntry mEntry) {// Create CSP
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
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, MEntry mEntry) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_tParameter_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tParameter.upperBound", csp);
		var_tParameter_upperBound.setType("int");

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tParameter_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tSiganture", tSiganture);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mEntry", mEntry);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject mSignatureToTSignature,
			EObject mType, EObject mFlowElementToTFlowElement, EObject tSiganture, EObject tAbstractType,
			EObject mSignature, EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("tSiganture", tSiganture);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("tParameter", tParameter);

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

		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_10_1_initialbindings_blackBBBBB(this,
				match, tSiganture, tAbstractType, tParameter);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[tParameter] = " + tParameter + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSiganture, tAbstractType,
						tParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[tParameter] = " + tParameter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterImpl.pattern_MethodParameter_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterImpl
					.pattern_MethodParameter_10_4_collectelementstobetranslated_blackBBBB(match, tSiganture,
							tAbstractType, tParameter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tParameter] = " + tParameter + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_10_4_collectelementstobetranslated_greenBBBBFF(match,
					tSiganture, tAbstractType, tParameter);
			//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodParameterImpl.pattern_MethodParameter_10_5_collectcontextelements_blackBBBB(
					match, tSiganture, tAbstractType, tParameter);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tParameter] = " + tParameter + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_10_5_collectcontextelements_greenBBB(match, tSiganture,
					tAbstractType);

			// 
			MethodParameterImpl.pattern_MethodParameter_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tSiganture, tAbstractType, tParameter);
			return MethodParameterImpl.pattern_MethodParameter_10_7_expressionF();
		} else {
			return MethodParameterImpl.pattern_MethodParameter_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[1];
		Type mType = (Type) result1_bindingAndBlack[2];
		TMethodSignature tSiganture = (TMethodSignature) result1_bindingAndBlack[3];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[4];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[5];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_11_1_performtransformation_greenBFBFFB(mType, mSignature, tParameter);
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[1];
		MEntry mEntry = (MEntry) result1_green[3];
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[4];

		Object[] result2_black = MethodParameterImpl.pattern_MethodParameter_11_2_collecttranslatedelements_blackBBBB(
				mFlowElementToTFlowElement, mEntry, mEntryToTParameter, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mEntry] = " + mEntry + ", " + "[mEntryToTParameter] = "
					+ mEntryToTParameter + ", " + "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterImpl.pattern_MethodParameter_11_2_collecttranslatedelements_greenFBBBB(
				mFlowElementToTFlowElement, mEntry, mEntryToTParameter, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterImpl.pattern_MethodParameter_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mTypeToTType, mSignatureToTSignature, mType, mFlowElementToTFlowElement, tSiganture,
				tAbstractType, mSignature, mEntry, mEntryToTParameter, tParameter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry + ", "
					+ "[mEntryToTParameter] = " + mEntryToTParameter + ", " + "[tParameter] = " + tParameter + ".");
		}
		MethodParameterImpl.pattern_MethodParameter_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, mType,
				mFlowElementToTFlowElement, tSiganture, tAbstractType, mSignature, mEntry, mEntryToTParameter,
				tParameter);
		//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mEntry____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tParameter____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[16];

		// 
		// 
		MethodParameterImpl.pattern_MethodParameter_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mTypeToTType, mSignatureToTSignature, mType, mFlowElementToTFlowElement, tSiganture, tAbstractType,
				mSignature, mEntry, mEntryToTParameter, tParameter);
		return MethodParameterImpl.pattern_MethodParameter_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterImpl.pattern_MethodParameter_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tSiganture = (TMethodSignature) result2_binding[0];
		TAbstractType tAbstractType = (TAbstractType) result2_binding[1];
		TParameter tParameter = (TParameter) result2_binding[2];
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_12_2_corematch_blackFFFBBFBB(tSiganture, tAbstractType, tParameter, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[1];
			Type mType = (Type) result2_black[2];
			MMethodSignature mSignature = (MMethodSignature) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodParameterImpl.pattern_MethodParameter_12_3_findcontext_blackBBBBBBB(
					mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature, tParameter)) {
				Object[] result3_green = MethodParameterImpl
						.pattern_MethodParameter_12_3_findcontext_greenBBBBBBBFFFFFFF(mTypeToTType,
								mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature, tParameter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mSignatureToTSignature__tSiganture____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodParameterImpl
						.pattern_MethodParameter_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature,
								tParameter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = "
							+ mType + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[mSignature] = " + mSignature + ", " + "[tParameter] = "
							+ tParameter + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterImpl.pattern_MethodParameter_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodParameterImpl
							.pattern_MethodParameter_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterImpl.pattern_MethodParameter_12_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, TParameter tParameter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tParameter_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tParameter.upperBound", true,
				csp);
		var_tParameter_upperBound.setValue(tParameter.getUpperBound());
		var_tParameter_upperBound.setType("int");

		// Create unbound variables

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tParameter_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tSiganture", tSiganture);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject mSignatureToTSignature,
			EObject mType, EObject mFlowElementToTFlowElement, EObject tSiganture, EObject tAbstractType,
			EObject mSignature, EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("tSiganture", tSiganture);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("tParameter", tParameter);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_9(EMoflonEdge _edge_parameters) {

		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterImpl.pattern_MethodParameter_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_20_2_testcorematchandDECs_blackFFFB(_edge_parameters)) {
			TMethodSignature tSiganture = (TMethodSignature) result2_black[0];
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			TParameter tParameter = (TParameter) result2_black[2];
			Object[] result2_green = MethodParameterImpl
					.pattern_MethodParameter_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterImpl
					.pattern_MethodParameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tSiganture, tAbstractType, tParameter)) {
				// 
				if (MethodParameterImpl
						.pattern_MethodParameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodParameterImpl
							.pattern_MethodParameter_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterImpl.pattern_MethodParameter_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_11(EMoflonEdge _edge_mEntrys) {

		Object[] result1_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterImpl.pattern_MethodParameter_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_21_2_testcorematchandDECs_blackFFFB(_edge_mEntrys)) {
			Type mType = (Type) result2_black[0];
			MMethodSignature mSignature = (MMethodSignature) result2_black[1];
			MEntry mEntry = (MEntry) result2_black[2];
			Object[] result2_green = MethodParameterImpl
					.pattern_MethodParameter_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterImpl
					.pattern_MethodParameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mType, mSignature, mEntry)) {
				// 
				if (MethodParameterImpl
						.pattern_MethodParameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodParameterImpl
							.pattern_MethodParameter_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterImpl.pattern_MethodParameter_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodParameter");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tParameter", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tParameter_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tParameter", true, csp);
		var_tParameter_upperBound.setValue(__helper.getValue("tParameter", "upperBound"));
		var_tParameter_upperBound.setType("int");

		UpperBound upperBound0 = new UpperBound();
		csp.getConstraints().add(upperBound0);

		upperBound0.setRuleName("MethodParameter");
		upperBound0.solve(var_mType_name, var_tParameter_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tParameter_upperBound.setBound(false);
			upperBound0.solve(var_mType_name, var_tParameter_upperBound);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tParameter", "upperBound", var_tParameter_upperBound.getValue());
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
		ruleResult.setRule("MethodParameter");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tParameter", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tParameter_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tParameter", true, csp);
		var_tParameter_upperBound.setValue(__helper.getValue("tParameter", "upperBound"));
		var_tParameter_upperBound.setType("int");

		UpperBound upperBound0 = new UpperBound();
		csp.getConstraints().add(upperBound0);

		upperBound0.setRuleName("MethodParameter");
		upperBound0.solve(var_mType_name, var_tParameter_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			upperBound0.solve(var_mType_name, var_tParameter_upperBound);
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

		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterImpl.pattern_MethodParameter_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Type mType = (Type) result2_bindingAndBlack[0];
		TMethodSignature tSiganture = (TMethodSignature) result2_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[2];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[3];
		MEntry mEntry = (MEntry) result2_bindingAndBlack[4];
		TParameter tParameter = (TParameter) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mType, tSiganture, tAbstractType,
						mSignature, mEntry, tParameter, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mType] = " + mType + ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry + ", "
					+ "[tParameter] = " + tParameter + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodParameterImpl.pattern_MethodParameter_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodParameterImpl
					.pattern_MethodParameter_24_5_matchcorrcontext_blackFFBBBBBB(mType, tSiganture, tAbstractType,
							mSignature, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result5_black[1];
				Object[] result5_green = MethodParameterImpl.pattern_MethodParameter_24_5_matchcorrcontext_greenBBBBF(
						mTypeToTType, mSignatureToTSignature, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodParameterImpl
						.pattern_MethodParameter_24_6_createcorrespondence_blackBBBBBBB(mType, tSiganture,
								tAbstractType, mSignature, mEntry, tParameter, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mType] = " + mType + ", "
							+ "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", "
							+ "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry + ", " + "[tParameter] = "
							+ tParameter + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterImpl.pattern_MethodParameter_24_6_createcorrespondence_greenFBFBB(mEntry, tParameter,
						ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[0];
				//nothing MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[2];

				Object[] result7_black = MethodParameterImpl
						.pattern_MethodParameter_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterImpl.pattern_MethodParameter_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodParameterImpl.pattern_MethodParameter_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Type mType, TMethodSignature tSiganture, TAbstractType tAbstractType,
			MMethodSignature mSignature, MEntry mEntry, TParameter tParameter, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tParameter_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tParameter.upperBound", true,
				csp);
		var_tParameter_upperBound.setValue(tParameter.getUpperBound());
		var_tParameter_upperBound.setType("int");

		// Create unbound variables

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tParameter_upperBound);
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
	public boolean checkDEC_FWD(Type mType, MMethodSignature mSignature, MEntry mEntry) {// 
		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_27_1_matchtggpattern_blackBBB(mType,
				mSignature, mEntry);
		if (result1_black != null) {
			return MethodParameterImpl.pattern_MethodParameter_27_2_expressionF();
		} else {
			return MethodParameterImpl.pattern_MethodParameter_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {// 
		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_28_1_matchtggpattern_blackBBB(tSiganture,
				tAbstractType, tParameter);
		if (result1_black != null) {
			MethodParameterImpl.pattern_MethodParameter_28_1_matchtggpattern_greenB(tParameter);

			return MethodParameterImpl.pattern_MethodParameter_28_2_expressionF();
		} else {
			return MethodParameterImpl.pattern_MethodParameter_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MSignatureToTSignature mSignatureToTSignatureParameter) {

		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterImpl.pattern_MethodParameter_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TAbstractType tAbstractType = (TAbstractType) result2_black[2];
			Type mType = (Type) result2_black[3];
			//nothing RuleEntryList mSignatureToTSignatureList = (RuleEntryList) result2_black[4];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[5];
			TMethodSignature tSiganture = (TMethodSignature) result2_black[6];
			MMethodSignature mSignature = (MMethodSignature) result2_black[7];

			Object[] result3_bindingAndBlack = MethodParameterImpl
					.pattern_MethodParameter_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mType] = " + mType
						+ ", " + "[tSiganture] = " + tSiganture + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[mSignature] = " + mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodParameterImpl.pattern_MethodParameter_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodParameterImpl.pattern_MethodParameter_29_5_checknacs_blackBBBBBB(
						mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature);
				if (result5_black != null) {

					Object[] result6_black = MethodParameterImpl.pattern_MethodParameter_29_6_perform_blackBBBBBBB(
							mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
								+ "[mType] = " + mType + ", " + "[tSiganture] = " + tSiganture + ", "
								+ "[tAbstractType] = " + tAbstractType + ", " + "[mSignature] = " + mSignature + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_29_6_perform_greenBFBBBFFFBB(mType, tSiganture,
							tAbstractType, mSignature, ruleResult, csp);
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
					//nothing MEntry mEntry = (MEntry) result6_green[5];
					//nothing MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[6];
					//nothing TParameter tParameter = (TParameter) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return MethodParameterImpl.pattern_MethodParameter_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_tParameter_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tParameter.upperBound", csp);
		var_tParameter_upperBound.setType("int");

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tParameter_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tSiganture", tSiganture);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
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
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_FWD__MATCH_TYPE_MMETHODSIGNATURE_MENTRY:
			return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MMethodSignature) arguments.get(2), (MEntry) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_MMETHODSIGNATURE_MENTRY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MMethodSignature) arguments.get(2), (MEntry) arguments.get(3));
			return null;
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_MMETHODSIGNATURE_MENTRY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MMethodSignature) arguments.get(2), (MEntry) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE_TYPE_TMETHODSIGNATURE_TABSTRACTTYPE_MMETHODSIGNATURE_MENTRY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (MSignatureToTSignature) arguments.get(2),
					(Type) arguments.get(3), (TMethodSignature) arguments.get(4), (TAbstractType) arguments.get(5),
					(MMethodSignature) arguments.get(6), (MEntry) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_PARAMETER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3));
			return null;
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE_TYPE_TMETHODSIGNATURE_TABSTRACTTYPE_MMETHODSIGNATURE_TPARAMETER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (MSignatureToTSignature) arguments.get(2),
					(Type) arguments.get(3), (TMethodSignature) arguments.get(4), (TAbstractType) arguments.get(5),
					(MMethodSignature) arguments.get(6), (TParameter) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_PARAMETER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_SOLVE_CSP_CC__TYPE_TMETHODSIGNATURE_TABSTRACTTYPE_MMETHODSIGNATURE_MENTRY_TPARAMETER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Type) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (MMethodSignature) arguments.get(3), (MEntry) arguments.get(4),
					(TParameter) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___CHECK_DEC_FWD__TYPE_MMETHODSIGNATURE_MENTRY:
			return checkDEC_FWD((Type) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___CHECK_DEC_BWD__TMETHODSIGNATURE_TABSTRACTTYPE_TPARAMETER:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TParameter) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MSignatureToTSignature) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE_TYPE_TMETHODSIGNATURE_TABSTRACTTYPE_MMETHODSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (MSignatureToTSignature) arguments.get(2),
					(Type) arguments.get(3), (TMethodSignature) arguments.get(4), (TAbstractType) arguments.get(5),
					(MMethodSignature) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameter_0_1_initialbindings_blackBBBBB(MethodParameter _this,
			Match match, Type mType, MMethodSignature mSignature, MEntry mEntry) {
		return new Object[] { _this, match, mType, mSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameter_0_2_SolveCSP_bindingFBBBBB(MethodParameter _this, Match match,
			Type mType, MMethodSignature mSignature, MEntry mEntry) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mType, mSignature, mEntry);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mType, mSignature, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_0_2_SolveCSP_bindingAndBlackFBBBBB(MethodParameter _this,
			Match match, Type mType, MMethodSignature mSignature, MEntry mEntry) {
		Object[] result_pattern_MethodParameter_0_2_SolveCSP_binding = pattern_MethodParameter_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mType, mSignature, mEntry);
		if (result_pattern_MethodParameter_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameter_0_2_SolveCSP_black = pattern_MethodParameter_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mType, mSignature, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_0_3_CheckCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Type mType, MMethodSignature mSignature, MEntry mEntry) {
		return new Object[] { match, mType, mSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameter_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Type mType, MMethodSignature mSignature, MEntry mEntry) {
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mEntry);
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mEntry__mType____type_name_prime = "type";
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		match.getToBeTranslatedEdges().add(mSignature__mEntry____mEntrys);
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(mEntry__mType____type);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		return new Object[] { match, mType, mSignature, mEntry, mSignature__mEntry____mEntrys, mEntry__mType____type };
	}

	public static final Object[] pattern_MethodParameter_0_5_collectcontextelements_blackBBBB(Match match, Type mType,
			MMethodSignature mSignature, MEntry mEntry) {
		return new Object[] { match, mType, mSignature, mEntry };
	}

	public static final Object[] pattern_MethodParameter_0_5_collectcontextelements_greenBBB(Match match, Type mType,
			MMethodSignature mSignature) {
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mSignature);
		return new Object[] { match, mType, mSignature };
	}

	public static final void pattern_MethodParameter_0_6_registerobjectstomatch_expressionBBBBB(MethodParameter _this,
			Match match, Type mType, MMethodSignature mSignature, MEntry mEntry) {
		_this.registerObjectsToMatch_FWD(match, mType, mSignature, mEntry);

	}

	public static final boolean pattern_MethodParameter_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameter_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tSiganture");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("mEntry");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpMSignatureToTSignature = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpTSiganture = _localVariable_3;
		EObject tmpTAbstractType = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		EObject tmpMEntry = _localVariable_6;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
				if (tmpMType instanceof Type) {
					Type mType = (Type) tmpMType;
					if (tmpTSiganture instanceof TMethodSignature) {
						TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
						if (tmpTAbstractType instanceof TAbstractType) {
							TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
							if (tmpMSignature instanceof MMethodSignature) {
								MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
								if (tmpMEntry instanceof MEntry) {
									MEntry mEntry = (MEntry) tmpMEntry;
									return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture,
											tAbstractType, mSignature, mEntry, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_blackBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTSignature, Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature, MEntry mEntry,
			MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType,
						mSignature, mEntry, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameter_1_1_performtransformation_binding = pattern_MethodParameter_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameter_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodParameter_1_1_performtransformation_binding[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_MethodParameter_1_1_performtransformation_binding[1];
			Type mType = (Type) result_pattern_MethodParameter_1_1_performtransformation_binding[2];
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameter_1_1_performtransformation_binding[3];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameter_1_1_performtransformation_binding[4];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameter_1_1_performtransformation_binding[5];
			MEntry mEntry = (MEntry) result_pattern_MethodParameter_1_1_performtransformation_binding[6];

			Object[] result_pattern_MethodParameter_1_1_performtransformation_black = pattern_MethodParameter_1_1_performtransformation_blackBBBBBBBFBB(
					mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature, mEntry, _this,
					isApplicableMatch);
			if (result_pattern_MethodParameter_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameter_1_1_performtransformation_black[7];

				return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType,
						mSignature, mEntry, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_greenFBBBFFB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, MEntry mEntry, CSP csp) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		int tParameter_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tParameter", "upperBound");
		mFlowElementToTFlowElement.setSource(mEntry);
		mEntryToTParameter.setSource(mEntry);
		tSiganture.getParameters().add(tParameter);
		mEntryToTParameter.setTarget(tParameter);
		mFlowElementToTFlowElement.setTarget(tParameter);
		tParameter.setType(tAbstractType);
		tParameter.setLowerBound(Integer.valueOf(tParameter_lowerBound_prime));
		int tParameter_upperBound_prime = (int) _localVariable_0;
		tParameter.setUpperBound(Integer.valueOf(tParameter_upperBound_prime));
		return new Object[] { mFlowElementToTFlowElement, tSiganture, tAbstractType, mEntry, mEntryToTParameter,
				tParameter, csp };
	}

	public static final Object[] pattern_MethodParameter_1_2_collecttranslatedelements_blackBBBB(
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		return new Object[] { mFlowElementToTFlowElement, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_1_2_collecttranslatedelements_greenFBBBB(
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getTranslatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getCreatedElements().add(tParameter);
		return new Object[] { ruleresult, mFlowElementToTFlowElement, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mSignatureToTSignature, EObject mType,
			EObject mFlowElementToTFlowElement, EObject tSiganture, EObject tAbstractType, EObject mSignature,
			EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		if (!mTypeToTType.equals(tSiganture)) {
			if (!mTypeToTType.equals(tAbstractType)) {
				if (!mTypeToTType.equals(tParameter)) {
					if (!mSignatureToTSignature.equals(mTypeToTType)) {
						if (!mSignatureToTSignature.equals(mType)) {
							if (!mSignatureToTSignature.equals(tSiganture)) {
								if (!mSignatureToTSignature.equals(tAbstractType)) {
									if (!mSignatureToTSignature.equals(tParameter)) {
										if (!mType.equals(mTypeToTType)) {
											if (!mType.equals(tSiganture)) {
												if (!mType.equals(tAbstractType)) {
													if (!mType.equals(tParameter)) {
														if (!mFlowElementToTFlowElement.equals(mTypeToTType)) {
															if (!mFlowElementToTFlowElement
																	.equals(mSignatureToTSignature)) {
																if (!mFlowElementToTFlowElement.equals(mType)) {
																	if (!mFlowElementToTFlowElement
																			.equals(tSiganture)) {
																		if (!mFlowElementToTFlowElement
																				.equals(tAbstractType)) {
																			if (!mFlowElementToTFlowElement
																					.equals(mSignature)) {
																				if (!mFlowElementToTFlowElement
																						.equals(tParameter)) {
																					if (!tAbstractType
																							.equals(tSiganture)) {
																						if (!tAbstractType
																								.equals(tParameter)) {
																							if (!mSignature.equals(
																									mTypeToTType)) {
																								if (!mSignature.equals(
																										mSignatureToTSignature)) {
																									if (!mSignature
																											.equals(mType)) {
																										if (!mSignature
																												.equals(tSiganture)) {
																											if (!mSignature
																													.equals(tAbstractType)) {
																												if (!mSignature
																														.equals(tParameter)) {
																													if (!mEntry
																															.equals(mTypeToTType)) {
																														if (!mEntry
																																.equals(mSignatureToTSignature)) {
																															if (!mEntry
																																	.equals(mType)) {
																																if (!mEntry
																																		.equals(mFlowElementToTFlowElement)) {
																																	if (!mEntry
																																			.equals(tSiganture)) {
																																		if (!mEntry
																																				.equals(tAbstractType)) {
																																			if (!mEntry
																																					.equals(mSignature)) {
																																				if (!mEntry
																																						.equals(mEntryToTParameter)) {
																																					if (!mEntry
																																							.equals(tParameter)) {
																																						if (!mEntryToTParameter
																																								.equals(mTypeToTType)) {
																																							if (!mEntryToTParameter
																																									.equals(mSignatureToTSignature)) {
																																								if (!mEntryToTParameter
																																										.equals(mType)) {
																																									if (!mEntryToTParameter
																																											.equals(mFlowElementToTFlowElement)) {
																																										if (!mEntryToTParameter
																																												.equals(tSiganture)) {
																																											if (!mEntryToTParameter
																																													.equals(tAbstractType)) {
																																												if (!mEntryToTParameter
																																														.equals(mSignature)) {
																																													if (!mEntryToTParameter
																																															.equals(tParameter)) {
																																														if (!tParameter
																																																.equals(tSiganture)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mTypeToTType,
																																																	mSignatureToTSignature,
																																																	mType,
																																																	mFlowElementToTFlowElement,
																																																	tSiganture,
																																																	tAbstractType,
																																																	mSignature,
																																																	mEntry,
																																																	mEntryToTParameter,
																																																	tParameter };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodParameter_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject mType, EObject mFlowElementToTFlowElement, EObject tSiganture,
			EObject tAbstractType, EObject mSignature, EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameter";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mFlowElementToTFlowElement__mEntry____source_name_prime = "source";
		String mEntry__mType____type_name_prime = "type";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String mFlowElementToTFlowElement__tParameter____target_name_prime = "target";
		String tParameter__tAbstractType____type_name_prime = "type";
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tSiganture__tParameter____parameters);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mSignature__mEntry____mEntrys);
		mFlowElementToTFlowElement__mEntry____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mEntry____source);
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mEntry__mType____type);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		mFlowElementToTFlowElement__tParameter____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tParameter____target);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tParameter__tAbstractType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		mFlowElementToTFlowElement__mEntry____source.setName(mFlowElementToTFlowElement__mEntry____source_name_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		mFlowElementToTFlowElement__tParameter____target
				.setName(mFlowElementToTFlowElement__tParameter____target_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		return new Object[] { ruleresult, mType, mFlowElementToTFlowElement, tSiganture, tAbstractType, mSignature,
				mEntry, mEntryToTParameter, tParameter, tSiganture__tParameter____parameters,
				mSignature__mEntry____mEntrys, mFlowElementToTFlowElement__mEntry____source, mEntry__mType____type,
				mEntryToTParameter__mEntry____source, mEntryToTParameter__tParameter____target,
				mFlowElementToTFlowElement__tParameter____target, tParameter__tAbstractType____type };
	}

	public static final void pattern_MethodParameter_1_5_registerobjects_expressionBBBBBBBBBBBB(MethodParameter _this,
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mSignatureToTSignature, EObject mType,
			EObject mFlowElementToTFlowElement, EObject tSiganture, EObject tAbstractType, EObject mSignature,
			EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		_this.registerObjects_FWD(ruleresult, mTypeToTType, mSignatureToTSignature, mType, mFlowElementToTFlowElement,
				tSiganture, tAbstractType, mSignature, mEntry, mEntryToTParameter, tParameter);

	}

	public static final PerformRuleResult pattern_MethodParameter_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_2_1_preparereturnvalue_bindingFB(MethodParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameter _this) {
		Object[] result_pattern_MethodParameter_2_1_preparereturnvalue_binding = pattern_MethodParameter_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameter_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameter_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameter_2_1_preparereturnvalue_black = pattern_MethodParameter_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameter_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameter_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameter_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mType");
		EObject _localVariable_1 = match.getObject("mSignature");
		EObject _localVariable_2 = match.getObject("mEntry");
		EObject tmpMType = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		EObject tmpMEntry = _localVariable_2;
		if (tmpMType instanceof Type) {
			Type mType = (Type) tmpMType;
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				if (tmpMEntry instanceof MEntry) {
					MEntry mEntry = (MEntry) tmpMEntry;
					return new Object[] { mType, mSignature, mEntry, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_2_2_corematch_blackFFBFFBBB(Type mType,
			MMethodSignature mSignature, MEntry mEntry, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
			TAbstractType tAbstractType = mTypeToTType.getTarget();
			if (tAbstractType != null) {
				for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
					TSignature tmpTSiganture = mSignatureToTSignature.getTarget();
					if (tmpTSiganture instanceof TMethodSignature) {
						TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
						_result.add(new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture,
								tAbstractType, mSignature, mEntry, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_2_3_findcontext_blackBBBBBBB(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTSignature, Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature, MEntry mEntry) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
			if (tAbstractType.equals(mTypeToTType.getTarget())) {
				if (mSignature.getMEntrys().contains(mEntry)) {
					if (mType.equals(mEntry.getType())) {
						if (mType.equals(mTypeToTType.getSource())) {
							if (mSignature.equals(mSignatureToTSignature.getSource())) {
								_result.add(new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture,
										tAbstractType, mSignature, mEntry });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameter_2_3_findcontext_greenBBBBBBBFFFFFFF(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTSignature, Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature, MEntry mEntry) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mSignatureToTSignature__tSiganture____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignatureToTSignature__tSiganture____target_name_prime = "target";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mEntry__mType____type_name_prime = "type";
		String mTypeToTType__mType____source_name_prime = "source";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tSiganture);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mEntry);
		mSignatureToTSignature__tSiganture____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSiganture____target.setTrg(tSiganture);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSiganture____target);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mSignature__mEntry____mEntrys);
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mEntry__mType____type);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSiganture____target.setName(mSignatureToTSignature__tSiganture____target_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature,
				mEntry, isApplicableMatch, mSignatureToTSignature__tSiganture____target,
				mTypeToTType__tAbstractType____target, mSignature__mEntry____mEntrys, mEntry__mType____type,
				mTypeToTType__mType____source, mSignatureToTSignature__mSignature____source };
	}

	public static final Object[] pattern_MethodParameter_2_4_solveCSP_bindingFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, MEntry mEntry) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToTType, mSignatureToTSignature,
				mType, tSiganture, tAbstractType, mSignature, mEntry);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mSignatureToTSignature, mType,
					tSiganture, tAbstractType, mSignature, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, MEntry mEntry) {
		Object[] result_pattern_MethodParameter_2_4_solveCSP_binding = pattern_MethodParameter_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType,
				mSignature, mEntry);
		if (result_pattern_MethodParameter_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameter_2_4_solveCSP_black = pattern_MethodParameter_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mSignatureToTSignature, mType,
						tSiganture, tAbstractType, mSignature, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_2_5_checkCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameter_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameter_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_10_1_initialbindings_blackBBBBB(MethodParameter _this,
			Match match, TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		return new Object[] { _this, match, tSiganture, tAbstractType, tParameter };
	}

	public static final Object[] pattern_MethodParameter_10_2_SolveCSP_bindingFBBBBB(MethodParameter _this, Match match,
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSiganture, tAbstractType, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSiganture, tAbstractType, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_10_2_SolveCSP_bindingAndBlackFBBBBB(MethodParameter _this,
			Match match, TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		Object[] result_pattern_MethodParameter_10_2_SolveCSP_binding = pattern_MethodParameter_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSiganture, tAbstractType, tParameter);
		if (result_pattern_MethodParameter_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameter_10_2_SolveCSP_black = pattern_MethodParameter_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSiganture, tAbstractType, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_10_3_CheckCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		return new Object[] { match, tSiganture, tAbstractType, tParameter };
	}

	public static final Object[] pattern_MethodParameter_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
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

	public static final Object[] pattern_MethodParameter_10_5_collectcontextelements_blackBBBB(Match match,
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		return new Object[] { match, tSiganture, tAbstractType, tParameter };
	}

	public static final Object[] pattern_MethodParameter_10_5_collectcontextelements_greenBBB(Match match,
			TMethodSignature tSiganture, TAbstractType tAbstractType) {
		match.getContextNodes().add(tSiganture);
		match.getContextNodes().add(tAbstractType);
		return new Object[] { match, tSiganture, tAbstractType };
	}

	public static final void pattern_MethodParameter_10_6_registerobjectstomatch_expressionBBBBB(MethodParameter _this,
			Match match, TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter) {
		_this.registerObjectsToMatch_BWD(match, tSiganture, tAbstractType, tParameter);

	}

	public static final boolean pattern_MethodParameter_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameter_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tSiganture");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("tParameter");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpMSignatureToTSignature = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpTSiganture = _localVariable_3;
		EObject tmpTAbstractType = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		EObject tmpTParameter = _localVariable_6;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
				if (tmpMType instanceof Type) {
					Type mType = (Type) tmpMType;
					if (tmpTSiganture instanceof TMethodSignature) {
						TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
						if (tmpTAbstractType instanceof TAbstractType) {
							TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
							if (tmpMSignature instanceof MMethodSignature) {
								MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
								if (tmpTParameter instanceof TParameter) {
									TParameter tParameter = (TParameter) tmpTParameter;
									return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture,
											tAbstractType, mSignature, tParameter, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_blackBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTSignature, Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature,
			TParameter tParameter, MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType,
						mSignature, tParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameter_11_1_performtransformation_binding = pattern_MethodParameter_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameter_11_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodParameter_11_1_performtransformation_binding[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_MethodParameter_11_1_performtransformation_binding[1];
			Type mType = (Type) result_pattern_MethodParameter_11_1_performtransformation_binding[2];
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameter_11_1_performtransformation_binding[3];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameter_11_1_performtransformation_binding[4];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameter_11_1_performtransformation_binding[5];
			TParameter tParameter = (TParameter) result_pattern_MethodParameter_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodParameter_11_1_performtransformation_black = pattern_MethodParameter_11_1_performtransformation_blackBBBBBBBFBB(
					mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature, tParameter,
					_this, isApplicableMatch);
			if (result_pattern_MethodParameter_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameter_11_1_performtransformation_black[7];

				return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType,
						mSignature, tParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_greenBFBFFB(Type mType,
			MMethodSignature mSignature, TParameter tParameter) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MEntry mEntry = ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		mFlowElementToTFlowElement.setTarget(tParameter);
		mSignature.getMEntrys().add(mEntry);
		mFlowElementToTFlowElement.setSource(mEntry);
		mEntry.setType(mType);
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		return new Object[] { mType, mFlowElementToTFlowElement, mSignature, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_11_2_collecttranslatedelements_blackBBBB(
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		return new Object[] { mFlowElementToTFlowElement, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_11_2_collecttranslatedelements_greenFBBBB(
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, MEntry mEntry,
			MEntryToTParameter mEntryToTParameter, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getTranslatedElements().add(tParameter);
		return new Object[] { ruleresult, mFlowElementToTFlowElement, mEntry, mEntryToTParameter, tParameter };
	}

	public static final Object[] pattern_MethodParameter_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mSignatureToTSignature, EObject mType,
			EObject mFlowElementToTFlowElement, EObject tSiganture, EObject tAbstractType, EObject mSignature,
			EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		if (!mTypeToTType.equals(tSiganture)) {
			if (!mTypeToTType.equals(tAbstractType)) {
				if (!mTypeToTType.equals(tParameter)) {
					if (!mSignatureToTSignature.equals(mTypeToTType)) {
						if (!mSignatureToTSignature.equals(mType)) {
							if (!mSignatureToTSignature.equals(tSiganture)) {
								if (!mSignatureToTSignature.equals(tAbstractType)) {
									if (!mSignatureToTSignature.equals(tParameter)) {
										if (!mType.equals(mTypeToTType)) {
											if (!mType.equals(tSiganture)) {
												if (!mType.equals(tAbstractType)) {
													if (!mType.equals(tParameter)) {
														if (!mFlowElementToTFlowElement.equals(mTypeToTType)) {
															if (!mFlowElementToTFlowElement
																	.equals(mSignatureToTSignature)) {
																if (!mFlowElementToTFlowElement.equals(mType)) {
																	if (!mFlowElementToTFlowElement
																			.equals(tSiganture)) {
																		if (!mFlowElementToTFlowElement
																				.equals(tAbstractType)) {
																			if (!mFlowElementToTFlowElement
																					.equals(mSignature)) {
																				if (!mFlowElementToTFlowElement
																						.equals(tParameter)) {
																					if (!tAbstractType
																							.equals(tSiganture)) {
																						if (!tAbstractType
																								.equals(tParameter)) {
																							if (!mSignature.equals(
																									mTypeToTType)) {
																								if (!mSignature.equals(
																										mSignatureToTSignature)) {
																									if (!mSignature
																											.equals(mType)) {
																										if (!mSignature
																												.equals(tSiganture)) {
																											if (!mSignature
																													.equals(tAbstractType)) {
																												if (!mSignature
																														.equals(tParameter)) {
																													if (!mEntry
																															.equals(mTypeToTType)) {
																														if (!mEntry
																																.equals(mSignatureToTSignature)) {
																															if (!mEntry
																																	.equals(mType)) {
																																if (!mEntry
																																		.equals(mFlowElementToTFlowElement)) {
																																	if (!mEntry
																																			.equals(tSiganture)) {
																																		if (!mEntry
																																				.equals(tAbstractType)) {
																																			if (!mEntry
																																					.equals(mSignature)) {
																																				if (!mEntry
																																						.equals(mEntryToTParameter)) {
																																					if (!mEntry
																																							.equals(tParameter)) {
																																						if (!mEntryToTParameter
																																								.equals(mTypeToTType)) {
																																							if (!mEntryToTParameter
																																									.equals(mSignatureToTSignature)) {
																																								if (!mEntryToTParameter
																																										.equals(mType)) {
																																									if (!mEntryToTParameter
																																											.equals(mFlowElementToTFlowElement)) {
																																										if (!mEntryToTParameter
																																												.equals(tSiganture)) {
																																											if (!mEntryToTParameter
																																													.equals(tAbstractType)) {
																																												if (!mEntryToTParameter
																																														.equals(mSignature)) {
																																													if (!mEntryToTParameter
																																															.equals(tParameter)) {
																																														if (!tParameter
																																																.equals(tSiganture)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mTypeToTType,
																																																	mSignatureToTSignature,
																																																	mType,
																																																	mFlowElementToTFlowElement,
																																																	tSiganture,
																																																	tAbstractType,
																																																	mSignature,
																																																	mEntry,
																																																	mEntryToTParameter,
																																																	tParameter };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodParameter_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject mType, EObject mFlowElementToTFlowElement, EObject tSiganture,
			EObject tAbstractType, EObject mSignature, EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameter";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mFlowElementToTFlowElement__mEntry____source_name_prime = "source";
		String mEntry__mType____type_name_prime = "type";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String mFlowElementToTFlowElement__tParameter____target_name_prime = "target";
		String tParameter__tAbstractType____type_name_prime = "type";
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(tSiganture__tParameter____parameters);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mSignature__mEntry____mEntrys);
		mFlowElementToTFlowElement__mEntry____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mEntry____source);
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mEntry__mType____type);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		mFlowElementToTFlowElement__tParameter____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tParameter____target);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tParameter__tAbstractType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		mFlowElementToTFlowElement__mEntry____source.setName(mFlowElementToTFlowElement__mEntry____source_name_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		mFlowElementToTFlowElement__tParameter____target
				.setName(mFlowElementToTFlowElement__tParameter____target_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		return new Object[] { ruleresult, mType, mFlowElementToTFlowElement, tSiganture, tAbstractType, mSignature,
				mEntry, mEntryToTParameter, tParameter, tSiganture__tParameter____parameters,
				mSignature__mEntry____mEntrys, mFlowElementToTFlowElement__mEntry____source, mEntry__mType____type,
				mEntryToTParameter__mEntry____source, mEntryToTParameter__tParameter____target,
				mFlowElementToTFlowElement__tParameter____target, tParameter__tAbstractType____type };
	}

	public static final void pattern_MethodParameter_11_5_registerobjects_expressionBBBBBBBBBBBB(MethodParameter _this,
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mSignatureToTSignature, EObject mType,
			EObject mFlowElementToTFlowElement, EObject tSiganture, EObject tAbstractType, EObject mSignature,
			EObject mEntry, EObject mEntryToTParameter, EObject tParameter) {
		_this.registerObjects_BWD(ruleresult, mTypeToTType, mSignatureToTSignature, mType, mFlowElementToTFlowElement,
				tSiganture, tAbstractType, mSignature, mEntry, mEntryToTParameter, tParameter);

	}

	public static final PerformRuleResult pattern_MethodParameter_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_12_1_preparereturnvalue_bindingFB(MethodParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameter _this) {
		Object[] result_pattern_MethodParameter_12_1_preparereturnvalue_binding = pattern_MethodParameter_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameter_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameter_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameter_12_1_preparereturnvalue_black = pattern_MethodParameter_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameter_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameter_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameter_12_2_corematch_bindingFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MethodParameter_12_2_corematch_blackFFFBBFBB(
			TMethodSignature tSiganture, TAbstractType tAbstractType, TParameter tParameter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tParameter_lowerBound = tParameter.getLowerBound();
		if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
			for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tSiganture, MSignatureToTSignature.class, "target")) {
				MSignature tmpMSignature = mSignatureToTSignature.getSource();
				if (tmpMSignature instanceof MMethodSignature) {
					MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
						Type mType = mTypeToTType.getSource();
						if (mType != null) {
							_result.add(new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture,
									tAbstractType, mSignature, tParameter, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_12_3_findcontext_blackBBBBBBB(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTSignature, Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature,
			TParameter tParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tSiganture.getParameters().contains(tParameter)) {
			if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
				if (tAbstractType.equals(mTypeToTType.getTarget())) {
					if (tAbstractType.equals(tParameter.getType())) {
						if (mType.equals(mTypeToTType.getSource())) {
							if (mSignature.equals(mSignatureToTSignature.getSource())) {
								int tParameter_lowerBound = tParameter.getLowerBound();
								if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
									_result.add(new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture,
											tAbstractType, mSignature, tParameter });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameter_12_3_findcontext_greenBBBBBBBFFFFFFF(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTSignature, Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature,
			TParameter tParameter) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSiganture____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String mSignatureToTSignature__tSiganture____target_name_prime = "target";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mTypeToTType__mType____source_name_prime = "source";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tSiganture);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tParameter);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(tSiganture__tParameter____parameters);
		mSignatureToTSignature__tSiganture____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSiganture____target.setTrg(tSiganture);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSiganture____target);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tParameter__tAbstractType____type);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		mSignatureToTSignature__tSiganture____target.setName(mSignatureToTSignature__tSiganture____target_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature,
				tParameter, isApplicableMatch, tSiganture__tParameter____parameters,
				mSignatureToTSignature__tSiganture____target, mTypeToTType__tAbstractType____target,
				tParameter__tAbstractType____type, mTypeToTType__mType____source,
				mSignatureToTSignature__mSignature____source };
	}

	public static final Object[] pattern_MethodParameter_12_4_solveCSP_bindingFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, TParameter tParameter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mTypeToTType, mSignatureToTSignature,
				mType, tSiganture, tAbstractType, mSignature, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mSignatureToTSignature, mType,
					tSiganture, tAbstractType, mSignature, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, TParameter tParameter) {
		Object[] result_pattern_MethodParameter_12_4_solveCSP_binding = pattern_MethodParameter_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType,
				mSignature, tParameter);
		if (result_pattern_MethodParameter_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameter_12_4_solveCSP_black = pattern_MethodParameter_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mSignatureToTSignature, mType,
						tSiganture, tAbstractType, mSignature, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_12_5_checkCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameter_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameter_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_20_1_preparereturnvalue_bindingFB(MethodParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameter _this) {
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

	public static final Object[] pattern_MethodParameter_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameter _this) {
		Object[] result_pattern_MethodParameter_20_1_preparereturnvalue_binding = pattern_MethodParameter_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameter_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameter_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameter_20_1_preparereturnvalue_black = pattern_MethodParameter_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameter_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameter_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameter_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameter_20_2_testcorematchandDECs_blackFFFB(
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
						int tParameter_lowerBound = tParameter.getLowerBound();
						if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
							_result.add(new Object[] { tSiganture, tAbstractType, tParameter, _edge_parameters });
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameter_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodParameter _this, Match match, TMethodSignature tSiganture, TAbstractType tAbstractType,
			TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSiganture, tAbstractType, tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameter_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_21_1_preparereturnvalue_bindingFB(MethodParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameter _this) {
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

	public static final Object[] pattern_MethodParameter_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameter _this) {
		Object[] result_pattern_MethodParameter_21_1_preparereturnvalue_binding = pattern_MethodParameter_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameter_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameter_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameter_21_1_preparereturnvalue_black = pattern_MethodParameter_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameter_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameter_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameter_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameter_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mEntrys) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSignature = _edge_mEntrys.getSrc();
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			EObject tmpMEntry = _edge_mEntrys.getTrg();
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (mSignature.getMEntrys().contains(mEntry)) {
					Type mType = mEntry.getType();
					if (mType != null) {
						_result.add(new Object[] { mType, mSignature, mEntry, _edge_mEntrys });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameter_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodParameter _this, Match match, Type mType, MMethodSignature mSignature, MEntry mEntry) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mType, mSignature, mEntry);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameter_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_24_1_prepare_blackB(MethodParameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameter_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodParameter_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mType");
		EObject _localVariable_1 = targetMatch.getObject("tSiganture");
		EObject _localVariable_2 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_3 = sourceMatch.getObject("mSignature");
		EObject _localVariable_4 = sourceMatch.getObject("mEntry");
		EObject _localVariable_5 = targetMatch.getObject("tParameter");
		EObject tmpMType = _localVariable_0;
		EObject tmpTSiganture = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpMSignature = _localVariable_3;
		EObject tmpMEntry = _localVariable_4;
		EObject tmpTParameter = _localVariable_5;
		if (tmpMType instanceof Type) {
			Type mType = (Type) tmpMType;
			if (tmpTSiganture instanceof TMethodSignature) {
				TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpMSignature instanceof MMethodSignature) {
						MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
						if (tmpMEntry instanceof MEntry) {
							MEntry mEntry = (MEntry) tmpMEntry;
							if (tmpTParameter instanceof TParameter) {
								TParameter tParameter = (TParameter) tmpTParameter;
								return new Object[] { mType, tSiganture, tAbstractType, mSignature, mEntry, tParameter,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_24_2_matchsrctrgcontext_blackBBBBBBBB(Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature, MEntry mEntry,
			TParameter tParameter, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tParameter_lowerBound = tParameter.getLowerBound();
			if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
				return new Object[] { mType, tSiganture, tAbstractType, mSignature, mEntry, tParameter, sourceMatch,
						targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding = pattern_MethodParameter_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding != null) {
			Type mType = (Type) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[0];
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[2];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[3];
			MEntry mEntry = (MEntry) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[4];
			TParameter tParameter = (TParameter) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MethodParameter_24_2_matchsrctrgcontext_black = pattern_MethodParameter_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mType, tSiganture, tAbstractType, mSignature, mEntry, tParameter, sourceMatch, targetMatch);
			if (result_pattern_MethodParameter_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mType, tSiganture, tAbstractType, mSignature, mEntry, tParameter, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_24_3_solvecsp_bindingFBBBBBBBBB(MethodParameter _this,
			Type mType, TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature,
			MEntry mEntry, TParameter tParameter, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mType, tSiganture, tAbstractType, mSignature, mEntry,
				tParameter, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mType, tSiganture, tAbstractType, mSignature, mEntry, tParameter,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(MethodParameter _this,
			Type mType, TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature,
			MEntry mEntry, TParameter tParameter, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameter_24_3_solvecsp_binding = pattern_MethodParameter_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mType, tSiganture, tAbstractType, mSignature, mEntry, tParameter, sourceMatch, targetMatch);
		if (result_pattern_MethodParameter_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodParameter_24_3_solvecsp_black = pattern_MethodParameter_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodParameter_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mType, tSiganture, tAbstractType, mSignature, mEntry, tParameter,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_24_5_matchcorrcontext_blackFFBBBBBB(Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tSiganture, MSignatureToTSignature.class, "target")) {
				if (mSignature.equals(mSignatureToTSignature.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
						if (mType.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture,
									tAbstractType, mSignature, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameter_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTSignature, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodParameter";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mSignatureToTSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mSignatureToTSignature, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodParameter_24_6_createcorrespondence_blackBBBBBBB(Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature, MEntry mEntry,
			TParameter tParameter, CCMatch ccMatch) {
		return new Object[] { mType, tSiganture, tAbstractType, mSignature, mEntry, tParameter, ccMatch };
	}

	public static final Object[] pattern_MethodParameter_24_6_createcorrespondence_greenFBFBB(MEntry mEntry,
			TParameter tParameter, CCMatch ccMatch) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		mFlowElementToTFlowElement.setSource(mEntry);
		mFlowElementToTFlowElement.setTarget(tParameter);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		mEntryToTParameter.setSource(mEntry);
		mEntryToTParameter.setTarget(tParameter);
		ccMatch.getCreateCorr().add(mEntryToTParameter);
		return new Object[] { mFlowElementToTFlowElement, mEntry, mEntryToTParameter, tParameter, ccMatch };
	}

	public static final Object[] pattern_MethodParameter_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodParameter_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodParameter";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameter_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodParameter_27_1_matchtggpattern_blackBBB(Type mType,
			MMethodSignature mSignature, MEntry mEntry) {
		if (mSignature.getMEntrys().contains(mEntry)) {
			if (mType.equals(mEntry.getType())) {
				return new Object[] { mType, mSignature, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameter_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_28_1_matchtggpattern_blackBBB(TMethodSignature tSiganture,
			TAbstractType tAbstractType, TParameter tParameter) {
		if (tSiganture.getParameters().contains(tParameter)) {
			if (tAbstractType.equals(tParameter.getType())) {
				return new Object[] { tSiganture, tAbstractType, tParameter };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_28_1_matchtggpattern_greenB(TParameter tParameter) {
		int tParameter_lowerBound_prime = Integer.valueOf(0);
		tParameter.setLowerBound(Integer.valueOf(tParameter_lowerBound_prime));
		return new Object[] { tParameter };
	}

	public static final boolean pattern_MethodParameter_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameter_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_29_1_createresult_blackB(MethodParameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameter_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tSiganture) {
		if (ruleResult.getTargetObjects().contains(tSiganture)) {
			return new Object[] { ruleResult, tSiganture };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mSignatureToTSignatureList : ruleEntryContainer.getRuleEntryList()) {
				if (!mSignatureToTSignatureList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							TAbstractType tAbstractType = mTypeToTType.getTarget();
							if (tAbstractType != null) {
								Type mType = mTypeToTType.getSource();
								if (mType != null) {
									if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mTypeToTType) == null) {
										if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												tAbstractType) == null) {
											if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													mType) == null) {
												for (EObject tmpMSignatureToTSignature : mSignatureToTSignatureList
														.getEntryObjects()) {
													if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
														MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
														TSignature tmpTSiganture = mSignatureToTSignature.getTarget();
														if (tmpTSiganture instanceof TMethodSignature) {
															TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
															MSignature tmpMSignature = mSignatureToTSignature
																	.getSource();
															if (tmpMSignature instanceof MMethodSignature) {
																MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
																if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, mSignatureToTSignature) == null) {
																	if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, tSiganture) == null) {
																		if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mSignature) == null) {
																			_result.add(new Object[] { mTypeToTTypeList,
																					mTypeToTType, tAbstractType, mType,
																					mSignatureToTSignatureList,
																					mSignatureToTSignature, tSiganture,
																					mSignature, ruleEntryContainer,
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

	public static final Object[] pattern_MethodParameter_29_3_solveCSP_bindingFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, mSignatureToTSignature,
				mType, tSiganture, tAbstractType, mSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mSignatureToTSignature, mType,
					tSiganture, tAbstractType, mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameter_29_3_solveCSP_binding = pattern_MethodParameter_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType,
				mSignature, ruleResult);
		if (result_pattern_MethodParameter_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameter_29_3_solveCSP_black = pattern_MethodParameter_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mSignatureToTSignature, mType,
						tSiganture, tAbstractType, mSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_29_4_checkCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_29_5_checknacs_blackBBBBBB(TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature) {
		return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature };
	}

	public static final Object[] pattern_MethodParameter_29_6_perform_blackBBBBBBB(TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Type mType, TMethodSignature tSiganture,
			TAbstractType tAbstractType, MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mTypeToTType, mSignatureToTSignature, mType, tSiganture, tAbstractType, mSignature,
				ruleResult };
	}

	public static final Object[] pattern_MethodParameter_29_6_perform_greenBFBBBFFFBB(Type mType,
			TMethodSignature tSiganture, TAbstractType tAbstractType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MEntry mEntry = ModiscoFactory.eINSTANCE.createMEntry();
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		int tParameter_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tParameter", "upperBound");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		mSignature.getMEntrys().add(mEntry);
		mFlowElementToTFlowElement.setSource(mEntry);
		mEntry.setType(mType);
		ruleResult.getSourceObjects().add(mEntry);
		mEntryToTParameter.setSource(mEntry);
		ruleResult.getCorrObjects().add(mEntryToTParameter);
		tSiganture.getParameters().add(tParameter);
		mEntryToTParameter.setTarget(tParameter);
		mFlowElementToTFlowElement.setTarget(tParameter);
		tParameter.setType(tAbstractType);
		ruleResult.getTargetObjects().add(tParameter);
		tParameter.setLowerBound(Integer.valueOf(tParameter_lowerBound_prime));
		int tParameter_upperBound_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tParameter.setUpperBound(Integer.valueOf(tParameter_upperBound_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mType, mFlowElementToTFlowElement, tSiganture, tAbstractType, mSignature, mEntry,
				mEntryToTParameter, tParameter, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameter_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterImpl
