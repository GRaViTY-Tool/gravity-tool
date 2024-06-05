/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.FieldDefinition;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
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
 * An implementation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldDefinitionImpl extends AbstractRuleImpl implements FieldDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFieldDefinition mDefinition, MFieldSignature mSignature) {

		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_0_1_initialbindings_blackBBBB(this, match,
				mDefinition, mSignature);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mDefinition, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDefinitionImpl.pattern_FieldDefinition_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldDefinitionImpl
					.pattern_FieldDefinition_0_4_collectelementstobetranslated_blackBBB(match, mDefinition, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
			}
			FieldDefinitionImpl.pattern_FieldDefinition_0_4_collectelementstobetranslated_greenBBBFF(match, mDefinition,
					mSignature);
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FieldDefinitionImpl
					.pattern_FieldDefinition_0_5_collectcontextelements_blackBBB(match, mDefinition, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
			}
			FieldDefinitionImpl.pattern_FieldDefinition_0_5_collectcontextelements_greenBB(match, mSignature);

			// 
			FieldDefinitionImpl.pattern_FieldDefinition_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mDefinition, mSignature);
			return FieldDefinitionImpl.pattern_FieldDefinition_0_7_expressionF();
		} else {
			return FieldDefinitionImpl.pattern_FieldDefinition_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result1_bindingAndBlack[0];
		MFieldDefinition mDefinition = (MFieldDefinition) result1_bindingAndBlack[1];
		TFieldSignature tFieldSignature = (TFieldSignature) result1_bindingAndBlack[2];
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldDefinitionImpl
				.pattern_FieldDefinition_1_1_performtransformation_greenFFFBBF(mDefinition, tFieldSignature);
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition = (MAbstractFlowElementToTAbstractFlowElement) result1_green[1];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[2];
		TFieldDefinition tDefinition = (TFieldDefinition) result1_green[5];

		Object[] result2_black = FieldDefinitionImpl.pattern_FieldDefinition_1_2_collecttranslatedelements_blackBBBBB(
				mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition, tDefinition);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[tDefinition] = " + tDefinition + ".");
		}
		Object[] result2_green = FieldDefinitionImpl.pattern_FieldDefinition_1_2_collecttranslatedelements_greenFBBBBB(
				mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition, tDefinition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDefinitionImpl.pattern_FieldDefinition_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, mBodyToTAnnotation, mDefinitionToTDefinition, mSignatureToTFieldSignature,
				mDefinitionToTMember, mDefinition, tFieldSignature, mSignature, tDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mDefinitionToTDefinition] = "
					+ mDefinitionToTDefinition + ", " + "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[tFieldSignature] = " + tFieldSignature + ", " + "[mSignature] = "
					+ mSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}
		FieldDefinitionImpl.pattern_FieldDefinition_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFF(ruleresult,
				mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition, tFieldSignature,
				mSignature, tDefinition);
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tFieldSignature__tDefinition____definitions = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mDefinitionToTDefinition__mDefinition____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mDefinitionToTDefinition__tDefinition____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[17];

		// 
		// 
		FieldDefinitionImpl.pattern_FieldDefinition_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				mBodyToTAnnotation, mDefinitionToTDefinition, mSignatureToTFieldSignature, mDefinitionToTMember,
				mDefinition, tFieldSignature, mSignature, tDefinition);
		return FieldDefinitionImpl.pattern_FieldDefinition_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDefinitionImpl
				.pattern_FieldDefinition_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDefinitionImpl.pattern_FieldDefinition_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFieldDefinition mDefinition = (MFieldDefinition) result2_binding[0];
		MFieldSignature mSignature = (MFieldSignature) result2_binding[1];
		for (Object[] result2_black : FieldDefinitionImpl.pattern_FieldDefinition_2_2_corematch_blackFBFBB(mDefinition,
				mSignature, match)) {
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[0];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[2];
			// ForEach 
			for (Object[] result3_black : FieldDefinitionImpl.pattern_FieldDefinition_2_3_findcontext_blackBBBB(
					mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature)) {
				Object[] result3_green = FieldDefinitionImpl.pattern_FieldDefinition_2_3_findcontext_greenBBBBFFFFF(
						mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mSignatureToTFieldSignature__mSignature____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = FieldDefinitionImpl
						.pattern_FieldDefinition_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignatureToTFieldSignature] = "
							+ mSignatureToTFieldSignature + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[tFieldSignature] = " + tFieldSignature + ", " + "[mSignature] = " + mSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDefinitionImpl.pattern_FieldDefinition_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDefinitionImpl
							.pattern_FieldDefinition_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFieldDefinition mDefinition, MFieldSignature mSignature) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFieldDefinition mDefinition, MFieldSignature mSignature) {// Create CSP
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
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldDefinition mDefinition,
			TFieldSignature tFieldSignature, MFieldSignature mSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tFieldSignature_upperBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tFieldSignature.upperBound", true, csp);
		var_tFieldSignature_upperBound.setValue(tFieldSignature.getUpperBound());
		var_tFieldSignature_upperBound.setType("int");
		Variable var_tFieldSignature_lowerBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tFieldSignature.lowerBound", true, csp);
		var_tFieldSignature_lowerBound.setValue(tFieldSignature.getLowerBound());
		var_tFieldSignature_lowerBound.setType("int");

		// Create unbound variables
		Variable var_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("upperBound", csp);
		var_upperBound.setType("int");
		Variable var_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("lowerBound", csp);
		var_lowerBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tFieldSignature_upperBound, var_upperBound);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_tFieldSignature_lowerBound, var_lowerBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mBodyToTAnnotation,
			EObject mDefinitionToTDefinition, EObject mSignatureToTFieldSignature, EObject mDefinitionToTMember,
			EObject mDefinition, EObject tFieldSignature, EObject mSignature, EObject tDefinition) {
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
		ruleresult.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mDefinition").eClass())
				.equals("modisco.MFieldDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {

		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_10_1_initialbindings_blackBBBB(this, match,
				tFieldSignature, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tFieldSignature] = " + tFieldSignature + ", " + "[tDefinition] = "
					+ tDefinition + ".");
		}

		Object[] result2_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tFieldSignature, tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tFieldSignature] = " + tFieldSignature + ", " + "[tDefinition] = "
					+ tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDefinitionImpl.pattern_FieldDefinition_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldDefinitionImpl
					.pattern_FieldDefinition_10_4_collectelementstobetranslated_blackBBB(match, tFieldSignature,
							tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tFieldSignature] = " + tFieldSignature + ", " + "[tDefinition] = " + tDefinition + ".");
			}
			FieldDefinitionImpl.pattern_FieldDefinition_10_4_collectelementstobetranslated_greenBBBFF(match,
					tFieldSignature, tDefinition);
			//nothing EMoflonEdge tFieldSignature__tDefinition____definitions = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tDefinition__tFieldSignature____signature = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FieldDefinitionImpl
					.pattern_FieldDefinition_10_5_collectcontextelements_blackBBB(match, tFieldSignature, tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tFieldSignature] = " + tFieldSignature + ", " + "[tDefinition] = " + tDefinition + ".");
			}
			FieldDefinitionImpl.pattern_FieldDefinition_10_5_collectcontextelements_greenBB(match, tFieldSignature);

			// 
			FieldDefinitionImpl.pattern_FieldDefinition_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tFieldSignature, tDefinition);
			return FieldDefinitionImpl.pattern_FieldDefinition_10_7_expressionF();
		} else {
			return FieldDefinitionImpl.pattern_FieldDefinition_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result1_bindingAndBlack[0];
		TFieldSignature tFieldSignature = (TFieldSignature) result1_bindingAndBlack[1];
		MFieldSignature mSignature = (MFieldSignature) result1_bindingAndBlack[2];
		TFieldDefinition tDefinition = (TFieldDefinition) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldDefinitionImpl
				.pattern_FieldDefinition_11_1_performtransformation_greenFFFFBB(mSignature, tDefinition);
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition = (MAbstractFlowElementToTAbstractFlowElement) result1_green[1];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[2];
		MFieldDefinition mDefinition = (MFieldDefinition) result1_green[3];

		Object[] result2_black = FieldDefinitionImpl.pattern_FieldDefinition_11_2_collecttranslatedelements_blackBBBBB(
				mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition, tDefinition);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mDefinitionToTDefinition] = " + mDefinitionToTDefinition + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[tDefinition] = " + tDefinition + ".");
		}
		Object[] result2_green = FieldDefinitionImpl.pattern_FieldDefinition_11_2_collecttranslatedelements_greenFBBBBB(
				mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition, tDefinition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDefinitionImpl.pattern_FieldDefinition_11_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, mBodyToTAnnotation, mDefinitionToTDefinition, mSignatureToTFieldSignature,
				mDefinitionToTMember, mDefinition, tFieldSignature, mSignature, tDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mDefinitionToTDefinition] = "
					+ mDefinitionToTDefinition + ", " + "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[tFieldSignature] = " + tFieldSignature + ", " + "[mSignature] = "
					+ mSignature + ", " + "[tDefinition] = " + tDefinition + ".");
		}
		FieldDefinitionImpl.pattern_FieldDefinition_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFF(ruleresult,
				mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition, tFieldSignature,
				mSignature, tDefinition);
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tFieldSignature__tDefinition____definitions = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mDefinitionToTDefinition__mDefinition____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mDefinitionToTDefinition__tDefinition____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[17];

		// 
		// 
		FieldDefinitionImpl.pattern_FieldDefinition_11_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				mBodyToTAnnotation, mDefinitionToTDefinition, mSignatureToTFieldSignature, mDefinitionToTMember,
				mDefinition, tFieldSignature, mSignature, tDefinition);
		return FieldDefinitionImpl.pattern_FieldDefinition_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDefinitionImpl
				.pattern_FieldDefinition_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDefinitionImpl.pattern_FieldDefinition_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TFieldSignature tFieldSignature = (TFieldSignature) result2_binding[0];
		TFieldDefinition tDefinition = (TFieldDefinition) result2_binding[1];
		for (Object[] result2_black : FieldDefinitionImpl
				.pattern_FieldDefinition_12_2_corematch_blackFBFBB(tFieldSignature, tDefinition, match)) {
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[0];
			MFieldSignature mSignature = (MFieldSignature) result2_black[2];
			// ForEach 
			for (Object[] result3_black : FieldDefinitionImpl.pattern_FieldDefinition_12_3_findcontext_blackBBBB(
					mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition)) {
				Object[] result3_green = FieldDefinitionImpl.pattern_FieldDefinition_12_3_findcontext_greenBBBBFFFFF(
						mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge tFieldSignature__tDefinition____definitions = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge tDefinition__tFieldSignature____signature = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mSignatureToTFieldSignature__mSignature____source = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = FieldDefinitionImpl
						.pattern_FieldDefinition_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignatureToTFieldSignature] = "
							+ mSignatureToTFieldSignature + ", " + "[tFieldSignature] = " + tFieldSignature + ", "
							+ "[mSignature] = " + mSignature + ", " + "[tDefinition] = " + tDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDefinitionImpl.pattern_FieldDefinition_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDefinitionImpl
							.pattern_FieldDefinition_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {
		match.registerObject("tFieldSignature", tFieldSignature);
		match.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tFieldSignature_upperBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tFieldSignature.upperBound", true, csp);
		var_tFieldSignature_upperBound.setValue(tFieldSignature.getUpperBound());
		var_tFieldSignature_upperBound.setType("int");
		Variable var_tFieldSignature_lowerBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tFieldSignature.lowerBound", true, csp);
		var_tFieldSignature_lowerBound.setValue(tFieldSignature.getLowerBound());
		var_tFieldSignature_lowerBound.setType("int");

		// Create unbound variables
		Variable var_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("upperBound", csp);
		var_upperBound.setType("int");
		Variable var_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("lowerBound", csp);
		var_lowerBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tFieldSignature_upperBound, var_upperBound);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_tFieldSignature_lowerBound, var_lowerBound);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mSignatureToTFieldSignature, TFieldSignature tFieldSignature,
			MFieldSignature mSignature, TFieldDefinition tDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mBodyToTAnnotation,
			EObject mDefinitionToTDefinition, EObject mSignatureToTFieldSignature, EObject mDefinitionToTMember,
			EObject mDefinition, EObject tFieldSignature, EObject mSignature, EObject tDefinition) {
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mDefinitionToTDefinition", mDefinitionToTDefinition);
		ruleresult.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tFieldSignature", tFieldSignature);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tDefinition").eClass())
				.equals("basic.TFieldDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_945(EMoflonEdge _edge_definitions) {

		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDefinitionImpl.pattern_FieldDefinition_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDefinitionImpl
				.pattern_FieldDefinition_20_2_testcorematchandDECs_blackFFB(_edge_definitions)) {
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[0];
			TFieldDefinition tDefinition = (TFieldDefinition) result2_black[1];
			Object[] result2_green = FieldDefinitionImpl
					.pattern_FieldDefinition_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDefinitionImpl
					.pattern_FieldDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							tFieldSignature, tDefinition)) {
				// 
				if (FieldDefinitionImpl
						.pattern_FieldDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = FieldDefinitionImpl
							.pattern_FieldDefinition_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1039(EMoflonEdge _edge_mDefinitions) {

		Object[] result1_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDefinitionImpl.pattern_FieldDefinition_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDefinitionImpl
				.pattern_FieldDefinition_21_2_testcorematchandDECs_blackFFB(_edge_mDefinitions)) {
			MFieldDefinition mDefinition = (MFieldDefinition) result2_black[0];
			MFieldSignature mSignature = (MFieldSignature) result2_black[1];
			Object[] result2_green = FieldDefinitionImpl
					.pattern_FieldDefinition_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDefinitionImpl
					.pattern_FieldDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							mDefinition, mSignature)) {
				// 
				if (FieldDefinitionImpl
						.pattern_FieldDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = FieldDefinitionImpl
							.pattern_FieldDefinition_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_local0 = CSPFactoryHelper.eINSTANCE.createVariable("local", csp);
		var_local0.setType("int");

		Variable var_tFieldSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tFieldSignature", true,
				csp);
		var_tFieldSignature_upperBound.setValue(__helper.getValue("tFieldSignature", "upperBound"));
		var_tFieldSignature_upperBound.setType("int");

		Variable var_local1 = CSPFactoryHelper.eINSTANCE.createVariable("local", csp);
		var_local1.setType("int");

		Variable var_tFieldSignature_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tFieldSignature", true,
				csp);
		var_tFieldSignature_lowerBound.setValue(__helper.getValue("tFieldSignature", "lowerBound"));
		var_tFieldSignature_lowerBound.setType("int");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("FieldDefinition");
		eq0.solve(var_tFieldSignature_upperBound, var_local0);

		eq1.setRuleName("FieldDefinition");
		eq1.solve(var_tFieldSignature_lowerBound, var_local1);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			eq0.solve(var_tFieldSignature_upperBound, var_local0);
			eq1.solve(var_tFieldSignature_lowerBound, var_local1);
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
		ruleResult.setRule("FieldDefinition");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_local0 = CSPFactoryHelper.eINSTANCE.createVariable("local", csp);
		var_local0.setType("int");

		Variable var_tFieldSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tFieldSignature", true,
				csp);
		var_tFieldSignature_upperBound.setValue(__helper.getValue("tFieldSignature", "upperBound"));
		var_tFieldSignature_upperBound.setType("int");

		Variable var_local1 = CSPFactoryHelper.eINSTANCE.createVariable("local", csp);
		var_local1.setType("int");

		Variable var_tFieldSignature_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("tFieldSignature", true,
				csp);
		var_tFieldSignature_lowerBound.setValue(__helper.getValue("tFieldSignature", "lowerBound"));
		var_tFieldSignature_lowerBound.setType("int");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("FieldDefinition");
		eq0.solve(var_tFieldSignature_upperBound, var_local0);

		eq1.setRuleName("FieldDefinition");
		eq1.solve(var_tFieldSignature_lowerBound, var_local1);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			eq0.solve(var_tFieldSignature_upperBound, var_local0);
			eq1.solve(var_tFieldSignature_lowerBound, var_local1);
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

		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDefinitionImpl.pattern_FieldDefinition_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MFieldDefinition mDefinition = (MFieldDefinition) result2_bindingAndBlack[0];
		TFieldSignature tFieldSignature = (TFieldSignature) result2_bindingAndBlack[1];
		MFieldSignature mSignature = (MFieldSignature) result2_bindingAndBlack[2];
		TFieldDefinition tDefinition = (TFieldDefinition) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = FieldDefinitionImpl
				.pattern_FieldDefinition_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, mDefinition, tFieldSignature,
						mSignature, tDefinition, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tFieldSignature] = " + tFieldSignature + ", "
					+ "[mSignature] = " + mSignature + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldDefinitionImpl.pattern_FieldDefinition_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldDefinitionImpl.pattern_FieldDefinition_24_5_matchcorrcontext_blackFBBBB(
					tFieldSignature, mSignature, sourceMatch, targetMatch)) {
				MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result5_black[0];
				Object[] result5_green = FieldDefinitionImpl.pattern_FieldDefinition_24_5_matchcorrcontext_greenBBBF(
						mSignatureToTFieldSignature, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = FieldDefinitionImpl
						.pattern_FieldDefinition_24_6_createcorrespondence_blackBBBBB(mDefinition, tFieldSignature,
								mSignature, tDefinition, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[mDefinition] = " + mDefinition + ", "
									+ "[tFieldSignature] = " + tFieldSignature + ", " + "[mSignature] = " + mSignature
									+ ", " + "[tDefinition] = " + tDefinition + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldDefinitionImpl.pattern_FieldDefinition_24_6_createcorrespondence_greenFFFBBB(mDefinition,
						tDefinition, ccMatch);
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[0];
				//nothing MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
				//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[2];

				Object[] result7_black = FieldDefinitionImpl
						.pattern_FieldDefinition_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldDefinitionImpl.pattern_FieldDefinition_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return FieldDefinitionImpl.pattern_FieldDefinition_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MFieldDefinition mDefinition, TFieldSignature tFieldSignature,
			MFieldSignature mSignature, TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tFieldSignature_upperBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tFieldSignature.upperBound", true, csp);
		var_tFieldSignature_upperBound.setValue(tFieldSignature.getUpperBound());
		var_tFieldSignature_upperBound.setType("int");
		Variable var_tFieldSignature_lowerBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tFieldSignature.lowerBound", true, csp);
		var_tFieldSignature_lowerBound.setValue(tFieldSignature.getLowerBound());
		var_tFieldSignature_lowerBound.setType("int");

		// Create unbound variables
		Variable var_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("upperBound", csp);
		var_upperBound.setType("int");
		Variable var_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("lowerBound", csp);
		var_lowerBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tFieldSignature_upperBound, var_upperBound);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_tFieldSignature_lowerBound, var_lowerBound);
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
	public boolean checkDEC_FWD(MFieldDefinition mDefinition, MFieldSignature mSignature) {// 
		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_27_1_matchtggpattern_blackBB(mDefinition,
				mSignature);
		if (result1_black != null) {
			return FieldDefinitionImpl.pattern_FieldDefinition_27_2_expressionF();
		} else {
			return FieldDefinitionImpl.pattern_FieldDefinition_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {// 
		Object[] result1_black = FieldDefinitionImpl
				.pattern_FieldDefinition_28_1_matchtggpattern_blackBB(tFieldSignature, tDefinition);
		if (result1_black != null) {
			return FieldDefinitionImpl.pattern_FieldDefinition_28_2_expressionF();
		} else {
			return FieldDefinitionImpl.pattern_FieldDefinition_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MSignatureToTSignature mSignatureToTFieldSignatureParameter) {

		Object[] result1_black = FieldDefinitionImpl.pattern_FieldDefinition_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDefinitionImpl.pattern_FieldDefinition_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : FieldDefinitionImpl
				.pattern_FieldDefinition_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mSignatureToTFieldSignatureList = (RuleEntryList) result2_black[0];
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result2_black[1];
			TFieldSignature tFieldSignature = (TFieldSignature) result2_black[2];
			MFieldSignature mSignature = (MFieldSignature) result2_black[3];

			Object[] result3_bindingAndBlack = FieldDefinitionImpl
					.pattern_FieldDefinition_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mSignatureToTFieldSignature, tFieldSignature, mSignature, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignatureToTFieldSignature] = "
						+ mSignatureToTFieldSignature + ", " + "[tFieldSignature] = " + tFieldSignature + ", "
						+ "[mSignature] = " + mSignature + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldDefinitionImpl.pattern_FieldDefinition_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = FieldDefinitionImpl.pattern_FieldDefinition_29_5_checknacs_blackBBB(
						mSignatureToTFieldSignature, tFieldSignature, mSignature);
				if (result5_black != null) {

					Object[] result6_black = FieldDefinitionImpl.pattern_FieldDefinition_29_6_perform_blackBBBB(
							mSignatureToTFieldSignature, tFieldSignature, mSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mSignatureToTFieldSignature] = " + mSignatureToTFieldSignature + ", "
								+ "[tFieldSignature] = " + tFieldSignature + ", " + "[mSignature] = " + mSignature
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldDefinitionImpl.pattern_FieldDefinition_29_6_perform_greenFFFFBBFB(tFieldSignature, mSignature,
							ruleResult);
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[0];
					//nothing MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[2];
					//nothing MFieldDefinition mDefinition = (MFieldDefinition) result6_green[3];
					//nothing TFieldDefinition tDefinition = (TFieldDefinition) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return FieldDefinitionImpl.pattern_FieldDefinition_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mSignatureToTFieldSignature, TFieldSignature tFieldSignature,
			MFieldSignature mSignature, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tFieldSignature_upperBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tFieldSignature.upperBound", true, csp);
		var_tFieldSignature_upperBound.setValue(tFieldSignature.getUpperBound());
		var_tFieldSignature_upperBound.setType("int");
		Variable var_tFieldSignature_lowerBound = CSPFactoryHelper.eINSTANCE
				.createVariable("tFieldSignature.lowerBound", true, csp);
		var_tFieldSignature_lowerBound.setValue(tFieldSignature.getLowerBound());
		var_tFieldSignature_lowerBound.setType("int");

		// Create unbound variables
		Variable var_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("upperBound", csp);
		var_upperBound.setType("int");
		Variable var_lowerBound = CSPFactoryHelper.eINSTANCE.createVariable("lowerBound", csp);
		var_lowerBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tFieldSignature_upperBound, var_upperBound);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_tFieldSignature_lowerBound, var_lowerBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignatureToTFieldSignature", mSignatureToTFieldSignature);
		isApplicableMatch.registerObject("tFieldSignature", tFieldSignature);
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
			case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_FWD__MATCH_MFIELDDEFINITION_MFIELDSIGNATURE:
				return isAppropriate_FWD((Match) arguments.get(0), (MFieldDefinition) arguments.get(1),
						(MFieldSignature) arguments.get(2));
			case RulesPackage.FIELD_DEFINITION___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFIELDDEFINITION_MFIELDSIGNATURE:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MFieldDefinition) arguments.get(1),
						(MFieldSignature) arguments.get(2));
				return null;
			case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFIELDDEFINITION_MFIELDSIGNATURE:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFieldDefinition) arguments.get(1),
						(MFieldSignature) arguments.get(2));
			case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MSIGNATURETOTSIGNATURE_MFIELDDEFINITION_TFIELDSIGNATURE_MFIELDSIGNATURE:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(MSignatureToTSignature) arguments.get(1), (MFieldDefinition) arguments.get(2),
						(TFieldSignature) arguments.get(3), (MFieldSignature) arguments.get(4));
			case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8));
				return null;
			case RulesPackage.FIELD_DEFINITION___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_BWD__MATCH_TFIELDSIGNATURE_TFIELDDEFINITION:
				return isAppropriate_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
						(TFieldDefinition) arguments.get(2));
			case RulesPackage.FIELD_DEFINITION___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELDSIGNATURE_TFIELDDEFINITION:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
						(TFieldDefinition) arguments.get(2));
				return null;
			case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELDSIGNATURE_TFIELDDEFINITION:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
						(TFieldDefinition) arguments.get(2));
			case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MSIGNATURETOTSIGNATURE_TFIELDSIGNATURE_MFIELDSIGNATURE_TFIELDDEFINITION:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MSignatureToTSignature) arguments.get(1), (TFieldSignature) arguments.get(2),
						(MFieldSignature) arguments.get(3), (TFieldDefinition) arguments.get(4));
			case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8));
				return null;
			case RulesPackage.FIELD_DEFINITION___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_945__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_945((EMoflonEdge) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1039__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1039((EMoflonEdge) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_SOLVE_CSP_CC__MFIELDDEFINITION_TFIELDSIGNATURE_MFIELDSIGNATURE_TFIELDDEFINITION_MATCH_MATCH:
				return isApplicable_solveCsp_CC((MFieldDefinition) arguments.get(0), (TFieldSignature) arguments.get(1),
						(MFieldSignature) arguments.get(2), (TFieldDefinition) arguments.get(3),
						(Match) arguments.get(4), (Match) arguments.get(5));
			case RulesPackage.FIELD_DEFINITION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.FIELD_DEFINITION___CHECK_DEC_FWD__MFIELDDEFINITION_MFIELDSIGNATURE:
				return checkDEC_FWD((MFieldDefinition) arguments.get(0), (MFieldSignature) arguments.get(1));
			case RulesPackage.FIELD_DEFINITION___CHECK_DEC_BWD__TFIELDSIGNATURE_TFIELDDEFINITION:
				return checkDEC_BWD((TFieldSignature) arguments.get(0), (TFieldDefinition) arguments.get(1));
			case RulesPackage.FIELD_DEFINITION___GENERATE_MODEL__RULEENTRYCONTAINER_MSIGNATURETOTSIGNATURE:
				return generateModel((RuleEntryContainer) arguments.get(0), (MSignatureToTSignature) arguments.get(1));
			case RulesPackage.FIELD_DEFINITION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MSIGNATURETOTSIGNATURE_TFIELDSIGNATURE_MFIELDSIGNATURE_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MSignatureToTSignature) arguments.get(1), (TFieldSignature) arguments.get(2),
						(MFieldSignature) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
			case RulesPackage.FIELD_DEFINITION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldDefinition_0_1_initialbindings_blackBBBB(FieldDefinition _this,
			Match match, MFieldDefinition mDefinition, MFieldSignature mSignature) {
		return new Object[] { _this, match, mDefinition, mSignature };
	}

	public static final Object[] pattern_FieldDefinition_0_2_SolveCSP_bindingFBBBB(FieldDefinition _this, Match match,
			MFieldDefinition mDefinition, MFieldSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_0_2_SolveCSP_bindingAndBlackFBBBB(FieldDefinition _this,
			Match match, MFieldDefinition mDefinition, MFieldSignature mSignature) {
		Object[] result_pattern_FieldDefinition_0_2_SolveCSP_binding = pattern_FieldDefinition_0_2_SolveCSP_bindingFBBBB(
				_this, match, mDefinition, mSignature);
		if (result_pattern_FieldDefinition_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_0_2_SolveCSP_black = pattern_FieldDefinition_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_0_3_CheckCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_0_4_collectelementstobetranslated_blackBBB(Match match,
			MFieldDefinition mDefinition, MFieldSignature mSignature) {
		return new Object[] { match, mDefinition, mSignature };
	}

	public static final Object[] pattern_FieldDefinition_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MFieldDefinition mDefinition, MFieldSignature mSignature) {
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

	public static final Object[] pattern_FieldDefinition_0_5_collectcontextelements_blackBBB(Match match,
			MFieldDefinition mDefinition, MFieldSignature mSignature) {
		return new Object[] { match, mDefinition, mSignature };
	}

	public static final Object[] pattern_FieldDefinition_0_5_collectcontextelements_greenBB(Match match,
			MFieldSignature mSignature) {
		match.getContextNodes().add(mSignature);
		return new Object[] { match, mSignature };
	}

	public static final void pattern_FieldDefinition_0_6_registerobjectstomatch_expressionBBBB(FieldDefinition _this,
			Match match, MFieldDefinition mDefinition, MFieldSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mSignature);

	}

	public static final boolean pattern_FieldDefinition_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignatureToTFieldSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_2 = isApplicableMatch.getObject("tFieldSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSignature");
		EObject tmpMSignatureToTFieldSignature = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpTFieldSignature = _localVariable_2;
		EObject tmpMSignature = _localVariable_3;
		if (tmpMSignatureToTFieldSignature instanceof MSignatureToTSignature) {
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) tmpMSignatureToTFieldSignature;
			if (tmpMDefinition instanceof MFieldDefinition) {
				MFieldDefinition mDefinition = (MFieldDefinition) tmpMDefinition;
				if (tmpTFieldSignature instanceof TFieldSignature) {
					TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
					if (tmpMSignature instanceof MFieldSignature) {
						MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
						return new Object[] { mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_1_1_performtransformation_blackBBBBFBB(
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldDefinition mDefinition,
			TFieldSignature tFieldSignature, MFieldSignature mSignature, FieldDefinition _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_1_1_performtransformation_bindingAndBlackFFFFFBB(
			FieldDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDefinition_1_1_performtransformation_binding = pattern_FieldDefinition_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDefinition_1_1_performtransformation_binding != null) {
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result_pattern_FieldDefinition_1_1_performtransformation_binding[0];
			MFieldDefinition mDefinition = (MFieldDefinition) result_pattern_FieldDefinition_1_1_performtransformation_binding[1];
			TFieldSignature tFieldSignature = (TFieldSignature) result_pattern_FieldDefinition_1_1_performtransformation_binding[2];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldDefinition_1_1_performtransformation_binding[3];

			Object[] result_pattern_FieldDefinition_1_1_performtransformation_black = pattern_FieldDefinition_1_1_performtransformation_blackBBBBFBB(
					mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature, _this, isApplicableMatch);
			if (result_pattern_FieldDefinition_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDefinition_1_1_performtransformation_black[4];

				return new Object[] { mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_1_1_performtransformation_greenFFFBBF(
			MFieldDefinition mDefinition, TFieldSignature tFieldSignature) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		mBodyToTAnnotation.setSource(mDefinition);
		mDefinitionToTDefinition.setSource(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		tFieldSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTDefinition.setTarget(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		return new Object[] { mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition,
				tFieldSignature, tDefinition };
	}

	public static final Object[] pattern_FieldDefinition_1_2_collecttranslatedelements_blackBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition,
			MDefinitionToTMember mDefinitionToTMember, MFieldDefinition mDefinition, TFieldDefinition tDefinition) {
		return new Object[] { mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition,
				tDefinition };
	}

	public static final Object[] pattern_FieldDefinition_1_2_collecttranslatedelements_greenFBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition,
			MDefinitionToTMember mDefinitionToTMember, MFieldDefinition mDefinition, TFieldDefinition tDefinition) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTDefinition);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getTranslatedElements().add(mDefinition);
		ruleresult.getCreatedElements().add(tDefinition);
		return new Object[] { ruleresult, mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember,
				mDefinition, tDefinition };
	}

	public static final Object[] pattern_FieldDefinition_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject mDefinitionToTDefinition,
			EObject mSignatureToTFieldSignature, EObject mDefinitionToTMember, EObject mDefinition,
			EObject tFieldSignature, EObject mSignature, EObject tDefinition) {
		if (!mBodyToTAnnotation.equals(mDefinitionToTDefinition)) {
			if (!mBodyToTAnnotation.equals(mSignatureToTFieldSignature)) {
				if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
					if (!mBodyToTAnnotation.equals(mDefinition)) {
						if (!mBodyToTAnnotation.equals(tFieldSignature)) {
							if (!mBodyToTAnnotation.equals(mSignature)) {
								if (!mBodyToTAnnotation.equals(tDefinition)) {
									if (!mDefinitionToTDefinition.equals(mSignatureToTFieldSignature)) {
										if (!mDefinitionToTDefinition.equals(mDefinitionToTMember)) {
											if (!mDefinitionToTDefinition.equals(tFieldSignature)) {
												if (!mDefinitionToTDefinition.equals(mSignature)) {
													if (!mDefinitionToTDefinition.equals(tDefinition)) {
														if (!mSignatureToTFieldSignature.equals(tFieldSignature)) {
															if (!mSignatureToTFieldSignature.equals(tDefinition)) {
																if (!mDefinitionToTMember
																		.equals(mSignatureToTFieldSignature)) {
																	if (!mDefinitionToTMember.equals(tFieldSignature)) {
																		if (!mDefinitionToTMember.equals(mSignature)) {
																			if (!mDefinitionToTMember
																					.equals(tDefinition)) {
																				if (!mDefinition.equals(
																						mDefinitionToTDefinition)) {
																					if (!mDefinition.equals(
																							mSignatureToTFieldSignature)) {
																						if (!mDefinition.equals(
																								mDefinitionToTMember)) {
																							if (!mDefinition.equals(
																									tFieldSignature)) {
																								if (!mDefinition.equals(
																										mSignature)) {
																									if (!mDefinition
																											.equals(tDefinition)) {
																										if (!mSignature
																												.equals(mSignatureToTFieldSignature)) {
																											if (!mSignature
																													.equals(tFieldSignature)) {
																												if (!mSignature
																														.equals(tDefinition)) {
																													if (!tDefinition
																															.equals(tFieldSignature)) {
																														return new Object[] {
																																ruleresult,
																																mBodyToTAnnotation,
																																mDefinitionToTDefinition,
																																mSignatureToTFieldSignature,
																																mDefinitionToTMember,
																																mDefinition,
																																tFieldSignature,
																																mSignature,
																																tDefinition };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldDefinition_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject mDefinitionToTDefinition,
			EObject mDefinitionToTMember, EObject mDefinition, EObject tFieldSignature, EObject mSignature,
			EObject tDefinition) {
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tFieldSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDefinition";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String tFieldSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tFieldSignature____signature_name_prime = "signature";
		String mDefinitionToTDefinition__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mDefinitionToTDefinition__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		tFieldSignature__tDefinition____definitions.setSrc(tFieldSignature);
		tFieldSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tFieldSignature__tDefinition____definitions);
		tDefinition__tFieldSignature____signature.setSrc(tDefinition);
		tDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getCreatedEdges().add(tDefinition__tFieldSignature____signature);
		mDefinitionToTDefinition__mDefinition____source.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTDefinition__mDefinition____source);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mDefinitionToTDefinition__tDefinition____target.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTDefinition__tDefinition____target);
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
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		tFieldSignature__tDefinition____definitions.setName(tFieldSignature__tDefinition____definitions_name_prime);
		tDefinition__tFieldSignature____signature.setName(tDefinition__tFieldSignature____signature_name_prime);
		mDefinitionToTDefinition__mDefinition____source
				.setName(mDefinitionToTDefinition__mDefinition____source_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mDefinitionToTDefinition__tDefinition____target
				.setName(mDefinitionToTDefinition__tDefinition____target_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { ruleresult, mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember,
				mDefinition, tFieldSignature, mSignature, tDefinition, mBodyToTAnnotation__mDefinition____source,
				mDefinitionToTMember__mDefinition____source, tFieldSignature__tDefinition____definitions,
				tDefinition__tFieldSignature____signature, mDefinitionToTDefinition__mDefinition____source,
				mDefinitionToTMember__tDefinition____target, mDefinitionToTDefinition__tDefinition____target,
				mBodyToTAnnotation__tDefinition____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final void pattern_FieldDefinition_1_5_registerobjects_expressionBBBBBBBBBB(FieldDefinition _this,
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject mDefinitionToTDefinition,
			EObject mSignatureToTFieldSignature, EObject mDefinitionToTMember, EObject mDefinition,
			EObject tFieldSignature, EObject mSignature, EObject tDefinition) {
		_this.registerObjects_FWD(ruleresult, mBodyToTAnnotation, mDefinitionToTDefinition, mSignatureToTFieldSignature,
				mDefinitionToTMember, mDefinition, tFieldSignature, mSignature, tDefinition);

	}

	public static final PerformRuleResult pattern_FieldDefinition_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_2_1_preparereturnvalue_bindingFB(FieldDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDefinition _this) {
		Object[] result_pattern_FieldDefinition_2_1_preparereturnvalue_binding = pattern_FieldDefinition_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDefinition_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDefinition_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDefinition_2_1_preparereturnvalue_black = pattern_FieldDefinition_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDefinition_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDefinition_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDefinition_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("mSignature");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		if (tmpMDefinition instanceof MFieldDefinition) {
			MFieldDefinition mDefinition = (MFieldDefinition) tmpMDefinition;
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				return new Object[] { mDefinition, mSignature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_2_2_corematch_blackFBFBB(
			MFieldDefinition mDefinition, MFieldSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
			TSignature tmpTFieldSignature = mSignatureToTFieldSignature.getTarget();
			if (tmpTFieldSignature instanceof TFieldSignature) {
				TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
				_result.add(
						new Object[] { mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_2_3_findcontext_blackBBBB(
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldDefinition mDefinition,
			TFieldSignature tFieldSignature, MFieldSignature mSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tFieldSignature.equals(mSignatureToTFieldSignature.getTarget())) {
			if (mSignature.equals(mSignatureToTFieldSignature.getSource())) {
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					_result.add(new Object[] { mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_2_3_findcontext_greenBBBBFFFFF(
			MSignatureToTSignature mSignatureToTFieldSignature, MFieldDefinition mDefinition,
			TFieldSignature tFieldSignature, MFieldSignature mSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSignatureToTFieldSignature__tFieldSignature____target_name_prime = "target";
		String mSignatureToTFieldSignature__mSignature____source_name_prime = "source";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignature);
		mSignatureToTFieldSignature__tFieldSignature____target.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__tFieldSignature____target.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__tFieldSignature____target);
		mSignatureToTFieldSignature__mSignature____source.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__mSignature____source);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mSignatureToTFieldSignature__tFieldSignature____target
				.setName(mSignatureToTFieldSignature__tFieldSignature____target_name_prime);
		mSignatureToTFieldSignature__mSignature____source
				.setName(mSignatureToTFieldSignature__mSignature____source_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature, isApplicableMatch,
				mSignatureToTFieldSignature__tFieldSignature____target,
				mSignatureToTFieldSignature__mSignature____source, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final Object[] pattern_FieldDefinition_2_4_solveCSP_bindingFBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldDefinition mDefinition, TFieldSignature tFieldSignature, MFieldSignature mSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSignatureToTFieldSignature,
				mDefinition, tFieldSignature, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignatureToTFieldSignature, mDefinition,
					tFieldSignature, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_2_4_solveCSP_bindingAndBlackFBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MSignatureToTSignature mSignatureToTFieldSignature,
			MFieldDefinition mDefinition, TFieldSignature tFieldSignature, MFieldSignature mSignature) {
		Object[] result_pattern_FieldDefinition_2_4_solveCSP_binding = pattern_FieldDefinition_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mSignatureToTFieldSignature, mDefinition, tFieldSignature, mSignature);
		if (result_pattern_FieldDefinition_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_2_4_solveCSP_black = pattern_FieldDefinition_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignatureToTFieldSignature, mDefinition,
						tFieldSignature, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_2_5_checkCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDefinition_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDefinition_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_10_1_initialbindings_blackBBBB(FieldDefinition _this,
			Match match, TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {
		return new Object[] { _this, match, tFieldSignature, tDefinition };
	}

	public static final Object[] pattern_FieldDefinition_10_2_SolveCSP_bindingFBBBB(FieldDefinition _this, Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tFieldSignature, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tFieldSignature, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_10_2_SolveCSP_bindingAndBlackFBBBB(FieldDefinition _this,
			Match match, TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {
		Object[] result_pattern_FieldDefinition_10_2_SolveCSP_binding = pattern_FieldDefinition_10_2_SolveCSP_bindingFBBBB(
				_this, match, tFieldSignature, tDefinition);
		if (result_pattern_FieldDefinition_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_10_2_SolveCSP_black = pattern_FieldDefinition_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tFieldSignature, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_10_3_CheckCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_10_4_collectelementstobetranslated_blackBBB(Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {
		return new Object[] { match, tFieldSignature, tDefinition };
	}

	public static final Object[] pattern_FieldDefinition_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {
		EMoflonEdge tFieldSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tFieldSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tDefinition);
		String tFieldSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tFieldSignature____signature_name_prime = "signature";
		tFieldSignature__tDefinition____definitions.setSrc(tFieldSignature);
		tFieldSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tFieldSignature__tDefinition____definitions);
		tDefinition__tFieldSignature____signature.setSrc(tDefinition);
		tDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		match.getToBeTranslatedEdges().add(tDefinition__tFieldSignature____signature);
		tFieldSignature__tDefinition____definitions.setName(tFieldSignature__tDefinition____definitions_name_prime);
		tDefinition__tFieldSignature____signature.setName(tDefinition__tFieldSignature____signature_name_prime);
		return new Object[] { match, tFieldSignature, tDefinition, tFieldSignature__tDefinition____definitions,
				tDefinition__tFieldSignature____signature };
	}

	public static final Object[] pattern_FieldDefinition_10_5_collectcontextelements_blackBBB(Match match,
			TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {
		return new Object[] { match, tFieldSignature, tDefinition };
	}

	public static final Object[] pattern_FieldDefinition_10_5_collectcontextelements_greenBB(Match match,
			TFieldSignature tFieldSignature) {
		match.getContextNodes().add(tFieldSignature);
		return new Object[] { match, tFieldSignature };
	}

	public static final void pattern_FieldDefinition_10_6_registerobjectstomatch_expressionBBBB(FieldDefinition _this,
			Match match, TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tFieldSignature, tDefinition);

	}

	public static final boolean pattern_FieldDefinition_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignatureToTFieldSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tFieldSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_3 = isApplicableMatch.getObject("tDefinition");
		EObject tmpMSignatureToTFieldSignature = _localVariable_0;
		EObject tmpTFieldSignature = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		if (tmpMSignatureToTFieldSignature instanceof MSignatureToTSignature) {
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) tmpMSignatureToTFieldSignature;
			if (tmpTFieldSignature instanceof TFieldSignature) {
				TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
				if (tmpMSignature instanceof MFieldSignature) {
					MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
					if (tmpTDefinition instanceof TFieldDefinition) {
						TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
						return new Object[] { mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_11_1_performtransformation_blackBBBBFBB(
			MSignatureToTSignature mSignatureToTFieldSignature, TFieldSignature tFieldSignature,
			MFieldSignature mSignature, TFieldDefinition tDefinition, FieldDefinition _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_11_1_performtransformation_bindingAndBlackFFFFFBB(
			FieldDefinition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDefinition_11_1_performtransformation_binding = pattern_FieldDefinition_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDefinition_11_1_performtransformation_binding != null) {
			MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) result_pattern_FieldDefinition_11_1_performtransformation_binding[0];
			TFieldSignature tFieldSignature = (TFieldSignature) result_pattern_FieldDefinition_11_1_performtransformation_binding[1];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldDefinition_11_1_performtransformation_binding[2];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_FieldDefinition_11_1_performtransformation_binding[3];

			Object[] result_pattern_FieldDefinition_11_1_performtransformation_black = pattern_FieldDefinition_11_1_performtransformation_blackBBBBFBB(
					mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition, _this, isApplicableMatch);
			if (result_pattern_FieldDefinition_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDefinition_11_1_performtransformation_black[4];

				return new Object[] { mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_11_1_performtransformation_greenFFFFBB(
			MFieldSignature mSignature, TFieldDefinition tDefinition) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MFieldDefinition mDefinition = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		mBodyToTAnnotation.setTarget(tDefinition);
		mDefinitionToTDefinition.setTarget(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTDefinition.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		return new Object[] { mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition,
				mSignature, tDefinition };
	}

	public static final Object[] pattern_FieldDefinition_11_2_collecttranslatedelements_blackBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition,
			MDefinitionToTMember mDefinitionToTMember, MFieldDefinition mDefinition, TFieldDefinition tDefinition) {
		return new Object[] { mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition,
				tDefinition };
	}

	public static final Object[] pattern_FieldDefinition_11_2_collecttranslatedelements_greenFBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation,
			MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition,
			MDefinitionToTMember mDefinitionToTMember, MFieldDefinition mDefinition, TFieldDefinition tDefinition) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTDefinition);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedElements().add(mDefinition);
		ruleresult.getTranslatedElements().add(tDefinition);
		return new Object[] { ruleresult, mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember,
				mDefinition, tDefinition };
	}

	public static final Object[] pattern_FieldDefinition_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject mDefinitionToTDefinition,
			EObject mSignatureToTFieldSignature, EObject mDefinitionToTMember, EObject mDefinition,
			EObject tFieldSignature, EObject mSignature, EObject tDefinition) {
		if (!mBodyToTAnnotation.equals(mDefinitionToTDefinition)) {
			if (!mBodyToTAnnotation.equals(mSignatureToTFieldSignature)) {
				if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
					if (!mBodyToTAnnotation.equals(mDefinition)) {
						if (!mBodyToTAnnotation.equals(tFieldSignature)) {
							if (!mBodyToTAnnotation.equals(mSignature)) {
								if (!mBodyToTAnnotation.equals(tDefinition)) {
									if (!mDefinitionToTDefinition.equals(mSignatureToTFieldSignature)) {
										if (!mDefinitionToTDefinition.equals(mDefinitionToTMember)) {
											if (!mDefinitionToTDefinition.equals(tFieldSignature)) {
												if (!mDefinitionToTDefinition.equals(mSignature)) {
													if (!mDefinitionToTDefinition.equals(tDefinition)) {
														if (!mSignatureToTFieldSignature.equals(tFieldSignature)) {
															if (!mSignatureToTFieldSignature.equals(tDefinition)) {
																if (!mDefinitionToTMember
																		.equals(mSignatureToTFieldSignature)) {
																	if (!mDefinitionToTMember.equals(tFieldSignature)) {
																		if (!mDefinitionToTMember.equals(mSignature)) {
																			if (!mDefinitionToTMember
																					.equals(tDefinition)) {
																				if (!mDefinition.equals(
																						mDefinitionToTDefinition)) {
																					if (!mDefinition.equals(
																							mSignatureToTFieldSignature)) {
																						if (!mDefinition.equals(
																								mDefinitionToTMember)) {
																							if (!mDefinition.equals(
																									tFieldSignature)) {
																								if (!mDefinition.equals(
																										mSignature)) {
																									if (!mDefinition
																											.equals(tDefinition)) {
																										if (!mSignature
																												.equals(mSignatureToTFieldSignature)) {
																											if (!mSignature
																													.equals(tFieldSignature)) {
																												if (!mSignature
																														.equals(tDefinition)) {
																													if (!tDefinition
																															.equals(tFieldSignature)) {
																														return new Object[] {
																																ruleresult,
																																mBodyToTAnnotation,
																																mDefinitionToTDefinition,
																																mSignatureToTFieldSignature,
																																mDefinitionToTMember,
																																mDefinition,
																																tFieldSignature,
																																mSignature,
																																tDefinition };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldDefinition_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject mDefinitionToTDefinition,
			EObject mDefinitionToTMember, EObject mDefinition, EObject tFieldSignature, EObject mSignature,
			EObject tDefinition) {
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFieldSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tFieldSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTDefinition__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDefinition";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String tFieldSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tFieldSignature____signature_name_prime = "signature";
		String mDefinitionToTDefinition__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mDefinitionToTDefinition__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		tFieldSignature__tDefinition____definitions.setSrc(tFieldSignature);
		tFieldSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tFieldSignature__tDefinition____definitions);
		tDefinition__tFieldSignature____signature.setSrc(tDefinition);
		tDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		ruleresult.getTranslatedEdges().add(tDefinition__tFieldSignature____signature);
		mDefinitionToTDefinition__mDefinition____source.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTDefinition__mDefinition____source);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mDefinitionToTDefinition__tDefinition____target.setSrc(mDefinitionToTDefinition);
		mDefinitionToTDefinition__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTDefinition__tDefinition____target);
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
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		tFieldSignature__tDefinition____definitions.setName(tFieldSignature__tDefinition____definitions_name_prime);
		tDefinition__tFieldSignature____signature.setName(tDefinition__tFieldSignature____signature_name_prime);
		mDefinitionToTDefinition__mDefinition____source
				.setName(mDefinitionToTDefinition__mDefinition____source_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mDefinitionToTDefinition__tDefinition____target
				.setName(mDefinitionToTDefinition__tDefinition____target_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { ruleresult, mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember,
				mDefinition, tFieldSignature, mSignature, tDefinition, mBodyToTAnnotation__mDefinition____source,
				mDefinitionToTMember__mDefinition____source, tFieldSignature__tDefinition____definitions,
				tDefinition__tFieldSignature____signature, mDefinitionToTDefinition__mDefinition____source,
				mDefinitionToTMember__tDefinition____target, mDefinitionToTDefinition__tDefinition____target,
				mBodyToTAnnotation__tDefinition____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final void pattern_FieldDefinition_11_5_registerobjects_expressionBBBBBBBBBB(FieldDefinition _this,
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject mDefinitionToTDefinition,
			EObject mSignatureToTFieldSignature, EObject mDefinitionToTMember, EObject mDefinition,
			EObject tFieldSignature, EObject mSignature, EObject tDefinition) {
		_this.registerObjects_BWD(ruleresult, mBodyToTAnnotation, mDefinitionToTDefinition, mSignatureToTFieldSignature,
				mDefinitionToTMember, mDefinition, tFieldSignature, mSignature, tDefinition);

	}

	public static final PerformRuleResult pattern_FieldDefinition_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_12_1_preparereturnvalue_bindingFB(FieldDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDefinition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDefinition _this) {
		Object[] result_pattern_FieldDefinition_12_1_preparereturnvalue_binding = pattern_FieldDefinition_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDefinition_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDefinition_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDefinition_12_1_preparereturnvalue_black = pattern_FieldDefinition_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDefinition_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDefinition_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDefinition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDefinition_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tFieldSignature");
		EObject _localVariable_1 = match.getObject("tDefinition");
		EObject tmpTFieldSignature = _localVariable_0;
		EObject tmpTDefinition = _localVariable_1;
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			if (tmpTDefinition instanceof TFieldDefinition) {
				TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
				return new Object[] { tFieldSignature, tDefinition, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_12_2_corematch_blackFBFBB(
			TFieldSignature tFieldSignature, TFieldDefinition tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tFieldSignature, MSignatureToTSignature.class, "target")) {
			MSignature tmpMSignature = mSignatureToTFieldSignature.getSource();
			if (tmpMSignature instanceof MFieldSignature) {
				MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
				_result.add(
						new Object[] { mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_12_3_findcontext_blackBBBB(
			MSignatureToTSignature mSignatureToTFieldSignature, TFieldSignature tFieldSignature,
			MFieldSignature mSignature, TFieldDefinition tDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tFieldSignature.getDefinitions().contains(tDefinition)) {
			if (tFieldSignature.equals(mSignatureToTFieldSignature.getTarget())) {
				if (mSignature.equals(mSignatureToTFieldSignature.getSource())) {
					_result.add(new Object[] { mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_12_3_findcontext_greenBBBBFFFFF(
			MSignatureToTSignature mSignatureToTFieldSignature, TFieldSignature tFieldSignature,
			MFieldSignature mSignature, TFieldDefinition tDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tFieldSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tFieldSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__tFieldSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignatureToTFieldSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tFieldSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tFieldSignature____signature_name_prime = "signature";
		String mSignatureToTFieldSignature__tFieldSignature____target_name_prime = "target";
		String mSignatureToTFieldSignature__mSignature____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature);
		isApplicableMatch.getAllContextElements().add(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		tFieldSignature__tDefinition____definitions.setSrc(tFieldSignature);
		tFieldSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tFieldSignature__tDefinition____definitions);
		tDefinition__tFieldSignature____signature.setSrc(tDefinition);
		tDefinition__tFieldSignature____signature.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tFieldSignature____signature);
		mSignatureToTFieldSignature__tFieldSignature____target.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__tFieldSignature____target.setTrg(tFieldSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__tFieldSignature____target);
		mSignatureToTFieldSignature__mSignature____source.setSrc(mSignatureToTFieldSignature);
		mSignatureToTFieldSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTFieldSignature__mSignature____source);
		tFieldSignature__tDefinition____definitions.setName(tFieldSignature__tDefinition____definitions_name_prime);
		tDefinition__tFieldSignature____signature.setName(tDefinition__tFieldSignature____signature_name_prime);
		mSignatureToTFieldSignature__tFieldSignature____target
				.setName(mSignatureToTFieldSignature__tFieldSignature____target_name_prime);
		mSignatureToTFieldSignature__mSignature____source
				.setName(mSignatureToTFieldSignature__mSignature____source_name_prime);
		return new Object[] { mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition, isApplicableMatch,
				tFieldSignature__tDefinition____definitions, tDefinition__tFieldSignature____signature,
				mSignatureToTFieldSignature__tFieldSignature____target,
				mSignatureToTFieldSignature__mSignature____source };
	}

	public static final Object[] pattern_FieldDefinition_12_4_solveCSP_bindingFBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MSignatureToTSignature mSignatureToTFieldSignature,
			TFieldSignature tFieldSignature, MFieldSignature mSignature, TFieldDefinition tDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mSignatureToTFieldSignature,
				tFieldSignature, mSignature, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignatureToTFieldSignature, tFieldSignature,
					mSignature, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_12_4_solveCSP_bindingAndBlackFBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MSignatureToTSignature mSignatureToTFieldSignature,
			TFieldSignature tFieldSignature, MFieldSignature mSignature, TFieldDefinition tDefinition) {
		Object[] result_pattern_FieldDefinition_12_4_solveCSP_binding = pattern_FieldDefinition_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mSignatureToTFieldSignature, tFieldSignature, mSignature, tDefinition);
		if (result_pattern_FieldDefinition_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_12_4_solveCSP_black = pattern_FieldDefinition_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignatureToTFieldSignature, tFieldSignature,
						mSignature, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_12_5_checkCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDefinition_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDefinition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDefinition_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_20_1_preparereturnvalue_bindingFB(FieldDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDefinition _this) {
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

	public static final Object[] pattern_FieldDefinition_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDefinition _this) {
		Object[] result_pattern_FieldDefinition_20_1_preparereturnvalue_binding = pattern_FieldDefinition_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDefinition_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDefinition_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDefinition_20_1_preparereturnvalue_black = pattern_FieldDefinition_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDefinition_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDefinition_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDefinition_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldDefinition_20_2_testcorematchandDECs_black_nac_0BB(
			TFieldDefinition tDefinition, TFieldSignature tFieldSignature) {
		TSignature __DEC_tDefinition_signature_630299 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_630299 != null) {
			if (!tFieldSignature.equals(__DEC_tDefinition_signature_630299)) {
				return new Object[] { tDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldDefinition_20_2_testcorematchandDECs_black_nac_1B(
			TFieldDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_666899 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_666899 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_FieldDefinition_20_2_testcorematchandDECs_black_nac_2BB(
			TFieldDefinition tDefinition, TFieldSignature tFieldSignature) {
		TSignature __DEC_tDefinition_definitions_174586 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_174586 != null) {
			if (!tFieldSignature.equals(__DEC_tDefinition_definitions_174586)) {
				return new Object[] { tDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTFieldSignature = _edge_definitions.getSrc();
		if (tmpTFieldSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
			EObject tmpTDefinition = _edge_definitions.getTrg();
			if (tmpTDefinition instanceof TFieldDefinition) {
				TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
				if (tFieldSignature.getDefinitions().contains(tDefinition)) {
					if (pattern_FieldDefinition_20_2_testcorematchandDECs_black_nac_0BB(tDefinition,
							tFieldSignature) == null) {
						if (pattern_FieldDefinition_20_2_testcorematchandDECs_black_nac_1B(tDefinition) == null) {
							if (pattern_FieldDefinition_20_2_testcorematchandDECs_black_nac_2BB(tDefinition,
									tFieldSignature) == null) {
								_result.add(new Object[] { tFieldSignature, tDefinition, _edge_definitions });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDefinition_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDefinition_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldDefinition _this, Match match, TFieldSignature tFieldSignature, TFieldDefinition tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tFieldSignature, tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDefinition_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_21_1_preparereturnvalue_bindingFB(FieldDefinition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDefinition _this) {
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

	public static final Object[] pattern_FieldDefinition_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDefinition _this) {
		Object[] result_pattern_FieldDefinition_21_1_preparereturnvalue_binding = pattern_FieldDefinition_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDefinition_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDefinition_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDefinition_21_1_preparereturnvalue_black = pattern_FieldDefinition_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDefinition_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDefinition_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDefinition_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldDefinition_21_2_testcorematchandDECs_black_nac_0BB(
			MFieldDefinition mDefinition, MFieldSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_706953 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_706953 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_706953)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mDefinitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSignature = _edge_mDefinitions.getSrc();
		if (tmpMSignature instanceof MFieldSignature) {
			MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
			EObject tmpMDefinition = _edge_mDefinitions.getTrg();
			if (tmpMDefinition instanceof MFieldDefinition) {
				MFieldDefinition mDefinition = (MFieldDefinition) tmpMDefinition;
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					if (pattern_FieldDefinition_21_2_testcorematchandDECs_black_nac_0BB(mDefinition,
							mSignature) == null) {
						_result.add(new Object[] { mDefinition, mSignature, _edge_mDefinitions });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDefinition_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDefinition_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldDefinition _this, Match match, MFieldDefinition mDefinition, MFieldSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDefinition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDefinition_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_24_1_prepare_blackB(FieldDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDefinition_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldDefinition_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_1 = targetMatch.getObject("tFieldSignature");
		EObject _localVariable_2 = sourceMatch.getObject("mSignature");
		EObject _localVariable_3 = targetMatch.getObject("tDefinition");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpTFieldSignature = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		if (tmpMDefinition instanceof MFieldDefinition) {
			MFieldDefinition mDefinition = (MFieldDefinition) tmpMDefinition;
			if (tmpTFieldSignature instanceof TFieldSignature) {
				TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
				if (tmpMSignature instanceof MFieldSignature) {
					MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
					if (tmpTDefinition instanceof TFieldDefinition) {
						TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
						return new Object[] { mDefinition, tFieldSignature, mSignature, tDefinition, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_24_2_matchsrctrgcontext_blackBBBBBB(
			MFieldDefinition mDefinition, TFieldSignature tFieldSignature, MFieldSignature mSignature,
			TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mDefinition, tFieldSignature, mSignature, tDefinition, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDefinition_24_2_matchsrctrgcontext_binding = pattern_FieldDefinition_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_FieldDefinition_24_2_matchsrctrgcontext_binding != null) {
			MFieldDefinition mDefinition = (MFieldDefinition) result_pattern_FieldDefinition_24_2_matchsrctrgcontext_binding[0];
			TFieldSignature tFieldSignature = (TFieldSignature) result_pattern_FieldDefinition_24_2_matchsrctrgcontext_binding[1];
			MFieldSignature mSignature = (MFieldSignature) result_pattern_FieldDefinition_24_2_matchsrctrgcontext_binding[2];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_FieldDefinition_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_FieldDefinition_24_2_matchsrctrgcontext_black = pattern_FieldDefinition_24_2_matchsrctrgcontext_blackBBBBBB(
					mDefinition, tFieldSignature, mSignature, tDefinition, sourceMatch, targetMatch);
			if (result_pattern_FieldDefinition_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mDefinition, tFieldSignature, mSignature, tDefinition, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_24_3_solvecsp_bindingFBBBBBBB(FieldDefinition _this,
			MFieldDefinition mDefinition, TFieldSignature tFieldSignature, MFieldSignature mSignature,
			TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mDefinition, tFieldSignature, mSignature, tDefinition,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mDefinition, tFieldSignature, mSignature, tDefinition, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_24_3_solvecsp_bindingAndBlackFBBBBBBB(FieldDefinition _this,
			MFieldDefinition mDefinition, TFieldSignature tFieldSignature, MFieldSignature mSignature,
			TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDefinition_24_3_solvecsp_binding = pattern_FieldDefinition_24_3_solvecsp_bindingFBBBBBBB(
				_this, mDefinition, tFieldSignature, mSignature, tDefinition, sourceMatch, targetMatch);
		if (result_pattern_FieldDefinition_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldDefinition_24_3_solvecsp_black = pattern_FieldDefinition_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldDefinition_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mDefinition, tFieldSignature, mSignature, tDefinition, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_24_5_matchcorrcontext_blackFBBBB(
			TFieldSignature tFieldSignature, MFieldSignature mSignature, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MSignatureToTSignature mSignatureToTFieldSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tFieldSignature, MSignatureToTSignature.class, "target")) {
				if (mSignature.equals(mSignatureToTFieldSignature.getSource())) {
					_result.add(new Object[] { mSignatureToTFieldSignature, tFieldSignature, mSignature, sourceMatch,
							targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_24_5_matchcorrcontext_greenBBBF(
			MSignatureToTSignature mSignatureToTFieldSignature, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldDefinition";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mSignatureToTFieldSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mSignatureToTFieldSignature, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldDefinition_24_6_createcorrespondence_blackBBBBB(
			MFieldDefinition mDefinition, TFieldSignature tFieldSignature, MFieldSignature mSignature,
			TFieldDefinition tDefinition, CCMatch ccMatch) {
		return new Object[] { mDefinition, tFieldSignature, mSignature, tDefinition, ccMatch };
	}

	public static final Object[] pattern_FieldDefinition_24_6_createcorrespondence_greenFFFBBB(
			MFieldDefinition mDefinition, TFieldDefinition tDefinition, CCMatch ccMatch) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		mDefinitionToTDefinition.setSource(mDefinition);
		mDefinitionToTDefinition.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTMember);
		return new Object[] { mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition,
				tDefinition, ccMatch };
	}

	public static final Object[] pattern_FieldDefinition_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldDefinition_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldDefinition";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDefinition_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_27_1_matchtggpattern_black_nac_0BB(
			MFieldDefinition mDefinition, MFieldSignature mSignature) {
		MSignature __DEC_mDefinition_mDefinitions_672002 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_672002 != null) {
			if (!mSignature.equals(__DEC_mDefinition_mDefinitions_672002)) {
				return new Object[] { mDefinition, mSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldDefinition_27_1_matchtggpattern_blackBB(MFieldDefinition mDefinition,
			MFieldSignature mSignature) {
		if (mSignature.getMDefinitions().contains(mDefinition)) {
			if (pattern_FieldDefinition_27_1_matchtggpattern_black_nac_0BB(mDefinition, mSignature) == null) {
				return new Object[] { mDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_28_1_matchtggpattern_black_nac_0BB(
			TFieldDefinition tDefinition, TFieldSignature tFieldSignature) {
		TSignature __DEC_tDefinition_signature_295139 = tDefinition.getSignature();
		if (__DEC_tDefinition_signature_295139 != null) {
			if (!tFieldSignature.equals(__DEC_tDefinition_signature_295139)) {
				return new Object[] { tDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldDefinition_28_1_matchtggpattern_black_nac_1B(
			TFieldDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_869852 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_869852 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_FieldDefinition_28_1_matchtggpattern_black_nac_2BB(
			TFieldDefinition tDefinition, TFieldSignature tFieldSignature) {
		TSignature __DEC_tDefinition_definitions_617424 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_617424 != null) {
			if (!tFieldSignature.equals(__DEC_tDefinition_definitions_617424)) {
				return new Object[] { tDefinition, tFieldSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldDefinition_28_1_matchtggpattern_blackBB(TFieldSignature tFieldSignature,
			TFieldDefinition tDefinition) {
		if (tFieldSignature.getDefinitions().contains(tDefinition)) {
			if (pattern_FieldDefinition_28_1_matchtggpattern_black_nac_0BB(tDefinition, tFieldSignature) == null) {
				if (pattern_FieldDefinition_28_1_matchtggpattern_black_nac_1B(tDefinition) == null) {
					if (pattern_FieldDefinition_28_1_matchtggpattern_black_nac_2BB(tDefinition,
							tFieldSignature) == null) {
						return new Object[] { tFieldSignature, tDefinition };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDefinition_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_29_1_createresult_blackB(FieldDefinition _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDefinition_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldDefinition_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTFieldSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTFieldSignature)) {
			return new Object[] { ruleResult, mSignatureToTFieldSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TFieldSignature tFieldSignature) {
		if (ruleResult.getTargetObjects().contains(tFieldSignature)) {
			return new Object[] { ruleResult, tFieldSignature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MFieldSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDefinition_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mSignatureToTFieldSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMSignatureToTFieldSignature : mSignatureToTFieldSignatureList.getEntryObjects()) {
				if (tmpMSignatureToTFieldSignature instanceof MSignatureToTSignature) {
					MSignatureToTSignature mSignatureToTFieldSignature = (MSignatureToTSignature) tmpMSignatureToTFieldSignature;
					TSignature tmpTFieldSignature = mSignatureToTFieldSignature.getTarget();
					if (tmpTFieldSignature instanceof TFieldSignature) {
						TFieldSignature tFieldSignature = (TFieldSignature) tmpTFieldSignature;
						MSignature tmpMSignature = mSignatureToTFieldSignature.getSource();
						if (tmpMSignature instanceof MFieldSignature) {
							MFieldSignature mSignature = (MFieldSignature) tmpMSignature;
							if (pattern_FieldDefinition_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mSignatureToTFieldSignature) == null) {
								if (pattern_FieldDefinition_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										tFieldSignature) == null) {
									if (pattern_FieldDefinition_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											mSignature) == null) {
										_result.add(new Object[] { mSignatureToTFieldSignatureList,
												mSignatureToTFieldSignature, tFieldSignature, mSignature,
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

	public static final Object[] pattern_FieldDefinition_29_3_solveCSP_bindingFBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MSignatureToTSignature mSignatureToTFieldSignature,
			TFieldSignature tFieldSignature, MFieldSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mSignatureToTFieldSignature,
				tFieldSignature, mSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignatureToTFieldSignature, tFieldSignature,
					mSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldDefinition_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDefinition_29_3_solveCSP_bindingAndBlackFBBBBBB(FieldDefinition _this,
			IsApplicableMatch isApplicableMatch, MSignatureToTSignature mSignatureToTFieldSignature,
			TFieldSignature tFieldSignature, MFieldSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldDefinition_29_3_solveCSP_binding = pattern_FieldDefinition_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mSignatureToTFieldSignature, tFieldSignature, mSignature, ruleResult);
		if (result_pattern_FieldDefinition_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDefinition_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldDefinition_29_3_solveCSP_black = pattern_FieldDefinition_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDefinition_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignatureToTFieldSignature, tFieldSignature,
						mSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDefinition_29_4_checkCSP_expressionFBB(FieldDefinition _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDefinition_29_5_checknacs_blackBBB(
			MSignatureToTSignature mSignatureToTFieldSignature, TFieldSignature tFieldSignature,
			MFieldSignature mSignature) {
		return new Object[] { mSignatureToTFieldSignature, tFieldSignature, mSignature };
	}

	public static final Object[] pattern_FieldDefinition_29_6_perform_blackBBBB(
			MSignatureToTSignature mSignatureToTFieldSignature, TFieldSignature tFieldSignature,
			MFieldSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mSignatureToTFieldSignature, tFieldSignature, mSignature, ruleResult };
	}

	public static final Object[] pattern_FieldDefinition_29_6_perform_greenFFFFBBFB(TFieldSignature tFieldSignature,
			MFieldSignature mSignature, ModelgeneratorRuleResult ruleResult) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MAbstractFlowElementToTAbstractFlowElement mDefinitionToTDefinition = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MFieldDefinition mDefinition = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		ruleResult.getCorrObjects().add(mDefinitionToTDefinition);
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		mBodyToTAnnotation.setSource(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTDefinition.setSource(mDefinition);
		mSignature.getMDefinitions().add(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		tFieldSignature.getDefinitions().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTDefinition.setTarget(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ruleResult.getTargetObjects().add(tDefinition);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mBodyToTAnnotation, mDefinitionToTDefinition, mDefinitionToTMember, mDefinition,
				tFieldSignature, mSignature, tDefinition, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_FieldDefinition_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldDefinitionImpl
