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
	public boolean isAppropriate_FWD(Match match, MMethodSignature mSignature, MEntry mEntry, Type mType) {

		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_0_1_initialbindings_blackBBBBB(this, match,
				mSignature, mEntry, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry
					+ ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mSignature, mEntry, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry
					+ ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterImpl.pattern_MethodParameter_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterImpl
					.pattern_MethodParameter_0_4_collectelementstobetranslated_blackBBBB(match, mSignature, mEntry,
							mType);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mSignature] = "
								+ mSignature + ", " + "[mEntry] = " + mEntry + ", " + "[mType] = " + mType + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_0_4_collectelementstobetranslated_greenBBBBFF(match, mSignature,
					mEntry, mType);
			//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodParameterImpl
					.pattern_MethodParameter_0_5_collectcontextelements_blackBBBB(match, mSignature, mEntry, mType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mSignature] = "
								+ mSignature + ", " + "[mEntry] = " + mEntry + ", " + "[mType] = " + mType + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_0_5_collectcontextelements_greenBBB(match, mSignature, mType);

			// 
			MethodParameterImpl.pattern_MethodParameter_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					mSignature, mEntry, mType);
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
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[0];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[1];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		TMethodSignature tSiganture = (TMethodSignature) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_1_1_performtransformation_greenFBFBFBB(mEntry, tAbstractType, tSiganture, csp);
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[2];
		TParameter tParameter = (TParameter) result1_green[4];

		Object[] result2_black = MethodParameterImpl.pattern_MethodParameter_1_2_collecttranslatedelements_blackBBBB(
				mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mEntryToTParameter] = "
					+ mEntryToTParameter + ", " + "[mEntry] = " + mEntry + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterImpl.pattern_MethodParameter_1_2_collecttranslatedelements_greenFBBBB(
				mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterImpl.pattern_MethodParameter_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mSignature, mEntryToTParameter, mEntry, mSignatureToTSignature, mTypeToTType,
				mFlowElementToTFlowElement, tAbstractType, tParameter, mType, tSiganture);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mEntryToTParameter] = " + mEntryToTParameter
					+ ", " + "[mEntry] = " + mEntry + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[tParameter] = " + tParameter + ", " + "[mType] = " + mType + ", " + "[tSiganture] = "
					+ tSiganture + ".");
		}
		MethodParameterImpl.pattern_MethodParameter_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult,
				mSignature, mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tAbstractType, tParameter, mType,
				tSiganture);
		//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mEntry____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tParameter____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[16];

		// 
		// 
		MethodParameterImpl.pattern_MethodParameter_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mSignature, mEntryToTParameter, mEntry, mSignatureToTSignature, mTypeToTType,
				mFlowElementToTFlowElement, tAbstractType, tParameter, mType, tSiganture);
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
		MMethodSignature mSignature = (MMethodSignature) result2_binding[0];
		MEntry mEntry = (MEntry) result2_binding[1];
		Type mType = (Type) result2_binding[2];
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_2_2_corematch_blackBBFFFBFB(mSignature, mEntry, mType, match)) {
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			TAbstractType tAbstractType = (TAbstractType) result2_black[4];
			TMethodSignature tSiganture = (TMethodSignature) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodParameterImpl.pattern_MethodParameter_2_3_findcontext_blackBBBBBBB(
					mSignature, mEntry, mSignatureToTSignature, mTypeToTType, tAbstractType, mType, tSiganture)) {
				Object[] result3_green = MethodParameterImpl
						.pattern_MethodParameter_2_3_findcontext_greenBBBBBBBFFFFFFF(mSignature, mEntry,
								mSignatureToTSignature, mTypeToTType, tAbstractType, mType, tSiganture);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignatureToTSignature__tSiganture____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodParameterImpl
						.pattern_MethodParameter_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mSignature, mEntry, mSignatureToTSignature, mTypeToTType, tAbstractType, mType,
								tSiganture);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignature] = " + mSignature
							+ ", " + "[mEntry] = " + mEntry + ", " + "[mSignatureToTSignature] = "
							+ mSignatureToTSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
							+ "[tAbstractType] = " + tAbstractType + ", " + "[mType] = " + mType + ", "
							+ "[tSiganture] = " + tSiganture + ".");
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
	public void registerObjectsToMatch_FWD(Match match, MMethodSignature mSignature, MEntry mEntry, Type mType) {
		match.registerObject("mSignature", mSignature);
		match.registerObject("mEntry", mEntry);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodSignature mSignature, MEntry mEntry, Type mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			MEntry mEntry, MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture) {// Create CSP
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
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tSiganture", tSiganture);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mSignature, EObject mEntryToTParameter,
			EObject mEntry, EObject mSignatureToTSignature, EObject mTypeToTType, EObject mFlowElementToTFlowElement,
			EObject tAbstractType, EObject tParameter, EObject mType, EObject tSiganture) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tSiganture", tSiganture);

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
	public boolean isAppropriate_BWD(Match match, TAbstractType tAbstractType, TParameter tParameter,
			TMethodSignature tSiganture) {

		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_10_1_initialbindings_blackBBBBB(this,
				match, tAbstractType, tParameter, tSiganture);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tParameter] = "
					+ tParameter + ", " + "[tSiganture] = " + tSiganture + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAbstractType, tParameter,
						tSiganture);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tParameter] = "
					+ tParameter + ", " + "[tSiganture] = " + tSiganture + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterImpl.pattern_MethodParameter_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterImpl
					.pattern_MethodParameter_10_4_collectelementstobetranslated_blackBBBB(match, tAbstractType,
							tParameter, tSiganture);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[tParameter] = " + tParameter + ", "
						+ "[tSiganture] = " + tSiganture + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_10_4_collectelementstobetranslated_greenBBBBFF(match,
					tAbstractType, tParameter, tSiganture);
			//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodParameterImpl.pattern_MethodParameter_10_5_collectcontextelements_blackBBBB(
					match, tAbstractType, tParameter, tSiganture);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[tParameter] = " + tParameter + ", "
						+ "[tSiganture] = " + tSiganture + ".");
			}
			MethodParameterImpl.pattern_MethodParameter_10_5_collectcontextelements_greenBBB(match, tAbstractType,
					tSiganture);

			// 
			MethodParameterImpl.pattern_MethodParameter_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tAbstractType, tParameter, tSiganture);
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
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[0];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[1];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[3];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		TMethodSignature tSiganture = (TMethodSignature) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodParameterImpl
				.pattern_MethodParameter_11_1_performtransformation_greenBFFFBB(mSignature, tParameter, mType);
		MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result1_green[1];
		MEntry mEntry = (MEntry) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];

		Object[] result2_black = MethodParameterImpl.pattern_MethodParameter_11_2_collecttranslatedelements_blackBBBB(
				mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mEntryToTParameter] = "
					+ mEntryToTParameter + ", " + "[mEntry] = " + mEntry + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tParameter] = " + tParameter + ".");
		}
		Object[] result2_green = MethodParameterImpl.pattern_MethodParameter_11_2_collecttranslatedelements_greenFBBBB(
				mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterImpl.pattern_MethodParameter_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mSignature, mEntryToTParameter, mEntry, mSignatureToTSignature, mTypeToTType,
				mFlowElementToTFlowElement, tAbstractType, tParameter, mType, tSiganture);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mEntryToTParameter] = " + mEntryToTParameter
					+ ", " + "[mEntry] = " + mEntry + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[tParameter] = " + tParameter + ", " + "[mType] = " + mType + ", " + "[tSiganture] = "
					+ tSiganture + ".");
		}
		MethodParameterImpl.pattern_MethodParameter_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult,
				mSignature, mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tAbstractType, tParameter, mType,
				tSiganture);
		//nothing EMoflonEdge mEntry__mType____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mEntryToTParameter__mEntry____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mEntry____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mEntryToTParameter__tParameter____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tParameter____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mEntry____mEntrys = (EMoflonEdge) result3_green[16];

		// 
		// 
		MethodParameterImpl.pattern_MethodParameter_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mSignature, mEntryToTParameter, mEntry, mSignatureToTSignature, mTypeToTType,
				mFlowElementToTFlowElement, tAbstractType, tParameter, mType, tSiganture);
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
		TAbstractType tAbstractType = (TAbstractType) result2_binding[0];
		TParameter tParameter = (TParameter) result2_binding[1];
		TMethodSignature tSiganture = (TMethodSignature) result2_binding[2];
		for (Object[] result2_black : MethodParameterImpl
				.pattern_MethodParameter_12_2_corematch_blackFFFBBFBB(tAbstractType, tParameter, tSiganture, match)) {
			MMethodSignature mSignature = (MMethodSignature) result2_black[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			Type mType = (Type) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodParameterImpl.pattern_MethodParameter_12_3_findcontext_blackBBBBBBB(
					mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, tParameter, mType, tSiganture)) {
				Object[] result3_green = MethodParameterImpl
						.pattern_MethodParameter_12_3_findcontext_greenBBBBBBBFFFFFFF(mSignature,
								mSignatureToTSignature, mTypeToTType, tAbstractType, tParameter, mType, tSiganture);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tParameter__tAbstractType____type = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tSiganture__tParameter____parameters = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignatureToTSignature__tSiganture____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodParameterImpl
						.pattern_MethodParameter_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, tParameter, mType,
								tSiganture);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignature] = " + mSignature
							+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mTypeToTType] = "
							+ mTypeToTType + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tParameter] = "
							+ tParameter + ", " + "[mType] = " + mType + ", " + "[tSiganture] = " + tSiganture + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tAbstractType, TParameter tParameter,
			TMethodSignature tSiganture) {
		match.registerObject("tAbstractType", tAbstractType);
		match.registerObject("tParameter", tParameter);
		match.registerObject("tSiganture", tSiganture);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tAbstractType, TParameter tParameter,
			TMethodSignature tSiganture) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, TParameter tParameter, Type mType, TMethodSignature tSiganture) {// Create CSP
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
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tSiganture", tSiganture);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mSignature, EObject mEntryToTParameter,
			EObject mEntry, EObject mSignatureToTSignature, EObject mTypeToTType, EObject mFlowElementToTFlowElement,
			EObject tAbstractType, EObject tParameter, EObject mType, EObject tSiganture) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mEntryToTParameter", mEntryToTParameter);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tSiganture", tSiganture);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_650(EMoflonEdge _edge_type) {

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
				.pattern_MethodParameter_20_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[0];
			TParameter tParameter = (TParameter) result2_black[1];
			TMethodSignature tSiganture = (TMethodSignature) result2_black[2];
			Object[] result2_green = MethodParameterImpl
					.pattern_MethodParameter_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterImpl
					.pattern_MethodParameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tAbstractType, tParameter, tSiganture)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_699(EMoflonEdge _edge_type) {

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
				.pattern_MethodParameter_21_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			MMethodSignature mSignature = (MMethodSignature) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[1];
			Type mType = (Type) result2_black[2];
			Object[] result2_green = MethodParameterImpl
					.pattern_MethodParameter_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterImpl
					.pattern_MethodParameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mSignature, mEntry, mType)) {
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
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[0];
		MEntry mEntry = (MEntry) result2_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[2];
		TParameter tParameter = (TParameter) result2_bindingAndBlack[3];
		Type mType = (Type) result2_bindingAndBlack[4];
		TMethodSignature tSiganture = (TMethodSignature) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MethodParameterImpl
				.pattern_MethodParameter_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mSignature, mEntry,
						tAbstractType, tParameter, mType, tSiganture, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mSignature] = " + mSignature + ", " + "[mEntry] = " + mEntry + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[tParameter] = " + tParameter + ", " + "[mType] = " + mType + ", "
					+ "[tSiganture] = " + tSiganture + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodParameterImpl.pattern_MethodParameter_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodParameterImpl
					.pattern_MethodParameter_24_5_matchcorrcontext_blackBFFBBBBB(mSignature, tAbstractType, mType,
							tSiganture, sourceMatch, targetMatch)) {
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result5_black[1];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[2];
				Object[] result5_green = MethodParameterImpl.pattern_MethodParameter_24_5_matchcorrcontext_greenBBBBF(
						mSignatureToTSignature, mTypeToTType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodParameterImpl
						.pattern_MethodParameter_24_6_createcorrespondence_blackBBBBBBB(mSignature, mEntry,
								tAbstractType, tParameter, mType, tSiganture, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSignature] = "
							+ mSignature + ", " + "[mEntry] = " + mEntry + ", " + "[tAbstractType] = " + tAbstractType
							+ ", " + "[tParameter] = " + tParameter + ", " + "[mType] = " + mType + ", "
							+ "[tSiganture] = " + tSiganture + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterImpl.pattern_MethodParameter_24_6_createcorrespondence_greenFBFBB(mEntry, tParameter,
						ccMatch);
				//nothing MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[0];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(MMethodSignature mSignature, MEntry mEntry, TAbstractType tAbstractType,
			TParameter tParameter, Type mType, TMethodSignature tSiganture, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MMethodSignature mSignature, MEntry mEntry, Type mType) {// 
		Object[] result1_black = MethodParameterImpl.pattern_MethodParameter_27_1_matchtggpattern_blackBBB(mSignature,
				mEntry, mType);
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
	public boolean checkDEC_BWD(TAbstractType tAbstractType, TParameter tParameter, TMethodSignature tSiganture) {// 
		Object[] result1_black = MethodParameterImpl
				.pattern_MethodParameter_28_1_matchtggpattern_blackBBB(tAbstractType, tParameter, tSiganture);
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
			MSignatureToTSignature mSignatureToTSignatureParameter, TypeToTAbstractType mTypeToTTypeParameter) {

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
			//nothing RuleEntryList mSignatureToTSignatureList = (RuleEntryList) result2_black[0];
			MMethodSignature mSignature = (MMethodSignature) result2_black[1];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[2];
			TMethodSignature tSiganture = (TMethodSignature) result2_black[3];
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			TAbstractType tAbstractType = (TAbstractType) result2_black[6];
			Type mType = (Type) result2_black[7];

			Object[] result3_bindingAndBlack = MethodParameterImpl
					.pattern_MethodParameter_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, mType, tSiganture,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mTypeToTType] = "
						+ mTypeToTType + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mType] = " + mType
						+ ", " + "[tSiganture] = " + tSiganture + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodParameterImpl.pattern_MethodParameter_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodParameterImpl.pattern_MethodParameter_29_5_checknacs_blackBBBBBB(
						mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, mType, tSiganture);
				if (result5_black != null) {

					Object[] result6_black = MethodParameterImpl.pattern_MethodParameter_29_6_perform_blackBBBBBBB(
							mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, mType, tSiganture,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSignature] = "
								+ mSignature + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
								+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tAbstractType] = " + tAbstractType
								+ ", " + "[mType] = " + mType + ", " + "[tSiganture] = " + tSiganture + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterImpl.pattern_MethodParameter_29_6_perform_greenBFFFBFBBBB(mSignature, tAbstractType,
							mType, tSiganture, ruleResult, csp);
					//nothing MEntryToTParameter mEntryToTParameter = (MEntryToTParameter) result6_green[1];
					//nothing MEntry mEntry = (MEntry) result6_green[2];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[3];
					//nothing TParameter tParameter = (TParameter) result6_green[5];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tSiganture", tSiganture);
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
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_FWD__MATCH_MMETHODSIGNATURE_MENTRY_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODSIGNATURE_MENTRY_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2), (Type) arguments.get(3));
			return null;
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODSIGNATURE_MENTRY_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_MENTRY_MSIGNATURETOTSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TYPE_TMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2), (MSignatureToTSignature) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TAbstractType) arguments.get(5), (Type) arguments.get(6),
					(TMethodSignature) arguments.get(7));
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
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TPARAMETER_TMETHODSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TParameter) arguments.get(2), (TMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TPARAMETER_TMETHODSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TParameter) arguments.get(2), (TMethodSignature) arguments.get(3));
			return null;
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TPARAMETER_TMETHODSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TParameter) arguments.get(2), (TMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_MSIGNATURETOTSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TPARAMETER_TYPE_TMETHODSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MSignatureToTSignature) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TAbstractType) arguments.get(4), (TParameter) arguments.get(5), (Type) arguments.get(6),
					(TMethodSignature) arguments.get(7));
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
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_650__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_650((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_699__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_699((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_SOLVE_CSP_CC__MMETHODSIGNATURE_MENTRY_TABSTRACTTYPE_TPARAMETER_TYPE_TMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MMethodSignature) arguments.get(0), (MEntry) arguments.get(1),
					(TAbstractType) arguments.get(2), (TParameter) arguments.get(3), (Type) arguments.get(4),
					(TMethodSignature) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER___CHECK_DEC_FWD__MMETHODSIGNATURE_MENTRY_TYPE:
			return checkDEC_FWD((MMethodSignature) arguments.get(0), (MEntry) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___CHECK_DEC_BWD__TABSTRACTTYPE_TPARAMETER_TMETHODSIGNATURE:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TParameter) arguments.get(1),
					(TMethodSignature) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___GENERATE_MODEL__RULEENTRYCONTAINER_MSIGNATURETOTSIGNATURE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (MSignatureToTSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_MSIGNATURETOTSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TYPE_TMETHODSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MSignatureToTSignature) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TAbstractType) arguments.get(4), (Type) arguments.get(5), (TMethodSignature) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameter_0_1_initialbindings_blackBBBBB(MethodParameter _this,
			Match match, MMethodSignature mSignature, MEntry mEntry, Type mType) {
		return new Object[] { _this, match, mSignature, mEntry, mType };
	}

	public static final Object[] pattern_MethodParameter_0_2_SolveCSP_bindingFBBBBB(MethodParameter _this, Match match,
			MMethodSignature mSignature, MEntry mEntry, Type mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSignature, mEntry, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSignature, mEntry, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_0_2_SolveCSP_bindingAndBlackFBBBBB(MethodParameter _this,
			Match match, MMethodSignature mSignature, MEntry mEntry, Type mType) {
		Object[] result_pattern_MethodParameter_0_2_SolveCSP_binding = pattern_MethodParameter_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mSignature, mEntry, mType);
		if (result_pattern_MethodParameter_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameter_0_2_SolveCSP_black = pattern_MethodParameter_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSignature, mEntry, mType };
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
			MMethodSignature mSignature, MEntry mEntry, Type mType) {
		return new Object[] { match, mSignature, mEntry, mType };
	}

	public static final Object[] pattern_MethodParameter_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			MMethodSignature mSignature, MEntry mEntry, Type mType) {
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
		return new Object[] { match, mSignature, mEntry, mType, mEntry__mType____type, mSignature__mEntry____mEntrys };
	}

	public static final Object[] pattern_MethodParameter_0_5_collectcontextelements_blackBBBB(Match match,
			MMethodSignature mSignature, MEntry mEntry, Type mType) {
		return new Object[] { match, mSignature, mEntry, mType };
	}

	public static final Object[] pattern_MethodParameter_0_5_collectcontextelements_greenBBB(Match match,
			MMethodSignature mSignature, Type mType) {
		match.getContextNodes().add(mSignature);
		match.getContextNodes().add(mType);
		return new Object[] { match, mSignature, mType };
	}

	public static final void pattern_MethodParameter_0_6_registerobjectstomatch_expressionBBBBB(MethodParameter _this,
			Match match, MMethodSignature mSignature, MEntry mEntry, Type mType) {
		_this.registerObjectsToMatch_FWD(match, mSignature, mEntry, mType);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSiganture");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		EObject tmpMSignatureToTSignature = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpTAbstractType = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpTSiganture = _localVariable_6;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
					MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpTAbstractType instanceof TAbstractType) {
							TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpTSiganture instanceof TMethodSignature) {
									TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
									return new Object[] { mSignature, mEntry, mSignatureToTSignature, mTypeToTType,
											tAbstractType, mType, tSiganture, isApplicableMatch };
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
			MMethodSignature mSignature, MEntry mEntry, MSignatureToTSignature mSignatureToTSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture,
			MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, mEntry, mSignatureToTSignature, mTypeToTType, tAbstractType, mType,
						tSiganture, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameter_1_1_performtransformation_binding = pattern_MethodParameter_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameter_1_1_performtransformation_binding != null) {
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameter_1_1_performtransformation_binding[0];
			MEntry mEntry = (MEntry) result_pattern_MethodParameter_1_1_performtransformation_binding[1];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_MethodParameter_1_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodParameter_1_1_performtransformation_binding[3];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameter_1_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_MethodParameter_1_1_performtransformation_binding[5];
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameter_1_1_performtransformation_binding[6];

			Object[] result_pattern_MethodParameter_1_1_performtransformation_black = pattern_MethodParameter_1_1_performtransformation_blackBBBBBBBFBB(
					mSignature, mEntry, mSignatureToTSignature, mTypeToTType, tAbstractType, mType, tSiganture, _this,
					isApplicableMatch);
			if (result_pattern_MethodParameter_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameter_1_1_performtransformation_black[7];

				return new Object[] { mSignature, mEntry, mSignatureToTSignature, mTypeToTType, tAbstractType, mType,
						tSiganture, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_1_1_performtransformation_greenFBFBFBB(MEntry mEntry,
			TAbstractType tAbstractType, TMethodSignature tSiganture, CSP csp) {
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		int tParameter_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tParameter", "upperBound");
		mEntryToTParameter.setSource(mEntry);
		mFlowElementToTFlowElement.setSource(mEntry);
		tParameter.setType(tAbstractType);
		mEntryToTParameter.setTarget(tParameter);
		mFlowElementToTFlowElement.setTarget(tParameter);
		tSiganture.getParameters().add(tParameter);
		tParameter.setLowerBound(Integer.valueOf(tParameter_lowerBound_prime));
		int tParameter_upperBound_prime = (int) _localVariable_0;
		tParameter.setUpperBound(Integer.valueOf(tParameter_upperBound_prime));
		return new Object[] { mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tAbstractType, tParameter,
				tSiganture, csp };
	}

	public static final Object[] pattern_MethodParameter_1_2_collecttranslatedelements_blackBBBB(
			MEntryToTParameter mEntryToTParameter, MEntry mEntry,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		return new Object[] { mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameter_1_2_collecttranslatedelements_greenFBBBB(
			MEntryToTParameter mEntryToTParameter, MEntry mEntry,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getTranslatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameter_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject mEntryToTParameter, EObject mEntry,
			EObject mSignatureToTSignature, EObject mTypeToTType, EObject mFlowElementToTFlowElement,
			EObject tAbstractType, EObject tParameter, EObject mType, EObject tSiganture) {
		if (!mSignature.equals(mSignatureToTSignature)) {
			if (!mSignature.equals(mTypeToTType)) {
				if (!mSignature.equals(tAbstractType)) {
					if (!mSignature.equals(tParameter)) {
						if (!mSignature.equals(mType)) {
							if (!mSignature.equals(tSiganture)) {
								if (!mEntryToTParameter.equals(mSignature)) {
									if (!mEntryToTParameter.equals(mSignatureToTSignature)) {
										if (!mEntryToTParameter.equals(mTypeToTType)) {
											if (!mEntryToTParameter.equals(mFlowElementToTFlowElement)) {
												if (!mEntryToTParameter.equals(tAbstractType)) {
													if (!mEntryToTParameter.equals(tParameter)) {
														if (!mEntryToTParameter.equals(mType)) {
															if (!mEntryToTParameter.equals(tSiganture)) {
																if (!mEntry.equals(mSignature)) {
																	if (!mEntry.equals(mEntryToTParameter)) {
																		if (!mEntry.equals(mSignatureToTSignature)) {
																			if (!mEntry.equals(mTypeToTType)) {
																				if (!mEntry.equals(
																						mFlowElementToTFlowElement)) {
																					if (!mEntry.equals(tAbstractType)) {
																						if (!mEntry
																								.equals(tParameter)) {
																							if (!mEntry.equals(mType)) {
																								if (!mEntry.equals(
																										tSiganture)) {
																									if (!mSignatureToTSignature
																											.equals(mTypeToTType)) {
																										if (!mSignatureToTSignature
																												.equals(tAbstractType)) {
																											if (!mSignatureToTSignature
																													.equals(tParameter)) {
																												if (!mSignatureToTSignature
																														.equals(mType)) {
																													if (!mSignatureToTSignature
																															.equals(tSiganture)) {
																														if (!mTypeToTType
																																.equals(tAbstractType)) {
																															if (!mTypeToTType
																																	.equals(tParameter)) {
																																if (!mTypeToTType
																																		.equals(tSiganture)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mSignature)) {
																																		if (!mFlowElementToTFlowElement
																																				.equals(mSignatureToTSignature)) {
																																			if (!mFlowElementToTFlowElement
																																					.equals(mTypeToTType)) {
																																				if (!mFlowElementToTFlowElement
																																						.equals(tAbstractType)) {
																																					if (!mFlowElementToTFlowElement
																																							.equals(tParameter)) {
																																						if (!mFlowElementToTFlowElement
																																								.equals(mType)) {
																																							if (!mFlowElementToTFlowElement
																																									.equals(tSiganture)) {
																																								if (!tAbstractType
																																										.equals(tParameter)) {
																																									if (!tAbstractType
																																											.equals(tSiganture)) {
																																										if (!tParameter
																																												.equals(tSiganture)) {
																																											if (!mType
																																													.equals(mTypeToTType)) {
																																												if (!mType
																																														.equals(tAbstractType)) {
																																													if (!mType
																																															.equals(tParameter)) {
																																														if (!mType
																																																.equals(tSiganture)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mSignature,
																																																	mEntryToTParameter,
																																																	mEntry,
																																																	mSignatureToTSignature,
																																																	mTypeToTType,
																																																	mFlowElementToTFlowElement,
																																																	tAbstractType,
																																																	tParameter,
																																																	mType,
																																																	tSiganture };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mSignature, EObject mEntryToTParameter, EObject mEntry,
			EObject mFlowElementToTFlowElement, EObject tAbstractType, EObject tParameter, EObject mType,
			EObject tSiganture) {
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameter";
		String mEntry__mType____type_name_prime = "type";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mFlowElementToTFlowElement__mEntry____source_name_prime = "source";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String mFlowElementToTFlowElement__tParameter____target_name_prime = "target";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mEntry__mType____type);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mFlowElementToTFlowElement__mEntry____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mEntry____source);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tParameter__tAbstractType____type);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		mFlowElementToTFlowElement__tParameter____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tParameter____target);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tSiganture__tParameter____parameters);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mSignature__mEntry____mEntrys);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mFlowElementToTFlowElement__mEntry____source.setName(mFlowElementToTFlowElement__mEntry____source_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		mFlowElementToTFlowElement__tParameter____target
				.setName(mFlowElementToTFlowElement__tParameter____target_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { ruleresult, mSignature, mEntryToTParameter, mEntry, mFlowElementToTFlowElement,
				tAbstractType, tParameter, mType, tSiganture, mEntry__mType____type,
				mEntryToTParameter__mEntry____source, mFlowElementToTFlowElement__mEntry____source,
				tParameter__tAbstractType____type, mEntryToTParameter__tParameter____target,
				mFlowElementToTFlowElement__tParameter____target, tSiganture__tParameter____parameters,
				mSignature__mEntry____mEntrys };
	}

	public static final void pattern_MethodParameter_1_5_registerobjects_expressionBBBBBBBBBBBB(MethodParameter _this,
			PerformRuleResult ruleresult, EObject mSignature, EObject mEntryToTParameter, EObject mEntry,
			EObject mSignatureToTSignature, EObject mTypeToTType, EObject mFlowElementToTFlowElement,
			EObject tAbstractType, EObject tParameter, EObject mType, EObject tSiganture) {
		_this.registerObjects_FWD(ruleresult, mSignature, mEntryToTParameter, mEntry, mSignatureToTSignature,
				mTypeToTType, mFlowElementToTFlowElement, tAbstractType, tParameter, mType, tSiganture);

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
		EObject _localVariable_0 = match.getObject("mSignature");
		EObject _localVariable_1 = match.getObject("mEntry");
		EObject _localVariable_2 = match.getObject("mType");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (tmpMType instanceof Type) {
					Type mType = (Type) tmpMType;
					return new Object[] { mSignature, mEntry, mType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_2_2_corematch_blackBBFFFBFB(
			MMethodSignature mSignature, MEntry mEntry, Type mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
			TSignature tmpTSiganture = mSignatureToTSignature.getTarget();
			if (tmpTSiganture instanceof TMethodSignature) {
				TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tAbstractType = mTypeToTType.getTarget();
					if (tAbstractType != null) {
						_result.add(new Object[] { mSignature, mEntry, mSignatureToTSignature, mTypeToTType,
								tAbstractType, mType, tSiganture, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_2_3_findcontext_blackBBBBBBB(
			MMethodSignature mSignature, MEntry mEntry, MSignatureToTSignature mSignatureToTSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mEntry.getType())) {
			if (tAbstractType.equals(mTypeToTType.getTarget())) {
				if (mSignature.equals(mSignatureToTSignature.getSource())) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (mSignature.getMEntrys().contains(mEntry)) {
							if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
								_result.add(new Object[] { mSignature, mEntry, mSignatureToTSignature, mTypeToTType,
										tAbstractType, mType, tSiganture });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameter_2_3_findcontext_greenBBBBBBBFFFFFFF(
			MMethodSignature mSignature, MEntry mEntry, MSignatureToTSignature mSignatureToTSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSiganture____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mEntry__mType____type_name_prime = "type";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mTypeToTType__mType____source_name_prime = "source";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		String mSignatureToTSignature__tSiganture____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tSiganture);
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mEntry__mType____type);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mSignature__mEntry____mEntrys);
		mSignatureToTSignature__tSiganture____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSiganture____target.setTrg(tSiganture);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSiganture____target);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		mSignatureToTSignature__tSiganture____target.setName(mSignatureToTSignature__tSiganture____target_name_prime);
		return new Object[] { mSignature, mEntry, mSignatureToTSignature, mTypeToTType, tAbstractType, mType,
				tSiganture, isApplicableMatch, mEntry__mType____type, mTypeToTType__tAbstractType____target,
				mSignatureToTSignature__mSignature____source, mTypeToTType__mType____source,
				mSignature__mEntry____mEntrys, mSignatureToTSignature__tSiganture____target };
	}

	public static final Object[] pattern_MethodParameter_2_4_solveCSP_bindingFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature, MEntry mEntry,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSignature, mEntry,
				mSignatureToTSignature, mTypeToTType, tAbstractType, mType, tSiganture);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, mEntry, mSignatureToTSignature,
					mTypeToTType, tAbstractType, mType, tSiganture };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature, MEntry mEntry,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture) {
		Object[] result_pattern_MethodParameter_2_4_solveCSP_binding = pattern_MethodParameter_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mSignature, mEntry, mSignatureToTSignature, mTypeToTType, tAbstractType,
				mType, tSiganture);
		if (result_pattern_MethodParameter_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameter_2_4_solveCSP_black = pattern_MethodParameter_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, mEntry, mSignatureToTSignature,
						mTypeToTType, tAbstractType, mType, tSiganture };
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
			Match match, TAbstractType tAbstractType, TParameter tParameter, TMethodSignature tSiganture) {
		return new Object[] { _this, match, tAbstractType, tParameter, tSiganture };
	}

	public static final Object[] pattern_MethodParameter_10_2_SolveCSP_bindingFBBBBB(MethodParameter _this, Match match,
			TAbstractType tAbstractType, TParameter tParameter, TMethodSignature tSiganture) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAbstractType, tParameter, tSiganture);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAbstractType, tParameter, tSiganture };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_10_2_SolveCSP_bindingAndBlackFBBBBB(MethodParameter _this,
			Match match, TAbstractType tAbstractType, TParameter tParameter, TMethodSignature tSiganture) {
		Object[] result_pattern_MethodParameter_10_2_SolveCSP_binding = pattern_MethodParameter_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAbstractType, tParameter, tSiganture);
		if (result_pattern_MethodParameter_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameter_10_2_SolveCSP_black = pattern_MethodParameter_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAbstractType, tParameter, tSiganture };
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
			TAbstractType tAbstractType, TParameter tParameter, TMethodSignature tSiganture) {
		return new Object[] { match, tAbstractType, tParameter, tSiganture };
	}

	public static final Object[] pattern_MethodParameter_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			TAbstractType tAbstractType, TParameter tParameter, TMethodSignature tSiganture) {
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tParameter);
		String tParameter__tAbstractType____type_name_prime = "type";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		match.getToBeTranslatedEdges().add(tParameter__tAbstractType____type);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(tSiganture__tParameter____parameters);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		return new Object[] { match, tAbstractType, tParameter, tSiganture, tParameter__tAbstractType____type,
				tSiganture__tParameter____parameters };
	}

	public static final Object[] pattern_MethodParameter_10_5_collectcontextelements_blackBBBB(Match match,
			TAbstractType tAbstractType, TParameter tParameter, TMethodSignature tSiganture) {
		return new Object[] { match, tAbstractType, tParameter, tSiganture };
	}

	public static final Object[] pattern_MethodParameter_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tAbstractType, TMethodSignature tSiganture) {
		match.getContextNodes().add(tAbstractType);
		match.getContextNodes().add(tSiganture);
		return new Object[] { match, tAbstractType, tSiganture };
	}

	public static final void pattern_MethodParameter_10_6_registerobjectstomatch_expressionBBBBB(MethodParameter _this,
			Match match, TAbstractType tAbstractType, TParameter tParameter, TMethodSignature tSiganture) {
		_this.registerObjectsToMatch_BWD(match, tAbstractType, tParameter, tSiganture);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSiganture");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMSignatureToTSignature = _localVariable_1;
		EObject tmpMTypeToTType = _localVariable_2;
		EObject tmpTAbstractType = _localVariable_3;
		EObject tmpTParameter = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpTSiganture = _localVariable_6;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
				if (tmpMTypeToTType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
					if (tmpTAbstractType instanceof TAbstractType) {
						TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
						if (tmpTParameter instanceof TParameter) {
							TParameter tParameter = (TParameter) tmpTParameter;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpTSiganture instanceof TMethodSignature) {
									TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
									return new Object[] { mSignature, mSignatureToTSignature, mTypeToTType,
											tAbstractType, tParameter, mType, tSiganture, isApplicableMatch };
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
			MMethodSignature mSignature, MSignatureToTSignature mSignatureToTSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TParameter tParameter, Type mType,
			TMethodSignature tSiganture, MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, tParameter,
						mType, tSiganture, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodParameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameter_11_1_performtransformation_binding = pattern_MethodParameter_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameter_11_1_performtransformation_binding != null) {
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameter_11_1_performtransformation_binding[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_MethodParameter_11_1_performtransformation_binding[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodParameter_11_1_performtransformation_binding[2];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameter_11_1_performtransformation_binding[3];
			TParameter tParameter = (TParameter) result_pattern_MethodParameter_11_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_MethodParameter_11_1_performtransformation_binding[5];
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameter_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodParameter_11_1_performtransformation_black = pattern_MethodParameter_11_1_performtransformation_blackBBBBBBBFBB(
					mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, tParameter, mType, tSiganture,
					_this, isApplicableMatch);
			if (result_pattern_MethodParameter_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameter_11_1_performtransformation_black[7];

				return new Object[] { mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, tParameter,
						mType, tSiganture, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_11_1_performtransformation_greenBFFFBB(
			MMethodSignature mSignature, TParameter tParameter, Type mType) {
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MEntry mEntry = ModiscoFactory.eINSTANCE.createMEntry();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mEntryToTParameter.setTarget(tParameter);
		mEntry.setType(mType);
		mEntryToTParameter.setSource(mEntry);
		mSignature.getMEntrys().add(mEntry);
		mFlowElementToTFlowElement.setSource(mEntry);
		mFlowElementToTFlowElement.setTarget(tParameter);
		return new Object[] { mSignature, mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter, mType };
	}

	public static final Object[] pattern_MethodParameter_11_2_collecttranslatedelements_blackBBBB(
			MEntryToTParameter mEntryToTParameter, MEntry mEntry,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		return new Object[] { mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameter_11_2_collecttranslatedelements_greenFBBBB(
			MEntryToTParameter mEntryToTParameter, MEntry mEntry,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TParameter tParameter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mEntryToTParameter);
		ruleresult.getCreatedElements().add(mEntry);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getTranslatedElements().add(tParameter);
		return new Object[] { ruleresult, mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter };
	}

	public static final Object[] pattern_MethodParameter_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject mEntryToTParameter, EObject mEntry,
			EObject mSignatureToTSignature, EObject mTypeToTType, EObject mFlowElementToTFlowElement,
			EObject tAbstractType, EObject tParameter, EObject mType, EObject tSiganture) {
		if (!mSignature.equals(mSignatureToTSignature)) {
			if (!mSignature.equals(mTypeToTType)) {
				if (!mSignature.equals(tAbstractType)) {
					if (!mSignature.equals(tParameter)) {
						if (!mSignature.equals(mType)) {
							if (!mSignature.equals(tSiganture)) {
								if (!mEntryToTParameter.equals(mSignature)) {
									if (!mEntryToTParameter.equals(mSignatureToTSignature)) {
										if (!mEntryToTParameter.equals(mTypeToTType)) {
											if (!mEntryToTParameter.equals(mFlowElementToTFlowElement)) {
												if (!mEntryToTParameter.equals(tAbstractType)) {
													if (!mEntryToTParameter.equals(tParameter)) {
														if (!mEntryToTParameter.equals(mType)) {
															if (!mEntryToTParameter.equals(tSiganture)) {
																if (!mEntry.equals(mSignature)) {
																	if (!mEntry.equals(mEntryToTParameter)) {
																		if (!mEntry.equals(mSignatureToTSignature)) {
																			if (!mEntry.equals(mTypeToTType)) {
																				if (!mEntry.equals(
																						mFlowElementToTFlowElement)) {
																					if (!mEntry.equals(tAbstractType)) {
																						if (!mEntry
																								.equals(tParameter)) {
																							if (!mEntry.equals(mType)) {
																								if (!mEntry.equals(
																										tSiganture)) {
																									if (!mSignatureToTSignature
																											.equals(mTypeToTType)) {
																										if (!mSignatureToTSignature
																												.equals(tAbstractType)) {
																											if (!mSignatureToTSignature
																													.equals(tParameter)) {
																												if (!mSignatureToTSignature
																														.equals(mType)) {
																													if (!mSignatureToTSignature
																															.equals(tSiganture)) {
																														if (!mTypeToTType
																																.equals(tAbstractType)) {
																															if (!mTypeToTType
																																	.equals(tParameter)) {
																																if (!mTypeToTType
																																		.equals(tSiganture)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mSignature)) {
																																		if (!mFlowElementToTFlowElement
																																				.equals(mSignatureToTSignature)) {
																																			if (!mFlowElementToTFlowElement
																																					.equals(mTypeToTType)) {
																																				if (!mFlowElementToTFlowElement
																																						.equals(tAbstractType)) {
																																					if (!mFlowElementToTFlowElement
																																							.equals(tParameter)) {
																																						if (!mFlowElementToTFlowElement
																																								.equals(mType)) {
																																							if (!mFlowElementToTFlowElement
																																									.equals(tSiganture)) {
																																								if (!tAbstractType
																																										.equals(tParameter)) {
																																									if (!tAbstractType
																																											.equals(tSiganture)) {
																																										if (!tParameter
																																												.equals(tSiganture)) {
																																											if (!mType
																																													.equals(mTypeToTType)) {
																																												if (!mType
																																														.equals(tAbstractType)) {
																																													if (!mType
																																															.equals(tParameter)) {
																																														if (!mType
																																																.equals(tSiganture)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mSignature,
																																																	mEntryToTParameter,
																																																	mEntry,
																																																	mSignatureToTSignature,
																																																	mTypeToTType,
																																																	mFlowElementToTFlowElement,
																																																	tAbstractType,
																																																	tParameter,
																																																	mType,
																																																	tSiganture };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mSignature, EObject mEntryToTParameter, EObject mEntry,
			EObject mFlowElementToTFlowElement, EObject tAbstractType, EObject tParameter, EObject mType,
			EObject tSiganture) {
		EMoflonEdge mEntry__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mEntry____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEntryToTParameter__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tParameter____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mEntry____mEntrys = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameter";
		String mEntry__mType____type_name_prime = "type";
		String mEntryToTParameter__mEntry____source_name_prime = "source";
		String mFlowElementToTFlowElement__mEntry____source_name_prime = "source";
		String tParameter__tAbstractType____type_name_prime = "type";
		String mEntryToTParameter__tParameter____target_name_prime = "target";
		String mFlowElementToTFlowElement__tParameter____target_name_prime = "target";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String mSignature__mEntry____mEntrys_name_prime = "mEntrys";
		mEntry__mType____type.setSrc(mEntry);
		mEntry__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mEntry__mType____type);
		mEntryToTParameter__mEntry____source.setSrc(mEntryToTParameter);
		mEntryToTParameter__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__mEntry____source);
		mFlowElementToTFlowElement__mEntry____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mEntry____source.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mEntry____source);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tParameter__tAbstractType____type);
		mEntryToTParameter__tParameter____target.setSrc(mEntryToTParameter);
		mEntryToTParameter__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mEntryToTParameter__tParameter____target);
		mFlowElementToTFlowElement__tParameter____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tParameter____target.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tParameter____target);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(tSiganture__tParameter____parameters);
		mSignature__mEntry____mEntrys.setSrc(mSignature);
		mSignature__mEntry____mEntrys.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mSignature__mEntry____mEntrys);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mEntry__mType____type.setName(mEntry__mType____type_name_prime);
		mEntryToTParameter__mEntry____source.setName(mEntryToTParameter__mEntry____source_name_prime);
		mFlowElementToTFlowElement__mEntry____source.setName(mFlowElementToTFlowElement__mEntry____source_name_prime);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mEntryToTParameter__tParameter____target.setName(mEntryToTParameter__tParameter____target_name_prime);
		mFlowElementToTFlowElement__tParameter____target
				.setName(mFlowElementToTFlowElement__tParameter____target_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		mSignature__mEntry____mEntrys.setName(mSignature__mEntry____mEntrys_name_prime);
		return new Object[] { ruleresult, mSignature, mEntryToTParameter, mEntry, mFlowElementToTFlowElement,
				tAbstractType, tParameter, mType, tSiganture, mEntry__mType____type,
				mEntryToTParameter__mEntry____source, mFlowElementToTFlowElement__mEntry____source,
				tParameter__tAbstractType____type, mEntryToTParameter__tParameter____target,
				mFlowElementToTFlowElement__tParameter____target, tSiganture__tParameter____parameters,
				mSignature__mEntry____mEntrys };
	}

	public static final void pattern_MethodParameter_11_5_registerobjects_expressionBBBBBBBBBBBB(MethodParameter _this,
			PerformRuleResult ruleresult, EObject mSignature, EObject mEntryToTParameter, EObject mEntry,
			EObject mSignatureToTSignature, EObject mTypeToTType, EObject mFlowElementToTFlowElement,
			EObject tAbstractType, EObject tParameter, EObject mType, EObject tSiganture) {
		_this.registerObjects_BWD(ruleresult, mSignature, mEntryToTParameter, mEntry, mSignatureToTSignature,
				mTypeToTType, mFlowElementToTFlowElement, tAbstractType, tParameter, mType, tSiganture);

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
		EObject _localVariable_0 = match.getObject("tAbstractType");
		EObject _localVariable_1 = match.getObject("tParameter");
		EObject _localVariable_2 = match.getObject("tSiganture");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		EObject tmpTSiganture = _localVariable_2;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tmpTSiganture instanceof TMethodSignature) {
					TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
					return new Object[] { tAbstractType, tParameter, tSiganture, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_12_2_corematch_blackFFFBBFBB(
			TAbstractType tAbstractType, TParameter tParameter, TMethodSignature tSiganture, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tParameter_lowerBound = tParameter.getLowerBound();
		if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
				Type mType = mTypeToTType.getSource();
				if (mType != null) {
					for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tSiganture, MSignatureToTSignature.class, "target")) {
						MSignature tmpMSignature = mSignatureToTSignature.getSource();
						if (tmpMSignature instanceof MMethodSignature) {
							MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
							_result.add(new Object[] { mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType,
									tParameter, mType, tSiganture, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_12_3_findcontext_blackBBBBBBB(
			MMethodSignature mSignature, MSignatureToTSignature mSignatureToTSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TParameter tParameter, Type mType,
			TMethodSignature tSiganture) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAbstractType.equals(tParameter.getType())) {
			if (tAbstractType.equals(mTypeToTType.getTarget())) {
				if (mSignature.equals(mSignatureToTSignature.getSource())) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (tSiganture.getParameters().contains(tParameter)) {
							if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
								int tParameter_lowerBound = tParameter.getLowerBound();
								if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
									_result.add(new Object[] { mSignature, mSignatureToTSignature, mTypeToTType,
											tAbstractType, tParameter, mType, tSiganture });
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
			MMethodSignature mSignature, MSignatureToTSignature mSignatureToTSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TParameter tParameter, Type mType,
			TMethodSignature tSiganture) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tParameter__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSiganture__tParameter____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSiganture____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tParameter__tAbstractType____type_name_prime = "type";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mTypeToTType__mType____source_name_prime = "source";
		String tSiganture__tParameter____parameters_name_prime = "parameters";
		String mSignatureToTSignature__tSiganture____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tSiganture);
		tParameter__tAbstractType____type.setSrc(tParameter);
		tParameter__tAbstractType____type.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tParameter__tAbstractType____type);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		tSiganture__tParameter____parameters.setSrc(tSiganture);
		tSiganture__tParameter____parameters.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(tSiganture__tParameter____parameters);
		mSignatureToTSignature__tSiganture____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSiganture____target.setTrg(tSiganture);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSiganture____target);
		tParameter__tAbstractType____type.setName(tParameter__tAbstractType____type_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		tSiganture__tParameter____parameters.setName(tSiganture__tParameter____parameters_name_prime);
		mSignatureToTSignature__tSiganture____target.setName(mSignatureToTSignature__tSiganture____target_name_prime);
		return new Object[] { mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, tParameter, mType,
				tSiganture, isApplicableMatch, tParameter__tAbstractType____type, mTypeToTType__tAbstractType____target,
				mSignatureToTSignature__mSignature____source, mTypeToTType__mType____source,
				tSiganture__tParameter____parameters, mSignatureToTSignature__tSiganture____target };
	}

	public static final Object[] pattern_MethodParameter_12_4_solveCSP_bindingFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, TParameter tParameter, Type mType, TMethodSignature tSiganture) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mSignature, mSignatureToTSignature,
				mTypeToTType, tAbstractType, tParameter, mType, tSiganture);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, mSignatureToTSignature, mTypeToTType,
					tAbstractType, tParameter, mType, tSiganture };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, TParameter tParameter, Type mType, TMethodSignature tSiganture) {
		Object[] result_pattern_MethodParameter_12_4_solveCSP_binding = pattern_MethodParameter_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, tParameter,
				mType, tSiganture);
		if (result_pattern_MethodParameter_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameter_12_4_solveCSP_black = pattern_MethodParameter_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, mSignatureToTSignature, mTypeToTType,
						tAbstractType, tParameter, mType, tSiganture };
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
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTParameter = _edge_type.getSrc();
		if (tmpTParameter instanceof TParameter) {
			TParameter tParameter = (TParameter) tmpTParameter;
			EObject tmpTAbstractType = _edge_type.getTrg();
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tAbstractType.equals(tParameter.getType())) {
					int tParameter_lowerBound = tParameter.getLowerBound();
					if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
						for (TMethodSignature tSiganture : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tParameter, TMethodSignature.class, "parameters")) {
							_result.add(new Object[] { tAbstractType, tParameter, tSiganture, _edge_type });
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
			MethodParameter _this, Match match, TAbstractType tAbstractType, TParameter tParameter,
			TMethodSignature tSiganture) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAbstractType, tParameter, tSiganture);
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
							_result.add(new Object[] { mSignature, mEntry, mType, _edge_type });
						}
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
			MethodParameter _this, Match match, MMethodSignature mSignature, MEntry mEntry, Type mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSignature, mEntry, mType);
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
		EObject _localVariable_0 = sourceMatch.getObject("mSignature");
		EObject _localVariable_1 = sourceMatch.getObject("mEntry");
		EObject _localVariable_2 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_3 = targetMatch.getObject("tParameter");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject _localVariable_5 = targetMatch.getObject("tSiganture");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpTParameter = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpTSiganture = _localVariable_5;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpTParameter instanceof TParameter) {
						TParameter tParameter = (TParameter) tmpTParameter;
						if (tmpMType instanceof Type) {
							Type mType = (Type) tmpMType;
							if (tmpTSiganture instanceof TMethodSignature) {
								TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
								return new Object[] { mSignature, mEntry, tAbstractType, tParameter, mType, tSiganture,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_24_2_matchsrctrgcontext_blackBBBBBBBB(
			MMethodSignature mSignature, MEntry mEntry, TAbstractType tAbstractType, TParameter tParameter, Type mType,
			TMethodSignature tSiganture, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tParameter_lowerBound = tParameter.getLowerBound();
			if (Integer.valueOf(tParameter_lowerBound).equals(Integer.valueOf(0))) {
				return new Object[] { mSignature, mEntry, tAbstractType, tParameter, mType, tSiganture, sourceMatch,
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
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[0];
			MEntry mEntry = (MEntry) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[2];
			TParameter tParameter = (TParameter) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[3];
			Type mType = (Type) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[4];
			TMethodSignature tSiganture = (TMethodSignature) result_pattern_MethodParameter_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MethodParameter_24_2_matchsrctrgcontext_black = pattern_MethodParameter_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mSignature, mEntry, tAbstractType, tParameter, mType, tSiganture, sourceMatch, targetMatch);
			if (result_pattern_MethodParameter_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mSignature, mEntry, tAbstractType, tParameter, mType, tSiganture, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_24_3_solvecsp_bindingFBBBBBBBBB(MethodParameter _this,
			MMethodSignature mSignature, MEntry mEntry, TAbstractType tAbstractType, TParameter tParameter, Type mType,
			TMethodSignature tSiganture, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mSignature, mEntry, tAbstractType, tParameter, mType,
				tSiganture, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mSignature, mEntry, tAbstractType, tParameter, mType, tSiganture,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(MethodParameter _this,
			MMethodSignature mSignature, MEntry mEntry, TAbstractType tAbstractType, TParameter tParameter, Type mType,
			TMethodSignature tSiganture, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameter_24_3_solvecsp_binding = pattern_MethodParameter_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mSignature, mEntry, tAbstractType, tParameter, mType, tSiganture, sourceMatch, targetMatch);
		if (result_pattern_MethodParameter_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodParameter_24_3_solvecsp_black = pattern_MethodParameter_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodParameter_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mSignature, mEntry, tAbstractType, tParameter, mType, tSiganture,
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

	public static final Iterable<Object[]> pattern_MethodParameter_24_5_matchcorrcontext_blackBFFBBBBB(
			MMethodSignature mSignature, TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
				if (mType.equals(mTypeToTType.getSource())) {
					for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
						if (tSiganture.equals(mSignatureToTSignature.getTarget())) {
							_result.add(new Object[] { mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType,
									mType, tSiganture, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameter_24_5_matchcorrcontext_greenBBBBF(
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodParameter";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mSignatureToTSignature);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mSignatureToTSignature, mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodParameter_24_6_createcorrespondence_blackBBBBBBB(
			MMethodSignature mSignature, MEntry mEntry, TAbstractType tAbstractType, TParameter tParameter, Type mType,
			TMethodSignature tSiganture, CCMatch ccMatch) {
		return new Object[] { mSignature, mEntry, tAbstractType, tParameter, mType, tSiganture, ccMatch };
	}

	public static final Object[] pattern_MethodParameter_24_6_createcorrespondence_greenFBFBB(MEntry mEntry,
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
		return new Object[] { mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tParameter, ccMatch };
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

	public static final Object[] pattern_MethodParameter_27_1_matchtggpattern_blackBBB(MMethodSignature mSignature,
			MEntry mEntry, Type mType) {
		if (mType.equals(mEntry.getType())) {
			if (mSignature.getMEntrys().contains(mEntry)) {
				return new Object[] { mSignature, mEntry, mType };
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

	public static final Object[] pattern_MethodParameter_28_1_matchtggpattern_blackBBB(TAbstractType tAbstractType,
			TParameter tParameter, TMethodSignature tSiganture) {
		if (tAbstractType.equals(tParameter.getType())) {
			if (tSiganture.getParameters().contains(tParameter)) {
				return new Object[] { tAbstractType, tParameter, tSiganture };
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
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tSiganture) {
		if (ruleResult.getTargetObjects().contains(tSiganture)) {
			return new Object[] { ruleResult, tSiganture };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameter_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mSignatureToTSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!mSignatureToTSignatureList.equals(mTypeToTTypeList)) {
					for (EObject tmpMSignatureToTSignature : mSignatureToTSignatureList.getEntryObjects()) {
						if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
							MSignature tmpMSignature = mSignatureToTSignature.getSource();
							if (tmpMSignature instanceof MMethodSignature) {
								MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
								TSignature tmpTSiganture = mSignatureToTSignature.getTarget();
								if (tmpTSiganture instanceof TMethodSignature) {
									TMethodSignature tSiganture = (TMethodSignature) tmpTSiganture;
									if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mSignatureToTSignature) == null) {
										if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mSignature) == null) {
											if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tSiganture) == null) {
												for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
													if (tmpMTypeToTType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
														TAbstractType tAbstractType = mTypeToTType.getTarget();
														if (tAbstractType != null) {
															Type mType = mTypeToTType.getSource();
															if (mType != null) {
																if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, mTypeToTType) == null) {
																	if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, tAbstractType) == null) {
																		if (pattern_MethodParameter_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mType) == null) {
																			_result.add(new Object[] {
																					mSignatureToTSignatureList,
																					mSignature, mSignatureToTSignature,
																					tSiganture, mTypeToTTypeList,
																					mTypeToTType, tAbstractType, mType,
																					ruleEntryContainer, ruleResult });
																		}
																	}
																}
															}

														}

													}
												}
											}
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
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mSignature, mSignatureToTSignature,
				mTypeToTType, tAbstractType, mType, tSiganture, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, mSignatureToTSignature, mTypeToTType,
					tAbstractType, mType, tSiganture, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameter_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameter_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(MethodParameter _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameter_29_3_solveCSP_binding = pattern_MethodParameter_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, mType,
				tSiganture, ruleResult);
		if (result_pattern_MethodParameter_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameter_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameter_29_3_solveCSP_black = pattern_MethodParameter_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameter_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, mSignatureToTSignature, mTypeToTType,
						tAbstractType, mType, tSiganture, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameter_29_4_checkCSP_expressionFBB(MethodParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameter_29_5_checknacs_blackBBBBBB(MMethodSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture) {
		return new Object[] { mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, mType, tSiganture };
	}

	public static final Object[] pattern_MethodParameter_29_6_perform_blackBBBBBBB(MMethodSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mSignature, mSignatureToTSignature, mTypeToTType, tAbstractType, mType, tSiganture,
				ruleResult };
	}

	public static final Object[] pattern_MethodParameter_29_6_perform_greenBFFFBFBBBB(MMethodSignature mSignature,
			TAbstractType tAbstractType, Type mType, TMethodSignature tSiganture, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		MEntryToTParameter mEntryToTParameter = PmFactory.eINSTANCE.createMEntryToTParameter();
		MEntry mEntry = ModiscoFactory.eINSTANCE.createMEntry();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TParameter tParameter = BasicFactory.eINSTANCE.createTParameter();
		int tParameter_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tParameter", "upperBound");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mEntryToTParameter);
		mEntry.setType(mType);
		mEntryToTParameter.setSource(mEntry);
		mSignature.getMEntrys().add(mEntry);
		ruleResult.getSourceObjects().add(mEntry);
		mFlowElementToTFlowElement.setSource(mEntry);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		tParameter.setType(tAbstractType);
		mEntryToTParameter.setTarget(tParameter);
		mFlowElementToTFlowElement.setTarget(tParameter);
		tSiganture.getParameters().add(tParameter);
		ruleResult.getTargetObjects().add(tParameter);
		tParameter.setLowerBound(Integer.valueOf(tParameter_lowerBound_prime));
		int tParameter_upperBound_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tParameter.setUpperBound(Integer.valueOf(tParameter_upperBound_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mSignature, mEntryToTParameter, mEntry, mFlowElementToTFlowElement, tAbstractType,
				tParameter, mType, tSiganture, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameter_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterImpl
