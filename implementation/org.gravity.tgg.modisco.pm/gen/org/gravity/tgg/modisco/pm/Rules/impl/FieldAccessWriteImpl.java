/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractVariablesContainer;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.VariableDeclaration;
import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.gravity.modisco.AccessKind;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MSingleVariableAccessToTAccess;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.FieldAccessWrite;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TWrite;

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
 * An implementation of the model object '<em><b>Field Access Write</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldAccessWriteImpl extends AbstractRuleImpl implements FieldAccessWrite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldAccessWriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldAccessWrite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MSingleVariableAccess mAccess,
			VariableDeclarationFragment varDeclFrag, MFieldDefinition mField, MDefinition mMember) {

		Object[] result1_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_0_1_initialbindings_blackBBBBBB(this,
				match, mAccess, varDeclFrag, mField, mMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAccess] = " + mAccess + ", " + "[varDeclFrag] = " + varDeclFrag
					+ ", " + "[mField] = " + mField + ", " + "[mMember] = " + mMember + ".");
		}

		Object[] result2_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mAccess, varDeclFrag, mField,
						mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAccess] = " + mAccess + ", " + "[varDeclFrag] = " + varDeclFrag
					+ ", " + "[mField] = " + mField + ", " + "[mMember] = " + mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldAccessWriteImpl.pattern_FieldAccessWrite_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldAccessWriteImpl
					.pattern_FieldAccessWrite_0_4_collectelementstobetranslated_blackBBBBB(match, mAccess, varDeclFrag,
							mField, mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAccess] = " + mAccess + ", " + "[varDeclFrag] = " + varDeclFrag + ", " + "[mField] = "
						+ mField + ", " + "[mMember] = " + mMember + ".");
			}
			FieldAccessWriteImpl.pattern_FieldAccessWrite_0_4_collectelementstobetranslated_greenBBBBFFF(match, mAccess,
					varDeclFrag, mMember);
			//nothing EMoflonEdge mMember__mAccess____mAbstractFieldAccess = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mAccess__varDeclFrag____variable = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge varDeclFrag__mAccess____usageInVariableAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = FieldAccessWriteImpl
					.pattern_FieldAccessWrite_0_5_collectcontextelements_blackBBBBB(match, mAccess, varDeclFrag, mField,
							mMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAccess] = " + mAccess + ", " + "[varDeclFrag] = " + varDeclFrag + ", " + "[mField] = "
						+ mField + ", " + "[mMember] = " + mMember + ".");
			}
			FieldAccessWriteImpl.pattern_FieldAccessWrite_0_5_collectcontextelements_greenBBBBFF(match, varDeclFrag,
					mField, mMember);
			//nothing EMoflonEdge varDeclFrag__mField____variablesContainer = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge mField__varDeclFrag____fragments = (EMoflonEdge) result5_green[5];

			// 
			FieldAccessWriteImpl.pattern_FieldAccessWrite_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					mAccess, varDeclFrag, mField, mMember);
			return FieldAccessWriteImpl.pattern_FieldAccessWrite_0_7_expressionF();
		} else {
			return FieldAccessWriteImpl.pattern_FieldAccessWrite_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSingleVariableAccess mAccess = (MSingleVariableAccess) result1_bindingAndBlack[0];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result1_bindingAndBlack[2];
		TMember tMember = (TMember) result1_bindingAndBlack[3];
		MFieldDefinition mField = (MFieldDefinition) result1_bindingAndBlack[4];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[5];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[6];
		TFieldDefinition tField = (TFieldDefinition) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_1_1_performtransformation_greenBBFFBF(mAccess, tMember, tField);
		TWrite tAccess = (TWrite) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		MSingleVariableAccessToTAccess mAccessToTAccess = (MSingleVariableAccessToTAccess) result1_green[5];

		Object[] result2_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_1_2_collecttranslatedelements_blackBBBB(
				mAccess, tAccess, mFlowOwnerToTFlowOwner, mAccessToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAccess] = " + mAccess + ", "
					+ "[tAccess] = " + tAccess + ", " + "[mFlowOwnerToTFlowOwner] = " + mFlowOwnerToTFlowOwner + ", "
					+ "[mAccessToTAccess] = " + mAccessToTAccess + ".");
		}
		Object[] result2_green = FieldAccessWriteImpl.pattern_FieldAccessWrite_1_2_collecttranslatedelements_greenFBBBB(
				mAccess, tAccess, mFlowOwnerToTFlowOwner, mAccessToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, mAccess,
						mMemberToTMember, varDeclFrag, tMember, mField, tAccess, mMethodToTMethod,
						mFlowOwnerToTFlowOwner, mMember, tField, mAccessToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mAccess] = " + mAccess + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
					+ "[varDeclFrag] = " + varDeclFrag + ", " + "[tMember] = " + tMember + ", " + "[mField] = " + mField
					+ ", " + "[tAccess] = " + tAccess + ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", "
					+ "[mFlowOwnerToTFlowOwner] = " + mFlowOwnerToTFlowOwner + ", " + "[mMember] = " + mMember + ", "
					+ "[tField] = " + tField + ", " + "[mAccessToTAccess] = " + mAccessToTAccess + ".");
		}
		FieldAccessWriteImpl.pattern_FieldAccessWrite_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(ruleresult,
				mAccess, varDeclFrag, tMember, tAccess, mFlowOwnerToTFlowOwner, mMember, tField, mAccessToTAccess);
		//nothing EMoflonEdge mMember__mAccess____mAbstractFieldAccess = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mAccessToTAccess__mAccess____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mAccess__varDeclFrag____variable = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge varDeclFrag__mAccess____usageInVariableAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowOwnerToTFlowOwner__mAccess____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mAccessToTAccess__tAccess____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mFlowOwnerToTFlowOwner__tAccess____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tAccess__tField____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tField__tAccess____accessedBy = (EMoflonEdge) result3_green[19];

		// 
		// 
		FieldAccessWriteImpl.pattern_FieldAccessWrite_1_5_registerobjects_expressionBBBBBBBBBBBBB(this, ruleresult,
				mAccess, mMemberToTMember, varDeclFrag, tMember, mField, tAccess, mMethodToTMethod,
				mFlowOwnerToTFlowOwner, mMember, tField, mAccessToTAccess);
		return FieldAccessWriteImpl.pattern_FieldAccessWrite_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldAccessWriteImpl.pattern_FieldAccessWrite_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MSingleVariableAccess mAccess = (MSingleVariableAccess) result2_binding[0];
		VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result2_binding[1];
		MFieldDefinition mField = (MFieldDefinition) result2_binding[2];
		MDefinition mMember = (MDefinition) result2_binding[3];
		for (Object[] result2_black : FieldAccessWriteImpl
				.pattern_FieldAccessWrite_2_2_corematch_blackBFBFBFBFB(mAccess, varDeclFrag, mField, mMember, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			TMember tMember = (TMember) result2_black[3];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[5];
			TFieldDefinition tField = (TFieldDefinition) result2_black[7];
			// ForEach 
			for (Object[] result3_black : FieldAccessWriteImpl.pattern_FieldAccessWrite_2_3_findcontext_blackBBBBBBBB(
					mAccess, mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember, tField)) {
				Object[] result3_green = FieldAccessWriteImpl
						.pattern_FieldAccessWrite_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(mAccess, mMemberToTMember,
								varDeclFrag, tMember, mField, mMethodToTMethod, mMember, tField);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge varDeclFrag__mField____variablesContainer = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mField__varDeclFrag____fragments = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMember__mAccess____mAbstractFieldAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mAccess__varDeclFrag____variable = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge varDeclFrag__mAccess____usageInVariableAccess = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mMethodToTMethod__mField____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mMethodToTMethod__tField____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = FieldAccessWriteImpl
						.pattern_FieldAccessWrite_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								mAccess, mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember,
								tField);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAccess] = " + mAccess + ", "
							+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[varDeclFrag] = " + varDeclFrag
							+ ", " + "[tMember] = " + tMember + ", " + "[mField] = " + mField + ", "
							+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[mMember] = " + mMember + ", "
							+ "[tField] = " + tField + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldAccessWriteImpl.pattern_FieldAccessWrite_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldAccessWriteImpl
							.pattern_FieldAccessWrite_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldAccessWriteImpl.pattern_FieldAccessWrite_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldAccessWriteImpl.pattern_FieldAccessWrite_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MSingleVariableAccess mAccess,
			VariableDeclarationFragment varDeclFrag, MFieldDefinition mField, MDefinition mMember) {
		match.registerObject("mAccess", mAccess);
		match.registerObject("varDeclFrag", varDeclFrag);
		match.registerObject("mField", mField);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MSingleVariableAccess mAccess,
			VariableDeclarationFragment varDeclFrag, MFieldDefinition mField, MDefinition mMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MSingleVariableAccess mAccess,
			MDefinitionToTMember mMemberToTMember, VariableDeclarationFragment varDeclFrag, TMember tMember,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, MDefinition mMember,
			TFieldDefinition tField) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAccess", mAccess);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("varDeclFrag", varDeclFrag);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mField", mField);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("tField", tField);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mAccess, EObject mMemberToTMember,
			EObject varDeclFrag, EObject tMember, EObject mField, EObject tAccess, EObject mMethodToTMethod,
			EObject mFlowOwnerToTFlowOwner, EObject mMember, EObject tField, EObject mAccessToTAccess) {
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("varDeclFrag", varDeclFrag);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mField", mField);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("mFlowOwnerToTFlowOwner", mFlowOwnerToTFlowOwner);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mAccessToTAccess", mAccessToTAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAccess").eClass())
				.equals("modisco.MSingleVariableAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMember tMember, TWrite tAccess, TFieldDefinition tField) {

		Object[] result1_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_10_1_initialbindings_blackBBBBB(this,
				match, tMember, tAccess, tField);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", "
					+ "[tField] = " + tField + ".");
		}

		Object[] result2_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tMember, tAccess, tField);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", "
					+ "[tField] = " + tField + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldAccessWriteImpl.pattern_FieldAccessWrite_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldAccessWriteImpl
					.pattern_FieldAccessWrite_10_4_collectelementstobetranslated_blackBBBB(match, tMember, tAccess,
							tField);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tMember] = "
								+ tMember + ", " + "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ".");
			}
			FieldAccessWriteImpl.pattern_FieldAccessWrite_10_4_collectelementstobetranslated_greenBBBBFFFF(match,
					tMember, tAccess, tField);
			//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tAccess__tField____target = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tField__tAccess____accessedBy = (EMoflonEdge) result4_green[7];

			Object[] result5_black = FieldAccessWriteImpl
					.pattern_FieldAccessWrite_10_5_collectcontextelements_blackBBBB(match, tMember, tAccess, tField);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tMember] = "
								+ tMember + ", " + "[tAccess] = " + tAccess + ", " + "[tField] = " + tField + ".");
			}
			FieldAccessWriteImpl.pattern_FieldAccessWrite_10_5_collectcontextelements_greenBBB(match, tMember, tField);

			// 
			FieldAccessWriteImpl.pattern_FieldAccessWrite_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tMember, tAccess, tField);
			return FieldAccessWriteImpl.pattern_FieldAccessWrite_10_7_expressionF();
		} else {
			return FieldAccessWriteImpl.pattern_FieldAccessWrite_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		MFieldDefinition mField = (MFieldDefinition) result1_bindingAndBlack[3];
		TWrite tAccess = (TWrite) result1_bindingAndBlack[4];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[5];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[6];
		TFieldDefinition tField = (TFieldDefinition) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_11_1_performtransformation_greenFBBFBF(varDeclFrag, tAccess, mMember);
		MSingleVariableAccess mAccess = (MSingleVariableAccess) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		MSingleVariableAccessToTAccess mAccessToTAccess = (MSingleVariableAccessToTAccess) result1_green[5];

		Object[] result2_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_11_2_collecttranslatedelements_blackBBBB(
				mAccess, tAccess, mFlowOwnerToTFlowOwner, mAccessToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAccess] = " + mAccess + ", "
					+ "[tAccess] = " + tAccess + ", " + "[mFlowOwnerToTFlowOwner] = " + mFlowOwnerToTFlowOwner + ", "
					+ "[mAccessToTAccess] = " + mAccessToTAccess + ".");
		}
		Object[] result2_green = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_11_2_collecttranslatedelements_greenFBBBB(mAccess, tAccess,
						mFlowOwnerToTFlowOwner, mAccessToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, mAccess,
						mMemberToTMember, varDeclFrag, tMember, mField, tAccess, mMethodToTMethod,
						mFlowOwnerToTFlowOwner, mMember, tField, mAccessToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mAccess] = " + mAccess + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
					+ "[varDeclFrag] = " + varDeclFrag + ", " + "[tMember] = " + tMember + ", " + "[mField] = " + mField
					+ ", " + "[tAccess] = " + tAccess + ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", "
					+ "[mFlowOwnerToTFlowOwner] = " + mFlowOwnerToTFlowOwner + ", " + "[mMember] = " + mMember + ", "
					+ "[tField] = " + tField + ", " + "[mAccessToTAccess] = " + mAccessToTAccess + ".");
		}
		FieldAccessWriteImpl.pattern_FieldAccessWrite_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(ruleresult,
				mAccess, varDeclFrag, tMember, tAccess, mFlowOwnerToTFlowOwner, mMember, tField, mAccessToTAccess);
		//nothing EMoflonEdge mMember__mAccess____mAbstractFieldAccess = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mAccessToTAccess__mAccess____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mAccess__varDeclFrag____variable = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge varDeclFrag__mAccess____usageInVariableAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowOwnerToTFlowOwner__mAccess____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mAccessToTAccess__tAccess____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mFlowOwnerToTFlowOwner__tAccess____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tAccess__tField____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tField__tAccess____accessedBy = (EMoflonEdge) result3_green[19];

		// 
		// 
		FieldAccessWriteImpl.pattern_FieldAccessWrite_11_5_registerobjects_expressionBBBBBBBBBBBBB(this, ruleresult,
				mAccess, mMemberToTMember, varDeclFrag, tMember, mField, tAccess, mMethodToTMethod,
				mFlowOwnerToTFlowOwner, mMember, tField, mAccessToTAccess);
		return FieldAccessWriteImpl.pattern_FieldAccessWrite_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldAccessWriteImpl.pattern_FieldAccessWrite_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tMember = (TMember) result2_binding[0];
		TWrite tAccess = (TWrite) result2_binding[1];
		TFieldDefinition tField = (TFieldDefinition) result2_binding[2];
		for (Object[] result2_black : FieldAccessWriteImpl
				.pattern_FieldAccessWrite_12_2_corematch_blackFBFBFFBB(tMember, tAccess, tField, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			MFieldDefinition mField = (MFieldDefinition) result2_black[2];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[4];
			MDefinition mMember = (MDefinition) result2_black[5];
			// ForEach 
			for (Object[] result3_black : FieldAccessWriteImpl.pattern_FieldAccessWrite_12_3_findcontext_blackBFBBBBBB(
					mMemberToTMember, tMember, mField, tAccess, mMethodToTMethod, mMember, tField)) {
				VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result3_black[1];
				Object[] result3_green = FieldAccessWriteImpl
						.pattern_FieldAccessWrite_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(mMemberToTMember,
								varDeclFrag, tMember, mField, tAccess, mMethodToTMethod, mMember, tField);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge varDeclFrag__mField____variablesContainer = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mField__varDeclFrag____fragments = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mMethodToTMethod__mField____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mMethodToTMethod__tField____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tAccess__tField____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tField__tAccess____accessedBy = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = FieldAccessWriteImpl
						.pattern_FieldAccessWrite_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								mMemberToTMember, varDeclFrag, tMember, mField, tAccess, mMethodToTMethod, mMember,
								tField);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
							+ mMemberToTMember + ", " + "[varDeclFrag] = " + varDeclFrag + ", " + "[tMember] = "
							+ tMember + ", " + "[mField] = " + mField + ", " + "[tAccess] = " + tAccess + ", "
							+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[mMember] = " + mMember + ", "
							+ "[tField] = " + tField + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldAccessWriteImpl.pattern_FieldAccessWrite_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldAccessWriteImpl
							.pattern_FieldAccessWrite_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldAccessWriteImpl.pattern_FieldAccessWrite_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldAccessWriteImpl.pattern_FieldAccessWrite_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMember tMember, TWrite tAccess, TFieldDefinition tField) {
		match.registerObject("tMember", tMember);
		match.registerObject("tAccess", tAccess);
		match.registerObject("tField", tField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tMember, TWrite tAccess, TFieldDefinition tField) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField, TWrite tAccess,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("varDeclFrag", varDeclFrag);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mField", mField);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("tField", tField);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mAccess, EObject mMemberToTMember,
			EObject varDeclFrag, EObject tMember, EObject mField, EObject tAccess, EObject mMethodToTMethod,
			EObject mFlowOwnerToTFlowOwner, EObject mMember, EObject tField, EObject mAccessToTAccess) {
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("varDeclFrag", varDeclFrag);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mField", mField);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("mFlowOwnerToTFlowOwner", mFlowOwnerToTFlowOwner);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("tField", tField);
		ruleresult.registerObject("mAccessToTAccess", mAccessToTAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAccess").eClass()).equals("basic.TWrite.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_71(EMoflonEdge _edge_accessing) {

		Object[] result1_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldAccessWriteImpl.pattern_FieldAccessWrite_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldAccessWriteImpl
				.pattern_FieldAccessWrite_20_2_testcorematchandDECs_blackFFFB(_edge_accessing)) {
			TMember tMember = (TMember) result2_black[0];
			TWrite tAccess = (TWrite) result2_black[1];
			TFieldDefinition tField = (TFieldDefinition) result2_black[2];
			Object[] result2_green = FieldAccessWriteImpl
					.pattern_FieldAccessWrite_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldAccessWriteImpl
					.pattern_FieldAccessWrite_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tMember, tAccess, tField)) {
				// 
				if (FieldAccessWriteImpl
						.pattern_FieldAccessWrite_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = FieldAccessWriteImpl
							.pattern_FieldAccessWrite_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldAccessWriteImpl.pattern_FieldAccessWrite_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldAccessWriteImpl.pattern_FieldAccessWrite_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_73(EMoflonEdge _edge_mAbstractFieldAccess) {

		Object[] result1_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldAccessWriteImpl.pattern_FieldAccessWrite_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldAccessWriteImpl
				.pattern_FieldAccessWrite_21_2_testcorematchandDECs_blackFFFFB(_edge_mAbstractFieldAccess)) {
			MSingleVariableAccess mAccess = (MSingleVariableAccess) result2_black[0];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result2_black[1];
			MFieldDefinition mField = (MFieldDefinition) result2_black[2];
			MDefinition mMember = (MDefinition) result2_black[3];
			Object[] result2_green = FieldAccessWriteImpl
					.pattern_FieldAccessWrite_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldAccessWriteImpl
					.pattern_FieldAccessWrite_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, mAccess, varDeclFrag, mField, mMember)) {
				// 
				if (FieldAccessWriteImpl
						.pattern_FieldAccessWrite_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = FieldAccessWriteImpl
							.pattern_FieldAccessWrite_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldAccessWriteImpl.pattern_FieldAccessWrite_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldAccessWriteImpl.pattern_FieldAccessWrite_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldAccessWrite");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("mAccess", "accessKind", AccessKind.WRITE, ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("FieldAccessWrite");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("mAccess", "accessKind", AccessKind.WRITE, ComparingOperator.EQUAL)) {
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

		Object[] result1_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldAccessWriteImpl.pattern_FieldAccessWrite_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MSingleVariableAccess mAccess = (MSingleVariableAccess) result2_bindingAndBlack[0];
		VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result2_bindingAndBlack[1];
		TMember tMember = (TMember) result2_bindingAndBlack[2];
		MFieldDefinition mField = (MFieldDefinition) result2_bindingAndBlack[3];
		TWrite tAccess = (TWrite) result2_bindingAndBlack[4];
		MDefinition mMember = (MDefinition) result2_bindingAndBlack[5];
		TFieldDefinition tField = (TFieldDefinition) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = FieldAccessWriteImpl
				.pattern_FieldAccessWrite_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, mAccess, varDeclFrag, tMember,
						mField, tAccess, mMember, tField, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mAccess] = " + mAccess + ", " + "[varDeclFrag] = " + varDeclFrag + ", " + "[tMember] = "
					+ tMember + ", " + "[mField] = " + mField + ", " + "[tAccess] = " + tAccess + ", " + "[mMember] = "
					+ mMember + ", " + "[tField] = " + tField + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldAccessWriteImpl.pattern_FieldAccessWrite_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldAccessWriteImpl
					.pattern_FieldAccessWrite_24_5_matchcorrcontext_blackFBBFBBBB(tMember, mField, mMember, tField,
							sourceMatch, targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[0];
				MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result5_black[3];
				Object[] result5_green = FieldAccessWriteImpl.pattern_FieldAccessWrite_24_5_matchcorrcontext_greenBBBBF(
						mMemberToTMember, mMethodToTMethod, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = FieldAccessWriteImpl
						.pattern_FieldAccessWrite_24_6_createcorrespondence_blackBBBBBBBB(mAccess, varDeclFrag, tMember,
								mField, tAccess, mMember, tField, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAccess] = " + mAccess
							+ ", " + "[varDeclFrag] = " + varDeclFrag + ", " + "[tMember] = " + tMember + ", "
							+ "[mField] = " + mField + ", " + "[tAccess] = " + tAccess + ", " + "[mMember] = " + mMember
							+ ", " + "[tField] = " + tField + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldAccessWriteImpl.pattern_FieldAccessWrite_24_6_createcorrespondence_greenBBFFB(mAccess, tAccess,
						ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner = (MAbstractFlowElementToTAbstractFlowElement) result6_green[2];
				//nothing MSingleVariableAccessToTAccess mAccessToTAccess = (MSingleVariableAccessToTAccess) result6_green[3];

				Object[] result7_black = FieldAccessWriteImpl
						.pattern_FieldAccessWrite_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldAccessWriteImpl.pattern_FieldAccessWrite_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return FieldAccessWriteImpl.pattern_FieldAccessWrite_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag,
			TMember tMember, MFieldDefinition mField, TWrite tAccess, MDefinition mMember, TFieldDefinition tField,
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
	public boolean checkDEC_FWD(MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag,
			MFieldDefinition mField, MDefinition mMember) {// 
		Object[] result1_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_27_1_matchtggpattern_blackBBBB(mAccess,
				varDeclFrag, mField, mMember);
		if (result1_black != null) {
			FieldAccessWriteImpl.pattern_FieldAccessWrite_27_1_matchtggpattern_greenB(mAccess);

			return FieldAccessWriteImpl.pattern_FieldAccessWrite_27_2_expressionF();
		} else {
			return FieldAccessWriteImpl.pattern_FieldAccessWrite_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tMember, TWrite tAccess, TFieldDefinition tField) {// 
		Object[] result1_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_28_1_matchtggpattern_blackBBB(tMember,
				tAccess, tField);
		if (result1_black != null) {
			return FieldAccessWriteImpl.pattern_FieldAccessWrite_28_2_expressionF();
		} else {
			return FieldAccessWriteImpl.pattern_FieldAccessWrite_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter, MDefinitionToTMember mMethodToTMethodParameter) {

		Object[] result1_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldAccessWriteImpl.pattern_FieldAccessWrite_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : FieldAccessWriteImpl
				.pattern_FieldAccessWrite_29_2_isapplicablecore_blackFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			MDefinition mMember = (MDefinition) result2_black[2];
			TMember tMember = (TMember) result2_black[3];
			//nothing RuleEntryList mMethodToTMethodList = (RuleEntryList) result2_black[4];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result2_black[5];
			MFieldDefinition mField = (MFieldDefinition) result2_black[6];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[7];
			TFieldDefinition tField = (TFieldDefinition) result2_black[8];

			Object[] result3_bindingAndBlack = FieldAccessWriteImpl
					.pattern_FieldAccessWrite_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember, tField,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
						+ mMemberToTMember + ", " + "[varDeclFrag] = " + varDeclFrag + ", " + "[tMember] = " + tMember
						+ ", " + "[mField] = " + mField + ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", "
						+ "[mMember] = " + mMember + ", " + "[tField] = " + tField + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldAccessWriteImpl.pattern_FieldAccessWrite_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_29_5_checknacs_blackBBBBBBB(
						mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember, tField);
				if (result5_black != null) {

					Object[] result6_black = FieldAccessWriteImpl.pattern_FieldAccessWrite_29_6_perform_blackBBBBBBBB(
							mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember, tField,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMemberToTMember] = "
								+ mMemberToTMember + ", " + "[varDeclFrag] = " + varDeclFrag + ", " + "[tMember] = "
								+ tMember + ", " + "[mField] = " + mField + ", " + "[mMethodToTMethod] = "
								+ mMethodToTMethod + ", " + "[mMember] = " + mMember + ", " + "[tField] = " + tField
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldAccessWriteImpl.pattern_FieldAccessWrite_29_6_perform_greenFBBFFBBFB(varDeclFrag, tMember,
							mMember, tField, ruleResult);
					//nothing MSingleVariableAccess mAccess = (MSingleVariableAccess) result6_green[0];
					//nothing TWrite tAccess = (TWrite) result6_green[3];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner = (MAbstractFlowElementToTAbstractFlowElement) result6_green[4];
					//nothing MSingleVariableAccessToTAccess mAccessToTAccess = (MSingleVariableAccessToTAccess) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return FieldAccessWriteImpl.pattern_FieldAccessWrite_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("varDeclFrag", varDeclFrag);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mField", mField);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("tField", tField);
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
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPROPRIATE_FWD__MATCH_MSINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (MSingleVariableAccess) arguments.get(1),
					(VariableDeclarationFragment) arguments.get(2), (MFieldDefinition) arguments.get(3),
					(MDefinition) arguments.get(4));
		case RulesPackage.FIELD_ACCESS_WRITE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MSINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MSingleVariableAccess) arguments.get(1),
					(VariableDeclarationFragment) arguments.get(2), (MFieldDefinition) arguments.get(3),
					(MDefinition) arguments.get(4));
			return null;
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MSINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MSingleVariableAccess) arguments.get(1),
					(VariableDeclarationFragment) arguments.get(2), (MFieldDefinition) arguments.get(3),
					(MDefinition) arguments.get(4));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MSINGLEVARIABLEACCESS_MDEFINITIONTOTMEMBER_VARIABLEDECLARATIONFRAGMENT_TMEMBER_MFIELDDEFINITION_MDEFINITIONTOTMEMBER_MDEFINITION_TFIELDDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MSingleVariableAccess) arguments.get(1), (MDefinitionToTMember) arguments.get(2),
					(VariableDeclarationFragment) arguments.get(3), (TMember) arguments.get(4),
					(MFieldDefinition) arguments.get(5), (MDefinitionToTMember) arguments.get(6),
					(MDefinition) arguments.get(7), (TFieldDefinition) arguments.get(8));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.FIELD_ACCESS_WRITE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TWRITE_TFIELDDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TWrite) arguments.get(2),
					(TFieldDefinition) arguments.get(3));
		case RulesPackage.FIELD_ACCESS_WRITE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TWRITE_TFIELDDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TWrite) arguments.get(2),
					(TFieldDefinition) arguments.get(3));
			return null;
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TWRITE_TFIELDDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TWrite) arguments.get(2), (TFieldDefinition) arguments.get(3));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_VARIABLEDECLARATIONFRAGMENT_TMEMBER_MFIELDDEFINITION_TWRITE_MDEFINITIONTOTMEMBER_MDEFINITION_TFIELDDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (VariableDeclarationFragment) arguments.get(2),
					(TMember) arguments.get(3), (MFieldDefinition) arguments.get(4), (TWrite) arguments.get(5),
					(MDefinitionToTMember) arguments.get(6), (MDefinition) arguments.get(7),
					(TFieldDefinition) arguments.get(8));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.FIELD_ACCESS_WRITE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_71__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_71((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_73__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_73((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPLICABLE_SOLVE_CSP_CC__MSINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT_TMEMBER_MFIELDDEFINITION_TWRITE_MDEFINITION_TFIELDDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MSingleVariableAccess) arguments.get(0),
					(VariableDeclarationFragment) arguments.get(1), (TMember) arguments.get(2),
					(MFieldDefinition) arguments.get(3), (TWrite) arguments.get(4), (MDefinition) arguments.get(5),
					(TFieldDefinition) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.FIELD_ACCESS_WRITE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_ACCESS_WRITE___CHECK_DEC_FWD__MSINGLEVARIABLEACCESS_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION_MDEFINITION:
			return checkDEC_FWD((MSingleVariableAccess) arguments.get(0),
					(VariableDeclarationFragment) arguments.get(1), (MFieldDefinition) arguments.get(2),
					(MDefinition) arguments.get(3));
		case RulesPackage.FIELD_ACCESS_WRITE___CHECK_DEC_BWD__TMEMBER_TWRITE_TFIELDDEFINITION:
			return checkDEC_BWD((TMember) arguments.get(0), (TWrite) arguments.get(1),
					(TFieldDefinition) arguments.get(2));
		case RulesPackage.FIELD_ACCESS_WRITE___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2));
		case RulesPackage.FIELD_ACCESS_WRITE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_VARIABLEDECLARATIONFRAGMENT_TMEMBER_MFIELDDEFINITION_MDEFINITIONTOTMEMBER_MDEFINITION_TFIELDDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (VariableDeclarationFragment) arguments.get(2),
					(TMember) arguments.get(3), (MFieldDefinition) arguments.get(4),
					(MDefinitionToTMember) arguments.get(5), (MDefinition) arguments.get(6),
					(TFieldDefinition) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.FIELD_ACCESS_WRITE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldAccessWrite_0_1_initialbindings_blackBBBBBB(FieldAccessWrite _this,
			Match match, MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag,
			MFieldDefinition mField, MDefinition mMember) {
		if (!mField.equals(mMember)) {
			return new Object[] { _this, match, mAccess, varDeclFrag, mField, mMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_0_2_SolveCSP_bindingFBBBBBB(FieldAccessWrite _this,
			Match match, MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag,
			MFieldDefinition mField, MDefinition mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mAccess, varDeclFrag, mField, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mAccess, varDeclFrag, mField, mMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessWrite_0_2_SolveCSP_bindingAndBlackFBBBBBB(FieldAccessWrite _this,
			Match match, MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag,
			MFieldDefinition mField, MDefinition mMember) {
		Object[] result_pattern_FieldAccessWrite_0_2_SolveCSP_binding = pattern_FieldAccessWrite_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mAccess, varDeclFrag, mField, mMember);
		if (result_pattern_FieldAccessWrite_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessWrite_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldAccessWrite_0_2_SolveCSP_black = pattern_FieldAccessWrite_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessWrite_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mAccess, varDeclFrag, mField, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessWrite_0_3_CheckCSP_expressionFBB(FieldAccessWrite _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag, MFieldDefinition mField,
			MDefinition mMember) {
		if (!mField.equals(mMember)) {
			return new Object[] { match, mAccess, varDeclFrag, mField, mMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_0_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag, MDefinition mMember) {
		EMoflonEdge mMember__mAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__varDeclFrag____variable = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__mAccess____usageInVariableAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mAccess);
		String mMember__mAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String mAccess__varDeclFrag____variable_name_prime = "variable";
		String varDeclFrag__mAccess____usageInVariableAccess_name_prime = "usageInVariableAccess";
		mMember__mAccess____mAbstractFieldAccess.setSrc(mMember);
		mMember__mAccess____mAbstractFieldAccess.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mMember__mAccess____mAbstractFieldAccess);
		mAccess__varDeclFrag____variable.setSrc(mAccess);
		mAccess__varDeclFrag____variable.setTrg(varDeclFrag);
		match.getToBeTranslatedEdges().add(mAccess__varDeclFrag____variable);
		varDeclFrag__mAccess____usageInVariableAccess.setSrc(varDeclFrag);
		varDeclFrag__mAccess____usageInVariableAccess.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(varDeclFrag__mAccess____usageInVariableAccess);
		mMember__mAccess____mAbstractFieldAccess.setName(mMember__mAccess____mAbstractFieldAccess_name_prime);
		mAccess__varDeclFrag____variable.setName(mAccess__varDeclFrag____variable_name_prime);
		varDeclFrag__mAccess____usageInVariableAccess.setName(varDeclFrag__mAccess____usageInVariableAccess_name_prime);
		return new Object[] { match, mAccess, varDeclFrag, mMember, mMember__mAccess____mAbstractFieldAccess,
				mAccess__varDeclFrag____variable, varDeclFrag__mAccess____usageInVariableAccess };
	}

	public static final Object[] pattern_FieldAccessWrite_0_5_collectcontextelements_blackBBBBB(Match match,
			MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag, MFieldDefinition mField,
			MDefinition mMember) {
		if (!mField.equals(mMember)) {
			return new Object[] { match, mAccess, varDeclFrag, mField, mMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_0_5_collectcontextelements_greenBBBBFF(Match match,
			VariableDeclarationFragment varDeclFrag, MFieldDefinition mField, MDefinition mMember) {
		EMoflonEdge varDeclFrag__mField____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mField__varDeclFrag____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(varDeclFrag);
		match.getContextNodes().add(mField);
		match.getContextNodes().add(mMember);
		String varDeclFrag__mField____variablesContainer_name_prime = "variablesContainer";
		String mField__varDeclFrag____fragments_name_prime = "fragments";
		varDeclFrag__mField____variablesContainer.setSrc(varDeclFrag);
		varDeclFrag__mField____variablesContainer.setTrg(mField);
		match.getContextEdges().add(varDeclFrag__mField____variablesContainer);
		mField__varDeclFrag____fragments.setSrc(mField);
		mField__varDeclFrag____fragments.setTrg(varDeclFrag);
		match.getContextEdges().add(mField__varDeclFrag____fragments);
		varDeclFrag__mField____variablesContainer.setName(varDeclFrag__mField____variablesContainer_name_prime);
		mField__varDeclFrag____fragments.setName(mField__varDeclFrag____fragments_name_prime);
		return new Object[] { match, varDeclFrag, mField, mMember, varDeclFrag__mField____variablesContainer,
				mField__varDeclFrag____fragments };
	}

	public static final void pattern_FieldAccessWrite_0_6_registerobjectstomatch_expressionBBBBBB(
			FieldAccessWrite _this, Match match, MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag,
			MFieldDefinition mField, MDefinition mMember) {
		_this.registerObjectsToMatch_FWD(match, mAccess, varDeclFrag, mField, mMember);

	}

	public static final boolean pattern_FieldAccessWrite_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessWrite_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("varDeclFrag");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("mField");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_7 = isApplicableMatch.getObject("tField");
		EObject tmpMAccess = _localVariable_0;
		EObject tmpMMemberToTMember = _localVariable_1;
		EObject tmpVarDeclFrag = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpMField = _localVariable_4;
		EObject tmpMMethodToTMethod = _localVariable_5;
		EObject tmpMMember = _localVariable_6;
		EObject tmpTField = _localVariable_7;
		if (tmpMAccess instanceof MSingleVariableAccess) {
			MSingleVariableAccess mAccess = (MSingleVariableAccess) tmpMAccess;
			if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
				if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
					VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpMField instanceof MFieldDefinition) {
							MFieldDefinition mField = (MFieldDefinition) tmpMField;
							if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
								MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
								if (tmpMMember instanceof MDefinition) {
									MDefinition mMember = (MDefinition) tmpMMember;
									if (tmpTField instanceof TFieldDefinition) {
										TFieldDefinition tField = (TFieldDefinition) tmpTField;
										return new Object[] { mAccess, mMemberToTMember, varDeclFrag, tMember, mField,
												mMethodToTMethod, mMember, tField, isApplicableMatch };
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

	public static final Object[] pattern_FieldAccessWrite_1_1_performtransformation_blackBBBBBBBBFBB(
			MSingleVariableAccess mAccess, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField, FieldAccessWrite _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!mField.equals(mMember)) {
				if (!tField.equals(tMember)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mAccess, mMemberToTMember, varDeclFrag, tMember, mField,
									mMethodToTMethod, mMember, tField, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			FieldAccessWrite _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldAccessWrite_1_1_performtransformation_binding = pattern_FieldAccessWrite_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldAccessWrite_1_1_performtransformation_binding != null) {
			MSingleVariableAccess mAccess = (MSingleVariableAccess) result_pattern_FieldAccessWrite_1_1_performtransformation_binding[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_FieldAccessWrite_1_1_performtransformation_binding[1];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result_pattern_FieldAccessWrite_1_1_performtransformation_binding[2];
			TMember tMember = (TMember) result_pattern_FieldAccessWrite_1_1_performtransformation_binding[3];
			MFieldDefinition mField = (MFieldDefinition) result_pattern_FieldAccessWrite_1_1_performtransformation_binding[4];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_FieldAccessWrite_1_1_performtransformation_binding[5];
			MDefinition mMember = (MDefinition) result_pattern_FieldAccessWrite_1_1_performtransformation_binding[6];
			TFieldDefinition tField = (TFieldDefinition) result_pattern_FieldAccessWrite_1_1_performtransformation_binding[7];

			Object[] result_pattern_FieldAccessWrite_1_1_performtransformation_black = pattern_FieldAccessWrite_1_1_performtransformation_blackBBBBBBBBFBB(
					mAccess, mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember, tField, _this,
					isApplicableMatch);
			if (result_pattern_FieldAccessWrite_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldAccessWrite_1_1_performtransformation_black[8];

				return new Object[] { mAccess, mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod,
						mMember, tField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_1_1_performtransformation_greenBBFFBF(
			MSingleVariableAccess mAccess, TMember tMember, TFieldDefinition tField) {
		TWrite tAccess = BasicFactory.eINSTANCE.createTWrite();
		MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSingleVariableAccessToTAccess mAccessToTAccess = PmFactory.eINSTANCE.createMSingleVariableAccessToTAccess();
		tMember.getAccessing().add(tAccess);
		tAccess.setTarget(tField);
		mFlowOwnerToTFlowOwner.setSource(mAccess);
		mFlowOwnerToTFlowOwner.setTarget(tAccess);
		mAccessToTAccess.setSource(mAccess);
		mAccessToTAccess.setTarget(tAccess);
		return new Object[] { mAccess, tMember, tAccess, mFlowOwnerToTFlowOwner, tField, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessWrite_1_2_collecttranslatedelements_blackBBBB(
			MSingleVariableAccess mAccess, TWrite tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner,
			MSingleVariableAccessToTAccess mAccessToTAccess) {
		return new Object[] { mAccess, tAccess, mFlowOwnerToTFlowOwner, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessWrite_1_2_collecttranslatedelements_greenFBBBB(
			MSingleVariableAccess mAccess, TWrite tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner,
			MSingleVariableAccessToTAccess mAccessToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mAccess);
		ruleresult.getCreatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(mFlowOwnerToTFlowOwner);
		ruleresult.getCreatedLinkElements().add(mAccessToTAccess);
		return new Object[] { ruleresult, mAccess, tAccess, mFlowOwnerToTFlowOwner, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessWrite_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mAccess, EObject mMemberToTMember, EObject varDeclFrag,
			EObject tMember, EObject mField, EObject tAccess, EObject mMethodToTMethod, EObject mFlowOwnerToTFlowOwner,
			EObject mMember, EObject tField, EObject mAccessToTAccess) {
		if (!mAccess.equals(mMemberToTMember)) {
			if (!mAccess.equals(varDeclFrag)) {
				if (!mAccess.equals(tMember)) {
					if (!mAccess.equals(mField)) {
						if (!mAccess.equals(tAccess)) {
							if (!mAccess.equals(mMethodToTMethod)) {
								if (!mAccess.equals(mFlowOwnerToTFlowOwner)) {
									if (!mAccess.equals(mMember)) {
										if (!mAccess.equals(tField)) {
											if (!mAccess.equals(mAccessToTAccess)) {
												if (!mMemberToTMember.equals(varDeclFrag)) {
													if (!mMemberToTMember.equals(tMember)) {
														if (!mMemberToTMember.equals(tAccess)) {
															if (!mMemberToTMember.equals(mMethodToTMethod)) {
																if (!mMemberToTMember.equals(tField)) {
																	if (!tMember.equals(varDeclFrag)) {
																		if (!mField.equals(mMemberToTMember)) {
																			if (!mField.equals(varDeclFrag)) {
																				if (!mField.equals(tMember)) {
																					if (!mField.equals(tAccess)) {
																						if (!mField.equals(
																								mMethodToTMethod)) {
																							if (!mField.equals(
																									mFlowOwnerToTFlowOwner)) {
																								if (!mField.equals(
																										mMember)) {
																									if (!mField.equals(
																											tField)) {
																										if (!tAccess
																												.equals(varDeclFrag)) {
																											if (!tAccess
																													.equals(tMember)) {
																												if (!tAccess
																														.equals(tField)) {
																													if (!mMethodToTMethod
																															.equals(varDeclFrag)) {
																														if (!mMethodToTMethod
																																.equals(tMember)) {
																															if (!mMethodToTMethod
																																	.equals(tAccess)) {
																																if (!mMethodToTMethod
																																		.equals(tField)) {
																																	if (!mFlowOwnerToTFlowOwner
																																			.equals(mMemberToTMember)) {
																																		if (!mFlowOwnerToTFlowOwner
																																				.equals(varDeclFrag)) {
																																			if (!mFlowOwnerToTFlowOwner
																																					.equals(tMember)) {
																																				if (!mFlowOwnerToTFlowOwner
																																						.equals(tAccess)) {
																																					if (!mFlowOwnerToTFlowOwner
																																							.equals(mMethodToTMethod)) {
																																						if (!mFlowOwnerToTFlowOwner
																																								.equals(mMember)) {
																																							if (!mFlowOwnerToTFlowOwner
																																									.equals(tField)) {
																																								if (!mMember
																																										.equals(mMemberToTMember)) {
																																									if (!mMember
																																											.equals(varDeclFrag)) {
																																										if (!mMember
																																												.equals(tMember)) {
																																											if (!mMember
																																													.equals(tAccess)) {
																																												if (!mMember
																																														.equals(mMethodToTMethod)) {
																																													if (!mMember
																																															.equals(tField)) {
																																														if (!tField
																																																.equals(varDeclFrag)) {
																																															if (!tField
																																																	.equals(tMember)) {
																																																if (!mAccessToTAccess
																																																		.equals(mMemberToTMember)) {
																																																	if (!mAccessToTAccess
																																																			.equals(varDeclFrag)) {
																																																		if (!mAccessToTAccess
																																																				.equals(tMember)) {
																																																			if (!mAccessToTAccess
																																																					.equals(mField)) {
																																																				if (!mAccessToTAccess
																																																						.equals(tAccess)) {
																																																					if (!mAccessToTAccess
																																																							.equals(mMethodToTMethod)) {
																																																						if (!mAccessToTAccess
																																																								.equals(mFlowOwnerToTFlowOwner)) {
																																																							if (!mAccessToTAccess
																																																									.equals(mMember)) {
																																																								if (!mAccessToTAccess
																																																										.equals(tField)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											mAccess,
																																																											mMemberToTMember,
																																																											varDeclFrag,
																																																											tMember,
																																																											mField,
																																																											tAccess,
																																																											mMethodToTMethod,
																																																											mFlowOwnerToTFlowOwner,
																																																											mMember,
																																																											tField,
																																																											mAccessToTAccess };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldAccessWrite_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mAccess, EObject varDeclFrag, EObject tMember, EObject tAccess,
			EObject mFlowOwnerToTFlowOwner, EObject mMember, EObject tField, EObject mAccessToTAccess) {
		EMoflonEdge mMember__mAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccessToTAccess__mAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__varDeclFrag____variable = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__mAccess____usageInVariableAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowOwnerToTFlowOwner__mAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccessToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowOwnerToTFlowOwner__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldAccessWrite";
		String mMember__mAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String mAccessToTAccess__mAccess____source_name_prime = "source";
		String mAccess__varDeclFrag____variable_name_prime = "variable";
		String varDeclFrag__mAccess____usageInVariableAccess_name_prime = "usageInVariableAccess";
		String mFlowOwnerToTFlowOwner__mAccess____source_name_prime = "source";
		String mAccessToTAccess__tAccess____target_name_prime = "target";
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String mFlowOwnerToTFlowOwner__tAccess____target_name_prime = "target";
		String tAccess__tField____target_name_prime = "target";
		String tField__tAccess____accessedBy_name_prime = "accessedBy";
		mMember__mAccess____mAbstractFieldAccess.setSrc(mMember);
		mMember__mAccess____mAbstractFieldAccess.setTrg(mAccess);
		ruleresult.getTranslatedEdges().add(mMember__mAccess____mAbstractFieldAccess);
		mAccessToTAccess__mAccess____source.setSrc(mAccessToTAccess);
		mAccessToTAccess__mAccess____source.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mAccessToTAccess__mAccess____source);
		mAccess__varDeclFrag____variable.setSrc(mAccess);
		mAccess__varDeclFrag____variable.setTrg(varDeclFrag);
		ruleresult.getTranslatedEdges().add(mAccess__varDeclFrag____variable);
		varDeclFrag__mAccess____usageInVariableAccess.setSrc(varDeclFrag);
		varDeclFrag__mAccess____usageInVariableAccess.setTrg(mAccess);
		ruleresult.getTranslatedEdges().add(varDeclFrag__mAccess____usageInVariableAccess);
		mFlowOwnerToTFlowOwner__mAccess____source.setSrc(mFlowOwnerToTFlowOwner);
		mFlowOwnerToTFlowOwner__mAccess____source.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mFlowOwnerToTFlowOwner__mAccess____source);
		mAccessToTAccess__tAccess____target.setSrc(mAccessToTAccess);
		mAccessToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mAccessToTAccess__tAccess____target);
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAccess__tMember____source);
		mFlowOwnerToTFlowOwner__tAccess____target.setSrc(mFlowOwnerToTFlowOwner);
		mFlowOwnerToTFlowOwner__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mFlowOwnerToTFlowOwner__tAccess____target);
		tAccess__tField____target.setSrc(tAccess);
		tAccess__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(tAccess__tField____target);
		tField__tAccess____accessedBy.setSrc(tField);
		tField__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tField__tAccess____accessedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mMember__mAccess____mAbstractFieldAccess.setName(mMember__mAccess____mAbstractFieldAccess_name_prime);
		mAccessToTAccess__mAccess____source.setName(mAccessToTAccess__mAccess____source_name_prime);
		mAccess__varDeclFrag____variable.setName(mAccess__varDeclFrag____variable_name_prime);
		varDeclFrag__mAccess____usageInVariableAccess.setName(varDeclFrag__mAccess____usageInVariableAccess_name_prime);
		mFlowOwnerToTFlowOwner__mAccess____source.setName(mFlowOwnerToTFlowOwner__mAccess____source_name_prime);
		mAccessToTAccess__tAccess____target.setName(mAccessToTAccess__tAccess____target_name_prime);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		mFlowOwnerToTFlowOwner__tAccess____target.setName(mFlowOwnerToTFlowOwner__tAccess____target_name_prime);
		tAccess__tField____target.setName(tAccess__tField____target_name_prime);
		tField__tAccess____accessedBy.setName(tField__tAccess____accessedBy_name_prime);
		return new Object[] { ruleresult, mAccess, varDeclFrag, tMember, tAccess, mFlowOwnerToTFlowOwner, mMember,
				tField, mAccessToTAccess, mMember__mAccess____mAbstractFieldAccess, mAccessToTAccess__mAccess____source,
				mAccess__varDeclFrag____variable, varDeclFrag__mAccess____usageInVariableAccess,
				mFlowOwnerToTFlowOwner__mAccess____source, mAccessToTAccess__tAccess____target,
				tMember__tAccess____accessing, tAccess__tMember____source, mFlowOwnerToTFlowOwner__tAccess____target,
				tAccess__tField____target, tField__tAccess____accessedBy };
	}

	public static final void pattern_FieldAccessWrite_1_5_registerobjects_expressionBBBBBBBBBBBBB(
			FieldAccessWrite _this, PerformRuleResult ruleresult, EObject mAccess, EObject mMemberToTMember,
			EObject varDeclFrag, EObject tMember, EObject mField, EObject tAccess, EObject mMethodToTMethod,
			EObject mFlowOwnerToTFlowOwner, EObject mMember, EObject tField, EObject mAccessToTAccess) {
		_this.registerObjects_FWD(ruleresult, mAccess, mMemberToTMember, varDeclFrag, tMember, mField, tAccess,
				mMethodToTMethod, mFlowOwnerToTFlowOwner, mMember, tField, mAccessToTAccess);

	}

	public static final PerformRuleResult pattern_FieldAccessWrite_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_2_1_preparereturnvalue_bindingFB(FieldAccessWrite _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldAccessWrite _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldAccessWrite _this) {
		Object[] result_pattern_FieldAccessWrite_2_1_preparereturnvalue_binding = pattern_FieldAccessWrite_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessWrite_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldAccessWrite_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessWrite_2_1_preparereturnvalue_black = pattern_FieldAccessWrite_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldAccessWrite_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldAccessWrite_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldAccessWrite";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldAccessWrite_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mAccess");
		EObject _localVariable_1 = match.getObject("varDeclFrag");
		EObject _localVariable_2 = match.getObject("mField");
		EObject _localVariable_3 = match.getObject("mMember");
		EObject tmpMAccess = _localVariable_0;
		EObject tmpVarDeclFrag = _localVariable_1;
		EObject tmpMField = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpMAccess instanceof MSingleVariableAccess) {
			MSingleVariableAccess mAccess = (MSingleVariableAccess) tmpMAccess;
			if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
				VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
				if (tmpMField instanceof MFieldDefinition) {
					MFieldDefinition mField = (MFieldDefinition) tmpMField;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						return new Object[] { mAccess, varDeclFrag, mField, mMember, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessWrite_2_2_corematch_blackBFBFBFBFB(
			MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag, MFieldDefinition mField,
			MDefinition mMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mField.equals(mMember)) {
			AccessKind mAccess_accessKind = mAccess.getAccessKind();
			if (mAccess_accessKind.equals(AccessKind.WRITE)) {
				for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
					TMember tMember = mMemberToTMember.getTarget();
					if (tMember != null) {
						for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mField, MDefinitionToTMember.class, "source")) {
							if (!mMemberToTMember.equals(mMethodToTMethod)) {
								TMember tmpTField = mMethodToTMethod.getTarget();
								if (tmpTField instanceof TFieldDefinition) {
									TFieldDefinition tField = (TFieldDefinition) tmpTField;
									if (!tField.equals(tMember)) {
										_result.add(new Object[] { mAccess, mMemberToTMember, varDeclFrag, tMember,
												mField, mMethodToTMethod, mMember, tField, match });
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

	public static final Iterable<Object[]> pattern_FieldAccessWrite_2_3_findcontext_blackBBBBBBBB(
			MSingleVariableAccess mAccess, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!mField.equals(mMember)) {
				if (!tField.equals(tMember)) {
					if (mField.equals(varDeclFrag.getVariablesContainer())) {
						if (mMember.getMAbstractFieldAccess().contains(mAccess)) {
							if (varDeclFrag.equals(mAccess.getVariable())) {
								if (mMember.equals(mMemberToTMember.getSource())) {
									if (mField.equals(mMethodToTMethod.getSource())) {
										if (tField.equals(mMethodToTMethod.getTarget())) {
											if (tMember.equals(mMemberToTMember.getTarget())) {
												AccessKind mAccess_accessKind = mAccess.getAccessKind();
												if (mAccess_accessKind.equals(AccessKind.WRITE)) {
													_result.add(new Object[] { mAccess, mMemberToTMember, varDeclFrag,
															tMember, mField, mMethodToTMethod, mMember, tField });
												}

											}
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

	public static final Object[] pattern_FieldAccessWrite_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(
			MSingleVariableAccess mAccess, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge varDeclFrag__mField____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mField__varDeclFrag____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__varDeclFrag____variable = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__mAccess____usageInVariableAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mField____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String varDeclFrag__mField____variablesContainer_name_prime = "variablesContainer";
		String mField__varDeclFrag____fragments_name_prime = "fragments";
		String mMember__mAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String mAccess__varDeclFrag____variable_name_prime = "variable";
		String varDeclFrag__mAccess____usageInVariableAccess_name_prime = "usageInVariableAccess";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMethodToTMethod__mField____source_name_prime = "source";
		String mMethodToTMethod__tField____target_name_prime = "target";
		String mMemberToTMember__tMember____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mAccess);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(tField);
		varDeclFrag__mField____variablesContainer.setSrc(varDeclFrag);
		varDeclFrag__mField____variablesContainer.setTrg(mField);
		isApplicableMatch.getAllContextElements().add(varDeclFrag__mField____variablesContainer);
		mField__varDeclFrag____fragments.setSrc(mField);
		mField__varDeclFrag____fragments.setTrg(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(mField__varDeclFrag____fragments);
		mMember__mAccess____mAbstractFieldAccess.setSrc(mMember);
		mMember__mAccess____mAbstractFieldAccess.setTrg(mAccess);
		isApplicableMatch.getAllContextElements().add(mMember__mAccess____mAbstractFieldAccess);
		mAccess__varDeclFrag____variable.setSrc(mAccess);
		mAccess__varDeclFrag____variable.setTrg(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(mAccess__varDeclFrag____variable);
		varDeclFrag__mAccess____usageInVariableAccess.setSrc(varDeclFrag);
		varDeclFrag__mAccess____usageInVariableAccess.setTrg(mAccess);
		isApplicableMatch.getAllContextElements().add(varDeclFrag__mAccess____usageInVariableAccess);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMethodToTMethod__mField____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mField____source.setTrg(mField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mField____source);
		mMethodToTMethod__tField____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tField____target);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		varDeclFrag__mField____variablesContainer.setName(varDeclFrag__mField____variablesContainer_name_prime);
		mField__varDeclFrag____fragments.setName(mField__varDeclFrag____fragments_name_prime);
		mMember__mAccess____mAbstractFieldAccess.setName(mMember__mAccess____mAbstractFieldAccess_name_prime);
		mAccess__varDeclFrag____variable.setName(mAccess__varDeclFrag____variable_name_prime);
		varDeclFrag__mAccess____usageInVariableAccess.setName(varDeclFrag__mAccess____usageInVariableAccess_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMethodToTMethod__mField____source.setName(mMethodToTMethod__mField____source_name_prime);
		mMethodToTMethod__tField____target.setName(mMethodToTMethod__tField____target_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		return new Object[] { mAccess, mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember,
				tField, isApplicableMatch, varDeclFrag__mField____variablesContainer, mField__varDeclFrag____fragments,
				mMember__mAccess____mAbstractFieldAccess, mAccess__varDeclFrag____variable,
				varDeclFrag__mAccess____usageInVariableAccess, mMemberToTMember__mMember____source,
				mMethodToTMethod__mField____source, mMethodToTMethod__tField____target,
				mMemberToTMember__tMember____target };
	}

	public static final Object[] pattern_FieldAccessWrite_2_4_solveCSP_bindingFBBBBBBBBBB(FieldAccessWrite _this,
			IsApplicableMatch isApplicableMatch, MSingleVariableAccess mAccess, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mAccess, mMemberToTMember,
				varDeclFrag, tMember, mField, mMethodToTMethod, mMember, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAccess, mMemberToTMember, varDeclFrag, tMember,
					mField, mMethodToTMethod, mMember, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessWrite_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			FieldAccessWrite _this, IsApplicableMatch isApplicableMatch, MSingleVariableAccess mAccess,
			MDefinitionToTMember mMemberToTMember, VariableDeclarationFragment varDeclFrag, TMember tMember,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, MDefinition mMember,
			TFieldDefinition tField) {
		Object[] result_pattern_FieldAccessWrite_2_4_solveCSP_binding = pattern_FieldAccessWrite_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mAccess, mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod,
				mMember, tField);
		if (result_pattern_FieldAccessWrite_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessWrite_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldAccessWrite_2_4_solveCSP_black = pattern_FieldAccessWrite_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessWrite_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAccess, mMemberToTMember, varDeclFrag, tMember,
						mField, mMethodToTMethod, mMember, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessWrite_2_5_checkCSP_expressionFBB(FieldAccessWrite _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessWrite_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldAccessWrite";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldAccessWrite_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_10_1_initialbindings_blackBBBBB(FieldAccessWrite _this,
			Match match, TMember tMember, TWrite tAccess, TFieldDefinition tField) {
		if (!tField.equals(tMember)) {
			return new Object[] { _this, match, tMember, tAccess, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_10_2_SolveCSP_bindingFBBBBB(FieldAccessWrite _this,
			Match match, TMember tMember, TWrite tAccess, TFieldDefinition tField) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMember, tAccess, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMember, tAccess, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessWrite_10_2_SolveCSP_bindingAndBlackFBBBBB(FieldAccessWrite _this,
			Match match, TMember tMember, TWrite tAccess, TFieldDefinition tField) {
		Object[] result_pattern_FieldAccessWrite_10_2_SolveCSP_binding = pattern_FieldAccessWrite_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tMember, tAccess, tField);
		if (result_pattern_FieldAccessWrite_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessWrite_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldAccessWrite_10_2_SolveCSP_black = pattern_FieldAccessWrite_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessWrite_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMember, tAccess, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessWrite_10_3_CheckCSP_expressionFBB(FieldAccessWrite _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TMember tMember, TWrite tAccess, TFieldDefinition tField) {
		if (!tField.equals(tMember)) {
			return new Object[] { match, tMember, tAccess, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_10_4_collectelementstobetranslated_greenBBBBFFFF(Match match,
			TMember tMember, TWrite tAccess, TFieldDefinition tField) {
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAccess);
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String tAccess__tField____target_name_prime = "target";
		String tField__tAccess____accessedBy_name_prime = "accessedBy";
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAccess__tMember____source);
		tAccess__tField____target.setSrc(tAccess);
		tAccess__tField____target.setTrg(tField);
		match.getToBeTranslatedEdges().add(tAccess__tField____target);
		tField__tAccess____accessedBy.setSrc(tField);
		tField__tAccess____accessedBy.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tField__tAccess____accessedBy);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		tAccess__tField____target.setName(tAccess__tField____target_name_prime);
		tField__tAccess____accessedBy.setName(tField__tAccess____accessedBy_name_prime);
		return new Object[] { match, tMember, tAccess, tField, tMember__tAccess____accessing,
				tAccess__tMember____source, tAccess__tField____target, tField__tAccess____accessedBy };
	}

	public static final Object[] pattern_FieldAccessWrite_10_5_collectcontextelements_blackBBBB(Match match,
			TMember tMember, TWrite tAccess, TFieldDefinition tField) {
		if (!tField.equals(tMember)) {
			return new Object[] { match, tMember, tAccess, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_10_5_collectcontextelements_greenBBB(Match match,
			TMember tMember, TFieldDefinition tField) {
		match.getContextNodes().add(tMember);
		match.getContextNodes().add(tField);
		return new Object[] { match, tMember, tField };
	}

	public static final void pattern_FieldAccessWrite_10_6_registerobjectstomatch_expressionBBBBB(
			FieldAccessWrite _this, Match match, TMember tMember, TWrite tAccess, TFieldDefinition tField) {
		_this.registerObjectsToMatch_BWD(match, tMember, tAccess, tField);

	}

	public static final boolean pattern_FieldAccessWrite_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessWrite_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("varDeclFrag");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("mField");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_7 = isApplicableMatch.getObject("tField");
		EObject tmpMMemberToTMember = _localVariable_0;
		EObject tmpVarDeclFrag = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpMField = _localVariable_3;
		EObject tmpTAccess = _localVariable_4;
		EObject tmpMMethodToTMethod = _localVariable_5;
		EObject tmpMMember = _localVariable_6;
		EObject tmpTField = _localVariable_7;
		if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
			if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
				VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpMField instanceof MFieldDefinition) {
						MFieldDefinition mField = (MFieldDefinition) tmpMField;
						if (tmpTAccess instanceof TWrite) {
							TWrite tAccess = (TWrite) tmpTAccess;
							if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
								MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
								if (tmpMMember instanceof MDefinition) {
									MDefinition mMember = (MDefinition) tmpMMember;
									if (tmpTField instanceof TFieldDefinition) {
										TFieldDefinition tField = (TFieldDefinition) tmpTField;
										return new Object[] { mMemberToTMember, varDeclFrag, tMember, mField, tAccess,
												mMethodToTMethod, mMember, tField, isApplicableMatch };
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

	public static final Object[] pattern_FieldAccessWrite_11_1_performtransformation_blackBBBBBBBBFBB(
			MDefinitionToTMember mMemberToTMember, VariableDeclarationFragment varDeclFrag, TMember tMember,
			MFieldDefinition mField, TWrite tAccess, MDefinitionToTMember mMethodToTMethod, MDefinition mMember,
			TFieldDefinition tField, FieldAccessWrite _this, IsApplicableMatch isApplicableMatch) {
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!mField.equals(mMember)) {
				if (!tField.equals(tMember)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mMemberToTMember, varDeclFrag, tMember, mField, tAccess,
									mMethodToTMethod, mMember, tField, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			FieldAccessWrite _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldAccessWrite_11_1_performtransformation_binding = pattern_FieldAccessWrite_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldAccessWrite_11_1_performtransformation_binding != null) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_FieldAccessWrite_11_1_performtransformation_binding[0];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result_pattern_FieldAccessWrite_11_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_FieldAccessWrite_11_1_performtransformation_binding[2];
			MFieldDefinition mField = (MFieldDefinition) result_pattern_FieldAccessWrite_11_1_performtransformation_binding[3];
			TWrite tAccess = (TWrite) result_pattern_FieldAccessWrite_11_1_performtransformation_binding[4];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_FieldAccessWrite_11_1_performtransformation_binding[5];
			MDefinition mMember = (MDefinition) result_pattern_FieldAccessWrite_11_1_performtransformation_binding[6];
			TFieldDefinition tField = (TFieldDefinition) result_pattern_FieldAccessWrite_11_1_performtransformation_binding[7];

			Object[] result_pattern_FieldAccessWrite_11_1_performtransformation_black = pattern_FieldAccessWrite_11_1_performtransformation_blackBBBBBBBBFBB(
					mMemberToTMember, varDeclFrag, tMember, mField, tAccess, mMethodToTMethod, mMember, tField, _this,
					isApplicableMatch);
			if (result_pattern_FieldAccessWrite_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldAccessWrite_11_1_performtransformation_black[8];

				return new Object[] { mMemberToTMember, varDeclFrag, tMember, mField, tAccess, mMethodToTMethod,
						mMember, tField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_11_1_performtransformation_greenFBBFBF(
			VariableDeclarationFragment varDeclFrag, TWrite tAccess, MDefinition mMember) {
		MSingleVariableAccess mAccess = ModiscoFactory.eINSTANCE.createMSingleVariableAccess();
		MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSingleVariableAccessToTAccess mAccessToTAccess = PmFactory.eINSTANCE.createMSingleVariableAccessToTAccess();
		AccessKind mAccess_accessKind_prime = AccessKind.WRITE;
		mMember.getMAbstractFieldAccess().add(mAccess);
		mAccess.setVariable(varDeclFrag);
		mFlowOwnerToTFlowOwner.setSource(mAccess);
		mFlowOwnerToTFlowOwner.setTarget(tAccess);
		mAccessToTAccess.setSource(mAccess);
		mAccessToTAccess.setTarget(tAccess);
		mAccess.setAccessKind(mAccess_accessKind_prime);
		return new Object[] { mAccess, varDeclFrag, tAccess, mFlowOwnerToTFlowOwner, mMember, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessWrite_11_2_collecttranslatedelements_blackBBBB(
			MSingleVariableAccess mAccess, TWrite tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner,
			MSingleVariableAccessToTAccess mAccessToTAccess) {
		return new Object[] { mAccess, tAccess, mFlowOwnerToTFlowOwner, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessWrite_11_2_collecttranslatedelements_greenFBBBB(
			MSingleVariableAccess mAccess, TWrite tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner,
			MSingleVariableAccessToTAccess mAccessToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mAccess);
		ruleresult.getTranslatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(mFlowOwnerToTFlowOwner);
		ruleresult.getCreatedLinkElements().add(mAccessToTAccess);
		return new Object[] { ruleresult, mAccess, tAccess, mFlowOwnerToTFlowOwner, mAccessToTAccess };
	}

	public static final Object[] pattern_FieldAccessWrite_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mAccess, EObject mMemberToTMember, EObject varDeclFrag,
			EObject tMember, EObject mField, EObject tAccess, EObject mMethodToTMethod, EObject mFlowOwnerToTFlowOwner,
			EObject mMember, EObject tField, EObject mAccessToTAccess) {
		if (!mAccess.equals(mMemberToTMember)) {
			if (!mAccess.equals(varDeclFrag)) {
				if (!mAccess.equals(tMember)) {
					if (!mAccess.equals(mField)) {
						if (!mAccess.equals(tAccess)) {
							if (!mAccess.equals(mMethodToTMethod)) {
								if (!mAccess.equals(mFlowOwnerToTFlowOwner)) {
									if (!mAccess.equals(mMember)) {
										if (!mAccess.equals(tField)) {
											if (!mAccess.equals(mAccessToTAccess)) {
												if (!mMemberToTMember.equals(varDeclFrag)) {
													if (!mMemberToTMember.equals(tMember)) {
														if (!mMemberToTMember.equals(tAccess)) {
															if (!mMemberToTMember.equals(mMethodToTMethod)) {
																if (!mMemberToTMember.equals(tField)) {
																	if (!tMember.equals(varDeclFrag)) {
																		if (!mField.equals(mMemberToTMember)) {
																			if (!mField.equals(varDeclFrag)) {
																				if (!mField.equals(tMember)) {
																					if (!mField.equals(tAccess)) {
																						if (!mField.equals(
																								mMethodToTMethod)) {
																							if (!mField.equals(
																									mFlowOwnerToTFlowOwner)) {
																								if (!mField.equals(
																										mMember)) {
																									if (!mField.equals(
																											tField)) {
																										if (!tAccess
																												.equals(varDeclFrag)) {
																											if (!tAccess
																													.equals(tMember)) {
																												if (!tAccess
																														.equals(tField)) {
																													if (!mMethodToTMethod
																															.equals(varDeclFrag)) {
																														if (!mMethodToTMethod
																																.equals(tMember)) {
																															if (!mMethodToTMethod
																																	.equals(tAccess)) {
																																if (!mMethodToTMethod
																																		.equals(tField)) {
																																	if (!mFlowOwnerToTFlowOwner
																																			.equals(mMemberToTMember)) {
																																		if (!mFlowOwnerToTFlowOwner
																																				.equals(varDeclFrag)) {
																																			if (!mFlowOwnerToTFlowOwner
																																					.equals(tMember)) {
																																				if (!mFlowOwnerToTFlowOwner
																																						.equals(tAccess)) {
																																					if (!mFlowOwnerToTFlowOwner
																																							.equals(mMethodToTMethod)) {
																																						if (!mFlowOwnerToTFlowOwner
																																								.equals(mMember)) {
																																							if (!mFlowOwnerToTFlowOwner
																																									.equals(tField)) {
																																								if (!mMember
																																										.equals(mMemberToTMember)) {
																																									if (!mMember
																																											.equals(varDeclFrag)) {
																																										if (!mMember
																																												.equals(tMember)) {
																																											if (!mMember
																																													.equals(tAccess)) {
																																												if (!mMember
																																														.equals(mMethodToTMethod)) {
																																													if (!mMember
																																															.equals(tField)) {
																																														if (!tField
																																																.equals(varDeclFrag)) {
																																															if (!tField
																																																	.equals(tMember)) {
																																																if (!mAccessToTAccess
																																																		.equals(mMemberToTMember)) {
																																																	if (!mAccessToTAccess
																																																			.equals(varDeclFrag)) {
																																																		if (!mAccessToTAccess
																																																				.equals(tMember)) {
																																																			if (!mAccessToTAccess
																																																					.equals(mField)) {
																																																				if (!mAccessToTAccess
																																																						.equals(tAccess)) {
																																																					if (!mAccessToTAccess
																																																							.equals(mMethodToTMethod)) {
																																																						if (!mAccessToTAccess
																																																								.equals(mFlowOwnerToTFlowOwner)) {
																																																							if (!mAccessToTAccess
																																																									.equals(mMember)) {
																																																								if (!mAccessToTAccess
																																																										.equals(tField)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											mAccess,
																																																											mMemberToTMember,
																																																											varDeclFrag,
																																																											tMember,
																																																											mField,
																																																											tAccess,
																																																											mMethodToTMethod,
																																																											mFlowOwnerToTFlowOwner,
																																																											mMember,
																																																											tField,
																																																											mAccessToTAccess };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldAccessWrite_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mAccess, EObject varDeclFrag, EObject tMember, EObject tAccess,
			EObject mFlowOwnerToTFlowOwner, EObject mMember, EObject tField, EObject mAccessToTAccess) {
		EMoflonEdge mMember__mAccess____mAbstractFieldAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccessToTAccess__mAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__varDeclFrag____variable = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFrag__mAccess____usageInVariableAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowOwnerToTFlowOwner__mAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccessToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowOwnerToTFlowOwner__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldAccessWrite";
		String mMember__mAccess____mAbstractFieldAccess_name_prime = "mAbstractFieldAccess";
		String mAccessToTAccess__mAccess____source_name_prime = "source";
		String mAccess__varDeclFrag____variable_name_prime = "variable";
		String varDeclFrag__mAccess____usageInVariableAccess_name_prime = "usageInVariableAccess";
		String mFlowOwnerToTFlowOwner__mAccess____source_name_prime = "source";
		String mAccessToTAccess__tAccess____target_name_prime = "target";
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String mFlowOwnerToTFlowOwner__tAccess____target_name_prime = "target";
		String tAccess__tField____target_name_prime = "target";
		String tField__tAccess____accessedBy_name_prime = "accessedBy";
		mMember__mAccess____mAbstractFieldAccess.setSrc(mMember);
		mMember__mAccess____mAbstractFieldAccess.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mMember__mAccess____mAbstractFieldAccess);
		mAccessToTAccess__mAccess____source.setSrc(mAccessToTAccess);
		mAccessToTAccess__mAccess____source.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mAccessToTAccess__mAccess____source);
		mAccess__varDeclFrag____variable.setSrc(mAccess);
		mAccess__varDeclFrag____variable.setTrg(varDeclFrag);
		ruleresult.getCreatedEdges().add(mAccess__varDeclFrag____variable);
		varDeclFrag__mAccess____usageInVariableAccess.setSrc(varDeclFrag);
		varDeclFrag__mAccess____usageInVariableAccess.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(varDeclFrag__mAccess____usageInVariableAccess);
		mFlowOwnerToTFlowOwner__mAccess____source.setSrc(mFlowOwnerToTFlowOwner);
		mFlowOwnerToTFlowOwner__mAccess____source.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mFlowOwnerToTFlowOwner__mAccess____source);
		mAccessToTAccess__tAccess____target.setSrc(mAccessToTAccess);
		mAccessToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mAccessToTAccess__tAccess____target);
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAccess__tMember____source);
		mFlowOwnerToTFlowOwner__tAccess____target.setSrc(mFlowOwnerToTFlowOwner);
		mFlowOwnerToTFlowOwner__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mFlowOwnerToTFlowOwner__tAccess____target);
		tAccess__tField____target.setSrc(tAccess);
		tAccess__tField____target.setTrg(tField);
		ruleresult.getTranslatedEdges().add(tAccess__tField____target);
		tField__tAccess____accessedBy.setSrc(tField);
		tField__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tField__tAccess____accessedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mMember__mAccess____mAbstractFieldAccess.setName(mMember__mAccess____mAbstractFieldAccess_name_prime);
		mAccessToTAccess__mAccess____source.setName(mAccessToTAccess__mAccess____source_name_prime);
		mAccess__varDeclFrag____variable.setName(mAccess__varDeclFrag____variable_name_prime);
		varDeclFrag__mAccess____usageInVariableAccess.setName(varDeclFrag__mAccess____usageInVariableAccess_name_prime);
		mFlowOwnerToTFlowOwner__mAccess____source.setName(mFlowOwnerToTFlowOwner__mAccess____source_name_prime);
		mAccessToTAccess__tAccess____target.setName(mAccessToTAccess__tAccess____target_name_prime);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		mFlowOwnerToTFlowOwner__tAccess____target.setName(mFlowOwnerToTFlowOwner__tAccess____target_name_prime);
		tAccess__tField____target.setName(tAccess__tField____target_name_prime);
		tField__tAccess____accessedBy.setName(tField__tAccess____accessedBy_name_prime);
		return new Object[] { ruleresult, mAccess, varDeclFrag, tMember, tAccess, mFlowOwnerToTFlowOwner, mMember,
				tField, mAccessToTAccess, mMember__mAccess____mAbstractFieldAccess, mAccessToTAccess__mAccess____source,
				mAccess__varDeclFrag____variable, varDeclFrag__mAccess____usageInVariableAccess,
				mFlowOwnerToTFlowOwner__mAccess____source, mAccessToTAccess__tAccess____target,
				tMember__tAccess____accessing, tAccess__tMember____source, mFlowOwnerToTFlowOwner__tAccess____target,
				tAccess__tField____target, tField__tAccess____accessedBy };
	}

	public static final void pattern_FieldAccessWrite_11_5_registerobjects_expressionBBBBBBBBBBBBB(
			FieldAccessWrite _this, PerformRuleResult ruleresult, EObject mAccess, EObject mMemberToTMember,
			EObject varDeclFrag, EObject tMember, EObject mField, EObject tAccess, EObject mMethodToTMethod,
			EObject mFlowOwnerToTFlowOwner, EObject mMember, EObject tField, EObject mAccessToTAccess) {
		_this.registerObjects_BWD(ruleresult, mAccess, mMemberToTMember, varDeclFrag, tMember, mField, tAccess,
				mMethodToTMethod, mFlowOwnerToTFlowOwner, mMember, tField, mAccessToTAccess);

	}

	public static final PerformRuleResult pattern_FieldAccessWrite_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_12_1_preparereturnvalue_bindingFB(FieldAccessWrite _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldAccessWrite _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldAccessWrite _this) {
		Object[] result_pattern_FieldAccessWrite_12_1_preparereturnvalue_binding = pattern_FieldAccessWrite_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessWrite_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldAccessWrite_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessWrite_12_1_preparereturnvalue_black = pattern_FieldAccessWrite_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldAccessWrite_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldAccessWrite_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldAccessWrite";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldAccessWrite_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMember");
		EObject _localVariable_1 = match.getObject("tAccess");
		EObject _localVariable_2 = match.getObject("tField");
		EObject tmpTMember = _localVariable_0;
		EObject tmpTAccess = _localVariable_1;
		EObject tmpTField = _localVariable_2;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpTAccess instanceof TWrite) {
				TWrite tAccess = (TWrite) tmpTAccess;
				if (tmpTField instanceof TFieldDefinition) {
					TFieldDefinition tField = (TFieldDefinition) tmpTField;
					return new Object[] { tMember, tAccess, tField, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessWrite_12_2_corematch_blackFBFBFFBB(TMember tMember,
			TWrite tAccess, TFieldDefinition tField, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tField.equals(tMember)) {
			for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tField, MDefinitionToTMember.class, "target")) {
				BodyDeclaration tmpMField = mMethodToTMethod.getSource();
				if (tmpMField instanceof MFieldDefinition) {
					MFieldDefinition mField = (MFieldDefinition) tmpMField;
					for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
						if (!mMemberToTMember.equals(mMethodToTMethod)) {
							BodyDeclaration tmpMMember = mMemberToTMember.getSource();
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								if (!mField.equals(mMember)) {
									_result.add(new Object[] { mMemberToTMember, tMember, mField, tAccess,
											mMethodToTMethod, mMember, tField, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldAccessWrite_12_3_findcontext_blackBFBBBBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, MFieldDefinition mField, TWrite tAccess,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!mField.equals(mMember)) {
				if (!tField.equals(tMember)) {
					if (mMember.equals(mMemberToTMember.getSource())) {
						if (mField.equals(mMethodToTMethod.getSource())) {
							if (tField.equals(mMethodToTMethod.getTarget())) {
								if (tMember.getAccessing().contains(tAccess)) {
									if (tMember.equals(mMemberToTMember.getTarget())) {
										if (tField.equals(tAccess.getTarget())) {
											for (VariableDeclarationFragment varDeclFrag : mField.getFragments()) {
												_result.add(new Object[] { mMemberToTMember, varDeclFrag, tMember,
														mField, tAccess, mMethodToTMethod, mMember, tField });
											}
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

	public static final Object[] pattern_FieldAccessWrite_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			MDefinitionToTMember mMemberToTMember, VariableDeclarationFragment varDeclFrag, TMember tMember,
			MFieldDefinition mField, TWrite tAccess, MDefinitionToTMember mMethodToTMethod, MDefinition mMember,
			TFieldDefinition tField) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge varDeclFrag__mField____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mField__varDeclFrag____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mField____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String varDeclFrag__mField____variablesContainer_name_prime = "variablesContainer";
		String mField__varDeclFrag____fragments_name_prime = "fragments";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMethodToTMethod__mField____source_name_prime = "source";
		String mMethodToTMethod__tField____target_name_prime = "target";
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String tAccess__tField____target_name_prime = "target";
		String tField__tAccess____accessedBy_name_prime = "accessedBy";
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mField);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(tField);
		varDeclFrag__mField____variablesContainer.setSrc(varDeclFrag);
		varDeclFrag__mField____variablesContainer.setTrg(mField);
		isApplicableMatch.getAllContextElements().add(varDeclFrag__mField____variablesContainer);
		mField__varDeclFrag____fragments.setSrc(mField);
		mField__varDeclFrag____fragments.setTrg(varDeclFrag);
		isApplicableMatch.getAllContextElements().add(mField__varDeclFrag____fragments);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMethodToTMethod__mField____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mField____source.setTrg(mField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mField____source);
		mMethodToTMethod__tField____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tField____target);
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____source);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		tAccess__tField____target.setSrc(tAccess);
		tAccess__tField____target.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(tAccess__tField____target);
		tField__tAccess____accessedBy.setSrc(tField);
		tField__tAccess____accessedBy.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tField__tAccess____accessedBy);
		varDeclFrag__mField____variablesContainer.setName(varDeclFrag__mField____variablesContainer_name_prime);
		mField__varDeclFrag____fragments.setName(mField__varDeclFrag____fragments_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMethodToTMethod__mField____source.setName(mMethodToTMethod__mField____source_name_prime);
		mMethodToTMethod__tField____target.setName(mMethodToTMethod__tField____target_name_prime);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		tAccess__tField____target.setName(tAccess__tField____target_name_prime);
		tField__tAccess____accessedBy.setName(tField__tAccess____accessedBy_name_prime);
		return new Object[] { mMemberToTMember, varDeclFrag, tMember, mField, tAccess, mMethodToTMethod, mMember,
				tField, isApplicableMatch, varDeclFrag__mField____variablesContainer, mField__varDeclFrag____fragments,
				mMemberToTMember__mMember____source, mMethodToTMethod__mField____source,
				mMethodToTMethod__tField____target, tMember__tAccess____accessing, tAccess__tMember____source,
				mMemberToTMember__tMember____target, tAccess__tField____target, tField__tAccess____accessedBy };
	}

	public static final Object[] pattern_FieldAccessWrite_12_4_solveCSP_bindingFBBBBBBBBBB(FieldAccessWrite _this,
			IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField, TWrite tAccess,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMemberToTMember, varDeclFrag,
				tMember, mField, tAccess, mMethodToTMethod, mMember, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, varDeclFrag, tMember, mField,
					tAccess, mMethodToTMethod, mMember, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessWrite_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			FieldAccessWrite _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField, TWrite tAccess,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField) {
		Object[] result_pattern_FieldAccessWrite_12_4_solveCSP_binding = pattern_FieldAccessWrite_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, varDeclFrag, tMember, mField, tAccess, mMethodToTMethod,
				mMember, tField);
		if (result_pattern_FieldAccessWrite_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessWrite_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldAccessWrite_12_4_solveCSP_black = pattern_FieldAccessWrite_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessWrite_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, varDeclFrag, tMember, mField,
						tAccess, mMethodToTMethod, mMember, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessWrite_12_5_checkCSP_expressionFBB(FieldAccessWrite _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldAccessWrite_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldAccessWrite";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldAccessWrite_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_20_1_preparereturnvalue_bindingFB(FieldAccessWrite _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldAccessWrite _this) {
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

	public static final Object[] pattern_FieldAccessWrite_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldAccessWrite _this) {
		Object[] result_pattern_FieldAccessWrite_20_1_preparereturnvalue_binding = pattern_FieldAccessWrite_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessWrite_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldAccessWrite_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessWrite_20_1_preparereturnvalue_black = pattern_FieldAccessWrite_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldAccessWrite_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldAccessWrite_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldAccessWrite_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldAccessWrite_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_accessing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_accessing.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTAccess = _edge_accessing.getTrg();
			if (tmpTAccess instanceof TWrite) {
				TWrite tAccess = (TWrite) tmpTAccess;
				if (tMember.getAccessing().contains(tAccess)) {
					TMember tmpTField = tAccess.getTarget();
					if (tmpTField instanceof TFieldDefinition) {
						TFieldDefinition tField = (TFieldDefinition) tmpTField;
						if (!tField.equals(tMember)) {
							_result.add(new Object[] { tMember, tAccess, tField, _edge_accessing });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldAccessWrite_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			FieldAccessWrite _this, Match match, TMember tMember, TWrite tAccess, TFieldDefinition tField) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMember, tAccess, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldAccessWrite_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldAccessWrite _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldAccessWrite_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_21_1_preparereturnvalue_bindingFB(FieldAccessWrite _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldAccessWrite _this) {
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

	public static final Object[] pattern_FieldAccessWrite_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldAccessWrite _this) {
		Object[] result_pattern_FieldAccessWrite_21_1_preparereturnvalue_binding = pattern_FieldAccessWrite_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldAccessWrite_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldAccessWrite_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldAccessWrite_21_1_preparereturnvalue_black = pattern_FieldAccessWrite_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldAccessWrite_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldAccessWrite_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldAccessWrite_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldAccessWrite_21_2_testcorematchandDECs_black_nac_0BBB(
			MSingleVariableAccess mAccess, MFieldDefinition mField, MDefinition mMember) {
		if (!mField.equals(mMember)) {
			for (MDefinition __DEC_mAccess_mAbstractFieldAccess_841774 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mAccess, MDefinition.class, "mAbstractFieldAccess")) {
				if (!mField.equals(__DEC_mAccess_mAbstractFieldAccess_841774)) {
					if (!mMember.equals(__DEC_mAccess_mAbstractFieldAccess_841774)) {
						return new Object[] { mAccess, mField, mMember };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_21_2_testcorematchandDECs_black_nac_1B(
			MSingleVariableAccess mAccess) {
		for (AnnotationMemberValuePair __DEC_mAccess_value_845381 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_21_2_testcorematchandDECs_black_nac_2BB(
			MFieldDefinition mField, MSingleVariableAccess mAccess) {
		if (mField.getMAbstractFieldAccess().contains(mAccess)) {
			return new Object[] { mField, mAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessWrite_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_mAbstractFieldAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMember = _edge_mAbstractFieldAccess.getSrc();
		if (tmpMMember instanceof MDefinition) {
			MDefinition mMember = (MDefinition) tmpMMember;
			EObject tmpMAccess = _edge_mAbstractFieldAccess.getTrg();
			if (tmpMAccess instanceof MSingleVariableAccess) {
				MSingleVariableAccess mAccess = (MSingleVariableAccess) tmpMAccess;
				if (mMember.getMAbstractFieldAccess().contains(mAccess)) {
					VariableDeclaration tmpVarDeclFrag = mAccess.getVariable();
					if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
						VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
						AccessKind mAccess_accessKind = mAccess.getAccessKind();
						if (mAccess_accessKind.equals(AccessKind.WRITE)) {
							AbstractVariablesContainer tmpMField = varDeclFrag.getVariablesContainer();
							if (tmpMField instanceof MFieldDefinition) {
								MFieldDefinition mField = (MFieldDefinition) tmpMField;
								if (!mField.equals(mMember)) {
									if (pattern_FieldAccessWrite_21_2_testcorematchandDECs_black_nac_1B(
											mAccess) == null) {
										if (pattern_FieldAccessWrite_21_2_testcorematchandDECs_black_nac_0BBB(mAccess,
												mField, mMember) == null) {
											if (pattern_FieldAccessWrite_21_2_testcorematchandDECs_black_nac_2BB(mField,
													mAccess) == null) {
												_result.add(new Object[] { mAccess, varDeclFrag, mField, mMember,
														_edge_mAbstractFieldAccess });
											}
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

	public static final Object[] pattern_FieldAccessWrite_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldAccessWrite_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			FieldAccessWrite _this, Match match, MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag,
			MFieldDefinition mField, MDefinition mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mAccess, varDeclFrag, mField, mMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldAccessWrite_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldAccessWrite _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldAccessWrite_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_24_1_prepare_blackB(FieldAccessWrite _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldAccessWrite_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldAccessWrite_24_2_matchsrctrgcontext_bindingFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mAccess");
		EObject _localVariable_1 = sourceMatch.getObject("varDeclFrag");
		EObject _localVariable_2 = targetMatch.getObject("tMember");
		EObject _localVariable_3 = sourceMatch.getObject("mField");
		EObject _localVariable_4 = targetMatch.getObject("tAccess");
		EObject _localVariable_5 = sourceMatch.getObject("mMember");
		EObject _localVariable_6 = targetMatch.getObject("tField");
		EObject tmpMAccess = _localVariable_0;
		EObject tmpVarDeclFrag = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpMField = _localVariable_3;
		EObject tmpTAccess = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		EObject tmpTField = _localVariable_6;
		if (tmpMAccess instanceof MSingleVariableAccess) {
			MSingleVariableAccess mAccess = (MSingleVariableAccess) tmpMAccess;
			if (tmpVarDeclFrag instanceof VariableDeclarationFragment) {
				VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) tmpVarDeclFrag;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpMField instanceof MFieldDefinition) {
						MFieldDefinition mField = (MFieldDefinition) tmpMField;
						if (tmpTAccess instanceof TWrite) {
							TWrite tAccess = (TWrite) tmpTAccess;
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								if (tmpTField instanceof TFieldDefinition) {
									TFieldDefinition tField = (TFieldDefinition) tmpTField;
									return new Object[] { mAccess, varDeclFrag, tMember, mField, tAccess, mMember,
											tField, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag, TMember tMember,
			MFieldDefinition mField, TWrite tAccess, MDefinition mMember, TFieldDefinition tField, Match sourceMatch,
			Match targetMatch) {
		if (!mField.equals(mMember)) {
			if (!tField.equals(tMember)) {
				if (!sourceMatch.equals(targetMatch)) {
					AccessKind mAccess_accessKind = mAccess.getAccessKind();
					if (mAccess_accessKind.equals(AccessKind.WRITE)) {
						return new Object[] { mAccess, varDeclFrag, tMember, mField, tAccess, mMember, tField,
								sourceMatch, targetMatch };
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_binding = pattern_FieldAccessWrite_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_binding != null) {
			MSingleVariableAccess mAccess = (MSingleVariableAccess) result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_binding[0];
			VariableDeclarationFragment varDeclFrag = (VariableDeclarationFragment) result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_binding[1];
			TMember tMember = (TMember) result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_binding[2];
			MFieldDefinition mField = (MFieldDefinition) result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_binding[3];
			TWrite tAccess = (TWrite) result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_binding[4];
			MDefinition mMember = (MDefinition) result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_binding[5];
			TFieldDefinition tField = (TFieldDefinition) result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_black = pattern_FieldAccessWrite_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					mAccess, varDeclFrag, tMember, mField, tAccess, mMember, tField, sourceMatch, targetMatch);
			if (result_pattern_FieldAccessWrite_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mAccess, varDeclFrag, tMember, mField, tAccess, mMember, tField, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_24_3_solvecsp_bindingFBBBBBBBBBB(FieldAccessWrite _this,
			MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag, TMember tMember,
			MFieldDefinition mField, TWrite tAccess, MDefinition mMember, TFieldDefinition tField, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(mAccess, varDeclFrag, tMember, mField, tAccess, mMember,
				tField, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, mAccess, varDeclFrag, tMember, mField, tAccess, mMember, tField,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessWrite_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			FieldAccessWrite _this, MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag,
			TMember tMember, MFieldDefinition mField, TWrite tAccess, MDefinition mMember, TFieldDefinition tField,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldAccessWrite_24_3_solvecsp_binding = pattern_FieldAccessWrite_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, mAccess, varDeclFrag, tMember, mField, tAccess, mMember, tField, sourceMatch, targetMatch);
		if (result_pattern_FieldAccessWrite_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessWrite_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldAccessWrite_24_3_solvecsp_black = pattern_FieldAccessWrite_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldAccessWrite_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mAccess, varDeclFrag, tMember, mField, tAccess, mMember, tField,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessWrite_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldAccessWrite_24_5_matchcorrcontext_blackFBBFBBBB(TMember tMember,
			MFieldDefinition mField, MDefinition mMember, TFieldDefinition tField, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mField.equals(mMember)) {
			if (!tField.equals(tMember)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
						if (tMember.equals(mMemberToTMember.getTarget())) {
							for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mField, MDefinitionToTMember.class, "source")) {
								if (!mMemberToTMember.equals(mMethodToTMethod)) {
									if (tField.equals(mMethodToTMethod.getTarget())) {
										_result.add(new Object[] { mMemberToTMember, tMember, mField, mMethodToTMethod,
												mMember, tField, sourceMatch, targetMatch });
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

	public static final Object[] pattern_FieldAccessWrite_24_5_matchcorrcontext_greenBBBBF(
			MDefinitionToTMember mMemberToTMember, MDefinitionToTMember mMethodToTMethod, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldAccessWrite";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMemberToTMember);
		ccMatch.getAllContextElements().add(mMethodToTMethod);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMemberToTMember, mMethodToTMethod, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldAccessWrite_24_6_createcorrespondence_blackBBBBBBBB(
			MSingleVariableAccess mAccess, VariableDeclarationFragment varDeclFrag, TMember tMember,
			MFieldDefinition mField, TWrite tAccess, MDefinition mMember, TFieldDefinition tField, CCMatch ccMatch) {
		if (!mField.equals(mMember)) {
			if (!tField.equals(tMember)) {
				return new Object[] { mAccess, varDeclFrag, tMember, mField, tAccess, mMember, tField, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_24_6_createcorrespondence_greenBBFFB(
			MSingleVariableAccess mAccess, TWrite tAccess, CCMatch ccMatch) {
		MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSingleVariableAccessToTAccess mAccessToTAccess = PmFactory.eINSTANCE.createMSingleVariableAccessToTAccess();
		mFlowOwnerToTFlowOwner.setSource(mAccess);
		mFlowOwnerToTFlowOwner.setTarget(tAccess);
		ccMatch.getCreateCorr().add(mFlowOwnerToTFlowOwner);
		mAccessToTAccess.setSource(mAccess);
		mAccessToTAccess.setTarget(tAccess);
		ccMatch.getCreateCorr().add(mAccessToTAccess);
		return new Object[] { mAccess, tAccess, mFlowOwnerToTFlowOwner, mAccessToTAccess, ccMatch };
	}

	public static final Object[] pattern_FieldAccessWrite_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldAccessWrite_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldAccessWrite";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldAccessWrite_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_27_1_matchtggpattern_black_nac_0BBB(
			MSingleVariableAccess mAccess, MFieldDefinition mField, MDefinition mMember) {
		if (!mField.equals(mMember)) {
			for (MDefinition __DEC_mAccess_mAbstractFieldAccess_832138 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mAccess, MDefinition.class, "mAbstractFieldAccess")) {
				if (!mField.equals(__DEC_mAccess_mAbstractFieldAccess_832138)) {
					if (!mMember.equals(__DEC_mAccess_mAbstractFieldAccess_832138)) {
						return new Object[] { mAccess, mField, mMember };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_27_1_matchtggpattern_black_nac_1B(
			MSingleVariableAccess mAccess) {
		for (AnnotationMemberValuePair __DEC_mAccess_value_708141 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_27_1_matchtggpattern_black_nac_2BB(MFieldDefinition mField,
			MSingleVariableAccess mAccess) {
		if (mField.getMAbstractFieldAccess().contains(mAccess)) {
			return new Object[] { mField, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_27_1_matchtggpattern_blackBBBB(MSingleVariableAccess mAccess,
			VariableDeclarationFragment varDeclFrag, MFieldDefinition mField, MDefinition mMember) {
		if (!mField.equals(mMember)) {
			if (mField.equals(varDeclFrag.getVariablesContainer())) {
				if (mMember.getMAbstractFieldAccess().contains(mAccess)) {
					if (varDeclFrag.equals(mAccess.getVariable())) {
						if (pattern_FieldAccessWrite_27_1_matchtggpattern_black_nac_0BBB(mAccess, mField,
								mMember) == null) {
							if (pattern_FieldAccessWrite_27_1_matchtggpattern_black_nac_1B(mAccess) == null) {
								if (pattern_FieldAccessWrite_27_1_matchtggpattern_black_nac_2BB(mField,
										mAccess) == null) {
									return new Object[] { mAccess, varDeclFrag, mField, mMember };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_27_1_matchtggpattern_greenB(MSingleVariableAccess mAccess) {
		AccessKind mAccess_accessKind_prime = AccessKind.WRITE;
		mAccess.setAccessKind(mAccess_accessKind_prime);
		return new Object[] { mAccess };
	}

	public static final boolean pattern_FieldAccessWrite_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessWrite_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_28_1_matchtggpattern_blackBBB(TMember tMember, TWrite tAccess,
			TFieldDefinition tField) {
		if (!tField.equals(tMember)) {
			if (tMember.getAccessing().contains(tAccess)) {
				if (tField.equals(tAccess.getTarget())) {
					return new Object[] { tMember, tAccess, tField };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessWrite_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldAccessWrite_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_29_1_createresult_blackB(FieldAccessWrite _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldAccessWrite_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, VariableDeclarationFragment varDeclFrag) {
		if (ruleResult.getSourceObjects().contains(varDeclFrag)) {
			return new Object[] { ruleResult, varDeclFrag };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MFieldDefinition mField) {
		if (ruleResult.getSourceObjects().contains(mField)) {
			return new Object[] { ruleResult, mField };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMethodToTMethod) {
		if (ruleResult.getCorrObjects().contains(mMethodToTMethod)) {
			return new Object[] { ruleResult, mMethodToTMethod };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TFieldDefinition tField) {
		if (ruleResult.getTargetObjects().contains(tField)) {
			return new Object[] { ruleResult, tField };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldAccessWrite_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mMethodToTMethodList : ruleEntryContainer.getRuleEntryList()) {
				if (!mMemberToTMemberList.equals(mMethodToTMethodList)) {
					for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
						if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
							BodyDeclaration tmpMMember = mMemberToTMember.getSource();
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								TMember tMember = mMemberToTMember.getTarget();
								if (tMember != null) {
									if (pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mMemberToTMember) == null) {
										if (pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												mMember) == null) {
											if (pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tMember) == null) {
												for (EObject tmpMMethodToTMethod : mMethodToTMethodList
														.getEntryObjects()) {
													if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
														MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
														if (!mMemberToTMember.equals(mMethodToTMethod)) {
															BodyDeclaration tmpMField = mMethodToTMethod.getSource();
															if (tmpMField instanceof MFieldDefinition) {
																MFieldDefinition mField = (MFieldDefinition) tmpMField;
																if (!mField.equals(mMember)) {
																	TMember tmpTField = mMethodToTMethod.getTarget();
																	if (tmpTField instanceof TFieldDefinition) {
																		TFieldDefinition tField = (TFieldDefinition) tmpTField;
																		if (!tField.equals(tMember)) {
																			if (pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult,
																					mMethodToTMethod) == null) {
																				if (pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_4BB(
																						ruleResult, mField) == null) {
																					if (pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_6BB(
																							ruleResult,
																							tField) == null) {
																						for (VariableDeclarationFragment varDeclFrag : mField
																								.getFragments()) {
																							if (pattern_FieldAccessWrite_29_2_isapplicablecore_black_nac_3BB(
																									ruleResult,
																									varDeclFrag) == null) {
																								_result.add(
																										new Object[] {
																												mMemberToTMemberList,
																												mMemberToTMember,
																												mMember,
																												tMember,
																												mMethodToTMethodList,
																												varDeclFrag,
																												mField,
																												mMethodToTMethod,
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

	public static final Object[] pattern_FieldAccessWrite_29_3_solveCSP_bindingFBBBBBBBBBB(FieldAccessWrite _this,
			IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMemberToTMember, varDeclFrag,
				tMember, mField, mMethodToTMethod, mMember, tField, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, varDeclFrag, tMember, mField,
					mMethodToTMethod, mMember, tField, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldAccessWrite_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			FieldAccessWrite _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			VariableDeclarationFragment varDeclFrag, TMember tMember, MFieldDefinition mField,
			MDefinitionToTMember mMethodToTMethod, MDefinition mMember, TFieldDefinition tField,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldAccessWrite_29_3_solveCSP_binding = pattern_FieldAccessWrite_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember,
				tField, ruleResult);
		if (result_pattern_FieldAccessWrite_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldAccessWrite_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldAccessWrite_29_3_solveCSP_black = pattern_FieldAccessWrite_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldAccessWrite_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, varDeclFrag, tMember, mField,
						mMethodToTMethod, mMember, tField, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldAccessWrite_29_4_checkCSP_expressionFBB(FieldAccessWrite _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldAccessWrite_29_5_checknacs_blackBBBBBBB(
			MDefinitionToTMember mMemberToTMember, VariableDeclarationFragment varDeclFrag, TMember tMember,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, MDefinition mMember,
			TFieldDefinition tField) {
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!mField.equals(mMember)) {
				if (!tField.equals(tMember)) {
					return new Object[] { mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember,
							tField };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_29_6_perform_blackBBBBBBBB(
			MDefinitionToTMember mMemberToTMember, VariableDeclarationFragment varDeclFrag, TMember tMember,
			MFieldDefinition mField, MDefinitionToTMember mMethodToTMethod, MDefinition mMember,
			TFieldDefinition tField, ModelgeneratorRuleResult ruleResult) {
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!mField.equals(mMember)) {
				if (!tField.equals(tMember)) {
					return new Object[] { mMemberToTMember, varDeclFrag, tMember, mField, mMethodToTMethod, mMember,
							tField, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldAccessWrite_29_6_perform_greenFBBFFBBFB(
			VariableDeclarationFragment varDeclFrag, TMember tMember, MDefinition mMember, TFieldDefinition tField,
			ModelgeneratorRuleResult ruleResult) {
		MSingleVariableAccess mAccess = ModiscoFactory.eINSTANCE.createMSingleVariableAccess();
		TWrite tAccess = BasicFactory.eINSTANCE.createTWrite();
		MAbstractFlowElementToTAbstractFlowElement mFlowOwnerToTFlowOwner = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSingleVariableAccessToTAccess mAccessToTAccess = PmFactory.eINSTANCE.createMSingleVariableAccessToTAccess();
		AccessKind mAccess_accessKind_prime = AccessKind.WRITE;
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mMember.getMAbstractFieldAccess().add(mAccess);
		mAccess.setVariable(varDeclFrag);
		ruleResult.getSourceObjects().add(mAccess);
		tMember.getAccessing().add(tAccess);
		tAccess.setTarget(tField);
		ruleResult.getTargetObjects().add(tAccess);
		mFlowOwnerToTFlowOwner.setSource(mAccess);
		mFlowOwnerToTFlowOwner.setTarget(tAccess);
		ruleResult.getCorrObjects().add(mFlowOwnerToTFlowOwner);
		mAccessToTAccess.setSource(mAccess);
		mAccessToTAccess.setTarget(tAccess);
		ruleResult.getCorrObjects().add(mAccessToTAccess);
		mAccess.setAccessKind(mAccess_accessKind_prime);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mAccess, varDeclFrag, tMember, tAccess, mFlowOwnerToTFlowOwner, mMember, tField,
				mAccessToTAccess, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_FieldAccessWrite_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldAccessWriteImpl
