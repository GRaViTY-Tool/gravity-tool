/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodDefinitionReturnSingle;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
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
 * An implementation of the model object '<em><b>Method Definition Return Single</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionReturnSingleImpl extends AbstractRuleImpl implements MethodDefinitionReturnSingle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDefinitionReturnSingleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodDefinitionReturnSingle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {

		Object[] result1_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_0_1_initialbindings_blackBBBBBB(this, match, mDefinition,
						mTypeAccess, mType, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mDefinition,
						mTypeAccess, mType, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_0_4_collectelementstobetranslated_blackBBBBB(match,
							mDefinition, mTypeAccess, mType, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
						+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_0_4_collectelementstobetranslated_greenBBBBBFFFFF(match,
							mDefinition, mTypeAccess, mType, mSignature);
			//nothing EMoflonEdge mDefinition__mTypeAccess____returnType = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result4_green[9];

			Object[] result5_black = MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_0_5_collectcontextelements_blackBBBBB(match, mDefinition,
							mTypeAccess, mType, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
						+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_0_5_collectcontextelements_greenBBB(match, mType, mSignature);

			// 
			MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
							mDefinition, mTypeAccess, mType, mSignature);
			return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_0_7_expressionF();
		} else {
			return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[1];
		MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[2];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[3];
		MMethodDefinition mDefinition = (MMethodDefinition) result1_bindingAndBlack[4];
		TypeAccess mTypeAccess = (TypeAccess) result1_bindingAndBlack[5];
		Type mType = (Type) result1_bindingAndBlack[6];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_1_1_performtransformation_greenBFBFBFF(tType, tMethodSignature,
						mDefinition);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_green[3];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[5];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[6];

		Object[] result2_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_1_2_collecttranslatedelements_blackBBBBBB(mDefinitionToTMember,
						tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mDefinitionToTMember] = " + mDefinitionToTMember
							+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mFlowElementToTFlowElement] = "
							+ mFlowElementToTFlowElement + ", " + "[mTypeAccess] = " + mTypeAccess + ".");
		}
		Object[] result2_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_1_2_collecttranslatedelements_greenFBBBBBB(mDefinitionToTMember,
						tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult,
						mTypeToTType, tType, mDefinitionToTMember, mSignatureToTMethodSignature, tMethodSignature,
						tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess, mType,
						mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mSignatureToTMethodSignature] = "
					+ mSignatureToTMethodSignature + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mType] = " + mType
					+ ", " + "[mSignature] = " + mSignature + ".");
		}
		MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult,
						tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition, mBodyToTAnnotation,
						mFlowElementToTFlowElement, mTypeAccess, mType, mSignature);
		//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mDefinition__mTypeAccess____returnType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mDefinition____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tDefinition____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tDefinition__tType____returnType = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[24];

		// 
		// 
		MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
						mTypeToTType, tType, mDefinitionToTMember, mSignatureToTMethodSignature, tMethodSignature,
						tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess, mType,
						mSignature);
		return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition mDefinition = (MMethodDefinition) result2_binding[0];
		TypeAccess mTypeAccess = (TypeAccess) result2_binding[1];
		Type mType = (Type) result2_binding[2];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[3];
		for (Object[] result2_black : MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_2_2_corematch_blackFFFFBBBBB(mDefinition, mTypeAccess, mType,
						mSignature, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[3];
			// ForEach 
			for (Object[] result3_black : MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_2_3_findcontext_blackBBBBBBBB(mTypeToTType, tType,
							mSignatureToTMethodSignature, tMethodSignature, mDefinition, mTypeAccess, mType,
							mSignature)) {
				Object[] result3_green = MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(mTypeToTType,
								tType, mSignatureToTMethodSignature, tMethodSignature, mDefinition, mTypeAccess, mType,
								mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge mDefinition__mTypeAccess____returnType = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature,
								mDefinition, mTypeAccess, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tType] = " + tType + ", " + "[mSignatureToTMethodSignature] = "
							+ mSignatureToTMethodSignature + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
							+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodDefinitionReturnSingleImpl
							.pattern_MethodDefinitionReturnSingle_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDefinitionReturnSingleImpl
							.pattern_MethodDefinitionReturnSingle_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mTypeAccess", mTypeAccess);
		match.registerObject("mType", mType);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {// Create CSP
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
			TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {// Create CSP
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
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mTypeAccess", mTypeAccess);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject tType,
			EObject mDefinitionToTMember, EObject mSignatureToTMethodSignature, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeAccess", mTypeAccess);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mDefinition").eClass())
						.equals("modisco.MMethodDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mTypeAccess").eClass())
						.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {

		Object[] result1_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_10_1_initialbindings_blackBBBBB(this, match, tType,
						tMethodSignature, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}

		Object[] result2_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tType,
						tMethodSignature, tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_10_4_collectelementstobetranslated_blackBBBB(match, tType,
							tMethodSignature, tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_10_4_collectelementstobetranslated_greenBBBBFFF(match, tType,
							tMethodSignature, tDefinition);
			//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tDefinition__tType____returnType = (EMoflonEdge) result4_green[6];

			Object[] result5_black = MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_10_5_collectcontextelements_blackBBBB(match, tType,
							tMethodSignature, tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_10_5_collectcontextelements_greenBBB(
					match, tType, tMethodSignature);

			// 
			MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tType, tMethodSignature, tDefinition);
			return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_10_7_expressionF();
		} else {
			return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[1];
		MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[2];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[3];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_11_1_performtransformation_greenFBFFFFBB(tDefinition, mType,
						mSignature);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[0];
		MMethodDefinition mDefinition = (MMethodDefinition) result1_green[2];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[3];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[4];
		TypeAccess mTypeAccess = (TypeAccess) result1_green[5];

		Object[] result2_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_11_2_collecttranslatedelements_blackBBBBBB(mDefinitionToTMember,
						tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mDefinitionToTMember] = " + mDefinitionToTMember
							+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mFlowElementToTFlowElement] = "
							+ mFlowElementToTFlowElement + ", " + "[mTypeAccess] = " + mTypeAccess + ".");
		}
		Object[] result2_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_11_2_collecttranslatedelements_greenFBBBBBB(mDefinitionToTMember,
						tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult,
						mTypeToTType, tType, mDefinitionToTMember, mSignatureToTMethodSignature, tMethodSignature,
						tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess, mType,
						mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mSignatureToTMethodSignature] = "
					+ mSignatureToTMethodSignature + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mType] = " + mType
					+ ", " + "[mSignature] = " + mSignature + ".");
		}
		MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
						ruleresult, tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
						mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess, mType, mSignature);
		//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mDefinition__mTypeAccess____returnType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mDefinition____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tDefinition____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tDefinition__tType____returnType = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[24];

		// 
		// 
		MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
						mTypeToTType, tType, mDefinitionToTMember, mSignatureToTMethodSignature, tMethodSignature,
						tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess, mType,
						mSignature);
		return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tType = (TAbstractType) result2_binding[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result2_binding[2];
		for (Object[] result2_black : MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_12_2_corematch_blackFBFBBFFB(tType, tMethodSignature, tDefinition,
						match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[2];
			Type mType = (Type) result2_black[5];
			MMethodSignature mSignature = (MMethodSignature) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_12_3_findcontext_blackBBBBBBB(mTypeToTType, tType,
							mSignatureToTMethodSignature, tMethodSignature, tDefinition, mType, mSignature)) {
				Object[] result3_green = MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_12_3_findcontext_greenBBBBBBBFFFFFFFF(mTypeToTType, tType,
								mSignatureToTMethodSignature, tMethodSignature, tDefinition, mType, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tDefinition__tType____returnType = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature,
								tDefinition, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tType] = " + tType + ", " + "[mSignatureToTMethodSignature] = "
							+ mSignatureToTMethodSignature + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
							+ mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodDefinitionReturnSingleImpl
							.pattern_MethodDefinitionReturnSingle_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDefinitionReturnSingleImpl
							.pattern_MethodDefinitionReturnSingle_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		match.registerObject("tType", tType);
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {// Create CSP
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
			TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, Type mType, MMethodSignature mSignature) {// Create CSP
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
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject tType,
			EObject mDefinitionToTMember, EObject mSignatureToTMethodSignature, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeAccess", mTypeAccess);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tDefinition").eClass())
				.equals("basic.TMethodDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_92(EMoflonEdge _edge_definitions) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_20_2_testcorematchandDECs_blackFFFB(_edge_definitions)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TMethodDefinition tDefinition = (TMethodDefinition) result2_black[2];
			Object[] result2_green = MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tType, tMethodSignature, tDefinition)) {
				// 
				if (MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodDefinitionReturnSingleImpl
							.pattern_MethodDefinitionReturnSingle_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDefinitionReturnSingleImpl
							.pattern_MethodDefinitionReturnSingle_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_94(EMoflonEdge _edge_returnType) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_blackFFFFB(_edge_returnType)) {
			MMethodDefinition mDefinition = (MMethodDefinition) result2_black[0];
			TypeAccess mTypeAccess = (TypeAccess) result2_black[1];
			Type mType = (Type) result2_black[2];
			MMethodSignature mSignature = (MMethodSignature) result2_black[3];
			Object[] result2_green = MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, mDefinition, mTypeAccess, mType, mSignature)) {
				// 
				if (MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodDefinitionReturnSingleImpl
							.pattern_MethodDefinitionReturnSingle_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDefinitionReturnSingleImpl
							.pattern_MethodDefinitionReturnSingle_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodDefinitionReturnSingle");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tDefinition", "upperBound", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tDefinition", "lowerBound", 0, ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("MethodDefinitionReturnSingle");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tDefinition", "upperBound", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tDefinition", "lowerBound", 0, ComparingOperator.EQUAL)) {
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

		Object[] result1_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_bindingAndBlack[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result2_bindingAndBlack[2];
		MMethodDefinition mDefinition = (MMethodDefinition) result2_bindingAndBlack[3];
		TypeAccess mTypeAccess = (TypeAccess) result2_bindingAndBlack[4];
		Type mType = (Type) result2_bindingAndBlack[5];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, tType,
						tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[tType] = " + tType
							+ ", " + "[tMethodSignature] = " + tMethodSignature + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = "
							+ mTypeAccess + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", "
							+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_24_5_matchcorrcontext_blackFBFBBBBB(tType, tMethodSignature,
							mType, mSignature, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result5_black[2];
				Object[] result5_green = MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_24_5_matchcorrcontext_greenBBBBF(mTypeToTType,
								mSignatureToTMethodSignature, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_24_6_createcorrespondence_blackBBBBBBBB(tType,
								tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
							+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tDefinition] = " + tDefinition
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
							+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_24_6_createcorrespondence_greenFBBFFB(tDefinition,
								mDefinition, ccMatch);
				//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[0];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[3];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[4];

				Object[] result7_black = MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {// 
		Object[] result1_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_blackBBBB(mDefinition, mTypeAccess, mType,
						mSignature);
		if (result1_black != null) {
			return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_27_2_expressionF();
		} else {
			return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {// 
		Object[] result1_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_28_1_matchtggpattern_blackBBB(tType, tMethodSignature,
						tDefinition);
		if (result1_black != null) {
			MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_28_1_matchtggpattern_greenB(tDefinition);

			return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_28_2_expressionF();
		} else {
			return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MSignatureToTSignature mSignatureToTMethodSignatureParameter) {

		Object[] result1_black = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodDefinitionReturnSingleImpl
				.pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			Type mType = (Type) result2_black[2];
			TAbstractType tType = (TAbstractType) result2_black[3];
			//nothing RuleEntryList mSignatureToTMethodSignatureList = (RuleEntryList) result2_black[4];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[5];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[6];
			MMethodSignature mSignature = (MMethodSignature) result2_black[7];

			Object[] result3_bindingAndBlack = MethodDefinitionReturnSingleImpl
					.pattern_MethodDefinitionReturnSingle_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature,
							mType, mSignature, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[tType] = " + tType + ", " + "[mSignatureToTMethodSignature] = "
						+ mSignatureToTMethodSignature + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MethodDefinitionReturnSingleImpl
						.pattern_MethodDefinitionReturnSingle_29_5_checknacs_blackBBBBBB(mTypeToTType, tType,
								mSignatureToTMethodSignature, tMethodSignature, mType, mSignature);
				if (result5_black != null) {

					Object[] result6_black = MethodDefinitionReturnSingleImpl
							.pattern_MethodDefinitionReturnSingle_29_6_perform_blackBBBBBBB(mTypeToTType, tType,
									mSignatureToTMethodSignature, tMethodSignature, mType, mSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tType] = " + tType + ", "
								+ "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", "
								+ "[tMethodSignature] = " + tMethodSignature + ", " + "[mType] = " + mType + ", "
								+ "[mSignature] = " + mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_29_6_perform_greenBFBFFFFFBBB(
							tType, tMethodSignature, mType, mSignature, ruleResult);
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[1];
					//nothing TMethodDefinition tDefinition = (TMethodDefinition) result6_green[3];
					//nothing MMethodDefinition mDefinition = (MMethodDefinition) result6_green[4];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[5];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[6];
					//nothing TypeAccess mTypeAccess = (TypeAccess) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionReturnSingleImpl.pattern_MethodDefinitionReturnSingle_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			Type mType, MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
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
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (MMethodSignature) arguments.get(4));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (MMethodSignature) arguments.get(4));
			return null;
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (MMethodSignature) arguments.get(4));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MSIGNATURETOTSIGNATURE_TMETHODSIGNATURE_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(MSignatureToTSignature) arguments.get(3), (TMethodSignature) arguments.get(4),
					(MMethodDefinition) arguments.get(5), (TypeAccess) arguments.get(6), (Type) arguments.get(7),
					(MMethodSignature) arguments.get(8));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
			return null;
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MSIGNATURETOTSIGNATURE_TMETHODSIGNATURE_TMETHODDEFINITION_TYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(MSignatureToTSignature) arguments.get(3), (TMethodSignature) arguments.get(4),
					(TMethodDefinition) arguments.get(5), (Type) arguments.get(6), (MMethodSignature) arguments.get(7));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_92((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_94__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_94((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPLICABLE_SOLVE_CSP_CC__TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TAbstractType) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3),
					(TypeAccess) arguments.get(4), (Type) arguments.get(5), (MMethodSignature) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___CHECK_DEC_FWD__MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			return checkDEC_FWD((MMethodDefinition) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2), (MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___CHECK_DEC_BWD__TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MSignatureToTSignature) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MSIGNATURETOTSIGNATURE_TMETHODSIGNATURE_TYPE_MMETHODSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(MSignatureToTSignature) arguments.get(3), (TMethodSignature) arguments.get(4),
					(Type) arguments.get(5), (MMethodSignature) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_0_1_initialbindings_blackBBBBBB(
			MethodDefinitionReturnSingle _this, Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {
		return new Object[] { _this, match, mDefinition, mTypeAccess, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_bindingFBBBBBB(
			MethodDefinitionReturnSingle _this, Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mTypeAccess, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mTypeAccess, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			MethodDefinitionReturnSingle _this, Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_binding = pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mDefinition, mTypeAccess, mType, mSignature);
		if (result_pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_black = pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnSingle_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mTypeAccess, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_0_3_CheckCSP_expressionFBB(
			MethodDefinitionReturnSingle _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {
		return new Object[] { match, mDefinition, mTypeAccess, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {
		EMoflonEdge mDefinition__mTypeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mDefinition);
		match.getToBeTranslatedNodes().add(mTypeAccess);
		String mDefinition__mTypeAccess____returnType_name_prime = "returnType";
		String mTypeAccess__mType____type_name_prime = "type";
		String mType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		mDefinition__mTypeAccess____returnType.setSrc(mDefinition);
		mDefinition__mTypeAccess____returnType.setTrg(mTypeAccess);
		match.getToBeTranslatedEdges().add(mDefinition__mTypeAccess____returnType);
		mTypeAccess__mType____type.setSrc(mTypeAccess);
		mTypeAccess__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(mTypeAccess__mType____type);
		mType__mTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		match.getToBeTranslatedEdges().add(mType__mTypeAccess____usagesInTypeAccess);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(mDefinition__mSignature____mSignature);
		mDefinition__mTypeAccess____returnType.setName(mDefinition__mTypeAccess____returnType_name_prime);
		mTypeAccess__mType____type.setName(mTypeAccess__mType____type_name_prime);
		mType__mTypeAccess____usagesInTypeAccess.setName(mType__mTypeAccess____usagesInTypeAccess_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { match, mDefinition, mTypeAccess, mType, mSignature,
				mDefinition__mTypeAccess____returnType, mTypeAccess__mType____type,
				mType__mTypeAccess____usagesInTypeAccess, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_0_5_collectcontextelements_blackBBBBB(Match match,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {
		return new Object[] { match, mDefinition, mTypeAccess, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_0_5_collectcontextelements_greenBBB(Match match,
			Type mType, MMethodSignature mSignature) {
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mSignature);
		return new Object[] { match, mType, mSignature };
	}

	public static final void pattern_MethodDefinitionReturnSingle_0_6_registerobjectstomatch_expressionBBBBBB(
			MethodDefinitionReturnSingle _this, Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mTypeAccess, mType, mSignature);

	}

	public static final boolean pattern_MethodDefinitionReturnSingle_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("mType");
		EObject _localVariable_7 = isApplicableMatch.getObject("mSignature");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMSignatureToTMethodSignature = _localVariable_2;
		EObject tmpTMethodSignature = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpMTypeAccess = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		EObject tmpMSignature = _localVariable_7;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
					MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
					if (tmpTMethodSignature instanceof TMethodSignature) {
						TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
						if (tmpMDefinition instanceof MMethodDefinition) {
							MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
							if (tmpMTypeAccess instanceof TypeAccess) {
								TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									if (tmpMSignature instanceof MMethodSignature) {
										MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
										return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature,
												tMethodSignature, mDefinition, mTypeAccess, mType, mSignature,
												isApplicableMatch };
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

	public static final Object[] pattern_MethodDefinitionReturnSingle_1_1_performtransformation_blackBBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature, MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, mDefinition,
						mTypeAccess, mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding = pattern_MethodDefinitionReturnSingle_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding[1];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding[3];
			MMethodDefinition mDefinition = (MMethodDefinition) result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding[4];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding[5];
			Type mType = (Type) result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding[6];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_binding[7];

			Object[] result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_black = pattern_MethodDefinitionReturnSingle_1_1_performtransformation_blackBBBBBBBBFBB(
					mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, mDefinition, mTypeAccess,
					mType, mSignature, _this, isApplicableMatch);
			if (result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinitionReturnSingle_1_1_performtransformation_black[8];

				return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, mDefinition,
						mTypeAccess, mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_1_1_performtransformation_greenBFBFBFF(
			TAbstractType tType, TMethodSignature tMethodSignature, MMethodDefinition mDefinition) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		int tDefinition_upperBound_prime = Integer.valueOf(1);
		int tDefinition_lowerBound_prime = Integer.valueOf(0);
		mDefinitionToTMember.setSource(mDefinition);
		tMethodSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		tDefinition.setReturnType(tType);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		return new Object[] { tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_1_2_collecttranslatedelements_blackBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TypeAccess mTypeAccess) {
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_1_2_collecttranslatedelements_greenFBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TypeAccess mTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedElements().add(tDefinition);
		ruleresult.getTranslatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getTranslatedElements().add(mTypeAccess);
		return new Object[] { ruleresult, mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject tType, EObject mDefinitionToTMember,
			EObject mSignatureToTMethodSignature, EObject tMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mType,
			EObject mSignature) {
		if (!mTypeToTType.equals(tType)) {
			if (!mTypeToTType.equals(tMethodSignature)) {
				if (!mTypeToTType.equals(tDefinition)) {
					if (!mDefinitionToTMember.equals(mTypeToTType)) {
						if (!mDefinitionToTMember.equals(tType)) {
							if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
								if (!mDefinitionToTMember.equals(tMethodSignature)) {
									if (!mDefinitionToTMember.equals(tDefinition)) {
										if (!mDefinitionToTMember.equals(mFlowElementToTFlowElement)) {
											if (!mDefinitionToTMember.equals(mTypeAccess)) {
												if (!mDefinitionToTMember.equals(mType)) {
													if (!mDefinitionToTMember.equals(mSignature)) {
														if (!mSignatureToTMethodSignature.equals(mTypeToTType)) {
															if (!mSignatureToTMethodSignature.equals(tType)) {
																if (!mSignatureToTMethodSignature
																		.equals(tMethodSignature)) {
																	if (!mSignatureToTMethodSignature
																			.equals(tDefinition)) {
																		if (!mSignatureToTMethodSignature
																				.equals(mTypeAccess)) {
																			if (!mSignatureToTMethodSignature
																					.equals(mType)) {
																				if (!tMethodSignature.equals(tType)) {
																					if (!tDefinition.equals(tType)) {
																						if (!tDefinition.equals(
																								tMethodSignature)) {
																							if (!mDefinition.equals(
																									mTypeToTType)) {
																								if (!mDefinition.equals(
																										tType)) {
																									if (!mDefinition
																											.equals(mDefinitionToTMember)) {
																										if (!mDefinition
																												.equals(mSignatureToTMethodSignature)) {
																											if (!mDefinition
																													.equals(tMethodSignature)) {
																												if (!mDefinition
																														.equals(tDefinition)) {
																													if (!mDefinition
																															.equals(mFlowElementToTFlowElement)) {
																														if (!mDefinition
																																.equals(mTypeAccess)) {
																															if (!mDefinition
																																	.equals(mType)) {
																																if (!mDefinition
																																		.equals(mSignature)) {
																																	if (!mBodyToTAnnotation
																																			.equals(mTypeToTType)) {
																																		if (!mBodyToTAnnotation
																																				.equals(tType)) {
																																			if (!mBodyToTAnnotation
																																					.equals(mDefinitionToTMember)) {
																																				if (!mBodyToTAnnotation
																																						.equals(mSignatureToTMethodSignature)) {
																																					if (!mBodyToTAnnotation
																																							.equals(tMethodSignature)) {
																																						if (!mBodyToTAnnotation
																																								.equals(tDefinition)) {
																																							if (!mBodyToTAnnotation
																																									.equals(mDefinition)) {
																																								if (!mBodyToTAnnotation
																																										.equals(mFlowElementToTFlowElement)) {
																																									if (!mBodyToTAnnotation
																																											.equals(mTypeAccess)) {
																																										if (!mBodyToTAnnotation
																																												.equals(mType)) {
																																											if (!mBodyToTAnnotation
																																													.equals(mSignature)) {
																																												if (!mFlowElementToTFlowElement
																																														.equals(mTypeToTType)) {
																																													if (!mFlowElementToTFlowElement
																																															.equals(tType)) {
																																														if (!mFlowElementToTFlowElement
																																																.equals(mSignatureToTMethodSignature)) {
																																															if (!mFlowElementToTFlowElement
																																																	.equals(tMethodSignature)) {
																																																if (!mFlowElementToTFlowElement
																																																		.equals(tDefinition)) {
																																																	if (!mFlowElementToTFlowElement
																																																			.equals(mTypeAccess)) {
																																																		if (!mFlowElementToTFlowElement
																																																				.equals(mType)) {
																																																			if (!mFlowElementToTFlowElement
																																																					.equals(mSignature)) {
																																																				if (!mTypeAccess
																																																						.equals(mTypeToTType)) {
																																																					if (!mTypeAccess
																																																							.equals(tType)) {
																																																						if (!mTypeAccess
																																																								.equals(tMethodSignature)) {
																																																							if (!mTypeAccess
																																																									.equals(tDefinition)) {
																																																								if (!mType
																																																										.equals(mTypeToTType)) {
																																																									if (!mType
																																																											.equals(tType)) {
																																																										if (!mType
																																																												.equals(tMethodSignature)) {
																																																											if (!mType
																																																													.equals(tDefinition)) {
																																																												if (!mType
																																																														.equals(mTypeAccess)) {
																																																													if (!mSignature
																																																															.equals(mTypeToTType)) {
																																																														if (!mSignature
																																																																.equals(tType)) {
																																																															if (!mSignature
																																																																	.equals(mSignatureToTMethodSignature)) {
																																																																if (!mSignature
																																																																		.equals(tMethodSignature)) {
																																																																	if (!mSignature
																																																																			.equals(tDefinition)) {
																																																																		if (!mSignature
																																																																				.equals(mTypeAccess)) {
																																																																			if (!mSignature
																																																																					.equals(mType)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						mTypeToTType,
																																																																						tType,
																																																																						mDefinitionToTMember,
																																																																						mSignatureToTMethodSignature,
																																																																						tMethodSignature,
																																																																						tDefinition,
																																																																						mDefinition,
																																																																						mBodyToTAnnotation,
																																																																						mFlowElementToTFlowElement,
																																																																						mTypeAccess,
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

	public static final Object[] pattern_MethodDefinitionReturnSingle_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		EMoflonEdge tMethodSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mTypeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDefinitionReturnSingle";
		String tMethodSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tMethodSignature____signature_name_prime = "signature";
		String mDefinition__mTypeAccess____returnType_name_prime = "returnType";
		String mFlowElementToTFlowElement__mDefinition____source_name_prime = "source";
		String mTypeAccess__mType____type_name_prime = "type";
		String mType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mFlowElementToTFlowElement__tDefinition____target_name_prime = "target";
		String tDefinition__tType____returnType_name_prime = "returnType";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		tMethodSignature__tDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tMethodSignature__tDefinition____definitions);
		tDefinition__tMethodSignature____signature.setSrc(tDefinition);
		tDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(tDefinition__tMethodSignature____signature);
		mDefinition__mTypeAccess____returnType.setSrc(mDefinition);
		mDefinition__mTypeAccess____returnType.setTrg(mTypeAccess);
		ruleresult.getTranslatedEdges().add(mDefinition__mTypeAccess____returnType);
		mFlowElementToTFlowElement__mDefinition____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mDefinition____source);
		mTypeAccess__mType____type.setSrc(mTypeAccess);
		mTypeAccess__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mTypeAccess__mType____type);
		mType__mTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		ruleresult.getTranslatedEdges().add(mType__mTypeAccess____usagesInTypeAccess);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mFlowElementToTFlowElement__tDefinition____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tDefinition____target);
		tDefinition__tType____returnType.setSrc(tDefinition);
		tDefinition__tType____returnType.setTrg(tType);
		ruleresult.getCreatedEdges().add(tDefinition__tType____returnType);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mDefinition__mSignature____mSignature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodSignature__tDefinition____definitions.setName(tMethodSignature__tDefinition____definitions_name_prime);
		tDefinition__tMethodSignature____signature.setName(tDefinition__tMethodSignature____signature_name_prime);
		mDefinition__mTypeAccess____returnType.setName(mDefinition__mTypeAccess____returnType_name_prime);
		mFlowElementToTFlowElement__mDefinition____source
				.setName(mFlowElementToTFlowElement__mDefinition____source_name_prime);
		mTypeAccess__mType____type.setName(mTypeAccess__mType____type_name_prime);
		mType__mTypeAccess____usagesInTypeAccess.setName(mType__mTypeAccess____usagesInTypeAccess_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mFlowElementToTFlowElement__tDefinition____target
				.setName(mFlowElementToTFlowElement__tDefinition____target_name_prime);
		tDefinition__tType____returnType.setName(tDefinition__tType____returnType_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { ruleresult, tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess, mType, mSignature,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				mDefinition__mTypeAccess____returnType, mFlowElementToTFlowElement__mDefinition____source,
				mTypeAccess__mType____type, mType__mTypeAccess____usagesInTypeAccess,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				mFlowElementToTFlowElement__tDefinition____target, tDefinition__tType____returnType,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__tDefinition____target,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature };
	}

	public static final void pattern_MethodDefinitionReturnSingle_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodDefinitionReturnSingle _this, PerformRuleResult ruleresult, EObject mTypeToTType, EObject tType,
			EObject mDefinitionToTMember, EObject mSignatureToTMethodSignature, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, mTypeToTType, tType, mDefinitionToTMember, mSignatureToTMethodSignature,
				tMethodSignature, tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess,
				mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodDefinitionReturnSingle_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_bindingFB(
			MethodDefinitionReturnSingle _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDefinitionReturnSingle _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDefinitionReturnSingle _this) {
		Object[] result_pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_binding = pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_black = pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDefinitionReturnSingle";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("mTypeAccess");
		EObject _localVariable_2 = match.getObject("mType");
		EObject _localVariable_3 = match.getObject("mSignature");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMTypeAccess = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpMSignature = _localVariable_3;
		if (tmpMDefinition instanceof MMethodDefinition) {
			MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
			if (tmpMTypeAccess instanceof TypeAccess) {
				TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
				if (tmpMType instanceof Type) {
					Type mType = (Type) tmpMType;
					if (tmpMSignature instanceof MMethodSignature) {
						MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
						return new Object[] { mDefinition, mTypeAccess, mType, mSignature, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnSingle_2_2_corematch_blackFFFFBBBBB(
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
			TAbstractType tType = mTypeToTType.getTarget();
			if (tType != null) {
				for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
					TSignature tmpTMethodSignature = mSignatureToTMethodSignature.getTarget();
					if (tmpTMethodSignature instanceof TMethodSignature) {
						TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
						_result.add(new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature,
								mDefinition, mTypeAccess, mType, mSignature, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnSingle_2_3_findcontext_blackBBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mTypeAccess.equals(mDefinition.getReturnType())) {
			if (mType.equals(mTypeAccess.getType())) {
				if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
					if (mSignature.getMDefinitions().contains(mDefinition)) {
						if (tType.equals(mTypeToTType.getTarget())) {
							if (mType.equals(mTypeToTType.getSource())) {
								if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
									_result.add(new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature,
											tMethodSignature, mDefinition, mTypeAccess, mType, mSignature });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mDefinition__mTypeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mDefinition__mTypeAccess____returnType_name_prime = "returnType";
		String mTypeAccess__mType____type_name_prime = "type";
		String mType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mDefinition__mTypeAccess____returnType.setSrc(mDefinition);
		mDefinition__mTypeAccess____returnType.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mDefinition__mTypeAccess____returnType);
		mTypeAccess__mType____type.setSrc(mTypeAccess);
		mTypeAccess__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeAccess__mType____type);
		mType__mTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mTypeAccess____usagesInTypeAccess);
		mSignatureToTMethodSignature__tMethodSignature____target.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__tMethodSignature____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mSignatureToTMethodSignature__mSignature____source.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__mSignature____source);
		mDefinition__mTypeAccess____returnType.setName(mDefinition__mTypeAccess____returnType_name_prime);
		mTypeAccess__mType____type.setName(mTypeAccess__mType____type_name_prime);
		mType__mTypeAccess____usagesInTypeAccess.setName(mType__mTypeAccess____usagesInTypeAccess_name_prime);
		mSignatureToTMethodSignature__tMethodSignature____target
				.setName(mSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mSignatureToTMethodSignature__mSignature____source
				.setName(mSignatureToTMethodSignature__mSignature____source_name_prime);
		return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, mDefinition,
				mTypeAccess, mType, mSignature, isApplicableMatch, mDefinition__mTypeAccess____returnType,
				mTypeAccess__mType____type, mType__mTypeAccess____usagesInTypeAccess,
				mSignatureToTMethodSignature__tMethodSignature____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature, mTypeToTType__tType____target, mTypeToTType__mType____source,
				mSignatureToTMethodSignature__mSignature____source };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_4_solveCSP_bindingFBBBBBBBBBB(
			MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToTType, tType,
				mSignatureToTMethodSignature, tMethodSignature, mDefinition, mTypeAccess, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature,
					tMethodSignature, mDefinition, mTypeAccess, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodDefinitionReturnSingle_2_4_solveCSP_binding = pattern_MethodDefinitionReturnSingle_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature,
				mDefinition, mTypeAccess, mType, mSignature);
		if (result_pattern_MethodDefinitionReturnSingle_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnSingle_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_2_4_solveCSP_black = pattern_MethodDefinitionReturnSingle_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnSingle_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature,
						tMethodSignature, mDefinition, mTypeAccess, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_2_5_checkCSP_expressionFBB(
			MethodDefinitionReturnSingle _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinitionReturnSingle";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinitionReturnSingle_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_10_1_initialbindings_blackBBBBB(
			MethodDefinitionReturnSingle _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		return new Object[] { _this, match, tType, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_bindingFBBBBB(
			MethodDefinitionReturnSingle _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tMethodSignature, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tMethodSignature, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodDefinitionReturnSingle _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		Object[] result_pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_binding = pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tType, tMethodSignature, tDefinition);
		if (result_pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_black = pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnSingle_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tMethodSignature, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_10_3_CheckCSP_expressionFBB(
			MethodDefinitionReturnSingle _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		return new Object[] { match, tType, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		EMoflonEdge tMethodSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tDefinition);
		String tMethodSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tMethodSignature____signature_name_prime = "signature";
		String tDefinition__tType____returnType_name_prime = "returnType";
		tMethodSignature__tDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tMethodSignature__tDefinition____definitions);
		tDefinition__tMethodSignature____signature.setSrc(tDefinition);
		tDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		match.getToBeTranslatedEdges().add(tDefinition__tMethodSignature____signature);
		tDefinition__tType____returnType.setSrc(tDefinition);
		tDefinition__tType____returnType.setTrg(tType);
		match.getToBeTranslatedEdges().add(tDefinition__tType____returnType);
		tMethodSignature__tDefinition____definitions.setName(tMethodSignature__tDefinition____definitions_name_prime);
		tDefinition__tMethodSignature____signature.setName(tDefinition__tMethodSignature____signature_name_prime);
		tDefinition__tType____returnType.setName(tDefinition__tType____returnType_name_prime);
		return new Object[] { match, tType, tMethodSignature, tDefinition, tMethodSignature__tDefinition____definitions,
				tDefinition__tMethodSignature____signature, tDefinition__tType____returnType };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_10_5_collectcontextelements_blackBBBB(Match match,
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		return new Object[] { match, tType, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tType, TMethodSignature tMethodSignature) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tMethodSignature);
		return new Object[] { match, tType, tMethodSignature };
	}

	public static final void pattern_MethodDefinitionReturnSingle_10_6_registerobjectstomatch_expressionBBBBB(
			MethodDefinitionReturnSingle _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tType, tMethodSignature, tDefinition);

	}

	public static final boolean pattern_MethodDefinitionReturnSingle_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignature");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMSignatureToTMethodSignature = _localVariable_2;
		EObject tmpTMethodSignature = _localVariable_3;
		EObject tmpTDefinition = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpMSignature = _localVariable_6;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
					MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
					if (tmpTMethodSignature instanceof TMethodSignature) {
						TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
						if (tmpTDefinition instanceof TMethodDefinition) {
							TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpMSignature instanceof MMethodSignature) {
									MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
									return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature,
											tMethodSignature, tDefinition, mType, mSignature, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_11_1_performtransformation_blackBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition, Type mType, MMethodSignature mSignature,
			MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, tDefinition,
						mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_binding = pattern_MethodDefinitionReturnSingle_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_binding[1];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_binding[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_binding[3];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_binding[5];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_black = pattern_MethodDefinitionReturnSingle_11_1_performtransformation_blackBBBBBBBFBB(
					mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, tDefinition, mType, mSignature,
					_this, isApplicableMatch);
			if (result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinitionReturnSingle_11_1_performtransformation_black[7];

				return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, tDefinition,
						mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_11_1_performtransformation_greenFBFFFFBB(
			TMethodDefinition tDefinition, Type mType, MMethodSignature mSignature) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MMethodDefinition mDefinition = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TypeAccess mTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		mDefinition.setReturnType(mTypeAccess);
		mTypeAccess.setType(mType);
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement, mTypeAccess, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_11_2_collecttranslatedelements_blackBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TypeAccess mTypeAccess) {
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_11_2_collecttranslatedelements_greenFBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TypeAccess mTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getTranslatedElements().add(tDefinition);
		ruleresult.getCreatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedElements().add(mTypeAccess);
		return new Object[] { ruleresult, mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject tType, EObject mDefinitionToTMember,
			EObject mSignatureToTMethodSignature, EObject tMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement, EObject mTypeAccess, EObject mType,
			EObject mSignature) {
		if (!mTypeToTType.equals(tType)) {
			if (!mTypeToTType.equals(tMethodSignature)) {
				if (!mTypeToTType.equals(tDefinition)) {
					if (!mDefinitionToTMember.equals(mTypeToTType)) {
						if (!mDefinitionToTMember.equals(tType)) {
							if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
								if (!mDefinitionToTMember.equals(tMethodSignature)) {
									if (!mDefinitionToTMember.equals(tDefinition)) {
										if (!mDefinitionToTMember.equals(mFlowElementToTFlowElement)) {
											if (!mDefinitionToTMember.equals(mTypeAccess)) {
												if (!mDefinitionToTMember.equals(mType)) {
													if (!mDefinitionToTMember.equals(mSignature)) {
														if (!mSignatureToTMethodSignature.equals(mTypeToTType)) {
															if (!mSignatureToTMethodSignature.equals(tType)) {
																if (!mSignatureToTMethodSignature
																		.equals(tMethodSignature)) {
																	if (!mSignatureToTMethodSignature
																			.equals(tDefinition)) {
																		if (!mSignatureToTMethodSignature
																				.equals(mTypeAccess)) {
																			if (!mSignatureToTMethodSignature
																					.equals(mType)) {
																				if (!tMethodSignature.equals(tType)) {
																					if (!tDefinition.equals(tType)) {
																						if (!tDefinition.equals(
																								tMethodSignature)) {
																							if (!mDefinition.equals(
																									mTypeToTType)) {
																								if (!mDefinition.equals(
																										tType)) {
																									if (!mDefinition
																											.equals(mDefinitionToTMember)) {
																										if (!mDefinition
																												.equals(mSignatureToTMethodSignature)) {
																											if (!mDefinition
																													.equals(tMethodSignature)) {
																												if (!mDefinition
																														.equals(tDefinition)) {
																													if (!mDefinition
																															.equals(mFlowElementToTFlowElement)) {
																														if (!mDefinition
																																.equals(mTypeAccess)) {
																															if (!mDefinition
																																	.equals(mType)) {
																																if (!mDefinition
																																		.equals(mSignature)) {
																																	if (!mBodyToTAnnotation
																																			.equals(mTypeToTType)) {
																																		if (!mBodyToTAnnotation
																																				.equals(tType)) {
																																			if (!mBodyToTAnnotation
																																					.equals(mDefinitionToTMember)) {
																																				if (!mBodyToTAnnotation
																																						.equals(mSignatureToTMethodSignature)) {
																																					if (!mBodyToTAnnotation
																																							.equals(tMethodSignature)) {
																																						if (!mBodyToTAnnotation
																																								.equals(tDefinition)) {
																																							if (!mBodyToTAnnotation
																																									.equals(mDefinition)) {
																																								if (!mBodyToTAnnotation
																																										.equals(mFlowElementToTFlowElement)) {
																																									if (!mBodyToTAnnotation
																																											.equals(mTypeAccess)) {
																																										if (!mBodyToTAnnotation
																																												.equals(mType)) {
																																											if (!mBodyToTAnnotation
																																													.equals(mSignature)) {
																																												if (!mFlowElementToTFlowElement
																																														.equals(mTypeToTType)) {
																																													if (!mFlowElementToTFlowElement
																																															.equals(tType)) {
																																														if (!mFlowElementToTFlowElement
																																																.equals(mSignatureToTMethodSignature)) {
																																															if (!mFlowElementToTFlowElement
																																																	.equals(tMethodSignature)) {
																																																if (!mFlowElementToTFlowElement
																																																		.equals(tDefinition)) {
																																																	if (!mFlowElementToTFlowElement
																																																			.equals(mTypeAccess)) {
																																																		if (!mFlowElementToTFlowElement
																																																				.equals(mType)) {
																																																			if (!mFlowElementToTFlowElement
																																																					.equals(mSignature)) {
																																																				if (!mTypeAccess
																																																						.equals(mTypeToTType)) {
																																																					if (!mTypeAccess
																																																							.equals(tType)) {
																																																						if (!mTypeAccess
																																																								.equals(tMethodSignature)) {
																																																							if (!mTypeAccess
																																																									.equals(tDefinition)) {
																																																								if (!mType
																																																										.equals(mTypeToTType)) {
																																																									if (!mType
																																																											.equals(tType)) {
																																																										if (!mType
																																																												.equals(tMethodSignature)) {
																																																											if (!mType
																																																													.equals(tDefinition)) {
																																																												if (!mType
																																																														.equals(mTypeAccess)) {
																																																													if (!mSignature
																																																															.equals(mTypeToTType)) {
																																																														if (!mSignature
																																																																.equals(tType)) {
																																																															if (!mSignature
																																																																	.equals(mSignatureToTMethodSignature)) {
																																																																if (!mSignature
																																																																		.equals(tMethodSignature)) {
																																																																	if (!mSignature
																																																																			.equals(tDefinition)) {
																																																																		if (!mSignature
																																																																				.equals(mTypeAccess)) {
																																																																			if (!mSignature
																																																																					.equals(mType)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						mTypeToTType,
																																																																						tType,
																																																																						mDefinitionToTMember,
																																																																						mSignatureToTMethodSignature,
																																																																						tMethodSignature,
																																																																						tDefinition,
																																																																						mDefinition,
																																																																						mBodyToTAnnotation,
																																																																						mFlowElementToTFlowElement,
																																																																						mTypeAccess,
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

	public static final Object[] pattern_MethodDefinitionReturnSingle_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		EMoflonEdge tMethodSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mTypeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDefinitionReturnSingle";
		String tMethodSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tMethodSignature____signature_name_prime = "signature";
		String mDefinition__mTypeAccess____returnType_name_prime = "returnType";
		String mFlowElementToTFlowElement__mDefinition____source_name_prime = "source";
		String mTypeAccess__mType____type_name_prime = "type";
		String mType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mFlowElementToTFlowElement__tDefinition____target_name_prime = "target";
		String tDefinition__tType____returnType_name_prime = "returnType";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		tMethodSignature__tDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tMethodSignature__tDefinition____definitions);
		tDefinition__tMethodSignature____signature.setSrc(tDefinition);
		tDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getTranslatedEdges().add(tDefinition__tMethodSignature____signature);
		mDefinition__mTypeAccess____returnType.setSrc(mDefinition);
		mDefinition__mTypeAccess____returnType.setTrg(mTypeAccess);
		ruleresult.getCreatedEdges().add(mDefinition__mTypeAccess____returnType);
		mFlowElementToTFlowElement__mDefinition____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mDefinition____source);
		mTypeAccess__mType____type.setSrc(mTypeAccess);
		mTypeAccess__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeAccess__mType____type);
		mType__mTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		ruleresult.getCreatedEdges().add(mType__mTypeAccess____usagesInTypeAccess);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mFlowElementToTFlowElement__tDefinition____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tDefinition____target);
		tDefinition__tType____returnType.setSrc(tDefinition);
		tDefinition__tType____returnType.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tDefinition__tType____returnType);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mDefinition__mSignature____mSignature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodSignature__tDefinition____definitions.setName(tMethodSignature__tDefinition____definitions_name_prime);
		tDefinition__tMethodSignature____signature.setName(tDefinition__tMethodSignature____signature_name_prime);
		mDefinition__mTypeAccess____returnType.setName(mDefinition__mTypeAccess____returnType_name_prime);
		mFlowElementToTFlowElement__mDefinition____source
				.setName(mFlowElementToTFlowElement__mDefinition____source_name_prime);
		mTypeAccess__mType____type.setName(mTypeAccess__mType____type_name_prime);
		mType__mTypeAccess____usagesInTypeAccess.setName(mType__mTypeAccess____usagesInTypeAccess_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mFlowElementToTFlowElement__tDefinition____target
				.setName(mFlowElementToTFlowElement__tDefinition____target_name_prime);
		tDefinition__tType____returnType.setName(tDefinition__tType____returnType_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { ruleresult, tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess, mType, mSignature,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				mDefinition__mTypeAccess____returnType, mFlowElementToTFlowElement__mDefinition____source,
				mTypeAccess__mType____type, mType__mTypeAccess____usagesInTypeAccess,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				mFlowElementToTFlowElement__tDefinition____target, tDefinition__tType____returnType,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__tDefinition____target,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature };
	}

	public static final void pattern_MethodDefinitionReturnSingle_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodDefinitionReturnSingle _this, PerformRuleResult ruleresult, EObject mTypeToTType, EObject tType,
			EObject mDefinitionToTMember, EObject mSignatureToTMethodSignature, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, mTypeToTType, tType, mDefinitionToTMember, mSignatureToTMethodSignature,
				tMethodSignature, tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess,
				mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodDefinitionReturnSingle_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_bindingFB(
			MethodDefinitionReturnSingle _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDefinitionReturnSingle _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDefinitionReturnSingle _this) {
		Object[] result_pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_binding = pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_black = pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDefinitionReturnSingle";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("tMethodSignature");
		EObject _localVariable_2 = match.getObject("tDefinition");
		EObject tmpTType = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpTDefinition instanceof TMethodDefinition) {
					TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
					return new Object[] { tType, tMethodSignature, tDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnSingle_12_2_corematch_blackFBFBBFFB(
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tDefinition_upperBound = tDefinition.getUpperBound();
		if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(1))) {
			int tDefinition_lowerBound = tDefinition.getLowerBound();
			if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
				for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMethodSignature, MSignatureToTSignature.class, "target")) {
					MSignature tmpMSignature = mSignatureToTMethodSignature.getSource();
					if (tmpMSignature instanceof MMethodSignature) {
						MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
						for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
							Type mType = mTypeToTType.getSource();
							if (mType != null) {
								_result.add(new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature,
										tMethodSignature, tDefinition, mType, mSignature, match });
							}

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnSingle_12_3_findcontext_blackBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition, Type mType, MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethodSignature.getDefinitions().contains(tDefinition)) {
			if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
				if (tType.equals(tDefinition.getReturnType())) {
					if (tType.equals(mTypeToTType.getTarget())) {
						if (mType.equals(mTypeToTType.getSource())) {
							if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
								int tDefinition_upperBound = tDefinition.getUpperBound();
								if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(1))) {
									int tDefinition_lowerBound = tDefinition.getLowerBound();
									if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
										_result.add(new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature,
												tMethodSignature, tDefinition, mType, mSignature });
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

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition, Type mType, MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMethodSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tMethodSignature____signature_name_prime = "signature";
		String mSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String tDefinition__tType____returnType_name_prime = "returnType";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		tMethodSignature__tDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tMethodSignature__tDefinition____definitions);
		tDefinition__tMethodSignature____signature.setSrc(tDefinition);
		tDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tMethodSignature____signature);
		mSignatureToTMethodSignature__tMethodSignature____target.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__tMethodSignature____target);
		tDefinition__tType____returnType.setSrc(tDefinition);
		tDefinition__tType____returnType.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tDefinition__tType____returnType);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mSignatureToTMethodSignature__mSignature____source.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__mSignature____source);
		tMethodSignature__tDefinition____definitions.setName(tMethodSignature__tDefinition____definitions_name_prime);
		tDefinition__tMethodSignature____signature.setName(tDefinition__tMethodSignature____signature_name_prime);
		mSignatureToTMethodSignature__tMethodSignature____target
				.setName(mSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		tDefinition__tType____returnType.setName(tDefinition__tType____returnType_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mSignatureToTMethodSignature__mSignature____source
				.setName(mSignatureToTMethodSignature__mSignature____source_name_prime);
		return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, tDefinition, mType,
				mSignature, isApplicableMatch, tMethodSignature__tDefinition____definitions,
				tDefinition__tMethodSignature____signature, mSignatureToTMethodSignature__tMethodSignature____target,
				tDefinition__tType____returnType, mTypeToTType__tType____target, mTypeToTType__mType____source,
				mSignatureToTMethodSignature__mSignature____source };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_4_solveCSP_bindingFBBBBBBBBB(
			MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mTypeToTType, tType,
				mSignatureToTMethodSignature, tMethodSignature, tDefinition, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature,
					tMethodSignature, tDefinition, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodDefinitionReturnSingle_12_4_solveCSP_binding = pattern_MethodDefinitionReturnSingle_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature,
				tDefinition, mType, mSignature);
		if (result_pattern_MethodDefinitionReturnSingle_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnSingle_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_12_4_solveCSP_black = pattern_MethodDefinitionReturnSingle_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnSingle_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature,
						tMethodSignature, tDefinition, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_12_5_checkCSP_expressionFBB(
			MethodDefinitionReturnSingle _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinitionReturnSingle";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinitionReturnSingle_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_bindingFB(
			MethodDefinitionReturnSingle _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDefinitionReturnSingle _this) {
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

	public static final Object[] pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDefinitionReturnSingle _this) {
		Object[] result_pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_binding = pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_black = pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_20_2_testcorematchandDECs_black_nac_0BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_signature_973172 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_973172 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_signature_973172)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnSingle_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodSignature = _edge_definitions.getSrc();
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			EObject tmpTDefinition = _edge_definitions.getTrg();
			if (tmpTDefinition instanceof TMethodDefinition) {
				TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
				if (tMethodSignature.getDefinitions().contains(tDefinition)) {
					TAbstractType tType = tDefinition.getReturnType();
					if (tType != null) {
						int tDefinition_upperBound = tDefinition.getUpperBound();
						if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(1))) {
							int tDefinition_lowerBound = tDefinition.getLowerBound();
							if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
								if (pattern_MethodDefinitionReturnSingle_20_2_testcorematchandDECs_black_nac_0BB(
										tDefinition, tMethodSignature) == null) {
									_result.add(
											new Object[] { tType, tMethodSignature, tDefinition, _edge_definitions });
								}
							}

						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinitionReturnSingle_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodDefinitionReturnSingle _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tMethodSignature, tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDefinitionReturnSingle _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDefinitionReturnSingle_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_bindingFB(
			MethodDefinitionReturnSingle _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDefinitionReturnSingle _this) {
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

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDefinitionReturnSingle _this) {
		Object[] result_pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_binding = pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_black = pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_0BB(
			MMethodDefinition mDefinition, MMethodSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_245317 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_245317 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_245317)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_1BB(
			TypeAccess mTypeAccess, Type mType) {
		for (AbstractTypeDeclaration __DEC_mTypeAccess_superInterfaces_567650 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mType.equals(__DEC_mTypeAccess_superInterfaces_567650)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess mTypeAccess) {
		for (Annotation __DEC_mTypeAccess_type_605406 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, Annotation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess mTypeAccess, Type mType) {
		for (ArrayType __DEC_mTypeAccess_elementType_870937 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_mTypeAccess_elementType_870937)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess mTypeAccess) {
		for (ClassInstanceCreation __DEC_mTypeAccess_type_446871 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_5BB(
			TypeAccess mTypeAccess, Type mType) {
		for (ClassDeclaration __DEC_mTypeAccess_superClass_592185 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_mTypeAccess_superClass_592185)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_6BB(
			TypeAccess mTypeAccess, Type mType) {
		for (ParameterizedType __DEC_mTypeAccess_type_799402 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mTypeAccess_type_799402)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess mTypeAccess) {
		for (TypeLiteral __DEC_mTypeAccess_type_773272 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess mTypeAccess) {
		for (AnnotationMemberValuePair __DEC_mTypeAccess_value_435665 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMDefinition = _edge_returnType.getSrc();
		if (tmpMDefinition instanceof MMethodDefinition) {
			MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
			EObject tmpMTypeAccess = _edge_returnType.getTrg();
			if (tmpMTypeAccess instanceof TypeAccess) {
				TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
				if (mTypeAccess.equals(mDefinition.getReturnType())) {
					MSignature tmpMSignature = mDefinition.getMSignature();
					if (tmpMSignature instanceof MMethodSignature) {
						MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
						Type mType = mTypeAccess.getType();
						if (mType != null) {
							if (pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_2B(
									mTypeAccess) == null) {
								if (pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_4B(
										mTypeAccess) == null) {
									if (pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_7B(
											mTypeAccess) == null) {
										if (pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_8B(
												mTypeAccess) == null) {
											if (pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_0BB(
													mDefinition, mSignature) == null) {
												if (pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_1BB(
														mTypeAccess, mType) == null) {
													if (pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_3BB(
															mTypeAccess, mType) == null) {
														if (pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_5BB(
																mTypeAccess, mType) == null) {
															if (pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_black_nac_6BB(
																	mTypeAccess, mType) == null) {
																_result.add(new Object[] { mDefinition, mTypeAccess,
																		mType, mSignature, _edge_returnType });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinitionReturnSingle_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			MethodDefinitionReturnSingle _this, Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mTypeAccess, mType, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDefinitionReturnSingle _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDefinitionReturnSingle_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_1_prepare_blackB(
			MethodDefinitionReturnSingle _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tType");
		EObject _localVariable_1 = targetMatch.getObject("tMethodSignature");
		EObject _localVariable_2 = targetMatch.getObject("tDefinition");
		EObject _localVariable_3 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_4 = sourceMatch.getObject("mTypeAccess");
		EObject _localVariable_5 = sourceMatch.getObject("mType");
		EObject _localVariable_6 = sourceMatch.getObject("mSignature");
		EObject tmpTType = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpMTypeAccess = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpMSignature = _localVariable_6;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpTDefinition instanceof TMethodDefinition) {
					TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
					if (tmpMDefinition instanceof MMethodDefinition) {
						MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
						if (tmpMTypeAccess instanceof TypeAccess) {
							TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpMSignature instanceof MMethodSignature) {
									MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
									return new Object[] { tType, tMethodSignature, tDefinition, mDefinition,
											mTypeAccess, mType, mSignature, targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tDefinition_upperBound = tDefinition.getUpperBound();
			if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(1))) {
				int tDefinition_lowerBound = tDefinition.getLowerBound();
				if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
					return new Object[] { tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType,
							mSignature, sourceMatch, targetMatch };
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_binding = pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_binding != null) {
			TAbstractType tType = (TAbstractType) result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_binding[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_binding[1];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_binding[2];
			MMethodDefinition mDefinition = (MMethodDefinition) result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_binding[3];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_binding[4];
			Type mType = (Type) result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_binding[5];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_black = pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature, sourceMatch,
					targetMatch);
			if (result_pattern_MethodDefinitionReturnSingle_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_3_solvecsp_bindingFBBBBBBBBBB(
			MethodDefinitionReturnSingle _this, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(tType, tMethodSignature, tDefinition, mDefinition,
				mTypeAccess, mType, mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType,
					mSignature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			MethodDefinitionReturnSingle _this, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodDefinitionReturnSingle_24_3_solvecsp_binding = pattern_MethodDefinitionReturnSingle_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature, sourceMatch,
				targetMatch);
		if (result_pattern_MethodDefinitionReturnSingle_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnSingle_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_24_3_solvecsp_black = pattern_MethodDefinitionReturnSingle_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnSingle_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType,
						mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnSingle_24_5_matchcorrcontext_blackFBFBBBBB(
			TAbstractType tType, TMethodSignature tMethodSignature, Type mType, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMethodSignature, MSignatureToTSignature.class, "target")) {
				if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
						if (mType.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature,
									tMethodSignature, mType, mSignature, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTMethodSignature, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodDefinitionReturnSingle";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mSignatureToTMethodSignature, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_6_createcorrespondence_blackBBBBBBBB(
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature,
			CCMatch ccMatch) {
		return new Object[] { tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature,
				ccMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_6_createcorrespondence_greenFBBFFB(
			TMethodDefinition tDefinition, MMethodDefinition mDefinition, CCMatch ccMatch) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTMember);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement, ccMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodDefinitionReturnSingle";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinitionReturnSingle_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_0BB(
			MMethodDefinition mDefinition, MMethodSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_504159 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_504159 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_504159)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_1BB(
			TypeAccess mTypeAccess, Type mType) {
		for (AbstractTypeDeclaration __DEC_mTypeAccess_superInterfaces_246156 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mType.equals(__DEC_mTypeAccess_superInterfaces_246156)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_2B(
			TypeAccess mTypeAccess) {
		for (Annotation __DEC_mTypeAccess_type_411903 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, Annotation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_3BB(
			TypeAccess mTypeAccess, Type mType) {
		for (ArrayType __DEC_mTypeAccess_elementType_828744 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_mTypeAccess_elementType_828744)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_4B(
			TypeAccess mTypeAccess) {
		for (ClassInstanceCreation __DEC_mTypeAccess_type_90186 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_5BB(
			TypeAccess mTypeAccess, Type mType) {
		for (ClassDeclaration __DEC_mTypeAccess_superClass_383717 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_mTypeAccess_superClass_383717)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_6BB(
			TypeAccess mTypeAccess, Type mType) {
		for (ParameterizedType __DEC_mTypeAccess_type_639997 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mTypeAccess_type_639997)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_7B(
			TypeAccess mTypeAccess) {
		for (TypeLiteral __DEC_mTypeAccess_type_688958 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_8B(
			TypeAccess mTypeAccess) {
		for (AnnotationMemberValuePair __DEC_mTypeAccess_value_240980 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_blackBBBB(
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {
		if (mTypeAccess.equals(mDefinition.getReturnType())) {
			if (mType.equals(mTypeAccess.getType())) {
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					if (pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_0BB(mDefinition,
							mSignature) == null) {
						if (pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_1BB(mTypeAccess,
								mType) == null) {
							if (pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_2B(
									mTypeAccess) == null) {
								if (pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_3BB(mTypeAccess,
										mType) == null) {
									if (pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_4B(
											mTypeAccess) == null) {
										if (pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_5BB(
												mTypeAccess, mType) == null) {
											if (pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_6BB(
													mTypeAccess, mType) == null) {
												if (pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_7B(
														mTypeAccess) == null) {
													if (pattern_MethodDefinitionReturnSingle_27_1_matchtggpattern_black_nac_8B(
															mTypeAccess) == null) {
														return new Object[] { mDefinition, mTypeAccess, mType,
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
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_28_1_matchtggpattern_black_nac_0BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_signature_637709 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_637709 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_signature_637709)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_28_1_matchtggpattern_blackBBB(TAbstractType tType,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		if (tMethodSignature.getDefinitions().contains(tDefinition)) {
			if (tType.equals(tDefinition.getReturnType())) {
				if (pattern_MethodDefinitionReturnSingle_28_1_matchtggpattern_black_nac_0BB(tDefinition,
						tMethodSignature) == null) {
					return new Object[] { tType, tMethodSignature, tDefinition };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_28_1_matchtggpattern_greenB(
			TMethodDefinition tDefinition) {
		int tDefinition_upperBound_prime = Integer.valueOf(1);
		int tDefinition_lowerBound_prime = Integer.valueOf(0);
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		return new Object[] { tDefinition };
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_1_createresult_blackB(
			MethodDefinitionReturnSingle _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTMethodSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTMethodSignature)) {
			return new Object[] { ruleResult, mSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tMethodSignature) {
		if (ruleResult.getTargetObjects().contains(tMethodSignature)) {
			return new Object[] { ruleResult, tMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mSignatureToTMethodSignatureList : ruleEntryContainer.getRuleEntryList()) {
				if (!mSignatureToTMethodSignatureList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							Type mType = mTypeToTType.getSource();
							if (mType != null) {
								TAbstractType tType = mTypeToTType.getTarget();
								if (tType != null) {
									if (pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, mTypeToTType) == null) {
										if (pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, mType) == null) {
											if (pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tType) == null) {
												for (EObject tmpMSignatureToTMethodSignature : mSignatureToTMethodSignatureList
														.getEntryObjects()) {
													if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
														MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
														TSignature tmpTMethodSignature = mSignatureToTMethodSignature
																.getTarget();
														if (tmpTMethodSignature instanceof TMethodSignature) {
															TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
															MSignature tmpMSignature = mSignatureToTMethodSignature
																	.getSource();
															if (tmpMSignature instanceof MMethodSignature) {
																MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
																if (pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult,
																		mSignatureToTMethodSignature) == null) {
																	if (pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, tMethodSignature) == null) {
																		if (pattern_MethodDefinitionReturnSingle_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mSignature) == null) {
																			_result.add(new Object[] { mTypeToTTypeList,
																					mTypeToTType, mType, tType,
																					mSignatureToTMethodSignatureList,
																					mSignatureToTMethodSignature,
																					tMethodSignature, mSignature,
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

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_3_solveCSP_bindingFBBBBBBBBB(
			MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			Type mType, MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, tType,
				mSignatureToTMethodSignature, tMethodSignature, mType, mSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature,
					tMethodSignature, mType, mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodDefinitionReturnSingle _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			Type mType, MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodDefinitionReturnSingle_29_3_solveCSP_binding = pattern_MethodDefinitionReturnSingle_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, mType,
				mSignature, ruleResult);
		if (result_pattern_MethodDefinitionReturnSingle_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnSingle_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnSingle_29_3_solveCSP_black = pattern_MethodDefinitionReturnSingle_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnSingle_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mSignatureToTMethodSignature,
						tMethodSignature, mType, mSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnSingle_29_4_checkCSP_expressionFBB(
			MethodDefinitionReturnSingle _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_5_checknacs_blackBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, Type mType, MMethodSignature mSignature) {
		return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_6_perform_blackBBBBBBB(
			TypeToTAbstractType mTypeToTType, TAbstractType tType, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mTypeToTType, tType, mSignatureToTMethodSignature, tMethodSignature, mType, mSignature,
				ruleResult };
	}

	public static final Object[] pattern_MethodDefinitionReturnSingle_29_6_perform_greenBFBFFFFFBBB(TAbstractType tType,
			TMethodSignature tMethodSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		MMethodDefinition mDefinition = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TypeAccess mTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		int tDefinition_upperBound_prime = Integer.valueOf(1);
		int tDefinition_lowerBound_prime = Integer.valueOf(0);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		tMethodSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		tDefinition.setReturnType(tType);
		ruleResult.getTargetObjects().add(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		mDefinition.setReturnType(mTypeAccess);
		mTypeAccess.setType(mType);
		ruleResult.getSourceObjects().add(mTypeAccess);
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement, mTypeAccess, mType, mSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodDefinitionReturnSingle_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodDefinitionReturnSingleImpl
