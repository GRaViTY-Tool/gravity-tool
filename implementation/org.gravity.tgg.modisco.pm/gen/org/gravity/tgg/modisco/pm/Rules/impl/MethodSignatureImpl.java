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
	public boolean isAppropriate_FWD(Match match, MMethodSignature mSignature, MMethodName mName, Type mType) {

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_0_1_initialbindings_blackBBBBB(this, match,
				mSignature, mName, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", " + "[mName] = " + mName + ", "
					+ "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mSignature, mName, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", " + "[mName] = " + mName + ", "
					+ "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureImpl.pattern_MethodSignature_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodSignatureImpl
					.pattern_MethodSignature_0_4_collectelementstobetranslated_blackBBBB(match, mSignature, mName,
							mType);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mSignature] = "
								+ mSignature + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_0_4_collectelementstobetranslated_greenBBBBFF(match, mSignature,
					mName, mType);
			//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodSignatureImpl
					.pattern_MethodSignature_0_5_collectcontextelements_blackBBBB(match, mSignature, mName, mType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mSignature] = "
								+ mSignature + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_0_5_collectcontextelements_greenBBB(match, mName, mType);

			// 
			MethodSignatureImpl.pattern_MethodSignature_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					mSignature, mName, mType);
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
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[2];
		TMethod tName = (TMethod) result1_bindingAndBlack[3];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[4];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[5];
		Type mType = (Type) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_1_1_performtransformation_greenBBBFFFB(mSignature, tAbstractType, tName, csp);
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[4];
		TMethodSignature tSignature = (TMethodSignature) result1_green[5];

		Object[] result2_black = MethodSignatureImpl.pattern_MethodSignature_1_2_collecttranslatedelements_blackBBBB(
				mSignature, mFlowElementToTFlowElement, mSignatureToTSignature, tSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSignature] = " + mSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[tSignature] = " + tSignature
					+ ".");
		}
		Object[] result2_green = MethodSignatureImpl.pattern_MethodSignature_1_2_collecttranslatedelements_greenFBBBB(
				mSignature, mFlowElementToTFlowElement, mSignatureToTSignature, tSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureImpl.pattern_MethodSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mSignature, mTypeToTType, tAbstractType, tName, mFlowElementToTFlowElement, mNameToTName,
				mName, mSignatureToTSignature, mType, tSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[tName] = " + tName + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mNameToTName] = "
					+ mNameToTName + ", " + "[mName] = " + mName + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[tSignature] = " + tSignature
					+ ".");
		}
		MethodSignatureImpl.pattern_MethodSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
				mSignature, tAbstractType, tName, mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType,
				tSignature);
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureImpl.pattern_MethodSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mSignature, mTypeToTType, tAbstractType, tName, mFlowElementToTFlowElement, mNameToTName, mName,
				mSignatureToTSignature, mType, tSignature);
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
		MMethodSignature mSignature = (MMethodSignature) result2_binding[0];
		MMethodName mName = (MMethodName) result2_binding[1];
		Type mType = (Type) result2_binding[2];
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_2_2_corematch_blackBFFFFBBB(mSignature, mName, mType, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TAbstractType tAbstractType = (TAbstractType) result2_black[2];
			TMethod tName = (TMethod) result2_black[3];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[4];
			// ForEach 
			for (Object[] result3_black : MethodSignatureImpl.pattern_MethodSignature_2_3_findcontext_blackBBBBBBB(
					mSignature, mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType)) {
				Object[] result3_green = MethodSignatureImpl
						.pattern_MethodSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(mSignature, mTypeToTType,
								tAbstractType, tName, mNameToTName, mName, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodSignatureImpl
						.pattern_MethodSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mSignature, mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignature] = " + mSignature
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tAbstractType] = " + tAbstractType
							+ ", " + "[tName] = " + tName + ", " + "[mNameToTName] = " + mNameToTName + ", "
							+ "[mName] = " + mName + ", " + "[mType] = " + mType + ".");
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
	public void registerObjectsToMatch_FWD(Match match, MMethodSignature mSignature, MMethodName mName, Type mType) {
		match.registerObject("mSignature", mSignature);
		match.registerObject("mName", mName);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodSignature mSignature, MMethodName mName, Type mType) {// Create CSP
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
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TMethod tName,
			MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType) {// Create CSP
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
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mSignature, EObject mTypeToTType,
			EObject tAbstractType, EObject tName, EObject mFlowElementToTFlowElement, EObject mNameToTName,
			EObject mName, EObject mSignatureToTSignature, EObject mType, EObject tSignature) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tSignature", tSignature);

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
	public boolean isAppropriate_BWD(Match match, TAbstractType tAbstractType, TMethod tName,
			TMethodSignature tSignature) {

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_10_1_initialbindings_blackBBBBB(this,
				match, tAbstractType, tName, tSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tName] = " + tName
					+ ", " + "[tSignature] = " + tSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAbstractType, tName,
						tSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tName] = " + tName
					+ ", " + "[tSignature] = " + tSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureImpl.pattern_MethodSignature_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodSignatureImpl
					.pattern_MethodSignature_10_4_collectelementstobetranslated_blackBBBB(match, tAbstractType, tName,
							tSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[tName] = " + tName + ", " + "[tSignature] = "
						+ tSignature + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_10_4_collectelementstobetranslated_greenBBBBFFF(match,
					tAbstractType, tName, tSignature);
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result4_green[6];

			Object[] result5_black = MethodSignatureImpl.pattern_MethodSignature_10_5_collectcontextelements_blackBBBB(
					match, tAbstractType, tName, tSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[tName] = " + tName + ", " + "[tSignature] = "
						+ tSignature + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_10_5_collectcontextelements_greenBBB(match, tAbstractType,
					tName);

			// 
			MethodSignatureImpl.pattern_MethodSignature_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tAbstractType, tName, tSignature);
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
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[1];
		TMethod tName = (TMethod) result1_bindingAndBlack[2];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[3];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_11_1_performtransformation_greenFFBFBB(mName, mType, tSignature);
		MMethodSignature mSignature = (MMethodSignature) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[1];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[3];

		Object[] result2_black = MethodSignatureImpl.pattern_MethodSignature_11_2_collecttranslatedelements_blackBBBB(
				mSignature, mFlowElementToTFlowElement, mSignatureToTSignature, tSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSignature] = " + mSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[tSignature] = " + tSignature
					+ ".");
		}
		Object[] result2_green = MethodSignatureImpl.pattern_MethodSignature_11_2_collecttranslatedelements_greenFBBBB(
				mSignature, mFlowElementToTFlowElement, mSignatureToTSignature, tSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureImpl.pattern_MethodSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mSignature, mTypeToTType, tAbstractType, tName, mFlowElementToTFlowElement, mNameToTName,
				mName, mSignatureToTSignature, mType, tSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[tName] = " + tName + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mNameToTName] = "
					+ mNameToTName + ", " + "[mName] = " + mName + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[tSignature] = " + tSignature
					+ ".");
		}
		MethodSignatureImpl.pattern_MethodSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
				mSignature, tAbstractType, tName, mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType,
				tSignature);
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureImpl.pattern_MethodSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mSignature, mTypeToTType, tAbstractType, tName, mFlowElementToTFlowElement, mNameToTName, mName,
				mSignatureToTSignature, mType, tSignature);
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
		TAbstractType tAbstractType = (TAbstractType) result2_binding[0];
		TMethod tName = (TMethod) result2_binding[1];
		TMethodSignature tSignature = (TMethodSignature) result2_binding[2];
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_12_2_corematch_blackFBBFFFBB(tAbstractType, tName, tSignature, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[3];
			MMethodName mName = (MMethodName) result2_black[4];
			Type mType = (Type) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodSignatureImpl.pattern_MethodSignature_12_3_findcontext_blackBBBBBBB(
					mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, tSignature)) {
				Object[] result3_green = MethodSignatureImpl
						.pattern_MethodSignature_12_3_findcontext_greenBBBBBBBFFFFFFFF(mTypeToTType, tAbstractType,
								tName, mNameToTName, mName, mType, tSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = MethodSignatureImpl
						.pattern_MethodSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, tSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tName] = " + tName + ", "
							+ "[mNameToTName] = " + mNameToTName + ", " + "[mName] = " + mName + ", " + "[mType] = "
							+ mType + ", " + "[tSignature] = " + tSignature + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tAbstractType, TMethod tName,
			TMethodSignature tSignature) {
		match.registerObject("tAbstractType", tAbstractType);
		match.registerObject("tName", tName);
		match.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tAbstractType, TMethod tName,
			TMethodSignature tSignature) {// Create CSP
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
			TAbstractType tAbstractType, TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName,
			Type mType, TMethodSignature tSignature) {// Create CSP
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
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tSignature", tSignature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mSignature, EObject mTypeToTType,
			EObject tAbstractType, EObject tName, EObject mFlowElementToTFlowElement, EObject mNameToTName,
			EObject mName, EObject mSignatureToTSignature, EObject mType, EObject tSignature) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mNameToTName", mNameToTName);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tSignature", tSignature);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_44(EMoflonEdge _edge_signatures) {

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
			TAbstractType tAbstractType = (TAbstractType) result2_black[0];
			TMethod tName = (TMethod) result2_black[1];
			TMethodSignature tSignature = (TMethodSignature) result2_black[2];
			Object[] result2_green = MethodSignatureImpl
					.pattern_MethodSignature_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureImpl
					.pattern_MethodSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tAbstractType, tName, tSignature)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_46(EMoflonEdge _edge_mSignatures) {

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
			MMethodSignature mSignature = (MMethodSignature) result2_black[0];
			MMethodName mName = (MMethodName) result2_black[1];
			Type mType = (Type) result2_black[2];
			Object[] result2_green = MethodSignatureImpl
					.pattern_MethodSignature_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureImpl
					.pattern_MethodSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mSignature, mName, mType)) {
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

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

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

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

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
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[0];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[1];
		TMethod tName = (TMethod) result2_bindingAndBlack[2];
		MMethodName mName = (MMethodName) result2_bindingAndBlack[3];
		Type mType = (Type) result2_bindingAndBlack[4];
		TMethodSignature tSignature = (TMethodSignature) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mSignature, tAbstractType, tName,
						mName, mType, tSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mSignature] = " + mSignature + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tName] = "
					+ tName + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", " + "[tSignature] = "
					+ tSignature + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodSignatureImpl.pattern_MethodSignature_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodSignatureImpl
					.pattern_MethodSignature_24_5_matchcorrcontext_blackFBBFBBBB(tAbstractType, tName, mName, mType,
							sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result5_black[3];
				Object[] result5_green = MethodSignatureImpl.pattern_MethodSignature_24_5_matchcorrcontext_greenBBBBF(
						mTypeToTType, mNameToTName, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodSignatureImpl
						.pattern_MethodSignature_24_6_createcorrespondence_blackBBBBBBB(mSignature, tAbstractType,
								tName, mName, mType, tSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSignature] = "
							+ mSignature + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tName] = " + tName
							+ ", " + "[mName] = " + mName + ", " + "[mType] = " + mType + ", " + "[tSignature] = "
							+ tSignature + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodSignatureImpl.pattern_MethodSignature_24_6_createcorrespondence_greenBFFBB(mSignature, tSignature,
						ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
				//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(MMethodSignature mSignature, TAbstractType tAbstractType, TMethod tName,
			MMethodName mName, Type mType, TMethodSignature tSignature, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MMethodSignature mSignature, MMethodName mName, Type mType) {// 
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_27_1_matchtggpattern_blackBBB(mSignature,
				mName, mType);
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
	public boolean checkDEC_BWD(TAbstractType tAbstractType, TMethod tName, TMethodSignature tSignature) {// 
		Object[] result1_black = MethodSignatureImpl
				.pattern_MethodSignature_28_1_matchtggpattern_blackBBB(tAbstractType, tName, tSignature);
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
			TypeToTAbstractType mTypeToTTypeParameter, MMethodNameToTMethod mNameToTNameParameter) {

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
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TAbstractType tAbstractType = (TAbstractType) result2_black[2];
			Type mType = (Type) result2_black[3];
			//nothing RuleEntryList mNameToTNameList = (RuleEntryList) result2_black[4];
			TMethod tName = (TMethod) result2_black[5];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[6];
			MMethodName mName = (MMethodName) result2_black[7];

			Object[] result3_bindingAndBlack = MethodSignatureImpl
					.pattern_MethodSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tName] = " + tName + ", "
						+ "[mNameToTName] = " + mNameToTName + ", " + "[mName] = " + mName + ", " + "[mType] = " + mType
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodSignatureImpl.pattern_MethodSignature_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodSignatureImpl.pattern_MethodSignature_29_5_checknacs_blackBBBBBB(
						mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType);
				if (result5_black != null) {

					Object[] result6_black = MethodSignatureImpl.pattern_MethodSignature_29_6_perform_blackBBBBBBB(
							mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tName] = "
								+ tName + ", " + "[mNameToTName] = " + mNameToTName + ", " + "[mName] = " + mName + ", "
								+ "[mType] = " + mType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_29_6_perform_greenFBBFBFBFBB(tAbstractType, tName,
							mName, mType, ruleResult, csp);
					//nothing MMethodSignature mSignature = (MMethodSignature) result6_green[0];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[3];
					//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[5];
					//nothing TMethodSignature tSignature = (TMethodSignature) result6_green[7];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName,
			Type mType, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
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
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_FWD__MATCH_MMETHODSIGNATURE_MMETHODNAME_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodName) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODSIGNATURE_MMETHODNAME_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodName) arguments.get(2), (Type) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODSIGNATURE_MMETHODNAME_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MMethodName) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TMETHOD_MMETHODNAMETOTMETHOD_MMETHODNAME_TYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MMethodSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TAbstractType) arguments.get(3),
					(TMethod) arguments.get(4), (MMethodNameToTMethod) arguments.get(5), (MMethodName) arguments.get(6),
					(Type) arguments.get(7));
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
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TMETHOD_TMETHODSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethod) arguments.get(2), (TMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TMETHOD_TMETHODSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethod) arguments.get(2), (TMethodSignature) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TMETHOD_TMETHODSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethod) arguments.get(2), (TMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TMETHOD_MMETHODNAMETOTMETHOD_MMETHODNAME_TYPE_TMETHODSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(TMethod) arguments.get(3), (MMethodNameToTMethod) arguments.get(4), (MMethodName) arguments.get(5),
					(Type) arguments.get(6), (TMethodSignature) arguments.get(7));
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
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_46__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_46((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_CC__MMETHODSIGNATURE_TABSTRACTTYPE_TMETHOD_MMETHODNAME_TYPE_TMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MMethodSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethod) arguments.get(2), (MMethodName) arguments.get(3), (Type) arguments.get(4),
					(TMethodSignature) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_DEC_FWD__MMETHODSIGNATURE_MMETHODNAME_TYPE:
			return checkDEC_FWD((MMethodSignature) arguments.get(0), (MMethodName) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___CHECK_DEC_BWD__TABSTRACTTYPE_TMETHOD_TMETHODSIGNATURE:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TMethod) arguments.get(1),
					(TMethodSignature) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MMETHODNAMETOTMETHOD:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MMethodNameToTMethod) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TMETHOD_MMETHODNAMETOTMETHOD_MMETHODNAME_TYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(TMethod) arguments.get(3), (MMethodNameToTMethod) arguments.get(4), (MMethodName) arguments.get(5),
					(Type) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodSignature_0_1_initialbindings_blackBBBBB(MethodSignature _this,
			Match match, MMethodSignature mSignature, MMethodName mName, Type mType) {
		return new Object[] { _this, match, mSignature, mName, mType };
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_bindingFBBBBB(MethodSignature _this, Match match,
			MMethodSignature mSignature, MMethodName mName, Type mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSignature, mName, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSignature, mName, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(MethodSignature _this,
			Match match, MMethodSignature mSignature, MMethodName mName, Type mType) {
		Object[] result_pattern_MethodSignature_0_2_SolveCSP_binding = pattern_MethodSignature_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mSignature, mName, mType);
		if (result_pattern_MethodSignature_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignature_0_2_SolveCSP_black = pattern_MethodSignature_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSignature, mName, mType };
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
			MMethodSignature mSignature, MMethodName mName, Type mType) {
		return new Object[] { match, mSignature, mName, mType };
	}

	public static final Object[] pattern_MethodSignature_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			MMethodSignature mSignature, MMethodName mName, Type mType) {
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
		return new Object[] { match, mSignature, mName, mType, mName__mSignature____mSignatures,
				mSignature__mType____returnType };
	}

	public static final Object[] pattern_MethodSignature_0_5_collectcontextelements_blackBBBB(Match match,
			MMethodSignature mSignature, MMethodName mName, Type mType) {
		return new Object[] { match, mSignature, mName, mType };
	}

	public static final Object[] pattern_MethodSignature_0_5_collectcontextelements_greenBBB(Match match,
			MMethodName mName, Type mType) {
		match.getContextNodes().add(mName);
		match.getContextNodes().add(mType);
		return new Object[] { match, mName, mType };
	}

	public static final void pattern_MethodSignature_0_6_registerobjectstomatch_expressionBBBBB(MethodSignature _this,
			Match match, MMethodSignature mSignature, MMethodName mName, Type mType) {
		_this.registerObjectsToMatch_FWD(match, mSignature, mName, mType);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tName");
		EObject _localVariable_4 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_5 = isApplicableMatch.getObject("mName");
		EObject _localVariable_6 = isApplicableMatch.getObject("mType");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpTName = _localVariable_3;
		EObject tmpMNameToTName = _localVariable_4;
		EObject tmpMName = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpTName instanceof TMethod) {
						TMethod tName = (TMethod) tmpTName;
						if (tmpMNameToTName instanceof MMethodNameToTMethod) {
							MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
							if (tmpMName instanceof MMethodName) {
								MMethodName mName = (MMethodName) tmpMName;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									return new Object[] { mSignature, mTypeToTType, tAbstractType, tName, mNameToTName,
											mName, mType, isApplicableMatch };
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
			MMethodSignature mSignature, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TMethod tName,
			MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType, MethodSignature _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, csp,
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
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignature_1_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignature_1_1_performtransformation_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodSignature_1_1_performtransformation_binding[2];
			TMethod tName = (TMethod) result_pattern_MethodSignature_1_1_performtransformation_binding[3];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignature_1_1_performtransformation_binding[4];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_1_1_performtransformation_binding[5];
			Type mType = (Type) result_pattern_MethodSignature_1_1_performtransformation_binding[6];

			Object[] result_pattern_MethodSignature_1_1_performtransformation_black = pattern_MethodSignature_1_1_performtransformation_blackBBBBBBBFBB(
					mSignature, mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, _this,
					isApplicableMatch);
			if (result_pattern_MethodSignature_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignature_1_1_performtransformation_black[7];

				return new Object[] { mSignature, mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_greenBBBFFFB(
			MMethodSignature mSignature, TAbstractType tAbstractType, TMethod tName, CSP csp) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		mFlowElementToTFlowElement.setSource(mSignature);
		mSignatureToTSignature.setSource(mSignature);
		tName.getSignatures().add(tSignature);
		tSignature.setReturnType(tAbstractType);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		return new Object[] { mSignature, tAbstractType, tName, mFlowElementToTFlowElement, mSignatureToTSignature,
				tSignature, csp };
	}

	public static final Object[] pattern_MethodSignature_1_2_collecttranslatedelements_blackBBBB(
			MMethodSignature mSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, TMethodSignature tSignature) {
		return new Object[] { mSignature, mFlowElementToTFlowElement, mSignatureToTSignature, tSignature };
	}

	public static final Object[] pattern_MethodSignature_1_2_collecttranslatedelements_greenFBBBB(
			MMethodSignature mSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, TMethodSignature tSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getCreatedElements().add(tSignature);
		return new Object[] { ruleresult, mSignature, mFlowElementToTFlowElement, mSignatureToTSignature, tSignature };
	}

	public static final Object[] pattern_MethodSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject mTypeToTType, EObject tAbstractType,
			EObject tName, EObject mFlowElementToTFlowElement, EObject mNameToTName, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject tSignature) {
		if (!mSignature.equals(mTypeToTType)) {
			if (!mSignature.equals(tAbstractType)) {
				if (!mSignature.equals(tName)) {
					if (!mSignature.equals(mSignatureToTSignature)) {
						if (!mSignature.equals(mType)) {
							if (!mSignature.equals(tSignature)) {
								if (!mTypeToTType.equals(tAbstractType)) {
									if (!mTypeToTType.equals(tName)) {
										if (!mTypeToTType.equals(tSignature)) {
											if (!tAbstractType.equals(tName)) {
												if (!tAbstractType.equals(tSignature)) {
													if (!tName.equals(tSignature)) {
														if (!mFlowElementToTFlowElement.equals(mSignature)) {
															if (!mFlowElementToTFlowElement.equals(mTypeToTType)) {
																if (!mFlowElementToTFlowElement.equals(tAbstractType)) {
																	if (!mFlowElementToTFlowElement.equals(tName)) {
																		if (!mFlowElementToTFlowElement
																				.equals(mNameToTName)) {
																			if (!mFlowElementToTFlowElement
																					.equals(mName)) {
																				if (!mFlowElementToTFlowElement.equals(
																						mSignatureToTSignature)) {
																					if (!mFlowElementToTFlowElement
																							.equals(mType)) {
																						if (!mFlowElementToTFlowElement
																								.equals(tSignature)) {
																							if (!mNameToTName.equals(
																									mSignature)) {
																								if (!mNameToTName
																										.equals(mTypeToTType)) {
																									if (!mNameToTName
																											.equals(tAbstractType)) {
																										if (!mNameToTName
																												.equals(tName)) {
																											if (!mNameToTName
																													.equals(mSignatureToTSignature)) {
																												if (!mNameToTName
																														.equals(mType)) {
																													if (!mNameToTName
																															.equals(tSignature)) {
																														if (!mName
																																.equals(mSignature)) {
																															if (!mName
																																	.equals(mTypeToTType)) {
																																if (!mName
																																		.equals(tAbstractType)) {
																																	if (!mName
																																			.equals(tName)) {
																																		if (!mName
																																				.equals(mNameToTName)) {
																																			if (!mName
																																					.equals(mSignatureToTSignature)) {
																																				if (!mName
																																						.equals(mType)) {
																																					if (!mName
																																							.equals(tSignature)) {
																																						if (!mSignatureToTSignature
																																								.equals(mTypeToTType)) {
																																							if (!mSignatureToTSignature
																																									.equals(tAbstractType)) {
																																								if (!mSignatureToTSignature
																																										.equals(tName)) {
																																									if (!mSignatureToTSignature
																																											.equals(mType)) {
																																										if (!mSignatureToTSignature
																																												.equals(tSignature)) {
																																											if (!mType
																																													.equals(mTypeToTType)) {
																																												if (!mType
																																														.equals(tAbstractType)) {
																																													if (!mType
																																															.equals(tName)) {
																																														if (!mType
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mSignature,
																																																	mTypeToTType,
																																																	tAbstractType,
																																																	tName,
																																																	mFlowElementToTFlowElement,
																																																	mNameToTName,
																																																	mName,
																																																	mSignatureToTSignature,
																																																	mType,
																																																	tSignature };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mSignature, EObject tAbstractType, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mName, EObject mSignatureToTSignature, EObject mType,
			EObject tSignature) {
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignature";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mSignature__mType____returnType_name_prime = "returnType";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
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
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mSignature__mType____returnType);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		return new Object[] { ruleresult, mSignature, tAbstractType, tName, mFlowElementToTFlowElement, mName,
				mSignatureToTSignature, mType, tSignature, mFlowElementToTFlowElement__mSignature____source,
				tName__tSignature____signatures, tSignature__tName____method, mName__mSignature____mSignatures,
				tSignature__tAbstractType____returnType, mFlowElementToTFlowElement__tSignature____target,
				mSignatureToTSignature__tSignature____target, mSignature__mType____returnType,
				mSignatureToTSignature__mSignature____source };
	}

	public static final void pattern_MethodSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(MethodSignature _this,
			PerformRuleResult ruleresult, EObject mSignature, EObject mTypeToTType, EObject tAbstractType,
			EObject tName, EObject mFlowElementToTFlowElement, EObject mNameToTName, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject tSignature) {
		_this.registerObjects_FWD(ruleresult, mSignature, mTypeToTType, tAbstractType, tName,
				mFlowElementToTFlowElement, mNameToTName, mName, mSignatureToTSignature, mType, tSignature);

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
		EObject _localVariable_0 = match.getObject("mSignature");
		EObject _localVariable_1 = match.getObject("mName");
		EObject _localVariable_2 = match.getObject("mType");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMName = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpMName instanceof MMethodName) {
				MMethodName mName = (MMethodName) tmpMName;
				if (tmpMType instanceof Type) {
					Type mType = (Type) tmpMType;
					return new Object[] { mSignature, mName, mType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_2_2_corematch_blackBFFFFBBB(
			MMethodSignature mSignature, MMethodName mName, Type mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
			TMethod tName = mNameToTName.getTarget();
			if (tName != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tAbstractType = mTypeToTType.getTarget();
					if (tAbstractType != null) {
						_result.add(new Object[] { mSignature, mTypeToTType, tAbstractType, tName, mNameToTName, mName,
								mType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_2_3_findcontext_blackBBBBBBB(
			MMethodSignature mSignature, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TMethod tName,
			MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAbstractType.equals(mTypeToTType.getTarget())) {
			if (tName.equals(mNameToTName.getTarget())) {
				if (mName.getMSignatures().contains(mSignature)) {
					if (mName.equals(mNameToTName.getSource())) {
						if (mType.equals(mTypeToTType.getSource())) {
							if (mType.equals(mSignature.getReturnType())) {
								_result.add(new Object[] { mSignature, mTypeToTType, tAbstractType, tName, mNameToTName,
										mName, mType });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(
			MMethodSignature mSignature, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TMethod tName,
			MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String mNameToTName__tName____target_name_prime = "target";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mNameToTName__mName____source_name_prime = "source";
		String mTypeToTType__mType____source_name_prime = "source";
		String mSignature__mType____returnType_name_prime = "returnType";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mType);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mName__mSignature____mSignatures);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mSignature__mType____returnType);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		return new Object[] { mSignature, mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType,
				isApplicableMatch, mTypeToTType__tAbstractType____target, mNameToTName__tName____target,
				mName__mSignature____mSignatures, mNameToTName__mName____source, mTypeToTType__mType____source,
				mSignature__mType____returnType };
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_bindingFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName,
			Type mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSignature, mTypeToTType,
				tAbstractType, tName, mNameToTName, mName, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, mTypeToTType, tAbstractType, tName,
					mNameToTName, mName, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, MMethodSignature mSignature, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName,
			Type mType) {
		Object[] result_pattern_MethodSignature_2_4_solveCSP_binding = pattern_MethodSignature_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mSignature, mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType);
		if (result_pattern_MethodSignature_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_2_4_solveCSP_black = pattern_MethodSignature_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, mTypeToTType, tAbstractType, tName,
						mNameToTName, mName, mType };
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
			Match match, TAbstractType tAbstractType, TMethod tName, TMethodSignature tSignature) {
		return new Object[] { _this, match, tAbstractType, tName, tSignature };
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_bindingFBBBBB(MethodSignature _this, Match match,
			TAbstractType tAbstractType, TMethod tName, TMethodSignature tSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAbstractType, tName, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAbstractType, tName, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(MethodSignature _this,
			Match match, TAbstractType tAbstractType, TMethod tName, TMethodSignature tSignature) {
		Object[] result_pattern_MethodSignature_10_2_SolveCSP_binding = pattern_MethodSignature_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAbstractType, tName, tSignature);
		if (result_pattern_MethodSignature_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignature_10_2_SolveCSP_black = pattern_MethodSignature_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAbstractType, tName, tSignature };
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
			TAbstractType tAbstractType, TMethod tName, TMethodSignature tSignature) {
		return new Object[] { match, tAbstractType, tName, tSignature };
	}

	public static final Object[] pattern_MethodSignature_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			TAbstractType tAbstractType, TMethod tName, TMethodSignature tSignature) {
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
		return new Object[] { match, tAbstractType, tName, tSignature, tName__tSignature____signatures,
				tSignature__tName____method, tSignature__tAbstractType____returnType };
	}

	public static final Object[] pattern_MethodSignature_10_5_collectcontextelements_blackBBBB(Match match,
			TAbstractType tAbstractType, TMethod tName, TMethodSignature tSignature) {
		return new Object[] { match, tAbstractType, tName, tSignature };
	}

	public static final Object[] pattern_MethodSignature_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tAbstractType, TMethod tName) {
		match.getContextNodes().add(tAbstractType);
		match.getContextNodes().add(tName);
		return new Object[] { match, tAbstractType, tName };
	}

	public static final void pattern_MethodSignature_10_6_registerobjectstomatch_expressionBBBBB(MethodSignature _this,
			Match match, TAbstractType tAbstractType, TMethod tName, TMethodSignature tSignature) {
		_this.registerObjectsToMatch_BWD(match, tAbstractType, tName, tSignature);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tName");
		EObject _localVariable_3 = isApplicableMatch.getObject("mNameToTName");
		EObject _localVariable_4 = isApplicableMatch.getObject("mName");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSignature");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpMNameToTName = _localVariable_3;
		EObject tmpMName = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpTSignature = _localVariable_6;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpTName instanceof TMethod) {
					TMethod tName = (TMethod) tmpTName;
					if (tmpMNameToTName instanceof MMethodNameToTMethod) {
						MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
						if (tmpMName instanceof MMethodName) {
							MMethodName mName = (MMethodName) tmpMName;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpTSignature instanceof TMethodSignature) {
									TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
									return new Object[] { mTypeToTType, tAbstractType, tName, mNameToTName, mName,
											mType, tSignature, isApplicableMatch };
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
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TMethod tName,
			MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType, TMethodSignature tSignature,
			MethodSignature _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, tSignature, csp,
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
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignature_11_1_performtransformation_binding[0];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodSignature_11_1_performtransformation_binding[1];
			TMethod tName = (TMethod) result_pattern_MethodSignature_11_1_performtransformation_binding[2];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignature_11_1_performtransformation_binding[3];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_11_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_MethodSignature_11_1_performtransformation_binding[5];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignature_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodSignature_11_1_performtransformation_black = pattern_MethodSignature_11_1_performtransformation_blackBBBBBBBFBB(
					mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, tSignature, _this,
					isApplicableMatch);
			if (result_pattern_MethodSignature_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignature_11_1_performtransformation_black[7];

				return new Object[] { mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, tSignature, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_greenFFBFBB(MMethodName mName,
			Type mType, TMethodSignature tSignature) {
		MMethodSignature mSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		mName.getMSignatures().add(mSignature);
		mSignature.setReturnType(mType);
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		return new Object[] { mSignature, mFlowElementToTFlowElement, mName, mSignatureToTSignature, mType,
				tSignature };
	}

	public static final Object[] pattern_MethodSignature_11_2_collecttranslatedelements_blackBBBB(
			MMethodSignature mSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, TMethodSignature tSignature) {
		return new Object[] { mSignature, mFlowElementToTFlowElement, mSignatureToTSignature, tSignature };
	}

	public static final Object[] pattern_MethodSignature_11_2_collecttranslatedelements_greenFBBBB(
			MMethodSignature mSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, TMethodSignature tSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getTranslatedElements().add(tSignature);
		return new Object[] { ruleresult, mSignature, mFlowElementToTFlowElement, mSignatureToTSignature, tSignature };
	}

	public static final Object[] pattern_MethodSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject mTypeToTType, EObject tAbstractType,
			EObject tName, EObject mFlowElementToTFlowElement, EObject mNameToTName, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject tSignature) {
		if (!mSignature.equals(mTypeToTType)) {
			if (!mSignature.equals(tAbstractType)) {
				if (!mSignature.equals(tName)) {
					if (!mSignature.equals(mSignatureToTSignature)) {
						if (!mSignature.equals(mType)) {
							if (!mSignature.equals(tSignature)) {
								if (!mTypeToTType.equals(tAbstractType)) {
									if (!mTypeToTType.equals(tName)) {
										if (!mTypeToTType.equals(tSignature)) {
											if (!tAbstractType.equals(tName)) {
												if (!tAbstractType.equals(tSignature)) {
													if (!tName.equals(tSignature)) {
														if (!mFlowElementToTFlowElement.equals(mSignature)) {
															if (!mFlowElementToTFlowElement.equals(mTypeToTType)) {
																if (!mFlowElementToTFlowElement.equals(tAbstractType)) {
																	if (!mFlowElementToTFlowElement.equals(tName)) {
																		if (!mFlowElementToTFlowElement
																				.equals(mNameToTName)) {
																			if (!mFlowElementToTFlowElement
																					.equals(mName)) {
																				if (!mFlowElementToTFlowElement.equals(
																						mSignatureToTSignature)) {
																					if (!mFlowElementToTFlowElement
																							.equals(mType)) {
																						if (!mFlowElementToTFlowElement
																								.equals(tSignature)) {
																							if (!mNameToTName.equals(
																									mSignature)) {
																								if (!mNameToTName
																										.equals(mTypeToTType)) {
																									if (!mNameToTName
																											.equals(tAbstractType)) {
																										if (!mNameToTName
																												.equals(tName)) {
																											if (!mNameToTName
																													.equals(mSignatureToTSignature)) {
																												if (!mNameToTName
																														.equals(mType)) {
																													if (!mNameToTName
																															.equals(tSignature)) {
																														if (!mName
																																.equals(mSignature)) {
																															if (!mName
																																	.equals(mTypeToTType)) {
																																if (!mName
																																		.equals(tAbstractType)) {
																																	if (!mName
																																			.equals(tName)) {
																																		if (!mName
																																				.equals(mNameToTName)) {
																																			if (!mName
																																					.equals(mSignatureToTSignature)) {
																																				if (!mName
																																						.equals(mType)) {
																																					if (!mName
																																							.equals(tSignature)) {
																																						if (!mSignatureToTSignature
																																								.equals(mTypeToTType)) {
																																							if (!mSignatureToTSignature
																																									.equals(tAbstractType)) {
																																								if (!mSignatureToTSignature
																																										.equals(tName)) {
																																									if (!mSignatureToTSignature
																																											.equals(mType)) {
																																										if (!mSignatureToTSignature
																																												.equals(tSignature)) {
																																											if (!mType
																																													.equals(mTypeToTType)) {
																																												if (!mType
																																														.equals(tAbstractType)) {
																																													if (!mType
																																															.equals(tName)) {
																																														if (!mType
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mSignature,
																																																	mTypeToTType,
																																																	tAbstractType,
																																																	tName,
																																																	mFlowElementToTFlowElement,
																																																	mNameToTName,
																																																	mName,
																																																	mSignatureToTSignature,
																																																	mType,
																																																	tSignature };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mSignature, EObject tAbstractType, EObject tName,
			EObject mFlowElementToTFlowElement, EObject mName, EObject mSignatureToTSignature, EObject mType,
			EObject tSignature) {
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignature";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mSignature__mType____returnType_name_prime = "returnType";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
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
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getCreatedEdges().add(mSignature__mType____returnType);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		return new Object[] { ruleresult, mSignature, tAbstractType, tName, mFlowElementToTFlowElement, mName,
				mSignatureToTSignature, mType, tSignature, mFlowElementToTFlowElement__mSignature____source,
				tName__tSignature____signatures, tSignature__tName____method, mName__mSignature____mSignatures,
				tSignature__tAbstractType____returnType, mFlowElementToTFlowElement__tSignature____target,
				mSignatureToTSignature__tSignature____target, mSignature__mType____returnType,
				mSignatureToTSignature__mSignature____source };
	}

	public static final void pattern_MethodSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(MethodSignature _this,
			PerformRuleResult ruleresult, EObject mSignature, EObject mTypeToTType, EObject tAbstractType,
			EObject tName, EObject mFlowElementToTFlowElement, EObject mNameToTName, EObject mName,
			EObject mSignatureToTSignature, EObject mType, EObject tSignature) {
		_this.registerObjects_BWD(ruleresult, mSignature, mTypeToTType, tAbstractType, tName,
				mFlowElementToTFlowElement, mNameToTName, mName, mSignatureToTSignature, mType, tSignature);

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
		EObject _localVariable_0 = match.getObject("tAbstractType");
		EObject _localVariable_1 = match.getObject("tName");
		EObject _localVariable_2 = match.getObject("tSignature");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpTName = _localVariable_1;
		EObject tmpTSignature = _localVariable_2;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpTName instanceof TMethod) {
				TMethod tName = (TMethod) tmpTName;
				if (tmpTSignature instanceof TMethodSignature) {
					TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
					return new Object[] { tAbstractType, tName, tSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_12_2_corematch_blackFBBFFFBB(
			TAbstractType tAbstractType, TMethod tName, TMethodSignature tSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tSignature_lowerBound = tSignature.getLowerBound();
		if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
				Type mType = mTypeToTType.getSource();
				if (mType != null) {
					for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tName, MMethodNameToTMethod.class, "target")) {
						MMethodName mName = mNameToTName.getSource();
						if (mName != null) {
							_result.add(new Object[] { mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType,
									tSignature, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_12_3_findcontext_blackBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TMethod tName,
			MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType, TMethodSignature tSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAbstractType.equals(mTypeToTType.getTarget())) {
			if (tName.getSignatures().contains(tSignature)) {
				if (tName.equals(mNameToTName.getTarget())) {
					if (mName.equals(mNameToTName.getSource())) {
						if (mType.equals(mTypeToTType.getSource())) {
							if (tAbstractType.equals(tSignature.getReturnType())) {
								int tSignature_lowerBound = tSignature.getLowerBound();
								if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
									_result.add(new Object[] { mTypeToTType, tAbstractType, tName, mNameToTName, mName,
											mType, tSignature });
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
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType, TMethod tName,
			MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType, TMethodSignature tSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mNameToTName__tName____target_name_prime = "target";
		String mNameToTName__mName____source_name_prime = "source";
		String mTypeToTType__mType____source_name_prime = "source";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tSignature);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____method);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		tSignature__tAbstractType____returnType.setSrc(tSignature);
		tSignature__tAbstractType____returnType.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tSignature__tAbstractType____returnType);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		return new Object[] { mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, tSignature,
				isApplicableMatch, mTypeToTType__tAbstractType____target, tName__tSignature____signatures,
				tSignature__tName____method, mNameToTName__tName____target, mNameToTName__mName____source,
				mTypeToTType__mType____source, tSignature__tAbstractType____returnType };
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_bindingFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType,
			TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType,
			TMethodSignature tSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mTypeToTType, tAbstractType, tName,
				mNameToTName, mName, mType, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tAbstractType, tName, mNameToTName,
					mName, mType, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType,
			TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType,
			TMethodSignature tSignature) {
		Object[] result_pattern_MethodSignature_12_4_solveCSP_binding = pattern_MethodSignature_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, tSignature);
		if (result_pattern_MethodSignature_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_12_4_solveCSP_black = pattern_MethodSignature_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tAbstractType, tName, mNameToTName,
						mName, mType, tSignature };
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
		TMethod __DEC_tSignature_method_421686 = tSignature.getMethod();
		if (__DEC_tSignature_method_421686 != null) {
			if (!tName.equals(__DEC_tSignature_method_421686)) {
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
								_result.add(new Object[] { tAbstractType, tName, tSignature, _edge_signatures });
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
			MethodSignature _this, Match match, TAbstractType tAbstractType, TMethod tName,
			TMethodSignature tSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAbstractType, tName, tSignature);
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
						_result.add(new Object[] { mSignature, mName, mType, _edge_mSignatures });
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
			MethodSignature _this, Match match, MMethodSignature mSignature, MMethodName mName, Type mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSignature, mName, mType);
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

	public static final Object[] pattern_MethodSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mSignature");
		EObject _localVariable_1 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_2 = targetMatch.getObject("tName");
		EObject _localVariable_3 = sourceMatch.getObject("mName");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject _localVariable_5 = targetMatch.getObject("tSignature");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpMName = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpTSignature = _localVariable_5;
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpTName instanceof TMethod) {
					TMethod tName = (TMethod) tmpTName;
					if (tmpMName instanceof MMethodName) {
						MMethodName mName = (MMethodName) tmpMName;
						if (tmpMType instanceof Type) {
							Type mType = (Type) tmpMType;
							if (tmpTSignature instanceof TMethodSignature) {
								TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
								return new Object[] { mSignature, tAbstractType, tName, mName, mType, tSignature,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(
			MMethodSignature mSignature, TAbstractType tAbstractType, TMethod tName, MMethodName mName, Type mType,
			TMethodSignature tSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				return new Object[] { mSignature, tAbstractType, tName, mName, mType, tSignature, sourceMatch,
						targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding = pattern_MethodSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding != null) {
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[0];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[1];
			TMethod tName = (TMethod) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[2];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[3];
			Type mType = (Type) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[4];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MethodSignature_24_2_matchsrctrgcontext_black = pattern_MethodSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mSignature, tAbstractType, tName, mName, mType, tSignature, sourceMatch, targetMatch);
			if (result_pattern_MethodSignature_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mSignature, tAbstractType, tName, mName, mType, tSignature, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_3_solvecsp_bindingFBBBBBBBBB(MethodSignature _this,
			MMethodSignature mSignature, TAbstractType tAbstractType, TMethod tName, MMethodName mName, Type mType,
			TMethodSignature tSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mSignature, tAbstractType, tName, mName, mType,
				tSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mSignature, tAbstractType, tName, mName, mType, tSignature, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			MMethodSignature mSignature, TAbstractType tAbstractType, TMethod tName, MMethodName mName, Type mType,
			TMethodSignature tSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignature_24_3_solvecsp_binding = pattern_MethodSignature_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mSignature, tAbstractType, tName, mName, mType, tSignature, sourceMatch, targetMatch);
		if (result_pattern_MethodSignature_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodSignature_24_3_solvecsp_black = pattern_MethodSignature_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodSignature_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mSignature, tAbstractType, tName, mName, mType, tSignature,
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

	public static final Iterable<Object[]> pattern_MethodSignature_24_5_matchcorrcontext_blackFBBFBBBB(
			TAbstractType tAbstractType, TMethod tName, MMethodName mName, Type mType, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
				if (mType.equals(mTypeToTType.getSource())) {
					for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tName, MMethodNameToTMethod.class, "target")) {
						if (mName.equals(mNameToTName.getSource())) {
							_result.add(new Object[] { mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MMethodNameToTMethod mNameToTName, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodSignature";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mNameToTName);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mNameToTName, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_6_createcorrespondence_blackBBBBBBB(
			MMethodSignature mSignature, TAbstractType tAbstractType, TMethod tName, MMethodName mName, Type mType,
			TMethodSignature tSignature, CCMatch ccMatch) {
		return new Object[] { mSignature, tAbstractType, tName, mName, mType, tSignature, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_6_createcorrespondence_greenBFFBB(
			MMethodSignature mSignature, TMethodSignature tSignature, CCMatch ccMatch) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		ccMatch.getCreateCorr().add(mSignatureToTSignature);
		return new Object[] { mSignature, mFlowElementToTFlowElement, mSignatureToTSignature, tSignature, ccMatch };
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

	public static final Object[] pattern_MethodSignature_27_1_matchtggpattern_blackBBB(MMethodSignature mSignature,
			MMethodName mName, Type mType) {
		if (mName.getMSignatures().contains(mSignature)) {
			if (mType.equals(mSignature.getReturnType())) {
				return new Object[] { mSignature, mName, mType };
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
		TMethod __DEC_tSignature_method_60931 = tSignature.getMethod();
		if (__DEC_tSignature_method_60931 != null) {
			if (!tName.equals(__DEC_tSignature_method_60931)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodSignature_28_1_matchtggpattern_blackBBB(TAbstractType tAbstractType,
			TMethod tName, TMethodSignature tSignature) {
		if (tName.getSignatures().contains(tSignature)) {
			if (tAbstractType.equals(tSignature.getReturnType())) {
				if (pattern_MethodSignature_28_1_matchtggpattern_black_nac_0BB(tSignature, tName) == null) {
					return new Object[] { tAbstractType, tName, tSignature };
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
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TMethod tName) {
		if (ruleResult.getTargetObjects().contains(tName)) {
			return new Object[] { ruleResult, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MMethodNameToTMethod mNameToTName) {
		if (ruleResult.getCorrObjects().contains(mNameToTName)) {
			return new Object[] { ruleResult, mNameToTName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MMethodName mName) {
		if (ruleResult.getSourceObjects().contains(mName)) {
			return new Object[] { ruleResult, mName };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mNameToTNameList : ruleEntryContainer.getRuleEntryList()) {
				if (!mNameToTNameList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							TAbstractType tAbstractType = mTypeToTType.getTarget();
							if (tAbstractType != null) {
								Type mType = mTypeToTType.getSource();
								if (mType != null) {
									if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mTypeToTType) == null) {
										if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												tAbstractType) == null) {
											if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													mType) == null) {
												for (EObject tmpMNameToTName : mNameToTNameList.getEntryObjects()) {
													if (tmpMNameToTName instanceof MMethodNameToTMethod) {
														MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
														TMethod tName = mNameToTName.getTarget();
														if (tName != null) {
															MMethodName mName = mNameToTName.getSource();
															if (mName != null) {
																if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, mNameToTName) == null) {
																	if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tName) == null) {
																		if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mName) == null) {
																			_result.add(new Object[] { mTypeToTTypeList,
																					mTypeToTType, tAbstractType, mType,
																					mNameToTNameList, tName,
																					mNameToTName, mName,
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
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType,
			TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, tAbstractType, tName,
				mNameToTName, mName, mType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tAbstractType, tName, mNameToTName,
					mName, mType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType,
			TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName, Type mType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodSignature_29_3_solveCSP_binding = pattern_MethodSignature_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, ruleResult);
		if (result_pattern_MethodSignature_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_29_3_solveCSP_black = pattern_MethodSignature_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tAbstractType, tName, mNameToTName,
						mName, mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_29_4_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_29_5_checknacs_blackBBBBBB(TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName,
			Type mType) {
		return new Object[] { mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType };
	}

	public static final Object[] pattern_MethodSignature_29_6_perform_blackBBBBBBB(TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, TMethod tName, MMethodNameToTMethod mNameToTName, MMethodName mName,
			Type mType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mTypeToTType, tAbstractType, tName, mNameToTName, mName, mType, ruleResult };
	}

	public static final Object[] pattern_MethodSignature_29_6_perform_greenFBBFBFBFBB(TAbstractType tAbstractType,
			TMethod tName, MMethodName mName, Type mType, ModelgeneratorRuleResult ruleResult, CSP csp) {
		MMethodSignature mSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		mName.getMSignatures().add(mSignature);
		mSignature.setReturnType(mType);
		ruleResult.getSourceObjects().add(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		mSignatureToTSignature.setSource(mSignature);
		ruleResult.getCorrObjects().add(mSignatureToTSignature);
		tName.getSignatures().add(tSignature);
		tSignature.setReturnType(tAbstractType);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mSignature, tAbstractType, tName, mFlowElementToTFlowElement, mName,
				mSignatureToTSignature, mType, tSignature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodSignature_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodSignatureImpl
