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

import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MFieldNameToTField;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.FieldSignatureArrayType;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldSignature;

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
 * An implementation of the model object '<em><b>Field Signature Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldSignatureArrayTypeImpl extends AbstractRuleImpl implements FieldSignatureArrayType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldSignatureArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldSignatureArrayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {

		Object[] result1_black = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_0_1_initialbindings_blackBBBBBBB(this, match, mFieldName, mTypeAccess,
						mArrayType, mType, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mArrayType] = " + mArrayType + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, mFieldName,
						mTypeAccess, mArrayType, mType, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mArrayType] = " + mArrayType + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_0_4_collectelementstobetranslated_blackBBBBBB(match, mFieldName,
							mTypeAccess, mArrayType, mType, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mFieldName] = " + mFieldName + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
						+ "[mArrayType] = " + mArrayType + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
						+ mSignature + ".");
			}
			FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_0_4_collectelementstobetranslated_greenBBBBFF(
					match, mFieldName, mType, mSignature);
			//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_0_5_collectcontextelements_blackBBBBBB(match, mFieldName,
							mTypeAccess, mArrayType, mType, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mFieldName] = " + mFieldName + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
						+ "[mArrayType] = " + mArrayType + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
						+ mSignature + ".");
			}
			FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_0_5_collectcontextelements_greenBBBBBFFF(match,
					mFieldName, mTypeAccess, mArrayType, mType);
			//nothing EMoflonEdge mTypeAccess__mArrayType____type = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mArrayType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge mType__mTypeAccess____elementType = (EMoflonEdge) result5_green[7];

			// 
			FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_0_6_registerobjectstomatch_expressionBBBBBBB(
					this, match, mFieldName, mTypeAccess, mArrayType, mType, mSignature);
			return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_0_7_expressionF();
		} else {
			return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[1];
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[2];
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_bindingAndBlack[3];
		TField tField = (TField) result1_bindingAndBlack[4];
		TypeAccess mTypeAccess = (TypeAccess) result1_bindingAndBlack[5];
		Type mArrayType = (Type) result1_bindingAndBlack[6];
		ArrayType mType = (ArrayType) result1_bindingAndBlack[7];
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_1_1_performtransformation_greenFBBFFB(tType, tField, mSignature);
		TFieldSignature tSignature = (TFieldSignature) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[4];

		Object[] result2_black = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_1_2_collecttranslatedelements_blackBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		Object[] result2_green = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_1_2_collecttranslatedelements_greenFBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, tSignature,
						mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mFlowElementToTFlowElement,
						mTypeAccess, mArrayType, mSignatureToTSignature, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSignature] = " + tSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ", " + "[mFieldName] = " + mFieldName + ", "
					+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[tField] = " + tField
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mArrayType] = " + mArrayType + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
				ruleresult, tSignature, tType, mFieldName, tField, mFlowElementToTFlowElement, mSignatureToTSignature,
				mType, mSignature);
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[17];

		// 
		// 
		FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, tSignature, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField,
				mFlowElementToTFlowElement, mTypeAccess, mArrayType, mSignatureToTSignature, mType, mSignature);
		return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFieldName mFieldName = (MFieldName) result2_binding[0];
		TypeAccess mTypeAccess = (TypeAccess) result2_binding[1];
		Type mArrayType = (Type) result2_binding[2];
		ArrayType mType = (ArrayType) result2_binding[3];
		MFieldSignature mSignature = (MFieldSignature) result2_binding[4];
		for (Object[] result2_black : FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_2_2_corematch_blackFFBFFBBBBB(mFieldName, mTypeAccess, mArrayType,
						mType, mSignature, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[3];
			TField tField = (TField) result2_black[4];
			// ForEach 
			for (Object[] result3_black : FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_2_3_findcontext_blackBBBBBBBBB(mTypeToTType, tType, mFieldName,
							eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType, mSignature)) {
				Object[] result3_green = FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFF(mTypeToTType, tType,
								mFieldName, eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType,
								mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeAccess__mArrayType____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mArrayType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mType__mTypeAccess____elementType = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mTypeToTType__mArrayType____source = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField,
								mTypeAccess, mArrayType, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tType] = " + tType + ", " + "[mFieldName] = " + mFieldName + ", "
							+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[tField] = "
							+ tField + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mArrayType] = " + mArrayType
							+ ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldSignatureArrayTypeImpl
							.pattern_FieldSignatureArrayType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {
		match.registerObject("mFieldName", mFieldName);
		match.registerObject("mTypeAccess", mTypeAccess);
		match.registerObject("mArrayType", mArrayType);
		match.registerObject("mType", mType);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {// Create CSP
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
			TAbstractType tType, MFieldName mFieldName, MFieldNameToTField eFieldDeclarationToTField, TField tField,
			TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature) {// Create CSP
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
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mTypeAccess", mTypeAccess);
		isApplicableMatch.registerObject("mArrayType", mArrayType);
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
			EObject tType, EObject mFieldName, EObject eFieldDeclarationToTField, EObject tField,
			EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mArrayType, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeAccess", mTypeAccess);
		ruleresult.registerObject("mArrayType", mArrayType);
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
				.equals("modisco.MFieldSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TFieldSignature tSignature, TAbstractType tType, TField tField) {

		Object[] result1_black = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_10_1_initialbindings_blackBBBBB(this, match, tSignature, tType,
						tField);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
					+ "[tField] = " + tField + ".");
		}

		Object[] result2_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSignature, tType,
						tField);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
					+ "[tField] = " + tField + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_10_4_collectelementstobetranslated_blackBBBB(match, tSignature,
							tType, tField);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tSignature] = "
								+ tSignature + ", " + "[tType] = " + tType + ", " + "[tField] = " + tField + ".");
			}
			FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_10_4_collectelementstobetranslated_greenBBBBFFF(
					match, tSignature, tType, tField);
			//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result4_green[6];

			Object[] result5_black = FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_10_5_collectcontextelements_blackBBBB(match, tSignature, tType,
							tField);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tSignature] = "
								+ tSignature + ", " + "[tType] = " + tType + ", " + "[tField] = " + tField + ".");
			}
			FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_10_5_collectcontextelements_greenBBB(match,
					tType, tField);

			// 
			FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, tSignature, tType, tField);
			return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_10_7_expressionF();
		} else {
			return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[3];
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_bindingAndBlack[4];
		TField tField = (TField) result1_bindingAndBlack[5];
		TypeAccess mTypeAccess = (TypeAccess) result1_bindingAndBlack[6];
		Type mArrayType = (Type) result1_bindingAndBlack[7];
		ArrayType mType = (ArrayType) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_11_1_performtransformation_greenBBFFBF(tSignature, mFieldName, mType);
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[2];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[3];
		MFieldSignature mSignature = (MFieldSignature) result1_green[5];

		Object[] result2_black = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_11_2_collecttranslatedelements_blackBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		Object[] result2_green = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_11_2_collecttranslatedelements_greenFBBBB(tSignature,
						mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, tSignature,
						mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mFlowElementToTFlowElement,
						mTypeAccess, mArrayType, mSignatureToTSignature, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSignature] = " + tSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ", " + "[mFieldName] = " + mFieldName + ", "
					+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[tField] = " + tField
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mArrayType] = " + mArrayType + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
				ruleresult, tSignature, tType, mFieldName, tField, mFlowElementToTFlowElement, mSignatureToTSignature,
				mType, mSignature);
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[17];

		// 
		// 
		FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, tSignature, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField,
				mFlowElementToTFlowElement, mTypeAccess, mArrayType, mSignatureToTSignature, mType, mSignature);
		return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TFieldSignature tSignature = (TFieldSignature) result2_binding[0];
		TAbstractType tType = (TAbstractType) result2_binding[1];
		TField tField = (TField) result2_binding[2];
		for (Object[] result2_black : FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_12_2_corematch_blackBFBFFBFB(tSignature, tType, tField, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			MFieldName mFieldName = (MFieldName) result2_black[3];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[4];
			Type mArrayType = (Type) result2_black[6];
			// ForEach 
			for (Object[] result3_black : FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_12_3_findcontext_blackBBBBBBFBF(tSignature, mTypeToTType, tType,
							mFieldName, eFieldDeclarationToTField, tField, mArrayType)) {
				TypeAccess mTypeAccess = (TypeAccess) result3_black[6];
				ArrayType mType = (ArrayType) result3_black[8];
				Object[] result3_green = FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(tSignature,
								mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mTypeAccess,
								mArrayType, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeAccess__mArrayType____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mArrayType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mType__mTypeAccess____elementType = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mTypeToTType__mArrayType____source = (EMoflonEdge) result3_green[19];

				Object[] result4_bindingAndBlack = FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tSignature, mTypeToTType, tType, mFieldName,
								eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSignature] = " + tSignature
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType + ", "
							+ "[mFieldName] = " + mFieldName + ", " + "[eFieldDeclarationToTField] = "
							+ eFieldDeclarationToTField + ", " + "[tField] = " + tField + ", " + "[mTypeAccess] = "
							+ mTypeAccess + ", " + "[mArrayType] = " + mArrayType + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = FieldSignatureArrayTypeImpl
							.pattern_FieldSignatureArrayType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TFieldSignature tSignature, TAbstractType tType,
			TField tField) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("tType", tType);
		match.registerObject("tField", tField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TFieldSignature tSignature, TAbstractType tType, TField tField) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TFieldSignature tSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType) {// Create CSP
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
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mTypeAccess", mTypeAccess);
		isApplicableMatch.registerObject("mArrayType", mArrayType);
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
			EObject tType, EObject mFieldName, EObject eFieldDeclarationToTField, EObject tField,
			EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mArrayType, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeAccess", mTypeAccess);
		ruleresult.registerObject("mArrayType", mArrayType);
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
				.equals("basic.TFieldSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_47(EMoflonEdge _edge_signatures) {

		Object[] result1_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_20_2_testcorematchandDECs_blackFFFB(_edge_signatures)) {
			TFieldSignature tSignature = (TFieldSignature) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			TField tField = (TField) result2_black[2];
			Object[] result2_green = FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tSignature, tType, tField)) {
				// 
				if (FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldSignatureArrayTypeImpl
							.pattern_FieldSignatureArrayType_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_48(EMoflonEdge _edge_mSignatures) {

		Object[] result1_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_21_2_testcorematchandDECs_blackFFFFFB(_edge_mSignatures)) {
			MFieldName mFieldName = (MFieldName) result2_black[0];
			TypeAccess mTypeAccess = (TypeAccess) result2_black[1];
			Type mArrayType = (Type) result2_black[2];
			ArrayType mType = (ArrayType) result2_black[3];
			MFieldSignature mSignature = (MFieldSignature) result2_black[4];
			Object[] result2_green = FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, mFieldName, mTypeAccess, mArrayType, mType, mSignature)) {
				// 
				if (FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldSignatureArrayTypeImpl
							.pattern_FieldSignatureArrayType_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldSignatureArrayType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "upperBound", -1, ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("FieldSignatureArrayType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "upperBound", -1, ComparingOperator.EQUAL)) {
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

		Object[] result1_black = FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[1];
		MFieldName mFieldName = (MFieldName) result2_bindingAndBlack[2];
		TField tField = (TField) result2_bindingAndBlack[3];
		TypeAccess mTypeAccess = (TypeAccess) result2_bindingAndBlack[4];
		Type mArrayType = (Type) result2_bindingAndBlack[5];
		ArrayType mType = (ArrayType) result2_bindingAndBlack[6];
		MFieldSignature mSignature = (MFieldSignature) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, tSignature, tType,
						mFieldName, tField, mTypeAccess, mArrayType, mType, mSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[mFieldName] = "
					+ mFieldName + ", " + "[tField] = " + tField + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
					+ "[mArrayType] = " + mArrayType + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
					+ mSignature + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_24_5_matchcorrcontext_blackFBBFBBBB(tType, mFieldName, tField,
							mArrayType, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result5_black[3];
				Object[] result5_green = FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_24_5_matchcorrcontext_greenBBBBF(mTypeToTType,
								eFieldDeclarationToTField, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_24_6_createcorrespondence_blackBBBBBBBBB(tSignature, tType,
								mFieldName, tField, mTypeAccess, mArrayType, mType, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = "
							+ tSignature + ", " + "[tType] = " + tType + ", " + "[mFieldName] = " + mFieldName + ", "
							+ "[tField] = " + tField + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
							+ "[mArrayType] = " + mArrayType + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
							+ mSignature + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_24_6_createcorrespondence_greenBFFBB(
						tSignature, mSignature, ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
				//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[2];

				Object[] result7_black = FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TFieldSignature tSignature, TAbstractType tType, MFieldName mFieldName,
			TField tField, TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature,
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
	public boolean checkDEC_FWD(MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType, ArrayType mType,
			MFieldSignature mSignature) {// 
		Object[] result1_black = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_27_1_matchtggpattern_blackBBBBB(mFieldName, mTypeAccess, mArrayType,
						mType, mSignature);
		if (result1_black != null) {
			return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_27_2_expressionF();
		} else {
			return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TFieldSignature tSignature, TAbstractType tType, TField tField) {// 
		Object[] result1_black = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_28_1_matchtggpattern_blackBBB(tSignature, tType, tField);
		if (result1_black != null) {
			FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_28_1_matchtggpattern_greenB(tSignature);

			return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_28_2_expressionF();
		} else {
			return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MFieldNameToTField eFieldDeclarationToTFieldParameter) {

		Object[] result1_black = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : FieldSignatureArrayTypeImpl
				.pattern_FieldSignatureArrayType_29_2_isapplicablecore_blackFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			Type mArrayType = (Type) result2_black[2];
			TypeAccess mTypeAccess = (TypeAccess) result2_black[3];
			ArrayType mType = (ArrayType) result2_black[4];
			TAbstractType tType = (TAbstractType) result2_black[5];
			//nothing RuleEntryList eFieldDeclarationToTFieldList = (RuleEntryList) result2_black[6];
			MFieldName mFieldName = (MFieldName) result2_black[7];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[8];
			TField tField = (TField) result2_black[9];

			Object[] result3_bindingAndBlack = FieldSignatureArrayTypeImpl
					.pattern_FieldSignatureArrayType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
							mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mTypeAccess, mArrayType,
							mType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[tType] = " + tType + ", " + "[mFieldName] = " + mFieldName + ", "
						+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[tField] = " + tField
						+ ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mArrayType] = " + mArrayType + ", "
						+ "[mType] = " + mType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = FieldSignatureArrayTypeImpl
						.pattern_FieldSignatureArrayType_29_5_checknacs_blackBBBBBBBB(mTypeToTType, tType, mFieldName,
								eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType);
				if (result5_black != null) {

					Object[] result6_black = FieldSignatureArrayTypeImpl
							.pattern_FieldSignatureArrayType_29_6_perform_blackBBBBBBBBB(mTypeToTType, tType,
									mFieldName, eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tType] = " + tType + ", " + "[mFieldName] = " + mFieldName
								+ ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", "
								+ "[tField] = " + tField + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
								+ "[mArrayType] = " + mArrayType + ", " + "[mType] = " + mType + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_29_6_perform_greenFBBBFFBFB(tType,
							mFieldName, tField, mType, ruleResult);
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[0];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[4];
					//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[5];
					//nothing MFieldSignature mSignature = (MFieldSignature) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return FieldSignatureArrayTypeImpl.pattern_FieldSignatureArrayType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MFieldName mFieldName, MFieldNameToTField eFieldDeclarationToTField, TField tField,
			TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mTypeAccess", mTypeAccess);
		isApplicableMatch.registerObject("mArrayType", mArrayType);
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
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPROPRIATE_FWD__MATCH_MFIELDNAME_TYPEACCESS_TYPE_ARRAYTYPE_MFIELDSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (ArrayType) arguments.get(4),
					(MFieldSignature) arguments.get(5));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFIELDNAME_TYPEACCESS_TYPE_ARRAYTYPE_MFIELDSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (ArrayType) arguments.get(4),
					(MFieldSignature) arguments.get(5));
			return null;
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFIELDNAME_TYPEACCESS_TYPE_ARRAYTYPE_MFIELDSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (ArrayType) arguments.get(4),
					(MFieldSignature) arguments.get(5));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MFIELDNAME_MFIELDNAMETOTFIELD_TFIELD_TYPEACCESS_TYPE_ARRAYTYPE_MFIELDSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(MFieldName) arguments.get(3), (MFieldNameToTField) arguments.get(4), (TField) arguments.get(5),
					(TypeAccess) arguments.get(6), (Type) arguments.get(7), (ArrayType) arguments.get(8),
					(MFieldSignature) arguments.get(9));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPROPRIATE_BWD__MATCH_TFIELDSIGNATURE_TABSTRACTTYPE_TFIELD:
			return isAppropriate_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TField) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELDSIGNATURE_TABSTRACTTYPE_TFIELD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TField) arguments.get(3));
			return null;
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELDSIGNATURE_TABSTRACTTYPE_TFIELD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TField) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TFIELDSIGNATURE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MFIELDNAME_MFIELDNAMETOTFIELD_TFIELD_TYPEACCESS_TYPE_ARRAYTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TAbstractType) arguments.get(3),
					(MFieldName) arguments.get(4), (MFieldNameToTField) arguments.get(5), (TField) arguments.get(6),
					(TypeAccess) arguments.get(7), (Type) arguments.get(8), (ArrayType) arguments.get(9));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_47__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_47((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_48__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_48((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__TFIELDSIGNATURE_TABSTRACTTYPE_MFIELDNAME_TFIELD_TYPEACCESS_TYPE_ARRAYTYPE_MFIELDSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TFieldSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(MFieldName) arguments.get(2), (TField) arguments.get(3), (TypeAccess) arguments.get(4),
					(Type) arguments.get(5), (ArrayType) arguments.get(6), (MFieldSignature) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___CHECK_DEC_FWD__MFIELDNAME_TYPEACCESS_TYPE_ARRAYTYPE_MFIELDSIGNATURE:
			return checkDEC_FWD((MFieldName) arguments.get(0), (TypeAccess) arguments.get(1), (Type) arguments.get(2),
					(ArrayType) arguments.get(3), (MFieldSignature) arguments.get(4));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___CHECK_DEC_BWD__TFIELDSIGNATURE_TABSTRACTTYPE_TFIELD:
			return checkDEC_BWD((TFieldSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TField) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MFIELDNAMETOTFIELD:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MFieldNameToTField) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MFIELDNAME_MFIELDNAMETOTFIELD_TFIELD_TYPEACCESS_TYPE_ARRAYTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(MFieldName) arguments.get(3), (MFieldNameToTField) arguments.get(4), (TField) arguments.get(5),
					(TypeAccess) arguments.get(6), (Type) arguments.get(7), (ArrayType) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldSignatureArrayType_0_1_initialbindings_blackBBBBBBB(
			FieldSignatureArrayType _this, Match match, MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { _this, match, mFieldName, mTypeAccess, mArrayType, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_0_2_SolveCSP_bindingFBBBBBBB(
			FieldSignatureArrayType _this, Match match, MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mFieldName, mTypeAccess, mArrayType, mType,
				mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mFieldName, mTypeAccess, mArrayType, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignatureArrayType_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			FieldSignatureArrayType _this, Match match, MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {
		Object[] result_pattern_FieldSignatureArrayType_0_2_SolveCSP_binding = pattern_FieldSignatureArrayType_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, mFieldName, mTypeAccess, mArrayType, mType, mSignature);
		if (result_pattern_FieldSignatureArrayType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignatureArrayType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_0_2_SolveCSP_black = pattern_FieldSignatureArrayType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldSignatureArrayType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mFieldName, mTypeAccess, mArrayType, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignatureArrayType_0_3_CheckCSP_expressionFBB(
			FieldSignatureArrayType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_0_4_collectelementstobetranslated_blackBBBBBB(
			Match match, MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType, ArrayType mType,
			MFieldSignature mSignature) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { match, mFieldName, mTypeAccess, mArrayType, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, MFieldName mFieldName, ArrayType mType, MFieldSignature mSignature) {
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mSignature);
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mType____type_name_prime = "type";
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(mFieldName__mSignature____mSignatures);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(mSignature__mType____type);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		return new Object[] { match, mFieldName, mType, mSignature, mFieldName__mSignature____mSignatures,
				mSignature__mType____type };
	}

	public static final Object[] pattern_FieldSignatureArrayType_0_5_collectcontextelements_blackBBBBBB(Match match,
			MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType, ArrayType mType,
			MFieldSignature mSignature) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { match, mFieldName, mTypeAccess, mArrayType, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_0_5_collectcontextelements_greenBBBBBFFF(Match match,
			MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType, ArrayType mType) {
		EMoflonEdge mTypeAccess__mArrayType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mArrayType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mFieldName);
		match.getContextNodes().add(mTypeAccess);
		match.getContextNodes().add(mArrayType);
		match.getContextNodes().add(mType);
		String mTypeAccess__mArrayType____type_name_prime = "type";
		String mArrayType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mType__mTypeAccess____elementType_name_prime = "elementType";
		mTypeAccess__mArrayType____type.setSrc(mTypeAccess);
		mTypeAccess__mArrayType____type.setTrg(mArrayType);
		match.getContextEdges().add(mTypeAccess__mArrayType____type);
		mArrayType__mTypeAccess____usagesInTypeAccess.setSrc(mArrayType);
		mArrayType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		match.getContextEdges().add(mArrayType__mTypeAccess____usagesInTypeAccess);
		mType__mTypeAccess____elementType.setSrc(mType);
		mType__mTypeAccess____elementType.setTrg(mTypeAccess);
		match.getContextEdges().add(mType__mTypeAccess____elementType);
		mTypeAccess__mArrayType____type.setName(mTypeAccess__mArrayType____type_name_prime);
		mArrayType__mTypeAccess____usagesInTypeAccess.setName(mArrayType__mTypeAccess____usagesInTypeAccess_name_prime);
		mType__mTypeAccess____elementType.setName(mType__mTypeAccess____elementType_name_prime);
		return new Object[] { match, mFieldName, mTypeAccess, mArrayType, mType, mTypeAccess__mArrayType____type,
				mArrayType__mTypeAccess____usagesInTypeAccess, mType__mTypeAccess____elementType };
	}

	public static final void pattern_FieldSignatureArrayType_0_6_registerobjectstomatch_expressionBBBBBBB(
			FieldSignatureArrayType _this, Match match, MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mFieldName, mTypeAccess, mArrayType, mType, mSignature);

	}

	public static final boolean pattern_FieldSignatureArrayType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignatureArrayType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mFieldName");
		EObject _localVariable_3 = isApplicableMatch.getObject("eFieldDeclarationToTField");
		EObject _localVariable_4 = isApplicableMatch.getObject("tField");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("mArrayType");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject _localVariable_8 = isApplicableMatch.getObject("mSignature");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMFieldName = _localVariable_2;
		EObject tmpEFieldDeclarationToTField = _localVariable_3;
		EObject tmpTField = _localVariable_4;
		EObject tmpMTypeAccess = _localVariable_5;
		EObject tmpMArrayType = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		EObject tmpMSignature = _localVariable_8;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMFieldName instanceof MFieldName) {
					MFieldName mFieldName = (MFieldName) tmpMFieldName;
					if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
						MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
						if (tmpTField instanceof TField) {
							TField tField = (TField) tmpTField;
							if (tmpMTypeAccess instanceof TypeAccess) {
								TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
								if (tmpMArrayType instanceof Type) {
									Type mArrayType = (Type) tmpMArrayType;
									if (tmpMType instanceof ArrayType) {
										ArrayType mType = (ArrayType) tmpMType;
										if (tmpMSignature instanceof MFieldSignature) {
											MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
											return new Object[] { mTypeToTType, tType, mFieldName,
													eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType,
													mSignature, isApplicableMatch };
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

	public static final Object[] pattern_FieldSignatureArrayType_1_1_performtransformation_blackBBBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature, FieldSignatureArrayType _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mArrayType.equals(mType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField,
							mTypeAccess, mArrayType, mType, mSignature, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			FieldSignatureArrayType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding = pattern_FieldSignatureArrayType_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding[1];
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding[2];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding[3];
			TField tField = (TField) result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding[4];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding[5];
			Type mArrayType = (Type) result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding[6];
			ArrayType mType = (ArrayType) result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding[7];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldSignatureArrayType_1_1_performtransformation_binding[8];

			Object[] result_pattern_FieldSignatureArrayType_1_1_performtransformation_black = pattern_FieldSignatureArrayType_1_1_performtransformation_blackBBBBBBBBBFBB(
					mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType,
					mSignature, _this, isApplicableMatch);
			if (result_pattern_FieldSignatureArrayType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldSignatureArrayType_1_1_performtransformation_black[9];

				return new Object[] { mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mTypeAccess,
						mArrayType, mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_1_1_performtransformation_greenFBBFFB(
			TAbstractType tType, TField tField, MFieldSignature mSignature) {
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		int tSignature_upperBound_prime = Integer.valueOf(-1);
		tField.getSignatures().add(tSignature);
		tSignature.setType(tType);
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		return new Object[] { tSignature, tType, tField, mFlowElementToTFlowElement, mSignatureToTSignature,
				mSignature };
	}

	public static final Object[] pattern_FieldSignatureArrayType_1_2_collecttranslatedelements_blackBBBB(
			TFieldSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature) {
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_FieldSignatureArrayType_1_2_collecttranslatedelements_greenFBBBB(
			TFieldSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getTranslatedElements().add(mSignature);
		return new Object[] { ruleresult, tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_FieldSignatureArrayType_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType, EObject tType, EObject mFieldName,
			EObject eFieldDeclarationToTField, EObject tField, EObject mFlowElementToTFlowElement, EObject mTypeAccess,
			EObject mArrayType, EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		if (!tSignature.equals(tType)) {
			if (!mTypeToTType.equals(tSignature)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mTypeToTType.equals(tField)) {
						if (!mFieldName.equals(tSignature)) {
							if (!mFieldName.equals(mTypeToTType)) {
								if (!mFieldName.equals(tType)) {
									if (!mFieldName.equals(tField)) {
										if (!mFieldName.equals(mFlowElementToTFlowElement)) {
											if (!mFieldName.equals(mTypeAccess)) {
												if (!mFieldName.equals(mSignatureToTSignature)) {
													if (!mFieldName.equals(mType)) {
														if (!mFieldName.equals(mSignature)) {
															if (!eFieldDeclarationToTField.equals(tSignature)) {
																if (!eFieldDeclarationToTField.equals(mTypeToTType)) {
																	if (!eFieldDeclarationToTField.equals(tType)) {
																		if (!eFieldDeclarationToTField
																				.equals(mFieldName)) {
																			if (!eFieldDeclarationToTField
																					.equals(tField)) {
																				if (!eFieldDeclarationToTField.equals(
																						mFlowElementToTFlowElement)) {
																					if (!eFieldDeclarationToTField
																							.equals(mTypeAccess)) {
																						if (!eFieldDeclarationToTField
																								.equals(mArrayType)) {
																							if (!eFieldDeclarationToTField
																									.equals(mSignatureToTSignature)) {
																								if (!eFieldDeclarationToTField
																										.equals(mType)) {
																									if (!eFieldDeclarationToTField
																											.equals(mSignature)) {
																										if (!tField
																												.equals(tSignature)) {
																											if (!tField
																													.equals(tType)) {
																												if (!mFlowElementToTFlowElement
																														.equals(tSignature)) {
																													if (!mFlowElementToTFlowElement
																															.equals(mTypeToTType)) {
																														if (!mFlowElementToTFlowElement
																																.equals(tType)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(tField)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(mTypeAccess)) {
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
																																									.equals(tField)) {
																																								if (!mArrayType
																																										.equals(tSignature)) {
																																									if (!mArrayType
																																											.equals(mTypeToTType)) {
																																										if (!mArrayType
																																												.equals(tType)) {
																																											if (!mArrayType
																																													.equals(mFieldName)) {
																																												if (!mArrayType
																																														.equals(tField)) {
																																													if (!mArrayType
																																															.equals(mFlowElementToTFlowElement)) {
																																														if (!mArrayType
																																																.equals(mTypeAccess)) {
																																															if (!mArrayType
																																																	.equals(mSignatureToTSignature)) {
																																																if (!mArrayType
																																																		.equals(mType)) {
																																																	if (!mArrayType
																																																			.equals(mSignature)) {
																																																		if (!mSignatureToTSignature
																																																				.equals(tSignature)) {
																																																			if (!mSignatureToTSignature
																																																					.equals(mTypeToTType)) {
																																																				if (!mSignatureToTSignature
																																																						.equals(tType)) {
																																																					if (!mSignatureToTSignature
																																																							.equals(tField)) {
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
																																																													.equals(tField)) {
																																																												if (!mType
																																																														.equals(mTypeAccess)) {
																																																													if (!mSignature
																																																															.equals(tSignature)) {
																																																														if (!mSignature
																																																																.equals(mTypeToTType)) {
																																																															if (!mSignature
																																																																	.equals(tType)) {
																																																																if (!mSignature
																																																																		.equals(tField)) {
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
																																																																						mFieldName,
																																																																						eFieldDeclarationToTField,
																																																																						tField,
																																																																						mFlowElementToTFlowElement,
																																																																						mTypeAccess,
																																																																						mArrayType,
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

	public static final Object[] pattern_FieldSignatureArrayType_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mFieldName, EObject tField,
			EObject mFlowElementToTFlowElement, EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldSignatureArrayType";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String tSignature__tType____type_name_prime = "type";
		String mSignature__mType____type_name_prime = "type";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		ruleresult.getCreatedEdges().add(tSignature__tField____field);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mFieldName__mSignature____mSignatures);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		ruleresult.getCreatedEdges().add(tSignature__tType____type);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mSignature__mType____type);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		return new Object[] { ruleresult, tSignature, tType, mFieldName, tField, mFlowElementToTFlowElement,
				mSignatureToTSignature, mType, mSignature, mSignatureToTSignature__mSignature____source,
				tField__tSignature____signatures, tSignature__tField____field, mFieldName__mSignature____mSignatures,
				mSignatureToTSignature__tSignature____target, mFlowElementToTFlowElement__mSignature____source,
				tSignature__tType____type, mSignature__mType____type,
				mFlowElementToTFlowElement__tSignature____target };
	}

	public static final void pattern_FieldSignatureArrayType_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			FieldSignatureArrayType _this, PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType,
			EObject tType, EObject mFieldName, EObject eFieldDeclarationToTField, EObject tField,
			EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mArrayType, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, tSignature, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField,
				tField, mFlowElementToTFlowElement, mTypeAccess, mArrayType, mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_FieldSignatureArrayType_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_1_preparereturnvalue_bindingFB(
			FieldSignatureArrayType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldSignatureArrayType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldSignatureArrayType _this) {
		Object[] result_pattern_FieldSignatureArrayType_2_1_preparereturnvalue_binding = pattern_FieldSignatureArrayType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignatureArrayType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldSignatureArrayType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_2_1_preparereturnvalue_black = pattern_FieldSignatureArrayType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldSignatureArrayType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldSignatureArrayType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldSignatureArrayType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mFieldName");
		EObject _localVariable_1 = match.getObject("mTypeAccess");
		EObject _localVariable_2 = match.getObject("mArrayType");
		EObject _localVariable_3 = match.getObject("mType");
		EObject _localVariable_4 = match.getObject("mSignature");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpMTypeAccess = _localVariable_1;
		EObject tmpMArrayType = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpMSignature = _localVariable_4;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpMTypeAccess instanceof TypeAccess) {
				TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
				if (tmpMArrayType instanceof Type) {
					Type mArrayType = (Type) tmpMArrayType;
					if (tmpMType instanceof ArrayType) {
						ArrayType mType = (ArrayType) tmpMType;
						if (tmpMSignature instanceof MFieldSignature) {
							MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
							return new Object[] { mFieldName, mTypeAccess, mArrayType, mType, mSignature, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignatureArrayType_2_2_corematch_blackFFBFFBBBBB(
			MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mArrayType.equals(mType)) {
			for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mFieldName, MFieldNameToTField.class, "source")) {
				TField tField = eFieldDeclarationToTField.getTarget();
				if (tField != null) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mArrayType, TypeToTAbstractType.class, "source")) {
						TAbstractType tType = mTypeToTType.getTarget();
						if (tType != null) {
							_result.add(new Object[] { mTypeToTType, tType, mFieldName, eFieldDeclarationToTField,
									tField, mTypeAccess, mArrayType, mType, mSignature, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignatureArrayType_2_3_findcontext_blackBBBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mArrayType.equals(mType)) {
			if (tField.equals(eFieldDeclarationToTField.getTarget())) {
				if (mArrayType.equals(mTypeAccess.getType())) {
					if (mFieldName.getMSignatures().contains(mSignature)) {
						if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
							if (mTypeAccess.equals(mType.getElementType())) {
								if (mType.equals(mSignature.getType())) {
									if (tType.equals(mTypeToTType.getTarget())) {
										if (mArrayType.equals(mTypeToTType.getSource())) {
											_result.add(new Object[] { mTypeToTType, tType, mFieldName,
													eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType,
													mSignature });
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

	public static final Object[] pattern_FieldSignatureArrayType_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFF(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mArrayType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mArrayType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mArrayType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String mTypeAccess__mArrayType____type_name_prime = "type";
		String mArrayType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String mType__mTypeAccess____elementType_name_prime = "elementType";
		String mSignature__mType____type_name_prime = "type";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mArrayType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mArrayType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__tField____target);
		mTypeAccess__mArrayType____type.setSrc(mTypeAccess);
		mTypeAccess__mArrayType____type.setTrg(mArrayType);
		isApplicableMatch.getAllContextElements().add(mTypeAccess__mArrayType____type);
		mArrayType__mTypeAccess____usagesInTypeAccess.setSrc(mArrayType);
		mArrayType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mArrayType__mTypeAccess____usagesInTypeAccess);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mFieldName__mSignature____mSignatures);
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__mFieldName____source);
		mType__mTypeAccess____elementType.setSrc(mType);
		mType__mTypeAccess____elementType.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mTypeAccess____elementType);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mSignature__mType____type);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mTypeToTType__mArrayType____source.setSrc(mTypeToTType);
		mTypeToTType__mArrayType____source.setTrg(mArrayType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mArrayType____source);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		mTypeAccess__mArrayType____type.setName(mTypeAccess__mArrayType____type_name_prime);
		mArrayType__mTypeAccess____usagesInTypeAccess.setName(mArrayType__mTypeAccess____usagesInTypeAccess_name_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		mType__mTypeAccess____elementType.setName(mType__mTypeAccess____elementType_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mArrayType____source.setName(mTypeToTType__mArrayType____source_name_prime);
		return new Object[] { mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mTypeAccess,
				mArrayType, mType, mSignature, isApplicableMatch, eFieldDeclarationToTField__tField____target,
				mTypeAccess__mArrayType____type, mArrayType__mTypeAccess____usagesInTypeAccess,
				mFieldName__mSignature____mSignatures, eFieldDeclarationToTField__mFieldName____source,
				mType__mTypeAccess____elementType, mSignature__mType____type, mTypeToTType__tType____target,
				mTypeToTType__mArrayType____source };
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_4_solveCSP_bindingFBBBBBBBBBBB(
			FieldSignatureArrayType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MFieldName mFieldName, MFieldNameToTField eFieldDeclarationToTField, TField tField,
			TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToTType, tType, mFieldName,
				eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mFieldName,
					eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			FieldSignatureArrayType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MFieldName mFieldName, MFieldNameToTField eFieldDeclarationToTField, TField tField,
			TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature) {
		Object[] result_pattern_FieldSignatureArrayType_2_4_solveCSP_binding = pattern_FieldSignatureArrayType_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField,
				mTypeAccess, mArrayType, mType, mSignature);
		if (result_pattern_FieldSignatureArrayType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignatureArrayType_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_2_4_solveCSP_black = pattern_FieldSignatureArrayType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldSignatureArrayType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mFieldName,
						eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignatureArrayType_2_5_checkCSP_expressionFBB(
			FieldSignatureArrayType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldSignatureArrayType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldSignatureArrayType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldSignatureArrayType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_10_1_initialbindings_blackBBBBB(
			FieldSignatureArrayType _this, Match match, TFieldSignature tSignature, TAbstractType tType,
			TField tField) {
		return new Object[] { _this, match, tSignature, tType, tField };
	}

	public static final Object[] pattern_FieldSignatureArrayType_10_2_SolveCSP_bindingFBBBBB(
			FieldSignatureArrayType _this, Match match, TFieldSignature tSignature, TAbstractType tType,
			TField tField) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tType, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tType, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignatureArrayType_10_2_SolveCSP_bindingAndBlackFBBBBB(
			FieldSignatureArrayType _this, Match match, TFieldSignature tSignature, TAbstractType tType,
			TField tField) {
		Object[] result_pattern_FieldSignatureArrayType_10_2_SolveCSP_binding = pattern_FieldSignatureArrayType_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSignature, tType, tField);
		if (result_pattern_FieldSignatureArrayType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignatureArrayType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_10_2_SolveCSP_black = pattern_FieldSignatureArrayType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldSignatureArrayType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tType, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignatureArrayType_10_3_CheckCSP_expressionFBB(
			FieldSignatureArrayType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TFieldSignature tSignature, TAbstractType tType, TField tField) {
		return new Object[] { match, tSignature, tType, tField };
	}

	public static final Object[] pattern_FieldSignatureArrayType_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TFieldSignature tSignature, TAbstractType tType, TField tField) {
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String tSignature__tType____type_name_prime = "type";
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		match.getToBeTranslatedEdges().add(tSignature__tField____field);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		match.getToBeTranslatedEdges().add(tSignature__tType____type);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		return new Object[] { match, tSignature, tType, tField, tField__tSignature____signatures,
				tSignature__tField____field, tSignature__tType____type };
	}

	public static final Object[] pattern_FieldSignatureArrayType_10_5_collectcontextelements_blackBBBB(Match match,
			TFieldSignature tSignature, TAbstractType tType, TField tField) {
		return new Object[] { match, tSignature, tType, tField };
	}

	public static final Object[] pattern_FieldSignatureArrayType_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tType, TField tField) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tField);
		return new Object[] { match, tType, tField };
	}

	public static final void pattern_FieldSignatureArrayType_10_6_registerobjectstomatch_expressionBBBBB(
			FieldSignatureArrayType _this, Match match, TFieldSignature tSignature, TAbstractType tType,
			TField tField) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tType, tField);

	}

	public static final boolean pattern_FieldSignatureArrayType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignatureArrayType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mFieldName");
		EObject _localVariable_4 = isApplicableMatch.getObject("eFieldDeclarationToTField");
		EObject _localVariable_5 = isApplicableMatch.getObject("tField");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTypeAccess");
		EObject _localVariable_7 = isApplicableMatch.getObject("mArrayType");
		EObject _localVariable_8 = isApplicableMatch.getObject("mType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMFieldName = _localVariable_3;
		EObject tmpEFieldDeclarationToTField = _localVariable_4;
		EObject tmpTField = _localVariable_5;
		EObject tmpMTypeAccess = _localVariable_6;
		EObject tmpMArrayType = _localVariable_7;
		EObject tmpMType = _localVariable_8;
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMFieldName instanceof MFieldName) {
						MFieldName mFieldName = (MFieldName) tmpMFieldName;
						if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
							MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
							if (tmpTField instanceof TField) {
								TField tField = (TField) tmpTField;
								if (tmpMTypeAccess instanceof TypeAccess) {
									TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
									if (tmpMArrayType instanceof Type) {
										Type mArrayType = (Type) tmpMArrayType;
										if (tmpMType instanceof ArrayType) {
											ArrayType mType = (ArrayType) tmpMType;
											return new Object[] { tSignature, mTypeToTType, tType, mFieldName,
													eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType,
													isApplicableMatch };
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

	public static final Object[] pattern_FieldSignatureArrayType_11_1_performtransformation_blackBBBBBBBBBFBB(
			TFieldSignature tSignature, TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, FieldSignatureArrayType _this, IsApplicableMatch isApplicableMatch) {
		if (!mArrayType.equals(mType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tSignature, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField,
							tField, mTypeAccess, mArrayType, mType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			FieldSignatureArrayType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding = pattern_FieldSignatureArrayType_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding != null) {
			TFieldSignature tSignature = (TFieldSignature) result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding[2];
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding[3];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding[4];
			TField tField = (TField) result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding[5];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding[6];
			Type mArrayType = (Type) result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding[7];
			ArrayType mType = (ArrayType) result_pattern_FieldSignatureArrayType_11_1_performtransformation_binding[8];

			Object[] result_pattern_FieldSignatureArrayType_11_1_performtransformation_black = pattern_FieldSignatureArrayType_11_1_performtransformation_blackBBBBBBBBBFBB(
					tSignature, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mTypeAccess,
					mArrayType, mType, _this, isApplicableMatch);
			if (result_pattern_FieldSignatureArrayType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldSignatureArrayType_11_1_performtransformation_black[9];

				return new Object[] { tSignature, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField,
						mTypeAccess, mArrayType, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_11_1_performtransformation_greenBBFFBF(
			TFieldSignature tSignature, MFieldName mFieldName, ArrayType mType) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MFieldSignature mSignature = ModiscoFactory.eINSTANCE.createMFieldSignature();
		mFlowElementToTFlowElement.setTarget(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		mFieldName.getMSignatures().add(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mSignature.setType(mType);
		return new Object[] { tSignature, mFieldName, mFlowElementToTFlowElement, mSignatureToTSignature, mType,
				mSignature };
	}

	public static final Object[] pattern_FieldSignatureArrayType_11_2_collecttranslatedelements_blackBBBB(
			TFieldSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature) {
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_FieldSignatureArrayType_11_2_collecttranslatedelements_greenFBBBB(
			TFieldSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getCreatedElements().add(mSignature);
		return new Object[] { ruleresult, tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_FieldSignatureArrayType_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType, EObject tType, EObject mFieldName,
			EObject eFieldDeclarationToTField, EObject tField, EObject mFlowElementToTFlowElement, EObject mTypeAccess,
			EObject mArrayType, EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		if (!tSignature.equals(tType)) {
			if (!mTypeToTType.equals(tSignature)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mTypeToTType.equals(tField)) {
						if (!mFieldName.equals(tSignature)) {
							if (!mFieldName.equals(mTypeToTType)) {
								if (!mFieldName.equals(tType)) {
									if (!mFieldName.equals(tField)) {
										if (!mFieldName.equals(mFlowElementToTFlowElement)) {
											if (!mFieldName.equals(mTypeAccess)) {
												if (!mFieldName.equals(mSignatureToTSignature)) {
													if (!mFieldName.equals(mType)) {
														if (!mFieldName.equals(mSignature)) {
															if (!eFieldDeclarationToTField.equals(tSignature)) {
																if (!eFieldDeclarationToTField.equals(mTypeToTType)) {
																	if (!eFieldDeclarationToTField.equals(tType)) {
																		if (!eFieldDeclarationToTField
																				.equals(mFieldName)) {
																			if (!eFieldDeclarationToTField
																					.equals(tField)) {
																				if (!eFieldDeclarationToTField.equals(
																						mFlowElementToTFlowElement)) {
																					if (!eFieldDeclarationToTField
																							.equals(mTypeAccess)) {
																						if (!eFieldDeclarationToTField
																								.equals(mArrayType)) {
																							if (!eFieldDeclarationToTField
																									.equals(mSignatureToTSignature)) {
																								if (!eFieldDeclarationToTField
																										.equals(mType)) {
																									if (!eFieldDeclarationToTField
																											.equals(mSignature)) {
																										if (!tField
																												.equals(tSignature)) {
																											if (!tField
																													.equals(tType)) {
																												if (!mFlowElementToTFlowElement
																														.equals(tSignature)) {
																													if (!mFlowElementToTFlowElement
																															.equals(mTypeToTType)) {
																														if (!mFlowElementToTFlowElement
																																.equals(tType)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(tField)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(mTypeAccess)) {
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
																																									.equals(tField)) {
																																								if (!mArrayType
																																										.equals(tSignature)) {
																																									if (!mArrayType
																																											.equals(mTypeToTType)) {
																																										if (!mArrayType
																																												.equals(tType)) {
																																											if (!mArrayType
																																													.equals(mFieldName)) {
																																												if (!mArrayType
																																														.equals(tField)) {
																																													if (!mArrayType
																																															.equals(mFlowElementToTFlowElement)) {
																																														if (!mArrayType
																																																.equals(mTypeAccess)) {
																																															if (!mArrayType
																																																	.equals(mSignatureToTSignature)) {
																																																if (!mArrayType
																																																		.equals(mType)) {
																																																	if (!mArrayType
																																																			.equals(mSignature)) {
																																																		if (!mSignatureToTSignature
																																																				.equals(tSignature)) {
																																																			if (!mSignatureToTSignature
																																																					.equals(mTypeToTType)) {
																																																				if (!mSignatureToTSignature
																																																						.equals(tType)) {
																																																					if (!mSignatureToTSignature
																																																							.equals(tField)) {
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
																																																													.equals(tField)) {
																																																												if (!mType
																																																														.equals(mTypeAccess)) {
																																																													if (!mSignature
																																																															.equals(tSignature)) {
																																																														if (!mSignature
																																																																.equals(mTypeToTType)) {
																																																															if (!mSignature
																																																																	.equals(tType)) {
																																																																if (!mSignature
																																																																		.equals(tField)) {
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
																																																																						mFieldName,
																																																																						eFieldDeclarationToTField,
																																																																						tField,
																																																																						mFlowElementToTFlowElement,
																																																																						mTypeAccess,
																																																																						mArrayType,
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

	public static final Object[] pattern_FieldSignatureArrayType_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mFieldName, EObject tField,
			EObject mFlowElementToTFlowElement, EObject mSignatureToTSignature, EObject mType, EObject mSignature) {
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldSignatureArrayType";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String tSignature__tType____type_name_prime = "type";
		String mSignature__mType____type_name_prime = "type";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		ruleresult.getTranslatedEdges().add(tSignature__tField____field);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFieldName__mSignature____mSignatures);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tSignature__tType____type);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mSignature__mType____type);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		return new Object[] { ruleresult, tSignature, tType, mFieldName, tField, mFlowElementToTFlowElement,
				mSignatureToTSignature, mType, mSignature, mSignatureToTSignature__mSignature____source,
				tField__tSignature____signatures, tSignature__tField____field, mFieldName__mSignature____mSignatures,
				mSignatureToTSignature__tSignature____target, mFlowElementToTFlowElement__mSignature____source,
				tSignature__tType____type, mSignature__mType____type,
				mFlowElementToTFlowElement__tSignature____target };
	}

	public static final void pattern_FieldSignatureArrayType_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			FieldSignatureArrayType _this, PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToTType,
			EObject tType, EObject mFieldName, EObject eFieldDeclarationToTField, EObject tField,
			EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mArrayType, EObject mSignatureToTSignature,
			EObject mType, EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, tSignature, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField,
				tField, mFlowElementToTFlowElement, mTypeAccess, mArrayType, mSignatureToTSignature, mType, mSignature);

	}

	public static final PerformRuleResult pattern_FieldSignatureArrayType_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_1_preparereturnvalue_bindingFB(
			FieldSignatureArrayType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldSignatureArrayType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldSignatureArrayType _this) {
		Object[] result_pattern_FieldSignatureArrayType_12_1_preparereturnvalue_binding = pattern_FieldSignatureArrayType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignatureArrayType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldSignatureArrayType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_12_1_preparereturnvalue_black = pattern_FieldSignatureArrayType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldSignatureArrayType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldSignatureArrayType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldSignatureArrayType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("tType");
		EObject _localVariable_2 = match.getObject("tField");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpTField instanceof TField) {
					TField tField = (TField) tmpTField;
					return new Object[] { tSignature, tType, tField, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignatureArrayType_12_2_corematch_blackBFBFFBFB(
			TFieldSignature tSignature, TAbstractType tType, TField tField, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tSignature_upperBound = tSignature.getUpperBound();
		if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(-1))) {
			for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tField, MFieldNameToTField.class, "target")) {
				MFieldName mFieldName = eFieldDeclarationToTField.getSource();
				if (mFieldName != null) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
						Type mArrayType = mTypeToTType.getSource();
						if (mArrayType != null) {
							_result.add(new Object[] { tSignature, mTypeToTType, tType, mFieldName,
									eFieldDeclarationToTField, tField, mArrayType, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignatureArrayType_12_3_findcontext_blackBBBBBBFBF(
			TFieldSignature tSignature, TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, Type mArrayType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tField.equals(eFieldDeclarationToTField.getTarget())) {
			if (tField.getSignatures().contains(tSignature)) {
				if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
					if (tType.equals(tSignature.getType())) {
						if (tType.equals(mTypeToTType.getTarget())) {
							if (mArrayType.equals(mTypeToTType.getSource())) {
								int tSignature_upperBound = tSignature.getUpperBound();
								if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(-1))) {
									for (TypeAccess mTypeAccess : mArrayType.getUsagesInTypeAccess()) {
										for (ArrayType mType : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(mTypeAccess, ArrayType.class,
														"elementType")) {
											if (!mArrayType.equals(mType)) {
												_result.add(new Object[] { tSignature, mTypeToTType, tType, mFieldName,
														eFieldDeclarationToTField, tField, mTypeAccess, mArrayType,
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
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(
			TFieldSignature tSignature, TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mArrayType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mArrayType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mArrayType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String mTypeAccess__mArrayType____type_name_prime = "type";
		String mArrayType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String tSignature__tType____type_name_prime = "type";
		String mType__mTypeAccess____elementType_name_prime = "elementType";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mArrayType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mArrayType);
		isApplicableMatch.getAllContextElements().add(mType);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__tField____target);
		mTypeAccess__mArrayType____type.setSrc(mTypeAccess);
		mTypeAccess__mArrayType____type.setTrg(mArrayType);
		isApplicableMatch.getAllContextElements().add(mTypeAccess__mArrayType____type);
		mArrayType__mTypeAccess____usagesInTypeAccess.setSrc(mArrayType);
		mArrayType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mArrayType__mTypeAccess____usagesInTypeAccess);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(tSignature__tField____field);
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__mFieldName____source);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tSignature__tType____type);
		mType__mTypeAccess____elementType.setSrc(mType);
		mType__mTypeAccess____elementType.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mTypeAccess____elementType);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mTypeToTType__mArrayType____source.setSrc(mTypeToTType);
		mTypeToTType__mArrayType____source.setTrg(mArrayType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mArrayType____source);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		mTypeAccess__mArrayType____type.setName(mTypeAccess__mArrayType____type_name_prime);
		mArrayType__mTypeAccess____usagesInTypeAccess.setName(mArrayType__mTypeAccess____usagesInTypeAccess_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		mType__mTypeAccess____elementType.setName(mType__mTypeAccess____elementType_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mArrayType____source.setName(mTypeToTType__mArrayType____source_name_prime);
		return new Object[] { tSignature, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField,
				mTypeAccess, mArrayType, mType, isApplicableMatch, eFieldDeclarationToTField__tField____target,
				mTypeAccess__mArrayType____type, mArrayType__mTypeAccess____usagesInTypeAccess,
				tField__tSignature____signatures, tSignature__tField____field,
				eFieldDeclarationToTField__mFieldName____source, tSignature__tType____type,
				mType__mTypeAccess____elementType, mTypeToTType__tType____target, mTypeToTType__mArrayType____source };
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_4_solveCSP_bindingFBBBBBBBBBBB(
			FieldSignatureArrayType _this, IsApplicableMatch isApplicableMatch, TFieldSignature tSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tSignature, mTypeToTType, tType,
				mFieldName, eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSignature, mTypeToTType, tType, mFieldName,
					eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			FieldSignatureArrayType _this, IsApplicableMatch isApplicableMatch, TFieldSignature tSignature,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType) {
		Object[] result_pattern_FieldSignatureArrayType_12_4_solveCSP_binding = pattern_FieldSignatureArrayType_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tSignature, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField,
				tField, mTypeAccess, mArrayType, mType);
		if (result_pattern_FieldSignatureArrayType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignatureArrayType_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_12_4_solveCSP_black = pattern_FieldSignatureArrayType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldSignatureArrayType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSignature, mTypeToTType, tType, mFieldName,
						eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignatureArrayType_12_5_checkCSP_expressionFBB(
			FieldSignatureArrayType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldSignatureArrayType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldSignatureArrayType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldSignatureArrayType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_20_1_preparereturnvalue_bindingFB(
			FieldSignatureArrayType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldSignatureArrayType _this) {
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

	public static final Object[] pattern_FieldSignatureArrayType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldSignatureArrayType _this) {
		Object[] result_pattern_FieldSignatureArrayType_20_1_preparereturnvalue_binding = pattern_FieldSignatureArrayType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignatureArrayType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldSignatureArrayType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_20_1_preparereturnvalue_black = pattern_FieldSignatureArrayType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldSignatureArrayType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldSignatureArrayType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldSignatureArrayType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldSignatureArrayType_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_signatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTField = _edge_signatures.getSrc();
		if (tmpTField instanceof TField) {
			TField tField = (TField) tmpTField;
			EObject tmpTSignature = _edge_signatures.getTrg();
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tField.getSignatures().contains(tSignature)) {
					TAbstractType tType = tSignature.getType();
					if (tType != null) {
						int tSignature_upperBound = tSignature.getUpperBound();
						if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(-1))) {
							_result.add(new Object[] { tSignature, tType, tField, _edge_signatures });
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldSignatureArrayType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			FieldSignatureArrayType _this, Match match, TFieldSignature tSignature, TAbstractType tType,
			TField tField) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tType, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldSignatureArrayType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldSignatureArrayType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldSignatureArrayType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_21_1_preparereturnvalue_bindingFB(
			FieldSignatureArrayType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldSignatureArrayType _this) {
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

	public static final Object[] pattern_FieldSignatureArrayType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldSignatureArrayType _this) {
		Object[] result_pattern_FieldSignatureArrayType_21_1_preparereturnvalue_binding = pattern_FieldSignatureArrayType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignatureArrayType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldSignatureArrayType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_21_1_preparereturnvalue_black = pattern_FieldSignatureArrayType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldSignatureArrayType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldSignatureArrayType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldSignatureArrayType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldSignatureArrayType_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_mSignatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMFieldName = _edge_mSignatures.getSrc();
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			EObject tmpMSignature = _edge_mSignatures.getTrg();
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				if (mFieldName.getMSignatures().contains(mSignature)) {
					Type tmpMType = mSignature.getType();
					if (tmpMType instanceof ArrayType) {
						ArrayType mType = (ArrayType) tmpMType;
						TypeAccess mTypeAccess = mType.getElementType();
						if (mTypeAccess != null) {
							Type mArrayType = mTypeAccess.getType();
							if (mArrayType != null) {
								if (!mArrayType.equals(mType)) {
									_result.add(new Object[] { mFieldName, mTypeAccess, mArrayType, mType, mSignature,
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

	public static final Object[] pattern_FieldSignatureArrayType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldSignatureArrayType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			FieldSignatureArrayType _this, Match match, MFieldName mFieldName, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, MFieldSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mFieldName, mTypeAccess, mArrayType, mType,
				mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldSignatureArrayType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldSignatureArrayType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldSignatureArrayType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_1_prepare_blackB(FieldSignatureArrayType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tSignature");
		EObject _localVariable_1 = targetMatch.getObject("tType");
		EObject _localVariable_2 = sourceMatch.getObject("mFieldName");
		EObject _localVariable_3 = targetMatch.getObject("tField");
		EObject _localVariable_4 = sourceMatch.getObject("mTypeAccess");
		EObject _localVariable_5 = sourceMatch.getObject("mArrayType");
		EObject _localVariable_6 = sourceMatch.getObject("mType");
		EObject _localVariable_7 = sourceMatch.getObject("mSignature");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMFieldName = _localVariable_2;
		EObject tmpTField = _localVariable_3;
		EObject tmpMTypeAccess = _localVariable_4;
		EObject tmpMArrayType = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		EObject tmpMSignature = _localVariable_7;
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMFieldName instanceof MFieldName) {
					MFieldName mFieldName = (MFieldName) tmpMFieldName;
					if (tmpTField instanceof TField) {
						TField tField = (TField) tmpTField;
						if (tmpMTypeAccess instanceof TypeAccess) {
							TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
							if (tmpMArrayType instanceof Type) {
								Type mArrayType = (Type) tmpMArrayType;
								if (tmpMType instanceof ArrayType) {
									ArrayType mType = (ArrayType) tmpMType;
									if (tmpMSignature instanceof MFieldSignature) {
										MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
										return new Object[] { tSignature, tType, mFieldName, tField, mTypeAccess,
												mArrayType, mType, mSignature, targetMatch, sourceMatch };
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

	public static final Object[] pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
			TFieldSignature tSignature, TAbstractType tType, MFieldName mFieldName, TField tField,
			TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature, Match sourceMatch,
			Match targetMatch) {
		if (!mArrayType.equals(mType)) {
			if (!sourceMatch.equals(targetMatch)) {
				int tSignature_upperBound = tSignature.getUpperBound();
				if (Integer.valueOf(tSignature_upperBound).equals(Integer.valueOf(-1))) {
					return new Object[] { tSignature, tType, mFieldName, tField, mTypeAccess, mArrayType, mType,
							mSignature, sourceMatch, targetMatch };
				}

			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding = pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding != null) {
			TFieldSignature tSignature = (TFieldSignature) result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding[1];
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding[2];
			TField tField = (TField) result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding[3];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding[4];
			Type mArrayType = (Type) result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding[5];
			ArrayType mType = (ArrayType) result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding[6];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_black = pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					tSignature, tType, mFieldName, tField, mTypeAccess, mArrayType, mType, mSignature, sourceMatch,
					targetMatch);
			if (result_pattern_FieldSignatureArrayType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tSignature, tType, mFieldName, tField, mTypeAccess, mArrayType, mType, mSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_3_solvecsp_bindingFBBBBBBBBBBB(
			FieldSignatureArrayType _this, TFieldSignature tSignature, TAbstractType tType, MFieldName mFieldName,
			TField tField, TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(tSignature, tType, mFieldName, tField, mTypeAccess,
				mArrayType, mType, mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, tSignature, tType, mFieldName, tField, mTypeAccess, mArrayType, mType,
					mSignature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			FieldSignatureArrayType _this, TFieldSignature tSignature, TAbstractType tType, MFieldName mFieldName,
			TField tField, TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldSignatureArrayType_24_3_solvecsp_binding = pattern_FieldSignatureArrayType_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, tSignature, tType, mFieldName, tField, mTypeAccess, mArrayType, mType, mSignature, sourceMatch,
				targetMatch);
		if (result_pattern_FieldSignatureArrayType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignatureArrayType_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_24_3_solvecsp_black = pattern_FieldSignatureArrayType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldSignatureArrayType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tSignature, tType, mFieldName, tField, mTypeAccess, mArrayType, mType,
						mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignatureArrayType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignatureArrayType_24_5_matchcorrcontext_blackFBBFBBBB(
			TAbstractType tType, MFieldName mFieldName, TField tField, Type mArrayType, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tField, MFieldNameToTField.class, "target")) {
				if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
						if (mArrayType.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { mTypeToTType, tType, mFieldName, eFieldDeclarationToTField,
									tField, mArrayType, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldSignatureArrayType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(eFieldDeclarationToTField);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, eFieldDeclarationToTField, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_6_createcorrespondence_blackBBBBBBBBB(
			TFieldSignature tSignature, TAbstractType tType, MFieldName mFieldName, TField tField,
			TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature, CCMatch ccMatch) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { tSignature, tType, mFieldName, tField, mTypeAccess, mArrayType, mType, mSignature,
					ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_6_createcorrespondence_greenBFFBB(
			TFieldSignature tSignature, MFieldSignature mSignature, CCMatch ccMatch) {
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

	public static final Object[] pattern_FieldSignatureArrayType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldSignatureArrayType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldSignatureArrayType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldSignatureArrayType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_27_1_matchtggpattern_blackBBBBB(MFieldName mFieldName,
			TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, MFieldSignature mSignature) {
		if (!mArrayType.equals(mType)) {
			if (mArrayType.equals(mTypeAccess.getType())) {
				if (mFieldName.getMSignatures().contains(mSignature)) {
					if (mTypeAccess.equals(mType.getElementType())) {
						if (mType.equals(mSignature.getType())) {
							return new Object[] { mFieldName, mTypeAccess, mArrayType, mType, mSignature };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignatureArrayType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignatureArrayType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_28_1_matchtggpattern_blackBBB(
			TFieldSignature tSignature, TAbstractType tType, TField tField) {
		if (tField.getSignatures().contains(tSignature)) {
			if (tType.equals(tSignature.getType())) {
				return new Object[] { tSignature, tType, tField };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_28_1_matchtggpattern_greenB(
			TFieldSignature tSignature) {
		int tSignature_upperBound_prime = Integer.valueOf(-1);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		return new Object[] { tSignature };
	}

	public static final boolean pattern_FieldSignatureArrayType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignatureArrayType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_1_createresult_blackB(
			FieldSignatureArrayType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Type mArrayType) {
		if (ruleResult.getSourceObjects().contains(mArrayType)) {
			return new Object[] { ruleResult, mArrayType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeAccess mTypeAccess) {
		if (ruleResult.getSourceObjects().contains(mTypeAccess)) {
			return new Object[] { ruleResult, mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ArrayType mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MFieldName mFieldName) {
		if (ruleResult.getSourceObjects().contains(mFieldName)) {
			return new Object[] { ruleResult, mFieldName };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MFieldNameToTField eFieldDeclarationToTField) {
		if (ruleResult.getCorrObjects().contains(eFieldDeclarationToTField)) {
			return new Object[] { ruleResult, eFieldDeclarationToTField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TField tField) {
		if (ruleResult.getTargetObjects().contains(tField)) {
			return new Object[] { ruleResult, tField };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignatureArrayType_29_2_isapplicablecore_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eFieldDeclarationToTFieldList : ruleEntryContainer.getRuleEntryList()) {
				if (!eFieldDeclarationToTFieldList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							Type mArrayType = mTypeToTType.getSource();
							if (mArrayType != null) {
								TAbstractType tType = mTypeToTType.getTarget();
								if (tType != null) {
									if (pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mTypeToTType) == null) {
										if (pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, mArrayType) == null) {
											if (pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, tType) == null) {
												for (EObject tmpEFieldDeclarationToTField : eFieldDeclarationToTFieldList
														.getEntryObjects()) {
													if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
														MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
														MFieldName mFieldName = eFieldDeclarationToTField.getSource();
														if (mFieldName != null) {
															TField tField = eFieldDeclarationToTField.getTarget();
															if (tField != null) {
																if (pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_6BB(
																		ruleResult,
																		eFieldDeclarationToTField) == null) {
																	if (pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_5BB(
																			ruleResult, mFieldName) == null) {
																		if (pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_7BB(
																				ruleResult, tField) == null) {
																			for (TypeAccess mTypeAccess : mArrayType
																					.getUsagesInTypeAccess()) {
																				if (pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_2BB(
																						ruleResult,
																						mTypeAccess) == null) {
																					for (ArrayType mType : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									mTypeAccess,
																									ArrayType.class,
																									"elementType")) {
																						if (!mArrayType.equals(mType)) {
																							if (pattern_FieldSignatureArrayType_29_2_isapplicablecore_black_nac_3BB(
																									ruleResult,
																									mType) == null) {
																								_result.add(
																										new Object[] {
																												mTypeToTTypeList,
																												mTypeToTType,
																												mArrayType,
																												mTypeAccess,
																												mType,
																												tType,
																												eFieldDeclarationToTFieldList,
																												mFieldName,
																												eFieldDeclarationToTField,
																												tField,
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

	public static final Object[] pattern_FieldSignatureArrayType_29_3_solveCSP_bindingFBBBBBBBBBBB(
			FieldSignatureArrayType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MFieldName mFieldName, MFieldNameToTField eFieldDeclarationToTField, TField tField,
			TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, tType, mFieldName,
				eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mFieldName,
					eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			FieldSignatureArrayType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MFieldName mFieldName, MFieldNameToTField eFieldDeclarationToTField, TField tField,
			TypeAccess mTypeAccess, Type mArrayType, ArrayType mType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldSignatureArrayType_29_3_solveCSP_binding = pattern_FieldSignatureArrayType_29_3_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField,
				mTypeAccess, mArrayType, mType, ruleResult);
		if (result_pattern_FieldSignatureArrayType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignatureArrayType_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldSignatureArrayType_29_3_solveCSP_black = pattern_FieldSignatureArrayType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldSignatureArrayType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mFieldName,
						eFieldDeclarationToTField, tField, mTypeAccess, mArrayType, mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignatureArrayType_29_4_checkCSP_expressionFBB(
			FieldSignatureArrayType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_5_checknacs_blackBBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mTypeAccess,
					mArrayType, mType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_6_perform_blackBBBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MFieldName mFieldName,
			MFieldNameToTField eFieldDeclarationToTField, TField tField, TypeAccess mTypeAccess, Type mArrayType,
			ArrayType mType, ModelgeneratorRuleResult ruleResult) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { mTypeToTType, tType, mFieldName, eFieldDeclarationToTField, tField, mTypeAccess,
					mArrayType, mType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignatureArrayType_29_6_perform_greenFBBBFFBFB(TAbstractType tType,
			MFieldName mFieldName, TField tField, ArrayType mType, ModelgeneratorRuleResult ruleResult) {
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MFieldSignature mSignature = ModiscoFactory.eINSTANCE.createMFieldSignature();
		int tSignature_upperBound_prime = Integer.valueOf(-1);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		tField.getSignatures().add(tSignature);
		tSignature.setType(tType);
		ruleResult.getTargetObjects().add(tSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		mSignatureToTSignature.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mSignatureToTSignature);
		mSignatureToTSignature.setSource(mSignature);
		mFieldName.getMSignatures().add(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mSignature.setType(mType);
		ruleResult.getSourceObjects().add(mSignature);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tSignature, tType, mFieldName, tField, mFlowElementToTFlowElement, mSignatureToTSignature,
				mType, mSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_FieldSignatureArrayType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldSignatureArrayTypeImpl
