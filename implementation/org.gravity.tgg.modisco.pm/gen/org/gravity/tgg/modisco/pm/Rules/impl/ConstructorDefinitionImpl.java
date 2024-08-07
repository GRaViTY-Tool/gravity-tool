/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ConstructorDefinition;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModule;
import org.gravity.typegraph.basic.TSignature;

import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;

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
 * An implementation of the model object '<em><b>Constructor Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstructorDefinitionImpl extends AbstractRuleImpl implements ConstructorDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getConstructorDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MConstructorDefinition mDefinition, MMethodSignature mSignature) {

		Object[] result1_black = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_0_1_initialbindings_blackBBBB(this, match, mDefinition, mSignature);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mDefinition, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ConstructorDefinitionImpl.pattern_ConstructorDefinition_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_0_4_collectelementstobetranslated_blackBBB(match, mDefinition,
							mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
			}
			ConstructorDefinitionImpl.pattern_ConstructorDefinition_0_4_collectelementstobetranslated_greenBBBFF(match,
					mDefinition, mSignature);
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_0_5_collectcontextelements_blackBBB(match, mDefinition, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
			}
			ConstructorDefinitionImpl.pattern_ConstructorDefinition_0_5_collectcontextelements_greenBB(match,
					mSignature);

			// 
			ConstructorDefinitionImpl.pattern_ConstructorDefinition_0_6_registerobjectstomatch_expressionBBBB(this,
					match, mDefinition, mSignature);
			return ConstructorDefinitionImpl.pattern_ConstructorDefinition_0_7_expressionF();
		} else {
			return ConstructorDefinitionImpl.pattern_ConstructorDefinition_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[1];
		MConstructorDefinition mDefinition = (MConstructorDefinition) result1_bindingAndBlack[2];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_1_1_performtransformation_greenFFBFBFF(tMethodSignature, mDefinition);
		TConstructor tAnnotation = (TConstructor) result1_green[0];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_green[3];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[5];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[6];

		Object[] result2_black = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_1_2_collecttranslatedelements_blackBBBBBB(tAnnotation,
						mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[mDefinition] = " + mDefinition + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		Object[] result2_green = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_1_2_collecttranslatedelements_greenFBBBBBB(tAnnotation,
						mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tAnnotation,
						mDefinitionToTMember, mSignatureToTMethodSignature, tMethodSignature, tDefinition, mDefinition,
						mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature
					+ ", " + "[tMethodSignature] = " + tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mSignature] = "
					+ mSignature + ".");
		}
		ConstructorDefinitionImpl.pattern_ConstructorDefinition_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
				ruleresult, tAnnotation, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature);
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mDefinition____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tDefinition__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tAnnotation__tDefinition____tAnnotated = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tDefinition____target = (EMoflonEdge) result3_green[20];

		// 
		// 
		ConstructorDefinitionImpl.pattern_ConstructorDefinition_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, tAnnotation, mDefinitionToTMember, mSignatureToTMethodSignature, tMethodSignature,
				tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature);
		return ConstructorDefinitionImpl.pattern_ConstructorDefinition_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MConstructorDefinition mDefinition = (MConstructorDefinition) result2_binding[0];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[1];
		for (Object[] result2_black : ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_2_2_corematch_blackFFBBB(mDefinition, mSignature, match)) {
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			// ForEach 
			for (Object[] result3_black : ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_2_3_findcontext_blackBBBB(mSignatureToTMethodSignature,
							tMethodSignature, mDefinition, mSignature)) {
				Object[] result3_green = ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_2_3_findcontext_greenBBBBFFFFF(mSignatureToTMethodSignature,
								tMethodSignature, mDefinition, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mSignatureToTMethodSignature, tMethodSignature, mDefinition, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignatureToTMethodSignature] = "
							+ mSignatureToTMethodSignature + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ConstructorDefinitionImpl.pattern_ConstructorDefinition_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ConstructorDefinitionImpl
							.pattern_ConstructorDefinition_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ConstructorDefinitionImpl.pattern_ConstructorDefinition_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorDefinitionImpl.pattern_ConstructorDefinition_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MConstructorDefinition mDefinition,
			MMethodSignature mSignature) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MConstructorDefinition mDefinition,
			MMethodSignature mSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tAnnotation, EObject mDefinitionToTMember,
			EObject mSignatureToTMethodSignature, EObject tMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement, EObject mSignature) {
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mDefinition").eClass())
				.equals("modisco.MConstructorDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {

		Object[] result1_black = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_10_1_initialbindings_blackBBBBB(this, match, tAnnotation,
						tMethodSignature, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}

		Object[] result2_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAnnotation,
						tMethodSignature, tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ConstructorDefinitionImpl.pattern_ConstructorDefinition_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_10_4_collectelementstobetranslated_blackBBBB(match, tAnnotation,
							tMethodSignature, tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			ConstructorDefinitionImpl.pattern_ConstructorDefinition_10_4_collectelementstobetranslated_greenBBBBFFFF(
					match, tAnnotation, tMethodSignature, tDefinition);
			//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tDefinition__tAnnotation____tAnnotation = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tAnnotation__tDefinition____tAnnotated = (EMoflonEdge) result4_green[7];

			Object[] result5_black = ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_10_5_collectcontextelements_blackBBBB(match, tAnnotation,
							tMethodSignature, tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			ConstructorDefinitionImpl.pattern_ConstructorDefinition_10_5_collectcontextelements_greenBB(match,
					tMethodSignature);

			// 
			ConstructorDefinitionImpl.pattern_ConstructorDefinition_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, tAnnotation, tMethodSignature, tDefinition);
			return ConstructorDefinitionImpl.pattern_ConstructorDefinition_10_7_expressionF();
		} else {
			return ConstructorDefinitionImpl.pattern_ConstructorDefinition_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TConstructor tAnnotation = (TConstructor) result1_bindingAndBlack[0];
		MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[1];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[2];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_bindingAndBlack[3];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_11_1_performtransformation_greenFBFFFB(tDefinition, mSignature);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[0];
		MConstructorDefinition mDefinition = (MConstructorDefinition) result1_green[2];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[3];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[4];

		Object[] result2_black = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_11_2_collecttranslatedelements_blackBBBBBB(tAnnotation,
						mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[mDefinition] = " + mDefinition + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		Object[] result2_green = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_11_2_collecttranslatedelements_greenFBBBBBB(tAnnotation,
						mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tAnnotation,
						mDefinitionToTMember, mSignatureToTMethodSignature, tMethodSignature, tDefinition, mDefinition,
						mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature
					+ ", " + "[tMethodSignature] = " + tMethodSignature + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mSignature] = "
					+ mSignature + ".");
		}
		ConstructorDefinitionImpl.pattern_ConstructorDefinition_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
				ruleresult, tAnnotation, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature);
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mDefinition____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tDefinition__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tAnnotation__tDefinition____tAnnotated = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tDefinition____target = (EMoflonEdge) result3_green[20];

		// 
		// 
		ConstructorDefinitionImpl.pattern_ConstructorDefinition_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, tAnnotation, mDefinitionToTMember, mSignatureToTMethodSignature, tMethodSignature,
				tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature);
		return ConstructorDefinitionImpl.pattern_ConstructorDefinition_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TConstructor tAnnotation = (TConstructor) result2_binding[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result2_binding[2];
		for (Object[] result2_black : ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_12_2_corematch_blackBFBBFB(tAnnotation, tMethodSignature, tDefinition,
						match)) {
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[1];
			MMethodSignature mSignature = (MMethodSignature) result2_black[4];
			// ForEach 
			for (Object[] result3_black : ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_12_3_findcontext_blackBBBBB(tAnnotation,
							mSignatureToTMethodSignature, tMethodSignature, tDefinition, mSignature)) {
				Object[] result3_green = ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_12_3_findcontext_greenBBBBBFFFFFFF(tAnnotation,
								mSignatureToTMethodSignature, tMethodSignature, tDefinition, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge tMethodSignature__tDefinition____definitions = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mSignatureToTMethodSignature__mSignature____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tDefinition__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tAnnotation__tDefinition____tAnnotated = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								tAnnotation, mSignatureToTMethodSignature, tMethodSignature, tDefinition, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotation] = " + tAnnotation
							+ ", " + "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", "
							+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tDefinition] = " + tDefinition
							+ ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ConstructorDefinitionImpl.pattern_ConstructorDefinition_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ConstructorDefinitionImpl
							.pattern_ConstructorDefinition_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ConstructorDefinitionImpl.pattern_ConstructorDefinition_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorDefinitionImpl.pattern_ConstructorDefinition_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TConstructor tAnnotation, TMethodSignature tMethodSignature,
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TConstructor tAnnotation,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MMethodSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tAnnotation, EObject mDefinitionToTMember,
			EObject mSignatureToTMethodSignature, EObject tMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement, EObject mSignature) {
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAnnotation").eClass())
						.equals("basic.TConstructor.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tDefinition").eClass())
						.equals("basic.TMethodDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1013(EMoflonEdge _edge_definitions) {

		Object[] result1_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_20_2_testcorematchandDECs_blackFFFB(_edge_definitions)) {
			TConstructor tAnnotation = (TConstructor) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TMethodDefinition tDefinition = (TMethodDefinition) result2_black[2];
			Object[] result2_green = ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tAnnotation, tMethodSignature, tDefinition)) {
				// 
				if (ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ConstructorDefinitionImpl
							.pattern_ConstructorDefinition_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ConstructorDefinitionImpl.pattern_ConstructorDefinition_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorDefinitionImpl.pattern_ConstructorDefinition_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1111(EMoflonEdge _edge_mDefinitions) {

		Object[] result1_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_21_2_testcorematchandDECs_blackFFB(_edge_mDefinitions)) {
			MConstructorDefinition mDefinition = (MConstructorDefinition) result2_black[0];
			MMethodSignature mSignature = (MMethodSignature) result2_black[1];
			Object[] result2_green = ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mDefinition, mSignature)) {
				// 
				if (ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ConstructorDefinitionImpl
							.pattern_ConstructorDefinition_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ConstructorDefinitionImpl.pattern_ConstructorDefinition_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorDefinitionImpl.pattern_ConstructorDefinition_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ConstructorDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tDefinition", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tDefinition", "upperBound", 1, ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("ConstructorDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tDefinition", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tDefinition", "upperBound", 1, ComparingOperator.EQUAL)) {
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

		Object[] result1_black = ConstructorDefinitionImpl.pattern_ConstructorDefinition_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorDefinitionImpl.pattern_ConstructorDefinition_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TConstructor tAnnotation = (TConstructor) result2_bindingAndBlack[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result2_bindingAndBlack[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result2_bindingAndBlack[2];
		MConstructorDefinition mDefinition = (MConstructorDefinition) result2_bindingAndBlack[3];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, tAnnotation,
						tMethodSignature, tDefinition, mDefinition, mSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mSignature] = " + mSignature + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ConstructorDefinitionImpl.pattern_ConstructorDefinition_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_24_5_matchcorrcontext_blackFBBBB(tMethodSignature, mSignature,
							sourceMatch, targetMatch)) {
				MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result5_black[0];
				Object[] result5_green = ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_24_5_matchcorrcontext_greenBBBF(mSignatureToTMethodSignature,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_24_6_createcorrespondence_blackBBBBBB(tAnnotation,
								tMethodSignature, tDefinition, mDefinition, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = "
							+ tAnnotation + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mSignature] = " + mSignature + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ConstructorDefinitionImpl.pattern_ConstructorDefinition_24_6_createcorrespondence_greenFBBFFB(
						tDefinition, mDefinition, ccMatch);
				//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[0];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[3];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[4];

				Object[] result7_black = ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ConstructorDefinitionImpl.pattern_ConstructorDefinition_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ConstructorDefinitionImpl.pattern_ConstructorDefinition_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MConstructorDefinition mDefinition, MMethodSignature mSignature,
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
	public boolean checkDEC_FWD(MConstructorDefinition mDefinition, MMethodSignature mSignature) {// 
		Object[] result1_black = ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_27_1_matchtggpattern_blackBB(mDefinition, mSignature);
		if (result1_black != null) {
			return ConstructorDefinitionImpl.pattern_ConstructorDefinition_27_2_expressionF();
		} else {
			return ConstructorDefinitionImpl.pattern_ConstructorDefinition_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {// 
		Object[] result1_black = ConstructorDefinitionImpl.pattern_ConstructorDefinition_28_1_matchtggpattern_blackBBB(
				tAnnotation, tMethodSignature, tDefinition);
		if (result1_black != null) {
			ConstructorDefinitionImpl.pattern_ConstructorDefinition_28_1_matchtggpattern_greenB(tDefinition);

			return ConstructorDefinitionImpl.pattern_ConstructorDefinition_28_2_expressionF();
		} else {
			return ConstructorDefinitionImpl.pattern_ConstructorDefinition_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MSignatureToTSignature mSignatureToTMethodSignatureParameter) {

		Object[] result1_black = ConstructorDefinitionImpl.pattern_ConstructorDefinition_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorDefinitionImpl.pattern_ConstructorDefinition_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ConstructorDefinitionImpl
				.pattern_ConstructorDefinition_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mSignatureToTMethodSignatureList = (RuleEntryList) result2_black[0];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[1];
			MMethodSignature mSignature = (MMethodSignature) result2_black[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[3];

			Object[] result3_bindingAndBlack = ConstructorDefinitionImpl
					.pattern_ConstructorDefinition_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mSignatureToTMethodSignature, tMethodSignature, mSignature, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignatureToTMethodSignature] = "
						+ mSignatureToTMethodSignature + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
						+ "[mSignature] = " + mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ConstructorDefinitionImpl.pattern_ConstructorDefinition_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ConstructorDefinitionImpl
						.pattern_ConstructorDefinition_29_5_checknacs_blackBBB(mSignatureToTMethodSignature,
								tMethodSignature, mSignature);
				if (result5_black != null) {

					Object[] result6_black = ConstructorDefinitionImpl
							.pattern_ConstructorDefinition_29_6_perform_blackBBBB(mSignatureToTMethodSignature,
									tMethodSignature, mSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mSignatureToTMethodSignature] = " + mSignatureToTMethodSignature + ", "
								+ "[tMethodSignature] = " + tMethodSignature + ", " + "[mSignature] = " + mSignature
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ConstructorDefinitionImpl.pattern_ConstructorDefinition_29_6_perform_greenFFBFFFFBB(
							tMethodSignature, mSignature, ruleResult);
					//nothing TConstructor tAnnotation = (TConstructor) result6_green[0];
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[1];
					//nothing TMethodDefinition tDefinition = (TMethodDefinition) result6_green[3];
					//nothing MConstructorDefinition mDefinition = (MConstructorDefinition) result6_green[4];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[5];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return ConstructorDefinitionImpl.pattern_ConstructorDefinition_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignatureToTMethodSignature", mSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
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
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPROPRIATE_FWD__MATCH_MCONSTRUCTORDEFINITION_MMETHODSIGNATURE:
				return isAppropriate_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
						(MMethodSignature) arguments.get(2));
			case RulesPackage.CONSTRUCTOR_DEFINITION___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCONSTRUCTORDEFINITION_MMETHODSIGNATURE:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
						(MMethodSignature) arguments.get(2));
				return null;
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCONSTRUCTORDEFINITION_MMETHODSIGNATURE:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
						(MMethodSignature) arguments.get(2));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MSIGNATURETOTSIGNATURE_TMETHODSIGNATURE_MCONSTRUCTORDEFINITION_MMETHODSIGNATURE:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(MSignatureToTSignature) arguments.get(1), (TMethodSignature) arguments.get(2),
						(MConstructorDefinition) arguments.get(3), (MMethodSignature) arguments.get(4));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9));
				return null;
			case RulesPackage.CONSTRUCTOR_DEFINITION___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPROPRIATE_BWD__MATCH_TCONSTRUCTOR_TMETHODSIGNATURE_TMETHODDEFINITION:
				return isAppropriate_BWD((Match) arguments.get(0), (TConstructor) arguments.get(1),
						(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
			case RulesPackage.CONSTRUCTOR_DEFINITION___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCONSTRUCTOR_TMETHODSIGNATURE_TMETHODDEFINITION:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TConstructor) arguments.get(1),
						(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
				return null;
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCONSTRUCTOR_TMETHODSIGNATURE_TMETHODDEFINITION:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TConstructor) arguments.get(1),
						(TMethodSignature) arguments.get(2), (TMethodDefinition) arguments.get(3));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCONSTRUCTOR_MSIGNATURETOTSIGNATURE_TMETHODSIGNATURE_TMETHODDEFINITION_MMETHODSIGNATURE:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TConstructor) arguments.get(1),
						(MSignatureToTSignature) arguments.get(2), (TMethodSignature) arguments.get(3),
						(TMethodDefinition) arguments.get(4), (MMethodSignature) arguments.get(5));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9));
				return null;
			case RulesPackage.CONSTRUCTOR_DEFINITION___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1013__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_1013((EMoflonEdge) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1111__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1111((EMoflonEdge) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPLICABLE_SOLVE_CSP_CC__TCONSTRUCTOR_TMETHODSIGNATURE_TMETHODDEFINITION_MCONSTRUCTORDEFINITION_MMETHODSIGNATURE_MATCH_MATCH:
				return isApplicable_solveCsp_CC((TConstructor) arguments.get(0), (TMethodSignature) arguments.get(1),
						(TMethodDefinition) arguments.get(2), (MConstructorDefinition) arguments.get(3),
						(MMethodSignature) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
			case RulesPackage.CONSTRUCTOR_DEFINITION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.CONSTRUCTOR_DEFINITION___CHECK_DEC_FWD__MCONSTRUCTORDEFINITION_MMETHODSIGNATURE:
				return checkDEC_FWD((MConstructorDefinition) arguments.get(0), (MMethodSignature) arguments.get(1));
			case RulesPackage.CONSTRUCTOR_DEFINITION___CHECK_DEC_BWD__TCONSTRUCTOR_TMETHODSIGNATURE_TMETHODDEFINITION:
				return checkDEC_BWD((TConstructor) arguments.get(0), (TMethodSignature) arguments.get(1),
						(TMethodDefinition) arguments.get(2));
			case RulesPackage.CONSTRUCTOR_DEFINITION___GENERATE_MODEL__RULEENTRYCONTAINER_MSIGNATURETOTSIGNATURE:
				return generateModel((RuleEntryContainer) arguments.get(0), (MSignatureToTSignature) arguments.get(1));
			case RulesPackage.CONSTRUCTOR_DEFINITION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MSIGNATURETOTSIGNATURE_TMETHODSIGNATURE_MMETHODSIGNATURE_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MSignatureToTSignature) arguments.get(1), (TMethodSignature) arguments.get(2),
						(MMethodSignature) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
			case RulesPackage.CONSTRUCTOR_DEFINITION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ConstructorDefinition_0_1_initialbindings_blackBBBB(
			ConstructorDefinition _this, Match match, MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		return new Object[] { _this, match, mDefinition, mSignature };
	}

	public static final Object[] pattern_ConstructorDefinition_0_2_SolveCSP_bindingFBBBB(ConstructorDefinition _this,
			Match match, MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDefinition_0_2_SolveCSP_bindingAndBlackFBBBB(
			ConstructorDefinition _this, Match match, MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		Object[] result_pattern_ConstructorDefinition_0_2_SolveCSP_binding = pattern_ConstructorDefinition_0_2_SolveCSP_bindingFBBBB(
				_this, match, mDefinition, mSignature);
		if (result_pattern_ConstructorDefinition_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDefinition_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorDefinition_0_2_SolveCSP_black = pattern_ConstructorDefinition_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDefinition_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDefinition_0_3_CheckCSP_expressionFBB(ConstructorDefinition _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_0_4_collectelementstobetranslated_blackBBB(Match match,
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		return new Object[] { match, mDefinition, mSignature };
	}

	public static final Object[] pattern_ConstructorDefinition_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mDefinition);
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(mDefinition__mSignature____mSignature);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { match, mDefinition, mSignature, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final Object[] pattern_ConstructorDefinition_0_5_collectcontextelements_blackBBB(Match match,
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		return new Object[] { match, mDefinition, mSignature };
	}

	public static final Object[] pattern_ConstructorDefinition_0_5_collectcontextelements_greenBB(Match match,
			MMethodSignature mSignature) {
		match.getContextNodes().add(mSignature);
		return new Object[] { match, mSignature };
	}

	public static final void pattern_ConstructorDefinition_0_6_registerobjectstomatch_expressionBBBB(
			ConstructorDefinition _this, Match match, MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mSignature);

	}

	public static final boolean pattern_ConstructorDefinition_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDefinition_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSignature");
		EObject tmpMSignatureToTMethodSignature = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpMSignature = _localVariable_3;
		if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpMDefinition instanceof MConstructorDefinition) {
					MConstructorDefinition mDefinition = (MConstructorDefinition) tmpMDefinition;
					if (tmpMSignature instanceof MMethodSignature) {
						MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
						return new Object[] { mSignatureToTMethodSignature, tMethodSignature, mDefinition, mSignature,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_1_1_performtransformation_blackBBBBFBB(
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MConstructorDefinition mDefinition, MMethodSignature mSignature, ConstructorDefinition _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignatureToTMethodSignature, tMethodSignature, mDefinition, mSignature, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_1_1_performtransformation_bindingAndBlackFFFFFBB(
			ConstructorDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorDefinition_1_1_performtransformation_binding = pattern_ConstructorDefinition_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorDefinition_1_1_performtransformation_binding != null) {
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_ConstructorDefinition_1_1_performtransformation_binding[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_ConstructorDefinition_1_1_performtransformation_binding[1];
			MConstructorDefinition mDefinition = (MConstructorDefinition) result_pattern_ConstructorDefinition_1_1_performtransformation_binding[2];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_ConstructorDefinition_1_1_performtransformation_binding[3];

			Object[] result_pattern_ConstructorDefinition_1_1_performtransformation_black = pattern_ConstructorDefinition_1_1_performtransformation_blackBBBBFBB(
					mSignatureToTMethodSignature, tMethodSignature, mDefinition, mSignature, _this, isApplicableMatch);
			if (result_pattern_ConstructorDefinition_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorDefinition_1_1_performtransformation_black[4];

				return new Object[] { mSignatureToTMethodSignature, tMethodSignature, mDefinition, mSignature, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_1_1_performtransformation_greenFFBFBFF(
			TMethodSignature tMethodSignature, MConstructorDefinition mDefinition) {
		TConstructor tAnnotation = BasicFactory.eINSTANCE.createTConstructor();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		int tDefinition_lowerBound_prime = Integer.valueOf(0);
		int tDefinition_upperBound_prime = Integer.valueOf(1);
		mDefinitionToTMember.setSource(mDefinition);
		tMethodSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		tDefinition.getTAnnotation().add(tAnnotation);
		mBodyToTAnnotation.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		return new Object[] { tAnnotation, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_ConstructorDefinition_1_2_collecttranslatedelements_blackBBBBBB(
			TConstructor tAnnotation, MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition,
			MConstructorDefinition mDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		return new Object[] { tAnnotation, mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_ConstructorDefinition_1_2_collecttranslatedelements_greenFBBBBBB(
			TConstructor tAnnotation, MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition,
			MConstructorDefinition mDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tAnnotation);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedElements().add(tDefinition);
		ruleresult.getTranslatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		return new Object[] { ruleresult, tAnnotation, mDefinitionToTMember, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_ConstructorDefinition_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject mDefinitionToTMember,
			EObject mSignatureToTMethodSignature, EObject tMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement, EObject mSignature) {
		if (!tAnnotation.equals(tMethodSignature)) {
			if (!tAnnotation.equals(tDefinition)) {
				if (!mDefinitionToTMember.equals(tAnnotation)) {
					if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
						if (!mDefinitionToTMember.equals(tMethodSignature)) {
							if (!mDefinitionToTMember.equals(tDefinition)) {
								if (!mDefinitionToTMember.equals(mFlowElementToTFlowElement)) {
									if (!mDefinitionToTMember.equals(mSignature)) {
										if (!mSignatureToTMethodSignature.equals(tAnnotation)) {
											if (!mSignatureToTMethodSignature.equals(tMethodSignature)) {
												if (!mSignatureToTMethodSignature.equals(tDefinition)) {
													if (!tDefinition.equals(tMethodSignature)) {
														if (!mDefinition.equals(tAnnotation)) {
															if (!mDefinition.equals(mDefinitionToTMember)) {
																if (!mDefinition.equals(mSignatureToTMethodSignature)) {
																	if (!mDefinition.equals(tMethodSignature)) {
																		if (!mDefinition.equals(tDefinition)) {
																			if (!mDefinition.equals(
																					mFlowElementToTFlowElement)) {
																				if (!mDefinition.equals(mSignature)) {
																					if (!mBodyToTAnnotation
																							.equals(tAnnotation)) {
																						if (!mBodyToTAnnotation.equals(
																								mDefinitionToTMember)) {
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
																														.equals(mSignature)) {
																													if (!mFlowElementToTFlowElement
																															.equals(tAnnotation)) {
																														if (!mFlowElementToTFlowElement
																																.equals(mSignatureToTMethodSignature)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(tMethodSignature)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(tDefinition)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mSignature)) {
																																		if (!mSignature
																																				.equals(tAnnotation)) {
																																			if (!mSignature
																																					.equals(mSignatureToTMethodSignature)) {
																																				if (!mSignature
																																						.equals(tMethodSignature)) {
																																					if (!mSignature
																																							.equals(tDefinition)) {
																																						return new Object[] {
																																								ruleresult,
																																								tAnnotation,
																																								mDefinitionToTMember,
																																								mSignatureToTMethodSignature,
																																								tMethodSignature,
																																								tDefinition,
																																								mDefinition,
																																								mBodyToTAnnotation,
																																								mFlowElementToTFlowElement,
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
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mSignature) {
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tDefinition____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorDefinition";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String tMethodSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tMethodSignature____signature_name_prime = "signature";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mFlowElementToTFlowElement__mDefinition____source_name_prime = "source";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String tDefinition__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tDefinition____tAnnotated_name_prime = "tAnnotated";
		String mFlowElementToTFlowElement__tDefinition____target_name_prime = "target";
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		tMethodSignature__tDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tMethodSignature__tDefinition____definitions);
		tDefinition__tMethodSignature____signature.setSrc(tDefinition);
		tDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(tDefinition__tMethodSignature____signature);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		mFlowElementToTFlowElement__mDefinition____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mDefinition____source);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mDefinition__mSignature____mSignature);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		tDefinition__tAnnotation____tAnnotation.setSrc(tDefinition);
		tDefinition__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tDefinition__tAnnotation____tAnnotation);
		tAnnotation__tDefinition____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tDefinition____tAnnotated.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tAnnotation__tDefinition____tAnnotated);
		mFlowElementToTFlowElement__tDefinition____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tDefinition____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		tMethodSignature__tDefinition____definitions.setName(tMethodSignature__tDefinition____definitions_name_prime);
		tDefinition__tMethodSignature____signature.setName(tDefinition__tMethodSignature____signature_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mFlowElementToTFlowElement__mDefinition____source
				.setName(mFlowElementToTFlowElement__mDefinition____source_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		tDefinition__tAnnotation____tAnnotation.setName(tDefinition__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tDefinition____tAnnotated.setName(tAnnotation__tDefinition____tAnnotated_name_prime);
		mFlowElementToTFlowElement__tDefinition____target
				.setName(mFlowElementToTFlowElement__tDefinition____target_name_prime);
		return new Object[] { ruleresult, tAnnotation, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature, mDefinitionToTMember__mDefinition____source,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				mBodyToTAnnotation__tDefinition____target, mFlowElementToTFlowElement__mDefinition____source,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				tDefinition__tAnnotation____tAnnotation, tAnnotation__tDefinition____tAnnotated,
				mFlowElementToTFlowElement__tDefinition____target };
	}

	public static final void pattern_ConstructorDefinition_1_5_registerobjects_expressionBBBBBBBBBBB(
			ConstructorDefinition _this, PerformRuleResult ruleresult, EObject tAnnotation,
			EObject mDefinitionToTMember, EObject mSignatureToTMethodSignature, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mSignature) {
		_this.registerObjects_FWD(ruleresult, tAnnotation, mDefinitionToTMember, mSignatureToTMethodSignature,
				tMethodSignature, tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature);

	}

	public static final PerformRuleResult pattern_ConstructorDefinition_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_2_1_preparereturnvalue_bindingFB(
			ConstructorDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ConstructorDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorDefinition _this) {
		Object[] result_pattern_ConstructorDefinition_2_1_preparereturnvalue_binding = pattern_ConstructorDefinition_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDefinition_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorDefinition_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDefinition_2_1_preparereturnvalue_black = pattern_ConstructorDefinition_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorDefinition_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorDefinition_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConstructorDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorDefinition_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("mSignature");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		if (tmpMDefinition instanceof MConstructorDefinition) {
			MConstructorDefinition mDefinition = (MConstructorDefinition) tmpMDefinition;
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				return new Object[] { mDefinition, mSignature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDefinition_2_2_corematch_blackFFBBB(
			MConstructorDefinition mDefinition, MMethodSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
			TSignature tmpTMethodSignature = mSignatureToTMethodSignature.getTarget();
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				_result.add(new Object[] { mSignatureToTMethodSignature, tMethodSignature, mDefinition, mSignature,
						match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDefinition_2_3_findcontext_blackBBBB(
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
			if (mSignature.getMDefinitions().contains(mDefinition)) {
				if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
					_result.add(
							new Object[] { mSignatureToTMethodSignature, tMethodSignature, mDefinition, mSignature });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_2_3_findcontext_greenBBBBFFFFF(
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mSignatureToTMethodSignature__tMethodSignature____target.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__tMethodSignature____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mSignatureToTMethodSignature__mSignature____source.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__mSignature____source);
		mSignatureToTMethodSignature__tMethodSignature____target
				.setName(mSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mSignatureToTMethodSignature__mSignature____source
				.setName(mSignatureToTMethodSignature__mSignature____source_name_prime);
		return new Object[] { mSignatureToTMethodSignature, tMethodSignature, mDefinition, mSignature,
				isApplicableMatch, mSignatureToTMethodSignature__tMethodSignature____target,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature,
				mSignatureToTMethodSignature__mSignature____source };
	}

	public static final Object[] pattern_ConstructorDefinition_2_4_solveCSP_bindingFBBBBBB(ConstructorDefinition _this,
			IsApplicableMatch isApplicableMatch, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSignatureToTMethodSignature,
				tMethodSignature, mDefinition, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignatureToTMethodSignature, tMethodSignature,
					mDefinition, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDefinition_2_4_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorDefinition _this, IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		Object[] result_pattern_ConstructorDefinition_2_4_solveCSP_binding = pattern_ConstructorDefinition_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mSignatureToTMethodSignature, tMethodSignature, mDefinition, mSignature);
		if (result_pattern_ConstructorDefinition_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDefinition_2_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDefinition_2_4_solveCSP_black = pattern_ConstructorDefinition_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDefinition_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignatureToTMethodSignature, tMethodSignature,
						mDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDefinition_2_5_checkCSP_expressionFBB(ConstructorDefinition _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorDefinition_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDefinition_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_10_1_initialbindings_blackBBBBB(
			ConstructorDefinition _this, Match match, TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		return new Object[] { _this, match, tAnnotation, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_ConstructorDefinition_10_2_SolveCSP_bindingFBBBBB(ConstructorDefinition _this,
			Match match, TConstructor tAnnotation, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnnotation, tMethodSignature, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnnotation, tMethodSignature, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDefinition_10_2_SolveCSP_bindingAndBlackFBBBBB(
			ConstructorDefinition _this, Match match, TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		Object[] result_pattern_ConstructorDefinition_10_2_SolveCSP_binding = pattern_ConstructorDefinition_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAnnotation, tMethodSignature, tDefinition);
		if (result_pattern_ConstructorDefinition_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDefinition_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorDefinition_10_2_SolveCSP_black = pattern_ConstructorDefinition_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDefinition_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnnotation, tMethodSignature, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDefinition_10_3_CheckCSP_expressionFBB(ConstructorDefinition _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TConstructor tAnnotation, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		return new Object[] { match, tAnnotation, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_ConstructorDefinition_10_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, TConstructor tAnnotation, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		EMoflonEdge tMethodSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tDefinition____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAnnotation);
		match.getToBeTranslatedNodes().add(tDefinition);
		String tMethodSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tMethodSignature____signature_name_prime = "signature";
		String tDefinition__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tDefinition____tAnnotated_name_prime = "tAnnotated";
		tMethodSignature__tDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tMethodSignature__tDefinition____definitions);
		tDefinition__tMethodSignature____signature.setSrc(tDefinition);
		tDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		match.getToBeTranslatedEdges().add(tDefinition__tMethodSignature____signature);
		tDefinition__tAnnotation____tAnnotation.setSrc(tDefinition);
		tDefinition__tAnnotation____tAnnotation.setTrg(tAnnotation);
		match.getToBeTranslatedEdges().add(tDefinition__tAnnotation____tAnnotation);
		tAnnotation__tDefinition____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tDefinition____tAnnotated.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tAnnotation__tDefinition____tAnnotated);
		tMethodSignature__tDefinition____definitions.setName(tMethodSignature__tDefinition____definitions_name_prime);
		tDefinition__tMethodSignature____signature.setName(tDefinition__tMethodSignature____signature_name_prime);
		tDefinition__tAnnotation____tAnnotation.setName(tDefinition__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tDefinition____tAnnotated.setName(tAnnotation__tDefinition____tAnnotated_name_prime);
		return new Object[] { match, tAnnotation, tMethodSignature, tDefinition,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				tDefinition__tAnnotation____tAnnotation, tAnnotation__tDefinition____tAnnotated };
	}

	public static final Object[] pattern_ConstructorDefinition_10_5_collectcontextelements_blackBBBB(Match match,
			TConstructor tAnnotation, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		return new Object[] { match, tAnnotation, tMethodSignature, tDefinition };
	}

	public static final Object[] pattern_ConstructorDefinition_10_5_collectcontextelements_greenBB(Match match,
			TMethodSignature tMethodSignature) {
		match.getContextNodes().add(tMethodSignature);
		return new Object[] { match, tMethodSignature };
	}

	public static final void pattern_ConstructorDefinition_10_6_registerobjectstomatch_expressionBBBBB(
			ConstructorDefinition _this, Match match, TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tAnnotation, tMethodSignature, tDefinition);

	}

	public static final boolean pattern_ConstructorDefinition_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDefinition_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mSignatureToTMethodSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignature");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpMSignatureToTMethodSignature = _localVariable_1;
		EObject tmpTMethodSignature = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		EObject tmpMSignature = _localVariable_4;
		if (tmpTAnnotation instanceof TConstructor) {
			TConstructor tAnnotation = (TConstructor) tmpTAnnotation;
			if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
				MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
				if (tmpTMethodSignature instanceof TMethodSignature) {
					TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
					if (tmpTDefinition instanceof TMethodDefinition) {
						TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
						if (tmpMSignature instanceof MMethodSignature) {
							MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
							return new Object[] { tAnnotation, mSignatureToTMethodSignature, tMethodSignature,
									tDefinition, mSignature, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_11_1_performtransformation_blackBBBBBFBB(
			TConstructor tAnnotation, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition, MMethodSignature mSignature,
			ConstructorDefinition _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tAnnotation, mSignatureToTMethodSignature, tMethodSignature, tDefinition,
						mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			ConstructorDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorDefinition_11_1_performtransformation_binding = pattern_ConstructorDefinition_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorDefinition_11_1_performtransformation_binding != null) {
			TConstructor tAnnotation = (TConstructor) result_pattern_ConstructorDefinition_11_1_performtransformation_binding[0];
			MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_ConstructorDefinition_11_1_performtransformation_binding[1];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_ConstructorDefinition_11_1_performtransformation_binding[2];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_ConstructorDefinition_11_1_performtransformation_binding[3];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_ConstructorDefinition_11_1_performtransformation_binding[4];

			Object[] result_pattern_ConstructorDefinition_11_1_performtransformation_black = pattern_ConstructorDefinition_11_1_performtransformation_blackBBBBBFBB(
					tAnnotation, mSignatureToTMethodSignature, tMethodSignature, tDefinition, mSignature, _this,
					isApplicableMatch);
			if (result_pattern_ConstructorDefinition_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorDefinition_11_1_performtransformation_black[5];

				return new Object[] { tAnnotation, mSignatureToTMethodSignature, tMethodSignature, tDefinition,
						mSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_11_1_performtransformation_greenFBFFFB(
			TMethodDefinition tDefinition, MMethodSignature mSignature) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MConstructorDefinition mDefinition = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement, mSignature };
	}

	public static final Object[] pattern_ConstructorDefinition_11_2_collecttranslatedelements_blackBBBBBB(
			TConstructor tAnnotation, MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition,
			MConstructorDefinition mDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		return new Object[] { tAnnotation, mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_ConstructorDefinition_11_2_collecttranslatedelements_greenFBBBBBB(
			TConstructor tAnnotation, MDefinitionToTMember mDefinitionToTMember, TMethodDefinition tDefinition,
			MConstructorDefinition mDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tAnnotation);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getTranslatedElements().add(tDefinition);
		ruleresult.getCreatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		return new Object[] { ruleresult, tAnnotation, mDefinitionToTMember, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_ConstructorDefinition_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject mDefinitionToTMember,
			EObject mSignatureToTMethodSignature, EObject tMethodSignature, EObject tDefinition, EObject mDefinition,
			EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement, EObject mSignature) {
		if (!tAnnotation.equals(tMethodSignature)) {
			if (!tAnnotation.equals(tDefinition)) {
				if (!mDefinitionToTMember.equals(tAnnotation)) {
					if (!mDefinitionToTMember.equals(mSignatureToTMethodSignature)) {
						if (!mDefinitionToTMember.equals(tMethodSignature)) {
							if (!mDefinitionToTMember.equals(tDefinition)) {
								if (!mDefinitionToTMember.equals(mFlowElementToTFlowElement)) {
									if (!mDefinitionToTMember.equals(mSignature)) {
										if (!mSignatureToTMethodSignature.equals(tAnnotation)) {
											if (!mSignatureToTMethodSignature.equals(tMethodSignature)) {
												if (!mSignatureToTMethodSignature.equals(tDefinition)) {
													if (!tDefinition.equals(tMethodSignature)) {
														if (!mDefinition.equals(tAnnotation)) {
															if (!mDefinition.equals(mDefinitionToTMember)) {
																if (!mDefinition.equals(mSignatureToTMethodSignature)) {
																	if (!mDefinition.equals(tMethodSignature)) {
																		if (!mDefinition.equals(tDefinition)) {
																			if (!mDefinition.equals(
																					mFlowElementToTFlowElement)) {
																				if (!mDefinition.equals(mSignature)) {
																					if (!mBodyToTAnnotation
																							.equals(tAnnotation)) {
																						if (!mBodyToTAnnotation.equals(
																								mDefinitionToTMember)) {
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
																														.equals(mSignature)) {
																													if (!mFlowElementToTFlowElement
																															.equals(tAnnotation)) {
																														if (!mFlowElementToTFlowElement
																																.equals(mSignatureToTMethodSignature)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(tMethodSignature)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(tDefinition)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mSignature)) {
																																		if (!mSignature
																																				.equals(tAnnotation)) {
																																			if (!mSignature
																																					.equals(mSignatureToTMethodSignature)) {
																																				if (!mSignature
																																						.equals(tMethodSignature)) {
																																					if (!mSignature
																																							.equals(tDefinition)) {
																																						return new Object[] {
																																								ruleresult,
																																								tAnnotation,
																																								mDefinitionToTMember,
																																								mSignatureToTMethodSignature,
																																								tMethodSignature,
																																								tDefinition,
																																								mDefinition,
																																								mBodyToTAnnotation,
																																								mFlowElementToTFlowElement,
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
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject mDefinitionToTMember, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mSignature) {
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tDefinition____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorDefinition";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String tMethodSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tMethodSignature____signature_name_prime = "signature";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mFlowElementToTFlowElement__mDefinition____source_name_prime = "source";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String tDefinition__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tDefinition____tAnnotated_name_prime = "tAnnotated";
		String mFlowElementToTFlowElement__tDefinition____target_name_prime = "target";
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		tMethodSignature__tDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tMethodSignature__tDefinition____definitions);
		tDefinition__tMethodSignature____signature.setSrc(tDefinition);
		tDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getTranslatedEdges().add(tDefinition__tMethodSignature____signature);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		mFlowElementToTFlowElement__mDefinition____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mDefinition____source);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mDefinition__mSignature____mSignature);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		tDefinition__tAnnotation____tAnnotation.setSrc(tDefinition);
		tDefinition__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tDefinition__tAnnotation____tAnnotation);
		tAnnotation__tDefinition____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tDefinition____tAnnotated.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tAnnotation__tDefinition____tAnnotated);
		mFlowElementToTFlowElement__tDefinition____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tDefinition____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		tMethodSignature__tDefinition____definitions.setName(tMethodSignature__tDefinition____definitions_name_prime);
		tDefinition__tMethodSignature____signature.setName(tDefinition__tMethodSignature____signature_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mFlowElementToTFlowElement__mDefinition____source
				.setName(mFlowElementToTFlowElement__mDefinition____source_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		tDefinition__tAnnotation____tAnnotation.setName(tDefinition__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tDefinition____tAnnotated.setName(tAnnotation__tDefinition____tAnnotated_name_prime);
		mFlowElementToTFlowElement__tDefinition____target
				.setName(mFlowElementToTFlowElement__tDefinition____target_name_prime);
		return new Object[] { ruleresult, tAnnotation, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature, mDefinitionToTMember__mDefinition____source,
				tMethodSignature__tDefinition____definitions, tDefinition__tMethodSignature____signature,
				mBodyToTAnnotation__tDefinition____target, mFlowElementToTFlowElement__mDefinition____source,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				tDefinition__tAnnotation____tAnnotation, tAnnotation__tDefinition____tAnnotated,
				mFlowElementToTFlowElement__tDefinition____target };
	}

	public static final void pattern_ConstructorDefinition_11_5_registerobjects_expressionBBBBBBBBBBB(
			ConstructorDefinition _this, PerformRuleResult ruleresult, EObject tAnnotation,
			EObject mDefinitionToTMember, EObject mSignatureToTMethodSignature, EObject tMethodSignature,
			EObject tDefinition, EObject mDefinition, EObject mBodyToTAnnotation, EObject mFlowElementToTFlowElement,
			EObject mSignature) {
		_this.registerObjects_BWD(ruleresult, tAnnotation, mDefinitionToTMember, mSignatureToTMethodSignature,
				tMethodSignature, tDefinition, mDefinition, mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature);

	}

	public static final PerformRuleResult pattern_ConstructorDefinition_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_12_1_preparereturnvalue_bindingFB(
			ConstructorDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ConstructorDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorDefinition _this) {
		Object[] result_pattern_ConstructorDefinition_12_1_preparereturnvalue_binding = pattern_ConstructorDefinition_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDefinition_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorDefinition_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDefinition_12_1_preparereturnvalue_black = pattern_ConstructorDefinition_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorDefinition_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorDefinition_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConstructorDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorDefinition_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnnotation");
		EObject _localVariable_1 = match.getObject("tMethodSignature");
		EObject _localVariable_2 = match.getObject("tDefinition");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		if (tmpTAnnotation instanceof TConstructor) {
			TConstructor tAnnotation = (TConstructor) tmpTAnnotation;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpTDefinition instanceof TMethodDefinition) {
					TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
					return new Object[] { tAnnotation, tMethodSignature, tDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDefinition_12_2_corematch_blackBFBBFB(
			TConstructor tAnnotation, TMethodSignature tMethodSignature, TMethodDefinition tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tDefinition_lowerBound = tDefinition.getLowerBound();
		if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
			int tDefinition_upperBound = tDefinition.getUpperBound();
			if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(1))) {
				for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMethodSignature, MSignatureToTSignature.class, "target")) {
					MSignature tmpMSignature = mSignatureToTMethodSignature.getSource();
					if (tmpMSignature instanceof MMethodSignature) {
						MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
						_result.add(new Object[] { tAnnotation, mSignatureToTMethodSignature, tMethodSignature,
								tDefinition, mSignature, match });
					}

				}
			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDefinition_12_3_findcontext_blackBBBBB(
			TConstructor tAnnotation, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition, MMethodSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethodSignature.getDefinitions().contains(tDefinition)) {
			if (tMethodSignature.equals(mSignatureToTMethodSignature.getTarget())) {
				if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
					if (tDefinition.getTAnnotation().contains(tAnnotation)) {
						int tDefinition_lowerBound = tDefinition.getLowerBound();
						if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
							int tDefinition_upperBound = tDefinition.getUpperBound();
							if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(1))) {
								_result.add(new Object[] { tAnnotation, mSignatureToTMethodSignature, tMethodSignature,
										tDefinition, mSignature });
							}

						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_12_3_findcontext_greenBBBBBFFFFFFF(
			TConstructor tAnnotation, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition, MMethodSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignatureToTMethodSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tDefinition____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMethodSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tMethodSignature____signature_name_prime = "signature";
		String mSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String mSignatureToTMethodSignature__mSignature____source_name_prime = "source";
		String tDefinition__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tDefinition____tAnnotated_name_prime = "tAnnotated";
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition);
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
		mSignatureToTMethodSignature__mSignature____source.setSrc(mSignatureToTMethodSignature);
		mSignatureToTMethodSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTMethodSignature__mSignature____source);
		tDefinition__tAnnotation____tAnnotation.setSrc(tDefinition);
		tDefinition__tAnnotation____tAnnotation.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tDefinition__tAnnotation____tAnnotation);
		tAnnotation__tDefinition____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tDefinition____tAnnotated.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tDefinition____tAnnotated);
		tMethodSignature__tDefinition____definitions.setName(tMethodSignature__tDefinition____definitions_name_prime);
		tDefinition__tMethodSignature____signature.setName(tDefinition__tMethodSignature____signature_name_prime);
		mSignatureToTMethodSignature__tMethodSignature____target
				.setName(mSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		mSignatureToTMethodSignature__mSignature____source
				.setName(mSignatureToTMethodSignature__mSignature____source_name_prime);
		tDefinition__tAnnotation____tAnnotation.setName(tDefinition__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tDefinition____tAnnotated.setName(tAnnotation__tDefinition____tAnnotated_name_prime);
		return new Object[] { tAnnotation, mSignatureToTMethodSignature, tMethodSignature, tDefinition, mSignature,
				isApplicableMatch, tMethodSignature__tDefinition____definitions,
				tDefinition__tMethodSignature____signature, mSignatureToTMethodSignature__tMethodSignature____target,
				mSignatureToTMethodSignature__mSignature____source, tDefinition__tAnnotation____tAnnotation,
				tAnnotation__tDefinition____tAnnotated };
	}

	public static final Object[] pattern_ConstructorDefinition_12_4_solveCSP_bindingFBBBBBBB(
			ConstructorDefinition _this, IsApplicableMatch isApplicableMatch, TConstructor tAnnotation,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAnnotation,
				mSignatureToTMethodSignature, tMethodSignature, tDefinition, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotation, mSignatureToTMethodSignature,
					tMethodSignature, tDefinition, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDefinition_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			ConstructorDefinition _this, IsApplicableMatch isApplicableMatch, TConstructor tAnnotation,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MMethodSignature mSignature) {
		Object[] result_pattern_ConstructorDefinition_12_4_solveCSP_binding = pattern_ConstructorDefinition_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tAnnotation, mSignatureToTMethodSignature, tMethodSignature, tDefinition,
				mSignature);
		if (result_pattern_ConstructorDefinition_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDefinition_12_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDefinition_12_4_solveCSP_black = pattern_ConstructorDefinition_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDefinition_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotation, mSignatureToTMethodSignature,
						tMethodSignature, tDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDefinition_12_5_checkCSP_expressionFBB(ConstructorDefinition _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorDefinition_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDefinition_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_20_1_preparereturnvalue_bindingFB(
			ConstructorDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ConstructorDefinition _this) {
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

	public static final Object[] pattern_ConstructorDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorDefinition _this) {
		Object[] result_pattern_ConstructorDefinition_20_1_preparereturnvalue_binding = pattern_ConstructorDefinition_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDefinition_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorDefinition_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDefinition_20_1_preparereturnvalue_black = pattern_ConstructorDefinition_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorDefinition_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorDefinition_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorDefinition_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_0BBB(
			TConstructor tAnnotation, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		TAnnotatable __DEC_tAnnotation_tAnnotated_965931 = tAnnotation.getTAnnotated();
		if (__DEC_tAnnotation_tAnnotated_965931 != null) {
			if (!tMethodSignature.equals(__DEC_tAnnotation_tAnnotated_965931)) {
				if (!tDefinition.equals(__DEC_tAnnotation_tAnnotated_965931)) {
					return new Object[] { tAnnotation, tMethodSignature, tDefinition };
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_1BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_signature_143267 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_143267 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_signature_143267)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_2B(
			TMethodDefinition tDefinition) {
		TAbstractType __DEC_tDefinition_returnType_401861 = tDefinition.getReturnType();
		if (__DEC_tDefinition_returnType_401861 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_3B(
			TMethodDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_701797 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_701797 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_4BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_definitions_471849 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_471849 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_definitions_471849)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_5BB(
			TConstructor tAnnotation, TMethodSignature tMethodSignature) {
		if (tMethodSignature.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, tMethodSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDefinition_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodSignature = _edge_definitions.getSrc();
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			EObject tmpTDefinition = _edge_definitions.getTrg();
			if (tmpTDefinition instanceof TMethodDefinition) {
				TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
				if (tMethodSignature.getDefinitions().contains(tDefinition)) {
					int tDefinition_lowerBound = tDefinition.getLowerBound();
					if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
						int tDefinition_upperBound = tDefinition.getUpperBound();
						if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(1))) {
							if (pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_1BB(tDefinition,
									tMethodSignature) == null) {
								if (pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_2B(
										tDefinition) == null) {
									if (pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_3B(
											tDefinition) == null) {
										if (pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_4BB(
												tDefinition, tMethodSignature) == null) {
											for (TAnnotation tmpTAnnotation : tDefinition.getTAnnotation()) {
												if (tmpTAnnotation instanceof TConstructor) {
													TConstructor tAnnotation = (TConstructor) tmpTAnnotation;
													if (pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_0BBB(
															tAnnotation, tMethodSignature, tDefinition) == null) {
														if (pattern_ConstructorDefinition_20_2_testcorematchandDECs_black_nac_5BB(
																tAnnotation, tMethodSignature) == null) {
															_result.add(new Object[] { tAnnotation, tMethodSignature,
																	tDefinition, _edge_definitions });
														}
													}
												}
											}
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

	public static final Object[] pattern_ConstructorDefinition_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ConstructorDefinition _this, Match match, TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnnotation, tMethodSignature, tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorDefinition_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_21_1_preparereturnvalue_bindingFB(
			ConstructorDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ConstructorDefinition _this) {
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

	public static final Object[] pattern_ConstructorDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorDefinition _this) {
		Object[] result_pattern_ConstructorDefinition_21_1_preparereturnvalue_binding = pattern_ConstructorDefinition_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDefinition_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorDefinition_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDefinition_21_1_preparereturnvalue_black = pattern_ConstructorDefinition_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorDefinition_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorDefinition_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorDefinition_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConstructorDefinition_21_2_testcorematchandDECs_black_nac_0BB(
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_794713 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_794713 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_794713)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDefinition_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mDefinitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSignature = _edge_mDefinitions.getSrc();
		if (tmpMSignature instanceof MMethodSignature) {
			MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
			EObject tmpMDefinition = _edge_mDefinitions.getTrg();
			if (tmpMDefinition instanceof MConstructorDefinition) {
				MConstructorDefinition mDefinition = (MConstructorDefinition) tmpMDefinition;
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					if (pattern_ConstructorDefinition_21_2_testcorematchandDECs_black_nac_0BB(mDefinition,
							mSignature) == null) {
						_result.add(new Object[] { mDefinition, mSignature, _edge_mDefinitions });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ConstructorDefinition _this, Match match, MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorDefinition_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_24_1_prepare_blackB(ConstructorDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorDefinition_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ConstructorDefinition_24_2_matchsrctrgcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_1 = targetMatch.getObject("tMethodSignature");
		EObject _localVariable_2 = targetMatch.getObject("tDefinition");
		EObject _localVariable_3 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_4 = sourceMatch.getObject("mSignature");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpMSignature = _localVariable_4;
		if (tmpTAnnotation instanceof TConstructor) {
			TConstructor tAnnotation = (TConstructor) tmpTAnnotation;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpTDefinition instanceof TMethodDefinition) {
					TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
					if (tmpMDefinition instanceof MConstructorDefinition) {
						MConstructorDefinition mDefinition = (MConstructorDefinition) tmpMDefinition;
						if (tmpMSignature instanceof MMethodSignature) {
							MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
							return new Object[] { tAnnotation, tMethodSignature, tDefinition, mDefinition, mSignature,
									targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_24_2_matchsrctrgcontext_blackBBBBBBB(
			TConstructor tAnnotation, TMethodSignature tMethodSignature, TMethodDefinition tDefinition,
			MConstructorDefinition mDefinition, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tDefinition_lowerBound = tDefinition.getLowerBound();
			if (Integer.valueOf(tDefinition_lowerBound).equals(Integer.valueOf(0))) {
				int tDefinition_upperBound = tDefinition.getUpperBound();
				if (Integer.valueOf(tDefinition_upperBound).equals(Integer.valueOf(1))) {
					return new Object[] { tAnnotation, tMethodSignature, tDefinition, mDefinition, mSignature,
							sourceMatch, targetMatch };
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ConstructorDefinition_24_2_matchsrctrgcontext_binding = pattern_ConstructorDefinition_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ConstructorDefinition_24_2_matchsrctrgcontext_binding != null) {
			TConstructor tAnnotation = (TConstructor) result_pattern_ConstructorDefinition_24_2_matchsrctrgcontext_binding[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_ConstructorDefinition_24_2_matchsrctrgcontext_binding[1];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_ConstructorDefinition_24_2_matchsrctrgcontext_binding[2];
			MConstructorDefinition mDefinition = (MConstructorDefinition) result_pattern_ConstructorDefinition_24_2_matchsrctrgcontext_binding[3];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_ConstructorDefinition_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_ConstructorDefinition_24_2_matchsrctrgcontext_black = pattern_ConstructorDefinition_24_2_matchsrctrgcontext_blackBBBBBBB(
					tAnnotation, tMethodSignature, tDefinition, mDefinition, mSignature, sourceMatch, targetMatch);
			if (result_pattern_ConstructorDefinition_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tAnnotation, tMethodSignature, tDefinition, mDefinition, mSignature, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_24_3_solvecsp_bindingFBBBBBBBB(
			ConstructorDefinition _this, TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MConstructorDefinition mDefinition, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(tAnnotation, tMethodSignature, tDefinition, mDefinition,
				mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, tAnnotation, tMethodSignature, tDefinition, mDefinition, mSignature,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDefinition_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			ConstructorDefinition _this, TConstructor tAnnotation, TMethodSignature tMethodSignature,
			TMethodDefinition tDefinition, MConstructorDefinition mDefinition, MMethodSignature mSignature,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ConstructorDefinition_24_3_solvecsp_binding = pattern_ConstructorDefinition_24_3_solvecsp_bindingFBBBBBBBB(
				_this, tAnnotation, tMethodSignature, tDefinition, mDefinition, mSignature, sourceMatch, targetMatch);
		if (result_pattern_ConstructorDefinition_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDefinition_24_3_solvecsp_binding[0];

			Object[] result_pattern_ConstructorDefinition_24_3_solvecsp_black = pattern_ConstructorDefinition_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ConstructorDefinition_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tAnnotation, tMethodSignature, tDefinition, mDefinition, mSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDefinition_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDefinition_24_5_matchcorrcontext_blackFBBBB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MSignatureToTSignature mSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMethodSignature, MSignatureToTSignature.class, "target")) {
				if (mSignature.equals(mSignatureToTMethodSignature.getSource())) {
					_result.add(new Object[] { mSignatureToTMethodSignature, tMethodSignature, mSignature, sourceMatch,
							targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_24_5_matchcorrcontext_greenBBBF(
			MSignatureToTSignature mSignatureToTMethodSignature, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ConstructorDefinition";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mSignatureToTMethodSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mSignatureToTMethodSignature, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ConstructorDefinition_24_6_createcorrespondence_blackBBBBBB(
			TConstructor tAnnotation, TMethodSignature tMethodSignature, TMethodDefinition tDefinition,
			MConstructorDefinition mDefinition, MMethodSignature mSignature, CCMatch ccMatch) {
		return new Object[] { tAnnotation, tMethodSignature, tDefinition, mDefinition, mSignature, ccMatch };
	}

	public static final Object[] pattern_ConstructorDefinition_24_6_createcorrespondence_greenFBBFFB(
			TMethodDefinition tDefinition, MConstructorDefinition mDefinition, CCMatch ccMatch) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTMember);
		mBodyToTAnnotation.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		return new Object[] { mDefinitionToTMember, tDefinition, mDefinition, mBodyToTAnnotation,
				mFlowElementToTFlowElement, ccMatch };
	}

	public static final Object[] pattern_ConstructorDefinition_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ConstructorDefinition_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ConstructorDefinition";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDefinition_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_27_1_matchtggpattern_black_nac_0BB(
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_901161 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_901161 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_901161)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_27_1_matchtggpattern_blackBB(
			MConstructorDefinition mDefinition, MMethodSignature mSignature) {
		if (mSignature.getMDefinitions().contains(mDefinition)) {
			if (pattern_ConstructorDefinition_27_1_matchtggpattern_black_nac_0BB(mDefinition, mSignature) == null) {
				return new Object[] { mDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDefinition_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDefinition_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_0BBB(
			TConstructor tAnnotation, TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		TAnnotatable __DEC_tAnnotation_tAnnotated_814463 = tAnnotation.getTAnnotated();
		if (__DEC_tAnnotation_tAnnotated_814463 != null) {
			if (!tMethodSignature.equals(__DEC_tAnnotation_tAnnotated_814463)) {
				if (!tDefinition.equals(__DEC_tAnnotation_tAnnotated_814463)) {
					return new Object[] { tAnnotation, tMethodSignature, tDefinition };
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_1BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_signature_10135 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_10135 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_signature_10135)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_2B(
			TMethodDefinition tDefinition) {
		TAbstractType __DEC_tDefinition_returnType_544184 = tDefinition.getReturnType();
		if (__DEC_tDefinition_returnType_544184 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_3B(
			TMethodDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_966186 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_966186 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_4BB(
			TMethodDefinition tDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tDefinition_definitions_969610 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_969610 != null) {
			if (!tMethodSignature.equals(__DEC_tDefinition_definitions_969610)) {
				return new Object[] { tDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_5BB(
			TConstructor tAnnotation, TMethodSignature tMethodSignature) {
		if (tMethodSignature.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, tMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_28_1_matchtggpattern_blackBBB(TConstructor tAnnotation,
			TMethodSignature tMethodSignature, TMethodDefinition tDefinition) {
		if (tMethodSignature.getDefinitions().contains(tDefinition)) {
			if (tDefinition.getTAnnotation().contains(tAnnotation)) {
				if (pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_0BBB(tAnnotation, tMethodSignature,
						tDefinition) == null) {
					if (pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_1BB(tDefinition,
							tMethodSignature) == null) {
						if (pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_2B(tDefinition) == null) {
							if (pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_3B(tDefinition) == null) {
								if (pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_4BB(tDefinition,
										tMethodSignature) == null) {
									if (pattern_ConstructorDefinition_28_1_matchtggpattern_black_nac_5BB(tAnnotation,
											tMethodSignature) == null) {
										return new Object[] { tAnnotation, tMethodSignature, tDefinition };
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

	public static final Object[] pattern_ConstructorDefinition_28_1_matchtggpattern_greenB(
			TMethodDefinition tDefinition) {
		int tDefinition_lowerBound_prime = Integer.valueOf(0);
		int tDefinition_upperBound_prime = Integer.valueOf(1);
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		return new Object[] { tDefinition };
	}

	public static final boolean pattern_ConstructorDefinition_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDefinition_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_29_1_createresult_blackB(ConstructorDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorDefinition_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ConstructorDefinition_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTMethodSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTMethodSignature)) {
			return new Object[] { ruleResult, mSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tMethodSignature) {
		if (ruleResult.getTargetObjects().contains(tMethodSignature)) {
			return new Object[] { ruleResult, tMethodSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDefinition_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mSignatureToTMethodSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMSignatureToTMethodSignature : mSignatureToTMethodSignatureList.getEntryObjects()) {
				if (tmpMSignatureToTMethodSignature instanceof MSignatureToTSignature) {
					MSignatureToTSignature mSignatureToTMethodSignature = (MSignatureToTSignature) tmpMSignatureToTMethodSignature;
					MSignature tmpMSignature = mSignatureToTMethodSignature.getSource();
					if (tmpMSignature instanceof MMethodSignature) {
						MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
						TSignature tmpTMethodSignature = mSignatureToTMethodSignature.getTarget();
						if (tmpTMethodSignature instanceof TMethodSignature) {
							TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
							if (pattern_ConstructorDefinition_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mSignatureToTMethodSignature) == null) {
								if (pattern_ConstructorDefinition_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mSignature) == null) {
									if (pattern_ConstructorDefinition_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											tMethodSignature) == null) {
										_result.add(new Object[] { mSignatureToTMethodSignatureList,
												mSignatureToTMethodSignature, mSignature, tMethodSignature,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_ConstructorDefinition_29_3_solveCSP_bindingFBBBBBB(ConstructorDefinition _this,
			IsApplicableMatch isApplicableMatch, MSignatureToTSignature mSignatureToTMethodSignature,
			TMethodSignature tMethodSignature, MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mSignatureToTMethodSignature,
				tMethodSignature, mSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignatureToTMethodSignature, tMethodSignature,
					mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDefinition_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDefinition_29_3_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorDefinition _this, IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ConstructorDefinition_29_3_solveCSP_binding = pattern_ConstructorDefinition_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mSignatureToTMethodSignature, tMethodSignature, mSignature, ruleResult);
		if (result_pattern_ConstructorDefinition_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDefinition_29_3_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDefinition_29_3_solveCSP_black = pattern_ConstructorDefinition_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDefinition_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignatureToTMethodSignature, tMethodSignature,
						mSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDefinition_29_4_checkCSP_expressionFBB(ConstructorDefinition _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDefinition_29_5_checknacs_blackBBB(
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MMethodSignature mSignature) {
		return new Object[] { mSignatureToTMethodSignature, tMethodSignature, mSignature };
	}

	public static final Object[] pattern_ConstructorDefinition_29_6_perform_blackBBBB(
			MSignatureToTSignature mSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mSignatureToTMethodSignature, tMethodSignature, mSignature, ruleResult };
	}

	public static final Object[] pattern_ConstructorDefinition_29_6_perform_greenFFBFFFFBB(
			TMethodSignature tMethodSignature, MMethodSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		TConstructor tAnnotation = BasicFactory.eINSTANCE.createTConstructor();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		MConstructorDefinition mDefinition = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		int tDefinition_lowerBound_prime = Integer.valueOf(0);
		int tDefinition_upperBound_prime = Integer.valueOf(1);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(tAnnotation);
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		tMethodSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		tDefinition.getTAnnotation().add(tAnnotation);
		ruleResult.getTargetObjects().add(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mFlowElementToTFlowElement.setSource(mDefinition);
		mFlowElementToTFlowElement.setTarget(tDefinition);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		tDefinition.setLowerBound(Integer.valueOf(tDefinition_lowerBound_prime));
		tDefinition.setUpperBound(Integer.valueOf(tDefinition_upperBound_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAnnotation, mDefinitionToTMember, tMethodSignature, tDefinition, mDefinition,
				mBodyToTAnnotation, mFlowElementToTFlowElement, mSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ConstructorDefinition_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConstructorDefinitionImpl
