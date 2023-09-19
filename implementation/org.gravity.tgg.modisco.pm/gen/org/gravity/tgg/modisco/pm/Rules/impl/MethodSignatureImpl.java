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

import org.gravity.tgg.modisco.pm.Rules.MethodSignature;
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
 * An implementation of the model object '<em><b>Method Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodSignatureImpl extends AbstractRuleImpl implements MethodSignature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_0_1_initialbindings_blackBBBBB(this, match,
				mName, mType, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mName, mType, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureImpl.pattern_MethodSignature_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodSignatureImpl
					.pattern_MethodSignature_0_4_collectelementstobetranslated_blackBBBB(match, mName, mType,
							mSignature);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mName] = " + mName
								+ ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_0_4_collectelementstobetranslated_greenBBBBFF(match, mName,
					mType, mSignature);
			//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodSignatureImpl
					.pattern_MethodSignature_0_5_collectcontextelements_blackBBBB(match, mName, mType, mSignature);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mName] = " + mName
								+ ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_0_5_collectcontextelements_greenBBB(match, mName, mType);

			// 
			MethodSignatureImpl.pattern_MethodSignature_0_6_registerobjectstomatch_expressionBBBBB(this, match, mName,
					mType, mSignature);
			return MethodSignatureImpl.pattern_MethodSignature_0_7_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[0];
		TMethod tName = (TMethod) result1_bindingAndBlack[1];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		Type mType = (Type) result1_bindingAndBlack[4];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[5];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_1_1_performtransformation_greenBFFBBFB(tName, mSignature, tAbstractType, csp);
		TMethodSignature tSignature = (TMethodSignature) result1_green[1];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[5];

		Object[] result2_black = MethodSignatureImpl.pattern_MethodSignature_1_2_collecttranslatedelements_blackBBBB(
				tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		Object[] result2_green = MethodSignatureImpl.pattern_MethodSignature_1_2_collecttranslatedelements_greenFBBBB(
				tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureImpl.pattern_MethodSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mNameToTName, tName, mName, mTypeToTType, tSignature, mType, mSignatureToTSignature,
				mSignature, tAbstractType, mFlowElementToTFlowElement);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mNameToTName] = " + mNameToTName + ", " + "[tName] = " + tName + ", " + "[mName] = "
					+ mName + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mType] = " + mType + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
					+ "[mSignature] = " + mSignature + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		MethodSignatureImpl.pattern_MethodSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult, tName,
				mName, tSignature, mType, mSignatureToTSignature, mSignature, tAbstractType,
				mFlowElementToTFlowElement);
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureImpl.pattern_MethodSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mNameToTName, tName, mName, mTypeToTType, tSignature, mType, mSignatureToTSignature, mSignature,
				tAbstractType, mFlowElementToTFlowElement);
		return MethodSignatureImpl.pattern_MethodSignature_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodSignatureImpl.pattern_MethodSignature_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodName mName = (MMethodName) result2_binding[0];
		Type mType = (Type) result2_binding[1];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[2];
		for (Object[] result2_black : MethodSignatureImpl.pattern_MethodSignature_2_2_corematch_blackFFBFBBFB(mName,
				mType, mSignature, match)) {
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[0];
			TMethod tName = (TMethod) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			TAbstractType tAbstractType = (TAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodSignatureImpl.pattern_MethodSignature_2_3_findcontext_blackBBBBBBB(
					mNameToTName, tName, mName, mTypeToTType, mType, mSignature, tAbstractType)) {
				Object[] result3_green = MethodSignatureImpl
						.pattern_MethodSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(mNameToTName, tName, mName,
								mTypeToTType, mType, mSignature, tAbstractType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodSignatureImpl
						.pattern_MethodSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mNameToTName, tName, mName, mTypeToTType, mType, mSignature, tAbstractType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mNameToTName] = " + mNameToTName
							+ ", " + "[tName] = " + tName + ", " + "[mName] = " + mName + ", " + "[mTypeToTType] = "
							+ mTypeToTType + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", "
							+ "[tAbstractType] = " + tAbstractType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodSignatureImpl.pattern_MethodSignature_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodSignatureImpl
							.pattern_MethodSignature_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodNameToTMethod mNameToTName,
			TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType, Type mType, MMethodSignature mSignature,
			TAbstractType tAbstractType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", csp);
		var_tSignature_upperBound.setType("int");

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mNameToTName, EObject tName, EObject mName,
			EObject mTypeToTType, EObject tSignature, EObject mType, EObject mSignatureToTSignature, EObject mSignature,
			EObject tAbstractType, EObject mFlowElementToTFlowElement) {
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);

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
	public boolean isAppropriate_BWD(Match match, TMethod tName, TMethodSignature tSignature,
			TAbstractType tAbstractType) {

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_10_1_initialbindings_blackBBBBB(this,
				match, tName, tSignature, tAbstractType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tName] = " + tName + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tAbstractType] = " + tAbstractType + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tName, tSignature,
						tAbstractType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tName] = " + tName + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tAbstractType] = " + tAbstractType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureImpl.pattern_MethodSignature_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodSignatureImpl
					.pattern_MethodSignature_10_4_collectelementstobetranslated_blackBBBB(match, tName, tSignature,
							tAbstractType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tName] = " + tName + ", " + "[tSignature] = " + tSignature + ", " + "[tAbstractType] = "
						+ tAbstractType + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_10_4_collectelementstobetranslated_greenBBBBFFF(match, tName,
					tSignature, tAbstractType);
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result4_green[6];

			Object[] result5_black = MethodSignatureImpl.pattern_MethodSignature_10_5_collectcontextelements_blackBBBB(
					match, tName, tSignature, tAbstractType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tName] = " + tName + ", " + "[tSignature] = " + tSignature + ", " + "[tAbstractType] = "
						+ tAbstractType + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_10_5_collectcontextelements_greenBBB(match, tName,
					tAbstractType);

			// 
			MethodSignatureImpl.pattern_MethodSignature_10_6_registerobjectstomatch_expressionBBBBB(this, match, tName,
					tSignature, tAbstractType);
			return MethodSignatureImpl.pattern_MethodSignature_10_7_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[0];
		TMethod tName = (TMethod) result1_bindingAndBlack[1];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_11_1_performtransformation_greenBBBFFF(mName, tSignature, mType);
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[3];
		MMethodSignature mSignature = (MMethodSignature) result1_green[4];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[5];

		Object[] result2_black = MethodSignatureImpl.pattern_MethodSignature_11_2_collecttranslatedelements_blackBBBB(
				tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		Object[] result2_green = MethodSignatureImpl.pattern_MethodSignature_11_2_collecttranslatedelements_greenFBBBB(
				tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureImpl.pattern_MethodSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mNameToTName, tName, mName, mTypeToTType, tSignature, mType, mSignatureToTSignature,
				mSignature, tAbstractType, mFlowElementToTFlowElement);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mNameToTName] = " + mNameToTName + ", " + "[tName] = " + tName + ", " + "[mName] = "
					+ mName + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mType] = " + mType + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
					+ "[mSignature] = " + mSignature + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		MethodSignatureImpl.pattern_MethodSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult, tName,
				mName, tSignature, mType, mSignatureToTSignature, mSignature, tAbstractType,
				mFlowElementToTFlowElement);
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureImpl.pattern_MethodSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mNameToTName, tName, mName, mTypeToTType, tSignature, mType, mSignatureToTSignature, mSignature,
				tAbstractType, mFlowElementToTFlowElement);
		return MethodSignatureImpl.pattern_MethodSignature_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodSignatureImpl.pattern_MethodSignature_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethod tName = (TMethod) result2_binding[0];
		TMethodSignature tSignature = (TMethodSignature) result2_binding[1];
		TAbstractType tAbstractType = (TAbstractType) result2_binding[2];
		for (Object[] result2_black : MethodSignatureImpl.pattern_MethodSignature_12_2_corematch_blackFBFFBFBB(tName,
				tSignature, tAbstractType, match)) {
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[0];
			MMethodName mName = (MMethodName) result2_black[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			Type mType = (Type) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodSignatureImpl.pattern_MethodSignature_12_3_findcontext_blackBBBBBBB(
					mNameToTName, tName, mName, mTypeToTType, tSignature, mType, tAbstractType)) {
				Object[] result3_green = MethodSignatureImpl
						.pattern_MethodSignature_12_3_findcontext_greenBBBBBBBFFFFFFFF(mNameToTName, tName, mName,
								mTypeToTType, tSignature, mType, tAbstractType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = MethodSignatureImpl
						.pattern_MethodSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mNameToTName, tName, mName, mTypeToTType, tSignature, mType, tAbstractType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mNameToTName] = " + mNameToTName
							+ ", " + "[tName] = " + tName + ", " + "[mName] = " + mName + ", " + "[mTypeToTType] = "
							+ mTypeToTType + ", " + "[tSignature] = " + tSignature + ", " + "[mType] = " + mType + ", "
							+ "[tAbstractType] = " + tAbstractType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodSignatureImpl.pattern_MethodSignature_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodSignatureImpl
							.pattern_MethodSignature_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethod tName, TMethodSignature tSignature,
			TAbstractType tAbstractType) {
		match.registerObject("tName", tName);
		match.registerObject("tSignature", tSignature);
		match.registerObject("tAbstractType", tAbstractType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethod tName, TMethodSignature tSignature,
			TAbstractType tAbstractType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodNameToTMethod mNameToTName,
			TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType, TMethodSignature tSignature, Type mType,
			TAbstractType tAbstractType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", true,
				csp);
		var_tSignature_upperBound.setValue(tSignature.getUpperBound());
		var_tSignature_upperBound.setType("int");

		// Create unbound variables

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mNameToTName, EObject tName, EObject mName,
			EObject mTypeToTType, EObject tSignature, EObject mType, EObject mSignatureToTSignature, EObject mSignature,
			EObject tAbstractType, EObject mFlowElementToTFlowElement) {
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_126(EMoflonEdge _edge_signatures) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_20_2_testcorematchandDECs_blackFFFB(_edge_signatures)) {
			TMethod tName = (TMethod) result2_black[0];
			TMethodSignature tSignature = (TMethodSignature) result2_black[1];
			TAbstractType tAbstractType = (TAbstractType) result2_black[2];
			Object[] result2_green = MethodSignatureImpl
					.pattern_MethodSignature_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureImpl
					.pattern_MethodSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tName, tSignature, tAbstractType)) {
				// 
				if (MethodSignatureImpl
						.pattern_MethodSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodSignatureImpl
							.pattern_MethodSignature_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_132(EMoflonEdge _edge_mSignatures) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_21_2_testcorematchandDECs_blackFFFB(_edge_mSignatures)) {
			MMethodName mName = (MMethodName) result2_black[0];
			Type mType = (Type) result2_black[1];
			MMethodSignature mSignature = (MMethodSignature) result2_black[2];
			Object[] result2_green = MethodSignatureImpl
					.pattern_MethodSignature_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureImpl
					.pattern_MethodSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mName, mType, mSignature)) {
				// 
				if (MethodSignatureImpl
						.pattern_MethodSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodSignatureImpl
							.pattern_MethodSignature_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodSignature");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		UpperBound upperBound0 = new UpperBound();
		csp.getConstraints().add(upperBound0);

		upperBound0.setRuleName("MethodSignature");
		upperBound0.solve(var_mType_name, var_tSignature_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tSignature_upperBound.setBound(false);
			upperBound0.solve(var_mType_name, var_tSignature_upperBound);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tSignature", "upperBound", var_tSignature_upperBound.getValue());
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
		ruleResult.setRule("MethodSignature");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		UpperBound upperBound0 = new UpperBound();
		csp.getConstraints().add(upperBound0);

		upperBound0.setRuleName("MethodSignature");
		upperBound0.solve(var_mType_name, var_tSignature_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			upperBound0.solve(var_mType_name, var_tSignature_upperBound);
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

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMethod tName = (TMethod) result2_bindingAndBlack[0];
		MMethodName mName = (MMethodName) result2_bindingAndBlack[1];
		TMethodSignature tSignature = (TMethodSignature) result2_bindingAndBlack[2];
		Type mType = (Type) result2_bindingAndBlack[3];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[4];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tName, mName, tSignature, mType,
						mSignature, tAbstractType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tName] = " + tName + ", " + "[mName] = " + mName + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodSignatureImpl.pattern_MethodSignature_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodSignatureImpl
					.pattern_MethodSignature_24_5_matchcorrcontext_blackFBBFBBBB(tName, mName, mType, tAbstractType,
							sourceMatch, targetMatch)) {
				MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result5_black[0];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[3];
				Object[] result5_green = MethodSignatureImpl.pattern_MethodSignature_24_5_matchcorrcontext_greenBBBBF(
						mNameToTName, mTypeToTType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodSignatureImpl
						.pattern_MethodSignature_24_6_createcorrespondence_blackBBBBBBB(tName, mName, tSignature, mType,
								mSignature, tAbstractType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tName] = " + tName + ", "
							+ "[mName] = " + mName + ", " + "[tSignature] = " + tSignature + ", " + "[mType] = " + mType
							+ ", " + "[mSignature] = " + mSignature + ", " + "[tAbstractType] = " + tAbstractType + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				MethodSignatureImpl.pattern_MethodSignature_24_6_createcorrespondence_greenBFBFB(tSignature, mSignature,
						ccMatch);
				//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[1];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[3];

				Object[] result7_black = MethodSignatureImpl
						.pattern_MethodSignature_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodSignatureImpl.pattern_MethodSignature_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodSignatureImpl.pattern_MethodSignature_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMethod tName, MMethodName mName, TMethodSignature tSignature, Type mType,
			MMethodSignature mSignature, TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", true,
				csp);
		var_tSignature_upperBound.setValue(tSignature.getUpperBound());
		var_tSignature_upperBound.setType("int");

		// Create unbound variables

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tSignature_upperBound);
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
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_27_1_matchtggpattern_blackBBB(mName, mType,
				mSignature);
		if (result1_black != null) {
			return MethodSignatureImpl.pattern_MethodSignature_27_2_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethod tName, TMethodSignature tSignature, TAbstractType tAbstractType) {// 
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_28_1_matchtggpattern_blackBBB(tName,
				tSignature, tAbstractType);
		if (result1_black != null) {
			MethodSignatureImpl.pattern_MethodSignature_28_1_matchtggpattern_greenB(tSignature);

			return MethodSignatureImpl.pattern_MethodSignature_28_2_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MMethodNameToTMethod mNameToTNameParameter, TypeToTAbstractType mTypeToTTypeParameter) {

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mNameToTNameList = (RuleEntryList) result2_black[0];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[1];
			MMethodName mName = (MMethodName) result2_black[2];
			TMethod tName = (TMethod) result2_black[3];
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			Type mType = (Type) result2_black[6];
			TAbstractType tAbstractType = (TAbstractType) result2_black[7];

			Object[] result3_bindingAndBlack = MethodSignatureImpl
					.pattern_MethodSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mNameToTName, tName, mName, mTypeToTType, mType, tAbstractType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mNameToTName] = " + mNameToTName
						+ ", " + "[tName] = " + tName + ", " + "[mName] = " + mName + ", " + "[mTypeToTType] = "
						+ mTypeToTType + ", " + "[mType] = " + mType + ", " + "[tAbstractType] = " + tAbstractType
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodSignatureImpl.pattern_MethodSignature_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodSignatureImpl.pattern_MethodSignature_29_5_checknacs_blackBBBBBB(
						mNameToTName, tName, mName, mTypeToTType, mType, tAbstractType);
				if (result5_black != null) {

					Object[] result6_black = MethodSignatureImpl.pattern_MethodSignature_29_6_perform_blackBBBBBBB(
							mNameToTName, tName, mName, mTypeToTType, mType, tAbstractType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mNameToTName] = "
								+ mNameToTName + ", " + "[tName] = " + tName + ", " + "[mName] = " + mName + ", "
								+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mType] = " + mType + ", "
								+ "[tAbstractType] = " + tAbstractType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_29_6_perform_greenBBFBFFBFBB(tName, mName, mType,
							tAbstractType, ruleResult, csp);
					//nothing TMethodSignature tSignature = (TMethodSignature) result6_green[2];
					//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[4];
					//nothing MMethodSignature mSignature = (MMethodSignature) result6_green[5];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodNameToTMethod mNameToTName,
			TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType, Type mType, TAbstractType tAbstractType,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", csp);
		var_tSignature_upperBound.setType("int");

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
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
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_FWD__MATCH_MMETHODNAME_TYPE_MMETHODSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodName) arguments.get(1), (Type) arguments.get(2),
					(MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODNAME_TYPE_MMETHODSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodName) arguments.get(1),
					(Type) arguments.get(2), (MMethodSignature) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODNAME_TYPE_MMETHODSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodName) arguments.get(1),
					(Type) arguments.get(2), (MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODNAMETOTMETHOD_TMETHOD_MMETHODNAME_TYPETOTABSTRACTTYPE_TYPE_MMETHODSIGNATURE_TABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MMethodNameToTMethod) arguments.get(1), (TMethod) arguments.get(2), (MMethodName) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (Type) arguments.get(5),
					(MMethodSignature) arguments.get(6), (TAbstractType) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_SIGNATURE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_BWD__MATCH_TMETHOD_TMETHODSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethod) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TAbstractType) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHOD_TMETHODSIGNATURE_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethod) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TAbstractType) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHOD_TMETHODSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethod) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TAbstractType) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODNAMETOTMETHOD_TMETHOD_MMETHODNAME_TYPETOTABSTRACTTYPE_TMETHODSIGNATURE_TYPE_TABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MMethodNameToTMethod) arguments.get(1), (TMethod) arguments.get(2), (MMethodName) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TMethodSignature) arguments.get(5),
					(Type) arguments.get(6), (TAbstractType) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_SIGNATURE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_126__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_126((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_132__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_132((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_CC__TMETHOD_MMETHODNAME_TMETHODSIGNATURE_TYPE_MMETHODSIGNATURE_TABSTRACTTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMethod) arguments.get(0), (MMethodName) arguments.get(1),
					(TMethodSignature) arguments.get(2), (Type) arguments.get(3), (MMethodSignature) arguments.get(4),
					(TAbstractType) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_DEC_FWD__MMETHODNAME_TYPE_MMETHODSIGNATURE:
			return checkDEC_FWD((MMethodName) arguments.get(0), (Type) arguments.get(1),
					(MMethodSignature) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___CHECK_DEC_BWD__TMETHOD_TMETHODSIGNATURE_TABSTRACTTYPE:
			return checkDEC_BWD((TMethod) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL__RULEENTRYCONTAINER_MMETHODNAMETOTMETHOD_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (MMethodNameToTMethod) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODNAMETOTMETHOD_TMETHOD_MMETHODNAME_TYPETOTABSTRACTTYPE_TYPE_TABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MMethodNameToTMethod) arguments.get(1), (TMethod) arguments.get(2), (MMethodName) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (Type) arguments.get(5), (TAbstractType) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodSignature_0_1_initialbindings_blackBBBBB(MethodSignature _this,
			Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {
		return new Object[] { _this, match, mName, mType, mSignature };
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_bindingFBBBBB(MethodSignature _this, Match match,
			MMethodName mName, Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mName, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mName, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(MethodSignature _this,
			Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodSignature_0_2_SolveCSP_binding = pattern_MethodSignature_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mName, mType, mSignature);
		if (result_pattern_MethodSignature_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignature_0_2_SolveCSP_black = pattern_MethodSignature_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mName, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_0_3_CheckCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MMethodName mName, Type mType, MMethodSignature mSignature) {
		return new Object[] { match, mName, mType, mSignature };
	}

	public static final Object[] pattern_MethodSignature_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			MMethodName mName, Type mType, MMethodSignature mSignature) {
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

	public static final Object[] pattern_MethodSignature_0_5_collectcontextelements_blackBBBB(Match match,
			MMethodName mName, Type mType, MMethodSignature mSignature) {
		return new Object[] { match, mName, mType, mSignature };
	}

	public static final Object[] pattern_MethodSignature_0_5_collectcontextelements_greenBBB(Match match,
			MMethodName mName, Type mType) {
		match.getContextNodes().add(mName);
		match.getContextNodes().add(mType);
		return new Object[] { match, mName, mType };
	}

	public static final void pattern_MethodSignature_0_6_registerobjectstomatch_expressionBBBBB(MethodSignature _this,
			Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mName, mType, mSignature);

	}

	public static final boolean pattern_MethodSignature_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_1 = isApplicableMatch.getObject("tName");
		EObject _localVariable_2 = isApplicableMatch.getObject("mName");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("tAbstractType");
		EObject tmpMNameToTName = _localVariable_0;
		EObject tmpTName = _localVariable_1;
		EObject tmpMName = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		EObject tmpTAbstractType = _localVariable_6;
		if (tmpMNameToTName instanceof MMethodNameToTMethod) {
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
			if (tmpTName instanceof TMethod) {
				TMethod tName = (TMethod) tmpTName;
				if (tmpMName instanceof MMethodName) {
					MMethodName mName = (MMethodName) tmpMName;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpMType instanceof Type) {
							Type mType = (Type) tmpMType;
							if (tmpMSignature instanceof MMethodSignature) {
								MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
								if (tmpTAbstractType instanceof TAbstractType) {
									TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
									return new Object[] { mNameToTName, tName, mName, mTypeToTType, mType, mSignature,
											tAbstractType, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_blackBBBBBBBFBB(
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType,
			Type mType, MMethodSignature mSignature, TAbstractType tAbstractType, MethodSignature _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mNameToTName, tName, mName, mTypeToTType, mType, mSignature, tAbstractType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignature_1_1_performtransformation_binding = pattern_MethodSignature_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignature_1_1_performtransformation_binding != null) {
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignature_1_1_performtransformation_binding[0];
			TMethod tName = (TMethod) result_pattern_MethodSignature_1_1_performtransformation_binding[1];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_1_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignature_1_1_performtransformation_binding[3];
			Type mType = (Type) result_pattern_MethodSignature_1_1_performtransformation_binding[4];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignature_1_1_performtransformation_binding[5];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodSignature_1_1_performtransformation_binding[6];

			Object[] result_pattern_MethodSignature_1_1_performtransformation_black = pattern_MethodSignature_1_1_performtransformation_blackBBBBBBBFBB(
					mNameToTName, tName, mName, mTypeToTType, mType, mSignature, tAbstractType, _this,
					isApplicableMatch);
			if (result_pattern_MethodSignature_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignature_1_1_performtransformation_black[7];

				return new Object[] { mNameToTName, tName, mName, mTypeToTType, mType, mSignature, tAbstractType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_greenBFFBBFB(TMethod tName,
			MMethodSignature mSignature, TAbstractType tAbstractType, CSP csp) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		tName.getSignatures().add(tSignature);
		tSignature.setReturnType(tAbstractType);
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		return new Object[] { tName, tSignature, mSignatureToTSignature, mSignature, tAbstractType,
				mFlowElementToTFlowElement, csp };
	}

	public static final Object[] pattern_MethodSignature_1_2_collecttranslatedelements_blackBBBB(
			TMethodSignature tSignature, MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		return new Object[] { tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodSignature_1_2_collecttranslatedelements_greenFBBBB(
			TMethodSignature tSignature, MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getTranslatedElements().add(mSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		return new Object[] { ruleresult, tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mNameToTName, EObject tName, EObject mName, EObject mTypeToTType,
			EObject tSignature, EObject mType, EObject mSignatureToTSignature, EObject mSignature,
			EObject tAbstractType, EObject mFlowElementToTFlowElement) {
		if (!mNameToTName.equals(tName)) {
			if (!mNameToTName.equals(mTypeToTType)) {
				if (!mNameToTName.equals(tSignature)) {
					if (!mNameToTName.equals(mType)) {
						if (!mNameToTName.equals(mSignatureToTSignature)) {
							if (!mNameToTName.equals(mSignature)) {
								if (!mNameToTName.equals(tAbstractType)) {
									if (!tName.equals(tSignature)) {
										if (!mName.equals(mNameToTName)) {
											if (!mName.equals(tName)) {
												if (!mName.equals(mTypeToTType)) {
													if (!mName.equals(tSignature)) {
														if (!mName.equals(mType)) {
															if (!mName.equals(mSignatureToTSignature)) {
																if (!mName.equals(mSignature)) {
																	if (!mName.equals(tAbstractType)) {
																		if (!mTypeToTType.equals(tName)) {
																			if (!mTypeToTType.equals(tSignature)) {
																				if (!mTypeToTType
																						.equals(tAbstractType)) {
																					if (!mType.equals(tName)) {
																						if (!mType
																								.equals(mTypeToTType)) {
																							if (!mType.equals(
																									tSignature)) {
																								if (!mType.equals(
																										tAbstractType)) {
																									if (!mSignatureToTSignature
																											.equals(tName)) {
																										if (!mSignatureToTSignature
																												.equals(mTypeToTType)) {
																											if (!mSignatureToTSignature
																													.equals(tSignature)) {
																												if (!mSignatureToTSignature
																														.equals(mType)) {
																													if (!mSignatureToTSignature
																															.equals(tAbstractType)) {
																														if (!mSignature
																																.equals(tName)) {
																															if (!mSignature
																																	.equals(mTypeToTType)) {
																																if (!mSignature
																																		.equals(tSignature)) {
																																	if (!mSignature
																																			.equals(mType)) {
																																		if (!mSignature
																																				.equals(mSignatureToTSignature)) {
																																			if (!mSignature
																																					.equals(tAbstractType)) {
																																				if (!tAbstractType
																																						.equals(tName)) {
																																					if (!tAbstractType
																																							.equals(tSignature)) {
																																						if (!mFlowElementToTFlowElement
																																								.equals(mNameToTName)) {
																																							if (!mFlowElementToTFlowElement
																																									.equals(tName)) {
																																								if (!mFlowElementToTFlowElement
																																										.equals(mName)) {
																																									if (!mFlowElementToTFlowElement
																																											.equals(mTypeToTType)) {
																																										if (!mFlowElementToTFlowElement
																																												.equals(tSignature)) {
																																											if (!mFlowElementToTFlowElement
																																													.equals(mType)) {
																																												if (!mFlowElementToTFlowElement
																																														.equals(mSignatureToTSignature)) {
																																													if (!mFlowElementToTFlowElement
																																															.equals(mSignature)) {
																																														if (!mFlowElementToTFlowElement
																																																.equals(tAbstractType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mNameToTName,
																																																	tName,
																																																	mName,
																																																	mTypeToTType,
																																																	tSignature,
																																																	mType,
																																																	mSignatureToTSignature,
																																																	mSignature,
																																																	tAbstractType,
																																																	mFlowElementToTFlowElement };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tName, EObject mName, EObject tSignature, EObject mType,
			EObject mSignatureToTSignature, EObject mSignature, EObject tAbstractType,
			EObject mFlowElementToTFlowElement) {
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignature";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignature__mType____returnType_name_prime = "returnType";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____method);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mName__mSignature____mSignatures);
		tSignature__tAbstractType____returnType.setSrc(tSignature);
		tSignature__tAbstractType____returnType.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tSignature__tAbstractType____returnType);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mSignature__mType____returnType);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		return new Object[] { ruleresult, tName, mName, tSignature, mType, mSignatureToTSignature, mSignature,
				tAbstractType, mFlowElementToTFlowElement, tName__tSignature____signatures, tSignature__tName____method,
				mName__mSignature____mSignatures, tSignature__tAbstractType____returnType,
				mSignatureToTSignature__tSignature____target, mSignatureToTSignature__mSignature____source,
				mSignature__mType____returnType, mFlowElementToTFlowElement__mSignature____source,
				mFlowElementToTFlowElement__tSignature____target };
	}

	public static final void pattern_MethodSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(MethodSignature _this,
			PerformRuleResult ruleresult, EObject mNameToTName, EObject tName, EObject mName, EObject mTypeToTType,
			EObject tSignature, EObject mType, EObject mSignatureToTSignature, EObject mSignature,
			EObject tAbstractType, EObject mFlowElementToTFlowElement) {
		_this.registerObjects_FWD(ruleresult, mNameToTName, tName, mName, mTypeToTType, tSignature, mType,
				mSignatureToTSignature, mSignature, tAbstractType, mFlowElementToTFlowElement);

	}

	public static final PerformRuleResult pattern_MethodSignature_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_2_1_preparereturnvalue_binding = pattern_MethodSignature_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignature_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_2_1_preparereturnvalue_black = pattern_MethodSignature_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignature_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignature_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignature_2_2_corematch_bindingFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MethodSignature_2_2_corematch_blackFFBFBBFB(MMethodName mName,
			Type mType, MMethodSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
			TMethod tName = mNameToTName.getTarget();
			if (tName != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tAbstractType = mTypeToTType.getTarget();
					if (tAbstractType != null) {
						_result.add(new Object[] { mNameToTName, tName, mName, mTypeToTType, mType, mSignature,
								tAbstractType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_2_3_findcontext_blackBBBBBBB(
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType,
			Type mType, MMethodSignature mSignature, TAbstractType tAbstractType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mName.getMSignatures().contains(mSignature)) {
			if (mName.equals(mNameToTName.getSource())) {
				if (mType.equals(mTypeToTType.getSource())) {
					if (tName.equals(mNameToTName.getTarget())) {
						if (mType.equals(mSignature.getReturnType())) {
							if (tAbstractType.equals(mTypeToTType.getTarget())) {
								_result.add(new Object[] { mNameToTName, tName, mName, mTypeToTType, mType, mSignature,
										tAbstractType });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType,
			Type mType, MMethodSignature mSignature, TAbstractType tAbstractType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mNameToTName__mName____source_name_prime = "source";
		String mTypeToTType__mType____source_name_prime = "source";
		String mNameToTName__tName____target_name_prime = "target";
		String mSignature__mType____returnType_name_prime = "returnType";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mName__mSignature____mSignatures);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mSignature__mType____returnType);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		return new Object[] { mNameToTName, tName, mName, mTypeToTType, mType, mSignature, tAbstractType,
				isApplicableMatch, mName__mSignature____mSignatures, mNameToTName__mName____source,
				mTypeToTType__mType____source, mNameToTName__tName____target, mSignature__mType____returnType,
				mTypeToTType__tAbstractType____target };
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_bindingFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName,
			TypeToTAbstractType mTypeToTType, Type mType, MMethodSignature mSignature, TAbstractType tAbstractType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mNameToTName, tName, mName,
				mTypeToTType, mType, mSignature, tAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mNameToTName, tName, mName, mTypeToTType, mType,
					mSignature, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName,
			TypeToTAbstractType mTypeToTType, Type mType, MMethodSignature mSignature, TAbstractType tAbstractType) {
		Object[] result_pattern_MethodSignature_2_4_solveCSP_binding = pattern_MethodSignature_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mNameToTName, tName, mName, mTypeToTType, mType, mSignature, tAbstractType);
		if (result_pattern_MethodSignature_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_2_4_solveCSP_black = pattern_MethodSignature_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mNameToTName, tName, mName, mTypeToTType, mType,
						mSignature, tAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_2_5_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignature_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignature_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_10_1_initialbindings_blackBBBBB(MethodSignature _this,
			Match match, TMethod tName, TMethodSignature tSignature, TAbstractType tAbstractType) {
		return new Object[] { _this, match, tName, tSignature, tAbstractType };
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_bindingFBBBBB(MethodSignature _this, Match match,
			TMethod tName, TMethodSignature tSignature, TAbstractType tAbstractType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tName, tSignature, tAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tName, tSignature, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(MethodSignature _this,
			Match match, TMethod tName, TMethodSignature tSignature, TAbstractType tAbstractType) {
		Object[] result_pattern_MethodSignature_10_2_SolveCSP_binding = pattern_MethodSignature_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tName, tSignature, tAbstractType);
		if (result_pattern_MethodSignature_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignature_10_2_SolveCSP_black = pattern_MethodSignature_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tName, tSignature, tAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_10_3_CheckCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TMethod tName, TMethodSignature tSignature, TAbstractType tAbstractType) {
		return new Object[] { match, tName, tSignature, tAbstractType };
	}

	public static final Object[] pattern_MethodSignature_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			TMethod tName, TMethodSignature tSignature, TAbstractType tAbstractType) {
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____method);
		tSignature__tAbstractType____returnType.setSrc(tSignature);
		tSignature__tAbstractType____returnType.setTrg(tAbstractType);
		match.getToBeTranslatedEdges().add(tSignature__tAbstractType____returnType);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		return new Object[] { match, tName, tSignature, tAbstractType, tName__tSignature____signatures,
				tSignature__tName____method, tSignature__tAbstractType____returnType };
	}

	public static final Object[] pattern_MethodSignature_10_5_collectcontextelements_blackBBBB(Match match,
			TMethod tName, TMethodSignature tSignature, TAbstractType tAbstractType) {
		return new Object[] { match, tName, tSignature, tAbstractType };
	}

	public static final Object[] pattern_MethodSignature_10_5_collectcontextelements_greenBBB(Match match,
			TMethod tName, TAbstractType tAbstractType) {
		match.getContextNodes().add(tName);
		match.getContextNodes().add(tAbstractType);
		return new Object[] { match, tName, tAbstractType };
	}

	public static final void pattern_MethodSignature_10_6_registerobjectstomatch_expressionBBBBB(MethodSignature _this,
			Match match, TMethod tName, TMethodSignature tSignature, TAbstractType tAbstractType) {
		_this.registerObjectsToMatch_BWD(match, tName, tSignature, tAbstractType);

	}

	public static final boolean pattern_MethodSignature_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_1 = isApplicableMatch.getObject("tName");
		EObject _localVariable_2 = isApplicableMatch.getObject("mName");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tAbstractType");
		EObject tmpMNameToTName = _localVariable_0;
		EObject tmpTName = _localVariable_1;
		EObject tmpMName = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpTSignature = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpTAbstractType = _localVariable_6;
		if (tmpMNameToTName instanceof MMethodNameToTMethod) {
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
			if (tmpTName instanceof TMethod) {
				TMethod tName = (TMethod) tmpTName;
				if (tmpMName instanceof MMethodName) {
					MMethodName mName = (MMethodName) tmpMName;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpTSignature instanceof TMethodSignature) {
							TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpTAbstractType instanceof TAbstractType) {
									TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
									return new Object[] { mNameToTName, tName, mName, mTypeToTType, tSignature, mType,
											tAbstractType, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_blackBBBBBBBFBB(
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType,
			TMethodSignature tSignature, Type mType, TAbstractType tAbstractType, MethodSignature _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mNameToTName, tName, mName, mTypeToTType, tSignature, mType, tAbstractType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignature_11_1_performtransformation_binding = pattern_MethodSignature_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignature_11_1_performtransformation_binding != null) {
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignature_11_1_performtransformation_binding[0];
			TMethod tName = (TMethod) result_pattern_MethodSignature_11_1_performtransformation_binding[1];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_11_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignature_11_1_performtransformation_binding[3];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignature_11_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_MethodSignature_11_1_performtransformation_binding[5];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodSignature_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodSignature_11_1_performtransformation_black = pattern_MethodSignature_11_1_performtransformation_blackBBBBBBBFBB(
					mNameToTName, tName, mName, mTypeToTType, tSignature, mType, tAbstractType, _this,
					isApplicableMatch);
			if (result_pattern_MethodSignature_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignature_11_1_performtransformation_black[7];

				return new Object[] { mNameToTName, tName, mName, mTypeToTType, tSignature, mType, tAbstractType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_greenBBBFFF(MMethodName mName,
			TMethodSignature tSignature, Type mType) {
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MMethodSignature mSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mSignatureToTSignature.setTarget(tSignature);
		mName.getMSignatures().add(mSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignature.setReturnType(mType);
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		return new Object[] { mName, tSignature, mType, mSignatureToTSignature, mSignature,
				mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodSignature_11_2_collecttranslatedelements_blackBBBB(
			TMethodSignature tSignature, MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		return new Object[] { tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodSignature_11_2_collecttranslatedelements_greenFBBBB(
			TMethodSignature tSignature, MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getCreatedElements().add(mSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		return new Object[] { ruleresult, tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mNameToTName, EObject tName, EObject mName, EObject mTypeToTType,
			EObject tSignature, EObject mType, EObject mSignatureToTSignature, EObject mSignature,
			EObject tAbstractType, EObject mFlowElementToTFlowElement) {
		if (!mNameToTName.equals(tName)) {
			if (!mNameToTName.equals(mTypeToTType)) {
				if (!mNameToTName.equals(tSignature)) {
					if (!mNameToTName.equals(mType)) {
						if (!mNameToTName.equals(mSignatureToTSignature)) {
							if (!mNameToTName.equals(mSignature)) {
								if (!mNameToTName.equals(tAbstractType)) {
									if (!tName.equals(tSignature)) {
										if (!mName.equals(mNameToTName)) {
											if (!mName.equals(tName)) {
												if (!mName.equals(mTypeToTType)) {
													if (!mName.equals(tSignature)) {
														if (!mName.equals(mType)) {
															if (!mName.equals(mSignatureToTSignature)) {
																if (!mName.equals(mSignature)) {
																	if (!mName.equals(tAbstractType)) {
																		if (!mTypeToTType.equals(tName)) {
																			if (!mTypeToTType.equals(tSignature)) {
																				if (!mTypeToTType
																						.equals(tAbstractType)) {
																					if (!mType.equals(tName)) {
																						if (!mType
																								.equals(mTypeToTType)) {
																							if (!mType.equals(
																									tSignature)) {
																								if (!mType.equals(
																										tAbstractType)) {
																									if (!mSignatureToTSignature
																											.equals(tName)) {
																										if (!mSignatureToTSignature
																												.equals(mTypeToTType)) {
																											if (!mSignatureToTSignature
																													.equals(tSignature)) {
																												if (!mSignatureToTSignature
																														.equals(mType)) {
																													if (!mSignatureToTSignature
																															.equals(tAbstractType)) {
																														if (!mSignature
																																.equals(tName)) {
																															if (!mSignature
																																	.equals(mTypeToTType)) {
																																if (!mSignature
																																		.equals(tSignature)) {
																																	if (!mSignature
																																			.equals(mType)) {
																																		if (!mSignature
																																				.equals(mSignatureToTSignature)) {
																																			if (!mSignature
																																					.equals(tAbstractType)) {
																																				if (!tAbstractType
																																						.equals(tName)) {
																																					if (!tAbstractType
																																							.equals(tSignature)) {
																																						if (!mFlowElementToTFlowElement
																																								.equals(mNameToTName)) {
																																							if (!mFlowElementToTFlowElement
																																									.equals(tName)) {
																																								if (!mFlowElementToTFlowElement
																																										.equals(mName)) {
																																									if (!mFlowElementToTFlowElement
																																											.equals(mTypeToTType)) {
																																										if (!mFlowElementToTFlowElement
																																												.equals(tSignature)) {
																																											if (!mFlowElementToTFlowElement
																																													.equals(mType)) {
																																												if (!mFlowElementToTFlowElement
																																														.equals(mSignatureToTSignature)) {
																																													if (!mFlowElementToTFlowElement
																																															.equals(mSignature)) {
																																														if (!mFlowElementToTFlowElement
																																																.equals(tAbstractType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mNameToTName,
																																																	tName,
																																																	mName,
																																																	mTypeToTType,
																																																	tSignature,
																																																	mType,
																																																	mSignatureToTSignature,
																																																	mSignature,
																																																	tAbstractType,
																																																	mFlowElementToTFlowElement };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tName, EObject mName, EObject tSignature, EObject mType,
			EObject mSignatureToTSignature, EObject mSignature, EObject tAbstractType,
			EObject mFlowElementToTFlowElement) {
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignature";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignature__mType____returnType_name_prime = "returnType";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____method);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mName__mSignature____mSignatures);
		tSignature__tAbstractType____returnType.setSrc(tSignature);
		tSignature__tAbstractType____returnType.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tSignature__tAbstractType____returnType);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getCreatedEdges().add(mSignature__mType____returnType);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		return new Object[] { ruleresult, tName, mName, tSignature, mType, mSignatureToTSignature, mSignature,
				tAbstractType, mFlowElementToTFlowElement, tName__tSignature____signatures, tSignature__tName____method,
				mName__mSignature____mSignatures, tSignature__tAbstractType____returnType,
				mSignatureToTSignature__tSignature____target, mSignatureToTSignature__mSignature____source,
				mSignature__mType____returnType, mFlowElementToTFlowElement__mSignature____source,
				mFlowElementToTFlowElement__tSignature____target };
	}

	public static final void pattern_MethodSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(MethodSignature _this,
			PerformRuleResult ruleresult, EObject mNameToTName, EObject tName, EObject mName, EObject mTypeToTType,
			EObject tSignature, EObject mType, EObject mSignatureToTSignature, EObject mSignature,
			EObject tAbstractType, EObject mFlowElementToTFlowElement) {
		_this.registerObjects_BWD(ruleresult, mNameToTName, tName, mName, mTypeToTType, tSignature, mType,
				mSignatureToTSignature, mSignature, tAbstractType, mFlowElementToTFlowElement);

	}

	public static final PerformRuleResult pattern_MethodSignature_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_12_1_preparereturnvalue_binding = pattern_MethodSignature_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignature_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_12_1_preparereturnvalue_black = pattern_MethodSignature_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignature_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignature_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignature_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tName");
		EObject _localVariable_1 = match.getObject("tSignature");
		EObject _localVariable_2 = match.getObject("tAbstractType");
		EObject tmpTName = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		if (tmpTName instanceof TMethod) {
			TMethod tName = (TMethod) tmpTName;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					return new Object[] { tName, tSignature, tAbstractType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_12_2_corematch_blackFBFFBFBB(TMethod tName,
			TMethodSignature tSignature, TAbstractType tAbstractType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tSignature_lowerBound = tSignature.getLowerBound();
		if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
			for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tName, MMethodNameToTMethod.class, "target")) {
				MMethodName mName = mNameToTName.getSource();
				if (mName != null) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
						Type mType = mTypeToTType.getSource();
						if (mType != null) {
							_result.add(new Object[] { mNameToTName, tName, mName, mTypeToTType, tSignature, mType,
									tAbstractType, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_12_3_findcontext_blackBBBBBBB(
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType,
			TMethodSignature tSignature, Type mType, TAbstractType tAbstractType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tName.getSignatures().contains(tSignature)) {
			if (mName.equals(mNameToTName.getSource())) {
				if (tAbstractType.equals(tSignature.getReturnType())) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (tName.equals(mNameToTName.getTarget())) {
							if (tAbstractType.equals(mTypeToTType.getTarget())) {
								int tSignature_lowerBound = tSignature.getLowerBound();
								if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
									_result.add(new Object[] { mNameToTName, tName, mName, mTypeToTType, tSignature,
											mType, tAbstractType });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType,
			TMethodSignature tSignature, Type mType, TAbstractType tAbstractType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mNameToTName__mName____source_name_prime = "source";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		String mTypeToTType__mType____source_name_prime = "source";
		String mNameToTName__tName____target_name_prime = "target";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____method);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		tSignature__tAbstractType____returnType.setSrc(tSignature);
		tSignature__tAbstractType____returnType.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tSignature__tAbstractType____returnType);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		return new Object[] { mNameToTName, tName, mName, mTypeToTType, tSignature, mType, tAbstractType,
				isApplicableMatch, tName__tSignature____signatures, tSignature__tName____method,
				mNameToTName__mName____source, tSignature__tAbstractType____returnType, mTypeToTType__mType____source,
				mNameToTName__tName____target, mTypeToTType__tAbstractType____target };
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_bindingFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName,
			TypeToTAbstractType mTypeToTType, TMethodSignature tSignature, Type mType, TAbstractType tAbstractType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mNameToTName, tName, mName,
				mTypeToTType, tSignature, mType, tAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mNameToTName, tName, mName, mTypeToTType, tSignature,
					mType, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName,
			TypeToTAbstractType mTypeToTType, TMethodSignature tSignature, Type mType, TAbstractType tAbstractType) {
		Object[] result_pattern_MethodSignature_12_4_solveCSP_binding = pattern_MethodSignature_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mNameToTName, tName, mName, mTypeToTType, tSignature, mType, tAbstractType);
		if (result_pattern_MethodSignature_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_12_4_solveCSP_black = pattern_MethodSignature_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mNameToTName, tName, mName, mTypeToTType,
						tSignature, mType, tAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_12_5_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignature_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignature_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignature _this) {
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

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_20_1_preparereturnvalue_binding = pattern_MethodSignature_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignature_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_20_1_preparereturnvalue_black = pattern_MethodSignature_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignature_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignature_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignature_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodSignature_20_2_testcorematchandDECs_black_nac_0BB(
			TMethodSignature tSignature, TMethod tName) {
		TMethod __DEC_tSignature_method_761352 = tSignature.getMethod();
		if (__DEC_tSignature_method_761352 != null) {
			if (!tName.equals(__DEC_tSignature_method_761352)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_signatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTName = _edge_signatures.getSrc();
		if (tmpTName instanceof TMethod) {
			TMethod tName = (TMethod) tmpTName;
			EObject tmpTSignature = _edge_signatures.getTrg();
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tName.getSignatures().contains(tSignature)) {
					TAbstractType tAbstractType = tSignature.getReturnType();
					if (tAbstractType != null) {
						int tSignature_lowerBound = tSignature.getLowerBound();
						if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
							if (pattern_MethodSignature_20_2_testcorematchandDECs_black_nac_0BB(tSignature,
									tName) == null) {
								_result.add(new Object[] { tName, tSignature, tAbstractType, _edge_signatures });
							}
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignature_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodSignature _this, Match match, TMethod tName, TMethodSignature tSignature,
			TAbstractType tAbstractType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tName, tSignature, tAbstractType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignature_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignature _this) {
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

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_21_1_preparereturnvalue_binding = pattern_MethodSignature_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignature_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_21_1_preparereturnvalue_black = pattern_MethodSignature_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignature_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignature_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignature_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignature_21_2_testcorematchandDECs_blackFFFB(
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

	public static final Object[] pattern_MethodSignature_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodSignature _this, Match match, MMethodName mName, Type mType, MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mName, mType, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignature_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_24_1_prepare_blackB(MethodSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignature_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tName");
		EObject _localVariable_1 = sourceMatch.getObject("mName");
		EObject _localVariable_2 = targetMatch.getObject("tSignature");
		EObject _localVariable_3 = sourceMatch.getObject("mType");
		EObject _localVariable_4 = sourceMatch.getObject("mSignature");
		EObject _localVariable_5 = targetMatch.getObject("tAbstractType");
		EObject tmpTName = _localVariable_0;
		EObject tmpMName = _localVariable_1;
		EObject tmpTSignature = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpMSignature = _localVariable_4;
		EObject tmpTAbstractType = _localVariable_5;
		if (tmpTName instanceof TMethod) {
			TMethod tName = (TMethod) tmpTName;
			if (tmpMName instanceof MMethodName) {
				MMethodName mName = (MMethodName) tmpMName;
				if (tmpTSignature instanceof TMethodSignature) {
					TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						if (tmpMSignature instanceof MMethodSignature) {
							MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
							if (tmpTAbstractType instanceof TAbstractType) {
								TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
								return new Object[] { tName, mName, tSignature, mType, mSignature, tAbstractType,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(TMethod tName,
			MMethodName mName, TMethodSignature tSignature, Type mType, MMethodSignature mSignature,
			TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				return new Object[] { tName, mName, tSignature, mType, mSignature, tAbstractType, sourceMatch,
						targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding = pattern_MethodSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding != null) {
			TMethod tName = (TMethod) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[0];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[1];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[2];
			Type mType = (Type) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[3];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[4];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MethodSignature_24_2_matchsrctrgcontext_black = pattern_MethodSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tName, mName, tSignature, mType, mSignature, tAbstractType, sourceMatch, targetMatch);
			if (result_pattern_MethodSignature_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tName, mName, tSignature, mType, mSignature, tAbstractType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_3_solvecsp_bindingFBBBBBBBBB(MethodSignature _this,
			TMethod tName, MMethodName mName, TMethodSignature tSignature, Type mType, MMethodSignature mSignature,
			TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tName, mName, tSignature, mType, mSignature,
				tAbstractType, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tName, mName, tSignature, mType, mSignature, tAbstractType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			TMethod tName, MMethodName mName, TMethodSignature tSignature, Type mType, MMethodSignature mSignature,
			TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignature_24_3_solvecsp_binding = pattern_MethodSignature_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tName, mName, tSignature, mType, mSignature, tAbstractType, sourceMatch, targetMatch);
		if (result_pattern_MethodSignature_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodSignature_24_3_solvecsp_black = pattern_MethodSignature_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodSignature_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tName, mName, tSignature, mType, mSignature, tAbstractType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_24_5_matchcorrcontext_blackFBBFBBBB(TMethod tName,
			MMethodName mName, Type mType, TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
				if (tName.equals(mNameToTName.getTarget())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
						if (tAbstractType.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { mNameToTName, tName, mName, mTypeToTType, mType, tAbstractType,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_24_5_matchcorrcontext_greenBBBBF(
			MMethodNameToTMethod mNameToTName, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodSignature";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mNameToTName);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mNameToTName, mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_6_createcorrespondence_blackBBBBBBB(TMethod tName,
			MMethodName mName, TMethodSignature tSignature, Type mType, MMethodSignature mSignature,
			TAbstractType tAbstractType, CCMatch ccMatch) {
		return new Object[] { tName, mName, tSignature, mType, mSignature, tAbstractType, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_6_createcorrespondence_greenBFBFB(
			TMethodSignature tSignature, MMethodSignature mSignature, CCMatch ccMatch) {
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		ccMatch.getCreateCorr().add(mSignatureToTSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		return new Object[] { tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodSignature";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignature_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_27_1_matchtggpattern_blackBBB(MMethodName mName, Type mType,
			MMethodSignature mSignature) {
		if (mName.getMSignatures().contains(mSignature)) {
			if (mType.equals(mSignature.getReturnType())) {
				return new Object[] { mName, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_28_1_matchtggpattern_black_nac_0BB(TMethodSignature tSignature,
			TMethod tName) {
		TMethod __DEC_tSignature_method_729512 = tSignature.getMethod();
		if (__DEC_tSignature_method_729512 != null) {
			if (!tName.equals(__DEC_tSignature_method_729512)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodSignature_28_1_matchtggpattern_blackBBB(TMethod tName,
			TMethodSignature tSignature, TAbstractType tAbstractType) {
		if (tName.getSignatures().contains(tSignature)) {
			if (tAbstractType.equals(tSignature.getReturnType())) {
				if (pattern_MethodSignature_28_1_matchtggpattern_black_nac_0BB(tSignature, tName) == null) {
					return new Object[] { tName, tSignature, tAbstractType };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_28_1_matchtggpattern_greenB(TMethodSignature tSignature) {
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		return new Object[] { tSignature };
	}

	public static final boolean pattern_MethodSignature_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_29_1_createresult_blackB(MethodSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignature_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodNameToTMethod mNameToTName) {
		if (ruleResult.getCorrObjects().contains(mNameToTName)) {
			return new Object[] { ruleResult, mNameToTName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MMethodName mName) {
		if (ruleResult.getSourceObjects().contains(mName)) {
			return new Object[] { ruleResult, mName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMethod tName) {
		if (ruleResult.getTargetObjects().contains(tName)) {
			return new Object[] { ruleResult, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mNameToTNameList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!mNameToTNameList.equals(mTypeToTTypeList)) {
					for (EObject tmpMNameToTName : mNameToTNameList.getEntryObjects()) {
						if (tmpMNameToTName instanceof MMethodNameToTMethod) {
							MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
							MMethodName mName = mNameToTName.getSource();
							if (mName != null) {
								TMethod tName = mNameToTName.getTarget();
								if (tName != null) {
									if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mNameToTName) == null) {
										if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												mName) == null) {
											if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tName) == null) {
												for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
													if (tmpMTypeToTType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
														Type mType = mTypeToTType.getSource();
														if (mType != null) {
															TAbstractType tAbstractType = mTypeToTType.getTarget();
															if (tAbstractType != null) {
																if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, mTypeToTType) == null) {
																	if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, mType) == null) {
																		if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, tAbstractType) == null) {
																			_result.add(new Object[] { mNameToTNameList,
																					mNameToTName, mName, tName,
																					mTypeToTTypeList, mTypeToTType,
																					mType, tAbstractType,
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

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_bindingFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName,
			TypeToTAbstractType mTypeToTType, Type mType, TAbstractType tAbstractType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mNameToTName, tName, mName,
				mTypeToTType, mType, tAbstractType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mNameToTName, tName, mName, mTypeToTType, mType,
					tAbstractType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodNameToTMethod mNameToTName, TMethod tName, MMethodName mName,
			TypeToTAbstractType mTypeToTType, Type mType, TAbstractType tAbstractType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodSignature_29_3_solveCSP_binding = pattern_MethodSignature_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mNameToTName, tName, mName, mTypeToTType, mType, tAbstractType, ruleResult);
		if (result_pattern_MethodSignature_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_29_3_solveCSP_black = pattern_MethodSignature_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mNameToTName, tName, mName, mTypeToTType, mType,
						tAbstractType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_29_4_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_29_5_checknacs_blackBBBBBB(MMethodNameToTMethod mNameToTName,
			TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType, Type mType,
			TAbstractType tAbstractType) {
		return new Object[] { mNameToTName, tName, mName, mTypeToTType, mType, tAbstractType };
	}

	public static final Object[] pattern_MethodSignature_29_6_perform_blackBBBBBBB(MMethodNameToTMethod mNameToTName,
			TMethod tName, MMethodName mName, TypeToTAbstractType mTypeToTType, Type mType, TAbstractType tAbstractType,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mNameToTName, tName, mName, mTypeToTType, mType, tAbstractType, ruleResult };
	}

	public static final Object[] pattern_MethodSignature_29_6_perform_greenBBFBFFBFBB(TMethod tName, MMethodName mName,
			Type mType, TAbstractType tAbstractType, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MMethodSignature mSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		tName.getSignatures().add(tSignature);
		tSignature.setReturnType(tAbstractType);
		ruleResult.getTargetObjects().add(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mSignatureToTSignature);
		mName.getMSignatures().add(mSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignature.setReturnType(mType);
		ruleResult.getSourceObjects().add(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tName, mName, tSignature, mType, mSignatureToTSignature, mSignature, tAbstractType,
				mFlowElementToTFlowElement, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodSignature_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodSignatureImpl
