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

import org.gravity.tgg.modisco.pm.Rules.MethodDefinitionReturnArray;
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
 * An implementation of the model object '<em><b>Method Definition Return Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionReturnArrayImpl extends AbstractRuleImpl implements MethodDefinitionReturnArray {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDefinitionReturnArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodDefinitionReturnArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess mArrayTypeAccess, ArrayType mType, Type mTypeOfArray,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {

		Object[] result1_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_0_1_initialbindings_blackBBBBBBBB(this, match, mArrayTypeAccess,
						mType, mTypeOfArray, mDefinition, mTypeAccess, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mArrayTypeAccess] = " + mArrayTypeAccess + ", " + "[mType] = "
					+ mType + ", " + "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mTypeAccess] = " + mTypeAccess + ", " + "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(this, match,
						mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mArrayTypeAccess] = " + mArrayTypeAccess + ", " + "[mType] = "
					+ mType + ", " + "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mTypeAccess] = " + mTypeAccess + ", " + "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_0_4_collectelementstobetranslated_blackBBBBBBB(match,
							mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mArrayTypeAccess] = " + mArrayTypeAccess + ", " + "[mType] = " + mType + ", "
						+ "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mTypeAccess] = " + mTypeAccess + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_0_4_collectelementstobetranslated_greenBBBBBFFFFF(match, mType,
							mDefinition, mTypeAccess, mSignature);
			//nothing EMoflonEdge mDefinition__mTypeAccess____returnType = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result4_green[9];

			Object[] result5_black = MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_0_5_collectcontextelements_blackBBBBBBB(match,
							mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mArrayTypeAccess] = " + mArrayTypeAccess + ", " + "[mType] = " + mType + ", "
						+ "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mTypeAccess] = " + mTypeAccess + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_0_5_collectcontextelements_greenBBBBBFFF(match,
							mArrayTypeAccess, mType, mTypeOfArray, mSignature);
			//nothing EMoflonEdge mArrayTypeAccess__mTypeOfArray____type = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge mType__mArrayTypeAccess____elementType = (EMoflonEdge) result5_green[7];

			// 
			MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_0_6_registerobjectstomatch_expressionBBBBBBBB(this, match,
							mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess, mSignature);
			return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_0_7_expressionF();
		} else {
			return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TypeAccess mArrayTypeAccess = (TypeAccess) result1_bindingAndBlack[2];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[3];
		ArrayType mType = (ArrayType) result1_bindingAndBlack[4];
		Type mTypeOfArray = (Type) result1_bindingAndBlack[5];
		MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[6];
		MMethodDefinition mDefinition = (MMethodDefinition) result1_bindingAndBlack[7];
		TypeAccess mTypeAccess = (TypeAccess) result1_bindingAndBlack[8];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_1_1_performtransformation_greenBFBFFBF(tType, tMethodSignature,
						mDefinition);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[1];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_green[4];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[6];

		Object[] result2_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_1_2_collecttranslatedelements_blackBBBBBB(mDefinitionToTMember,
						mFlowElementToTFlowElement, tDefinition, mDefinition, mBodyToTAnnotation, mTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement
					+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mTypeAccess] = " + mTypeAccess + ".");
		}
		Object[] result2_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_1_2_collecttranslatedelements_greenFBBBBBB(mDefinitionToTMember,
						mFlowElementToTFlowElement, tDefinition, mDefinition, mBodyToTAnnotation, mTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult, tType,
						mTypeToTType, mDefinitionToTMember, mArrayTypeAccess, tMethodSignature,
						mFlowElementToTFlowElement, mType, mTypeOfArray, mSignatureToTMethodSignature, tDefinition,
						mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mArrayTypeAccess] = "
					+ mArrayTypeAccess + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mType] = " + mType
					+ ", " + "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mSignatureToTMethodSignature] = "
					+ mSignatureToTMethodSignature + ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mSignature] = " + mSignature + ".");
		}
		MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult,
						tType, mDefinitionToTMember, tMethodSignature, mFlowElementToTFlowElement, mType, tDefinition,
						mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature);
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
		MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this, ruleresult,
						tType, mTypeToTType, mDefinitionToTMember, mArrayTypeAccess, tMethodSignature,
						mFlowElementToTFlowElement, mType, mTypeOfArray, mSignatureToTMethodSignature, tDefinition,
						mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature);
		return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_2_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess mArrayTypeAccess = (TypeAccess) result2_binding[0];
		ArrayType mType = (ArrayType) result2_binding[1];
		Type mTypeOfArray = (Type) result2_binding[2];
		MMethodDefinition mDefinition = (MMethodDefinition) result2_binding[3];
		TypeAccess mTypeAccess = (TypeAccess) result2_binding[4];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[5];
		for (Object[] result2_black : MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_2_2_corematch_blackFFBFBBFBBBB(mArrayTypeAccess, mType,
						mTypeOfArray, mDefinition, mTypeAccess, mSignature, match)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[3];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_2_3_findcontext_blackBBBBBBBBBB(tType, mTypeToTType,
							mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature,
							mDefinition, mTypeAccess, mSignature)) {
				Object[] result3_green = MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFF(tType,
								mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
								mSignatureToTMethodSignature, mDefinition, mTypeAccess, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge mArrayTypeAccess__mTypeOfArray____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mDefinition__mTypeAccess____returnType = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mType__mArrayTypeAccess____elementType = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mTypeToTType__mTypeOfArray____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge mSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[22];

				Object[] result4_bindingAndBlack = MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType,
								mTypeOfArray, mSignatureToTMethodSignature, mDefinition, mTypeAccess, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mArrayTypeAccess] = " + mArrayTypeAccess
							+ ", " + "[tMethodSignature] = " + tMethodSignature + ", " + "[mType] = " + mType + ", "
							+ "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mSignatureToTMethodSignature] = "
							+ mSignatureToTMethodSignature + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mTypeAccess] = " + mTypeAccess + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodDefinitionReturnArrayImpl
							.pattern_MethodDefinitionReturnArray_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDefinitionReturnArrayImpl
							.pattern_MethodDefinitionReturnArray_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess mArrayTypeAccess, ArrayType mType, Type mTypeOfArray,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {
		match.registerObject("mArrayTypeAccess", mArrayTypeAccess);
		match.registerObject("mType", mType);
		match.registerObject("mTypeOfArray", mTypeOfArray);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mTypeAccess", mTypeAccess);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess mArrayTypeAccess, ArrayType mType, Type mTypeOfArray,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mArrayTypeAccess", mArrayTypeAccess);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mTypeOfArray", mTypeOfArray);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mTypeAccess", mTypeAccess);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject mArrayTypeAccess, EObject tMethodSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject mTypeOfArray,
			EObject mSignatureToTMethodSignature, EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation,
			EObject mTypeAccess, EObject mSignature) {
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mArrayTypeAccess", mArrayTypeAccess);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mTypeOfArray", mTypeOfArray);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mTypeAccess", mTypeAccess);
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

		Object[] result1_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_10_1_initialbindings_blackBBBBB(this, match, tType,
						tMethodSignature, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}

		Object[] result2_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tType,
						tMethodSignature, tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_10_4_collectelementstobetranslated_blackBBBB(match, tType,
							tMethodSignature, tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_10_4_collectelementstobetranslated_greenBBBBFFF(match, tType,
							tMethodSignature, tDefinition);
			//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tDefinition__tType____returnType = (EMoflonEdge) result4_green[6];

			Object[] result5_black = MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_10_5_collectcontextelements_blackBBBB(match, tType,
							tMethodSignature, tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_10_5_collectcontextelements_greenBBB(
					match, tType, tMethodSignature);

			// 
			MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_10_6_registerobjectstomatch_expressionBBBBB(this, match, tType,
							tMethodSignature, tDefinition);
			return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_10_7_expressionF();
		} else {
			return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TypeAccess mArrayTypeAccess = (TypeAccess) result1_bindingAndBlack[2];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[3];
		ArrayType mType = (ArrayType) result1_bindingAndBlack[4];
		Type mTypeOfArray = (Type) result1_bindingAndBlack[5];
		MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[6];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_bindingAndBlack[7];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_11_1_performtransformation_greenFFBBFFFB(mType, tDefinition,
						mSignature);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[1];
		MMethodDefinition mDefinition = (MMethodDefinition) result1_green[4];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[5];
		TypeAccess mTypeAccess = (TypeAccess) result1_green[6];

		Object[] result2_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_11_2_collecttranslatedelements_blackBBBBBB(mDefinitionToTMember,
						mFlowElementToTFlowElement, tDefinition, mDefinition, mBodyToTAnnotation, mTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement
					+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mTypeAccess] = " + mTypeAccess + ".");
		}
		Object[] result2_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_11_2_collecttranslatedelements_greenFBBBBBB(mDefinitionToTMember,
						mFlowElementToTFlowElement, tDefinition, mDefinition, mBodyToTAnnotation, mTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult, tType,
						mTypeToTType, mDefinitionToTMember, mArrayTypeAccess, tMethodSignature,
						mFlowElementToTFlowElement, mType, mTypeOfArray, mSignatureToTMethodSignature, tDefinition,
						mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mArrayTypeAccess] = "
					+ mArrayTypeAccess + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mType] = " + mType
					+ ", " + "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mSignatureToTMethodSignature] = "
					+ mSignatureToTMethodSignature + ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mSignature] = " + mSignature + ".");
		}
		MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult,
						tType, mDefinitionToTMember, tMethodSignature, mFlowElementToTFlowElement, mType, tDefinition,
						mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature);
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
		MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this, ruleresult,
						tType, mTypeToTType, mDefinitionToTMember, mArrayTypeAccess, tMethodSignature,
						mFlowElementToTFlowElement, mType, mTypeOfArray, mSignatureToTMethodSignature, tDefinition,
						mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature);
		return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tType = (TAbstractType) result2_binding[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result2_binding[2];
		for (Object[] result2_black : MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_12_2_corematch_blackBFBFFBFB(tType, tMethodSignature, tDefinition,
						match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			Type mTypeOfArray = (Type) result2_black[3];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[4];
			MMethodSignature mSignature = (MMethodSignature) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_12_3_findcontext_blackBBFBFBBBB(tType, mTypeToTType,
							tMethodSignature, mTypeOfArray, mSignatureToTMethodSignature, tDefinition, mSignature)) {
				TypeAccess mArrayTypeAccess = (TypeAccess) result3_black[2];
				ArrayType mType = (ArrayType) result3_black[4];
				Object[] result3_green = MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(tType,
								mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
								mSignatureToTMethodSignature, tDefinition, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mArrayTypeAccess__mTypeOfArray____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mType__mArrayTypeAccess____elementType = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tDefinition__tType____returnType = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToTType__mTypeOfArray____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[19];

				Object[] result4_bindingAndBlack = MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType,
								mTypeOfArray, mSignatureToTMethodSignature, tDefinition, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mArrayTypeAccess] = " + mArrayTypeAccess
							+ ", " + "[tMethodSignature] = " + tMethodSignature + ", " + "[mType] = " + mType + ", "
							+ "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mSignatureToTMethodSignature] = "
							+ mSignatureToTMethodSignature + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodDefinitionReturnArrayImpl
							.pattern_MethodDefinitionReturnArray_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDefinitionReturnArrayImpl
							.pattern_MethodDefinitionReturnArray_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_12_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodDefinition tDefinition, MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mArrayTypeAccess", mArrayTypeAccess);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mTypeOfArray", mTypeOfArray);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject mArrayTypeAccess, EObject tMethodSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject mTypeOfArray,
			EObject mSignatureToTMethodSignature, EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation,
			EObject mTypeAccess, EObject mSignature) {
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mArrayTypeAccess", mArrayTypeAccess);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mTypeOfArray", mTypeOfArray);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mTypeAccess", mTypeAccess);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_732(EMoflonEdge _edge_definitions) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_20_2_testcorematchandDECs_blackFFFB(_edge_definitions)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TMethodDefinition tDefinition = (TMethodDefinition) result2_black[2];
			Object[] result2_green = MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tType, tMethodSignature, tDefinition)) {
				// 
				if (MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodDefinitionReturnArrayImpl
							.pattern_MethodDefinitionReturnArray_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDefinitionReturnArrayImpl
							.pattern_MethodDefinitionReturnArray_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_752(EMoflonEdge _edge_returnType) {

		Object[] result1_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_blackFFFFFFB(_edge_returnType)) {
			TypeAccess mArrayTypeAccess = (TypeAccess) result2_black[0];
			ArrayType mType = (ArrayType) result2_black[1];
			Type mTypeOfArray = (Type) result2_black[2];
			MMethodDefinition mDefinition = (MMethodDefinition) result2_black[3];
			TypeAccess mTypeAccess = (TypeAccess) result2_black[4];
			MMethodSignature mSignature = (MMethodSignature) result2_black[5];
			Object[] result2_green = MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
							this, match, mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess, mSignature)) {
				// 
				if (MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodDefinitionReturnArrayImpl
							.pattern_MethodDefinitionReturnArray_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDefinitionReturnArrayImpl
							.pattern_MethodDefinitionReturnArray_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodDefinitionReturnArray");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tDefinition", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tDefinition", "upperBound", -1, ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("MethodDefinitionReturnArray");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tDefinition", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tDefinition", "upperBound", -1, ComparingOperator.EQUAL)) {
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

		Object[] result1_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[0];
		TypeAccess mArrayTypeAccess = (TypeAccess) result2_bindingAndBlack[1];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_bindingAndBlack[2];
		ArrayType mType = (ArrayType) result2_bindingAndBlack[3];
		Type mTypeOfArray = (Type) result2_bindingAndBlack[4];
		TMethodDefinition tDefinition = (TMethodDefinition) result2_bindingAndBlack[5];
		MMethodDefinition mDefinition = (MMethodDefinition) result2_bindingAndBlack[6];
		TypeAccess mTypeAccess = (TypeAccess) result2_bindingAndBlack[7];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[8];

		Object[] result3_bindingAndBlack = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(this, tType,
						mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray, tDefinition, mDefinition, mTypeAccess,
						mSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[tType] = " + tType
							+ ", " + "[mArrayTypeAccess] = " + mArrayTypeAccess + ", " + "[tMethodSignature] = "
							+ tMethodSignature + ", " + "[mType] = " + mType + ", " + "[mTypeOfArray] = " + mTypeOfArray
							+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mTypeAccess] = " + mTypeAccess + ", " + "[mSignature] = " + mSignature + ", "
							+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_24_5_matchcorrcontext_blackBFBBFBBB(tType, tMethodSignature,
							mTypeOfArray, mSignature, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[1];
				MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result5_black[4];
				Object[] result5_green = MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_24_5_matchcorrcontext_greenBBBBF(mTypeToTType,
								mSignatureToTMethodSignature, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_24_6_createcorrespondence_blackBBBBBBBBBB(tType,
								mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray, tDefinition, mDefinition,
								mTypeAccess, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
							+ "[mArrayTypeAccess] = " + mArrayTypeAccess + ", " + "[tMethodSignature] = "
							+ tMethodSignature + ", " + "[mType] = " + mType + ", " + "[mTypeOfArray] = " + mTypeOfArray
							+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mTypeAccess] = " + mTypeAccess + ", " + "[mSignature] = " + mSignature + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_24_6_createcorrespondence_greenFFBBFB(tDefinition,
								mDefinition, ccMatch);
				//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[0];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[4];

				Object[] result7_black = MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TAbstractType tType, TypeAccess mArrayTypeAccess,
			TMethodSignature tMethodSignature, ArrayType mType, Type mTypeOfArray, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess mArrayTypeAccess, ArrayType mType, Type mTypeOfArray,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {// 
		Object[] result1_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_blackBBBBBB(mArrayTypeAccess, mType,
						mTypeOfArray, mDefinition, mTypeAccess, mSignature);
		if (result1_black != null) {
			return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_27_2_expressionF();
		} else {
			return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {// 
		Object[] result1_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_28_1_matchtggpattern_blackBBB(tType, tMethodSignature,
						tDefinition);
		if (result1_black != null) {
			MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_28_1_matchtggpattern_greenB(tDefinition);

			return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_28_2_expressionF();
		} else {
			return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MSignatureToTSignature mSignatureToTMethodSignatureParameter) {

		Object[] result1_black = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodDefinitionReturnArrayImpl
				.pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_blackFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			Type mTypeOfArray = (Type) result2_black[3];
			TypeAccess mArrayTypeAccess = (TypeAccess) result2_black[4];
			ArrayType mType = (ArrayType) result2_black[5];
			//nothing RuleEntryList mSignatureToTMethodSignatureList = (RuleEntryList) result2_black[6];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[7];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[8];
			MMethodSignature mSignature = (MMethodSignature) result2_black[9];

			Object[] result3_bindingAndBlack = MethodDefinitionReturnArrayImpl
					.pattern_MethodDefinitionReturnArray_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
							isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType,
							mTypeOfArray, mSignatureToTMethodSignature, mSignature, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
						+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mArrayTypeAccess] = " + mArrayTypeAccess + ", "
						+ "[tMethodSignature] = " + tMethodSignature + ", " + "[mType] = " + mType + ", "
						+ "[mTypeOfArray] = " + mTypeOfArray + ", " + "[mSignatureToTMethodSignature] = "
						+ mSignatureToTMethodSignature + ", " + "[mSignature] = " + mSignature + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MethodDefinitionReturnArrayImpl
						.pattern_MethodDefinitionReturnArray_29_5_checknacs_blackBBBBBBBB(tType, mTypeToTType,
								mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature,
								mSignature);
				if (result5_black != null) {

					Object[] result6_black = MethodDefinitionReturnArrayImpl
							.pattern_MethodDefinitionReturnArray_29_6_perform_blackBBBBBBBBB(tType, mTypeToTType,
									mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
									mSignatureToTMethodSignature, mSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType
								+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mArrayTypeAccess] = "
								+ mArrayTypeAccess + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
								+ "[mType] = " + mType + ", " + "[mTypeOfArray] = " + mTypeOfArray + ", "
								+ "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", "
								+ "[mSignature] = " + mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_29_6_perform_greenBFBFBFFFFBB(
							tType, tMethodSignature, mType, mSignature, ruleResult);
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[1];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[3];
					//nothing TMethodDefinition tDefinition = (TMethodDefinition) result6_green[5];
					//nothing MMethodDefinition mDefinition = (MMethodDefinition) result6_green[6];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[7];
					//nothing TypeAccess mTypeAccess = (TypeAccess) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionReturnArrayImpl.pattern_MethodDefinitionReturnArray_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mArrayTypeAccess", mArrayTypeAccess);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mTypeOfArray", mTypeOfArray);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
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
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_ARRAYTYPE_TYPE_MMETHODDEFINITION_TYPEACCESS_MMETHODSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ArrayType) arguments.get(2), (Type) arguments.get(3), (MMethodDefinition) arguments.get(4),
					(TypeAccess) arguments.get(5), (MMethodSignature) arguments.get(6));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_ARRAYTYPE_TYPE_MMETHODDEFINITION_TYPEACCESS_MMETHODSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ArrayType) arguments.get(2), (Type) arguments.get(3), (MMethodDefinition) arguments.get(4),
					(TypeAccess) arguments.get(5), (MMethodSignature) arguments.get(6));
			return null;
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_ARRAYTYPE_TYPE_MMETHODDEFINITION_TYPEACCESS_MMETHODSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ArrayType) arguments.get(2), (Type) arguments.get(3), (MMethodDefinition) arguments.get(4),
					(TypeAccess) arguments.get(5), (MMethodSignature) arguments.get(6));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TYPEACCESS_TMETHODSIGNATURE_ARRAYTYPE_TYPE_MSIGNATURETOTSIGNATURE_MMETHODDEFINITION_TYPEACCESS_MMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TypeAccess) arguments.get(3),
					(TMethodSignature) arguments.get(4), (ArrayType) arguments.get(5), (Type) arguments.get(6),
					(MSignatureToTSignature) arguments.get(7), (MMethodDefinition) arguments.get(8),
					(TypeAccess) arguments.get(9), (MMethodSignature) arguments.get(10));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
			return null;
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TYPEACCESS_TMETHODSIGNATURE_ARRAYTYPE_TYPE_MSIGNATURETOTSIGNATURE_TMETHODDEFINITION_MMETHODSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TypeAccess) arguments.get(3),
					(TMethodSignature) arguments.get(4), (ArrayType) arguments.get(5), (Type) arguments.get(6),
					(MSignatureToTSignature) arguments.get(7), (TMethodDefinition) arguments.get(8),
					(MMethodSignature) arguments.get(9));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_732__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_732((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_752__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_752((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPLICABLE_SOLVE_CSP_CC__TABSTRACTTYPE_TYPEACCESS_TMETHODSIGNATURE_ARRAYTYPE_TYPE_TMETHODDEFINITION_MMETHODDEFINITION_TYPEACCESS_MMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TAbstractType) arguments.get(0), (TypeAccess) arguments.get(1),
					(TMethodSignature) arguments.get(2), (ArrayType) arguments.get(3), (Type) arguments.get(4),
					(TMethodDefinition) arguments.get(5), (MMethodDefinition) arguments.get(6),
					(TypeAccess) arguments.get(7), (MMethodSignature) arguments.get(8), (Match) arguments.get(9),
					(Match) arguments.get(10));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___CHECK_DEC_FWD__TYPEACCESS_ARRAYTYPE_TYPE_MMETHODDEFINITION_TYPEACCESS_MMETHODSIGNATURE:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (ArrayType) arguments.get(1), (Type) arguments.get(2),
					(MMethodDefinition) arguments.get(3), (TypeAccess) arguments.get(4),
					(MMethodSignature) arguments.get(5));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___CHECK_DEC_BWD__TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MSignatureToTSignature) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TYPEACCESS_TMETHODSIGNATURE_ARRAYTYPE_TYPE_MSIGNATURETOTSIGNATURE_MMETHODSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TypeAccess) arguments.get(3),
					(TMethodSignature) arguments.get(4), (ArrayType) arguments.get(5), (Type) arguments.get(6),
					(MSignatureToTSignature) arguments.get(7), (MMethodSignature) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_0_1_initialbindings_blackBBBBBBBB(
			MethodDefinitionReturnArray _this, Match match, TypeAccess mArrayTypeAccess, ArrayType mType,
			Type mTypeOfArray, MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {
		if (!mArrayTypeAccess.equals(mTypeAccess)) {
			if (!mType.equals(mTypeOfArray)) {
				return new Object[] { _this, match, mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess,
						mSignature };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_0_2_SolveCSP_bindingFBBBBBBBB(
			MethodDefinitionReturnArray _this, Match match, TypeAccess mArrayTypeAccess, ArrayType mType,
			Type mTypeOfArray, MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mArrayTypeAccess, mType, mTypeOfArray,
				mDefinition, mTypeAccess, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess,
					mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(
			MethodDefinitionReturnArray _this, Match match, TypeAccess mArrayTypeAccess, ArrayType mType,
			Type mTypeOfArray, MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {
		Object[] result_pattern_MethodDefinitionReturnArray_0_2_SolveCSP_binding = pattern_MethodDefinitionReturnArray_0_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess, mSignature);
		if (result_pattern_MethodDefinitionReturnArray_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnArray_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_0_2_SolveCSP_black = pattern_MethodDefinitionReturnArray_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnArray_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mArrayTypeAccess, mType, mTypeOfArray, mDefinition,
						mTypeAccess, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_0_3_CheckCSP_expressionFBB(
			MethodDefinitionReturnArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_0_4_collectelementstobetranslated_blackBBBBBBB(
			Match match, TypeAccess mArrayTypeAccess, ArrayType mType, Type mTypeOfArray, MMethodDefinition mDefinition,
			TypeAccess mTypeAccess, MMethodSignature mSignature) {
		if (!mArrayTypeAccess.equals(mTypeAccess)) {
			if (!mType.equals(mTypeOfArray)) {
				return new Object[] { match, mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess,
						mSignature };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, ArrayType mType, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
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
		return new Object[] { match, mType, mDefinition, mTypeAccess, mSignature,
				mDefinition__mTypeAccess____returnType, mTypeAccess__mType____type,
				mType__mTypeAccess____usagesInTypeAccess, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_0_5_collectcontextelements_blackBBBBBBB(
			Match match, TypeAccess mArrayTypeAccess, ArrayType mType, Type mTypeOfArray, MMethodDefinition mDefinition,
			TypeAccess mTypeAccess, MMethodSignature mSignature) {
		if (!mArrayTypeAccess.equals(mTypeAccess)) {
			if (!mType.equals(mTypeOfArray)) {
				return new Object[] { match, mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess,
						mSignature };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_0_5_collectcontextelements_greenBBBBBFFF(
			Match match, TypeAccess mArrayTypeAccess, ArrayType mType, Type mTypeOfArray, MMethodSignature mSignature) {
		EMoflonEdge mArrayTypeAccess__mTypeOfArray____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mArrayTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mArrayTypeAccess);
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mTypeOfArray);
		match.getContextNodes().add(mSignature);
		String mArrayTypeAccess__mTypeOfArray____type_name_prime = "type";
		String mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mType__mArrayTypeAccess____elementType_name_prime = "elementType";
		mArrayTypeAccess__mTypeOfArray____type.setSrc(mArrayTypeAccess);
		mArrayTypeAccess__mTypeOfArray____type.setTrg(mTypeOfArray);
		match.getContextEdges().add(mArrayTypeAccess__mTypeOfArray____type);
		mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess.setSrc(mTypeOfArray);
		mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess.setTrg(mArrayTypeAccess);
		match.getContextEdges().add(mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess);
		mType__mArrayTypeAccess____elementType.setSrc(mType);
		mType__mArrayTypeAccess____elementType.setTrg(mArrayTypeAccess);
		match.getContextEdges().add(mType__mArrayTypeAccess____elementType);
		mArrayTypeAccess__mTypeOfArray____type.setName(mArrayTypeAccess__mTypeOfArray____type_name_prime);
		mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess
				.setName(mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess_name_prime);
		mType__mArrayTypeAccess____elementType.setName(mType__mArrayTypeAccess____elementType_name_prime);
		return new Object[] { match, mArrayTypeAccess, mType, mTypeOfArray, mSignature,
				mArrayTypeAccess__mTypeOfArray____type, mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess,
				mType__mArrayTypeAccess____elementType };
	}

	public static final void pattern_MethodDefinitionReturnArray_0_6_registerobjectstomatch_expressionBBBBBBBB(
			MethodDefinitionReturnArray _this, Match match, TypeAccess mArrayTypeAccess, ArrayType mType,
			Type mTypeOfArray, MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess,
				mSignature);

	}

	public static final boolean pattern_MethodDefinitionReturnArray_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mArrayTypeAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeOfArray");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_8 = isApplicableMatch.getObject("mTypeAccess");
		EObject _localVariable_9 = isApplicableMatch.getObject("mSignature");
		EObject tmpTType = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpMArrayTypeAccess = _localVariable_2;
		EObject tmpTMethodSignature = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpMTypeOfArray = _localVariable_5;
		EObject tmpMSignatureToTMethodSignature = _localVariable_6;
		EObject tmpMDefinition = _localVariable_7;
		EObject tmpMTypeAccess = _localVariable_8;
		EObject tmpMSignature = _localVariable_9;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpMArrayTypeAccess instanceof TypeAccess) {
					TypeAccess mArrayTypeAccess = (TypeAccess) tmpMArrayTypeAccess;
					if (tmpTMethodSignature instanceof TMethodSignature) {
						TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
						if (tmpMType instanceof ArrayType) {
							ArrayType mType = (ArrayType) tmpMType;
							if (tmpMTypeOfArray instanceof Type) {
								Type mTypeOfArray = (Type) tmpMTypeOfArray;
								if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
									MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
									if (tmpMDefinition instanceof MMethodDefinition) {
										MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
										if (tmpMTypeAccess instanceof TypeAccess) {
											TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
											if (tmpMSignature instanceof MMethodSignature) {
												MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
												return new Object[] { tType, mTypeToTType, mArrayTypeAccess,
														tMethodSignature, mType, mTypeOfArray,
														mSignatureToTMethodSignature, mDefinition, mTypeAccess,
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
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_1_1_performtransformation_blackBBBBBBBBBBFBB(
			TAbstractType tType, TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess,
			TMethodSignature tMethodSignature, ArrayType mType, Type mTypeOfArray,
			MSignatureToTSignature mSignatureToTMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			MMethodSignature mSignature, MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch) {
		if (!mArrayTypeAccess.equals(mTypeAccess)) {
			if (!mType.equals(mTypeOfArray)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType,
								mTypeOfArray, mSignatureToTMethodSignature, mDefinition, mTypeAccess, mSignature, csp,
								_this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding = pattern_MethodDefinitionReturnArray_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding != null) {
			TAbstractType tType = (TAbstractType) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[1];
			TypeAccess mArrayTypeAccess = (TypeAccess) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[3];
			ArrayType mType = (ArrayType) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[4];
			Type mTypeOfArray = (Type) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[5];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[6];
			MMethodDefinition mDefinition = (MMethodDefinition) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[7];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[8];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_binding[9];

			Object[] result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_black = pattern_MethodDefinitionReturnArray_1_1_performtransformation_blackBBBBBBBBBBFBB(
					tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
					mSignatureToTMethodSignature, mDefinition, mTypeAccess, mSignature, _this, isApplicableMatch);
			if (result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinitionReturnArray_1_1_performtransformation_black[10];

				return new Object[] { tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
						mSignatureToTMethodSignature, mDefinition, mTypeAccess, mSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_1_1_performtransformation_greenBFBFFBF(
			TAbstractType tType, TMethodSignature tMethodSignature, MMethodDefinition mDefinition) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		int tDefinition_lowerBound_prime = Integer.valueOf(0);
		int tDefinition_upperBound_prime = Integer.valueOf(-1);
		mDefinitionToTMember.setSource(mDefinition);
		mFlowElementToTFlowElement.setSource(mDefinition);
		tMethodSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		tDefinition.setReturnType(tType);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		return new Object[] { tType, mDefinitionToTMember, tMethodSignature, mFlowElementToTFlowElement, tDefinition,
				mDefinition, mBodyToTAnnotation };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_1_2_collecttranslatedelements_blackBBBBBB(
			MDefinitionToTMember mDefinitionToTMember,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation, TypeAccess mTypeAccess) {
		return new Object[] { mDefinitionToTMember, mFlowElementToTFlowElement, tDefinition, mDefinition,
				mBodyToTAnnotation, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_1_2_collecttranslatedelements_greenFBBBBBB(
			MDefinitionToTMember mDefinitionToTMember,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation, TypeAccess mTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedElements().add(tDefinition);
		ruleresult.getTranslatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(mTypeAccess);
		return new Object[] { ruleresult, mDefinitionToTMember, mFlowElementToTFlowElement, tDefinition, mDefinition,
				mBodyToTAnnotation, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mDefinitionToTMember,
			EObject mArrayTypeAccess, EObject tMethodSignature, EObject mFlowElementToTFlowElement, EObject mType,
			EObject mTypeOfArray, EObject mSignatureToTMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mTypeAccess, EObject mSignature) {
		if (!mTypeToTType.equals(tType)) {
			if (!mTypeToTType.equals(tMethodSignature)) {
				if (!mTypeToTType.equals(tDefinition)) {
					if (!mDefinitionToTMember.equals(tType)) {
						if (!mDefinitionToTMember.equals(mTypeToTType)) {
							if (!mDefinitionToTMember.equals(tMethodSignature)) {
								if (!mDefinitionToTMember.equals(mFlowElementToTFlowElement)) {
									if (!mDefinitionToTMember.equals(mType)) {
										if (!mDefinitionToTMember.equals(mTypeOfArray)) {
											if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
												if (!mDefinitionToTMember.equals(tDefinition)) {
													if (!mDefinitionToTMember.equals(mTypeAccess)) {
														if (!mDefinitionToTMember.equals(mSignature)) {
															if (!mArrayTypeAccess.equals(tType)) {
																if (!mArrayTypeAccess.equals(mTypeToTType)) {
																	if (!mArrayTypeAccess
																			.equals(mDefinitionToTMember)) {
																		if (!mArrayTypeAccess
																				.equals(tMethodSignature)) {
																			if (!mArrayTypeAccess.equals(
																					mFlowElementToTFlowElement)) {
																				if (!mArrayTypeAccess.equals(mType)) {
																					if (!mArrayTypeAccess
																							.equals(mTypeOfArray)) {
																						if (!mArrayTypeAccess.equals(
																								mSignatureToTMethodSignature)) {
																							if (!mArrayTypeAccess
																									.equals(tDefinition)) {
																								if (!mArrayTypeAccess
																										.equals(mDefinition)) {
																									if (!mArrayTypeAccess
																											.equals(mBodyToTAnnotation)) {
																										if (!mArrayTypeAccess
																												.equals(mTypeAccess)) {
																											if (!mArrayTypeAccess
																													.equals(mSignature)) {
																												if (!tMethodSignature
																														.equals(tType)) {
																													if (!mFlowElementToTFlowElement
																															.equals(tType)) {
																														if (!mFlowElementToTFlowElement
																																.equals(mTypeToTType)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(tMethodSignature)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(mType)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mTypeOfArray)) {
																																		if (!mFlowElementToTFlowElement
																																				.equals(mSignatureToTMethodSignature)) {
																																			if (!mFlowElementToTFlowElement
																																					.equals(tDefinition)) {
																																				if (!mFlowElementToTFlowElement
																																						.equals(mTypeAccess)) {
																																					if (!mFlowElementToTFlowElement
																																							.equals(mSignature)) {
																																						if (!mType
																																								.equals(tType)) {
																																							if (!mType
																																									.equals(mTypeToTType)) {
																																								if (!mType
																																										.equals(tMethodSignature)) {
																																									if (!mType
																																											.equals(mTypeOfArray)) {
																																										if (!mType
																																												.equals(tDefinition)) {
																																											if (!mType
																																													.equals(mTypeAccess)) {
																																												if (!mTypeOfArray
																																														.equals(tType)) {
																																													if (!mTypeOfArray
																																															.equals(mTypeToTType)) {
																																														if (!mTypeOfArray
																																																.equals(tMethodSignature)) {
																																															if (!mTypeOfArray
																																																	.equals(tDefinition)) {
																																																if (!mSignatureToTMethodSignature
																																																		.equals(tType)) {
																																																	if (!mSignatureToTMethodSignature
																																																			.equals(mTypeToTType)) {
																																																		if (!mSignatureToTMethodSignature
																																																				.equals(tMethodSignature)) {
																																																			if (!mSignatureToTMethodSignature
																																																					.equals(mType)) {
																																																				if (!mSignatureToTMethodSignature
																																																						.equals(mTypeOfArray)) {
																																																					if (!mSignatureToTMethodSignature
																																																							.equals(tDefinition)) {
																																																						if (!mSignatureToTMethodSignature
																																																								.equals(mTypeAccess)) {
																																																							if (!tDefinition
																																																									.equals(tType)) {
																																																								if (!tDefinition
																																																										.equals(tMethodSignature)) {
																																																									if (!mDefinition
																																																											.equals(tType)) {
																																																										if (!mDefinition
																																																												.equals(mTypeToTType)) {
																																																											if (!mDefinition
																																																													.equals(mDefinitionToTMember)) {
																																																												if (!mDefinition
																																																														.equals(tMethodSignature)) {
																																																													if (!mDefinition
																																																															.equals(mFlowElementToTFlowElement)) {
																																																														if (!mDefinition
																																																																.equals(mType)) {
																																																															if (!mDefinition
																																																																	.equals(mTypeOfArray)) {
																																																																if (!mDefinition
																																																																		.equals(mSignatureToTMethodSignature)) {
																																																																	if (!mDefinition
																																																																			.equals(tDefinition)) {
																																																																		if (!mDefinition
																																																																				.equals(mTypeAccess)) {
																																																																			if (!mDefinition
																																																																					.equals(mSignature)) {
																																																																				if (!mBodyToTAnnotation
																																																																						.equals(tType)) {
																																																																					if (!mBodyToTAnnotation
																																																																							.equals(mTypeToTType)) {
																																																																						if (!mBodyToTAnnotation
																																																																								.equals(mDefinitionToTMember)) {
																																																																							if (!mBodyToTAnnotation
																																																																									.equals(tMethodSignature)) {
																																																																								if (!mBodyToTAnnotation
																																																																										.equals(mFlowElementToTFlowElement)) {
																																																																									if (!mBodyToTAnnotation
																																																																											.equals(mType)) {
																																																																										if (!mBodyToTAnnotation
																																																																												.equals(mTypeOfArray)) {
																																																																											if (!mBodyToTAnnotation
																																																																													.equals(mSignatureToTMethodSignature)) {
																																																																												if (!mBodyToTAnnotation
																																																																														.equals(tDefinition)) {
																																																																													if (!mBodyToTAnnotation
																																																																															.equals(mDefinition)) {
																																																																														if (!mBodyToTAnnotation
																																																																																.equals(mTypeAccess)) {
																																																																															if (!mBodyToTAnnotation
																																																																																	.equals(mSignature)) {
																																																																																if (!mTypeAccess
																																																																																		.equals(tType)) {
																																																																																	if (!mTypeAccess
																																																																																			.equals(mTypeToTType)) {
																																																																																		if (!mTypeAccess
																																																																																				.equals(tMethodSignature)) {
																																																																																			if (!mTypeAccess
																																																																																					.equals(mTypeOfArray)) {
																																																																																				if (!mTypeAccess
																																																																																						.equals(tDefinition)) {
																																																																																					if (!mSignature
																																																																																							.equals(tType)) {
																																																																																						if (!mSignature
																																																																																								.equals(mTypeToTType)) {
																																																																																							if (!mSignature
																																																																																									.equals(tMethodSignature)) {
																																																																																								if (!mSignature
																																																																																										.equals(mType)) {
																																																																																									if (!mSignature
																																																																																											.equals(mTypeOfArray)) {
																																																																																										if (!mSignature
																																																																																												.equals(mSignatureToTMethodSignature)) {
																																																																																											if (!mSignature
																																																																																													.equals(tDefinition)) {
																																																																																												if (!mSignature
																																																																																														.equals(mTypeAccess)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															tType,
																																																																																															mTypeToTType,
																																																																																															mDefinitionToTMember,
																																																																																															mArrayTypeAccess,
																																																																																															tMethodSignature,
																																																																																															mFlowElementToTFlowElement,
																																																																																															mType,
																																																																																															mTypeOfArray,
																																																																																															mSignatureToTMethodSignature,
																																																																																															tDefinition,
																																																																																															mDefinition,
																																																																																															mBodyToTAnnotation,
																																																																																															mTypeAccess,
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
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDefinitionReturnArray_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mTypeAccess, EObject mSignature) {
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
		String ruleresult_ruleName_prime = "MethodDefinitionReturnArray";
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
		return new Object[] { ruleresult, tType, mDefinitionToTMember, tMethodSignature, mFlowElementToTFlowElement,
				mType, tDefinition, mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				mDefinition__mTypeAccess____returnType, mFlowElementToTFlowElement__mDefinition____source,
				mTypeAccess__mType____type, mType__mTypeAccess____usagesInTypeAccess,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				mFlowElementToTFlowElement__tDefinition____target, tDefinition__tType____returnType,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__tDefinition____target,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature };
	}

	public static final void pattern_MethodDefinitionReturnArray_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject mArrayTypeAccess, EObject tMethodSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject mTypeOfArray,
			EObject mSignatureToTMethodSignature, EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation,
			EObject mTypeAccess, EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, tType, mTypeToTType, mDefinitionToTMember, mArrayTypeAccess,
				tMethodSignature, mFlowElementToTFlowElement, mType, mTypeOfArray, mSignatureToTMethodSignature,
				tDefinition, mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature);

	}

	public static final PerformRuleResult pattern_MethodDefinitionReturnArray_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_bindingFB(
			MethodDefinitionReturnArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDefinitionReturnArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDefinitionReturnArray _this) {
		Object[] result_pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_binding = pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_black = pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDefinitionReturnArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mArrayTypeAccess");
		EObject _localVariable_1 = match.getObject("mType");
		EObject _localVariable_2 = match.getObject("mTypeOfArray");
		EObject _localVariable_3 = match.getObject("mDefinition");
		EObject _localVariable_4 = match.getObject("mTypeAccess");
		EObject _localVariable_5 = match.getObject("mSignature");
		EObject tmpMArrayTypeAccess = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpMTypeOfArray = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpMTypeAccess = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		if (tmpMArrayTypeAccess instanceof TypeAccess) {
			TypeAccess mArrayTypeAccess = (TypeAccess) tmpMArrayTypeAccess;
			if (tmpMType instanceof ArrayType) {
				ArrayType mType = (ArrayType) tmpMType;
				if (tmpMTypeOfArray instanceof Type) {
					Type mTypeOfArray = (Type) tmpMTypeOfArray;
					if (tmpMDefinition instanceof MMethodDefinition) {
						MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
						if (tmpMTypeAccess instanceof TypeAccess) {
							TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
							if (tmpMSignature instanceof MMethodSignature) {
								MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
								return new Object[] { mArrayTypeAccess, mType, mTypeOfArray, mDefinition, mTypeAccess,
										mSignature, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnArray_2_2_corematch_blackFFBFBBFBBBB(
			TypeAccess mArrayTypeAccess, ArrayType mType, Type mTypeOfArray, MMethodDefinition mDefinition,
			TypeAccess mTypeAccess, MMethodSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mArrayTypeAccess.equals(mTypeAccess)) {
			if (!mType.equals(mTypeOfArray)) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mTypeOfArray, TypeToTAbstractType.class, "source")) {
					TAbstractType tType = mTypeToTType.getTarget();
					if (tType != null) {
						for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
							TSignature tmpTMethodSignature = mSignatureToTMethodSignature.getTarget();
							if (tmpTMethodSignature instanceof TMethodSignature) {
								TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
								_result.add(new Object[] { tType, mTypeToTType, mArrayTypeAccess, tMethodSignature,
										mType, mTypeOfArray, mSignatureToTMethodSignature, mDefinition, mTypeAccess,
										mSignature, match });
							}

						}
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnArray_2_3_findcontext_blackBBBBBBBBBB(
			TAbstractType tType, TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess,
			TMethodSignature tMethodSignature, ArrayType mType, Type mTypeOfArray,
			MSignatureToTSignature mSignatureToTMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mArrayTypeAccess.equals(mTypeAccess)) {
			if (!mType.equals(mTypeOfArray)) {
				if (mTypeOfArray.equals(mArrayTypeAccess.getType())) {
					if (mTypeAccess.equals(mDefinition.getReturnType())) {
						if (mType.equals(mTypeAccess.getType())) {
							if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
								if (mArrayTypeAccess.equals(mType.getElementType())) {
									if (mTypeOfArray.equals(mTypeToTType.getSource())) {
										if (mSignature.getMDefinitions().contains(mDefinition)) {
											if (tType.equals(mTypeToTType.getTarget())) {
												if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
													_result.add(new Object[] { tType, mTypeToTType, mArrayTypeAccess,
															tMethodSignature, mType, mTypeOfArray,
															mSignatureToTMethodSignature, mDefinition, mTypeAccess,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFF(
			TAbstractType tType, TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess,
			TMethodSignature tMethodSignature, ArrayType mType, Type mTypeOfArray,
			MSignatureToTSignature mSignatureToTMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mArrayTypeAccess__mTypeOfArray____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mTypeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mType__mArrayTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mTypeOfArray____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mArrayTypeAccess__mTypeOfArray____type_name_prime = "type";
		String mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mDefinition__mTypeAccess____returnType_name_prime = "returnType";
		String mTypeAccess__mType____type_name_prime = "type";
		String mType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String mType__mArrayTypeAccess____elementType_name_prime = "elementType";
		String mTypeToTType__mTypeOfArray____source_name_prime = "source";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mTypeToTType__tType____target_name_prime = "target";
		String mSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mArrayTypeAccess);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mArrayTypeAccess__mTypeOfArray____type.setSrc(mArrayTypeAccess);
		mArrayTypeAccess__mTypeOfArray____type.setTrg(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mArrayTypeAccess__mTypeOfArray____type);
		mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess.setSrc(mTypeOfArray);
		mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess.setTrg(mArrayTypeAccess);
		isApplicableMatch.getAllContextElements().add(mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess);
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
		mType__mArrayTypeAccess____elementType.setSrc(mType);
		mType__mArrayTypeAccess____elementType.setTrg(mArrayTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mArrayTypeAccess____elementType);
		mTypeToTType__mTypeOfArray____source.setSrc(mTypeToTType);
		mTypeToTType__mTypeOfArray____source.setTrg(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mTypeOfArray____source);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mSignatureToTMethodSignature__mSignature____source.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__mSignature____source);
		mArrayTypeAccess__mTypeOfArray____type.setName(mArrayTypeAccess__mTypeOfArray____type_name_prime);
		mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess
				.setName(mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess_name_prime);
		mDefinition__mTypeAccess____returnType.setName(mDefinition__mTypeAccess____returnType_name_prime);
		mTypeAccess__mType____type.setName(mTypeAccess__mType____type_name_prime);
		mType__mTypeAccess____usagesInTypeAccess.setName(mType__mTypeAccess____usagesInTypeAccess_name_prime);
		mSignatureToTMethodSignature__tMethodSignature____target
				.setName(mSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		mType__mArrayTypeAccess____elementType.setName(mType__mArrayTypeAccess____elementType_name_prime);
		mTypeToTType__mTypeOfArray____source.setName(mTypeToTType__mTypeOfArray____source_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mSignatureToTMethodSignature__mSignature____source
				.setName(mSignatureToTMethodSignature__mSignature____source_name_prime);
		return new Object[] { tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
				mSignatureToTMethodSignature, mDefinition, mTypeAccess, mSignature, isApplicableMatch,
				mArrayTypeAccess__mTypeOfArray____type, mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess,
				mDefinition__mTypeAccess____returnType, mTypeAccess__mType____type,
				mType__mTypeAccess____usagesInTypeAccess, mSignatureToTMethodSignature__tMethodSignature____target,
				mType__mArrayTypeAccess____elementType, mTypeToTType__mTypeOfArray____source,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature,
				mTypeToTType__tType____target, mSignatureToTMethodSignature__mSignature____source };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_4_solveCSP_bindingFBBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess,
				tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature, mDefinition, mTypeAccess,
				mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess,
					tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature, mDefinition, mTypeAccess,
					mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {
		Object[] result_pattern_MethodDefinitionReturnArray_2_4_solveCSP_binding = pattern_MethodDefinitionReturnArray_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
				mSignatureToTMethodSignature, mDefinition, mTypeAccess, mSignature);
		if (result_pattern_MethodDefinitionReturnArray_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnArray_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_2_4_solveCSP_black = pattern_MethodDefinitionReturnArray_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnArray_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess,
						tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature, mDefinition, mTypeAccess,
						mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_2_5_checkCSP_expressionFBB(
			MethodDefinitionReturnArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinitionReturnArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinitionReturnArray_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_10_1_initialbindings_blackBBBBB(
			MethodDefinitionReturnArray _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		return new Object[] { _this, match, tType, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_10_2_SolveCSP_bindingFBBBBB(
			MethodDefinitionReturnArray _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tMethodSignature, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tMethodSignature, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodDefinitionReturnArray _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		Object[] result_pattern_MethodDefinitionReturnArray_10_2_SolveCSP_binding = pattern_MethodDefinitionReturnArray_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tType, tMethodSignature, tDefinition);
		if (result_pattern_MethodDefinitionReturnArray_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnArray_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_10_2_SolveCSP_black = pattern_MethodDefinitionReturnArray_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnArray_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tMethodSignature, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_10_3_CheckCSP_expressionFBB(
			MethodDefinitionReturnArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		return new Object[] { match, tType, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_10_4_collectelementstobetranslated_greenBBBBFFF(
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

	public static final Object[] pattern_MethodDefinitionReturnArray_10_5_collectcontextelements_blackBBBB(Match match,
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		return new Object[] { match, tType, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tType, TMethodSignature tMethodSignature) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tMethodSignature);
		return new Object[] { match, tType, tMethodSignature };
	}

	public static final void pattern_MethodDefinitionReturnArray_10_6_registerobjectstomatch_expressionBBBBB(
			MethodDefinitionReturnArray _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tType, tMethodSignature, tDefinition);

	}

	public static final boolean pattern_MethodDefinitionReturnArray_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mArrayTypeAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeOfArray");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_8 = isApplicableMatch.getObject("mSignature");
		EObject tmpTType = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpMArrayTypeAccess = _localVariable_2;
		EObject tmpTMethodSignature = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpMTypeOfArray = _localVariable_5;
		EObject tmpMSignatureToTMethodSignature = _localVariable_6;
		EObject tmpTDefinition = _localVariable_7;
		EObject tmpMSignature = _localVariable_8;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpMArrayTypeAccess instanceof TypeAccess) {
					TypeAccess mArrayTypeAccess = (TypeAccess) tmpMArrayTypeAccess;
					if (tmpTMethodSignature instanceof TMethodSignature) {
						TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
						if (tmpMType instanceof ArrayType) {
							ArrayType mType = (ArrayType) tmpMType;
							if (tmpMTypeOfArray instanceof Type) {
								Type mTypeOfArray = (Type) tmpMTypeOfArray;
								if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
									MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
									if (tmpTDefinition instanceof TMethodDefinition) {
										TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
										if (tmpMSignature instanceof MMethodSignature) {
											MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
											return new Object[] { tType, mTypeToTType, mArrayTypeAccess,
													tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature,
													tDefinition, mSignature, isApplicableMatch };
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

	public static final Object[] pattern_MethodDefinitionReturnArray_11_1_performtransformation_blackBBBBBBBBBFBB(
			TAbstractType tType, TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess,
			TMethodSignature tMethodSignature, ArrayType mType, Type mTypeOfArray,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodDefinition tDefinition,
			MMethodSignature mSignature, MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch) {
		if (!mType.equals(mTypeOfArray)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
							mSignatureToTMethodSignature, tDefinition, mSignature, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding = pattern_MethodDefinitionReturnArray_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding != null) {
			TAbstractType tType = (TAbstractType) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding[1];
			TypeAccess mArrayTypeAccess = (TypeAccess) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding[3];
			ArrayType mType = (ArrayType) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding[4];
			Type mTypeOfArray = (Type) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding[5];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding[6];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding[7];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_binding[8];

			Object[] result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_black = pattern_MethodDefinitionReturnArray_11_1_performtransformation_blackBBBBBBBBBFBB(
					tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
					mSignatureToTMethodSignature, tDefinition, mSignature, _this, isApplicableMatch);
			if (result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinitionReturnArray_11_1_performtransformation_black[9];

				return new Object[] { tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
						mSignatureToTMethodSignature, tDefinition, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_11_1_performtransformation_greenFFBBFFFB(
			ArrayType mType, TMethodDefinition tDefinition, MMethodSignature mSignature) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MMethodDefinition mDefinition = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeAccess mTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		mDefinitionToTMember.setTarget(tDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mDefinition.setReturnType(mTypeAccess);
		mTypeAccess.setType(mType);
		return new Object[] { mDefinitionToTMember, mFlowElementToTFlowElement, mType, tDefinition, mDefinition,
				mBodyToTAnnotation, mTypeAccess, mSignature };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_11_2_collecttranslatedelements_blackBBBBBB(
			MDefinitionToTMember mDefinitionToTMember,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation, TypeAccess mTypeAccess) {
		return new Object[] { mDefinitionToTMember, mFlowElementToTFlowElement, tDefinition, mDefinition,
				mBodyToTAnnotation, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_11_2_collecttranslatedelements_greenFBBBBBB(
			MDefinitionToTMember mDefinitionToTMember,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation, TypeAccess mTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getTranslatedElements().add(tDefinition);
		ruleresult.getCreatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(mTypeAccess);
		return new Object[] { ruleresult, mDefinitionToTMember, mFlowElementToTFlowElement, tDefinition, mDefinition,
				mBodyToTAnnotation, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mDefinitionToTMember,
			EObject mArrayTypeAccess, EObject tMethodSignature, EObject mFlowElementToTFlowElement, EObject mType,
			EObject mTypeOfArray, EObject mSignatureToTMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mTypeAccess, EObject mSignature) {
		if (!mTypeToTType.equals(tType)) {
			if (!mTypeToTType.equals(tMethodSignature)) {
				if (!mTypeToTType.equals(tDefinition)) {
					if (!mDefinitionToTMember.equals(tType)) {
						if (!mDefinitionToTMember.equals(mTypeToTType)) {
							if (!mDefinitionToTMember.equals(tMethodSignature)) {
								if (!mDefinitionToTMember.equals(mFlowElementToTFlowElement)) {
									if (!mDefinitionToTMember.equals(mType)) {
										if (!mDefinitionToTMember.equals(mTypeOfArray)) {
											if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
												if (!mDefinitionToTMember.equals(tDefinition)) {
													if (!mDefinitionToTMember.equals(mTypeAccess)) {
														if (!mDefinitionToTMember.equals(mSignature)) {
															if (!mArrayTypeAccess.equals(tType)) {
																if (!mArrayTypeAccess.equals(mTypeToTType)) {
																	if (!mArrayTypeAccess
																			.equals(mDefinitionToTMember)) {
																		if (!mArrayTypeAccess
																				.equals(tMethodSignature)) {
																			if (!mArrayTypeAccess.equals(
																					mFlowElementToTFlowElement)) {
																				if (!mArrayTypeAccess.equals(mType)) {
																					if (!mArrayTypeAccess
																							.equals(mTypeOfArray)) {
																						if (!mArrayTypeAccess.equals(
																								mSignatureToTMethodSignature)) {
																							if (!mArrayTypeAccess
																									.equals(tDefinition)) {
																								if (!mArrayTypeAccess
																										.equals(mDefinition)) {
																									if (!mArrayTypeAccess
																											.equals(mBodyToTAnnotation)) {
																										if (!mArrayTypeAccess
																												.equals(mTypeAccess)) {
																											if (!mArrayTypeAccess
																													.equals(mSignature)) {
																												if (!tMethodSignature
																														.equals(tType)) {
																													if (!mFlowElementToTFlowElement
																															.equals(tType)) {
																														if (!mFlowElementToTFlowElement
																																.equals(mTypeToTType)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(tMethodSignature)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(mType)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mTypeOfArray)) {
																																		if (!mFlowElementToTFlowElement
																																				.equals(mSignatureToTMethodSignature)) {
																																			if (!mFlowElementToTFlowElement
																																					.equals(tDefinition)) {
																																				if (!mFlowElementToTFlowElement
																																						.equals(mTypeAccess)) {
																																					if (!mFlowElementToTFlowElement
																																							.equals(mSignature)) {
																																						if (!mType
																																								.equals(tType)) {
																																							if (!mType
																																									.equals(mTypeToTType)) {
																																								if (!mType
																																										.equals(tMethodSignature)) {
																																									if (!mType
																																											.equals(mTypeOfArray)) {
																																										if (!mType
																																												.equals(tDefinition)) {
																																											if (!mType
																																													.equals(mTypeAccess)) {
																																												if (!mTypeOfArray
																																														.equals(tType)) {
																																													if (!mTypeOfArray
																																															.equals(mTypeToTType)) {
																																														if (!mTypeOfArray
																																																.equals(tMethodSignature)) {
																																															if (!mTypeOfArray
																																																	.equals(tDefinition)) {
																																																if (!mSignatureToTMethodSignature
																																																		.equals(tType)) {
																																																	if (!mSignatureToTMethodSignature
																																																			.equals(mTypeToTType)) {
																																																		if (!mSignatureToTMethodSignature
																																																				.equals(tMethodSignature)) {
																																																			if (!mSignatureToTMethodSignature
																																																					.equals(mType)) {
																																																				if (!mSignatureToTMethodSignature
																																																						.equals(mTypeOfArray)) {
																																																					if (!mSignatureToTMethodSignature
																																																							.equals(tDefinition)) {
																																																						if (!mSignatureToTMethodSignature
																																																								.equals(mTypeAccess)) {
																																																							if (!tDefinition
																																																									.equals(tType)) {
																																																								if (!tDefinition
																																																										.equals(tMethodSignature)) {
																																																									if (!mDefinition
																																																											.equals(tType)) {
																																																										if (!mDefinition
																																																												.equals(mTypeToTType)) {
																																																											if (!mDefinition
																																																													.equals(mDefinitionToTMember)) {
																																																												if (!mDefinition
																																																														.equals(tMethodSignature)) {
																																																													if (!mDefinition
																																																															.equals(mFlowElementToTFlowElement)) {
																																																														if (!mDefinition
																																																																.equals(mType)) {
																																																															if (!mDefinition
																																																																	.equals(mTypeOfArray)) {
																																																																if (!mDefinition
																																																																		.equals(mSignatureToTMethodSignature)) {
																																																																	if (!mDefinition
																																																																			.equals(tDefinition)) {
																																																																		if (!mDefinition
																																																																				.equals(mTypeAccess)) {
																																																																			if (!mDefinition
																																																																					.equals(mSignature)) {
																																																																				if (!mBodyToTAnnotation
																																																																						.equals(tType)) {
																																																																					if (!mBodyToTAnnotation
																																																																							.equals(mTypeToTType)) {
																																																																						if (!mBodyToTAnnotation
																																																																								.equals(mDefinitionToTMember)) {
																																																																							if (!mBodyToTAnnotation
																																																																									.equals(tMethodSignature)) {
																																																																								if (!mBodyToTAnnotation
																																																																										.equals(mFlowElementToTFlowElement)) {
																																																																									if (!mBodyToTAnnotation
																																																																											.equals(mType)) {
																																																																										if (!mBodyToTAnnotation
																																																																												.equals(mTypeOfArray)) {
																																																																											if (!mBodyToTAnnotation
																																																																													.equals(mSignatureToTMethodSignature)) {
																																																																												if (!mBodyToTAnnotation
																																																																														.equals(tDefinition)) {
																																																																													if (!mBodyToTAnnotation
																																																																															.equals(mDefinition)) {
																																																																														if (!mBodyToTAnnotation
																																																																																.equals(mTypeAccess)) {
																																																																															if (!mBodyToTAnnotation
																																																																																	.equals(mSignature)) {
																																																																																if (!mTypeAccess
																																																																																		.equals(tType)) {
																																																																																	if (!mTypeAccess
																																																																																			.equals(mTypeToTType)) {
																																																																																		if (!mTypeAccess
																																																																																				.equals(tMethodSignature)) {
																																																																																			if (!mTypeAccess
																																																																																					.equals(mTypeOfArray)) {
																																																																																				if (!mTypeAccess
																																																																																						.equals(tDefinition)) {
																																																																																					if (!mSignature
																																																																																							.equals(tType)) {
																																																																																						if (!mSignature
																																																																																								.equals(mTypeToTType)) {
																																																																																							if (!mSignature
																																																																																									.equals(tMethodSignature)) {
																																																																																								if (!mSignature
																																																																																										.equals(mType)) {
																																																																																									if (!mSignature
																																																																																											.equals(mTypeOfArray)) {
																																																																																										if (!mSignature
																																																																																												.equals(mSignatureToTMethodSignature)) {
																																																																																											if (!mSignature
																																																																																													.equals(tDefinition)) {
																																																																																												if (!mSignature
																																																																																														.equals(mTypeAccess)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															tType,
																																																																																															mTypeToTType,
																																																																																															mDefinitionToTMember,
																																																																																															mArrayTypeAccess,
																																																																																															tMethodSignature,
																																																																																															mFlowElementToTFlowElement,
																																																																																															mType,
																																																																																															mTypeOfArray,
																																																																																															mSignatureToTMethodSignature,
																																																																																															tDefinition,
																																																																																															mDefinition,
																																																																																															mBodyToTAnnotation,
																																																																																															mTypeAccess,
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
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDefinitionReturnArray_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mTypeAccess, EObject mSignature) {
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
		String ruleresult_ruleName_prime = "MethodDefinitionReturnArray";
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
		return new Object[] { ruleresult, tType, mDefinitionToTMember, tMethodSignature, mFlowElementToTFlowElement,
				mType, tDefinition, mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				mDefinition__mTypeAccess____returnType, mFlowElementToTFlowElement__mDefinition____source,
				mTypeAccess__mType____type, mType__mTypeAccess____usagesInTypeAccess,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				mFlowElementToTFlowElement__tDefinition____target, tDefinition__tType____returnType,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__tDefinition____target,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature };
	}

	public static final void pattern_MethodDefinitionReturnArray_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject mArrayTypeAccess, EObject tMethodSignature,
			EObject mFlowElementToTFlowElement, EObject mType, EObject mTypeOfArray,
			EObject mSignatureToTMethodSignature, EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation,
			EObject mTypeAccess, EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, tType, mTypeToTType, mDefinitionToTMember, mArrayTypeAccess,
				tMethodSignature, mFlowElementToTFlowElement, mType, mTypeOfArray, mSignatureToTMethodSignature,
				tDefinition, mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature);

	}

	public static final PerformRuleResult pattern_MethodDefinitionReturnArray_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_bindingFB(
			MethodDefinitionReturnArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDefinitionReturnArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDefinitionReturnArray _this) {
		Object[] result_pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_binding = pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_black = pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDefinitionReturnArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_2_corematch_bindingFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnArray_12_2_corematch_blackBFBFFBFB(
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tDefinition_lowerBound = tDefinition.getLowerBound();
		if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
			int tDefinition_upperBound = tDefinition.getUpperBound();
			if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(-1))) {
				for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMethodSignature, MSignatureToTSignature.class, "target")) {
					MSignature tmpMSignature = mSignatureToTMethodSignature.getSource();
					if (tmpMSignature instanceof MMethodSignature) {
						MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
						for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
							Type mTypeOfArray = mTypeToTType.getSource();
							if (mTypeOfArray != null) {
								_result.add(new Object[] { tType, mTypeToTType, tMethodSignature, mTypeOfArray,
										mSignatureToTMethodSignature, tDefinition, mSignature, match });
							}

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnArray_12_3_findcontext_blackBBFBFBBBB(
			TAbstractType tType, TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature, Type mTypeOfArray,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodDefinition tDefinition,
			MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethodSignature.getDefinitions().contains(tDefinition)) {
			if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
				if (tType.equals(tDefinition.getReturnType())) {
					if (mTypeOfArray.equals(mTypeToTType.getSource())) {
						if (tType.equals(mTypeToTType.getTarget())) {
							if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
								int tDefinition_lowerBound = tDefinition.getLowerBound();
								if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
									int tDefinition_upperBound = tDefinition.getUpperBound();
									if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(-1))) {
										for (TypeAccess mArrayTypeAccess : mTypeOfArray.getUsagesInTypeAccess()) {
											for (ArrayType mType : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(mArrayTypeAccess, ArrayType.class,
															"elementType")) {
												if (!mType.equals(mTypeOfArray)) {
													_result.add(new Object[] { tType, mTypeToTType, mArrayTypeAccess,
															tMethodSignature, mType, mTypeOfArray,
															mSignatureToTMethodSignature, tDefinition, mSignature });
												}
											}
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

	public static final Object[] pattern_MethodDefinitionReturnArray_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(
			TAbstractType tType, TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess,
			TMethodSignature tMethodSignature, ArrayType mType, Type mTypeOfArray,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodDefinition tDefinition,
			MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mArrayTypeAccess__mTypeOfArray____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mType__mArrayTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mTypeOfArray____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mArrayTypeAccess__mTypeOfArray____type_name_prime = "type";
		String mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tMethodSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tMethodSignature____signature_name_prime = "signature";
		String mSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String mType__mArrayTypeAccess____elementType_name_prime = "elementType";
		String tDefinition__tType____returnType_name_prime = "returnType";
		String mTypeToTType__mTypeOfArray____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String mSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mArrayTypeAccess);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mArrayTypeAccess__mTypeOfArray____type.setSrc(mArrayTypeAccess);
		mArrayTypeAccess__mTypeOfArray____type.setTrg(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mArrayTypeAccess__mTypeOfArray____type);
		mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess.setSrc(mTypeOfArray);
		mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess.setTrg(mArrayTypeAccess);
		isApplicableMatch.getAllContextElements().add(mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess);
		tMethodSignature__tDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tMethodSignature__tDefinition____definitions);
		tDefinition__tMethodSignature____signature.setSrc(tDefinition);
		tDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tMethodSignature____signature);
		mSignatureToTMethodSignature__tMethodSignature____target.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__tMethodSignature____target);
		mType__mArrayTypeAccess____elementType.setSrc(mType);
		mType__mArrayTypeAccess____elementType.setTrg(mArrayTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mArrayTypeAccess____elementType);
		tDefinition__tType____returnType.setSrc(tDefinition);
		tDefinition__tType____returnType.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tDefinition__tType____returnType);
		mTypeToTType__mTypeOfArray____source.setSrc(mTypeToTType);
		mTypeToTType__mTypeOfArray____source.setTrg(mTypeOfArray);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mTypeOfArray____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mSignatureToTMethodSignature__mSignature____source.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__mSignature____source);
		mArrayTypeAccess__mTypeOfArray____type.setName(mArrayTypeAccess__mTypeOfArray____type_name_prime);
		mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess
				.setName(mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess_name_prime);
		tMethodSignature__tDefinition____definitions.setName(tMethodSignature__tDefinition____definitions_name_prime);
		tDefinition__tMethodSignature____signature.setName(tDefinition__tMethodSignature____signature_name_prime);
		mSignatureToTMethodSignature__tMethodSignature____target
				.setName(mSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		mType__mArrayTypeAccess____elementType.setName(mType__mArrayTypeAccess____elementType_name_prime);
		tDefinition__tType____returnType.setName(tDefinition__tType____returnType_name_prime);
		mTypeToTType__mTypeOfArray____source.setName(mTypeToTType__mTypeOfArray____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mSignatureToTMethodSignature__mSignature____source
				.setName(mSignatureToTMethodSignature__mSignature____source_name_prime);
		return new Object[] { tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
				mSignatureToTMethodSignature, tDefinition, mSignature, isApplicableMatch,
				mArrayTypeAccess__mTypeOfArray____type, mTypeOfArray__mArrayTypeAccess____usagesInTypeAccess,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				mSignatureToTMethodSignature__tMethodSignature____target, mType__mArrayTypeAccess____elementType,
				tDefinition__tType____returnType, mTypeToTType__mTypeOfArray____source, mTypeToTType__tType____target,
				mSignatureToTMethodSignature__mSignature____source };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodDefinition tDefinition, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess,
				tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature, tDefinition, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess,
					tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature, tDefinition, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodDefinition tDefinition, MMethodSignature mSignature) {
		Object[] result_pattern_MethodDefinitionReturnArray_12_4_solveCSP_binding = pattern_MethodDefinitionReturnArray_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
				mSignatureToTMethodSignature, tDefinition, mSignature);
		if (result_pattern_MethodDefinitionReturnArray_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnArray_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_12_4_solveCSP_black = pattern_MethodDefinitionReturnArray_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnArray_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess,
						tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature, tDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_12_5_checkCSP_expressionFBB(
			MethodDefinitionReturnArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinitionReturnArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinitionReturnArray_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_bindingFB(
			MethodDefinitionReturnArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDefinitionReturnArray _this) {
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

	public static final Object[] pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDefinitionReturnArray _this) {
		Object[] result_pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_binding = pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_black = pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_20_2_testcorematchandDECs_black_nac_0BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_signature_146088 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_146088 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_signature_146088)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnArray_20_2_testcorematchandDECs_blackFFFB(
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
						int tDefinition_lowerBound = tDefinition.getLowerBound();
						if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
							int tDefinition_upperBound = tDefinition.getUpperBound();
							if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(-1))) {
								if (pattern_MethodDefinitionReturnArray_20_2_testcorematchandDECs_black_nac_0BB(
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

	public static final Object[] pattern_MethodDefinitionReturnArray_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinitionReturnArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodDefinitionReturnArray _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tMethodSignature, tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDefinitionReturnArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDefinitionReturnArray_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_bindingFB(
			MethodDefinitionReturnArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDefinitionReturnArray _this) {
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

	public static final Object[] pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDefinitionReturnArray _this) {
		Object[] result_pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_binding = pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_black = pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_0BB(
			MMethodDefinition mDefinition, MMethodSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_465231 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_465231 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_465231)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_1BB(
			TypeAccess mTypeAccess, Type mTypeOfArray) {
		for (AbstractTypeDeclaration __DEC_mTypeAccess_superInterfaces_686240 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mTypeOfArray.equals(__DEC_mTypeAccess_superInterfaces_686240)) {
				return new Object[] { mTypeAccess, mTypeOfArray };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess mTypeAccess) {
		for (Annotation __DEC_mTypeAccess_type_905672 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, Annotation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_3BBB(
			TypeAccess mTypeAccess, ArrayType mType, Type mTypeOfArray) {
		if (!mType.equals(mTypeOfArray)) {
			for (ArrayType __DEC_mTypeAccess_elementType_942117 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mTypeAccess, ArrayType.class, "elementType")) {
				if (!mType.equals(__DEC_mTypeAccess_elementType_942117)) {
					if (!mTypeOfArray.equals(__DEC_mTypeAccess_elementType_942117)) {
						return new Object[] { mTypeAccess, mType, mTypeOfArray };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess mTypeAccess) {
		for (ClassInstanceCreation __DEC_mTypeAccess_type_911662 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_5BB(
			TypeAccess mTypeAccess, Type mTypeOfArray) {
		for (ClassDeclaration __DEC_mTypeAccess_superClass_496898 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!mTypeOfArray.equals(__DEC_mTypeAccess_superClass_496898)) {
				return new Object[] { mTypeAccess, mTypeOfArray };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_6BB(
			TypeAccess mTypeAccess, Type mTypeOfArray) {
		for (ParameterizedType __DEC_mTypeAccess_type_427135 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ParameterizedType.class, "type")) {
			if (!mTypeOfArray.equals(__DEC_mTypeAccess_type_427135)) {
				return new Object[] { mTypeAccess, mTypeOfArray };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess mTypeAccess) {
		for (TypeLiteral __DEC_mTypeAccess_type_960544 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess mTypeAccess) {
		for (AnnotationMemberValuePair __DEC_mTypeAccess_value_156440 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_9BB(
			ArrayType mType, TypeAccess mTypeAccess) {
		if (mTypeAccess.equals(mType.getElementType())) {
			return new Object[] { mType, mTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_blackFFFFFFB(
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
						Type tmpMType = mTypeAccess.getType();
						if (tmpMType instanceof ArrayType) {
							ArrayType mType = (ArrayType) tmpMType;
							TypeAccess mArrayTypeAccess = mType.getElementType();
							if (mArrayTypeAccess != null) {
								if (!mArrayTypeAccess.equals(mTypeAccess)) {
									Type mTypeOfArray = mArrayTypeAccess.getType();
									if (mTypeOfArray != null) {
										if (!mType.equals(mTypeOfArray)) {
											if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_2B(
													mTypeAccess) == null) {
												if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_4B(
														mTypeAccess) == null) {
													if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_7B(
															mTypeAccess) == null) {
														if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_8B(
																mTypeAccess) == null) {
															if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_0BB(
																	mDefinition, mSignature) == null) {
																if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_9BB(
																		mType, mTypeAccess) == null) {
																	if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_1BB(
																			mTypeAccess, mTypeOfArray) == null) {
																		if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_3BBB(
																				mTypeAccess, mType,
																				mTypeOfArray) == null) {
																			if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_5BB(
																					mTypeAccess,
																					mTypeOfArray) == null) {
																				if (pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_black_nac_6BB(
																						mTypeAccess,
																						mTypeOfArray) == null) {
																					_result.add(new Object[] {
																							mArrayTypeAccess, mType,
																							mTypeOfArray, mDefinition,
																							mTypeAccess, mSignature,
																							_edge_returnType });
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDefinitionReturnArray_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinitionReturnArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			MethodDefinitionReturnArray _this, Match match, TypeAccess mArrayTypeAccess, ArrayType mType,
			Type mTypeOfArray, MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mArrayTypeAccess, mType, mTypeOfArray, mDefinition,
				mTypeAccess, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDefinitionReturnArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDefinitionReturnArray_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_1_prepare_blackB(
			MethodDefinitionReturnArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_bindingFFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tType");
		EObject _localVariable_1 = sourceMatch.getObject("mArrayTypeAccess");
		EObject _localVariable_2 = targetMatch.getObject("tMethodSignature");
		EObject _localVariable_3 = sourceMatch.getObject("mType");
		EObject _localVariable_4 = sourceMatch.getObject("mTypeOfArray");
		EObject _localVariable_5 = targetMatch.getObject("tDefinition");
		EObject _localVariable_6 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_7 = sourceMatch.getObject("mTypeAccess");
		EObject _localVariable_8 = sourceMatch.getObject("mSignature");
		EObject tmpTType = _localVariable_0;
		EObject tmpMArrayTypeAccess = _localVariable_1;
		EObject tmpTMethodSignature = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpMTypeOfArray = _localVariable_4;
		EObject tmpTDefinition = _localVariable_5;
		EObject tmpMDefinition = _localVariable_6;
		EObject tmpMTypeAccess = _localVariable_7;
		EObject tmpMSignature = _localVariable_8;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpMArrayTypeAccess instanceof TypeAccess) {
				TypeAccess mArrayTypeAccess = (TypeAccess) tmpMArrayTypeAccess;
				if (tmpTMethodSignature instanceof TMethodSignature) {
					TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
					if (tmpMType instanceof ArrayType) {
						ArrayType mType = (ArrayType) tmpMType;
						if (tmpMTypeOfArray instanceof Type) {
							Type mTypeOfArray = (Type) tmpMTypeOfArray;
							if (tmpTDefinition instanceof TMethodDefinition) {
								TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
								if (tmpMDefinition instanceof MMethodDefinition) {
									MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
									if (tmpMTypeAccess instanceof TypeAccess) {
										TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
										if (tmpMSignature instanceof MMethodSignature) {
											MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
											return new Object[] { tType, mArrayTypeAccess, tMethodSignature, mType,
													mTypeOfArray, tDefinition, mDefinition, mTypeAccess, mSignature,
													targetMatch, sourceMatch };
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

	public static final Object[] pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_blackBBBBBBBBBBB(
			TAbstractType tType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature, ArrayType mType,
			Type mTypeOfArray, TMethodDefinition tDefinition, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		if (!mArrayTypeAccess.equals(mTypeAccess)) {
			if (!mType.equals(mTypeOfArray)) {
				if (!sourceMatch.equals(targetMatch)) {
					int tDefinition_lowerBound = tDefinition.getLowerBound();
					if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
						int tDefinition_upperBound = tDefinition.getUpperBound();
						if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(-1))) {
							return new Object[] { tType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
									tDefinition, mDefinition, mTypeAccess, mSignature, sourceMatch, targetMatch };
						}

					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding = pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_bindingFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding != null) {
			TAbstractType tType = (TAbstractType) result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding[0];
			TypeAccess mArrayTypeAccess = (TypeAccess) result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding[1];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding[2];
			ArrayType mType = (ArrayType) result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding[3];
			Type mTypeOfArray = (Type) result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding[4];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding[5];
			MMethodDefinition mDefinition = (MMethodDefinition) result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding[6];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding[7];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_binding[8];

			Object[] result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_black = pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_blackBBBBBBBBBBB(
					tType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray, tDefinition, mDefinition,
					mTypeAccess, mSignature, sourceMatch, targetMatch);
			if (result_pattern_MethodDefinitionReturnArray_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray, tDefinition,
						mDefinition, mTypeAccess, mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_3_solvecsp_bindingFBBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, TAbstractType tType, TypeAccess mArrayTypeAccess,
			TMethodSignature tMethodSignature, ArrayType mType, Type mTypeOfArray, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_9 = _this.isApplicable_solveCsp_CC(tType, mArrayTypeAccess, tMethodSignature, mType,
				mTypeOfArray, tDefinition, mDefinition, mTypeAccess, mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_9;
		if (csp != null) {
			return new Object[] { csp, _this, tType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
					tDefinition, mDefinition, mTypeAccess, mSignature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, TAbstractType tType, TypeAccess mArrayTypeAccess,
			TMethodSignature tMethodSignature, ArrayType mType, Type mTypeOfArray, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, MMethodSignature mSignature, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_MethodDefinitionReturnArray_24_3_solvecsp_binding = pattern_MethodDefinitionReturnArray_24_3_solvecsp_bindingFBBBBBBBBBBBB(
				_this, tType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray, tDefinition, mDefinition,
				mTypeAccess, mSignature, sourceMatch, targetMatch);
		if (result_pattern_MethodDefinitionReturnArray_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnArray_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_24_3_solvecsp_black = pattern_MethodDefinitionReturnArray_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnArray_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
						tDefinition, mDefinition, mTypeAccess, mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnArray_24_5_matchcorrcontext_blackBFBBFBBB(
			TAbstractType tType, TMethodSignature tMethodSignature, Type mTypeOfArray, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMethodSignature, MSignatureToTSignature.class, "target")) {
				if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mTypeOfArray, TypeToTAbstractType.class, "source")) {
						if (tType.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { tType, mTypeToTType, tMethodSignature, mTypeOfArray,
									mSignatureToTMethodSignature, mSignature, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTMethodSignature, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodDefinitionReturnArray";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mSignatureToTMethodSignature, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_6_createcorrespondence_blackBBBBBBBBBB(
			TAbstractType tType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature, ArrayType mType,
			Type mTypeOfArray, TMethodDefinition tDefinition, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			MMethodSignature mSignature, CCMatch ccMatch) {
		if (!mArrayTypeAccess.equals(mTypeAccess)) {
			if (!mType.equals(mTypeOfArray)) {
				return new Object[] { tType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray, tDefinition,
						mDefinition, mTypeAccess, mSignature, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_6_createcorrespondence_greenFFBBFB(
			TMethodDefinition tDefinition, MMethodDefinition mDefinition, CCMatch ccMatch) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTMember);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { mDefinitionToTMember, mFlowElementToTFlowElement, tDefinition, mDefinition,
				mBodyToTAnnotation, ccMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodDefinitionReturnArray";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinitionReturnArray_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_0BB(
			MMethodDefinition mDefinition, MMethodSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_450127 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_450127 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_450127)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_1BB(
			TypeAccess mTypeAccess, Type mTypeOfArray) {
		for (AbstractTypeDeclaration __DEC_mTypeAccess_superInterfaces_699984 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mTypeOfArray.equals(__DEC_mTypeAccess_superInterfaces_699984)) {
				return new Object[] { mTypeAccess, mTypeOfArray };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_2B(
			TypeAccess mTypeAccess) {
		for (Annotation __DEC_mTypeAccess_type_535625 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, Annotation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_3BBB(
			TypeAccess mTypeAccess, ArrayType mType, Type mTypeOfArray) {
		if (!mType.equals(mTypeOfArray)) {
			for (ArrayType __DEC_mTypeAccess_elementType_991694 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mTypeAccess, ArrayType.class, "elementType")) {
				if (!mType.equals(__DEC_mTypeAccess_elementType_991694)) {
					if (!mTypeOfArray.equals(__DEC_mTypeAccess_elementType_991694)) {
						return new Object[] { mTypeAccess, mType, mTypeOfArray };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_4B(
			TypeAccess mTypeAccess) {
		for (ClassInstanceCreation __DEC_mTypeAccess_type_415305 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_5BB(
			TypeAccess mTypeAccess, Type mTypeOfArray) {
		for (ClassDeclaration __DEC_mTypeAccess_superClass_223485 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!mTypeOfArray.equals(__DEC_mTypeAccess_superClass_223485)) {
				return new Object[] { mTypeAccess, mTypeOfArray };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_6BB(
			TypeAccess mTypeAccess, Type mTypeOfArray) {
		for (ParameterizedType __DEC_mTypeAccess_type_36629 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ParameterizedType.class, "type")) {
			if (!mTypeOfArray.equals(__DEC_mTypeAccess_type_36629)) {
				return new Object[] { mTypeAccess, mTypeOfArray };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_7B(
			TypeAccess mTypeAccess) {
		for (TypeLiteral __DEC_mTypeAccess_type_314234 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_8B(
			TypeAccess mTypeAccess) {
		for (AnnotationMemberValuePair __DEC_mTypeAccess_value_340123 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_9BB(ArrayType mType,
			TypeAccess mTypeAccess) {
		if (mTypeAccess.equals(mType.getElementType())) {
			return new Object[] { mType, mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_blackBBBBBB(
			TypeAccess mArrayTypeAccess, ArrayType mType, Type mTypeOfArray, MMethodDefinition mDefinition,
			TypeAccess mTypeAccess, MMethodSignature mSignature) {
		if (!mArrayTypeAccess.equals(mTypeAccess)) {
			if (!mType.equals(mTypeOfArray)) {
				if (mTypeOfArray.equals(mArrayTypeAccess.getType())) {
					if (mTypeAccess.equals(mDefinition.getReturnType())) {
						if (mType.equals(mTypeAccess.getType())) {
							if (mArrayTypeAccess.equals(mType.getElementType())) {
								if (mSignature.getMDefinitions().contains(mDefinition)) {
									if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_0BB(
											mDefinition, mSignature) == null) {
										if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_1BB(
												mTypeAccess, mTypeOfArray) == null) {
											if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_2B(
													mTypeAccess) == null) {
												if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_3BBB(
														mTypeAccess, mType, mTypeOfArray) == null) {
													if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_4B(
															mTypeAccess) == null) {
														if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_5BB(
																mTypeAccess, mTypeOfArray) == null) {
															if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_6BB(
																	mTypeAccess, mTypeOfArray) == null) {
																if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_7B(
																		mTypeAccess) == null) {
																	if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_8B(
																			mTypeAccess) == null) {
																		if (pattern_MethodDefinitionReturnArray_27_1_matchtggpattern_black_nac_9BB(
																				mType, mTypeAccess) == null) {
																			return new Object[] { mArrayTypeAccess,
																					mType, mTypeOfArray, mDefinition,
																					mTypeAccess, mSignature };
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_MethodDefinitionReturnArray_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_28_1_matchtggpattern_black_nac_0BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_signature_366481 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_366481 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_signature_366481)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_28_1_matchtggpattern_blackBBB(TAbstractType tType,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		if (tMethodSignature.getDefinitions().contains(tDefinition)) {
			if (tType.equals(tDefinition.getReturnType())) {
				if (pattern_MethodDefinitionReturnArray_28_1_matchtggpattern_black_nac_0BB(tDefinition,
						tMethodSignature) == null) {
					return new Object[] { tType, tMethodSignature, tDefinition };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_28_1_matchtggpattern_greenB(
			TMethodDefinition tDefinition) {
		int tDefinition_lowerBound_prime = Integer.valueOf(0);
		int tDefinition_upperBound_prime = Integer.valueOf(-1);
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		return new Object[] { tDefinition };
	}

	public static final boolean pattern_MethodDefinitionReturnArray_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_1_createresult_blackB(
			MethodDefinitionReturnArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type mTypeOfArray) {
		if (ruleResult.getSourceObjects().contains(mTypeOfArray)) {
			return new Object[] { ruleResult, mTypeOfArray };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeAccess mArrayTypeAccess) {
		if (ruleResult.getSourceObjects().contains(mArrayTypeAccess)) {
			return new Object[] { ruleResult, mArrayTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ArrayType mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tMethodSignature) {
		if (ruleResult.getTargetObjects().contains(tMethodSignature)) {
			return new Object[] { ruleResult, tMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTMethodSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTMethodSignature)) {
			return new Object[] { ruleResult, mSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mSignatureToTMethodSignatureList : ruleEntryContainer.getRuleEntryList()) {
				if (!mSignatureToTMethodSignatureList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							TAbstractType tType = mTypeToTType.getTarget();
							if (tType != null) {
								Type mTypeOfArray = mTypeToTType.getSource();
								if (mTypeOfArray != null) {
									if (pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, mTypeToTType) == null) {
										if (pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, tType) == null) {
											if (pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mTypeOfArray) == null) {
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
																if (pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_6BB(
																		ruleResult,
																		mSignatureToTMethodSignature) == null) {
																	if (pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_5BB(
																			ruleResult, tMethodSignature) == null) {
																		if (pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_7BB(
																				ruleResult, mSignature) == null) {
																			for (TypeAccess mArrayTypeAccess : mTypeOfArray
																					.getUsagesInTypeAccess()) {
																				if (pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult,
																						mArrayTypeAccess) == null) {
																					for (ArrayType mType : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									mArrayTypeAccess,
																									ArrayType.class,
																									"elementType")) {
																						if (!mType
																								.equals(mTypeOfArray)) {
																							if (pattern_MethodDefinitionReturnArray_29_2_isapplicablecore_black_nac_4BB(
																									ruleResult,
																									mType) == null) {
																								_result.add(
																										new Object[] {
																												mTypeToTTypeList,
																												tType,
																												mTypeToTType,
																												mTypeOfArray,
																												mArrayTypeAccess,
																												mType,
																												mSignatureToTMethodSignatureList,
																												tMethodSignature,
																												mSignatureToTMethodSignature,
																												mSignature,
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

	public static final Object[] pattern_MethodDefinitionReturnArray_29_3_solveCSP_bindingFBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tType, mTypeToTType,
				mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature, mSignature,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess,
					tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature, mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodDefinitionReturnArray _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodDefinitionReturnArray_29_3_solveCSP_binding = pattern_MethodDefinitionReturnArray_29_3_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
				mSignatureToTMethodSignature, mSignature, ruleResult);
		if (result_pattern_MethodDefinitionReturnArray_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinitionReturnArray_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinitionReturnArray_29_3_solveCSP_black = pattern_MethodDefinitionReturnArray_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinitionReturnArray_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, mArrayTypeAccess,
						tMethodSignature, mType, mTypeOfArray, mSignatureToTMethodSignature, mSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinitionReturnArray_29_4_checkCSP_expressionFBB(
			MethodDefinitionReturnArray _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_5_checknacs_blackBBBBBBBB(TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			MMethodSignature mSignature) {
		if (!mType.equals(mTypeOfArray)) {
			return new Object[] { tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
					mSignatureToTMethodSignature, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_6_perform_blackBBBBBBBBB(TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TypeAccess mArrayTypeAccess, TMethodSignature tMethodSignature,
			ArrayType mType, Type mTypeOfArray, MSignatureToTSignature mSignatureToTMethodSignature,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		if (!mType.equals(mTypeOfArray)) {
			return new Object[] { tType, mTypeToTType, mArrayTypeAccess, tMethodSignature, mType, mTypeOfArray,
					mSignatureToTMethodSignature, mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinitionReturnArray_29_6_perform_greenBFBFBFFFFBB(TAbstractType tType,
			TMethodSignature tMethodSignature, ArrayType mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		MMethodDefinition mDefinition = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeAccess mTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		int tDefinition_lowerBound_prime = Integer.valueOf(0);
		int tDefinition_upperBound_prime = Integer.valueOf(-1);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		tMethodSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		tDefinition.setReturnType(tType);
		ruleResult.getTargetObjects().add(tDefinition);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mDefinition.setReturnType(mTypeAccess);
		mTypeAccess.setType(mType);
		ruleResult.getSourceObjects().add(mTypeAccess);
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tType, mDefinitionToTMember, tMethodSignature, mFlowElementToTFlowElement, mType,
				tDefinition, mDefinition, mBodyToTAnnotation, mTypeAccess, mSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodDefinitionReturnArray_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodDefinitionReturnArrayImpl
