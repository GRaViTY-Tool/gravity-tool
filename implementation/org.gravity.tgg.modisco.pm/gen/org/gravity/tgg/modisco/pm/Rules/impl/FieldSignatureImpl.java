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
	public boolean isAppropriate_FWD(Match match, MFieldName mFieldName, MFieldSignature mSignature, Type mType) {

		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_0_1_initialbindings_blackBBBBB(this, match,
				mFieldName, mSignature, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mFieldName, mSignature, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldSignatureImpl.pattern_FieldSignature_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldSignatureImpl
					.pattern_FieldSignature_0_4_collectelementstobetranslated_blackBBBB(match, mFieldName, mSignature,
							mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mFieldName] = " + mFieldName + ", " + "[mSignature] = " + mSignature + ", " + "[mType] = "
						+ mType + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_0_4_collectelementstobetranslated_greenBBBBFF(match, mFieldName,
					mSignature, mType);
			//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = FieldSignatureImpl
					.pattern_FieldSignature_0_5_collectcontextelements_blackBBBB(match, mFieldName, mSignature, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mFieldName] = " + mFieldName + ", " + "[mSignature] = " + mSignature + ", " + "[mType] = "
						+ mType + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_0_5_collectcontextelements_greenBBB(match, mFieldName, mType);

			// 
			FieldSignatureImpl.pattern_FieldSignature_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					mFieldName, mSignature, mType);
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
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[0];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[1];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		TField tField = (TField) result1_bindingAndBlack[3];
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = FieldSignatureImpl
				.pattern_FieldSignature_1_1_performtransformation_greenFBBFBFB(tAbstractType, tField, mSignature, csp);
		TFieldSignature tSignature = (TFieldSignature) result1_green[0];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[3];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[5];

		Object[] result2_black = FieldSignatureImpl.pattern_FieldSignature_1_2_collecttranslatedelements_blackBBBB(
				tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		Object[] result2_green = FieldSignatureImpl.pattern_FieldSignature_1_2_collecttranslatedelements_greenFBBBB(
				tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldSignatureImpl.pattern_FieldSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mSignatureToTSignature,
				mSignature, mFlowElementToTFlowElement, mType, eFieldDeclarationToTField);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mFieldName] = " + mFieldName + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tField] = " + tField + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
					+ "[mSignature] = " + mSignature + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mType] = " + mType + ", " + "[eFieldDeclarationToTField] = "
					+ eFieldDeclarationToTField + ".");
		}
		FieldSignatureImpl.pattern_FieldSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
				mFieldName, tSignature, tAbstractType, tField, mSignatureToTSignature, mSignature,
				mFlowElementToTFlowElement, mType);
		//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSignature__tAbstractType____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result3_green[17];

		// 
		// 
		FieldSignatureImpl.pattern_FieldSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mSignatureToTSignature, mSignature,
				mFlowElementToTFlowElement, mType, eFieldDeclarationToTField);
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
		MFieldName mFieldName = (MFieldName) result2_binding[0];
		MFieldSignature mSignature = (MFieldSignature) result2_binding[1];
		Type mType = (Type) result2_binding[2];
		for (Object[] result2_black : FieldSignatureImpl.pattern_FieldSignature_2_2_corematch_blackBFFFBBFB(mFieldName,
				mSignature, mType, match)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			TField tField = (TField) result2_black[3];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[6];
			// ForEach 
			for (Object[] result3_black : FieldSignatureImpl.pattern_FieldSignature_2_3_findcontext_blackBBBBBBB(
					mFieldName, tAbstractType, mTypeToTType, tField, mSignature, mType, eFieldDeclarationToTField)) {
				Object[] result3_green = FieldSignatureImpl.pattern_FieldSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(
						mFieldName, tAbstractType, mTypeToTType, tField, mSignature, mType, eFieldDeclarationToTField);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = FieldSignatureImpl
						.pattern_FieldSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mFieldName, tAbstractType, mTypeToTType, tField, mSignature, mType,
								eFieldDeclarationToTField);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mFieldName] = " + mFieldName
							+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tField] = " + tField + ", " + "[mSignature] = " + mSignature + ", "
							+ "[mType] = " + mType + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField
							+ ".");
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
	public void registerObjectsToMatch_FWD(Match match, MFieldName mFieldName, MFieldSignature mSignature, Type mType) {
		match.registerObject("mFieldName", mFieldName);
		match.registerObject("mSignature", mSignature);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFieldName mFieldName, MFieldSignature mSignature, Type mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MFieldName mFieldName,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField, MFieldSignature mSignature,
			Type mType, MFieldNameToTField eFieldDeclarationToTField) {// Create CSP
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
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mFieldName, EObject tSignature,
			EObject tAbstractType, EObject mTypeToTType, EObject tField, EObject mSignatureToTSignature,
			EObject mSignature, EObject mFlowElementToTFlowElement, EObject mType, EObject eFieldDeclarationToTField) {
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);

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
	public boolean isAppropriate_BWD(Match match, TFieldSignature tSignature, TAbstractType tAbstractType,
			TField tField) {

		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_10_1_initialbindings_blackBBBBB(this, match,
				tSignature, tAbstractType, tField);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[tField] = " + tField + ".");
		}

		Object[] result2_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSignature, tAbstractType,
						tField);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tAbstractType] = "
					+ tAbstractType + ", " + "[tField] = " + tField + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldSignatureImpl.pattern_FieldSignature_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldSignatureImpl
					.pattern_FieldSignature_10_4_collectelementstobetranslated_blackBBBB(match, tSignature,
							tAbstractType, tField);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tField] = " + tField + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_10_4_collectelementstobetranslated_greenBBBBFFF(match, tSignature,
					tAbstractType, tField);
			//nothing EMoflonEdge tSignature__tAbstractType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result4_green[6];

			Object[] result5_black = FieldSignatureImpl.pattern_FieldSignature_10_5_collectcontextelements_blackBBBB(
					match, tSignature, tAbstractType, tField);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tAbstractType] = " + tAbstractType + ", "
						+ "[tField] = " + tField + ".");
			}
			FieldSignatureImpl.pattern_FieldSignature_10_5_collectcontextelements_greenBBB(match, tAbstractType,
					tField);

			// 
			FieldSignatureImpl.pattern_FieldSignature_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tSignature, tAbstractType, tField);
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
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[0];
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TField tField = (TField) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = FieldSignatureImpl
				.pattern_FieldSignature_11_1_performtransformation_greenBBFFFB(mFieldName, tSignature, mType);
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[2];
		MFieldSignature mSignature = (MFieldSignature) result1_green[3];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[4];

		Object[] result2_black = FieldSignatureImpl.pattern_FieldSignature_11_2_collecttranslatedelements_blackBBBB(
				tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		Object[] result2_green = FieldSignatureImpl.pattern_FieldSignature_11_2_collecttranslatedelements_greenFBBBB(
				tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldSignatureImpl.pattern_FieldSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mSignatureToTSignature,
				mSignature, mFlowElementToTFlowElement, mType, eFieldDeclarationToTField);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mFieldName] = " + mFieldName + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tField] = " + tField + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
					+ "[mSignature] = " + mSignature + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mType] = " + mType + ", " + "[eFieldDeclarationToTField] = "
					+ eFieldDeclarationToTField + ".");
		}
		FieldSignatureImpl.pattern_FieldSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult,
				mFieldName, tSignature, tAbstractType, tField, mSignatureToTSignature, mSignature,
				mFlowElementToTFlowElement, mType);
		//nothing EMoflonEdge mFieldName__mSignature____mSignatures = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSignature__tAbstractType____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mSignature__mType____type = (EMoflonEdge) result3_green[17];

		// 
		// 
		FieldSignatureImpl.pattern_FieldSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mSignatureToTSignature, mSignature,
				mFlowElementToTFlowElement, mType, eFieldDeclarationToTField);
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
		TFieldSignature tSignature = (TFieldSignature) result2_binding[0];
		TAbstractType tAbstractType = (TAbstractType) result2_binding[1];
		TField tField = (TField) result2_binding[2];
		for (Object[] result2_black : FieldSignatureImpl.pattern_FieldSignature_12_2_corematch_blackFBBFBFFB(tSignature,
				tAbstractType, tField, match)) {
			MFieldName mFieldName = (MFieldName) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			Type mType = (Type) result2_black[5];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[6];
			// ForEach 
			for (Object[] result3_black : FieldSignatureImpl.pattern_FieldSignature_12_3_findcontext_blackBBBBBBB(
					mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mType, eFieldDeclarationToTField)) {
				Object[] result3_green = FieldSignatureImpl
						.pattern_FieldSignature_12_3_findcontext_greenBBBBBBBFFFFFFFF(mFieldName, tSignature,
								tAbstractType, mTypeToTType, tField, mType, eFieldDeclarationToTField);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tSignature__tAbstractType____type = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tField__tSignature____signatures = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tSignature__tField____field = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = FieldSignatureImpl
						.pattern_FieldSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mType,
								eFieldDeclarationToTField);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mFieldName] = " + mFieldName
							+ ", " + "[tSignature] = " + tSignature + ", " + "[tAbstractType] = " + tAbstractType + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tField] = " + tField + ", " + "[mType] = "
							+ mType + ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TFieldSignature tSignature, TAbstractType tAbstractType,
			TField tField) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("tAbstractType", tAbstractType);
		match.registerObject("tField", tField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TFieldSignature tSignature, TAbstractType tAbstractType,
			TField tField) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFieldName mFieldName,
			TFieldSignature tSignature, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField,
			Type mType, MFieldNameToTField eFieldDeclarationToTField) {// Create CSP
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
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mFieldName, EObject tSignature,
			EObject tAbstractType, EObject mTypeToTType, EObject tField, EObject mSignatureToTSignature,
			EObject mSignature, EObject mFlowElementToTFlowElement, EObject mType, EObject eFieldDeclarationToTField) {
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_87(EMoflonEdge _edge_type) {

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
				.pattern_FieldSignature_20_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			TFieldSignature tSignature = (TFieldSignature) result2_black[0];
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			TField tField = (TField) result2_black[2];
			Object[] result2_green = FieldSignatureImpl
					.pattern_FieldSignature_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldSignatureImpl
					.pattern_FieldSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							tSignature, tAbstractType, tField)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_91(EMoflonEdge _edge_mSignatures) {

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
			MFieldName mFieldName = (MFieldName) result2_black[0];
			MFieldSignature mSignature = (MFieldSignature) result2_black[1];
			Type mType = (Type) result2_black[2];
			Object[] result2_green = FieldSignatureImpl
					.pattern_FieldSignature_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldSignatureImpl
					.pattern_FieldSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							mFieldName, mSignature, mType)) {
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
		MFieldName mFieldName = (MFieldName) result2_bindingAndBlack[0];
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[1];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[2];
		TField tField = (TField) result2_bindingAndBlack[3];
		MFieldSignature mSignature = (MFieldSignature) result2_bindingAndBlack[4];
		Type mType = (Type) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = FieldSignatureImpl
				.pattern_FieldSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mFieldName, tSignature,
						tAbstractType, tField, mSignature, mType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mFieldName] = " + mFieldName + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[tField] = " + tField + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mType] = " + mType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldSignatureImpl.pattern_FieldSignature_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldSignatureImpl.pattern_FieldSignature_24_5_matchcorrcontext_blackBBFBBFBB(
					mFieldName, tAbstractType, tField, mType, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[2];
				MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result5_black[5];
				Object[] result5_green = FieldSignatureImpl.pattern_FieldSignature_24_5_matchcorrcontext_greenBBBBF(
						mTypeToTType, eFieldDeclarationToTField, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = FieldSignatureImpl
						.pattern_FieldSignature_24_6_createcorrespondence_blackBBBBBBB(mFieldName, tSignature,
								tAbstractType, tField, mSignature, mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mFieldName] = "
							+ mFieldName + ", " + "[tSignature] = " + tSignature + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[tField] = " + tField + ", " + "[mSignature] = " + mSignature
							+ ", " + "[mType] = " + mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldSignatureImpl.pattern_FieldSignature_24_6_createcorrespondence_greenBFBFB(tSignature, mSignature,
						ccMatch);
				//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[1];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[3];

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
	public CSP isApplicable_solveCsp_CC(MFieldName mFieldName, TFieldSignature tSignature, TAbstractType tAbstractType,
			TField tField, MFieldSignature mSignature, Type mType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MFieldName mFieldName, MFieldSignature mSignature, Type mType) {// 
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_27_1_matchtggpattern_blackBBB(mFieldName,
				mSignature, mType);
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
	public boolean checkDEC_BWD(TFieldSignature tSignature, TAbstractType tAbstractType, TField tField) {// 
		Object[] result1_black = FieldSignatureImpl.pattern_FieldSignature_28_1_matchtggpattern_blackBBB(tSignature,
				tAbstractType, tField);
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
			MFieldNameToTField eFieldDeclarationToTFieldParameter, TypeToTAbstractType mTypeToTTypeParameter) {

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
			//nothing RuleEntryList eFieldDeclarationToTFieldList = (RuleEntryList) result2_black[0];
			MFieldName mFieldName = (MFieldName) result2_black[1];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result2_black[2];
			TField tField = (TField) result2_black[3];
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[4];
			TAbstractType tAbstractType = (TAbstractType) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			Type mType = (Type) result2_black[7];

			Object[] result3_bindingAndBlack = FieldSignatureImpl
					.pattern_FieldSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mFieldName,
							tAbstractType, mTypeToTType, tField, mType, eFieldDeclarationToTField, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mFieldName] = " + mFieldName + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
						+ "[tField] = " + tField + ", " + "[mType] = " + mType + ", " + "[eFieldDeclarationToTField] = "
						+ eFieldDeclarationToTField + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldSignatureImpl.pattern_FieldSignature_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = FieldSignatureImpl.pattern_FieldSignature_29_5_checknacs_blackBBBBBB(
						mFieldName, tAbstractType, mTypeToTType, tField, mType, eFieldDeclarationToTField);
				if (result5_black != null) {

					Object[] result6_black = FieldSignatureImpl.pattern_FieldSignature_29_6_perform_blackBBBBBBB(
							mFieldName, tAbstractType, mTypeToTType, tField, mType, eFieldDeclarationToTField,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mFieldName] = "
								+ mFieldName + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tField] = " + tField + ", " + "[mType] = " + mType + ", "
								+ "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					FieldSignatureImpl.pattern_FieldSignature_29_6_perform_greenBFBBFFFBBB(mFieldName, tAbstractType,
							tField, mType, ruleResult, csp);
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[1];
					//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[4];
					//nothing MFieldSignature mSignature = (MFieldSignature) result6_green[5];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[6];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFieldName mFieldName,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField, Type mType,
			MFieldNameToTField eFieldDeclarationToTField, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tField", tField);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
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
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_FWD__MATCH_MFIELDNAME_MFIELDSIGNATURE_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(MFieldSignature) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFIELDNAME_MFIELDSIGNATURE_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(MFieldSignature) arguments.get(2), (Type) arguments.get(3));
			return null;
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFIELDNAME_MFIELDSIGNATURE_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
					(MFieldSignature) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MFIELDNAME_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TFIELD_MFIELDSIGNATURE_TYPE_MFIELDNAMETOTFIELD:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MFieldName) arguments.get(1),
					(TAbstractType) arguments.get(2), (TypeToTAbstractType) arguments.get(3), (TField) arguments.get(4),
					(MFieldSignature) arguments.get(5), (Type) arguments.get(6), (MFieldNameToTField) arguments.get(7));
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
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_BWD__MATCH_TFIELDSIGNATURE_TABSTRACTTYPE_TFIELD:
			return isAppropriate_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TField) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELDSIGNATURE_TABSTRACTTYPE_TFIELD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TField) arguments.get(3));
			return null;
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELDSIGNATURE_TABSTRACTTYPE_TFIELD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TField) arguments.get(3));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MFIELDNAME_TFIELDSIGNATURE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TFIELD_TYPE_MFIELDNAMETOTFIELD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MFieldName) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TField) arguments.get(5), (Type) arguments.get(6),
					(MFieldNameToTField) arguments.get(7));
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
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_87__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_87((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_91__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_91((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_CC__MFIELDNAME_TFIELDSIGNATURE_TABSTRACTTYPE_TFIELD_MFIELDSIGNATURE_TYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MFieldName) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TField) arguments.get(3), (MFieldSignature) arguments.get(4),
					(Type) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.FIELD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_SIGNATURE___CHECK_DEC_FWD__MFIELDNAME_MFIELDSIGNATURE_TYPE:
			return checkDEC_FWD((MFieldName) arguments.get(0), (MFieldSignature) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___CHECK_DEC_BWD__TFIELDSIGNATURE_TABSTRACTTYPE_TFIELD:
			return checkDEC_BWD((TFieldSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TField) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___GENERATE_MODEL__RULEENTRYCONTAINER_MFIELDNAMETOTFIELD_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (MFieldNameToTField) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.FIELD_SIGNATURE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MFIELDNAME_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TFIELD_TYPE_MFIELDNAMETOTFIELD_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MFieldName) arguments.get(1),
					(TAbstractType) arguments.get(2), (TypeToTAbstractType) arguments.get(3), (TField) arguments.get(4),
					(Type) arguments.get(5), (MFieldNameToTField) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.FIELD_SIGNATURE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldSignature_0_1_initialbindings_blackBBBBB(FieldSignature _this,
			Match match, MFieldName mFieldName, MFieldSignature mSignature, Type mType) {
		return new Object[] { _this, match, mFieldName, mSignature, mType };
	}

	public static final Object[] pattern_FieldSignature_0_2_SolveCSP_bindingFBBBBB(FieldSignature _this, Match match,
			MFieldName mFieldName, MFieldSignature mSignature, Type mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mFieldName, mSignature, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mFieldName, mSignature, mType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(FieldSignature _this,
			Match match, MFieldName mFieldName, MFieldSignature mSignature, Type mType) {
		Object[] result_pattern_FieldSignature_0_2_SolveCSP_binding = pattern_FieldSignature_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mFieldName, mSignature, mType);
		if (result_pattern_FieldSignature_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldSignature_0_2_SolveCSP_black = pattern_FieldSignature_0_2_SolveCSP_blackB(csp);
			if (result_pattern_FieldSignature_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mFieldName, mSignature, mType };
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
			MFieldName mFieldName, MFieldSignature mSignature, Type mType) {
		return new Object[] { match, mFieldName, mSignature, mType };
	}

	public static final Object[] pattern_FieldSignature_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			MFieldName mFieldName, MFieldSignature mSignature, Type mType) {
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
		return new Object[] { match, mFieldName, mSignature, mType, mFieldName__mSignature____mSignatures,
				mSignature__mType____type };
	}

	public static final Object[] pattern_FieldSignature_0_5_collectcontextelements_blackBBBB(Match match,
			MFieldName mFieldName, MFieldSignature mSignature, Type mType) {
		return new Object[] { match, mFieldName, mSignature, mType };
	}

	public static final Object[] pattern_FieldSignature_0_5_collectcontextelements_greenBBB(Match match,
			MFieldName mFieldName, Type mType) {
		match.getContextNodes().add(mFieldName);
		match.getContextNodes().add(mType);
		return new Object[] { match, mFieldName, mType };
	}

	public static final void pattern_FieldSignature_0_6_registerobjectstomatch_expressionBBBBB(FieldSignature _this,
			Match match, MFieldName mFieldName, MFieldSignature mSignature, Type mType) {
		_this.registerObjectsToMatch_FWD(match, mFieldName, mSignature, mType);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("mFieldName");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tField");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("eFieldDeclarationToTField");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpMTypeToTType = _localVariable_2;
		EObject tmpTField = _localVariable_3;
		EObject tmpMSignature = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpEFieldDeclarationToTField = _localVariable_6;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpMTypeToTType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
					if (tmpTField instanceof TField) {
						TField tField = (TField) tmpTField;
						if (tmpMSignature instanceof MFieldSignature) {
							MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
									MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
									return new Object[] { mFieldName, tAbstractType, mTypeToTType, tField, mSignature,
											mType, eFieldDeclarationToTField, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_blackBBBBBBBFBB(MFieldName mFieldName,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField, MFieldSignature mSignature,
			Type mType, MFieldNameToTField eFieldDeclarationToTField, FieldSignature _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mFieldName, tAbstractType, mTypeToTType, tField, mSignature, mType,
						eFieldDeclarationToTField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldSignature_1_1_performtransformation_binding = pattern_FieldSignature_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldSignature_1_1_performtransformation_binding != null) {
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignature_1_1_performtransformation_binding[0];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_FieldSignature_1_1_performtransformation_binding[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_FieldSignature_1_1_performtransformation_binding[2];
			TField tField = (TField) result_pattern_FieldSignature_1_1_performtransformation_binding[3];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldSignature_1_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_FieldSignature_1_1_performtransformation_binding[5];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result_pattern_FieldSignature_1_1_performtransformation_binding[6];

			Object[] result_pattern_FieldSignature_1_1_performtransformation_black = pattern_FieldSignature_1_1_performtransformation_blackBBBBBBBFBB(
					mFieldName, tAbstractType, mTypeToTType, tField, mSignature, mType, eFieldDeclarationToTField,
					_this, isApplicableMatch);
			if (result_pattern_FieldSignature_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldSignature_1_1_performtransformation_black[7];

				return new Object[] { mFieldName, tAbstractType, mTypeToTType, tField, mSignature, mType,
						eFieldDeclarationToTField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_1_1_performtransformation_greenFBBFBFB(
			TAbstractType tAbstractType, TField tField, MFieldSignature mSignature, CSP csp) {
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		tSignature.setType(tAbstractType);
		tField.getSignatures().add(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		return new Object[] { tSignature, tAbstractType, tField, mSignatureToTSignature, mSignature,
				mFlowElementToTFlowElement, csp };
	}

	public static final Object[] pattern_FieldSignature_1_2_collecttranslatedelements_blackBBBB(
			TFieldSignature tSignature, MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		return new Object[] { tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_FieldSignature_1_2_collecttranslatedelements_greenFBBBB(
			TFieldSignature tSignature, MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getTranslatedElements().add(mSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		return new Object[] { ruleresult, tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_FieldSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mFieldName, EObject tSignature, EObject tAbstractType,
			EObject mTypeToTType, EObject tField, EObject mSignatureToTSignature, EObject mSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject eFieldDeclarationToTField) {
		if (!mFieldName.equals(tSignature)) {
			if (!mFieldName.equals(tAbstractType)) {
				if (!mFieldName.equals(mTypeToTType)) {
					if (!mFieldName.equals(tField)) {
						if (!mFieldName.equals(mSignatureToTSignature)) {
							if (!mFieldName.equals(mSignature)) {
								if (!mFieldName.equals(mFlowElementToTFlowElement)) {
									if (!mFieldName.equals(mType)) {
										if (!tAbstractType.equals(tSignature)) {
											if (!tAbstractType.equals(tField)) {
												if (!mTypeToTType.equals(tSignature)) {
													if (!mTypeToTType.equals(tAbstractType)) {
														if (!mTypeToTType.equals(tField)) {
															if (!tField.equals(tSignature)) {
																if (!mSignatureToTSignature.equals(tSignature)) {
																	if (!mSignatureToTSignature.equals(tAbstractType)) {
																		if (!mSignatureToTSignature
																				.equals(mTypeToTType)) {
																			if (!mSignatureToTSignature
																					.equals(tField)) {
																				if (!mSignatureToTSignature
																						.equals(mType)) {
																					if (!mSignature
																							.equals(tSignature)) {
																						if (!mSignature.equals(
																								tAbstractType)) {
																							if (!mSignature.equals(
																									mTypeToTType)) {
																								if (!mSignature.equals(
																										tField)) {
																									if (!mSignature
																											.equals(mSignatureToTSignature)) {
																										if (!mSignature
																												.equals(mType)) {
																											if (!mFlowElementToTFlowElement
																													.equals(tSignature)) {
																												if (!mFlowElementToTFlowElement
																														.equals(tAbstractType)) {
																													if (!mFlowElementToTFlowElement
																															.equals(mTypeToTType)) {
																														if (!mFlowElementToTFlowElement
																																.equals(tField)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(mSignatureToTSignature)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(mSignature)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mType)) {
																																		if (!mType
																																				.equals(tSignature)) {
																																			if (!mType
																																					.equals(tAbstractType)) {
																																				if (!mType
																																						.equals(mTypeToTType)) {
																																					if (!mType
																																							.equals(tField)) {
																																						if (!eFieldDeclarationToTField
																																								.equals(mFieldName)) {
																																							if (!eFieldDeclarationToTField
																																									.equals(tSignature)) {
																																								if (!eFieldDeclarationToTField
																																										.equals(tAbstractType)) {
																																									if (!eFieldDeclarationToTField
																																											.equals(mTypeToTType)) {
																																										if (!eFieldDeclarationToTField
																																												.equals(tField)) {
																																											if (!eFieldDeclarationToTField
																																													.equals(mSignatureToTSignature)) {
																																												if (!eFieldDeclarationToTField
																																														.equals(mSignature)) {
																																													if (!eFieldDeclarationToTField
																																															.equals(mFlowElementToTFlowElement)) {
																																														if (!eFieldDeclarationToTField
																																																.equals(mType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mFieldName,
																																																	tSignature,
																																																	tAbstractType,
																																																	mTypeToTType,
																																																	tField,
																																																	mSignatureToTSignature,
																																																	mSignature,
																																																	mFlowElementToTFlowElement,
																																																	mType,
																																																	eFieldDeclarationToTField };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mFieldName, EObject tSignature, EObject tAbstractType, EObject tField,
			EObject mSignatureToTSignature, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mType) {
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldSignature";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String tSignature__tAbstractType____type_name_prime = "type";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignature__mType____type_name_prime = "type";
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mFieldName__mSignature____mSignatures);
		tSignature__tAbstractType____type.setSrc(tSignature);
		tSignature__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tSignature__tAbstractType____type);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		ruleresult.getCreatedEdges().add(tSignature__tField____field);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mSignature__mType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		tSignature__tAbstractType____type.setName(tSignature__tAbstractType____type_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		return new Object[] { ruleresult, mFieldName, tSignature, tAbstractType, tField, mSignatureToTSignature,
				mSignature, mFlowElementToTFlowElement, mType, mFieldName__mSignature____mSignatures,
				tSignature__tAbstractType____type, tField__tSignature____signatures, tSignature__tField____field,
				mSignatureToTSignature__tSignature____target, mFlowElementToTFlowElement__tSignature____target,
				mFlowElementToTFlowElement__mSignature____source, mSignatureToTSignature__mSignature____source,
				mSignature__mType____type };
	}

	public static final void pattern_FieldSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(FieldSignature _this,
			PerformRuleResult ruleresult, EObject mFieldName, EObject tSignature, EObject tAbstractType,
			EObject mTypeToTType, EObject tField, EObject mSignatureToTSignature, EObject mSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject eFieldDeclarationToTField) {
		_this.registerObjects_FWD(ruleresult, mFieldName, tSignature, tAbstractType, mTypeToTType, tField,
				mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, mType, eFieldDeclarationToTField);

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
		EObject _localVariable_0 = match.getObject("mFieldName");
		EObject _localVariable_1 = match.getObject("mSignature");
		EObject _localVariable_2 = match.getObject("mType");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				if (tmpMType instanceof Type) {
					Type mType = (Type) tmpMType;
					return new Object[] { mFieldName, mSignature, mType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_2_2_corematch_blackBFFFBBFB(MFieldName mFieldName,
			MFieldSignature mSignature, Type mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
			TAbstractType tAbstractType = mTypeToTType.getTarget();
			if (tAbstractType != null) {
				for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mFieldName, MFieldNameToTField.class, "source")) {
					TField tField = eFieldDeclarationToTField.getTarget();
					if (tField != null) {
						_result.add(new Object[] { mFieldName, tAbstractType, mTypeToTType, tField, mSignature, mType,
								eFieldDeclarationToTField, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_2_3_findcontext_blackBBBBBBB(MFieldName mFieldName,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField, MFieldSignature mSignature,
			Type mType, MFieldNameToTField eFieldDeclarationToTField) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mFieldName.getMSignatures().contains(mSignature)) {
			if (tAbstractType.equals(mTypeToTType.getTarget())) {
				if (mType.equals(mTypeToTType.getSource())) {
					if (mType.equals(mSignature.getType())) {
						if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
							if (tField.equals(eFieldDeclarationToTField.getTarget())) {
								_result.add(new Object[] { mFieldName, tAbstractType, mTypeToTType, tField, mSignature,
										mType, eFieldDeclarationToTField });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(MFieldName mFieldName,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField, MFieldSignature mSignature,
			Type mType, MFieldNameToTField eFieldDeclarationToTField) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mSignature__mType____type_name_prime = "type";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField);
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mFieldName__mSignature____mSignatures);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mSignature__mType____type);
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__mFieldName____source);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__tField____target);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		return new Object[] { mFieldName, tAbstractType, mTypeToTType, tField, mSignature, mType,
				eFieldDeclarationToTField, isApplicableMatch, mFieldName__mSignature____mSignatures,
				mTypeToTType__tAbstractType____target, mTypeToTType__mType____source, mSignature__mType____type,
				eFieldDeclarationToTField__mFieldName____source, eFieldDeclarationToTField__tField____target };
	}

	public static final Object[] pattern_FieldSignature_2_4_solveCSP_bindingFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTType, TField tField, MFieldSignature mSignature, Type mType,
			MFieldNameToTField eFieldDeclarationToTField) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mFieldName, tAbstractType,
				mTypeToTType, tField, mSignature, mType, eFieldDeclarationToTField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, tAbstractType, mTypeToTType, tField,
					mSignature, mType, eFieldDeclarationToTField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTType, TField tField, MFieldSignature mSignature, Type mType,
			MFieldNameToTField eFieldDeclarationToTField) {
		Object[] result_pattern_FieldSignature_2_4_solveCSP_binding = pattern_FieldSignature_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mFieldName, tAbstractType, mTypeToTType, tField, mSignature, mType,
				eFieldDeclarationToTField);
		if (result_pattern_FieldSignature_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldSignature_2_4_solveCSP_black = pattern_FieldSignature_2_4_solveCSP_blackB(csp);
			if (result_pattern_FieldSignature_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, tAbstractType, mTypeToTType, tField,
						mSignature, mType, eFieldDeclarationToTField };
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
			Match match, TFieldSignature tSignature, TAbstractType tAbstractType, TField tField) {
		return new Object[] { _this, match, tSignature, tAbstractType, tField };
	}

	public static final Object[] pattern_FieldSignature_10_2_SolveCSP_bindingFBBBBB(FieldSignature _this, Match match,
			TFieldSignature tSignature, TAbstractType tAbstractType, TField tField) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tAbstractType, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tAbstractType, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(FieldSignature _this,
			Match match, TFieldSignature tSignature, TAbstractType tAbstractType, TField tField) {
		Object[] result_pattern_FieldSignature_10_2_SolveCSP_binding = pattern_FieldSignature_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSignature, tAbstractType, tField);
		if (result_pattern_FieldSignature_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldSignature_10_2_SolveCSP_black = pattern_FieldSignature_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldSignature_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tAbstractType, tField };
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
			TFieldSignature tSignature, TAbstractType tAbstractType, TField tField) {
		return new Object[] { match, tSignature, tAbstractType, tField };
	}

	public static final Object[] pattern_FieldSignature_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			TFieldSignature tSignature, TAbstractType tAbstractType, TField tField) {
		EMoflonEdge tSignature__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		String tSignature__tAbstractType____type_name_prime = "type";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		tSignature__tAbstractType____type.setSrc(tSignature);
		tSignature__tAbstractType____type.setTrg(tAbstractType);
		match.getToBeTranslatedEdges().add(tSignature__tAbstractType____type);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		match.getToBeTranslatedEdges().add(tSignature__tField____field);
		tSignature__tAbstractType____type.setName(tSignature__tAbstractType____type_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		return new Object[] { match, tSignature, tAbstractType, tField, tSignature__tAbstractType____type,
				tField__tSignature____signatures, tSignature__tField____field };
	}

	public static final Object[] pattern_FieldSignature_10_5_collectcontextelements_blackBBBB(Match match,
			TFieldSignature tSignature, TAbstractType tAbstractType, TField tField) {
		return new Object[] { match, tSignature, tAbstractType, tField };
	}

	public static final Object[] pattern_FieldSignature_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tAbstractType, TField tField) {
		match.getContextNodes().add(tAbstractType);
		match.getContextNodes().add(tField);
		return new Object[] { match, tAbstractType, tField };
	}

	public static final void pattern_FieldSignature_10_6_registerobjectstomatch_expressionBBBBB(FieldSignature _this,
			Match match, TFieldSignature tSignature, TAbstractType tAbstractType, TField tField) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tAbstractType, tField);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("mFieldName");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tField");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("eFieldDeclarationToTField");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpTField = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpEFieldDeclarationToTField = _localVariable_6;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpTField instanceof TField) {
							TField tField = (TField) tmpTField;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
									MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
									return new Object[] { mFieldName, tSignature, tAbstractType, mTypeToTType, tField,
											mType, eFieldDeclarationToTField, isApplicableMatch };
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
			MFieldName mFieldName, TFieldSignature tSignature, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTType, TField tField, Type mType, MFieldNameToTField eFieldDeclarationToTField,
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mType,
						eFieldDeclarationToTField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			FieldSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldSignature_11_1_performtransformation_binding = pattern_FieldSignature_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldSignature_11_1_performtransformation_binding != null) {
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignature_11_1_performtransformation_binding[0];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_FieldSignature_11_1_performtransformation_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_FieldSignature_11_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_FieldSignature_11_1_performtransformation_binding[3];
			TField tField = (TField) result_pattern_FieldSignature_11_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_FieldSignature_11_1_performtransformation_binding[5];
			MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result_pattern_FieldSignature_11_1_performtransformation_binding[6];

			Object[] result_pattern_FieldSignature_11_1_performtransformation_black = pattern_FieldSignature_11_1_performtransformation_blackBBBBBBBFBB(
					mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mType, eFieldDeclarationToTField,
					_this, isApplicableMatch);
			if (result_pattern_FieldSignature_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldSignature_11_1_performtransformation_black[7];

				return new Object[] { mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mType,
						eFieldDeclarationToTField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_11_1_performtransformation_greenBBFFFB(MFieldName mFieldName,
			TFieldSignature tSignature, Type mType) {
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MFieldSignature mSignature = ModiscoFactory.eINSTANCE.createMFieldSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mSignatureToTSignature.setTarget(tSignature);
		mFieldName.getMSignatures().add(mSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignature.setType(mType);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		return new Object[] { mFieldName, tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement,
				mType };
	}

	public static final Object[] pattern_FieldSignature_11_2_collecttranslatedelements_blackBBBB(
			TFieldSignature tSignature, MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		return new Object[] { tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_FieldSignature_11_2_collecttranslatedelements_greenFBBBB(
			TFieldSignature tSignature, MSignatureToTSignature mSignatureToTSignature, MFieldSignature mSignature,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getCreatedElements().add(mSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		return new Object[] { ruleresult, tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_FieldSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mFieldName, EObject tSignature, EObject tAbstractType,
			EObject mTypeToTType, EObject tField, EObject mSignatureToTSignature, EObject mSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject eFieldDeclarationToTField) {
		if (!mFieldName.equals(tSignature)) {
			if (!mFieldName.equals(tAbstractType)) {
				if (!mFieldName.equals(mTypeToTType)) {
					if (!mFieldName.equals(tField)) {
						if (!mFieldName.equals(mSignatureToTSignature)) {
							if (!mFieldName.equals(mSignature)) {
								if (!mFieldName.equals(mFlowElementToTFlowElement)) {
									if (!mFieldName.equals(mType)) {
										if (!tAbstractType.equals(tSignature)) {
											if (!tAbstractType.equals(tField)) {
												if (!mTypeToTType.equals(tSignature)) {
													if (!mTypeToTType.equals(tAbstractType)) {
														if (!mTypeToTType.equals(tField)) {
															if (!tField.equals(tSignature)) {
																if (!mSignatureToTSignature.equals(tSignature)) {
																	if (!mSignatureToTSignature.equals(tAbstractType)) {
																		if (!mSignatureToTSignature
																				.equals(mTypeToTType)) {
																			if (!mSignatureToTSignature
																					.equals(tField)) {
																				if (!mSignatureToTSignature
																						.equals(mType)) {
																					if (!mSignature
																							.equals(tSignature)) {
																						if (!mSignature.equals(
																								tAbstractType)) {
																							if (!mSignature.equals(
																									mTypeToTType)) {
																								if (!mSignature.equals(
																										tField)) {
																									if (!mSignature
																											.equals(mSignatureToTSignature)) {
																										if (!mSignature
																												.equals(mType)) {
																											if (!mFlowElementToTFlowElement
																													.equals(tSignature)) {
																												if (!mFlowElementToTFlowElement
																														.equals(tAbstractType)) {
																													if (!mFlowElementToTFlowElement
																															.equals(mTypeToTType)) {
																														if (!mFlowElementToTFlowElement
																																.equals(tField)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(mSignatureToTSignature)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(mSignature)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mType)) {
																																		if (!mType
																																				.equals(tSignature)) {
																																			if (!mType
																																					.equals(tAbstractType)) {
																																				if (!mType
																																						.equals(mTypeToTType)) {
																																					if (!mType
																																							.equals(tField)) {
																																						if (!eFieldDeclarationToTField
																																								.equals(mFieldName)) {
																																							if (!eFieldDeclarationToTField
																																									.equals(tSignature)) {
																																								if (!eFieldDeclarationToTField
																																										.equals(tAbstractType)) {
																																									if (!eFieldDeclarationToTField
																																											.equals(mTypeToTType)) {
																																										if (!eFieldDeclarationToTField
																																												.equals(tField)) {
																																											if (!eFieldDeclarationToTField
																																													.equals(mSignatureToTSignature)) {
																																												if (!eFieldDeclarationToTField
																																														.equals(mSignature)) {
																																													if (!eFieldDeclarationToTField
																																															.equals(mFlowElementToTFlowElement)) {
																																														if (!eFieldDeclarationToTField
																																																.equals(mType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mFieldName,
																																																	tSignature,
																																																	tAbstractType,
																																																	mTypeToTType,
																																																	tField,
																																																	mSignatureToTSignature,
																																																	mSignature,
																																																	mFlowElementToTFlowElement,
																																																	mType,
																																																	eFieldDeclarationToTField };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mFieldName, EObject tSignature, EObject tAbstractType, EObject tField,
			EObject mSignatureToTSignature, EObject mSignature, EObject mFlowElementToTFlowElement, EObject mType) {
		EMoflonEdge mFieldName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldSignature";
		String mFieldName__mSignature____mSignatures_name_prime = "mSignatures";
		String tSignature__tAbstractType____type_name_prime = "type";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignature__mType____type_name_prime = "type";
		mFieldName__mSignature____mSignatures.setSrc(mFieldName);
		mFieldName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFieldName__mSignature____mSignatures);
		tSignature__tAbstractType____type.setSrc(tSignature);
		tSignature__tAbstractType____type.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tSignature__tAbstractType____type);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		ruleresult.getTranslatedEdges().add(tSignature__tField____field);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		mSignature__mType____type.setSrc(mSignature);
		mSignature__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mSignature__mType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mFieldName__mSignature____mSignatures.setName(mFieldName__mSignature____mSignatures_name_prime);
		tSignature__tAbstractType____type.setName(tSignature__tAbstractType____type_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignature__mType____type.setName(mSignature__mType____type_name_prime);
		return new Object[] { ruleresult, mFieldName, tSignature, tAbstractType, tField, mSignatureToTSignature,
				mSignature, mFlowElementToTFlowElement, mType, mFieldName__mSignature____mSignatures,
				tSignature__tAbstractType____type, tField__tSignature____signatures, tSignature__tField____field,
				mSignatureToTSignature__tSignature____target, mFlowElementToTFlowElement__tSignature____target,
				mFlowElementToTFlowElement__mSignature____source, mSignatureToTSignature__mSignature____source,
				mSignature__mType____type };
	}

	public static final void pattern_FieldSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(FieldSignature _this,
			PerformRuleResult ruleresult, EObject mFieldName, EObject tSignature, EObject tAbstractType,
			EObject mTypeToTType, EObject tField, EObject mSignatureToTSignature, EObject mSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject eFieldDeclarationToTField) {
		_this.registerObjects_BWD(ruleresult, mFieldName, tSignature, tAbstractType, mTypeToTType, tField,
				mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, mType, eFieldDeclarationToTField);

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
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("tAbstractType");
		EObject _localVariable_2 = match.getObject("tField");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpTField instanceof TField) {
					TField tField = (TField) tmpTField;
					return new Object[] { tSignature, tAbstractType, tField, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_12_2_corematch_blackFBBFBFFB(
			TFieldSignature tSignature, TAbstractType tAbstractType, TField tField, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tSignature_lowerBound = tSignature.getLowerBound();
		if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
				Type mType = mTypeToTType.getSource();
				if (mType != null) {
					for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tField, MFieldNameToTField.class, "target")) {
						MFieldName mFieldName = eFieldDeclarationToTField.getSource();
						if (mFieldName != null) {
							_result.add(new Object[] { mFieldName, tSignature, tAbstractType, mTypeToTType, tField,
									mType, eFieldDeclarationToTField, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_12_3_findcontext_blackBBBBBBB(MFieldName mFieldName,
			TFieldSignature tSignature, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField,
			Type mType, MFieldNameToTField eFieldDeclarationToTField) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAbstractType.equals(tSignature.getType())) {
			if (tField.getSignatures().contains(tSignature)) {
				if (tAbstractType.equals(mTypeToTType.getTarget())) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (mFieldName.equals(eFieldDeclarationToTField.getSource())) {
							if (tField.equals(eFieldDeclarationToTField.getTarget())) {
								int tSignature_lowerBound = tSignature.getLowerBound();
								if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
									_result.add(new Object[] { mFieldName, tSignature, tAbstractType, mTypeToTType,
											tField, mType, eFieldDeclarationToTField });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldSignature_12_3_findcontext_greenBBBBBBBFFFFFFFF(MFieldName mFieldName,
			TFieldSignature tSignature, TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField,
			Type mType, MFieldNameToTField eFieldDeclarationToTField) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSignature__tAbstractType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tField____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSignature__tAbstractType____type_name_prime = "type";
		String tField__tSignature____signatures_name_prime = "signatures";
		String tSignature__tField____field_name_prime = "field";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tField);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField);
		tSignature__tAbstractType____type.setSrc(tSignature);
		tSignature__tAbstractType____type.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tSignature__tAbstractType____type);
		tField__tSignature____signatures.setSrc(tField);
		tField__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tField__tSignature____signatures);
		tSignature__tField____field.setSrc(tSignature);
		tSignature__tField____field.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(tSignature__tField____field);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__mFieldName____source);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTField__tField____target);
		tSignature__tAbstractType____type.setName(tSignature__tAbstractType____type_name_prime);
		tField__tSignature____signatures.setName(tField__tSignature____signatures_name_prime);
		tSignature__tField____field.setName(tSignature__tField____field_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		return new Object[] { mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mType,
				eFieldDeclarationToTField, isApplicableMatch, tSignature__tAbstractType____type,
				tField__tSignature____signatures, tSignature__tField____field, mTypeToTType__tAbstractType____target,
				mTypeToTType__mType____source, eFieldDeclarationToTField__mFieldName____source,
				eFieldDeclarationToTField__tField____target };
	}

	public static final Object[] pattern_FieldSignature_12_4_solveCSP_bindingFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TFieldSignature tSignature,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField, Type mType,
			MFieldNameToTField eFieldDeclarationToTField) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mFieldName, tSignature, tAbstractType,
				mTypeToTType, tField, mType, eFieldDeclarationToTField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, tSignature, tAbstractType, mTypeToTType,
					tField, mType, eFieldDeclarationToTField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TFieldSignature tSignature,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField, Type mType,
			MFieldNameToTField eFieldDeclarationToTField) {
		Object[] result_pattern_FieldSignature_12_4_solveCSP_binding = pattern_FieldSignature_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mFieldName, tSignature, tAbstractType, mTypeToTType, tField, mType,
				eFieldDeclarationToTField);
		if (result_pattern_FieldSignature_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldSignature_12_4_solveCSP_black = pattern_FieldSignature_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldSignature_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, tSignature, tAbstractType,
						mTypeToTType, tField, mType, eFieldDeclarationToTField };
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
		TField __DEC_tSignature_field_626315 = tSignature.getField();
		if (__DEC_tSignature_field_626315 != null) {
			if (!tField.equals(__DEC_tSignature_field_626315)) {
				return new Object[] { tSignature, tField };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSignature = _edge_type.getSrc();
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			EObject tmpTAbstractType = _edge_type.getTrg();
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tAbstractType.equals(tSignature.getType())) {
					TField tField = tSignature.getField();
					if (tField != null) {
						int tSignature_lowerBound = tSignature.getLowerBound();
						if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
							if (pattern_FieldSignature_20_2_testcorematchandDECs_black_nac_0BB(tSignature,
									tField) == null) {
								_result.add(new Object[] { tSignature, tAbstractType, tField, _edge_type });
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
			FieldSignature _this, Match match, TFieldSignature tSignature, TAbstractType tAbstractType, TField tField) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tAbstractType, tField);
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
						_result.add(new Object[] { mFieldName, mSignature, mType, _edge_mSignatures });
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
			FieldSignature _this, Match match, MFieldName mFieldName, MFieldSignature mSignature, Type mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mFieldName, mSignature, mType);
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

	public static final Object[] pattern_FieldSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mFieldName");
		EObject _localVariable_1 = targetMatch.getObject("tSignature");
		EObject _localVariable_2 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_3 = targetMatch.getObject("tField");
		EObject _localVariable_4 = sourceMatch.getObject("mSignature");
		EObject _localVariable_5 = sourceMatch.getObject("mType");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		EObject tmpTField = _localVariable_3;
		EObject tmpMSignature = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					if (tmpTField instanceof TField) {
						TField tField = (TField) tmpTField;
						if (tmpMSignature instanceof MFieldSignature) {
							MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								return new Object[] { mFieldName, tSignature, tAbstractType, tField, mSignature, mType,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(MFieldName mFieldName,
			TFieldSignature tSignature, TAbstractType tAbstractType, TField tField, MFieldSignature mSignature,
			Type mType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				return new Object[] { mFieldName, tSignature, tAbstractType, tField, mSignature, mType, sourceMatch,
						targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding = pattern_FieldSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding != null) {
			MFieldName mFieldName = (MFieldName) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[0];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[1];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[2];
			TField tField = (TField) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[3];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[4];
			Type mType = (Type) result_pattern_FieldSignature_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_FieldSignature_24_2_matchsrctrgcontext_black = pattern_FieldSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mFieldName, tSignature, tAbstractType, tField, mSignature, mType, sourceMatch, targetMatch);
			if (result_pattern_FieldSignature_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mFieldName, tSignature, tAbstractType, tField, mSignature, mType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_3_solvecsp_bindingFBBBBBBBBB(FieldSignature _this,
			MFieldName mFieldName, TFieldSignature tSignature, TAbstractType tAbstractType, TField tField,
			MFieldSignature mSignature, Type mType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mFieldName, tSignature, tAbstractType, tField, mSignature,
				mType, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mFieldName, tSignature, tAbstractType, tField, mSignature, mType,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(FieldSignature _this,
			MFieldName mFieldName, TFieldSignature tSignature, TAbstractType tAbstractType, TField tField,
			MFieldSignature mSignature, Type mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldSignature_24_3_solvecsp_binding = pattern_FieldSignature_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mFieldName, tSignature, tAbstractType, tField, mSignature, mType, sourceMatch, targetMatch);
		if (result_pattern_FieldSignature_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldSignature_24_3_solvecsp_black = pattern_FieldSignature_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldSignature_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mFieldName, tSignature, tAbstractType, tField, mSignature, mType,
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

	public static final Iterable<Object[]> pattern_FieldSignature_24_5_matchcorrcontext_blackBBFBBFBB(
			MFieldName mFieldName, TAbstractType tAbstractType, TField tField, Type mType, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
				if (mType.equals(mTypeToTType.getSource())) {
					for (MFieldNameToTField eFieldDeclarationToTField : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mFieldName, MFieldNameToTField.class, "source")) {
						if (tField.equals(eFieldDeclarationToTField.getTarget())) {
							_result.add(new Object[] { mFieldName, tAbstractType, mTypeToTType, tField, mType,
									eFieldDeclarationToTField, sourceMatch, targetMatch });
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

	public static final Object[] pattern_FieldSignature_24_6_createcorrespondence_blackBBBBBBB(MFieldName mFieldName,
			TFieldSignature tSignature, TAbstractType tAbstractType, TField tField, MFieldSignature mSignature,
			Type mType, CCMatch ccMatch) {
		return new Object[] { mFieldName, tSignature, tAbstractType, tField, mSignature, mType, ccMatch };
	}

	public static final Object[] pattern_FieldSignature_24_6_createcorrespondence_greenBFBFB(TFieldSignature tSignature,
			MFieldSignature mSignature, CCMatch ccMatch) {
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		ccMatch.getCreateCorr().add(mSignatureToTSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		return new Object[] { tSignature, mSignatureToTSignature, mSignature, mFlowElementToTFlowElement, ccMatch };
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

	public static final Object[] pattern_FieldSignature_27_1_matchtggpattern_blackBBB(MFieldName mFieldName,
			MFieldSignature mSignature, Type mType) {
		if (mFieldName.getMSignatures().contains(mSignature)) {
			if (mType.equals(mSignature.getType())) {
				return new Object[] { mFieldName, mSignature, mType };
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
		TField __DEC_tSignature_field_259886 = tSignature.getField();
		if (__DEC_tSignature_field_259886 != null) {
			if (!tField.equals(__DEC_tSignature_field_259886)) {
				return new Object[] { tSignature, tField };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldSignature_28_1_matchtggpattern_blackBBB(TFieldSignature tSignature,
			TAbstractType tAbstractType, TField tField) {
		if (tAbstractType.equals(tSignature.getType())) {
			if (tField.getSignatures().contains(tSignature)) {
				if (pattern_FieldSignature_28_1_matchtggpattern_black_nac_0BB(tSignature, tField) == null) {
					return new Object[] { tSignature, tAbstractType, tField };
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
			ModelgeneratorRuleResult ruleResult, MFieldName mFieldName) {
		if (ruleResult.getSourceObjects().contains(mFieldName)) {
			return new Object[] { ruleResult, mFieldName };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MFieldNameToTField eFieldDeclarationToTField) {
		if (ruleResult.getCorrObjects().contains(eFieldDeclarationToTField)) {
			return new Object[] { ruleResult, eFieldDeclarationToTField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TField tField) {
		if (ruleResult.getTargetObjects().contains(tField)) {
			return new Object[] { ruleResult, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldSignature_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eFieldDeclarationToTFieldList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!eFieldDeclarationToTFieldList.equals(mTypeToTTypeList)) {
					for (EObject tmpEFieldDeclarationToTField : eFieldDeclarationToTFieldList.getEntryObjects()) {
						if (tmpEFieldDeclarationToTField instanceof MFieldNameToTField) {
							MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) tmpEFieldDeclarationToTField;
							MFieldName mFieldName = eFieldDeclarationToTField.getSource();
							if (mFieldName != null) {
								TField tField = eFieldDeclarationToTField.getTarget();
								if (tField != null) {
									if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											eFieldDeclarationToTField) == null) {
										if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mFieldName) == null) {
											if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tField) == null) {
												for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
													if (tmpMTypeToTType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
														TAbstractType tAbstractType = mTypeToTType.getTarget();
														if (tAbstractType != null) {
															Type mType = mTypeToTType.getSource();
															if (mType != null) {
																if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, mTypeToTType) == null) {
																	if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tAbstractType) == null) {
																		if (pattern_FieldSignature_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mType) == null) {
																			_result.add(new Object[] {
																					eFieldDeclarationToTFieldList,
																					mFieldName,
																					eFieldDeclarationToTField, tField,
																					mTypeToTTypeList, tAbstractType,
																					mTypeToTType, mType,
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

	public static final Object[] pattern_FieldSignature_29_3_solveCSP_bindingFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTType, TField tField, Type mType, MFieldNameToTField eFieldDeclarationToTField,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mFieldName, tAbstractType,
				mTypeToTType, tField, mType, eFieldDeclarationToTField, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, tAbstractType, mTypeToTType, tField, mType,
					eFieldDeclarationToTField, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldSignature_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(FieldSignature _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, TAbstractType tAbstractType,
			TypeToTAbstractType mTypeToTType, TField tField, Type mType, MFieldNameToTField eFieldDeclarationToTField,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldSignature_29_3_solveCSP_binding = pattern_FieldSignature_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mFieldName, tAbstractType, mTypeToTType, tField, mType,
				eFieldDeclarationToTField, ruleResult);
		if (result_pattern_FieldSignature_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldSignature_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldSignature_29_3_solveCSP_black = pattern_FieldSignature_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldSignature_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, tAbstractType, mTypeToTType, tField,
						mType, eFieldDeclarationToTField, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldSignature_29_4_checkCSP_expressionFBB(FieldSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldSignature_29_5_checknacs_blackBBBBBB(MFieldName mFieldName,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField, Type mType,
			MFieldNameToTField eFieldDeclarationToTField) {
		return new Object[] { mFieldName, tAbstractType, mTypeToTType, tField, mType, eFieldDeclarationToTField };
	}

	public static final Object[] pattern_FieldSignature_29_6_perform_blackBBBBBBB(MFieldName mFieldName,
			TAbstractType tAbstractType, TypeToTAbstractType mTypeToTType, TField tField, Type mType,
			MFieldNameToTField eFieldDeclarationToTField, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mFieldName, tAbstractType, mTypeToTType, tField, mType, eFieldDeclarationToTField,
				ruleResult };
	}

	public static final Object[] pattern_FieldSignature_29_6_perform_greenBFBBFFFBBB(MFieldName mFieldName,
			TAbstractType tAbstractType, TField tField, Type mType, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MFieldSignature mSignature = ModiscoFactory.eINSTANCE.createMFieldSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		tSignature.setType(tAbstractType);
		tField.getSignatures().add(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mSignatureToTSignature);
		mFieldName.getMSignatures().add(mSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignature.setType(mType);
		ruleResult.getSourceObjects().add(mSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mFieldName, tSignature, tAbstractType, tField, mSignatureToTSignature, mSignature,
				mFlowElementToTFlowElement, mType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_FieldSignature_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldSignatureImpl
