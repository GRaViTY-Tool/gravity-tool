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

import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MFieldNameToTField;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.FieldSignature;
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
 * An implementation of the model object '<em><b>Field Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldSignatureImpl extends AbstractRuleImpl implements FieldSignature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Type mType, MFieldSignature mSignature, MFieldName mFieldName) {

		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_0_1_initialbindings_blackBBBBB(this, match,
				mType, mSignature, mFieldName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mFieldName] = " + mFieldName + ".");
		}

		Object[] result2_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mType, mSignature, mFieldName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", "
					+ "[mFieldName] = " + mFieldName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldSignatureImpl.pattern_FieldSignature_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldSignatureImpl
					.pattern_FieldSignature_0_4_collectelementstobetranslated_blackBBBB(match, mType, mSignature,
							mFieldName);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mType] = " + mType
								+ ", " + "[mSignature] = " + mSignature + ", " + "[mFieldName] = " + mFieldName + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_0_4_collectelementstobetranslated_greenBBBBFF(match, mType,
					mSignature, mFieldName);
			//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = FieldSignatureImpl
					.pattern_FieldSignature_0_5_collectcontextelements_blackBBBB(match, mType, mSignature, mFieldName);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mType] = " + mType
								+ ", " + "[mSignature] = " + mSignature + ", " + "[mFieldName] = " + mFieldName + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_0_5_collectcontextelements_greenBBB(match, mType, mFieldName);

			// 
			FieldSignatureImpl.pattern_FieldSignature_0_6_registerobjectstomatch_expressionBBBBB(this, match, mType,
					mSignature, mFieldName);
			return FieldSignatureImpl.pattern_FieldSignature_0_7_expressionF();
		} else {
			return FieldSignatureImpl.pattern_FieldSignature_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[0];
		Type mType = (Type) result1_bindingAndBlack[1];
		TField tField = (TField) result1_bindingAndBlack[2];
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[3];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[4];
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_bindingAndBlack[5];
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = FieldSignatureImpl
				.pattern_FieldSignature_1_1_performtransformation_greenFBBBFFB(tAbstractType, tField, mSignature, csp);
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[4];
		TFieldSignature tSignature = (TFieldSignature) result1_green[5];

		Object[] result2_black = FieldSignatureImpl.pattern_FieldSignature_1_2_collecttranslatedelements_blackBBBB(
				mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, tSignature);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mSignatureToTSignature] = " + mSignatureToTSignature
							+ ", " + "[mSignature] = " + mSignature + ", " + "[mFlowElementToTFlowElement] = "
							+ mFlowElementToTFlowElement + ", " + "[tSignature] = " + tSignature + ".");
		}
		Object[] result2_green = FieldSignatureImpl.pattern_FieldSignature_1_2_collecttranslatedelements_greenFBBBB(
				mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, tSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldSignatureImpl.pattern_FieldSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mSignatureToTSignature, tAbstractType, mType, tField, mSignature,
				mFlowElementToTFlowElement, mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[mType] = " + mType + ", " + "[tField] = " + tField + ", "
					+ "[mSignature] = " + mSignature + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[mFieldName] = "
					+ mFieldName + ", " + "[tSignature] = " + tSignature + ".");
		}
		FieldSignatureImpl.pattern_FieldSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
				mSignatureToTSignature, tAbstractType, mType, tField, mSignature, mFlowElementToTFlowElement,
				mFieldName, tSignature);
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tSignature__tAbstractType____type = (EMoflonEdge) result3_green[17];

		// 
		// 
		FieldSignatureImpl.pattern_FieldSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mSignatureToTSignature, tAbstractType, mType, tField, mSignature, mFlowElementToTFlowElement,
				mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature);
		return FieldSignatureImpl.pattern_FieldSignature_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldSignatureImpl
				.pattern_FieldSignature_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldSignatureImpl.pattern_FieldSignature_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Type mType = (Type) result2_binding[0];
		MFieldSignature mSignature = (MFieldSignature) result2_binding[1];
		MFieldName mFieldName = (MFieldName) result2_binding[2];
		for (Object[] result2_black : FieldSignatureImpl.pattern_FieldSignature_2_2_corematch_blackFBFBFFBB(mType,
				mSignature, mFieldName, match)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[0];
			TField tField = (TField) result2_black[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[4];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[5];
			// ForEach 
			for (Object[] result3_black : FieldSignatureImpl.pattern_FieldSignature_2_3_findcontext_blackBBBBBBB(
					tAbstractType, mType, tField, mSignature, mTypeToTType, eFieldDeclarationToTField, mFieldName)) {
				Object[] result3_green = FieldSignatureImpl.pattern_FieldSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(
						tAbstractType, mType, tField, mSignature, mTypeToTType, eFieldDeclarationToTField, mFieldName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = FieldSignatureImpl
						.pattern_FieldSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tAbstractType, mType, tField, mSignature, mTypeToTType, eFieldDeclarationToTField,
								mFieldName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAbstractType] = " + tAbstractType
							+ ", " + "[mType] = " + mType + ", " + "[tField] = " + tField + ", " + "[mSignature] = "
							+ mSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
							+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[mFieldName] = "
							+ mFieldName + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldSignatureImpl.pattern_FieldSignature_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldSignatureImpl
							.pattern_FieldSignature_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Type mType, MFieldSignature mSignature, MFieldName mFieldName) {
		match.registerObject("mType", mType);
		match.registerObject("mSignature", mSignature);
		match.registerObject("mFieldName", mFieldName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type mType, MFieldSignature mSignature, MFieldName mFieldName) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TAbstractType tAbstractType, Type mType,
			TField tField, MFieldSignature mSignature, TypeToTAbstractType mTypeToTType,
			MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName) {// Create CSP
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
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		isApplicableMatch.registerObject("mFieldName", mFieldName);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mSignatureToTSignature, EObject tAbstractType,
			EObject mType, EObject tField, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mTypeToTType,
			EObject eFieldDeclarationToTField, EObject mFieldName, EObject tSignature) {
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("tSignature", tSignature);

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
	public boolean isAppropriate_BWD(Match match, TAbstractType tAbstractType, TField tField,
			TFieldSignature tSignature) {

		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_10_1_initialbindings_blackBBBBB(this, match,
				tAbstractType, tField, tSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tField] = " + tField
					+ ", " + "[tSignature] = " + tSignature + ".");
		}

		Object[] result2_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAbstractType, tField,
						tSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[tField] = " + tField
					+ ", " + "[tSignature] = " + tSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldSignatureImpl.pattern_FieldSignature_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldSignatureImpl
					.pattern_FieldSignature_10_4_collectelementstobetranslated_blackBBBB(match, tAbstractType, tField,
							tSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[tField] = " + tField + ", "
						+ "[tSignature] = " + tSignature + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_10_4_collectelementstobetranslated_greenBBBBFFF(match,
					tAbstractType, tField, tSignature);
			//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSignature__tAbstractType____type = (EMoflonEdge) result4_green[6];

			Object[] result5_black = FieldSignatureImpl.pattern_FieldSignature_10_5_collectcontextelements_blackBBBB(
					match, tAbstractType, tField, tSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[tField] = " + tField + ", "
						+ "[tSignature] = " + tSignature + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_10_5_collectcontextelements_greenBBB(match, tAbstractType,
					tField);

			// 
			FieldSignatureImpl.pattern_FieldSignature_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tAbstractType, tField, tSignature);
			return FieldSignatureImpl.pattern_FieldSignature_10_7_expressionF();
		} else {
			return FieldSignatureImpl.pattern_FieldSignature_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[0];
		Type mType = (Type) result1_bindingAndBlack[1];
		TField tField = (TField) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_bindingAndBlack[4];
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[5];
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_11_1_performtransformation_greenFBFFBB(mType,
				mFieldName, tSignature);
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[0];
		MFieldSignature mSignature = (MFieldSignature) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];

		Object[] result2_black = FieldSignatureImpl.pattern_FieldSignature_11_2_collecttranslatedelements_blackBBBB(
				mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, tSignature);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mSignatureToTSignature] = " + mSignatureToTSignature
							+ ", " + "[mSignature] = " + mSignature + ", " + "[mFlowElementToTFlowElement] = "
							+ mFlowElementToTFlowElement + ", " + "[tSignature] = " + tSignature + ".");
		}
		Object[] result2_green = FieldSignatureImpl.pattern_FieldSignature_11_2_collecttranslatedelements_greenFBBBB(
				mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, tSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldSignatureImpl.pattern_FieldSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mSignatureToTSignature, tAbstractType, mType, tField, mSignature,
				mFlowElementToTFlowElement, mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[mType] = " + mType + ", " + "[tField] = " + tField + ", "
					+ "[mSignature] = " + mSignature + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[mFieldName] = "
					+ mFieldName + ", " + "[tSignature] = " + tSignature + ".");
		}
		FieldSignatureImpl.pattern_FieldSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
				mSignatureToTSignature, tAbstractType, mType, tField, mSignature, mFlowElementToTFlowElement,
				mFieldName, tSignature);
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tSignature__tAbstractType____type = (EMoflonEdge) result3_green[17];

		// 
		// 
		FieldSignatureImpl.pattern_FieldSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mSignatureToTSignature, tAbstractType, mType, tField, mSignature, mFlowElementToTFlowElement,
				mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature);
		return FieldSignatureImpl.pattern_FieldSignature_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldSignatureImpl
				.pattern_FieldSignature_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldSignatureImpl.pattern_FieldSignature_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tAbstractType = (TAbstractType) result2_binding[0];
		TField tField = (TField) result2_binding[1];
		TFieldSignature tSignature = (TFieldSignature) result2_binding[2];
		for (Object[] result2_black : FieldSignatureImpl
				.pattern_FieldSignature_12_2_corematch_blackBFBFFFBB(tAbstractType, tField, tSignature, match)) {
			Type mType = (Type) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[4];
			MFieldName mFieldName = (MFieldName) result2_black[5];
			// ForEach 
			for (Object[] result3_black : FieldSignatureImpl.pattern_FieldSignature_12_3_findcontext_blackBBBBBBB(
					tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature)) {
				Object[] result3_green = FieldSignatureImpl
						.pattern_FieldSignature_12_3_findcontext_greenBBBBBBBFFFFFFFF(tAbstractType, mType, tField,
								mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tSignature__tAbstractType____type = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = FieldSignatureImpl
						.pattern_FieldSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName,
								tSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAbstractType] = " + tAbstractType
							+ ", " + "[mType] = " + mType + ", " + "[tField] = " + tField + ", " + "[mTypeToTType] = "
							+ mTypeToTType + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", "
							+ "[mFieldName] = " + mFieldName + ", " + "[tSignature] = " + tSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldSignatureImpl.pattern_FieldSignature_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldSignatureImpl
							.pattern_FieldSignature_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tAbstractType, TField tField,
			TFieldSignature tSignature) {
		match.registerObject("tAbstractType", tAbstractType);
		match.registerObject("tField", tField);
		match.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tAbstractType, TField tField,
			TFieldSignature tSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAbstractType tAbstractType, Type mType,
			TField tField, TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField,
			MFieldName mFieldName, TFieldSignature tSignature) {// Create CSP
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
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		isApplicableMatch.registerObject("mFieldName", mFieldName);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mSignatureToTSignature, EObject tAbstractType,
			EObject mType, EObject tField, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mTypeToTType,
			EObject eFieldDeclarationToTField, EObject mFieldName, EObject tSignature) {
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("tSignature", tSignature);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_41(EMoflonEdge _edge_signatures) {

		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldSignatureImpl
				.pattern_FieldSignature_20_2_testcorematchandDECs_blackFFFB(_edge_signatures)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[0];
			TField tField = (TField) result2_black[1];
			TFieldSignature tSignature = (TFieldSignature) result2_black[2];
			Object[] result2_green = FieldSignatureImpl
					.pattern_FieldSignature_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldSignatureImpl
					.pattern_FieldSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							tAbstractType, tField, tSignature)) {
				// 
				if (FieldSignatureImpl
						.pattern_FieldSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = FieldSignatureImpl
							.pattern_FieldSignature_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_44(EMoflonEdge _edge_mSignatures) {

		Object[] result1_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldSignatureImpl
				.pattern_FieldSignature_21_2_testcorematchandDECs_blackFFFB(_edge_mSignatures)) {
			Type mType = (Type) result2_black[0];
			MFieldSignature mSignature = (MFieldSignature) result2_black[1];
			MFieldName mFieldName = (MFieldName) result2_black[2];
			Object[] result2_green = FieldSignatureImpl
					.pattern_FieldSignature_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldSignatureImpl
					.pattern_FieldSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							mType, mSignature, mFieldName)) {
				// 
				if (FieldSignatureImpl
						.pattern_FieldSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = FieldSignatureImpl
							.pattern_FieldSignature_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldSignature");
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

		upperBound0.setRuleName("FieldSignature");
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
		ruleResult.setRule("FieldSignature");
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

		upperBound0.setRuleName("FieldSignature");
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

		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[0];
		Type mType = (Type) result2_bindingAndBlack[1];
		TField tField = (TField) result2_bindingAndBlack[2];
		MFieldSignature mSignature = (MFieldSignature) result2_bindingAndBlack[3];
		MFieldName mFieldName = (MFieldName) result2_bindingAndBlack[4];
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tAbstractType, mType, tField,
						mSignature, mFieldName, tSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[mType] = " + mType + ", " + "[tField] = " + tField
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mFieldName] = " + mFieldName + ", "
					+ "[tSignature] = " + tSignature + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldSignatureImpl.pattern_FieldSignature_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldSignatureImpl.pattern_FieldSignature_24_5_matchcorrcontext_blackBBBFFBBB(
					tAbstractType, mType, tField, mFieldName, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[3];
				MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result5_black[4];
				Object[] result5_green = FieldSignatureImpl.pattern_FieldSignature_24_5_matchcorrcontext_greenBBBBF(
						mTypeToTType, eFieldDeclarationToTField, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = FieldSignatureImpl
						.pattern_FieldSignature_24_6_createcorrespondence_blackBBBBBBB(tAbstractType, mType, tField,
								mSignature, mFieldName, tSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[mType] = " + mType + ", " + "[tField] = " + tField + ", "
							+ "[mSignature] = " + mSignature + ", " + "[mFieldName] = " + mFieldName + ", "
							+ "[tSignature] = " + tSignature + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldSignatureImpl.pattern_FieldSignature_24_6_createcorrespondence_greenFBFBB(mSignature, tSignature,
						ccMatch);
				//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[0];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[2];

				Object[] result7_black = FieldSignatureImpl
						.pattern_FieldSignature_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldSignatureImpl.pattern_FieldSignature_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return FieldSignatureImpl.pattern_FieldSignature_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TAbstractType tAbstractType, Type mType, TField tField,
			MFieldSignature mSignature, MFieldName mFieldName, TFieldSignature tSignature, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Type mType, MFieldSignature mSignature, MFieldName mFieldName) {// 
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_27_1_matchtggpattern_blackBBB(mType,
				mSignature, mFieldName);
		if (result1_black != null) {
			return FieldSignatureImpl.pattern_FieldSignature_27_2_expressionF();
		} else {
			return FieldSignatureImpl.pattern_FieldSignature_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tAbstractType, TField tField, TFieldSignature tSignature) {// 
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_28_1_matchtggpattern_blackBBB(tAbstractType,
				tField, tSignature);
		if (result1_black != null) {
			FieldSignatureImpl.pattern_FieldSignature_28_1_matchtggpattern_greenB(tSignature);

			return FieldSignatureImpl.pattern_FieldSignature_28_2_expressionF();
		} else {
			return FieldSignatureImpl.pattern_FieldSignature_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MFieldNameToTField eFieldDeclarationToTFieldParameter) {

		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldSignatureImpl.pattern_FieldSignature_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : FieldSignatureImpl
				.pattern_FieldSignature_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			Type mType = (Type) result2_black[3];
			//nothing RuleEntryList eFieldDeclarationToTFieldList = (RuleEntryList) result2_black[4];
			TField tField = (TField) result2_black[5];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[6];
			MFieldName mFieldName = (MFieldName) result2_black[7];

			Object[] result3_bindingAndBlack = FieldSignatureImpl
					.pattern_FieldSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAbstractType] = " + tAbstractType
						+ ", " + "[mType] = " + mType + ", " + "[tField] = " + tField + ", " + "[mTypeToTType] = "
						+ mTypeToTType + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", "
						+ "[mFieldName] = " + mFieldName + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldSignatureImpl.pattern_FieldSignature_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = FieldSignatureImpl.pattern_FieldSignature_29_5_checknacs_blackBBBBBB(
						tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName);
				if (result5_black != null) {

					Object[] result6_black = FieldSignatureImpl.pattern_FieldSignature_29_6_perform_blackBBBBBBB(
							tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAbstractType] = "
								+ tAbstractType + ", " + "[mType] = " + mType + ", " + "[tField] = " + tField + ", "
								+ "[mTypeToTType] = " + mTypeToTType + ", " + "[eFieldDeclarationToTField] = "
								+ eFieldDeclarationToTField + ", " + "[mFieldName] = " + mFieldName + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_29_6_perform_greenFBBBFFBFBB(tAbstractType, mType, tField,
							mFieldName, ruleResult, csp);
					//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[0];
					//nothing MFieldSignature mSignature = (MFieldSignature) result6_green[4];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[5];
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return FieldSignatureImpl.pattern_FieldSignature_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAbstractType tAbstractType, Type mType,
			TField tField, TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField,
			MFieldName mFieldName, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		isApplicableMatch.registerObject("mFieldName", mFieldName);
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
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_FWD__MATCH_TYPE_MFIELDSIGNATURE_MFIELDNAME:
			return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MFieldSignature) arguments.get(2), (MFieldName) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_MFIELDSIGNATURE_MFIELDNAME:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MFieldSignature) arguments.get(2), (MFieldName) arguments.get(3));
			return null;
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_MFIELDSIGNATURE_MFIELDNAME:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MFieldSignature) arguments.get(2), (MFieldName) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TYPE_TFIELD_MFIELDSIGNATURE_TYPETOTABSTRACTTYPE_MFIELDNAMETOTFIELD_MFIELDNAME:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(Type) arguments.get(2), (TField) arguments.get(3), (MFieldSignature) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (MFieldNameToTField) arguments.get(6),
					(MFieldName) arguments.get(7));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.FIELD_SIGNATURE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TFIELD_TFIELDSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TField) arguments.get(2), (TFieldSignature) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TFIELD_TFIELDSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TField) arguments.get(2), (TFieldSignature) arguments.get(3));
			return null;
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TFIELD_TFIELDSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TField) arguments.get(2), (TFieldSignature) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TYPE_TFIELD_TYPETOTABSTRACTTYPE_MFIELDNAMETOTFIELD_MFIELDNAME_TFIELDSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(Type) arguments.get(2), (TField) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(MFieldNameToTField) arguments.get(5), (MFieldName) arguments.get(6),
					(TFieldSignature) arguments.get(7));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.FIELD_SIGNATURE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_41((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_CC__TABSTRACTTYPE_TYPE_TFIELD_MFIELDSIGNATURE_MFIELDNAME_TFIELDSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TAbstractType) arguments.get(0), (Type) arguments.get(1),
					(TField) arguments.get(2), (MFieldSignature) arguments.get(3), (MFieldName) arguments.get(4),
					(TFieldSignature) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___CHECK_DEC_FWD__TYPE_MFIELDSIGNATURE_MFIELDNAME:
			return checkDEC_FWD((Type) arguments.get(0), (MFieldSignature) arguments.get(1),
					(MFieldName) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___CHECK_DEC_BWD__TABSTRACTTYPE_TFIELD_TFIELDSIGNATURE:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TField) arguments.get(1),
					(TFieldSignature) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MFIELDNAMETOTFIELD:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MFieldNameToTField) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TYPE_TFIELD_TYPETOTABSTRACTTYPE_MFIELDNAMETOTFIELD_MFIELDNAME_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(Type) arguments.get(2), (TField) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(MFieldNameToTField) arguments.get(5), (MFieldName) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.FIELD_SIGNATURE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldSignature_0_1_initialbindings_blackBBBBB(FieldSignature _this,
			Match match, Type mType, MFieldSignature mSignature, MFieldName mFieldName) {
		return new Object[] { _this, match, mType, mSignature, mFieldName };
	}

	public static final Object[] pattern_FieldSignature_0_2_SolveCSP_bindingFBBBBB(FieldSignature _this, Match match,
			Type mType, MFieldSignature mSignature, MFieldName mFieldName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mType, mSignature, mFieldName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mType, mSignature, mFieldName };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(FieldSignature _this,
			Match match, Type mType, MFieldSignature mSignature, MFieldName mFieldName) {
		Object[] result_pattern_FieldSignature_0_2_SolveCSP_binding = pattern_FieldSignature_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mType, mSignature, mFieldName);
		if (result_pattern_FieldSignature_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldSignature_0_2_SolveCSP_black = pattern_FieldSignature_0_2_SolveCSP_blackB(csp);
			if (result_pattern_FieldSignature_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mType, mSignature, mFieldName };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_0_3_CheckCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Type mType, MFieldSignature mSignature, MFieldName mFieldName) {
		return new Object[] { match, mType, mSignature, mFieldName };
	}

	public static final Object[] pattern_FieldSignature_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Type mType, MFieldSignature mSignature, MFieldName mFieldName) {
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
		return new Object[] { match, mType, mSignature, mFieldName, mFieldName__mSignature____mSignatures,
				mSignature__mType____type };
	}

	public static final Object[] pattern_FieldSignature_0_5_collectcontextelements_blackBBBB(Match match, Type mType,
			MFieldSignature mSignature, MFieldName mFieldName) {
		return new Object[] { match, mType, mSignature, mFieldName };
	}

	public static final Object[] pattern_FieldSignature_0_5_collectcontextelements_greenBBB(Match match, Type mType,
			MFieldName mFieldName) {
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mFieldName);
		return new Object[] { match, mType, mFieldName };
	}

	public static final void pattern_FieldSignature_0_6_registerobjectstomatch_expressionBBBBB(FieldSignature _this,
			Match match, Type mType, MFieldSignature mSignature, MFieldName mFieldName) {
		_this.registerObjectsToMatch_FWD(match, mType, mSignature, mFieldName);

	}

	public static final boolean pattern_FieldSignature_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignature_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tField");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_5 = isApplicableMatch.getObject("eFieldDeclarationToTField");
		EObject _localVariable_6 = isApplicableMatch.getObject("mFieldName");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		EObject tmpMSignature = _localVariable_3;
		EObject tmpMTypeToTType = _localVariable_4;
		EObject tmpEFieldDeclarationToTField = _localVariable_5;
		EObject tmpMFieldName = _localVariable_6;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpMType instanceof Type) {
				Type mType = (Type) tmpMType;
				if (tmpTField instanceof TField) {
					TField tField = (TField) tmpTField;
					if (tmpMSignature instanceof MFieldSignature) {
						MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
								MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
								if (tmpMFieldName instanceof MFieldName) {
									MFieldName mFieldName = (MFieldName) tmpMFieldName;
									return new Object[] { tAbstractType, mType, tField, mSignature, mTypeToTType,
											eFieldDeclarationToTField, mFieldName, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_blackBBBBBBBFBB(
			TAbstractType tAbstractType, Type mType, TField tField, MFieldSignature mSignature,
			TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName,
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tAbstractType, mType, tField, mSignature, mTypeToTType, eFieldDeclarationToTField,
						mFieldName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldSignature_1_1_performtransformation_binding = pattern_FieldSignature_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldSignature_1_1_performtransformation_binding != null) {
			TAbstractType tAbstractType = (TAbstractType) result_pattern_FieldSignature_1_1_performtransformation_binding[0];
			Type mType = (Type) result_pattern_FieldSignature_1_1_performtransformation_binding[1];
			TField tField = (TField) result_pattern_FieldSignature_1_1_performtransformation_binding[2];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldSignature_1_1_performtransformation_binding[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_FieldSignature_1_1_performtransformation_binding[4];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result_pattern_FieldSignature_1_1_performtransformation_binding[5];
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignature_1_1_performtransformation_binding[6];

			Object[] result_pattern_FieldSignature_1_1_performtransformation_black = pattern_FieldSignature_1_1_performtransformation_blackBBBBBBBFBB(
					tAbstractType, mType, tField, mSignature, mTypeToTType, eFieldDeclarationToTField, mFieldName,
					_this, isApplicableMatch);
			if (result_pattern_FieldSignature_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldSignature_1_1_performtransformation_black[7];

				return new Object[] { tAbstractType, mType, tField, mSignature, mTypeToTType, eFieldDeclarationToTField,
						mFieldName, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_greenFBBBFFB(
			TAbstractType tAbstractType, TField tField, MFieldSignature mSignature, CSP csp) {
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		mSignatureToTSignature.setSource(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		tField.getSignatures().add(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		tSignature.setType(tAbstractType);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		return new Object[] { mSignatureToTSignature, tAbstractType, tField, mSignature, mFlowElementToTFlowElement,
				tSignature, csp };
	}

	public static final Object[] pattern_FieldSignature_1_2_collecttranslatedelements_blackBBBB(
			MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TFieldSignature tSignature) {
		return new Object[] { mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, tSignature };
	}

	public static final Object[] pattern_FieldSignature_1_2_collecttranslatedelements_greenFBBBB(
			MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TFieldSignature tSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getTranslatedElements().add(mSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedElements().add(tSignature);
		return new Object[] { ruleresult, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, tSignature };
	}

	public static final Object[] pattern_FieldSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignatureToTSignature, EObject tAbstractType, EObject mType,
			EObject tField, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mTypeToTType,
			EObject eFieldDeclarationToTField, EObject mFieldName, EObject tSignature) {
		if (!mSignatureToTSignature.equals(tAbstractType)) {
			if (!mSignatureToTSignature.equals(mType)) {
				if (!mSignatureToTSignature.equals(tField)) {
					if (!mSignatureToTSignature.equals(mTypeToTType)) {
						if (!mSignatureToTSignature.equals(tSignature)) {
							if (!tAbstractType.equals(tField)) {
								if (!tAbstractType.equals(tSignature)) {
									if (!mType.equals(tAbstractType)) {
										if (!mType.equals(tField)) {
											if (!mType.equals(mTypeToTType)) {
												if (!mType.equals(tSignature)) {
													if (!tField.equals(tSignature)) {
														if (!mSignature.equals(mSignatureToTSignature)) {
															if (!mSignature.equals(tAbstractType)) {
																if (!mSignature.equals(mType)) {
																	if (!mSignature.equals(tField)) {
																		if (!mSignature.equals(mTypeToTType)) {
																			if (!mSignature.equals(tSignature)) {
																				if (!mFlowElementToTFlowElement.equals(
																						mSignatureToTSignature)) {
																					if (!mFlowElementToTFlowElement
																							.equals(tAbstractType)) {
																						if (!mFlowElementToTFlowElement
																								.equals(mType)) {
																							if (!mFlowElementToTFlowElement
																									.equals(tField)) {
																								if (!mFlowElementToTFlowElement
																										.equals(mSignature)) {
																									if (!mFlowElementToTFlowElement
																											.equals(mTypeToTType)) {
																										if (!mFlowElementToTFlowElement
																												.equals(tSignature)) {
																											if (!mTypeToTType
																													.equals(tAbstractType)) {
																												if (!mTypeToTType
																														.equals(tField)) {
																													if (!mTypeToTType
																															.equals(tSignature)) {
																														if (!eFieldDeclarationToTField
																																.equals(mSignatureToTSignature)) {
																															if (!eFieldDeclarationToTField
																																	.equals(tAbstractType)) {
																																if (!eFieldDeclarationToTField
																																		.equals(mType)) {
																																	if (!eFieldDeclarationToTField
																																			.equals(tField)) {
																																		if (!eFieldDeclarationToTField
																																				.equals(mSignature)) {
																																			if (!eFieldDeclarationToTField
																																					.equals(mFlowElementToTFlowElement)) {
																																				if (!eFieldDeclarationToTField
																																						.equals(mTypeToTType)) {
																																					if (!eFieldDeclarationToTField
																																							.equals(mFieldName)) {
																																						if (!eFieldDeclarationToTField
																																								.equals(tSignature)) {
																																							if (!mFieldName
																																									.equals(mSignatureToTSignature)) {
																																								if (!mFieldName
																																										.equals(tAbstractType)) {
																																									if (!mFieldName
																																											.equals(mType)) {
																																										if (!mFieldName
																																												.equals(tField)) {
																																											if (!mFieldName
																																													.equals(mSignature)) {
																																												if (!mFieldName
																																														.equals(mFlowElementToTFlowElement)) {
																																													if (!mFieldName
																																															.equals(mTypeToTType)) {
																																														if (!mFieldName
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mSignatureToTSignature,
																																																	tAbstractType,
																																																	mType,
																																																	tField,
																																																	mSignature,
																																																	mFlowElementToTFlowElement,
																																																	mTypeToTType,
																																																	eFieldDeclarationToTField,
																																																	mFieldName,
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

	public static final Object[] pattern_FieldSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mSignatureToTSignature, EObject tAbstractType, EObject mType,
			EObject tField, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mFieldName,
			EObject tSignature) {
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldSignature";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mType____type_name_prime = "type";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String tSignature__tAbstractType____type_name_prime = "type";
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		ruleresult.getCreatedEdges().add(tSignature__tField____field);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mFieldName__mSignature____mSignatures);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mSignature__mType____type);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		tSignature__tAbstractType____type.setSrc(tSignature);
		tSignature__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tSignature__tAbstractType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		tSignature__tAbstractType____type.setName(tSignature__tAbstractType____type_name_prime);
		return new Object[] { ruleresult, mSignatureToTSignature, tAbstractType, mType, tField, mSignature,
				mFlowElementToTFlowElement, mFieldName, tSignature, mSignatureToTSignature__mSignature____source,
				tField__tSignature____signatures, tSignature__tField____field,
				mFlowElementToTFlowElement__mSignature____source, mFieldName__mSignature____mSignatures,
				mSignature__mType____type, mSignatureToTSignature__tSignature____target,
				mFlowElementToTFlowElement__tSignature____target, tSignature__tAbstractType____type };
	}

	public static final void pattern_FieldSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(FieldSignature _this,
			PerformRuleResult ruleresult, EObject mSignatureToTSignature, EObject tAbstractType, EObject mType,
			EObject tField, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mTypeToTType,
			EObject eFieldDeclarationToTField, EObject mFieldName, EObject tSignature) {
		_this.registerObjects_FWD(ruleresult, mSignatureToTSignature, tAbstractType, mType, tField, mSignature,
				mFlowElementToTFlowElement, mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature);

	}

	public static final PerformRuleResult pattern_FieldSignature_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_2_1_preparereturnvalue_bindingFB(FieldSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldSignature _this) {
		Object[] result_pattern_FieldSignature_2_1_preparereturnvalue_binding = pattern_FieldSignature_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignature_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldSignature_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignature_2_1_preparereturnvalue_black = pattern_FieldSignature_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldSignature_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldSignature_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldSignature_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mType");
		EObject _localVariable_1 = match.getObject("mSignature");
		EObject _localVariable_2 = match.getObject("mFieldName");
		EObject tmpMType = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		EObject tmpMFieldName = _localVariable_2;
		if (tmpMType instanceof Type) {
			Type mType = (Type) tmpMType;
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				if (tmpMFieldName instanceof MFieldName) {
					MFieldName mFieldName = (MFieldName) tmpMFieldName;
					return new Object[] { mType, mSignature, mFieldName, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_2_2_corematch_blackFBFBFFBB(Type mType,
			MFieldSignature mSignature, MFieldName mFieldName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
			TAbstractType tAbstractType = mTypeToTType.getTarget();
			if (tAbstractType != null) {
				for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mFieldName, MFieldNameToTField.class, "source")) {
					TField tField = eFieldDeclarationToTField.getTarget();
					if (tField != null) {
						_result.add(new Object[] { tAbstractType, mType, tField, mSignature, mTypeToTType,
								eFieldDeclarationToTField, mFieldName, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_2_3_findcontext_blackBBBBBBB(
			TAbstractType tAbstractType, Type mType, TField tField, MFieldSignature mSignature,
			TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mTypeToTType.getSource())) {
			if (tField.equals(eFieldDeclarationToTField.getTarget())) {
				if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
					if (mFieldName.getMSignatures().contains(mSignature)) {
						if (mType.equals(mSignature.getType())) {
							if (tAbstractType.equals(mTypeToTType.getTarget())) {
								_result.add(new Object[] { tAbstractType, mType, tField, mSignature, mTypeToTType,
										eFieldDeclarationToTField, mFieldName });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(TAbstractType tAbstractType,
			Type mType, TField tField, MFieldSignature mSignature, TypeToTAbstractType mTypeToTType,
			MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTType__mType____source_name_prime = "source";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mType____type_name_prime = "type";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField);
		isApplicableMatch.getAllContextElements().add(mFieldName);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__tField____target);
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__mFieldName____source);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mFieldName__mSignature____mSignatures);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mSignature__mType____type);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		return new Object[] { tAbstractType, mType, tField, mSignature, mTypeToTType, eFieldDeclarationToTField,
				mFieldName, isApplicableMatch, mTypeToTType__mType____source,
				eFieldDeclarationToTField__tField____target, eFieldDeclarationToTField__mFieldName____source,
				mFieldName__mSignature____mSignatures, mSignature__mType____type,
				mTypeToTType__tAbstractType____target };
	}

	public static final Object[] pattern_FieldSignature_2_4_solveCSP_bindingFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, TAbstractType tAbstractType, Type mType, TField tField,
			MFieldSignature mSignature, TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField,
			MFieldName mFieldName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tAbstractType, mType, tField,
				mSignature, mTypeToTType, eFieldDeclarationToTField, mFieldName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAbstractType, mType, tField, mSignature, mTypeToTType,
					eFieldDeclarationToTField, mFieldName };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, TAbstractType tAbstractType, Type mType, TField tField,
			MFieldSignature mSignature, TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField,
			MFieldName mFieldName) {
		Object[] result_pattern_FieldSignature_2_4_solveCSP_binding = pattern_FieldSignature_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tAbstractType, mType, tField, mSignature, mTypeToTType,
				eFieldDeclarationToTField, mFieldName);
		if (result_pattern_FieldSignature_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldSignature_2_4_solveCSP_black = pattern_FieldSignature_2_4_solveCSP_blackB(csp);
			if (result_pattern_FieldSignature_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAbstractType, mType, tField, mSignature,
						mTypeToTType, eFieldDeclarationToTField, mFieldName };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_2_5_checkCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldSignature_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldSignature_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_10_1_initialbindings_blackBBBBB(FieldSignature _this,
			Match match, TAbstractType tAbstractType, TField tField, TFieldSignature tSignature) {
		return new Object[] { _this, match, tAbstractType, tField, tSignature };
	}

	public static final Object[] pattern_FieldSignature_10_2_SolveCSP_bindingFBBBBB(FieldSignature _this, Match match,
			TAbstractType tAbstractType, TField tField, TFieldSignature tSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAbstractType, tField, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAbstractType, tField, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(FieldSignature _this,
			Match match, TAbstractType tAbstractType, TField tField, TFieldSignature tSignature) {
		Object[] result_pattern_FieldSignature_10_2_SolveCSP_binding = pattern_FieldSignature_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAbstractType, tField, tSignature);
		if (result_pattern_FieldSignature_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldSignature_10_2_SolveCSP_black = pattern_FieldSignature_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldSignature_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAbstractType, tField, tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_10_3_CheckCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TAbstractType tAbstractType, TField tField, TFieldSignature tSignature) {
		return new Object[] { match, tAbstractType, tField, tSignature };
	}

	public static final Object[] pattern_FieldSignature_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			TAbstractType tAbstractType, TField tField, TFieldSignature tSignature) {
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String tSignature__tAbstractType____type_name_prime = "type";
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		match.getToBeTranslatedEdges().add(tSignature__tField____field);
		tSignature__tAbstractType____type.setSrc(tSignature);
		tSignature__tAbstractType____type.setTrg(tAbstractType);
		match.getToBeTranslatedEdges().add(tSignature__tAbstractType____type);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		tSignature__tAbstractType____type.setName(tSignature__tAbstractType____type_name_prime);
		return new Object[] { match, tAbstractType, tField, tSignature, tField__tSignature____signatures,
				tSignature__tField____field, tSignature__tAbstractType____type };
	}

	public static final Object[] pattern_FieldSignature_10_5_collectcontextelements_blackBBBB(Match match,
			TAbstractType tAbstractType, TField tField, TFieldSignature tSignature) {
		return new Object[] { match, tAbstractType, tField, tSignature };
	}

	public static final Object[] pattern_FieldSignature_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tAbstractType, TField tField) {
		match.getContextNodes().add(tAbstractType);
		match.getContextNodes().add(tField);
		return new Object[] { match, tAbstractType, tField };
	}

	public static final void pattern_FieldSignature_10_6_registerobjectstomatch_expressionBBBBB(FieldSignature _this,
			Match match, TAbstractType tAbstractType, TField tField, TFieldSignature tSignature) {
		_this.registerObjectsToMatch_BWD(match, tAbstractType, tField, tSignature);

	}

	public static final boolean pattern_FieldSignature_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignature_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tField");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("eFieldDeclarationToTField");
		EObject _localVariable_5 = isApplicableMatch.getObject("mFieldName");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSignature");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpEFieldDeclarationToTField = _localVariable_4;
		EObject tmpMFieldName = _localVariable_5;
		EObject tmpTSignature = _localVariable_6;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpMType instanceof Type) {
				Type mType = (Type) tmpMType;
				if (tmpTField instanceof TField) {
					TField tField = (TField) tmpTField;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
							MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
							if (tmpMFieldName instanceof MFieldName) {
								MFieldName mFieldName = (MFieldName) tmpMFieldName;
								if (tmpTSignature instanceof TFieldSignature) {
									TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
									return new Object[] { tAbstractType, mType, tField, mTypeToTType,
											eFieldDeclarationToTField, mFieldName, tSignature, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_blackBBBBBBBFBB(
			TAbstractType tAbstractType, Type mType, TField tField, TypeToTAbstractType mTypeToTType,
			MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName, TFieldSignature tSignature,
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName,
						tSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldSignature_11_1_performtransformation_binding = pattern_FieldSignature_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldSignature_11_1_performtransformation_binding != null) {
			TAbstractType tAbstractType = (TAbstractType) result_pattern_FieldSignature_11_1_performtransformation_binding[0];
			Type mType = (Type) result_pattern_FieldSignature_11_1_performtransformation_binding[1];
			TField tField = (TField) result_pattern_FieldSignature_11_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_FieldSignature_11_1_performtransformation_binding[3];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result_pattern_FieldSignature_11_1_performtransformation_binding[4];
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignature_11_1_performtransformation_binding[5];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_FieldSignature_11_1_performtransformation_binding[6];

			Object[] result_pattern_FieldSignature_11_1_performtransformation_black = pattern_FieldSignature_11_1_performtransformation_blackBBBBBBBFBB(
					tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature,
					_this, isApplicableMatch);
			if (result_pattern_FieldSignature_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldSignature_11_1_performtransformation_black[7];

				return new Object[] { tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName,
						tSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_greenFBFFBB(Type mType,
			MFieldName mFieldName, TFieldSignature tSignature) {
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MFieldSignature mSignature = ModiscoFactory.eINSTANCE.createMFieldSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		mFieldName.getMSignatures().add(mSignature);
		mSignature.setType(mType);
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		return new Object[] { mSignatureToTSignature, mType, mSignature, mFlowElementToTFlowElement, mFieldName,
				tSignature };
	}

	public static final Object[] pattern_FieldSignature_11_2_collecttranslatedelements_blackBBBB(
			MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TFieldSignature tSignature) {
		return new Object[] { mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, tSignature };
	}

	public static final Object[] pattern_FieldSignature_11_2_collecttranslatedelements_greenFBBBB(
			MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TFieldSignature tSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getCreatedElements().add(mSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getTranslatedElements().add(tSignature);
		return new Object[] { ruleresult, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, tSignature };
	}

	public static final Object[] pattern_FieldSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignatureToTSignature, EObject tAbstractType, EObject mType,
			EObject tField, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mTypeToTType,
			EObject eFieldDeclarationToTField, EObject mFieldName, EObject tSignature) {
		if (!mSignatureToTSignature.equals(tAbstractType)) {
			if (!mSignatureToTSignature.equals(mType)) {
				if (!mSignatureToTSignature.equals(tField)) {
					if (!mSignatureToTSignature.equals(mTypeToTType)) {
						if (!mSignatureToTSignature.equals(tSignature)) {
							if (!tAbstractType.equals(tField)) {
								if (!tAbstractType.equals(tSignature)) {
									if (!mType.equals(tAbstractType)) {
										if (!mType.equals(tField)) {
											if (!mType.equals(mTypeToTType)) {
												if (!mType.equals(tSignature)) {
													if (!tField.equals(tSignature)) {
														if (!mSignature.equals(mSignatureToTSignature)) {
															if (!mSignature.equals(tAbstractType)) {
																if (!mSignature.equals(mType)) {
																	if (!mSignature.equals(tField)) {
																		if (!mSignature.equals(mTypeToTType)) {
																			if (!mSignature.equals(tSignature)) {
																				if (!mFlowElementToTFlowElement.equals(
																						mSignatureToTSignature)) {
																					if (!mFlowElementToTFlowElement
																							.equals(tAbstractType)) {
																						if (!mFlowElementToTFlowElement
																								.equals(mType)) {
																							if (!mFlowElementToTFlowElement
																									.equals(tField)) {
																								if (!mFlowElementToTFlowElement
																										.equals(mSignature)) {
																									if (!mFlowElementToTFlowElement
																											.equals(mTypeToTType)) {
																										if (!mFlowElementToTFlowElement
																												.equals(tSignature)) {
																											if (!mTypeToTType
																													.equals(tAbstractType)) {
																												if (!mTypeToTType
																														.equals(tField)) {
																													if (!mTypeToTType
																															.equals(tSignature)) {
																														if (!eFieldDeclarationToTField
																																.equals(mSignatureToTSignature)) {
																															if (!eFieldDeclarationToTField
																																	.equals(tAbstractType)) {
																																if (!eFieldDeclarationToTField
																																		.equals(mType)) {
																																	if (!eFieldDeclarationToTField
																																			.equals(tField)) {
																																		if (!eFieldDeclarationToTField
																																				.equals(mSignature)) {
																																			if (!eFieldDeclarationToTField
																																					.equals(mFlowElementToTFlowElement)) {
																																				if (!eFieldDeclarationToTField
																																						.equals(mTypeToTType)) {
																																					if (!eFieldDeclarationToTField
																																							.equals(mFieldName)) {
																																						if (!eFieldDeclarationToTField
																																								.equals(tSignature)) {
																																							if (!mFieldName
																																									.equals(mSignatureToTSignature)) {
																																								if (!mFieldName
																																										.equals(tAbstractType)) {
																																									if (!mFieldName
																																											.equals(mType)) {
																																										if (!mFieldName
																																												.equals(tField)) {
																																											if (!mFieldName
																																													.equals(mSignature)) {
																																												if (!mFieldName
																																														.equals(mFlowElementToTFlowElement)) {
																																													if (!mFieldName
																																															.equals(mTypeToTType)) {
																																														if (!mFieldName
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mSignatureToTSignature,
																																																	tAbstractType,
																																																	mType,
																																																	tField,
																																																	mSignature,
																																																	mFlowElementToTFlowElement,
																																																	mTypeToTType,
																																																	eFieldDeclarationToTField,
																																																	mFieldName,
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

	public static final Object[] pattern_FieldSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mSignatureToTSignature, EObject tAbstractType, EObject mType,
			EObject tField, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mFieldName,
			EObject tSignature) {
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldSignature";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mType____type_name_prime = "type";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String tSignature__tAbstractType____type_name_prime = "type";
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		ruleresult.getTranslatedEdges().add(tSignature__tField____field);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFieldName__mSignature____mSignatures);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mSignature__mType____type);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		tSignature__tAbstractType____type.setSrc(tSignature);
		tSignature__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tSignature__tAbstractType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		tSignature__tAbstractType____type.setName(tSignature__tAbstractType____type_name_prime);
		return new Object[] { ruleresult, mSignatureToTSignature, tAbstractType, mType, tField, mSignature,
				mFlowElementToTFlowElement, mFieldName, tSignature, mSignatureToTSignature__mSignature____source,
				tField__tSignature____signatures, tSignature__tField____field,
				mFlowElementToTFlowElement__mSignature____source, mFieldName__mSignature____mSignatures,
				mSignature__mType____type, mSignatureToTSignature__tSignature____target,
				mFlowElementToTFlowElement__tSignature____target, tSignature__tAbstractType____type };
	}

	public static final void pattern_FieldSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(FieldSignature _this,
			PerformRuleResult ruleresult, EObject mSignatureToTSignature, EObject tAbstractType, EObject mType,
			EObject tField, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mTypeToTType,
			EObject eFieldDeclarationToTField, EObject mFieldName, EObject tSignature) {
		_this.registerObjects_BWD(ruleresult, mSignatureToTSignature, tAbstractType, mType, tField, mSignature,
				mFlowElementToTFlowElement, mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature);

	}

	public static final PerformRuleResult pattern_FieldSignature_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_12_1_preparereturnvalue_bindingFB(FieldSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldSignature _this) {
		Object[] result_pattern_FieldSignature_12_1_preparereturnvalue_binding = pattern_FieldSignature_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignature_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldSignature_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignature_12_1_preparereturnvalue_black = pattern_FieldSignature_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldSignature_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldSignature_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldSignature_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAbstractType");
		EObject _localVariable_1 = match.getObject("tField");
		EObject _localVariable_2 = match.getObject("tSignature");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpTField = _localVariable_1;
		EObject tmpTSignature = _localVariable_2;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (tmpTSignature instanceof TFieldSignature) {
					TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
					return new Object[] { tAbstractType, tField, tSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_12_2_corematch_blackBFBFFFBB(
			TAbstractType tAbstractType, TField tField, TFieldSignature tSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tSignature_lowerBound = tSignature.getLowerBound();
		if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
			for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tField, MFieldNameToTField.class, "target")) {
				MFieldName mFieldName = eFieldDeclarationToTField.getSource();
				if (mFieldName != null) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
						Type mType = mTypeToTType.getSource();
						if (mType != null) {
							_result.add(new Object[] { tAbstractType, mType, tField, mTypeToTType,
									eFieldDeclarationToTField, mFieldName, tSignature, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_12_3_findcontext_blackBBBBBBB(
			TAbstractType tAbstractType, Type mType, TField tField, TypeToTAbstractType mTypeToTType,
			MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName, TFieldSignature tSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mTypeToTType.getSource())) {
			if (tField.getSignatures().contains(tSignature)) {
				if (tField.equals(eFieldDeclarationToTField.getTarget())) {
					if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
						if (tAbstractType.equals(mTypeToTType.getTarget())) {
							if (tAbstractType.equals(tSignature.getType())) {
								int tSignature_lowerBound = tSignature.getLowerBound();
								if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
									_result.add(new Object[] { tAbstractType, mType, tField, mTypeToTType,
											eFieldDeclarationToTField, mFieldName, tSignature });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldSignature_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			TAbstractType tAbstractType, Type mType, TField tField, TypeToTAbstractType mTypeToTType,
			MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName, TFieldSignature tSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTType__mType____source_name_prime = "source";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String tSignature__tAbstractType____type_name_prime = "type";
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField);
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(tSignature);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(tSignature__tField____field);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__tField____target);
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__mFieldName____source);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		tSignature__tAbstractType____type.setSrc(tSignature);
		tSignature__tAbstractType____type.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tSignature__tAbstractType____type);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		tSignature__tAbstractType____type.setName(tSignature__tAbstractType____type_name_prime);
		return new Object[] { tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName,
				tSignature, isApplicableMatch, mTypeToTType__mType____source, tField__tSignature____signatures,
				tSignature__tField____field, eFieldDeclarationToTField__tField____target,
				eFieldDeclarationToTField__mFieldName____source, mTypeToTType__tAbstractType____target,
				tSignature__tAbstractType____type };
	}

	public static final Object[] pattern_FieldSignature_12_4_solveCSP_bindingFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, TAbstractType tAbstractType, Type mType, TField tField,
			TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName,
			TFieldSignature tSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAbstractType, mType, tField,
				mTypeToTType, eFieldDeclarationToTField, mFieldName, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAbstractType, mType, tField, mTypeToTType,
					eFieldDeclarationToTField, mFieldName, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, TAbstractType tAbstractType, Type mType, TField tField,
			TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName,
			TFieldSignature tSignature) {
		Object[] result_pattern_FieldSignature_12_4_solveCSP_binding = pattern_FieldSignature_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField,
				mFieldName, tSignature);
		if (result_pattern_FieldSignature_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldSignature_12_4_solveCSP_black = pattern_FieldSignature_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldSignature_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAbstractType, mType, tField, mTypeToTType,
						eFieldDeclarationToTField, mFieldName, tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_12_5_checkCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldSignature_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldSignature_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_20_1_preparereturnvalue_bindingFB(FieldSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldSignature _this) {
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

	public static final Object[] pattern_FieldSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldSignature _this) {
		Object[] result_pattern_FieldSignature_20_1_preparereturnvalue_binding = pattern_FieldSignature_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignature_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldSignature_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignature_20_1_preparereturnvalue_black = pattern_FieldSignature_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldSignature_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldSignature_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldSignature_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldSignature_20_2_testcorematchandDECs_black_nac_0BB(
			TFieldSignature tSignature, TField tField) {
		TField __DEC_tSignature_field_221685 = tSignature.getField();
		if (__DEC_tSignature_field_221685 != null) {
			if (!tField.equals(__DEC_tSignature_field_221685)) {
				return new Object[] { tSignature, tField };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_signatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTField = _edge_signatures.getSrc();
		if (tmpTField instanceof TField) {
			TField tField = (TField) tmpTField;
			EObject tmpTSignature = _edge_signatures.getTrg();
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tField.getSignatures().contains(tSignature)) {
					TAbstractType tAbstractType = tSignature.getType();
					if (tAbstractType != null) {
						int tSignature_lowerBound = tSignature.getLowerBound();
						if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
							if (pattern_FieldSignature_20_2_testcorematchandDECs_black_nac_0BB(tSignature,
									tField) == null) {
								_result.add(new Object[] { tAbstractType, tField, tSignature, _edge_signatures });
							}
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldSignature_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			FieldSignature _this, Match match, TAbstractType tAbstractType, TField tField, TFieldSignature tSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAbstractType, tField, tSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldSignature_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_21_1_preparereturnvalue_bindingFB(FieldSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldSignature _this) {
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

	public static final Object[] pattern_FieldSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldSignature _this) {
		Object[] result_pattern_FieldSignature_21_1_preparereturnvalue_binding = pattern_FieldSignature_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldSignature_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldSignature_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldSignature_21_1_preparereturnvalue_black = pattern_FieldSignature_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldSignature_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldSignature_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldSignature_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldSignature_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mSignatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMFieldName = _edge_mSignatures.getSrc();
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			EObject tmpMSignature = _edge_mSignatures.getTrg();
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				if (mFieldName.getMSignatures().contains(mSignature)) {
					Type mType = mSignature.getType();
					if (mType != null) {
						_result.add(new Object[] { mType, mSignature, mFieldName, _edge_mSignatures });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldSignature_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			FieldSignature _this, Match match, Type mType, MFieldSignature mSignature, MFieldName mFieldName) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mType, mSignature, mFieldName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldSignature_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_24_1_prepare_blackB(FieldSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldSignature_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_1 = sourceMatch.getObject("mType");
		EObject _localVariable_2 = targetMatch.getObject("tField");
		EObject _localVariable_3 = sourceMatch.getObject("mSignature");
		EObject _localVariable_4 = sourceMatch.getObject("mFieldName");
		EObject _localVariable_5 = targetMatch.getObject("tSignature");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		EObject tmpMSignature = _localVariable_3;
		EObject tmpMFieldName = _localVariable_4;
		EObject tmpTSignature = _localVariable_5;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpMType instanceof Type) {
				Type mType = (Type) tmpMType;
				if (tmpTField instanceof TField) {
					TField tField = (TField) tmpTField;
					if (tmpMSignature instanceof MFieldSignature) {
						MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
						if (tmpMFieldName instanceof MFieldName) {
							MFieldName mFieldName = (MFieldName) tmpMFieldName;
							if (tmpTSignature instanceof TFieldSignature) {
								TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
								return new Object[] { tAbstractType, mType, tField, mSignature, mFieldName, tSignature,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(
			TAbstractType tAbstractType, Type mType, TField tField, MFieldSignature mSignature, MFieldName mFieldName,
			TFieldSignature tSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				return new Object[] { tAbstractType, mType, tField, mSignature, mFieldName, tSignature, sourceMatch,
						targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding = pattern_FieldSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding != null) {
			TAbstractType tAbstractType = (TAbstractType) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[0];
			Type mType = (Type) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[1];
			TField tField = (TField) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[2];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[3];
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[4];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_FieldSignature_24_2_matchsrctrgcontext_black = pattern_FieldSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tAbstractType, mType, tField, mSignature, mFieldName, tSignature, sourceMatch, targetMatch);
			if (result_pattern_FieldSignature_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tAbstractType, mType, tField, mSignature, mFieldName, tSignature, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_3_solvecsp_bindingFBBBBBBBBB(FieldSignature _this,
			TAbstractType tAbstractType, Type mType, TField tField, MFieldSignature mSignature, MFieldName mFieldName,
			TFieldSignature tSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tAbstractType, mType, tField, mSignature, mFieldName,
				tSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tAbstractType, mType, tField, mSignature, mFieldName, tSignature,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(FieldSignature _this,
			TAbstractType tAbstractType, Type mType, TField tField, MFieldSignature mSignature, MFieldName mFieldName,
			TFieldSignature tSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldSignature_24_3_solvecsp_binding = pattern_FieldSignature_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tAbstractType, mType, tField, mSignature, mFieldName, tSignature, sourceMatch, targetMatch);
		if (result_pattern_FieldSignature_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldSignature_24_3_solvecsp_black = pattern_FieldSignature_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldSignature_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tAbstractType, mType, tField, mSignature, mFieldName, tSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_24_5_matchcorrcontext_blackBBBFFBBB(
			TAbstractType tAbstractType, Type mType, TField tField, MFieldName mFieldName, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
				if (tAbstractType.equals(mTypeToTType.getTarget())) {
					for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tField, MFieldNameToTField.class, "target")) {
						if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
							_result.add(new Object[] { tAbstractType, mType, tField, mTypeToTType,
									eFieldDeclarationToTField, mFieldName, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldSignature_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldSignature";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(eFieldDeclarationToTField);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, eFieldDeclarationToTField, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldSignature_24_6_createcorrespondence_blackBBBBBBB(
			TAbstractType tAbstractType, Type mType, TField tField, MFieldSignature mSignature, MFieldName mFieldName,
			TFieldSignature tSignature, CCMatch ccMatch) {
		return new Object[] { tAbstractType, mType, tField, mSignature, mFieldName, tSignature, ccMatch };
	}

	public static final Object[] pattern_FieldSignature_24_6_createcorrespondence_greenFBFBB(MFieldSignature mSignature,
			TFieldSignature tSignature, CCMatch ccMatch) {
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mSignatureToTSignature.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		ccMatch.getCreateCorr().add(mSignatureToTSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		return new Object[] { mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, tSignature, ccMatch };
	}

	public static final Object[] pattern_FieldSignature_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldSignature_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldSignature";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldSignature_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldSignature_27_1_matchtggpattern_blackBBB(Type mType,
			MFieldSignature mSignature, MFieldName mFieldName) {
		if (mFieldName.getMSignatures().contains(mSignature)) {
			if (mType.equals(mSignature.getType())) {
				return new Object[] { mType, mSignature, mFieldName };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignature_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_28_1_matchtggpattern_black_nac_0BB(TFieldSignature tSignature,
			TField tField) {
		TField __DEC_tSignature_field_945465 = tSignature.getField();
		if (__DEC_tSignature_field_945465 != null) {
			if (!tField.equals(__DEC_tSignature_field_945465)) {
				return new Object[] { tSignature, tField };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldSignature_28_1_matchtggpattern_blackBBB(TAbstractType tAbstractType,
			TField tField, TFieldSignature tSignature) {
		if (tField.getSignatures().contains(tSignature)) {
			if (tAbstractType.equals(tSignature.getType())) {
				if (pattern_FieldSignature_28_1_matchtggpattern_black_nac_0BB(tSignature, tField) == null) {
					return new Object[] { tAbstractType, tField, tSignature };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_28_1_matchtggpattern_greenB(TFieldSignature tSignature) {
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		return new Object[] { tSignature };
	}

	public static final boolean pattern_FieldSignature_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldSignature_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_29_1_createresult_blackB(FieldSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldSignature_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TField tField) {
		if (ruleResult.getTargetObjects().contains(tField)) {
			return new Object[] { ruleResult, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MFieldNameToTField eFieldDeclarationToTField) {
		if (ruleResult.getCorrObjects().contains(eFieldDeclarationToTField)) {
			return new Object[] { ruleResult, eFieldDeclarationToTField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MFieldName mFieldName) {
		if (ruleResult.getSourceObjects().contains(mFieldName)) {
			return new Object[] { ruleResult, mFieldName };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eFieldDeclarationToTFieldList : ruleEntryContainer.getRuleEntryList()) {
				if (!eFieldDeclarationToTFieldList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							TAbstractType tAbstractType = mTypeToTType.getTarget();
							if (tAbstractType != null) {
								Type mType = mTypeToTType.getSource();
								if (mType != null) {
									if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mTypeToTType) == null) {
										if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												tAbstractType) == null) {
											if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													mType) == null) {
												for (EObject tmpEFieldDeclarationToTField : eFieldDeclarationToTFieldList
														.getEntryObjects()) {
													if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
														MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
														TField tField = eFieldDeclarationToTField.getTarget();
														if (tField != null) {
															MFieldName mFieldName = eFieldDeclarationToTField
																	.getSource();
															if (mFieldName != null) {
																if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult,
																		eFieldDeclarationToTField) == null) {
																	if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tField) == null) {
																		if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mFieldName) == null) {
																			_result.add(new Object[] { mTypeToTTypeList,
																					tAbstractType, mTypeToTType, mType,
																					eFieldDeclarationToTFieldList,
																					tField, eFieldDeclarationToTField,
																					mFieldName, ruleEntryContainer,
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

	public static final Object[] pattern_FieldSignature_29_3_solveCSP_bindingFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, TAbstractType tAbstractType, Type mType, TField tField,
			TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tAbstractType, mType, tField,
				mTypeToTType, eFieldDeclarationToTField, mFieldName, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAbstractType, mType, tField, mTypeToTType,
					eFieldDeclarationToTField, mFieldName, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, TAbstractType tAbstractType, Type mType, TField tField,
			TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldSignature_29_3_solveCSP_binding = pattern_FieldSignature_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField,
				mFieldName, ruleResult);
		if (result_pattern_FieldSignature_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldSignature_29_3_solveCSP_black = pattern_FieldSignature_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldSignature_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAbstractType, mType, tField, mTypeToTType,
						eFieldDeclarationToTField, mFieldName, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_29_4_checkCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_29_5_checknacs_blackBBBBBB(TAbstractType tAbstractType,
			Type mType, TField tField, TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField,
			MFieldName mFieldName) {
		return new Object[] { tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName };
	}

	public static final Object[] pattern_FieldSignature_29_6_perform_blackBBBBBBB(TAbstractType tAbstractType,
			Type mType, TField tField, TypeToTAbstractType mTypeToTType, MFieldNameToTField eFieldDeclarationToTField,
			MFieldName mFieldName, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tAbstractType, mType, tField, mTypeToTType, eFieldDeclarationToTField, mFieldName,
				ruleResult };
	}

	public static final Object[] pattern_FieldSignature_29_6_perform_greenFBBBFFBFBB(TAbstractType tAbstractType,
			Type mType, TField tField, MFieldName mFieldName, ModelgeneratorRuleResult ruleResult, CSP csp) {
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MFieldSignature mSignature = ModiscoFactory.eINSTANCE.createMFieldSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mSignatureToTSignature);
		mSignatureToTSignature.setSource(mSignature);
		mFieldName.getMSignatures().add(mSignature);
		mSignature.setType(mType);
		ruleResult.getSourceObjects().add(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		tField.getSignatures().add(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		tSignature.setType(tAbstractType);
		ruleResult.getTargetObjects().add(tSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mSignatureToTSignature, tAbstractType, mType, tField, mSignature,
				mFlowElementToTFlowElement, mFieldName, tSignature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_FieldSignature_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldSignatureImpl
