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
import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
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

import org.gravity.tgg.modisco.pm.Rules.MethodDefinition;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModule;
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
 * An implementation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionImpl extends AbstractRuleImpl implements MethodDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {

		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_0_1_initialbindings_blackBBBBBB(this,
				match, mDefinition, mTypeAccess, mType, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mDefinition, mTypeAccess,
						mType, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDefinitionImpl.pattern_MethodDefinition_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodDefinitionImpl
					.pattern_MethodDefinition_0_4_collectelementstobetranslated_blackBBBBB(match, mDefinition,
							mTypeAccess, mType, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
						+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodDefinitionImpl.pattern_MethodDefinition_0_4_collectelementstobetranslated_greenBBBBBFFFFF(match,
					mDefinition, mTypeAccess, mType, mSignature);
			//nothing EMoflonEdge mDefinition__mTypeAccess____returnType = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result4_green[9];

			Object[] result5_black = MethodDefinitionImpl
					.pattern_MethodDefinition_0_5_collectcontextelements_blackBBBBB(match, mDefinition, mTypeAccess,
							mType, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
						+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodDefinitionImpl.pattern_MethodDefinition_0_5_collectcontextelements_greenBBB(match, mType, mSignature);

			// 
			MethodDefinitionImpl.pattern_MethodDefinition_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					mDefinition, mTypeAccess, mType, mSignature);
			return MethodDefinitionImpl.pattern_MethodDefinition_0_7_expressionF();
		} else {
			return MethodDefinitionImpl.pattern_MethodDefinition_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[2];
		MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[3];
		MMethodDefinition mDefinition = (MMethodDefinition) result1_bindingAndBlack[4];
		TypeAccess mTypeAccess = (TypeAccess) result1_bindingAndBlack[5];
		Type mType = (Type) result1_bindingAndBlack[6];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = MethodDefinitionImpl.pattern_MethodDefinition_1_1_performtransformation_greenBFBFBFFB(
				tType, tMethodSignature, mDefinition, csp);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_green[3];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[5];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[6];

		Object[] result2_black = MethodDefinitionImpl
				.pattern_MethodDefinition_1_2_collecttranslatedelements_blackBBBBBB(mDefinitionToTMember, tDefinition,
						mDefinition, mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mTypeAccess] = " + mTypeAccess + ".");
		}
		Object[] result2_green = MethodDefinitionImpl
				.pattern_MethodDefinition_1_2_collecttranslatedelements_greenFBBBBBB(mDefinitionToTMember, tDefinition,
						mDefinition, mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDefinitionImpl
				.pattern_MethodDefinition_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, tType, mTypeToTType,
						mDefinitionToTMember, tMethodSignature, mSignatureToTMethodSignature, tDefinition, mDefinition,
						mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature
					+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		MethodDefinitionImpl.pattern_MethodDefinition_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult,
				tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition, mFlowElementToTFlowElement,
				mBodyToTAnnotation, mTypeAccess, mType, mSignature);
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
		MethodDefinitionImpl.pattern_MethodDefinition_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				tType, mTypeToTType, mDefinitionToTMember, tMethodSignature, mSignatureToTMethodSignature, tDefinition,
				mDefinition, mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess, mType, mSignature);
		return MethodDefinitionImpl.pattern_MethodDefinition_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionImpl
				.pattern_MethodDefinition_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDefinitionImpl.pattern_MethodDefinition_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition mDefinition = (MMethodDefinition) result2_binding[0];
		TypeAccess mTypeAccess = (TypeAccess) result2_binding[1];
		Type mType = (Type) result2_binding[2];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[3];
		for (Object[] result2_black : MethodDefinitionImpl.pattern_MethodDefinition_2_2_corematch_blackFFFFBBBBB(
				mDefinition, mTypeAccess, mType, mSignature, match)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[2];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[3];
			// ForEach 
			for (Object[] result3_black : MethodDefinitionImpl.pattern_MethodDefinition_2_3_findcontext_blackBBBBBBBB(
					tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mDefinition, mTypeAccess,
					mType, mSignature)) {
				Object[] result3_green = MethodDefinitionImpl
						.pattern_MethodDefinition_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(tType, mTypeToTType,
								tMethodSignature, mSignatureToTMethodSignature, mDefinition, mTypeAccess, mType,
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

				Object[] result4_bindingAndBlack = MethodDefinitionImpl
						.pattern_MethodDefinition_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mDefinition,
								mTypeAccess, mType, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tMethodSignature] = " + tMethodSignature
							+ ", " + "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
							+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDefinitionImpl.pattern_MethodDefinition_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodDefinitionImpl
							.pattern_MethodDefinition_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tMethodSignature_upperBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tMethodSignature.upperBound", true, csp);
		var_tMethodSignature_upperBound.setValue(tMethodSignature.getUpperBound());
		var_tMethodSignature_upperBound.setType("int");
		Variable var_tMethodSignature_lowerBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tMethodSignature.lowerBound", true, csp);
		var_tMethodSignature_lowerBound.setValue(tMethodSignature.getLowerBound());
		var_tMethodSignature_lowerBound.setType("int");

		// Create unbound variables
		Variable var_tDefinition_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition.upperBound", csp);
		var_tDefinition_upperBound.setType("int");
		Variable var_tDefinition_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition.lowerBound", csp);
		var_tDefinition_lowerBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tDefinition_upperBound, var_tMethodSignature_upperBound);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_tDefinition_lowerBound, var_tMethodSignature_lowerBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject tMethodSignature, EObject mSignatureToTMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mFlowElementToTFlowElement, EObject mBodyToTAnnotation,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
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

		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_10_1_initialbindings_blackBBBBB(this,
				match, tType, tMethodSignature, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}

		Object[] result2_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tType, tMethodSignature,
						tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDefinitionImpl.pattern_MethodDefinition_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodDefinitionImpl
					.pattern_MethodDefinition_10_4_collectelementstobetranslated_blackBBBB(match, tType,
							tMethodSignature, tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			MethodDefinitionImpl.pattern_MethodDefinition_10_4_collectelementstobetranslated_greenBBBBFFF(match, tType,
					tMethodSignature, tDefinition);
			//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tDefinition__tType____returnType = (EMoflonEdge) result4_green[6];

			Object[] result5_black = MethodDefinitionImpl
					.pattern_MethodDefinition_10_5_collectcontextelements_blackBBBB(match, tType, tMethodSignature,
							tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			MethodDefinitionImpl.pattern_MethodDefinition_10_5_collectcontextelements_greenBBB(match, tType,
					tMethodSignature);

			// 
			MethodDefinitionImpl.pattern_MethodDefinition_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tType, tMethodSignature, tDefinition);
			return MethodDefinitionImpl.pattern_MethodDefinition_10_7_expressionF();
		} else {
			return MethodDefinitionImpl.pattern_MethodDefinition_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[2];
		MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[3];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodDefinitionImpl
				.pattern_MethodDefinition_11_1_performtransformation_greenFBFFFFBB(tDefinition, mType, mSignature);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[0];
		MMethodDefinition mDefinition = (MMethodDefinition) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[4];
		TypeAccess mTypeAccess = (TypeAccess) result1_green[5];

		Object[] result2_black = MethodDefinitionImpl
				.pattern_MethodDefinition_11_2_collecttranslatedelements_blackBBBBBB(mDefinitionToTMember, tDefinition,
						mDefinition, mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mTypeAccess] = " + mTypeAccess + ".");
		}
		Object[] result2_green = MethodDefinitionImpl
				.pattern_MethodDefinition_11_2_collecttranslatedelements_greenFBBBBBB(mDefinitionToTMember, tDefinition,
						mDefinition, mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDefinitionImpl
				.pattern_MethodDefinition_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, tType, mTypeToTType,
						mDefinitionToTMember, tMethodSignature, mSignatureToTMethodSignature, tDefinition, mDefinition,
						mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess, mType, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature
					+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mType] = " + mType + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		MethodDefinitionImpl.pattern_MethodDefinition_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess, mType, mSignature);
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
		MethodDefinitionImpl.pattern_MethodDefinition_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				tType, mTypeToTType, mDefinitionToTMember, tMethodSignature, mSignatureToTMethodSignature, tDefinition,
				mDefinition, mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess, mType, mSignature);
		return MethodDefinitionImpl.pattern_MethodDefinition_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDefinitionImpl
				.pattern_MethodDefinition_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDefinitionImpl.pattern_MethodDefinition_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tType = (TAbstractType) result2_binding[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result2_binding[2];
		for (Object[] result2_black : MethodDefinitionImpl.pattern_MethodDefinition_12_2_corematch_blackBFBFBFFB(tType,
				tMethodSignature, tDefinition, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[3];
			Type mType = (Type) result2_black[5];
			MMethodSignature mSignature = (MMethodSignature) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodDefinitionImpl.pattern_MethodDefinition_12_3_findcontext_blackBBBBBBB(
					tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, tDefinition, mType,
					mSignature)) {
				Object[] result3_green = MethodDefinitionImpl
						.pattern_MethodDefinition_12_3_findcontext_greenBBBBBBBFFFFFFFF(tType, mTypeToTType,
								tMethodSignature, mSignatureToTMethodSignature, tDefinition, mType, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tDefinition__tType____returnType = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = MethodDefinitionImpl
						.pattern_MethodDefinition_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, tDefinition, mType,
								mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tMethodSignature] = " + tMethodSignature
							+ ", " + "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
							+ mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDefinitionImpl.pattern_MethodDefinition_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodDefinitionImpl
							.pattern_MethodDefinition_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_12_7_expressionFB(ruleresult);
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
		Variable var_tDefinition_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition.upperBound", true,
				csp);
		var_tDefinition_upperBound.setValue(tDefinition.getUpperBound());
		var_tDefinition_upperBound.setType("int");
		Variable var_tMethodSignature_upperBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tMethodSignature.upperBound", true, csp);
		var_tMethodSignature_upperBound.setValue(tMethodSignature.getUpperBound());
		var_tMethodSignature_upperBound.setType("int");
		Variable var_tDefinition_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition.lowerBound", true,
				csp);
		var_tDefinition_lowerBound.setValue(tDefinition.getLowerBound());
		var_tDefinition_lowerBound.setType("int");
		Variable var_tMethodSignature_lowerBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tMethodSignature.lowerBound", true, csp);
		var_tMethodSignature_lowerBound.setValue(tMethodSignature.getLowerBound());
		var_tMethodSignature_lowerBound.setType("int");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tDefinition_upperBound, var_tMethodSignature_upperBound);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_tDefinition_lowerBound, var_tMethodSignature_lowerBound);
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
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodDefinition tDefinition, Type mType,
			MMethodSignature mSignature) {// Create CSP
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
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject tMethodSignature, EObject mSignatureToTMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mFlowElementToTFlowElement, EObject mBodyToTAnnotation,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_78(EMoflonEdge _edge_definitions) {

		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDefinitionImpl.pattern_MethodDefinition_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDefinitionImpl
				.pattern_MethodDefinition_20_2_testcorematchandDECs_blackFFFB(_edge_definitions)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TMethodDefinition tDefinition = (TMethodDefinition) result2_black[2];
			Object[] result2_green = MethodDefinitionImpl
					.pattern_MethodDefinition_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDefinitionImpl
					.pattern_MethodDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tType, tMethodSignature, tDefinition)) {
				// 
				if (MethodDefinitionImpl
						.pattern_MethodDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodDefinitionImpl
							.pattern_MethodDefinition_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_81(EMoflonEdge _edge_returnType) {

		Object[] result1_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDefinitionImpl.pattern_MethodDefinition_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDefinitionImpl
				.pattern_MethodDefinition_21_2_testcorematchandDECs_blackFFFFB(_edge_returnType)) {
			MMethodDefinition mDefinition = (MMethodDefinition) result2_black[0];
			TypeAccess mTypeAccess = (TypeAccess) result2_black[1];
			Type mType = (Type) result2_black[2];
			MMethodSignature mSignature = (MMethodSignature) result2_black[3];
			Object[] result2_green = MethodDefinitionImpl
					.pattern_MethodDefinition_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDefinitionImpl
					.pattern_MethodDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, mDefinition, mTypeAccess, mType, mSignature)) {
				// 
				if (MethodDefinitionImpl
						.pattern_MethodDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodDefinitionImpl
							.pattern_MethodDefinition_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tDefinition_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition", true, csp);
		var_tDefinition_upperBound.setValue(__helper.getValue("tDefinition", "upperBound"));
		var_tDefinition_upperBound.setType("int");

		Variable var_tDefinition_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition", true, csp);
		var_tDefinition_lowerBound.setValue(__helper.getValue("tDefinition", "lowerBound"));
		var_tDefinition_lowerBound.setType("int");

		Variable var_tMethodSignature_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tMethodSignature", true,
				csp);
		var_tMethodSignature_lowerBound.setValue(__helper.getValue("tMethodSignature", "lowerBound"));
		var_tMethodSignature_lowerBound.setType("int");

		Variable var_tMethodSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tMethodSignature", true,
				csp);
		var_tMethodSignature_upperBound.setValue(__helper.getValue("tMethodSignature", "upperBound"));
		var_tMethodSignature_upperBound.setType("int");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("MethodDefinition");
		eq0.solve(var_tDefinition_upperBound, var_tMethodSignature_upperBound);

		eq1.setRuleName("MethodDefinition");
		eq1.solve(var_tDefinition_lowerBound, var_tMethodSignature_lowerBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tDefinition_upperBound.setBound(false);
			var_tDefinition_lowerBound.setBound(false);
			eq0.solve(var_tDefinition_upperBound, var_tMethodSignature_upperBound);
			eq1.solve(var_tDefinition_lowerBound, var_tMethodSignature_lowerBound);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tDefinition", "upperBound", var_tDefinition_upperBound.getValue());
				__helper.setValue("tDefinition", "lowerBound", var_tDefinition_lowerBound.getValue());
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
		ruleResult.setRule("MethodDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tDefinition_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition", true, csp);
		var_tDefinition_upperBound.setValue(__helper.getValue("tDefinition", "upperBound"));
		var_tDefinition_upperBound.setType("int");

		Variable var_tDefinition_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition", true, csp);
		var_tDefinition_lowerBound.setValue(__helper.getValue("tDefinition", "lowerBound"));
		var_tDefinition_lowerBound.setType("int");

		Variable var_tMethodSignature_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tMethodSignature", true,
				csp);
		var_tMethodSignature_lowerBound.setValue(__helper.getValue("tMethodSignature", "lowerBound"));
		var_tMethodSignature_lowerBound.setType("int");

		Variable var_tMethodSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tMethodSignature", true,
				csp);
		var_tMethodSignature_upperBound.setValue(__helper.getValue("tMethodSignature", "upperBound"));
		var_tMethodSignature_upperBound.setType("int");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("MethodDefinition");
		eq0.solve(var_tDefinition_upperBound, var_tMethodSignature_upperBound);

		eq1.setRuleName("MethodDefinition");
		eq1.solve(var_tDefinition_lowerBound, var_tMethodSignature_lowerBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			eq0.solve(var_tDefinition_upperBound, var_tMethodSignature_upperBound);
			eq1.solve(var_tDefinition_lowerBound, var_tMethodSignature_lowerBound);
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

		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDefinitionImpl.pattern_MethodDefinition_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch, targetMatch);
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

		Object[] result3_bindingAndBlack = MethodDefinitionImpl
				.pattern_MethodDefinition_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, tType, tMethodSignature,
						tDefinition, mDefinition, mTypeAccess, mType, mSignature, sourceMatch, targetMatch);
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
		if (MethodDefinitionImpl.pattern_MethodDefinition_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodDefinitionImpl
					.pattern_MethodDefinition_24_5_matchcorrcontext_blackBFBFBBBB(tType, tMethodSignature, mType,
							mSignature, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[1];
				MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result5_black[3];
				Object[] result5_green = MethodDefinitionImpl.pattern_MethodDefinition_24_5_matchcorrcontext_greenBBBBF(
						mTypeToTType, mSignatureToTMethodSignature, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodDefinitionImpl
						.pattern_MethodDefinition_24_6_createcorrespondence_blackBBBBBBBB(tType, tMethodSignature,
								tDefinition, mDefinition, mTypeAccess, mType, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
							+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tDefinition] = " + tDefinition
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
							+ "[mType] = " + mType + ", " + "[mSignature] = " + mSignature + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				MethodDefinitionImpl.pattern_MethodDefinition_24_6_createcorrespondence_greenFBBFFB(tDefinition,
						mDefinition, ccMatch);
				//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[0];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[3];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[4];

				Object[] result7_black = MethodDefinitionImpl
						.pattern_MethodDefinition_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodDefinitionImpl.pattern_MethodDefinition_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodDefinitionImpl.pattern_MethodDefinition_24_8_expressionFB(result);
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
		Variable var_tDefinition_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition.upperBound", true,
				csp);
		var_tDefinition_upperBound.setValue(tDefinition.getUpperBound());
		var_tDefinition_upperBound.setType("int");
		Variable var_tMethodSignature_upperBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tMethodSignature.upperBound", true, csp);
		var_tMethodSignature_upperBound.setValue(tMethodSignature.getUpperBound());
		var_tMethodSignature_upperBound.setType("int");
		Variable var_tDefinition_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition.lowerBound", true,
				csp);
		var_tDefinition_lowerBound.setValue(tDefinition.getLowerBound());
		var_tDefinition_lowerBound.setType("int");
		Variable var_tMethodSignature_lowerBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tMethodSignature.lowerBound", true, csp);
		var_tMethodSignature_lowerBound.setValue(tMethodSignature.getLowerBound());
		var_tMethodSignature_lowerBound.setType("int");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tDefinition_upperBound, var_tMethodSignature_upperBound);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_tDefinition_lowerBound, var_tMethodSignature_lowerBound);
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
		Object[] result1_black = MethodDefinitionImpl
				.pattern_MethodDefinition_27_1_matchtggpattern_blackBBBB(mDefinition, mTypeAccess, mType, mSignature);
		if (result1_black != null) {
			return MethodDefinitionImpl.pattern_MethodDefinition_27_2_expressionF();
		} else {
			return MethodDefinitionImpl.pattern_MethodDefinition_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {// 
		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_28_1_matchtggpattern_blackBBB(tType,
				tMethodSignature, tDefinition);
		if (result1_black != null) {
			return MethodDefinitionImpl.pattern_MethodDefinition_28_2_expressionF();
		} else {
			return MethodDefinitionImpl.pattern_MethodDefinition_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MSignatureToTSignature mSignatureToTMethodSignatureParameter) {

		Object[] result1_black = MethodDefinitionImpl.pattern_MethodDefinition_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDefinitionImpl.pattern_MethodDefinition_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodDefinitionImpl
				.pattern_MethodDefinition_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			Type mType = (Type) result2_black[3];
			//nothing RuleEntryList mSignatureToTMethodSignatureList = (RuleEntryList) result2_black[4];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[5];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[6];
			MMethodSignature mSignature = (MMethodSignature) result2_black[7];

			Object[] result3_bindingAndBlack = MethodDefinitionImpl
					.pattern_MethodDefinition_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, tType,
							mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mType, mSignature,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
						+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", " + "[mType] = "
						+ mType + ", " + "[mSignature] = " + mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodDefinitionImpl.pattern_MethodDefinition_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodDefinitionImpl.pattern_MethodDefinition_29_5_checknacs_blackBBBBBB(tType,
						mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mType, mSignature);
				if (result5_black != null) {

					Object[] result6_black = MethodDefinitionImpl.pattern_MethodDefinition_29_6_perform_blackBBBBBBB(
							tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mType, mSignature,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType
								+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tMethodSignature] = "
								+ tMethodSignature + ", " + "[mSignatureToTMethodSignature] = "
								+ mSignatureToTMethodSignature + ", " + "[mType] = " + mType + ", " + "[mSignature] = "
								+ mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodDefinitionImpl.pattern_MethodDefinition_29_6_perform_greenBFBFFFFFBBBB(tType,
							tMethodSignature, mType, mSignature, ruleResult, csp);
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[1];
					//nothing TMethodDefinition tDefinition = (TMethodDefinition) result6_green[3];
					//nothing MMethodDefinition mDefinition = (MMethodDefinition) result6_green[4];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[5];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[6];
					//nothing TypeAccess mTypeAccess = (TypeAccess) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return MethodDefinitionImpl.pattern_MethodDefinition_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tMethodSignature_upperBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tMethodSignature.upperBound", true, csp);
		var_tMethodSignature_upperBound.setValue(tMethodSignature.getUpperBound());
		var_tMethodSignature_upperBound.setType("int");
		Variable var_tMethodSignature_lowerBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tMethodSignature.lowerBound", true, csp);
		var_tMethodSignature_lowerBound.setValue(tMethodSignature.getLowerBound());
		var_tMethodSignature_lowerBound.setType("int");

		// Create unbound variables
		Variable var_tDefinition_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition.upperBound", csp);
		var_tDefinition_upperBound.setType("int");
		Variable var_tDefinition_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tDefinition.lowerBound", csp);
		var_tDefinition_lowerBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tDefinition_upperBound, var_tMethodSignature_upperBound);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_tDefinition_lowerBound, var_tMethodSignature_lowerBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
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
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (MMethodSignature) arguments.get(4));
		case RulesPackage.METHOD_DEFINITION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (MMethodSignature) arguments.get(4));
			return null;
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (MMethodSignature) arguments.get(4));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TMETHODSIGNATURE_MSIGNATURETOTSIGNATURE_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TMethodSignature) arguments.get(3),
					(MSignatureToTSignature) arguments.get(4), (MMethodDefinition) arguments.get(5),
					(TypeAccess) arguments.get(6), (Type) arguments.get(7), (MMethodSignature) arguments.get(8));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_DEFINITION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
			return null;
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TMETHODSIGNATURE_MSIGNATURETOTSIGNATURE_TMETHODDEFINITION_TYPE_MMETHODSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TMethodSignature) arguments.get(3),
					(MSignatureToTSignature) arguments.get(4), (TMethodDefinition) arguments.get(5),
					(Type) arguments.get(6), (MMethodSignature) arguments.get(7));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.METHOD_DEFINITION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_78__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_78((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_81__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_81((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_CC__TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION_MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TAbstractType) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3),
					(TypeAccess) arguments.get(4), (Type) arguments.get(5), (MMethodSignature) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.METHOD_DEFINITION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEFINITION___CHECK_DEC_FWD__MMETHODDEFINITION_TYPEACCESS_TYPE_MMETHODSIGNATURE:
			return checkDEC_FWD((MMethodDefinition) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2), (MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_DEFINITION___CHECK_DEC_BWD__TABSTRACTTYPE_TMETHODSIGNATURE_TMETHODDEFINITION:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MSIGNATURETOTSIGNATURE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MSignatureToTSignature) arguments.get(2));
		case RulesPackage.METHOD_DEFINITION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TMETHODSIGNATURE_MSIGNATURETOTSIGNATURE_TYPE_MMETHODSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TMethodSignature) arguments.get(3),
					(MSignatureToTSignature) arguments.get(4), (Type) arguments.get(5),
					(MMethodSignature) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_DEFINITION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodDefinition_0_1_initialbindings_blackBBBBBB(MethodDefinition _this,
			Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {
		return new Object[] { _this, match, mDefinition, mTypeAccess, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinition_0_2_SolveCSP_bindingFBBBBBB(MethodDefinition _this,
			Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mTypeAccess, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mTypeAccess, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_0_2_SolveCSP_bindingAndBlackFBBBBBB(MethodDefinition _this,
			Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {
		Object[] result_pattern_MethodDefinition_0_2_SolveCSP_binding = pattern_MethodDefinition_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mDefinition, mTypeAccess, mType, mSignature);
		if (result_pattern_MethodDefinition_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_0_2_SolveCSP_black = pattern_MethodDefinition_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mTypeAccess, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_0_3_CheckCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {
		return new Object[] { match, mDefinition, mTypeAccess, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinition_0_4_collectelementstobetranslated_greenBBBBBFFFFF(Match match,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {
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

	public static final Object[] pattern_MethodDefinition_0_5_collectcontextelements_blackBBBBB(Match match,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {
		return new Object[] { match, mDefinition, mTypeAccess, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinition_0_5_collectcontextelements_greenBBB(Match match, Type mType,
			MMethodSignature mSignature) {
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mSignature);
		return new Object[] { match, mType, mSignature };
	}

	public static final void pattern_MethodDefinition_0_6_registerobjectstomatch_expressionBBBBBB(
			MethodDefinition _this, Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mTypeAccess, mType, mSignature);

	}

	public static final boolean pattern_MethodDefinition_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("mType");
		EObject _localVariable_7 = isApplicableMatch.getObject("mSignature");
		EObject tmpTType = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpTMethodSignature = _localVariable_2;
		EObject tmpMSignatureToTMethodSignature = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpMTypeAccess = _localVariable_5;
		EObject tmpMType = _localVariable_6;
		EObject tmpMSignature = _localVariable_7;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpTMethodSignature instanceof TMethodSignature) {
					TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
					if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
						MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
						if (tmpMDefinition instanceof MMethodDefinition) {
							MMethodDefinition mDefinition = (MMethodDefinition) tmpMDefinition;
							if (tmpMTypeAccess instanceof TypeAccess) {
								TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
								if (tmpMType instanceof Type) {
									Type mType = (Type) tmpMType;
									if (tmpMSignature instanceof MMethodSignature) {
										MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
										return new Object[] { tType, mTypeToTType, tMethodSignature,
												mSignatureToTMethodSignature, mDefinition, mTypeAccess, mType,
												mSignature, isApplicableMatch };
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

	public static final Object[] pattern_MethodDefinition_1_1_performtransformation_blackBBBBBBBBFBB(
			TAbstractType tType, TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature, MethodDefinition _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mDefinition,
						mTypeAccess, mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			MethodDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinition_1_1_performtransformation_binding = pattern_MethodDefinition_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDefinition_1_1_performtransformation_binding != null) {
			TAbstractType tType = (TAbstractType) result_pattern_MethodDefinition_1_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodDefinition_1_1_performtransformation_binding[1];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinition_1_1_performtransformation_binding[2];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_MethodDefinition_1_1_performtransformation_binding[3];
			MMethodDefinition mDefinition = (MMethodDefinition) result_pattern_MethodDefinition_1_1_performtransformation_binding[4];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_MethodDefinition_1_1_performtransformation_binding[5];
			Type mType = (Type) result_pattern_MethodDefinition_1_1_performtransformation_binding[6];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinition_1_1_performtransformation_binding[7];

			Object[] result_pattern_MethodDefinition_1_1_performtransformation_black = pattern_MethodDefinition_1_1_performtransformation_blackBBBBBBBBFBB(
					tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mDefinition, mTypeAccess,
					mType, mSignature, _this, isApplicableMatch);
			if (result_pattern_MethodDefinition_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinition_1_1_performtransformation_black[8];

				return new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mDefinition,
						mTypeAccess, mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_1_1_performtransformation_greenBFBFBFFB(TAbstractType tType,
			TMethodSignature tMethodSignature, MMethodDefinition mDefinition, CSP csp) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tDefinition", "upperBound");
		Object _localVariable_1 = csp.getValue("tDefinition", "lowerBound");
		mDefinitionToTMember.setSource(mDefinition);
		tMethodSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		tDefinition.setReturnType(tType);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		int tDefinition_upperBound_prime = (int) _localVariable_0;
		int tDefinition_lowerBound_prime = (int) _localVariable_1;
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		return new Object[] { tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mFlowElementToTFlowElement, mBodyToTAnnotation, csp };
	}

	public static final Object[] pattern_MethodDefinition_1_2_collecttranslatedelements_blackBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			ASTNodeToTAnnotatable mBodyToTAnnotation, TypeAccess mTypeAccess) {
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mFlowElementToTFlowElement,
				mBodyToTAnnotation, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinition_1_2_collecttranslatedelements_greenFBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			ASTNodeToTAnnotatable mBodyToTAnnotation, TypeAccess mTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedElements().add(tDefinition);
		ruleresult.getTranslatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(mTypeAccess);
		return new Object[] { ruleresult, mDefinitionToTMember, tDefinition, mDefinition, mFlowElementToTFlowElement,
				mBodyToTAnnotation, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinition_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mDefinitionToTMember,
			EObject tMethodSignature, EObject mSignatureToTMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mFlowElementToTFlowElement, EObject mBodyToTAnnotation, EObject mTypeAccess, EObject mType,
			EObject mSignature) {
		if (!mTypeToTType.equals(tType)) {
			if (!mTypeToTType.equals(tMethodSignature)) {
				if (!mTypeToTType.equals(tDefinition)) {
					if (!mDefinitionToTMember.equals(tType)) {
						if (!mDefinitionToTMember.equals(mTypeToTType)) {
							if (!mDefinitionToTMember.equals(tMethodSignature)) {
								if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
									if (!mDefinitionToTMember.equals(tDefinition)) {
										if (!mDefinitionToTMember.equals(mFlowElementToTFlowElement)) {
											if (!mDefinitionToTMember.equals(mTypeAccess)) {
												if (!mDefinitionToTMember.equals(mType)) {
													if (!mDefinitionToTMember.equals(mSignature)) {
														if (!tMethodSignature.equals(tType)) {
															if (!mSignatureToTMethodSignature.equals(tType)) {
																if (!mSignatureToTMethodSignature
																		.equals(mTypeToTType)) {
																	if (!mSignatureToTMethodSignature
																			.equals(tMethodSignature)) {
																		if (!mSignatureToTMethodSignature
																				.equals(tDefinition)) {
																			if (!mSignatureToTMethodSignature
																					.equals(mTypeAccess)) {
																				if (!mSignatureToTMethodSignature
																						.equals(mType)) {
																					if (!tDefinition.equals(tType)) {
																						if (!tDefinition.equals(
																								tMethodSignature)) {
																							if (!mDefinition
																									.equals(tType)) {
																								if (!mDefinition.equals(
																										mTypeToTType)) {
																									if (!mDefinition
																											.equals(mDefinitionToTMember)) {
																										if (!mDefinition
																												.equals(tMethodSignature)) {
																											if (!mDefinition
																													.equals(mSignatureToTMethodSignature)) {
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
																																	if (!mFlowElementToTFlowElement
																																			.equals(tType)) {
																																		if (!mFlowElementToTFlowElement
																																				.equals(mTypeToTType)) {
																																			if (!mFlowElementToTFlowElement
																																					.equals(tMethodSignature)) {
																																				if (!mFlowElementToTFlowElement
																																						.equals(mSignatureToTMethodSignature)) {
																																					if (!mFlowElementToTFlowElement
																																							.equals(tDefinition)) {
																																						if (!mFlowElementToTFlowElement
																																								.equals(mTypeAccess)) {
																																							if (!mFlowElementToTFlowElement
																																									.equals(mType)) {
																																								if (!mFlowElementToTFlowElement
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
																																															.equals(mSignatureToTMethodSignature)) {
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
																																																				if (!mTypeAccess
																																																						.equals(tType)) {
																																																					if (!mTypeAccess
																																																							.equals(mTypeToTType)) {
																																																						if (!mTypeAccess
																																																								.equals(tMethodSignature)) {
																																																							if (!mTypeAccess
																																																									.equals(tDefinition)) {
																																																								if (!mType
																																																										.equals(tType)) {
																																																									if (!mType
																																																											.equals(mTypeToTType)) {
																																																										if (!mType
																																																												.equals(tMethodSignature)) {
																																																											if (!mType
																																																													.equals(tDefinition)) {
																																																												if (!mType
																																																														.equals(mTypeAccess)) {
																																																													if (!mSignature
																																																															.equals(tType)) {
																																																														if (!mSignature
																																																																.equals(mTypeToTType)) {
																																																															if (!mSignature
																																																																	.equals(tMethodSignature)) {
																																																																if (!mSignature
																																																																		.equals(mSignatureToTMethodSignature)) {
																																																																	if (!mSignature
																																																																			.equals(tDefinition)) {
																																																																		if (!mSignature
																																																																				.equals(mTypeAccess)) {
																																																																			if (!mSignature
																																																																					.equals(mType)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						tType,
																																																																						mTypeToTType,
																																																																						mDefinitionToTMember,
																																																																						tMethodSignature,
																																																																						mSignatureToTMethodSignature,
																																																																						tDefinition,
																																																																						mDefinition,
																																																																						mFlowElementToTFlowElement,
																																																																						mBodyToTAnnotation,
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

	public static final Object[] pattern_MethodDefinition_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mFlowElementToTFlowElement, EObject mBodyToTAnnotation,
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
		String ruleresult_ruleName_prime = "MethodDefinition";
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
				mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess, mType, mSignature,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				mDefinition__mTypeAccess____returnType, mFlowElementToTFlowElement__mDefinition____source,
				mTypeAccess__mType____type, mType__mTypeAccess____usagesInTypeAccess,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				mFlowElementToTFlowElement__tDefinition____target, tDefinition__tType____returnType,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__tDefinition____target,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature };
	}

	public static final void pattern_MethodDefinition_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodDefinition _this, PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject tMethodSignature, EObject mSignatureToTMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mFlowElementToTFlowElement, EObject mBodyToTAnnotation,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, tType, mTypeToTType, mDefinitionToTMember, tMethodSignature,
				mSignatureToTMethodSignature, tDefinition, mDefinition, mFlowElementToTFlowElement, mBodyToTAnnotation,
				mTypeAccess, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodDefinition_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_2_1_preparereturnvalue_bindingFB(MethodDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDefinition _this) {
		Object[] result_pattern_MethodDefinition_2_1_preparereturnvalue_binding = pattern_MethodDefinition_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinition_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinition_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinition_2_1_preparereturnvalue_black = pattern_MethodDefinition_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinition_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinition_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinition_2_2_corematch_bindingFFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MethodDefinition_2_2_corematch_blackFFFFBBBBB(
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
						_result.add(new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature,
								mDefinition, mTypeAccess, mType, mSignature, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_2_3_findcontext_blackBBBBBBBB(TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mTypeAccess.equals(mDefinition.getReturnType())) {
			if (mType.equals(mTypeAccess.getType())) {
				if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
					if (mSignature.getMDefinitions().contains(mDefinition)) {
						if (tType.equals(mTypeToTType.getTarget())) {
							if (mType.equals(mTypeToTType.getSource())) {
								if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
									_result.add(new Object[] { tType, mTypeToTType, tMethodSignature,
											mSignatureToTMethodSignature, mDefinition, mTypeAccess, mType,
											mSignature });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {
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
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
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
		return new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mDefinition,
				mTypeAccess, mType, mSignature, isApplicableMatch, mDefinition__mTypeAccess____returnType,
				mTypeAccess__mType____type, mType__mTypeAccess____usagesInTypeAccess,
				mSignatureToTMethodSignature__tMethodSignature____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature, mTypeToTType__tType____target, mTypeToTType__mType____source,
				mSignatureToTMethodSignature__mSignature____source };
	}

	public static final Object[] pattern_MethodDefinition_2_4_solveCSP_bindingFBBBBBBBBBB(MethodDefinition _this,
			IsApplicableMatch isApplicableMatch, TAbstractType tType, TypeToTAbstractType mTypeToTType,
			TMethodSignature tMethodSignature, MSignatureToTSignature mSignatureToTMethodSignature,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tType, mTypeToTType, tMethodSignature,
				mSignatureToTMethodSignature, mDefinition, mTypeAccess, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, tMethodSignature,
					mSignatureToTMethodSignature, mDefinition, mTypeAccess, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			MethodDefinition _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, MMethodDefinition mDefinition, TypeAccess mTypeAccess,
			Type mType, MMethodSignature mSignature) {
		Object[] result_pattern_MethodDefinition_2_4_solveCSP_binding = pattern_MethodDefinition_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature,
				mDefinition, mTypeAccess, mType, mSignature);
		if (result_pattern_MethodDefinition_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_2_4_solveCSP_black = pattern_MethodDefinition_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, tMethodSignature,
						mSignatureToTMethodSignature, mDefinition, mTypeAccess, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_2_5_checkCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinition_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinition_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_10_1_initialbindings_blackBBBBB(MethodDefinition _this,
			Match match, TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		return new Object[] { _this, match, tType, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_MethodDefinition_10_2_SolveCSP_bindingFBBBBB(MethodDefinition _this,
			Match match, TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tMethodSignature, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tMethodSignature, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_10_2_SolveCSP_bindingAndBlackFBBBBB(MethodDefinition _this,
			Match match, TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		Object[] result_pattern_MethodDefinition_10_2_SolveCSP_binding = pattern_MethodDefinition_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tType, tMethodSignature, tDefinition);
		if (result_pattern_MethodDefinition_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_10_2_SolveCSP_black = pattern_MethodDefinition_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tMethodSignature, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_10_3_CheckCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		return new Object[] { match, tType, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_MethodDefinition_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
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

	public static final Object[] pattern_MethodDefinition_10_5_collectcontextelements_blackBBBB(Match match,
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		return new Object[] { match, tType, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_MethodDefinition_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tType, TMethodSignature tMethodSignature) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tMethodSignature);
		return new Object[] { match, tType, tMethodSignature };
	}

	public static final void pattern_MethodDefinition_10_6_registerobjectstomatch_expressionBBBBB(
			MethodDefinition _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tType, tMethodSignature, tDefinition);

	}

	public static final boolean pattern_MethodDefinition_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignature");
		EObject tmpTType = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpTMethodSignature = _localVariable_2;
		EObject tmpMSignatureToTMethodSignature = _localVariable_3;
		EObject tmpTDefinition = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpMSignature = _localVariable_6;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpTMethodSignature instanceof TMethodSignature) {
					TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
					if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
						MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
						if (tmpTDefinition instanceof TMethodDefinition) {
							TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpMSignature instanceof MMethodSignature) {
									MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
									return new Object[] { tType, mTypeToTType, tMethodSignature,
											mSignatureToTMethodSignature, tDefinition, mType, mSignature,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_11_1_performtransformation_blackBBBBBBBFBB(
			TAbstractType tType, TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodDefinition tDefinition, Type mType,
			MMethodSignature mSignature, MethodDefinition _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, tDefinition,
						mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDefinition_11_1_performtransformation_binding = pattern_MethodDefinition_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDefinition_11_1_performtransformation_binding != null) {
			TAbstractType tType = (TAbstractType) result_pattern_MethodDefinition_11_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodDefinition_11_1_performtransformation_binding[1];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinition_11_1_performtransformation_binding[2];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_MethodDefinition_11_1_performtransformation_binding[3];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_MethodDefinition_11_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_MethodDefinition_11_1_performtransformation_binding[5];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinition_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodDefinition_11_1_performtransformation_black = pattern_MethodDefinition_11_1_performtransformation_blackBBBBBBBFBB(
					tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, tDefinition, mType, mSignature,
					_this, isApplicableMatch);
			if (result_pattern_MethodDefinition_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDefinition_11_1_performtransformation_black[7];

				return new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, tDefinition,
						mType, mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_11_1_performtransformation_greenFBFFFFBB(
			TMethodDefinition tDefinition, Type mType, MMethodSignature mSignature) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MMethodDefinition mDefinition = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeAccess mTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mDefinition.setReturnType(mTypeAccess);
		mTypeAccess.setType(mType);
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mFlowElementToTFlowElement,
				mBodyToTAnnotation, mTypeAccess, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinition_11_2_collecttranslatedelements_blackBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			ASTNodeToTAnnotatable mBodyToTAnnotation, TypeAccess mTypeAccess) {
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mFlowElementToTFlowElement,
				mBodyToTAnnotation, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinition_11_2_collecttranslatedelements_greenFBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			ASTNodeToTAnnotatable mBodyToTAnnotation, TypeAccess mTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getTranslatedElements().add(tDefinition);
		ruleresult.getCreatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(mTypeAccess);
		return new Object[] { ruleresult, mDefinitionToTMember, tDefinition, mDefinition, mFlowElementToTFlowElement,
				mBodyToTAnnotation, mTypeAccess };
	}

	public static final Object[] pattern_MethodDefinition_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mDefinitionToTMember,
			EObject tMethodSignature, EObject mSignatureToTMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mFlowElementToTFlowElement, EObject mBodyToTAnnotation, EObject mTypeAccess, EObject mType,
			EObject mSignature) {
		if (!mTypeToTType.equals(tType)) {
			if (!mTypeToTType.equals(tMethodSignature)) {
				if (!mTypeToTType.equals(tDefinition)) {
					if (!mDefinitionToTMember.equals(tType)) {
						if (!mDefinitionToTMember.equals(mTypeToTType)) {
							if (!mDefinitionToTMember.equals(tMethodSignature)) {
								if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
									if (!mDefinitionToTMember.equals(tDefinition)) {
										if (!mDefinitionToTMember.equals(mFlowElementToTFlowElement)) {
											if (!mDefinitionToTMember.equals(mTypeAccess)) {
												if (!mDefinitionToTMember.equals(mType)) {
													if (!mDefinitionToTMember.equals(mSignature)) {
														if (!tMethodSignature.equals(tType)) {
															if (!mSignatureToTMethodSignature.equals(tType)) {
																if (!mSignatureToTMethodSignature
																		.equals(mTypeToTType)) {
																	if (!mSignatureToTMethodSignature
																			.equals(tMethodSignature)) {
																		if (!mSignatureToTMethodSignature
																				.equals(tDefinition)) {
																			if (!mSignatureToTMethodSignature
																					.equals(mTypeAccess)) {
																				if (!mSignatureToTMethodSignature
																						.equals(mType)) {
																					if (!tDefinition.equals(tType)) {
																						if (!tDefinition.equals(
																								tMethodSignature)) {
																							if (!mDefinition
																									.equals(tType)) {
																								if (!mDefinition.equals(
																										mTypeToTType)) {
																									if (!mDefinition
																											.equals(mDefinitionToTMember)) {
																										if (!mDefinition
																												.equals(tMethodSignature)) {
																											if (!mDefinition
																													.equals(mSignatureToTMethodSignature)) {
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
																																	if (!mFlowElementToTFlowElement
																																			.equals(tType)) {
																																		if (!mFlowElementToTFlowElement
																																				.equals(mTypeToTType)) {
																																			if (!mFlowElementToTFlowElement
																																					.equals(tMethodSignature)) {
																																				if (!mFlowElementToTFlowElement
																																						.equals(mSignatureToTMethodSignature)) {
																																					if (!mFlowElementToTFlowElement
																																							.equals(tDefinition)) {
																																						if (!mFlowElementToTFlowElement
																																								.equals(mTypeAccess)) {
																																							if (!mFlowElementToTFlowElement
																																									.equals(mType)) {
																																								if (!mFlowElementToTFlowElement
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
																																															.equals(mSignatureToTMethodSignature)) {
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
																																																				if (!mTypeAccess
																																																						.equals(tType)) {
																																																					if (!mTypeAccess
																																																							.equals(mTypeToTType)) {
																																																						if (!mTypeAccess
																																																								.equals(tMethodSignature)) {
																																																							if (!mTypeAccess
																																																									.equals(tDefinition)) {
																																																								if (!mType
																																																										.equals(tType)) {
																																																									if (!mType
																																																											.equals(mTypeToTType)) {
																																																										if (!mType
																																																												.equals(tMethodSignature)) {
																																																											if (!mType
																																																													.equals(tDefinition)) {
																																																												if (!mType
																																																														.equals(mTypeAccess)) {
																																																													if (!mSignature
																																																															.equals(tType)) {
																																																														if (!mSignature
																																																																.equals(mTypeToTType)) {
																																																															if (!mSignature
																																																																	.equals(tMethodSignature)) {
																																																																if (!mSignature
																																																																		.equals(mSignatureToTMethodSignature)) {
																																																																	if (!mSignature
																																																																			.equals(tDefinition)) {
																																																																		if (!mSignature
																																																																				.equals(mTypeAccess)) {
																																																																			if (!mSignature
																																																																					.equals(mType)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						tType,
																																																																						mTypeToTType,
																																																																						mDefinitionToTMember,
																																																																						tMethodSignature,
																																																																						mSignatureToTMethodSignature,
																																																																						tDefinition,
																																																																						mDefinition,
																																																																						mFlowElementToTFlowElement,
																																																																						mBodyToTAnnotation,
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

	public static final Object[] pattern_MethodDefinition_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mFlowElementToTFlowElement, EObject mBodyToTAnnotation,
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
		String ruleresult_ruleName_prime = "MethodDefinition";
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
				mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess, mType, mSignature,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				mDefinition__mTypeAccess____returnType, mFlowElementToTFlowElement__mDefinition____source,
				mTypeAccess__mType____type, mType__mTypeAccess____usagesInTypeAccess,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				mFlowElementToTFlowElement__tDefinition____target, tDefinition__tType____returnType,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__tDefinition____target,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature };
	}

	public static final void pattern_MethodDefinition_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			MethodDefinition _this, PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject tMethodSignature, EObject mSignatureToTMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mFlowElementToTFlowElement, EObject mBodyToTAnnotation,
			EObject mTypeAccess, EObject mType, EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, tType, mTypeToTType, mDefinitionToTMember, tMethodSignature,
				mSignatureToTMethodSignature, tDefinition, mDefinition, mFlowElementToTFlowElement, mBodyToTAnnotation,
				mTypeAccess, mType, mSignature);

	}

	public static final PerformRuleResult pattern_MethodDefinition_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_12_1_preparereturnvalue_bindingFB(MethodDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDefinition _this) {
		Object[] result_pattern_MethodDefinition_12_1_preparereturnvalue_binding = pattern_MethodDefinition_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinition_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDefinition_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinition_12_1_preparereturnvalue_black = pattern_MethodDefinition_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDefinition_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDefinition_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDefinition_12_2_corematch_bindingFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MethodDefinition_12_2_corematch_blackBFBFBFFB(TAbstractType tType,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMethodSignature, MSignatureToTSignature.class, "target")) {
			MSignature tmpMSignature = mSignatureToTMethodSignature.getSource();
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
					Type mType = mTypeToTType.getSource();
					if (mType != null) {
						_result.add(new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature,
								tDefinition, mType, mSignature, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_12_3_findcontext_blackBBBBBBB(TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodDefinition tDefinition, Type mType,
			MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethodSignature.getDefinitions().contains(tDefinition)) {
			if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
				if (tType.equals(tDefinition.getReturnType())) {
					if (tType.equals(mTypeToTType.getTarget())) {
						if (mType.equals(mTypeToTType.getSource())) {
							if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
								_result.add(new Object[] { tType, mTypeToTType, tMethodSignature,
										mSignatureToTMethodSignature, tDefinition, mType, mSignature });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_12_3_findcontext_greenBBBBBBBFFFFFFFF(TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodDefinition tDefinition, Type mType,
			MMethodSignature mSignature) {
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
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
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
		return new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, tDefinition, mType,
				mSignature, isApplicableMatch, tMethodSignature__tDefinition____definitions,
				tDefinition__tMethodSignature____signature, mSignatureToTMethodSignature__tMethodSignature____target,
				tDefinition__tType____returnType, mTypeToTType__tType____target, mTypeToTType__mType____source,
				mSignatureToTMethodSignature__mSignature____source };
	}

	public static final Object[] pattern_MethodDefinition_12_4_solveCSP_bindingFBBBBBBBBB(MethodDefinition _this,
			IsApplicableMatch isApplicableMatch, TAbstractType tType, TypeToTAbstractType mTypeToTType,
			TMethodSignature tMethodSignature, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodDefinition tDefinition, Type mType, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tType, mTypeToTType, tMethodSignature,
				mSignatureToTMethodSignature, tDefinition, mType, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, tMethodSignature,
					mSignatureToTMethodSignature, tDefinition, mType, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodDefinition _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodDefinition tDefinition, Type mType,
			MMethodSignature mSignature) {
		Object[] result_pattern_MethodDefinition_12_4_solveCSP_binding = pattern_MethodDefinition_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature,
				tDefinition, mType, mSignature);
		if (result_pattern_MethodDefinition_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_12_4_solveCSP_black = pattern_MethodDefinition_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, tMethodSignature,
						mSignatureToTMethodSignature, tDefinition, mType, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_12_5_checkCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDefinition_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinition_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_20_1_preparereturnvalue_bindingFB(MethodDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDefinition _this) {
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

	public static final Object[] pattern_MethodDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDefinition _this) {
		Object[] result_pattern_MethodDefinition_20_1_preparereturnvalue_binding = pattern_MethodDefinition_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinition_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinition_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinition_20_1_preparereturnvalue_black = pattern_MethodDefinition_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDefinition_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinition_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDefinition_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDefinition_20_2_testcorematchandDECs_black_nac_0BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_signature_497823 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_497823 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_signature_497823)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinition_20_2_testcorematchandDECs_black_nac_1B(
			TMethodDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_724410 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_724410 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_20_2_testcorematchandDECs_blackFFFB(
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
						if (pattern_MethodDefinition_20_2_testcorematchandDECs_black_nac_0BB(tDefinition,
								tMethodSignature) == null) {
							if (pattern_MethodDefinition_20_2_testcorematchandDECs_black_nac_1B(tDefinition) == null) {
								_result.add(new Object[] { tType, tMethodSignature, tDefinition, _edge_definitions });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinition_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodDefinition _this, Match match, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tMethodSignature, tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDefinition_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_21_1_preparereturnvalue_bindingFB(MethodDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDefinition _this) {
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

	public static final Object[] pattern_MethodDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDefinition _this) {
		Object[] result_pattern_MethodDefinition_21_1_preparereturnvalue_binding = pattern_MethodDefinition_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDefinition_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDefinition_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDefinition_21_1_preparereturnvalue_black = pattern_MethodDefinition_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDefinition_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDefinition_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDefinition_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_0BB(
			MMethodDefinition mDefinition, MMethodSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_524622 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_524622 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_524622)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_1BB(
			TypeAccess mTypeAccess, Type mType) {
		for (AbstractTypeDeclaration __DEC_mTypeAccess_superInterfaces_368959 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mType.equals(__DEC_mTypeAccess_superInterfaces_368959)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess mTypeAccess) {
		for (Annotation __DEC_mTypeAccess_type_747069 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, Annotation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess mTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_mTypeAccess_type_739072 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess mTypeAccess, Type mType) {
		for (ArrayType __DEC_mTypeAccess_elementType_106662 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_mTypeAccess_elementType_106662)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess mTypeAccess) {
		for (ClassInstanceCreation __DEC_mTypeAccess_type_76686 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_6BB(
			TypeAccess mTypeAccess, Type mType) {
		for (ClassDeclaration __DEC_mTypeAccess_superClass_486368 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_mTypeAccess_superClass_486368)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_7BB(
			TypeAccess mTypeAccess, Type mType) {
		for (ParameterizedType __DEC_mTypeAccess_type_115844 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mTypeAccess_type_115844)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess mTypeAccess) {
		for (TypeLiteral __DEC_mTypeAccess_type_853995 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_9B(
			TypeAccess mTypeAccess) {
		for (AnnotationMemberValuePair __DEC_mTypeAccess_value_27931 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_21_2_testcorematchandDECs_blackFFFFB(
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
							if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_2B(mTypeAccess) == null) {
								if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_3B(
										mTypeAccess) == null) {
									if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_5B(
											mTypeAccess) == null) {
										if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_8B(
												mTypeAccess) == null) {
											if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_9B(
													mTypeAccess) == null) {
												if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_0BB(
														mDefinition, mSignature) == null) {
													if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_1BB(
															mTypeAccess, mType) == null) {
														if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_4BB(
																mTypeAccess, mType) == null) {
															if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_6BB(
																	mTypeAccess, mType) == null) {
																if (pattern_MethodDefinition_21_2_testcorematchandDECs_black_nac_7BB(
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

		}

		return _result;
	}

	public static final Object[] pattern_MethodDefinition_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			MethodDefinition _this, Match match, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mTypeAccess, mType, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDefinition_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_24_1_prepare_blackB(MethodDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDefinition_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodDefinition_24_2_matchsrctrgcontext_bindingFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
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

	public static final Object[] pattern_MethodDefinition_24_2_matchsrctrgcontext_blackBBBBBBBBB(TAbstractType tType,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodDefinition_24_2_matchsrctrgcontext_binding = pattern_MethodDefinition_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodDefinition_24_2_matchsrctrgcontext_binding != null) {
			TAbstractType tType = (TAbstractType) result_pattern_MethodDefinition_24_2_matchsrctrgcontext_binding[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodDefinition_24_2_matchsrctrgcontext_binding[1];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_MethodDefinition_24_2_matchsrctrgcontext_binding[2];
			MMethodDefinition mDefinition = (MMethodDefinition) result_pattern_MethodDefinition_24_2_matchsrctrgcontext_binding[3];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_MethodDefinition_24_2_matchsrctrgcontext_binding[4];
			Type mType = (Type) result_pattern_MethodDefinition_24_2_matchsrctrgcontext_binding[5];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodDefinition_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_MethodDefinition_24_2_matchsrctrgcontext_black = pattern_MethodDefinition_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature, sourceMatch,
					targetMatch);
			if (result_pattern_MethodDefinition_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_24_3_solvecsp_bindingFBBBBBBBBBB(MethodDefinition _this,
			TAbstractType tType, TMethodSignature tMethodSignature, TMethodDefinition tDefinition,
			MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(tType, tMethodSignature, tDefinition, mDefinition,
				mTypeAccess, mType, mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType,
					mSignature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			MethodDefinition _this, TAbstractType tType, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MMethodDefinition mDefinition, TypeAccess mTypeAccess, Type mType,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodDefinition_24_3_solvecsp_binding = pattern_MethodDefinition_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature, sourceMatch,
				targetMatch);
		if (result_pattern_MethodDefinition_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodDefinition_24_3_solvecsp_black = pattern_MethodDefinition_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodDefinition_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType,
						mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_24_5_matchcorrcontext_blackBFBFBBBB(
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
							_result.add(new Object[] { tType, mTypeToTType, tMethodSignature,
									mSignatureToTMethodSignature, mType, mSignature, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MSignatureToTSignature mSignatureToTMethodSignature, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodDefinition";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mSignatureToTMethodSignature, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodDefinition_24_6_createcorrespondence_blackBBBBBBBB(TAbstractType tType,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition, MMethodDefinition mDefinition,
			TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature, CCMatch ccMatch) {
		return new Object[] { tType, tMethodSignature, tDefinition, mDefinition, mTypeAccess, mType, mSignature,
				ccMatch };
	}

	public static final Object[] pattern_MethodDefinition_24_6_createcorrespondence_greenFBBFFB(
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
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mFlowElementToTFlowElement,
				mBodyToTAnnotation, ccMatch };
	}

	public static final Object[] pattern_MethodDefinition_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodDefinition_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodDefinition";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDefinition_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_0BB(
			MMethodDefinition mDefinition, MMethodSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_308855 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_308855 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_308855)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_1BB(TypeAccess mTypeAccess,
			Type mType) {
		for (AbstractTypeDeclaration __DEC_mTypeAccess_superInterfaces_350012 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mType.equals(__DEC_mTypeAccess_superInterfaces_350012)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_2B(TypeAccess mTypeAccess) {
		for (Annotation __DEC_mTypeAccess_type_488834 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, Annotation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_3B(TypeAccess mTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_mTypeAccess_type_883727 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_4BB(TypeAccess mTypeAccess,
			Type mType) {
		for (ArrayType __DEC_mTypeAccess_elementType_772507 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_mTypeAccess_elementType_772507)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_5B(TypeAccess mTypeAccess) {
		for (ClassInstanceCreation __DEC_mTypeAccess_type_661227 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_6BB(TypeAccess mTypeAccess,
			Type mType) {
		for (ClassDeclaration __DEC_mTypeAccess_superClass_81581 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_mTypeAccess_superClass_81581)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_7BB(TypeAccess mTypeAccess,
			Type mType) {
		for (ParameterizedType __DEC_mTypeAccess_type_208566 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mTypeAccess_type_208566)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_8B(TypeAccess mTypeAccess) {
		for (TypeLiteral __DEC_mTypeAccess_type_412362 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_black_nac_9B(TypeAccess mTypeAccess) {
		for (AnnotationMemberValuePair __DEC_mTypeAccess_value_213970 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_27_1_matchtggpattern_blackBBBB(MMethodDefinition mDefinition,
			TypeAccess mTypeAccess, Type mType, MMethodSignature mSignature) {
		if (mTypeAccess.equals(mDefinition.getReturnType())) {
			if (mType.equals(mTypeAccess.getType())) {
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_0BB(mDefinition, mSignature) == null) {
						if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_1BB(mTypeAccess, mType) == null) {
							if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_2B(mTypeAccess) == null) {
								if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_3B(mTypeAccess) == null) {
									if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_4BB(mTypeAccess,
											mType) == null) {
										if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_5B(
												mTypeAccess) == null) {
											if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_6BB(mTypeAccess,
													mType) == null) {
												if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_7BB(
														mTypeAccess, mType) == null) {
													if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_8B(
															mTypeAccess) == null) {
														if (pattern_MethodDefinition_27_1_matchtggpattern_black_nac_9B(
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
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_28_1_matchtggpattern_black_nac_0BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_signature_926628 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_926628 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_signature_926628)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinition_28_1_matchtggpattern_black_nac_1B(
			TMethodDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_583239 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_583239 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_MethodDefinition_28_1_matchtggpattern_blackBBB(TAbstractType tType,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		if (tMethodSignature.getDefinitions().contains(tDefinition)) {
			if (tType.equals(tDefinition.getReturnType())) {
				if (pattern_MethodDefinition_28_1_matchtggpattern_black_nac_0BB(tDefinition,
						tMethodSignature) == null) {
					if (pattern_MethodDefinition_28_1_matchtggpattern_black_nac_1B(tDefinition) == null) {
						return new Object[] { tType, tMethodSignature, tDefinition };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDefinition_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_29_1_createresult_blackB(MethodDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDefinition_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tMethodSignature) {
		if (ruleResult.getTargetObjects().contains(tMethodSignature)) {
			return new Object[] { ruleResult, tMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTMethodSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTMethodSignature)) {
			return new Object[] { ruleResult, mSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDefinition_29_2_isapplicablecore_blackFFFFFFFFBB(
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
								Type mType = mTypeToTType.getSource();
								if (mType != null) {
									if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mTypeToTType) == null) {
										if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												tType) == null) {
											if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													mType) == null) {
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
																if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult,
																		mSignatureToTMethodSignature) == null) {
																	if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tMethodSignature) == null) {
																		if (pattern_MethodDefinition_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mSignature) == null) {
																			_result.add(new Object[] { mTypeToTTypeList,
																					tType, mTypeToTType, mType,
																					mSignatureToTMethodSignatureList,
																					tMethodSignature,
																					mSignatureToTMethodSignature,
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

	public static final Object[] pattern_MethodDefinition_29_3_solveCSP_bindingFBBBBBBBBB(MethodDefinition _this,
			IsApplicableMatch isApplicableMatch, TAbstractType tType, TypeToTAbstractType mTypeToTType,
			TMethodSignature tMethodSignature, MSignatureToTSignature mSignatureToTMethodSignature, Type mType,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tType, mTypeToTType,
				tMethodSignature, mSignatureToTMethodSignature, mType, mSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, tMethodSignature,
					mSignatureToTMethodSignature, mType, mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodDefinition_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDefinition_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodDefinition _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodDefinition_29_3_solveCSP_binding = pattern_MethodDefinition_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mType,
				mSignature, ruleResult);
		if (result_pattern_MethodDefinition_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDefinition_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodDefinition_29_3_solveCSP_black = pattern_MethodDefinition_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDefinition_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, mTypeToTType, tMethodSignature,
						mSignatureToTMethodSignature, mType, mSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDefinition_29_4_checkCSP_expressionFBB(MethodDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDefinition_29_5_checknacs_blackBBBBBB(TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, Type mType, MMethodSignature mSignature) {
		return new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mType, mSignature };
	}

	public static final Object[] pattern_MethodDefinition_29_6_perform_blackBBBBBBB(TAbstractType tType,
			TypeToTAbstractType mTypeToTType, TMethodSignature tMethodSignature,
			MSignatureToTSignature mSignatureToTMethodSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tType, mTypeToTType, tMethodSignature, mSignatureToTMethodSignature, mType, mSignature,
				ruleResult };
	}

	public static final Object[] pattern_MethodDefinition_29_6_perform_greenBFBFFFFFBBBB(TAbstractType tType,
			TMethodSignature tMethodSignature, Type mType, MMethodSignature mSignature,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		MMethodDefinition mDefinition = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeAccess mTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		Object _localVariable_0 = csp.getValue("tDefinition", "upperBound");
		Object _localVariable_1 = csp.getValue("tDefinition", "lowerBound");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		tMethodSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		tDefinition.setReturnType(tType);
		ruleResult.getTargetObjects().add(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mDefinition.setReturnType(mTypeAccess);
		mTypeAccess.setType(mType);
		ruleResult.getSourceObjects().add(mTypeAccess);
		int tDefinition_upperBound_prime = (int) _localVariable_0;
		int tDefinition_lowerBound_prime = (int) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tType, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mFlowElementToTFlowElement, mBodyToTAnnotation, mTypeAccess, mType, mSignature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodDefinition_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodDefinitionImpl
